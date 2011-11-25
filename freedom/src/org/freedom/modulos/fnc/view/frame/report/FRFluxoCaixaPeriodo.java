package org.freedom.modulos.fnc.view.frame.report;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JCheckBoxPad;
import org.freedom.library.swing.component.JRadioGroup;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FPrinterJob;
import org.freedom.library.swing.frame.FRelatorio;


public class FRFluxoCaixaPeriodo extends FRelatorio {
	
	private static final long serialVersionUID = 1L;
	
	private final JTextFieldPad txtDataIni = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtDataFim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JCheckBoxPad cbLancamentos = new JCheckBoxPad( "Listar Lan�amentos com valor zerado", "S", "N");
	
	//RadioGroup
	private Vector<String> vLabsTipo = new Vector<String>();
	
	private Vector<String> vValsTipo = new Vector<String>();
	
	private JRadioGroup	<String, String> rgTipoRel = null;
	
	private Vector<String> vLabsGraf = new Vector<String>();
	
	private Vector<String> vValsGraf = new Vector<String>();
	
	private JRadioGroup	<String, String> rgTipo = null;
	
	private Vector<String> vLabsOrdem = new Vector<String>();
	
	private Vector<String> vValsOrdem = new Vector<String>();
	
	private JRadioGroup	<String, String> rgOrdem = null;
	
	private Vector<String> vLabsFiltro = new Vector<String>();
	
	private Vector<String> vValsFiltro = new Vector<String>();
	
	private JRadioGroup	<String, String> rgFiltro = null;
	
	public FRFluxoCaixaPeriodo() {
		super();

		setTitulo( "Fluxo de caixa por per�odo" );
		setAtribos( 80, 80, 410, 320 );
		cbLancamentos.setVlrString( "S" );
		montaRadioGroup();
		montaTela();
	}
	
	private void montaTela(){

		JLabel bordaData = new JLabel();
		bordaData.setBorder( BorderFactory.createEtchedBorder() );
		JLabel periodo = new JLabel( "Per�odo", SwingConstants.CENTER );
		periodo.setOpaque( true );

		
		adic( rgFiltro, 10, 20, 350, 30, "Filtrar por: ");
		adic( periodo, 20, 55, 80, 20 );
		adic( txtDataIni, 30, 75, 100, 20 );
		adic( new JLabel( "at�", SwingConstants.CENTER ), 140, 75, 40, 20 );
		adic( txtDataFim, 190, 75, 100, 20 );
		adic( bordaData, 10, 65, 350, 40 );
		
		adic ( rgTipoRel, 10, 127, 350, 30, "Tipo do relat�rio:" );
		//adic ( rgTipo, 10, 93, 300, 30 );
		adic ( rgOrdem, 10, 179, 350, 30, "Ordenar por: " );
		adic ( cbLancamentos, 10, 212, 350, 30 );
		
		Calendar cal = Calendar.getInstance();
		txtDataFim.setVlrDate( cal.getTime() );
		cal.set( Calendar.MONTH, cal.get( Calendar.MONTH ) - 1 );
		txtDataIni.setVlrDate( cal.getTime() );
		
	}
	
	private void montaRadioGroup(){
		
		//Relat�rio Resumido ou Detalhado
		vLabsTipo .addElement( "Resumido" );
		vLabsTipo.addElement( "Detalhado" );
		vValsTipo.addElement( "R" );
		vValsTipo.addElement( "D" );
		
		rgTipoRel = new JRadioGroup<String, String>( 1, 2, vLabsTipo, vValsTipo );
		rgTipoRel.setVlrString( "D" );
		
		//Relat�rio Gr�fico ou Texto
		vLabsGraf .addElement( "Gr�fico" );
		vLabsGraf.addElement( "Texto" );
		vValsGraf.addElement( "G" );
		vValsGraf.addElement( "T" );
		
		rgTipo = new JRadioGroup<String, String>( 1, 2, vLabsGraf, vValsGraf );
		rgTipo.setVlrString( "G" );
		
		//Ordem do Relat�rio por emiss�o ou vencimento ou pagamento;
		vLabsOrdem .addElement( "Emiss�o" );
		vLabsOrdem.addElement( "Vencimento/Pagamento" );
		vValsOrdem.addElement( "E" );
		vValsOrdem.addElement( "V" );

		rgOrdem = new JRadioGroup<String, String>( 1, 2, vLabsOrdem, vValsOrdem );
		rgOrdem.setVlrString( "E" );
		
		//Filtro do Relat�rio por emiss�o ou vencimento ou pagamento;
		vLabsFiltro .addElement( "Emiss�o" );
		vLabsFiltro.addElement( "Vencimento/Pagamento" );
		vValsFiltro.addElement( "E" );
		vValsFiltro.addElement( "V" );
		
		rgFiltro = new JRadioGroup<String, String>( 1, 2, vLabsFiltro, vValsFiltro );
		rgFiltro.setVlrString( "E" );
	}
	
	public void imprimir( boolean bVisualizar ) {
		Blob fotoemp = null;
		
		try {
			PreparedStatement ps = con.prepareStatement( "SELECT FOTOEMP FROM SGEMPRESA WHERE CODEMP=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fotoemp = rs.getBlob( "FOTOEMP" );
			}
			rs.close();
			ps.close();
			con.commit();

		} catch (Exception e) {
			Funcoes.mensagemErro( this, "Erro carregando logotipo.\n" + e.getMessage() );
			e.printStackTrace();
		}	
		
		StringBuilder sql = null;
		String sCab = null;
		String sOrdem = null;
		String sData = null;
		StringBuilder sWhere = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			sCab = "Per�odo de " + txtDataIni.getVlrString()  + " a " +  txtDataFim.getVlrString();
			
			if ( "E".equals( rgOrdem.getVlrString() ) ) {
				sOrdem = "order by ORDEM, DTEMISSAO " ;
			}
			if ( "V".equals( rgOrdem.getVlrString() ) ) {
				sOrdem = "order by ORDEM, DTVENCTORECPAG";
				sData = "DTVENCTORECPAG ";
			}
			if( "E".equals(rgFiltro.getVlrString() ) ){
				sData = "DTEMISSAO ";
			}
			if ( "V".equals( rgFiltro.getVlrString() ) ) {
				sData = "DTVENCTORECPAG ";
			}
			
			sql = new StringBuilder();
			sql.append( "SELECT ORDEM, TIPOLANCA, SUBTIPO, CODRECPAGLANC, NPARCRECPAGLANC, " );
			sql.append( "DTEMISSAO, DTVENCTORECPAG, DOC, CODIGO, RAZAO,  HISTORICO, VALOR " );
			sql.append( "from fnfluxocaixavw01 " );

			sWhere = new StringBuilder("Where CodEmp = ? AND CODFILIAL = ? AND " + sData + " BETWEEN ? AND ? ");
			
			if("N".equals( cbLancamentos.getVlrString() ) ){
				sWhere.append( " AND VALOR <> 0" );
			}
			
			sql.append( sWhere );
			sql.append( sOrdem );
			
			ps = con.prepareStatement( sql.toString() );

			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "FNITRECEBER" ) );
			ps.setDate( 3, Funcoes.dateToSQLDate( txtDataIni.getVlrDate() ) );
			ps.setDate( 4, Funcoes.dateToSQLDate( txtDataFim.getVlrDate() ) );

			rs = ps.executeQuery();

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	
		imprimiGrafico( bVisualizar, rs,  sCab, fotoemp, sOrdem );
	}
	
	private void imprimiGrafico(boolean bVisualizar, ResultSet rs, String sCab,  Blob fotoemp, String sOrdem){
		
		String report = "relatorios/fluxocaixaperiodo.jasper";
		String label = "Relat�rio de Fluxo de Caixa por Per�odo";
		
	    HashMap<String, Object> hParam = new HashMap<String, Object>();

	    try {
			hParam.put( "LOGOEMP",  new ImageIcon(fotoemp.getBytes(1, ( int ) fotoemp.length())).getImage() );
		} catch ( SQLException e ) {
			Funcoes.mensagemErro( this, "Erro carregando logotipo !\n" + e.getMessage()  );
			e.printStackTrace();
		}
	
		FPrinterJob dlGr = new FPrinterJob( report, label, sCab, rs, hParam , this );

		if ( bVisualizar ) {
			dlGr.setVisible( true );
		} else {
			try {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			} catch ( Exception err ) {
				Funcoes.mensagemErro( this, "Erro na impress�o de relat�rio de Fluxo de Caixa por Per�odo!" + err.getMessage(), true, con, err );
			}
		}
		
	}
}

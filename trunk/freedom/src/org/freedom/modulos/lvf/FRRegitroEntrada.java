/**
 * @version 03/2007 <BR>
 * @author Setpoint Inform�tica Ltda.<BR>
 * @author Alex Rodrigues<BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.lvf <BR>
 * Classe:
 * @(#)FRRegistroEntrada.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Comentario sobre a classe.
 * 
 */

package org.freedom.modulos.lvf;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrinterJob;
import org.freedom.telas.FRelatorio;

public class FRRegitroEntrada extends FRelatorio {

	private static final long serialVersionUID = 1;

	private final JTextFieldPad txtDtIni = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtDtFim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JRadioGroup rgOrdem;

	public FRRegitroEntrada() {

		super();
		setTitulo( "Registro de Entrada" );		
		setAtribos( 50, 50, 295, 180 );
		
		montaRadioGrups();
		montaTela();

		Calendar cal = Calendar.getInstance();
		txtDtFim.setVlrDate( cal.getTime() );
		cal.set( Calendar.MONTH, cal.get( Calendar.MONTH ) - 1 );
		txtDtIni.setVlrDate( cal.getTime() );
	}
	
	private void montaRadioGrups() {

		Vector<String> labs = new Vector<String>();
		labs.add( "C�digo" );
		labs.add( "Descri��o" );
		Vector<String> vals = new Vector<String>();
		vals.add( "CODTIPOCLI" );
		vals.add( "DESCTIPOCLI" );
		rgOrdem = new JRadioGroup( 1, 2, labs, vals );
	}
	
	private void montaTela() {
		
		JLabel bordaData = new JLabel();
		bordaData.setBorder( BorderFactory.createEtchedBorder() );
		JLabel periodo = new JLabel( "Periodo", SwingConstants.CENTER );
		periodo.setOpaque( true );
	
		adic( periodo, 20, 0, 80, 20 );
		adic( txtDtIni, 20, 20, 100, 20 );
		adic( new JLabel( "at�", SwingConstants.CENTER ), 120, 20, 40, 20 );
		adic( txtDtFim, 160, 20, 100, 20 );
		adic( bordaData, 10, 10, 260, 40 );
		
		adic( new JLabel( "Ordem :" ), 10, 50, 200, 20 );
		adic( rgOrdem, 10, 70, 260, 30 );
	}

	@ Override
	public void imprimir( boolean visualizar ) {

		if ( txtDtIni.getVlrDate() != null && txtDtFim.getVlrDate() != null ) {
			if ( txtDtFim.getVlrDate().before( txtDtIni.getVlrDate() ) ) {
				Funcoes.mensagemInforma( this, "Data final inferior a inicial!" );
				return;
			}
		}
		
		try {
			
			StringBuilder sql = new StringBuilder();
			
			sql.append( "SELECT L.CODLF, L.TIPOLF, L.ANOMESLF, L.ESPECIELF, L.DOCINILF, L.SERIELF," );
			sql.append( "L.CODNAT, L.DTESLF, L.DTEMITLF, L.VLRCONTABILLF, L.VLRBASEICMSLF," );
			sql.append( "L.ALIQICMSLF, L.VLRICMSLF, L.VLRISENTASICMSLF, L.VLROUTRASICMSLF," );
			sql.append( "L.VLRBASEIPILF, L.ALIQIPILF, L.VLRIPILF, L.VLRISENTASIPILF," );
			sql.append( "L.VLROUTRASIPILF, L.CODEMITLF, L.UFLF, L.DOCFIMLF, L.OBSLF " );
			sql.append( "FROM LFLIVROFISCAL L " );
			sql.append( "WHERE L.CODEMP=? AND L.CODFILIAL=? AND L.TIPOLF='E' " );
			sql.append( "AND L.DTEMITLF BETWEEN ? AND ? " );
			sql.append( "ORDER BY L.DTEMITLF, L.DOCINILF, L.SERIELF, L.CODEMITLF, L.CODNAT " );
			
			PreparedStatement ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "LFLIVROFISCAL" ) );
			ps.setDate( 3, Funcoes.dateToSQLDate( txtDtIni.getVlrDate() ) );
			ps.setDate( 4, Funcoes.dateToSQLDate( txtDtFim.getVlrDate() ) );
			ResultSet rs = ps.executeQuery();
			
			HashMap<String,Object> hParam = new HashMap<String, Object>();

			hParam.put( "CODEMP", Aplicativo.iCodEmp );
			//hParam.put( "SUBREPORT_DIR", "/opt/freedom/reports/" );
			hParam.put( "REPORT_CONNECTION", con );
			
			FPrinterJob dlGr = new FPrinterJob( "relatorios/RegistroEntrada.jasper", "REGISTRO DE ENTRADAS", null, rs, hParam, this );

			if ( visualizar ) {
				dlGr.setVisible( true );
			}
			else {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			}
			
			dispose();
		} catch ( Exception e ) {
			Funcoes.mensagemErro( this, "Erro ao montar relatorio!\n" + e.getMessage() );
			e.printStackTrace();
		}

	}

}

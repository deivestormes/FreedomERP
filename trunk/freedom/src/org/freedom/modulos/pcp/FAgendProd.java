package org.freedom.modulos.pcp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import org.freedom.bmps.Icone;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFilho;

public class FAgendProd extends FFilho implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	
	private enum ecolAgendamentos{
	
		SITOP, DTEMITOP, DTFABROP, CODOP, SEQOP, DESCEST, 
		TEMPOTOT, TEMPOFIN, FASEATUAL, TOTFASES

	};
	
	private JPanelPad pinCab = new JPanelPad( 0, 95 );
	
	private JPanelPad pnCab = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private JPanelPad pinRod = new JPanelPad( 685,39 );
	
	private JPanelPad pnBotoes = new JPanelPad( 200, 200 );
	
	private JTextFieldPad txtDataini = new JTextFieldPad( JTextFieldPad.TP_DATE,10, 0 );

	private JTextFieldPad txtDatafim = new JTextFieldPad( JTextFieldPad.TP_DATE,10, 0  );
	
	private JButton btFiltrar = new JButton( Icone.novo( "btExecuta.gif" ) );
	
	private JButton btNovaOp = new JButton( "Nova O.P.", Icone.novo( "btNovo.gif" ) );

	private JRadioGroup<?, ?> rgFiltro = null; 
	
	private Vector<String> vValsData = new Vector<String>();

	private Vector<String> vLabsData = new Vector<String>();
	
	private JCheckBoxPad cbCancelada = new JCheckBoxPad( "Cancelada", "S", "N" );
	
	private JCheckBoxPad cbPendente = new JCheckBoxPad( "Pendente", "S", "N" );
	
	private JCheckBoxPad cbFinalizada = new JCheckBoxPad( "Finalizada", "S", "N" );
	
	private JCheckBoxPad cbAtrasada = new JCheckBoxPad( "Atrasada", "S", "N" );
	
	private Vector<String> vValsStatus = new Vector<String>();

	private Vector<String> vLabsStatus = new Vector<String>();
	
	private Tabela tab = new Tabela();
	
	private JScrollPane spnTab = new JScrollPane( tab );
	
	private JLabelPad lbTxtPendente = new JLabelPad("Pendente");
	
	private JLabelPad lbTxtFinalizada = new JLabelPad("Finalizada");
	
	private JLabelPad lbTxtAtrasado = new JLabelPad("Atrasado");
	
	private JLabelPad lbTxtCancelado = new JLabelPad("Cancelado");

	private ImageIcon imgPendente = Icone.novo( "clIndisponivelParc.gif" );
	
	private ImageIcon imgFinalizada = Icone.novo( "clEfetivado.gif" );
	
	private ImageIcon imgAtrasado = Icone.novo( "clVencido.gif" );
	
	private ImageIcon imgCancelado = Icone.novo( "clCancelado.gif" );
	
	private JLabelPad lbImgPendente = new JLabelPad( imgPendente );
	
	private JLabelPad lbImgFinalizada = new JLabelPad( imgFinalizada );
	
	private JLabelPad lbImgAtrasado = new JLabelPad( imgAtrasado );
	
	private JLabelPad lbImgCancelado = new JLabelPad( imgCancelado );
	
	private ImageIcon imgStatus = null;

	private Font fontLegenda =  new Font( "Arial", Font.PLAIN, 9 );		
	
	private Color corLegenda = new Color( 120, 120, 120 ); 
	
	public FAgendProd( ) {

		super( true );
		setAtribos( 50, 50, 800, 450 );
		
		montaTela();
		
	}
	
	private void montaTela(){
	
		adicBotaoSair();
	
		getTela().add( pnCab, BorderLayout.CENTER );
		pnCab.add( pinCab, BorderLayout.NORTH );
		pnCab.add( spnTab, BorderLayout.CENTER );
		
		pnRod.add( pnBotoes, BorderLayout.CENTER );
		
		JLabelPad lbLinha = new JLabelPad();
		lbLinha.setBorder(BorderFactory.createEtchedBorder());
		JLabelPad lbPeriodo = new JLabelPad("Periodo:" , SwingConstants.CENTER );
		lbPeriodo.setOpaque(true);
		
		JLabelPad lbLinhaStatus = new JLabelPad();
		lbLinhaStatus.setBorder( BorderFactory.createEtchedBorder() );
		JLabelPad lbStatus1 = new JLabelPad("Status:" , SwingConstants.CENTER );
		lbStatus1.setOpaque(true);
	
		vValsData.addElement( "F" );
		vValsData.addElement( "E" );
		vLabsData.addElement( "Fabrica��o" );
		vLabsData.addElement( "Emiss�o" );
		
		rgFiltro = new JRadioGroup<String, String>( 2, 1, vLabsData, vValsData );
		rgFiltro.setVlrString( "F" );				

		pinCab.adic( lbPeriodo, 7, 05, 80, 20 );
		pinCab.adic( lbLinha, 5, 20, 280, 50 );
		pinCab.adic( lbStatus1, 473, 7, 80, 20 );
		pinCab.adic( lbLinhaStatus, 470, 20, 200, 50 );
		pinCab.adic( new JLabelPad("De:"), 10, 35, 30, 20 );
		pinCab.adic( txtDataini, 35, 35, 97, 20 );
		pinCab.adic( new JLabelPad("At�:"), 140, 35, 37, 20 );
		pinCab.adic( txtDatafim, 165, 35, 100, 20 );
		pinCab.adic( cbCancelada, 485, 25, 90, 20 );
		pinCab.adic( cbFinalizada, 485, 45, 90, 20 );
		pinCab.adic( cbPendente, 573, 25, 90, 20 );
		pinCab.adic( cbAtrasada, 573, 45, 90, 20 );
		pinCab.adic( new JLabelPad("Filtrar por: "), 300, 1, 80, 20 );
		pinCab.adic( rgFiltro, 300, 20, 150, 50 );
		pinCab.adic( btFiltrar, 680, 20, 30, 50 );

		lbTxtPendente.setFont( fontLegenda );
		lbTxtFinalizada.setFont( fontLegenda );
		lbTxtCancelado.setFont( fontLegenda );
		lbTxtAtrasado.setFont( fontLegenda );
		lbTxtPendente.setForeground( corLegenda );
		lbTxtFinalizada.setForeground( corLegenda );
		lbTxtAtrasado.setForeground( corLegenda );
		lbTxtCancelado.setForeground( corLegenda );
		
		pnBotoes.adic( btNovaOp, 10, 0, 130, 25 );
		
		pnBotoes.adic( lbImgPendente, 160, 4, 20, 20 );
		pnBotoes.adic( lbTxtPendente, 180, 4, 80, 20 );
		pnBotoes.adic( lbImgAtrasado, 240, 4, 20, 20 );
		pnBotoes.adic( lbTxtAtrasado, 260, 4, 90, 20 );
		pnBotoes.adic( lbImgCancelado, 320, 4, 20, 20 ); 
		pnBotoes.adic( lbTxtCancelado, 340, 4, 90, 20 );
		
		pnBotoes.adic( lbTxtFinalizada, 420, 4, 80, 20 );
		pnBotoes.adic( lbImgFinalizada, 400, 4, 20, 20 );

		tab.adicColuna( "" );
		tab.adicColuna( "Data Emiss�o" );
		tab.adicColuna( "Data Fabrica��o" );
		tab.adicColuna( "C�d.Op" );
		tab.adicColuna( "Seq.Op" );
		tab.adicColuna( "Descri��o do produto" );
		tab.adicColuna( "Qtd." );
		tab.adicColuna( "Tempo total" );
		tab.adicColuna( "Fase Op." );
		
		tab.setTamColuna( 10, ecolAgendamentos.SITOP.ordinal() );
		tab.setTamColuna( 100, ecolAgendamentos.DTEMITOP.ordinal() );
		tab.setTamColuna( 100, ecolAgendamentos.DTFABROP.ordinal() );
		tab.setTamColuna( 300, ecolAgendamentos.DESCEST.ordinal() );
			
		Calendar cPeriodo = Calendar.getInstance();
		
	    txtDataini.setVlrDate(cPeriodo.getTime());
	    
		cPeriodo.set(Calendar.DAY_OF_MONTH,cPeriodo.get(Calendar.DAY_OF_MONTH)+30);
		
		
		txtDatafim.setVlrDate(cPeriodo.getTime());
		
		txtDataini.setRequerido( true );
		txtDatafim.setRequerido( true );
		
		btFiltrar.addActionListener( this );
		btNovaOp.addActionListener( this );
	}
	
	private void montaGrid(){
		
		if ( txtDatafim.getVlrDate().before(txtDataini.getVlrDate()) ) {
			
			Funcoes.mensagemInforma(this,"Data final maior que a data inicial!");
			return;
		}
		
		StringBuffer sSQL = new StringBuffer();	
		StringBuffer sWhere = new StringBuffer();	
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		if( "S".equals( cbCancelada.getVlrString())){
			
			sWhere.append( " AND SITOP='CA'" );
		}
		if( "S".equals( cbFinalizada.getVlrString())){
			
			sWhere.append( " AND SITOP='FN'" );
		}
		if( "S".equals( cbAtrasada.getVlrString() )){
			
			sWhere.append( " AND (SITOP='PE' AND DTFABROP < CAST( 'NOW' AS DATE ))" );
		}
		if( "S".equals( cbPendente.getVlrString() )){
			
			sWhere.append( " AND SITOP='PE'" );
		}
		
		sSQL.append( "SELECT SITOP,DTEMITOP,DTFABROP,CODOP,SEQOP,DESCEST,TEMPOFIN*100/TEMPOTOT,FASEATUAL,TOTFASES FROM PPLISTAOPVW01 " );
		sSQL.append( "WHERE CODEMP=? AND CODFILIAL=? AND DTFABROP BETWEEN ? AND ?" );
		sSQL.append( sWhere.toString() );
		
		System.out.println(sSQL.toString());
		
		try {
			
			ps = con.prepareStatement( sSQL.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "PPOP" ));
			ps.setDate( 3, Funcoes.dateToSQLDate( txtDataini.getVlrDate() ));
			ps.setDate( 4, Funcoes.dateToSQLDate( txtDatafim.getVlrDate() ));
			rs = ps.executeQuery();
						
			tab.limpa();
			
			boolean atrasado = false;
			for( int i=0; rs.next(); i++ ){

				Date dtfab = Funcoes.getDataPura( Funcoes.sqlDateToDate( rs.getDate( "DTFABROP" ))) ;
				Date dtatual = Funcoes.getDataPura( new Date() ) ;
				
				atrasado = dtfab.before( dtatual );
				
				if( rs.getString( "SITOP" ).equals( "PE" )){
					 
					if ( atrasado ) {
						imgStatus = imgAtrasado; 
					}
					else{
						imgStatus = imgPendente;					
					}
				}
				else if( rs.getString( "SITOP" ).equals( "CA" ) ){
					imgStatus = imgCancelado;
				}
				else if( rs.getString( "SITOP" ).equals( "FN" )){
					imgStatus = imgFinalizada;
				}
								
				tab.adicLinha();
				tab.setValor( imgStatus, i, ecolAgendamentos.SITOP.ordinal() );
				tab.setValor( rs.getDate( "DTEMITOP" ), i, ecolAgendamentos.DTEMITOP.ordinal() );
				tab.setValor( rs.getDate( "DTFABROP" ), i, ecolAgendamentos.DTFABROP.ordinal() );
				tab.setValor( rs.getInt( "CODOP" ), i, ecolAgendamentos.CODOP.ordinal() );
				tab.setValor( rs.getInt( "SEQOP" ), i, ecolAgendamentos.SEQOP.ordinal() );
				tab.setValor( rs.getString( "DESCEST" ), i, ecolAgendamentos.DESCEST.ordinal() );
				tab.setValor( rs.getString( "DESCEST" ), i, ecolAgendamentos.DESCEST.ordinal() );
				
			}
			
		} catch ( Exception e ) {
			
			Funcoes.mensagemInforma( this, "Erro ao montar grid " + e.getMessage() );
			e.printStackTrace();
		}
	}

	public void actionPerformed( ActionEvent e ) {

	
		if( e.getSource() == btFiltrar ){
		
			montaGrid();
			
		}else if( e.getSource() == btNovaOp ){
			
			FOP f;
			if ( Aplicativo.telaPrincipal.temTela( "Ordens de produ��o" ) == false ) {
				f = new FOP();
				Aplicativo.telaPrincipal.criatela( "Ordens de produ��o", f, con );
			}		
		}
	}
}

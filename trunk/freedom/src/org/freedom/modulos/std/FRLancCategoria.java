/**
 * @version 04/06/2002 <BR>
 * @author Setpoint Inform�tica Ltda./Reginaldo Garcia Heua <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FRLancCategoria.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios sobre a classe...
 * 
 */
package org.freedom.modulos.std;


import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrinterJob;
import org.freedom.telas.FRelatorio;


public class FRLancCategoria extends FRelatorio implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDataini = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDatafim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JTextFieldPad txtCodCC = new JTextFieldPad( JTextFieldPad.TP_STRING, 19, 0 );
	
	private JTextFieldFK txtDescCC = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldFK txtSiglaCC = new JTextFieldFK( JTextFieldPad.TP_STRING, 10, 0 );
	
	private JTextFieldPad txtCodConta = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );
	
	private JTextFieldFK txtDescConta = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtCodPlan = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDescPlan = new JTextFieldFK(JTextFieldPad.TP_STRING, 40, 0);
	
	private ListaCampos lcCC = new ListaCampos( this );
	
	private ListaCampos lcConta = new ListaCampos( this );
	
	private ListaCampos lcPlan = new ListaCampos(this);
	
	int iAnoBase = 0;

	
	public FRLancCategoria(){
		
		setTitulo( "Lan�amentos por categoria" );
		setAtribos( 80, 80, 350, 300 );
		
		montaTela();
		montaListaCampos();
	}
	
	private void montaTela(){
		
		JLabel periodo = new JLabel( "Per�odo", SwingConstants.CENTER );
		periodo.setOpaque( true );
		adic( periodo, 25, 10, 80, 20 );
		JLabel borda = new JLabel();
		borda.setBorder( BorderFactory.createEtchedBorder() );
		adic( borda, 7, 20, 313, 45 );
		adic( txtDataini, 25, 35, 110, 20 );
		adic( new JLabel( "at�", SwingConstants.CENTER ), 135, 35, 40, 20 );
		adic( txtDatafim, 175, 35, 110, 20 );
		
		GregorianCalendar cPeriodo = new GregorianCalendar();
		txtDatafim.setVlrDate( cPeriodo.getTime() );
		cPeriodo.set( Calendar.DAY_OF_MONTH, cPeriodo.get( Calendar.DAY_OF_MONTH ) - 30 );
		txtDataini.setVlrDate( cPeriodo.getTime() );
		
		adic( new JLabelPad( "C�d. CC" ),7, 65, 80, 20 );
		adic( txtCodCC, 7, 85, 80, 20 );
		adic( new JLabelPad( "Descri��o do Centro de custo" ),90, 65, 230, 20 );
		adic( txtDescCC, 90, 85, 230, 20 );
		adic( new JLabelPad("C�d.Conta"),7, 105, 80, 20 );
		adic( txtCodConta, 7, 125, 80, 20 );
		adic( new JLabelPad("Descri��o da  Conta"),90, 105, 230, 20 );
		adic( txtDescConta, 90, 125, 230, 20 );
		adic( new JLabelPad("C�d.Plan."),7, 145, 80, 20 );
		adic( txtCodPlan, 7, 165, 80, 20 );
		adic( new JLabelPad("Descri��o do planejamento"),90, 145, 230, 20 );
		adic( txtDescPlan, 90, 165, 230, 20 );
		
		
	}
	
	private void montaListaCampos(){
		
		/*******************
		 * Centro de custo *
		 *******************/
		 
		lcCC.add( new GuardaCampo( txtCodCC, "CodCC", "C�d.cc.", ListaCampos.DB_PK, false ) );
		lcCC.add( new GuardaCampo( txtSiglaCC, "SiglaCC", "Sigla", ListaCampos.DB_SI, false ) );
		lcCC.add( new GuardaCampo( txtDescCC, "DescCC", "Descri��o do centro de custo", ListaCampos.DB_SI, false ) );
		lcCC.setReadOnly( true );
		lcCC.montaSql( false, "CC", "FN" );
		txtCodCC.setTabelaExterna( lcCC );
		txtCodCC.setFK( true );
		txtCodCC.setNomeCampo( "CodCC" );
		txtSiglaCC.setListaCampos( lcCC );
		
		/*********
		 * Conta *
		 *********/
		
		lcConta.add( new GuardaCampo( txtCodConta, "NumConta", "C�d.conta", ListaCampos.DB_PK, false ) );
		lcConta.add( new GuardaCampo( txtDescConta, "DescConta", "Descri��o da conta", ListaCampos.DB_SI, false ) );
		lcConta.add( new GuardaCampo( txtCodPlan, "CodPlan", "Cod.plan.", ListaCampos.DB_SI, false ) );
		lcConta.montaSql( false, "CONTA", "FN" );
		lcConta.setReadOnly( true );
		txtCodConta.setTabelaExterna( lcConta );
		txtCodConta.setFK( true );
		txtCodConta.setNomeCampo( "NumConta" );
		
		/****************
		 * Planejamento *
		 * *************/
		
		lcPlan.add(new GuardaCampo(txtCodPlan, "CodPlan", "C�d.plan",ListaCampos.DB_PK, false));
		lcPlan.add(new GuardaCampo(txtDescPlan, "DescPlan","Descri��o do planejamento", ListaCampos.DB_SI, false));
		lcPlan.montaSql(false, "PLANEJAMENTO", "FN");
		lcPlan.setWhereAdic("NIVELPLAN=6");
		lcPlan.setReadOnly(true);
		txtCodPlan.setTabelaExterna(lcPlan);
		txtCodPlan.setFK(true);
		txtCodPlan.setNomeCampo("CodPlan");
	}

	public void imprimir( boolean bVisualizar ){
		
		StringBuilder sSQL = new StringBuilder();
		ResultSet rs = null;
		StringBuilder sCab = new StringBuilder();
		StringBuilder sWhere = new StringBuilder();
			
		
		if ( txtDatafim.getVlrDate().before( txtDataini.getVlrDate() ) ) {
			
			Funcoes.mensagemInforma( this, "Data final maior que a data inicial!" );
			return;
		}
		
		if( ! "".equals( txtCodCC.getVlrString().trim() )){
			
			sWhere.append( "AND SL.CODCC= " + txtCodCC.getVlrString() );
			sCab.append( " Centro de custo:  " + txtCodCC.getVlrString() + "  " + txtDescCC.getVlrString() );
		}
		
		if( ! "".equals( txtCodConta.getVlrString() )){
			
			sWhere.append( "AND C.CODEMP=? AND C.CODFILIAL=? AND C.NUMCONTA=? " );
			
		}
		
		if( ! "".equals( txtCodPlan.getVlrString() )){
			
			sWhere.append( " AND SL.CODPLAN= " + txtCodPlan.getVlrString() );
		}

		sCab.append( "  Periodo: " + txtDataini.getVlrString() + " " + " At� " + " " + txtDatafim.getVlrString() ); 
		
		sSQL.append( " SELECT SL.CODPLAN, PL.DESCPLAN, SL.DATASUBLANCA, SL.HISTSUBLANCA, L.DOCLANCA, SL.VLRSUBLANCA,CC.DESCCC, C.DESCCONTA " );
		sSQL.append( "FROM FNSUBLANCA SL " );
		sSQL.append( "LEFT OUTER JOIN FNPLANEJAMENTO PL ON PL.CODEMP=SL.CODEMPPN AND PL.CODFILIAL=SL.CODFILIALPN AND PL.CODPLAN=SL.CODPLAN " );
		sSQL.append( "LEFT OUTER JOIN FNLANCA L ON L.CODEMP=SL.CODEMP AND L.CODFILIAL=SL.CODFILIAL AND L.CODLANCA=SL.CODLANCA " );
		sSQL.append( "LEFT OUTER JOIN FNCC CC ON CC.CODEMP=SL.CODEMPCC AND CC.CODFILIAL=SL.CODFILIALCC AND CC.CODCC=SL.CODCC AND CC.ANOCC=SL.ANOCC " );
		sSQL.append( "LEFT OUTER JOIN FNPLANEJAMENTO PL2 ON PL2.CODEMP=L.CODEMPPN AND PL2.CODFILIAL=L.CODFILIALPN AND PL2.CODPLAN=L.CODPLAN " );
		sSQL.append( "LEFT OUTER JOIN FNCONTA C ON C.CODEMPPN=PL2.CODEMP AND C.CODFILIALPN=PL2.CODFILIAL AND C.CODPLAN=PL2.CODPLAN " );
		sSQL.append( "WHERE SL.CODEMP=? AND SL.CODFILIAL=? AND SL.DATASUBLANCA BETWEEN ? AND ? " );
		sSQL.append( sWhere.toString() );
		sSQL.append( "ORDER BY SL.CODPLAN, SL.DATASUBLANCA" );
		
		try {
			
			PreparedStatement ps = con.prepareStatement( sSQL.toString() );
			int param = 1;
			ps.setInt( param++, Aplicativo.iCodEmp );
			ps.setInt( param++, ListaCampos.getMasterFilial( "FNSUBLANCA" ) );
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDataini.getVlrDate() ) );
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDatafim.getVlrDate() ) );
			
		
			if( ! "".equals( txtCodConta.getVlrString() )){
				
				sWhere.append( "AND C.CODEMP=? AND C.CODFILIAL=? AND C.NUMCONTA=? " );
				
			}
			
			
			rs = ps.executeQuery();
			
		} catch ( Exception e ) {
			
			e.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar dados " + e.getMessage());
		}
		
		imprimiGrafico( rs, bVisualizar, sCab.toString() );
	}
		private void imprimiGrafico( final ResultSet rs, final boolean bVisualizar,  final String sCab ) {

			FPrinterJob dlGr = null;
			HashMap<String, Object> hParam = new HashMap<String, Object>();

			hParam.put( "CODEMP", Aplicativo.iCodEmp );
			hParam.put( "CODFILIAL", ListaCampos.getMasterFilial( "FNCONTA" ) );
			hParam.put( "RAZAOEMP", Aplicativo.sEmpSis );
			hParam.put( "FILTROS", sCab );

			dlGr = new FPrinterJob( "relatorios/FRLancamentos.jasper", "Lan�amentos por categoria", sCab, rs, hParam, this );

			if ( bVisualizar ) {
				dlGr.setVisible( true );
			}
			
			else {
				
				try {
					JasperPrintManager.printReport( dlGr.getRelatorio(), true );
				} catch ( Exception err ) {
					Funcoes.mensagemErro( this, "erro na impress�o do relat�rio!" + err.getMessage(), true, con, err );
				}
			}
		}
		
		public void setConexao( Connection cn ) {
			
			super.setConexao( cn );
			iAnoBase = buscaAnoBaseCC();
			lcConta.setConexao( cn );
			lcPlan.setConexao( cn );
			lcCC.setConexao( cn );
			lcCC.setWhereAdic( "ANOCC=" + iAnoBase );
		}
	
		private int buscaAnoBaseCC() {

			int iRet = 0;
			String sSQL = "SELECT ANOCENTROCUSTO FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
			try {
				PreparedStatement ps = con.prepareStatement( sSQL );
				ps.setInt( 1, Aplicativo.iCodEmp );
				ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
				ResultSet rs = ps.executeQuery();
				if ( rs.next() )
					iRet = rs.getInt( "ANOCENTROCUSTO" );
				rs.close();
				ps.close();
			} catch ( SQLException err ) {
				Funcoes.mensagemErro( this, "Erro ao buscar o ano-base para o centro de custo.\n" + err.getMessage(), true, con, err );
			}
			return iRet;
		}	
	}

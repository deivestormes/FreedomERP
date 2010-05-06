package org.freedom.modulos.gms.view.frame.crud.detail;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.JComboBoxEvent;
import org.freedom.acao.JComboBoxListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.EmailBean;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JCheckBoxPad;
import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FDetalhe;
import org.freedom.library.swing.frame.FPrinterJob;
import org.freedom.modulos.gms.DLBuscaSerie;
import org.freedom.modulos.gms.business.object.RecMerc;
import org.freedom.modulos.gms.view.dialog.utility.DLSerie;
import org.freedom.modulos.gms.view.dialog.utility.DLSerieGrid;
import org.freedom.modulos.std.view.dialog.utility.DLBuscaProd;


public class FOrdemServico extends FDetalhe implements FocusListener, JComboBoxListener, CarregaListener, PostListener, InsertListener {

	// *** Constantes

	private static final long serialVersionUID = 1L;
	
	private final int casasDec = Aplicativo.casasDec;

	// *** Variaveis

	private HashMap<String, Object> prefere = null;

	private boolean novo = true;

	private Vector<String> vValsFrete = new Vector<String>();

	private Vector<String> vLabsFrete = new Vector<String>();

	// *** Campos (Cabe�alho)

	private JTextFieldPad txtTicket = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtCodTipoRecMercDet = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

//	private JTextFieldPad txtCodTran = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

//	private JTextFieldFK txtNomeTran = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

//	private JTextFieldFK txtCNPJTran = new JTextFieldFK( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtCNPJCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtCodPais = new JTextFieldFK( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtSiglaUF = new JTextFieldFK( JTextFieldPad.TP_STRING, 2, 0 );

	private JTextFieldPad txtCodMun = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtStatus = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private JTextFieldPad txtGarantia = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtStatusItRecMerc = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

//	private JRadioGroup<String, String> rgFrete = null;
	
	private JTextFieldPad txtCodAtend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtNomeAtend = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtDtEnt = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JTextFieldPad txtDtPrevRet = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDocRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldPad txtCodProcRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldFK txtDescProcRecMerc = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtEmailCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtTipoProcRecMerc = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private JTextFieldPad txtCodBarProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodFabProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldPad txtCodUnid = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );
	
	private JTextFieldPad txtCodLote = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );
	
	private JTextFieldPad txtNumSerie = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );
	
	private JTextFieldFK txtObsSerie = new JTextFieldFK( JTextFieldPad.TP_STRING, 150, 0 );
	
	private JTextFieldPad txtCodAlmoxProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldPad txtCLoteProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtSerieProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private JTextFieldPad txtQtdItOS = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	// *** Campos (Detalhe)

	private JTextFieldPad txtCodItRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtRefProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCodFisc = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDtFabricSerie = new JTextFieldFK( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JTextFieldFK txtDtValidSerie = new JTextFieldFK( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JCheckBoxPad cbGarantia = new JCheckBoxPad( "Sim", "S", "N" );


	// *** Paineis

	private JPanelPad pinCab = new JPanelPad();

	private JPanelPad pinDet = new JPanelPad();// JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinDetGrid = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 2 ) );

	// *** Lista Campos

//	private ListaCampos lcTran = new ListaCampos( this, "TN" );

	private ListaCampos lcCli = new ListaCampos( this, "CL" );

	private ListaCampos lcProd = new ListaCampos( this, "PD" );

	private ListaCampos lcProd2 = new ListaCampos( this, "PD" );
	
	private ListaCampos lcAtendente = new ListaCampos( this, "AR" );
	
	private ListaCampos lcTipoRecMerc = new ListaCampos( this, "TR" );
	
	private ListaCampos lcProc = new ListaCampos( this, "TP" );

	private ListaCampos lcNumSerie = new ListaCampos( this, "NS" );
	
	// *** Labels

	private JLabelPad lbStatus = new JLabelPad();
	private JLabelPad lbNumSerie = new JLabelPad();

	public FOrdemServico( ) {

//		super();

		setTitulo( "Ordem de Servi�o" );
		setAtribos( 50, 50, 780, 480 );

		configuraCampos();
		montaListaCampos();

	}

	private void configuraCampos() {

		txtCodMun.setAtivo( false );

		vValsFrete.addElement( "C" );
		vValsFrete.addElement( "F" );
		vLabsFrete.addElement( "CIF" );
		vLabsFrete.addElement( "FOB" );

//		rgFrete = new JRadioGroup<String, String>( 1, 2, vLabsFrete, vValsFrete, -4 );

		RecMerc.atualizaStatus( (String) RecMerc.STATUS_NAO_SALVO.getValue(), lbStatus );

		lbStatus.setText( "N�O SALVO" );
		lbStatus.setVisible( true );
		
		lbStatus.setVisible( false );
		
	}

	private void montaTela() {

		pnMaster.remove( spTab );
		pnMaster.add( pinDetGrid, BorderLayout.CENTER );

		pinDetGrid.add( spTab );
//		pinDetGrid.add( new JScrollPane( tabPesagem ) );

		montaCabecalho();
		montaDetalhe();
		montaTab();
		ajustaTabela();
		adicListeners();
		setImprimir( true );


	}

	private void montaCabecalho() {

		setAltCab( 130 );

		setListaCampos( lcCampos );
		setPainel( pinCab, pnCliCab );

		adicCampo( txtTicket, 7, 20, 70, 20, "Ticket", "Ticket", ListaCampos.DB_PK, true );

		adicCampoInvisivel( txtCodTipoRecMerc, "CodTipoRecMerc", "C�d.T.", ListaCampos.DB_FK, true );

		adicCampo( txtCodCli, 80, 20, 67, 20, "CodCli", "C�d.Cli.", ListaCampos.DB_FK, txtRazCli, true );
		adicDescFK( txtRazCli, 150, 20, 197, 20, "RazCli", "Raz�o social do cliente" );
		
		adicCampo( txtCodAtend, 350, 20, 67, 20, "CodAtendRec", "C�d.Atend.", ListaCampos.DB_FK, txtNomeAtend, true );
		adicDescFK( txtNomeAtend, 420, 20, 197, 20, "NomeAtend", "Nome do Atendente" );
		
		adicCampo( txtDtEnt, 7, 60, 70, 20, "DtEnt", "Dt.Entrada", ListaCampos.DB_SI, true );
		adicCampo( txtDtPrevRet, 80, 60, 70, 20, "DtPrevRet", "Dt.Prevista", ListaCampos.DB_SI, true );
//		adicCampo( txtDocRecMerc, 153, 60, 70, 20, "DocRecMerc", "Documento", ListaCampos.DB_SI, false );

		adicCampoInvisivel( txtStatus, "Status", "Status", ListaCampos.DB_SI, false );

		adic( lbStatus, 620, 20, 123, 60 );

		setListaCampos( true, "RECMERC", "EQ" );
		lcCampos.setQueryInsert( true );

	}

	private void montaDetalhe() {

		setAltDet( 70 );

		setPainel( pinDet, pnDet );
		setListaCampos( lcDet );
		setNavegador( navRod );

		adicCampo( txtCodItRecMerc, 7, 20, 45, 20, "CodItRecMerc", "Seq.", ListaCampos.DB_PK, true );
		
		if ( comRef() ) {
			txtRefProd.setBuscaAdic( new DLBuscaProd( con, "REFPROD", lcProd2.getWhereAdic() ) );
			adicCampoInvisivel( txtCodProd, "CodProd", "C�d.Prod.", ListaCampos.DB_FK, txtDescProd, false );
			adicCampoInvisivel( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_FK, false );

			adic( new JLabelPad( "Refer�ncia" ), 55, 0, 70, 20 );
			adic( txtRefProd, 55, 20, 70, 20 );
			txtRefProd.setFK( true );
		}
		else {
			txtCodProd.setBuscaAdic( new DLBuscaProd( con, "CODPROD", lcProd.getWhereAdic() ) );
			adicCampo( txtCodProd, 55, 20, 70, 20, "CodProd", "C�d.prod.", ListaCampos.DB_FK, txtDescProd, false );
			adicCampoInvisivel( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_FK, false );
		}

		adicDescFK( txtDescProd, 128, 20, 230, 20, "DescProd", "Descri��o do Produto" );
		adicCampo( txtQtdItOS, 361, 20, 70, 20, "QtdItRecMerc", "Qtd.", ListaCampos.DB_SI, true );

		txtQtdItOS.setBuscaAdic( new DLBuscaSerie( lcDet, lcNumSerie, lcProd, con, "qtditrecmerc", true ) );

		lbNumSerie = adicCampo( txtNumSerie, 434, 20, 100, 20, "NumSerie", "N�mero de s�rie", ListaCampos.DB_FK, txtObsSerie, false );
		adicDescFK( txtDtFabricSerie, 537, 20, 80, 20, "DtFabricSerie", "Fabrica��o" );
		adicDescFK( txtDtValidSerie, 620, 20, 80, 20, "DtFabricSerie", " Validade" );
		
		lbNumSerie.setVisible( false );
		
		adicCampoInvisivel( txtCodProcRecMerc, "CodProcRecMerc", "Cod.Proc.", ListaCampos.DB_FK, txtDescProcRecMerc, true );
		adicDescFKInvisivel( txtDescProcRecMerc, "DescProcRecMerc", "Descri��o do processo" );
		adicCampoInvisivel( txtCodTipoRecMercDet, "CodTipoRecMerc", "Cod.Tp.Rec.Merc", ListaCampos.DB_SI, true );
		
		adicDB( cbGarantia, 703, 20, 80, 20, "garantia", "Garantia", false );

		txtStatusItRecMerc.setSoLeitura( true );
		adicCampoInvisivel( txtStatusItRecMerc, "StatusItRecMerc", "Status", ListaCampos.DB_SI, false );

		setListaCampos( true, "ITRECMERC", "EQ" );
		lcDet.setQueryInsert( true );

	}

	private void carregaTipoRec() {

		txtCodTipoRecMerc.setVlrInteger( (Integer) prefere.get( "codtiporecmerc" ) );
		lcTipoRecMerc.carregaDados();
		
	}

	private void getPreferencias() {

		StringBuilder sql = new StringBuilder();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			prefere = new HashMap<String, Object>();

			sql.append( "select pf1.usarefprod, coalesce(pf8.codtiporecmercos,0) codtiporecmerc " );
			sql.append( "from sgprefere1 pf1 left outer join sgprefere8 pf8 " );
			sql.append( "on pf8.codemp=pf1.codemp and pf8.codfilial=pf1.codfilial " );
			sql.append( "where pf1.codemp=? and pf1.codfilial=? " );

			ps = con.prepareStatement( sql.toString() );

			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );

			rs = ps.executeQuery();

			if ( rs.next() ) {
				prefere.put( "codtiporecmerc", rs.getInt( "codtiporecmerc" ) );
				prefere.put( "usarefprod", new Boolean("S".equals( rs.getString( "usarefprod" ))) );
			}

			con.commit();

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	private void ajustaTabela() {

		tab.setRowHeight( 21 );

		tab.setTamColuna( 30, 0 );
		tab.setTamColuna( 60, 1 );
		tab.setTamColuna( 350, 2 );
		tab.setTamColuna( 70, 3);

		tab.setColunaInvisivel( 5 );
		tab.setColunaInvisivel( 6 );
		tab.setColunaInvisivel( 7 );
		tab.setColunaInvisivel( 8 );
	}

	private void adicListeners() {

		lcCampos.addInsertListener( this );
		lcCampos.addCarregaListener( this );
		lcCampos.addPostListener( this );
		lcDet.addPostListener( this );
		lcCli.addCarregaListener( this );
		lcDet.addCarregaListener( this );

		lcProd.addCarregaListener( this );
		lcProd2.addCarregaListener( this );
		
		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );
		txtNumSerie.addFocusListener( this );
		txtQtdItOS.addFocusListener( this );
		txtDocRecMerc.addKeyListener( this );
		txtQtdItOS.addKeyListener( this );
		txtNumSerie.addKeyListener( this );
	}

	private void montaListaCampos() {

		// * Tipo de Recebimento Cabe�alho

		lcTipoRecMerc.add( new GuardaCampo( txtCodTipoRecMerc, "CodTipoRecMerc", "C�d.Tipo.Rec.", ListaCampos.DB_PK, false ) );

		txtCodTipoRecMerc.setTabelaExterna( lcTipoRecMerc );
		txtCodTipoRecMerc.setNomeCampo( "CodTipoRecMerc" );
		txtCodTipoRecMerc.setFK( true );

		lcTipoRecMerc.setReadOnly( true );
		lcTipoRecMerc.montaSql( false, "TIPORECMERC", "EQ" );

		
		// * Cliente

		lcCli.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.Cli.", ListaCampos.DB_PK, false ) );
		lcCli.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtCNPJCli, "CnpjCli", "CNPJ", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtCodPais, "CodPais", "C�d.Pa�s", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtSiglaUF, "SiglaUF", "UF", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtCodMun, "CodMunic", "C�d.Mun.", ListaCampos.DB_SI, false ) );
//		lcCli.add( new GuardaCampo( txtCodAtend, "CodVend", "C�d.comis.", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtEmailCli, "EmailCli", "Email do cliente.", ListaCampos.DB_SI, false ) );

		txtCodCli.setTabelaExterna( lcCli );
		txtCodCli.setNomeCampo( "CodCli" );
		txtCodCli.setFK( true );

		lcCli.setReadOnly( true );
		lcCli.montaSql( false, "CLIENTE", "VD" );

		// * Transportadora

//		lcTran.add( new GuardaCampo( txtCodTran, "CodTran", "C�d.For.", ListaCampos.DB_PK, false ) );
//		lcTran.add( new GuardaCampo( txtNomeTran, "NomeTran", "Nome da transportadora", ListaCampos.DB_SI, false ) );
//		lcTran.add( new GuardaCampo( txtCNPJTran, "CnpjTran", "CNPJ", ListaCampos.DB_SI, false ) );

//		txtCodTran.setTabelaExterna( lcTran );
//		txtCodTran.setNomeCampo( "CodTran" );
//		txtCodTran.setFK( true );

//		lcTran.setReadOnly( true );
//		lcTran.montaSql( false, "TRANSP", "VD" );

		// * Produto (Detalhe)

		lcProd.add( new GuardaCampo( txtCodProd, "codprod", "C�d.prod.", ListaCampos.DB_PK, true ) );
		lcProd.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_SI, false ) );		
	
		lcProd.add( new GuardaCampo( txtCodFabProd, "CodFabProd", "Cod.Fabricante", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCodBarProd, "CodBarProd", "Cod.Barra", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCodFisc, "CodFisc", "Cod.Fiscal", ListaCampos.DB_SI, false ) );
		
		lcProd.add( new GuardaCampo( txtCodUnid, "CodUnid", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCodAlmoxProd, "CodAlmox", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCLoteProd, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtSerieProd, "SerieProd", "C/S�rie", ListaCampos.DB_SI, false ) );
		
		
		txtCodUnid.setAtivo( false );
		lcProd.setWhereAdic( "ATIVOPROD='S'" );
		lcProd.montaSql( false, "PRODUTO", "EQ" );
		lcProd.setQueryCommit( false );
		lcProd.setReadOnly( true );
		txtCodProd.setTabelaExterna( lcProd );
		
		//* Produto referencia
		
		lcProd2.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_PK, true ) );
		lcProd2.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCodProd, "codprod", "C�d.prod.", ListaCampos.DB_SI, false ) );		

		lcProd2.add( new GuardaCampo( txtCodFabProd, "CodFabProd", "Cod.Fabricante", ListaCampos.DB_SI, false ) );		
		lcProd2.add( new GuardaCampo( txtCodBarProd, "CodBarProd", "Cod.Barras", ListaCampos.DB_SI, false ) );
		
		lcProd2.add( new GuardaCampo( txtCodUnid, "CodUnid", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCodAlmoxProd, "CodAlmox", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCLoteProd, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtSerieProd, "SerieProd", "C/S�rie", ListaCampos.DB_SI, false ) );
		
		txtRefProd.setNomeCampo( "RefProd" );
		txtRefProd.setListaCampos( lcDet );
		lcProd2.setWhereAdic( "ATIVOPROD='S'" );
		lcProd2.montaSql( false, "PRODUTO", "EQ" );
		lcProd2.setQueryCommit( false );
		lcProd2.setReadOnly( true );
		txtRefProd.setTabelaExterna( lcProd2 );

		// FK do n�mero de s�rie
		
		lcNumSerie.add( new GuardaCampo( txtNumSerie, "NumSerie", "Num.S�rie", ListaCampos.DB_PK, false ) );
		lcNumSerie.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, false ) );
		lcNumSerie.add( new GuardaCampo( txtObsSerie, "ObsSerie", "Observa��es", ListaCampos.DB_SI, false ) );
		lcNumSerie.add( new GuardaCampo( txtDtFabricSerie, "dtfabricserie", "Fabrica��o", ListaCampos.DB_SI, false ) );
		lcNumSerie.add( new GuardaCampo( txtDtValidSerie, "dtvalidserie", "Validade", ListaCampos.DB_SI, false ) );
		
		
		lcNumSerie.setDinWhereAdic( "CODPROD=#N", txtCodProd );
		lcNumSerie.setAutoLimpaPK( false );
		lcNumSerie.montaSql( false, "SERIE", "EQ" );
		lcNumSerie.setQueryCommit( false );
		lcNumSerie.setReadOnly( true );
		txtNumSerie.setTabelaExterna( lcNumSerie );
		txtObsSerie.setListaCampos( lcNumSerie );
		txtObsSerie.setNomeCampo( "ObsSerie" );
		txtObsSerie.setLabel( "Observa��es" );
		
		
		// FK Atendente
		lcAtendente.add( new GuardaCampo( txtCodAtend, "CodAtend", "C�d.Atend.", ListaCampos.DB_PK, false ) );
		lcAtendente.add( new GuardaCampo( txtNomeAtend, "NomeAtend", "Nome do atendente", ListaCampos.DB_SI, false ) );
		lcAtendente.montaSql( false, "ATENDENTE", "AT" );
		lcAtendente.setQueryCommit( false );
		lcAtendente.setReadOnly( true );
		txtCodAtend.setTabelaExterna( lcAtendente );
		
		/***************
		 * PROCESSOS *
		 ***************/

		lcProc.add( new GuardaCampo( txtCodProcRecMerc, "CodProcRecMerc", "C�d.Proc.", ListaCampos.DB_PK, false ) );
		lcProc.add( new GuardaCampo( txtDescProcRecMerc, "DescProcRecMerc", "Descri��o do processo", ListaCampos.DB_SI, false ) );
		lcProc.add( new GuardaCampo( txtCodTipoRecMercDet, "CodTipoRecMerc", "Cod.Tp.Rec.Merc.", ListaCampos.DB_SI, false ) );
		lcProc.add( new GuardaCampo( txtTipoProcRecMerc, "TipoProcRecMerc", "Tp.Proc.Rec.Merc.", ListaCampos.DB_SI, false ) );

		txtCodProcRecMerc.setTabelaExterna( lcProc );
		txtCodProcRecMerc.setNomeCampo( "CodProcRecMerc" );
		txtCodProcRecMerc.setFK( true );

		lcProc.setReadOnly( true );
		lcProc.montaSql( false, "PROCRECMERC", "EQ" );



	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp ) {
			imprimir( true );
		}
		else if ( evt.getSource() == btImp ) {
			imprimir( false );
		}

		super.actionPerformed( evt );

	}

	private void imprimiGrafico( final ResultSet rs, final boolean bVisualizar ) {

		FPrinterJob dlGr = null;
		HashMap<String, Object> hParam = new HashMap<String, Object>();

		hParam.put( "CODEMP", Aplicativo.iCodEmp );
		hParam.put( "CODFILIAL", ListaCampos.getMasterFilial( "EQRECMERC" ) );
		hParam.put( "RAZAOEMP", Aplicativo.empresa.toString() );
		hParam.put( "TICKET", txtTicket.getVlrInteger() );

		EmailBean email = Aplicativo.getEmailBean();
		email.setPara( txtEmailCli.getVlrString() );
		
		dlGr = new FPrinterJob( "layout/os/OS_PD.jasper", "Ordem de Servi�o", "", rs, hParam, this, email );

		if ( bVisualizar ) {
			dlGr.setVisible( true );
		}
		else {
			try {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			} 
			catch ( Exception err ) {
				Funcoes.mensagemErro( this, "Erro na impress�o de relat�rio coleta!" + err.getMessage(), true, con, err );
			}
		}
	}

	private void imprimir( boolean bVisualizar ) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();

		sql.append( "select " );
		sql.append( "se.codsecao, se.descsecao, rm.dtent, rm.hins, rm.dtprevret, it.qtditrecmerc, pd.codprod, pd.refprod, " );
		sql.append( "pd.descprod, rm.ticket, cl.codcli, cl.razcli, rm.docrecmerc, vd.nomevend, mn.nomemunic, " );
		
		
		sql.append( "cl.cnpjcli, cl.rgcli, cl.endcli, cl.numcli, cl.baircli, ");
		sql.append( "ae.nomeatend, it.defeitoitrecmerc, it.servicosolicitrecmerc, it.condicoesitrecmerc, it.obsitrecmerc, ");
		sql.append( "it.numserie, it.garantia, it.statusitrecmerc ");
		
		sql.append( "from " );
		sql.append( "eqrecmerc rm " );
		sql.append( "left outer join vdcliente cl on " );
		sql.append( "cl.codemp=rm.codempcl and cl.codfilial=rm.codfilialcl and cl.codcli=rm.codcli " );
		
		sql.append( "left outer join atatendente ae on ");
		
		sql.append( "ae.codemp=rm.codempar and ae.codfilial=rm.codfilialar and ae.codatend=rm.codatendrec ");
		
		
		sql.append( "left outer join sgmunicipio mn on " );
		sql.append( "mn.codpais=cl.codpais and mn.siglauf=cl.siglauf and mn.codmunic=cl.codmunic " );
		sql.append( "left outer join vdvendedor vd on " );
		sql.append( "vd.codemp=rm.codempvd and vd.codfilial=rm.codfilialvd and vd.codvend=rm.codvend " );
		sql.append( "left outer join eqitrecmerc it on " );
		sql.append( "it.codemp=rm.codemp and it.codfilial=rm.codfilial and it.ticket=rm.ticket " );
		sql.append( "left outer join eqproduto pd on " );
		sql.append( "pd.codemp=it.codemppd and pd.codfilial=it.codfilialpd and pd.codprod=it.codprod " );
		sql.append( "left outer join eqsecao se on " );
		sql.append( "se.codemp=pd.codempsc and se.codfilial=pd.codfilialsc and se.codsecao=pd.codsecao " );
		sql.append( "where " );
		sql.append( "rm.codemp=? and rm.codfilial=? and rm.ticket=? " );
		sql.append( "order by it.coditrecmerc " );

		try {
			
			System.out.println("SQL:" + sql.toString());

			ps = con.prepareStatement( sql.toString() );
			
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "EQRECMERC" ) );
			ps.setInt( 3, txtTicket.getVlrInteger() );

			System.out.println( sql.toString() );

			rs = ps.executeQuery();

		} 
		catch ( SQLException err ) {

			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar dados da ordem de servi�o" );
			
		}

		imprimiGrafico( rs, bVisualizar );
	
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );

		lcProd.setConexao( cn );
		lcProd2.setConexao( cn );
		lcNumSerie.setConexao( cn );
//		lcTran.setConexao( cn );
		lcCli.setConexao( cn );
		lcAtendente.setConexao( cn );
		lcTipoRecMerc.setConexao( cn );
		lcProc.setConexao( cn );

		getPreferencias();
		
		montaTela();
 
		lcCampos.insert( true );
		
	}
	
	private boolean comRef(){
		return ((Boolean) prefere.get( "usarefprod" )).booleanValue(); 
	}

	public void focusGained( FocusEvent e ) {

		// TODO Auto-generated method stub

	}

	public void focusLost( FocusEvent e ) {

		if ( ( e.getSource() == txtQtdItOS ) ) {
			habilitaSerie();
		}


	}

	public void valorAlterado( JComboBoxEvent evt ) {

	}

	public void afterCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcCampos ) {
			RecMerc.atualizaStatus( txtStatus.getVlrString(), lbStatus );
		}
		else if ( cevt.getListaCampos() == lcProd || cevt.getListaCampos() == lcProd2 ) {
			if ( "S".equals( txtSerieProd.getVlrString() ) ) {
				
				lbNumSerie.setVisible( true );
				txtNumSerie.setVisible( true );
				
				habilitaSerie();
				
			}
			else  {
				
				lbNumSerie.setVisible( false );
				txtNumSerie.setVisible( false );
				
			}
		}
		
	
			
		
		
		
		
		
		
		
		
		
		

	}
	
	private void habilitaSerie() {
		if( "S".equals( txtSerieProd.getVlrString() ) && txtQtdItOS.getVlrBigDecimal().compareTo( new BigDecimal( 1 ) )==0 ) {
			
			txtNumSerie.setEditable( true );
		}
		else {
			txtNumSerie.setEditable( false );
		}				

	}


	public boolean testaNumSerie() {

		boolean bRetorno = false;
		boolean bValido = false;

		// Valida��o e abertura da tela para cadastramento da serie unit�ria
		if(txtNumSerie.isEditable()) {
		
			String sSQL = "SELECT COUNT(*) FROM EQSERIE WHERE NUMSERIE=? AND CODPROD=? AND CODEMP=? AND CODFILIAL=?";
			
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try {
			
				ps = con.prepareStatement( sSQL );
				ps.setString( 1, txtNumSerie.getVlrString() );
				ps.setInt( 2, txtCodProd.getVlrInteger() );
				ps.setInt( 3, Aplicativo.iCodEmp );
				ps.setInt( 4, lcNumSerie.getCodFilial() );
				
				rs = ps.executeQuery();
				
				if ( rs.next() ) {
					if ( rs.getInt( 1 ) > 0 ) {
						bValido = true;
					}
				}
				
				rs.close();
				ps.close();
				con.commit();
				
			} 
			catch ( SQLException err ) {
				Funcoes.mensagemErro( this, "Erro ao consultar a tabela EQSERIE!\n" + err.getMessage(), true, con, err );
			}
			if ( !bValido ) {
				
				DLSerie dl = new DLSerie( this, txtNumSerie.getVlrString(), txtCodProd.getVlrInteger(), txtDescProd.getVlrString(), con );
				
				dl.setVisible( true );
				
				if ( dl.OK ) {
					bRetorno = true;
					txtNumSerie.setVlrString( dl.getNumSerie() );
					lcNumSerie.carregaDados();
				}
				dl.dispose();
			}
			else {
				bRetorno = true;
			}
		}
		// Tela para cadastramento da s�rie para quantidade maior que 1
		else {
			
			abreDlSerieMuitiplos();
			
		}
		
		
		return bRetorno;
	}

	private void abreDlSerieMuitiplos() {
		
		DLSerieGrid dl = new DLSerieGrid();
		dl.setCodemp( lcDet.getCodEmp() );
		dl.setCodfilial( lcDet.getCodFilial() );
		dl.setCodcompra( txtTicket.getVlrInteger() );
		dl.setCoditcompra( txtCodItRecMerc.getVlrInteger() );
		dl.setCodemppd( lcProd.getCodEmp() );
		dl.setCodfilialpd( lcProd.getCodFilial() );
		dl.setCodprod( txtCodProd.getVlrInteger() );
		dl.setDescprod( txtDescProd.getVlrString().trim() );
		
		dl.setConexao( con );
		dl.setVisible( true );
		HashMap<String,Integer> retorno = null;
		
		if ( dl.OK ) {

		}
		else {	
		}
		
		dl.dispose();
	}
	
	public void beforeCarrega( CarregaEvent cevt ) {

		// TODO Auto-generated method stub

	}
	
	public void beforePost( PostEvent pevt ) {

		super.beforePost( pevt );

		
		if ( pevt.getListaCampos() == lcCampos ) {
			carregaTipoRec();
			if ( "".equals( txtStatus.getVlrString() ) ) {
				txtStatus.setVlrString( (String) RecMerc.STATUS_PENDENTE.getValue() );
			}

			if ( pevt.getEstado() == ListaCampos.LCS_INSERT ) {
				novo = true;
			}

		}
		else if ( pevt.getListaCampos() == lcDet ) {
			txtCodTipoRecMercDet.setVlrInteger( txtCodTipoRecMerc.getVlrInteger() );
			txtCodProcRecMerc.setVlrInteger( 1 );
			
			if ( txtSerieProd.getVlrString().equals( "S" ) && txtQtdItOS.getVlrBigDecimal().floatValue()==1  ) {
				if ( !testaNumSerie() ) {
					pevt.cancela();
				}
			}
			
		}
	}

	public void afterPost( PostEvent pevt ) {

		super.beforePost( pevt );
		
		if ( pevt.getListaCampos() == lcCampos ) {
			if(novo) {
				lcDet.insert( true );
				novo = false;
				if(comRef()) {
					txtRefProd.requestFocus();
				}
				else {
					txtCodProd.requestFocus();
				}
			}
		}
		if ( pevt.getListaCampos() == lcDet ) {
			
//			lcCampos.carregaDados();
			
		}
		if (pevt.getListaCampos() == lcDet) {
			if ( txtSerieProd.getVlrString().equals( "S" ) && txtQtdItOS.getVlrBigDecimal().floatValue()>1  ) {
				testaNumSerie();								
			}			
		}

	}

	public void beforeInsert( InsertEvent e ) {

		}

	public void afterInsert( InsertEvent ievt ) {

		if ( ievt.getListaCampos() == lcCampos ) {
			carregaTipoRec();
			buscaAtendente();
			txtDtEnt.setVlrDate( new Date() );
			txtCodCli.requestFocus();
		}

	}


	public void keyPressed( KeyEvent kevt ) {

		if ( kevt.getKeyCode() == KeyEvent.VK_ENTER ) {
			if ( kevt.getSource() == txtDocRecMerc ) {// Talvez este possa ser o ultimo campo do cabecalho.
				if ( lcCampos.getStatus() == ListaCampos.LCS_INSERT || lcCampos.getStatus() == ListaCampos.LCS_EDIT ) {
					lcCampos.post();
				}
/*				else if ( lcDet.getStatus() == ListaCampos.LCS_EDIT ) {
					lcCampos.post();
					txtCodItRecMerc.requestFocus();
				}*/
			}	
			
			if ( ( kevt.getSource() == txtQtdItOS || kevt.getSource() == txtNumSerie ) && ( (lcDet.getStatus() == ListaCampos.LCS_INSERT) || (lcDet.getStatus() == ListaCampos.LCS_EDIT ) )  ) {			
				if ( "S".equals( txtSerieProd.getVlrString()) && kevt.getSource() == txtNumSerie ) {
					
					lcDet.post();
					
					lcDet.limpaCampos( true );
					
					lcDet.setState( ListaCampos.LCS_NONE );
					
					if(comRef()) {
						txtRefProd.requestFocus();
					}
					else {
						txtCodProd.requestFocus();
					}
						
				}
				else if ( ! "S".equals( txtSerieProd.getVlrString()) && kevt.getSource() == txtQtdItOS ) {

					lcDet.post();
					
					lcDet.limpaCampos( true );
					
					lcDet.setState( ListaCampos.LCS_NONE );
					
					if(comRef()) {
						txtRefProd.requestFocus();
					}
					else {
						txtCodProd.requestFocus();
					}

				}
			}
		}
				
//		super.keyPressed( kevt );
		
	}
	
	private void buscaAtendente() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();
		try {
	
			sql.append( "SELECT CODATEND FROM ATATENDENTE " );
			sql.append( "WHERE CODEMPUS=? AND CODFILIALUS=? AND IDUSU=? " );
	
			ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, Aplicativo.iCodFilial );
			ps.setString( 3, Aplicativo.strUsuario );
	
			rs = ps.executeQuery();
	
			if ( rs.next() ) {
				txtCodAtend.setVlrInteger( rs.getInt( "CODATEND" ) );
				lcAtendente.carregaDados();
			}
			
			con.commit();
	
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	
}

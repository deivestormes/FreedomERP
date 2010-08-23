package org.freedom.modulos.gms.view.frame.crud.detail;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.JComboBoxEvent;
import org.freedom.acao.JComboBoxListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.bmps.Icone;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.EmailBean;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JButtonPad;
import org.freedom.library.swing.component.JCheckBoxPad;
import org.freedom.library.swing.component.JComboBoxPad;
import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.component.JTabbedPanePad;
import org.freedom.library.swing.component.JTablePad;
import org.freedom.library.swing.component.JTextAreaPad;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.component.Navegador;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FDetalhe;
import org.freedom.library.swing.frame.FPrinterJob;
import org.freedom.modulos.atd.view.frame.crud.plain.FAtendente;
import org.freedom.modulos.crm.business.object.Prioridade;
import org.freedom.modulos.crm.view.frame.crud.plain.FChamado;
import org.freedom.modulos.gms.business.component.NumSerie;
import org.freedom.modulos.gms.business.object.RecMerc;
import org.freedom.modulos.gms.business.object.StatusOS;
import org.freedom.modulos.gms.view.dialog.utility.DLItensEstruturaProd;
import org.freedom.modulos.gms.view.dialog.utility.DLSerie;
import org.freedom.modulos.gms.view.dialog.utility.DLSerieGrid;
import org.freedom.modulos.gms.view.frame.crud.tabbed.FProduto;
import org.freedom.modulos.gms.view.frame.utility.FControleServicos;
import org.freedom.modulos.std.DLCodProd;
import org.freedom.modulos.std.view.dialog.utility.DLBuscaProd;
import org.freedom.modulos.std.view.frame.crud.plain.FSerie;
import org.freedom.modulos.std.view.frame.crud.tabbed.FCliente;

public class FOrdemServico extends FDetalhe implements FocusListener, JComboBoxListener, CarregaListener, PostListener, InsertListener {

	// *** Constantes

	private static final long serialVersionUID = 1L;

	private final int casasDec = Aplicativo.casasDec;

	// *** Variaveis

	private HashMap<String, Object> prefere = null;

	private boolean novo = true;

	// *** Campos (Cabe�alho)

	private JTextFieldPad txtTicket = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtCodTipoRecMercDet = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	// private JTextFieldPad txtCodTran = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	// private JTextFieldFK txtNomeTran = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	// private JTextFieldFK txtCNPJTran = new JTextFieldFK( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtCNPJCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtContCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldFK txtCodPais = new JTextFieldFK( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtSiglaUF = new JTextFieldFK( JTextFieldPad.TP_STRING, 2, 0 );

	private JTextFieldPad txtCodMunic = new JTextFieldPad( JTextFieldPad.TP_STRING, 7, 0 );

	private JTextFieldPad txtGarantia = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private JTextFieldPad txtGeraChamado = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private JTextFieldPad txtGeraRMA = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private JTextFieldPad txtGeraNovo = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtStatusItRecMerc = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private JTextFieldPad txtStatusItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	// private JRadioGroup<String, String> rgFrete = null;

	private JTextFieldPad txtCodAtend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtNomeAtend = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtDtEnt = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDtPrevRet = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDocRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodProcRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldFK txtDescProcRecMerc = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtEmailCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtTipoProcRecMerc = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private JTextFieldPad txtTipoProdItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private JTextFieldPad txtTipoProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtCodBarProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodFabProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodUnid = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtCodLote = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private JTextFieldPad txtNumSerie = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldFK txtObsSerie = new JTextFieldFK( JTextFieldPad.TP_STRING, 150, 0 );

	private JTextFieldPad txtCodAlmoxProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtSolicitante = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCLoteProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtSerieProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtQtdItOS = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	private JTextFieldPad txtQtdItOSItOS = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	private JTextFieldPad txtCodTpChamado = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtQtdHorasServ = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );
	
	// *** Tabelas

	private JTablePad tabItOS = new JTablePad();

	// *** Campos (Detalhe)

	private JTextFieldPad txtCodItRecMerc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodItOS = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtRefProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodFisc = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldFK txtDtFabricSerie = new JTextFieldFK( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldFK txtDtValidSerie = new JTextFieldFK( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtCodProdItOS = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtRefProdItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldFK txtDescProdItOS = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodFiscItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCLoteProdItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtSerieProdItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtCodUnidItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtCodLoteItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private JTextFieldPad txtNumSerieItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtCodFabProdItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodBarProdItOS = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodAlmoxProdItOS = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	// private JTextFieldPad txtStatus = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	private JCheckBoxPad cbGarantia = new JCheckBoxPad( "Sim", "S", "N" );

	private JTextAreaPad txaDescItRecMerc = new JTextAreaPad();

	private JTextAreaPad txaDefeitoItRecMerc = new JTextAreaPad();

	private JTextAreaPad txaServicoSolicItRecMerc = new JTextAreaPad();

	private JTextAreaPad txaCondicoesItRecMerc = new JTextAreaPad();

	private JTextAreaPad txaObsItOS = new JTextAreaPad();

	private JTextAreaPad txaObsItRecMerc = new JTextAreaPad();

	private JScrollPane spnDescItRecMerc = new JScrollPane( txaDescItRecMerc );

	private JScrollPane spnDefeitoItRecMerc = new JScrollPane( txaDefeitoItRecMerc );

	private JScrollPane spnServicoSolicItRecMerc = new JScrollPane( txaServicoSolicItRecMerc );

	private JScrollPane spnObsItRecMerc = new JScrollPane( txaObsItRecMerc );

	private JScrollPane spnCondicoesItRecMerc = new JScrollPane( txaCondicoesItRecMerc );

	private JScrollPane spSuplemento = new JScrollPane( tabItOS );

	private JScrollPane spnObsItOS = new JScrollPane( txaObsItOS );

	// *** Paineis

	private JPanelPad pinCab = new JPanelPad();

	private JPanelPad pnItemRecMerc = new JPanelPad();

	private JPanelPad pnItemOS = new JPanelPad();

	private JPanelPad pinDetGrid = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 2 ) );

	private JPanelPad pinRodapeDividido = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 2 ) );

	private JTabbedPanePad tpnItens = new JTabbedPanePad();

	private JTabbedPanePad tpnSuplemento = new JTabbedPanePad();

	private JPanelPad pinDescItRecMerc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinDefeitoItRecMerc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinObsItRecMerc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinCondicoesRecepcao = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinServicoSolicItRecMerc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pnRodapeSuplemento = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private JPanelPad pnAdicItOS = new JPanelPad();

	// *** Lista Campos

	private ListaCampos lcCli = new ListaCampos( this, "CL" );

	private ListaCampos lcProd = new ListaCampos( this, "PD" );

	private ListaCampos lcProd2 = new ListaCampos( this, "PD" );

	private ListaCampos lcProdItOS = new ListaCampos( this, "PD" );

	private ListaCampos lcProdItOS2 = new ListaCampos( this, "PD" );

	private ListaCampos lcItRecMercItOS = new ListaCampos( this );

	private ListaCampos lcAtendente = new ListaCampos( this, "AR" );

	private ListaCampos lcTipoRecMerc = new ListaCampos( this, "TR" );

	private ListaCampos lcProc = new ListaCampos( this, "TP" );

	private ListaCampos lcNumSerie = new ListaCampos( this, "NS" );

	// *** Bot�es

	private JButtonPad btChamado = new JButtonPad( Icone.novo( "btChamado.png" ) );

	private JButtonPad btAdicProdutoEstrutura = new JButtonPad( Icone.novo( "btEstProduto.gif" ) );
	
	private ImageIcon img_os_servico = Icone.novo( "os_servico_18x18.png" );
	
	private ImageIcon img_os_novo = Icone.novo( "os_novo_18x18.png" );
	
	private ImageIcon img_os_componente = Icone.novo( "os_componente_18x18.png" );
	
	private ImageIcon img_excecoes = Icone.novo( "os_excecao_18x18.png" );

	// *** Labels

	private JLabelPad lbStatus = new JLabelPad();

	private JLabelPad lbNumSerie = new JLabelPad();

	private JLabelPad lbDtFabricSerie = new JLabelPad();

	private JLabelPad lbDtValidSerie = new JLabelPad();
	
	private JLabelPad lbStatusItOS = new JLabelPad();

	private Navegador navItRecMercItOS = new Navegador( true );
	


	// ** Combobox

	private JComboBoxPad cbStatus = new JComboBoxPad( null, null, JComboBoxPad.TP_STRING, 2, 0 );

	// *** Tela do Painel de controle

	private FControleServicos tela_mae = null;

	public FOrdemServico() {

		super();

		nav.setNavigation( true );

		setTitulo( "Ordem de Servi�o" );

		setAtribos( 50, 50, 837, 480 );

		configuraCampos();
		montaListaCampos();

	}
	
	public FOrdemServico( boolean novo ) {

		this();
		this.novo = novo;

	}

	private void configuraCampos() {

		txtCodMunic.setAtivo( false );

		RecMerc.atualizaStatus( (String) RecMerc.STATUS_NAO_SALVO.getValue(), lbStatus );

		// Status da OS -- Implementar Futuramente.
		
		lbStatus.setText( "N�O SALVO" );
		lbStatus.setVisible( false );
		
		// Status do item de OS
		
		atualizaStatusItOS();
		
		btChamado.setEnabled( false );
		btAdicProdutoEstrutura.setEnabled( false );
		
	}
	
	
	private void atualizaStatusItOS() {
		
		StatusOS.atualizaStatusItOS( txtStatusItOS.getVlrString(), lbStatusItOS );

	}

	private void montaTela() {

		montaPaineis();

		montaCombos();

		montaCabecalho();

		montaDetalhe();

		adicListeners();

		montaDetalhedoDetalhe();

		montaTab();

		ajustaTabelaDetalhe();

		lcItRecMercItOS.montaTab();

		ajustaTabelaSuplemento();

		setImprimir( true );

	}
	
	private void montaPaineis() {

		pnMaster.remove( spTab );

		pnMaster.add( pinDetGrid, BorderLayout.CENTER );

		pinDescItRecMerc.add( spnDescItRecMerc );
		pinDefeitoItRecMerc.add( spnDefeitoItRecMerc );
		pinServicoSolicItRecMerc.add( spnServicoSolicItRecMerc );
		pinCondicoesRecepcao.add( spnCondicoesItRecMerc );
		pinObsItRecMerc.add( spnObsItRecMerc );

		tpnSuplemento.addTab( "Suplemento", spSuplemento );
		tpnSuplemento.addTab( "Observa��es", spnObsItOS );

		pinDetGrid.add( tpnItens );
		pinDetGrid.add( tpnSuplemento );

		tpnItens.addTab( "Itens", spTab );
		tpnItens.addTab( "Detalh.", pinDescItRecMerc );
		tpnItens.addTab( "Defeito", pinDefeitoItRecMerc );
		tpnItens.addTab( "Solicita��o", pinServicoSolicItRecMerc );
		tpnItens.addTab( "Condi��es", pinCondicoesRecepcao );
		tpnItens.addTab( "Obs.", pinObsItRecMerc );

		pnDet.add( pnItemRecMerc );
		pnDet.add( pnItemOS );

		pnGImp.setPreferredSize( new Dimension( 90, 26 ) );

		pnBordRod.removeAll();
		pnBordRod.add( pinRodapeDividido );

		pinRodapeDividido.add( pnRodape );
		pnRodape.remove( btSair );

		pnRodapeSuplemento.add( navItRecMercItOS, BorderLayout.WEST );
		pnRodapeSuplemento.add( pnAdicItOS, BorderLayout.CENTER );
		pnAdicItOS.setBorder( null );
		pnRodapeSuplemento.add( btSair, BorderLayout.EAST );

		pinRodapeDividido.add( pnRodapeSuplemento );

	}

	private void montaCabecalho() {

		setAltCab( 130 );

		setListaCampos( lcCampos );
		setPainel( pinCab, pnCliCab );

		adicCampo( txtTicket, 7, 20, 60, 20, "Ticket", "Ticket", ListaCampos.DB_PK, true );

		adicCampoInvisivel( txtCodTipoRecMerc, "CodTipoRecMerc", "C�d.T.", ListaCampos.DB_FK, true );

		adicCampo( txtCodCli, 70, 20, 60, 20, "CodCli", "C�d.Cli.", ListaCampos.DB_FK, txtRazCli, true );
		adicDescFK( txtRazCli, 133, 20, 180, 20, "RazCli", "Raz�o social do cliente" );
		adicCampo( txtSolicitante, 316, 20, 214, 20, "Solicitante", "Solicitante", ListaCampos.DB_SI, false );

		adicCampo( txtDtEnt, 532, 20, 70, 20, "DtEnt", "Dt.Entrada", ListaCampos.DB_SI, true );
		adicCampo( txtDtPrevRet, 605, 20, 70, 20, "DtPrevRet", "Dt.Prevista", ListaCampos.DB_SI, true );

		adicDB( cbStatus, 678, 20, 115, 20, "Status", "Status", false );

//		adic( lbStatus, 620, 20, 123, 60 );

		adicCampo( txtCodAtend, 7, 60, 60, 20, "CodAtendRec", "C�d.Atend.", ListaCampos.DB_FK, txtNomeAtend, false );
		adicDescFK( txtNomeAtend, 70, 60, 245, 20, "NomeAtend", "Nome do Atendente" );

		
		setListaCampos( true, "RECMERC", "EQ" );
		lcCampos.setQueryInsert( true );

	}

	private void montaCombos() {

		cbStatus.setItens( StatusOS.getLabels(), StatusOS.getValores() );

	}

	private boolean buscaGen() {

		return (Boolean) prefere.get( "buscacodprodgen" );
	}

	private void montaDetalhe() {

		setAltDet( 100 );

		setPainel( pnItemRecMerc );

		setListaCampos( lcDet );
		setNavegador( navRod );

		adicCampo( txtCodItRecMerc, 7, 20, 30, 20, "CodItRecMerc", "Seq.", ListaCampos.DB_PK, true );

		if ( comRef() ) {
			txtRefProd.setBuscaAdic( new DLBuscaProd( con, "REFPROD", lcProd2.getWhereAdic() ) );

			if ( buscaGen() ) {
				txtRefProd.setBuscaGenProd( new DLCodProd( Aplicativo.getInstace().getConexao(), null, null ) );
			}

			adicCampoInvisivel( txtCodProd, "CodProd", "C�d.Pd.", ListaCampos.DB_FK, txtDescProd, false );
			adicCampoInvisivel( txtRefProd, "RefProd", "Ref.", ListaCampos.DB_FK, false );

			adic( new JLabelPad( "Refer�ncia" ), 40, 0, 70, 20 );
			adic( txtRefProd, 40, 20, 70, 20 );
			txtRefProd.setFK( true );

		}
		else {

			txtCodProd.setBuscaAdic( new DLBuscaProd( con, "CODPROD", lcProd.getWhereAdic() ) );

			if ( buscaGen() ) {
				txtCodProd.setBuscaGenProd( new DLCodProd( con, null, null ) );
			}

			adicCampo( txtCodProd, 40, 20, 70, 20, "CodProd", "C�d.Pd.", ListaCampos.DB_FK, txtDescProd, false );
			adicCampoInvisivel( txtRefProd, "RefProd", "Ref.", ListaCampos.DB_FK, false );

		}

		adicDescFK( txtDescProd, 113, 20, 270, 20, "DescProd", "Descri��o do Produto" );

		adicCampo( txtQtdItOS, 7, 60, 45, 20, "QtdItRecMerc", "Qtd.", ListaCampos.DB_SI, true );

		// txtQtdItOS.setBuscaAdic( new DLBuscaSerie( lcDet, lcNumSerie, lcProd, con, "qtditrecmerc", true ) );

		lbNumSerie = adicCampo( txtNumSerie, 55, 60, 103, 20, "NumSerie", "N�mero de s�rie", ListaCampos.DB_FK, txtObsSerie, false );
		lbDtFabricSerie = adicDescFK( txtDtFabricSerie, 161, 60, 80, 20, "DtFabricSerie", "Fabrica��o" );
		lbDtValidSerie = adicDescFK( txtDtValidSerie, 244, 60, 80, 20, "DtFabricSerie", " Validade" );

		lbNumSerie.setVisible( false );
		lbDtFabricSerie.setVisible( false );
		lbDtValidSerie.setVisible( false );

		txtNumSerie.setVisible( false );
		txtDtFabricSerie.setVisible( false );
		txtDtValidSerie.setVisible( false );

		adicCampoInvisivel( txtCodProcRecMerc, "CodProcRecMerc", "Cod.Proc.", ListaCampos.DB_FK, txtDescProcRecMerc, true );
		adicDescFKInvisivel( txtDescProcRecMerc, "DescProcRecMerc", "Descri��o do processo" );
		adicCampoInvisivel( txtCodTipoRecMercDet, "CodTipoRecMerc", "Cod.Tp.Rec.Merc", ListaCampos.DB_SI, true );

		adicDB( cbGarantia, 330, 60, 80, 20, "garantia", "Garantia", false );

		txtStatusItRecMerc.setSoLeitura( true );

		adicCampoInvisivel( txtStatusItRecMerc, "StatusItRecMerc", "Status", ListaCampos.DB_SI, false );

		adicDBLiv( txaDescItRecMerc, "DescItRecMerc", "Descri��o detalhada", false );

		adicDBLiv( txaDefeitoItRecMerc, "DefeitoItRecMerc", "Defeito informado", false );

		adicDBLiv( txaCondicoesItRecMerc, "CondicoesItRecMerc", "Condi��es no recebimento", false );

		adicDBLiv( txaServicoSolicItRecMerc, "ServicoSolicItRecMerc", "Servi�os solicitados", false );

		adicDBLiv( txaObsItRecMerc, "ObsItRecMerc", "Servi�os solicitados", false );

		setListaCampos( true, "ITRECMERC", "EQ" );

		lcDet.setQueryInsert( true );

	}

	private void montaDetalhedoDetalhe() {

		setPainel( pnItemOS );

		setListaCampos( lcItRecMercItOS );

		setNavegador( navItRecMercItOS );

		adicCampo( txtCodItOS, 7, 20, 30, 20, "CodItOS", "Seq.", ListaCampos.DB_PK, true );

		if ( comRef() ) {

			adicCampo( txtRefProdItOS, 40, 20, 70, 20, "RefProdPD", "Refer�ncia", ListaCampos.DB_FK, txtDescProdItOS, true );

			txtRefProdItOS.setBuscaAdic( new DLBuscaProd( con, "REFPROD", lcProd2.getWhereAdic() ) );

			if ( buscaGen() ) {
				txtRefProdItOS.setBuscaGenProd( new DLCodProd( Aplicativo.getInstace().getConexao(), null, null ) );
			}

			adicCampoInvisivel( txtCodProdItOS, "CodProdpd", "C�digo", ListaCampos.DB_SI, false );

		}
		else {

			adicCampo( txtCodProdItOS, 40, 20, 70, 20, "CodProdPD", "Cod.Pd.", ListaCampos.DB_FK, txtDescProdItOS, true );
			adicCampoInvisivel( txtRefProdItOS, "RefProdPD", "Refer�ncia", ListaCampos.DB_SI, false );

		}

		adicDescFK( txtDescProdItOS, 113, 20, 270, 20, "DescProd", "Descri��o do Produto" );

		adicCampoInvisivel( txtRefProdItOS, "RefProdPD", "Ref.", ListaCampos.DB_FK, false );
		
		adicCampo( txtQtdItOSItOS, 7, 60, 45, 20, "QtdItOS", "Qtd.", ListaCampos.DB_SI, true );

		adicDBLiv( txaObsItOS, "ObsItOS", "Observa��es", false );

		adicCampoInvisivel( txtStatusItOS, "StatusItOS", "Status", ListaCampos.DB_SI, false );
		
		adicCampoInvisivel( txtGeraChamado, "GeraChamado", "Gera chamado", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtGeraRMA, "GeraRma", "Gera RMA", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtGeraNovo, "GeraNovo", "Gera novo", ListaCampos.DB_SI, false );
		
		pnAdicItOS.adic( btChamado, 0, 0, 30, 26 );
		pnAdicItOS.adic( btAdicProdutoEstrutura, 30, 0, 30, 26 );
		
		adic( lbStatusItOS, 280, 55, 100, 30 );
		
		setListaCampos( true, "ITRECMERCITOS", "EQ" );

		txtCodProdItOS.setNomeCampo( "CodProd" );

		txtRefProdItOS.setNomeCampo( "refprod" );

		lcItRecMercItOS.setQueryInsert( false );
		lcItRecMercItOS.setQueryCommit( false );

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

			sql.append( "select pf1.usarefprod, coalesce(pf8.codtiporecmercos,0) codtiporecmerc, buscacodprodgen " );
			sql.append( "from sgprefere1 pf1 left outer join sgprefere8 pf8 " );
			sql.append( "on pf8.codemp=pf1.codemp and pf8.codfilial=pf1.codfilial " );
			sql.append( "where pf1.codemp=? and pf1.codfilial=? " );

			ps = Aplicativo.getInstace().getConexao().prepareStatement( sql.toString() );

			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );

			rs = ps.executeQuery();

			if ( rs.next() ) {
				prefere.put( "codtiporecmerc", rs.getInt( "codtiporecmerc" ) );
				prefere.put( "usarefprod", new Boolean( "S".equals( rs.getString( "usarefprod" ) ) ) );
				prefere.put( "buscacodprodgen", new Boolean( "S".equals( rs.getString( "buscacodprodgen" ) ) ) );
			}

			Aplicativo.getInstace().getConexao().commit();

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	private void ajustaTabelaDetalhe() {

		tab.setRowHeight( 21 );

		tab.setTamColuna( 30, 0 );
		tab.setTamColuna( 40, 1 );
		tab.setTamColuna( 210, 2 );
		tab.setTamColuna( 50, 4 );
		tab.setTamColuna( 50, 9 );

		tab.setColunaInvisivel( 3 );
		tab.setColunaInvisivel( 5 );
		tab.setColunaInvisivel( 6 );
		tab.setColunaInvisivel( 7 );
		tab.setColunaInvisivel( 8 );
		tab.setColunaInvisivel( 10 );
		tab.setColunaInvisivel( 11 );
		tab.setColunaInvisivel( 12 );
		tab.setColunaInvisivel( 13 );
		tab.setColunaInvisivel( 14 );
	//	tab.setColunaInvisivel( 15 );

	}

	private void ajustaTabelaSuplemento() {

		// Tabela de Suplementos

		tabItOS.setRowHeight( 24 );

		tabItOS.adicColuna( "" );
		
		tabItOS.setTamColuna( 20, 0 );
		tabItOS.setTamColuna( 70, 1 );
		tabItOS.setTamColuna( 200, 2 );
		tabItOS.setColunaInvisivel( 3 );
		tabItOS.setColunaInvisivel( 4 );
		tabItOS.setTamColuna( 50, 5 );
		tabItOS.setColunaInvisivel( 6 );
		tabItOS.setTamColuna( 35, 7 );
		tabItOS.setColunaInvisivel( 8 );
		tabItOS.setColunaInvisivel( 9 );
		tabItOS.setColunaInvisivel( 10 );
		tabItOS.setTamColuna( 25, 11 );

	}
	
	private void reprocessaTabItOs() {
		
		try {
			
			for(int i = 0; i < tabItOS.getNumLinhas(); i++) {
			
				boolean gerachamado = "S".equals( (String)tabItOS.getValor( i, 8 ));
				boolean gerarma = "S".equals( (String)tabItOS.getValor( i, 9 ));
				boolean geranovo = "S".equals( (String)tabItOS.getValor( i, 10 ));
				
				if(gerachamado) {
					tabItOS.setValor( img_os_servico, i, 11 );
				}
				else if(gerarma) {
					tabItOS.setValor( img_os_componente, i, 11 );					
				}
				else if(geranovo) {
					tabItOS.setValor( img_os_novo, i, 11 );	
				}
				else {
					tabItOS.setValor( img_excecoes, i, 11 );
				}
				
			}
			
		}
		catch (Exception e) {
			
		}
	}
	

	private void adicListeners() {

		lcCampos.addInsertListener( this );
		lcCampos.addCarregaListener( this );
		lcCampos.addPostListener( this );
		lcDet.addPostListener( this );
		lcDet.addInsertListener( this );
		lcCli.addCarregaListener( this );
		lcDet.addCarregaListener( this );
		lcNumSerie.addCarregaListener( this );
		lcProd.addCarregaListener( this );
		lcProd2.addCarregaListener( this );
		lcProdItOS.addCarregaListener( this );
		lcProdItOS2.addCarregaListener( this );

		lcItRecMercItOS.addCarregaListener( this );

		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );
		btChamado.addActionListener( this );
		btAdicProdutoEstrutura.addActionListener( this );
		txtNumSerie.addFocusListener( this );
		txtQtdItOS.addFocusListener( this );
		txtDocRecMerc.addKeyListener( this );
		txtQtdItOS.addKeyListener( this );
		txtNumSerie.addKeyListener( this );

		lcItRecMercItOS.addPostListener( this );


		cbStatus.addComboBoxListener( this );
	}

	private void montaListaCampos() {

		lcItRecMercItOS.setMaster( lcDet );
		lcDet.adicDetalhe( lcItRecMercItOS );
		lcItRecMercItOS.setTabela( tabItOS );

		// * Tipo de Recebimento Cabe�alho

		lcTipoRecMerc.add( new GuardaCampo( txtCodTipoRecMerc, "CodTipoRecMerc", "C�d.Tipo.Rec.", ListaCampos.DB_PK, false ) );

		txtCodTipoRecMerc.setTabelaExterna( lcTipoRecMerc, FTipoRecMerc.class.getCanonicalName() );
		txtCodTipoRecMerc.setNomeCampo( "CodTipoRecMerc" );
		txtCodTipoRecMerc.setFK( true );

		lcTipoRecMerc.setReadOnly( true );
		lcTipoRecMerc.montaSql( false, "TIPORECMERC", "EQ" );

		// * Cliente

		lcCli.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.Cli.", ListaCampos.DB_PK, false ) );
		lcCli.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtContCli, "ContCli", "Contato", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtCNPJCli, "CnpjCli", "CNPJ", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtCodPais, "CodPais", "C�d.Pa�s", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtSiglaUF, "SiglaUF", "UF", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtCodMunic, "CodMunic", "C�d.Mun.", ListaCampos.DB_SI, false ) );
		lcCli.add( new GuardaCampo( txtEmailCli, "EmailCli", "Email do cliente.", ListaCampos.DB_SI, false ) );

		txtCodCli.setTabelaExterna( lcCli, FCliente.class.getCanonicalName() );
		txtCodCli.setNomeCampo( "CodCli" );
		txtCodCli.setFK( true );

		lcCli.setReadOnly( true );
		lcCli.montaSql( false, "CLIENTE", "VD" );

		// * Produto (Detalhe)

		lcProd.add( new GuardaCampo( txtCodProd, "codprod", "C�d.Prod.", ListaCampos.DB_PK, true ) );
		lcProd.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_SI, false ) );

		lcProd.add( new GuardaCampo( txtCodFabProd, "CodFabProd", "Cod.Fabricante", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCodBarProd, "CodBarProd", "Cod.Barra", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCodFisc, "CodFisc", "Cod.Fiscal", ListaCampos.DB_SI, false ) );

		lcProd.add( new GuardaCampo( txtCodUnid, "CodUnid", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCodAlmoxProd, "CodAlmox", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtCLoteProd, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtSerieProd, "SerieProd", "C/S�rie", ListaCampos.DB_SI, false ) );
		
		lcProd.add( new GuardaCampo( txtTipoProd, "TipoProd", "Tipo.Prod.", ListaCampos.DB_SI, false ) );

		txtCodUnid.setAtivo( false );
		lcProd.setWhereAdic( "ATIVOPROD='S'" );
		lcProd.montaSql( false, "PRODUTO", "EQ" );
		lcProd.setQueryCommit( false );
		lcProd.setReadOnly( true );
		txtCodProd.setTabelaExterna( lcProd, FProduto.class.getCanonicalName() );

		// * Produto referencia

		lcProd2.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_PK, true ) );
		lcProd2.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCodProd, "codprod", "C�d.prod.", ListaCampos.DB_SI, false ) );

		lcProd2.add( new GuardaCampo( txtCodFabProd, "CodFabProd", "Cod.Fabricante", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCodBarProd, "CodBarProd", "Cod.Barras", ListaCampos.DB_SI, false ) );

		lcProd2.add( new GuardaCampo( txtCodUnid, "CodUnid", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCodAlmoxProd, "CodAlmox", "Unidade", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtCLoteProd, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false ) );
		lcProd2.add( new GuardaCampo( txtSerieProd, "SerieProd", "C/S�rie", ListaCampos.DB_SI, false ) );

		lcProd2.add( new GuardaCampo( txtTipoProd, "TipoProd", "Tipo.Prod.", ListaCampos.DB_SI, false ) );
		
		txtRefProd.setNomeCampo( "RefProd" );
		txtRefProd.setListaCampos( lcDet );
		lcProd2.setWhereAdic( "ATIVOPROD='S'" );
		lcProd2.montaSql( false, "PRODUTO", "EQ" );
		lcProd2.setQueryCommit( false );
		lcProd2.setReadOnly( true );
		txtRefProd.setTabelaExterna( lcProd2, FProduto.class.getCanonicalName() );

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
		txtNumSerie.setTabelaExterna( lcNumSerie, FSerie.class.getCanonicalName() );
		txtObsSerie.setListaCampos( lcNumSerie );
		txtObsSerie.setNomeCampo( "ObsSerie" );
		txtObsSerie.setLabel( "Observa��es" );

		// FK Atendente
		lcAtendente.add( new GuardaCampo( txtCodAtend, "CodAtend", "C�d.Atend.", ListaCampos.DB_PK, false ) );
		lcAtendente.add( new GuardaCampo( txtNomeAtend, "NomeAtend", "Nome do atendente", ListaCampos.DB_SI, false ) );
		lcAtendente.montaSql( false, "ATENDENTE", "AT" );
		lcAtendente.setQueryCommit( false );
		lcAtendente.setReadOnly( true );
		txtCodAtend.setTabelaExterna( lcAtendente, FAtendente.class.getCanonicalName() );

		/***************
		 * PROCESSOS *
		 ***************/

		lcProc.add( new GuardaCampo( txtCodProcRecMerc, "CodProcRecMerc", "C�d.Proc.", ListaCampos.DB_PK, false ) );
		lcProc.add( new GuardaCampo( txtDescProcRecMerc, "DescProcRecMerc", "Descri��o do processo", ListaCampos.DB_SI, false ) );
		lcProc.add( new GuardaCampo( txtCodTipoRecMercDet, "CodTipoRecMerc", "Cod.Tp.Rec.Merc.", ListaCampos.DB_PF, false ) );
		lcProc.add( new GuardaCampo( txtTipoProcRecMerc, "TipoProcRecMerc", "Tp.Proc.Rec.Merc.", ListaCampos.DB_SI, false ) );

		txtCodProcRecMerc.setTabelaExterna( lcProc, null );
		txtCodProcRecMerc.setNomeCampo( "CodProcRecMerc" );
		txtCodProcRecMerc.setFK( true );

		lcProc.setReadOnly( true );
		lcProc.montaSql( false, "PROCRECMERC", "EQ" );

		// * Produto/Servico ITOS

		lcProdItOS.add( new GuardaCampo( txtCodProdItOS, "codprod", "C�d.Prod.", ListaCampos.DB_PK, true ) );
		lcProdItOS.add( new GuardaCampo( txtDescProdItOS, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtRefProdItOS, "RefProd", "Refer�ncia", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtCodTpChamado, "CodTpChamado", "Cod.Tp.Chamado", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtQtdHorasServ, "QtdHorasServ", "Qtd.Horas Serv.", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtTipoProdItOS, "TipoProd", "Tipo.Prod.", ListaCampos.DB_SI, false ) );
		
		lcProdItOS.add( new GuardaCampo( txtCodFabProdItOS, "CodFabProd", "Cod.Fabricante", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtCodBarProdItOS, "CodBarProd", "Cod.Barra", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtCodFiscItOS, "CodFisc", "Cod.Fiscal", ListaCampos.DB_SI, false ) );
		
		lcProdItOS.add( new GuardaCampo( txtCodUnidItOS, "CodUnid", "Unidade", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtCodAlmoxProdItOS, "CodAlmox", "Unidade", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtCLoteProdItOS, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false ) );
		lcProdItOS.add( new GuardaCampo( txtSerieProdItOS, "SerieProd", "C/S�rie", ListaCampos.DB_SI, false ) );

		lcProdItOS.setWhereAdic( "ATIVOPROD='S'" );
		lcProdItOS.montaSql( false, "PRODUTO", "EQ" );
		lcProdItOS.setQueryCommit( false );
		lcProdItOS.setReadOnly( true );
		txtCodProdItOS.setTabelaExterna( lcProdItOS, FProduto.class.getCanonicalName() );

		// * Produto referencia

		lcProdItOS2.add( new GuardaCampo( txtRefProdItOS, "RefProd", "Refer�ncia", ListaCampos.DB_PK, true ) );
		lcProdItOS2.add( new GuardaCampo( txtDescProdItOS, "DescProd", "Descri��o", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtCodProdItOS, "codprod", "C�d.prod.", ListaCampos.DB_SI, false ) );

		lcProdItOS2.add( new GuardaCampo( txtCodTpChamado, "CodTpChamado", "Cod.Tp.Chamado", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtQtdHorasServ, "QtdHorasServ", "Qtd.Horas Serv.", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtTipoProdItOS, "TipoProd", "Tipo.Prod.", ListaCampos.DB_SI, false ) );
		
		lcProdItOS2.add( new GuardaCampo( txtCodFabProdItOS, "CodFabProd", "Cod.Fabricante", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtCodBarProdItOS, "CodBarProd", "Cod.Barras", ListaCampos.DB_SI, false ) );

		lcProdItOS2.add( new GuardaCampo( txtCodUnidItOS, "CodUnid", "Unidade", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtCodAlmoxProdItOS, "CodAlmox", "Unidade", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtCLoteProdItOS, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false ) );
		lcProdItOS2.add( new GuardaCampo( txtSerieProdItOS, "SerieProd", "C/S�rie", ListaCampos.DB_SI, false ) );

		txtRefProdItOS.setNomeCampo( "RefProd" );
		txtRefProdItOS.setListaCampos( lcItRecMercItOS );
		lcProdItOS2.setWhereAdic( "ATIVOPROD='S'" );
		lcProdItOS2.montaSql( false, "PRODUTO", "EQ" );
		lcProdItOS2.setQueryCommit( false );
		lcProdItOS2.setReadOnly( true );
		txtRefProdItOS.setTabelaExterna( lcProdItOS2, FProduto.class.getCanonicalName() );

	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp ) {
			imprimir( true );
		}
		else if ( evt.getSource() == btImp ) {
			imprimir( false );
		}
		else if ( evt.getSource() == btChamado ) {
			novoChamado();
		}
		else if ( evt.getSource() == btAdicProdutoEstrutura ) {
			buscaEstrutura();
		}


		super.actionPerformed( evt );

	}

	private void buscaEstrutura() {
		
		try {
		
			DLItensEstruturaProd dl = new DLItensEstruturaProd();
			
			dl.setCodemp( Aplicativo.iCodEmp );
			dl.setCodemppd( Aplicativo.iCodEmp );
			
			dl.setCodfilial( ListaCampos.getMasterFilial( "EQPRODUTO" ) );			
			dl.setCodfilialpd( ListaCampos.getMasterFilial( "EQPRODUTO" ) );
			
			dl.setCodprod( txtCodProd.getVlrInteger() );
			dl.carregaItens();
			
			dl.setVisible( true );
			
			
			if ( dl.OK ) {
				
				Vector<HashMap<String,Object>> valores = dl.getValores();
				HashMap<String,Object> item = new HashMap<String, Object>();
				
				Integer codprod = null;
				String refprod = null;
				BigDecimal qtditest = null;
				
				for(int i=0; i< valores.size(); i++) {
					
					item = valores.elementAt( i );
					
					codprod = (Integer) item.get( DLItensEstruturaProd.ITENS.CODPRODPD.name() );
					refprod = (String) item.get( DLItensEstruturaProd.ITENS.REFPRODPD.name() );
					qtditest = (BigDecimal) item.get( DLItensEstruturaProd.ITENS.QTDITEST.name() );
					
					lcItRecMercItOS.insert( true );
					
					txtCodProdItOS.setVlrInteger( codprod );
					txtRefProdItOS.setVlrString( refprod );
					
					if(comRef()) {

						lcProdItOS2.carregaDados();
						
					}
					else {
						
						lcProdItOS.carregaDados();
						
					}
					
					txtQtdItOSItOS.setVlrBigDecimal( qtditest );
					
					lcItRecMercItOS.post();
					
				}
			}
			dl.dispose();

			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void imprimiGrafico( final ResultSet rs, final boolean bVisualizar ) {

		FPrinterJob dlGr = null;
		HashMap<String, Object> hParam = new HashMap<String, Object>();

		hParam.put( "CODEMP", Aplicativo.iCodEmp );
		hParam.put( "CODFILIAL", ListaCampos.getMasterFilial( "EQRECMERC" ) );
		hParam.put( "RAZAOEMP", Aplicativo.empresa.toString() );
		hParam.put( "TICKET", txtTicket.getVlrInteger() );
		hParam.put( "SUBREPORT_DIR", "org/freedom/layout/os/" );
		hParam.put( "CONEXAO", con.getConnection() );

		EmailBean email = Aplicativo.getEmailBean();
		email.setPara( txtEmailCli.getVlrString() );

		dlGr = new FPrinterJob( "layout/os/OS_PD.jasper", "Ordem de Servi�o", "", rs, hParam, this, email );

		if ( bVisualizar ) {
			dlGr.setVisible( true );
		}
		else {
			try {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			} catch ( Exception err ) {
				Funcoes.mensagemErro( this, "Erro na impress�o de relat�rio coleta!" + err.getMessage(), true, con, err );
			}
		}
	}

	private void imprimir( boolean bVisualizar ) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();

		sql.append( "select " );
		sql.append( "it.codemp, it.codfilial, it.coditrecmerc, se.codsecao, se.descsecao, rm.dtent, rm.hins, rm.dtprevret, it.qtditrecmerc, pd.codprod, pd.refprod, " );
		sql.append( "pd.descprod, rm.ticket, cl.codcli, cl.razcli, rm.docrecmerc, vd.nomevend, mn.nomemunic, " );

		sql.append( "cl.cnpjcli, cl.rgcli, cl.endcli, cl.numcli, cl.baircli, " );
		sql.append( "ae.nomeatend, it.defeitoitrecmerc, it.servicosolicitrecmerc, it.condicoesitrecmerc, it.obsitrecmerc, " );
		sql.append( "it.numserie, it.garantia, it.statusitrecmerc " );

		sql.append( "from " );
		sql.append( "eqrecmerc rm " );
		sql.append( "left outer join vdcliente cl on " );
		sql.append( "cl.codemp=rm.codempcl and cl.codfilial=rm.codfilialcl and cl.codcli=rm.codcli " );

		sql.append( "left outer join atatendente ae on " );

		sql.append( "ae.codemp=rm.codempar and ae.codfilial=rm.codfilialar and ae.codatend=rm.codatendrec " );

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

			System.out.println( "SQL:" + sql.toString() );

			ps = con.prepareStatement( sql.toString() );

			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "EQRECMERC" ) );
			ps.setInt( 3, txtTicket.getVlrInteger() );

			System.out.println( sql.toString() );

			rs = ps.executeQuery();

		} catch ( SQLException err ) {

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
		lcCli.setConexao( cn );
		lcAtendente.setConexao( cn );
		lcTipoRecMerc.setConexao( cn );
		lcProc.setConexao( cn );
		lcProdItOS.setConexao( cn );
		lcProdItOS2.setConexao( cn );
		lcItRecMercItOS.setConexao( cn );

		getPreferencias();

		montaTela();

		lcCampos.insert( true );

	}

	private boolean comRef() {

		return ( (Boolean) prefere.get( "usarefprod" ) ).booleanValue();
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
			// RecMerc.atualizaStatus( txtStatus.getVlrString(), lbStatus );
		}
		else if ( cevt.getListaCampos() == lcProd || cevt.getListaCampos() == lcProd2 ) {

			if ( "S".equals( txtSerieProd.getVlrString() ) ) {

				lbNumSerie.setVisible( true );
				txtNumSerie.setVisible( true );

				lbDtFabricSerie.setVisible( true );
				txtDtFabricSerie.setVisible( true );

				lbDtValidSerie.setVisible( true );
				txtDtValidSerie.setVisible( true );
 
				habilitaSerie();

			}
			else {

				lbNumSerie.setVisible( false );
				txtNumSerie.setVisible( false );

				lbDtFabricSerie.setVisible( false );
				txtDtFabricSerie.setVisible( false );

				lbDtValidSerie.setVisible( false );
				txtDtValidSerie.setVisible( false );

			}
			
			btAdicProdutoEstrutura.setEnabled( "F".equals(txtTipoProd.getVlrString()) );
			
		}
		else if ( cevt.getListaCampos() == lcDet ) {
			// lcItRecMercItOS.carregaItens();
		}
		else if ( cevt.getListaCampos() == lcNumSerie && lcDet.getStatus() == ListaCampos.LCS_INSERT ) {
			verificaGarantia();
		}
		if ( cevt.getListaCampos() == lcCli && lcCampos.getStatus() == ListaCampos.LCS_INSERT ) {

			txtSolicitante.setVlrString( txtContCli.getVlrString() );

		}
		else if ( cevt.getListaCampos() == lcItRecMercItOS ) {
			atualizaStatusItOS();
			reprocessaTabItOs();
		}
		else if ( cevt.getListaCampos() == lcProdItOS || cevt.getListaCampos() == lcProdItOS2 ) {
			// Ser for um servi�o deve ativar o bot�o de chamados
			btChamado.setEnabled( "S".equals(txtTipoProdItOS.getVlrString()) );
		}

	}

	private void habilitaSerie() {

		if ( "S".equals( txtSerieProd.getVlrString() ) && txtQtdItOS.getVlrBigDecimal().compareTo( new BigDecimal( 1 ) ) == 0 ) {

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
		if ( txtNumSerie.isEditable() ) {

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

			} catch ( SQLException err ) {
				Funcoes.mensagemErro( this, "Erro ao consultar a tabela EQSERIE!\n" + err.getMessage(), true, con, err );
			}
			if ( !bValido ) {

				DLSerie dl = new DLSerie( this, txtNumSerie.getVlrString(), txtCodProd.getVlrInteger(), txtDescProd.getVlrString() );

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

			// abreDlSerieMuitiplos();

		}

		return bRetorno;
	}

	private void abreDlSerieMuitiplos() {

		DLSerieGrid dl = new DLSerieGrid();
		dl.setCodemp( lcDet.getCodEmp() );
		dl.setCodfilial( lcDet.getCodFilial() );
		dl.setCod( txtTicket.getVlrInteger() );
		dl.setCodit( txtCodItRecMerc.getVlrInteger() );
		dl.setCodemppd( lcProd.getCodEmp() );
		dl.setCodfilialpd( lcProd.getCodFilial() );
		dl.setCodprod( txtCodProd.getVlrInteger() );
		dl.setDescprod( txtDescProd.getVlrString().trim() );

		dl.setConexao( con );
		dl.setVisible( true );
		HashMap<String, Integer> retorno = null;

		if ( dl.OK ) {

		}
		else {
		}

		dl.dispose();
	}

	public void beforeCarrega( CarregaEvent cevt ) {

	}

	public void beforePost( PostEvent pevt ) {

		if ( pevt.getListaCampos() == lcCampos ) {

			carregaTipoRec();

			if ( pevt.getEstado() == ListaCampos.LCS_INSERT ) {
				novo = true;
			}

		}
		else if ( pevt.getListaCampos() == lcDet ) {
			txtCodTipoRecMercDet.setVlrInteger( txtCodTipoRecMerc.getVlrInteger() );
			txtCodProcRecMerc.setVlrInteger( 1 );

			if ( txtSerieProd.getVlrString().equals( "S" ) && txtQtdItOS.getVlrBigDecimal().floatValue() == 1 ) {
				if ( !testaNumSerie() ) {
					pevt.cancela();
				}
			}

		}
		else if ( pevt.getListaCampos() == lcItRecMercItOS ) {
			if(txtStatusItOS.getVlrString()==null || StatusOS.IT_OS_NAO_SALVO.getValue().equals( txtStatusItOS.getVlrString() )) {
				txtStatusItOS.setVlrString( StatusOS.IT_OS_PENDENTE.getValue().toString() );
			}
			if( "S".equals(txtTipoProdItOS.getVlrString()) ) {
				txtGeraChamado.setVlrString( "S" );
			}
		}
	}

	private void verificaGarantia() {

		cbGarantia.setVlrString( NumSerie.isGarantia( txtDtEnt.getVlrDate(), txtDtValidSerie.getVlrDate() ) ? "S" : "N" );
	}

	public void afterPost( PostEvent pevt ) {

		if ( pevt.getListaCampos() == lcCampos ) {
			if ( novo ) {
				lcDet.insert( true );
				novo = false;
				if ( comRef() ) {
					txtRefProd.requestFocus();
				}
				else {
					txtCodProd.requestFocus();
				}
			}
		}
		if ( pevt.getListaCampos() == lcDet ) {
			if ( txtSerieProd.getVlrString().equals( "S" ) && txtQtdItOS.getVlrBigDecimal().floatValue() > 1 ) {
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
			}
			else if ( kevt.getSource() == txtQtdItOS && "N".equals( txtSerieProd.getVlrString() ) || ( kevt.getSource() == txtNumSerie && txtQtdItOS.getVlrBigDecimal().floatValue() == 1 ) ) {

				postaItOS();

			}

		}

	}

	private void postaItOS() {

		lcDet.post();

		lcDet.limpaCampos( true );

		lcDet.setState( ListaCampos.LCS_NONE );

		if ( comRef() ) {
			txtRefProd.requestFocus();
		}
		else {
			txtCodProd.requestFocus();
		}

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

	public void setTelaMae( FControleServicos tela_mae ) {

		this.tela_mae = tela_mae;
	}

	public void exec( int ticket, int tiporecmerc, FControleServicos tela_mae ) {

		try {

			lcCampos.edit();
			txtTicket.setVlrInteger( ticket );
			txtCodTipoRecMerc.setVlrInteger( tiporecmerc );
			lcCampos.carregaDados();

			setTelaMae( tela_mae );

		} catch ( Exception e ) {
			e.printStackTrace();
		}

	}

	private void salvaItOS( boolean ehproduto ) {

		StringBuilder sql = new StringBuilder();
		PreparedStatement ps = null;
		Integer coditos = 0;
		ResultSet rs = null;

		try {

			sql.append( "select coalesce( max(coditos), 0 ) " );
			sql.append( "from eqitrecmercitos " );
			sql.append( "where " );
			sql.append( "codemp=? and codfilial=? and ticket=? and coditrecmerc=? " );

			ps = con.prepareStatement( sql.toString() );

			ps.setInt( 1, lcDet.getCodEmp() );
			ps.setInt( 2, lcDet.getCodFilial() );
			ps.setInt( 3, txtTicket.getVlrInteger() );
			ps.setInt( 4, txtCodItRecMerc.getVlrInteger() );

			rs = ps.executeQuery();

			if ( rs.next() ) {
				coditos = rs.getInt( 1 );
			}

			coditos++;

			sql = new StringBuilder();

			sql.append( "insert into eqitrecmercitos " );
			sql.append( "(codemp,codfilial,ticket,coditrecmerc,coditos,qtditos,codemppd,codfilialpd,codprod, obsitos)" );
			sql.append( "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" );

			ps = con.prepareStatement( sql.toString() );

			Integer coditrecmerc = txtCodItRecMerc.getVlrInteger();

			ps.setInt( 1, lcDet.getCodEmp() );
			ps.setInt( 2, lcDet.getCodFilial() );
			ps.setInt( 3, txtTicket.getVlrInteger() );
			ps.setInt( 4, coditrecmerc );
			ps.setInt( 5, coditos );

			ps.setBigDecimal( 6, txtQtdItOS.getVlrBigDecimal() );
			ps.setInt( 7, Aplicativo.iCodEmp );
			ps.setInt( 8, ListaCampos.getMasterFilial( "EQPRODUTO" ) );

			ps.execute();
			con.commit();

			lcDet.edit();
			lcDet.post();

			txtCodItRecMerc.setVlrInteger( coditrecmerc );
			lcDet.carregaDados();

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	private Integer buscaChamado() {
		StringBuilder sql = new StringBuilder();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Integer ret = null;
		
		try {
			
			sql.append( "select codchamado from crchamado cr where " );
			sql.append( "cr.codempos=? and cr.codfilialos=? and cr.ticket=? and cr.coditrecmerc=? and cr.coditos=? " );
			
			ps = con.prepareStatement( sql.toString() );
			
			ps.setInt( 1, lcItRecMercItOS.getCodEmp() );
			ps.setInt( 2, lcItRecMercItOS.getCodFilial() );
			ps.setInt( 3, txtTicket.getVlrInteger() );
			ps.setInt( 4, txtCodItRecMerc.getVlrInteger() );
			ps.setInt( 5, txtCodItOS.getVlrInteger() );
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				ret = rs.getInt( "codchamado" );
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	private void novoChamado() {
		try {
			
			FChamado chamado = null;
			Integer codchamado = null;

			if ( Aplicativo.telaPrincipal.temTela( FChamado.class.getName() ) ) {
				chamado = (FChamado) Aplicativo.telaPrincipal.getTela( FChamado.class.getName() );
			}
			else {
				chamado = new FChamado();
				Aplicativo.telaPrincipal.criatela( "Chamado", chamado, con );
			}

			chamado.setTelaAnterior( this );
			
			codchamado = buscaChamado();
			
			//Se n�o h� chamado para o �tem deve criar um novo
			if(codchamado==null) {
			
				chamado.novo();
				
				chamado.setCodCli( txtCodCli.getVlrInteger() );
				chamado.setDescChamado( txtDescProdItOS.getVlrString() );
				chamado.setDetChamado( txaObsItOS.getVlrString() );
				chamado.setSolicitante( txtSolicitante.getVlrString() );
				chamado.setCodAtend( txtCodAtend.getVlrInteger() );
				chamado.setPrioridade( (Integer) Prioridade.MEDIA.getValue() );
				chamado.setCodTpChamado( txtCodTpChamado.getVlrInteger() );
				chamado.setDtChamado( txtDtEnt.getVlrDate() );
				chamado.setDtPrevisao( txtDtPrevRet.getVlrDate() );
				chamado.setQtdHorasPrevisao( txtQtdHorasServ.getVlrBigDecimal() );
				
				chamado.setItOS( txtTicket.getVlrInteger(), txtCodItRecMerc.getVlrInteger(), txtCodItOS.getVlrInteger() );
			}
			// Do contr�rio deve abrir o existente.
			else {
				
				chamado.exec( codchamado );
				
			}
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	

}


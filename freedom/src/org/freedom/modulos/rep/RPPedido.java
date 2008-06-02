/**
 * @version 03/2007 <BR>
 * @author Setpoint Inform�tica Ltda.<BR>
 * @author Alex Rodrigues<BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.rep <BR>
 * Classe:
 * @(#)RPPedido.java <BR>
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
 * Tela de cadastro de pedidos de vendas.
 * 
 */

package org.freedom.modulos.rep;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.DeleteEvent;
import org.freedom.acao.DeleteListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.PostEvent;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.EmailBean;
import org.freedom.funcoes.Funcoes;
import org.freedom.modulos.rep.RPPrefereGeral.EPrefere;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.DLEnviarEmail;
import org.freedom.telas.FDetalhe;
import org.freedom.telas.FFDialogo;
import org.freedom.telas.FObservacao;
import org.freedom.telas.FPrinterJob;

public class RPPedido extends FDetalhe implements CarregaListener, InsertListener, DeleteListener, FocusListener {

	private static final long serialVersionUID = 1L;

	private static final BigDecimal bdCem = new BigDecimal( "100" );

	private final JPanelPad panelPedido = new JPanelPad();

	private final JPanelPad panelItens = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private final JPanelPad panelTotaisItens = new JPanelPad();

	private final JPanelPad panelCamposItens = new JPanelPad();

	private final JTextFieldPad txtCodPed = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldPad txtDataPed = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtCodVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldFK txtNomeVend = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodPlanoPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldFK txtDescPlanoPag = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodMoeda = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private final JTextFieldFK txtDescMoeda = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodFor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldFK txtRazFor = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodTran = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldFK txtRazTran = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodPedFor = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private final JTextFieldPad txtCodPedCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private final JTextFieldPad txtCodItem = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );
	
	private final JTextFieldPad txtRefProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private final JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtQtdItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDec );

	private final JTextFieldPad txtPrecoItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPrecoCustoProd = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );
	
	private final JTextFieldPad txtVlrItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPercIPIItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 8, Aplicativo.casasDec );

	private final JTextFieldPad txtVlrIPIItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPercDescItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 8, Aplicativo.casasDec );

	private final JTextFieldPad txtVlrDescItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPercAdicItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 8, Aplicativo.casasDec );

	private final JTextFieldPad txtVlrAdicItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPercRecItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 8, Aplicativo.casasDec );

	private final JTextFieldPad txtVlrRecItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPercPagItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 8, Aplicativo.casasDec );

	private final JTextFieldPad txtVlrPagItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtCodForItem = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtRazForItem = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtVlrLiqItem = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtVlrTotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtVlrLiqPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtQdtTotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDec );

	private final JTextFieldPad txtIPITotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtDescTotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtAdicTotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtRecTotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtPagTotPed = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );
	
	private final JTextFieldPad txtPercTotLucro = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );
	
	private final JTextFieldPad txtPercItLucro = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtObsPed = new JTextFieldPad( JTextFieldPad.TP_STRING, 500, 0 );

	private JRadioGroup<String, String> rgFrete;

	private JRadioGroup<String, String> rgRemessa;

	private final JButton btObsPed = new JButton( Icone.novo( "btObs.gif" ) );

	private final JButton btEmailPed = new JButton( Icone.novo( "btEnviarMail.gif" ) );

	private final ListaCampos lcCliente = new ListaCampos( this, "CL" );

	private final ListaCampos lcVendedor = new ListaCampos( this, "VD" );

	private final ListaCampos lcPlanoPag = new ListaCampos( this, "PG" );

	private final ListaCampos lcMoeda = new ListaCampos( this, "MO" );

	private final ListaCampos lcFornecedor = new ListaCampos( this, "FO" );

	private final ListaCampos lcTransportadora = new ListaCampos( this, "TP" );

	private final ListaCampos lcProduto = new ListaCampos( this, "PD" );
	
	private final ListaCampos lcReferencia = new ListaCampos( this, "PD" );

	private final ListaCampos lcFornecedorItem = new ListaCampos( this, "FO" );

	private final ListaCampos lcPedido = new ListaCampos( this, "" );

	private List<Object> prefere = null;

	
	public RPPedido() {

		super( false );
		setTitulo( "Cadastro de Pedidos" );
		setAtribos( 50, 50, 700, 500 );

		montaRadioGrups();
		montaListaCampos();

		montaMaster();
		
		setImprimir( true );
		btPrevimp.addActionListener( this );
		btImp.addActionListener( this );

		lcCampos.addCarregaListener( this );
		lcDet.addCarregaListener( this );
		lcCliente.addCarregaListener( this );
		lcProduto.addCarregaListener( this );
		lcReferencia.addCarregaListener( this );
		txtPrecoItem.addKeyListener( this );

		lcCampos.addInsertListener( this );
		lcDet.addInsertListener( this );

		lcDet.addPostListener( this );

		lcDet.addDeleteListener( this );

		btObsPed.addActionListener( this );
		btEmailPed.addActionListener( this );

		txtPercPagItem.addFocusListener( this );
		txtPercIPIItem.addFocusListener( this );
	}

	private void montaRadioGrups() {

		Vector<String> labs = new Vector<String>();
		labs.add( "CIF" );
		labs.add( "FOB" );
		Vector<String> vals = new Vector<String>();
		vals.add( "C" );
		vals.add( "F" );
		rgFrete = new JRadioGroup<String, String>( 1, 2, labs, vals );

		Vector<String> labs1 = new Vector<String>();
		labs1.add( "Molote" );
		labs1.add( "Correio" );
		labs1.add( "Fone" );
		labs1.add( "Fax" );
		labs1.add( "e-mail" );
		Vector<String> vals1 = new Vector<String>();
		vals1.add( "M" );
		vals1.add( "C" );
		vals1.add( "T" );
		vals1.add( "F" );
		vals1.add( "E" );
		rgRemessa = new JRadioGroup<String, String>( 5, 1, labs1, vals1 );
	}

	private void montaListaCampos() {

		/**********
		 * PEDIDO *
		 **********/

		lcPedido.add( new GuardaCampo( txtCodPed, "CODPED", "C�d.ped.", ListaCampos.DB_PK, false ) );
		lcPedido.add( new GuardaCampo( txtVlrTotPed, "VLRTOTPED", "Pedido", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtVlrLiqPed, "VLRLIQPED", "Liquido", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtQdtTotPed, "QTDTOTPED", "Itens", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtIPITotPed, "VLRIPIPED", "IPI", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtDescTotPed, "VLRDESCPED", "Desconto", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtAdicTotPed, "VLRADICPED", "Adicional", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtRecTotPed, "VLRRECPED", "Receber", ListaCampos.DB_SI, false ) );
		lcPedido.add( new GuardaCampo( txtPagTotPed, "VLRPAGPED", "Pagar", ListaCampos.DB_SI, false ) );
		lcPedido.montaSql( false, "PEDIDO", "RP" );
		lcPedido.setQueryCommit( false );
		lcPedido.setReadOnly( true );

		/***********
		 * CLIENTE *
		 ***********/

		lcCliente.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
		lcCliente.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
		lcCliente.add( new GuardaCampo( txtCodVend, "CodVend", "C�d.vend.", ListaCampos.DB_SI, false ) );
		lcCliente.add( new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_SI, false ) );
		lcCliente.montaSql( false, "CLIENTE", "RP" );
		lcCliente.setQueryCommit( false );
		lcCliente.setReadOnly( true );
		txtCodCli.setTabelaExterna( lcCliente );

		/************
		 * VENDEDOR *
		 ************/

		lcVendedor.add( new GuardaCampo( txtCodVend, "CodVend", "C�d.vend.", ListaCampos.DB_PK, false ) );
		lcVendedor.add( new GuardaCampo( txtNomeVend, "NomeVend", "Nome do vendedor", ListaCampos.DB_SI, false ) );
		lcVendedor.montaSql( false, "VENDEDOR", "RP" );
		lcVendedor.setQueryCommit( false );
		lcVendedor.setReadOnly( true );
		txtCodVend.setTabelaExterna( lcVendedor );

		/**********************
		 * PLANO DE PAGAMENTO *
		 **********************/

		lcPlanoPag.add( new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_PK, false ) );
		lcPlanoPag.add( new GuardaCampo( txtDescPlanoPag, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI, false ) );
		lcPlanoPag.montaSql( false, "PLANOPAG", "RP" );
		lcPlanoPag.setQueryCommit( false );
		lcPlanoPag.setReadOnly( true );
		txtCodPlanoPag.setTabelaExterna( lcPlanoPag );

		/*********
		 * MOEDA *
		 *********/

		lcMoeda.add( new GuardaCampo( txtCodMoeda, "CodMoeda", "C�d.moeda", ListaCampos.DB_PK, false ) );
		lcMoeda.add( new GuardaCampo( txtDescMoeda, "SingMoeda", "Descri��o da moeda", ListaCampos.DB_SI, false ) );
		lcMoeda.montaSql( false, "MOEDA", "RP" );
		lcMoeda.setQueryCommit( false );
		lcMoeda.setReadOnly( true );
		txtCodMoeda.setTabelaExterna( lcMoeda );

		/**************
		 * FORNECEDOR *
		 **************/

		lcFornecedor.add( new GuardaCampo( txtCodFor, "CodFor", "C�d.for.", ListaCampos.DB_PK, false ) );
		lcFornecedor.add( new GuardaCampo( txtRazFor, "RazFor", "Raz�o social do fornecedor", ListaCampos.DB_SI, false ) );
		lcFornecedor.montaSql( false, "FORNECEDOR", "RP" );
		lcFornecedor.setQueryCommit( false );
		lcFornecedor.setReadOnly( true );
		txtCodFor.setTabelaExterna( lcFornecedor );

		/******************
		 * TRANSPORTADORA *
		 ******************/

		lcTransportadora.add( new GuardaCampo( txtCodTran, "CodTran", "C�d.transp.", ListaCampos.DB_PK, false ) );
		lcTransportadora.add( new GuardaCampo( txtRazTran, "RazTran", "Raz�o social da transportadora", ListaCampos.DB_SI, false ) );
		lcTransportadora.montaSql( false, "TRANSP", "RP" );
		lcTransportadora.setQueryCommit( false );
		lcTransportadora.setReadOnly( true );
		txtCodTran.setTabelaExterna( lcTransportadora );

		/***********
		 * PRODUTO *
		 ***********/

		lcProduto.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, false ) );
		lcProduto.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProduto.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia do produto", ListaCampos.DB_SI, false ) );
		lcProduto.add( new GuardaCampo( txtCodForItem, "CodFor", "C�d.for.", ListaCampos.DB_SI, false ) );
		lcProduto.add( new GuardaCampo( txtPrecoCustoProd, "precocusto", "Preco.Custo", ListaCampos.DB_SI, false));
		lcProduto.montaSql( false, "PRODUTO", "RP" );
		lcProduto.setReadOnly( true );
		txtCodProd.setTabelaExterna( lcProduto );

		/**************
		 * REFERENCIA *
		 **************/
		txtRefProd.setNomeCampo( "RefProd" );
		lcReferencia.add( new GuardaCampo( txtRefProd, "RefProd", "Ref.prod.", ListaCampos.DB_PK, txtDescProd, false ) );
		lcReferencia.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_SI, false ) );
		lcReferencia.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcReferencia.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia do produto", ListaCampos.DB_SI, false ) );
		lcReferencia.add( new GuardaCampo( txtCodForItem, "CodFor", "C�d.for.", ListaCampos.DB_SI, false ) );
		lcReferencia.montaSql( false, "PRODUTO", "RP" );
		lcReferencia.setQueryCommit( false );
		lcReferencia.setReadOnly( true );
		txtRefProd.setListaCampos( lcDet );
		txtRefProd.setTabelaExterna( lcReferencia );
		
		txtRefProd.addKeyListener( this );
		
		
		/****************
		 * FORNECEDOR 2 *
		 ****************/

		lcFornecedorItem.add( new GuardaCampo( txtCodForItem, "CodFor", "C�d.for.", ListaCampos.DB_PK, false ) );
		lcFornecedorItem.add( new GuardaCampo( txtRazForItem, "RazFor", "Raz�o social do fornecedor", ListaCampos.DB_SI, false ) );
		lcFornecedorItem.montaSql( false, "FORNECEDOR", "RP" );
		lcFornecedorItem.setQueryCommit( false );
		lcFornecedorItem.setReadOnly( true );
		txtCodForItem.setTabelaExterna( lcFornecedorItem );

	}

	private void montaMaster() {

		/***********
		 * PEDIDOS *
		 ***********/
		setListaCampos( lcCampos );
		
		setAltCab( 170 );
		setPainel( panelPedido, pnCliCab );

		adicCampo( txtCodPed, 7, 20, 70, 20, "CodPed", "Pedido", ListaCampos.DB_PK, true );
		adicCampo( txtDataPed, 80, 20, 70, 20, "DataPed", "Data", ListaCampos.DB_SI, true );

		adicCampo( txtCodCli, 153, 20, 70, 20, "CodCli", "C�d.cli.", ListaCampos.DB_FK, txtRazCli, true );
		adicDescFK( txtRazCli, 226, 20, 187, 20, "RazCli", "Raz�o social do cliente" );
		adicCampo( txtCodPedFor, 416, 20, 80, 20, "NumPedFor", "Pedido X For.", ListaCampos.DB_SI, false );
		adicCampo( txtCodPedCli, 499, 20, 80, 20, "NumPedCli", "Pedido X Cli.", ListaCampos.DB_SI, false );

		adicCampo( txtCodVend, 7, 60, 70, 20, "CodVend", "C�d.vend.", ListaCampos.DB_FK, txtRazCli, true );
		adicDescFK( txtNomeVend, 80, 60, 155, 20, "NomeVend", "Nome do vendedor" );
		adicCampo( txtCodPlanoPag, 238, 60, 70, 20, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_FK, txtRazCli, true );
		adicDescFK( txtDescPlanoPag, 311, 60, 155, 20, "DescPlanoPag", "Plano de pagamento" );
		adicCampo( txtCodMoeda, 469, 60, 110, 20, "CodMoeda", "C�d.moeda", ListaCampos.DB_FK, txtRazCli, true );

		adicCampo( txtCodFor, 7, 100, 70, 20, "CodFor", "C�d.for.", ListaCampos.DB_FK, txtRazCli, true );
		adicDescFK( txtRazFor, 80, 100, 155, 20, "RazFor", "Raz�o social do fornecedor" );
		adicCampo( txtCodTran, 238, 100, 70, 20, "CodTran", "C�d.transp.", ListaCampos.DB_FK, txtRazCli, false );
		adicDescFK( txtRazTran, 311, 100, 155, 20, "RazTran", "Raz�o social da transportadora" );

		adicDB( rgRemessa, 584, 20, 90, 110, "TipoRemPed", "Remessa", false );
		adicDB( rgFrete, 469, 100, 110, 30, "TipoFretePed", "Frete", false );
		
		setListaCampos( true, "PEDIDO", "RP" );

	}

	private void montaDetalhe() {

		/*********
		 * ITENS *
		 *********/

		pnDet.add( panelItens, BorderLayout.CENTER );

		panelItens.add( panelTotaisItens, BorderLayout.NORTH );

		panelTotaisItens.setPreferredSize( new Dimension( 300, 65 ) );
		panelTotaisItens.setBorder( BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Totais" ) );
		panelTotaisItens.adic( new JLabel( "Pedido" ), 7, 0, 80, 15 );
		panelTotaisItens.adic( txtVlrLiqPed, 7, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( "Itens" ), 90, 0, 80, 15 );
		panelTotaisItens.adic( txtQdtTotPed, 90, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( "IPI" ), 173, 0, 80, 15 );
		panelTotaisItens.adic( txtIPITotPed, 173, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( "Desconto" ), 256, 0, 80, 15 );
		panelTotaisItens.adic( txtDescTotPed, 256, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( "Adicional" ), 339, 0, 80, 15 );
		panelTotaisItens.adic( txtAdicTotPed, 339, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( "Receber" ), 422, 0, 80, 15 );
		panelTotaisItens.adic( txtRecTotPed, 422, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( "Pagar" ), 505, 0, 80, 15 );
		panelTotaisItens.adic( txtPagTotPed, 505, 15, 80, 20 );
		panelTotaisItens.adic( new JLabel( " % Total lucro" ), 588, 0, 80, 15 );
		panelTotaisItens.adic( txtPercTotLucro, 588, 15, 85, 20 );

		txtVlrLiqPed.setAtivo( false );
		txtVlrTotPed.setAtivo( false );
		txtQdtTotPed.setAtivo( false );
		txtIPITotPed.setAtivo( false );
		txtDescTotPed.setAtivo( false );
		txtAdicTotPed.setAtivo( false );
		txtRecTotPed.setAtivo( false );
		txtPagTotPed.setAtivo( false );
		txtPercTotLucro.setAtivo( false );

		setAltDet( 175 );
		setPainel( panelCamposItens, panelItens );
		
		setListaCampos( lcDet );
		setNavegador( navRod );
		
		panelCamposItens.setBorder( BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Itens" ) );

		adicCampo( txtCodItem, 7, 15, 50, 20, "CodItPed", "Item", ListaCampos.DB_PK, true );
		
		if ( "S".equals( (String) prefere.get( EPrefere.USAREFPROD.ordinal() ) ) ) {
			adicCampoInvisivel( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_FK, txtDescProd, false );
			adicCampoInvisivel( txtRefProd, "RefProd", "Ref.prod.", ListaCampos.DB_FK, false );
			adic( new JLabelPad( "Refer�ncia" ), 60, -5, 90, 20 );
			adic( txtRefProd, 60, 15, 90, 20 );
			txtRefProd.setFK( true );
		}
		else {
			adicCampo( txtCodProd, 60, 15, 90, 20, "CodProd", "C�d.prod.", ListaCampos.DB_FK, txtDescProd, true );
			adicCampoInvisivel( txtRefProd, "RefProd", "Ref.prod.", ListaCampos.DB_SI, false );
		}
		
		adicDescFK( txtDescProd, 153, 15, 246, 20, "DescProd", "Descri��o do produto" );
		adicCampo( txtQtdItem, 402, 15, 48, 20, "QtdItPed", "Qtd.", ListaCampos.DB_SI, true );
		adicCampo( txtPrecoItem, 453, 15, 94, 20, "PrecoItPed", "Pre�o", ListaCampos.DB_SI, true );
		adicCampoInvisivel( txtVlrItem, "VlrItPed", "Valor item", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtVlrLiqItem, "VlrLiqItPed", "Liquido", ListaCampos.DB_SI, false );
		adicCampo( txtPercIPIItem, 550, 15, 62, 20, "PercIPIItPed", "% IPI", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtVlrIPIItem, "VlrIPIItPed", "Valor IPI", ListaCampos.DB_SI, false );
		adicCampo( txtPercItLucro, 615, 15, 58, 20, "PercItlucro", "% Lucro", ListaCampos.DB_SI, false );
		

		adicCampo( txtPercDescItem, 7, 55, 70, 20, "PercDescItPed", "% Desconto", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtVlrDescItem, "VlrDescItPed", "Vlr. Desconto", ListaCampos.DB_SI, false );
		adicCampo( txtPercAdicItem, 80, 55, 70, 20, "PercAdicItPed", "% Acr�cimo", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtVlrAdicItem, "VlrAdicItPed", "Vlr. Adicional", ListaCampos.DB_SI, false );
		adicCampo( txtPercRecItem, 153, 55, 80, 20, "PercRecItPed", "% Receber", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtVlrRecItem, "VlrRecItPed", "Vlr. Receber", ListaCampos.DB_SI, false );
		adicCampo( txtPercPagItem, 236, 55, 80, 20, "PercPagItPed", "% Pagar", ListaCampos.DB_SI, false );
		adicCampoInvisivel( txtVlrPagItem, "VlrPagItPed", "Vlr. Pagar", ListaCampos.DB_SI, false );
		adic( new JLabel( "C�d.for." ), 319, 35, 80, 20 );
		adic( txtCodForItem, 319, 55, 80, 20 );
		adic( new JLabel( "Raz�o social do fornecedor" ), 402, 35, 189, 20 );
		adic( txtRazForItem, 402, 55, 264, 20 );

		txtCodForItem.setAtivo( false );
		txtPercItLucro.setAtivo( false );

		btObsPed.setToolTipText( "Observa��o do pedido" );
		btEmailPed.setToolTipText( "Enviar pedido por e-mail" );
		
		pnGImp.setPreferredSize( new Dimension( 160, 26 ) );
		pnGImp.add( btObsPed );
		pnGImp.add( btEmailPed );

		setListaCampos( true, "ITPEDIDO", "RP" );
		
		montaTab();

		tab.setTamColuna( 50, 0 );
		tab.setTamColuna( 100, 1 );
		tab.setTamColuna( 235, 2 );
		tab.setTamColuna( 100, 3 );
		tab.setTamColuna( 100, 4 );
		tab.setTamColuna( 100, 5 );

	}

	private void calculaValorItem() {

		if ( txtQtdItem.getVlrBigDecimal() != null ) {
			txtVlrItem.setVlrBigDecimal( txtQtdItem.getVlrBigDecimal().multiply( txtPrecoItem.getVlrBigDecimal() ) );
		}
	}

	private void calculaValorLiquido() {

		if ( txtVlrItem.getVlrBigDecimal() != null ) {

			txtVlrLiqItem.setVlrBigDecimal( txtVlrItem.getVlrBigDecimal() );

			if ( txtVlrDescItem.getVlrBigDecimal() != null ) {
				txtVlrLiqItem.setVlrBigDecimal( txtVlrLiqItem.getVlrBigDecimal().subtract( txtVlrDescItem.getVlrBigDecimal() ) );
			}
			if ( txtVlrAdicItem.getVlrBigDecimal() != null ) {
				txtVlrLiqItem.setVlrBigDecimal( txtVlrLiqItem.getVlrBigDecimal().add( txtVlrAdicItem.getVlrBigDecimal() ) );
			}
			if ( txtVlrIPIItem.getVlrBigDecimal() != null ) {
				txtVlrLiqItem.setVlrBigDecimal( txtVlrLiqItem.getVlrBigDecimal().add( txtVlrIPIItem.getVlrBigDecimal() ) );
			}
		}
	}

	private void calculaValorIpi() {

		if ( txtPercIPIItem.getVlrBigDecimal() != null && txtVlrItem.getVlrBigDecimal() != null ) {
			txtVlrIPIItem.setVlrBigDecimal( ( txtVlrItem.getVlrBigDecimal().divide( bdCem ) ).multiply( txtPercIPIItem.getVlrBigDecimal() ) );
		}
	}

	private void calculaValorDesconto() {

		if ( txtPercDescItem.getVlrBigDecimal() != null && txtVlrItem.getVlrBigDecimal() != null ) {
			txtVlrDescItem.setVlrBigDecimal( ( txtVlrItem.getVlrBigDecimal().divide( bdCem ) ).multiply( txtPercDescItem.getVlrBigDecimal() ) );
		}
	}

	private void calculaValorAdicional() {

		if ( txtPercAdicItem.getVlrBigDecimal() != null && txtVlrItem.getVlrBigDecimal() != null ) {
			txtVlrAdicItem.setVlrBigDecimal( ( txtVlrItem.getVlrBigDecimal().divide( bdCem ) ).multiply( txtPercAdicItem.getVlrBigDecimal() ) );
		}
	}

	private void calculaValorRecebimento() {

		if ( txtPercRecItem.getVlrBigDecimal() != null && txtVlrItem.getVlrBigDecimal() != null ) {
			txtVlrRecItem.setVlrBigDecimal( ( txtVlrItem.getVlrBigDecimal().divide( bdCem ) ).multiply( txtPercRecItem.getVlrBigDecimal() ) );
		}
	}

	private void calculaValorPagamento() {

		if ( txtPercPagItem.getVlrBigDecimal() != null && txtVlrItem.getVlrBigDecimal() != null ) {
			txtVlrPagItem.setVlrBigDecimal( ( txtVlrItem.getVlrBigDecimal().divide( bdCem ) ).multiply( txtPercPagItem.getVlrBigDecimal() ) );
		}
	}
	
	private void calcPercItLucro(){
		
		BigDecimal percLucro = new BigDecimal(0);
		BigDecimal precoCusto = txtPrecoCustoProd.getVlrBigDecimal();
		BigDecimal precoVenda = txtPrecoItem.getVlrBigDecimal();
		
		try {
			
			percLucro = (((precoVenda.subtract( precoCusto )).multiply( new BigDecimal(100)).divide( precoVenda )));
			System.out.println( percLucro );
			percLucro.setScale( 2, BigDecimal.ROUND_HALF_UP );
			
			txtPercItLucro.setVlrBigDecimal( percLucro );
			
		}
		catch ( Exception e ) {
			
			e.printStackTrace();
		}
	}
	
	private void calcTotLucro(){
		
		BigDecimal totalLucro = new BigDecimal(0);
		StringBuilder sSQL = new StringBuilder();
		
		sSQL.append( "SELECT ( SUM(COALESCE(PERCITLUCRO,0)* IT.VLRLIQITPED) / SUM(VLRLIQITPED)) FROM RPITPEDIDO IT WHERE IT.CODEMP=? AND IT.CODFILIAL=? AND IT.CODPED=?" );
		
		try {
			
			PreparedStatement ps = con.prepareStatement( sSQL.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "RPITPEDIDO" ) );
			ps.setInt( 3, txtCodPed.getVlrInteger() );
			
			ResultSet rs = ps.executeQuery();
			
			if( rs.next() ){
				
				txtPercTotLucro.setVlrBigDecimal( rs.getBigDecimal( 1 ) );
			}
			
		} catch ( SQLException err ) {
		
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao calcular Total de Lucro!" );
		}
	}
		
	private void loadProduto() {
		
		try {

			PreparedStatement ps = con.prepareStatement( 
					"SELECT PRECOPROD1, PERCIPIPROD, COMISPROD FROM RPPRODUTO WHERE CODEMP=? AND CODFILIAL=? AND CODPROD=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "RPPRODUTO" ) );
			ps.setInt( 3, txtCodProd.getVlrInteger() );
			ResultSet rs = ps.executeQuery();
			
			if ( rs.next() ) {
				
				txtPrecoItem.setVlrBigDecimal( rs.getBigDecimal( "PRECOPROD1" ) == null ? new BigDecimal( "0" ) : rs.getBigDecimal( "PRECOPROD1" ) );
				txtPercIPIItem.setVlrBigDecimal( rs.getBigDecimal( "PERCIPIPROD" ) == null ? new BigDecimal( "0" ) : rs.getBigDecimal( "PERCIPIPROD" ) );
				txtPercRecItem.setVlrBigDecimal( rs.getBigDecimal( "COMISPROD" ) == null ? new BigDecimal( "0" ) : rs.getBigDecimal( "COMISPROD" ) );
			}			

			if ( !con.getAutoCommit() ) {
				con.commit();
			}
			
			rs.close();
			ps.close();
			
			ps = con.prepareStatement( "SELECT PERCCOMIS FROM RPVENDEDOR WHERE CODEMP=? AND CODFILIAL=? AND CODVEND=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "RPVENDEDOR" ) );
			ps.setInt( 3, txtCodVend.getVlrInteger() );
			rs = ps.executeQuery();
			
			if ( rs.next() ) {
				
				BigDecimal perccomis = rs.getBigDecimal( "PERCCOMIS" ) == null ? new BigDecimal( "0" ) : rs.getBigDecimal( "PERCCOMIS" );
				txtPercPagItem.setVlrBigDecimal( txtPercRecItem.getVlrBigDecimal().divide( new BigDecimal( "100" ) ).multiply( perccomis ) );
			}			
		
			if ( !con.getAutoCommit() ) {
				con.commit();
			}
			
		} catch ( Exception e ) {
			Funcoes.mensagemErro( this, "Erro ao carregar produto!\n" + e.getMessage() );
			e.printStackTrace();
		}
	}

	private void getObservacao() {

		if ( txtCodPed.getVlrInteger() != null && txtCodPed.getVlrInteger() > 0 ) {

			FObservacao obs = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sSQLSelect = null;
			String sSQLUpdate = null;

			try {

				sSQLSelect = "SELECT OBSPED FROM RPPEDIDO WHERE CODEMP=? AND CODFILIAL=? AND CODPED=?";
				sSQLUpdate = "UPDATE RPPEDIDO SET OBSPED=? WHERE CODEMP=? AND CODFILIAL=? AND CODPED=?";

				ps = con.prepareStatement( sSQLSelect );
				ps.setInt( 1, Aplicativo.iCodEmp );
				ps.setInt( 2, ListaCampos.getMasterFilial( "PRPEDIDO" ) );
				ps.setInt( 3, txtCodPed.getVlrInteger() );
				rs = ps.executeQuery();

				if ( rs.next() ) {
					obs = new FObservacao( ( rs.getString( "OBSPED" ) != null ? rs.getString( "OBSPED" ) : "" ) );
				}
				else {
					obs = new FObservacao( "" );
				}

				rs.close();
				ps.close();

				if ( !con.getAutoCommit() ) {
					con.commit();
				}
				if ( obs != null ) {
					obs.setVisible( true );
					if ( obs.OK ) {
						try {
							ps = con.prepareStatement( sSQLUpdate );
							ps.setString( 1, obs.getTexto() );
							ps.setInt( 2, Aplicativo.iCodEmp );
							ps.setInt( 3, ListaCampos.getMasterFilial( "PRPEDIDO" ) );
							ps.setInt( 4, txtCodPed.getVlrInteger() );
							ps.executeUpdate();
							ps.close();
							if ( !con.getAutoCommit() ) {
								con.commit();
							}
						} catch ( SQLException e ) {
							Funcoes.mensagemErro( this, "Erro ao alterar observa��o!\n" + e.getMessage() );
							e.printStackTrace();
						}
					}
					obs.dispose();
				}
			} catch ( Exception e ) {
				Funcoes.mensagemErro( this, "Erro ao carregar a observa��o!\n" + e.getMessage() );
				e.printStackTrace();
			}
		}
	}
	
	private FPrinterJob getPedido( final Integer codped ) {
		
		String classLayout = "/opt/freedom/reports/pedido.jasper";
		
		if ( prefere.get( EPrefere.LAYOUTPED.ordinal() ) != null && ( (String) prefere.get( EPrefere.LAYOUTPED.ordinal() ) ).trim().length() > 0 ) {
		
			classLayout = "/opt/freedom/reports/" + (String) prefere.get( EPrefere.LAYOUTPED.ordinal() ) + ".jasper";
		}
		
		HashMap<String, Object> hParam = new HashMap<String, Object>();
		hParam.put( "CODEMP", Aplicativo.iCodEmp );
		hParam.put( "CODFILIAL", ListaCampos.getMasterFilial( "RPPEDIDO" ) );
		hParam.put( "CODPED", codped );
		if ( "S".equals( (String) prefere.get( EPrefere.ORDEMPED.ordinal() ) ) ) {
			hParam.put( "ORDERBY", "DESCPROD" );
		}
		else {
			hParam.put( "ORDERBY", "CODITPED" );
		}
		hParam.put( "REPORT_CONNECTION", con );

		return new FPrinterJob( classLayout, "PEDIDO N� " + txtCodPed.getVlrInteger(), "", this, hParam, con, true );
	}

	private void enviarPedido() {

		if ( txtCodPed.getVlrInteger() != null && txtCodPed.getVlrInteger() > 0 ) {

			try {
				
				EmailBean mail = Aplicativo.getEmailBean();
				mail.setAssunto( "Pedido n�" + txtCodPed.getVlrInteger() + " de " + txtDataPed.getVlrString() );
				
				DLEmail dlenvio = new DLEmail( this );
				dlenvio.setVisible( true );
				
				if ( dlenvio.OK ) {
					if ( dlenvio.OPTION_CLIENTE == dlenvio.getOption() ) {
						mail.setPara( AplicativoRep.getEmailCliente( txtCodCli.getVlrInteger(), con ) );	
					}
					else {
						mail.setPara( AplicativoRep.getEmailFornecedor( txtCodFor.getVlrInteger(), con ) );
					}
				}
				else {
					return;
				}

				DLEnviarEmail enviar = new DLEnviarEmail( this, mail );
				enviar.setConexao( con );
				enviar.preparar();

				FPrinterJob dlGr = getPedido( txtCodPed.getVlrInteger() );

				if ( enviar.preparado() ) {
					enviar.setReport( dlGr.getRelatorio() );
					enviar.setVisible( true );
				}

			} catch ( Exception e ) {
				Funcoes.mensagemErro( this, "Erro ao montar relatorio!\n" + e.getMessage(), true, con, e );
				e.printStackTrace();
			}
		}
	}

	private void imprimir( final boolean visualizar ) {

		if ( txtCodPed.getVlrInteger() != null && txtCodPed.getVlrInteger() > 0 ) {

			try {

				FPrinterJob dlGr = getPedido( txtCodPed.getVlrInteger() );
				
				if ( visualizar ) {
					dlGr.setVisible( true );
				}
				else {
					JasperPrintManager.printReport( dlGr.getRelatorio(), true );
				}
			} catch ( Exception e ) {
				Funcoes.mensagemErro( this, "Erro ao montar pedido!\n" + e.getMessage() );
				e.printStackTrace();
			}
		}
	}

	public void afterCarrega( CarregaEvent e ) {

		if ( e.getListaCampos() == lcDet ) {
			lcProduto.carregaDados();
			lcPedido.carregaDados();
		}
		else if ( e.getListaCampos() == lcCampos ) {
			String s = txtCodPed.getVlrString();
			lcPedido.carregaDados();
			txtCodPed.setVlrString( s );
		}
		else if ( e.getListaCampos() == lcCliente ) {
			lcVendedor.carregaDados();
			lcPlanoPag.carregaDados();
		}
		else if ( e.getListaCampos() == lcReferencia ) {
			lcProduto.carregaDados();
		}
		else if ( e.getListaCampos() == lcProduto ) {
			lcFornecedorItem.carregaDados();
			if ( lcDet.getStatus() == ListaCampos.LCS_INSERT ) {
				loadProduto();
			}
		}if ( e.getListaCampos() == lcCampos ){
			
			calcTotLucro();
		}
		
	}

	public void beforeCarrega( CarregaEvent e ) {

	}

	public void afterInsert( InsertEvent e ) {

		if ( e.getListaCampos() == lcCampos ) {

			txtCodMoeda.setVlrString( (String) prefere.get( EPrefere.CODMOEDA.ordinal() ) );
			lcMoeda.carregaDados();

			txtDataPed.setVlrDate( Calendar.getInstance().getTime() );
			txtDataPed.requestFocus();
		}
		else if ( e.getListaCampos() == lcDet ) {

			if ( "S".equals( prefere.get( EPrefere.USAREFPROD.ordinal() ) ) ) {
				
				txtRefProd.requestFocus();
			}
			else {
				
				txtCodProd.requestFocus();
			}
		}
	}

	public void beforeInsert( InsertEvent e ) { }

	@ Override
	public void afterPost( PostEvent e ) {

		if ( e.getListaCampos() == lcCampos && lcCampos.getStatusAnt() == ListaCampos.LCS_INSERT ) {

			lcDet.insert( true );
			
			if ( "S".equals( prefere.get( EPrefere.USAREFPROD.ordinal() ) ) ) {
				
				txtRefProd.requestFocus();
			}
			else {
				
				txtCodProd.requestFocus();
			}
		}
		
		super.afterPost( e );
	}

	@ Override
	public void beforePost( PostEvent e ) {

		if ( e.getListaCampos() == lcDet ) {
			calculaValorItem();
			calculaValorIpi();
			calculaValorDesconto();
			calculaValorAdicional();
			calculaValorRecebimento();
			calculaValorPagamento();
			calculaValorLiquido();
		}
		super.beforePost( e );
	}

	public void afterDelete( DeleteEvent e ) {

		if ( e.getListaCampos() == lcDet ) {
			lcPedido.carregaDados();
		}
	}

	public void beforeDelete( DeleteEvent e ) { }

	@ Override
	public void actionPerformed( ActionEvent e ) {

		if ( e.getSource() == btObsPed ) {
			getObservacao();
		}
		else if ( e.getSource() == btEmailPed ) {
			enviarPedido();
		}
		else if ( e.getSource() == btPrevimp ) {
			imprimir( true );
		}
		else if ( e.getSource() == btImp ) {
			imprimir( false );
		}
		super.actionPerformed( e );
	}

	public void keyPressed( KeyEvent kevt ) {
		
		if ( kevt.getKeyCode() == KeyEvent.VK_ENTER ) {
			
			if ( kevt.getSource() == txtPrecoItem ) {
				
				calcPercItLucro();
			}
		}
	}
	
	public void focusGained( FocusEvent e ) { }

	public void focusLost( FocusEvent e ) {

		if ( e.getSource() == txtPercPagItem && ( lcDet.getStatus() == ListaCampos.LCS_EDIT || lcDet.getStatus() == ListaCampos.LCS_INSERT ) ) {
			lcDet.post();
			lcDet.insert( true );
		}
		
	}
	public void setConexao( Connection cn ) {
		super.setConexao( cn );
		
		prefere = RPPrefereGeral.getPrefere( cn );

		lcCliente.setConexao( cn );
		lcVendedor.setConexao( cn );
		lcPlanoPag.setConexao( cn );
		lcMoeda.setConexao( cn );
		lcFornecedor.setConexao( cn );
		lcTransportadora.setConexao( cn );
		lcProduto.setConexao( cn );
		lcReferencia.setConexao( cn );
		lcFornecedorItem.setConexao( cn );
		lcPedido.setConexao( cn );
		
		montaDetalhe();		
	}
	
	public void executar( final Integer codped ) {
		txtCodPed.setVlrInteger( codped );
		lcCampos.carregaDados();
	}
	
	private class DLEmail extends FFDialogo {
		
		private static final long serialVersionUID = 1L;

		private JRadioGroup<String, Integer> rgOrdem = null;

		private Vector<String> vLabs = new Vector<String>();

		private Vector<Integer> vVals = new Vector<Integer>();
		
		final int OPTION_FORNECEDOR = 0;
		
		final int OPTION_CLIENTE = 1;
		

		public DLEmail( Component cOrig ) {

			super( cOrig );
			
			setTitulo( "Sele��o de envio" );
			setAtribos( 300, 160 );
			
			vLabs.addElement( "Fornecedor" );
			vLabs.addElement( "Cliente" );
			vVals.addElement( OPTION_FORNECEDOR );
			vVals.addElement( OPTION_CLIENTE );
			rgOrdem = new JRadioGroup<String,Integer>( 1, 2, vLabs, vVals );
			
			adic( new JLabelPad( "Enviar para:" ), 7, 10, 80, 15 );
			adic( rgOrdem, 7, 30, 270, 30 );
		}

		public int getOption() {

			return rgOrdem.getVlrInteger();
		}
		
	}

}

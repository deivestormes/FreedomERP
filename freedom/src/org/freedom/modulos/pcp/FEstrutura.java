/**
 * @version 01/09/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.pcp <BR>
 * Classe:
 * @(#)FEstrutura.java <BR>
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
 * Tela para cadastro de estruturas de produtos.
 * 
 */

package org.freedom.modulos.pcp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTabbedPanePad;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FDetalhe;

public class FEstrutura extends FDetalhe implements ChangeListener, ActionListener, CarregaListener, PostListener {

	private static final long serialVersionUID = 1L;

	private int casasDec = Aplicativo.casasDec;

	private JPanelPad pinCab = new JPanelPad();

	private JPanelPad pinDetFases = new JPanelPad( new GridLayout( 2, 1 ) );

	private JPanelPad pinDetFasesCampos = new JPanelPad();

	private JPanelPad pinDetFasesInstrucao = new JPanelPad( new GridLayout( 1, 1 ) );

	private JPanelPad pinDetItens = new JPanelPad( 590, 110 );

	private JPanelPad pinDetDistrib = new JPanelPad();

	private JTabbedPanePad tpnAbas = new JTabbedPanePad();

	private JTextFieldPad txtCodProdEst = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescProdEst = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtDescEstDistrib = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtCLoteProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtCodFase = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescFase = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldFK txtTipoFase = new JTextFieldFK( JTextFieldPad.TP_STRING, 2, 0 );

	private JTextFieldPad txtDescEst = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtQtdEst = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtSeqItem = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JCheckBoxPad cbQtdVariavelItem = new JCheckBoxPad( "Sim", "S", "N" );
	
//	private JCheckBoxPad cbQtdVariavelDistrib = new JCheckBoxPad( "Sim", "S", "N" );	

	private JTextFieldPad txtSeqDistrib = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodProdItem = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescProdItem = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodProdDistrib = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtQtdMat = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	private JTextFieldPad txtRMA = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JTextFieldPad txtRefProdEst = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodModLote = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtNroDiasValid = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtSeqEst = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtSeqEstDistrib = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldFK txtDescModLote = new JTextFieldFK( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtSeqEfEst = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTpRec = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescTpRec = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtTempoEf = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JCheckBoxPad cbFinaliza = new JCheckBoxPad( "Finaliza", "S", "N" );

	private JCheckBoxPad cbRmaAutoItEst = new JCheckBoxPad( "Sim", "S", "N" );

	private JCheckBoxPad cbAtiva = new JCheckBoxPad( "Ativa", "S", "N" );

	private JCheckBoxPad cbGLoteOPP = new JCheckBoxPad( "Mod.lote da OP principal", "S", "N" );

	private JCheckBoxPad cbOpDensidade = new JCheckBoxPad( "Usa densidade na OP?", "S", "N" );

	private JTextAreaPad txaModoPreparo = new JTextAreaPad();

	private Tabela tabItens = new Tabela();

	private Tabela tabDist = new Tabela();
	
	private Tabela tabQuali = new Tabela();

	private JScrollPane spItens = new JScrollPane( tabItens );
	
	private JScrollPane spQuali = new JScrollPane( tabQuali );

	private JScrollPane spDist = new JScrollPane( tabDist );

	private JScrollPane spnModoPreparo = new JScrollPane( txaModoPreparo );

	private ListaCampos lcProdEst = new ListaCampos( this, "" );

	private ListaCampos lcProdItem = new ListaCampos( this, "PD" );

	private ListaCampos lcFase = new ListaCampos( this, "FS" );

	private ListaCampos lcModLote = new ListaCampos( this, "ML" );

	private ListaCampos lcDetItens = new ListaCampos( this );

	private ListaCampos lcDetDistrib = new ListaCampos( this );

	private ListaCampos lcEstDistrib = new ListaCampos( this, "DE" );

	private ListaCampos lcTipoRec = new ListaCampos( this, "TR" );
	

	public FEstrutura() {

		setTitulo( "Estrutura de produtos" );
		setAtribos( 50, 20, 670, 550 );
		setAltCab( 170 );

		pnMaster.remove( spTab );
		pnMaster.remove( pnDet );

		tpnAbas.addTab( "Fases", spTab );
		tpnAbas.addTab( "Itens X Fase", spItens );
		tpnAbas.addTab( "Controle de qualidade", spQuali );
		tpnAbas.addTab( "Distribui��o X Fase", spDist );
		

		pnMaster.add( tpnAbas, BorderLayout.CENTER );

		pnGImp.removeAll();
		pnGImp.setLayout( new GridLayout( 1, 2 ) );
		pnGImp.setPreferredSize( new Dimension( 100, 26 ) );
		pnGImp.add( btPrevimp );
		pnGImp.add( btImp );

		cbAtiva.setVlrString( "N" );

		lcDetItens.setMaster( lcDet );
		lcDet.adicDetalhe( lcDetItens );
		lcDetDistrib.setMaster( lcDet );
		lcDet.adicDetalhe( lcDetDistrib );

		pinCab = new JPanelPad( 500, 90 );
		setListaCampos( lcCampos );
		setPainel( pinCab, pnCliCab );
		lcCampos.addPostListener( this );
		lcProdEst.setUsaME( false );
		lcProdEst.add( new GuardaCampo( txtCodProdEst, "CodProd", "C�d.prod.", ListaCampos.DB_PK, true ) );
		lcProdEst.add( new GuardaCampo( txtDescProdEst, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProdEst.add( new GuardaCampo( txtRefProdEst, "RefProd", "Referencia", ListaCampos.DB_SI, false ) );
		lcProdEst.add( new GuardaCampo( txtCLoteProd, "CLoteProd", "Usa Lote", ListaCampos.DB_SI, false ) );
		lcProdEst.setWhereAdic( "TIPOPROD='F'" );
		lcProdEst.montaSql( false, "PRODUTO", "EQ" );
		lcProdEst.setQueryCommit( false );
		lcProdEst.setReadOnly( true );
		txtRefProdEst.setTabelaExterna( lcProdEst );
		txtCodProdEst.setTabelaExterna( lcProdEst );
		txtSeqEst.setTabelaExterna( lcProdEst );
		txtDescProdEst.setListaCampos( lcProdEst );

		lcProdItem.add( new GuardaCampo( txtCodProdItem, "CodProd", "C�d.prod.", ListaCampos.DB_PK, true ) );
		lcProdItem.add( new GuardaCampo( txtDescProdItem, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProdItem.add( new GuardaCampo( txtRMA, "RMAProd", "RMA", ListaCampos.DB_SI, false ) );
		lcProdItem.montaSql( false, "PRODUTO", "EQ" );
		lcProdItem.setQueryCommit( false );
		lcProdItem.setReadOnly( true );
		txtCodProdItem.setTabelaExterna( lcProdItem );
		txtDescProdItem.setListaCampos( lcProdItem );

		lcFase.add( new GuardaCampo( txtCodFase, "CodFase", "C�d.fase", ListaCampos.DB_PK, true ) );
		lcFase.add( new GuardaCampo( txtDescFase, "DescFase", "Descri��o da fase", ListaCampos.DB_SI, false ) );
		lcFase.add( new GuardaCampo( txtTipoFase, "TipoFase", "Tipo da fase", ListaCampos.DB_SI, false ) );
		lcFase.montaSql( false, "FASE", "PP" );
		lcFase.setQueryCommit( false );
		lcFase.setReadOnly( true );
		txtCodFase.setTabelaExterna( lcFase );
		txtCodFase.setNomeCampo( "codfase" );
		txtDescFase.setListaCampos( lcFase );

		lcModLote.add( new GuardaCampo( txtCodModLote, "CodModLote", "C�d.Mod.Lote", ListaCampos.DB_PK, false ) );
		lcModLote.add( new GuardaCampo( txtDescModLote, "DescModLote", "Descri��o do modelo de lote", ListaCampos.DB_SI, false ) );
		lcModLote.montaSql( false, "MODLOTE", "EQ" );
		lcModLote.setQueryCommit( false );
		lcModLote.setReadOnly( true );
		txtCodModLote.setTabelaExterna( lcModLote );
		txtDescModLote.setListaCampos( lcModLote );

		adicCampo( txtCodProdEst, 7, 20, 80, 20, "CodProd", "C�d.prod.", ListaCampos.DB_PF, txtDescProdEst, true );
		adicDescFK( txtDescProdEst, 90, 20, 297, 20, "DescProd", "Descri��o do produto" );
		adicCampo( txtSeqEst, 390, 20, 85, 20, "SeqEst", "Seq.Est.", ListaCampos.DB_PF, true );// era pra ser DB_PF, mas ta dando erro.
		adicCampo( txtQtdEst, 7, 60, 80, 20, "QtdEst", "Quantidade", ListaCampos.DB_SI, true );
		adicCampo( txtDescEst, 90, 60, 297, 20, "DescEst", "Descri��o", ListaCampos.DB_SI, true );
		adicCampoInvisivel( txtRefProdEst, "RefProd", "Ref.prod.", ListaCampos.DB_SI, false );
		adicDB( cbAtiva, 485, 20, 80, 20, "ATIVOEST", "", true );
		adicDB( cbGLoteOPP, 485, 40, 160, 20, "GLOTEOPP", "", true );
		adicCampo( txtCodModLote, 7, 100, 80, 20, "CodModLote", "C�d.Mod.Lote", ListaCampos.DB_FK, txtDescModLote, false );
		adicDescFK( txtDescModLote, 90, 100, 297, 20, "DescModLote", "Descri��o do modelo do lote" );
		adicCampo( txtNroDiasValid, 390, 60, 85, 20, "NroDiasValid", "Dias de valid.", ListaCampos.DB_SI, false );
		adicDB( cbOpDensidade, 485, 60, 250, 20, "USADENSIDADEOP", "", true );

		setListaCampos( false, "ESTRUTURA", "PP" );
		lcCampos.setQueryInsert( false );

		// Detalhe Fases

		lcTipoRec.add( new GuardaCampo( txtCodTpRec, "CodTpRec", "C�d.tp.rec.", ListaCampos.DB_PK, true ) );
		lcTipoRec.add( new GuardaCampo( txtDescTpRec, "DescTpRec", "Descri��o do tipo de recurso", ListaCampos.DB_SI, false ) );
		lcTipoRec.montaSql( false, "TIPOREC", "PP" );
		lcTipoRec.setQueryCommit( false );
		lcTipoRec.setReadOnly( true );
		txtCodTpRec.setTabelaExterna( lcTipoRec );

		setPainel( pinDetFases, pnDet );
		pinDetFases.add( pinDetFasesCampos );
		pinDetFases.add( pinDetFasesInstrucao );
		setPainel( pinDetFasesCampos );
		setListaCampos( lcDet );

		adicCampo( txtSeqEfEst, 7, 20, 40, 20, "SeqEf", "Item", ListaCampos.DB_PK, true );
		adicCampo( txtCodFase, 50, 20, 77, 20, "CodFase", "C�d.fase", ListaCampos.DB_PF, txtDescFase, true );
		adicDescFK( txtDescFase, 130, 20, 310, 20, "DescFase", "Descri��o da fase" );

		adicCampo( txtTempoEf, 450, 20, 80, 20, "TempoEf", "Tempo(Seg)", ListaCampos.DB_SI, true );
		adicCampo( txtCodTpRec, 7, 60, 80, 20, "CodTpRec", "C�d.tp.rec.", ListaCampos.DB_FK, txtDescTpRec, true );
		adicDescFK( txtDescTpRec, 90, 60, 350, 20, "DescTpRec", "Desc. tipo de recurso" );
		adicDescFKInvisivel( txtTipoFase, "TipoFase", "Tipo da fase" );
		
		adicDB( cbFinaliza, 533, 20, 80, 20, "FINALIZAOP", "", true );

		setPainel( pinDetFasesInstrucao );
		GridLayout gi = (GridLayout)pinDetFasesInstrucao.getLayout();
		gi.setHgap( 10 );
		gi.setVgap( 10 );

		pinDetFasesInstrucao.setBorder( BorderFactory.createTitledBorder( 
				BorderFactory.createEtchedBorder(), "Instru��es" ) );
		adicDBLiv( txaModoPreparo, "Instrucoes", "Instru��es", false );
		pinDetFasesInstrucao.add( spnModoPreparo );

		setListaCampos( true, "ESTRUFASE", "PP" );
		lcDet.setQueryInsert( false );

		// Fim do detalhe fases

		// Detalhe Itens

		setPainel( pinDetItens );
		setListaCampos( lcDetItens );
		setNavegador( navRod );

		cbRmaAutoItEst.setVlrString( "N" );

		adicCampo( txtSeqItem, 7, 20, 40, 20, "SeqItEst", "Item", ListaCampos.DB_PK, true );
		adicCampo( txtCodProdItem, 50, 20, 77, 20, "CodProdPD", "C�d.prod.", ListaCampos.DB_FK, txtDescProdItem, true );
		adicDescFK( txtDescProdItem, 130, 20, 327, 20, "DescProd", "Descri��o do produto" );
		adicCampo( txtQtdMat, 460, 20, 100, 20, "QtdItEst", "Qtd.", ListaCampos.DB_SI, true );
	
		adicDB( cbRmaAutoItEst, 7, 60, 60, 20, "RmaAutoItEst", "RMA", true );		
		adicDB( cbQtdVariavelItem, 80, 60, 70, 20, "QtdVariavel", "Qtd.vari�vel", true );
			
		setListaCampos( true, "ITESTRUTURA", "PP" );
		lcDetItens.setQueryInsert( false );
		txtCodProdItem.setNomeCampo( "CodProd" );
		lcDetItens.setTabela( tabItens );

		// Fim Detalhe Itens

		// Detalhe Distribui��o

		lcEstDistrib.add( new GuardaCampo( txtCodProdDistrib, "Codprod", "C�d.prod.", ListaCampos.DB_PK, txtDescEstDistrib, true ) );
		lcEstDistrib.add( new GuardaCampo( txtSeqEstDistrib, "seqest", "Seq.Est.", ListaCampos.DB_PK, txtDescEstDistrib, true ) );
		lcEstDistrib.add( new GuardaCampo( txtDescEstDistrib, "DescEst", "Descri��o da estrutura", ListaCampos.DB_SI, false ) );
		lcEstDistrib.setWhereAdic( "ATIVOEST='S'" );
		lcEstDistrib.montaSql( false, "ESTRUTURA", "PP" );
		lcEstDistrib.setReadOnly( true );
		lcEstDistrib.setQueryCommit( false );
		txtCodProdDistrib.setListaCampos( lcEstDistrib );
		txtCodProdDistrib.setTabelaExterna( lcEstDistrib );
		txtCodProdDistrib.setNomeCampo( "Codprod" );
		txtCodProdDistrib.setFK( true );
		txtSeqEstDistrib.setListaCampos( lcEstDistrib );
		txtSeqEstDistrib.setTabelaExterna( lcEstDistrib );
		txtSeqEstDistrib.setNomeCampo( "seqest" );
		txtSeqEstDistrib.setFK( true );
		txtDescEstDistrib.setListaCampos( lcEstDistrib );

		setPainel( pinDetDistrib );
		setListaCampos( lcDetDistrib );

		adicCampo( txtSeqDistrib, 7, 20, 60, 20, "seqde", "Seq.", ListaCampos.DB_PK, true );
		adicCampo( txtCodProdDistrib, 70, 20, 77, 20, "CodProdDe", "C�d.prod.", ListaCampos.DB_FK, true );
		adicCampo( txtSeqEstDistrib, 150, 20, 77, 20, "SeqEstDe", "Seq.Est", ListaCampos.DB_FK, txtDescEstDistrib, true );
//		adicDB( cbQtdVariavelDistrib, 7, 60, 70, 20, "QtdVariavel", "Qtd.vari�vel", true );
		adicDescFK( txtDescEstDistrib, 230, 20, 277, 20, "DescEst", "Descri��o da estrutura" );
		setListaCampos( true, "DISTRIB", "PP" );
		lcDetDistrib.setQueryInsert( false );
		lcDetDistrib.setTabela( tabDist );
		lcDetDistrib.montaTab();

		// Fim Detalhe Distribui��o

		setAltDet( 210 );
		setPainel( pinDetFases, pnDet );
		setListaCampos( lcDet );		
		lcDet.montaTab();
		lcDetItens.montaTab();

		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );

		setImprimir( true );
		tpnAbas.addChangeListener( this );

		lcCampos.addCarregaListener( this );
		lcDet.addCarregaListener( this );
		lcDet.addPostListener( this );
		lcProdEst.addCarregaListener( this );
		lcProdItem.addCarregaListener( this );
		lcDetDistrib.addCarregaListener( this );
		lcFase.addCarregaListener( this );

		tab.setTamColuna( 35, 0 );
		tab.setTamColuna( 50, 1 );
		tab.setTamColuna( 230, 2 );
		tab.setTamColuna( 80, 3 );
		tab.setTamColuna( 70, 4 );
		tab.setTamColuna( 0, 5 );
		tab.setTamColuna( 60, 6 );
		tab.setTamColuna( 0, 7 );
		
		tab.setColunaInvisivel( 5 );
		tab.setColunaInvisivel( 7 );

//		Tabela Itens X Fase
		
		tabItens.setTamColuna( 35, 0 );
		tabItens.setTamColuna( 60, 1 );
		tabItens.setTamColuna( 340, 2 );
		tabItens.setTamColuna( 80, 3 );
		tabItens.setTamColuna( 40, 4 );
		tabItens.setTamColuna( 75, 5 );

//		Tabela Distribuicao X Fase		
		
		tabDist.setTamColuna( 35, 0 );
		tabDist.setTamColuna( 60, 1 );
		tabDist.setTamColuna( 50, 2 );
		tabDist.setTamColuna( 370, 3 );
		tabItens.setTamColuna( 75, 4 );

		cbRmaAutoItEst.setEnabled( false );
		setAltDet( 190 );
		navRod.setListaCampos( lcDet );
		lcDet.setNavegador( navRod );
		nav.setListaCampos( lcCampos );
		lcCampos.setNavegador( nav );

	}

	private void imprimir( boolean bVisualizar ) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		String sSQL = null;
		String sWhere = "";
		String[] sValores;
		DLREstrutura dl = null;
		ImprimeOS imp = null;
		int linPag = 0;

		try {
			dl = new DLREstrutura();
			dl.setVisible( true );
			if ( dl.OK == false ) {
				dl.dispose();
				return;
			}
			sValores = dl.getValores();
			dl.dispose();

			if ( sValores[ 2 ].equals( "A" ) ) {
				sWhere += " AND E.CODPROD=" + txtCodProdEst.getVlrString();
				sWhere += " AND E.SEQEST=" + txtSeqEst.getVlrString();
			}

			imp = new ImprimeOS( "", con );
			linPag = imp.verifLinPag() - 1;
			imp.montaCab();
			imp.setTitulo( "Relat�rio de Estrutura do Produto" );
			imp.limpaPags();

			if ( sValores[ 1 ].equals( "R" ) ) {

				try {

					sSQL = "SELECT E.CODPROD, PD.DESCPROD, E.SEQEST, E.QTDEST, E.DESCEST, " + "E.ATIVOEST, E.CODMODLOTE, E.NRODIASVALID " + "FROM PPESTRUTURA E, EQPRODUTO PD " + "WHERE PD.CODEMP=E.CODEMP AND PD.CODFILIAL=E.CODFILIAL AND E.CODPROD=PD.CODPROD " + sWhere + " ORDER BY " + sValores[ 0 ];

					ps = con.prepareStatement( sSQL );
					rs = ps.executeQuery();
					while ( rs.next() ) {
						if ( imp.pRow() == 0 ) {
							imp.impCab( 136, true );
							imp.say( imp.pRow() + 0, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( "-", 133 ) + "|" );
							imp.say( imp.pRow() + 1, 0, "| C�d.prod." );
							imp.say( imp.pRow() + 0, 13, "| Descri��o do produto" );
							imp.say( imp.pRow() + 0, 50, "| Seq.Est." );
							imp.say( imp.pRow() + 0, 60, "| Qtd." );
							imp.say( imp.pRow() + 0, 70, "| Descri��o" );
							imp.say( imp.pRow() + 0, 101, "| Ativo" );
							imp.say( imp.pRow() + 0, 110, "| Mod.Lote" );
							imp.say( imp.pRow() + 0, 121, "| Valid" );
							imp.say( imp.pRow() + 0, 135, "|" );
						}

						imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
						imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( "-", 133 ) + "|" );
						imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
						imp.say( imp.pRow() + 0, 0, "| " + rs.getString( "CodProd" ) );
						imp.say( imp.pRow() + 0, 13, "| " + rs.getString( "DescProd" ).substring( 0, 34 ) );
						imp.say( imp.pRow() + 0, 50, "| " + rs.getString( "SeqEst" ) );
						imp.say( imp.pRow() + 0, 60, "| " + rs.getString( "QtdEst" ) );
						imp.say( imp.pRow() + 0, 70, "| " + rs.getString( "DescEst" ).substring( 0, 29 ) );
						imp.say( imp.pRow() + 0, 100, "| " + ( rs.getString( "AtivoEst" ).equals( "S" ) ? "Sim" : "N�o" ) );
						imp.say( imp.pRow() + 0, 110, "| " + rs.getString( "CodModLote" ) );
						imp.say( imp.pRow() + 0, 121, "| " + rs.getString( "NroDiasValid" ) + " Dias" );
						imp.say( imp.pRow() + 0, 135, "|" );

						if ( imp.pRow() >= linPag ) {
							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "+" + Funcoes.replicate( "=", 133 ) + "+" );
							imp.incPags();
							imp.eject();
						}
					}
					imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
					imp.say( imp.pRow() + 0, 0, "+" + Funcoes.replicate( "=", 133 ) + "+" );

					imp.eject();
					imp.fechaGravacao();

					if ( !con.getAutoCommit() )
						con.commit();
					dl.dispose();
				} catch ( SQLException err ) {
					Funcoes.mensagemErro( this, "Erro consulta tabela de estrutura do produto!\n" + err.getMessage(), true, con, err );
				}
			}
			else if ( sValores[ 1 ].equals( "C" ) ) {

				sSQL = "SELECT E.CODPROD, PD.DESCPROD, E.SEQEST, E.QTDEST, E.DESCEST, E.ATIVOEST, " + "E.CODMODLOTE, E.NRODIASVALID, IT.SEQITEST, IT.CODPRODPD, PI.DESCPROD, IT.QTDITEST, " + "IT.CODFASE, F.DESCFASE, IT.RMAAUTOITEST "
						+ "FROM PPESTRUTURA E, PPITESTRUTURA IT, EQPRODUTO PD, EQPRODUTO PI, PPFASE F " + "WHERE E.CODPROD=PD.CODPROD AND E.CODEMP=PD.CODEMP AND E.CODFILIAL=PD.CODFILIAL " + "AND IT.CODPROD=E.CODPROD AND IT.SEQEST=E.SEQEST AND IT.CODEMP=E.CODEMP AND IT.CODFILIAL=E.CODFILIAL "
						+ "AND IT.CODPRODPD=PI.CODPROD AND IT.CODEMPPD=PI.CODEMP AND IT.CODFILIALPD=PI.CODFILIAL " + "AND IT.CODFASE=F.CODFASE AND IT.CODEMPFS=F.CODEMP AND IT.CODFILIALFS=F.CODFILIAL " + sWhere + " ORDER BY " + sValores[ 0 ] + ", IT.CODPROD, IT.CODFASE";

				try {

					String sCodProd = txtCodProdEst.getVlrString();
					int cont = 0;

					ps = con.prepareStatement( sSQL );
					rs = ps.executeQuery();
					while ( rs.next() ) {
						if ( imp.pRow() >= linPag ) {
							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "+" + Funcoes.replicate( "=", 133 ) + "+" );
							imp.incPags();
							imp.eject();
						}
						if ( imp.pRow() == 0 ) {
							imp.impCab( 136, true );
							imp.say( imp.pRow() + 0, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( " ", 133 ) + "|" );
						}
						if ( !sCodProd.equals( rs.getString( 1 ) ) ) {
							cont = 0;
							sCodProd = rs.getString( 1 );
						}
						if ( sCodProd.equals( rs.getString( 1 ) ) && cont == 0 ) {
							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( "=", 133 ) + "|" );
							imp.say( imp.pRow() + 1, 0, "| C�d.prod." );
							imp.say( imp.pRow() + 0, 13, "| Descri��o do produto" );
							imp.say( imp.pRow() + 0, 50, "| Seq.Est." );
							imp.say( imp.pRow() + 0, 60, "| Qtd." );
							imp.say( imp.pRow() + 0, 70, "| Descri��o" );
							imp.say( imp.pRow() + 0, 101, "| Ativo" );
							imp.say( imp.pRow() + 0, 110, "| Mod.Lote" );
							imp.say( imp.pRow() + 0, 121, "| Valid" );
							imp.say( imp.pRow() + 0, 135, "|" );
							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( "=", 133 ) + "|" );

							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "| " + rs.getString( 1 ) );
							imp.say( imp.pRow() + 0, 13, "| " + rs.getString( 2 ).substring( 0, 34 ) );
							imp.say( imp.pRow() + 0, 50, "| " + rs.getString( 3 ) );
							imp.say( imp.pRow() + 0, 60, "| " + rs.getString( 4 ) );
							imp.say( imp.pRow() + 0, 70, "| " + rs.getString( 5 ).substring( 0, 29 ) );
							imp.say( imp.pRow() + 0, 100, "| " + ( rs.getString( 6 ).equals( "S" ) ? "Sim" : "N�o" ) );
							imp.say( imp.pRow() + 0, 110, "| " + rs.getString( 7 ) );
							imp.say( imp.pRow() + 0, 121, "| " + rs.getString( 8 ) + " Dias" );
							imp.say( imp.pRow() + 0, 135, "|" );
							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( "-", 133 ) + "|" );
							imp.say( imp.pRow() + 1, 0, "| Item" );
							imp.say( imp.pRow() + 0, 8, "| Cod.prod" );
							imp.say( imp.pRow() + 0, 20, "| Descri��o do produto" );
							imp.say( imp.pRow() + 0, 60, "| Qtd." );
							imp.say( imp.pRow() + 0, 70, "| Cod.fase" );
							imp.say( imp.pRow() + 0, 80, "| Descri��o da fase" );
							imp.say( imp.pRow() + 0, 123, "| Auto Rma" );
							imp.say( imp.pRow() + 0, 135, "|" );
							imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
							imp.say( imp.pRow() + 0, 0, "|" + Funcoes.replicate( "-", 133 ) + "|" );
							cont++;
						}
						imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
						imp.say( imp.pRow() + 0, 0, "| " + rs.getString( 9 ) );
						imp.say( imp.pRow() + 0, 8, "| " + rs.getString( 10 ) );
						imp.say( imp.pRow() + 0, 20, "| " + rs.getString( 11 ).substring( 0, 38 ) );
						imp.say( imp.pRow() + 0, 60, "| " + rs.getString( 12 ) );
						imp.say( imp.pRow() + 0, 70, "| " + rs.getString( 13 ) );
						imp.say( imp.pRow() + 0, 80, "| " + rs.getString( 14 ).substring( 0, 38 ) );
						imp.say( imp.pRow() + 0, 123, "|   " + ( rs.getString( 15 ).equals( "S" ) ? "Sim" : "N�o" ) );
						imp.say( imp.pRow() + 0, 135, "|" );
					}
					imp.say( imp.pRow() + 1, 0, "" + imp.comprimido() );
					imp.say( imp.pRow() + 0, 0, "+" + Funcoes.replicate( "=", 133 ) + "+" );

					imp.eject();
					imp.fechaGravacao();

					if ( !con.getAutoCommit() )
						con.commit();
					dl.dispose();

				} catch ( SQLException err ) {
					Funcoes.mensagemErro( this, "Erro consulta tabela de insumos do produto!\n" + err.getMessage(), true, con, err );
				}
			}

			if ( bVisualizar )
				imp.preview( this );
			else
				imp.print();

		} finally {
			ps = null;
			rs = null;
			sSQL = null;
			sWhere = null;
			sValores = null;
			dl = null;
			imp = null;
		}

	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp )
			imprimir( true );
		else if ( evt.getSource() == btImp )
			imprimir( false );
		super.actionPerformed( evt );
	}

	public void stateChanged( ChangeEvent cevt ) {

		if ( ( (JTabbedPanePad) ( cevt.getSource() ) ) == tpnAbas ) {
			if ( tpnAbas.getSelectedIndex() == 0 ) {
				setAltDet( 200 );
				pnDet.removeAll();
				setPainel( pinDetFases, pnDet );
				setListaCampos( lcDet );
				pnDet.repaint();
				navRod.setListaCampos( lcDet );
				navRod.setAtivo( 6, true );
			}
			else if ( tpnAbas.getSelectedIndex() == 1 ) {
				setAltDet( 110 );
				pnDet.removeAll();
				setPainel( pinDetItens, pnDet );
				setListaCampos( lcDetItens );
				pnDet.repaint();
				navRod.setListaCampos( lcDetItens );
				navRod.setAtivo( 6, true );
			}
			else if ( tpnAbas.getSelectedIndex() == 2 ) {
				setAltDet( 110 );
				pnDet.removeAll();
				setPainel( pinDetDistrib, pnDet );
				setListaCampos( lcDetDistrib );
				pnDet.repaint();
				navRod.setListaCampos( lcDetDistrib );
				navRod.setAtivo( 6, false );
			}
		}
	}

	public void afterCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcProdItem ) {
			String sRma = txtRMA.getVlrString();
			if ( sRma.equals( "S" ) )
				cbRmaAutoItEst.setEnabled( true );
			else
				cbRmaAutoItEst.setEnabled( false );
		}
		else if ( cevt.getListaCampos() == lcProdEst ) {
			if ( txtCLoteProd.getVlrString().equals( "S" ) ) {
				txtCodModLote.setAtivo( true );
				txtNroDiasValid.setAtivo( true );
			}
			else {
				txtCodModLote.setAtivo( false );
				txtNroDiasValid.setAtivo( false );
			}
		}
		else if ( cevt.getListaCampos() == lcDet ) {
			bloqueiaAbas();
		}
	}

	private void bloqueiaAbas() {
		
		if ( cbFinaliza.getStatus() ) {
			tpnAbas.setEnabledAt( 3, true );
		}
		else {
			tpnAbas.setEnabledAt( 3, false );
		}
		
		if(txtTipoFase.getVlrString().equals( "CQ" )){
			tpnAbas.setEnabledAt( 2, true );
		}
		else {
			tpnAbas.setEnabledAt( 2, false );
		}
		
	}
	
	public void beforeCarrega( CarregaEvent cevt ) {

	}

	public void afterPost( PostEvent pevt ) {

		if ( pevt.getListaCampos() == lcCampos ) {
			if ( tpnAbas.getSelectedIndex() != 0 )
				tpnAbas.setSelectedIndex( 1 );
		}
		else if ( pevt.getListaCampos() == lcDet ) {
			bloqueiaAbas();
		}
	}

	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		lcProdEst.setConexao( cn );
		lcProdItem.setConexao( cn );
		lcModLote.setConexao( cn );
		lcTipoRec.setConexao( cn );
		lcFase.setConexao( cn );
		lcDetDistrib.setConexao( cn );
		lcDetItens.setConexao( cn );
		lcEstDistrib.setConexao( cn );
	}
}

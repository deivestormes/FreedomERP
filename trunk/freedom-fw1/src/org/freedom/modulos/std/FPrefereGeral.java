/**
 * @version 23/11/2004 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez e Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FPrefereGeral.java <BR>
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
 * Tela de cadastro das prefer�ncias do sistema. Esse cadastro � utilizado para parametrizar o sistema de acordo com as necessidades espec�ficas da empresa.
 * 
 */

package org.freedom.modulos.std;

import org.freedom.infra.model.jdbc.DbConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory; 
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.CheckBoxEvent;
import org.freedom.acao.CheckBoxListener;
import org.freedom.acao.EditEvent;
import org.freedom.acao.EditListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JButtonPad;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JComboBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JPasswordFieldPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.PainelImagem;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.FTabDados;

public class FPrefereGeral extends FTabDados implements CheckBoxListener, ActionListener, PostListener, EditListener, InsertListener, CarregaListener {

	private static final long serialVersionUID = 1L;
	
	private static final String RETRATO_DANFE = "1";
	
	private static final String PAISAGEM_DANFE = "2";
	
	private static final String PRODUCAO_NFE = "1";
	
	private static final String HOMOLOGACAO_NFE = "2";
	
	private static final String APLIC_CONTRIB_NFE = "0";
	
	private static final String APLIC_FISCO_NFE = "3";	

	private JPanelPad pinVenda = new JPanelPad( 690, 220 );

	private JPanelPad pinGeral = new JPanelPad( 330, 200 );

	private JPanelPad pinPreco = new JPanelPad( 330, 200 );
	
	private JPanelPad pinCompra = new JPanelPad( 330, 200 );

	private JPanelPad pinOrc = new JPanelPad( 330, 200 );

	private JPanelPad pinFin = new JPanelPad();

	private JPanelPad pinCtb = new JPanelPad();

	private JPanelPad pinSVV = new JPanelPad();

	private JPanelPad pinDev = new JPanelPad();

	private JPanelPad pinEstoq = new JPanelPad();
	
	private JPanelPad pinNFe = new JPanelPad();
	
	private JPanelPad pinRecursos = new JPanelPad();
	
	private JPanelPad pinFrete = new JPanelPad();

	private JPanelPad pinEmail = new JPanelPad();

//	private JPanelPad pinSmtp = new JPanelPad();

	private JPanelPad pinProd = new JPanelPad();

	private JPanelPad pinOpcoesVenda = new JPanelPad();

	private JPanelPad pinOpcoesGeral = new JPanelPad();
	
	private JPanelPad pinCompras = new JPanelPad();

	private JTextFieldPad txtCodMoeda = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private JTextFieldFK txtDescMoeda = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JCheckBoxPad cbGeraPagEmis = new JCheckBoxPad( "Gera contas a pagar a partir da data de emiss�o.", "S", "N" ); 
	
	private JCheckBoxPad cbGeraRecEmis = new JCheckBoxPad( "Gera contas a receber a partir da data de emiss�o.", "S", "N" );
	
	private JTextFieldPad txtUrlWsCep = new JTextFieldPad( JTextFieldPad.TP_STRING, 150, 0 );

	private JTextFieldPad txtCodTabJuros = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldFK txtDescTabJuros = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodHistRec = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldFK txtDescHistRec = new JTextFieldFK( JTextFieldPad.TP_STRING, 80, 0 );

	private JTextFieldPad txtCodHistPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldFK txtDescHistPag = new JTextFieldFK( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtCodMarca = new JTextFieldPad( JTextFieldPad.TP_STRING, 6, 0 );

	private JTextFieldFK txtDescMarca = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodGrup = new JTextFieldPad( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldFK txtDescGrup = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodFor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescFor = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodTipoFor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldPad txtCodTipoCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescTipoFor = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldFK txtDescTipoCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodTipoMov = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov2 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov3 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov4 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov5 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov6 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov7 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTipoMov8 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldPad txtCodTipoMov9 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTransp = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCasasDec = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 1, 0 );

	private JTextFieldPad txtCasasDecFin = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 1, 0 );

	private JTextFieldPad txtPercPrecoCusto = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 6, 2 );

	private JTextFieldPad txtAnoCC = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 4, 0 );

	private JTextFieldPad txtDescClassOrc = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtDescClassPed = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtDescClassNfe = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtDirNfe = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtDescClassCp = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtObs01 = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtObs02 = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtObs03 = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtObs04 = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtDescOrc = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );

	private JTextFieldPad txtTitOrcTxt01 = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private JTextFieldPad txtCodMens = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
	 
	private JTextFieldFK txtDescMens = new JTextFieldFK(JTextFieldPad.TP_STRING,1000,0);
	
	private JTextFieldPad txtCodMensGeral = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
	 
	private JTextFieldFK txtDescMensGeral = new JTextFieldFK(JTextFieldPad.TP_STRING,1000,0);

	private JTextFieldFK txtDescTipoMov = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescTipoMov2 = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescTipoMov3 = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescTipoMov4 = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescTipoMov5 = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtDescTipoMov6 = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtDescTipoMov7 = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtDescTipoMov8 = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldFK txtDescTipoMov9 = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtDescTransp = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtCodPlanoPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodPlanoPag2 = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtPrazo = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodTab = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodClasCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescPlanoPag = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescPlanoPag2 = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescTab = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescClasCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldFK txtDescCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtServidorSMTP = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtPortaSMTP = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldPad txtUsuarioSMTP = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );
	
	private final JTextFieldPad txtEndEmail = new JTextFieldPad( JTextFieldPad.TP_STRING, 60, 0 );
	
	private final JPasswordFieldPad txtSenhaSMTP = new JPasswordFieldPad( 30 );
	
	private JTextFieldPad txtCodPlanJR = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDescPlanJR = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCodPlanJP = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDescPlanJP = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCodPlanDC = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDescPlanDC = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCodPlanDR = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	
	private JTextFieldFK txtDescPlanDR = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtDiasVencOrc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final String opcoes = "Op��es";

	private JLabelPad lbCompOpcoes = new JLabelPad( opcoes, SwingConstants.CENTER );

	private JLabelPad lbGeralOpcoes = new JLabelPad( opcoes, SwingConstants.CENTER );

	private JLabelPad lbOrcOpcoes = new JLabelPad( opcoes, SwingConstants.CENTER );

	private JLabelPad lbProdOpcoes = new JLabelPad( opcoes, SwingConstants.CENTER );
	
	private JLabelPad lbRecursos = new JLabelPad( opcoes, SwingConstants.CENTER );
	
	private JLabelPad lbFrete = new JLabelPad( opcoes, SwingConstants.CENTER );

	private JLabelPad lbCtbOpcoes = new JLabelPad( opcoes, SwingConstants.CENTER );

	private JLabelPad lbPrcOpcoes = new JLabelPad( opcoes, SwingConstants.CENTER );

	private JLabelPad lbOrcCont = new JLabelPad();

	private JPanelPad pnEstOpcoes = new JPanelPad();

	private JLabelPad lbProdCont = new JLabelPad();
	
	private JLabelPad lbRecursosCont = new JLabelPad();
	
	private JLabelPad lbFreteCont = new JLabelPad();

	private JLabelPad lbFinOpcoes = new JLabelPad();
	
	private JLabelPad lbFinPagar = new JLabelPad();
	
	private JLabelPad lbFinLibCred = new JLabelPad();
	
	private JLabelPad lbFinDefinicoes = new JLabelPad();
	
	private JLabelPad lbFinContas = new JLabelPad();

	private JLabelPad lbCtbCont = new JLabelPad();

	private JLabelPad lbPrcCont = new JLabelPad();

	private JRadioGroup<String, String> rgTipoValidOrc = null;

	private JRadioGroup<String, String> rgTipoPrecoCusto = null;

	private JRadioGroup<String, String> rgSetorVenda = null;
	
	private JRadioGroup<String, String> rgTipoClass = null;

	private JRadioGroup<String, String> rgOrdNota = null;

	private JRadioGroup<String, String> rgLibCred = null;

	private JRadioGroup<String, String> rgCodBar = null;
	
	private JRadioGroup<String, String> rgTipoCred = null;

	private JComboBoxPad cbSisContabil = null;

	private JComboBoxPad cbTamDescProd = null;

	private final JCheckBoxPad cbUsaRefProd = new JCheckBoxPad( "Usa refer�ncia.", "S", "N" );

	private final JCheckBoxPad cbUsaPedSeq = new JCheckBoxPad( "Pedido sequencial.", "S", "N", true );
	
	private final JCheckBoxPad cbSomaVolumes = new JCheckBoxPad( "Soma volumes na venda.", "S", "N" );

	private final JCheckBoxPad cbUsaOrcSeq = new JCheckBoxPad( "Or�amento sequencial.", "S", "N", true );

	private final JCheckBoxPad cbUsaDescEspelho = new JCheckBoxPad( "Desconto no espelho.", "S", "N" );

	private final JCheckBoxPad cbUsaClasComis = new JCheckBoxPad( "Classifica comiss�o na venda", "S", "N" );

	private final JCheckBoxPad cbTabFreteVd = new JCheckBoxPad( "Aba frete na venda.", "S", "N", true );

	private final JCheckBoxPad cbVendaMatPrim = new JCheckBoxPad( "Permitir venda de mat�ria prima.", "S", "N" );
	
	private final JCheckBoxPad cbVendaImobilizado = new JCheckBoxPad( "Permitir venda de Imobilizado.", "S", "N" );
	
	private final JCheckBoxPad cbGeraCodUnif = new JCheckBoxPad( "Gera c�digos unificados para Clientes/Fornecedores/Transportadora/Filial.", "S", "N" );
	
	private final JCheckBoxPad cbVisualizaLucr = new JCheckBoxPad( "Mostrar lucratividade no pedido.", "S", "N" );

	private final JCheckBoxPad cbTabAdicVd = new JCheckBoxPad( "Aba adic. na venda.", "S", "N" );

	private final JCheckBoxPad cbTravaTMNFVD = new JCheckBoxPad( "Travar tipo de Mov. NF na inserc. da venda.", "S", "N", true );

	private final JCheckBoxPad cbJurosPosCalc = new JCheckBoxPad( "Juros p�s-calculado.", "S", "N" );

	private final JCheckBoxPad cbRgCliObrig = new JCheckBoxPad( "RG. do cliente obrigat�rio.", "S", "N", true );
	
	private final JCheckBoxPad cbUsuAtivCli = new JCheckBoxPad( "Acesso para ativa��o de cliente por usu�rio.", "S", "N");

	private final JCheckBoxPad cbCliMesmoCnpj = new JCheckBoxPad( "Permitir clientes com mesmo CNPJ.", "S", "N" );

	private final JCheckBoxPad cbCnpjCliObrig = new JCheckBoxPad( "CNPJ obrigat�rio para o cadastro de clientes.", "S", "N", true );

	private final JCheckBoxPad cbCnpjForObrig = new JCheckBoxPad( "CNPJ obrigat�rio para o cadastro de fornecedores.", "S", "N", true );

	private final JCheckBoxPad cbInscEstForObrig = new JCheckBoxPad( "Inscri��o estadual obrigat�ria para o cadastro de fornecedores.", "S", "N", true );

	private final JCheckBoxPad cbEstLotNeg = new JCheckBoxPad( "Permite saldo lote negativo.", "S", "N" );
	
	private final JCheckBoxPad cbUsaRefCompra = new JCheckBoxPad ("Usa refer�ncia na compra. ", "S", "N" );
	
	private final JCheckBoxPad cbTransAbaCp = new JCheckBoxPad( "Aba transp. na tela de compras.", "S", "N" );
	
	private final JCheckBoxPad cbImportAbaCp = new JCheckBoxPad( "Aba Importa��o na tela de compras.", "S", "N" );

	private final JCheckBoxPad cbTabSolCp = new JCheckBoxPad( "Aba solicita��o na tela de compras.", "S", "N" );
	
	private final JCheckBoxPad cbPrecoRel = new JCheckBoxPad( "Mostra pre�o de compra nos relat�rios.", "S", "N", true );

	private final JCheckBoxPad cbEstNeg = new JCheckBoxPad( "Permite saldo negativo.", "S", "N" );

	private final JCheckBoxPad cbEstNegGrupo = new JCheckBoxPad( "Controle de saldo negativo por grupo.", "S", "N" );

	private final JCheckBoxPad cbNatVenda = new JCheckBoxPad( "Habilitar campo CFOP.", "S", "N", true );

	private final JCheckBoxPad cbIPIVenda = new JCheckBoxPad( "Habilitar campo IPI.", "S", "N", true );

	private final JCheckBoxPad cbIcmsVenda = new JCheckBoxPad( "Habilitar campos de ICMS.", "S", "N" );

	private final JCheckBoxPad cbIcmsFrete = new JCheckBoxPad( "Habilitar campos de ICMS para Frete.", "S", "N" );

	private final JCheckBoxPad cbComisPDupl = new JCheckBoxPad( "Calcula comiss�o com base nas duplicatas.", "S", "N", true );

	private final JCheckBoxPad cbCustosSICMS = new JCheckBoxPad( "Pre�o de custo sem ICMS.", "S", "N", true );

	private final JCheckBoxPad cbBloqVenda = new JCheckBoxPad( "Bloquear venda ap�s impress�o da NF.", "S", "N" );

	private final JCheckBoxPad cbBloqCompra = new JCheckBoxPad( "Bloquear compra ap�s finalizar.", "S", "N" );

	private final JCheckBoxPad cbPepsProd = new JCheckBoxPad( "Exibe custo PEPS no cadastro de produtos.", "S", "N" );

	private final JCheckBoxPad cbBuscaProdSimilar = new JCheckBoxPad( "Busca autom�tica de produtos similares.", "S", "N" );

	private final JCheckBoxPad cbMultiAlmox = new JCheckBoxPad( "Multi almoxarifados.", "S", "N" );
	
	private final JCheckBoxPad cbUsaIbgeCli = new JCheckBoxPad( "Usar a tabela de IBGE para o cadastro de clientes.", "S", "N" );
	
	private final JCheckBoxPad cbUsaIbgeFor = new JCheckBoxPad( "Usar a tabela de IBGE para o cadastro de fornecedores.", "S", "N" );
	
	private final JCheckBoxPad cbUsaIbgeTransp = new JCheckBoxPad( "Usar a tabela de IBGE para o cadastro de transportadores.", "S", "N" );

	private final JCheckBoxPad cbPrazoEnt = new JCheckBoxPad( "Prazo de entrega na venda.", "S", "N", true );

	private final JCheckBoxPad cbDiasPEData = new JCheckBoxPad( "Data de entrega no pedido.", "S", "N" );

	private final JCheckBoxPad cbDescCompl = new JCheckBoxPad( "Descri��o completa do produto para Or�amento e Pedido.", "S", "N" );

	private final JCheckBoxPad cbObsCliVend = new JCheckBoxPad( "Mostrar Obs. do cliente na venda e or�amento.", "S", "N" );

	private final JCheckBoxPad cbContEstoq = new JCheckBoxPad( "Controla estoque.", "S", "N" );

	private final JCheckBoxPad cbReCalcVenda = new JCheckBoxPad( "Recalcular pre�o na venda.", "S", "N" );

	private final JCheckBoxPad cbReCalcOrc = new JCheckBoxPad( "Recalcular pre�o no or�amento.", "S", "N" );

	private final JCheckBoxPad cbAprovOrc = new JCheckBoxPad( "Permitir aprova��o do or�amento na tela de cadastro.", "S", "N" );

	private final JCheckBoxPad cbLayoutPed = new JCheckBoxPad( "Usar layout personalizado para pedido.", "S", "N" );

	private final JCheckBoxPad cbVerifAltParVenda = new JCheckBoxPad( "Verificar usuario para alterar parcelas.", "S", "N" );

	private final JCheckBoxPad cbUsaBuscGenProd = new JCheckBoxPad( "Busca generica do c�digo do produto.", "S", "N" );

	private final JCheckBoxPad cbFilBuscGenProd1 = new JCheckBoxPad( "C�digo do produto.", "S", "N" );

	private final JCheckBoxPad cbFilBuscGenProd2 = new JCheckBoxPad( "Refer�ncia do produto.", "S", "N" );

	private final JCheckBoxPad cbFilBuscGenProd3 = new JCheckBoxPad( "C�digo de barras", "S", "N" );

	private final JCheckBoxPad cbFilBuscGenProd4 = new JCheckBoxPad( "C�digo do fabricante", "S", "N" );

	private final JCheckBoxPad cbUsaBuscGenProdORC = new JCheckBoxPad( "Permitir busca generica de produto no or�amento.", "S", "N" );

	private final JCheckBoxPad cbUsaLoteOrc = new JCheckBoxPad( "Usa lote no or�amento.", "S", "N" );

	private final JCheckBoxPad cbBuscaVlrUltCompra = new JCheckBoxPad( "Busca valor da ultima compra.", "S", "N" );

	private final JCheckBoxPad cbHabiitaCustoCompra = new JCheckBoxPad( "Habilita campo de custo na compra.", "S", "N" );

	private final JCheckBoxPad cbUsaPrecoZero = new JCheckBoxPad( "Permite pre�o de produto Zero.", "S", "N" );

	private final JCheckBoxPad cbUsaImgOrc = new JCheckBoxPad( "Usar imagem de assinatura no or�amento.", "S", "N" );
	
	private final JCheckBoxPad cbUsaNomeVendOrc = new JCheckBoxPad( "Usar nome do comissionado no or�amento.", "S", "N" );

	private final JCheckBoxPad cbConsCPFCli = new JCheckBoxPad( "Validar CPF no cliente.", "S", "N", true );

	private final JCheckBoxPad cbConsIECli = new JCheckBoxPad( "Validar IE no cliente.", "S", "N", true );
	
	private final JCheckBoxPad cbConsIECliFisica = new JCheckBoxPad( "consistir insc. estadual para clientes pessoa f�sica.", "S", "N" );
	
	private final JCheckBoxPad cbMostraTransp = new JCheckBoxPad( "Mostra aba transportadora na tela or�amento.", "S", "N" );
	
	private final JCheckBoxPad cbGeraComisVendaOrc = new JCheckBoxPad( "Carrega comiss�o do or�amento.", "S", "N" );
	
	private final JCheckBoxPad cbCredIcmsSimples = new JCheckBoxPad( "Destaca cr�dito de ICMS (Simples).", "S", "N" );

	private final JCheckBoxPad cbConsIEFor = new JCheckBoxPad( "Validar IE do fornecedor.", "S", "N", true );

	private final JCheckBoxPad cbAltItRecImpBol = new JCheckBoxPad( "Atualiza parcela na impress�o do boleto.", "S", "N" );

	private final JCheckBoxPad cbEstItRecAltDtVenc = new JCheckBoxPad( "Estorna parcela na altera��o da data de vencimento.", "S", "N" );
	
	private final JCheckBoxPad cbAdicCodOrcObsPed = new JCheckBoxPad( "Adicionar c�digos de or�amentos na observa��o do pedido.", "S", "N" );
	
	private final JCheckBoxPad cbMultiComis = new JCheckBoxPad( "Multi-comissionado.", "S", "N" );
	
	private final JCheckBoxPad cbLiberacaoCreGlobal = new JCheckBoxPad( "Libera��o de cr�dito globalizado.", "S", "N" );
	
	private final JCheckBoxPad cbComissManut = new JCheckBoxPad( "Comissionado obrigar�rio na manuten��o de comiss�es.", "S", "N" );
	
	private final JCheckBoxPad cbBuscaCep = new JCheckBoxPad( "Habilita a busca de endere�o via CEP.", "S", "N" );
	
	private final JCheckBoxPad cbLancaFinContr = new JCheckBoxPad( "Permite lan�amento financeiro em contrato.", "S", "N" );
	
	private final JCheckBoxPad cbLancaRMAContr = new JCheckBoxPad( "Permite lan�amento de RMA em contrato.", "S", "N" );
	
	private final JCheckBoxPad cbInfCPDevolucao = new JCheckBoxPad( "Informar compra na devolu��o ?", "S", "N" );
	
	private final JCheckBoxPad cbAutenticaSMTP = new JCheckBoxPad( "Autenticar ?", "S", "N" );
	
	private final JCheckBoxPad cbSSLSMTP = new JCheckBoxPad( "Usa SSL ?", "S", "N" );
	
	private final JCheckBoxPad cbInfVdRemessa = new JCheckBoxPad( "Permite vincular item com remessa ?", "S", "N" );
	
	private PainelImagem imgAssOrc = new PainelImagem( 65000 );

	private ListaCampos lcMoeda = new ListaCampos( this, "MO" );

	private ListaCampos lcTabJuros = new ListaCampos( this, "TJ" );
	
	private ListaCampos lcHistRec = new ListaCampos( this, "HISTREC" );
	
	private ListaCampos lcHistPag = new ListaCampos( this, "HISTPAG" );
	
	private ListaCampos lcPlanJR = new ListaCampos( this, "JR" );
	
	private ListaCampos lcPlanJP = new ListaCampos( this, "JP" );
	
	private ListaCampos lcPlanDC = new ListaCampos( this, "DC" );
	
	private ListaCampos lcPlanDR = new ListaCampos( this, "DR" );

	private ListaCampos lcMarca = new ListaCampos( this, "MC" );

	private ListaCampos lcGrupo = new ListaCampos( this, "GP" );

	private ListaCampos lcTipoFor = new ListaCampos( this, "TF" );
	
	private ListaCampos lcTipoCli = new ListaCampos( this, "TC" );

	private ListaCampos lcFor = new ListaCampos( this, "FR" );

	private ListaCampos lcTipoMov = new ListaCampos( this, "TM" );

	private ListaCampos lcTipoMov2 = new ListaCampos( this, "T2" );

	private ListaCampos lcTipoMov3 = new ListaCampos( this, "T3" );

	private ListaCampos lcTipoMov4 = new ListaCampos( this, "T4" );

	private ListaCampos lcTipoMov5 = new ListaCampos( this, "T5" );

	private ListaCampos lcTipoMov6 = new ListaCampos( this, "T6" );

	private ListaCampos lcTipoMov7 = new ListaCampos( this, "TM" );

	private ListaCampos lcTipoMov8 = new ListaCampos( this, "T8" );
	
	private ListaCampos lcTipoMov9 = new ListaCampos( this, "T9" );

	private ListaCampos lcTransp = new ListaCampos( this, "TN" );

	private ListaCampos lcPlanoPag = new ListaCampos( this, "PG" );

	private ListaCampos lcPlanoPag2 = new ListaCampos( this, "PP" );

	private ListaCampos lcTabPreco = new ListaCampos( this, "TB" );

	private ListaCampos lcClasCli = new ListaCampos( this, "CE" );

	private ListaCampos lcCli = new ListaCampos( this, "CL" );

	private ListaCampos lcPDV = new ListaCampos( this, "" );

	private ListaCampos lcPrefere3 = new ListaCampos( this, "P3" );
	
	private ListaCampos lcMens = new ListaCampos( this, "MENSORC" );
	
	private ListaCampos lcMensGeral = new ListaCampos( this, "MS" );
	
	private final JButtonPad btDirNfe = new JButtonPad( Icone.novo( "btAbrirPeq.gif" ) );
	
	private JRadioGroup<String, String> rgFormatoDANFE = null;
	
	private JRadioGroup<String, String> rgAmbienteNFE = null;
	
	private JRadioGroup<String, String> rgProcEmiNFE = null;
	
	private JRadioGroup<String, String> rgTipoCustoLuc = null;
	
	private JTextFieldPad txtVerProcNfe = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	public FPrefereGeral() {

		super();
		
		setTitulo( "Prefer�ncias Gerais" );
		setAtribos( 30, 40, 900, 580 );

		lcCampos.setMensInserir( false );
		lcPrefere3.setMensInserir( false );
		lcPDV.setMensInserir( false );

		Vector<String> vLabsFormatoDANFE = new Vector<String>();
		Vector<String> vValsFormatoDANFE = new Vector<String>();
		vLabsFormatoDANFE.addElement( "Retrato" );
		vLabsFormatoDANFE.addElement( "Paisagem" );
		vValsFormatoDANFE.addElement( RETRATO_DANFE );
		vValsFormatoDANFE.addElement( PAISAGEM_DANFE );
		rgFormatoDANFE = new JRadioGroup<String, String>( 1, 2, vLabsFormatoDANFE, vValsFormatoDANFE );
//		rgFormatoDANFE.setVlrInteger( new Integer(1) );
		
		Vector<String> vLabsAmbienteNFE = new Vector<String>();
		Vector<String> vValsAmbienteNFE = new Vector<String>();
		vLabsAmbienteNFE.addElement( "Produ��o" );
		vLabsAmbienteNFE.addElement( "Homologa��o" );
		vValsAmbienteNFE.addElement( PRODUCAO_NFE );
		vValsAmbienteNFE.addElement( HOMOLOGACAO_NFE );
		rgAmbienteNFE = new JRadioGroup<String, String>( 1, 2, vLabsAmbienteNFE, vValsAmbienteNFE );
		
		Vector<String> vLabsProcEmiNFE = new Vector<String>();
		Vector<String> vValsProcEmiNFE = new Vector<String>();
		vLabsProcEmiNFE.addElement( "Emiss�o com aplicativo do contribuinte (ex.:Setpoint-NFE)" );
		vLabsProcEmiNFE.addElement( "Emissao com aplicativo fornecido pelo Fisco" );
		vValsProcEmiNFE.addElement( APLIC_CONTRIB_NFE );
		vValsProcEmiNFE.addElement( APLIC_FISCO_NFE );
		rgProcEmiNFE = new JRadioGroup<String, String>( 2, 1, vLabsProcEmiNFE, vValsProcEmiNFE );

		Vector<String> vLabsTipoCustoLuc = new Vector<String>();
		Vector<String> vValsTipoCustoLuc = new Vector<String>();
		vLabsTipoCustoLuc.addElement( "MPM" );
		vLabsTipoCustoLuc.addElement( "PEPS" );
		vLabsTipoCustoLuc.addElement( "Ult.Compra" );
		vValsTipoCustoLuc.addElement( "M" );
		vValsTipoCustoLuc.addElement( "P" );
		vValsTipoCustoLuc.addElement( "U" );
		rgTipoCustoLuc = new JRadioGroup<String, String>( 1, 3, vLabsTipoCustoLuc, vValsTipoCustoLuc );

		lcMoeda.add( new GuardaCampo( txtCodMoeda, "CodMoeda", "C�d.moeda", ListaCampos.DB_PK, true ) );
		lcMoeda.add( new GuardaCampo( txtDescMoeda, "SingMoeda", "Descri��o da moeda", ListaCampos.DB_SI, false ) );
		lcMoeda.montaSql( false, "MOEDA", "FN" );
		lcMoeda.setQueryCommit( false );
		lcMoeda.setReadOnly( true );
		txtCodMoeda.setTabelaExterna( lcMoeda );

		lcHistRec.add( new GuardaCampo( txtCodHistRec, "CodHist", "C�d.Hist.Rec.", ListaCampos.DB_PK, false ) );
		lcHistRec.add( new GuardaCampo( txtDescHistRec, "DescHist", "Descri��o do hist�rico", ListaCampos.DB_SI, false ) );
		lcHistRec.montaSql( false, "HISTPAD", "FN" );
		lcHistRec.setQueryCommit( false );
		lcHistRec.setReadOnly( true );
		txtCodHistRec.setTabelaExterna( lcHistRec );

		lcHistPag.add( new GuardaCampo( txtCodHistPag, "CodHist", "C�d.Hist.Pag.", ListaCampos.DB_PK, false ) );
		lcHistPag.add( new GuardaCampo( txtDescHistPag, "DescHist", "Descri��o do hist�rico", ListaCampos.DB_SI, false ) );
		lcHistPag.montaSql( false, "HISTPAD", "FN" );
		lcHistPag.setQueryCommit( false );
		lcHistPag.setReadOnly( true );
		txtCodHistPag.setTabelaExterna( lcHistPag );
		
		lcTabJuros.add( new GuardaCampo( txtCodTabJuros, "CodTbj", "C�d.tb.jur.", ListaCampos.DB_PK, false ) );
		lcTabJuros.add( new GuardaCampo( txtDescTabJuros, "DescTbJ", "Descri��o da tabela de juros", ListaCampos.DB_SI, false ) );
		lcTabJuros.montaSql( false, "TBJUROS", "FN" );
		lcTabJuros.setQueryCommit( false );
		lcTabJuros.setReadOnly( true );
		txtCodTabJuros.setTabelaExterna( lcTabJuros );

		lcMarca.add( new GuardaCampo( txtCodMarca, "CodMarca", "C�d.marca", ListaCampos.DB_PK, false ) );
		lcMarca.add( new GuardaCampo( txtDescMarca, "DescMarca", "Descri��o da marca", ListaCampos.DB_SI, false ) );
		lcMarca.montaSql( false, "MARCA", "EQ" );
		lcMarca.setQueryCommit( false );
		lcMarca.setReadOnly( true );
		txtCodMarca.setTabelaExterna( lcMarca );

		lcGrupo.add( new GuardaCampo( txtCodGrup, "CodGrup", "C�d.grupo", ListaCampos.DB_PK, false ) );
		lcGrupo.add( new GuardaCampo( txtDescGrup, "DescGrup", "Descri��o do grupo", ListaCampos.DB_SI, false ) );
		lcGrupo.montaSql( false, "GRUPO", "EQ" );
		lcGrupo.setQueryCommit( false );
		lcGrupo.setReadOnly( true );
		txtCodGrup.setTabelaExterna( lcGrupo );

		lcFor.add( new GuardaCampo( txtCodFor, "CodFor", "C�d.for.", ListaCampos.DB_PK, false ) );
		lcFor.add( new GuardaCampo( txtDescFor, "RazFor", "Raz�o social do fornecedor", ListaCampos.DB_SI, false ) );
		lcFor.montaSql( false, "FORNECED", "CP" );
		lcFor.setQueryCommit( false );
		lcFor.setReadOnly( true );
		txtCodFor.setTabelaExterna( lcFor );

		lcTipoFor.add( new GuardaCampo( txtCodTipoFor, "CodTipoFor", "C�d.tp.for.", ListaCampos.DB_PK, false ) );
		lcTipoFor.add( new GuardaCampo( txtDescTipoFor, "DescTipoFor", "Descri��o do tipo de fornecedor", ListaCampos.DB_SI, false ) );
		lcTipoFor.montaSql( false, "TIPOFOR", "CP" );
		lcTipoFor.setQueryCommit( false );
		lcTipoFor.setReadOnly( true );
		txtCodTipoFor.setTabelaExterna( lcTipoFor );

		lcTipoCli.add( new GuardaCampo( txtCodTipoCli, "CodTipoCli", "C�d.tp.cli.", ListaCampos.DB_PK, false ) );
		lcTipoCli.add( new GuardaCampo( txtDescTipoCli, "DescTipoCli", "Descri��o do tipo de cliente", ListaCampos.DB_SI, false ) );
		lcTipoCli.montaSql( false, "TIPOCLI", "VD" );
		lcTipoCli.setQueryCommit( false );
		lcTipoCli.setReadOnly( true );
		txtCodTipoCli.setTabelaExterna( lcTipoCli );
		
		lcTipoMov.add( new GuardaCampo( txtCodTipoMov, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov.add( new GuardaCampo( txtDescTipoMov, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov.setQueryCommit( false );
		lcTipoMov.setReadOnly( true );
		txtCodTipoMov.setTabelaExterna( lcTipoMov );

		lcTipoMov2.add( new GuardaCampo( txtCodTipoMov2, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov2.add( new GuardaCampo( txtDescTipoMov2, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov2.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov2.setQueryCommit( false );
		lcTipoMov2.setReadOnly( true );
		txtCodTipoMov2.setTabelaExterna( lcTipoMov2 );

		lcTipoMov3.add( new GuardaCampo( txtCodTipoMov3, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov3.add( new GuardaCampo( txtDescTipoMov3, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov3.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov3.setQueryCommit( false );
		lcTipoMov3.setReadOnly( true );
		txtCodTipoMov3.setTabelaExterna( lcTipoMov3 );

		lcTipoMov4.add( new GuardaCampo( txtCodTipoMov4, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov4.add( new GuardaCampo( txtDescTipoMov4, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov4.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov4.setQueryCommit( false );
		lcTipoMov4.setReadOnly( true );
		txtCodTipoMov4.setTabelaExterna( lcTipoMov4 );

		lcTipoMov5.add( new GuardaCampo( txtCodTipoMov5, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov5.add( new GuardaCampo( txtDescTipoMov5, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov5.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov5.setQueryCommit( false );
		lcTipoMov5.setReadOnly( true );
		txtCodTipoMov5.setTabelaExterna( lcTipoMov5 );

		lcTipoMov6.add( new GuardaCampo( txtCodTipoMov6, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov6.add( new GuardaCampo( txtDescTipoMov6, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov6.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov6.setWhereAdic( " ESTIPOMOV='I' " );
		lcTipoMov6.setQueryCommit( false );
		lcTipoMov6.setReadOnly( true );
		txtCodTipoMov6.setTabelaExterna( lcTipoMov6 );

		lcTipoMov7.add( new GuardaCampo( txtCodTipoMov7, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov7.add( new GuardaCampo( txtDescTipoMov7, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov7.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov7.setWhereAdic( " ESTIPOMOV='I' " );
		lcTipoMov7.setQueryCommit( false );
		lcTipoMov7.setReadOnly( true );
		txtCodTipoMov7.setTabelaExterna( lcTipoMov7 );

		lcTipoMov8.add( new GuardaCampo( txtCodTipoMov8, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov8.add( new GuardaCampo( txtDescTipoMov8, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov8.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov8.setWhereAdic( " TIPOMOV='RM' " );
		lcTipoMov8.setQueryCommit( false );
		lcTipoMov8.setReadOnly( true );
		txtCodTipoMov8.setTabelaExterna( lcTipoMov8 );
		txtCodTipoMov8.setFK( true );
		
		lcTipoMov9.add( new GuardaCampo( txtCodTipoMov9, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_PK, false ) );
		lcTipoMov9.add( new GuardaCampo( txtDescTipoMov9, "DescTipoMov", "Descri��o do tipo de movimento", ListaCampos.DB_SI, false ) );
		lcTipoMov9.montaSql( false, "TIPOMOV", "EQ" );
		lcTipoMov9.setWhereAdic( " TIPOMOV='CF' " );
		lcTipoMov9.setQueryCommit( false );
		lcTipoMov9.setReadOnly( true );
		txtCodTipoMov9.setTabelaExterna( lcTipoMov9 );
		txtCodTipoMov9.setFK( true );

		txtCodTransp.setNomeCampo( "CodTran" );
		lcTransp.add( new GuardaCampo( txtCodTransp, "CodTran", "C�d.tran.", ListaCampos.DB_PK, false ) );
		lcTransp.add( new GuardaCampo( txtDescTransp, "RazTran", "Nome do transportador", ListaCampos.DB_SI, false ) );
		txtDescTransp.setListaCampos( lcTransp );
		txtCodTransp.setTabelaExterna( lcTransp );
		txtCodTransp.setFK( true );
		lcTransp.montaSql( false, "TRANSP", "VD" );
		lcTransp.setQueryCommit( false );
		lcTransp.setReadOnly( true );

		txtCodPlanoPag.setNomeCampo( "CodPlanoPag" );
		lcPlanoPag.add( new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag", ListaCampos.DB_PK, false ) );
		lcPlanoPag.add( new GuardaCampo( txtDescPlanoPag, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI, false ) );
		lcPlanoPag.montaSql( false, "PLANOPAG", "FN" );
		lcPlanoPag.setReadOnly( true );
		txtCodPlanoPag.setTabelaExterna( lcPlanoPag );
		txtCodPlanoPag.setFK( true );
		txtDescPlanoPag.setListaCampos( lcPlanoPag );

		txtCodPlanoPag2.setNomeCampo( "CodPlanoPag" );
		lcPlanoPag2.add( new GuardaCampo( txtCodPlanoPag2, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_PK, false ) );
		lcPlanoPag2.add( new GuardaCampo( txtDescPlanoPag2, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI, false ) );
		lcPlanoPag2.montaSql( false, "PLANOPAG", "FN" );
		txtCodPlanoPag2.setTabelaExterna( lcPlanoPag2 );
		txtCodPlanoPag2.setFK( true );
		lcPlanoPag2.setReadOnly( true );
		txtDescPlanoPag2.setListaCampos( lcPlanoPag2 );

		txtCodTab.setNomeCampo( "CodTab" );
		lcTabPreco.add( new GuardaCampo( txtCodTab, "CodTab", "C�d.tab.p�o.", ListaCampos.DB_PK, false ) );
		lcTabPreco.add( new GuardaCampo( txtDescTab, "DescTab", "Descri��o da tabela de pre�o", ListaCampos.DB_SI, false ) );
		lcTabPreco.montaSql( false, "TABPRECO", "VD" );
		lcTabPreco.setReadOnly( true );
		txtCodTab.setTabelaExterna( lcTabPreco );
		txtCodTab.setFK( true );
		txtDescTab.setListaCampos( lcTabPreco );

		txtCodCli.setNomeCampo( "CodCli" );
		lcCli.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
		lcCli.add( new GuardaCampo( txtDescCli, "NomeCli", "Nome do cliente", ListaCampos.DB_SI, false ) );
		lcCli.montaSql( false, "CLIENTE", "VD" );
		lcCli.setReadOnly( true );
		txtCodCli.setTabelaExterna( lcCli );
		txtCodCli.setFK( true );
		txtDescCli.setListaCampos( lcCli );

		txtCodClasCli.setNomeCampo( "CodClasCli" );
		lcClasCli.add( new GuardaCampo( txtCodClasCli, "CodClasCli", "C�d.c.cli.", ListaCampos.DB_PK, false ) );
		lcClasCli.add( new GuardaCampo( txtDescClasCli, "DescClasCli", "Descri��o da classifica��o do cliente", ListaCampos.DB_SI, false ) );
		lcClasCli.montaSql( false, "CLASCLI", "VD" );
		lcClasCli.setReadOnly( true );
		txtCodClasCli.setTabelaExterna( lcClasCli );
		txtCodClasCli.setFK( true );
		txtDescClasCli.setListaCampos( lcClasCli );
		
		lcMens.add( new GuardaCampo( txtCodMens, "CodMens", "C�d.mens.", ListaCampos.DB_PK, null, true ) );
		lcMens.add( new GuardaCampo( txtDescMens, "Mens", "Mensagem", ListaCampos.DB_SI, null, false ) );
		lcMens.montaSql( false, "MENSAGEM", "LF" );
		lcMens.setQueryCommit( false );
		lcMens.setReadOnly( true );
		txtCodMens.setTabelaExterna( lcMens );
		
		lcMensGeral.add( new GuardaCampo( txtCodMensGeral, "CodMens", "C�d.mens.", ListaCampos.DB_PK, null, false ) );
		lcMensGeral.add( new GuardaCampo( txtDescMensGeral, "Mens", "Mensagem", ListaCampos.DB_SI, null, false ) );
		lcMensGeral.montaSql( false, "MENSAGEM", "LF" );
		lcMensGeral.setQueryCommit( false );
		lcMensGeral.setReadOnly( true );
		txtCodMensGeral.setTabelaExterna( lcMensGeral );
		
		lcPlanJR.add( new GuardaCampo( txtCodPlanJR, "CodPlan", "C�d.Plan.JR.", ListaCampos.DB_PK, false ) );
		lcPlanJR.add( new GuardaCampo( txtDescPlanJR, "DescPlan", "Descri��o do Planejamento", ListaCampos.DB_SI, false ) );
		lcPlanJR.setWhereAdic( "TIPOPLAN = 'R' AND NIVELPLAN = 6" );
		lcPlanJR.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlanJR.setQueryCommit( false );
		lcPlanJR.setReadOnly( true );
		txtCodPlanJR.setTabelaExterna( lcPlanJR );

		lcPlanJP.add( new GuardaCampo( txtCodPlanJP, "CodPlan", "C�d.Plan.JP.", ListaCampos.DB_PK, false ) );
		lcPlanJP.add( new GuardaCampo( txtDescPlanJP, "DescPlan", "Descri��o do Planejamento", ListaCampos.DB_SI, false ) );
		lcPlanJP.setWhereAdic( "TIPOPLAN = 'D' AND NIVELPLAN = 6" );
		lcPlanJP.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlanJP.setQueryCommit( false );
		lcPlanJP.setReadOnly( true );
		txtCodPlanJP.setTabelaExterna( lcPlanJP );

		lcPlanDC.add( new GuardaCampo( txtCodPlanDC, "CodPlan", "C�d.Plan.DC.", ListaCampos.DB_PK, false ) );
		lcPlanDC.add( new GuardaCampo( txtDescPlanDC, "DescPlan", "Descri��o do Planejamento", ListaCampos.DB_SI, false ) );
		lcPlanDC.setWhereAdic( "TIPOPLAN = 'D' AND NIVELPLAN = 6" );
		lcPlanDC.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlanDC.setQueryCommit( false );
		lcPlanDC.setReadOnly( true );
		txtCodPlanDC.setTabelaExterna( lcPlanDC );
		
		lcPlanDR.add( new GuardaCampo( txtCodPlanDR, "CodPlan", "C�d.Plan.DR.", ListaCampos.DB_PK, false ) );
		lcPlanDR.add( new GuardaCampo( txtDescPlanDR, "DescPlan", "Descri��o do Planejamento", ListaCampos.DB_SI, false ) );
		lcPlanDR.setWhereAdic( "TIPOPLAN = 'R' AND NIVELPLAN = 6" );
		lcPlanDR.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlanDR.setQueryCommit( false );
		lcPlanDR.setReadOnly( true );
		txtCodPlanDR.setTabelaExterna( lcPlanDR );
				
		Vector<String> vLabs = new Vector<String>();
		Vector<String> vVals = new Vector<String>();
		vLabs.addElement( "Custo MPM" );
		vLabs.addElement( "Custo PEPS" );
		vVals.addElement( "M" );
		vVals.addElement( "P" );
		rgTipoPrecoCusto = new JRadioGroup<String, String>( 1, 2, vLabs, vVals );
		rgTipoPrecoCusto.setVlrString( "M" );

		Vector<String> vLabs1 = new Vector<String>();
		Vector<String> vVals1 = new Vector<String>();
		vLabs1.addElement( "Por Codigo" );
		vLabs1.addElement( "Por Descri��o" );
		vLabs1.addElement( "Por Marca" );
		vVals1.addElement( "C" );
		vVals1.addElement( "D" );
		vVals1.addElement( "M" );
		rgOrdNota = new JRadioGroup<String, String>( 3, 1, vLabs1, vVals1 );
		rgOrdNota.setVlrString( "C" );

		Vector<String> vLabs2 = new Vector<String>();
		Vector<String> vVals2 = new Vector<String>();
		vLabs2.addElement( "Cliente/Setor" );
		vLabs2.addElement( "Comissionado/Setor" );
		vLabs2.addElement( "Ambos" );
		vVals2.addElement( "C" );
		vVals2.addElement( "V" );
		vVals2.addElement( "A" );
		rgSetorVenda = new JRadioGroup<String, String>( 3, 1, vLabs2, vVals2 );
		rgSetorVenda.setVlrString( "C" );
		
		Vector<String> vLabs6 = new Vector<String>();
		Vector<String> vVals6 = new Vector<String>();
		vLabs6.addElement( "Na aplica��o" );
		vLabs6.addElement( "No jasper" );
		vVals6.addElement( "QA" );
		vVals6.addElement( "QJ" );
		rgTipoClass = new JRadioGroup<String, String>( 1, 2, vLabs6, vVals6 );
		rgTipoClass.setVlrString( "QA" );

		Vector<String> vLabs3 = new Vector<String>();
		Vector<String> vVals3 = new Vector<String>();
		
		vLabs3.addElement( "N�o vericar" );
		vLabs3.addElement( "Consulta cr�dito pr�-aprovado" );

		vVals3.addElement( "N" );
		vVals3.addElement( "L" );
		
		rgLibCred = new JRadioGroup<String, String>( 2, 1, vLabs3, vVals3 );
		rgLibCred.setVlrString( "N" );

		Vector<String> vLabsTpValidOrc1 = new Vector<String>();
		Vector<String> vValsTpValidOrc1 = new Vector<String>();
		vLabsTpValidOrc1.addElement( "Data" );
		vLabsTpValidOrc1.addElement( "Nro. de dias" );
		vValsTpValidOrc1.addElement( "D" );
		vValsTpValidOrc1.addElement( "N" );
		rgTipoValidOrc = new JRadioGroup<String, String>( 1, 2, vLabsTpValidOrc1, vValsTpValidOrc1 );
		rgTipoValidOrc.setVlrString( "D" );

		Vector<Integer> vValsTipo = new Vector<Integer>(); 
		Vector<String> vLabsTipo = new Vector<String>();
		vLabsTipo.addElement( "<--Selecione-->" );
		vLabsTipo.addElement( "50 caracteres" );
		vLabsTipo.addElement( "100 caracteres" );
		vValsTipo.addElement( new Integer( 0 ) );
		vValsTipo.addElement( new Integer( 50 ) );
		vValsTipo.addElement( new Integer( 100 ) );
		cbTamDescProd = new JComboBoxPad( vLabsTipo, vValsTipo, JComboBoxPad.TP_INTEGER, 4, 0 );

		Vector<String> vLabsCtb = new Vector<String>();
		Vector<String> vValsCtb = new Vector<String>();
		vLabsCtb.addElement( "<--Selecione-->" );
		vLabsCtb.addElement( "Freedom Contabil" );
		vLabsCtb.addElement( "Safe Contabil" );
		vLabsCtb.addElement( "EBS Contabil" );
		vValsCtb.addElement( "00" );
		vValsCtb.addElement( "01" );
		vValsCtb.addElement( "02" );
		vValsCtb.addElement( "03" );
		cbSisContabil = new JComboBoxPad( vLabsCtb, vValsCtb, JComboBoxPad.TP_STRING, 2, 0 );

		// Geral

		setPainel( pinGeral );
		adicTab( "Geral", pinGeral );
		adicCampo( txtAnoCC, 7, 25, 100, 20, "AnoCentroCusto", "Ano Base C.C.", ListaCampos.DB_SI, true );
		adic( new JLabelPad( "Casas Decimais" ), 7, 60, 150, 20 );
		adicCampo( txtCasasDecFin, 7, 100, 100, 20, "CasasDecFin", "p/ Financeiro", ListaCampos.DB_SI, true );
		adicCampo( txtCasasDec, 7, 140, 100, 20, "CasasDec", "Demais", ListaCampos.DB_SI, true );
		lbGeralOpcoes.setOpaque( true );
		adic( lbGeralOpcoes, 170, 5, 90, 20 );
		adic( pinOpcoesGeral, 160, 15, 550, 340 );
		setPainel( pinOpcoesGeral );
		adicDB( cbRgCliObrig, 7, 20, 180, 20, "RgCliObrig", "", true );
		adicDB( cbCliMesmoCnpj, 7, 40, 250, 20, "CliMesmoCnpj", "", true );
		adicDB( cbCnpjCliObrig, 7, 60, 300, 20, "CnpjObrigCli", "", true );
		adicDB( cbCnpjForObrig, 7, 80, 400, 20, "CnpjForObrig", "", true );
		adicDB( cbInscEstForObrig, 7, 100, 400, 20, "InscEstForObrig", "", true );
		adicDB( cbConsCPFCli, 7, 120, 400, 20, "ConsistCPFCli", "", true );
		adicDB( cbUsuAtivCli, 7, 140, 400, 20, "UsuAtivCli", "", true );
		adicDB( cbConsIECli, 7, 160, 400, 20, "ConsisteIECli", "", true );
		adicDB( cbConsIEFor, 7, 180, 400, 20, "ConsisteIEFor", "", true );
		adicDB( cbConsIECliFisica, 7, 200, 400, 20, "ConsisteIEPF", "", true );
		adicDB( cbCredIcmsSimples, 7, 220, 400, 20, "CredIcmsSimples", "", true );
		adicDB( cbGeraCodUnif, 7, 240, 500, 20, "GeraCodUnif", "", true);

		
		adicCampo( txtCodMensGeral, 7, 280, 90, 20, "CodMensIcmsSimples", "C�d.mens", ListaCampos.DB_FK, txtDescMensGeral, false );
		adicDescFK( txtDescMensGeral, 100, 280, 350, 20, "mens", " Mensagem para destaque de cr�dito de ICMS (Simples)" );
		
		
		
		// Venda

		setPainel( pinVenda );
		adicTab( "Venda", pinVenda );

		adicDB( rgSetorVenda, 7, 25, 160, 80, "SetorVenda", "Distrib. dos setores", true );
		adicDB( rgOrdNota, 177, 25, 160, 80, "OrdNota", " Ordem de Emiss�o", true );

		adicCampo( txtCodTipoMov3, 7, 130, 75, 20, "CodTipoMov3", "C�d.tp.mov", ListaCampos.DB_FK, txtDescTipoMov3, false );
		adicDescFK( txtDescTipoMov3, 85, 130, 250, 20, "DescTipoMov", "Tipo de movimento para pedido." );
		adicCampo( txtCodTipoMov, 7, 180, 75, 20, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov, false );
		adicDescFK( txtDescTipoMov, 85, 180, 250, 20, "DescTipoMov", "Tipo de movimento para NF." );
		adicCampo( txtCodTipoMov4, 7, 230, 75, 20, "CodTipoMov4", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov4, false );
		adicDescFK( txtDescTipoMov4, 85, 230, 250, 20, "DescTipoMov", "Tipo de movimento para pedido (servi�o)." );
		adicCampo( txtCodTransp, 7, 280, 75, 20, "CodTran", "C�d.tran.", ListaCampos.DB_FK, txtDescTransp, false );
		adicDescFK( txtDescTransp, 85, 280, 250, 20, "RazTran", "Raz�o social da transp. padr�o para venda" );
		adicCampo( txtDescClassPed, 7, 330, 250, 20, "ClassPed", "Layout padr�o para pedido.", ListaCampos.DB_SI, false );
		adicDB( rgTipoClass, 7, 370, 250, 30, "TipoClassPed", "Tipo de query", false );
		
//		lbVendOpcoes.setOpaque( true );
//		adic( lbVendOpcoes, 357, 5, 70, 20 );
		adic( pinOpcoesVenda, 348, 5, 520, 420 );
		pinOpcoesVenda.setBorder( BorderFactory.createTitledBorder( opcoes ) );
		setPainel( pinOpcoesVenda );
		
		adicDB( cbUsaPedSeq, 5, 0, 160, 20, "UsaPedSeq", "", true );
		adicDB( cbEstNeg, 5, 20, 160, 20, "EstNeg", "", true );
		adicDB( cbEstLotNeg, 5, 40, 200, 20, "EstLotNeg", "", true );
		adicDB( cbPrazoEnt, 5, 60, 200, 20, "UsaTabPE", "", true );
		adicDB( cbDiasPEData, 5, 80, 200, 20, "DIASPEDT", "", true );
		adicDB( cbReCalcVenda, 5, 100, 200, 20, "ReCalcPCVenda", "", true );
		adicDB( cbVendaMatPrim, 5, 120, 250, 20, "VendaMatPrim", "", true );
		adicDB( cbTravaTMNFVD, 5, 140, 268, 20, "TravaTMNFVD", "", true );
		adicDB( cbBloqVenda, 5, 160, 265, 20, "BloqVenda", "", true );
		adicDB( cbComisPDupl, 5, 180, 280, 20, "ComisPDupl", "", true );
		adicDB( cbEstNegGrupo, 5, 200, 250, 20, "EstNegGrup", "", true );
		adicDB( cbLayoutPed, 5, 220, 300, 20, "UsaLayoutPed", "", true );
		adicDB( cbObsCliVend, 5, 240, 350, 20, "ObsCliVend", "", true );
		adicDB( cbVerifAltParVenda, 5, 260, 350, 20, "VerifAltParcVenda", "", true );
		adicDB( cbUsaPrecoZero, 5, 280, 350, 20, "UsaPrecoZero", "", true );
		adicDB( cbUsaClasComis, 5, 300, 250, 20, "UsaClasComis", "", true ); 
		adicDB( cbIcmsFrete, 5, 320, 300, 20, "AdicFreteBaseICM", "", true );
		adicDB( cbGeraComisVendaOrc, 5, 340, 400, 20, "GeraComisVendaOrc", "", true );
		adicDB( cbInfVdRemessa, 5, 360, 400, 20, "InfVdRemessa", "", true );
		
		adicDB( cbTabFreteVd, 290, 0, 180, 20, "TabFreteVd", "", true );
		adicDB( cbTabAdicVd, 290, 20, 180, 20, "TabAdicVd", "", true );
		adicDB( cbUsaDescEspelho, 290, 40, 180, 20, "UsaLiqRel", "", true );
		adicDB( cbIPIVenda, 290, 60, 180, 20, "IPIVenda", "", true );
		adicDB( cbNatVenda, 290, 80, 180, 20, "NatVenda", "", true );
		adicDB( cbIcmsVenda, 290, 100, 180, 20, "IcmsVenda", "", true );
		adicDB( cbMultiComis, 290, 120, 180, 20, "MultiComis", "", true);
		adicDB( cbSomaVolumes, 290, 140, 180, 20, "SomaVolumes", "", true);
		adicDB( cbVendaImobilizado, 290, 160, 210, 20, "VendaPatrim", "", true);
		adicDB( cbVisualizaLucr, 290, 180, 210, 20, "VisualizaLucr", "", true); 
		
		// Compra
				
		setPainel( pinCompra );
		adicTab( "Compras", pinCompra );

		lbCompOpcoes.setOpaque( true );
		adic( lbCompOpcoes, 17, 5, 70, 20 );
		adic( pinCompras, 7, 15, 300, 400 );
		setPainel( pinCompras );
		adicDB( cbUsaRefCompra, 7, 15, 200, 20, "UsaRefProd", "",false );
		adicDB( cbTransAbaCp, 7, 35, 250, 20, "TabTranspCp", "",false );
		adicDB( cbTabSolCp, 7, 55, 250, 20, "TabSolCp", "",false );		
		adicDB( cbImportAbaCp, 7, 75, 250, 20, "TabImportCp", "",false );		
		adicDB( cbPrecoRel, 7, 95, 270, 20, "PrecoCpRel", "",false );
		adicDB( cbHabiitaCustoCompra, 7, 115, 300, 20, "CustoCompra", "", true );		
		adicDB( cbInfCPDevolucao, 7, 135, 300, 20, "INFCPDEVOLUCAO", "", true );
		
		adicCampo( txtDescClassCp, 11, 200, 250, 20, "ClassCp", "Layout padr�o para pedido de compra.", ListaCampos.DB_SI, false );
		adicCampo( txtObs01, 11, 240, 250, 20, "LabelObs01Cp", "Descri��o para campo Obs01.", ListaCampos.DB_SI, false );
		adicCampo( txtObs02, 11, 280, 250, 20, "LabelObs02Cp", "Descri��o para campo Obs02.", ListaCampos.DB_SI, false );
		adicCampo( txtObs03, 11, 320, 250, 20, "LabelObs03Cp", "Descri��o para campo Obs03.", ListaCampos.DB_SI, false );
		adicCampo( txtObs04, 11, 360, 250, 20, "LabelObs04Cp", "Descri��o para campo Obs04.", ListaCampos.DB_SI, false );
		
		
		// Pre�o

		setPainel( pinPreco );
		adicTab( "Pre�os", pinPreco );

		lbPrcCont.setBorder( BorderFactory.createEtchedBorder( 1 ) );
		lbPrcOpcoes.setOpaque( true );

		adicCampo( txtCodTab, 7, 25, 90, 20, "CodTab", "C�d.tab.pc.", ListaCampos.DB_FK, txtDescTab, false );
		adicDescFK( txtDescTab, 100, 25, 300, 20, "DescTab", "Descri��o da tabela de pre�os" );
		adicCampo( txtCodPlanoPag, 7, 65, 90, 20, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_FK, txtDescPlanoPag, false );
		adicDescFK( txtDescPlanoPag, 100, 65, 300, 20, "DescPlanoPag", "Descri��o do plano de pagamento" );
		adicCampo( txtCodClasCli, 7, 105, 90, 20, "CodClasCli", "C�d.c.cli", ListaCampos.DB_FK, txtDescClasCli, false );
		adicDescFK( txtDescClasCli, 100, 105, 300, 20, "DescClasCli", "Descri��o da classifica��o dos clientes" );

		adic( lbPrcOpcoes, 17, 130, 70, 20 );
		adic( lbPrcCont, 7, 140, 393, 140 );
		adicDB( rgTipoPrecoCusto, 17, 170, 373, 30, "TipoPrecoCusto", "Controle do pre�o sobre o custo:", false );
		adicCampo( txtPercPrecoCusto, 17, 220, 100, 20, "PercPrecoCusto", "% Min. custo", ListaCampos.DB_SI, true );
		adicDB( cbCustosSICMS, 17, 250, 280, 20, "CustoSICMS", "", true );

		// Or�amento

		setPainel( pinOrc );
		adicTab( "Or�amento & PDV", pinOrc );
		adicCampo( txtCodTipoMov2, 7, 25, 90, 20, "CodTipoMov2", "Cod.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov, false );
		adicDescFK( txtDescTipoMov2, 100, 25, 300, 20, "DescTipoMov", "Tipo de movimento para or�amentos." );
		adicCampo( txtDescClassOrc, 403, 25, 250, 20, "ClassOrc", "Classe padr�o para or�amento.", ListaCampos.DB_SI, false );
		adicCampo( txtDescOrc, 403, 65, 250, 20, "DescOrc", "Descri��o do t�tulo do or�amento.", ListaCampos.DB_SI, false );
		adicCampo( txtTitOrcTxt01, 403, 105, 250, 20, "TitOrcTxt01", "T�tulo para campo TXT01", ListaCampos.DB_SI, false );
//		adicCampo( txtCodMens, 7, 185, 90, 20, "CodMensOrc", "C�d.mens", ListaCampos.DB_FK, txtDescMens, false );
//		adicDescFK( txtDescMens, 100, 185, 300, 20, "mens", " Descri��o da mensagem padr�o para or�amento" );
		
		adicDB( rgTipoCustoLuc, 7, 185, 390, 30, "TipoCustoLuc", "Tipo de custo para calculo da lucratividade", true );
		
		adicDB( rgTipoValidOrc, 403, 225, 250, 30, "tipovalidorc", "Validade na impress�o", true );
		adicDB( cbUsaOrcSeq, 460, 275, 160, 20, "UsaOrcSeq", "", true );
		adicDB( cbReCalcOrc, 10, 295, 250, 20, "ReCalcPCOrc", "", true );
		adicDB( cbUsaImgOrc, 10, 355, 300, 20, "UsaImgAssOrc", "", true );
		adicDB( cbUsaNomeVendOrc, 10, 375, 300, 20, "UsaNomeVendOrc", "", true );
		adicDB( cbAdicCodOrcObsPed, 10, 395, 400, 20, "ADICORCOBSPED", "", false );
		adicDB( cbMostraTransp, 10, 415, 400, 20, "TabTranspOrc", "", true );
		adicDB( imgAssOrc, 460, 325, 250, 95, "ImgAssOrc", "Assinatura", false );
		
		// Financeiro

		setPainel( pinFin );
		adicTab( "Financeiro", pinFin );
		
		Vector<String> vLabs5 = new Vector<String>();
		Vector<String> vVals5 = new Vector<String>();
		vLabs5.addElement( "Fechamento" );
		vLabs5.addElement( "Item da venda" );
		vLabs5.addElement( "Ambos" );
		vVals5.addElement( "FV" );
		vVals5.addElement( "II" );
		vVals5.addElement( "AB" );

		rgTipoCred = new JRadioGroup<String, String>( 2, 2, vLabs5, vVals5 );
		rgTipoCred.setVlrString( "AB" );

		lbFinDefinicoes.setBorder( BorderFactory.createTitledBorder( "Defini��es" ) );			
		adic( lbFinDefinicoes, 7, 10, 485, 200 );
			
		adicCampo( txtCodMoeda, 20, 50, 80, 20, "CodMoeda", "C�d.moeda", ListaCampos.DB_FK, txtDescMoeda, true );
		adicDescFK( txtDescMoeda, 100, 50, 320, 20, "SingMoeda", "Descri��o da moeda corrente." );
				
		adicCampo( txtCodTabJuros, 20, 90, 80, 20, "CodTbj", "C�d.tab.jr.", ListaCampos.DB_FK, txtDescTabJuros, false );
		adicDescFK( txtDescTabJuros, 100, 90, 320, 20, "DescTbj", "Descri��o da tabela de juros." );
		
		adicCampo( txtCodHistRec, 20, 130, 80, 20, "CodHistRec", "C�d.Hist.Rec.", ListaCampos.DB_FK, txtDescHistRec, false );
		adicDescFK( txtDescHistRec, 100, 130, 320, 20, "DescHist", "Descri��o do hist�rico padr�o para contas a receber" );

		adicCampo( txtCodHistPag, 20, 170, 80, 20, "CodHistPag", "C�d.Hist.Pag.", ListaCampos.DB_FK, txtDescHistPag, false );
		adicDescFK( txtDescHistPag, 100, 170, 320, 20, "DescHist", "Descri��o do hist�rico padr�o para contas a pagar" );

		lbFinContas.setBorder( BorderFactory.createTitledBorder( "Contas" ) );			
		adic( lbFinContas, 500, 10, 370, 200 );

		adicCampo( txtCodPlanJR, 510, 50, 100, 20, "CodPlanJR", "C�d.Plan.JR.", ListaCampos.DB_FK, txtDescPlanJR, false );
		adicDescFK( txtDescPlanJR, 613, 50, 240, 20, "DescPlan", "Planejamento para juros recebidos" );

		adicCampo( txtCodPlanJP, 510, 90, 100, 20, "CodPlanJP", "C�d.Plan.JP.", ListaCampos.DB_FK, txtDescPlanJP, false );
		adicDescFK( txtDescPlanJP, 613, 90, 240, 20, "DescPlan", "Planejamento para juros pagos" );

		adicCampo( txtCodPlanDC, 510, 130, 100, 20, "CodPlanDC", "C�d.Plan.DC.", ListaCampos.DB_FK, txtDescPlanDC, false );
		adicDescFK( txtDescPlanDC, 613, 130, 240, 20, "DescPlan", "Planejamento para descontos concedidos" );

		adicCampo( txtCodPlanDR, 510, 170, 100, 20, "CodPlanDR", "C�d.Plan.DR.", ListaCampos.DB_FK, txtDescPlanDR, false );
		adicDescFK( txtDescPlanDR, 613, 170, 240, 20, "DescPlan", "Planejamento para descontos obtidos" );

		
		lbFinOpcoes.setBorder( BorderFactory.createTitledBorder( opcoes ) );			
		adic( lbFinOpcoes, 500, 215, 370, 175 );
		
		adicDB( cbAltItRecImpBol, 510, 235, 310, 20, "AtBancoImpBol", "", false );
		adicDB( cbJurosPosCalc, 510, 255, 310, 20, "JurosPosCalc", "", false );
		adicDB( cbEstItRecAltDtVenc, 510, 275, 350, 20, "EstItRecAltDtVenc", "", false );
		adicDB( cbLiberacaoCreGlobal, 510, 295, 350, 20, "LcRedGlobal", "", false );
		adicDB( cbComissManut, 510, 315, 350, 20, "VDManutComObrig", "", false );
		adicDB( cbGeraPagEmis, 510, 335, 350, 20, "GeraPagEmis", "", true );
		adicDB( cbGeraRecEmis, 510, 355, 350, 20, "GeraRecEmis", "", true );
		
		
		lbFinPagar.setBorder( BorderFactory.createTitledBorder( "Contratos/Projetos" ));		
		adic( lbFinPagar, 10, 215, 485, 80);
		
		adicDB( cbLancaFinContr, 17, 235, 350, 20, "LancaFinContr", "", false );

		
		lbFinLibCred.setBorder( BorderFactory.createTitledBorder( "Libera��o de cr�dito" ) );			
		adic( lbFinLibCred, 7, 300, 485, 90 );

		adicDB( rgLibCred, 20, 325, 220, 55, "PrefCred", "", true );
		adicDB( rgTipoCred, 243, 325, 235, 55,"TipoPrefCred", "", true );
	
		// Contabil

		setPainel( pinCtb );
		adicTab( "Contab�l", pinCtb );

		lbCtbCont.setBorder( BorderFactory.createEtchedBorder( 1 ) );
		lbCtbOpcoes.setOpaque( true );
		
		adic( lbCtbOpcoes, 17, 10, 70, 20 );
		adic( lbCtbCont, 7, 20, 393, 80 );
		adicDB( cbSisContabil, 17, 55, 373, 20, "SisContabil", "Sistema para exporta��o", false );

		// SVV

		setPainel( pinSVV );
		adicTab( "SVV", pinSVV );

		adicCampo( txtCodFor, 7, 25, 90, 20, "CodFor", "C�d.for.", ListaCampos.DB_FK, txtDescFor, false );
		adicDescFK( txtDescFor, 100, 25, 300, 20, "DescFor", "Raz�o social do fornecedor" );
		adicCampo( txtCodMarca, 7, 65, 90, 20, "CodMarca", "C�d.marca", ListaCampos.DB_FK, txtDescMarca, false );
		adicDescFK( txtDescMarca, 100, 65, 300, 20, "DescMarca", "Descri��o da marca." );
		adicCampo( txtCodGrup, 7, 105, 90, 20, "CodGrup", "C�d.grupo", ListaCampos.DB_FK, txtDescGrup, false );
		adicDescFK( txtDescGrup, 100, 105, 300, 20, "DescGrup", "Descri��o do grupo." );

		// Devolu��o

		setPainel( pinDev );
		adicTab( "Devolu��o", pinDev );

		adicCampo( txtCodTipoFor, 7, 25, 90, 20, "CodTipoFor", "C�d.tp.for.", ListaCampos.DB_FK, txtDescTipoFor, false );
		adicDescFK( txtDescTipoFor, 100, 25, 300, 20, "DescTipoFor", "Descri��o do tipo de fornecedor" );
		adicCampo( txtCodTipoMov5, 7, 65, 90, 20, "CodTipoMov5", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov, false );
		adicDescFK( txtDescTipoMov5, 100, 65, 300, 20, "DescTipoMov", "Descri��o do tipo de movimento" );
		adicCampo( txtCodTipoCli, 7, 105, 90, 20, "CodTipoCli", "C�d.tp.cli.", ListaCampos.DB_FK, txtDescTipoCli, false );
		adicDescFK( txtDescTipoCli, 100, 105, 300, 20, "DescTipoCli", "Descri��o do tipo de Cliente" );

		// Produto
		setPainel( pinProd );
		adicTab( "Produto", pinProd );

		lbProdCont.setBorder( BorderFactory.createEtchedBorder( 1 ) );
		lbProdOpcoes.setOpaque( true );
		
		Vector<String> vLabs4 = new Vector<String>();
		Vector<String> vVals4 = new Vector<String>();
		vLabs4.addElement( "EAN 13" );
		vLabs4.addElement( "39" );
		vVals4.addElement( "1" );
		vVals4.addElement( "2" );

		rgCodBar = new JRadioGroup<String, String>( 1, 2, vLabs4, vVals4 );
		rgCodBar.setVlrString( "2" );

		adic( lbProdOpcoes, 17, 10, 70, 20 );
		adic( lbProdCont, 7, 20, 393, 315 );
		adicDB( cbPepsProd, 17, 35, 310, 20, "PepsProd", "", false );
		adicDB( cbBuscaProdSimilar, 17, 55, 310, 20, "BuscaProdSimilar", "", false );
		adicDB( cbDescCompl, 17, 75, 480, 20, "DescCompPed", "", true );
		adicDB( cbUsaBuscGenProd, 17, 95, 350, 20, "BUSCACODPRODGEN", "", false );
		adicDB( cbFilBuscGenProd1, 37, 115, 350, 20, "FILBUSCGENPROD", "", false );
		adicDB( cbFilBuscGenProd2, 37, 135, 350, 20, "FILBUSCGENREF", "", false );
		adicDB( cbFilBuscGenProd3, 37, 155, 350, 20, "FILBUSCGENCODBAR", "", false );
		adicDB( cbFilBuscGenProd4, 37, 175, 350, 20, "FILBUSCGENCODFAB", "", false );
		adicDB( cbUsaRefProd, 17, 195, 160, 20, "UsaRefProd", "", true );
		adicDB( cbTamDescProd, 17, 250, 373, 20, "TamDescProd", "Tamanho da descri��o do produto", false );
		adic( new JLabelPad("Tipo de c�digo de barras"), 17, 280, 200, 20 );
		adicDB( rgCodBar, 17, 300, 180, 25, "TipoCodBar", "", false );
		
		

		// Estoque
		setPainel( pinEstoq );
		adicTab( "Estoque", pinEstoq );

		pnEstOpcoes.setBorder( BorderFactory.createTitledBorder( opcoes ) );

		adicCampo( txtCodTipoMov6, 7, 25, 90, 20, "CodTipoMov6", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov, false );
		adicDescFK( txtDescTipoMov6, 100, 25, 300, 20, "DescTipoMov", "Descri��o do tp. mov. para invent�rio" );
		adicCampo( txtCodTipoMov8, 7, 65, 90, 20, "CodTipoMov8", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov8, false );
		adicDescFK( txtDescTipoMov8, 100, 65, 300, 20, "DescTipoMov", "Descri��o do tp.mov. para RMA" );

		adic( pnEstOpcoes, 7, 100, 393, 130 );
		
		setPainel( pnEstOpcoes );
		
		adicDB( cbContEstoq, 7, 0, 250, 20, "ContEstoq", "", true );
		adicDB( cbMultiAlmox, 7, 20, 250, 20, "MultiAlmox", "", true );
		adicDB( cbBloqCompra, 7, 40, 250, 20, "BloqCompra", "", true );
		adicDB( cbBuscaVlrUltCompra, 7, 60, 250, 20, "BuscaVlrUltCompra", "", true );
		adicDB( cbLancaRMAContr, 7, 80, 300, 20, "LancaRMAContr", "", false );

		nav.setAtivo( 0, false );
		lcCampos.setPodeExc( false );
		lcCampos.addPostListener( this );
		
		/*****************
		 * NF Eletr�nica *
		 *****************/
		
		setPainel( pinNFe );
		adicTab( "NF e", pinNFe );

		JPanelPad pnNFeCod = new JPanelPad();
		pnNFeCod.setBorder( BorderFactory.createTitledBorder("Codifica��o Padr�o") );

		adic( pnNFeCod, 7, 5, 370, 100 );
		
		setPainel(pnNFeCod);
		
		adicDB( cbUsaIbgeCli, 4, 7, 330, 20, "USAIBGECLI", "", true );
		adicDB( cbUsaIbgeFor, 4, 27, 350, 20, "USAIBGEFOR", "", true );
		adicDB( cbUsaIbgeTransp, 4, 47, 365, 20, "USAIBGETRANSP", "", true );

		JPanelPad pnNFePlugin = new JPanelPad();
		pnNFePlugin.setBorder( BorderFactory.createTitledBorder("Configura��o do Plugin NFe") );
		setPainel( pinNFe );
		adic( pnNFePlugin, 7, 105, 370, 155 );
		
		setPainel(pnNFePlugin);
		
		adicCampo( txtDescClassNfe, 4, 22, 350, 20, "CLASSNFE", "Classe do plugin de integra��o NFe", ListaCampos.DB_SI, false );
		adicCampo( txtDirNfe, 4, 62, 327, 20, "DIRNFE", "Diret�rio padr�o para arquvos NFe", ListaCampos.DB_SI, false );
		adic( btDirNfe,333,62,20,20 );
		adicCampo(txtVerProcNfe, 4, 102, 350, 20, "VerProcNfe", "Vers�o do Aplicativo", ListaCampos.DB_SI, false );
				
		JPanelPad pnNFeParam = new JPanelPad();
		pnNFeParam.setBorder( BorderFactory.createTitledBorder("Par�metros") );
		setPainel( pinNFe );
		adic( pnNFeParam, 380, 5, 395, 225 );
		
		setPainel(pnNFeParam);
		
		adicDB(rgAmbienteNFE, 7, 20, 370, 30, "AmbienteNFE", "Ambiente", false );
		adicDB(rgFormatoDANFE, 7, 75, 370, 30, "FormatoDanfe", "Formato da DANFE", false );
		adicDB(rgProcEmiNFE, 7, 130, 370, 60, "ProcEmiNfe", "Processo de emiss�o", false );
			
						
		/*****************
		 * Recursos *
		 *****************/

		lbRecursos.setOpaque( true );
		lbRecursosCont.setBorder( BorderFactory.createEtchedBorder( 1 ) );

		setPainel( pinRecursos );
		adicTab( "Recursos", pinRecursos );

		adic( lbRecursos, 17, 10, 70, 20 );
		adic( lbRecursosCont, 7, 20, 380, 100 );
		adicDB( cbBuscaCep, 10, 35, 330, 20, "BUSCACEP", "", true );
		adicCampo( txtUrlWsCep, 13, 85, 300, 20, "URLWSCEP", "URL do Web Service para consulta de CEP.", ListaCampos.DB_SI, false );

		/*************************
		 * Conhecimento de frete *
		 *************************/

		lbFrete.setOpaque( true );
		lbFreteCont.setBorder( BorderFactory.createEtchedBorder( 1 ) );

		setPainel( pinFrete );
		adicTab( "Conhecimento de frete", pinFrete );

		adic( lbFrete, 17, 10, 70, 20 );
		adic( lbFreteCont, 7, 20, 430, 100 );
		adicCampo( txtCodTipoMov9, 13, 55, 90, 20, "CodTipoMov9", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov, false );
		adicDescFK( txtDescTipoMov9, 106, 55, 310, 20, "DescTipoMov", "Descri��o do tp. mov. para conhecimento de frete" );

		
		setListaCampos( false, "PREFERE1", "SG" );

		txtCodHistRec.setNomeCampo( "CodHist" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		
		txtCodHistPag.setNomeCampo( "CodHist" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		
		txtCodTipoMov2.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		txtCodTipoMov3.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		txtCodTipoMov4.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		txtCodTipoMov5.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		txtCodTipoMov6.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		txtCodTipoMov8.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		txtCodTipoMov9.setNomeCampo( "CodTipoMov" ); // Acerto o nome para que o
		// ListaCampos naum confunda
		// com a FK.
		
		txtCodPlanJR.setNomeCampo( "CodPlan" );
		txtCodPlanJP.setNomeCampo( "CodPlan" );
		txtCodPlanDC.setNomeCampo( "CodPlan" );
		txtCodPlanDR.setNomeCampo( "CodPlan" );
		

		// lcSeq.adicDetalhe(lcPDV);
		// lcPDV.setMaster(lcSeq);

		setListaCampos( lcPDV );
		setNavegador( new Navegador( false ) );

		// Or�amento e PDV

		setPainel( pinOrc );

		lbOrcCont.setBorder( BorderFactory.createEtchedBorder( 1 ) );
		lbOrcOpcoes.setOpaque( true );

		adicCampo( txtCodTipoMov7, 7, 65, 90, 20, "CodTipoMov", "C�d.tp.mov.", ListaCampos.DB_FK, txtDescTipoMov7, false );
		adicDescFK( txtDescTipoMov7, 100, 65, 300, 20, "DescTipoMov", "Descri��o do tipo de movimento" );
		adicCampo( txtCodPlanoPag2, 7, 105, 90, 20, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_FK, txtDescPlanoPag2, false );
		adicDescFK( txtDescPlanoPag2, 100, 105, 300, 20, "DescPlanoPag", "Descri��o do plano de pagamento" );
		adicCampo( txtCodCli, 7, 145, 90, 20, "CodCli", "C�d.cli.", ListaCampos.DB_FK, txtDescCli, false );
		adicDescFK( txtDescCli, 100, 145, 300, 20, "NomeCli", "Nome do cliente" );
		adicCampo( txtPrazo, 403, 145, 250, 20, "Prazo", "Prazo de Entrega do Or�amento", ListaCampos.DB_SI, false );
		adicCampo( txtDiasVencOrc, 403, 185, 250, 20, "DiasVencOrc", "Dias p/ vencimento do or�amento", ListaCampos.DB_SI, false );
		
		adic( lbOrcOpcoes, 17, 255, 70, 20 );
		adic( lbOrcCont, 7, 265, 720, 190 );		
		adicDB( cbAprovOrc, 10, 275, 350, 20, "AprovOrc", "", true );
		adicDB( cbUsaBuscGenProdORC, 10, 315, 350, 20, "USABUSCAGENPROD", "", false );
		adicDB( cbUsaLoteOrc, 10, 335, 300, 20, "USALOTEORC", "", false );
		setListaCampos( false, "PREFERE4", "SG" );

		// Email

		setListaCampos( lcPrefere3 );
		setPainel( pinEmail );
		adicTab( "Mail", pinEmail );
		
		JLabel email = new JLabel( "Configura��o de e-mail", SwingConstants.CENTER );
		email.setOpaque( true );
		JLabel linha2 = new JLabel();
		linha2.setBorder( BorderFactory.createEtchedBorder() );
		
		adic( email, 27, 10, 180, 20 );
		adic( linha2, 7, 20, 403, 190 );
		
		//setPainel( pinSmtp );
		
		adicCampo( txtServidorSMTP, 17, 60, 230, 20, "SMTPMAIL", "Servidor de SMTP", ListaCampos.DB_SI, false );
		adicCampo( txtPortaSMTP, 250, 60, 50, 20, "PORTAMAIL", "Porta", ListaCampos.DB_SI, false );
		adicDB( cbAutenticaSMTP, 307, 60, 100, 20, "SMTPAUTMAIL", "", false );
		adicCampo( txtEndEmail, 17, 100, 283, 20, "ENDMAIL", "E-mail do usuario", ListaCampos.DB_SI, false );
		adicCampo( txtUsuarioSMTP, 17, 140, 283, 20, "USERMAIL", "Id do usuario", ListaCampos.DB_SI, false );
		adicDB( cbSSLSMTP, 307, 100, 100, 20, "SMTPSSLMAIL", "", false );
		adicCampo( txtSenhaSMTP, 17, 180, 283, 20, "PASSMAIL", "Senha do usuario", ListaCampos.DB_SI, false );
		setListaCampos( false, "PREFERE3", "SG" );

		// fim da adic�o de abas

		lcCampos.addCarregaListener( this );
		lcPDV.addInsertListener( this );
		lcPDV.addEditListener( this );
		lcPrefere3.addInsertListener( this );
		lcPrefere3.addEditListener( this );
		
		btDirNfe.setToolTipText( "Localizar diret�rio" );
		btDirNfe.addActionListener( this );
		
		cbEstNegGrupo.addCheckBoxListener( this );
		cbJurosPosCalc.addCheckBoxListener( this );
		cbUsaBuscGenProd.addCheckBoxListener( this );

		cbFilBuscGenProd1.setEnabled( false );
		cbFilBuscGenProd2.setEnabled( false );
		cbFilBuscGenProd3.setEnabled( false );
		cbFilBuscGenProd4.setEnabled( false );

	}

	public void beforePost( PostEvent pevt ) {

		if ( txtCasasDec.getVlrInteger().intValue() > 5 ) {
			Funcoes.mensagemErro( this, "N�mero de casas decimais acima do permitido!" );
			txtCasasDec.requestFocus();
			pevt.cancela();
		}
		if ( txtCasasDecFin.getVlrInteger().intValue() > 5 ) {
			Funcoes.mensagemErro( this, "N�mero de casas decimais acima do permitido!" );
			txtCasasDecFin.requestFocus();
			pevt.cancela();
		}
	}

	public void afterPost( PostEvent pevt ) {

		if ( pevt.getListaCampos() == lcCampos ) {
			if ( lcPDV.getStatus() == ListaCampos.LCS_INSERT || lcPDV.getStatus() == ListaCampos.LCS_EDIT ) {
				lcPDV.post();
			}
			if ( lcPrefere3.getStatus() == ListaCampos.LCS_INSERT || lcPrefere3.getStatus() == ListaCampos.LCS_EDIT ) {
				lcPrefere3.post();
			}
		}
	}

	public void afterEdit( EditEvent eevt ) {

		if ( eevt.getListaCampos() == lcPDV ) {
			if ( eevt.getListaCampos().getStatus() == ListaCampos.LCS_EDIT ) {
				lcCampos.edit();
			}
		}
	}

	public void beforeEdit( EditEvent eevt ) {

	}

	public void edit( EditEvent eevt ) {

	}

	public void afterInsert( InsertEvent ievt ) {

		if ( ievt.getListaCampos() == lcPDV ) {
			if ( ievt.getListaCampos().getStatus() == ListaCampos.LCS_INSERT ) {
				lcCampos.edit();
			}
		}
		if ( ievt.getListaCampos() == lcPrefere3 ) {
			if ( ievt.getListaCampos().getStatus() == ListaCampos.LCS_INSERT ) {
				lcCampos.edit();
			}
		}
	}

	public void beforeInsert( InsertEvent ievt ) {

	}

	public void valorAlterado( CheckBoxEvent cevt ) {

		if ( cevt.getCheckBox() == cbJurosPosCalc && cbJurosPosCalc.getVlrString().equals( "S" ) )
			txtCodTabJuros.setAtivo( false );
		else
			txtCodTabJuros.setAtivo( true );
		if ( cevt.getCheckBox() == cbEstNegGrupo ) {
			if ( cbEstNegGrupo.getVlrString().equals( "S" ) ) {
				cbEstNeg.setVlrString( "N" );
				cbEstNeg.setEnabled( false );
				cbEstLotNeg.setVlrString( "N" );
				cbEstLotNeg.setEnabled( false );
			}
			else {
				cbEstNeg.setEnabled( true );
				cbEstLotNeg.setEnabled( true );
			}
		}
		if ( cevt.getCheckBox() == cbUsaBuscGenProd && cbUsaBuscGenProd.getVlrString().equals( "S" ) ) {
			cbFilBuscGenProd1.setEnabled( true );
			cbFilBuscGenProd2.setEnabled( true );
			cbFilBuscGenProd3.setEnabled( true );
			cbFilBuscGenProd4.setEnabled( true );
		}
		else {
			cbFilBuscGenProd1.setEnabled( false );
			cbFilBuscGenProd2.setEnabled( false );
			cbFilBuscGenProd3.setEnabled( false );
			cbFilBuscGenProd4.setEnabled( false );
		}
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		lcMoeda.setConexao( cn );
		lcTabJuros.setConexao( cn );
		lcMarca.setConexao( cn );
		lcGrupo.setConexao( cn );
		lcTipoFor.setConexao( cn );
		lcFor.setConexao( cn );
		lcTipoMov.setConexao( cn );
		lcTipoMov2.setConexao( cn );
		lcTipoMov3.setConexao( cn );
		lcTipoMov4.setConexao( cn );
		lcTipoMov5.setConexao( cn );
		lcTipoMov6.setConexao( cn );
		lcTipoMov7.setConexao( cn );
		lcTipoMov8.setConexao( cn );
		lcTipoMov9.setConexao( cn );		
		
		lcTransp.setConexao( cn );
		lcPlanoPag.setConexao( cn );
		lcPlanoPag2.setConexao( cn );
		lcClasCli.setConexao( cn );
		lcTabPreco.setConexao( cn );
		lcCli.setConexao( cn );
		lcPDV.setConexao( cn );
		lcPrefere3.setConexao( cn );
		lcMens.setConexao( cn );
		lcMensGeral.setConexao( cn );
		lcHistPag.setConexao( cn );
		lcHistRec.setConexao( cn );
		lcTipoCli.setConexao( cn );
		lcPlanJR.setConexao( cn );
		lcPlanJP.setConexao( cn );
		lcPlanDC.setConexao( cn );
		lcPlanDR.setConexao( cn );		
		
		lcCampos.carregaDados();
		

	}

	public void afterCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcCampos ) {
			if ( ! ( lcPDV.getStatus() == ListaCampos.LCS_EDIT || lcPDV.getStatus() == ListaCampos.LCS_INSERT ) )
				lcPDV.carregaDados();

			if ( ! ( lcPrefere3.getStatus() == ListaCampos.LCS_EDIT || lcPrefere3.getStatus() == ListaCampos.LCS_INSERT ) )
				lcPrefere3.carregaDados();
		}

	}

	public void beforeCarrega( CarregaEvent cevt ) {

	}
	
	public void actionPerformed( ActionEvent e ) {

		if ( e.getSource() == btDirNfe ) {
			Thread th = new Thread( new Runnable() {
				public void run() {
					getDiretorio();
				}
			} );
			th.start();
		}
		
		super.actionPerformed( e );
		
	}
	
	private void getDiretorio() {

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		if ( fileChooser.showOpenDialog( this ) == JFileChooser.APPROVE_OPTION ) {
			txtDirNfe.setVlrString( fileChooser.getSelectedFile().getPath() );
		}
	}

	
}

/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR> 
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FVenda.java <BR>
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
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.DeleteEvent;
import org.freedom.acao.DeleteListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JPasswordFieldPad;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Painel;
import org.freedom.funcoes.Funcoes;
import org.freedom.layout.Leiaute;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;
import org.freedom.telas.FObservacao;
import org.freedom.telas.FPrincipal;

public class FVenda extends FVD implements PostListener,CarregaListener,FocusListener,ActionListener,InsertListener,DeleteListener {
  private int casasDec = Aplicativo.casasDec;
  private Painel pinCabVenda = new Painel();
  private Painel pinCabComis = new Painel();
  private Painel pinCabFiscal = new Painel();
  private Painel pinDet = new Painel();
  private Painel pinTot = new Painel(200,200);
  private JPanel pnTot = new JPanel(new GridLayout(1,1));
  private JPanel pnCenter = new JPanel(new BorderLayout());
  private JButton btObs = new JButton(Icone.novo("btObs.gif"));
  private JButton btFechaVenda = new JButton(Icone.novo("btOk.gif"));
  private JButton btConsPgto = new JButton(Icone.novo("btConsPgto.gif"));
  private JButton btAdicOrc = new JButton("Busca Or�amento",Icone.novo("btOrcVenda.gif"));
  private JTextFieldPad txtCodVenda = new JTextFieldPad();
  private JTextFieldPad txtCodTipoMov = new JTextFieldPad();
  private JTextFieldPad txtCodSerie = new JTextFieldPad();
  private JTextFieldPad txtCodDoc = new JTextFieldPad();
  private JTextFieldPad txtCodTratTrib = new JTextFieldPad();
  private JTextFieldPad txtTipoMov = new JTextFieldPad();
  private JTextFieldPad txtESTipoMov = new JTextFieldPad(JTextFieldPad.TP_STRING,1,0);
  private JTextFieldPad txtDtEmitVenda = new JTextFieldPad();
  private JTextFieldPad txtDtSaidaVenda = new JTextFieldPad();
  private JTextFieldPad txtCodCli = new JTextFieldPad();
  private JTextFieldPad txtCodVend = new JTextFieldPad();
  private JTextFieldPad txtCodClComis = new JTextFieldPad();
  private JTextFieldPad txtCodPlanoPag = new JTextFieldPad();
  private JTextFieldFK txtDescClComis = new JTextFieldFK();
  private JTextFieldPad txtPercComisVenda = new JTextFieldPad();
  private JTextFieldPad txtCodItVenda = new JTextFieldPad();
  private JTextFieldPad txtQtdItVenda = new JTextFieldPad();
  private JTextFieldPad txtCodProd = new JTextFieldPad();
  private JTextFieldPad txtRefProd = new JTextFieldPad();
  private JTextFieldPad txtCLoteProd = new JTextFieldPad();
  private JTextFieldPad txtVerifProd = new JTextFieldPad(JTextFieldPad.TP_STRING,1,0);
  private JTextFieldPad txtPrecoItVenda = new JTextFieldPad();
  private JTextFieldPad txtPercDescItVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrDescItVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrComisItVenda = new JTextFieldPad();
  private JTextFieldPad txtPercComItVenda = new JTextFieldPad();
  private JTextFieldPad txtCodNat = new JTextFieldPad();
  private JTextFieldFK txtSldLiqProd = new JTextFieldFK();
  private JTextFieldPad txtPercICMSItVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrICMSItVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrLiqItVenda = new JTextFieldPad();
  private JTextFieldPad txtEstCli = new JTextFieldPad();
  private JTextFieldPad txtClasComis = new JTextFieldPad(JTextFieldPad.TP_STRING,1,0);
  private JTextFieldPad txtCodMens = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtCodLote = new JTextFieldPad();
  private JTextFieldPad txtCodFisc = new JTextFieldPad(JTextFieldPad.TP_STRING,13,0);
  private JTextFieldPad txtTipoFisc = new JTextFieldPad();
  private JTextFieldPad txtRedFisc = new JTextFieldPad();
  private JTextFieldPad txtVlrFreteVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrComisVenda = new JTextFieldPad();
  private JTextFieldPad txtMedComisVenda = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,9,2);
  private JTextFieldPad txtVlrICMSVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrIPIVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrPisVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrCofinsVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrIRVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrCSocialVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrProdVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrDescVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrLiqVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrProdItVenda = new JTextFieldPad();
  private JTextFieldPad txtBaseIPIItVenda = new JTextFieldPad();
  private JTextFieldPad txtStrDescItVenda = new JTextFieldPad();
  private JTextAreaPad txaObsItVenda = new JTextAreaPad(500);
  private JTextFieldPad txtBaseICMSItVenda = new JTextFieldPad();
  private JTextFieldPad txtAliqFisc = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,9,2);
  private JTextFieldPad txtAliqIPIItVenda = new JTextFieldPad();
  private JTextFieldPad txtVlrIPIItVenda = new JTextFieldPad();
  private JTextFieldPad txtAliqIPIFisc = new JTextFieldPad();
  private JTextFieldPad txtVlrBrutVenda = new JTextFieldPad();
  private JTextFieldPad txtStatusVenda = new JTextFieldPad();
  private JTextFieldPad txtOrigFisc = new JTextFieldPad();
  private JTextFieldPad txtCodEmpLG = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtCodFilialLG = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtCodLog = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescTipoMov = new JTextFieldFK();
  private JTextFieldFK txtDescCli = new JTextFieldFK();
  private JTextFieldFK txtDescVend = new JTextFieldFK();
  private JTextFieldFK txtDescPlanoPag = new JTextFieldFK();
  private JTextFieldFK txtDescProd = new JTextFieldFK();
  private JTextFieldFK txtDescNat = new JTextFieldFK();
  private JTextFieldFK txtDescLote = new JTextFieldFK();
  private JTextFieldFK txtDescFisc = new JTextFieldFK();
  private JTextField txtFiscalTipoMov1 = new JTextField();
  private JTextField txtFiscalTipoMov2 = new JTextField();
  private ListaCampos lcTratTrib = new ListaCampos(this,"TT");
  private ListaCampos lcTipoMov = new ListaCampos(this,"TM");
  private ListaCampos lcCli = new ListaCampos(this,"CL");
  private ListaCampos lcVend = new ListaCampos(this,"VD");
  private ListaCampos lcPlanoPag = new ListaCampos(this,"PG");
  private ListaCampos lcSerie = new ListaCampos(this,"SE");
  private ListaCampos lcProd = new ListaCampos(this,"PD");
  private ListaCampos lcProd2 = new ListaCampos(this,"PD");
  private ListaCampos lcNat = new ListaCampos(this,"NT");
  private ListaCampos lcLote = new ListaCampos(this,"LE");
  private ListaCampos lcClComis = new ListaCampos(this,"CM");
  private ListaCampos lcFisc = new ListaCampos(this);
  private ListaCampos lcVenda2 = new ListaCampos(this);
  private JTabbedPane tpnCab = new JTabbedPane();
  private JButton btAltComis = new JButton(Icone.novo("btEditar.gif"));
  private FPrincipal fPrim;
  private Connection con = null;
  
  JTextFieldPad txtUltCamp = new JTextFieldPad();
  boolean[] bPrefs = null;
  boolean bCtrl = false;
  String sOrdNota="";
  
  public FVenda() {
    setTitulo("Venda");
    setAtribos(15,10,765,460);
    
    pnCliCab.add(tpnCab);
    
    tpnCab.addTab("Venda",pinCabVenda);
    tpnCab.addTab("Comiss�o",pinCabComis);
    tpnCab.addTab("Fiscal",pinCabFiscal);
    
    btAdicOrc.setPreferredSize(new Dimension(180,0));
	pnNavCab.add(btAdicOrc,BorderLayout.EAST);

    pnMaster.remove(2);  //Remove o Painel predefinido da class FDados
    pnGImp.removeAll(); //Remove os bot�es de impress�o para adicionar logo embaixo
    pnGImp.setLayout(new GridLayout(1,4)); //redimensiona o painel de impress�o
    pnGImp.setPreferredSize(new Dimension( 280, 26));
    pnGImp.add(btPrevimp);
    pnGImp.add(btImp);
    pnGImp.add(btFechaVenda);
    pnGImp.add(btConsPgto);
    pnGImp.add(btObs);//Agora o painel est� maior

    pnTot.setPreferredSize(new Dimension(110,200)); //Painel de Totais
    pnTot.add(pinTot);
    pnCenter.add(pnTot,BorderLayout.EAST);
    pnCenter.add(spTab,BorderLayout.CENTER);

    JPanel pnLab = new JPanel(new GridLayout(1,1));
    pnLab.add(new JLabel(" Totais:"));    //Label do painel de totais

    pnMaster.add(pnCenter,BorderLayout.CENTER);
    
    //FK Cliente
    txtCodCli.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtDescCli.setTipo(JTextFieldPad.TP_STRING,50,0);    
    txtCodPlanoPag.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtCodVend.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtEstCli.setTipo(JTextFieldPad.TP_STRING,2,0);
    lcCli.add(new GuardaCampo( txtCodCli, 7, 100, 80, 20, "CodCli", "C�d. cli.", true, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodClix");
    lcCli.add(new GuardaCampo( txtDescCli, 90, 100, 207, 20, "RazCli", "Raz�o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescClix");
    lcCli.add(new GuardaCampo( txtCodPlanoPag, 7, 100, 80, 20, "CodPlanoPag", "C�d.Plan.", false, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodPlanoPagx");
    lcCli.add(new GuardaCampo( txtCodVend, 7, 100, 80, 20, "CodVend", "C�d.Vend.", false, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodVendx");
    lcCli.add(new GuardaCampo( txtEstCli, 7, 100, 80, 20, "UfCli", "UF", false, false, null, JTextFieldPad.TP_STRING,false),"txtCodVendx");
    lcCli.montaSql(false, "CLIENTE", "VD");    
    lcCli.setQueryCommit(false);
    lcCli.setReadOnly(true);
    txtCodCli.setTabelaExterna(lcCli);
    
    //FK Vendedor
    txtDescVend.setTipo(JTextFieldPad.TP_STRING,40,0);    
    txtPercComisVenda.setTipo(JTextFieldPad.TP_DECIMAL,7,3);
    lcVend.add(new GuardaCampo( txtCodVend, 7, 100, 80, 20, "CodVend", "C�d. repr.", true, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodVendx");
    lcVend.add(new GuardaCampo( txtDescVend, 90, 100, 207, 20, "NomeVend", "Nome", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescVendx");
    lcVend.add(new GuardaCampo( txtCodClComis, 7, 100, 80, 20, "CodClComis", "C�d.C.Com.", false, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodClComis");
    lcVend.add(new GuardaCampo( txtPercComisVenda, 90, 100, 207, 20, "PercComVend", "% Comis.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtDescVendx");
    lcVend.montaSql(false, "VENDEDOR", "VD");
    lcVend.setQueryCommit(false);
    lcVend.setReadOnly(true);
    txtCodVend.setTabelaExterna(lcVend);
    
    //FK Plano de Pagamento
    txtDescPlanoPag.setTipo(JTextFieldPad.TP_STRING,40,0);    
    lcPlanoPag.add(new GuardaCampo( txtCodPlanoPag, 7, 100, 80, 20, "CodPlanoPag", "C�d.p.pag.", true, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodPlanoPagx");
    lcPlanoPag.add(new GuardaCampo( txtDescPlanoPag, 90, 100, 207, 20, "DescPlanoPag", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescPlanoPagx");
    lcPlanoPag.montaSql(false, "PLANOPAG", "FN");    
    lcPlanoPag.setQueryCommit(false);
    lcPlanoPag.setReadOnly(true);
    txtCodPlanoPag.setTabelaExterna(lcPlanoPag);
    
    //FK S�rie
    txtCodDoc.setTipo(JTextFieldPad.TP_INTEGER,8,0);    
    lcSerie.add(new GuardaCampo( txtCodSerie, 7, 100, 80, 20, "Serie", "S�rie", true, false, null, JTextFieldPad.TP_STRING,false),"txtCodSeriex");
    lcSerie.add(new GuardaCampo( txtCodDoc, 90, 100, 207, 20, "DocSerie", "Doc. atual", false, false, null, JTextFieldPad.TP_INTEGER,false),"txtDescSeriex");
    lcSerie.montaSql(false, "SERIE", "LF");
    lcSerie.setQueryCommit(false);
    lcSerie.setReadOnly(true);
    txtCodSerie.setTabelaExterna(lcSerie);
    
    
    //FK de Lotes
    txtCodLote.setTipo(JTextFieldPad.TP_STRING,13,0);
    txtDescLote.setTipo(JTextFieldPad.TP_DATE,10,0);    
    txtSldLiqProd.setTipo(JTextFieldPad.TP_DECIMAL,15,2);    
    lcLote.add(new GuardaCampo( txtCodLote, 7, 100, 80, 20, "CodLote", "Lote", true, false, txtDescLote, JTextFieldPad.TP_STRING,false),"txtCodLotex");
    lcLote.add(new GuardaCampo( txtDescLote, 90, 100, 207, 20, "VenctoLote", "Vencto.", false, false, null, JTextFieldPad.TP_DATE,false),"txtDescLotex");
    lcLote.add(new GuardaCampo( txtSldLiqProd, 90, 100, 207, 20, "SldLiqLote", "Saldo", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtDescLotex");
    lcLote.setDinWhereAdic("CODPROD=#N AND (VENCTOLOTE >= #D OR #S IN('DV','PE'))",txtCodProd);
    lcLote.setDinWhereAdic("",txtDtSaidaVenda);    
    lcLote.setDinWhereAdic("",txtTipoMov);    
    lcLote.montaSql(false, "LOTE", "EQ");
    lcLote.setQueryCommit(false);
    lcLote.setReadOnly(true);
    txtCodLote.setTabelaExterna(lcLote);
    txtDescLote.setListaCampos(lcLote);
    txtDescLote.setNomeCampo("VenctoLote");
    txtDescLote.setLabel("Vencimento");
    
    //FK de Classifica��o Fiscal (� acionada tamb�m quando o listaCampos de produtos � acionado)
    
    txtDescFisc.setTipo(JTextFieldPad.TP_STRING,50,0);
    txtAliqIPIFisc.setTipo(JTextFieldPad.TP_DECIMAL,6,2);
    lcFisc.add(new GuardaCampo( txtCodFisc, 7, 100, 80, 20, "CodFisc", "C�d. fisc.", true, false, txtDescFisc, JTextFieldPad.TP_STRING,false),"txtCodFiscx");
    lcFisc.add(new GuardaCampo( txtDescFisc, 90, 100, 207, 20, "DescFisc", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescFiscx");
    lcFisc.add(new GuardaCampo( txtAliqIPIFisc, 90, 100, 207, 20, "AliqIPIFisc", "% IPI", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtAliqIPIFiscx");
	lcFisc.add(new GuardaCampo( txtAliqFisc, 90, 100, 207, 20, "AliqFisc", "% ICMS", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtAliqFiscx");
    lcFisc.montaSql(false, "CLFISCAL", "LF");
    lcFisc.setQueryCommit(false);
    lcFisc.setReadOnly(true);
    txtCodFisc.setTabelaExterna(lcFisc);
    txtDescFisc.setListaCampos(lcFisc);
    
    //FK de Natureza de Opera��o (� acionada tamb�m quando o listaCampos de Classifica��o Fiscal � acionado)
    
    txtCodNat.setTipo(JTextFieldPad.TP_STRING,4,0);
    txtDescNat.setTipo(JTextFieldPad.TP_STRING,40,0);    
    lcNat.add(new GuardaCampo( txtCodNat, "CodNat", "CFOP", ListaCampos.DB_PK,false));
    lcNat.add(new GuardaCampo( txtDescNat, "DescNat", "Descri��o da CFOP", ListaCampos.DB_SI,false));
    lcNat.montaSql(false, "NATOPER", "LF");
    lcNat.setQueryCommit(false);
    lcNat.setReadOnly(true);
    txtCodNat.setTabelaExterna(lcNat);
    txtDescNat.setListaCampos(lcNat);
    
	//FK de Tratamento Tribut�rio (� acionada tamb�m quando o listaCampos de Tratamento tribut�rio � acionado)
    
	txtCodTratTrib.setTipo(JTextFieldPad.TP_STRING,2,0);
	lcTratTrib.add(new GuardaCampo( txtCodTratTrib, "CodTratTrib", "C�d.T.T.", ListaCampos.DB_PK,false));
	lcTratTrib.montaSql(false, "TRATTRIB", "LF");
	lcTratTrib.setQueryCommit(false);
	lcTratTrib.setReadOnly(true);
	txtCodTratTrib.setTabelaExterna(lcTratTrib);

    //ListaCampos de Totais (� acionada pelo listaCampos de Venda)
    
    txtCodVenda.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtVlrFreteVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrComisVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrICMSVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrIPIVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrPisVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrCofinsVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrIRVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrCSocialVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrProdVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrDescVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrLiqVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    txtVlrBrutVenda.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    lcVenda2.add(new GuardaCampo( txtCodVenda, 7, 100, 80, 20, "CodVenda", "N. pedido", true, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrFreteVenda, 7, 100, 80, 20, "VlrFreteVenda", "Vlr. frete", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrComisVenda, 7, 100, 80, 20, "VlrComisVenda", "Vlr. comis.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtMedComisVenda, 7, 100, 80, 20, "PercMComisVenda", "Med. comis.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrICMSVenda, 7, 100, 80, 20, "VlrICMSVenda", "Vlr. ICMS", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrIPIVenda, 7, 100, 80, 20, "VlrIPIVenda", "Vlr. IPI", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrPisVenda, 7, 100, 80, 20, "VlrPisVenda", "Vlr. PIS", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrCofinsVenda, 7, 100, 80, 20, "VlrCofinsVenda", "Vlr. COFINS", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrIRVenda, 7, 100, 80, 20, "VlrIRVenda", "Vlr. I.R.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrCSocialVenda, 7, 100, 80, 20, "VlrCSocialVenda", "Vlr. C.Social.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrProdVenda, 7, 100, 80, 20, "VlrProdVenda", "Vlr. prod.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrDescVenda, 7, 100, 80, 20, "VlrDescItVenda", "Vlr. desc.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrLiqVenda, 7, 100, 80, 20, "VlrLiqVenda", "Vlr. liq.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.add(new GuardaCampo( txtVlrBrutVenda, 7, 100, 80, 20, "VlrProdVenda", "Vlr. prod.", false, false, null, JTextFieldPad.TP_DECIMAL,false),"txtCodVendx");
    lcVenda2.setWhereAdic("TIPOVENDA='V'");
    lcVenda2.montaSql(false, "VENDA", "VD");
    lcVenda2.setQueryCommit(false);
    lcVenda2.setReadOnly(true);
    
    
    //lc para trazer classificacao da comissao
    
    txtCodClComis.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtDescClComis.setTipo(JTextFieldPad.TP_STRING,40,0);
    
    lcClComis.add(new GuardaCampo( txtCodClComis, "CodClComis", "C�d.C.Com.", ListaCampos.DB_PK, false));
    lcClComis.add(new GuardaCampo( txtDescClComis, "DescClComis", "Descri��o", ListaCampos.DB_SI, false));
    lcClComis.montaSql(false, "CLCOMIS", "VD");
    lcClComis.setQueryCommit(false);
    lcClComis.setReadOnly(true);
    txtCodClComis.setTabelaExterna(lcClComis);
    
    
    //Coloca os comentrio nos bot�es
    
    btFechaVenda.setToolTipText("Fechar a Venda (F4)");
    btConsPgto.setToolTipText("Consulta Pagamentos (F5)");
    btObs.setToolTipText("Observa��es (Ctrl + O)");
    
    //Desativa as os TextFields para que os usu�rios n�o possam mexer 
    
    txtCodSerie.setAtivo(false);
    txtCodDoc.setAtivo(false);
    txtVlrFreteVenda.setAtivo(false);
    txtVlrComisVenda.setAtivo(false);
    txtMedComisVenda.setAtivo(false);
    txtVlrICMSVenda.setAtivo(false);
    txtVlrIPIVenda.setAtivo(false);
    txtVlrPisVenda.setAtivo(false);
    txtVlrCofinsVenda.setAtivo(false);
    txtVlrIRVenda.setAtivo(false);
    txtVlrCSocialVenda.setAtivo(false);
    txtVlrProdVenda.setAtivo(false);
    txtVlrDescVenda.setAtivo(false);
    txtVlrLiqVenda.setAtivo(false);
    //Desativa as os TextFields para que os usu�rios n�o possam mexer 
    //txtDescNat.setTipo(txtDescNat.TP_STRING,40,0);    
    
    txtSldLiqProd.setTipo(JTextFieldPad.TP_DECIMAL,15,casasDec);
    
    txtBaseICMSItVenda.setAtivo(false);
    txtVlrICMSItVenda.setAtivo(false);
    txtVlrLiqItVenda.setAtivo(false);
    txtVlrIPIItVenda.setAtivo(false);
    //Adiciona os Listeners
    
	txtDescProd.setToolTipText("Clique aqui duas vezes para alterar a descri��o.");
	txtDescProd.addMouseListener(
	  new MouseAdapter() {
		public void mouseClicked(MouseEvent mevt) {
			if (mevt.getClickCount() == 2)
				mostraTelaDecricao();
		}
	  }
	);
    
    btFechaVenda.addActionListener(this);
    btConsPgto.addActionListener(this);
    btObs.addActionListener(this);
	btAdicOrc.addActionListener(this);
    
	txtPercDescItVenda.addFocusListener(this);
    txtPercComItVenda.addFocusListener(this);
    txtVlrDescItVenda.addFocusListener(this);
    txtVlrProdItVenda.addFocusListener(this);
    txtQtdItVenda.addFocusListener(this);
    txtCodNat.addFocusListener(this);
    txtPrecoItVenda.addFocusListener(this);
    txtPercICMSItVenda.addFocusListener(this);
    lcCampos.addPostListener(this);
    lcCampos.addCarregaListener(this);
    lcVend.addCarregaListener(this);
    lcCli.addCarregaListener(this);
    lcFisc.addCarregaListener(this);
    lcProd.addCarregaListener(this);
    lcProd2.addCarregaListener(this);
    lcNat.addCarregaListener(this);
    lcDet.addPostListener(this);
    lcDet.addCarregaListener(this);
    lcCampos.addInsertListener(this);
    lcDet.addInsertListener(this);
    lcDet.addDeleteListener(this);
    lcVenda2.addCarregaListener(this);

    btImp.addActionListener(this);
    btPrevimp.addActionListener(this);
    btAltComis.addActionListener(this);

  }
  //Fun��o criada para montar a tela conforme a prefer�ncia do usu�rio:
  //com ou sem Refer�ncia de PK;
  private void montaTela() {
    bPrefs = prefs(); //Carrega as prefer�ncias

    //FK Produto
    txtCodProd.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtRefProd.setTipo(JTextFieldPad.TP_STRING,13,0);    
    txtDescProd.setTipo(JTextFieldPad.TP_STRING,50,0);    
    txtCLoteProd.setTipo(JTextFieldPad.TP_STRING,1,0);    
    txtPercComItVenda.setTipo(JTextFieldPad.TP_DECIMAL,6,2);
    txtCodFisc.setTipo(JTextFieldPad.TP_STRING,13,0);
    txtSldLiqProd.setTipo(JTextFieldPad.TP_NUMERIC,15,3);
    txtVerifProd.setTipo(JTextFieldPad.TP_STRING,1,0);
    
    lcProd.add(new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK,false));
    lcProd.add(new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produtos", ListaCampos.DB_SI,false));
    lcProd.add(new GuardaCampo( txtRefProd, "RefProd", "Ref.prod.", ListaCampos.DB_SI,false));
    lcProd.add(new GuardaCampo( txtCLoteProd, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false));
    lcProd.add(new GuardaCampo( txtCodFisc, "CodFisc", "C�d.fisc.", ListaCampos.DB_FK, false));
    lcProd.add(new GuardaCampo( txtPercComItVenda, "ComisProd", "% Comis.", ListaCampos.DB_SI,false));
    lcProd.add(new GuardaCampo( txtSldLiqProd, "SldLiqProd","Saldo", ListaCampos.DB_SI,false));
    lcProd.add(new GuardaCampo( txtVerifProd, "VerifProd","Verif. custo",ListaCampos.DB_SI,false));
    lcProd.setWhereAdic("ATIVOPROD='S' AND TIPOPROD IN ('P','S','F'"+(bPrefs[8]?",'M'":"")+")");
    lcProd.montaSql(false, "PRODUTO", "EQ");
    lcProd.setQueryCommit(false);
    lcProd.setReadOnly(true);
    txtCodProd.setTabelaExterna(lcProd);
    //FK do produto (*Somente em caso de refer�ncias este listaCampos 
      //Trabalha como gatilho para o listaCampos de produtos, assim
      //carregando o c�digo do produto que ser� armazenado no Banco)
    lcProd2.add(new GuardaCampo( txtRefProd, "RefProd", "Ref.prod.", ListaCampos.DB_PK, false));
    lcProd2.add(new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI,false));
    lcProd2.add(new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_SI, false));
    lcProd2.add(new GuardaCampo( txtCLoteProd, "CLoteProd", "C/Lote", ListaCampos.DB_SI, false));
    lcProd2.add(new GuardaCampo( txtCodFisc, "CodFisc", "C�d.fisc.", ListaCampos.DB_FK, false));
    lcProd2.add(new GuardaCampo( txtPercComItVenda, "ComisProd", "% comis.", ListaCampos.DB_SI, false ));
    lcProd2.add(new GuardaCampo( txtSldLiqProd, "SldLiqProd","Saldo", ListaCampos.DB_SI, false));
    lcProd2.add(new GuardaCampo( txtVerifProd, "VerifProd","Verif. custo", ListaCampos.DB_SI, false));
    txtRefProd.setNomeCampo("RefProd");
    txtRefProd.setListaCampos(lcDet);
    lcProd2.setWhereAdic("ATIVOPROD='S' AND TIPOPROD IN ('P','S','F'"+(bPrefs[8]?",'M'":"")+")");
    lcProd2.montaSql(false, "PRODUTO", "EQ");
    lcProd2.setQueryCommit(false);
    lcProd2.setReadOnly(true);
    txtRefProd.setTabelaExterna(lcProd2);
    
    //FK Tipo de movimentos
    txtCodTipoMov.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtDescTipoMov.setTipo(JTextFieldPad.TP_STRING,40,0);    
    txtCodSerie.setTipo(JTextFieldPad.TP_STRING,4,0);
    txtTipoMov.setTipo(JTextFieldPad.TP_STRING,2,0);
    lcTipoMov.add(new GuardaCampo( txtCodTipoMov, "CodTipoMov", "C�d.Tp.Mov.", ListaCampos.DB_PK,false));
    lcTipoMov.add(new GuardaCampo( txtDescTipoMov, "DescTipoMov", "Descri��o", ListaCampos.DB_SI,false));
    lcTipoMov.add(new GuardaCampo( txtCodSerie, "Serie", "S�rie", ListaCampos.DB_FK,false));
    lcTipoMov.add(new GuardaCampo( txtTipoMov, "TipoMov", "Tipo mov.", ListaCampos.DB_SI,false));
    lcTipoMov.add(new GuardaCampo( txtESTipoMov, "ESTipoMov", "E/S", ListaCampos.DB_SI,false));
    lcTipoMov.setWhereAdic("(ESTIPOMOV = 'S' OR TIPOMOV IN ('PV','DV'))"); 
    if (bPrefs[5]) {
    	txtFiscalTipoMov1.setText("S");
    	txtFiscalTipoMov2.setText("N");
    	lcTipoMov.setDinWhereAdic("FISCALTIPOMOV IN(#S,#S)",txtFiscalTipoMov1);
    	lcTipoMov.setDinWhereAdic("",txtFiscalTipoMov2);
    }
    lcTipoMov.montaSql(false, "TIPOMOV", "EQ");    
    lcTipoMov.setQueryCommit(false);
    lcTipoMov.setReadOnly(true);
    txtCodTipoMov.setTabelaExterna(lcTipoMov);
    
    //Adiciona os componentes na tela e no ListaCompos da venda 
    setListaCampos(lcCampos); 
    setAltCab(160);
    setPainel(pinCabVenda);
    adicCampo(txtCodVenda, 7, 20, 90, 20,"CodVenda","N. pedido",JTextFieldPad.TP_INTEGER,8,0,true,false,null,true);
    adicCampo(txtCodTipoMov, 100, 20, 77, 20,"CodTipoMov","C�d.tp.mov.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescTipoMov,true);
    adicDescFK(txtDescTipoMov, 180, 20, 197, 20, "DescTipoMov", "Descri��o do tipo de movimento", JTextFieldPad.TP_STRING, 40, 0);
    adicCampo(txtCodSerie, 380, 20, 77, 20,"Serie","S�rie",JTextFieldPad.TP_STRING,4,0,false,true,null,false);
    adicCampo(txtCodDoc, 460, 20, 77, 20,"DocVenda","N doc.",JTextFieldPad.TP_INTEGER,8,0,false,false,null,false);
    adicCampo(txtDtEmitVenda, 540, 20, 97, 20,"DtEmitVenda","Data emis.",JTextFieldPad.TP_DATE,10,0,false,false,null,true);
    adicCampo(txtDtSaidaVenda, 640, 20, 97, 20,"DtSaidaVenda","Data sa�da",JTextFieldPad.TP_DATE,10,0,false,false,null,true);
    adicCampo(txtCodCli, 7, 60, 80, 20,"CodCli","C�d. cli.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescCli,true);
    adicDescFK(txtDescCli, 90, 60, 197, 20, "RazCli", "Raz�o social do cliente", JTextFieldPad.TP_STRING, 50, 0);
    adicCampo(txtCodPlanoPag, 290, 60, 77, 20,"CodPlanoPag","C�d.p.pag.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescPlanoPag,true);
    adicDescFK(txtDescPlanoPag, 370, 60, 197, 20, "DescPlanoPag", "Descri��o do plano de pag.", JTextFieldPad.TP_STRING, 40, 0);
    setPainel(pinCabComis);
    adicCampo(txtCodVend, 7, 20, 80, 20,"CodVend","C�d.repr.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescVend,true);
    adicDescFK(txtDescVend, 90, 20, 197, 20, "NomeVend", "Nome do representante", JTextFieldPad.TP_STRING, 40, 0);
    if (bPrefs[4]) {
      adicCampo(txtCodClComis, 290, 20, 80, 20,"CodClComis","C�d.c.comis.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescClComis,true);
      adicDescFK(txtDescClComis,373, 20, 260, 20, "DescClComis", "Descri��o da class. de comis.", JTextFieldPad.TP_STRING, 40, 0);
      
      adicCampo(txtPercComisVenda, 640, 20, 57, 20,"PercComisVenda","% comis.",JTextFieldPad.TP_DECIMAL,6,2,false,false,null,true);
      adic(new JLabel("Vlr. comis."), 7, 40, 100, 20);
      adic(txtVlrComisVenda, 7, 60, 100, 20);
      adic(new JLabel("% M. comis."), 110, 40, 100, 20);
      adic(txtMedComisVenda, 110, 60, 80, 20);
      adic(btAltComis, 200, 50, 30, 30);
    }
    else {
      adicCampo(txtPercComisVenda, 290, 20, 57, 20,"PercComisVenda","% comis.",JTextFieldPad.TP_DECIMAL,6,2,false,false,null,true);
    }
    adicCampoInvisivel(txtStatusVenda,"StatusVenda","Sit.",JTextFieldPad.TP_STRING,2,0,false,false,null,false);
    setPainel(pinCabFiscal);
    adicCampo(txtVlrIPIVenda, 7, 20, 80, 20,"VlrIPIVenda","Vlr. IPI",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtVlrICMSVenda, 7, 60, 80, 20,"VlrICMSVenda","Vlr. ICMS",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtVlrPisVenda, 90, 20, 77, 20,"VlrPisVenda","Vlr. PIS",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtVlrCofinsVenda, 90, 60, 77, 20,"VlrCofinsVenda","Vlr. PIS",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtVlrIRVenda, 170, 20, 80, 20,"VlrIRVenda","Vlr. I.R.",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtVlrCSocialVenda, 170, 60, 80, 20,"VlrCSocialVenda","Vlr. c. social",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    lcCampos.setWhereAdic("TIPOVENDA='V'");
    setListaCampos( true, "VENDA", "VD");
    
    setAltDet(100);
    pinDet = new Painel(740,100);
    setPainel( pinDet, pnDet);
    setListaCampos(lcDet);
    setNavegador(navRod);
    adicCampo(txtCodItVenda, 7, 20, 30, 20,"CodItVenda","Item",JTextFieldPad.TP_INTEGER,8,0,true,false,null,true);
    
    if (bPrefs[6])
    	txtCodNat.setAtivo(true);
    else 
    	txtCodNat.setAtivo(false);
    	
    
    
    if (bPrefs[0]) {
      txtRefProd.setBuscaAdic(new DLBuscaProd(this,con,"REFPROD"),false);
      adicCampoInvisivel(txtCodProd,"CodProd","C�d. prod.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescProd,false);
      adicCampoInvisivel(txtRefProd,"RefProd","Ref. prod.",JTextFieldPad.TP_STRING,13,0,false,false,null,false);
      adic(new JLabel("Ref. prod."), 40, 0, 67, 20);
      adic(txtRefProd, 40, 20, 67, 20);
      txtRefProd.setFK(true);
    }
    else {
      txtCodProd.setBuscaAdic(new DLBuscaProd(this,con,"CODPROD"),false);
      adicCampo(txtCodProd, 40, 20, 67, 20,"CodProd","C�d. prod.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescProd,true);
    }
    adicDescFK(txtDescProd, 110, 20, 227, 20, "DescProd", "Descri��o do produto", JTextFieldPad.TP_STRING, 50, 0);
    adicCampo(txtCodLote, 340, 20, 67, 20,"CodLote","Lote",JTextFieldPad.TP_STRING,13,0,false,true,txtDescLote,false);
    adicCampo(txtQtdItVenda, 410, 20, 67, 20,"QtdItVenda","Qtd.",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,true);
    adicCampo(txtPrecoItVenda, 480, 20, 67, 20,"PrecoItVenda","Pre�o",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,true);
    adicCampo(txtPercDescItVenda, 550, 20, 57, 20,"PercDescItVenda","% desc.",JTextFieldPad.TP_DECIMAL,6,casasDec,false,false,null,false);
    adicCampo(txtVlrDescItVenda, 610, 20, 67, 20,"VlrDescItVenda","V. desc.",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtPercComItVenda, 680, 20, 57, 20,"PercComisItVenda","% com.",JTextFieldPad.TP_DECIMAL,6,casasDec,false,false,null,false);
    adicCampo(txtVlrComisItVenda, 7, 60, 70, 20,"VlrComisItVenda","V. com.",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    
    
    adicCampo(txtCodNat, 80, 60, 47, 20,"CodNat","CFOP",JTextFieldPad.TP_STRING,4,0,false,true,txtDescNat,true);
    
    adicDescFK(txtDescNat, 130, 60, 197, 20, "DescNat", "Descri��o da nat. da oper.", JTextFieldPad.TP_STRING, 40, 0);
    // colocar aqui o campo de saldo 
    adicDescFK(txtSldLiqProd, 330, 60, 67, 20 ,"SldLiqProd","Saldo",JTextFieldPad.TP_DECIMAL,15,2);
    adicCampo(txtBaseICMSItVenda, 400, 60, 67, 20,"VlrBaseICMSItVenda","B. ICMS",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampo(txtPercICMSItVenda, 470, 60, 57, 20,"PercICMSItVenda","% ICMS",JTextFieldPad.TP_DECIMAL,6,2,false,false,null,true);
    adicCampo(txtVlrICMSItVenda, 530, 60, 67, 20,"VlrICMSItVenda","V. ICMS",JTextFieldPad.TP_DECIMAL,6,casasDec,false,false,null,false);
    adicCampoInvisivel(txtBaseIPIItVenda,"VlrBaseIPIItVenda","B. IPI",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampoInvisivel(txtAliqIPIItVenda,"PercIPIItVenda","% IPI",JTextFieldPad.TP_DECIMAL,6,2,false,false,null,false);
    adicCampo(txtVlrIPIItVenda, 600, 60, 67, 20,"VlrIPIItVenda","V. IPI",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampoInvisivel(txtVlrProdItVenda,"VlrProdItVenda","V. Bruto",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
	adicCampoInvisivel(txtStrDescItVenda,"StrDescItVenda","Descontos",JTextFieldPad.TP_STRING,50,0,false,false,null,false);
	adicDBLiv(txaObsItVenda,"ObsItVenda","Observa��o",JTextFieldPad.TP_STRING,false);
	adicCampoInvisivel(txtOrigFisc,"OrigFisc","Origem",JTextFieldPad.TP_STRING,1,0,false,false,null,false);
	adicCampoInvisivel(txtCodTratTrib,"CodTratTrib","Trat. trib.",JTextFieldPad.TP_STRING,2,0,false,true,null,false);
	adicCampoInvisivel(txtTipoFisc,"TipoFisc","Tipo fisc.",JTextFieldPad.TP_STRING,2,0,false,false,null,false);
	adicCampoInvisivel(txtCodMens,"CodMens","C�d. mens.",JTextFieldPad.TP_INTEGER,8,0,false,false,null,false);
    adicCampo(txtVlrLiqItVenda, 670, 60, 65, 20,"VlrLiqItVenda","Vlr. item",JTextFieldPad.TP_DECIMAL,15,casasDec,false,false,null,false);
    adicCampoInvisivel(txtCodEmpLG,"CodEmpLG","Emp. log.",JTextFieldPad.TP_INTEGER,8,0,false,false,null,false);
    adicCampoInvisivel(txtCodFilialLG,"CodFilialLG","Filial log.",JTextFieldPad.TP_INTEGER,8,0,false,false,null,false);
    adicCampoInvisivel(txtCodLog,"CodLog","C�d. log.",JTextFieldPad.TP_INTEGER,8,0,false,false,null,false);
    pinTot.adic(new JLabel("Vlr. prod."),7,0,90,20);
    pinTot.adic(txtVlrProdVenda,7,20,90,20);
    pinTot.adic(new JLabel("Vlr. desc."),7,40,90,20);
    pinTot.adic(txtVlrDescVenda,7,60,90,20);
    pinTot.adic(new JLabel("Vlr. liq."),7,80,90,20);
    pinTot.adic(txtVlrLiqVenda,7,100,90,20);
    txtCodNat.setStrMascara("#.###");
    lcDet.setWhereAdic("TIPOVENDA='V'");
    setListaCampos( true, "ITVENDA", "VD");

    int iIniRef = 3;
    if (bPrefs[0])
    	iIniRef = 4;
    
    montaTab();
    
    tab.setTamColuna(30,0);
    tab.setTamColuna(70,1);
    tab.setTamColuna(230,2);
    tab.setTamColuna(70,iIniRef);
    tab.setTamColuna(80,iIniRef+1);
    tab.setTamColuna(70,iIniRef+3);
    tab.setTamColuna(70,iIniRef+4);
    tab.setTamColuna(60,iIniRef+5);
    tab.setTamColuna(70,iIniRef+6);
    tab.setTamColuna(60,iIniRef+7);
    tab.setTamColuna(70,iIniRef+8);
    tab.setTamColuna(200,iIniRef+9);
    tab.setTamColuna(70,iIniRef+10);
    tab.setTamColuna(60,iIniRef+11);
    tab.setTamColuna(70,iIniRef+12);
    tab.setTamColuna(70,iIniRef+13);
    tab.setTamColuna(60,iIniRef+14);
    tab.setTamColuna(70,iIniRef+15);
    tab.setTamColuna(80,iIniRef+16);
    tab.setTamColuna(90,iIniRef+17);
    tab.setAutoRol(true);
  }
  private void buscaICMS() {
  	if (txtAliqFisc.doubleValue() > 0) {
		txtPercICMSItVenda.setVlrBigDecimal(txtAliqFisc.getVlrBigDecimal());
		return; //Ele cai fora porque se existe um valor no CLFISCAL ele nem busca a Aliq. por Natureza da opera�ao.
  	}
    String sSQL = "SELECT PERCICMS FROM LFBUSCAICMSSP(?,?,?,?)";
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
      ps.setString(1,txtCodNat.getVlrString());
      ps.setString(2,txtEstCli.getVlrString());
      ps.setInt(3,Aplicativo.iCodEmp);
      ps.setInt(4,Aplicativo.iCodFilialMz);
      rs = ps.executeQuery();
      if (rs.next()) {
        txtPercICMSItVenda.setVlrBigDecimal(new BigDecimal(rs.getString(1)));
      }
      calcImpostos(true);
    }
    catch(SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar percentual de ICMS!\n"+err.getMessage());
    }
  }
  /**
   * Busca de lote.
   * Busca do lote mais proximo da data de venda.
   * 
   */
  private void buscaLote() {
    String sSQL = "SELECT MIN(L.CODLOTE) FROM EQLOTE L WHERE "+
                  "L.CODPROD=? AND L.CODFILIAL=? AND L.SLDLIQLOTE>0 "+
                  "AND L.CODEMP=? AND L.VENCTOLOTE = "+
                  "( "+
                  "SELECT MIN(VENCTOLOTE) FROM EQLOTE LS WHERE LS.CODPROD=L.CODPROD " +
                  "AND LS.CODFILIAL=L.CODFILIAL AND LS.CODEMP=L.CODEMP AND LS.SLDLIQLOTE>0 " +
                  "AND VENCTOLOTE >= CAST('today' AS DATE)"+
                  ")";
    try {
      PreparedStatement ps = con.prepareStatement(sSQL);
      ps.setInt(1,txtCodProd.getVlrInteger().intValue());
	  ps.setInt(2,lcProd.getCodFilial());
	  ps.setInt(3,Aplicativo.iCodEmp);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        String sCodLote = rs.getString(1);
        if (sCodLote != null) {
          txtCodLote.setVlrString(sCodLote.trim());
          lcLote.carregaDados();
        }
      }
      rs.close();
      ps.close();
    }
    catch(SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar lote!\n"+err);
    }
  }
  /**
   * Busca da Natureza de Opera��o .
   * Busca a natureza de opera��o atrav�s da tabela de regras fiscais.
   * 
   */
  private void buscaNat() {
    String sSQL = "SELECT CODNAT FROM LFBUSCANATSP (?,?,?,?,?,?,?,?,?,?,?,?)";
    try {
      PreparedStatement ps = con.prepareStatement(sSQL);
	  ps.setInt(1,Aplicativo.iCodFilial);
	  ps.setInt(2,Aplicativo.iCodEmp);
	  ps.setInt(3,lcProd.getCodFilial());
	  ps.setInt(4,txtCodProd.getVlrInteger().intValue());
	  ps.setInt(5,Aplicativo.iCodEmp);
	  ps.setInt(6,lcCli.getCodFilial());
	  ps.setInt(7,txtCodCli.getVlrInteger().intValue());
	  ps.setNull(8,Types.INTEGER);
	  ps.setNull(9,Types.INTEGER);
	  ps.setNull(10,Types.INTEGER);
	  ps.setInt(11,lcTipoMov.getCodFilial());
	  ps.setInt(12,txtCodTipoMov.getVlrInteger().intValue());
	  ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        txtCodNat.setVlrString(rs.getString("CODNAT"));
        lcNat.carregaDados();
      }
      rs.close();
      ps.close();
    }
    catch(SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar natureza da opera��o!\n"+err);
    }
  }
  private void buscaTratTrib() {
	String sSQL = "SELECT ORIGFISC,CODTRATTRIB,REDFISC,TIPOFISC,CODMENS,ALIQFISC" +
					" FROM LFBUSCAFISCALSP(?,?,?,?,?,?,?)";
	try {
	  PreparedStatement ps = con.prepareStatement(sSQL);
	  ps.setInt(1,Aplicativo.iCodFilial);
	  ps.setInt(2,Aplicativo.iCodEmp);
	  ps.setInt(3,lcProd.getCodFilial());
	  ps.setInt(4,txtCodProd.getVlrInteger().intValue());
	  ps.setInt(5,Aplicativo.iCodEmp);
	  ps.setInt(6,lcCli.getCodFilial());
	  ps.setInt(7,txtCodCli.getVlrInteger().intValue());
	  ResultSet rs = ps.executeQuery();
	  if (rs.next()) {
		txtOrigFisc.setVlrString(rs.getString("ORIGFISC"));
		txtCodTratTrib.setVlrString(rs.getString("CODTRATTRIB"));
		txtRedFisc.setVlrBigDecimal(new BigDecimal(rs.getString("REDFISC") != null ? rs.getString("REDFISC") : "0"));
		txtTipoFisc.setVlrString(rs.getString("TIPOFISC"));
		txtCodMens.setVlrString(rs.getString("CODMENS"));
		txtAliqFisc.setVlrString(rs.getString("ALIQFISC"));
	  }
	  rs.close();
	  ps.close();
	}
	catch(SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar tratamento tribut�rio!\n"+err);
	}
  }
  private void calcImpostos(boolean bBuscaBase) {
    double deRed = 0;
    double deVlrProd = 0;
    double deBaseIPI = 0;
    double deBaseICMS = 0;
    double deICMS = 0;
    double deIPI = 0;
    try {
        deRed = txtRedFisc.getVlrBigDecimal() != null ? txtRedFisc.doubleValue() : 0;
        deVlrProd = txtVlrProdItVenda.doubleValue() - txtVlrDescItVenda.doubleValue();
            
        if (bBuscaBase)
            deBaseICMS = 0;
        else
            deBaseICMS = txtBaseICMSItVenda.doubleValue();

//	  System.out.println("Red: "+bRed);
//	  System.out.println("VlrProd: "+bVlrProd);
        txtPercICMSItVenda.setAtivo(true);
        txtVlrICMSItVenda.setAtivo(true);
        txtBaseICMSItVenda.setAtivo(true);
        if (txtTipoFisc.getText().trim().equals("II")) {
            txtPercICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));
            txtVlrICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));
            if (bBuscaBase)
                txtBaseICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));
            txtPercICMSItVenda.setAtivo(false);
            txtVlrICMSItVenda.setAtivo(false);
            txtBaseICMSItVenda.setAtivo(false);
            if (txtCodNat.getAtivo())
                txtUltCamp=txtCodNat;
            else if (txtPercComItVenda.getAtivo())
                txtUltCamp=txtPercComItVenda;
            else
                txtUltCamp=txtVlrComisItVenda;
        }
        else if (txtTipoFisc.getText().trim().equals("FF")) {
            txtPercICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));      
            txtVlrICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));      
            if (bBuscaBase)
                txtBaseICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));      
            txtPercICMSItVenda.setAtivo(false);
            txtVlrICMSItVenda.setAtivo(false); 
            txtBaseICMSItVenda.setAtivo(false);
            txtUltCamp=txtCodNat;
        }
        else if (txtTipoFisc.getText().trim().equals("NN")) {
            txtPercICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));      
            txtVlrICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));      
            if (bBuscaBase)
                txtBaseICMSItVenda.setVlrBigDecimal(new BigDecimal("0"));      
            txtPercICMSItVenda.setAtivo(false);
            txtVlrICMSItVenda.setAtivo(false); 
            txtBaseICMSItVenda.setAtivo(false);
            txtUltCamp=txtCodNat;
        }
        else if (txtTipoFisc.getText().trim().equals("TT")) {
            if (deVlrProd > 0) {
                if (bBuscaBase)
                    deBaseICMS = Funcoes.arredDouble(deVlrProd-deVlrProd*deRed/100,casasDec);
                deBaseIPI = deVlrProd;
                deICMS = Funcoes.arredDouble( deBaseICMS *  txtPercICMSItVenda.doubleValue() /100, casasDec);
                deIPI = Funcoes.arredDouble( deBaseIPI *  txtAliqIPIFisc.doubleValue() / 100,casasDec); 
            }
            txtVlrICMSItVenda.setVlrBigDecimal(new BigDecimal(deICMS));
            txtBaseICMSItVenda.setVlrBigDecimal(new BigDecimal(deBaseICMS));
            txtVlrLiqItVenda.setVlrBigDecimal(new BigDecimal(deVlrProd));
            txtVlrIPIItVenda.setVlrBigDecimal(new BigDecimal(deIPI));
            txtBaseIPIItVenda.setVlrBigDecimal(new BigDecimal(deBaseIPI));
            txtAliqIPIItVenda.setVlrBigDecimal(txtAliqIPIFisc.getVlrBigDecimal());
            txtUltCamp=txtVlrICMSItVenda;
        }
        txtVlrLiqItVenda.setVlrBigDecimal(new BigDecimal(deVlrProd));
    }
    finally {
        deRed = 0;
        deVlrProd = 0;
        deBaseIPI = 0;
        deBaseICMS = 0;
        deICMS = 0;
        deIPI = 0;
    }
  }

  private void calcVlrProd() {
    double dePreco = txtPrecoItVenda.doubleValue();
    double deQtd = txtQtdItVenda.doubleValue();
    txtVlrProdItVenda.setVlrBigDecimal(new BigDecimal(Funcoes.arredDouble(dePreco*deQtd,casasDec)));
//    System.out.println("VlrProdTot: "+txtVlrProdItVenda.getVlrBigDecimal());
  }
  private boolean testaLucro() {
	    boolean bRet = false;
        String sCampoCusto = (bPrefs[3] ? "CUSTOMPMPROD" : "CUSTOPEPSPROD");
		String sSQL = "SELECT COUNT(*) FROM SGPREFERE1 PF, EQPRODUTO P" +
				              " WHERE PF.CODEMP=? AND PF.CODFILIAL=? AND "+
			                  "P.CODPROD=? AND (((P."+sCampoCusto+"/100)*(100+PF.PERCPRECOCUSTO)) <= ?"+
                              " OR PERCPRECOCUSTO IS NULL OR TIPOPROD='S')";
        try {
        	PreparedStatement ps = con.prepareStatement(sSQL);
        	ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
        	ps.setInt(3,txtCodProd.getVlrInteger().intValue());
        	ps.setDouble(4,txtPrecoItVenda.doubleValue());
        	ResultSet rs = ps.executeQuery();
        	if (rs.next())
        		if (rs.getInt(1) == 1)
        			bRet = true;
        	rs.close();
        	ps.close();
        }
        catch (SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao testar lucro!\n"+err);
        }
        if (!bRet && txtVerifProd.getVlrString().equals("S"))
        	bRet = mostraTelaPass();
        
        return bRet;
  }
  private boolean mostraTelaPass() {
  	 boolean bRet = false;
  	 JTextFieldPad txtUsu = new JTextFieldPad(JTextFieldPad.TP_STRING,8,0);
  	 txtUsu.setText(Aplicativo.strUsuario);
  	 JPasswordFieldPad txtPass = new JPasswordFieldPad(8);
   	 FFDialogo diag = new FFDialogo(this);
   	 diag.setTitulo("Permiss�o");
  	 diag.setAtribos(300,140);
  	 diag.adic(new JLabel("Usu�rio: "),7,10,100,20);
  	 diag.adic(new JLabel("Senha: "),7,30,100,20);
  	 diag.adic(txtUsu,110,10,150,20);
  	 diag.adic(txtPass,110,30,150,20);
  	 diag.adic(new JLabel("Senha: "),7,30,100,20);
   	 do {
  		try {
  			diag.setVisible(true);
  			if (diag.OK) {
  				Properties props = new Properties();
  				props.put("user", txtUsu.getVlrString());
  				props.put("password", txtPass.getVlrString());
  				if (txtUsu.getVlrString().trim().equals("") || txtPass.getVlrString().trim().equals("")) {
  					Funcoes.mensagemErro(this,"Campo em branco!");
  					continue;
  				}
  				DriverManager.getConnection(Aplicativo.strBanco, props).close();
  				String sSQL = "SELECT BAIXOCUSTOUSU FROM SGUSUARIO WHERE "+
  					                  "IDUSU = ? AND CODEMP=? AND CODFILIAL=?";
  				PreparedStatement ps = con.prepareStatement(sSQL);
  				ps.setString(1,txtUsu.getVlrString());
  				ps.setInt(2,Aplicativo.iCodEmp);
  				ps.setInt(3,Aplicativo.iCodFilial);
  				ResultSet rs = ps.executeQuery();
  				if (rs.next()) {
  					if ((rs.getString(1) != null ? rs.getString(1) : "").equals("S")) {
  						int iLog[] = Aplicativo.gravaLog(txtUsu.getVlrString(),"PR","LIB","Libera��o de venda abaixo do custo",
  					      "Venda: ["+txtCodVenda.getVlrString()+"], " +
  					      "Item: ["+txtCodItVenda.getVlrString()+"], " +
  					      "Produto: ["+txtCodProd.getVlrString()+"], " +
  					      "Pre�o: ["+txtPrecoItVenda.getVlrString()+"]",con);
  						txtCodEmpLG.setVlrString(""+Aplicativo.iCodEmp);
  						txtCodFilialLG.setVlrString(""+iLog[0]);
  						txtCodLog.setVlrString(""+iLog[1]);
						bRet = true;
  					}
  				}
  				if (!bRet)
  					Funcoes.mensagemErro(this,"A��o n�o permitida para este usu�rio.");
  				rs.close();
  				ps.close();
  			}
  		}
  		catch (java.sql.SQLException e) {
  			if (e.getErrorCode() == 335544472) {
  				Funcoes.mensagemErro( this, "Nome do usu�rio ou senha inv�lidos ! ! !");
  				continue;
  			}
 			Funcoes.mensagemErro( this,"N�o foi poss�vel estabelecer conex�o com o banco de dados.\n"+e.getMessage());
  		}
  		break;
  	 } while (true);
  	 diag.dispose();
  	 return bRet;
  }
  private void mostraTelaDescont() {
          String sObsDesc = "";
          int iFim = 0;
          if ((lcDet.getStatus() == ListaCampos.LCS_INSERT) || 
              (lcDet.getStatus() == ListaCampos.LCS_EDIT)) {
                      txtVlrDescItVenda.setAtivo(true);
                      txtPercDescItVenda.setAtivo(false);
                      txtPercDescItVenda.setVlrString("");
                      txtVlrDescItVenda.setVlrString("");
                      calcVlrProd();
                      calcImpostos(true);
                      DLDescontItVenda dl = new DLDescontItVenda(this,txtPrecoItVenda.doubleValue(),parseDescs());
                      dl.setVisible(true);
                      txtVlrDescItVenda.setAtivo(true);
                      txtPercDescItVenda.setAtivo(false);
                      txtPercDescItVenda.setVlrString("");
                      if(dl.OK) { 
                              txtVlrDescItVenda.setVlrBigDecimal(new BigDecimal(dl.getValor()*txtQtdItVenda.doubleValue()));
                              sObsDesc = txtStrDescItVenda.getText();
                              iFim = sObsDesc.indexOf("\n");
                              if (iFim >= 0) 
                                      sObsDesc = dl.getObs()+" "+sObsDesc.substring(iFim);
                              else
                                      sObsDesc = dl.getObs()+" \n";
                              txtStrDescItVenda.setVlrString(sObsDesc);
                      }
                      dl.dispose();
                      calcVlrProd();
                      calcImpostos(true);
                      txtVlrDescItVenda.requestFocus(true);
              }
  }

  private String[] parseDescs() {
          String[] sRet = new String[5];
          String sObs = txtStrDescItVenda.getText();
          int iFim = sObs.indexOf('\n');
          int iPos = 0;
  //        System.out.println("1 :"+sObs);
          if (iFim > 0) {
                  sObs = sObs.substring(0,iFim);
    //              System.out.println("2 :"+sObs);
                  if (sObs.indexOf("Desc.: ") == 0) {
                          sObs = sObs.substring(7);
      //                    System.out.println("3 :"+sObs);
                          iPos = sObs.indexOf('+');
                          for (int i=0;(iPos > 0) && (i < 5);i++) {
                                  sRet[i] = sObs.substring(0,iPos-1);
                                  if (iPos != iFim)
                                          sObs = sObs.substring(iPos+1);
        //                          System.out.println("4 :"+sObs);
                                  if (iPos == iFim)
                                          break;
                                  if ((iPos = sObs.indexOf('+')) == -1)
                                        iPos = iFim = sObs.length();
                          }
                  }
          }
          return sRet;
  }
  private void mostraTelaDecricao() {
	if (txtCodProd.getVlrString().equals(""))
		return;
	String sDesc = txaObsItVenda.getVlrString();
	if (sDesc.equals(""))
		sDesc = buscaDescComp();
		if (sDesc.equals(""))
			sDesc = txtDescProd.getVlrString();
  		 
	FObservacao obs = new FObservacao("Descri��o completa",sDesc,500);
	obs.setSize(400,200);
	obs.setVisible(true);
	if (obs.OK) {
		txaObsItVenda.setVlrString(obs.getTexto());
		lcDet.edit();
	}
	obs.dispose();
  }
  private String buscaDescComp() {
	String sRet = "";
	String sSQL = "SELECT DESCCOMPPROD FROM EQPRODUTO WHERE CODPROD=?" +
				  " AND CODEMP=? AND CODFILIAL=?";
	try {
		PreparedStatement ps = con.prepareStatement(sSQL);
		ps.setInt(1,txtCodProd.getVlrInteger().intValue());
		ps.setInt(2,Aplicativo.iCodEmp);
		ps.setInt(3,lcCampos.getCodFilial());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			sRet = rs.getString("DescCompProd"); 
		}
	}
	catch(SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar descri��o completa!\n"+err.getMessage());
		//err.printStackTrace();
	}
	return sRet != null ? sRet : "";
  } 
  private void testaCodVenda() { //Traz o verdadeiro n�mero do codvenda atrav�s do generator do banco
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement("SELECT * FROM SPGERANUM(?,?,?)");
      ps.setInt(1,Aplicativo.iCodEmp);
      ps.setInt(2,ListaCampos.getMasterFilial("VDVENDA"));
      ps.setString(3,"VD");
      rs = ps.executeQuery();
      rs.next();
      txtCodVenda.setVlrString(rs.getString(1));
      rs.close();
      ps.close();
      if (!con.getAutoCommit())
        con.commit();
    }
    catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao confirmar n�mero do pedido!\n"+err.getMessage());
    }
  }
  public void focusGained(FocusEvent fevt) { }
  public void focusLost(FocusEvent fevt) {
    if (fevt.getSource() == txtPercDescItVenda) {
      if (txtPercDescItVenda.getText().trim().length() < 1) {
        txtVlrDescItVenda.setAtivo(true);
      }
      else {
        txtVlrDescItVenda.setVlrBigDecimal( new BigDecimal( Funcoes.arredDouble(
          txtVlrProdItVenda.doubleValue() * txtPercDescItVenda.doubleValue() / 100
          ,casasDec)));
        calcVlrProd();
        calcImpostos(true);
        txtVlrDescItVenda.setAtivo(false);
      }
    }
    else if (fevt.getSource() == txtPercComItVenda) {
      if (txtPercComItVenda.getText().trim().length() < 1) {
        txtVlrComisItVenda.setAtivo(true);
      }
      else {
        txtVlrComisItVenda.setVlrBigDecimal(
          new BigDecimal(
            Funcoes.arredDouble(
              ( txtVlrProdItVenda.doubleValue() - txtVlrDescItVenda.doubleValue() ) * 
              txtPercComItVenda.doubleValue() / 100 * 
              txtPercComisVenda.doubleValue() / 100 , casasDec
            )
          )  
        );
        calcVlrProd();
        calcImpostos(true);
        txtVlrComisItVenda.setAtivo(false);
      }
    }
    else if (fevt.getSource() == txtVlrDescItVenda) {
      if (txtVlrDescItVenda.getText().trim().length() < 1) {
        txtPercDescItVenda.setAtivo(true);
      }
      else if (txtVlrDescItVenda.getAtivo()) {
        txtPercDescItVenda.setAtivo(false);
      }
    }
    else if (fevt.getSource() == txtVlrComisItVenda) {
      if (txtVlrComisItVenda.getText().trim().length() < 1) {
        txtPercComItVenda.setAtivo(true);
      }
      else if (txtVlrComisItVenda.getAtivo()) {
        txtPercComItVenda.setAtivo(false);
      }
    }
    else if ((fevt.getSource() == txtQtdItVenda) |
             (fevt.getSource() == txtPrecoItVenda) |
             (fevt.getSource() == txtCodNat)) {
       calcVlrProd();
	   calcImpostos(true);
    }
    else if (fevt.getSource() == txtPercICMSItVenda) {
      calcImpostos(false);
    }
  }
  
  public int[] getParansPreco() {
      int[] iRetorno = {txtCodProd.getVlrInteger().intValue(),
         txtCodCli.getVlrInteger().intValue(),
         Aplicativo.iCodEmp,
         ListaCampos.getMasterFilial("VDCLIENTE"),
         txtCodPlanoPag.getVlrInteger().intValue(),
         Aplicativo.iCodEmp,
         ListaCampos.getMasterFilial("FNPLANOPAG"),
         txtCodTipoMov.getVlrInteger().intValue(),
         Aplicativo.iCodEmp,
         ListaCampos.getMasterFilial("EQTIPOMOV"),
         Aplicativo.iCodEmp,
         Aplicativo.iCodFilial};
      return iRetorno;
  }
  
  public void setParansPreco(BigDecimal bdPreco) {
	  txtPrecoItVenda.setVlrBigDecimal(bdPreco);
  }
  public boolean testaCodLote() {
  	boolean bRetorno = false;
  	boolean bValido = false;
  	String sSQL = "SELECT COUNT(*) FROM EQLOTE WHERE CODLOTE=? AND CODPROD=?" +
						  " AND CODEMP=? AND CODFILIAL=?";
  	PreparedStatement ps = null;
  	ResultSet rs = null;
  	try {
  		ps = con.prepareStatement(sSQL);
  		ps.setString(1,txtCodLote.getText().trim());
  		ps.setInt(2,txtCodProd.getVlrInteger().intValue());
  		ps.setInt(3,Aplicativo.iCodEmp);
  		ps.setInt(4,lcLote.getCodFilial());
  		rs = ps.executeQuery();
  		if (rs.next()) {
  			if (rs.getInt(1) > 0) {
  				bValido = true;
  			}
  		}
        rs.close();
        ps.close();
        if (!con.getAutoCommit())
        	con.commit();
  	}
  	catch (SQLException err) {
  		Funcoes.mensagemErro(this,"Erro ao consultar a tabela EQLOTE!\n"+err.getMessage()); 
  	}
  	if (!bValido) {
  		bRetorno = txtCodLote.mostraDLF2FK();
  	}
  	else {
  		bRetorno = true;
  	}
  	return bRetorno;
  }

  public void beforeCarrega(CarregaEvent cevt) {
    if (cevt.getListaCampos() == lcProd2)
      lcProd.edit();
    if (lcCampos.getStatus() != ListaCampos.LCS_INSERT) { //Cancela os auto-incrementos que sobrep�em o que est� guardado na tabela venda
      if (cevt.getListaCampos() == lcVend) {
        lcVend.cancLerCampo(2,true); //Comiss�o do vendedor;
      }
      else if (cevt.getListaCampos() == lcCli) {
        lcCli.cancLerCampo(2,true); //C�digo de Pagamento
        lcCli.cancLerCampo(3,true); //C�digo do Vendador
      }
    }
    else {
      if (cevt.getListaCampos() == lcVend) {//Ativa auto-incrementos
        lcVend.cancLerCampo(2,false); //Comiss�o do vendedor;
      }
      else if (cevt.getListaCampos() == lcCli) {
        lcCli.cancLerCampo(2,false); //C�digo do Pagamento
        lcCli.cancLerCampo(3,false); //C�digo do Vendedor
      }
    }
    if (lcDet.getStatus() != ListaCampos.LCS_INSERT) {
      if (cevt.getListaCampos() == lcProd) {
        lcProd.cancLerCampo(5,true); //C�digo da Classifica��o Fiscal
      }
    }
    else {
      if (cevt.getListaCampos() == lcProd) {
        lcProd.cancLerCampo(5,false); //C�digo da Classifica��o Fiscal
      }
    }
    if (cevt.getListaCampos()==lcCampos) {
    	if (bPrefs[5]) {
    		txtFiscalTipoMov1.setText("S");
    		txtFiscalTipoMov2.setText("N");
    	}
    }
    
    
  }
  public void afterPost(PostEvent pevt) {
    lcVenda2.carregaDados(); //Carrega os Totais
    if (pevt.getListaCampos()==lcCampos) {
    	
    	if (bPrefs[5]) {
    	   txtFiscalTipoMov1.setText("S");
    	   txtFiscalTipoMov2.setText("N");
    	}
    }
  }
  public void afterCarrega(CarregaEvent cevt) { 
    if ((cevt.getListaCampos() == lcProd) ||
        (cevt.getListaCampos() == lcProd2)) {
      if (txtCLoteProd.getText().trim().equals("N")) {
        txtCodLote.setAtivo(false);//Desativa o C�gigo do lote por o produto n�o possuir lote
      }
      else if (txtCLoteProd.getText().trim().equals("S")) {
        txtCodLote.setAtivo(true);//Ativa o C�gigo do Lote pois o produto tem lote
        if (lcDet.getStatus() == ListaCampos.LCS_INSERT)
	      buscaLote();
      }
      if (lcDet.getStatus() == ListaCampos.LCS_INSERT) {
        buscaPreco(); 
      }
    }
    else if ((cevt.getListaCampos() == lcFisc) && (lcDet.getStatus() == ListaCampos.LCS_INSERT)) {
      buscaNat();
      buscaTratTrib();
    }
    else if (cevt.getListaCampos() == lcNat) {
      if ((cevt.ok) & (lcDet.getStatus() == ListaCampos.LCS_INSERT)) {
        buscaICMS();
      }
    }
    else if (cevt.getListaCampos() == lcDet) {
      lcVenda2.carregaDados();//Carrega os Totais
    }
    else if (cevt.getListaCampos() == lcCampos) {
      String s = txtCodVenda.getVlrString();
      lcVenda2.carregaDados();//Carrega os Totais
      txtCodVenda.setVlrString(s);
    }
    else if (cevt.getListaCampos() == lcVenda2) {
      txtPercComisVenda.setAtivo(txtVlrComisVenda.doubleValue() == 0);
    }
  }
  
  private synchronized void focusIni() {
      tpnCab.requestFocus(true);
  }
  public void keyPressed(KeyEvent kevt) {
    if (kevt.getKeyCode() == KeyEvent.VK_CONTROL) {
      bCtrl = true;
    }
    else if (kevt.getKeyCode() == KeyEvent.VK_O) {
      if (bCtrl) {
        btObs.doClick();
      }
    }
    else if (kevt.getKeyCode() == KeyEvent.VK_ENTER) {
      if (kevt.getSource() == txtPercComisVenda||
          (kevt.getSource() == txtClasComis&&
           !txtPercComisVenda.getAtivo())
           ) 
        {//Como estes s�o os ultimos campos do painel de venda executa-se o post no venda e pula para o campo adequado no item.             
           if (lcCampos.getStatus() == ListaCampos.LCS_INSERT) {
             //txtCodVenda.requestFocus();
             //
             focusIni();
             focusCodprod();
             lcCampos.post();
             lcDet.edit();
           }
           else if (lcCampos.getStatus() == ListaCampos.LCS_EDIT) {
             lcCampos.post();
             focusCodprod();
           }
        }
        else if (kevt.getSource() == txtCodPlanoPag) {//Como este � o ultimo campo da aba de venda ent�o abre a tab comissao.
      	  tpnCab.setSelectedIndex(1);
      	  tpnCab.doLayout();
      	  txtCodVend.requestFocus();
        }
        else if (kevt.getSource() == txtUltCamp) {//Como este � o ultimo campo do painel de itvenda executa-se o post no itvenda e pula para o campo adequado no item.             
          if (lcDet.getStatus() == ListaCampos.LCS_INSERT) {
            lcDet.post();
            lcDet.limpaCampos(true);
            lcDet.setState(ListaCampos.LCS_NONE);
            lcDet.edit();
            focusCodprod();
          }
        else if (lcDet.getStatus() == ListaCampos.LCS_EDIT) {
          lcDet.post();
          txtCodItVenda.requestFocus();
        }
      }
      else if (kevt.getSource() == txtCodNat) {//Talvez este possa ser o ultimo campo por isso o teste.
        if (!txtBaseICMSItVenda.getAtivo()) {
          if (lcDet.getStatus() == ListaCampos.LCS_INSERT) {
            lcDet.post();
            lcDet.limpaCampos(true);
            lcDet.setState(ListaCampos.LCS_NONE);
            lcDet.edit();
            focusCodprod();
          }
          else if (lcDet.getStatus() == ListaCampos.LCS_EDIT) {
            lcDet.post();
            txtCodItVenda.requestFocus();
          }
        }
      }
    }
	else if (kevt.getKeyCode() == KeyEvent.VK_F3 &&
			    kevt.getSource() == txtVlrDescItVenda) {
	  mostraTelaDescont();
	}
    else if (kevt.getKeyCode() == KeyEvent.VK_F4) {
      btFechaVenda.doClick();
    }
    else if (kevt.getKeyCode() == KeyEvent.VK_F5) {
      btConsPgto.doClick();
    }
    if (kevt.getSource() == txtRefProd)
      lcDet.edit();
    super.keyPressed(kevt);
  }

  private void focusCodprod() {
      if (bPrefs[0])
          txtRefProd.requestFocus();
      else
          txtCodProd.requestFocus();
  }
  
  public void actionPerformed(ActionEvent evt) {
    String[] sValores = null;
    if (evt.getSource() == btFechaVenda) {
      DLFechaVenda dl = new DLFechaVenda(con,txtCodVenda.getVlrInteger(),this);
      dl.setVisible(true);
      if (dl.OK) {
        sValores = dl.getValores();
        dl.dispose();
      }
      else {
        dl.dispose();
      }
      lcCampos.carregaDados();
      if (sValores != null ) {
        
//Ordem dos par�metros decrescente por que uma tela abre na frente da outra.      	
      	
        if (sValores[5].equals("S") && !sValores[6].equals("")) {
        	FRBoleto fBol = new FRBoleto(this);
        	fBol.setConexao(con);
        	fBol.txtCodModBol.setVlrInteger(new Integer(sValores[6]));
        	fBol.txtCodVenda.setVlrInteger(txtCodVenda.getVlrInteger());
        	fBol.imprimir(true);
        }
        if (sValores[4].equals("S")) {
        	if (txtTipoMov.getVlrString().equals("VD") ||
        		txtTipoMov.getVlrString().equals("VT") ||
        		txtTipoMov.getVlrString().equals("TR") ||
        		txtTipoMov.getVlrString().equals("CS") ||
        		txtTipoMov.getVlrString().equals("CE") ||
        		txtTipoMov.getVlrString().equals("PE") ||
        		txtTipoMov.getVlrString().equals("DV") ||
				txtTipoMov.getVlrString().equals("BN"))
        	  emitNota("NF",txtESTipoMov.getVlrString().equals("E"));
        	else if (txtTipoMov.getVlrString().equals("SE"))
        	  emitNota("NS");
        	else {
        	  Funcoes.mensagemErro(this,"N�o existe nota para o tipo de movimento: '"+
        	  		                                      txtTipoMov.getVlrString()+"'");
        	  return;
        	}
        	txtStatusVenda.setVlrString("V4");
        	//txtDtEmitVenda.setVlrDate(new Date());
        }
        else if (sValores[3].equals("S")) {
          imprimir(true,txtCodVenda.getVlrInteger().intValue());
/*          if (Funcoes.mensagemConfirma(this, "Pedido OK?")==0 ) {
            txtStatusVenda.setVlrString("P4");
          } */ // Isto dava problemas de pulos
        }
        lcCampos.edit();
        lcCampos.post();
        if ( (sValores[4].equals("S")) && (bPrefs[7]) ) {
            bloqvenda();
        }
      }
    }
    else if (evt.getSource() == btConsPgto) {
      DLConsultaPgto dl = new DLConsultaPgto(this,con,txtCodCli.getVlrInteger().intValue());
      dl.setVisible(true);
      dl.dispose();
    }
    else if (evt.getSource() == btPrevimp) 
      imprimir(true,txtCodVenda.getVlrInteger().intValue());
    else if (evt.getSource() == btImp) 
      imprimir(false,txtCodVenda.getVlrInteger().intValue());
    else if (evt.getSource() == btObs) {
      FObservacao obs = null;
      try {
        PreparedStatement ps = con.prepareStatement("SELECT OBSVENDA FROM VDVENDA WHERE CODVENDA=?");
        ps.setInt(1,txtCodVenda.getVlrInteger().intValue());
        ResultSet rs = ps.executeQuery();
        if (rs.next())
          obs = new FObservacao((rs.getString("ObsVenda") != null ? rs.getString("ObsVenda") : ""));
        else 
          obs = new FObservacao("");
//        rs.close();
//        ps.close();
        if (!con.getAutoCommit())
          con.commit();
      }
      catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao carregar a observa��o!\n"+err.getMessage());
      }
      if (obs != null) {
        obs.setVisible(true);
        if (obs.OK) {
          try {
            PreparedStatement ps = con.prepareStatement("UPDATE VDVENDA SET OBSVENDA=? WHERE CODVENDA=?");
            ps.setString(1,obs.getTexto());
            ps.setInt(2,txtCodVenda.getVlrInteger().intValue());
            ps.executeUpdate();
            if (!con.getAutoCommit())
                con.commit();
          }
          catch(SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao inserir observa��o na venda!\n"+err.getMessage());
          }
        }
        obs.dispose();
      }
    }
    else if (evt.getSource() == btAdicOrc) {
    	abreAdicOrc();    	
    }
    else if (evt.getSource() == btAltComis) {
        altComisVend();      
    }
    super.actionPerformed(evt);
  }
  private void bloqvenda() {
      PreparedStatement ps = null;
      String sSql = null;
      String sTipoVenda = null;
      int iCodVenda = 0;
      try {
          iCodVenda = txtCodVenda.getVlrInteger().intValue();
          if (iCodVenda!=0) {
              sTipoVenda = "V"; 
              sSql = "EXECUTE PROCEDURE VDBLOQVENDASP(?,?,?,?,?)";
              ps = con.prepareStatement(sSql);
              ps.setInt(1,Aplicativo.iCodEmp);
              ps.setInt(2,ListaCampos.getMasterFilial("VDVENDA"));
              ps.setString(3,sTipoVenda);
              ps.setInt(4,iCodVenda);
              ps.setString(5,"S");
              ps.executeUpdate();
              ps.close();
              if (!con.getAutoCommit())
                  con.commit();
          }
      }
      catch (SQLException e) {
          Funcoes.mensagemErro(this, "Erro bloqueando a venda!\n"+e.getMessage());
      }
      finally {
          ps = null;
          sSql = null;          
      }
  }
  private void imprimir(boolean bVisualizar,int iCodVenda) {
    ImprimeOS imp = new ImprimeOS("",con);
    int linPag = imp.verifLinPag()-1;
    int iPares = 0;
    String sStrLote = "";

    imp.setTitulo("Relat�rio de Pedidos");
    DLRPedido dl = new DLRPedido(sOrdNota);
	dl.setVisible(true);
	if (dl.OK == false) {
	  dl.dispose();
	  return;
	}
	String sSQL = "SELECT (SELECT COUNT(IC.CODITVENDA) FROM VDITVENDA IC WHERE IC.CODVENDA=V.CODVENDA),"+
                  "(SELECT L.CODLOTE FROM EQLOTE L WHERE L.CODPROD=I.CODPROD AND L.CODLOTE=I.CODLOTE),"+
                  "(SELECT L.VENCTOLOTE FROM EQLOTE L WHERE L.CODPROD=I.CODPROD AND L.CODLOTE=I.CODLOTE),"+
                  "V.CODVENDA,V.CODCLI,C.RAZCLI,C.CNPJCLI,C.CPFCLI,V.DTEMITVENDA,C.ENDCLI,C.NUMCLI,C.COMPLCLI,"+
                  "C.BAIRCLI,C.CEPCLI,V.OBSVENDA,V.DTSAIDAVENDA,C.CIDCLI,C.UFCLI,C.FONECLI,C.FONECLI,"+
                  "C.FAXCLI,C.INSCCLI,C.RGCLI,I.CODPROD,P.REFPROD,P.CODBARPROD,P.DESCPROD,P.CODUNID,I.PERCISSITVENDA,"+
                  "I.QTDITVENDA,I.PRECOITVENDA,I.VLRPRODITVENDA,I.CODNAT,I.PERCICMSITVENDA,"+
                  "PERCIPIITVENDA,VLRIPIITVENDA,V.VLRBASEICMSVENDA,V.VLRICMSVENDA,V.VLRPRODVENDA,"+
                  "V.VLRFRETEVENDA,V.VLRDESCVENDA,V.VLRDESCITVENDA,V.VLRADICVENDA,V.VLRIPIVENDA,"+
                  "V.VLRLIQVENDA,V.CODVEND,VEND.NOMEVEND,V.CODPLANOPAG,PG.DESCPLANOPAG,F.CODTRAN,"+
                  "T.RAZTRAN,F.TIPOFRETEVD,F.PLACAFRETEVD,F.UFFRETEVD,T.CNPJTRAN,T.ENDTRAN,T.NUMTRAN,T.CIDTRAN,"+
                  "T.UFTRAN,T.INSCTRAN,F.QTDFRETEVD,F.ESPFRETEVD,F.MARCAFRETEVD,F.PESOBRUTVD,"+
                  "F.PESOLIQVD,I.VLRLIQITVENDA,P.DESCAUXPROD FROM VDVENDA V, VDCLIENTE C,VDITVENDA I, EQPRODUTO P,VDVENDEDOR VEND, FNPLANOPAG PG,"+
                  "VDFRETEVD F, VDTRANSP T WHERE V.CODVENDA="+iCodVenda+" AND C.CODCLI=V.CODCLI"+
                  " AND I.CODVENDA=V.CODVENDA AND P.CODPROD=I.CODPROD AND VEND.CODVEND=V.CODVEND"+
                  " AND PG.CODPLANOPAG=V.CODPLANOPAG AND F.CODVENDA=V.CODVENDA AND T.CODTRAN=F.CODTRAN"+ 
                  " ORDER BY P."+dl.getValor()+",P.DESCPROD"; 

    PreparedStatement ps = null;
    ResultSet rs = null;
    int iItImp = 0;
    int iMaxItem = 0;
    try {
      imp.limpaPags();
      iMaxItem = linPag - 22;
      ps = con.prepareStatement(sSQL);
      rs = ps.executeQuery();
      while (rs.next()) {
         if (imp.pRow()==0) {
           imp.say(imp.pRow()+1,0,""+imp.normal());

           imp.say(imp.pRow()+0,4,"PEDIDO DE VENDA No.: ");
           imp.say(imp.pRow()+0,25,rs.getString("CodVenda"));
           imp.say(imp.pRow()+1,0,""+imp.normal());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,62,"DESTINATARIO");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"[ Nome/Razao Social ]");
           imp.say(imp.pRow()+0,76,rs.getString("CpfCli") != null ? "[ CPF ]" : "[ CNPJ ]") ;
           imp.say(imp.pRow()+0,96,"[ Data de Emiss�o ]");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,rs.getString("CodCli")+" - "+rs.getString("RazCli"));
           imp.say(imp.pRow()+0,76,rs.getString("CpfCli") != null ? Funcoes.setMascara(rs.getString("CpfCli"),"###.###.###-##") : Funcoes.setMascara(rs.getString("CnpjCli"),"##.###.###/####-##")) ;
           imp.say(imp.pRow()+0,100,Funcoes.sqlDateToStrDate(rs.getDate("DtEmitVenda")));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"[ Endereco ]");
           imp.say(imp.pRow()+0,55,"[ Bairro ]");
           imp.say(imp.pRow()+0,86,"[ CEP ]");
           imp.say(imp.pRow()+0,96,"[ Data de Sa�da ]");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,Funcoes.copy(rs.getString("EndCli"),0,30).trim()+", "+(rs.getString("NumCli") != null ? Funcoes.copy(rs.getString("NumCli"),0,6).trim() : "").trim()+" - "+(rs.getString("ComplCli") != null ? Funcoes.copy(rs.getString("ComplCli"),0,9).trim() : "").trim());
           imp.say(imp.pRow()+0,55,rs.getString("BairCli"));
           imp.say(imp.pRow()+0,86,Funcoes.setMascara(rs.getString("CepCli"),"#####-###"));
           imp.say(imp.pRow()+0,100,Funcoes.sqlDateToStrDate(rs.getDate("DtSaidaVenda")));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"[ Municipio ]");
           imp.say(imp.pRow()+0,39,"[ UF ]");
           imp.say(imp.pRow()+0,46,"[ Fone/Fax ]");
           imp.say(imp.pRow()+0,76,rs.getString("RgCli") != null ? "[ RG ]" : "[ Insc. Est. ]") ;
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,rs.getString("CidCli"));
           imp.say(imp.pRow()+0,39,rs.getString("UfCli"));
           imp.say(imp.pRow()+0,46,Funcoes.setMascara(rs.getString("FoneCli"),"(####)####-####")+" - "+(rs.getString("FaxCli") != null ? Funcoes.setMascara(rs.getString("FaxCli"),"####-####") : ""));
           imp.say(imp.pRow()+0,76,rs.getString("RgCli") != null ? rs.getString("RgCli") : rs.getString("InscCli"));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,57,"DADOS DO(S) PRODUTO(S)");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"Referencia");
           imp.say(imp.pRow()+0,18,"Descri��o dos Produtos");
           imp.say(imp.pRow()+0,56,"Unidade");
           imp.say(imp.pRow()+0,65,"Quant.");
           imp.say(imp.pRow()+0,72,"Valor Unit.");
           imp.say(imp.pRow()+0,87,"Valor Total");
           imp.say(imp.pRow()+0,102,"ICM%");
           imp.say(imp.pRow()+0,108,"IPI%");
           imp.say(imp.pRow()+0,114,"Valor do IPI");
           imp.say(imp.pRow()+0,129,"Nat.");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
         }
         imp.say(imp.pRow()+1,0,""+imp.comprimido());
         imp.say(imp.pRow()+0,4,rs.getString("RefProd"));
         if ((rs.getDate(3) != null) && (rs.getString(2) != null)) {
         	sStrLote = " - L:"+rs.getString(2).trim()+", VC:"+Funcoes.sqlDateToStrDate(rs.getDate(3)).substring(3);
         }
         imp.say(imp.pRow()+0,18,Funcoes.copy(rs.getString("DescProd").trim(),0,37-sStrLote.length())+sStrLote);
         imp.say(imp.pRow()+0,56,rs.getString("CodUnid"));
         imp.say(imp.pRow()+0,65,""+rs.getDouble("QtdItVenda"));
         if (bPrefs[2]) {
//                 System.out.println(rs.getDouble("VlrLiqItVenda")+"/"+rs.getDouble("QtdItVenda")+"="+((new BigDecimal(rs.getDouble("VlrLiqItVenda"))).divide(new BigDecimal(rs.getDouble("QtdItVenda")),2,BigDecimal.ROUND_HALF_UP)));
                 imp.say(imp.pRow()+0,72,Funcoes.strDecimalToStrCurrency(14,2,""+
                         (new BigDecimal(Funcoes.arredDouble(rs.getDouble("VlrLiqItVenda") / 
                                 rs.getDouble("QtdItVenda"), casasDec)))));
                 imp.say(imp.pRow()+0,87,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrLiqItVenda")));
         }
         else {
                 imp.say(imp.pRow()+0,72,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("PrecoItVenda")));
                 imp.say(imp.pRow()+0,87,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrProdItVenda")));
         }                
         imp.say(imp.pRow()+0,102,""+rs.getDouble("PercICMSItVenda"));
         imp.say(imp.pRow()+0,108,""+rs.getDouble("PercIPIItVenda"));
         imp.say(imp.pRow()+0,114,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrIPIItVenda")));
         imp.say(imp.pRow()+0,129,Funcoes.setMascara(rs.getString("CodNat"),"#.###"));
         if (Funcoes.copy(rs.getString("CodUnid"),0,3).equals("PAR"))
           iPares += (int)rs.getDouble("QtdItVenda");
         iItImp++;
         if ((imp.pRow()>=iMaxItem) | (iItImp == rs.getInt(1))) {
           if ((iItImp == rs.getInt(1))) {
             int iRow = imp.pRow();
             for (int i=0; i<(iMaxItem-iRow);i++) {
               imp.say(imp.pRow()+1,0,""+imp.comprimido());
               imp.say(imp.pRow()+0,0,"");
             }
           }
           if (rs.getInt(1) == iItImp) {
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,56,"CALCULO DO(S) IMPOSTO(S)");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"[ Base de Calculo ICMS ]");
             imp.say(imp.pRow()+0,29,"[ Valor do ICMS ]");
             imp.say(imp.pRow()+0,54,"[ B. Calc. ICMS Subst. ]");
             imp.say(imp.pRow()+0,79,"[ Valor do ICMS Subst. ]");
             imp.say(imp.pRow()+0,104,"[ Valor dos Produtos ]");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrBaseICMSVenda")));
             imp.say(imp.pRow()+0,29,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrICMSVenda")));
             if (bPrefs[2]) 
                     imp.say(imp.pRow()+0,104,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrLiqVenda")));
             else
                     imp.say(imp.pRow()+0,104,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrProdVenda")));
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"[ Valor do Frete ]");
             imp.say(imp.pRow()+0,29,"[ Valor do Desconto ]");
             imp.say(imp.pRow()+0,54,"[ Outras Despesas ]");
             imp.say(imp.pRow()+0,79,"[ Valor do IPI ]");
             imp.say(imp.pRow()+0,104,"[ VALOR TOTAL ]");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrFreteVenda")));
             if (!bPrefs[2]) {
                     imp.say(imp.pRow()+0,29,Funcoes.strDecimalToStrCurrency(14,2,rs.getDouble("VlrDescVenda") == 0 ? rs.getString("VlrDescItVenda") : rs.getString("VlrDescVenda")));
                     imp.say(imp.pRow()+0,64,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrAdicVenda")));
                     imp.say(imp.pRow()+0,79,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrIPIVenda")));
             }
             imp.say(imp.pRow()+0,104,Funcoes.strDecimalToStrCurrency(14,2,rs.getString("VlrLiqVenda")));
             iItImp = 0;
           }
           else {
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,56,"CALCULO DO(S) IMPOSTO(S)");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"[ Base de Calculo ICMS ]");
             imp.say(imp.pRow()+0,29,"[ Valor do ICMS ]");
             imp.say(imp.pRow()+0,54,"[ B. Calc. ICMS Subst. ]");
             imp.say(imp.pRow()+0,79,"[ Valor do ICMS Subst. ]");
             imp.say(imp.pRow()+0,104,"[ Valor dos Produtos ]");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"***************");
             imp.say(imp.pRow()+0,29,"***************");
             imp.say(imp.pRow()+0,104,"***************");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"[ Valor do Frete ]");
             imp.say(imp.pRow()+0,29,"[ Valor do Desconto ]");
             imp.say(imp.pRow()+0,54,"[ Outras Despesas ]");
             imp.say(imp.pRow()+0,79,"[ Valor do IPI ]");
             imp.say(imp.pRow()+0,104,"[ VALOR TOTAL ]");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"***************");
             imp.say(imp.pRow()+0,29,"***************");
             imp.say(imp.pRow()+0,54,"***************");
             imp.say(imp.pRow()+0,79,"***************");
             imp.say(imp.pRow()+0,104,"***************");
             imp.incPags();
           }
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,50,"TRANSPORTADOR / VOLUMES TRANSPORTADOS");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"[ Nome / Raz�o Social ]");
           imp.say(imp.pRow()+0,60,"[ Frete ]");
           imp.say(imp.pRow()+0,72,"[ Placa ]");
           imp.say(imp.pRow()+0,85,"[ UF ]");
           imp.say(imp.pRow()+0,95,"[ CNPJ ]");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,rs.getString("RazTran"));
           imp.say(imp.pRow()+0,60,rs.getString("TipoFreteVD").equals("C") ? "CIF" : "FOB");
           imp.say(imp.pRow()+0,72,rs.getString("PlacaFreteVD"));
           imp.say(imp.pRow()+0,85,rs.getString("UfFreteVD"));
           imp.say(imp.pRow()+0,95,Funcoes.setMascara(rs.getString("CnpjTran") != null ? rs.getString("CnpjTran") : "","##.###.###/####-##"));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"[ Endere�o ]");
           imp.say(imp.pRow()+0,60,"[ Municipio ]");
           imp.say(imp.pRow()+0,91,"[ UF ]");
           imp.say(imp.pRow()+0,100,"[ Insc. Est. ]");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,Funcoes.copy(rs.getString("EndTran"),0,42)+", "+Funcoes.copy(rs.getString("NumTran"),0,6));
           imp.say(imp.pRow()+0,60,rs.getString("CidTran"));
           imp.say(imp.pRow()+0,91,rs.getString("UfTran"));
           imp.say(imp.pRow()+0,100,rs.getString("InscTran"));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,"[ Quantidade ]");
           imp.say(imp.pRow()+0,24,"[ Esp�cie ]");
           imp.say(imp.pRow()+0,49,"[ Marca ]");
           imp.say(imp.pRow()+0,79,"[ PesoBrut ]");
           imp.say(imp.pRow()+0,99,"[ PesoLiq ]");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,4,rs.getString("QtdFreteVD"));
           imp.say(imp.pRow()+0,24,rs.getString("EspFreteVD"));
           imp.say(imp.pRow()+0,49,rs.getString("MarcaFreteVD"));
           imp.say(imp.pRow()+0,79,rs.getString("PesoBrutVD"));
           imp.say(imp.pRow()+0,99,rs.getString("PesoLiqVD"));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,3,"OBSERVA��ES");
           imp.say(imp.pRow()+0,60,"DADOS ADICIONAIS");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,0,Funcoes.copy(rs.getString("ObsVenda"),0,40));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,63,iPares > 0 ? "PARES: "+Funcoes.strZero(""+iPares,4) : "");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,53,"ENTREGA PREVISTA : "+Funcoes.sqlDateToStrDate(rs.getDate("DtSaidaVenda")));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,(125 - rs.getString("NomeVend").trim().length())/2,"REPRES. : "+rs.getString("NomeVend"));
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,(116 - rs.getString("DescPlanoPag").trim().length())/2,"FORMA DE PAGAMENTO : "+rs.getString("DescPlanoPag"));
           imp.eject();
         }
      }
      imp.fechaGravacao();
      
//      rs.close();
//      ps.close();
      if (!con.getAutoCommit())
        con.commit();
      dl.dispose();
    }  
    catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro ao consultar a tabela de Venda!"+err.getMessage());      
    }
    
    if (bVisualizar) {
      imp.preview(this);
    }
    else {
      imp.print();
    }
  }
  private void emitNota(String sTipo) {
    emitNota(sTipo,false);
  }
  private void emitNota(String sTipo,boolean bEnt) {
    boolean bImpOK = false;
    int iCodVenda = txtCodVenda.getVlrInteger().intValue();
    ImprimeOS imp = new ImprimeOS("",con);
    imp.verifLinPag(sTipo);
    imp.setTitulo("Nota Fiscal");
    DLRPedido dl = new DLRPedido(sOrdNota);
    dl.setVisible(true);
    if (dl.OK == false) {
      dl.dispose();
      return;
    }
    String sSQL = "SELECT (SELECT COUNT(IC.CODITVENDA) FROM VDITVENDA IC WHERE IC.CODVENDA=V.CODVENDA),"+
                  "(SELECT L.CODLOTE FROM EQLOTE L WHERE L.CODPROD=I.CODPROD AND L.CODLOTE=I.CODLOTE),"+
                  "(SELECT L.VENCTOLOTE FROM EQLOTE L WHERE L.CODPROD=I.CODPROD AND L.CODLOTE=I.CODLOTE),"+
				  "(SELECT M.MENS FROM LFMENSAGEM M WHERE M.CODMENS=I.CODMENS" +
				  " AND M.CODFILIAL=I.CODFILIALME AND M.CODEMP=I.CODEMPME),"+
				  "(SELECT M.MENS FROM LFMENSAGEM M WHERE M.CODMENS=CL.CODMENS" +
				  " AND M.CODFILIAL=CL.CODFILIALME AND M.CODEMP=CL.CODEMPME),"+
				  "(SELECT S.DESCSETOR FROM VDSETOR S WHERE S.CODSETOR=C.CODSETOR" +
				  " AND S.CODFILIAL=C.CODFILIALSR AND S.CODEMP=C.CODEMPSR),"+
				  "(SELECT B.NOMEBANCO FROM FNBANCO B WHERE B.CODEMP=V.CODEMPBO" +
				  " AND B.CODFILIAL=V.CODFILIALBO AND B.CODBANCO=V.CODBANCO),"+
				  "(SELECT P.SIGLAPAIS FROM SGPAIS P WHERE P.CODPAIS=C.CODPAIS),"+
                  "V.DOCVENDA,V.CODVENDA,V.CODCLI,C.RAZCLI,C.CNPJCLI,C.CPFCLI,V.DTEMITVENDA,C.ENDCLI,"+
                  "C.BAIRCLI,C.CEPCLI,V.OBSVENDA,V.DTSAIDAVENDA,C.CIDCLI,C.UFCLI,C.FONECLI,C.FONECLI,C.NUMCLI,C.COMPLCLI,"+
                  "C.FAXCLI,C.INSCCLI,C.RGCLI,I.CODPROD,P.REFPROD,P.CODBARPROD,P.DESCPROD, P.CODUNID,N.CODNAT,"+
                  "I.VLRLIQITVENDA,N.DESCNAT,I.QTDITVENDA,I.PRECOITVENDA,I.VLRPRODITVENDA,I.CODNAT,I.PERCICMSITVENDA,"+
                  "I.PERCISSITVENDA,PERCIPIITVENDA,VLRIPIITVENDA,V.VLRBASEICMSVENDA,V.VLRICMSVENDA,V.VLRPRODVENDA,"+
                  "V.VLRISSVENDA,V.VLRFRETEVENDA,V.VLRDESCVENDA,V.VLRDESCITVENDA,V.VLRADICVENDA,V.VLRIPIVENDA,"+
                  "V.VLRBASEISSVENDA,V.VLRLIQVENDA,V.CODVEND,VEND.NOMEVEND,V.CODPLANOPAG,PG.DESCPLANOPAG,F.CODTRAN,"+
                  "T.RAZTRAN,F.TIPOFRETEVD,F.PLACAFRETEVD,F.UFFRETEVD,T.TIPOTRAN,T.CNPJTRAN,T.ENDTRAN,T.NUMTRAN,T.CIDTRAN,"+
                  "T.UFTRAN,T.INSCTRAN,F.QTDFRETEVD,F.ESPFRETEVD,F.MARCAFRETEVD,F.PESOBRUTVD,"+
                  "F.PESOLIQVD, I.ORIGFISC, I.CODTRATTRIB, FL.CNPJFILIAl,FL.INSCFILIAL,FL.ENDFILIAL," +
                  "FL.NUMFILIAL,FL.COMPLFILIAL,FL.BAIRFILIAL,FL.CEPFILIAL,FL.CIDFILIAL,FL.UFFILIAL,FL.FONEFILIAL," +
                  "FL.FAXFILIAL,C.ENDCOB, C.NUMCOB, C.COMPLCOB,C.CEPCOB, C.CIDCOB, P.TIPOPROD, C.INCRACLI, V.CODBANCO," +
                  "P.CODFISC, C.ENDENT, C.NUMENT, C.COMPLENT,C.CIDENT,C.UFENT,C.BAIRENT,C.NOMECLI,I.OBSITVENDA," +
                  "V.VLRPISVENDA,V.VLRCOFINSVENDA,V.VLRIRVENDA,V.VLRCSOCIALVENDA,V.CODCLCOMIS,V.PERCCOMISVENDA," +
                  "V.PERCMCOMISVENDA, N.IMPDTSAIDANAT,P.DESCAUXPROD " +
                  " FROM VDVENDA V, VDCLIENTE C, VDITVENDA I, EQPRODUTO P, VDVENDEDOR VEND, FNPLANOPAG PG,"+
                  " VDFRETEVD F, VDTRANSP T, LFNATOPER N, SGFILIAL FL, LFCLFISCAL CL WHERE V.TIPOVENDA='V' AND V.CODVENDA="+iCodVenda+" AND V.CODEMP=?" +
                  " AND V.CODFILIAL=? AND FL.CODEMP=V.CODEMP AND FL.CODFILIAL=V.CODFILIAL AND C.CODCLI=V.CODCLI AND I.CODVENDA=V.CODVENDA" +
                  " AND P.CODPROD=I.CODPROD AND VEND.CODVEND=V.CODVEND AND PG.CODPLANOPAG=V.CODPLANOPAG AND F.CODVENDA=V.CODVENDA"+
                  " AND T.CODTRAN=F.CODTRAN AND N.CODNAT=I.CODNAT AND CL.CODFISC = P.CODFISC AND CL.CODFILIAL=P.CODFILIAL" +
                  " AND CL.CODEMP = P.CODEMP ORDER BY P."+dl.getValor()+",P.DESCPROD";
    String sSQLRec = "SELECT I.DTVENCITREC,I.VLRPARCITREC,I.NPARCITREC FROM FNRECEBER R, FNITRECEBER I WHERE R.CODVENDA="+iCodVenda+
                     " AND I.CODREC=R.CODREC ORDER BY I.DTVENCITREC";
    String sSQLInfoAdic = "SELECT CODAUXV,CPFCLIAUXV,NOMECLIAUXV,CIDCLIAUXV,UFCLIAUXV " +
    		                          "FROM VDAUXVENDA WHERE CODEMP=? AND CODFILIAL=? AND CODVENDA=?";
    PreparedStatement ps = null;
    PreparedStatement psRec = null;
    PreparedStatement psInfoAdic = null;
    ResultSet rs = null;
    ResultSet rsRec = null;
    ResultSet rsInfoAdic = null;
    Leiaute leiNF = null;
    try {
      leiNF = (Leiaute)Class.forName("org.freedom.layout."+imp.getClassNota()).newInstance();
      leiNF.bEntrada = bEnt;
    }
    catch (Exception err) {
		Funcoes.mensagemInforma(this,"N�o foi poss�vel carregar o leiaute de Nota Fiscal!\n"+err.getMessage());
    }
    try {
      if (leiNF != null) {
      	psRec = con.prepareStatement(sSQLRec);
      	rsRec = psRec.executeQuery();
      	psInfoAdic = con.prepareStatement(sSQLInfoAdic);
      	psInfoAdic.setInt(1,Aplicativo.iCodEmp);
      	psInfoAdic.setInt(2,Aplicativo.iCodFilial);
      	psInfoAdic.setInt(3,txtCodVenda.getVlrInteger().intValue());
      	rsInfoAdic = psInfoAdic.executeQuery();
        ps = con.prepareStatement(sSQL);
        ps.setInt(1,Aplicativo.iCodEmp);
		ps.setInt(2,ListaCampos.getMasterFilial("VDVENDA"));
        rs = ps.executeQuery();
        bImpOK = leiNF.imprimir(rs,rsRec,rsInfoAdic,imp);
        if (!con.getAutoCommit())
            con.commit();
      }
    }  
    catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro ao consultar tabela de Venda!"+err.getMessage());      
    }
    dl.dispose();
    if (bImpOK)
      imp.preview(this);
    imp.fechaPreview();
    
//    imp.print();
  }
  private boolean testaPgto() {
    boolean bRetorno = true;
    String sSQL = "SELECT * FROM FNCHECAPGTOSP(?,?,?)";
    try {
      PreparedStatement ps = con.prepareStatement(sSQL);
      ps.setInt(1,txtCodCli.getVlrInteger().intValue());
      ps.setInt(2,Aplicativo.iCodEmp);
      ps.setInt(3,Aplicativo.iCodFilial);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        if (rs.getString(1).trim().equals("N")) {
          bRetorno = false;
        }
      }
      else {
		Funcoes.mensagemErro(this,"N�o foi poss�vel checar os pagamentos do cliente!");
      }
//      rs.close();
//      ps.close();
      if (!con.getAutoCommit())
        con.commit();
    }
    catch (SQLException err) {
		Funcoes.mensagemErro(this,"N�o foi poss�vel verificar os pagamentos do cliente!\n"+err.getMessage());
    }
    return bRetorno;
  }
  private boolean[] prefs() {
    boolean[] bRetorno = new boolean[9];
    String sSQL = "SELECT USAREFPROD,USAPEDSEQ,USALIQREL,TIPOPRECOCUSTO,ORDNOTA," +
    		"USACLASCOMIS,TRAVATMNFVD,NATVENDA,BLOQVENDA, VENDAMATPRIM" +
    		" FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
	  ps.setInt(1,Aplicativo.iCodEmp);
	  ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
      rs = ps.executeQuery();
      if (rs.next()) {
        if (rs.getString("UsaRefProd").trim().equals("S"))
          bRetorno[0] = true;
        if (rs.getString("UsaPedSeq").trim().equals("S"))
          bRetorno[1] = true;
        if (rs.getString("UsaLiqRel")==null) {
			Funcoes.mensagemInforma(this,"Preencha op��o de desconto em prefer�ncias!");
        }
        else {
          if (rs.getString("UsaLiqRel").trim().equals("S"))
             bRetorno[2] = true;
        
          sOrdNota=rs.getString("OrdNota");
        
	      if (rs.getString("TipoPrecoCusto").equals("M"))
	        bRetorno[3] = true;
	      if (rs.getString("UsaClasComis").trim().equals("S"))
	      	bRetorno[4] = true;
        }
        bRetorno[5]=true;
        if (rs.getString("TravaTmNfVd")!=null) {
        	if (rs.getString("TravaTmNfVd").equals("N")) 
        		bRetorno[5]=false;
        }
        bRetorno[6]=true;
        if (rs.getString("NatVenda")!=null) {
           if (rs.getString("NatVenda").trim().equals("N"))
              bRetorno[6] = false;
        }
        bRetorno[7]=false;
        if (rs.getString("BloqVenda")!=null) {
            if (rs.getString("BloqVenda").trim().equals("S"))
                bRetorno[7]=true;
        }
        bRetorno[8]=false;
        if (rs.getString("VendaMatPrim")!=null) {
            if (rs.getString("VendaMatPrim").trim().equals("S"))
                bRetorno[8]=true;
        }
        
      }
//      rs.close();
//      ps.close();
      if (!con.getAutoCommit())
        con.commit();
    }
    catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao carregar a tabela PREFERE1!\n"+err.getMessage());
    }
    return bRetorno;
  }
  public void keyTyped(KeyEvent kevt) { 
    super.keyTyped(kevt);
  }
  public void keyReleased(KeyEvent kevt) { 
    if (kevt.getKeyCode() == KeyEvent.VK_CONTROL)
      bCtrl = false;
    super.keyReleased(kevt);
  }
  public void beforePost(PostEvent pevt) {
    PreparedStatement psTipoMov = null;
    ResultSet rsTipoMov = null;
  	if ((pevt.getListaCampos() == lcCampos) && (lcCampos.getStatus() == ListaCampos.LCS_INSERT)) {
      if (txtESTipoMov.getVlrString().equals("E")) {
        if (Funcoes.mensagemConfirma(this, "Este movimento ir� realizar entradas no estoque.\n"+
          		                           "Deseja continuar?\n")!=0 ) {
           pevt.cancela();
           return;
        }
  	  }
      if (!testaPgto()) {
        if (Funcoes.mensagemConfirma(this, "Cliente com duplicatas em aberto! Continuar?")!=0 ) {
          pevt.cancela();
          return;
        }
      }
      if (bPrefs[5]) {
      	try {
      	 	psTipoMov = con.prepareStatement("SELECT CODTIPOMOV,DESCTIPOMOV FROM EQTIPOMOV WHERE " +
      	 		"CODEMP=? AND CODFILIAL=? AND CODTIPOMOV=? AND FISCALTIPOMOV='N'");
      	 	psTipoMov.setInt(1,Aplicativo.iCodEmp);
      	 	psTipoMov.setInt(2,ListaCampos.getMasterFilial("EQTIPOMOV"));
      	 	psTipoMov.setInt(3,txtCodTipoMov.getVlrInteger().intValue());
      	 	rsTipoMov = psTipoMov.executeQuery();
      	 	if (rsTipoMov.next()) {
      	 	   if (rsTipoMov.getInt("CODTIPOMOV")!=txtCodTipoMov.getVlrInteger().intValue()) {
      	 	   	  Funcoes.mensagemInforma(this,"Tipo de movimento n�o permitido na inser��o!");
      	 	   	  pevt.cancela();
      	 	   	  return;
      	 	   }
      	 	}
      	 	else {
      	 		Funcoes.mensagemInforma(this,"Tipo de movimento n�o permitido na inser��o!");
      	 		pevt.cancela();
      	 		return;
      	 	}
            if (!con.getAutoCommit())
                con.commit();
      	 	rsTipoMov.close();
      	 	psTipoMov.close();
      	}
		catch (SQLException e) {
			Funcoes.mensagemErro(this,"Erro ao pesquisar tipo de movimento!\n"+e.getMessage());
			pevt.cancela();
		}
      }
      if (bPrefs[1])
        testaCodVenda();
      txtStatusVenda.setVlrString("*");
    }
    else if (pevt.getListaCampos() == lcDet) {
      if ((lcDet.getStatus() == ListaCampos.LCS_INSERT) || (lcDet.getStatus() == ListaCampos.LCS_EDIT)) {
        if (pevt.getListaCampos() == lcDet) {
            txtRefProd.setVlrString(txtRefProd.getText()); // ?
            if (txtCLoteProd.getVlrString().equals("S")) {
            	if (!testaCodLote()) {
            		pevt.cancela();
            	}
            }
        }
        if (!testaLucro()) {
			Funcoes.mensagemInforma(this,"N�o � permitido a venda deste produto abaixo do custo!!!");
          pevt.cancela();
        }
      }
    }
  }
  public void beforeDelete(DeleteEvent devt) { }
  public void beforeInsert(InsertEvent ievt) {
  }
  public void afterInsert(InsertEvent ievt) { 
  	if (ievt.getListaCampos()==lcCampos) {
  		if (bPrefs[5]) {
  		   txtFiscalTipoMov1.setText("N");
  		   txtFiscalTipoMov2.setText("N");
  		}
  		txtDtSaidaVenda.setVlrDate(new Date());
  		txtDtEmitVenda.setVlrDate(new Date());
  	}
  	else if (ievt.getListaCampos()==lcDet) {
  	    focusCodprod();
  	}
  }
  public void afterDelete(DeleteEvent devt) {
  	if (devt.getListaCampos() == lcDet)
  	  lcVenda2.carregaDados();
  }
  private void abreAdicOrc() {
	  if (!fPrim.temTela("Orcamento")) {
		FAdicOrc tela = new FAdicOrc(this);
		tela.setConexao(con);
		fPrim.criatela("Orcamento",tela);
	  } 
  }
  private void altComisVend() {
      if (lcCampos.getStatus() != ListaCampos.LCS_SELECT) {
        return;
      }
      DLAltComisVend dl = new DLAltComisVend(this,txtCodVenda.getVlrInteger().intValue(),txtMedComisVenda.getVlrBigDecimal(),con);
      dl.setVisible(true);
      dl.dispose();
      lcCampos.carregaDados();
  }
  public void setTelaPrim(FPrincipal fP) {
	  fPrim = fP;
  }
  public void exec(int iCodVenda) {
	txtCodVenda.setVlrString(iCodVenda+"");
	lcCampos.carregaDados();
  }
  public void execShow(Connection cn) {
    con = cn;
    montaTela();
	lcTratTrib.setConexao(cn);
    lcTipoMov.setConexao(cn);
    lcCli.setConexao(cn);
    lcVend.setConexao(cn);
    lcPlanoPag.setConexao(cn);
    lcSerie.setConexao(cn);
    lcProd.setConexao(cn);
    lcProd2.setConexao(cn);
    lcNat.setConexao(cn);
    lcLote.setConexao(cn);
    lcFisc.setConexao(cn);
    lcVenda2.setConexao(cn);
    lcClComis.setConexao(cn);
    super.execShow(cn);
  }
}

/**
 * @version 08/12/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FProduto.java <BR>
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
 * Cadastro de produtos
 * 
 */

package org.freedom.modulos.std;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.freedom.acao.CheckBoxEvent;
import org.freedom.acao.CheckBoxListener;
import org.freedom.acao.EditEvent;
import org.freedom.acao.EditListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.Painel;
import org.freedom.componentes.PainelImagem;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FAndamento;
import org.freedom.telas.FTabDados;

public class FProduto extends FTabDados implements CheckBoxListener, EditListener, InsertListener, ChangeListener, ActionListener {
  private Painel pinGeral = new Painel(650,340);
  private JPanel pnFatConv = new JPanel(new BorderLayout());
  private JPanel pnFor = new JPanel(new BorderLayout());
  private JPanel pnLote = new JPanel(new BorderLayout());
  private JPanel pnFoto = new JPanel(new BorderLayout());
  private JPanel pnPreco = new JPanel(new BorderLayout());
  private JTextFieldPad txtCodProd = new JTextFieldPad();
  private JTextFieldPad txtRefProd = new JTextFieldPad();
  private JTextFieldPad txtCodMoeda = new JTextFieldPad();
  private JTextFieldPad txtCodUnid = new JTextFieldPad();
  private JTextFieldPad txtCodFor = new JTextFieldPad();
  private JTextFieldPad txtCodFisc = new JTextFieldPad();
  private JTextFieldPad txtCodMarca = new JTextFieldPad();
  private JTextFieldPad txtCodGrup = new JTextFieldPad();
  private JTextFieldPad txtCodAlmox = new JTextFieldPad();
  private JTextFieldPad txtDescProd = new JTextFieldPad();
  private JTextFieldPad txtDescAuxProd = new JTextFieldPad();
  private JTextFieldPad txtCodBarProd = new JTextFieldPad();
  private JTextFieldPad txtCodFabProd = new JTextFieldPad();
  private JTextFieldPad txtComisProd = new JTextFieldPad();
  private JTextFieldPad txtPesoLiqProd = new JTextFieldPad();
  private JTextFieldPad txtPesoBrutProd = new JTextFieldPad();
  private JTextFieldPad txtQtdMinProd = new JTextFieldPad();
  private JTextFieldPad txtQtdMaxProd = new JTextFieldPad();
  private JTextFieldPad txtLocalProd = new JTextFieldPad();
  private JTextFieldPad txtCustoMPMProd = new JTextFieldPad();
  private JTextFieldPad txtCustoPEPSProd = new JTextFieldPad();
  private JTextFieldPad txtSldProd = new JTextFieldPad();
  private JTextFieldPad txtDtUltCpProd = new JTextFieldPad();
  private JTextFieldPad txtSldConsigProd = new JTextFieldPad();
  private JTextFieldPad txtSldResProd = new JTextFieldPad();
  private JTextFieldPad txtSldLiqProd = new JTextFieldPad();
  private JTextFieldPad txtPrecoBaseProd = new JTextFieldPad();
  private JTextFieldPad txtUnidFat = new JTextFieldPad();
  private JTextFieldPad txtFatConv = new JTextFieldPad();
  private JTextFieldPad txtCodLote = new JTextFieldPad();
  private JTextFieldPad txtDiniLote = new JTextFieldPad();
  private JTextFieldPad txtVenctoLote = new JTextFieldPad();
  private JTextFieldPad txtSldLote = new JTextFieldPad();
  private JTextFieldPad txtSldResLote = new JTextFieldPad();
  private JTextFieldPad txtSldConsigLote = new JTextFieldPad();
  private JTextFieldPad txtSldLiqLote = new JTextFieldPad();
  private JTextFieldPad txtCodFotoProd = new JTextFieldPad();
  private JTextFieldPad txtDescFotoProd = new JTextFieldPad();
  private JTextFieldPad txtLargFotoProd = new JTextFieldPad();
  private JTextFieldPad txtAltFotoProd = new JTextFieldPad();
  private JTextFieldPad txtCodPrecoProd = new JTextFieldPad();
  private JTextFieldPad txtCodClasCliPreco = new JTextFieldPad();
  private JTextFieldPad txtCodTabPreco = new JTextFieldPad();
  private JTextFieldPad txtCodPlanoPagPreco = new JTextFieldPad();
  private JTextFieldPad txtPrecoProd = new JTextFieldPad();
  
  private JTextFieldFK txtDescMoeda = new JTextFieldFK();
  private JTextFieldFK txtDescUnid = new JTextFieldFK();
  private JTextFieldPad txtCodProdFor = new JTextFieldPad();
  private JTextFieldFK txtDescFor = new JTextFieldFK();
  private JTextFieldFK txtDescFisc = new JTextFieldFK();
  private JTextFieldFK txtDescMarca = new JTextFieldFK();
  private JTextFieldFK txtDescGrup = new JTextFieldFK();
  private JTextFieldFK txtDescAlmox = new JTextFieldFK();
  private JTextFieldFK txtDescUnidFat = new JTextFieldFK();
  private JTextFieldFK txtDescClasCliPreco = new JTextFieldFK();
  private JTextFieldFK txtDescTabPreco = new JTextFieldFK();
  private JTextFieldFK txtDescPlanoPagPreco = new JTextFieldFK();
  private Vector vLabsTipo = new Vector();
  private Vector vValsTipo = new Vector();
  private Vector vLabsCV = new Vector();
  private Vector vValsCV = new Vector();
  private Vector vLabsTF = new Vector();
  private Vector vValsTF = new Vector();
  private JRadioGroup rgTipo = null;
  private JRadioGroup rgCV = null;
  private JRadioGroup rgTF = null;
  private JCheckBoxPad cbLote = null;
  private JCheckBoxPad cbAtivo = null;
  private JCheckBoxPad cbVerif = null;
  private Tabela tabFatConv = new Tabela();
  private JScrollPane spnFatConv = new JScrollPane(tabFatConv);
  private Tabela tabFor = new Tabela();
  private JScrollPane spnFor = new JScrollPane(tabFor);
  private Tabela tabLote = new Tabela();
  private JScrollPane spnLote = new JScrollPane(tabLote);
  private Tabela tabFoto = new Tabela();
  private JScrollPane spnFoto = new JScrollPane(tabFoto);
  private Tabela tabPreco = new Tabela();
  private JScrollPane spnPreco = new JScrollPane(tabPreco);
  private Painel pinRodFatConv = new Painel(650,80);
  private Painel pinRodFor = new Painel(650,80);
  private Painel pinRodLote = new Painel(650,120);
  private Painel pinRodFoto = new Painel(650,170);
  private Painel pinRodPreco = new Painel(650,120);
  private JPanel pnDesc = new JPanel(new GridLayout(1,1));
  private JTextAreaPad txaDescComp = new JTextAreaPad();
  private JScrollPane spnDesc = new JScrollPane(txaDescComp);
  private ListaCampos lcMoeda = new ListaCampos(this,"MA");
  private ListaCampos lcUnid = new ListaCampos(this,"UD");
  private ListaCampos lcFisc = new ListaCampos(this,"FC");
  private ListaCampos lcMarca = new ListaCampos(this,"MC");
  private ListaCampos lcGrup = new ListaCampos(this,"GP");
  private ListaCampos lcAlmox = new ListaCampos(this,"AX");
  private ListaCampos lcFatConv = new ListaCampos(this);
  private ListaCampos lcFor = new ListaCampos(this);
  private ListaCampos lcUnidFat = new ListaCampos(this);
  private ListaCampos lcForFK = new ListaCampos(this);
  private ListaCampos lcLote = new ListaCampos(this);
  private ListaCampos lcFoto = new ListaCampos(this);
  private ListaCampos lcPreco = new ListaCampos(this);
  private ListaCampos lcClasCliPreco = new ListaCampos(this,"CC");
  private ListaCampos lcTabPreco = new ListaCampos(this,"TB");
  private ListaCampos lcPlanoPagPreco = new ListaCampos(this,"PG");
  private Navegador navFatConv = new Navegador(true);
  private Navegador navFor = new Navegador(true);
  private Navegador navLote = new Navegador(true);
  private Navegador navFoto = new Navegador(true);
  private Navegador navPreco = new Navegador(true);
  private JButton btExp = new JButton(Icone.novo("btExportar.gif"));
  private PainelImagem imFotoProd = new PainelImagem(65000);
  private Connection con = null;
  public FProduto() {
    setTitulo("Cadastro de Produtos");
    setAtribos(30,10,680,430);

    lcFatConv.setMaster(lcCampos);
    lcCampos.adicDetalhe(lcFatConv);
	lcFatConv.setTabela(tabFatConv);
	lcFor.setMaster(lcCampos);
	lcCampos.adicDetalhe(lcFor);
    lcFor.setTabela(tabFor);
    lcLote.setMaster(lcCampos);
    lcCampos.adicDetalhe(lcLote);
    lcLote.setTabela(tabLote);
    lcFoto.setMaster(lcCampos);
    lcCampos.adicDetalhe(lcFoto);
    lcFoto.setTabela(tabFoto);
    lcPreco.setMaster(lcCampos);
    lcCampos.adicDetalhe(lcPreco); 
    lcPreco.setTabela(tabPreco);

	lcCampos.addInsertListener(this);
    lcFoto.addEditListener(this);
    lcFoto.addInsertListener(this);

    setPainel(pinGeral);
    adicTab("Geral",pinGeral);

    btExp.setToolTipText("Exportar produto");
    
    txtCodMoeda.setTipo(JTextFieldPad.TP_STRING,4,0);
    lcMoeda.add(new GuardaCampo( txtCodMoeda, 7, 100, 80, 20, "CodMoeda", "C�digo", true, false, null, JTextFieldPad.TP_STRING,true),"txtCodMoedax");
    lcMoeda.add(new GuardaCampo( txtDescMoeda, 90, 100, 207, 20, "SingMoeda", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescMoedax");
    lcMoeda.montaSql(false, "MOEDA", "FN");    
    lcMoeda.setReadOnly(true);
    lcMoeda.setQueryCommit(false);
    txtCodMoeda.setTabelaExterna(lcMoeda);
    
    txtCodUnid.setTipo(JTextFieldPad.TP_STRING,8,0);
    lcUnid.add(new GuardaCampo( txtCodUnid, 7, 100, 80, 20, "CodUnid", "C�digo", true, false, null, JTextFieldPad.TP_STRING,true),"txtCodUnidx");
    lcUnid.add(new GuardaCampo( txtDescUnid, 90, 100, 207, 20, "DescUnid", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescUnidx");
    lcUnid.montaSql(false, "UNIDADE", "EQ");    
    lcUnid.setReadOnly(true);
    lcUnid.setQueryCommit(false);
    txtCodUnid.setTabelaExterna(lcUnid);
    
    txtCodMarca.setTipo(JTextFieldPad.TP_STRING,8,0);
    lcMarca.add(new GuardaCampo( txtCodMarca, 7, 100, 80, 20, "CodMarca", "C�digo", true, false, null, JTextFieldPad.TP_STRING,true),"txtCodMarcax");
    lcMarca.add(new GuardaCampo( txtDescMarca, 90, 100, 207, 20, "DescMarca", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescMarcax");
    lcMarca.montaSql(false, "MARCA", "EQ");    
    lcMarca.setReadOnly(true);
    lcMarca.setQueryCommit(false);
    txtCodMarca.setTabelaExterna(lcMarca);

    txtCodFisc.setTipo(JTextFieldPad.TP_STRING,13,0);
    lcFisc.add(new GuardaCampo( txtCodFisc, 7, 100, 80, 20, "CodFisc", "C�digo", true, false, null, JTextFieldPad.TP_STRING,true),"txtCodFiscx");
    lcFisc.add(new GuardaCampo( txtDescFisc, 90, 100, 207, 20, "DescFisc", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescFiscx");
    lcFisc.montaSql(false, "CLFISCAL", "LF");
    lcFisc.setReadOnly(true);
    lcFisc.setQueryCommit(false);
    txtCodFisc.setTabelaExterna(lcFisc);
    
    txtCodGrup.setTipo(JTextFieldPad.TP_STRING,14,0);
    lcGrup.add(new GuardaCampo( txtCodGrup, 7, 100, 80, 20, "CodGrup", "C�digo", true, false, null, JTextFieldPad.TP_STRING,true),"txtCodGrupx");
    lcGrup.add(new GuardaCampo( txtDescGrup, 90, 100, 207, 20, "DescGrup", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescGrupx");
    lcGrup.montaSql(false, "GRUPO", "EQ");    
    lcGrup.setReadOnly(true);
    lcGrup.setQueryCommit(false);
    txtCodGrup.setTabelaExterna(lcGrup);
    
    txtCodAlmox.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    lcAlmox.add(new GuardaCampo( txtCodAlmox, 7, 100, 80, 20, "CodAlmox", "C�digo", true, false, null, JTextFieldPad.TP_INTEGER,true),"txtCodAlmoxx");
    lcAlmox.add(new GuardaCampo( txtDescAlmox, 90, 100, 207, 20, "DescAlmox", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescAlmoxx");
    lcAlmox.montaSql(false, "ALMOX", "EQ");
    lcAlmox.setReadOnly(true);
    lcAlmox.setQueryCommit(false);
    txtCodAlmox.setTabelaExterna(lcAlmox);

    vValsTipo.addElement("P");
    vValsTipo.addElement("S");
	vValsTipo.addElement("F");
	vValsTipo.addElement("M");
	vValsTipo.addElement("O");
	vValsTipo.addElement("C");
    vLabsTipo.addElement("Com�rcio");
    vLabsTipo.addElement("Servi�o");
	vLabsTipo.addElement("Fabrica��o");
	vLabsTipo.addElement("Mat. Prima");
	vLabsTipo.addElement("Patrimonio");
	vLabsTipo.addElement("Consumo");
	rgTipo = new JRadioGroup(6,1,vLabsTipo,vValsTipo);
    rgTipo.setVlrString("P");

    vValsCV.addElement("C");
    vValsCV.addElement("V");
    vValsCV.addElement("A");
    vLabsCV.addElement("Compra");
    vLabsCV.addElement("Venda");
    vLabsCV.addElement("Ambos");
    rgCV = new JRadioGroup(1,3,vLabsCV,vValsCV);
    rgCV.setVlrString("V");
    
    vValsTF.addElement("P");
    vValsTF.addElement("M");
    vValsTF.addElement("N");
    vValsTF.addElement("G");
    vLabsTF.addElement("Pequena");
    vLabsTF.addElement("M�dia");
    vLabsTF.addElement("Natural");
    vLabsTF.addElement("Grande");
    rgTF = new JRadioGroup(1,4,vLabsTF,vValsTF);
    rgTF.setVlrString("P");
    
    
    cbLote = new JCheckBoxPad("Lote","S","N");
    cbLote.setVlrString("N");
    cbLote.addCheckBoxListener(this);
    
    cbAtivo = new JCheckBoxPad("Ativo","S","N");
    cbAtivo.setVlrString("S");
    cbVerif = new JCheckBoxPad("Senha","S","N");
    cbVerif.setVlrString("S");
    
    txtCustoMPMProd.setSoLeitura(true);    
    txtCustoPEPSProd.setSoLeitura(true);    
    txtSldProd.setSoLeitura(true);
    txtSldResProd.setSoLeitura(true);
    txtDtUltCpProd.setSoLeitura(true);
    txtSldConsigProd.setSoLeitura(true);
    txtSldLiqProd.setSoLeitura(true);
    
    btImp.addActionListener(this);
	btPrevimp.addActionListener(this);
	tpn.addChangeListener(this);

         
  }
  private void montaTela() {
    adicCampo(txtCodProd, 7, 20, 70, 20, "CodProd", "C�digo", JTextFieldPad.TP_INTEGER, 8, 0, true, false, null,true);
    adicCampo(txtRefProd, 80, 20, 70, 20, "RefProd", "Refer�ncia", JTextFieldPad.TP_STRING, 13, 0, false, false, null,true);
    adicCampo(txtDescProd, 153, 20, 360, 20, "DescProd", "Descri��o", JTextFieldPad.TP_STRING, 50, 0, false, false, null,true);
    adicDB(rgTipo, 520, 20, 130, 140, "TipoProd", "Fluxo:",JTextFieldPad.TP_STRING,true);
    adicCampo(txtDescAuxProd, 7, 60, 250, 20, "DescAuxProd", "Descri��o auxiliar", JTextFieldPad.TP_STRING, 40, 0, false, false, null,false);
    adicCampo(txtCodMoeda, 259, 60, 70, 20, "CodMoeda", "C�d.Moeda", JTextFieldPad.TP_STRING, 4, 0, false, true, null,true);
    adicDescFK(txtDescMoeda, 332, 60, 181, 20, "SingMoeda", "e descri��o da moeda", JTextFieldPad.TP_STRING, 20, 0);
    adicCampo(txtCodBarProd, 7, 100, 125, 20, "CodBarProd", "Codigo de barras", JTextFieldPad.TP_STRING, 13, 0, false, false, null,true);
    adicCampo(txtCodFabProd, 135, 100, 125, 20, "CodFabProd", "Codigo do fabricante", JTextFieldPad.TP_STRING, 13, 0, false, false, null,true);
    adicCampo(txtCodAlmox, 263, 100, 70, 20, "CodAlmox", "C�d.Almox.", JTextFieldPad.TP_INTEGER, 8, 0, false, true, null,true);
    adicDescFK(txtDescAlmox, 336, 100, 176, 20, "DescAlmox", "e descri��o do almoxarifado", JTextFieldPad.TP_STRING, 40, 0);
    adicCampo(txtPesoBrutProd, 7, 140, 90, 20, "PesoBrutProd", "Peso bruto", JTextFieldPad.TP_DECIMAL, 10, 3, false, false, null,true);
    adicCampo(txtPesoLiqProd, 100, 140, 87, 20, "PesoLiqProd", "Peso l�quido", JTextFieldPad.TP_DECIMAL, 10, 3, false, false, null,true);
    adicCampo(txtPrecoBaseProd, 190, 140, 97, 20, "PrecoBaseProd", "Pre�o base", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,true);
    adicCampo(txtComisProd, 290, 140, 77, 20, "ComisProd", "% Comiss�o", JTextFieldPad.TP_DECIMAL, 6, 2, false, false, null,true);
    adicCampo(txtQtdMinProd, 370, 140, 67, 20, "QtdMinProd", "Qtd.Min.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,true);
    adicCampo(txtQtdMaxProd, 440, 140, 72, 20, "QtdMaxProd", "Qtd.M�x.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,true);
    adicCampo(txtLocalProd, 7, 180, 100, 20, "LocalProd", "Local Armz.", JTextFieldPad.TP_STRING, 15, 0, false, false, null, false);
    adicCampo(txtCustoMPMProd, 110, 180, 87, 20, "CustoMPMProd", "Custo MPM", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtCustoPEPSProd, 200, 180, 87, 20, "CustoPEPSProd", "Custo PEPS", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldProd, 290, 180, 87, 20, "SldProd", "Saldo", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldResProd, 380, 180, 87, 20, "SldResProd", "Saldo Res.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldConsigProd, 470, 180, 87, 20, "SldConsigProd", "Saldo Consig.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldLiqProd, 560, 180, 90, 20, "SldLiqProd", "Saldo Liq.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicDB(cbLote, 7, 220, 70, 20, "CLoteProd", "Estoque",JTextFieldPad.TP_STRING,true);
    adicDB(cbAtivo, 80, 220, 67, 20, "AtivoProd", "Atividade",JTextFieldPad.TP_STRING,true);
    adicDB(cbVerif, 150, 220, 67, 20, "VerifProd", "Abaixo Custo",JTextFieldPad.TP_STRING,true);
    adicCampo(txtDtUltCpProd, 220, 220, 97, 20, "DtUltCpProd", "Ultima Compra", JTextFieldPad.TP_DATE, 10, 0, false, false, null,false);
    adicCampo(txtCodUnid, 320, 220, 77, 20, "CodUnid", "C�d.Unid.", JTextFieldPad.TP_STRING, 8, 0, false, true, txtDescUnid,true);
    adicDescFK(txtDescUnid, 400, 220, 250, 20, "DescUnid", "e descri��o da unidade", JTextFieldPad.TP_STRING, 40, 0);
    adicCampo(txtCodFisc, 7, 260, 80, 20, "CodFisc", "C�d.Fisc.", JTextFieldPad.TP_STRING, 13, 0, false, true, txtDescFisc,true);
    adicDescFK(txtDescFisc, 90, 260, 237, 20, "DescFisc", "e descri��o da classifica��o fiscal", JTextFieldPad.TP_STRING, 50, 0);
    adicCampo(txtCodMarca, 330, 260, 77, 20, "CodMarca", "C�d.Marca", JTextFieldPad.TP_STRING, 6, 0, false, true, txtDescMarca,true);
    adicDescFK(txtDescMarca, 410, 260, 240, 20, "DescMarca", "e descri��o da marca", JTextFieldPad.TP_STRING, 40, 0);
    adicCampo(txtCodGrup, 7, 300, 100, 20, "CodGrup", "C�digo Grup.", JTextFieldPad.TP_STRING, 14, 0, false, true, txtDescGrup,true);
    adicDescFK(txtDescGrup, 110, 300, 237, 20, "DescGrup", "e descri��o do grupo", JTextFieldPad.TP_STRING, 50, 0);
    adicDB(rgCV, 350, 300, 260, 30, "CVProd", "Cadastro para:",JTextFieldPad.TP_STRING,true);
    adic(btExp, 620, 300, 30, 30);
    

//Decri��o completa

	adicTab("Descri��o completa", pnDesc);
	adicDBLiv(txaDescComp, "DescCompProd", "Descri��o completa",JTextFieldPad.TP_STRING, false);
	pnDesc.add(spnDesc);

	setListaCampos(true,"PRODUTO", "EQ");

//	Pre�o

    setPainel( pinRodPreco, pnPreco);
	adicTab("Pre�os",pnPreco);
	setListaCampos(lcPreco);
	setNavegador(navPreco);
	pnPreco.add(pinRodPreco, BorderLayout.SOUTH);
	pnPreco.add(spnPreco, BorderLayout.CENTER);

	pinRodPreco.adic(navPreco,0,90,270,25);

	txtCodClasCliPreco.setTipo(JTextFieldPad.TP_INTEGER,8,0);
	lcClasCliPreco.add(new GuardaCampo( txtCodClasCliPreco, 7, 100, 80, 20, "CodClasCli", "C�digo", true, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodMarcax");
	lcClasCliPreco.add(new GuardaCampo( txtDescClasCliPreco, 90, 100, 207, 20, "DescClasCli", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescMarcax");
	lcClasCliPreco.montaSql(false, "CLASCLI", "VD");    
	lcClasCliPreco.setQueryCommit(false);
	lcClasCliPreco.setReadOnly(true);
	txtDescClasCliPreco.setListaCampos(lcClasCliPreco);
	txtCodClasCliPreco.setTabelaExterna(lcClasCliPreco);

	txtCodTabPreco.setTipo(JTextFieldPad.TP_INTEGER,8,0);
	lcTabPreco.add(new GuardaCampo( txtCodTabPreco, 7, 100, 80, 20, "CodTab", "C�digo", true, false, null, JTextFieldPad.TP_INTEGER,true),"txtCodMarcax");
	lcTabPreco.add(new GuardaCampo( txtDescTabPreco, 90, 100, 207, 20, "DescTab", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescMarcax");
	lcTabPreco.montaSql(false, "TABPRECO", "VD");
	lcTabPreco.setReadOnly(true);
	lcTabPreco.setQueryCommit(false);
	txtDescTabPreco.setListaCampos(lcTabPreco);
	txtCodTabPreco.setTabelaExterna(lcTabPreco);

	txtCodPlanoPagPreco.setTipo(JTextFieldPad.TP_INTEGER,8,0);
	lcPlanoPagPreco.add(new GuardaCampo( txtCodPlanoPagPreco, 7, 100, 80, 20, "CodPlanoPag", "C�digo", true, false, null, JTextFieldPad.TP_INTEGER,true),"txtCodMarcax");
	lcPlanoPagPreco.add(new GuardaCampo( txtDescPlanoPagPreco, 90, 100, 207, 20, "DescPlanoPag", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescMarcax");
	lcPlanoPagPreco.montaSql(false, "PLANOPAG", "FN");
	lcPlanoPagPreco.setReadOnly(true);
	lcPlanoPagPreco.setQueryCommit(false);
	txtDescPlanoPagPreco.setListaCampos(lcPlanoPagPreco);
	txtCodPlanoPagPreco.setTabelaExterna(lcPlanoPagPreco);

	adicCampo(txtCodPrecoProd, 7, 20, 80, 20, "CodPrecoProd", "C�digo", JTextFieldPad.TP_INTEGER, 8, 0, true, false, null,true);
	adicCampo(txtCodClasCliPreco, 90, 20, 77, 20, "CodClasCli", "C�digo", JTextFieldPad.TP_INTEGER, 8, 0, false, true, txtDescClasCliPreco,false);
	adicDescFK(txtDescClasCliPreco, 170, 20, 197, 20, "DescClasCli", "e descri��o da clas. do cliente", JTextFieldPad.TP_STRING, 40, 0);
	adicCampo(txtCodTabPreco, 370, 20, 77, 20, "CodTab", "C�digo", JTextFieldPad.TP_INTEGER, 8, 0, false, true, txtDescTabPreco,true);
	adicDescFK(txtDescTabPreco, 450, 20, 200, 20, "DescTab", "e descri��o da tab. de pre�os", JTextFieldPad.TP_STRING, 40, 0);
	adicCampo(txtCodPlanoPagPreco, 7, 60, 77, 20, "CodPlanoPag", "C�digo", JTextFieldPad.TP_INTEGER, 8, 0, false, true, txtDescPlanoPagPreco,true);
	adicDescFK(txtDescPlanoPagPreco, 90, 60, 197, 20, "DescPlanoPag", "e descri��o do plano de pgto.", JTextFieldPad.TP_STRING, 40, 0);
	adicCampo(txtPrecoProd, 290, 60, 110, 20, "PrecoProd", "Pre�o", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,true);
	setListaCampos( true, "PRECOPROD", "VD");
	lcPreco.setOrdem("CodPrecoProd");
	lcPreco.setQueryInsert(false);
	lcPreco.setQueryCommit(false);
	lcPreco.montaTab();
	tabPreco.setTamColuna(65,0);
	tabPreco.setTamColuna(60,1);
	tabPreco.setTamColuna(110,2);
	tabPreco.setTamColuna(60,3);
	tabPreco.setTamColuna(110,4);
	tabPreco.setTamColuna(60,5);
	tabPreco.setTamColuna(110,6);
	tabPreco.setTamColuna(75,7);

//FatConv

    setPainel( pinRodFatConv, pnFatConv);
    adicTab("Fatores de convers�o",pnFatConv);
    setListaCampos(lcFatConv);
    setNavegador(navFatConv);
    pnFatConv.add(pinRodFatConv, BorderLayout.SOUTH);
    pnFatConv.add(spnFatConv, BorderLayout.CENTER);

    txtUnidFat.setTipo(JTextFieldPad.TP_STRING,4,0);
    txtFatConv.setTipo(JTextFieldPad.TP_DECIMAL,10,3);

    pinRodFatConv.adic(navFatConv,0,50,270,25);
   
    lcUnidFat.setUsaME(false);
    lcUnidFat.add(new GuardaCampo( txtUnidFat, 7, 100, 80, 20, "CodUnid", "C�digo", true, false, null, JTextFieldPad.TP_STRING,true),"txtCodUnidx");
    lcUnidFat.add(new GuardaCampo( txtDescUnidFat, 90, 100, 207, 20, "DescUnid", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescUnidx");
    lcUnidFat.montaSql(false, "UNIDADE", "EQ");
    lcUnidFat.setReadOnly(true);
    lcUnidFat.setQueryCommit(false);
    txtDescUnidFat.setListaCampos(lcUnidFat);
    txtUnidFat.setTabelaExterna(lcUnidFat);
    
    adicCampo(txtUnidFat, 7, 20, 80, 20, "CodUnid", "C�digo", JTextFieldPad.TP_STRING, 4, 0, true, true, txtDescUnidFat,true);
    adicDescFK(txtDescUnidFat, 90, 20, 150, 20, "DescUnid", "e descri��o da unidade", JTextFieldPad.TP_STRING, 40, 0);
    adicCampo(txtFatConv, 243, 20, 80, 20, "FatConv", "Fator de Conv.", JTextFieldPad.TP_DECIMAL, 10, 3, false, false, null,true);
    setListaCampos( false, "FATCONV", "EQ");
    lcFatConv.setOrdem("CodUnid");
    lcFatConv.montaTab();
    lcFatConv.setQueryInsert(false);
    lcFatConv.setQueryCommit(false);
    tabFatConv.setTamColuna(120,1);
    
//	Fornecedor
	  setPainel( pinRodFor, pnFor);
	  adicTab("Fornecedores",pnFor);
	  setListaCampos(lcFor);
    
	  navFor.setAtivo(6,false);

	  setNavegador(navFor);
	  pnFor.add(pinRodFor, BorderLayout.SOUTH);
	  pnFor.add(spnFor, BorderLayout.CENTER);

	  txtCodFor.setTipo(JTextFieldPad.TP_INTEGER,5,0);
	  txtDescFor.setTipo(JTextFieldPad.TP_STRING,50,0);

	  pinRodFor.adic(navFor,0,50,270,25);
   
	  lcForFK.setUsaME(false);
	  lcForFK.add(new GuardaCampo( txtCodFor, 7, 100, 80, 20, "CodFor", "C�digo", true, false, null, JTextFieldPad.TP_INTEGER,true),"txtCodUnidx");
	  lcForFK.add(new GuardaCampo( txtDescFor, 90, 300, 300, 20, "RazFor", "Raz�o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescUnidx");
	  lcForFK.montaSql(false, "FORNECED", "CP");
	  lcForFK.setReadOnly(true);
	  lcForFK.setQueryCommit(false);
	  txtCodFor.setListaCampos(lcForFK);
	  txtCodFor.setTabelaExterna(lcForFK);

	  adicCampo(txtCodFor, 7, 20, 80, 20, "CodFor", "C�d.Forn.", JTextFieldPad.TP_INTEGER, 5, 0, true, true, txtDescFor,true);
	  adicDescFK(txtDescFor, 90, 20, 300, 20, "RazFor", "Raz�o social do fornecedor", JTextFieldPad.TP_STRING, 50, 0);
	  adicCampo(txtCodProdFor, 400, 20, 105, 20, "RefProdFor", "C�d.Prod.Forn.", JTextFieldPad.TP_STRING, 18, 0, false, false, null,false);
	  setListaCampos( false, "PRODFOR", "CP");
	  lcFor.montaTab();
	  lcFor.setQueryInsert(false);
	  lcFor.setQueryCommit(false);
	  tabFor.setTamColuna(250,1);

//Lote
    setPainel( pinRodLote, pnLote);
    adicTab("Lotes",pnLote);
    setListaCampos(lcLote);
    setNavegador(navLote);
    pnLote.add(pinRodLote, BorderLayout.SOUTH);
    pnLote.add(spnLote, BorderLayout.CENTER);

    pinRodLote.adic(navLote,0,90,270,25);

    txtSldLote.setSoLeitura(true);
    txtSldResLote.setSoLeitura(true);
    txtSldConsigLote.setSoLeitura(true);
    txtSldLiqLote.setSoLeitura(true);

    adicCampo(txtCodLote, 7, 20, 110, 20, "CodLote", "C�digo", JTextFieldPad.TP_STRING, 13, 0, true, false, null,true);
    adicCampo(txtDiniLote, 120, 20, 100, 20, "DIniLote", "Data Inicial", JTextFieldPad.TP_DATE, 10, 0, false, false, null,false);
    adicCampo(txtVenctoLote, 223, 20, 100, 20, "VenctoLote", "Vencimento", JTextFieldPad.TP_DATE, 10, 0, false, false, null,true);
    adicCampo(txtSldLote, 7, 60, 80, 20, "SldLote", "Saldo", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldResLote, 90, 60, 80, 20, "SldResLote", "Saldo Res.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldConsigLote, 173, 60, 80, 20, "SldConsigLote", "Saldo Consig.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldLiqLote, 256, 60, 80, 20, "SldLiqLote", "Saldo Liq.", JTextFieldPad.TP_DECIMAL, 15, 3, false, false, null,false);
    setListaCampos( false, "LOTE", "EQ");
    lcLote.setOrdem("VenctoLote desc");
    lcLote.setQueryInsert(false);
    lcLote.setQueryCommit(false);
    lcLote.montaTab();
    lcLote.setDinWhereAdic("CODLOTE = #N",txtCodProd);
    tabLote.setTamColuna(110,0);
    tabLote.setTamColuna(100,1);
    tabLote.setTamColuna(100,2);
    
//Fotos 
    setPainel( pinRodFoto, pnFoto);
    adicTab("Fotos",pnFoto);
    setListaCampos(lcFoto);
    setNavegador(navFoto);
    pnFoto.add(pinRodFoto, BorderLayout.SOUTH);
    pnFoto.add(spnFoto, BorderLayout.CENTER);

    pinRodFoto.adic(navFoto,0,140,270,25);

    txtAltFotoProd.setEnabled(false);
    txtLargFotoProd.setEnabled(false);

    adicCampo(txtCodFotoProd, 7, 20, 70, 20, "CodFotoProd", "N� Foto", JTextFieldPad.TP_INTEGER, 8, 0, true, false, null,true);
    adicCampo(txtDescFotoProd,80, 20 , 250 , 20, "DescFotoProd","Descri��o", JTextFieldPad.TP_STRING,40,0, false,false,null,true);
    adicDB(rgTF, 7, 60, 323, 30, "TipoFotoProd", "Tamanho:",JTextFieldPad.TP_STRING,true);
    adicCampo(txtLargFotoProd, 7, 110, 80, 20, "LargFotoProd", "Largura", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null,true);
    adicCampo(txtAltFotoProd, 90, 110, 77, 20, "AltFotoProd", "Altura", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null,true);
    adicDB(imFotoProd, 350, 20, 150, 140, "FotoProd", "Foto: (m�x. 63K)",JTextFieldPad.TP_BYTES,true);
/*    adicCampo(txt, 90, 60, 80, 20, "SldResLote", "Saldo Res.", txtSldResLote.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldConsigLote, 173, 60, 80, 20, "SldConsigLote", "Saldo Consig.", txtSldConsigLote.TP_DECIMAL, 15, 3, false, false, null,false);
    adicCampo(txtSldLiqLote, 256, 60, 80, 20, "SldLiqLote", "Saldo Liq.", txtSldLiqLote.TP_DECIMAL, 15, 3, false, false, null,false);
*/   
    setListaCampos( true, "FOTOPROD", "VD");
    lcFoto.setOrdem("CodFotoProd");
    lcFoto.setQueryInsert(false);
    lcFoto.setQueryCommit(false);
    lcFoto.montaTab();
    tabFoto.setTamColuna(80,0);
    tabFoto.setTamColuna(250,1);
    tabFoto.setTamColuna(80,2);
    tabFoto.setTamColuna(80,3);
    tabFoto.setTamColuna(80,4);
    
	txtCodProd.requestFocus();
	btExp.addActionListener(this);
  }
  private void exportar() {
  	 if (txtCodProd.getVlrInteger().intValue() == 0 || lcCampos.getStatus() != ListaCampos.LCS_SELECT) {
  	 	Funcoes.mensagemInforma(this,"Selecione um produto cadastrado antes!");
  	 	return;
  	 }
  	 String sSQL = "SELECT ICOD FROM EQCOPIAPROD(?,?,?)";
  	 try {
  	 	PreparedStatement ps = con.prepareStatement(sSQL);
  	 	ps.setInt(1,txtCodProd.getVlrInteger().intValue());
  	 	ps.setInt(2,Aplicativo.iCodEmp);
  	 	ps.setInt(3,lcCampos.getCodFilial());
  	 	ResultSet rs = ps.executeQuery();
  	 	if (rs.next()) {
  	 		if (Funcoes.mensagemConfirma(this,"Produto '"+rs.getInt(1)+"' criado com sucesso!\n"+
  	 		                                                       "Gostaria de edita-lo agora?") == JOptionPane.OK_OPTION) {
  	 			txtCodProd.setVlrInteger(new Integer(rs.getInt(1)));
  	 			lcCampos.carregaDados();
  	 		}
  	 	}
  	 	rs.close();
  	 	ps.close();
  	 }
  	 catch (SQLException err) {
  	 	Funcoes.mensagemErro(this,"Erro ao copiar o produto!\n"+err.getMessage());
  	 	err.printStackTrace();
  	 }
  }
  private void buscaMoeda() {
    String sSQL = "SELECT CODMOEDA FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
      ps.setInt(1,Aplicativo.iCodEmp);
	  ps.setInt(2, ListaCampos.getMasterFilial("SGPREFERE1"));
      rs = ps.executeQuery();
      if (rs.next()) {
      	txtCodMoeda.setVlrString(rs.getString("CodMoeda"));
      }
      rs.close();
      ps.close();
    }
    catch (SQLException err) {
	  Funcoes.mensagemErro(this,"Erro ao carregar a tabela PREFERE1!\n"+err.getMessage());
	  err.printStackTrace();
    }
  }
  private void imprimir(boolean bVisualizar) {
	FAndamento And = null;
	ImprimeOS imp = new ImprimeOS("",con);
	Vector vFiltros = new Vector();
	int linPag = imp.verifLinPag()-1;
	int iContaReg = 0;
	String sObs = "";
	String sWhere = "";
	String sAnd = " WHERE ";
	String[] sValores; 
	imp.setTitulo("Relat�rio de Produtos");
	imp.montaCab();
    DLRProduto dl = new DLRProduto(con);
	dl.show();
	if (dl.OK == false) {
	  dl.dispose();
	  return;
	}
	sValores = dl.getValores();
	dl.dispose();
	
	if (sValores[1].trim().length() > 0) {
	  sWhere = sWhere+sAnd+"DESCPROD >= '"+sValores[1]+"'";
	  vFiltros.add("PRODUTOS MAIORES QUE "+sValores[1].trim());
	  sAnd = " AND ";
	}
	if (sValores[2].trim().length() > 0) {
	  sWhere = sWhere+sAnd+"DESCPROD <= '"+sValores[2]+"'";
	  vFiltros.add("PRODUTOS MENORES QUE "+sValores[2].trim());
	  sAnd = " AND ";
	}
	if (sValores[3].equals("S")) {
	  sWhere = sWhere+sAnd+"ATIVOPROD='S'";
	  vFiltros.add("PRODUTOS ATIVOS");
	  sAnd = " AND ";
	}
	if (sValores[4].length() > 0) {
	  sWhere = sWhere+sAnd+"CODPROD IN (SELECT CODPROD FROM CPPRODFOR WHERE CODFOR = "+sValores[4]+")";
	  vFiltros.add("FORNECEDOR = "+sValores[4].trim());
	  sAnd = " AND ";
	}
	if (sValores[7].length() > 0) {
	  sWhere = sWhere+sAnd+"CODALMOX = "+sValores[7];
	  vFiltros.add("ALMOXARIFADO = "+sValores[8]);
	  sAnd = " AND ";
	}
	
	if (sValores[9].length() > 0) {
		sWhere = sWhere+sAnd+"CODMARCA = '"+sValores[9]+"'";
		vFiltros.add("MARCA = "+sValores[10]);
		sAnd = " AND ";
	}
		
	if (sValores[6].equals("C")) {
	  String sSQL = "SELECT CODPROD,REFPROD, CODALMOX, DESCPROD,CODUNID, CODMARCA,TIPOPROD,CODGRUP,CODBARPROD,"+
					"CODFABPROD, COMISPROD, PESOLIQPROD, PESOBRUTPROD, QTDMINPROD, QTDMAXPROD, CLOTEPROD, CUSTOMPMPROD,"+
					"CUSTOPEPSPROD, PRECOBASEPROD, SLDPROD, SLDRESPROD, SLDCONSIGPROD, SLDLIQPROD, DTULTCPPROD, QTDULTCPPROD"+sObs+" FROM EQPRODUTO"+sWhere+" ORDER BY "+sValores[0];
	  PreparedStatement ps = null;
	  ResultSet rs = null;
	  try {
		ps = con.prepareStatement("SELECT COUNT(*) FROM EQPRODUTO"+sWhere);
		rs = ps.executeQuery();
		rs.next();
		And = new FAndamento("Montando Relat�rio, Aguarde!",0,rs.getInt(1)-1);
//		  rs.close();
//		  ps.close();
		if (!con.getAutoCommit())
			con.commit();
		ps = con.prepareStatement(sSQL);
		rs = ps.executeQuery();
		imp.limpaPags();
		while ( rs.next() ) {
		  if (imp.pRow()==0) {
			imp.impCab(136);
			imp.say(imp.pRow()+0,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate(" ",61)+"Filtrado por:"+Funcoes.replicate(" ",60)+"|");
			for (int i=0;i<vFiltros.size();i++) {            
					String sTmp = (String)vFiltros.elementAt(i);
					sTmp = "|"+Funcoes.replicate(" ",(((136-sTmp.length())/2)-1))+sTmp;
					sTmp += Funcoes.replicate(" ",135-sTmp.length())+"|";
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,0,sTmp);
			}
		  }
		  
		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",134)+"|");
		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  imp.say(imp.pRow()+0,0,"|");
		  imp.say(imp.pRow()+0,2,"C�digo:");
		  imp.say(imp.pRow()+0,12,rs.getString("CodProd"));
		  imp.say(imp.pRow()+0,22,"Ref.:");
		  imp.say(imp.pRow()+0,28,rs.getString("RefProd"));
		  imp.say(imp.pRow()+0,42,"Descri��o:");
		  imp.say(imp.pRow()+0,53,rs.getString("DescProd"));
		  imp.say(imp.pRow()+0,104,"Cod.Bar.:");
		  imp.say(imp.pRow()+0,115,rs.getString("codBarProd"));
		  imp.say(imp.pRow()+0,136,"|");
		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  imp.say(imp.pRow()+0,0,"|");
		  imp.say(imp.pRow()+0,136,"|");
		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  imp.say(imp.pRow()+0,0,"|");
 // 	  imp.say(imp.pRow()+0,76,"Codido do Almoxarifado:");
          imp.say(imp.pRow()+0,02,"Cod.Fabr.:");
	      imp.say(imp.pRow()+0,13,rs.getString("CodFabProd"));
		  imp.say(imp.pRow()+0,27,"Grupo:");
		  imp.say(imp.pRow()+0,34,rs.getString("Codgrup"));
		  imp.say(imp.pRow()+0,48,"Custo:");
		  imp.say(imp.pRow()+0,55,rs.getString("custoMPMprod"));
  //	  imp.say(imp.pRow()+0,34,"Custo ");
  //      imp.say(imp.pRow()+0,65,rs.getString("custoPEPSprod"));
		  imp.say(imp.pRow()+0,71,"Pre�o base:");
		  imp.say(imp.pRow()+0,83,rs.getString("precobaseprod"));
  //	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
  //	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  imp.say(imp.pRow()+0,99,"Saldo:");
		  imp.say(imp.pRow()+0,106,rs.getString("sldprod"));
  //	  imp.say(imp.pRow()+0,58,"Saldo Reservado");
  //	  imp.say(imp.pRow()+0,65, rs.getString("slresprod"));
  //	  imp.say(imp.pRow()+1,0,"sldconsigprod");
  //   	  imp.say(imp.pRow()+0,0,rs.getString("sldresprod"));
  //	  imp.say(imp.pRow()+0,35,"Saldo Liquido");
 //		  imp.say(imp.pRow()+0,65,rs.getString("sldligprod"));
          imp.say(imp.pRow()+0,121,"Un.:");
          imp.say(imp.pRow()+0,126,rs.getString("codunid"));
		  imp.say(imp.pRow()+0,136,"|");		  

		  
		
		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  imp.say(imp.pRow()+0,0,Funcoes.replicate("-",136));
		  
		  if (imp.pRow()>=linPag) {
			imp.incPags();
			imp.eject();
		  }
		  And.atualiza(iContaReg);
		  iContaReg++;
		}
		imp.say(imp.pRow()+1,0,""+imp.comprimido());
		imp.say(imp.pRow()+0,0,"|"+ Funcoes.replicate("-",134)+"|");
		imp.eject();

		imp.fechaGravacao();

//		  rs.close();
//		  ps.close();
		if (!con.getAutoCommit())
			con.commit();
		dl.dispose();
		And.dispose();
	  }
	  catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro consulta tabela de produtos!"+err.getMessage());
	  }
	}
	else if (dl.getValores()[6].equals("R")) {
	  String sSQL = "SELECT CODPROD,DESCPROD,CODUNID, SLDLIQPROD, PRECOBASEPROD FROM EQPRODUTO"+sWhere+" ORDER BY "+dl.getValores()[0];
	  PreparedStatement ps = null;
	  ResultSet rs = null;
	  try {
		ps = con.prepareStatement("SELECT COUNT(*) FROM EQPRODUTO"+sWhere);
		rs = ps.executeQuery();
		rs.next();
		And = new FAndamento("Montando Relat�rio, Aguarde!",0,rs.getInt(1)-1);
//		  rs.close();
//		  ps.close();
		if (!con.getAutoCommit())
			con.commit();
		ps = con.prepareStatement(sSQL);
		rs = ps.executeQuery();
		imp.limpaPags();
		while ( rs.next() ) {
		  if (imp.pRow()==0) {
			imp.impCab(136);
			imp.say(imp.pRow()+0,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,2,"|"+Funcoes.replicate(" ",61)+"Filtrado por:"+Funcoes.replicate(" ",60)+"|");
			for (int i=0;i<vFiltros.size();i++) {            
					String sTmp = (String)vFiltros.elementAt(i);
					sTmp = "|"+Funcoes.replicate(" ",(((136-sTmp.length())/2)-1))+sTmp;
					sTmp += Funcoes.replicate(" ",135-sTmp.length())+"|";
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,2,sTmp);
			}
			
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,0,"|"+ Funcoes.replicate("-",134)+"|");
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,0,"|");
			imp.say(imp.pRow()+0,3,"C�digo:");
			imp.say(imp.pRow()+0,12,"|");
			imp.say(imp.pRow()+0,13,"Descri��o:");
			imp.say(imp.pRow()+0,70,"|");
			imp.say(imp.pRow()+0,72,"Unidade:");
			imp.say(imp.pRow()+0,95,"|");
			imp.say(imp.pRow()+0,97,"Saldo:");
			imp.say(imp.pRow()+0,117,"|");
			imp.say(imp.pRow()+0,120,"Pre�o Base:");
			imp.say(imp.pRow()+0,136,"|");
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,0,Funcoes.replicate("-",136));
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			
		  }
		  imp.say(imp.pRow()+0,0,"|");
		  imp.say(imp.pRow()+0,4,rs.getString("CodProd"));
		  imp.say(imp.pRow()+0,12,"|");
		  imp.say(imp.pRow()+0,13,rs.getString("DescProd") != null ? rs.getString("Descprod").substring(0,50) : "");
		  imp.say(imp.pRow()+0,70,"|");
		  imp.say(imp.pRow()+0,72,rs.getString("codunid"));
		  imp.say(imp.pRow()+0,95,"|");
		  imp.say(imp.pRow()+0,97,rs.getString("sldliqprod"));
		  imp.say(imp.pRow()+0,117,"|");
 		  imp.say(imp.pRow()+0,120,rs.getString("Precobaseprod"));
		  imp.say(imp.pRow()+0,136,"|");
		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		  if (imp.pRow()>=linPag) {
			imp.incPags();
			imp.eject();
		  }
		  And.atualiza(iContaReg);
		  iContaReg++;
		}
		imp.say(imp.pRow()+1,0,""+imp.comprimido());
		imp.say(imp.pRow()+0,0,Funcoes.replicate("=",136));
		imp.eject();

		imp.fechaGravacao();

//		  rs.close();
//		  ps.close();
		if (!con.getAutoCommit())
			con.commit();
		dl.dispose();
		And.dispose();
	  }
	  catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro consulta tabela de produtos!"+err.getMessage());
	  }
	}
	if (bVisualizar) {
	  imp.preview(this);
	}
	else {
	  imp.print();
	}
  }
  public void execShow(Connection cn) {
    con = cn;
    montaTela();
    lcMoeda.setConexao(cn);      
    lcUnid.setConexao(cn);
    lcFisc.setConexao(cn);      
    lcMarca.setConexao(cn);      
    lcGrup.setConexao(cn);      
    lcAlmox.setConexao(cn);   
    lcUnidFat.setConexao(cn);
	lcForFK.setConexao(cn);
    lcFatConv.setConexao(cn);
	lcFor.setConexao(cn);
    lcLote.setConexao(cn);
    lcFoto.setConexao(cn);
    lcPreco.setConexao(cn);
    lcClasCliPreco.setConexao(cn);
    lcTabPreco.setConexao(cn);
    lcPlanoPagPreco.setConexao(cn);
    super.execShow(cn);
  }
  public void valorAlterado(CheckBoxEvent cbevt) {
    if (cbLote.getStatus()) {
      txtCodLote.setEditable(true);
      txtDiniLote.setEditable(true);
      txtVenctoLote.setEditable(true);
      lcLote.setReadOnly(false);
    }
    else {
      txtCodLote.setEditable(false);
      txtDiniLote.setEditable(false);
      txtVenctoLote.setEditable(false);
      lcLote.setReadOnly(true);
    }
  }
  public void afterEdit(EditEvent eevt) {
    if (imFotoProd.foiAlterado()) {
      txtLargFotoProd.setVlrString(""+imFotoProd.getLargura());
      txtAltFotoProd.setVlrString(""+imFotoProd.getAltura());
    }
  }
  public void afterInsert(InsertEvent ievt) {
    if (ievt.getListaCampos() == lcFoto && imFotoProd.foiAlterado()) {
      txtLargFotoProd.setVlrString(""+imFotoProd.getLargura());
      txtAltFotoProd.setVlrString(""+imFotoProd.getAltura());
    }
    else if (ievt.getListaCampos() == lcCampos) {
    	buscaMoeda();
    	cbAtivo.setVlrString("S");
    }
  }
  public void actionPerformed(ActionEvent evt) {
  	if (evt.getSource() == btPrevimp) 
  	  imprimir(true);
  	else if (evt.getSource() == btImp) 
	  imprimir(false);
  	else if (evt.getSource() == btExp) 
  		exportar();
  	super.actionPerformed(evt);
  }
  public void stateChanged(ChangeEvent cevt){
  	if (cevt.getSource()==tpn) {
		if (tpn.getSelectedIndex()==0)
		  txtCodProd.requestFocus();
  		else if (tpn.getSelectedIndex()==1)
  		  txtUnidFat.requestFocus();
  	    else if (tpn.getSelectedIndex()==2)
  		  txtCodFor.requestFocus();
		else if (tpn.getSelectedIndex()==3)
		  txtCodLote.requestFocus();
		else if (tpn.getSelectedIndex()==4)
		  txtCodFotoProd.requestFocus();
		else if (tpn.getSelectedIndex()==5)
		  txtCodPrecoProd.requestFocus();                     
  	}
  }
  public void beforeEdit(EditEvent eevt) { }
  public void beforeInsert(InsertEvent eevt) { }
  public void edit(EditEvent eevt) { }
}

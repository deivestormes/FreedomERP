/**
 * @version 01/09/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.pcp <BR>
 * Classe: @(#)FEstrutura.java <BR>
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

package org.freedom.modulos.pcp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.JPanelPad;
import org.freedom.telas.FDetalhe;
import org.freedom.telas.FPrincipal;

public class FEstrutura extends FDetalhe implements ActionListener, CarregaListener, PostListener{
  private JPanelPad pinCab = new JPanelPad();
  private JPanelPad pinDet = new JPanelPad();
  private JTextFieldPad txtCodProd = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescProd = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodFase = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescFase = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtDescEst = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtQtdEst = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtNumSeq = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtCodProd2 = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescProd2 = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtQtdMat = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JCheckBoxPad cbRmaAutoItEst = new JCheckBoxPad("Rma autom�tica","S","N");
  private JButton btFase = new JButton("Fases",Icone.novo("btExecuta.gif"));
  private ListaCampos lcProd = new ListaCampos(this,"PD");
  private ListaCampos lcProd2 = new ListaCampos(this,"PD");
  private ListaCampos lcFase = new ListaCampos(this,"FS");
  FPrincipal fPrim = null;
  public FEstrutura() {
    setTitulo("Estrutura de produtos");
    setAtribos( 50, 20, 600, 390);
    setAltCab(130);
    
    btFase.setEnabled(false);
    
    pinCab = new JPanelPad(500,90);
    setListaCampos(lcCampos);
    setPainel( pinCab, pnCliCab);
    lcCampos.addPostListener(this);
    lcProd.setUsaME(false);
    lcProd.add(new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, true));
    lcProd.add(new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false));
    lcProd.setWhereAdic("TIPOPROD='F'");
    lcProd.montaSql(false, "PRODUTO", "EQ");
    lcProd.setQueryCommit(false);
    lcProd.setReadOnly(true);
    txtCodProd.setTabelaExterna(lcProd);
    txtDescProd.setListaCampos(lcProd);
    
    lcProd2.add(new GuardaCampo( txtCodProd2, "CodProd", "C�d.prod.", ListaCampos.DB_PK, true));
    lcProd2.add(new GuardaCampo( txtDescProd2, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false));
    lcProd2.montaSql(false, "PRODUTO", "EQ");
    lcProd2.setQueryCommit(false);
    lcProd2.setReadOnly(true);
    txtCodProd2.setTabelaExterna(lcProd2);
    txtDescProd2.setListaCampos(lcProd2);

    lcFase.add(new GuardaCampo( txtCodFase, "CodFase", "C�d.fase", ListaCampos.DB_PK, true));
    lcFase.add(new GuardaCampo( txtDescFase, "DescFase", "Descri��o da fase", ListaCampos.DB_SI, false));
    lcFase.setDinWhereAdic("CODFASE IN (SELECT CODFASE FROM PPESTRUFASE WHERE " +
            "CODEMP=PPFASE.CODEMP AND CODFILIAL=PPFASE.CODFILIAL AND CODPROD=#N)",txtCodProd);
    lcFase.montaSql(false, "FASE", "PP");
    lcFase.setQueryCommit(false);
    lcFase.setReadOnly(true);
    txtCodFase.setTabelaExterna(lcFase);
    txtDescFase.setListaCampos(lcFase);

    adicCampo(txtCodProd, 7, 20, 80, 20,"CodProd","C�d.prod.", ListaCampos.DB_PF, txtDescProd, true);
    adicDescFK(txtDescProd, 90, 20, 297, 20, "DescProd", "Descri��o do produto");
    adicCampo(txtQtdEst, 390, 20, 100, 20,"QtdEst","Quantidade", ListaCampos.DB_SI, true);
    adicCampo(txtDescEst, 7, 60, 380, 20,"DescEst","Descri��o", ListaCampos.DB_SI, true);
    adic(btFase,390,55,100,25);
    setListaCampos( false, "ESTRUTURA", "PP");
    lcCampos.setQueryInsert(false);
    setAltDet(100);
    pinDet = new JPanelPad(590,110);
    setPainel( pinDet, pnDet);
    setListaCampos(lcDet);
    setNavegador(navRod);
    
    cbRmaAutoItEst.setVlrString("N");

    adicCampo(txtNumSeq, 7, 20, 40, 20,"SeqItEst","Item", ListaCampos.DB_PK, true);
    adicCampo(txtCodProd2, 50, 20, 77, 20,"CodProdPD","C�d.prod.", ListaCampos.DB_FK, txtDescProd2, true);
    adicDescFK(txtDescProd2, 130, 20, 227, 20, "DescProd", "Descri��o do produto");
    adicCampo(txtQtdMat, 360, 20, 100, 20,"QtdItEst","Quantidade", ListaCampos.DB_SI, true);
    adicCampo(txtCodFase, 7, 60, 70, 20,"CodFase","C�d.fase", ListaCampos.DB_FK, txtDescFase, true);
    adicDescFK(txtDescFase, 80, 60, 280, 20, "DescFase", "Descri��o da fase");
    adicDB(cbRmaAutoItEst,360,60,120,20,"RmaAutoItEst", "", true);
    setListaCampos( true, "ITESTRUTURA", "PP");
    lcDet.setQueryInsert(false);
    montaTab();
    
    txtCodProd2.setNomeCampo("CodProd");
    
    btFase.addActionListener(this);
    lcCampos.addCarregaListener(this);
    
    tab.setTamColuna(50,0);
    tab.setTamColuna(150,2);
    tab.setTamColuna(150,5);
  }
  private void abreFase() {
    if (fPrim.temTela("Estrutura x Fase")==false) {
      FEstFase tela = new FEstFase(txtCodProd.getVlrInteger().intValue());
      fPrim.criatela("Estrutura x Fase",tela,con);
      tela.setConexao(con);
    }
  }
  public void setTelaPrim(FPrincipal fP) {
      fPrim = fP;
  }
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btFase)
        abreFase();
    super.actionPerformed(evt);
  }
  public void setConexao(Connection cn) {
    super.setConexao(cn);
    lcProd.setConexao(cn);
    lcProd2.setConexao(cn);
    lcFase.setConexao(cn);
  }
  public void afterCarrega(CarregaEvent cevt) {
    if (cevt.getListaCampos() == lcCampos) {
        boolean bMostraBt = (lcCampos.getStatus() != ListaCampos.LCS_NONE) && (lcCampos.getStatus() != ListaCampos.LCS_INSERT);
    	btFase.setEnabled(bMostraBt);        
    }
  }      
  
  public void beforeCarrega(CarregaEvent cevt) {
  }
  public void afterPost(PostEvent pevt) { 
    if (pevt.getListaCampos() == lcCampos) {      
    	btFase.setEnabled((lcCampos.getStatus() != ListaCampos.LCS_NONE) && (lcCampos.getStatus() != ListaCampos.LCS_INSERT));        
    }  
  }
}

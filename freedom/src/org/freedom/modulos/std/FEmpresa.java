/**
 * @version 11/02/2002 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FEmpresa.java <BR>
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
import java.sql.Connection;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.Painel;
import org.freedom.componentes.PainelImagem;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.FTabDados;

public class FEmpresa extends FTabDados implements PostListener{
  private Painel pinGeral = new Painel(470,470);
  private Painel pinFilial = new Painel(470,270);
  private JPanel pnFilial = new JPanel(new BorderLayout());
  private JTextFieldPad txtCodEmp = new JTextFieldPad(5);
  private JTextFieldPad txtRazEmp = new JTextFieldPad(50);
  private JTextFieldPad txtNomeEmp = new JTextFieldPad(40);
  private JTextFieldPad txtEndEmp = new JTextFieldPad(50);
  private JTextFieldPad txtNumEmp = new JTextFieldPad(8);
  private JTextFieldPad txtCnpjEmp = new JTextFieldPad(14);
  private JTextFieldPad txtInscEmp = new JTextFieldPad(15);
  private JTextFieldPad txtBairEmp = new JTextFieldPad(30);
  private JTextFieldPad txtComplEmp = new JTextFieldPad(20);
  private JTextFieldPad txtCidEmp = new JTextFieldPad(30);
  private JTextFieldPad txtCepEmp = new JTextFieldPad(8);
  private JTextFieldPad txtFoneEmp = new JTextFieldPad(12);
  private JTextFieldPad txtFaxEmp = new JTextFieldPad(8);
  private JTextFieldPad txtUFEmp = new JTextFieldPad(2);
  private JTextFieldPad txtEmailEmp = new JTextFieldPad(50);
  private JTextFieldPad txtWWWEmp = new JTextFieldPad(50);
  private JTextFieldPad txtPercIssEmp = new JTextFieldPad(8);
  private JTextFieldPad txtCodEANEmp = new JTextFieldPad(6);
  private JTextFieldPad txtCodPaisEmp = new JTextFieldPad(3);
  private JTextFieldPad txtNomeContEmp = new JTextFieldPad(40);
  private JTextFieldPad txtCodFilial = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
  private JTextFieldPad txtRazFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtNomeFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCnpjFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,14,0);
  private JTextFieldPad txtInscFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,15,0);
  private JTextFieldPad txtEndFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtNumFilial = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtComplFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,20,0);
  private JTextFieldPad txtBairFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,30,0);
  private JTextFieldPad txtCepFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,8,0);
  private JTextFieldPad txtCidFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,30,0);
  private JTextFieldPad txtUFFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,2,0);
  private JTextFieldPad txtFoneFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,12,0);
  private JTextFieldPad txtFaxFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,8,0);
  private JTextFieldPad txtEmailFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtWWWFilial = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodDistFilial = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtPercPIS = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,5,2);
  private JTextFieldPad txtPercCofins = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,5,2);
  private JTextFieldPad txtPercIR = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,5,2);
  private JTextFieldPad txtPercCSocial = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,5,2);
  private JCheckBoxPad cbMatriz = new JCheckBoxPad("Matriz","S","N");
  private JCheckBoxPad cbSimples = new JCheckBoxPad("Simples","S","N");
  private ListaCampos lcFilial = new ListaCampos(this);
  private Tabela tabFilial = new Tabela();
  private JScrollPane spnFilial = new JScrollPane(tabFilial);
  private Navegador navFilial = new Navegador(true);
  private PainelImagem imFotoEmp = new PainelImagem(65000);
  public FEmpresa () {
    setTitulo("Cadastro da Empresa");
    setAtribos( 50, 20, 500, 470);
    
    lcCampos.addPostListener(this);
    lcFilial.addPostListener(this);
    
    lcCampos.setUsaME(false);
    lcFilial.setUsaME(false);

    lcFilial.setMaster(lcCampos);
    lcCampos.adicDetalhe(lcFilial);
    lcFilial.setTabela(tabFilial);

    txtCodEmp.cancelaDLF2();
    
    setPainel(pinGeral);
    adicTab("Geral",pinGeral);

    adicCampo(txtCodEmp, 7, 20, 60, 20, "CodEmp", "C�d.emp.", JTextFieldPad.TP_INTEGER, 5, 0, true, false, null, true);
    adicCampo(txtRazEmp, 70, 20, 207, 20, "RazEmp", "Raz�o social da empresa", JTextFieldPad.TP_STRING, 50, 0, false, false, null, true);
    adicCampo(txtNomeEmp, 280, 20, 190, 20, "NomeEmp", "Nome fantasia", JTextFieldPad.TP_STRING, 40, 0, false, false, null, false);
    adicCampo(txtCnpjEmp, 7, 60, 125, 20, "CnpjEmp", "Cnpj", JTextFieldPad.TP_STRING, 14, 0, false, false, null, true);
    adicCampo(txtInscEmp, 135, 60, 112, 20, "InscEmp", "Inscri��o Estadual", JTextFieldPad.TP_STRING, 15, 0, false, false, null, true);
    adicCampo(txtEndEmp, 250, 60, 127, 20, "EndEmp", "Endere�o", JTextFieldPad.TP_STRING, 50, 0, false, false, null, false);
    adicCampo(txtNumEmp, 380, 60, 37, 20, "NumEmp", "Num.", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null, false);
    adicCampo(txtComplEmp, 420, 60, 50, 20, "ComplEmp", "Compl.", JTextFieldPad.TP_STRING, 20, 0, false, false, null, false);
    adicCampo(txtBairEmp, 7, 100, 150, 20, "BairEmp", "Bairro", JTextFieldPad.TP_STRING, 30, 0, false, false, null, false);
    adicCampo(txtCidEmp, 160, 100, 157, 20, "CidEmp", "Cidade", JTextFieldPad.TP_STRING, 30, 0, false, false, null, false);
    adicCampo(txtCepEmp, 320, 100, 92, 20, "CepEmp", "Cep", JTextFieldPad.TP_STRING, 8, 0, false, false, null, false);
    adicCampo(txtUFEmp, 415, 100, 55, 20, "UFEmp", "UF", JTextFieldPad.TP_STRING, 2, 0, false, false, null, false);
    adicCampo(txtFoneEmp, 7, 140, 150, 20, "FoneEmp", "Telefone", JTextFieldPad.TP_STRING, 12, 0, false, false, null, false);
    adicCampo(txtFaxEmp, 160, 140, 137, 20, "FaxEmp", "Fax", JTextFieldPad.TP_STRING, 8, 0, false, false, null, false);
    adicCampo(txtEmailEmp, 300, 140, 170, 20, "EmailEmp", "E-Mail", JTextFieldPad.TP_STRING, 50, 0, false, false, null, false);
    adicCampo(txtWWWEmp, 7, 180, 180, 20, "WWWEmp", "P�gina da WEB", JTextFieldPad.TP_STRING, 50, 0, false, false, null, false);
    adicCampo(txtCodEANEmp, 190, 180, 57, 20, "CodEANEmp", "Cod. EAN", JTextFieldPad.TP_STRING, 6, 0, false, false, null, false);
    adicCampo(txtCodPaisEmp, 250, 180, 47, 20, "CodPaisEmp", "C.pais", JTextFieldPad.TP_STRING, 3, 0, false, false, null, false);
    adicCampo(txtPercIssEmp, 300, 180, 47, 20, "PercIssEmp" , "%Iss" , JTextFieldPad.TP_DECIMAL, 6, 2 ,false, false, null, false);
    adicCampo(txtNomeContEmp, 350, 180, 120, 20,"NomeContEmp" , "Contato" , JTextFieldPad.TP_STRING, 40 , 0,false, false, null,false);
	adicDB(imFotoEmp, 7, 230, 150, 140, "FotoEmp", "Foto: (m�x. 64K)",JTextFieldPad.TP_BYTES,true);
    
    txtCnpjEmp.setMascara(JTextFieldPad.MC_CNPJ);
    txtCepEmp.setMascara(JTextFieldPad.MC_CEP);
    txtFoneEmp.setMascara(JTextFieldPad.MC_FONEDDD);
    txtFaxEmp.setMascara(JTextFieldPad.MC_FONE);
    setListaCampos( true, "EMPRESA", "SG");


    setPainel( pinFilial, pnFilial);
    adicTab("Filiais",pnFilial);
    setListaCampos(lcFilial);
    setNavegador(navFilial);
    pnFilial.add(pinFilial, BorderLayout.SOUTH);
    pnFilial.add(spnFilial, BorderLayout.CENTER);

    adicCampo(txtCodFilial, 7, 20, 60, 20, "CodFilial", "C�d.fil.", ListaCampos.DB_PK, true);
    adicCampo(txtRazFilial, 70, 20, 207, 20, "RazFilial", "Raz�o social da filial", ListaCampos.DB_SI, true);
    adicCampo(txtNomeFilial, 280, 20, 190, 20, "NomeFilial", "Nome fanatasia da filial", ListaCampos.DB_SI, false);
    adicCampo(txtCnpjFilial, 7, 60, 125, 20, "CnpjFilial", "Cnpj", ListaCampos.DB_SI, true);
    adicCampo(txtInscFilial, 135, 60, 112, 20, "InscFilial", "Inscri��o Estadual", ListaCampos.DB_SI, true);
    adicCampo(txtEndFilial, 250, 60, 127, 20, "EndFilial", "Endere�o", ListaCampos.DB_SI, false);
    adicCampo(txtNumFilial, 380, 60, 37, 20, "NumFilial", "Num.", ListaCampos.DB_SI, false);
    adicCampo(txtComplFilial, 420, 60, 50, 20, "ComplFilial", "Compl.", ListaCampos.DB_SI, false);
    adicCampo(txtBairFilial, 7, 100, 150, 20, "BairFilial", "Bairro", ListaCampos.DB_SI, false);
    adicCampo(txtCidFilial, 160, 100, 157, 20, "CidFilial", "Cidade", ListaCampos.DB_SI, false);
    adicCampo(txtCepFilial, 320, 100, 92, 20, "CepFilial", "Cep", ListaCampos.DB_SI, false);
    adicCampo(txtUFFilial, 415, 100, 55, 20, "UFFilial", "UF", ListaCampos.DB_SI, false);
    adicCampo(txtFoneFilial, 7, 140, 230, 20, "FoneFilial", "Telefone", ListaCampos.DB_SI, false);
    adicCampo(txtFaxFilial, 240, 140, 230, 20, "FaxFilial", "Fax", ListaCampos.DB_SI, false);
    adicCampo(txtEmailFilial, 7, 180, 140, 20, "EmailFilial", "E-Mail", ListaCampos.DB_SI, false);
    adicCampo(txtWWWFilial, 150, 180, 137, 20, "WWWFilial", "P�gina da WEB", ListaCampos.DB_SI, false);
    adicCampo(txtCodDistFilial, 290, 180, 77, 20, "CodDistFilial", "C.dist.fil", ListaCampos.DB_SI, false);
    adicDB(cbMatriz, 370, 180, 80, 20, "MzFilial", "Sede",JTextFieldPad.TP_STRING,false);
    adicCampo(txtPercPIS, 7, 220, 90, 20, "PercPISFilial", "PIS", ListaCampos.DB_SI, false);
    adicCampo(txtPercCofins, 100, 220, 87, 20, "PercCofinsFilial", "COFINS", ListaCampos.DB_SI, false);
    adicCampo(txtPercIR, 190, 220, 87, 20, "PercIRFilial", "IR", ListaCampos.DB_SI, false);
    adicCampo(txtPercCSocial, 280, 220, 87, 20, "PercCSocialFilial", "Cont.social", ListaCampos.DB_SI, false);
    adicDB(cbSimples, 370, 220, 80, 20, "SimplesFilial", "Fiscal",JTextFieldPad.TP_STRING,false);
    txtCnpjFilial.setMascara(JTextFieldPad.MC_CNPJ);
    txtCepFilial.setMascara(JTextFieldPad.MC_CEP);
    txtFoneFilial.setMascara(JTextFieldPad.MC_FONEDDD);
    txtFaxFilial.setMascara(JTextFieldPad.MC_FONE);
    setListaCampos( false, "FILIAL", "SG");
    lcFilial.setOrdem("RazFilial");
    lcFilial.montaTab();
    lcFilial.setQueryInsert(false);
    lcFilial.setQueryCommit(false);
    tabFilial.setTamColuna(120,1);
    pinFilial.adic(navFilial,0,245,270,25);
    tabFilial.setTamColuna(100,0);

  }  
  public void beforePost(PostEvent pevt) {
    if (pevt.getListaCampos() == lcCampos) {
      if (txtCnpjEmp.getText().trim().length() < 1) {
	    pevt.cancela();
        Funcoes.mensagemInforma( this,"Campo CNPJ � requerido! ! !");
        txtCnpjEmp.requestFocus();
      }
      else if (txtInscEmp.getText().trim().length() < 1) {
        if (Funcoes.mensagemConfirma(this, "Inscri��o Estadual em branco! Inserir ISENTO?")==0 )
          txtInscEmp.setVlrString("ISENTO");
        else {
          pevt.cancela();
          txtInscEmp.requestFocus();
        }
      }
      else if (txtInscEmp.getText().trim().toUpperCase().compareTo("ISENTO") == 0)
        return;
      else if (txtUFEmp.getText().trim().length() < 2) {
        pevt.cancela();
        Funcoes.mensagemInforma(this,"Campo UF � requerido! ! !");
        txtUFEmp.requestFocus();
      }
      else if (!Funcoes.vIE(txtInscEmp.getText(),txtUFEmp.getText())) {
        pevt.cancela();
        Funcoes.mensagemInforma( this,"Inscri��o Estadual Inv�lida ! ! !");
        txtInscEmp.requestFocus();
      }
      txtInscEmp.setVlrString(Funcoes.sIEValida);
    }
    else if(pevt.getListaCampos() == lcFilial) {
      if (txtCnpjFilial.getText().trim().length() < 1) {
        pevt.cancela();
        Funcoes.mensagemInforma( this,"Campo CNPJ � requerido! ! !");
        txtCnpjFilial.requestFocus();
      }
      else if (txtInscFilial.getText().trim().length() < 1) {
        if (Funcoes.mensagemConfirma(this, "Inscri��o Estadual em branco! Inserir ISENTO?")==0 )
          txtInscFilial.setVlrString("ISENTO");
        else {
          pevt.cancela();
          txtInscFilial.requestFocus();
        }
      }
      else if (txtInscFilial.getText().trim().toUpperCase().compareTo("ISENTO") == 0)
        return;
      else if (txtUFFilial.getText().trim().length() < 2) {
        pevt.cancela();
        Funcoes.mensagemInforma( this,"Campo UF � requerido! ! !");
        txtUFFilial.requestFocus();
      }
      else if (!Funcoes.vIE(txtInscFilial.getText(),txtUFFilial.getText())) {
        pevt.cancela();
        Funcoes.mensagemInforma( this,"Inscri��o Estadual Inv�lida ! ! !");
        txtInscFilial.requestFocus();
      }
    }
  }
  public void afterPost(PostEvent pevt) { }
  public void execShow(Connection cn) {
  	lcFilial.setConexao(cn);
    super.execShow(cn);
  }

}

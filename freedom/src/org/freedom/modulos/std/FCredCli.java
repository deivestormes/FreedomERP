/**
 * @version 21/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FCredCli.java <BR>
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
 * Tela ficha cadastral e cr�dito de cliente.
 * 
 */

package org.freedom.modulos.std;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.Painel;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FTabDados;

public class FCredCli extends FTabDados	implements ActionListener, CarregaListener {
  private JPanel pnFicha = new JPanel(new BorderLayout());
  private Painel pinGeral = new Painel(600, 200);
  private Painel pinFicha = new Painel(600, 200);
  private Painel pinRodFicha = new Painel(600,80);
  private JTextFieldPad txtCodCli = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
  private JTextFieldFK txtDataCli = new JTextFieldFK(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtCodTipoCli = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
  private JTextFieldFK txtDescTipoCli = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodTpCred = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
  private JTextFieldFK txtDescTpCred = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldFK txtVlrTpCred = new JTextFieldFK(JTextFieldPad.TP_DECIMAL,15,2);
  private JTextFieldPad txtDtIniTr = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtDtVencto = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtRazCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 50, 0);
  private JTextFieldPad txtNomeCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 40, 0);
  private JTextFieldPad txtCnpjCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 14, 0);
  private JTextFieldPad txtInscCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 15, 0);
  private JTextFieldPad txtCpfCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 11, 0);
  private JTextFieldPad txtRgCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 10, 0);
  private JTextFieldPad txtEndCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 50, 0); 
  private JTextFieldPad txtNumCli = new JTextFieldPad(JTextFieldPad.TP_INTEGER, 8, 0);
  private JTextFieldPad txtComplCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 20, 0);
  private JTextFieldPad txtBairCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 30, 0);
  private JTextFieldPad txtCidCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 30, 0);
  private JTextFieldPad txtUFCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 2, 0);
  private JTextFieldPad txtCepCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 8, 0);
  private JTextFieldPad txtFoneCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 12, 0);
  private JTextFieldPad txtRamalCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 8, 0);
  private JTextFieldPad txtFaxCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 8, 0);
  private JTextFieldPad txtCelCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 8, 0);
  private JTextFieldPad txtNatCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 30, 0);
  private JTextFieldPad txtUFNatCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 2, 0);
  private JTextFieldPad txtTempoResCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 20, 0);
  private JTextFieldPad txtDDDCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 4, 0);
  private JTextFieldPad txtDDDFaxCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 4, 0);
  private JTextFieldPad txtDDDCelCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 4, 0);
  private JTextFieldPad txtPaiCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 50, 0);
  private JTextFieldPad txtRgPaiCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 10, 0);
  private JTextFieldPad txtSSPPaiCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 10, 0);
  private JTextFieldPad txtMaeCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 50, 0);
  private JTextFieldPad txtRgMaeCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 10, 0);
  private JTextFieldPad txtSSPMaeCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 10, 0);
  private JTextFieldPad txtEmpTrabCli = new JTextFieldPad(JTextFieldPad.TP_STRING, 10, 0);


  private JLabel lbNatCli = null;
  private JLabel lbUfNatCli = null;
  private JLabel lbTempoResCli = null;
  private ListaCampos lcTipoCred = new ListaCampos(this,"TR");
  private ListaCampos lcTipoCli = new ListaCampos(this,"TI");
  private ListaCampos lcFicha = new ListaCampos(this,"CC");
  
  private Navegador navFicha = new Navegador(true);
  
  public FCredCli() {
    setTitulo("Ficha cadastral/Cr�dito por cliente");
    setAtribos(50, 10, 600, 520);

    lcFicha.setMaster(lcCampos);
   
    lcTipoCli.add(new GuardaCampo( txtCodTipoCli, "CodTipoCli", "C�d.tp.cli.", ListaCampos.DB_PK, true));
    lcTipoCli.add(new GuardaCampo( txtDescTipoCli, "DescTipoCli", "Descri��o do tipo de cliente", ListaCampos.DB_SI, false));
    lcTipoCli.montaSql(false, "TIPOCLI", "VD");    
    lcTipoCli.setQueryCommit(false);
    lcTipoCli.setReadOnly(true);
    txtCodTipoCli.setTabelaExterna(lcTipoCli);

    lcTipoCred.add(new GuardaCampo( txtCodTpCred, "CodTpCred", "C�d.tp.cred.", ListaCampos.DB_PK, true));
    lcTipoCred.add(new GuardaCampo( txtDescTpCred, "DescTpCred", "Descri��o do tipo de cr�dito", ListaCampos.DB_SI, false));
    lcTipoCred.add(new GuardaCampo( txtVlrTpCred, "VlrTpCred", "Valor", ListaCampos.DB_SI, false));
    lcTipoCred.montaSql(false, "TIPOCRED", "FN");    
    lcTipoCred.setQueryCommit(false);
    lcTipoCred.setReadOnly(true);
    txtCodTpCred.setTabelaExterna(lcTipoCred);

	setPainel(pinGeral);
	
	lcCampos.addCarregaListener(this);
	
	adicTab("Cr�dito", pinGeral);
    adicCampo(txtCodCli, 7, 20, 70, 20,"CodCli","C�d.cli.", ListaCampos.DB_PK, true);
    adicCampo(txtRazCli, 80, 20, 257, 20,"RazCli","Raz�o social do cliente", ListaCampos.DB_SI, false);
	adicCampoInvisivel(txtCodTipoCli, "CodTipoCli","C�d.tp.cli", ListaCampos.DB_FK, txtDescTipoCli,false);
    adicDescFK(txtDescTipoCli, 340, 20, 130, 20, "DescTipoCli", "Desc. tipo de cliente");
    adicCampo(txtDataCli, 473, 20, 95, 20,"DataCli","Cadastro", ListaCampos.DB_SI, false);

    adicCampo(txtCodTpCred, 7, 60, 70, 20,"CodTpCred","C�d.tp.cred", ListaCampos.DB_FK, txtDescTpCred, true);
    adicDescFK(txtDescTpCred, 80, 60, 212, 20, "DescTpCred", "Descri��o do cr�dito");
    adicDescFK(txtVlrTpCred, 295, 60, 107, 20, "VlrTpCred", "Valor");
    
    adicCampo(txtDtIniTr, 405 , 60, 80, 20,"DtIniTr","Dt.ab.cr�d.", ListaCampos.DB_SI, true);
    adicCampo(txtDtVencto, 488, 60, 80, 20,"DtVenctoTr","Vencimento", ListaCampos.DB_SI,true);

	
  	adicCampo(txtEndCli, 7, 100, 330, 20, "EndCli", "Endere�o", ListaCampos.DB_SI, false);
  	adicCampo(txtNumCli, 340, 100, 77, 20, "NumCli", "Num.", ListaCampos.DB_SI, false);
  	adicCampo(txtComplCli, 420, 100, 149, 20, "ComplCli", "Compl.", ListaCampos.DB_SI, false);

  	adicCampo(txtBairCli, 7, 140, 210, 20, "BairCli", "Bairro", ListaCampos.DB_SI, false);
  	adicCampo(txtCidCli, 220, 140, 210, 20, "CidCli", "Cidade", ListaCampos.DB_SI, false);
  	adicCampo(txtCepCli, 433, 140, 80, 20, "CepCli", "Cep", ListaCampos.DB_SI, false);
  	adicCampo(txtUFCli, 516, 140, 52, 20, "UFCli", "UF", ListaCampos.DB_SI, false);
  	
  	adicCampo(txtDDDCli, 7, 180, 40, 20, "DDDCli", "DDD", ListaCampos.DB_SI, false);
  	adicCampo(txtFoneCli, 50, 180, 97, 20, "FoneCli", "Telefone", ListaCampos.DB_SI, false);
  	adicCampo(txtRamalCli, 150, 180, 47, 20, "RamalCli", "Ramal", ListaCampos.DB_SI, false); 	

  	adicCampo(txtDDDFaxCli, 200, 180, 37, 20, "DDDFaxCli", "DDD", ListaCampos.DB_SI, false);
  	adicCampo(txtFaxCli, 240, 180, 97, 20, "FaxCli", "Fax", ListaCampos.DB_SI, false);

  	adicCampo(txtDDDCelCli, 340, 180,37, 20, "DDDCelCli", "DDD", ListaCampos.DB_SI, false);
  	adicCampo(txtCelCli, 380, 180, 100, 20, "CelCli", "Celular",ListaCampos.DB_SI, false);
		


  	
  	
  	lbNatCli = adicCampo(txtNatCli, 7, 220, 200, 20, "NatCli", "Naturalidade",ListaCampos.DB_SI, false);
  	lbUfNatCli = adicCampo(txtUFNatCli, 210, 220, 52, 20, "UfNatCli", "Uf Natur.",ListaCampos.DB_SI, false);
  	lbTempoResCli = adicCampo(txtTempoResCli, 265, 220, 160, 20, "TempoResCli", "Tempo de resid�ncia.",ListaCampos.DB_SI, false);
	
	setListaCampos( true, "CLIENTE", "VD");
	lcCampos.setPodeIns(false);
	lcCampos.setPodeExc(false);
    lcCampos.setQueryInsert(false);
        
      
    
    
    
    
    
    
    

	setPainel(pinFicha);
	adicTab("Ficha cadastral", pnFicha);

	setListaCampos(lcFicha);
    setNavegador(navFicha);
    pnFicha.add(pinRodFicha, BorderLayout.SOUTH);
    pnFicha.add(pinFicha, BorderLayout.CENTER);

    
    pinRodFicha.adic(navFicha,0,50,270,25);
   


    adicCampoInvisivel(txtCodCli,"codcli","CodCli",ListaCampos.DB_PF,true);
    adicCampo(txtPaiCli, 7, 20, 80, 20, "PaiCli", "Nome do pai", ListaCampos.DB_SI, false);
    
    
    
    
    setListaCampos( false, "CLICOMPL", "VD");
	lcFicha.setPodeIns(false);
	lcFicha.setPodeExc(false);
    lcFicha.setQueryInsert(false);

     
    
    
    
    
    habCampos(false);
	
    
    
    
  }
  
  private void habCampos(boolean hab) {
  	txtNatCli.setVisible(hab);
  	txtUFNatCli.setVisible(hab);
  	txtTempoResCli.setVisible(hab);
  	lbNatCli.setVisible(hab);
  	lbUfNatCli.setVisible(hab);
  	lbTempoResCli.setVisible(hab);
  }
  
  public void afterCarrega(CarregaEvent cevt) {
  
  	if (txtDtIniTr.getVlrString().equals("")){
  		txtDtIniTr.setVlrDate(new Date());
  	}
  	
    habCampos(ehPessoaFisica());
  
  }
  
  private boolean ehPessoaFisica(){
	String sSQL = null;
  	ResultSet rs = null;
  	PreparedStatement ps = null;
  	boolean bReturn = false;
  	
	try {
		sSQL = "SELECT PESSOACLI FROM VDCLIENTE WHERE CODEMP=? AND CODFILIAL=? AND CODCLI=?";
		ps = con.prepareStatement(sSQL);
		ps.setInt(1,Aplicativo.iCodEmp);
		ps.setInt(2,ListaCampos.getMasterFilial("VDCLIENTE"));
		ps.setInt(3,txtCodCli.getVlrInteger().intValue());

		rs = ps.executeQuery();
		if (rs.next()) {
			if (rs.getString(1).equals("F"))
			   bReturn = true;
		}
		rs.close();
		ps.close();
		if (!con.getAutoCommit())
			con.commit();
	}
	catch (SQLException e) {
		Funcoes.mensagemErro(this,"N�o foi poss�vel carregar pessoa cliente!\n"+e.getMessage());
	}
	finally {
		rs = null;
		ps = null;
		sSQL = null;
	}  	
  	return bReturn;
  }
  
  public void beforeCarrega(CarregaEvent cevt) {}
  
  public void execShow(Connection cn) {
    lcTipoCli.setConexao(cn);
    lcTipoCred.setConexao(cn);
    super.execShow(cn);
  }        
}

/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)DLEditaRec.java <BR>
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
 */

package org.freedom.modulos.std;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;

public class DLEditaRec extends FFDialogo implements CarregaListener {
  private JTextFieldPad txtCodCli = new JTextFieldPad(JTextFieldPad.TP_INTEGER,10,0);
  private JTextFieldPad txtRazCli = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodBanco = new JTextFieldPad(JTextFieldPad.TP_STRING,3,0);
  private JTextFieldFK txtDescBanco = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodConta = new JTextFieldPad(JTextFieldPad.TP_STRING,10,0);
  private JTextFieldPad txtDescConta = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodPlan = new JTextFieldPad(JTextFieldPad.TP_STRING,13,0);
  private JTextFieldPad txtDescPlan = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodCC = new JTextFieldPad(JTextFieldPad.TP_STRING,19,0);
  private JTextFieldPad txtAnoCC = new JTextFieldPad(JTextFieldPad.TP_INTEGER,4,0);
  private JTextFieldFK  txtSiglaCC = new JTextFieldFK(JTextFieldPad.TP_STRING,10,0);
  private JTextFieldFK  txtDescCC = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtDoc = new JTextFieldPad(JTextFieldPad.TP_STRING,10,0);
  private JTextFieldPad txtDtEmis = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtDtVenc = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtVlrJuros = new JTextFieldPad(JTextFieldPad.TP_NUMERIC,15,2);
  private JTextFieldPad txtVlrDesc = new JTextFieldPad(JTextFieldPad.TP_NUMERIC,15,2);
  private JTextFieldPad txtVlrParc = new JTextFieldPad(JTextFieldPad.TP_NUMERIC,15,2);
  private JTextFieldPad txtObs = new JTextFieldPad(JTextFieldPad.TP_STRING,250,0);
  private ListaCampos lcBanco = new ListaCampos(this);
  private ListaCampos lcConta = new ListaCampos(this);
  private ListaCampos lcPlan = new ListaCampos(this);
  private ListaCampos lcCC = new ListaCampos(this);
  private Connection con = null;
  public DLEditaRec(Component cOrig) {
  	super(cOrig);
    setTitulo("Editar");
    setAtribos(360,450);
    
    

    lcBanco.add(new GuardaCampo( txtCodBanco,"CodBanco", "C�d.banco",ListaCampos.DB_PK, false));
    lcBanco.add(new GuardaCampo( txtDescBanco,"NomeBanco", "Nome do banco", ListaCampos.DB_SI, false));
    lcBanco.montaSql(false, "BANCO", "FN");
    lcBanco.setReadOnly(true);
    txtCodBanco.setTabelaExterna(lcBanco);
    txtCodBanco.setFK(true);
    txtCodBanco.setNomeCampo("CodBanco");

    lcConta.add(new GuardaCampo( txtCodConta, "NumConta", "N� Conta", ListaCampos.DB_PK, false));
    lcConta.add(new GuardaCampo( txtDescConta, "DescConta", "Descri��o da conta",  ListaCampos.DB_SI,false));
    lcConta.montaSql(false, "CONTA", "FN");
    lcConta.setReadOnly(true);
    txtCodConta.setTabelaExterna(lcConta);
    txtCodConta.setFK(true);
    txtCodConta.setNomeCampo("NumConta");

    lcPlan.add(new GuardaCampo( txtCodPlan, "CodPlan", "C�d.plan.",  ListaCampos.DB_PK, false));
    lcPlan.add(new GuardaCampo( txtDescPlan, "DescPlan", "Descri��o do planejamento",  ListaCampos.DB_SI,false));
    lcPlan.setWhereAdic("TIPOPLAN = 'R' AND NIVELPLAN = 6");
    lcPlan.montaSql(false, "PLANEJAMENTO", "FN");
    lcPlan.setReadOnly(true);
    txtCodPlan.setTabelaExterna(lcPlan);
    txtCodPlan.setFK(true);
    txtCodPlan.setNomeCampo("CodPlan");

	lcCC.add(new GuardaCampo( txtCodCC, "CodCC", "C�d.c.c.",  ListaCampos.DB_PK,false));
	lcCC.add(new GuardaCampo( txtSiglaCC, "SiglaCC", "Sigla c.c.",  ListaCampos.DB_SI,false));
	lcCC.add(new GuardaCampo( txtDescCC, "DescCC", "Descri��o do centro de custos",  ListaCampos.DB_SI,false));
	lcCC.add(new GuardaCampo( txtAnoCC, "AnoCC", "Ano-Base",  ListaCampos.DB_PK,false));
	lcCC.setReadOnly(true);
	lcCC.setQueryCommit(false);
	lcCC.setWhereAdic("NIVELCC=10");
	lcCC.montaSql(false, "CC", "FN");    
	txtCodCC.setTabelaExterna(lcCC);
	txtCodCC.setFK(true);
	txtCodCC.setNomeCampo("CodCC");
	txtAnoCC.setTabelaExterna(lcCC);
	txtAnoCC.setFK(true);
	txtAnoCC.setNomeCampo("AnoCC");

    txtCodCli.setAtivo(false);
    txtRazCli.setAtivo(false);
    txtDescConta.setAtivo(false);
    txtDescPlan.setAtivo(false);
    txtDtEmis.setAtivo(false);
    txtVlrParc.setAtivo(false);
    
    adic(new JLabel("C�d.cli."),7,0,250,20);
    adic(txtCodCli,7,20,80,20);
    adic(new JLabel("Raz�o social do cliente"),90,0,250,20);
    adic(txtRazCli,90,20,200,20);
    adic(new JLabel("C�d.banco"),7,40,250,20);
    adic(txtCodBanco,7,60,80,20);
    adic(new JLabel("Descri��o do banco"),90,40,250,20);
    adic(txtDescBanco,90,60,200,20);
    adic(new JLabel("N�conta"),7,80,250,20);
    adic(txtCodConta,7,100,80,20);
    adic(new JLabel("Descri��o da conta"),90,80,250,20);
    adic(txtDescConta,90,100,200,20);
    adic(new JLabel("C�d.catg."),7,120,250,20);
    adic(txtCodPlan,7,140,100,20);
    adic(new JLabel("Descri��o da categoria"),110,120,250,20);
    adic(txtDescPlan,110,140,200,20);
	adic(new JLabel("C�d.c.c."),7,160,250,20);
	adic(txtCodCC,7,180,100,20);
	adic(new JLabel("Descri��o do centro de custo"),110,160,250,20);
	adic(txtDescCC,110,180,200,20);
    adic(new JLabel("Doc."),7,200,110,20);
    adic(txtDoc,7,220,110,20);
    adic(new JLabel("Emiss�o"),120,200,107,20);
    adic(txtDtEmis,120,220,107,20);
    adic(new JLabel("Vencimento"),230,200,110,20);
    adic(txtDtVenc,230,220,110,20);
    adic(new JLabel("Vlr.juros."),7,240,110,20);
    adic(txtVlrJuros,7,260,110,20);
    adic(new JLabel("Vlr.desc."),120,240,107,20);
    adic(txtVlrDesc,120,260,107,20);
    adic(new JLabel("Vlr.parcela"),230,240,110,20);
    adic(txtVlrParc,230,260,110,20);
    adic(new JLabel("Observa��es"),7,280,240,20);
    adic(txtObs,7,300,333,20);
    
    lcCC.addCarregaListener(this);
  }
  public void setValores(String[] sVals) {
    txtCodCli.setVlrString(sVals[0]);
    txtRazCli.setVlrString(sVals[1]);
    txtCodConta.setVlrString(sVals[2]);
    txtCodPlan.setVlrString(sVals[3]);
	txtCodCC.setVlrString(sVals[4]);
    txtDoc.setVlrString(sVals[5]);
    txtDtEmis.setVlrString(sVals[6]);
    txtDtVenc.setVlrString(sVals[7]);
    txtVlrJuros.setVlrString(sVals[8]);
    txtVlrDesc.setVlrString(sVals[9]);
    txtVlrParc.setVlrString(sVals[10]);
    txtObs.setVlrString(sVals[11]);
    txtCodBanco.setVlrString(sVals[12]);
  }
  public String[] getValores() {
    String[] sRetorno = new String[9];
    sRetorno[0] = txtCodConta.getVlrString();
    sRetorno[1] = txtCodPlan.getVlrString();
	sRetorno[2] = txtCodCC.getVlrString();
    sRetorno[3] = txtDoc.getVlrString();
    sRetorno[4] = txtVlrJuros.getVlrString();
    sRetorno[5] = txtVlrDesc.getVlrString();
    sRetorno[6] = txtDtVenc.getVlrString();
    sRetorno[7] = txtObs.getVlrString();
    sRetorno[8] = txtCodBanco.getVlrString();
    return sRetorno;
  }
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btOK) {
      if (txtDtVenc.getVlrString().length() < 10) {
		Funcoes.mensagemInforma(this,"Data do vencimento � requerido!");
      }
      else {
        super.actionPerformed(evt);
      }
    }
    else {
      super.actionPerformed(evt);
    }
  }
  private int buscaAnoBaseCC() {
	int iRet = 0;
	String sSQL = "SELECT ANOCENTROCUSTO FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		ps = con.prepareStatement(sSQL);
		ps.setInt(1,Aplicativo.iCodEmp);
		ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
		rs = ps.executeQuery();
		if (rs.next())
			iRet = rs.getInt("ANOCENTROCUSTO");
		rs.close();
		ps.close();
		if (!con.getAutoCommit()) {
			con.commit();
		}
	}
	catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar o ano-base para o centro de custo.\n"+err.getMessage());
	}
	finally {
		sSQL = null;
		rs = null;
		ps = null;
	}
	return iRet;
  }
  public void beforeCarrega(CarregaEvent cevt) {
	if (cevt.getListaCampos() == lcCC && txtAnoCC.getVlrInteger().intValue() == 0) {
		txtAnoCC.setVlrInteger(new Integer(buscaAnoBaseCC()));
	}
  }
  public void afterCarrega(CarregaEvent cevt) {
  }
  public void setConexao(Connection cn) {
	con = cn;
    lcConta.setConexao(cn);
    lcConta.carregaDados();
    lcPlan.setConexao(cn);
    lcPlan.carregaDados();
	lcCC.setConexao(cn);
	lcCC.carregaDados();
    lcBanco.setConexao(cn);
    lcBanco.carregaDados();
  }
}

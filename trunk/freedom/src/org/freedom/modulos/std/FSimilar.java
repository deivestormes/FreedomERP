/**
 * @version 24/02/2004 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez<BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FSimilar.java <BR>
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;

import org.freedom.acao.PostEvent;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FDados;

public class FSimilar extends FDados implements ActionListener{
	private JTextFieldPad txtRefProdSim = new JTextFieldPad(18);
	private JTextFieldPad txtCodProd = new JTextFieldPad();
	private JTextFieldPad txtRefProd = new JTextFieldPad();
	private JTextFieldPad txtRefProdSimFK = new JTextFieldPad();
	private JTextFieldFK txtDescProd = new JTextFieldFK();
	private ListaCampos lcProd = new ListaCampos(this,"PD");
	private ListaCampos lcProd2 = new ListaCampos(this,"PD");	
	private boolean[] bPrefs = null;
	
	public FSimilar() {
		setTitulo("Cadastro de Similaridades");
		setAtribos( 30, 30, 570, 170);
		txtCodProd.setTipo(JTextFieldPad.TP_INTEGER,8,0);
		txtRefProd.setTipo(JTextFieldPad.TP_STRING,13,0);    
		txtDescProd.setTipo(JTextFieldPad.TP_STRING,50,0); 		
		lcProd.add(new GuardaCampo( txtCodProd, 7, 100, 80, 20, "CodProd", "C�d.prod.", true, false, txtDescProd, JTextFieldPad.TP_INTEGER,false),"txtCodProdx");
		lcProd.add(new GuardaCampo( txtDescProd, 90, 100, 207, 20, "DescProd", "Descri��o do produto", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescProdx");
		lcProd.add(new GuardaCampo( txtRefProd, 90, 100, 207, 20, "RefProd", "Refer�ncia do produto", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescProdx");		
		lcProd.montaSql(false, "PRODUTO", "EQ");
		lcProd.setQueryCommit(false);
		lcProd.setReadOnly(true);
		txtCodProd.setTabelaExterna(lcProd);
		txtCodProd.setNomeCampo("CodProd");
	
		//FK do produto (*Somente em caso de refer�ncias este listaCampos 
		//Trabalha como gatilho para o listaCampos de produtos, assim
		//carregando o c�digo do produto que ser� armazenado no Banco)
		lcProd2.add(new GuardaCampo( txtRefProd, 90, 100, 207, 20, "RefProd", "Refer�ncia do produto", true, false, txtDescProd, JTextFieldPad.TP_STRING,false),"txtDescProdx");
		lcProd2.add(new GuardaCampo( txtDescProd, 90, 100, 207, 20, "DescProd", "Descri��o do produto", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescProdx");
		lcProd2.add(new GuardaCampo( txtCodProd, 7, 100, 80, 20, "CodProd", "C�d.prod.", false, false, null, JTextFieldPad.TP_INTEGER,false),"txtCodProdx");
		txtRefProd.setNomeCampo("RefProd");
		txtRefProd.setListaCampos(lcCampos);
		lcProd2.setWhereAdic("ATIVOPROD='S'");
		lcProd2.montaSql(false, "PRODUTO", "EQ");
		lcProd2.setQueryCommit(false);
		lcProd2.setReadOnly(true);
		txtRefProd.setTabelaExterna(lcProd2);
	}

	private void montaTela() {

		adicCampo(txtRefProdSim, 7, 20, 120, 20,"RefProdSim","C�d.sim.",JTextFieldPad.TP_STRING,18,0,true,false,null,true);
		adicCampo(txtRefProdSimFK, 7,60,120, 20,"RefProdSimFK","C�d.sim.",JTextFieldPad.TP_STRING,18,0,false,false,null,false);
	
		if (bPrefs[0]) {
			txtRefProdSim.setBuscaAdic(new DLBuscaProd(this,con,"REFPROD"),true);
			txtRefProd.setBuscaAdic(new DLBuscaProd(this,con,"REFPROD"),false);
			adicCampoInvisivel(txtCodProd,"CodProd","C�d.prod.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescProd,false);
			adicCampoInvisivel(txtRefProd,"RefProd","Ref.prod.",JTextFieldPad.TP_STRING,13,0,false,true,null,false);			adic(new JLabel("Ref.Prod."), 130, 0, 100, 20);
			adic(txtRefProd, 130, 20, 100, 20);
		}
		else {
			txtRefProdSim.setBuscaAdic(new DLBuscaProd(this,con,"CODPROD"),true);			
			txtCodProd.setBuscaAdic(new DLBuscaProd(this,con,"CODPROD"),false);
			adicCampo(txtCodProd, 130, 20, 100, 20,"CodProd","C�d.prod.",JTextFieldPad.TP_INTEGER,8,0,false,true,txtDescProd,false);
		}
		adicDescFK(txtDescProd, 233, 20, 300, 20, "DescProd", "Descri��o do produto", JTextFieldPad.TP_STRING, 50, 0);
		
		setListaCampos( true, "SIMILAR", "EQ");
		btImp.addActionListener(this);
		btPrevimp.addActionListener(this);
		lcCampos.setQueryInsert(false);
		lcCampos.addPostListener(this);
	}
	public void keyPressed(KeyEvent kevt) {
		if (kevt.getKeyCode() == KeyEvent.VK_ENTER) {
			if (kevt.getSource() == txtRefProdSimFK) {//Como este � o ultimo campo da tela executa-se o post.
				if ( (lcCampos.getStatus() == ListaCampos.LCS_INSERT) || (lcCampos.getStatus() == ListaCampos.LCS_EDIT)) {				
				    lcCampos.post();
				}
			}
		}
		super.keyPressed(kevt);
	}
	
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == btPrevimp) {
			imprimir(true);
		}
		else if (evt.getSource() == btImp) 
			imprimir(false);
		super.actionPerformed(evt);
	}

	private boolean[] prefs() {
		boolean[] bRetorno = new boolean[1];
		String sSQL = "SELECT USAREFPROD FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			bRetorno[0] = false;
			ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
			rs = ps.executeQuery();
			if (rs.next()) {
				bRetorno[0]=rs.getString("UsaRefProd").trim().equals("S");
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
	
	private void imprimir(boolean bVisualizar) {
		ImprimeOS imp = new ImprimeOS("",con);
		int linPag = imp.verifLinPag()-1;
		imp.montaCab();
		imp.setTitulo("Relat�rio de Similaridades");
		DLRSimilar dl = new DLRSimilar();
		dl.setVisible(true);
		if (dl.OK == false) {
			dl.dispose();
			return;
		}
		String sSQL = "SELECT S.CODPROD,P.REFPROD,S.REFPRODSIM,P.DESCPROD "+
		     "FROM EQPRODUTO P, EQSIMILAR S WHERE P.CODEMP=S.CODEMPPD AND " +
		     "P.CODFILIAL=S.CODFILIALPD AND P.CODPROD=S.CODPROD AND "+
			 "S.CODEMP=? AND S.CODFILIAL=? ORDER BY "+dl.getValor();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("EQSIMILAR"));
			rs = ps.executeQuery();
			imp.limpaPags();
			while ( rs.next() ) {
				if (imp.pRow()==0) {
					imp.impCab(136);
					imp.say(imp.pRow()+0,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,6,"C�d.prod.");
					imp.say(imp.pRow()+0,26,"Refer�ncia");
					imp.say(imp.pRow()+0,40,"Descri��o do produto");
					imp.say(imp.pRow()+0,92,"C�d.similar");
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,0,Funcoes.replicate("-",136));
				}
				imp.say(imp.pRow()+1,0,""+imp.comprimido());
				imp.say(imp.pRow()+0,2,Funcoes.alinhaDir(rs.getString("Codprod"),13));
				imp.say(imp.pRow()+0,26,rs.getString("Refprod"));
				imp.say(imp.pRow()+0,40,rs.getString("Descprod"));
				imp.say(imp.pRow()+0,92,rs.getString("refprodsim"));
				if (imp.pRow()>=linPag) {
					imp.incPags();
					imp.eject();
				}
			}
			
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,0,Funcoes.replicate("=",136));
			imp.eject();
			
			imp.fechaGravacao();
			
//      rs.close();
//      ps.close();
			if (!con.getAutoCommit())
				con.commit();
			dl.dispose();
		}  
		catch ( SQLException err ) {
			Funcoes.mensagemErro(this,"Erro consulta tabela de similaridades!"+err.getMessage());      
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
		bPrefs = prefs(); //Carrega as prefer�ncias
		montaTela();
		lcProd.setConexao(cn);
		lcProd2.setConexao(cn);
		super.execShow(cn);
	}
	public boolean achaSimilarFK(){
	  boolean bRetorno = false;
	  String sSQL = "SELECT REFPRODSIM FROM EQSIMILAR WHERE CODEMP=? AND CODFILIAL=? AND REFPRODSIM=? ";
	  try {
	  	PreparedStatement ps = con.prepareStatement(sSQL);
	  	ps.setInt(1,Aplicativo.iCodEmp);
	  	ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
	  	ps.setString(3,txtRefProdSimFK.getText().trim());
	  	ResultSet rs = ps.executeQuery();
	  	if (rs.next())
	  	  bRetorno = true;
	  	rs.close();
	  	ps.close();
	  }
	  catch (SQLException err) {
	  	Funcoes.mensagemErro(this,"Erro ao buscar similaridade.\n"+err.getMessage());
	  }  
	  return bRetorno;
	}
	public boolean achaSimilar(){
		boolean bRetorno = false;
		String sSQL = "SELECT REFPRODSIM FROM EQSIMILAR WHERE CODEMP=? AND CODFILIAL=? AND REFPRODSIM=? ";
		try {
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
			ps.setString(3,txtRefProdSim.getText().trim());
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				bRetorno = true;
			rs.close();
			ps.close();
		}
		catch (SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao buscar similaridade.\n"+err.getMessage());
		}  
		return bRetorno;
	}
	
	public boolean gravaSimilar() {
      boolean bRetorno = true;
	  String sSQL = "";      
	  if (txtRefProdSimFK.getText().trim().equals("")){
        if (!achaSimilar())
	  	  txtRefProdSimFK.setText(txtRefProdSim.getText());
        else { 
          Funcoes.mensagemInforma(this,"Similaridade j� existe!");
          bRetorno = false;
        }  
      }
	  else {
	    sSQL = "INSERT INTO EQSIMILAR (CODEMP,CODFILIAL,REFPRODSIM,REFPRODSIMFK) VALUES(?,?,?,?)";		
	  
        try {
      	  PreparedStatement ps = con.prepareStatement(sSQL);		
      	  ps.setInt(1,Aplicativo.iCodEmp);
      	  ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
      	  ps.setString(3,txtRefProdSimFK.getText().trim());
      	  ps.setString(4,txtRefProdSimFK.getText().trim());
      	  ps.executeUpdate();
      	  ps.close();
      	  if (!con.getAutoCommit())
      		con.commit();      	
        }
        catch (SQLException err) {
      	  Funcoes.mensagemErro(this,"Erro ao gravar  similaridade circular.\n"+err.getMessage());
        }
	  }  
      return bRetorno;
	}

	public void beforePost(PostEvent pevt) { 
		if (pevt.getListaCampos() == lcCampos) {
          if (!achaSimilarFK()) {
            if (!gravaSimilar())
              pevt.cancela();	    
          }
		}
	}
}

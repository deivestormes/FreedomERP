/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)DLFechaDistrib.java <BR>
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

package org.freedom.modulos.pcp;
import java.awt.Component;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;

public class DLFechaDistrib extends FFDialogo {
  private JTextFieldPad txtQtdDist = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,15,Aplicativo.casasDec);
  private JTextFieldPad txtLote = new JTextFieldPad(JTextFieldPad.TP_STRING,13,0);
  private JTextFieldPad txtSeqDist = new JTextFieldPad(JTextFieldPad.TP_INTEGER,10,0);
  private JTextFieldPad txtCodProd = new JTextFieldPad(JTextFieldPad.TP_INTEGER,15,0);
  private JTextFieldPad txtDescProd = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtDtFabProd = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtDiasValid = new JTextFieldPad(JTextFieldPad.TP_DATE,5,0);
 
  Date dtVenctoLote = null;
 
  
  public DLFechaDistrib(Component cOrig,int iSeqDist, int iCodProd,String sDescProd, float ftQtdade) {
  	super(cOrig);
    setTitulo("Quantidade");
    setAtribos(310,220);
    
   
    adic(new JLabelPad("C�d.Prod"),7,10,80,20);
    adic(txtCodProd,7,30,80,20);
    adic(new JLabelPad("Descri��o da estrutura"),90,10,180,20);
    adic(txtDescProd,90,30,190,20);
    adic(new JLabelPad("Seq.dist."),7,50,80,20);
    adic(txtSeqDist,7,70,80,20);
    adic(new JLabelPad("Quantidade"),90,50,90,20);
    adic(txtQtdDist,90,70,90,20);
    adic(new JLabelPad("Lote"),183,50,80,20);
    adic(txtLote,183,70,97,20);
    adic(new JLabelPad("Validade"),183,90,80,20);
    adic(txtDiasValid,183,110,97,20);
    
    txtCodProd.setVlrInteger(new Integer(iCodProd));
    txtDescProd.setVlrString(sDescProd);
    txtSeqDist.setVlrInteger(new Integer(iSeqDist));
    txtQtdDist.setVlrBigDecimal(new BigDecimal(ftQtdade));
    
    txtCodProd.setAtivo(false);
    txtDescProd.setAtivo(false);
    txtSeqDist.setAtivo(false);
    txtLote.setAtivo(false);
    txtDiasValid.setAtivo(false);
  }
  
  public void setConexao(Connection cn) {
  	 super.setConexao(cn);
     if(getUsaLote().equals("S")){
    	txtLote.setAtivo(true);
     	getModLote(txtCodProd.getVlrInteger().intValue(),txtSeqDist.getVlrInteger().intValue());
     }
     else
     	 txtLote.setAtivo(false);
  }
  
  public Object[] getValor() {
    Object[] oRetorno = new Object[2]; 
    oRetorno[0] = txtQtdDist.getVlrBigDecimal();
    oRetorno[1] = txtLote.getVlrString();
    return oRetorno;
  }
  

  private String buscaLote(int iCodProd,int iSeqEst,boolean bSaldoPos) {
	String sRet = "";
	String sSQL = "SELECT MIN(L.CODLOTE) FROM EQLOTE L WHERE "
				+ "L.CODPROD=? AND L.CODFILIAL=? "
				+(bSaldoPos?"AND L.SLDLIQLOTE>0 ":"")
				+ "AND L.CODEMP=? AND L.VENCTOLOTE = "
				+ "(SELECT MIN(VENCTOLOTE) FROM EQLOTE LS WHERE LS.CODPROD=L.CODPROD "
				+ "AND LS.CODFILIAL=L.CODFILIAL AND LS.CODEMP=L.CODEMP AND LS.SLDLIQLOTE>0 "
				+ "AND VENCTOLOTE >= CAST('today' AS DATE)" + ")";
	try {
		System.out.println(sSQL);
		PreparedStatement ps = con.prepareStatement(sSQL);
		
		ps.setInt(1, iCodProd);
		ps.setInt(2, ListaCampos.getMasterFilial("EQLOTE"));
		ps.setInt(3, Aplicativo.iCodEmp);
						
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			String sCodLote = rs.getString(1);
			if (sCodLote != null) {
				sRet = sCodLote.trim();
			}
		}
		rs.close();
		ps.close();
	} catch (SQLException err) {
		Funcoes.mensagemErro(this, "Erro ao buscar lote!\n" + err);
	}
	return sRet;
}
  
  public String getUsaLote(){
	String sUsaLote = "";
	String sSQL = "SELECT CLOTEPROD FROM EQPRODUTO WHERE CODEMP=? AND CODFILIAL=? AND CODPROD=?";
	try {
		PreparedStatement ps = con.prepareStatement(sSQL);
		ps.setInt(1, Aplicativo.iCodEmp);
		ps.setInt(2, ListaCampos.getMasterFilial("EQPRODUTO"));
		ps.setInt(3, txtCodProd.getVlrInteger().intValue());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			sUsaLote = rs.getString(1);
		}
		rs.close();
		ps.close();
	}	
	catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar obrigatoriedade de lote no produto!\n",true,con,err);
	}
	return sUsaLote;
  }
  
  public boolean existeLote(String sCodLote, int iCodProd){
  	boolean bRet = false;
	String sSQL = "SELECT CODLOTE FROM EQLOTE WHERE CODEMP=? AND CODFILIAL=? AND CODPROD=? AND CODLOTE=?";
	try {
		PreparedStatement ps = con.prepareStatement(sSQL);
		ps.setInt(1, Aplicativo.iCodEmp);
		ps.setInt(2, ListaCampos.getMasterFilial("EQLOTE"));
		ps.setInt(3, iCodProd);
		ps.setString(4, sCodLote);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			bRet=true;
		}
		rs.close();
		ps.close();
	}	
	catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar existencia do lote!\n",true,con,err);
	}
  	return bRet;  	
  }

  public void getModLote(int iCodProd, int iSeqEst){
	int iDiasValid = 0;
	String sModLote = "";
	String sCodLote = "";
  	String sSQL = "SELECT E.CODMODLOTE, M.TXAMODLOTE, E.NRODIASVALID"
  				+ " FROM PPESTRUTURA E, EQMODLOTE M"
				+ " WHERE E.CODEMP=? AND E.CODFILIAL=? AND E.CODPROD=? AND E.SEQEST=?"
				+ " AND E.CODEMPML=M.CODEMP AND E.CODFILIALML=M.CODFILIAL AND E.CODMODLOTE=M.CODMODLOTE";
  				
	  	try {
			PreparedStatement ps = con.prepareStatement(sSQL);
						
			ps.setInt(1, Aplicativo.iCodEmp);
			ps.setInt(2, ListaCampos.getMasterFilial("EQLOTE"));
			ps.setInt(3, iCodProd);
			ps.setInt(4, iSeqEst);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				sCodLote = rs.getString(1);
				sModLote = rs.getString(2);
				iDiasValid = rs.getInt(3);
				
			}
			rs.close();
			ps.close();
	  	}
	  	catch (SQLException err) {
	  			Funcoes.mensagemErro(this, "Erro ao buscar lote!\n" + err);
		}
		   
	if(!(sCodLote.equals("")) && (getUsaLote().equals("S")) ){
		txtDtFabProd.setVlrDate(new Date());
		ObjetoModLote ObjMl = new ObjetoModLote();
		ObjMl.setTexto(sModLote);
		String sLote = ObjMl.getLote(new Integer(iCodProd),txtDtFabProd.getVlrDate(),con);  			
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(txtDtFabProd.getVlrDate());
		cal.add(GregorianCalendar.DAY_OF_YEAR,iDiasValid);
		dtVenctoLote = cal.getTime();	
		txtLote.setVlrString(sLote);
		txtDiasValid.setVlrDate(dtVenctoLote);
	}
  }
  public boolean gravaLote(){
	  int iCodProd = txtCodProd.getVlrInteger().intValue();
	  String sLote = txtLote.getVlrString().trim();
	  boolean bret = false;
	  if((!existeLote(sLote,iCodProd))){			
			txtLote.setVlrString(sLote);
			txtDiasValid.setVlrDate(dtVenctoLote);
			if(Funcoes.mensagemConfirma(null,"Deseja criar o lote "+sLote.trim()+" ?")==JOptionPane.YES_OPTION){
	  			String sSql = "INSERT INTO EQLOTE (CODEMP,CODFILIAL,CODPROD,CODLOTE,VENCTOLOTE) VALUES(?,?,?,?,?)";
	  			try {
	  				   PreparedStatement ps = con.prepareStatement(sSql); 
	  					   ps.setInt(1,Aplicativo.iCodEmp);
	  					   ps.setInt(2,ListaCampos.getMasterFilial("EQLOTE"));
	  					   ps.setInt(3,iCodProd);
	  					   ps.setString(4,sLote);
	  					   ps.setDate(5,Funcoes.dateToSQLDate(dtVenctoLote));
	  				   
	  				   if (ps.executeUpdate() == 0) {
	  					  Funcoes.mensagemInforma(this,"N�o foi poss�vel inserir registro na tabela de Lotes!");
	  				   }
	  				   if (!con.getAutoCommit())
	  				      con.commit();
	  				   bret = true;
	  			 }
	  			 catch (SQLException err) {
	  			 	Funcoes.mensagemErro(this,"Erro ao inserir registro na tabela de Lotes!\n"+err.getMessage(),true,con,err); 
	  			 }
	  	  	}
	  		else{
	  			txtLote.setVlrString(buscaLote(iCodProd,txtSeqDist.getVlrInteger().intValue(),true));
	  			txtDiasValid.setVlrString("");
	  		}
		}
		else {			
			Funcoes.mensagemInforma(null,"Lote j� cadastrado para o produto!");
			txtLote.setVlrString(buscaLote(iCodProd,txtSeqDist.getVlrInteger().intValue(),true));
			txtDiasValid.setVlrString("");
		}
	  return bret;
  	}
}

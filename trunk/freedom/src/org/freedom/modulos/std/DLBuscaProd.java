/**
 * @version 23/02/2004 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva/Anderson Sanchez <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)DLBuscaProd.java <BR>
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
 * Tela para busca de produtos por similaridade ou c�digos alternativos.
 */

package org.freedom.modulos.std;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.freedom.acao.TabelaSelEvent;
import org.freedom.acao.TabelaSelListener;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.DLF3;

public class DLBuscaProd extends DLF3 implements TabelaSelListener {
   private String sCol = null;
   private Vector vValsProd = new Vector();
   private String sSQL = "";
   public int iPadrao = 0;
   boolean bRet = false;
   public DLBuscaProd(Component cOrig,Connection con,String sCol) {
   	 super(cOrig);
   	 this.sCol = sCol;
   	 setConexao(con);
   	 
     setAtribos( 575, 260);
     
   	 tab.adicColuna("C�d.");
     tab.adicColuna("Ref.");    
     tab.adicColuna("Descri��o");
   	 tab.adicColuna("Saldo");   	  
   	 tab.setTamColuna(70,0);//c�digo.
   	 tab.setTamColuna(70,1);//Referencia. 
   	 tab.setTamColuna(300,2);
   	 tab.setTamColuna(90,5);   	 	 
   	 tab.addTabelaSelListener(this); 

   	 tab.addKeyListener(this);
   	 
   }
   public Object getValor() {
    return oRetVal;
  }
   public boolean setValor(Object oVal,String sTipo) { 
     
  	 if (sTipo.equals("similar")) {
   	 	sSQL = "SELECT SIM.CODPROD,PROD.REFPROD,PROD.DESCPROD,PROD.SLDPROD "+
		  	   "FROM EQPRODUTO PROD,EQITSIMILAR SIM "+
		          "WHERE  SIM.CODEMP = PROD.CODEMP AND SIM.CODFILIAL=PROD.CODFILIAL "+
		           "AND SIM.CODSIM = (SELECT SIM2.CODSIM FROM EQITSIMILAR SIM2 " +
		           "                   WHERE SIM2.CODEMP=PROD.CODEMP AND SIM2.CODFILIAL = PROD.CODFILIAL " +
		           "                   AND SIM2."+sCol+"=?) "+
		           "AND PROD.CODEMP = ? AND PROD.CODFILIAL = ? AND PROD.CODPROD=SIM.CODPROD";

   	 	setTitulo("Produtos similares � "+oVal.toString());
   	 }
   	 else {
   	 	sSQL = "SELECT ALT.CODPROD,ALT.REFPROD,PROD.DESCPROD,PROD.SLDPROD FROM eqcodaltprod ALT, EQPRODUTO PROD "+
		   " WHERE PROD.CODEMP = ALT.CODEMP AND PROD.CODFILIAL=ALT.codfilial AND PROD.CODPROD = ALT.CODPROD " +
		   " AND ALT.CODALTPROD = ? AND ALT.CODEMP=? AND ALT.CODFILIAL = ? ";

   	 	setTitulo("Produtos encontrados com o c�digo alternativo:"+oVal.toString());
   	 }
  	
      System.out.println(sSQL);
      try {
      	PreparedStatement ps = con.prepareStatement(sSQL);
      	String sVal = oVal.toString();
     	ps.setInt(2,Aplicativo.iCodEmp);
      	ps.setInt(3,ListaCampos.getMasterFilial("EQPRODUTO"));
      	ps.setString(1,sVal);

        tab.limpa();
        tab.removeAll();
      	vValsProd.clear();

      	ResultSet rs = ps.executeQuery();

      	int iCont = 0;
      	while (rs.next()) {
      	   bRet = true;      	   
      	   
      	   if(rs.getString(1).equals(sVal)) {
     	   	 iPadrao = iCont;
     	   }

      	   tab.adicLinha( new Object[] {
      	      rs.getString(1) != null ? rs.getString(1) : "",
      		  rs.getString(2) != null ? rs.getString(2) : "",
      		  rs.getString(3) != null ? rs.getString(3).trim() : "",
			  rs.getString(4) != null ? rs.getString(4) : "",
      	   });

      	   if (sCol.toUpperCase().equals("REFPROD")) {
      	   	 oRetVal = rs.getString(1) != null ? rs.getString(1) : ""; 
   	 	   }
   	 	   else{
   	 		 oRetVal = rs.getString(2) != null ? rs.getString(2) : "";
   	 	   }
      	   iCont++;
      	}
      	rs.close();
      	ps.close();
      	if (!con.getAutoCommit())
      		con.commit();
      	
    	if(bRet) {
      		tab.requestFocus();
      		tab.setLinhaSel(iPadrao); 
          	setVisible(true);      		
      	}
      	
      }
            
      catch (SQLException err) {
      	 Funcoes.mensagemErro(this,"Erro ao buscar c�digo auxiliar!\n"+err.getMessage());
      	 err.printStackTrace();
      }
      return bRet;
   }
   public void actionPerformed(ActionEvent evt) {
   	  super.actionPerformed(evt);
   }
   public void valorAlterado(TabelaSelEvent tsevt) {
    }

public void setValor(Object oVal) { }

public void keyPressed(KeyEvent kevt) {
    if ( kevt.getSource() == tab && kevt.getKeyCode() == KeyEvent.VK_ENTER) {        
      if (tab.getNumLinhas() > 0 ) { 
      	buscaValores();
        btOK.doClick();
      }    
    }
    else if (kevt.getKeyCode() == KeyEvent.VK_ESCAPE)
    	btCancel.doClick();

}   
public void buscaValores(){
	if (tab.getNumLinhas() > 0) {
		if (bRet) {	
  	 			if (sCol.toUpperCase().equals("REFPROD")) {
   	 				oRetVal = tab.getValueAt(tab.getLinhaSel(),1); 
	   	 		}
	   	 		else {
	   	 			oRetVal = tab.getValueAt(tab.getLinhaSel(),0);
	   	 		}   	 		    	
		 }
	 }    
}

};        

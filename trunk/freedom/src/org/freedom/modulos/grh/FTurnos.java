/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.grh <BR>
 * Classe: @(#)FTurnos.java <BR>
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
 * Tela de cadastro de turnos
 * 
 */

package org.freedom.modulos.grh;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Calendar;

import java.util.Date;
import java.util.Vector;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.FDados;
public class FTurnos extends FDados implements ActionListener {
  private JTextFieldPad txtCodTurno = new JTextFieldPad(10);
  private JTextFieldPad txtDescTurno = new JTextFieldPad(20);
  private JTextFieldPad txtNhsTurno = new JTextFieldPad(5);
  private JTextFieldPad txtHIniTurno = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtHIniIntTurno = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtHFimIntTurno = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtHFimTurno = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private Vector vTipoTurnoLab = new Vector();
  private Vector vTipoTurnoVal = new Vector();  
  private JRadioGroup rgTipoTurno = null;
  
  public FTurnos () {
    setTitulo("Cadastro de Turnos");
    setAtribos(50, 50, 457, 280);
	    
	    
	    Date dt1 = new Date();
	    dt1.setHours(8);
	    dt1.setMinutes(0);
	   
	    Date dt2 = new Date();
	    dt2.setHours(18);
	    dt2.setMinutes(0);
	   
	    Date dt3 = new Date();
	    dt3.setHours(12);
	    dt3.setMinutes(0);
	   
	    Date dt4 = new Date();
	    dt4.setHours(13);
	    dt4.setMinutes(30);
	   	/*
	    txtHIniTurno.setModel(new SpinnerDateModel(dt3,null,null,Calendar.MINUTE));
    	txtHIniTurno.setEditor(new JSpinner.DateEditor(txtHIniTurno,"kk:mm"));
    	
		txtHIniIntTurno.setModel(new SpinnerDateModel(dt3,null,null,Calendar.MINUTE));
    	txtHIniIntTurno.setEditor(new JSpinner.DateEditor(txtHIniIntTurno,"kk:mm"));
    	
    	txtHFimIntTurno.setModel(new SpinnerDateModel(dt4,null,null,Calendar.MINUTE));
    	txtHFimIntTurno.setEditor(new JSpinner.DateEditor(txtHFimIntTurno,"kk:mm"));
    	
    	txtHFimTurno.setModel(new SpinnerDateModel(dt2,null,null,Calendar.MINUTE));
    	txtHFimTurno.setEditor(new JSpinner.DateEditor(txtHFimTurno,"kk:mm"));
    	*/
    
	    adicCampo(txtCodTurno, 7, 20, 80, 20,"CodTurno","C�d.turno",JTextFieldPad.TP_INTEGER,5,0,true,false,null,true);
	    adicCampo(txtDescTurno, 90, 20, 220, 20,"DescTurno","Descri��o do turno",JTextFieldPad.TP_STRING,20,0,false,false,null,true);
	    adicCampo(txtNhsTurno, 313, 20, 120, 20,"NhsTurno","N� H.semanais",JTextFieldPad.TP_INTEGER,5,0,true,false,null,true);
	    adicCampo(txtHIniTurno, 7, 60, 160, 20,"HIniTurno","Hora do inic�o do turno",JTextFieldPad.TP_INTEGER,10,0,true,false,null,true);
	    adicCampo(txtHIniIntTurno, 7, 100, 160, 20,"HIniIntTurno","Hora do inic�o do intervalo",JTextFieldPad.TP_INTEGER,10,0,true,false,null,true);
	    adicCampo(txtHFimIntTurno, 7, 140, 160, 20,"HFimIntTurno","Hora do fim do intervalo",JTextFieldPad.TP_INTEGER,10,0,true,false,null,true);
	    adicCampo(txtHFimTurno, 7, 180, 160, 20,"HFimTurno","Hora do fim do turno",JTextFieldPad.TP_INTEGER,10,0,true,false,null,true);    	    
	    	   	   	        
	    vTipoTurnoLab.addElement("Normal ( manh� e tarde )");
	  	vTipoTurnoLab.addElement("Manh�");
	  	vTipoTurnoLab.addElement("Tarde");
	  	vTipoTurnoLab.addElement("Noite");
	  	vTipoTurnoLab.addElement("Especial");
	  	vTipoTurnoVal.addElement("N");
	  	vTipoTurnoVal.addElement("M");
	  	vTipoTurnoVal.addElement("T");
	  	vTipoTurnoVal.addElement("O");
	  	vTipoTurnoVal.addElement("E");
	  	rgTipoTurno = new JRadioGroup( 5, 1, vTipoTurnoLab, vTipoTurnoVal);	  	  	
	  	adicDB(rgTipoTurno, 170, 60, 262, 140, "TipoTurno", "Tipo de Turno:",JTextFieldPad.TP_STRING,true);
	  	rgTipoTurno.setVlrString("N");
	  	
	  	setListaCampos( true,"TURNO","RH");
	    btImp.addActionListener(this);
	    btPrevimp.addActionListener(this);
	    lcCampos.setQueryInsert(false);
	    	   	  	
  } /*
  public String[] getValores() {
	String[] sVal = new String[9];
	sVal[0] = txtHIniTurno.getVlrString();
	sVal[1] = txtHIniIntTurno.getVlrString();
	sVal[2] = txtHFimIntTurno.getVlrString();
	sVal[3] = txtHFimTurno.getVlrString();
	return sVal;
  }
  public void setValores(String[] sVal) {
	txtHIniTurno.setVlrString(sVal[0]);
	txtHIniIntTurno.setVlrString(sVal[1]);
	txtHFimIntTurno.setVlrString(sVal[2]);
	txtHFimTurno.setVlrString(sVal[3]);	
  }*/
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btPrevimp) {
      	
        imprimir(true);
    }
    else if (evt.getSource() == btImp) 
      imprimir(false);
    super.actionPerformed(evt);
  }

  private void imprimir(boolean bVisualizar) {
    ImprimeOS imp = new ImprimeOS("",con);
    int linPag = imp.verifLinPag()-1;
    int iTot = 0;
    imp.montaCab();
    imp.setTitulo("Relat�rio de turnos de funcion�rios");
    DLRFTurnos dl = new DLRFTurnos();
    dl.setVisible(true);
    if (dl.OK == false) {
      dl.dispose();
      return;
    }
    String sSQL = "SELECT CODTURNO, DESCTURNO, NHSTURNO, " +
    		"HINITURNO, HINIINTTURNO, HFIMINTTURNO, HFIMTURNO ," +
    		"TIPOTURNO FROM RHTURNO ORDER BY "+dl.getValor();
    		
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
      rs = ps.executeQuery();
      imp.limpaPags();
      while ( rs.next() ) {
         if (imp.pRow()==0) {
            imp.impCab(80);
            imp.say(imp.pRow()+0,0,""+imp.normal());
            imp.say(imp.pRow()+0,0,"");
            imp.say(imp.pRow()+0,2,"C�d.turno");
            imp.say(imp.pRow()+0,10,"Descri��o do turno");   
            imp.say(imp.pRow()+0,2,"H/S");
            imp.say(imp.pRow()+0,2,"Ent.tur.");
            imp.say(imp.pRow()+0,2,"Ent.int.");
            imp.say(imp.pRow()+0,2,"Fim.int.");
            imp.say(imp.pRow()+0,2,"Fim.tur.");
            imp.say(imp.pRow()+0,2,"Tipo turno");
            imp.say(imp.pRow()+1,0,""+imp.normal());
            imp.say(imp.pRow()+0,0,Funcoes.replicate("-",80));
         }
         imp.say(imp.pRow()+1,0,""+imp.normal());
         imp.say(imp.pRow()+0,2,rs.getString("CodTurno"));
         imp.say(imp.pRow()+0,10,rs.getString("DescTurno"));       
         imp.say(imp.pRow()+0,2,rs.getString("NhsTurno")); 
         imp.say(imp.pRow()+0,2,rs.getString("HIniTurno")); 
         imp.say(imp.pRow()+0,2,rs.getString("HIniIntTurno")); 
         imp.say(imp.pRow()+0,2,rs.getString("HFimIntTurno")); 
         imp.say(imp.pRow()+0,2,rs.getString("HFimTurno")); 
         imp.say(imp.pRow()+0,2,rs.getString("TipoTurno")); 
        
         if (imp.pRow()>=linPag) {
            imp.incPags();
            imp.eject();
         }
      }
      
      imp.say(imp.pRow()+1,0,""+imp.normal());
      imp.say(imp.pRow()+0,0,Funcoes.replicate("=",80));
      imp.say(imp.pRow()+1,0,""+imp.normal());
      imp.say(imp.pRow()+0,0,"|");      
      imp.say(imp.pRow()+0,71,Funcoes.alinhaDir(iTot,8));
      imp.say(imp.pRow()+0,80,"|");
      imp.say(imp.pRow()+1,0,""+imp.normal());
      imp.say(imp.pRow()+0,0,Funcoes.replicate("=",80));
      imp.eject();
      
      imp.fechaGravacao();
      
//      rs.close();
//      ps.close();
      if (!con.getAutoCommit())
      	con.commit();
      dl.dispose();
    }  
    catch ( SQLException err ) {
       Funcoes.mensagemErro(this,"Erro consulta tabela de funcion�rios!"+err.getMessage());      
    }
    
    if (bVisualizar) {
      imp.preview(this);
    }
    else {
      imp.print();
    }
  }
}

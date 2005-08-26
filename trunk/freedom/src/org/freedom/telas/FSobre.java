/**
 * @version 14/11/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.telas <BR>
 * Classe: @(#)FLogin.java <BR>
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
 * Coment�rios para a classe...
 */

package org.freedom.telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTabbedPanePad;

import org.freedom.bmps.Icone;
import org.freedom.funcoes.Funcoes;


public class FSobre extends FFDialogo {
	private static final long serialVersionUID = 1L;

  private JTabbedPanePad tpnSobre = new JTabbedPanePad();
  private JPanelPad pnSobre = new JPanelPad(JPanelPad.TP_JPANEL,new BorderLayout());
  private JPanelPad pnEquipe = new JPanelPad(JPanelPad.TP_JPANEL,new BorderLayout());
  ImageIcon img = Icone.novo(Aplicativo.strSplash);
  public FSobre () {
  	super(Aplicativo.telaPrincipal);
    setTitulo("Sobre...");
	setAtribos(312,330);
	
	setToFrameLayout();

	c.add(tpnSobre,BorderLayout.CENTER);
	tpnSobre.addTab("Sobre",pnSobre);
	
	JLabelPad lbImg = new JLabelPad(img);
	lbImg.setPreferredSize(new Dimension(img.getIconWidth(),img.getIconHeight()));
    String sVersao = "";
	try {
      URL uPath = getClass().getResource("FSobre.class");
      JarURLConnection juc = (JarURLConnection)uPath.openConnection();
      sVersao = Funcoes.dateToStrDataHora(new Date(juc.getJarEntry().getTime()));
	}
	catch(Exception err) { };
	
	pnSobre.add(lbImg,BorderLayout.NORTH);
	pnSobre.add(new JLabelPad ("<HTML><BR>"+
	        " Vers�o do jar: "+sVersao+"<BR>"+
	        " "+Aplicativo.sEmpSis+"<BR>"+
			(new GregorianCalendar().get(Calendar.YEAR))+"<BR></HTML>"),BorderLayout.CENTER);

	tpnSobre.addTab("Equipe "+Aplicativo.sNomeSis ,pnEquipe);
    String sHtmlEquipe = "<HTML><BR><CENTER>";
    for (int i = 0;Aplicativo.vEquipeSis.size()>i;i++){
        sHtmlEquipe += Aplicativo.vEquipeSis.elementAt(i).toString()+"<BR>";
    }
    
	pnEquipe.add(new JLabelPad (sHtmlEquipe+"</CENTER><BR>"));
  }
}    

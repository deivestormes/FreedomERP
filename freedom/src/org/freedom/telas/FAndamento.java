/**
 * @version 05/06/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.telas <BR>
 * Classe: @(#)FAndamento.java <BR>
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
 * Coment�rios da classe.....
 */

package org.freedom.telas;
import java.awt.GridLayout;

import javax.swing.JFrame;
import org.freedom.componentes.JLabelPad;
import javax.swing.JProgressBar;

import org.freedom.componentes.JPanelPad;

public class FAndamento extends JFrame {
	private static final long serialVersionUID = 1L;	
	private JPanelPad pin = new JPanelPad(310,150);
	private JProgressBar pb = new JProgressBar();
	private JLabelPad lbAnd = new JLabelPad(""); 
	
	public FAndamento(String sLabel,int iMin, int iMax) {
		setBounds(100,100,310,150);
		pb.setStringPainted(true);
		pb.setMaximum(iMax);
		pb.setMinimum(iMin);
		setTitle("Andamento");
		getContentPane().setLayout(new GridLayout(1,1));
		lbAnd.setText(sLabel);
		pin.adic(lbAnd,7,20,200,20);
		pin.adic(pb,7,60,280,20);
		getContentPane().add(pin);
	}
	
	public synchronized void atualiza(int iVal) {
		pb.setValue(iVal);
		pb.updateUI();
	}
	
	public void setLabel(String sLabel) {
		lbAnd.setText(sLabel);
		lbAnd.updateUI();
	}
}

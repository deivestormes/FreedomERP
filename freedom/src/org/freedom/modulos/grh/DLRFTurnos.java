/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.grh <BR>
 * Classe: @(#)DLRFTurnos.java <BR>
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
 * Dialog para listagem de turnos
 * 
 */

package org.freedom.modulos.grh;
import org.freedom.componentes.JLabelPad;

import org.freedom.componentes.JRadioGroup;
import org.freedom.telas.FFDialogo;

import java.util.Vector;
public class DLRFTurnos extends FFDialogo {
  private static final long serialVersionUID = 1L;
  private JRadioGroup rgOrdem = null;
  private JLabelPad lbOrdem = new JLabelPad("Ordenar por:");
  private Vector vLabs = new Vector();
  private Vector vVals = new Vector();
  public DLRFTurnos() {
    setTitulo("Ordem do Relat�rio");
    setAtribos(300,140);
    vLabs.addElement("C�digo");
    vLabs.addElement("Descri��o");
    vVals.addElement("C");
    vVals.addElement("D");
    rgOrdem = new JRadioGroup(1,2,vLabs,vVals);
    rgOrdem.setVlrString("D");
    adic(lbOrdem,7,0,80,15);
    adic(rgOrdem,7,20,280,30);
  }
  public String getValor() {
    String sRetorno = "";
    if (rgOrdem.getVlrString().compareTo("C") == 0 )
      sRetorno = "CODTURNO";
    else if (rgOrdem.getVlrString().compareTo("D") == 0 )
      sRetorno = "DESCTURNO";
    return sRetorno;
  }
}

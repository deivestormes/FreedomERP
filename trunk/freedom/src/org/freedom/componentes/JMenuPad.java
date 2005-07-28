/**
 * @version 23/01/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.componentes <BR>
 * Classe: @(#)JMenuPad.java <BR>
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

package org.freedom.componentes;
import javax.swing.JMenu;
public class JMenuPad extends JMenu {

	private static final long serialVersionUID = 1L;
	private int iCodSys = 0;
	private int iCodMod = 0;
    private int iCodMen = 0;
    private int iCodNiv = 0;
  
	/**
	*  Construtor da classe JMenu(). <BR>
	*
	*/
  
	public JMenuPad () {
		this(0,0,0,0);
	}

	/**
	*  Construtor da classe JMenu(). <BR>
	*  Construtor que ja ajusta os paramatros basicos do JMenuPad.
	*
	*/
  
	public JMenuPad (int iCodSistema, int iCodModulo, int iCodMenu, int iCodNivel) {
		iCodSys = iCodSistema;
		iCodMod = iCodModulo;
		iCodMen = iCodMenu;
		iCodNiv = iCodNivel;
	}
	
	/**
	*  Ajusta o c�digo do sistema. <BR>
	*  @param iCod - C�digo do sistema.
	*  @see #getCodSistema
	*
	*/

	public void setCodSistema(int iCod) {
		iCodSys = iCod;
	}

	/**
	*  Retorna o c�digo do sistema. <BR>
	*  @return C�digo do sistema ou zero se o c�digo n�o foi definido.
	*  @see #setCodSistema
	*
	*/


	public int getCodSistema() {
		return iCodSys;
	}

	/**
	*  Ajusta o c�digo do m�dulo do sistema. <BR>
	*  @param iCod - C�digo do m�dulo.
	*  @see #getCodModulo
	*
	*/

	public void setCodModulo(int iCod) {
		iCodMod = iCod;
	}

	/**
	*  Retorna o c�digo do m�dulo do sistema. <BR>
	*  @return C�digo do m�dulo ou zero se o c�digo n�o foi definido.
	*  @see #setCodModulo
	*
	*/

	public int getCodModulo() {
		return iCodMod;
	}

	/**
	*  Ajusta o c�digo do menu. <BR>
	*  O c�digo do menu � composto da seguinte forma: <BR>
	*  8 casas decimais (caso casas da direita nao usadas colocar 0)<BR>
	*  agrupadas de dois em dois, ex: 19|26|03|17. <BR>
	*  Sendo que o primeiro grupo deve comecar a partir de 11,<BR>
	*  pois o 10 � reservado para o menu arquivo criado automaticamente<BR>
	*  pelo sistema.<BR>
	*  <BR>
	*  No exemplo o c�digo do menu principal �: 19,<BR>
	*  submenu1: 26<BR>
	*  submenu2: 03<BR>
	*  submenu3: 17<BR>
	*  
	*  @param iCod - C�digo do menu.
	*  @see #getCodMenu
	*
	*/

	public void setCodMenu(int iCod) {
		iCodMen = iCod;
	}

	/**
	*  Retorna o c�digo do menu. 
	*  @return C�digo do menu ou zero se o c�digo n�o foi definido.
	*  @see #setCodMenu
	*
	*/

	public int getCodMenu() {
		return iCodMen;
	}

	/**
	*  Ajusta o n�vel do menu. <BR>
	*  O n�vel especifica que n�vel de detalhe que o<BR>
	*  menu se encontra.
	* 
	*  @param iNivel - N�vel do menu pode ser: <BR>
	*  0 - Menu Principal<BR>
	*  1,2,3 - SubMenu.
	* 
	*  @see #getCodNivel
	*
	*/

	public void setNivel(int iNivel) {
		iCodNiv = iNivel;
	}

	/**
	*  Retorna o n�vel do menu. <BR>
	*  @return N�vel.
	*  @see #setNivel
	*
	*/

	public int getCodNivel() {
		return iCodNiv;
	}
}

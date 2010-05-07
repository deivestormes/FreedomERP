/**
 * @version 01/03/2010 <BR>
 * @author Setpoint Inform�tica Ltda./Anderson Sanchez
 *         <BR>
 * 
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.funcoes <BR>
 * Classe:
 * @(#)Funcoes.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para
 * Programas de Computador), <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste
 * Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc�
 * pode contatar <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa �
 * preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Classe de fun��es para tratamento de texto.
 */

package org.freedom.infra.functions;



public final class StringFunctions {

	public static String ltrim( String text) {
		if( text==null || "".equals(text)) {
			return "";
		}
		
		while (text.charAt(0) == ' ') { 
			text = text.substring(1);
		}
		return text;
		
	}
	
	public static String alltrim(String text) {
		
		if( text==null || "".equals(text)) {
			return "";
		}
		
		text = ltrim(text.trim());
		
		return text;
		
	}
	 
	public static String clearString(String str) {
		return clearString(str,"");
	}
	
	public static String clearStringOld(String str) {
		
		String sResult = "";
		String sCaracs = "=<>- .,;/\\?";
		
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				if (sCaracs.indexOf(str.substring(i, i + 1)) == -1)
					sResult = sResult + str.substring(i, i + 1);
			}
		}
		return sResult;
	}
	
	public static String clearString(String str, String strnew) {
		
		StringBuilder validstring = new StringBuilder();
		
		validstring.append( str.replaceAll( "\\W", strnew ) ); 

		return validstring.toString().trim();
		
	}
	
	public static String replicate(String text, int times) {

		StringBuffer ret = new StringBuffer("");
		
		try {
			for (int i = 0; i < times; i++) {
				ret.append(text);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret.toString();
		
	}
	
	public static String strZero(String text, int times) {
		
		String ret = null;
		
		try {
			if( text.length() > times ) {
				return text.substring(0, times);
			}
			if (text == null) {
				ret = replicate("0", times);
			} 
			else {	
				ret = replicate("0", times - text.trim().length());
				ret += text.trim();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret;
		
	}
	
	public static char clearAccent(char cKey) {

		char cTmp = cKey;

		if (isContained(cTmp, "�����"))
			cTmp = 'a';
		else if (isContained(cTmp, "�����"))
			cTmp = 'A';
		else if (isContained(cTmp, "����"))
			cTmp = 'e';
		else if (isContained(cTmp, "����"))
			cTmp = 'E';
		else if (isContained(cTmp, "����"))
			cTmp = 'i';
		else if (isContained(cTmp, "����"))
			cTmp = 'I';
		else if (isContained(cTmp, "�����"))
			cTmp = 'o';
		else if (isContained(cTmp, "�����"))
			cTmp = 'O';
		else if (isContained(cTmp, "����"))
			cTmp = 'u';
		else if (isContained(cTmp, "����"))
			cTmp = 'U';
		else if (isContained(cTmp, "�"))
			cTmp = 'c';
		else if (isContained(cTmp, "�"))
			cTmp = 'C';
		return cTmp;
	}

	public static boolean isContained(char cTexto, String sTexto) {
		boolean bRetorno = false;
		for (int i = 0; i < sTexto.length(); i++) {
			if (cTexto == sTexto.charAt(i)) {
				bRetorno = true;
				break;
			}
		}
		return bRetorno;
	}

	
	public static String clearAccents(String sTexto) {
		String sRet = "";
		char cVals[] = sTexto.toCharArray();
		for (int i = 0; i < cVals.length; i++) {
			cVals[i] = clearAccent(cVals[i]);
		}
		sRet = new String(cVals);
		return sRet;
	}

	

}


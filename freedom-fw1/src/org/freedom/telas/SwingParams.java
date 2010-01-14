package org.freedom.telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class SwingParams {

	public static int FONT_SIZE_MIN = 8;
	
	public static int FONT_SIZE_MED = 11;
	
	public static int FONT_SIZE_PAD = 12;
	
	public static int FONT_SIZE_MAX = 16;
	
	public static int FONT_STYLE_PAD = Font.PLAIN;
	
	public static int FONT_STYLE_BOLD = Font.BOLD;
	
	public static int FONT_STYLE_ITALIC = Font.ITALIC;
	
	public static String FONT_PAD = "Arial";
	
	public static int TAMANHO_FONTE = 0;
	
	public static Font getFontpad() {
		return new Font(FONT_PAD, FONT_STYLE_PAD, FONT_SIZE_PAD + TAMANHO_FONTE);
	}
	
	public static Font getFontpadmed() {
		return new Font(FONT_PAD, FONT_STYLE_PAD, FONT_SIZE_MED + TAMANHO_FONTE);
	}
	
	public static Font getFontpadmin() {
		return new Font(FONT_PAD, FONT_STYLE_PAD, FONT_SIZE_MIN + TAMANHO_FONTE);
	}
	
	public static Font getFontbold() {
		return new Font(FONT_PAD, FONT_STYLE_BOLD, FONT_SIZE_PAD + TAMANHO_FONTE);
	}
	
	public static Font getFontboldmax() {
		return new Font( FONT_PAD, FONT_STYLE_BOLD, FONT_SIZE_MAX + TAMANHO_FONTE);
	}

	
	public static Font getFontboldmed() {
		return new Font(FONT_PAD, FONT_STYLE_BOLD, FONT_SIZE_MED + TAMANHO_FONTE);
	}

	
	public static Font getFontitalicmed() {
		return new Font(FONT_PAD, FONT_STYLE_ITALIC, FONT_SIZE_MED + TAMANHO_FONTE);
	}
	
	public static Border getPanelLabel(String label, Color cortitulo) {
		Border border = BorderFactory.createTitledBorder( null, label, 2, 0, SwingParams.getFontbold(), cortitulo ); 
		return border;
	}



}


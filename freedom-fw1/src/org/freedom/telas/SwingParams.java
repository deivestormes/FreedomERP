package org.freedom.telas;

import java.awt.Font;

public class SwingParams {

	public static int FONT_SIZE_MIN = 8;
	
	public static int FONT_SIZE_MED = 11;
	
	public static int FONT_SIZE_PAD = 12;
	
	public static int FONT_SIZE_MAX = 16;
	
	public static int FONT_STYLE_PAD = Font.PLAIN;
	
	public static int FONT_STYLE_BOLD = Font.BOLD;
	
	public static int FONT_STYLE_ITALIC = Font.ITALIC;
	
	public static String FONT_PAD = "Arial";
	
	public static Font getFontpad() {
		return new Font(FONT_PAD, FONT_STYLE_PAD, FONT_SIZE_PAD);
	}

	public static Font getFontpadmed() {
		return new Font(FONT_PAD, FONT_STYLE_PAD, FONT_SIZE_MED);
	}
	
	public static Font getFontbold() {
		return new Font(FONT_PAD, FONT_STYLE_BOLD, FONT_SIZE_PAD);
	}
	
	public static Font getFontboldmed() {
		return new Font(FONT_PAD, FONT_STYLE_BOLD, FONT_SIZE_MED);
	}

	
	public static Font getFontitalicmed() {
		return new Font(FONT_PAD, FONT_STYLE_ITALIC, FONT_SIZE_MED);
	}



}


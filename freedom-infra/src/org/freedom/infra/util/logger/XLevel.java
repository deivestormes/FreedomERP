package org.freedom.infra.util.logger;

import org.apache.log4j.Level;

/**
 * Classe para personalização de níveis de log.
 * 
 * @author Anderson Sanchez - 30/06/2008;
 */

public class XLevel extends Level {

	private static final long serialVersionUID = 1L;
	static public final int TRACE_INT = Level.DEBUG_INT - 1;
	static public final int LETHAL_INT = Level.FATAL_INT + 1;
	private static String TRACE_STR = "TRACE";
	private static String LETHAL_STR = "LETHAL";
	public static final XLevel TRACE = new XLevel(TRACE_INT, TRACE_STR, 7);
	public static final XLevel LETHAL = new XLevel(LETHAL_INT, LETHAL_STR, 0);

	protected XLevel(int level, String strLevel, int syslogEquiv) {
		super(level, strLevel, syslogEquiv);
	}

	public static Level toLevel(String sArg) {
		return (Level) toLevel(sArg, XLevel.TRACE);
	}

	public static Level toLevel(String sArg, Level defaultValue) {

		if (sArg == null) {
			return defaultValue;
		}
		String stringVal = sArg.toUpperCase();

		if (stringVal.equals(TRACE_STR)) {
			return XLevel.TRACE;
		} else if (stringVal.equals(LETHAL_STR)) {
			return XLevel.LETHAL;
		}

		return Level.toLevel(sArg, (Level) defaultValue);
	}

	public static Level toLevel(int i) throws IllegalArgumentException {
		switch (i) {
		case TRACE_INT:
			return XLevel.TRACE;
		case LETHAL_INT:
			return XLevel.LETHAL;
		}
		return Level.toLevel(i);
	}

}

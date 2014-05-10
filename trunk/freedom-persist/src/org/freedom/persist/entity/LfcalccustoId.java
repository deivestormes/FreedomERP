package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * LfcalccustoId generated by hbm2java
 */
public class LfcalccustoId implements java.io.Serializable {

	private int codcalc;
	private short codfilial;
	private int codemp;

	public LfcalccustoId() {
	}

	public LfcalccustoId(int codcalc, short codfilial, int codemp) {
		this.codcalc = codcalc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcalc() {
		return this.codcalc;
	}

	public void setCodcalc(int codcalc) {
		this.codcalc = codcalc;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LfcalccustoId))
			return false;
		LfcalccustoId castOther = (LfcalccustoId) other;

		return (this.getCodcalc() == castOther.getCodcalc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcalc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

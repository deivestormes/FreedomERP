package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * LflivrofiscalId generated by hbm2java
 */
public class LflivrofiscalId implements java.io.Serializable {

	private int codlf;
	private String anomeslf;
	private char tipolf;
	private short codfilial;
	private int codemp;

	public LflivrofiscalId() {
	}

	public LflivrofiscalId(int codlf, String anomeslf, char tipolf,
			short codfilial, int codemp) {
		this.codlf = codlf;
		this.anomeslf = anomeslf;
		this.tipolf = tipolf;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodlf() {
		return this.codlf;
	}

	public void setCodlf(int codlf) {
		this.codlf = codlf;
	}

	public String getAnomeslf() {
		return this.anomeslf;
	}

	public void setAnomeslf(String anomeslf) {
		this.anomeslf = anomeslf;
	}

	public char getTipolf() {
		return this.tipolf;
	}

	public void setTipolf(char tipolf) {
		this.tipolf = tipolf;
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
		if (!(other instanceof LflivrofiscalId))
			return false;
		LflivrofiscalId castOther = (LflivrofiscalId) other;

		return (this.getCodlf() == castOther.getCodlf())
				&& ((this.getAnomeslf() == castOther.getAnomeslf()) || (this
						.getAnomeslf() != null
						&& castOther.getAnomeslf() != null && this
						.getAnomeslf().equals(castOther.getAnomeslf())))
				&& (this.getTipolf() == castOther.getTipolf())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodlf();
		result = 37 * result
				+ (getAnomeslf() == null ? 0 : this.getAnomeslf().hashCode());
		result = 37 * result + this.getTipolf();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

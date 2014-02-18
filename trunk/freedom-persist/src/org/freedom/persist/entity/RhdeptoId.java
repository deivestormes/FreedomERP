package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * RhdeptoId generated by hbm2java
 */
public class RhdeptoId implements java.io.Serializable {

	private int coddep;
	private short codfilial;
	private int codemp;

	public RhdeptoId() {
	}

	public RhdeptoId(int coddep, short codfilial, int codemp) {
		this.coddep = coddep;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCoddep() {
		return this.coddep;
	}

	public void setCoddep(int coddep) {
		this.coddep = coddep;
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
		if (!(other instanceof RhdeptoId))
			return false;
		RhdeptoId castOther = (RhdeptoId) other;

		return (this.getCoddep() == castOther.getCoddep())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoddep();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

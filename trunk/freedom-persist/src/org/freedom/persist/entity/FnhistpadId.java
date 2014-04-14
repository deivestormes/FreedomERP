package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * FnhistpadId generated by hbm2java
 */
public class FnhistpadId implements java.io.Serializable {

	private int codhist;
	private short codfilial;
	private int codemp;

	public FnhistpadId() {
	}

	public FnhistpadId(int codhist, short codfilial, int codemp) {
		this.codhist = codhist;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodhist() {
		return this.codhist;
	}

	public void setCodhist(int codhist) {
		this.codhist = codhist;
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
		if (!(other instanceof FnhistpadId))
			return false;
		FnhistpadId castOther = (FnhistpadId) other;

		return (this.getCodhist() == castOther.getCodhist())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodhist();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

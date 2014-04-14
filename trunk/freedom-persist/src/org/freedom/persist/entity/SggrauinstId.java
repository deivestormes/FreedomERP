package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SggrauinstId generated by hbm2java
 */
public class SggrauinstId implements java.io.Serializable {

	private int codgri;
	private short codfilial;
	private int codemp;

	public SggrauinstId() {
	}

	public SggrauinstId(int codgri, short codfilial, int codemp) {
		this.codgri = codgri;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodgri() {
		return this.codgri;
	}

	public void setCodgri(int codgri) {
		this.codgri = codgri;
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
		if (!(other instanceof SggrauinstId))
			return false;
		SggrauinstId castOther = (SggrauinstId) other;

		return (this.getCodgri() == castOther.getCodgri())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodgri();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

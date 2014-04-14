package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * VdregcomisdescId generated by hbm2java
 */
public class VdregcomisdescId implements java.io.Serializable {

	private int codemp;
	private int codfilial;
	private short codregcomisdesc;

	public VdregcomisdescId() {
	}

	public VdregcomisdescId(int codemp, int codfilial, short codregcomisdesc) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codregcomisdesc = codregcomisdesc;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	public short getCodregcomisdesc() {
		return this.codregcomisdesc;
	}

	public void setCodregcomisdesc(short codregcomisdesc) {
		this.codregcomisdesc = codregcomisdesc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdregcomisdescId))
			return false;
		VdregcomisdescId castOther = (VdregcomisdescId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodregcomisdesc() == castOther.getCodregcomisdesc());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodregcomisdesc();
		return result;
	}

}

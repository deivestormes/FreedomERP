package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * VdmodcontrId generated by hbm2java
 */
public class VdmodcontrId implements java.io.Serializable {

	private int codmodcontr;
	private short codfilial;
	private int codemp;

	public VdmodcontrId() {
	}

	public VdmodcontrId(int codmodcontr, short codfilial, int codemp) {
		this.codmodcontr = codmodcontr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodmodcontr() {
		return this.codmodcontr;
	}

	public void setCodmodcontr(int codmodcontr) {
		this.codmodcontr = codmodcontr;
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
		if (!(other instanceof VdmodcontrId))
			return false;
		VdmodcontrId castOther = (VdmodcontrId) other;

		return (this.getCodmodcontr() == castOther.getCodmodcontr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmodcontr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * VdfotoprodId generated by hbm2java
 */
public class VdfotoprodId implements java.io.Serializable {

	private int codfotoprod;
	private int codprod;
	private short codfilial;
	private int codemp;

	public VdfotoprodId() {
	}

	public VdfotoprodId(int codfotoprod, int codprod, short codfilial,
			int codemp) {
		this.codfotoprod = codfotoprod;
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodfotoprod() {
		return this.codfotoprod;
	}

	public void setCodfotoprod(int codfotoprod) {
		this.codfotoprod = codfotoprod;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
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
		if (!(other instanceof VdfotoprodId))
			return false;
		VdfotoprodId castOther = (VdfotoprodId) other;

		return (this.getCodfotoprod() == castOther.getCodfotoprod())
				&& (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfotoprod();
		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

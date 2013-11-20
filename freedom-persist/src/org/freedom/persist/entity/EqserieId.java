package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * EqserieId generated by hbm2java
 */
public class EqserieId implements java.io.Serializable {

	private String numserie;
	private int codprod;
	private short codfilial;
	private int codemp;

	public EqserieId() {
	}

	public EqserieId(String numserie, int codprod, short codfilial, int codemp) {
		this.numserie = numserie;
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getNumserie() {
		return this.numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
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
		if (!(other instanceof EqserieId))
			return false;
		EqserieId castOther = (EqserieId) other;

		return ((this.getNumserie() == castOther.getNumserie()) || (this
				.getNumserie() != null && castOther.getNumserie() != null && this
				.getNumserie().equals(castOther.getNumserie())))
				&& (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNumserie() == null ? 0 : this.getNumserie().hashCode());
		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

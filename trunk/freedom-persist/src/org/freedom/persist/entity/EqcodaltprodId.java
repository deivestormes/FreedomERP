package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * EqcodaltprodId generated by hbm2java
 */
public class EqcodaltprodId implements java.io.Serializable {

	private String codaltprod;
	private int codprod;
	private short codfilial;
	private int codemp;

	public EqcodaltprodId() {
	}

	public EqcodaltprodId(String codaltprod, int codprod, short codfilial,
			int codemp) {
		this.codaltprod = codaltprod;
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodaltprod() {
		return this.codaltprod;
	}

	public void setCodaltprod(String codaltprod) {
		this.codaltprod = codaltprod;
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
		if (!(other instanceof EqcodaltprodId))
			return false;
		EqcodaltprodId castOther = (EqcodaltprodId) other;

		return ((this.getCodaltprod() == castOther.getCodaltprod()) || (this
				.getCodaltprod() != null && castOther.getCodaltprod() != null && this
				.getCodaltprod().equals(castOther.getCodaltprod())))
				&& (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodaltprod() == null ? 0 : this.getCodaltprod()
						.hashCode());
		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

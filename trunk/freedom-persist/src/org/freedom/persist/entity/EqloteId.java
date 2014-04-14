package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * EqloteId generated by hbm2java
 */
public class EqloteId implements java.io.Serializable {

	private String codlote;
	private int codprod;
	private short codfilial;
	private int codemp;

	public EqloteId() {
	}

	public EqloteId(String codlote, int codprod, short codfilial, int codemp) {
		this.codlote = codlote;
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodlote() {
		return this.codlote;
	}

	public void setCodlote(String codlote) {
		this.codlote = codlote;
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
		if (!(other instanceof EqloteId))
			return false;
		EqloteId castOther = (EqloteId) other;

		return ((this.getCodlote() == castOther.getCodlote()) || (this
				.getCodlote() != null && castOther.getCodlote() != null && this
				.getCodlote().equals(castOther.getCodlote())))
				&& (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodlote() == null ? 0 : this.getCodlote().hashCode());
		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

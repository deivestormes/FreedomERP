package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * FncotmoedaId generated by hbm2java
 */
public class FncotmoedaId implements java.io.Serializable {

	private Date datacot;
	private String codmoeda;
	private short codfilial;
	private int codemp;

	public FncotmoedaId() {
	}

	public FncotmoedaId(Date datacot, String codmoeda, short codfilial,
			int codemp) {
		this.datacot = datacot;
		this.codmoeda = codmoeda;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public Date getDatacot() {
		return this.datacot;
	}

	public void setDatacot(Date datacot) {
		this.datacot = datacot;
	}

	public String getCodmoeda() {
		return this.codmoeda;
	}

	public void setCodmoeda(String codmoeda) {
		this.codmoeda = codmoeda;
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
		if (!(other instanceof FncotmoedaId))
			return false;
		FncotmoedaId castOther = (FncotmoedaId) other;

		return ((this.getDatacot() == castOther.getDatacot()) || (this
				.getDatacot() != null && castOther.getDatacot() != null && this
				.getDatacot().equals(castOther.getDatacot())))
				&& ((this.getCodmoeda() == castOther.getCodmoeda()) || (this
						.getCodmoeda() != null
						&& castOther.getCodmoeda() != null && this
						.getCodmoeda().equals(castOther.getCodmoeda())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDatacot() == null ? 0 : this.getDatacot().hashCode());
		result = 37 * result
				+ (getCodmoeda() == null ? 0 : this.getCodmoeda().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

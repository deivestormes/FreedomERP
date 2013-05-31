package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FncotmoedaId generated by hbm2java
 */
@Embeddable
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

	@Column(name = "DATACOT", nullable = false, length = 10)
	public Date getDatacot() {
		return this.datacot;
	}

	public void setDatacot(Date datacot) {
		this.datacot = datacot;
	}

	@Column(name = "CODMOEDA", nullable = false, length = 4)
	public String getCodmoeda() {
		return this.codmoeda;
	}

	public void setCodmoeda(String codmoeda) {
		this.codmoeda = codmoeda;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
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

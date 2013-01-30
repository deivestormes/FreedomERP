package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhcaracteristicaId generated by hbm2java
 */
@Embeddable
public class RhcaracteristicaId implements java.io.Serializable {

	private String codcarac;
	private int codfilial;
	private int codemp;

	public RhcaracteristicaId() {
	}

	public RhcaracteristicaId(String codcarac, int codfilial, int codemp) {
		this.codcarac = codcarac;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCARAC", nullable = false, length = 15)
	public String getCodcarac() {
		return this.codcarac;
	}

	public void setCodcarac(String codcarac) {
		this.codcarac = codcarac;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof RhcaracteristicaId))
			return false;
		RhcaracteristicaId castOther = (RhcaracteristicaId) other;

		return ((this.getCodcarac() == castOther.getCodcarac()) || (this
				.getCodcarac() != null && castOther.getCodcarac() != null && this
				.getCodcarac().equals(castOther.getCodcarac())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodcarac() == null ? 0 : this.getCodcarac().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

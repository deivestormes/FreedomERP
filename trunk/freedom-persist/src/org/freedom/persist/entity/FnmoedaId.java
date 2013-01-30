package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnmoedaId generated by hbm2java
 */
@Embeddable
public class FnmoedaId implements java.io.Serializable {

	private String codmoeda;
	private short codfilial;
	private int codemp;

	public FnmoedaId() {
	}

	public FnmoedaId(String codmoeda, short codfilial, int codemp) {
		this.codmoeda = codmoeda;
		this.codfilial = codfilial;
		this.codemp = codemp;
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
		if (!(other instanceof FnmoedaId))
			return false;
		FnmoedaId castOther = (FnmoedaId) other;

		return ((this.getCodmoeda() == castOther.getCodmoeda()) || (this
				.getCodmoeda() != null && castOther.getCodmoeda() != null && this
				.getCodmoeda().equals(castOther.getCodmoeda())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodmoeda() == null ? 0 : this.getCodmoeda().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

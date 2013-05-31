package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TkcampanhaId generated by hbm2java
 */
@Embeddable
public class TkcampanhaId implements java.io.Serializable {

	private String codcamp;
	private short codfilial;
	private int codemp;

	public TkcampanhaId() {
	}

	public TkcampanhaId(String codcamp, short codfilial, int codemp) {
		this.codcamp = codcamp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCAMP", nullable = false, length = 13)
	public String getCodcamp() {
		return this.codcamp;
	}

	public void setCodcamp(String codcamp) {
		this.codcamp = codcamp;
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
		if (!(other instanceof TkcampanhaId))
			return false;
		TkcampanhaId castOther = (TkcampanhaId) other;

		return ((this.getCodcamp() == castOther.getCodcamp()) || (this
				.getCodcamp() != null && castOther.getCodcamp() != null && this
				.getCodcamp().equals(castOther.getCodcamp())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodcamp() == null ? 0 : this.getCodcamp().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

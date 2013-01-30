package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqmarcaId generated by hbm2java
 */
@Embeddable
public class EqmarcaId implements java.io.Serializable {

	private String codmarca;
	private short codfilial;
	private int codemp;

	public EqmarcaId() {
	}

	public EqmarcaId(String codmarca, short codfilial, int codemp) {
		this.codmarca = codmarca;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMARCA", nullable = false, length = 6)
	public String getCodmarca() {
		return this.codmarca;
	}

	public void setCodmarca(String codmarca) {
		this.codmarca = codmarca;
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
		if (!(other instanceof EqmarcaId))
			return false;
		EqmarcaId castOther = (EqmarcaId) other;

		return ((this.getCodmarca() == castOther.getCodmarca()) || (this
				.getCodmarca() != null && castOther.getCodmarca() != null && this
				.getCodmarca().equals(castOther.getCodmarca())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodmarca() == null ? 0 : this.getCodmarca().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

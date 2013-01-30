package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgmunicipioId generated by hbm2java
 */
@Embeddable
public class SgmunicipioId implements java.io.Serializable {

	private String codmunic;
	private String siglauf;
	private short codpais;

	public SgmunicipioId() {
	}

	public SgmunicipioId(String codmunic, String siglauf, short codpais) {
		this.codmunic = codmunic;
		this.siglauf = siglauf;
		this.codpais = codpais;
	}

	@Column(name = "CODMUNIC", nullable = false, length = 7)
	public String getCodmunic() {
		return this.codmunic;
	}

	public void setCodmunic(String codmunic) {
		this.codmunic = codmunic;
	}

	@Column(name = "SIGLAUF", nullable = false, length = 2)
	public String getSiglauf() {
		return this.siglauf;
	}

	public void setSiglauf(String siglauf) {
		this.siglauf = siglauf;
	}

	@Column(name = "CODPAIS", nullable = false)
	public short getCodpais() {
		return this.codpais;
	}

	public void setCodpais(short codpais) {
		this.codpais = codpais;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgmunicipioId))
			return false;
		SgmunicipioId castOther = (SgmunicipioId) other;

		return ((this.getCodmunic() == castOther.getCodmunic()) || (this
				.getCodmunic() != null && castOther.getCodmunic() != null && this
				.getCodmunic().equals(castOther.getCodmunic())))
				&& ((this.getSiglauf() == castOther.getSiglauf()) || (this
						.getSiglauf() != null && castOther.getSiglauf() != null && this
						.getSiglauf().equals(castOther.getSiglauf())))
				&& (this.getCodpais() == castOther.getCodpais());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodmunic() == null ? 0 : this.getCodmunic().hashCode());
		result = 37 * result
				+ (getSiglauf() == null ? 0 : this.getSiglauf().hashCode());
		result = 37 * result + this.getCodpais();
		return result;
	}

}

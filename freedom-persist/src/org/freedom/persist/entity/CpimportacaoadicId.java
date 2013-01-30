package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpimportacaoadicId generated by hbm2java
 */
@Embeddable
public class CpimportacaoadicId implements java.io.Serializable {

	private String codncm;
	private short codfilial;
	private int codimp;
	private int codemp;

	public CpimportacaoadicId() {
	}

	public CpimportacaoadicId(String codncm, short codfilial, int codimp,
			int codemp) {
		this.codncm = codncm;
		this.codfilial = codfilial;
		this.codimp = codimp;
		this.codemp = codemp;
	}

	@Column(name = "CODNCM", nullable = false, length = 10)
	public String getCodncm() {
		return this.codncm;
	}

	public void setCodncm(String codncm) {
		this.codncm = codncm;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODIMP", nullable = false)
	public int getCodimp() {
		return this.codimp;
	}

	public void setCodimp(int codimp) {
		this.codimp = codimp;
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
		if (!(other instanceof CpimportacaoadicId))
			return false;
		CpimportacaoadicId castOther = (CpimportacaoadicId) other;

		return ((this.getCodncm() == castOther.getCodncm()) || (this
				.getCodncm() != null && castOther.getCodncm() != null && this
				.getCodncm().equals(castOther.getCodncm())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodimp() == castOther.getCodimp())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodncm() == null ? 0 : this.getCodncm().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodimp();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

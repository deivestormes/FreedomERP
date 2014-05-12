package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgagenteId generated by hbm2java
 */
@Embeddable
public class SgagenteId implements java.io.Serializable {

	private int codage;
	private String tipoage;
	private short codfilial;
	private int codemp;

	public SgagenteId() {
	}

	public SgagenteId(int codage, String tipoage, short codfilial, int codemp) {
		this.codage = codage;
		this.tipoage = tipoage;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODAGE", nullable = false)
	public int getCodage() {
		return this.codage;
	}

	public void setCodage(int codage) {
		this.codage = codage;
	}

	@Column(name = "TIPOAGE", nullable = false, length = 5)
	public String getTipoage() {
		return this.tipoage;
	}

	public void setTipoage(String tipoage) {
		this.tipoage = tipoage;
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
		if (!(other instanceof SgagenteId))
			return false;
		SgagenteId castOther = (SgagenteId) other;

		return (this.getCodage() == castOther.getCodage())
				&& ((this.getTipoage() == castOther.getTipoage()) || (this
						.getTipoage() != null && castOther.getTipoage() != null && this
						.getTipoage().equals(castOther.getTipoage())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodage();
		result = 37 * result
				+ (getTipoage() == null ? 0 : this.getTipoage().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

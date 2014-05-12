package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgmodetiquetaId generated by hbm2java
 */
@Embeddable
public class SgmodetiquetaId implements java.io.Serializable {

	private int codmodetiq;
	private int codfilial;
	private int codemp;

	public SgmodetiquetaId() {
	}

	public SgmodetiquetaId(int codmodetiq, int codfilial, int codemp) {
		this.codmodetiq = codmodetiq;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMODETIQ", nullable = false)
	public int getCodmodetiq() {
		return this.codmodetiq;
	}

	public void setCodmodetiq(int codmodetiq) {
		this.codmodetiq = codmodetiq;
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
		if (!(other instanceof SgmodetiquetaId))
			return false;
		SgmodetiquetaId castOther = (SgmodetiquetaId) other;

		return (this.getCodmodetiq() == castOther.getCodmodetiq())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmodetiq();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhvagastatusId generated by hbm2java
 */
@Embeddable
public class RhvagastatusId implements java.io.Serializable {

	private int codvaga;
	private short codfilial;
	private int codemp;
	private int sqstvaga;

	public RhvagastatusId() {
	}

	public RhvagastatusId(int codvaga, short codfilial, int codemp, int sqstvaga) {
		this.codvaga = codvaga;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.sqstvaga = sqstvaga;
	}

	@Column(name = "CODVAGA", nullable = false)
	public int getCodvaga() {
		return this.codvaga;
	}

	public void setCodvaga(int codvaga) {
		this.codvaga = codvaga;
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

	@Column(name = "SQSTVAGA", nullable = false)
	public int getSqstvaga() {
		return this.sqstvaga;
	}

	public void setSqstvaga(int sqstvaga) {
		this.sqstvaga = sqstvaga;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RhvagastatusId))
			return false;
		RhvagastatusId castOther = (RhvagastatusId) other;

		return (this.getCodvaga() == castOther.getCodvaga())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getSqstvaga() == castOther.getSqstvaga());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvaga();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getSqstvaga();
		return result;
	}

}

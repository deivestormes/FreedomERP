package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpcompraId generated by hbm2java
 */
@Embeddable
public class CpcompraId implements java.io.Serializable {

	private int codcompra;
	private short codfilial;
	private int codemp;

	public CpcompraId() {
	}

	public CpcompraId(int codcompra, short codfilial, int codemp) {
		this.codcompra = codcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCOMPRA", nullable = false)
	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
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
		if (!(other instanceof CpcompraId))
			return false;
		CpcompraId castOther = (CpcompraId) other;

		return (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

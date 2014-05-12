package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgtabelaId generated by hbm2java
 */
@Embeddable
public class SgtabelaId implements java.io.Serializable {

	private short codtb;
	private short codfilial;
	private int codemp;

	public SgtabelaId() {
	}

	public SgtabelaId(short codtb, short codfilial, int codemp) {
		this.codtb = codtb;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTB", nullable = false)
	public short getCodtb() {
		return this.codtb;
	}

	public void setCodtb(short codtb) {
		this.codtb = codtb;
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
		if (!(other instanceof SgtabelaId))
			return false;
		SgtabelaId castOther = (SgtabelaId) other;

		return (this.getCodtb() == castOther.getCodtb())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtb();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

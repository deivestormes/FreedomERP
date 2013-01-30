package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdtabprecoId generated by hbm2java
 */
@Embeddable
public class VdtabprecoId implements java.io.Serializable {

	private int codtab;
	private short codfilial;
	private int codemp;

	public VdtabprecoId() {
	}

	public VdtabprecoId(int codtab, short codfilial, int codemp) {
		this.codtab = codtab;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTAB", nullable = false)
	public int getCodtab() {
		return this.codtab;
	}

	public void setCodtab(int codtab) {
		this.codtab = codtab;
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
		if (!(other instanceof VdtabprecoId))
			return false;
		VdtabprecoId castOther = (VdtabprecoId) other;

		return (this.getCodtab() == castOther.getCodtab())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtab();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

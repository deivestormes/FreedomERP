package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdclascliId generated by hbm2java
 */
@Embeddable
public class VdclascliId implements java.io.Serializable {

	private int codclascli;
	private short codfilial;
	private int codemp;

	public VdclascliId() {
	}

	public VdclascliId(int codclascli, short codfilial, int codemp) {
		this.codclascli = codclascli;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCLASCLI", nullable = false)
	public int getCodclascli() {
		return this.codclascli;
	}

	public void setCodclascli(int codclascli) {
		this.codclascli = codclascli;
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
		if (!(other instanceof VdclascliId))
			return false;
		VdclascliId castOther = (VdclascliId) other;

		return (this.getCodclascli() == castOther.getCodclascli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodclascli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

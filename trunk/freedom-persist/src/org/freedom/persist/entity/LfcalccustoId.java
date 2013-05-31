package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LfcalccustoId generated by hbm2java
 */
@Embeddable
public class LfcalccustoId implements java.io.Serializable {

	private int codcalc;
	private short codfilial;
	private int codemp;

	public LfcalccustoId() {
	}

	public LfcalccustoId(int codcalc, short codfilial, int codemp) {
		this.codcalc = codcalc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCALC", nullable = false)
	public int getCodcalc() {
		return this.codcalc;
	}

	public void setCodcalc(int codcalc) {
		this.codcalc = codcalc;
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
		if (!(other instanceof LfcalccustoId))
			return false;
		LfcalccustoId castOther = (LfcalccustoId) other;

		return (this.getCodcalc() == castOther.getCodcalc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcalc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

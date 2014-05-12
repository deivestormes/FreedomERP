package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LfitcalccustoId generated by hbm2java
 */
@Embeddable
public class LfitcalccustoId implements java.io.Serializable {

	private int codcalc;
	private short seqitcalc;
	private short codfilial;
	private int codemp;

	public LfitcalccustoId() {
	}

	public LfitcalccustoId(int codcalc, short seqitcalc, short codfilial,
			int codemp) {
		this.codcalc = codcalc;
		this.seqitcalc = seqitcalc;
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

	@Column(name = "SEQITCALC", nullable = false)
	public short getSeqitcalc() {
		return this.seqitcalc;
	}

	public void setSeqitcalc(short seqitcalc) {
		this.seqitcalc = seqitcalc;
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
		if (!(other instanceof LfitcalccustoId))
			return false;
		LfitcalccustoId castOther = (LfitcalccustoId) other;

		return (this.getCodcalc() == castOther.getCodcalc())
				&& (this.getSeqitcalc() == castOther.getSeqitcalc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcalc();
		result = 37 * result + this.getSeqitcalc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

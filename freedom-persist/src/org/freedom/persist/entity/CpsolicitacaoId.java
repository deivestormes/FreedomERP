package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * CpsolicitacaoId generated by hbm2java
 */
public class CpsolicitacaoId implements java.io.Serializable {

	private int codsol;
	private short codfilial;
	private int codemp;

	public CpsolicitacaoId() {
	}

	public CpsolicitacaoId(int codsol, short codfilial, int codemp) {
		this.codsol = codsol;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodsol() {
		return this.codsol;
	}

	public void setCodsol(int codsol) {
		this.codsol = codsol;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

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
		if (!(other instanceof CpsolicitacaoId))
			return false;
		CpsolicitacaoId castOther = (CpsolicitacaoId) other;

		return (this.getCodsol() == castOther.getCodsol())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodsol();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

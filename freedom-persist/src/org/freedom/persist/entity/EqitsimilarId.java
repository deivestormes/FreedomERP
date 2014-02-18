package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * EqitsimilarId generated by hbm2java
 */
public class EqitsimilarId implements java.io.Serializable {

	private int codprod;
	private short codfilialpd;
	private int codemppd;
	private int codsim;
	private short codfilial;
	private int codemp;

	public EqitsimilarId() {
	}

	public EqitsimilarId(int codprod, short codfilialpd, int codemppd,
			int codsim, short codfilial, int codemp) {
		this.codprod = codprod;
		this.codfilialpd = codfilialpd;
		this.codemppd = codemppd;
		this.codsim = codsim;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public short getCodfilialpd() {
		return this.codfilialpd;
	}

	public void setCodfilialpd(short codfilialpd) {
		this.codfilialpd = codfilialpd;
	}

	public int getCodemppd() {
		return this.codemppd;
	}

	public void setCodemppd(int codemppd) {
		this.codemppd = codemppd;
	}

	public int getCodsim() {
		return this.codsim;
	}

	public void setCodsim(int codsim) {
		this.codsim = codsim;
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
		if (!(other instanceof EqitsimilarId))
			return false;
		EqitsimilarId castOther = (EqitsimilarId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilialpd() == castOther.getCodfilialpd())
				&& (this.getCodemppd() == castOther.getCodemppd())
				&& (this.getCodsim() == castOther.getCodsim())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilialpd();
		result = 37 * result + this.getCodemppd();
		result = 37 * result + this.getCodsim();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

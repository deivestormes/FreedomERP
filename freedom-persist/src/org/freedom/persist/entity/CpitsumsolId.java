package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * CpitsumsolId generated by hbm2java
 */
public class CpitsumsolId implements java.io.Serializable {

	private short coditsol;
	private int codsol;
	private short codfilialsc;
	private int codempsc;
	private int codsumsol;
	private short codfilial;
	private int codemp;

	public CpitsumsolId() {
	}

	public CpitsumsolId(short coditsol, int codsol, short codfilialsc,
			int codempsc, int codsumsol, short codfilial, int codemp) {
		this.coditsol = coditsol;
		this.codsol = codsol;
		this.codfilialsc = codfilialsc;
		this.codempsc = codempsc;
		this.codsumsol = codsumsol;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public short getCoditsol() {
		return this.coditsol;
	}

	public void setCoditsol(short coditsol) {
		this.coditsol = coditsol;
	}

	public int getCodsol() {
		return this.codsol;
	}

	public void setCodsol(int codsol) {
		this.codsol = codsol;
	}

	public short getCodfilialsc() {
		return this.codfilialsc;
	}

	public void setCodfilialsc(short codfilialsc) {
		this.codfilialsc = codfilialsc;
	}

	public int getCodempsc() {
		return this.codempsc;
	}

	public void setCodempsc(int codempsc) {
		this.codempsc = codempsc;
	}

	public int getCodsumsol() {
		return this.codsumsol;
	}

	public void setCodsumsol(int codsumsol) {
		this.codsumsol = codsumsol;
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
		if (!(other instanceof CpitsumsolId))
			return false;
		CpitsumsolId castOther = (CpitsumsolId) other;

		return (this.getCoditsol() == castOther.getCoditsol())
				&& (this.getCodsol() == castOther.getCodsol())
				&& (this.getCodfilialsc() == castOther.getCodfilialsc())
				&& (this.getCodempsc() == castOther.getCodempsc())
				&& (this.getCodsumsol() == castOther.getCodsumsol())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditsol();
		result = 37 * result + this.getCodsol();
		result = 37 * result + this.getCodfilialsc();
		result = 37 * result + this.getCodempsc();
		result = 37 * result + this.getCodsumsol();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

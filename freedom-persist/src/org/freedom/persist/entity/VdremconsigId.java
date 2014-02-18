package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * VdremconsigId generated by hbm2java
 */
public class VdremconsigId implements java.io.Serializable {

	private int codconsig;
	private short codremco;
	private short codfilial;
	private int codemp;

	public VdremconsigId() {
	}

	public VdremconsigId(int codconsig, short codremco, short codfilial,
			int codemp) {
		this.codconsig = codconsig;
		this.codremco = codremco;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodconsig() {
		return this.codconsig;
	}

	public void setCodconsig(int codconsig) {
		this.codconsig = codconsig;
	}

	public short getCodremco() {
		return this.codremco;
	}

	public void setCodremco(short codremco) {
		this.codremco = codremco;
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
		if (!(other instanceof VdremconsigId))
			return false;
		VdremconsigId castOther = (VdremconsigId) other;

		return (this.getCodconsig() == castOther.getCodconsig())
				&& (this.getCodremco() == castOther.getCodremco())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodconsig();
		result = 37 * result + this.getCodremco();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

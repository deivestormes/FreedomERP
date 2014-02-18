package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * VdvendaconsigId generated by hbm2java
 */
public class VdvendaconsigId implements java.io.Serializable {

	private int codconsig;
	private short codvendaco;
	private short codfilial;
	private int codemp;

	public VdvendaconsigId() {
	}

	public VdvendaconsigId(int codconsig, short codvendaco, short codfilial,
			int codemp) {
		this.codconsig = codconsig;
		this.codvendaco = codvendaco;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodconsig() {
		return this.codconsig;
	}

	public void setCodconsig(int codconsig) {
		this.codconsig = codconsig;
	}

	public short getCodvendaco() {
		return this.codvendaco;
	}

	public void setCodvendaco(short codvendaco) {
		this.codvendaco = codvendaco;
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
		if (!(other instanceof VdvendaconsigId))
			return false;
		VdvendaconsigId castOther = (VdvendaconsigId) other;

		return (this.getCodconsig() == castOther.getCodconsig())
				&& (this.getCodvendaco() == castOther.getCodvendaco())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodconsig();
		result = 37 * result + this.getCodvendaco();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

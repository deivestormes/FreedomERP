package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FntipocobId generated by hbm2java
 */
public class FntipocobId implements java.io.Serializable {

	private int codtipocob;
	private short codfilial;
	private int codemp;

	public FntipocobId() {
	}

	public FntipocobId(int codtipocob, short codfilial, int codemp) {
		this.codtipocob = codtipocob;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtipocob() {
		return this.codtipocob;
	}

	public void setCodtipocob(int codtipocob) {
		this.codtipocob = codtipocob;
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
		if (!(other instanceof FntipocobId))
			return false;
		FntipocobId castOther = (FntipocobId) other;

		return (this.getCodtipocob() == castOther.getCodtipocob())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipocob();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

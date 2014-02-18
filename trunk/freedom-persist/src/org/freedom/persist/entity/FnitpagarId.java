package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FnitpagarId generated by hbm2java
 */
public class FnitpagarId implements java.io.Serializable {

	private int codpag;
	private int nparcpag;
	private short codfilial;
	private int codemp;

	public FnitpagarId() {
	}

	public FnitpagarId(int codpag, int nparcpag, short codfilial, int codemp) {
		this.codpag = codpag;
		this.nparcpag = nparcpag;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodpag() {
		return this.codpag;
	}

	public void setCodpag(int codpag) {
		this.codpag = codpag;
	}

	public int getNparcpag() {
		return this.nparcpag;
	}

	public void setNparcpag(int nparcpag) {
		this.nparcpag = nparcpag;
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
		if (!(other instanceof FnitpagarId))
			return false;
		FnitpagarId castOther = (FnitpagarId) other;

		return (this.getCodpag() == castOther.getCodpag())
				&& (this.getNparcpag() == castOther.getNparcpag())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodpag();
		result = 37 * result + this.getNparcpag();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

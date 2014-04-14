package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SgtipoagendaId generated by hbm2java
 */
public class SgtipoagendaId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codtipoagd;

	public SgtipoagendaId() {
	}

	public SgtipoagendaId(int codemp, short codfilial, int codtipoagd) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codtipoagd = codtipoagd;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodtipoagd() {
		return this.codtipoagd;
	}

	public void setCodtipoagd(int codtipoagd) {
		this.codtipoagd = codtipoagd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgtipoagendaId))
			return false;
		SgtipoagendaId castOther = (SgtipoagendaId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodtipoagd() == castOther.getCodtipoagd());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodtipoagd();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * PptiporecId generated by hbm2java
 */
public class PptiporecId implements java.io.Serializable {

	private int codtprec;
	private short codfilial;
	private int codemp;

	public PptiporecId() {
	}

	public PptiporecId(int codtprec, short codfilial, int codemp) {
		this.codtprec = codtprec;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtprec() {
		return this.codtprec;
	}

	public void setCodtprec(int codtprec) {
		this.codtprec = codtprec;
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
		if (!(other instanceof PptiporecId))
			return false;
		PptiporecId castOther = (PptiporecId) other;

		return (this.getCodtprec() == castOther.getCodtprec())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtprec();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

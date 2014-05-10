package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * AtmodatendoId generated by hbm2java
 */
public class AtmodatendoId implements java.io.Serializable {

	private int codmodel;
	private short codfilial;
	private int codemp;

	public AtmodatendoId() {
	}

	public AtmodatendoId(int codmodel, short codfilial, int codemp) {
		this.codmodel = codmodel;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodmodel() {
		return this.codmodel;
	}

	public void setCodmodel(int codmodel) {
		this.codmodel = codmodel;
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
		if (!(other instanceof AtmodatendoId))
			return false;
		AtmodatendoId castOther = (AtmodatendoId) other;

		return (this.getCodmodel() == castOther.getCodmodel())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmodel();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

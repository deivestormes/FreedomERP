package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * SvosId generated by hbm2java
 */
public class SvosId implements java.io.Serializable {

	private int codos;
	private short codfilial;
	private int codemp;

	public SvosId() {
	}

	public SvosId(int codos, short codfilial, int codemp) {
		this.codos = codos;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodos() {
		return this.codos;
	}

	public void setCodos(int codos) {
		this.codos = codos;
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
		if (!(other instanceof SvosId))
			return false;
		SvosId castOther = (SvosId) other;

		return (this.getCodos() == castOther.getCodos())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodos();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

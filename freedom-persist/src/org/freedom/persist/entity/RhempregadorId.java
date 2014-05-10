package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * RhempregadorId generated by hbm2java
 */
public class RhempregadorId implements java.io.Serializable {

	private int codempr;
	private short codfilial;
	private int codemp;

	public RhempregadorId() {
	}

	public RhempregadorId(int codempr, short codfilial, int codemp) {
		this.codempr = codempr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodempr() {
		return this.codempr;
	}

	public void setCodempr(int codempr) {
		this.codempr = codempr;
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
		if (!(other instanceof RhempregadorId))
			return false;
		RhempregadorId castOther = (RhempregadorId) other;

		return (this.getCodempr() == castOther.getCodempr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodempr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

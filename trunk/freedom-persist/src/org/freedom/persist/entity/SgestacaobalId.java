package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * SgestacaobalId generated by hbm2java
 */
public class SgestacaobalId implements java.io.Serializable {

	private int codest;
	private short nrobal;
	private short codfilial;
	private int codemp;

	public SgestacaobalId() {
	}

	public SgestacaobalId(int codest, short nrobal, short codfilial, int codemp) {
		this.codest = codest;
		this.nrobal = nrobal;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodest() {
		return this.codest;
	}

	public void setCodest(int codest) {
		this.codest = codest;
	}

	public short getNrobal() {
		return this.nrobal;
	}

	public void setNrobal(short nrobal) {
		this.nrobal = nrobal;
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
		if (!(other instanceof SgestacaobalId))
			return false;
		SgestacaobalId castOther = (SgestacaobalId) other;

		return (this.getCodest() == castOther.getCodest())
				&& (this.getNrobal() == castOther.getNrobal())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodest();
		result = 37 * result + this.getNrobal();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

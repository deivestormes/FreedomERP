package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * EqitvargradeId generated by hbm2java
 */
public class EqitvargradeId implements java.io.Serializable {

	private int codvarg;
	private short seqitvarg;
	private short codfilial;
	private int codemp;

	public EqitvargradeId() {
	}

	public EqitvargradeId(int codvarg, short seqitvarg, short codfilial,
			int codemp) {
		this.codvarg = codvarg;
		this.seqitvarg = seqitvarg;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodvarg() {
		return this.codvarg;
	}

	public void setCodvarg(int codvarg) {
		this.codvarg = codvarg;
	}

	public short getSeqitvarg() {
		return this.seqitvarg;
	}

	public void setSeqitvarg(short seqitvarg) {
		this.seqitvarg = seqitvarg;
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
		if (!(other instanceof EqitvargradeId))
			return false;
		EqitvargradeId castOther = (EqitvargradeId) other;

		return (this.getCodvarg() == castOther.getCodvarg())
				&& (this.getSeqitvarg() == castOther.getSeqitvarg())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvarg();
		result = 37 * result + this.getSeqitvarg();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * PpopentradaId generated by hbm2java
 */
public class PpopentradaId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private short seqent;
	private short codfilial;
	private int codemp;

	public PpopentradaId() {
	}

	public PpopentradaId(int codop, short seqop, short seqent, short codfilial,
			int codemp) {
		this.codop = codop;
		this.seqop = seqop;
		this.seqent = seqent;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodop() {
		return this.codop;
	}

	public void setCodop(int codop) {
		this.codop = codop;
	}

	public short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(short seqop) {
		this.seqop = seqop;
	}

	public short getSeqent() {
		return this.seqent;
	}

	public void setSeqent(short seqent) {
		this.seqent = seqent;
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
		if (!(other instanceof PpopentradaId))
			return false;
		PpopentradaId castOther = (PpopentradaId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getSeqent() == castOther.getSeqent())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getSeqent();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

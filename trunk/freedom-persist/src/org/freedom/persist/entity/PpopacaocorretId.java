package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * PpopacaocorretId generated by hbm2java
 */
public class PpopacaocorretId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private short seqac;
	private short codfilial;
	private int codemp;

	public PpopacaocorretId() {
	}

	public PpopacaocorretId(int codop, short seqop, short seqac,
			short codfilial, int codemp) {
		this.codop = codop;
		this.seqop = seqop;
		this.seqac = seqac;
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

	public short getSeqac() {
		return this.seqac;
	}

	public void setSeqac(short seqac) {
		this.seqac = seqac;
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
		if (!(other instanceof PpopacaocorretId))
			return false;
		PpopacaocorretId castOther = (PpopacaocorretId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getSeqac() == castOther.getSeqac())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getSeqac();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

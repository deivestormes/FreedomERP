package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * PpopcqId generated by hbm2java
 */
public class PpopcqId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private int seqopcq;
	private short codfilial;
	private int codemp;

	public PpopcqId() {
	}

	public PpopcqId(int codop, short seqop, int seqopcq, short codfilial,
			int codemp) {
		this.codop = codop;
		this.seqop = seqop;
		this.seqopcq = seqopcq;
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

	public int getSeqopcq() {
		return this.seqopcq;
	}

	public void setSeqopcq(int seqopcq) {
		this.seqopcq = seqopcq;
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
		if (!(other instanceof PpopcqId))
			return false;
		PpopcqId castOther = (PpopcqId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getSeqopcq() == castOther.getSeqopcq())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getSeqopcq();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * FnchequeId generated by hbm2java
 */
public class FnchequeId implements java.io.Serializable {

	private int seqcheq;
	private short codfilial;
	private int codemp;

	public FnchequeId() {
	}

	public FnchequeId(int seqcheq, short codfilial, int codemp) {
		this.seqcheq = seqcheq;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getSeqcheq() {
		return this.seqcheq;
	}

	public void setSeqcheq(int seqcheq) {
		this.seqcheq = seqcheq;
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
		if (!(other instanceof FnchequeId))
			return false;
		FnchequeId castOther = (FnchequeId) other;

		return (this.getSeqcheq() == castOther.getSeqcheq())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSeqcheq();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

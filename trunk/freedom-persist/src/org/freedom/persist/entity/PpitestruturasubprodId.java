package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * PpitestruturasubprodId generated by hbm2java
 */
public class PpitestruturasubprodId implements java.io.Serializable {

	private int codprod;
	private short seqest;
	private short seqitestsp;
	private short codfilial;
	private int codemp;

	public PpitestruturasubprodId() {
	}

	public PpitestruturasubprodId(int codprod, short seqest, short seqitestsp,
			short codfilial, int codemp) {
		this.codprod = codprod;
		this.seqest = seqest;
		this.seqitestsp = seqitestsp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public short getSeqest() {
		return this.seqest;
	}

	public void setSeqest(short seqest) {
		this.seqest = seqest;
	}

	public short getSeqitestsp() {
		return this.seqitestsp;
	}

	public void setSeqitestsp(short seqitestsp) {
		this.seqitestsp = seqitestsp;
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
		if (!(other instanceof PpitestruturasubprodId))
			return false;
		PpitestruturasubprodId castOther = (PpitestruturasubprodId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getSeqest() == castOther.getSeqest())
				&& (this.getSeqitestsp() == castOther.getSeqitestsp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getSeqest();
		result = 37 * result + this.getSeqitestsp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

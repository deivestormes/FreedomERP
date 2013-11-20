package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * PpestrufaseId generated by hbm2java
 */
public class PpestrufaseId implements java.io.Serializable {

	private int codprod;
	private short seqest;
	private short seqef;
	private short codfilial;
	private int codemp;
	private int codfase;
	private short codfilialfs;
	private int codempfs;

	public PpestrufaseId() {
	}

	public PpestrufaseId(int codprod, short seqest, short seqef,
			short codfilial, int codemp, int codfase, short codfilialfs,
			int codempfs) {
		this.codprod = codprod;
		this.seqest = seqest;
		this.seqef = seqef;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codfase = codfase;
		this.codfilialfs = codfilialfs;
		this.codempfs = codempfs;
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

	public short getSeqef() {
		return this.seqef;
	}

	public void setSeqef(short seqef) {
		this.seqef = seqef;
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

	public int getCodfase() {
		return this.codfase;
	}

	public void setCodfase(int codfase) {
		this.codfase = codfase;
	}

	public short getCodfilialfs() {
		return this.codfilialfs;
	}

	public void setCodfilialfs(short codfilialfs) {
		this.codfilialfs = codfilialfs;
	}

	public int getCodempfs() {
		return this.codempfs;
	}

	public void setCodempfs(int codempfs) {
		this.codempfs = codempfs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PpestrufaseId))
			return false;
		PpestrufaseId castOther = (PpestrufaseId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getSeqest() == castOther.getSeqest())
				&& (this.getSeqef() == castOther.getSeqef())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfase() == castOther.getCodfase())
				&& (this.getCodfilialfs() == castOther.getCodfilialfs())
				&& (this.getCodempfs() == castOther.getCodempfs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getSeqest();
		result = 37 * result + this.getSeqef();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfase();
		result = 37 * result + this.getCodfilialfs();
		result = 37 * result + this.getCodempfs();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * CpitcompraserieId generated by hbm2java
 */
public class CpitcompraserieId implements java.io.Serializable {

	private int codcompra;
	private int coditcompra;
	private int seqitserie;
	private short codfilial;
	private int codemp;

	public CpitcompraserieId() {
	}

	public CpitcompraserieId(int codcompra, int coditcompra, int seqitserie,
			short codfilial, int codemp) {
		this.codcompra = codcompra;
		this.coditcompra = coditcompra;
		this.seqitserie = seqitserie;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
	}

	public int getSeqitserie() {
		return this.seqitserie;
	}

	public void setSeqitserie(int seqitserie) {
		this.seqitserie = seqitserie;
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
		if (!(other instanceof CpitcompraserieId))
			return false;
		CpitcompraserieId castOther = (CpitcompraserieId) other;

		return (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getSeqitserie() == castOther.getSeqitserie())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getSeqitserie();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

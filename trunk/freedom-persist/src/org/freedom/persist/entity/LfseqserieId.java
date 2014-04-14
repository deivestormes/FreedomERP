package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * LfseqserieId generated by hbm2java
 */
public class LfseqserieId implements java.io.Serializable {

	private String serie;
	private short codfilial;
	private int codemp;
	private short seqserie;
	private short codfilialss;
	private int codempss;

	public LfseqserieId() {
	}

	public LfseqserieId(String serie, short codfilial, int codemp,
			short seqserie, short codfilialss, int codempss) {
		this.serie = serie;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.seqserie = seqserie;
		this.codfilialss = codfilialss;
		this.codempss = codempss;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
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

	public short getSeqserie() {
		return this.seqserie;
	}

	public void setSeqserie(short seqserie) {
		this.seqserie = seqserie;
	}

	public short getCodfilialss() {
		return this.codfilialss;
	}

	public void setCodfilialss(short codfilialss) {
		this.codfilialss = codfilialss;
	}

	public int getCodempss() {
		return this.codempss;
	}

	public void setCodempss(int codempss) {
		this.codempss = codempss;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LfseqserieId))
			return false;
		LfseqserieId castOther = (LfseqserieId) other;

		return ((this.getSerie() == castOther.getSerie()) || (this.getSerie() != null
				&& castOther.getSerie() != null && this.getSerie().equals(
				castOther.getSerie())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getSeqserie() == castOther.getSeqserie())
				&& (this.getCodfilialss() == castOther.getCodfilialss())
				&& (this.getCodempss() == castOther.getCodempss());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSerie() == null ? 0 : this.getSerie().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getSeqserie();
		result = 37 * result + this.getCodfilialss();
		result = 37 * result + this.getCodempss();
		return result;
	}

}

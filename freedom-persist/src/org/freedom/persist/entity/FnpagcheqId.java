package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * FnpagcheqId generated by hbm2java
 */
public class FnpagcheqId implements java.io.Serializable {

	private int seqcheq;
	private int codpag;
	private short nparcpag;
	private short codfilialch;
	private int codempch;
	private short codfilial;
	private int codemp;

	public FnpagcheqId() {
	}

	public FnpagcheqId(int seqcheq, int codpag, short nparcpag,
			short codfilialch, int codempch, short codfilial, int codemp) {
		this.seqcheq = seqcheq;
		this.codpag = codpag;
		this.nparcpag = nparcpag;
		this.codfilialch = codfilialch;
		this.codempch = codempch;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getSeqcheq() {
		return this.seqcheq;
	}

	public void setSeqcheq(int seqcheq) {
		this.seqcheq = seqcheq;
	}

	public int getCodpag() {
		return this.codpag;
	}

	public void setCodpag(int codpag) {
		this.codpag = codpag;
	}

	public short getNparcpag() {
		return this.nparcpag;
	}

	public void setNparcpag(short nparcpag) {
		this.nparcpag = nparcpag;
	}

	public short getCodfilialch() {
		return this.codfilialch;
	}

	public void setCodfilialch(short codfilialch) {
		this.codfilialch = codfilialch;
	}

	public int getCodempch() {
		return this.codempch;
	}

	public void setCodempch(int codempch) {
		this.codempch = codempch;
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
		if (!(other instanceof FnpagcheqId))
			return false;
		FnpagcheqId castOther = (FnpagcheqId) other;

		return (this.getSeqcheq() == castOther.getSeqcheq())
				&& (this.getCodpag() == castOther.getCodpag())
				&& (this.getNparcpag() == castOther.getNparcpag())
				&& (this.getCodfilialch() == castOther.getCodfilialch())
				&& (this.getCodempch() == castOther.getCodempch())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSeqcheq();
		result = 37 * result + this.getCodpag();
		result = 37 * result + this.getNparcpag();
		result = 37 * result + this.getCodfilialch();
		result = 37 * result + this.getCodempch();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

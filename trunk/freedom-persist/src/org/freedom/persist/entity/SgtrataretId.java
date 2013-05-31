package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgtrataretId generated by hbm2java
 */
@Embeddable
public class SgtrataretId implements java.io.Serializable {

	private int codproc;
	private short codtratret;
	private short seqitproc;
	private short codfilial;
	private int codemp;

	public SgtrataretId() {
	}

	public SgtrataretId(int codproc, short codtratret, short seqitproc,
			short codfilial, int codemp) {
		this.codproc = codproc;
		this.codtratret = codtratret;
		this.seqitproc = seqitproc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPROC", nullable = false)
	public int getCodproc() {
		return this.codproc;
	}

	public void setCodproc(int codproc) {
		this.codproc = codproc;
	}

	@Column(name = "CODTRATRET", nullable = false)
	public short getCodtratret() {
		return this.codtratret;
	}

	public void setCodtratret(short codtratret) {
		this.codtratret = codtratret;
	}

	@Column(name = "SEQITPROC", nullable = false)
	public short getSeqitproc() {
		return this.seqitproc;
	}

	public void setSeqitproc(short seqitproc) {
		this.seqitproc = seqitproc;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
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
		if (!(other instanceof SgtrataretId))
			return false;
		SgtrataretId castOther = (SgtrataretId) other;

		return (this.getCodproc() == castOther.getCodproc())
				&& (this.getCodtratret() == castOther.getCodtratret())
				&& (this.getSeqitproc() == castOther.getSeqitproc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodproc();
		result = 37 * result + this.getCodtratret();
		result = 37 * result + this.getSeqitproc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

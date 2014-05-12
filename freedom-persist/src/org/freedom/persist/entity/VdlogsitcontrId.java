package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdlogsitcontrId generated by hbm2java
 */
@Embeddable
public class VdlogsitcontrId implements java.io.Serializable {

	private int codcontr;
	private int seqlog;
	private short codfilial;
	private int codemp;

	public VdlogsitcontrId() {
	}

	public VdlogsitcontrId(int codcontr, int seqlog, short codfilial, int codemp) {
		this.codcontr = codcontr;
		this.seqlog = seqlog;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCONTR", nullable = false)
	public int getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(int codcontr) {
		this.codcontr = codcontr;
	}

	@Column(name = "SEQLOG", nullable = false)
	public int getSeqlog() {
		return this.seqlog;
	}

	public void setSeqlog(int seqlog) {
		this.seqlog = seqlog;
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
		if (!(other instanceof VdlogsitcontrId))
			return false;
		VdlogsitcontrId castOther = (VdlogsitcontrId) other;

		return (this.getCodcontr() == castOther.getCodcontr())
				&& (this.getSeqlog() == castOther.getSeqlog())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcontr();
		result = 37 * result + this.getSeqlog();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

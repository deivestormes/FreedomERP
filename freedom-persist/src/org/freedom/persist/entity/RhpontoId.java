package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * RhpontoId generated by hbm2java
 */
public class RhpontoId implements java.io.Serializable {

	private Date dtpt;
	private Date hrpt;
	private int matempr;
	private short codfilial;
	private int codemp;

	public RhpontoId() {
	}

	public RhpontoId(Date dtpt, Date hrpt, int matempr, short codfilial,
			int codemp) {
		this.dtpt = dtpt;
		this.hrpt = hrpt;
		this.matempr = matempr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public Date getDtpt() {
		return this.dtpt;
	}

	public void setDtpt(Date dtpt) {
		this.dtpt = dtpt;
	}

	public Date getHrpt() {
		return this.hrpt;
	}

	public void setHrpt(Date hrpt) {
		this.hrpt = hrpt;
	}

	public int getMatempr() {
		return this.matempr;
	}

	public void setMatempr(int matempr) {
		this.matempr = matempr;
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
		if (!(other instanceof RhpontoId))
			return false;
		RhpontoId castOther = (RhpontoId) other;

		return ((this.getDtpt() == castOther.getDtpt()) || (this.getDtpt() != null
				&& castOther.getDtpt() != null && this.getDtpt().equals(
				castOther.getDtpt())))
				&& ((this.getHrpt() == castOther.getHrpt()) || (this.getHrpt() != null
						&& castOther.getHrpt() != null && this.getHrpt()
						.equals(castOther.getHrpt())))
				&& (this.getMatempr() == castOther.getMatempr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDtpt() == null ? 0 : this.getDtpt().hashCode());
		result = 37 * result
				+ (getHrpt() == null ? 0 : this.getHrpt().hashCode());
		result = 37 * result + this.getMatempr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

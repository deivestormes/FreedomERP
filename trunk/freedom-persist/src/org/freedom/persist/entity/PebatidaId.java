package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * PebatidaId generated by hbm2java
 */
public class PebatidaId implements java.io.Serializable {

	private Date hbat;
	private Date dtbat;
	private short codfilial;
	private int codemp;
	private int matempr;
	private int codempep;
	private short codfilialep;

	public PebatidaId() {
	}

	public PebatidaId(Date hbat, Date dtbat, short codfilial, int codemp,
			int matempr, int codempep, short codfilialep) {
		this.hbat = hbat;
		this.dtbat = dtbat;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.matempr = matempr;
		this.codempep = codempep;
		this.codfilialep = codfilialep;
	}

	public Date getHbat() {
		return this.hbat;
	}

	public void setHbat(Date hbat) {
		this.hbat = hbat;
	}

	public Date getDtbat() {
		return this.dtbat;
	}

	public void setDtbat(Date dtbat) {
		this.dtbat = dtbat;
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

	public int getMatempr() {
		return this.matempr;
	}

	public void setMatempr(int matempr) {
		this.matempr = matempr;
	}

	public int getCodempep() {
		return this.codempep;
	}

	public void setCodempep(int codempep) {
		this.codempep = codempep;
	}

	public short getCodfilialep() {
		return this.codfilialep;
	}

	public void setCodfilialep(short codfilialep) {
		this.codfilialep = codfilialep;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PebatidaId))
			return false;
		PebatidaId castOther = (PebatidaId) other;

		return ((this.getHbat() == castOther.getHbat()) || (this.getHbat() != null
				&& castOther.getHbat() != null && this.getHbat().equals(
				castOther.getHbat())))
				&& ((this.getDtbat() == castOther.getDtbat()) || (this
						.getDtbat() != null && castOther.getDtbat() != null && this
						.getDtbat().equals(castOther.getDtbat())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getMatempr() == castOther.getMatempr())
				&& (this.getCodempep() == castOther.getCodempep())
				&& (this.getCodfilialep() == castOther.getCodfilialep());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHbat() == null ? 0 : this.getHbat().hashCode());
		result = 37 * result
				+ (getDtbat() == null ? 0 : this.getDtbat().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getMatempr();
		result = 37 * result + this.getCodempep();
		result = 37 * result + this.getCodfilialep();
		return result;
	}

}

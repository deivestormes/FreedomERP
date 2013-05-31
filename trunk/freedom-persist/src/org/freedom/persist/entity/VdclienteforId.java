package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdclienteforId generated by hbm2java
 */
@Embeddable
public class VdclienteforId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;
	private int codfor;
	private short codfilialfr;
	private int codempfr;

	public VdclienteforId() {
	}

	public VdclienteforId(int codcli, short codfilial, int codemp, int codfor,
			short codfilialfr, int codempfr) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codfor = codfor;
		this.codfilialfr = codfilialfr;
		this.codempfr = codempfr;
	}

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
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

	@Column(name = "CODFOR", nullable = false)
	public int getCodfor() {
		return this.codfor;
	}

	public void setCodfor(int codfor) {
		this.codfor = codfor;
	}

	@Column(name = "CODFILIALFR", nullable = false)
	public short getCodfilialfr() {
		return this.codfilialfr;
	}

	public void setCodfilialfr(short codfilialfr) {
		this.codfilialfr = codfilialfr;
	}

	@Column(name = "CODEMPFR", nullable = false)
	public int getCodempfr() {
		return this.codempfr;
	}

	public void setCodempfr(int codempfr) {
		this.codempfr = codempfr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdclienteforId))
			return false;
		VdclienteforId castOther = (VdclienteforId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfor() == castOther.getCodfor())
				&& (this.getCodfilialfr() == castOther.getCodfilialfr())
				&& (this.getCodempfr() == castOther.getCodempfr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfor();
		result = 37 * result + this.getCodfilialfr();
		result = 37 * result + this.getCodempfr();
		return result;
	}

}

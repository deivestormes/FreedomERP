package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SgeqvcliforId generated by hbm2java
 */
public class SgeqvcliforId implements java.io.Serializable {

	private int codcli;
	private int codfilialcl;
	private int codempcl;
	private int codfor;
	private int codfilialfr;
	private int codempfr;

	public SgeqvcliforId() {
	}

	public SgeqvcliforId(int codcli, int codfilialcl, int codempcl, int codfor,
			int codfilialfr, int codempfr) {
		this.codcli = codcli;
		this.codfilialcl = codfilialcl;
		this.codempcl = codempcl;
		this.codfor = codfor;
		this.codfilialfr = codfilialfr;
		this.codempfr = codempfr;
	}

	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	public int getCodfilialcl() {
		return this.codfilialcl;
	}

	public void setCodfilialcl(int codfilialcl) {
		this.codfilialcl = codfilialcl;
	}

	public int getCodempcl() {
		return this.codempcl;
	}

	public void setCodempcl(int codempcl) {
		this.codempcl = codempcl;
	}

	public int getCodfor() {
		return this.codfor;
	}

	public void setCodfor(int codfor) {
		this.codfor = codfor;
	}

	public int getCodfilialfr() {
		return this.codfilialfr;
	}

	public void setCodfilialfr(int codfilialfr) {
		this.codfilialfr = codfilialfr;
	}

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
		if (!(other instanceof SgeqvcliforId))
			return false;
		SgeqvcliforId castOther = (SgeqvcliforId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilialcl() == castOther.getCodfilialcl())
				&& (this.getCodempcl() == castOther.getCodempcl())
				&& (this.getCodfor() == castOther.getCodfor())
				&& (this.getCodfilialfr() == castOther.getCodfilialfr())
				&& (this.getCodempfr() == castOther.getCodempfr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilialcl();
		result = 37 * result + this.getCodempcl();
		result = 37 * result + this.getCodfor();
		result = 37 * result + this.getCodfilialfr();
		result = 37 * result + this.getCodempfr();
		return result;
	}

}

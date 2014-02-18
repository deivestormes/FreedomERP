package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * VdcliautpId generated by hbm2java
 */
public class VdcliautpId implements java.io.Serializable {

	private int codcli;
	private short codautp;
	private short codfilial;
	private int codemp;

	public VdcliautpId() {
	}

	public VdcliautpId(int codcli, short codautp, short codfilial, int codemp) {
		this.codcli = codcli;
		this.codautp = codautp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	public short getCodautp() {
		return this.codautp;
	}

	public void setCodautp(short codautp) {
		this.codautp = codautp;
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
		if (!(other instanceof VdcliautpId))
			return false;
		VdcliautpId castOther = (VdcliautpId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodautp() == castOther.getCodautp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodautp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * VdclienteId generated by hbm2java
 */
public class VdclienteId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;

	public VdclienteId() {
	}

	public VdclienteId(int codcli, short codfilial, int codemp) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
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
		if (!(other instanceof VdclienteId))
			return false;
		VdclienteId castOther = (VdclienteId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

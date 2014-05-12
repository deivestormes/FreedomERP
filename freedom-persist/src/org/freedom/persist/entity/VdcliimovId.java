package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdcliimovId generated by hbm2java
 */
@Embeddable
public class VdcliimovId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;
	private short codimov;

	public VdcliimovId() {
	}

	public VdcliimovId(int codcli, short codfilial, int codemp, short codimov) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codimov = codimov;
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

	@Column(name = "CODIMOV", nullable = false)
	public short getCodimov() {
		return this.codimov;
	}

	public void setCodimov(short codimov) {
		this.codimov = codimov;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdcliimovId))
			return false;
		VdcliimovId castOther = (VdcliimovId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodimov() == castOther.getCodimov());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodimov();
		return result;
	}

}

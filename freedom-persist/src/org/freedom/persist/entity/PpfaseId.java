package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PpfaseId generated by hbm2java
 */
@Embeddable
public class PpfaseId implements java.io.Serializable {

	private int codfase;
	private short codfilial;
	private int codemp;

	public PpfaseId() {
	}

	public PpfaseId(int codfase, short codfilial, int codemp) {
		this.codfase = codfase;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODFASE", nullable = false)
	public int getCodfase() {
		return this.codfase;
	}

	public void setCodfase(int codfase) {
		this.codfase = codfase;
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
		if (!(other instanceof PpfaseId))
			return false;
		PpfaseId castOther = (PpfaseId) other;

		return (this.getCodfase() == castOther.getCodfase())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfase();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

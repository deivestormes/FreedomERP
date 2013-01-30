package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqvargradeId generated by hbm2java
 */
@Embeddable
public class EqvargradeId implements java.io.Serializable {

	private int codvarg;
	private short codfilial;
	private int codemp;

	public EqvargradeId() {
	}

	public EqvargradeId(int codvarg, short codfilial, int codemp) {
		this.codvarg = codvarg;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODVARG", nullable = false)
	public int getCodvarg() {
		return this.codvarg;
	}

	public void setCodvarg(int codvarg) {
		this.codvarg = codvarg;
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
		if (!(other instanceof EqvargradeId))
			return false;
		EqvargradeId castOther = (EqvargradeId) other;

		return (this.getCodvarg() == castOther.getCodvarg())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvarg();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

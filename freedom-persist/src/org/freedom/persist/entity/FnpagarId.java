package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnpagarId generated by hbm2java
 */
@Embeddable
public class FnpagarId implements java.io.Serializable {

	private int codpag;
	private short codfilial;
	private int codemp;

	public FnpagarId() {
	}

	public FnpagarId(int codpag, short codfilial, int codemp) {
		this.codpag = codpag;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPAG", nullable = false)
	public int getCodpag() {
		return this.codpag;
	}

	public void setCodpag(int codpag) {
		this.codpag = codpag;
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
		if (!(other instanceof FnpagarId))
			return false;
		FnpagarId castOther = (FnpagarId) other;

		return (this.getCodpag() == castOther.getCodpag())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodpag();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

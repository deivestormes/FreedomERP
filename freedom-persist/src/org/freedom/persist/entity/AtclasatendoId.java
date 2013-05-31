package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AtclasatendoId generated by hbm2java
 */
@Embeddable
public class AtclasatendoId implements java.io.Serializable {

	private int codclasatendo;
	private short codfilial;
	private int codemp;

	public AtclasatendoId() {
	}

	public AtclasatendoId(int codclasatendo, short codfilial, int codemp) {
		this.codclasatendo = codclasatendo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCLASATENDO", nullable = false)
	public int getCodclasatendo() {
		return this.codclasatendo;
	}

	public void setCodclasatendo(int codclasatendo) {
		this.codclasatendo = codclasatendo;
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
		if (!(other instanceof AtclasatendoId))
			return false;
		AtclasatendoId castOther = (AtclasatendoId) other;

		return (this.getCodclasatendo() == castOther.getCodclasatendo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodclasatendo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

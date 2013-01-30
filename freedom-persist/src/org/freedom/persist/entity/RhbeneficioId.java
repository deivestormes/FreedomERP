package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhbeneficioId generated by hbm2java
 */
@Embeddable
public class RhbeneficioId implements java.io.Serializable {

	private int codbenef;
	private short codfilial;
	private int codemp;

	public RhbeneficioId() {
	}

	public RhbeneficioId(int codbenef, short codfilial, int codemp) {
		this.codbenef = codbenef;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODBENEF", nullable = false)
	public int getCodbenef() {
		return this.codbenef;
	}

	public void setCodbenef(int codbenef) {
		this.codbenef = codbenef;
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
		if (!(other instanceof RhbeneficioId))
			return false;
		RhbeneficioId castOther = (RhbeneficioId) other;

		return (this.getCodbenef() == castOther.getCodbenef())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodbenef();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

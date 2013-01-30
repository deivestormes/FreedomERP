package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Sgprefere4Id generated by hbm2java
 */
@Embeddable
public class Sgprefere4Id implements java.io.Serializable {

	private int codfilial;
	private int codemp;

	public Sgprefere4Id() {
	}

	public Sgprefere4Id(int codfilial, int codemp) {
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof Sgprefere4Id))
			return false;
		Sgprefere4Id castOther = (Sgprefere4Id) other;

		return (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

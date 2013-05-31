package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Sgprefere5Id generated by hbm2java
 */
@Embeddable
public class Sgprefere5Id implements java.io.Serializable {

	private int codfilial;
	private int codemp;

	public Sgprefere5Id() {
	}

	public Sgprefere5Id(int codfilial, int codemp) {
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
		if (!(other instanceof Sgprefere5Id))
			return false;
		Sgprefere5Id castOther = (Sgprefere5Id) other;

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

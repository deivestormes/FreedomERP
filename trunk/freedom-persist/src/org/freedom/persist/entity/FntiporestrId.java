package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FntiporestrId generated by hbm2java
 */
@Embeddable
public class FntiporestrId implements java.io.Serializable {

	private int codtprestr;
	private short codfilial;
	private int codemp;

	public FntiporestrId() {
	}

	public FntiporestrId(int codtprestr, short codfilial, int codemp) {
		this.codtprestr = codtprestr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTPRESTR", nullable = false)
	public int getCodtprestr() {
		return this.codtprestr;
	}

	public void setCodtprestr(int codtprestr) {
		this.codtprestr = codtprestr;
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
		if (!(other instanceof FntiporestrId))
			return false;
		FntiporestrId castOther = (FntiporestrId) other;

		return (this.getCodtprestr() == castOther.getCodtprestr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtprestr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

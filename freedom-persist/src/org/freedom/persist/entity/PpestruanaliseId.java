package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PpestruanaliseId generated by hbm2java
 */
@Embeddable
public class PpestruanaliseId implements java.io.Serializable {

	private int codestanalise;
	private short codfilial;
	private int codemp;

	public PpestruanaliseId() {
	}

	public PpestruanaliseId(int codestanalise, short codfilial, int codemp) {
		this.codestanalise = codestanalise;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODESTANALISE", nullable = false)
	public int getCodestanalise() {
		return this.codestanalise;
	}

	public void setCodestanalise(int codestanalise) {
		this.codestanalise = codestanalise;
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
		if (!(other instanceof PpestruanaliseId))
			return false;
		PpestruanaliseId castOther = (PpestruanaliseId) other;

		return (this.getCodestanalise() == castOther.getCodestanalise())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodestanalise();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AttipoatendId generated by hbm2java
 */
@Embeddable
public class AttipoatendId implements java.io.Serializable {

	private int codtpatend;
	private short codfilial;
	private int codemp;

	public AttipoatendId() {
	}

	public AttipoatendId(int codtpatend, short codfilial, int codemp) {
		this.codtpatend = codtpatend;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTPATEND", nullable = false)
	public int getCodtpatend() {
		return this.codtpatend;
	}

	public void setCodtpatend(int codtpatend) {
		this.codtpatend = codtpatend;
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
		if (!(other instanceof AttipoatendId))
			return false;
		AttipoatendId castOther = (AttipoatendId) other;

		return (this.getCodtpatend() == castOther.getCodtpatend())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtpatend();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

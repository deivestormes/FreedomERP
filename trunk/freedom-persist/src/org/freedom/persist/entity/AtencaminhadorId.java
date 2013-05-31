package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AtencaminhadorId generated by hbm2java
 */
@Embeddable
public class AtencaminhadorId implements java.io.Serializable {

	private int codenc;
	private short codfilial;
	private int codemp;

	public AtencaminhadorId() {
	}

	public AtencaminhadorId(int codenc, short codfilial, int codemp) {
		this.codenc = codenc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODENC", nullable = false)
	public int getCodenc() {
		return this.codenc;
	}

	public void setCodenc(int codenc) {
		this.codenc = codenc;
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
		if (!(other instanceof AtencaminhadorId))
			return false;
		AtencaminhadorId castOther = (AtencaminhadorId) other;

		return (this.getCodenc() == castOther.getCodenc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodenc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

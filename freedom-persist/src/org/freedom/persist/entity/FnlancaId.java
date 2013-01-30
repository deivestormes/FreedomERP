package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnlancaId generated by hbm2java
 */
@Embeddable
public class FnlancaId implements java.io.Serializable {

	private int codlanca;
	private short codfilial;
	private int codemp;

	public FnlancaId() {
	}

	public FnlancaId(int codlanca, short codfilial, int codemp) {
		this.codlanca = codlanca;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODLANCA", nullable = false)
	public int getCodlanca() {
		return this.codlanca;
	}

	public void setCodlanca(int codlanca) {
		this.codlanca = codlanca;
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
		if (!(other instanceof FnlancaId))
			return false;
		FnlancaId castOther = (FnlancaId) other;

		return (this.getCodlanca() == castOther.getCodlanca())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodlanca();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

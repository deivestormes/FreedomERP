package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrpessoaId generated by hbm2java
 */
@Embeddable
public class CrpessoaId implements java.io.Serializable {

	private String emailpessoa;
	private short codfilial;
	private int codemp;

	public CrpessoaId() {
	}

	public CrpessoaId(String emailpessoa, short codfilial, int codemp) {
		this.emailpessoa = emailpessoa;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "EMAILPESSOA", nullable = false, length = 128)
	public String getEmailpessoa() {
		return this.emailpessoa;
	}

	public void setEmailpessoa(String emailpessoa) {
		this.emailpessoa = emailpessoa;
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
		if (!(other instanceof CrpessoaId))
			return false;
		CrpessoaId castOther = (CrpessoaId) other;

		return ((this.getEmailpessoa() == castOther.getEmailpessoa()) || (this
				.getEmailpessoa() != null && castOther.getEmailpessoa() != null && this
				.getEmailpessoa().equals(castOther.getEmailpessoa())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmailpessoa() == null ? 0 : this.getEmailpessoa()
						.hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

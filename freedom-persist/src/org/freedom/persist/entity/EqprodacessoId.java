package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqprodacessoId generated by hbm2java
 */
@Embeddable
public class EqprodacessoId implements java.io.Serializable {

	private int codprod;
	private int codpa;
	private String tipopa;
	private short codfilial;
	private int codemp;

	public EqprodacessoId() {
	}

	public EqprodacessoId(int codprod, int codpa, String tipopa,
			short codfilial, int codemp) {
		this.codprod = codprod;
		this.codpa = codpa;
		this.tipopa = tipopa;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPROD", nullable = false)
	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	@Column(name = "CODPA", nullable = false)
	public int getCodpa() {
		return this.codpa;
	}

	public void setCodpa(int codpa) {
		this.codpa = codpa;
	}

	@Column(name = "TIPOPA", nullable = false, length = 3)
	public String getTipopa() {
		return this.tipopa;
	}

	public void setTipopa(String tipopa) {
		this.tipopa = tipopa;
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
		if (!(other instanceof EqprodacessoId))
			return false;
		EqprodacessoId castOther = (EqprodacessoId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodpa() == castOther.getCodpa())
				&& ((this.getTipopa() == castOther.getTipopa()) || (this
						.getTipopa() != null && castOther.getTipopa() != null && this
						.getTipopa().equals(castOther.getTipopa())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodpa();
		result = 37 * result
				+ (getTipopa() == null ? 0 : this.getTipopa().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpdevolucaoId generated by hbm2java
 */
@Embeddable
public class CpdevolucaoId implements java.io.Serializable {

	private int coditcompra;
	private int codcompra;
	private short codfilial;
	private int codemp;
	private int codvenda;
	private int coditvenda;
	private String tipovenda;
	private short codfilialvd;
	private int codempvd;

	public CpdevolucaoId() {
	}

	public CpdevolucaoId(int coditcompra, int codcompra, short codfilial,
			int codemp, int codvenda, int coditvenda, String tipovenda,
			short codfilialvd, int codempvd) {
		this.coditcompra = coditcompra;
		this.codcompra = codcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codvenda = codvenda;
		this.coditvenda = coditvenda;
		this.tipovenda = tipovenda;
		this.codfilialvd = codfilialvd;
		this.codempvd = codempvd;
	}

	@Column(name = "CODITCOMPRA", nullable = false)
	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
	}

	@Column(name = "CODCOMPRA", nullable = false)
	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
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

	@Column(name = "CODVENDA", nullable = false)
	public int getCodvenda() {
		return this.codvenda;
	}

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	@Column(name = "CODITVENDA", nullable = false)
	public int getCoditvenda() {
		return this.coditvenda;
	}

	public void setCoditvenda(int coditvenda) {
		this.coditvenda = coditvenda;
	}

	@Column(name = "TIPOVENDA", nullable = false, length = 1)
	public String getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(String tipovenda) {
		this.tipovenda = tipovenda;
	}

	@Column(name = "CODFILIALVD", nullable = false)
	public short getCodfilialvd() {
		return this.codfilialvd;
	}

	public void setCodfilialvd(short codfilialvd) {
		this.codfilialvd = codfilialvd;
	}

	@Column(name = "CODEMPVD", nullable = false)
	public int getCodempvd() {
		return this.codempvd;
	}

	public void setCodempvd(int codempvd) {
		this.codempvd = codempvd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpdevolucaoId))
			return false;
		CpdevolucaoId castOther = (CpdevolucaoId) other;

		return (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodvenda() == castOther.getCodvenda())
				&& (this.getCoditvenda() == castOther.getCoditvenda())
				&& ((this.getTipovenda() == castOther.getTipovenda()) || (this
						.getTipovenda() != null
						&& castOther.getTipovenda() != null && this
						.getTipovenda().equals(castOther.getTipovenda())))
				&& (this.getCodfilialvd() == castOther.getCodfilialvd())
				&& (this.getCodempvd() == castOther.getCodempvd());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodvenda();
		result = 37 * result + this.getCoditvenda();
		result = 37 * result
				+ (getTipovenda() == null ? 0 : this.getTipovenda().hashCode());
		result = 37 * result + this.getCodfilialvd();
		result = 37 * result + this.getCodempvd();
		return result;
	}

}

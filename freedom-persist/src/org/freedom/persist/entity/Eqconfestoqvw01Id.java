package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Eqconfestoqvw01Id generated by hbm2java
 */
@Embeddable
public class Eqconfestoqvw01Id implements java.io.Serializable {

	private Integer codemp;
	private Short codfilial;
	private Character ativoprod;
	private String descprod;
	private Integer codprod;
	private String refprod;
	private BigDecimal sldliqprod;
	private BigDecimal qtdinvp;
	private BigDecimal qtditcompra;
	private BigDecimal qtdfinalprodop;
	private BigDecimal qtdexpitrma;
	private BigDecimal qtditvenda;
	private BigDecimal sldmovprod;
	private BigDecimal sldliqprodax;

	public Eqconfestoqvw01Id() {
	}

	public Eqconfestoqvw01Id(Integer codemp, Short codfilial,
			Character ativoprod, String descprod, Integer codprod,
			String refprod, BigDecimal sldliqprod, BigDecimal qtdinvp,
			BigDecimal qtditcompra, BigDecimal qtdfinalprodop,
			BigDecimal qtdexpitrma, BigDecimal qtditvenda,
			BigDecimal sldmovprod, BigDecimal sldliqprodax) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.ativoprod = ativoprod;
		this.descprod = descprod;
		this.codprod = codprod;
		this.refprod = refprod;
		this.sldliqprod = sldliqprod;
		this.qtdinvp = qtdinvp;
		this.qtditcompra = qtditcompra;
		this.qtdfinalprodop = qtdfinalprodop;
		this.qtdexpitrma = qtdexpitrma;
		this.qtditvenda = qtditvenda;
		this.sldmovprod = sldmovprod;
		this.sldliqprodax = sldliqprodax;
	}

	@Column(name = "CODEMP")
	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL")
	public Short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(Short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "ATIVOPROD", length = 1)
	public Character getAtivoprod() {
		return this.ativoprod;
	}

	public void setAtivoprod(Character ativoprod) {
		this.ativoprod = ativoprod;
	}

	@Column(name = "DESCPROD", length = 100)
	public String getDescprod() {
		return this.descprod;
	}

	public void setDescprod(String descprod) {
		this.descprod = descprod;
	}

	@Column(name = "CODPROD")
	public Integer getCodprod() {
		return this.codprod;
	}

	public void setCodprod(Integer codprod) {
		this.codprod = codprod;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "SLDLIQPROD", precision = 15, scale = 5)
	public BigDecimal getSldliqprod() {
		return this.sldliqprod;
	}

	public void setSldliqprod(BigDecimal sldliqprod) {
		this.sldliqprod = sldliqprod;
	}

	@Column(name = "QTDINVP", precision = 0, scale = 5)
	public BigDecimal getQtdinvp() {
		return this.qtdinvp;
	}

	public void setQtdinvp(BigDecimal qtdinvp) {
		this.qtdinvp = qtdinvp;
	}

	@Column(name = "QTDITCOMPRA", precision = 0, scale = 5)
	public BigDecimal getQtditcompra() {
		return this.qtditcompra;
	}

	public void setQtditcompra(BigDecimal qtditcompra) {
		this.qtditcompra = qtditcompra;
	}

	@Column(name = "QTDFINALPRODOP", precision = 0, scale = 5)
	public BigDecimal getQtdfinalprodop() {
		return this.qtdfinalprodop;
	}

	public void setQtdfinalprodop(BigDecimal qtdfinalprodop) {
		this.qtdfinalprodop = qtdfinalprodop;
	}

	@Column(name = "QTDEXPITRMA", precision = 0, scale = 5)
	public BigDecimal getQtdexpitrma() {
		return this.qtdexpitrma;
	}

	public void setQtdexpitrma(BigDecimal qtdexpitrma) {
		this.qtdexpitrma = qtdexpitrma;
	}

	@Column(name = "QTDITVENDA", precision = 0, scale = 5)
	public BigDecimal getQtditvenda() {
		return this.qtditvenda;
	}

	public void setQtditvenda(BigDecimal qtditvenda) {
		this.qtditvenda = qtditvenda;
	}

	@Column(name = "SLDMOVPROD", precision = 0, scale = 5)
	public BigDecimal getSldmovprod() {
		return this.sldmovprod;
	}

	public void setSldmovprod(BigDecimal sldmovprod) {
		this.sldmovprod = sldmovprod;
	}

	@Column(name = "SLDLIQPRODAX", precision = 0, scale = 5)
	public BigDecimal getSldliqprodax() {
		return this.sldliqprodax;
	}

	public void setSldliqprodax(BigDecimal sldliqprodax) {
		this.sldliqprodax = sldliqprodax;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Eqconfestoqvw01Id))
			return false;
		Eqconfestoqvw01Id castOther = (Eqconfestoqvw01Id) other;

		return ((this.getCodemp() == castOther.getCodemp()) || (this
				.getCodemp() != null && castOther.getCodemp() != null && this
				.getCodemp().equals(castOther.getCodemp())))
				&& ((this.getCodfilial() == castOther.getCodfilial()) || (this
						.getCodfilial() != null
						&& castOther.getCodfilial() != null && this
						.getCodfilial().equals(castOther.getCodfilial())))
				&& ((this.getAtivoprod() == castOther.getAtivoprod()) || (this
						.getAtivoprod() != null
						&& castOther.getAtivoprod() != null && this
						.getAtivoprod().equals(castOther.getAtivoprod())))
				&& ((this.getDescprod() == castOther.getDescprod()) || (this
						.getDescprod() != null
						&& castOther.getDescprod() != null && this
						.getDescprod().equals(castOther.getDescprod())))
				&& ((this.getCodprod() == castOther.getCodprod()) || (this
						.getCodprod() != null && castOther.getCodprod() != null && this
						.getCodprod().equals(castOther.getCodprod())))
				&& ((this.getRefprod() == castOther.getRefprod()) || (this
						.getRefprod() != null && castOther.getRefprod() != null && this
						.getRefprod().equals(castOther.getRefprod())))
				&& ((this.getSldliqprod() == castOther.getSldliqprod()) || (this
						.getSldliqprod() != null
						&& castOther.getSldliqprod() != null && this
						.getSldliqprod().equals(castOther.getSldliqprod())))
				&& ((this.getQtdinvp() == castOther.getQtdinvp()) || (this
						.getQtdinvp() != null && castOther.getQtdinvp() != null && this
						.getQtdinvp().equals(castOther.getQtdinvp())))
				&& ((this.getQtditcompra() == castOther.getQtditcompra()) || (this
						.getQtditcompra() != null
						&& castOther.getQtditcompra() != null && this
						.getQtditcompra().equals(castOther.getQtditcompra())))
				&& ((this.getQtdfinalprodop() == castOther.getQtdfinalprodop()) || (this
						.getQtdfinalprodop() != null
						&& castOther.getQtdfinalprodop() != null && this
						.getQtdfinalprodop().equals(
								castOther.getQtdfinalprodop())))
				&& ((this.getQtdexpitrma() == castOther.getQtdexpitrma()) || (this
						.getQtdexpitrma() != null
						&& castOther.getQtdexpitrma() != null && this
						.getQtdexpitrma().equals(castOther.getQtdexpitrma())))
				&& ((this.getQtditvenda() == castOther.getQtditvenda()) || (this
						.getQtditvenda() != null
						&& castOther.getQtditvenda() != null && this
						.getQtditvenda().equals(castOther.getQtditvenda())))
				&& ((this.getSldmovprod() == castOther.getSldmovprod()) || (this
						.getSldmovprod() != null
						&& castOther.getSldmovprod() != null && this
						.getSldmovprod().equals(castOther.getSldmovprod())))
				&& ((this.getSldliqprodax() == castOther.getSldliqprodax()) || (this
						.getSldliqprodax() != null
						&& castOther.getSldliqprodax() != null && this
						.getSldliqprodax().equals(castOther.getSldliqprodax())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodemp() == null ? 0 : this.getCodemp().hashCode());
		result = 37 * result
				+ (getCodfilial() == null ? 0 : this.getCodfilial().hashCode());
		result = 37 * result
				+ (getAtivoprod() == null ? 0 : this.getAtivoprod().hashCode());
		result = 37 * result
				+ (getDescprod() == null ? 0 : this.getDescprod().hashCode());
		result = 37 * result
				+ (getCodprod() == null ? 0 : this.getCodprod().hashCode());
		result = 37 * result
				+ (getRefprod() == null ? 0 : this.getRefprod().hashCode());
		result = 37
				* result
				+ (getSldliqprod() == null ? 0 : this.getSldliqprod()
						.hashCode());
		result = 37 * result
				+ (getQtdinvp() == null ? 0 : this.getQtdinvp().hashCode());
		result = 37
				* result
				+ (getQtditcompra() == null ? 0 : this.getQtditcompra()
						.hashCode());
		result = 37
				* result
				+ (getQtdfinalprodop() == null ? 0 : this.getQtdfinalprodop()
						.hashCode());
		result = 37
				* result
				+ (getQtdexpitrma() == null ? 0 : this.getQtdexpitrma()
						.hashCode());
		result = 37
				* result
				+ (getQtditvenda() == null ? 0 : this.getQtditvenda()
						.hashCode());
		result = 37
				* result
				+ (getSldmovprod() == null ? 0 : this.getSldmovprod()
						.hashCode());
		result = 37
				* result
				+ (getSldliqprodax() == null ? 0 : this.getSldliqprodax()
						.hashCode());
		return result;
	}

}

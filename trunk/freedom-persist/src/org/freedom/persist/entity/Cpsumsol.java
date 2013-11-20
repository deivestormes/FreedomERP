package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cpsumsol generated by hbm2java
 */
public class Cpsumsol implements java.io.Serializable {

	private CpsumsolId id;
	private Eqproduto eqproduto;
	private String refprod;
	private BigDecimal qtditsol;
	private BigDecimal qtdaprovitsol;
	private String sititsol;
	private Date dtaprovitsol;
	private String idusuaprovitsol;
	private String sitaprovitsol;
	private String motivocotabaix;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpsumsol() {
	}

	public Cpsumsol(CpsumsolId id, Eqproduto eqproduto, String refprod,
			BigDecimal qtditsol, BigDecimal qtdaprovitsol, String sititsol,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.refprod = refprod;
		this.qtditsol = qtditsol;
		this.qtdaprovitsol = qtdaprovitsol;
		this.sititsol = sititsol;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpsumsol(CpsumsolId id, Eqproduto eqproduto, String refprod,
			BigDecimal qtditsol, BigDecimal qtdaprovitsol, String sititsol,
			Date dtaprovitsol, String idusuaprovitsol, String sitaprovitsol,
			String motivocotabaix, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.refprod = refprod;
		this.qtditsol = qtditsol;
		this.qtdaprovitsol = qtdaprovitsol;
		this.sititsol = sititsol;
		this.dtaprovitsol = dtaprovitsol;
		this.idusuaprovitsol = idusuaprovitsol;
		this.sitaprovitsol = sitaprovitsol;
		this.motivocotabaix = motivocotabaix;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CpsumsolId getId() {
		return this.id;
	}

	public void setId(CpsumsolId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public BigDecimal getQtditsol() {
		return this.qtditsol;
	}

	public void setQtditsol(BigDecimal qtditsol) {
		this.qtditsol = qtditsol;
	}

	public BigDecimal getQtdaprovitsol() {
		return this.qtdaprovitsol;
	}

	public void setQtdaprovitsol(BigDecimal qtdaprovitsol) {
		this.qtdaprovitsol = qtdaprovitsol;
	}

	public String getSititsol() {
		return this.sititsol;
	}

	public void setSititsol(String sititsol) {
		this.sititsol = sititsol;
	}

	public Date getDtaprovitsol() {
		return this.dtaprovitsol;
	}

	public void setDtaprovitsol(Date dtaprovitsol) {
		this.dtaprovitsol = dtaprovitsol;
	}

	public String getIdusuaprovitsol() {
		return this.idusuaprovitsol;
	}

	public void setIdusuaprovitsol(String idusuaprovitsol) {
		this.idusuaprovitsol = idusuaprovitsol;
	}

	public String getSitaprovitsol() {
		return this.sitaprovitsol;
	}

	public void setSitaprovitsol(String sitaprovitsol) {
		this.sitaprovitsol = sitaprovitsol;
	}

	public String getMotivocotabaix() {
		return this.motivocotabaix;
	}

	public void setMotivocotabaix(String motivocotabaix) {
		this.motivocotabaix = motivocotabaix;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

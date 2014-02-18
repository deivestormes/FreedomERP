package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Svavaliacao generated by hbm2java
 */
public class Svavaliacao implements java.io.Serializable {

	private SvavaliacaoId id;
	private Eqproduto eqproduto;
	private Svitos svitos;
	private String refprod;
	private BigDecimal qtdaval;
	private BigDecimal precoaval;
	private BigDecimal vlrtotaval;
	private BigDecimal vlrdescaval;
	private BigDecimal vlrliqaval;
	private String sitaval;
	private String sitaprovaval;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Svavaliacao() {
	}

	public Svavaliacao(SvavaliacaoId id, Eqproduto eqproduto, Svitos svitos,
			String refprod, BigDecimal qtdaval, BigDecimal precoaval,
			BigDecimal vlrtotaval, BigDecimal vlrdescaval,
			BigDecimal vlrliqaval, String sitaval, String sitaprovaval,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.svitos = svitos;
		this.refprod = refprod;
		this.qtdaval = qtdaval;
		this.precoaval = precoaval;
		this.vlrtotaval = vlrtotaval;
		this.vlrdescaval = vlrdescaval;
		this.vlrliqaval = vlrliqaval;
		this.sitaval = sitaval;
		this.sitaprovaval = sitaprovaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Svavaliacao(SvavaliacaoId id, Eqproduto eqproduto, Svitos svitos,
			String refprod, BigDecimal qtdaval, BigDecimal precoaval,
			BigDecimal vlrtotaval, BigDecimal vlrdescaval,
			BigDecimal vlrliqaval, String sitaval, String sitaprovaval,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.svitos = svitos;
		this.refprod = refprod;
		this.qtdaval = qtdaval;
		this.precoaval = precoaval;
		this.vlrtotaval = vlrtotaval;
		this.vlrdescaval = vlrdescaval;
		this.vlrliqaval = vlrliqaval;
		this.sitaval = sitaval;
		this.sitaprovaval = sitaprovaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SvavaliacaoId getId() {
		return this.id;
	}

	public void setId(SvavaliacaoId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Svitos getSvitos() {
		return this.svitos;
	}

	public void setSvitos(Svitos svitos) {
		this.svitos = svitos;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public BigDecimal getQtdaval() {
		return this.qtdaval;
	}

	public void setQtdaval(BigDecimal qtdaval) {
		this.qtdaval = qtdaval;
	}

	public BigDecimal getPrecoaval() {
		return this.precoaval;
	}

	public void setPrecoaval(BigDecimal precoaval) {
		this.precoaval = precoaval;
	}

	public BigDecimal getVlrtotaval() {
		return this.vlrtotaval;
	}

	public void setVlrtotaval(BigDecimal vlrtotaval) {
		this.vlrtotaval = vlrtotaval;
	}

	public BigDecimal getVlrdescaval() {
		return this.vlrdescaval;
	}

	public void setVlrdescaval(BigDecimal vlrdescaval) {
		this.vlrdescaval = vlrdescaval;
	}

	public BigDecimal getVlrliqaval() {
		return this.vlrliqaval;
	}

	public void setVlrliqaval(BigDecimal vlrliqaval) {
		this.vlrliqaval = vlrliqaval;
	}

	public String getSitaval() {
		return this.sitaval;
	}

	public void setSitaval(String sitaval) {
		this.sitaval = sitaval;
	}

	public String getSitaprovaval() {
		return this.sitaprovaval;
	}

	public void setSitaprovaval(String sitaprovaval) {
		this.sitaprovaval = sitaprovaval;
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

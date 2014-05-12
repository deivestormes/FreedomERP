package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppopitorc generated by hbm2java
 */
@Entity
@Table(name = "PPOPITORC")
public class Ppopitorc implements java.io.Serializable {

	private PpopitorcId id;
	private Vditorcamento vditorcamento;
	private Ppop ppop;
	private BigDecimal qtdprod;
	private BigDecimal qtdfinalproditorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppopitorc() {
	}

	public Ppopitorc(PpopitorcId id, Vditorcamento vditorcamento, Ppop ppop,
			BigDecimal qtdprod, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vditorcamento = vditorcamento;
		this.ppop = ppop;
		this.qtdprod = qtdprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppopitorc(PpopitorcId id, Vditorcamento vditorcamento, Ppop ppop,
			BigDecimal qtdprod, BigDecimal qtdfinalproditorc, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vditorcamento = vditorcamento;
		this.ppop = ppop;
		this.qtdprod = qtdprod;
		this.qtdfinalproditorc = qtdfinalproditorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codop", column = @Column(name = "CODOP", nullable = false)),
			@AttributeOverride(name = "seqop", column = @Column(name = "SEQOP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "coditorc", column = @Column(name = "CODITORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilialoc", column = @Column(name = "CODFILIALOC", nullable = false)),
			@AttributeOverride(name = "codempoc", column = @Column(name = "CODEMPOC", nullable = false)) })
	public PpopitorcId getId() {
		return this.id;
	}

	public void setId(PpopitorcId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODORC", referencedColumnName = "CODORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITORC", referencedColumnName = "CODITORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOORC", referencedColumnName = "TIPOORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALOC", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPOC", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOP", referencedColumnName = "CODOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQOP", referencedColumnName = "SEQOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	@Column(name = "QTDPROD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdprod() {
		return this.qtdprod;
	}

	public void setQtdprod(BigDecimal qtdprod) {
		this.qtdprod = qtdprod;
	}

	@Column(name = "QTDFINALPRODITORC", precision = 15, scale = 5)
	public BigDecimal getQtdfinalproditorc() {
		return this.qtdfinalproditorc;
	}

	public void setQtdfinalproditorc(BigDecimal qtdfinalproditorc) {
		this.qtdfinalproditorc = qtdfinalproditorc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vditcustoorc generated by hbm2java
 */
@Entity
@Table(name = "VDITCUSTOORC")
public class Vditcustoorc implements java.io.Serializable {

	private VditcustoorcId id;
	private Vditorcamento vditorcamento;
	private BigDecimal vlrprecoultcp;
	private BigDecimal vlrcustompm;
	private BigDecimal vlrcustopeps;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditcustoorc() {
	}

	public Vditcustoorc(Vditorcamento vditorcamento, BigDecimal vlrprecoultcp,
			BigDecimal vlrcustompm, BigDecimal vlrcustopeps, Date dtins,
			Date hins, String idusuins) {
		this.vditorcamento = vditorcamento;
		this.vlrprecoultcp = vlrprecoultcp;
		this.vlrcustompm = vlrcustompm;
		this.vlrcustopeps = vlrcustopeps;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditcustoorc(Vditorcamento vditorcamento, BigDecimal vlrprecoultcp,
			BigDecimal vlrcustompm, BigDecimal vlrcustopeps, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.vditorcamento = vditorcamento;
		this.vlrprecoultcp = vlrprecoultcp;
		this.vlrcustompm = vlrcustompm;
		this.vlrcustopeps = vlrcustopeps;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "coditorc", column = @Column(name = "CODITORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VditcustoorcId getId() {
		return this.id;
	}

	public void setId(VditcustoorcId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
	}

	@Column(name = "VLRPRECOULTCP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrprecoultcp() {
		return this.vlrprecoultcp;
	}

	public void setVlrprecoultcp(BigDecimal vlrprecoultcp) {
		this.vlrprecoultcp = vlrprecoultcp;
	}

	@Column(name = "VLRCUSTOMPM", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrcustompm() {
		return this.vlrcustompm;
	}

	public void setVlrcustompm(BigDecimal vlrcustompm) {
		this.vlrcustompm = vlrcustompm;
	}

	@Column(name = "VLRCUSTOPEPS", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrcustopeps() {
		return this.vlrcustopeps;
	}

	public void setVlrcustopeps(BigDecimal vlrcustopeps) {
		this.vlrcustopeps = vlrcustopeps;
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

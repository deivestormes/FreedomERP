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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vdvendacomis generated by hbm2java
 */
@Entity
@Table(name = "VDVENDACOMIS")
public class Vdvendacomis implements java.io.Serializable {

	private VdvendacomisId id;
	private Vditregracomis vditregracomis;
	private Vdvendedor vdvendedor;
	private Vdvenda vdvenda;
	private BigDecimal percvc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdvendacomis() {
	}

	public Vdvendacomis(VdvendacomisId id, Vditregracomis vditregracomis,
			Vdvenda vdvenda, BigDecimal percvc, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.vditregracomis = vditregracomis;
		this.vdvenda = vdvenda;
		this.percvc = percvc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdvendacomis(VdvendacomisId id, Vditregracomis vditregracomis,
			Vdvendedor vdvendedor, Vdvenda vdvenda, BigDecimal percvc,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.vditregracomis = vditregracomis;
		this.vdvendedor = vdvendedor;
		this.vdvenda = vdvenda;
		this.percvc = percvc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "seqvc", column = @Column(name = "SEQVC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdvendacomisId getId() {
		return this.id;
	}

	public void setId(VdvendacomisId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODREGRCOMIS", referencedColumnName = "CODREGRCOMIS", nullable = false),
			@JoinColumn(name = "SEQITRC", referencedColumnName = "SEQITRC", nullable = false),
			@JoinColumn(name = "CODFILIALRC", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPRC", referencedColumnName = "CODEMP", nullable = false) })
	public Vditregracomis getVditregracomis() {
		return this.vditregracomis;
	}

	public void setVditregracomis(Vditregracomis vditregracomis) {
		this.vditregracomis = vditregracomis;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@Column(name = "PERCVC", nullable = false, precision = 6, scale = 3)
	public BigDecimal getPercvc() {
		return this.percvc;
	}

	public void setPercvc(BigDecimal percvc) {
		this.percvc = percvc;
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

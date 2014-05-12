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
 * Vditcontratofor generated by hbm2java
 */
@Entity
@Table(name = "VDITCONTRATOFOR")
public class Vditcontratofor implements java.io.Serializable {

	private VditcontratoforId id;
	private Cpforneced cpforneced;
	private Vditcontrato vditcontrato;
	private int codempfr;
	private BigDecimal vlrapagfor;
	private Date dtprevinifor;
	private Date dtprevfinfor;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditcontratofor() {
	}

	public Vditcontratofor(VditcontratoforId id, Cpforneced cpforneced,
			Vditcontrato vditcontrato, int codempfr, BigDecimal vlrapagfor,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.vditcontrato = vditcontrato;
		this.codempfr = codempfr;
		this.vlrapagfor = vlrapagfor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Vditcontratofor(VditcontratoforId id, Cpforneced cpforneced,
			Vditcontrato vditcontrato, int codempfr, BigDecimal vlrapagfor,
			Date dtprevinifor, Date dtprevfinfor, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.vditcontrato = vditcontrato;
		this.codempfr = codempfr;
		this.vlrapagfor = vlrapagfor;
		this.dtprevinifor = dtprevinifor;
		this.dtprevfinfor = dtprevfinfor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR", nullable = false)),
			@AttributeOverride(name = "coditcontr", column = @Column(name = "CODITCONTR", nullable = false)),
			@AttributeOverride(name = "seqicf", column = @Column(name = "SEQICF", nullable = false)) })
	public VditcontratoforId getId() {
		return this.id;
	}

	public void setId(VditcontratoforId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFOR", referencedColumnName = "CODFOR", nullable = false),
			@JoinColumn(name = "CODFILIALFR", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false) })
	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONTR", referencedColumnName = "CODCONTR", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITCONTR", referencedColumnName = "CODITCONTR", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	@Column(name = "CODEMPFR", nullable = false)
	public int getCodempfr() {
		return this.codempfr;
	}

	public void setCodempfr(int codempfr) {
		this.codempfr = codempfr;
	}

	@Column(name = "VLRAPAGFOR", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrapagfor() {
		return this.vlrapagfor;
	}

	public void setVlrapagfor(BigDecimal vlrapagfor) {
		this.vlrapagfor = vlrapagfor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVINIFOR", length = 10)
	public Date getDtprevinifor() {
		return this.dtprevinifor;
	}

	public void setDtprevinifor(Date dtprevinifor) {
		this.dtprevinifor = dtprevinifor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVFINFOR", length = 10)
	public Date getDtprevfinfor() {
		return this.dtprevfinfor;
	}

	public void setDtprevfinfor(Date dtprevfinfor) {
		this.dtprevfinfor = dtprevfinfor;
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

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

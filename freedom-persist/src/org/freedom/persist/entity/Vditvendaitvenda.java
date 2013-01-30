package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vditvendaitvenda generated by hbm2java
 */
@Entity
@Table(name = "VDITVENDAITVENDA")
public class Vditvendaitvenda implements java.io.Serializable {

	private long id;
	private Vditvenda vditvendaByVditvendafkitvend1;
	private Vditvenda vditvendaByVditvendafkitvend2;
	private BigDecimal qtditvenda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditvendaitvenda() {
	}

	public Vditvendaitvenda(long id, Vditvenda vditvendaByVditvendafkitvend1,
			Vditvenda vditvendaByVditvendafkitvend2, BigDecimal qtditvenda,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vditvendaByVditvendafkitvend1 = vditvendaByVditvendafkitvend1;
		this.vditvendaByVditvendafkitvend2 = vditvendaByVditvendafkitvend2;
		this.qtditvenda = qtditvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditvendaitvenda(long id, Vditvenda vditvendaByVditvendafkitvend1,
			Vditvenda vditvendaByVditvendafkitvend2, BigDecimal qtditvenda,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.vditvendaByVditvendafkitvend1 = vditvendaByVditvendafkitvend1;
		this.vditvendaByVditvendafkitvend2 = vditvendaByVditvendafkitvend2;
		this.qtditvenda = qtditvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false),
			@JoinColumn(name = "CODITVENDA", referencedColumnName = "CODITVENDA", nullable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false) })
	public Vditvenda getVditvendaByVditvendafkitvend1() {
		return this.vditvendaByVditvendafkitvend1;
	}

	public void setVditvendaByVditvendafkitvend1(
			Vditvenda vditvendaByVditvendafkitvend1) {
		this.vditvendaByVditvendafkitvend1 = vditvendaByVditvendafkitvend1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDAVO", referencedColumnName = "CODVENDA", nullable = false),
			@JoinColumn(name = "CODITVENDAVO", referencedColumnName = "CODITVENDA", nullable = false),
			@JoinColumn(name = "TIPOVENDAVO", referencedColumnName = "TIPOVENDA", nullable = false),
			@JoinColumn(name = "CODFILIALVO", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPVO", referencedColumnName = "CODEMP", nullable = false) })
	public Vditvenda getVditvendaByVditvendafkitvend2() {
		return this.vditvendaByVditvendafkitvend2;
	}

	public void setVditvendaByVditvendafkitvend2(
			Vditvenda vditvendaByVditvendafkitvend2) {
		this.vditvendaByVditvendafkitvend2 = vditvendaByVditvendafkitvend2;
	}

	@Column(name = "QTDITVENDA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditvenda() {
		return this.qtditvenda;
	}

	public void setQtditvenda(BigDecimal qtditvenda) {
		this.qtditvenda = qtditvenda;
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

	@Column(name = "IDUSUALT", length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

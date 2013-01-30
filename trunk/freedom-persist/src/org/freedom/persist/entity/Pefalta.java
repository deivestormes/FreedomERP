package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Pefalta generated by hbm2java
 */
@Entity
@Table(name = "PEFALTA")
public class Pefalta implements java.io.Serializable {

	private PefaltaId id;
	private Rhempregado rhempregado;
	private char periodofalta;
	private char tipofalta;
	private Date hiniintfalta;
	private Date hfinintfalta;
	private Date hfinfalta;
	private String justiffalta;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Pefalta() {
	}

	public Pefalta(PefaltaId id, Rhempregado rhempregado, char periodofalta,
			char tipofalta, Date hiniintfalta, Date hfinintfalta,
			Date hfinfalta, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.rhempregado = rhempregado;
		this.periodofalta = periodofalta;
		this.tipofalta = tipofalta;
		this.hiniintfalta = hiniintfalta;
		this.hfinintfalta = hfinintfalta;
		this.hfinfalta = hfinfalta;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Pefalta(PefaltaId id, Rhempregado rhempregado, char periodofalta,
			char tipofalta, Date hiniintfalta, Date hfinintfalta,
			Date hfinfalta, String justiffalta, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.rhempregado = rhempregado;
		this.periodofalta = periodofalta;
		this.tipofalta = tipofalta;
		this.hiniintfalta = hiniintfalta;
		this.hfinintfalta = hfinintfalta;
		this.hfinfalta = hfinfalta;
		this.justiffalta = justiffalta;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "hinifalta", column = @Column(name = "HINIFALTA", nullable = false, length = 8)),
			@AttributeOverride(name = "dtfalta", column = @Column(name = "DTFALTA", nullable = false, length = 10)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "matempr", column = @Column(name = "MATEMPR", nullable = false)),
			@AttributeOverride(name = "codempep", column = @Column(name = "CODEMPEP", nullable = false)),
			@AttributeOverride(name = "codfilialep", column = @Column(name = "CODFILIALEP", nullable = false)) })
	public PefaltaId getId() {
		return this.id;
	}

	public void setId(PefaltaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "MATEMPR", referencedColumnName = "MATEMPR", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALEP", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPEP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhempregado getRhempregado() {
		return this.rhempregado;
	}

	public void setRhempregado(Rhempregado rhempregado) {
		this.rhempregado = rhempregado;
	}

	@Column(name = "PERIODOFALTA", nullable = false, length = 1)
	public char getPeriodofalta() {
		return this.periodofalta;
	}

	public void setPeriodofalta(char periodofalta) {
		this.periodofalta = periodofalta;
	}

	@Column(name = "TIPOFALTA", nullable = false, length = 1)
	public char getTipofalta() {
		return this.tipofalta;
	}

	public void setTipofalta(char tipofalta) {
		this.tipofalta = tipofalta;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINIINTFALTA", nullable = false, length = 8)
	public Date getHiniintfalta() {
		return this.hiniintfalta;
	}

	public void setHiniintfalta(Date hiniintfalta) {
		this.hiniintfalta = hiniintfalta;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HFININTFALTA", nullable = false, length = 8)
	public Date getHfinintfalta() {
		return this.hfinintfalta;
	}

	public void setHfinintfalta(Date hfinintfalta) {
		this.hfinintfalta = hfinintfalta;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HFINFALTA", nullable = false, length = 8)
	public Date getHfinfalta() {
		return this.hfinfalta;
	}

	public void setHfinfalta(Date hfinfalta) {
		this.hfinfalta = hfinfalta;
	}

	@Column(name = "JUSTIFFALTA", length = 2000)
	public String getJustiffalta() {
		return this.justiffalta;
	}

	public void setJustiffalta(String justiffalta) {
		this.justiffalta = justiffalta;
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

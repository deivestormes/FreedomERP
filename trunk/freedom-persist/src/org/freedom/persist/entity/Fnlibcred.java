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
 * Fnlibcred generated by hbm2java
 */
@Entity
@Table(name = "FNLIBCRED")
public class Fnlibcred implements java.io.Serializable {

	private FnlibcredId id;
	private Sgfilial sgfilial;
	private Vdvenda vdvenda;
	private Vdcliente vdcliente;
	private Sgusuario sgusuario;
	private Date dtaemitlcred;
	private BigDecimal vlrautorizlcred;
	private BigDecimal vlrutillcred;
	private BigDecimal vlrvendacred;
	private Date dtautillcred;
	private char sitlcred;
	private Date dtavctolcred;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnlibcred() {
	}

	public Fnlibcred(FnlibcredId id, Sgfilial sgfilial, Vdvenda vdvenda,
			Vdcliente vdcliente, Date dtaemitlcred, BigDecimal vlrautorizlcred,
			BigDecimal vlrutillcred, char sitlcred, Date dtavctolcred,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdvenda = vdvenda;
		this.vdcliente = vdcliente;
		this.dtaemitlcred = dtaemitlcred;
		this.vlrautorizlcred = vlrautorizlcred;
		this.vlrutillcred = vlrutillcred;
		this.sitlcred = sitlcred;
		this.dtavctolcred = dtavctolcred;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnlibcred(FnlibcredId id, Sgfilial sgfilial, Vdvenda vdvenda,
			Vdcliente vdcliente, Sgusuario sgusuario, Date dtaemitlcred,
			BigDecimal vlrautorizlcred, BigDecimal vlrutillcred,
			BigDecimal vlrvendacred, Date dtautillcred, char sitlcred,
			Date dtavctolcred, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdvenda = vdvenda;
		this.vdcliente = vdcliente;
		this.sgusuario = sgusuario;
		this.dtaemitlcred = dtaemitlcred;
		this.vlrautorizlcred = vlrautorizlcred;
		this.vlrutillcred = vlrutillcred;
		this.vlrvendacred = vlrvendacred;
		this.dtautillcred = dtautillcred;
		this.sitlcred = sitlcred;
		this.dtavctolcred = dtavctolcred;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codlcred", column = @Column(name = "CODLCRED", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnlibcredId getId() {
		return this.id;
	}

	public void setId(FnlibcredId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP", nullable = false) })
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP", nullable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IDUSU", referencedColumnName = "IDUSU"),
			@JoinColumn(name = "CODFILIALUS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPUS", referencedColumnName = "CODEMP") })
	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAEMITLCRED", nullable = false, length = 10)
	public Date getDtaemitlcred() {
		return this.dtaemitlcred;
	}

	public void setDtaemitlcred(Date dtaemitlcred) {
		this.dtaemitlcred = dtaemitlcred;
	}

	@Column(name = "VLRAUTORIZLCRED", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrautorizlcred() {
		return this.vlrautorizlcred;
	}

	public void setVlrautorizlcred(BigDecimal vlrautorizlcred) {
		this.vlrautorizlcred = vlrautorizlcred;
	}

	@Column(name = "VLRUTILLCRED", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrutillcred() {
		return this.vlrutillcred;
	}

	public void setVlrutillcred(BigDecimal vlrutillcred) {
		this.vlrutillcred = vlrutillcred;
	}

	@Column(name = "VLRVENDACRED", precision = 15, scale = 5)
	public BigDecimal getVlrvendacred() {
		return this.vlrvendacred;
	}

	public void setVlrvendacred(BigDecimal vlrvendacred) {
		this.vlrvendacred = vlrvendacred;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAUTILLCRED", length = 10)
	public Date getDtautillcred() {
		return this.dtautillcred;
	}

	public void setDtautillcred(Date dtautillcred) {
		this.dtautillcred = dtautillcred;
	}

	@Column(name = "SITLCRED", nullable = false, length = 1)
	public char getSitlcred() {
		return this.sitlcred;
	}

	public void setSitlcred(char sitlcred) {
		this.sitlcred = sitlcred;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAVCTOLCRED", nullable = false, length = 10)
	public Date getDtavctolcred() {
		return this.dtavctolcred;
	}

	public void setDtavctolcred(Date dtavctolcred) {
		this.dtavctolcred = dtavctolcred;
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

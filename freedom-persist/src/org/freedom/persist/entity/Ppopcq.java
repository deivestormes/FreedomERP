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
 * Ppopcq generated by hbm2java
 */
@Entity
@Table(name = "PPOPCQ")
public class Ppopcq implements java.io.Serializable {

	private PpopcqId id;
	private Ppopacaocorret ppopacaocorret;
	private Ppop ppop;
	private Ppestruanalise ppestruanalise;
	private Short seqef;
	private BigDecimal vlrafer;
	private String descafer;
	private String status;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppopcq() {
	}

	public Ppopcq(PpopcqId id, Ppopacaocorret ppopacaocorret, Ppop ppop,
			Ppestruanalise ppestruanalise, String status, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.ppopacaocorret = ppopacaocorret;
		this.ppop = ppop;
		this.ppestruanalise = ppestruanalise;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Ppopcq(PpopcqId id, Ppopacaocorret ppopacaocorret, Ppop ppop,
			Ppestruanalise ppestruanalise, Short seqef, BigDecimal vlrafer,
			String descafer, String status, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.ppopacaocorret = ppopacaocorret;
		this.ppop = ppop;
		this.ppestruanalise = ppestruanalise;
		this.seqef = seqef;
		this.vlrafer = vlrafer;
		this.descafer = descafer;
		this.status = status;
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
			@AttributeOverride(name = "seqopcq", column = @Column(name = "SEQOPCQ", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpopcqId getId() {
		return this.id;
	}

	public void setId(PpopcqId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOP", referencedColumnName = "CODOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQOP", referencedColumnName = "SEQOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQAC", referencedColumnName = "SEQAC", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Ppopacaocorret getPpopacaocorret() {
		return this.ppopacaocorret;
	}

	public void setPpopacaocorret(Ppopacaocorret ppopacaocorret) {
		this.ppopacaocorret = ppopacaocorret;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODESTANALISE", referencedColumnName = "CODESTANALISE", nullable = false),
			@JoinColumn(name = "CODFILIALEA", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPEA", referencedColumnName = "CODEMP", nullable = false) })
	public Ppestruanalise getPpestruanalise() {
		return this.ppestruanalise;
	}

	public void setPpestruanalise(Ppestruanalise ppestruanalise) {
		this.ppestruanalise = ppestruanalise;
	}

	@Column(name = "SEQEF")
	public Short getSeqef() {
		return this.seqef;
	}

	public void setSeqef(Short seqef) {
		this.seqef = seqef;
	}

	@Column(name = "VLRAFER", precision = 15, scale = 5)
	public BigDecimal getVlrafer() {
		return this.vlrafer;
	}

	public void setVlrafer(BigDecimal vlrafer) {
		this.vlrafer = vlrafer;
	}

	@Column(name = "DESCAFER", length = 80)
	public String getDescafer() {
		return this.descafer;
	}

	public void setDescafer(String descafer) {
		this.descafer = descafer;
	}

	@Column(name = "STATUS", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

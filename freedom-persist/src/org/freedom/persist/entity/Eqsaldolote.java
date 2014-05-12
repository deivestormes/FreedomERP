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
 * Eqsaldolote generated by hbm2java
 */
@Entity
@Table(name = "EQSALDOLOTE")
public class Eqsaldolote implements java.io.Serializable {

	private EqsaldoloteId id;
	private Eqlote eqlote;
	private Eqalmox eqalmox;
	private BigDecimal sldlote;
	private BigDecimal sldreslote;
	private BigDecimal sldconsiglote;
	private BigDecimal sldliqlote;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqsaldolote() {
	}

	public Eqsaldolote(EqsaldoloteId id, Eqlote eqlote, Eqalmox eqalmox,
			BigDecimal sldlote, BigDecimal sldreslote,
			BigDecimal sldconsiglote, BigDecimal sldliqlote, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqlote = eqlote;
		this.eqalmox = eqalmox;
		this.sldlote = sldlote;
		this.sldreslote = sldreslote;
		this.sldconsiglote = sldconsiglote;
		this.sldliqlote = sldliqlote;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqsaldolote(EqsaldoloteId id, Eqlote eqlote, Eqalmox eqalmox,
			BigDecimal sldlote, BigDecimal sldreslote,
			BigDecimal sldconsiglote, BigDecimal sldliqlote, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqlote = eqlote;
		this.eqalmox = eqalmox;
		this.sldlote = sldlote;
		this.sldreslote = sldreslote;
		this.sldconsiglote = sldconsiglote;
		this.sldliqlote = sldliqlote;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codlote", column = @Column(name = "CODLOTE", nullable = false, length = 20)),
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codalmox", column = @Column(name = "CODALMOX", nullable = false)),
			@AttributeOverride(name = "codfilialax", column = @Column(name = "CODFILIALAX", nullable = false)),
			@AttributeOverride(name = "codempax", column = @Column(name = "CODEMPAX", nullable = false)) })
	public EqsaldoloteId getId() {
		return this.id;
	}

	public void setId(EqsaldoloteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLOTE", referencedColumnName = "CODLOTE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqlote getEqlote() {
		return this.eqlote;
	}

	public void setEqlote(Eqlote eqlote) {
		this.eqlote = eqlote;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@Column(name = "SLDLOTE", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldlote() {
		return this.sldlote;
	}

	public void setSldlote(BigDecimal sldlote) {
		this.sldlote = sldlote;
	}

	@Column(name = "SLDRESLOTE", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldreslote() {
		return this.sldreslote;
	}

	public void setSldreslote(BigDecimal sldreslote) {
		this.sldreslote = sldreslote;
	}

	@Column(name = "SLDCONSIGLOTE", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldconsiglote() {
		return this.sldconsiglote;
	}

	public void setSldconsiglote(BigDecimal sldconsiglote) {
		this.sldconsiglote = sldconsiglote;
	}

	@Column(name = "SLDLIQLOTE", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldliqlote() {
		return this.sldliqlote;
	}

	public void setSldliqlote(BigDecimal sldliqlote) {
		this.sldliqlote = sldliqlote;
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

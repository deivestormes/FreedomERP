package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Crfichaorc generated by hbm2java
 */
@Entity
@Table(name = "CRFICHAORC")
public class Crfichaorc implements java.io.Serializable {

	private CrfichaorcId id;
	private Critfichaaval critfichaaval;
	private Vditorcamento vditorcamento;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Crfichaorc() {
	}

	public Crfichaorc(CrfichaorcId id, Critfichaaval critfichaaval,
			Vditorcamento vditorcamento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.critfichaaval = critfichaaval;
		this.vditorcamento = vditorcamento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crfichaorc(CrfichaorcId id, Critfichaaval critfichaaval,
			Vditorcamento vditorcamento, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.critfichaaval = critfichaaval;
		this.vditorcamento = vditorcamento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "seqfichaaval", column = @Column(name = "SEQFICHAAVAL", nullable = false)),
			@AttributeOverride(name = "seqitfichaaval", column = @Column(name = "SEQITFICHAAVAL", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "coditorc", column = @Column(name = "CODITORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilialor", column = @Column(name = "CODFILIALOR", nullable = false)),
			@AttributeOverride(name = "codempor", column = @Column(name = "CODEMPOR", nullable = false)) })
	public CrfichaorcId getId() {
		return this.id;
	}

	public void setId(CrfichaorcId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SEQFICHAAVAL", referencedColumnName = "SEQFICHAAVAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQITFICHAAVAL", referencedColumnName = "SEQITFICHAAVAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Critfichaaval getCritfichaaval() {
		return this.critfichaaval;
	}

	public void setCritfichaaval(Critfichaaval critfichaaval) {
		this.critfichaaval = critfichaaval;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODORC", referencedColumnName = "CODORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITORC", referencedColumnName = "CODITORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOORC", referencedColumnName = "TIPOORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALOR", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPOR", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
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

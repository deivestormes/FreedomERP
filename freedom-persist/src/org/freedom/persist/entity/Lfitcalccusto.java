package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Lfitcalccusto generated by hbm2java
 */
@Entity
@Table(name = "LFITCALCCUSTO")
public class Lfitcalccusto implements java.io.Serializable {

	private LfitcalccustoId id;
	private Lfcalccusto lfcalccusto;
	private String siglacalc;
	private String operacaocalc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lfitcalccusto() {
	}

	public Lfitcalccusto(LfitcalccustoId id, Lfcalccusto lfcalccusto,
			String siglacalc, String operacaocalc, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.lfcalccusto = lfcalccusto;
		this.siglacalc = siglacalc;
		this.operacaocalc = operacaocalc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfitcalccusto(LfitcalccustoId id, Lfcalccusto lfcalccusto,
			String siglacalc, String operacaocalc, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.lfcalccusto = lfcalccusto;
		this.siglacalc = siglacalc;
		this.operacaocalc = operacaocalc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcalc", column = @Column(name = "CODCALC", nullable = false)),
			@AttributeOverride(name = "seqitcalc", column = @Column(name = "SEQITCALC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfitcalccustoId getId() {
		return this.id;
	}

	public void setId(LfitcalccustoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCALC", referencedColumnName = "CODCALC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Lfcalccusto getLfcalccusto() {
		return this.lfcalccusto;
	}

	public void setLfcalccusto(Lfcalccusto lfcalccusto) {
		this.lfcalccusto = lfcalccusto;
	}

	@Column(name = "SIGLACALC", nullable = false, length = 10)
	public String getSiglacalc() {
		return this.siglacalc;
	}

	public void setSiglacalc(String siglacalc) {
		this.siglacalc = siglacalc;
	}

	@Column(name = "OPERACAOCALC", nullable = false, length = 1)
	public String getOperacaocalc() {
		return this.operacaocalc;
	}

	public void setOperacaocalc(String operacaocalc) {
		this.operacaocalc = operacaocalc;
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

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
 * Attipoatendosetor generated by hbm2java
 */
@Entity
@Table(name = "ATTIPOATENDOSETOR")
public class Attipoatendosetor implements java.io.Serializable {

	private AttipoatendosetorId id;
	private Attipoatendo attipoatendo;
	private Atsetor atsetor;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Attipoatendosetor() {
	}

	public Attipoatendosetor(AttipoatendosetorId id, Attipoatendo attipoatendo,
			Atsetor atsetor, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.attipoatendo = attipoatendo;
		this.atsetor = atsetor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Attipoatendosetor(AttipoatendosetorId id, Attipoatendo attipoatendo,
			Atsetor atsetor, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.attipoatendo = attipoatendo;
		this.atsetor = atsetor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsetat", column = @Column(name = "CODSETAT", nullable = false)),
			@AttributeOverride(name = "codfilialst", column = @Column(name = "CODFILIALST", nullable = false)),
			@AttributeOverride(name = "codempst", column = @Column(name = "CODEMPST", nullable = false)),
			@AttributeOverride(name = "codtpatendo", column = @Column(name = "CODTPATENDO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AttipoatendosetorId getId() {
		return this.id;
	}

	public void setId(AttipoatendosetorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPATENDO", referencedColumnName = "CODTPATENDO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Attipoatendo getAttipoatendo() {
		return this.attipoatendo;
	}

	public void setAttipoatendo(Attipoatendo attipoatendo) {
		this.attipoatendo = attipoatendo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSETAT", referencedColumnName = "CODSETAT", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALST", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPST", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Atsetor getAtsetor() {
		return this.atsetor;
	}

	public void setAtsetor(Atsetor atsetor) {
		this.atsetor = atsetor;
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

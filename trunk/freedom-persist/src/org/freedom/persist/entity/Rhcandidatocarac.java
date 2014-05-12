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
 * Rhcandidatocarac generated by hbm2java
 */
@Entity
@Table(name = "RHCANDIDATOCARAC")
public class Rhcandidatocarac implements java.io.Serializable {

	private RhcandidatocaracId id;
	private Rhcaracteristica rhcaracteristica;
	private Rhcandidato rhcandidato;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhcandidatocarac() {
	}

	public Rhcandidatocarac(RhcandidatocaracId id,
			Rhcaracteristica rhcaracteristica, Rhcandidato rhcandidato,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.rhcaracteristica = rhcaracteristica;
		this.rhcandidato = rhcandidato;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcandidatocarac(RhcandidatocaracId id,
			Rhcaracteristica rhcaracteristica, Rhcandidato rhcandidato,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.rhcaracteristica = rhcaracteristica;
		this.rhcandidato = rhcandidato;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcand", column = @Column(name = "CODCAND", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codcarac", column = @Column(name = "CODCARAC", nullable = false, length = 15)),
			@AttributeOverride(name = "codfilialct", column = @Column(name = "CODFILIALCT", nullable = false)),
			@AttributeOverride(name = "codempct", column = @Column(name = "CODEMPCT", nullable = false)) })
	public RhcandidatocaracId getId() {
		return this.id;
	}

	public void setId(RhcandidatocaracId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCARAC", referencedColumnName = "CODCARAC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCT", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCT", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhcaracteristica getRhcaracteristica() {
		return this.rhcaracteristica;
	}

	public void setRhcaracteristica(Rhcaracteristica rhcaracteristica) {
		this.rhcaracteristica = rhcaracteristica;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAND", referencedColumnName = "CODCAND", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhcandidato getRhcandidato() {
		return this.rhcandidato;
	}

	public void setRhcandidato(Rhcandidato rhcandidato) {
		this.rhcandidato = rhcandidato;
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

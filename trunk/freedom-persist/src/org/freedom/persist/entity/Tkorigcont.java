package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tkorigcont generated by hbm2java
 */
@Entity
@Table(name = "TKORIGCONT")
public class Tkorigcont implements java.io.Serializable {

	private TkorigcontId id;
	private Sgfilial sgfilial;
	private String descorigcont;
	private char web;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Tkcontato> tkcontatos = new HashSet<Tkcontato>(0);

	public Tkorigcont() {
	}

	public Tkorigcont(TkorigcontId id, Sgfilial sgfilial, String descorigcont,
			char web, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descorigcont = descorigcont;
		this.web = web;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkorigcont(TkorigcontId id, Sgfilial sgfilial, String descorigcont,
			char web, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set<Tkcontato> tkcontatos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descorigcont = descorigcont;
		this.web = web;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkcontatos = tkcontatos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codorigcont", column = @Column(name = "CODORIGCONT", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TkorigcontId getId() {
		return this.id;
	}

	public void setId(TkorigcontId id) {
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

	@Column(name = "DESCORIGCONT", nullable = false, length = 40)
	public String getDescorigcont() {
		return this.descorigcont;
	}

	public void setDescorigcont(String descorigcont) {
		this.descorigcont = descorigcont;
	}

	@Column(name = "WEB", nullable = false, length = 1)
	public char getWeb() {
		return this.web;
	}

	public void setWeb(char web) {
		this.web = web;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkorigcont")
	public Set<Tkcontato> getTkcontatos() {
		return this.tkcontatos;
	}

	public void setTkcontatos(Set<Tkcontato> tkcontatos) {
		this.tkcontatos = tkcontatos;
	}

}

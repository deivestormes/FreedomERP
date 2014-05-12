package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Vdsetor generated by hbm2java
 */
@Entity
@Table(name = "VDSETOR")
public class Vdsetor implements java.io.Serializable {

	private VdsetorId id;
	private Sgfilial sgfilial;
	private String descsetor;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdclientes = new HashSet(0);
	private Set sgprefere3s = new HashSet(0);
	private Set vdvendedors = new HashSet(0);
	private Set tkcontatos = new HashSet(0);

	public Vdsetor() {
	}

	public Vdsetor(VdsetorId id, Sgfilial sgfilial, String descsetor,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsetor = descsetor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdsetor(VdsetorId id, Sgfilial sgfilial, String descsetor,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set vdclientes, Set sgprefere3s, Set vdvendedors,
			Set tkcontatos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsetor = descsetor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.sgprefere3s = sgprefere3s;
		this.vdvendedors = vdvendedors;
		this.tkcontatos = tkcontatos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsetor", column = @Column(name = "CODSETOR", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdsetorId getId() {
		return this.id;
	}

	public void setId(VdsetorId id) {
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

	@Column(name = "DESCSETOR", nullable = false, length = 40)
	public String getDescsetor() {
		return this.descsetor;
	}

	public void setDescsetor(String descsetor) {
		this.descsetor = descsetor;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdsetor")
	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdsetor")
	public Set getSgprefere3s() {
		return this.sgprefere3s;
	}

	public void setSgprefere3s(Set sgprefere3s) {
		this.sgprefere3s = sgprefere3s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdsetor")
	public Set getVdvendedors() {
		return this.vdvendedors;
	}

	public void setVdvendedors(Set vdvendedors) {
		this.vdvendedors = vdvendedors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdsetor")
	public Set getTkcontatos() {
		return this.tkcontatos;
	}

	public void setTkcontatos(Set tkcontatos) {
		this.tkcontatos = tkcontatos;
	}
*/
}

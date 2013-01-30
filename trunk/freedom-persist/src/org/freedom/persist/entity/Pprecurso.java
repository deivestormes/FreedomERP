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
 * Pprecurso generated by hbm2java
 */
@Entity
@Table(name = "PPRECURSO")
public class Pprecurso implements java.io.Serializable {

	private PprecursoId id;
	private Sgfilial sgfilial;
	private Pptiporec pptiporec;
	private String descrecp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Ppopfase> ppopfases = new HashSet<Ppopfase>(0);

	public Pprecurso() {
	}

	public Pprecurso(PprecursoId id, Sgfilial sgfilial, Pptiporec pptiporec,
			String descrecp, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.pptiporec = pptiporec;
		this.descrecp = descrecp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pprecurso(PprecursoId id, Sgfilial sgfilial, Pptiporec pptiporec,
			String descrecp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Ppopfase> ppopfases) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.pptiporec = pptiporec;
		this.descrecp = descrecp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppopfases = ppopfases;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codrecp", column = @Column(name = "CODRECP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PprecursoId getId() {
		return this.id;
	}

	public void setId(PprecursoId id) {
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
			@JoinColumn(name = "CODTPREC", referencedColumnName = "CODTPREC", nullable = false),
			@JoinColumn(name = "CODFILIALTR", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTR", referencedColumnName = "CODEMP", nullable = false) })
	public Pptiporec getPptiporec() {
		return this.pptiporec;
	}

	public void setPptiporec(Pptiporec pptiporec) {
		this.pptiporec = pptiporec;
	}

	@Column(name = "DESCRECP", nullable = false, length = 50)
	public String getDescrecp() {
		return this.descrecp;
	}

	public void setDescrecp(String descrecp) {
		this.descrecp = descrecp;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pprecurso")
	public Set<Ppopfase> getPpopfases() {
		return this.ppopfases;
	}

	public void setPpopfases(Set<Ppopfase> ppopfases) {
		this.ppopfases = ppopfases;
	}

}

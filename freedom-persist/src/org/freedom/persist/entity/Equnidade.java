package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Equnidade generated by hbm2java
 */
@Entity
@Table(name = "EQUNIDADE")
public class Equnidade implements java.io.Serializable {

	private EqunidadeId id;
	private Sgfilial sgfilial;
	private String descunid;
	private short casasdec;
	private Character calcvolemb;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpitimportacao> cpitimportacaos = new HashSet<Cpitimportacao>(0);
	private Set<Eqfatconv> eqfatconvs = new HashSet<Eqfatconv>(0);
	private Set<Pptipoanalise> pptipoanalises = new HashSet<Pptipoanalise>(0);
	private Set<Eqproduto> eqprodutos = new HashSet<Eqproduto>(0);

	public Equnidade() {
	}

	public Equnidade(EqunidadeId id, Sgfilial sgfilial, String descunid,
			short casasdec, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descunid = descunid;
		this.casasdec = casasdec;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Equnidade(EqunidadeId id, Sgfilial sgfilial, String descunid,
			short casasdec, Character calcvolemb, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Cpitimportacao> cpitimportacaos, Set<Eqfatconv> eqfatconvs,
			Set<Pptipoanalise> pptipoanalises, Set<Eqproduto> eqprodutos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descunid = descunid;
		this.casasdec = casasdec;
		this.calcvolemb = calcvolemb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpitimportacaos = cpitimportacaos;
		this.eqfatconvs = eqfatconvs;
		this.pptipoanalises = pptipoanalises;
		this.eqprodutos = eqprodutos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codunid", column = @Column(name = "CODUNID", nullable = false, length = 20)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqunidadeId getId() {
		return this.id;
	}

	public void setId(EqunidadeId id) {
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

	@Column(name = "DESCUNID", nullable = false, length = 60)
	public String getDescunid() {
		return this.descunid;
	}

	public void setDescunid(String descunid) {
		this.descunid = descunid;
	}

	@Column(name = "CASASDEC", nullable = false)
	public short getCasasdec() {
		return this.casasdec;
	}

	public void setCasasdec(short casasdec) {
		this.casasdec = casasdec;
	}

	@Column(name = "CALCVOLEMB", length = 1)
	public Character getCalcvolemb() {
		return this.calcvolemb;
	}

	public void setCalcvolemb(Character calcvolemb) {
		this.calcvolemb = calcvolemb;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equnidade")
	public Set<Cpitimportacao> getCpitimportacaos() {
		return this.cpitimportacaos;
	}

	public void setCpitimportacaos(Set<Cpitimportacao> cpitimportacaos) {
		this.cpitimportacaos = cpitimportacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equnidade")
	public Set<Eqfatconv> getEqfatconvs() {
		return this.eqfatconvs;
	}

	public void setEqfatconvs(Set<Eqfatconv> eqfatconvs) {
		this.eqfatconvs = eqfatconvs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equnidade")
	public Set<Pptipoanalise> getPptipoanalises() {
		return this.pptipoanalises;
	}

	public void setPptipoanalises(Set<Pptipoanalise> pptipoanalises) {
		this.pptipoanalises = pptipoanalises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equnidade")
	public Set<Eqproduto> getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set<Eqproduto> eqprodutos) {
		this.eqprodutos = eqprodutos;
	}

}

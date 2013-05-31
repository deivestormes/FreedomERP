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
 * Cpsolicitacao generated by hbm2java
 */
@Entity
@Table(name = "CPSOLICITACAO")
public class Cpsolicitacao implements java.io.Serializable {

	private CpsolicitacaoId id;
	private Sgfilial sgfilial;
	private Sgusuario sgusuario;
	private Fncc fncc;
	private Date dtemitsol;
	private String sitsol;
	private String origsol;
	private String motivosol;
	private Date dtaaprovsol;
	private Integer codempua;
	private Short codfilialua;
	private String idusuaprov;
	private String idusucancsol;
	private String motivocancsol;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpcompra> cpcompras = new HashSet<Cpcompra>(0);
	private Set<Cpitsolicitacao> cpitsolicitacaos = new HashSet<Cpitsolicitacao>(
			0);

	public Cpsolicitacao() {
	}

	public Cpsolicitacao(CpsolicitacaoId id, Sgfilial sgfilial,
			Sgusuario sgusuario, Fncc fncc, Date dtemitsol, String sitsol,
			String origsol, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgusuario = sgusuario;
		this.fncc = fncc;
		this.dtemitsol = dtemitsol;
		this.sitsol = sitsol;
		this.origsol = origsol;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpsolicitacao(CpsolicitacaoId id, Sgfilial sgfilial,
			Sgusuario sgusuario, Fncc fncc, Date dtemitsol, String sitsol,
			String origsol, String motivosol, Date dtaaprovsol,
			Integer codempua, Short codfilialua, String idusuaprov,
			String idusucancsol, String motivocancsol, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Cpcompra> cpcompras, Set<Cpitsolicitacao> cpitsolicitacaos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgusuario = sgusuario;
		this.fncc = fncc;
		this.dtemitsol = dtemitsol;
		this.sitsol = sitsol;
		this.origsol = origsol;
		this.motivosol = motivosol;
		this.dtaaprovsol = dtaaprovsol;
		this.codempua = codempua;
		this.codfilialua = codfilialua;
		this.idusuaprov = idusuaprov;
		this.idusucancsol = idusucancsol;
		this.motivocancsol = motivocancsol;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpcompras = cpcompras;
		this.cpitsolicitacaos = cpitsolicitacaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsol", column = @Column(name = "CODSOL", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpsolicitacaoId getId() {
		return this.id;
	}

	public void setId(CpsolicitacaoId id) {
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
			@JoinColumn(name = "IDUSU", referencedColumnName = "IDUSU", nullable = false),
			@JoinColumn(name = "CODFILIALUU", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPUU", referencedColumnName = "CODEMP", nullable = false) })
	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCC", referencedColumnName = "CODCC", nullable = false),
			@JoinColumn(name = "ANOCC", referencedColumnName = "ANOCC", nullable = false),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP", nullable = false) })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTEMITSOL", nullable = false, length = 10)
	public Date getDtemitsol() {
		return this.dtemitsol;
	}

	public void setDtemitsol(Date dtemitsol) {
		this.dtemitsol = dtemitsol;
	}

	@Column(name = "SITSOL", nullable = false, length = 2)
	public String getSitsol() {
		return this.sitsol;
	}

	public void setSitsol(String sitsol) {
		this.sitsol = sitsol;
	}

	@Column(name = "ORIGSOL", nullable = false, length = 2)
	public String getOrigsol() {
		return this.origsol;
	}

	public void setOrigsol(String origsol) {
		this.origsol = origsol;
	}

	@Column(name = "MOTIVOSOL", length = 10000)
	public String getMotivosol() {
		return this.motivosol;
	}

	public void setMotivosol(String motivosol) {
		this.motivosol = motivosol;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAAPROVSOL", length = 10)
	public Date getDtaaprovsol() {
		return this.dtaaprovsol;
	}

	public void setDtaaprovsol(Date dtaaprovsol) {
		this.dtaaprovsol = dtaaprovsol;
	}

	@Column(name = "CODEMPUA")
	public Integer getCodempua() {
		return this.codempua;
	}

	public void setCodempua(Integer codempua) {
		this.codempua = codempua;
	}

	@Column(name = "CODFILIALUA")
	public Short getCodfilialua() {
		return this.codfilialua;
	}

	public void setCodfilialua(Short codfilialua) {
		this.codfilialua = codfilialua;
	}

	@Column(name = "IDUSUAPROV", length = 8)
	public String getIdusuaprov() {
		return this.idusuaprov;
	}

	public void setIdusuaprov(String idusuaprov) {
		this.idusuaprov = idusuaprov;
	}

	@Column(name = "IDUSUCANCSOL", length = 8)
	public String getIdusucancsol() {
		return this.idusucancsol;
	}

	public void setIdusucancsol(String idusucancsol) {
		this.idusucancsol = idusucancsol;
	}

	@Column(name = "MOTIVOCANCSOL", length = 10000)
	public String getMotivocancsol() {
		return this.motivocancsol;
	}

	public void setMotivocancsol(String motivocancsol) {
		this.motivocancsol = motivocancsol;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpsolicitacao")
	public Set<Cpcompra> getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set<Cpcompra> cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpsolicitacao")
	public Set<Cpitsolicitacao> getCpitsolicitacaos() {
		return this.cpitsolicitacaos;
	}

	public void setCpitsolicitacaos(Set<Cpitsolicitacao> cpitsolicitacaos) {
		this.cpitsolicitacaos = cpitsolicitacaos;
	}

}

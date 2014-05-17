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
 * Fncc generated by hbm2java
 */
@Entity
@Table(name = "FNCC")
public class Fncc implements java.io.Serializable {

	private FnccId id;
	private Sgfilial sgfilial;
	private Fncc fncc;
	private String desccc;
	private int nivelcc;
	private Integer codredcc;
	private Integer codempscc;
	private Short codfilialscc;
	private String siglacc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnccs = new HashSet(0);
	private Set eqrmas = new HashSet(0);
	private Set eqprodutos = new HashSet(0);
	private Set eqprodplans = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set fnpagars = new HashSet(0);
	private Set cpsolicitacaos = new HashSet(0);
	private Set cprateios = new HashSet(0);
	private Set eqprodacessos = new HashSet(0);
	private Set sgusuarios = new HashSet(0);
	private Set cpcompras = new HashSet(0);
	private Set fnplanopags = new HashSet(0);
	private Set fnsublancas = new HashSet(0);

	public Fncc() {
	}

	public Fncc(FnccId id, Sgfilial sgfilial, Fncc fncc, String desccc,
			int nivelcc, String siglacc, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fncc = fncc;
		this.desccc = desccc;
		this.nivelcc = nivelcc;
		this.siglacc = siglacc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fncc(FnccId id, Sgfilial sgfilial, Fncc fncc, String desccc,
			int nivelcc, Integer codredcc, Integer codempscc,
			Short codfilialscc, String siglacc, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt, Set fnccs,
			Set eqrmas, Set eqprodutos, Set eqprodplans, Set fnrecebers,
			Set fnpagars, Set cpsolicitacaos, Set cprateios, Set eqprodacessos,
			Set sgusuarios, Set cpcompras, Set fnplanopags, Set fnsublancas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fncc = fncc;
		this.desccc = desccc;
		this.nivelcc = nivelcc;
		this.codredcc = codredcc;
		this.codempscc = codempscc;
		this.codfilialscc = codfilialscc;
		this.siglacc = siglacc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnccs = fnccs;
		this.eqrmas = eqrmas;
		this.eqprodutos = eqprodutos;
		this.eqprodplans = eqprodplans;
		this.fnrecebers = fnrecebers;
		this.fnpagars = fnpagars;
		this.cpsolicitacaos = cpsolicitacaos;
		this.cprateios = cprateios;
		this.eqprodacessos = eqprodacessos;
		this.sgusuarios = sgusuarios;
		this.cpcompras = cpcompras;
		this.fnplanopags = fnplanopags;
		this.fnsublancas = fnsublancas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcc", column = @Column(name = "CODCC", nullable = false, length = 19)),
			@AttributeOverride(name = "anocc", column = @Column(name = "ANOCC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnccId getId() {
		return this.id;
	}

	public void setId(FnccId id) {
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
			@JoinColumn(name = "CODSUBCC", referencedColumnName = "CODCC", insertable = false, updatable = false),
			@JoinColumn(name = "ANOSCC", referencedColumnName = "ANOCC", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@Column(name = "DESCCC", nullable = false, length = 50)
	public String getDesccc() {
		return this.desccc;
	}

	public void setDesccc(String desccc) {
		this.desccc = desccc;
	}

	@Column(name = "NIVELCC", nullable = false)
	public int getNivelcc() {
		return this.nivelcc;
	}

	public void setNivelcc(int nivelcc) {
		this.nivelcc = nivelcc;
	}

	@Column(name = "CODREDCC")
	public Integer getCodredcc() {
		return this.codredcc;
	}

	public void setCodredcc(Integer codredcc) {
		this.codredcc = codredcc;
	}

	@Column(name = "CODEMPSCC")
	public Integer getCodempscc() {
		return this.codempscc;
	}

	public void setCodempscc(Integer codempscc) {
		this.codempscc = codempscc;
	}

	@Column(name = "CODFILIALSCC")
	public Short getCodfilialscc() {
		return this.codfilialscc;
	}

	public void setCodfilialscc(Short codfilialscc) {
		this.codfilialscc = codfilialscc;
	}

	@Column(name = "SIGLACC", nullable = false, length = 10)
	public String getSiglacc() {
		return this.siglacc;
	}

	public void setSiglacc(String siglacc) {
		this.siglacc = siglacc;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getFnccs() {
		return this.fnccs;
	}

	public void setFnccs(Set fnccs) {
		this.fnccs = fnccs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getEqrmas() {
		return this.eqrmas;
	}

	public void setEqrmas(Set eqrmas) {
		this.eqrmas = eqrmas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set eqprodutos) {
		this.eqprodutos = eqprodutos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getEqprodplans() {
		return this.eqprodplans;
	}

	public void setEqprodplans(Set eqprodplans) {
		this.eqprodplans = eqprodplans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set fnpagars) {
		this.fnpagars = fnpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getCpsolicitacaos() {
		return this.cpsolicitacaos;
	}

	public void setCpsolicitacaos(Set cpsolicitacaos) {
		this.cpsolicitacaos = cpsolicitacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getCprateios() {
		return this.cprateios;
	}

	public void setCprateios(Set cprateios) {
		this.cprateios = cprateios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getEqprodacessos() {
		return this.eqprodacessos;
	}

	public void setEqprodacessos(Set eqprodacessos) {
		this.eqprodacessos = eqprodacessos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getSgusuarios() {
		return this.sgusuarios;
	}

	public void setSgusuarios(Set sgusuarios) {
		this.sgusuarios = sgusuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getFnplanopags() {
		return this.fnplanopags;
	}

	public void setFnplanopags(Set fnplanopags) {
		this.fnplanopags = fnplanopags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncc")
	public Set getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set fnsublancas) {
		this.fnsublancas = fnsublancas;
	}
*/
}

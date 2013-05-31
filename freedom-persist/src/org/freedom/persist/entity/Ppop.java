package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppop generated by hbm2java
 */
@Entity
@Table(name = "PPOP")
public class Ppop implements java.io.Serializable {

	private PpopId id;
	private Ppop ppop;
	private Ppestrutura ppestrutura;
	private Eqtipomov eqtipomov;
	private Eqalmox eqalmox;
	private Cpitcompra cpitcompra;
	private Eqlote eqlote;
	private Eqitrecmercitos eqitrecmercitos;
	private Date dtemitop;
	private String refprod;
	private Date dtfabrop;
	private BigDecimal qtdsugprodop;
	private BigDecimal qtdprevprodop;
	private BigDecimal qtdfinalprodop;
	private BigDecimal qtddistpop;
	private BigDecimal qtddistiop;
	private Date dtvalidpdop;
	private String sitop;
	private String obsop;
	private String justficqtdprod;
	private String justificcanc;
	private Date dtcanc;
	private String idusucanc;
	private Date hcanc;
	private Character estdinamica;
	private Character garantia;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Ppopfase> ppopfases = new HashSet<Ppopfase>(0);
	private Ppretcp ppretcp;
	private Set<Eqmovserie> eqmovseries = new HashSet<Eqmovserie>(0);
	private Set<Cpcompra> cpcompras = new HashSet<Cpcompra>(0);
	private Set<Ppopcq> ppopcqs = new HashSet<Ppopcq>(0);
	private Set<Ppitop> ppitops = new HashSet<Ppitop>(0);
	private Set<Vdvenda> vdvendas = new HashSet<Vdvenda>(0);
	private Set<Ppopsubprod> ppopsubprods = new HashSet<Ppopsubprod>(0);
	private Set<Eqrma> eqrmas = new HashSet<Eqrma>(0);
	private Set<Ppop> ppops = new HashSet<Ppop>(0);
	private Set<Ppopitorc> ppopitorcs = new HashSet<Ppopitorc>(0);
	private Set<Ppopentrada> ppopentradas = new HashSet<Ppopentrada>(0);
	private Set<Eqmovprod> eqmovprods = new HashSet<Eqmovprod>(0);

	public Ppop() {
	}

	public Ppop(PpopId id, Ppestrutura ppestrutura, Eqtipomov eqtipomov,
			Eqalmox eqalmox, Eqlote eqlote, Date dtemitop, String refprod,
			Date dtfabrop, BigDecimal qtdsugprodop, BigDecimal qtdprevprodop,
			BigDecimal qtdfinalprodop, BigDecimal qtddistpop,
			BigDecimal qtddistiop, String sitop, char emmanut, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.ppestrutura = ppestrutura;
		this.eqtipomov = eqtipomov;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.dtemitop = dtemitop;
		this.refprod = refprod;
		this.dtfabrop = dtfabrop;
		this.qtdsugprodop = qtdsugprodop;
		this.qtdprevprodop = qtdprevprodop;
		this.qtdfinalprodop = qtdfinalprodop;
		this.qtddistpop = qtddistpop;
		this.qtddistiop = qtddistiop;
		this.sitop = sitop;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppop(PpopId id, Ppop ppop, Ppestrutura ppestrutura,
			Eqtipomov eqtipomov, Eqalmox eqalmox, Cpitcompra cpitcompra,
			Eqlote eqlote, Eqitrecmercitos eqitrecmercitos, Date dtemitop,
			String refprod, Date dtfabrop, BigDecimal qtdsugprodop,
			BigDecimal qtdprevprodop, BigDecimal qtdfinalprodop,
			BigDecimal qtddistpop, BigDecimal qtddistiop, Date dtvalidpdop,
			String sitop, String obsop, String justficqtdprod,
			String justificcanc, Date dtcanc, String idusucanc, Date hcanc,
			Character estdinamica, Character garantia, char emmanut,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Ppopfase> ppopfases, Ppretcp ppretcp,
			Set<Eqmovserie> eqmovseries, Set<Cpcompra> cpcompras,
			Set<Ppopcq> ppopcqs, Set<Ppitop> ppitops, Set<Vdvenda> vdvendas,
			Set<Ppopsubprod> ppopsubprods, Set<Eqrma> eqrmas, Set<Ppop> ppops,
			Set<Ppopitorc> ppopitorcs, Set<Ppopentrada> ppopentradas,
			Set<Eqmovprod> eqmovprods) {
		this.id = id;
		this.ppop = ppop;
		this.ppestrutura = ppestrutura;
		this.eqtipomov = eqtipomov;
		this.eqalmox = eqalmox;
		this.cpitcompra = cpitcompra;
		this.eqlote = eqlote;
		this.eqitrecmercitos = eqitrecmercitos;
		this.dtemitop = dtemitop;
		this.refprod = refprod;
		this.dtfabrop = dtfabrop;
		this.qtdsugprodop = qtdsugprodop;
		this.qtdprevprodop = qtdprevprodop;
		this.qtdfinalprodop = qtdfinalprodop;
		this.qtddistpop = qtddistpop;
		this.qtddistiop = qtddistiop;
		this.dtvalidpdop = dtvalidpdop;
		this.sitop = sitop;
		this.obsop = obsop;
		this.justficqtdprod = justficqtdprod;
		this.justificcanc = justificcanc;
		this.dtcanc = dtcanc;
		this.idusucanc = idusucanc;
		this.hcanc = hcanc;
		this.estdinamica = estdinamica;
		this.garantia = garantia;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppopfases = ppopfases;
		this.ppretcp = ppretcp;
		this.eqmovseries = eqmovseries;
		this.cpcompras = cpcompras;
		this.ppopcqs = ppopcqs;
		this.ppitops = ppitops;
		this.vdvendas = vdvendas;
		this.ppopsubprods = ppopsubprods;
		this.eqrmas = eqrmas;
		this.ppops = ppops;
		this.ppopitorcs = ppopitorcs;
		this.ppopentradas = ppopentradas;
		this.eqmovprods = eqmovprods;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codop", column = @Column(name = "CODOP", nullable = false)),
			@AttributeOverride(name = "seqop", column = @Column(name = "SEQOP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpopId getId() {
		return this.id;
	}

	public void setId(PpopId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOPM", referencedColumnName = "CODOP"),
			@JoinColumn(name = "SEQOPM", referencedColumnName = "SEQOP"),
			@JoinColumn(name = "CODFILIALOPM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPOPM", referencedColumnName = "CODEMP") })
	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "SEQEST", referencedColumnName = "SEQEST", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Ppestrutura getPpestrutura() {
		return this.ppestrutura;
	}

	public void setPpestrutura(Ppestrutura ppestrutura) {
		this.ppestrutura = ppestrutura;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOV", referencedColumnName = "CODTIPOMOV", nullable = false),
			@JoinColumn(name = "CODFILIALTM", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTM", referencedColumnName = "CODEMP", nullable = false) })
	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX", nullable = false),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP", nullable = false) })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA"),
			@JoinColumn(name = "CODITCOMPRA", referencedColumnName = "CODITCOMPRA"),
			@JoinColumn(name = "CODFILIALCP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCP", referencedColumnName = "CODEMP") })
	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLOTE", referencedColumnName = "CODLOTE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALLE", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPLE", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Eqlote getEqlote() {
		return this.eqlote;
	}

	public void setEqlote(Eqlote eqlote) {
		this.eqlote = eqlote;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET"),
			@JoinColumn(name = "CODITRECMERC", referencedColumnName = "CODITRECMERC"),
			@JoinColumn(name = "CODITOS", referencedColumnName = "CODITOS"),
			@JoinColumn(name = "CODFILIALOS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPOS", referencedColumnName = "CODEMP") })
	public Eqitrecmercitos getEqitrecmercitos() {
		return this.eqitrecmercitos;
	}

	public void setEqitrecmercitos(Eqitrecmercitos eqitrecmercitos) {
		this.eqitrecmercitos = eqitrecmercitos;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTEMITOP", nullable = false, length = 10)
	public Date getDtemitop() {
		return this.dtemitop;
	}

	public void setDtemitop(Date dtemitop) {
		this.dtemitop = dtemitop;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTFABROP", nullable = false, length = 10)
	public Date getDtfabrop() {
		return this.dtfabrop;
	}

	public void setDtfabrop(Date dtfabrop) {
		this.dtfabrop = dtfabrop;
	}

	@Column(name = "QTDSUGPRODOP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdsugprodop() {
		return this.qtdsugprodop;
	}

	public void setQtdsugprodop(BigDecimal qtdsugprodop) {
		this.qtdsugprodop = qtdsugprodop;
	}

	@Column(name = "QTDPREVPRODOP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdprevprodop() {
		return this.qtdprevprodop;
	}

	public void setQtdprevprodop(BigDecimal qtdprevprodop) {
		this.qtdprevprodop = qtdprevprodop;
	}

	@Column(name = "QTDFINALPRODOP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdfinalprodop() {
		return this.qtdfinalprodop;
	}

	public void setQtdfinalprodop(BigDecimal qtdfinalprodop) {
		this.qtdfinalprodop = qtdfinalprodop;
	}

	@Column(name = "QTDDISTPOP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtddistpop() {
		return this.qtddistpop;
	}

	public void setQtddistpop(BigDecimal qtddistpop) {
		this.qtddistpop = qtddistpop;
	}

	@Column(name = "QTDDISTIOP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtddistiop() {
		return this.qtddistiop;
	}

	public void setQtddistiop(BigDecimal qtddistiop) {
		this.qtddistiop = qtddistiop;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTVALIDPDOP", length = 10)
	public Date getDtvalidpdop() {
		return this.dtvalidpdop;
	}

	public void setDtvalidpdop(Date dtvalidpdop) {
		this.dtvalidpdop = dtvalidpdop;
	}

	@Column(name = "SITOP", nullable = false, length = 2)
	public String getSitop() {
		return this.sitop;
	}

	public void setSitop(String sitop) {
		this.sitop = sitop;
	}

	@Column(name = "OBSOP", length = 1000)
	public String getObsop() {
		return this.obsop;
	}

	public void setObsop(String obsop) {
		this.obsop = obsop;
	}

	@Column(name = "JUSTFICQTDPROD", length = 500)
	public String getJustficqtdprod() {
		return this.justficqtdprod;
	}

	public void setJustficqtdprod(String justficqtdprod) {
		this.justficqtdprod = justficqtdprod;
	}

	@Column(name = "JUSTIFICCANC", length = 500)
	public String getJustificcanc() {
		return this.justificcanc;
	}

	public void setJustificcanc(String justificcanc) {
		this.justificcanc = justificcanc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTCANC", length = 19)
	public Date getDtcanc() {
		return this.dtcanc;
	}

	public void setDtcanc(Date dtcanc) {
		this.dtcanc = dtcanc;
	}

	@Column(name = "IDUSUCANC", length = 8)
	public String getIdusucanc() {
		return this.idusucanc;
	}

	public void setIdusucanc(String idusucanc) {
		this.idusucanc = idusucanc;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HCANC", length = 8)
	public Date getHcanc() {
		return this.hcanc;
	}

	public void setHcanc(Date hcanc) {
		this.hcanc = hcanc;
	}

	@Column(name = "ESTDINAMICA", length = 1)
	public Character getEstdinamica() {
		return this.estdinamica;
	}

	public void setEstdinamica(Character estdinamica) {
		this.estdinamica = estdinamica;
	}

	@Column(name = "GARANTIA", length = 1)
	public Character getGarantia() {
		return this.garantia;
	}

	public void setGarantia(Character garantia) {
		this.garantia = garantia;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppopfase> getPpopfases() {
		return this.ppopfases;
	}

	public void setPpopfases(Set<Ppopfase> ppopfases) {
		this.ppopfases = ppopfases;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Ppretcp getPpretcp() {
		return this.ppretcp;
	}

	public void setPpretcp(Ppretcp ppretcp) {
		this.ppretcp = ppretcp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Eqmovserie> getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set<Eqmovserie> eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Cpcompra> getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set<Cpcompra> cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppopcq> getPpopcqs() {
		return this.ppopcqs;
	}

	public void setPpopcqs(Set<Ppopcq> ppopcqs) {
		this.ppopcqs = ppopcqs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppitop> getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set<Ppitop> ppitops) {
		this.ppitops = ppitops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Vdvenda> getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set<Vdvenda> vdvendas) {
		this.vdvendas = vdvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppopsubprod> getPpopsubprods() {
		return this.ppopsubprods;
	}

	public void setPpopsubprods(Set<Ppopsubprod> ppopsubprods) {
		this.ppopsubprods = ppopsubprods;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Eqrma> getEqrmas() {
		return this.eqrmas;
	}

	public void setEqrmas(Set<Eqrma> eqrmas) {
		this.eqrmas = eqrmas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppop> getPpops() {
		return this.ppops;
	}

	public void setPpops(Set<Ppop> ppops) {
		this.ppops = ppops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppopitorc> getPpopitorcs() {
		return this.ppopitorcs;
	}

	public void setPpopitorcs(Set<Ppopitorc> ppopitorcs) {
		this.ppopitorcs = ppopitorcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Ppopentrada> getPpopentradas() {
		return this.ppopentradas;
	}

	public void setPpopentradas(Set<Ppopentrada> ppopentradas) {
		this.ppopentradas = ppopentradas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppop")
	public Set<Eqmovprod> getEqmovprods() {
		return this.eqmovprods;
	}

	public void setEqmovprods(Set<Eqmovprod> eqmovprods) {
		this.eqmovprods = eqmovprods;
	}

}

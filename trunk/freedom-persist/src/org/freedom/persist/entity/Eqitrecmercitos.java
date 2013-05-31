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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqitrecmercitos generated by hbm2java
 */
@Entity
@Table(name = "EQITRECMERCITOS")
public class Eqitrecmercitos implements java.io.Serializable {

	private EqitrecmercitosId id;
	private Sgfilial sgfilial;
	private Eqserie eqserie;
	private Eqitrecmerc eqitrecmerc;
	private Eqproduto eqproduto;
	private String refprodpd;
	private BigDecimal qtditos;
	private String obsitos;
	private String statusitos;
	private Character gerarma;
	private Character gerachamado;
	private Character geranovo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Ppop> ppops = new HashSet<Ppop>(0);
	private Set<Eqitrma> eqitrmas = new HashSet<Eqitrma>(0);
	private Set<Eqitrecmercitositorc> eqitrecmercitositorcs = new HashSet<Eqitrecmercitositorc>(
			0);
	private Set<Crchamado> crchamados = new HashSet<Crchamado>(0);

	public Eqitrecmercitos() {
	}

	public Eqitrecmercitos(EqitrecmercitosId id, Sgfilial sgfilial,
			Eqserie eqserie, Eqitrecmerc eqitrecmerc, Eqproduto eqproduto,
			String refprodpd, BigDecimal qtditos, String statusitos,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqserie = eqserie;
		this.eqitrecmerc = eqitrecmerc;
		this.eqproduto = eqproduto;
		this.refprodpd = refprodpd;
		this.qtditos = qtditos;
		this.statusitos = statusitos;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrecmercitos(EqitrecmercitosId id, Sgfilial sgfilial,
			Eqserie eqserie, Eqitrecmerc eqitrecmerc, Eqproduto eqproduto,
			String refprodpd, BigDecimal qtditos, String obsitos,
			String statusitos, Character gerarma, Character gerachamado,
			Character geranovo, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Ppop> ppops,
			Set<Eqitrma> eqitrmas,
			Set<Eqitrecmercitositorc> eqitrecmercitositorcs,
			Set<Crchamado> crchamados) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqserie = eqserie;
		this.eqitrecmerc = eqitrecmerc;
		this.eqproduto = eqproduto;
		this.refprodpd = refprodpd;
		this.qtditos = qtditos;
		this.obsitos = obsitos;
		this.statusitos = statusitos;
		this.gerarma = gerarma;
		this.gerachamado = gerachamado;
		this.geranovo = geranovo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppops = ppops;
		this.eqitrmas = eqitrmas;
		this.eqitrecmercitositorcs = eqitrecmercitositorcs;
		this.crchamados = crchamados;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ticket", column = @Column(name = "TICKET", nullable = false)),
			@AttributeOverride(name = "coditrecmerc", column = @Column(name = "CODITRECMERC", nullable = false)),
			@AttributeOverride(name = "coditos", column = @Column(name = "CODITOS", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqitrecmercitosId getId() {
		return this.id;
	}

	public void setId(EqitrecmercitosId id) {
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
			@JoinColumn(name = "NUMSERIE", referencedColumnName = "NUMSERIE"),
			@JoinColumn(name = "CODPRODPD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALNS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPNS", referencedColumnName = "CODEMP") })
	public Eqserie getEqserie() {
		return this.eqserie;
	}

	public void setEqserie(Eqserie eqserie) {
		this.eqserie = eqserie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITRECMERC", referencedColumnName = "CODITRECMERC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqitrecmerc getEqitrecmerc() {
		return this.eqitrecmerc;
	}

	public void setEqitrecmerc(Eqitrecmerc eqitrecmerc) {
		this.eqitrecmerc = eqitrecmerc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPRODPD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@Column(name = "REFPRODPD", nullable = false, length = 20)
	public String getRefprodpd() {
		return this.refprodpd;
	}

	public void setRefprodpd(String refprodpd) {
		this.refprodpd = refprodpd;
	}

	@Column(name = "QTDITOS", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditos() {
		return this.qtditos;
	}

	public void setQtditos(BigDecimal qtditos) {
		this.qtditos = qtditos;
	}

	@Column(name = "OBSITOS", length = 1000)
	public String getObsitos() {
		return this.obsitos;
	}

	public void setObsitos(String obsitos) {
		this.obsitos = obsitos;
	}

	@Column(name = "STATUSITOS", nullable = false, length = 2)
	public String getStatusitos() {
		return this.statusitos;
	}

	public void setStatusitos(String statusitos) {
		this.statusitos = statusitos;
	}

	@Column(name = "GERARMA", length = 1)
	public Character getGerarma() {
		return this.gerarma;
	}

	public void setGerarma(Character gerarma) {
		this.gerarma = gerarma;
	}

	@Column(name = "GERACHAMADO", length = 1)
	public Character getGerachamado() {
		return this.gerachamado;
	}

	public void setGerachamado(Character gerachamado) {
		this.gerachamado = gerachamado;
	}

	@Column(name = "GERANOVO", length = 1)
	public Character getGeranovo() {
		return this.geranovo;
	}

	public void setGeranovo(Character geranovo) {
		this.geranovo = geranovo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmercitos")
	public Set<Ppop> getPpops() {
		return this.ppops;
	}

	public void setPpops(Set<Ppop> ppops) {
		this.ppops = ppops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmercitos")
	public Set<Eqitrma> getEqitrmas() {
		return this.eqitrmas;
	}

	public void setEqitrmas(Set<Eqitrma> eqitrmas) {
		this.eqitrmas = eqitrmas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmercitos")
	public Set<Eqitrecmercitositorc> getEqitrecmercitositorcs() {
		return this.eqitrecmercitositorcs;
	}

	public void setEqitrecmercitositorcs(
			Set<Eqitrecmercitositorc> eqitrecmercitositorcs) {
		this.eqitrecmercitositorcs = eqitrecmercitositorcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmercitos")
	public Set<Crchamado> getCrchamados() {
		return this.crchamados;
	}

	public void setCrchamados(Set<Crchamado> crchamados) {
		this.crchamados = crchamados;
	}

}

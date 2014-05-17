package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Eqitrma generated by hbm2java
 */
@Entity
@Table(name = "EQITRMA")
public class Eqitrma implements java.io.Serializable {

	private EqitrmaId id;
	private Eqproduto eqproduto;
	private Eqalmox eqalmox;
	private Eqlote eqlote;
	private Eqrma eqrma;
	private Eqitrecmercitos eqitrecmercitos;
	private BigDecimal qtditrma;
	private BigDecimal qtdaprovitrma;
	private BigDecimal qtdexpitrma;
	private String refprod;
	private Date dtaprovitrma;
	private Date dtaexpitrma;
	private BigDecimal precoitrma;
	private String sititrma;
	private String sitaprovitrma;
	private String sitexpitrma;
	private String motivocancitrma;
	private char prioritrma;
	private String motivoprioritrma;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqmovseries = new HashSet(0);
	private Set eqmovprods = new HashSet(0);

	public Eqitrma() {
	}

	public Eqitrma(EqitrmaId id, Eqproduto eqproduto, Eqalmox eqalmox,
			Eqlote eqlote, Eqrma eqrma, BigDecimal qtditrma,
			BigDecimal qtdaprovitrma, BigDecimal qtdexpitrma, String refprod,
			BigDecimal precoitrma, String sititrma, String sitaprovitrma,
			String sitexpitrma, char prioritrma, char emmanut, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.eqrma = eqrma;
		this.qtditrma = qtditrma;
		this.qtdaprovitrma = qtdaprovitrma;
		this.qtdexpitrma = qtdexpitrma;
		this.refprod = refprod;
		this.precoitrma = precoitrma;
		this.sititrma = sititrma;
		this.sitaprovitrma = sitaprovitrma;
		this.sitexpitrma = sitexpitrma;
		this.prioritrma = prioritrma;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrma(EqitrmaId id, Eqproduto eqproduto, Eqalmox eqalmox,
			Eqlote eqlote, Eqrma eqrma, Eqitrecmercitos eqitrecmercitos,
			BigDecimal qtditrma, BigDecimal qtdaprovitrma,
			BigDecimal qtdexpitrma, String refprod, Date dtaprovitrma,
			Date dtaexpitrma, BigDecimal precoitrma, String sititrma,
			String sitaprovitrma, String sitexpitrma, String motivocancitrma,
			char prioritrma, String motivoprioritrma, char emmanut, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqmovseries, Set eqmovprods) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.eqrma = eqrma;
		this.eqitrecmercitos = eqitrecmercitos;
		this.qtditrma = qtditrma;
		this.qtdaprovitrma = qtdaprovitrma;
		this.qtdexpitrma = qtdexpitrma;
		this.refprod = refprod;
		this.dtaprovitrma = dtaprovitrma;
		this.dtaexpitrma = dtaexpitrma;
		this.precoitrma = precoitrma;
		this.sititrma = sititrma;
		this.sitaprovitrma = sitaprovitrma;
		this.sitexpitrma = sitexpitrma;
		this.motivocancitrma = motivocancitrma;
		this.prioritrma = prioritrma;
		this.motivoprioritrma = motivoprioritrma;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqmovseries = eqmovseries;
		this.eqmovprods = eqmovprods;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codrma", column = @Column(name = "CODRMA", nullable = false)),
			@AttributeOverride(name = "coditrma", column = @Column(name = "CODITRMA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqitrmaId getId() {
		return this.id;
	}

	public void setId(EqitrmaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX"),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP") })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLOTE", referencedColumnName = "CODLOTE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", insertable = false, updatable = false),
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
			@JoinColumn(name = "CODRMA", referencedColumnName = "CODRMA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqrma getEqrma() {
		return this.eqrma;
	}

	public void setEqrma(Eqrma eqrma) {
		this.eqrma = eqrma;
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

	@Column(name = "QTDITRMA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditrma() {
		return this.qtditrma;
	}

	public void setQtditrma(BigDecimal qtditrma) {
		this.qtditrma = qtditrma;
	}

	@Column(name = "QTDAPROVITRMA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdaprovitrma() {
		return this.qtdaprovitrma;
	}

	public void setQtdaprovitrma(BigDecimal qtdaprovitrma) {
		this.qtdaprovitrma = qtdaprovitrma;
	}

	@Column(name = "QTDEXPITRMA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdexpitrma() {
		return this.qtdexpitrma;
	}

	public void setQtdexpitrma(BigDecimal qtdexpitrma) {
		this.qtdexpitrma = qtdexpitrma;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAPROVITRMA", length = 10)
	public Date getDtaprovitrma() {
		return this.dtaprovitrma;
	}

	public void setDtaprovitrma(Date dtaprovitrma) {
		this.dtaprovitrma = dtaprovitrma;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAEXPITRMA", length = 10)
	public Date getDtaexpitrma() {
		return this.dtaexpitrma;
	}

	public void setDtaexpitrma(Date dtaexpitrma) {
		this.dtaexpitrma = dtaexpitrma;
	}

	@Column(name = "PRECOITRMA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPrecoitrma() {
		return this.precoitrma;
	}

	public void setPrecoitrma(BigDecimal precoitrma) {
		this.precoitrma = precoitrma;
	}

	@Column(name = "SITITRMA", nullable = false, length = 2)
	public String getSititrma() {
		return this.sititrma;
	}

	public void setSititrma(String sititrma) {
		this.sititrma = sititrma;
	}

	@Column(name = "SITAPROVITRMA", nullable = false, length = 2)
	public String getSitaprovitrma() {
		return this.sitaprovitrma;
	}

	public void setSitaprovitrma(String sitaprovitrma) {
		this.sitaprovitrma = sitaprovitrma;
	}

	@Column(name = "SITEXPITRMA", nullable = false, length = 2)
	public String getSitexpitrma() {
		return this.sitexpitrma;
	}

	public void setSitexpitrma(String sitexpitrma) {
		this.sitexpitrma = sitexpitrma;
	}

	@Column(name = "MOTIVOCANCITRMA", length = 10000)
	public String getMotivocancitrma() {
		return this.motivocancitrma;
	}

	public void setMotivocancitrma(String motivocancitrma) {
		this.motivocancitrma = motivocancitrma;
	}

	@Column(name = "PRIORITRMA", nullable = false, length = 1)
	public char getPrioritrma() {
		return this.prioritrma;
	}

	public void setPrioritrma(char prioritrma) {
		this.prioritrma = prioritrma;
	}

	@Column(name = "MOTIVOPRIORITRMA", length = 10000)
	public String getMotivoprioritrma() {
		return this.motivoprioritrma;
	}

	public void setMotivoprioritrma(String motivoprioritrma) {
		this.motivoprioritrma = motivoprioritrma;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrma")
	public Set getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrma")
	public Set getEqmovprods() {
		return this.eqmovprods;
	}

	public void setEqmovprods(Set eqmovprods) {
		this.eqmovprods = eqmovprods;
	}
*/
}

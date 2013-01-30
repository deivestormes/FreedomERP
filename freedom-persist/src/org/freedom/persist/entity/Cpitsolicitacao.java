package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Cpitsolicitacao generated by hbm2java
 */
@Entity
@Table(name = "CPITSOLICITACAO")
public class Cpitsolicitacao implements java.io.Serializable {

	private CpitsolicitacaoId id;
	private Eqproduto eqproduto;
	private Cpsolicitacao cpsolicitacao;
	private Eqalmox eqalmox;
	private int codemppd;
	private short codfilialpd;
	private String refprod;
	private BigDecimal qtditsol;
	private BigDecimal qtdaprovitsol;
	private String idusuitsol;
	private Date dtitsol;
	private String idusuaprovitsol;
	private Date dtaprovitsol;
	private String sitaprovitsol;
	private String sitcompitsol;
	private String sititsol;
	private String motivoitsol;
	private String motivoaprovitsol;
	private String motivocompitsol;
	private String idusucancitsol;
	private char prioritsol;
	private String motivoprioritsol;
	private String motivocancitsol;
	private String motivocotabaix;
	private Integer codempua;
	private Short codfilialua;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpcomprasol> cpcomprasols = new HashSet<Cpcomprasol>(0);
	private Set<Cpitsumsol> cpitsumsols = new HashSet<Cpitsumsol>(0);
	private Set<Cpitsolitsol> cpitsolitsolsForCpitsolfkcpitsoli = new HashSet<Cpitsolitsol>(
			0);
	private Set<Cpitsolitsol> cpitsolitsolsForCpitsolfkcpitsoln = new HashSet<Cpitsolitsol>(
			0);

	public Cpitsolicitacao() {
	}

	public Cpitsolicitacao(CpitsolicitacaoId id, Eqproduto eqproduto,
			Cpsolicitacao cpsolicitacao, Eqalmox eqalmox, int codemppd,
			short codfilialpd, String refprod, BigDecimal qtditsol,
			BigDecimal qtdaprovitsol, String idusuitsol, Date dtitsol,
			String sitaprovitsol, String sitcompitsol, String sititsol,
			char prioritsol, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpsolicitacao = cpsolicitacao;
		this.eqalmox = eqalmox;
		this.codemppd = codemppd;
		this.codfilialpd = codfilialpd;
		this.refprod = refprod;
		this.qtditsol = qtditsol;
		this.qtdaprovitsol = qtdaprovitsol;
		this.idusuitsol = idusuitsol;
		this.dtitsol = dtitsol;
		this.sitaprovitsol = sitaprovitsol;
		this.sitcompitsol = sitcompitsol;
		this.sititsol = sititsol;
		this.prioritsol = prioritsol;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpitsolicitacao(CpitsolicitacaoId id, Eqproduto eqproduto,
			Cpsolicitacao cpsolicitacao, Eqalmox eqalmox, int codemppd,
			short codfilialpd, String refprod, BigDecimal qtditsol,
			BigDecimal qtdaprovitsol, String idusuitsol, Date dtitsol,
			String idusuaprovitsol, Date dtaprovitsol, String sitaprovitsol,
			String sitcompitsol, String sititsol, String motivoitsol,
			String motivoaprovitsol, String motivocompitsol,
			String idusucancitsol, char prioritsol, String motivoprioritsol,
			String motivocancitsol, String motivocotabaix, Integer codempua,
			Short codfilialua, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt,
			Set<Cpcomprasol> cpcomprasols, Set<Cpitsumsol> cpitsumsols,
			Set<Cpitsolitsol> cpitsolitsolsForCpitsolfkcpitsoli,
			Set<Cpitsolitsol> cpitsolitsolsForCpitsolfkcpitsoln) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpsolicitacao = cpsolicitacao;
		this.eqalmox = eqalmox;
		this.codemppd = codemppd;
		this.codfilialpd = codfilialpd;
		this.refprod = refprod;
		this.qtditsol = qtditsol;
		this.qtdaprovitsol = qtdaprovitsol;
		this.idusuitsol = idusuitsol;
		this.dtitsol = dtitsol;
		this.idusuaprovitsol = idusuaprovitsol;
		this.dtaprovitsol = dtaprovitsol;
		this.sitaprovitsol = sitaprovitsol;
		this.sitcompitsol = sitcompitsol;
		this.sititsol = sititsol;
		this.motivoitsol = motivoitsol;
		this.motivoaprovitsol = motivoaprovitsol;
		this.motivocompitsol = motivocompitsol;
		this.idusucancitsol = idusucancitsol;
		this.prioritsol = prioritsol;
		this.motivoprioritsol = motivoprioritsol;
		this.motivocancitsol = motivocancitsol;
		this.motivocotabaix = motivocotabaix;
		this.codempua = codempua;
		this.codfilialua = codfilialua;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpcomprasols = cpcomprasols;
		this.cpitsumsols = cpitsumsols;
		this.cpitsolitsolsForCpitsolfkcpitsoli = cpitsolitsolsForCpitsolfkcpitsoli;
		this.cpitsolitsolsForCpitsolfkcpitsoln = cpitsolitsolsForCpitsolfkcpitsoln;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsol", column = @Column(name = "CODSOL", nullable = false)),
			@AttributeOverride(name = "coditsol", column = @Column(name = "CODITSOL", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpitsolicitacaoId getId() {
		return this.id;
	}

	public void setId(CpitsolicitacaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSOL", referencedColumnName = "CODSOL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpsolicitacao getCpsolicitacao() {
		return this.cpsolicitacao;
	}

	public void setCpsolicitacao(Cpsolicitacao cpsolicitacao) {
		this.cpsolicitacao = cpsolicitacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX", nullable = false),
			@JoinColumn(name = "CODFILIALAM", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAM", referencedColumnName = "CODEMP", nullable = false) })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@Column(name = "CODEMPPD", nullable = false)
	public int getCodemppd() {
		return this.codemppd;
	}

	public void setCodemppd(int codemppd) {
		this.codemppd = codemppd;
	}

	@Column(name = "CODFILIALPD", nullable = false)
	public short getCodfilialpd() {
		return this.codfilialpd;
	}

	public void setCodfilialpd(short codfilialpd) {
		this.codfilialpd = codfilialpd;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "QTDITSOL", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditsol() {
		return this.qtditsol;
	}

	public void setQtditsol(BigDecimal qtditsol) {
		this.qtditsol = qtditsol;
	}

	@Column(name = "QTDAPROVITSOL", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdaprovitsol() {
		return this.qtdaprovitsol;
	}

	public void setQtdaprovitsol(BigDecimal qtdaprovitsol) {
		this.qtdaprovitsol = qtdaprovitsol;
	}

	@Column(name = "IDUSUITSOL", nullable = false, length = 8)
	public String getIdusuitsol() {
		return this.idusuitsol;
	}

	public void setIdusuitsol(String idusuitsol) {
		this.idusuitsol = idusuitsol;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTITSOL", nullable = false, length = 10)
	public Date getDtitsol() {
		return this.dtitsol;
	}

	public void setDtitsol(Date dtitsol) {
		this.dtitsol = dtitsol;
	}

	@Column(name = "IDUSUAPROVITSOL", length = 8)
	public String getIdusuaprovitsol() {
		return this.idusuaprovitsol;
	}

	public void setIdusuaprovitsol(String idusuaprovitsol) {
		this.idusuaprovitsol = idusuaprovitsol;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAPROVITSOL", length = 10)
	public Date getDtaprovitsol() {
		return this.dtaprovitsol;
	}

	public void setDtaprovitsol(Date dtaprovitsol) {
		this.dtaprovitsol = dtaprovitsol;
	}

	@Column(name = "SITAPROVITSOL", nullable = false, length = 2)
	public String getSitaprovitsol() {
		return this.sitaprovitsol;
	}

	public void setSitaprovitsol(String sitaprovitsol) {
		this.sitaprovitsol = sitaprovitsol;
	}

	@Column(name = "SITCOMPITSOL", nullable = false, length = 2)
	public String getSitcompitsol() {
		return this.sitcompitsol;
	}

	public void setSitcompitsol(String sitcompitsol) {
		this.sitcompitsol = sitcompitsol;
	}

	@Column(name = "SITITSOL", nullable = false, length = 2)
	public String getSititsol() {
		return this.sititsol;
	}

	public void setSititsol(String sititsol) {
		this.sititsol = sititsol;
	}

	@Column(name = "MOTIVOITSOL", length = 10000)
	public String getMotivoitsol() {
		return this.motivoitsol;
	}

	public void setMotivoitsol(String motivoitsol) {
		this.motivoitsol = motivoitsol;
	}

	@Column(name = "MOTIVOAPROVITSOL", length = 10000)
	public String getMotivoaprovitsol() {
		return this.motivoaprovitsol;
	}

	public void setMotivoaprovitsol(String motivoaprovitsol) {
		this.motivoaprovitsol = motivoaprovitsol;
	}

	@Column(name = "MOTIVOCOMPITSOL", length = 10000)
	public String getMotivocompitsol() {
		return this.motivocompitsol;
	}

	public void setMotivocompitsol(String motivocompitsol) {
		this.motivocompitsol = motivocompitsol;
	}

	@Column(name = "IDUSUCANCITSOL", length = 8)
	public String getIdusucancitsol() {
		return this.idusucancitsol;
	}

	public void setIdusucancitsol(String idusucancitsol) {
		this.idusucancitsol = idusucancitsol;
	}

	@Column(name = "PRIORITSOL", nullable = false, length = 1)
	public char getPrioritsol() {
		return this.prioritsol;
	}

	public void setPrioritsol(char prioritsol) {
		this.prioritsol = prioritsol;
	}

	@Column(name = "MOTIVOPRIORITSOL", length = 10000)
	public String getMotivoprioritsol() {
		return this.motivoprioritsol;
	}

	public void setMotivoprioritsol(String motivoprioritsol) {
		this.motivoprioritsol = motivoprioritsol;
	}

	@Column(name = "MOTIVOCANCITSOL", length = 10000)
	public String getMotivocancitsol() {
		return this.motivocancitsol;
	}

	public void setMotivocancitsol(String motivocancitsol) {
		this.motivocancitsol = motivocancitsol;
	}

	@Column(name = "MOTIVOCOTABAIX", length = 10000)
	public String getMotivocotabaix() {
		return this.motivocotabaix;
	}

	public void setMotivocotabaix(String motivocotabaix) {
		this.motivocotabaix = motivocotabaix;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitsolicitacao")
	public Set<Cpcomprasol> getCpcomprasols() {
		return this.cpcomprasols;
	}

	public void setCpcomprasols(Set<Cpcomprasol> cpcomprasols) {
		this.cpcomprasols = cpcomprasols;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitsolicitacao")
	public Set<Cpitsumsol> getCpitsumsols() {
		return this.cpitsumsols;
	}

	public void setCpitsumsols(Set<Cpitsumsol> cpitsumsols) {
		this.cpitsumsols = cpitsumsols;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitsolicitacaoByCpitsolfkcpitsoli")
	public Set<Cpitsolitsol> getCpitsolitsolsForCpitsolfkcpitsoli() {
		return this.cpitsolitsolsForCpitsolfkcpitsoli;
	}

	public void setCpitsolitsolsForCpitsolfkcpitsoli(
			Set<Cpitsolitsol> cpitsolitsolsForCpitsolfkcpitsoli) {
		this.cpitsolitsolsForCpitsolfkcpitsoli = cpitsolitsolsForCpitsolfkcpitsoli;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitsolicitacaoByCpitsolfkcpitsoln")
	public Set<Cpitsolitsol> getCpitsolitsolsForCpitsolfkcpitsoln() {
		return this.cpitsolitsolsForCpitsolfkcpitsoln;
	}

	public void setCpitsolitsolsForCpitsolfkcpitsoln(
			Set<Cpitsolitsol> cpitsolitsolsForCpitsolfkcpitsoln) {
		this.cpitsolitsolsForCpitsolfkcpitsoln = cpitsolitsolsForCpitsolfkcpitsoln;
	}

}

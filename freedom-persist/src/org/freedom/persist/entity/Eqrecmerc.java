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
 * Eqrecmerc generated by hbm2java
 */
@Entity
@Table(name = "EQRECMERC")
public class Eqrecmerc implements java.io.Serializable {

	private EqrecmercId id;
	private Eqtiporecmerc eqtiporecmerc;
	private Eqproduto eqproduto;
	private Sgfilial sgfilial;
	private Cpforneced cpforneced;
	private Vdcliente vdcliente;
	private Eqalmox eqalmox;
	private Vdvendedor vdvendedor;
	private Sgbairro sgbairro;
	private Vdtransp vdtransp;
	private Atatendente atatendente;
	private String placaveiculo;
	private String refprod;
	private String idusualt;
	private String status;
	private char tipofrete;
	private Date dtent;
	private Date dtprevret;
	private Integer docrecmerc;
	private String solicitante;
	private BigDecimal mediaamostragem;
	private Short rendaamostragem;
	private String obsrecmerc;
	private BigDecimal desconto;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private Set<Eqitrecmerc> eqitrecmercs = new HashSet<Eqitrecmerc>(0);
	private Set<Cpcompra> cpcompras = new HashSet<Cpcompra>(0);
	private Set<Lffrete> lffretes = new HashSet<Lffrete>(0);
	private Set<Vdvenda> vdvendas = new HashSet<Vdvenda>(0);
	private Set<Eqrma> eqrmas = new HashSet<Eqrma>(0);
	private Set<Eqmovserie> eqmovseries = new HashSet<Eqmovserie>(0);

	public Eqrecmerc() {
	}

	public Eqrecmerc(EqrecmercId id, Eqtiporecmerc eqtiporecmerc,
			Sgfilial sgfilial, String status, char tipofrete, Date dtent,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqtiporecmerc = eqtiporecmerc;
		this.sgfilial = sgfilial;
		this.status = status;
		this.tipofrete = tipofrete;
		this.dtent = dtent;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqrecmerc(EqrecmercId id, Eqtiporecmerc eqtiporecmerc,
			Eqproduto eqproduto, Sgfilial sgfilial, Cpforneced cpforneced,
			Vdcliente vdcliente, Eqalmox eqalmox, Vdvendedor vdvendedor,
			Sgbairro sgbairro, Vdtransp vdtransp, Atatendente atatendente,
			String placaveiculo, String refprod, String idusualt,
			String status, char tipofrete, Date dtent, Date dtprevret,
			Integer docrecmerc, String solicitante, BigDecimal mediaamostragem,
			Short rendaamostragem, String obsrecmerc, BigDecimal desconto,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			Set<Eqitrecmerc> eqitrecmercs, Set<Cpcompra> cpcompras,
			Set<Lffrete> lffretes, Set<Vdvenda> vdvendas, Set<Eqrma> eqrmas,
			Set<Eqmovserie> eqmovseries) {
		this.id = id;
		this.eqtiporecmerc = eqtiporecmerc;
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.vdcliente = vdcliente;
		this.eqalmox = eqalmox;
		this.vdvendedor = vdvendedor;
		this.sgbairro = sgbairro;
		this.vdtransp = vdtransp;
		this.atatendente = atatendente;
		this.placaveiculo = placaveiculo;
		this.refprod = refprod;
		this.idusualt = idusualt;
		this.status = status;
		this.tipofrete = tipofrete;
		this.dtent = dtent;
		this.dtprevret = dtprevret;
		this.docrecmerc = docrecmerc;
		this.solicitante = solicitante;
		this.mediaamostragem = mediaamostragem;
		this.rendaamostragem = rendaamostragem;
		this.obsrecmerc = obsrecmerc;
		this.desconto = desconto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.eqitrecmercs = eqitrecmercs;
		this.cpcompras = cpcompras;
		this.lffretes = lffretes;
		this.vdvendas = vdvendas;
		this.eqrmas = eqrmas;
		this.eqmovseries = eqmovseries;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ticket", column = @Column(name = "TICKET", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqrecmercId getId() {
		return this.id;
	}

	public void setId(EqrecmercId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPORECMERC", referencedColumnName = "CODTIPORECMERC", nullable = false),
			@JoinColumn(name = "CODFILIALTR", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTR", referencedColumnName = "CODEMP", nullable = false) })
	public Eqtiporecmerc getEqtiporecmerc() {
		return this.eqtiporecmerc;
	}

	public void setEqtiporecmerc(Eqtiporecmerc eqtiporecmerc) {
		this.eqtiporecmerc = eqtiporecmerc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD"),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP") })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
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
			@JoinColumn(name = "CODFOR", referencedColumnName = "CODFOR"),
			@JoinColumn(name = "CODFILIALFR", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPFR", referencedColumnName = "CODEMP") })
	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI"),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP") })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
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
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBAIRRO", referencedColumnName = "CODBAIRRO"),
			@JoinColumn(name = "CODMUNIC", referencedColumnName = "CODMUNIC"),
			@JoinColumn(name = "SIGLAUF", referencedColumnName = "SIGLAUF"),
			@JoinColumn(name = "CODPAIS", referencedColumnName = "CODPAIS") })
	public Sgbairro getSgbairro() {
		return this.sgbairro;
	}

	public void setSgbairro(Sgbairro sgbairro) {
		this.sgbairro = sgbairro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATENDREC", referencedColumnName = "CODATEND"),
			@JoinColumn(name = "CODFILIALAR", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAR", referencedColumnName = "CODEMP") })
	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	@Column(name = "PLACAVEICULO", length = 7)
	public String getPlacaveiculo() {
		return this.placaveiculo;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@Column(name = "STATUS", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "TIPOFRETE", nullable = false, length = 1)
	public char getTipofrete() {
		return this.tipofrete;
	}

	public void setTipofrete(char tipofrete) {
		this.tipofrete = tipofrete;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTENT", nullable = false, length = 10)
	public Date getDtent() {
		return this.dtent;
	}

	public void setDtent(Date dtent) {
		this.dtent = dtent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVRET", length = 10)
	public Date getDtprevret() {
		return this.dtprevret;
	}

	public void setDtprevret(Date dtprevret) {
		this.dtprevret = dtprevret;
	}

	@Column(name = "DOCRECMERC")
	public Integer getDocrecmerc() {
		return this.docrecmerc;
	}

	public void setDocrecmerc(Integer docrecmerc) {
		this.docrecmerc = docrecmerc;
	}

	@Column(name = "SOLICITANTE", length = 50)
	public String getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	@Column(name = "MEDIAAMOSTRAGEM", precision = 15, scale = 5)
	public BigDecimal getMediaamostragem() {
		return this.mediaamostragem;
	}

	public void setMediaamostragem(BigDecimal mediaamostragem) {
		this.mediaamostragem = mediaamostragem;
	}

	@Column(name = "RENDAAMOSTRAGEM")
	public Short getRendaamostragem() {
		return this.rendaamostragem;
	}

	public void setRendaamostragem(Short rendaamostragem) {
		this.rendaamostragem = rendaamostragem;
	}

	@Column(name = "OBSRECMERC", length = 1000)
	public String getObsrecmerc() {
		return this.obsrecmerc;
	}

	public void setObsrecmerc(String obsrecmerc) {
		this.obsrecmerc = obsrecmerc;
	}

	@Column(name = "DESCONTO", precision = 15, scale = 5)
	public BigDecimal getDesconto() {
		return this.desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqrecmerc")
	public Set<Eqitrecmerc> getEqitrecmercs() {
		return this.eqitrecmercs;
	}

	public void setEqitrecmercs(Set<Eqitrecmerc> eqitrecmercs) {
		this.eqitrecmercs = eqitrecmercs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqrecmerc")
	public Set<Cpcompra> getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set<Cpcompra> cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqrecmerc")
	public Set<Lffrete> getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set<Lffrete> lffretes) {
		this.lffretes = lffretes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqrecmerc")
	public Set<Vdvenda> getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set<Vdvenda> vdvendas) {
		this.vdvendas = vdvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqrecmerc")
	public Set<Eqrma> getEqrmas() {
		return this.eqrmas;
	}

	public void setEqrmas(Set<Eqrma> eqrmas) {
		this.eqrmas = eqrmas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqrecmerc")
	public Set<Eqmovserie> getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set<Eqmovserie> eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

}

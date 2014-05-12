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
 * Vdvendedor generated by hbm2java
 */
@Entity
@Table(name = "VDVENDEDOR")
public class Vdvendedor implements java.io.Serializable {

	private VdvendedorId id;
	private Vdsetor vdsetor;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Rhfuncao rhfuncao;
	private Vdclcomis vdclcomis;
	private Fnplanejamento fnplanejamento;
	private Eqsecao eqsecao;
	private Vdtipovend vdtipovend;
	private String nomevend;
	private String endvend;
	private Integer numvend;
	private String complvend;
	private String bairvend;
	private String cidvend;
	private String cepvend;
	private String ufvend;
	private String fonevend;
	private String faxvend;
	private String emailvend;
	private BigDecimal perccomvend;
	private Character comipivend;
	private String cpfvend;
	private String rgvend;
	private String cnpjvend;
	private String inscvend;
	private String celvend;
	private String codfornvend;
	private String dddfonevend;
	private String dddfaxvend;
	private String dddcelvend;
	private String sspvend;
	private String obsvend;
	private char ativocomis;
	private byte[] imgassvend;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private BigDecimal vlrabono;
	private BigDecimal vlrdesconto;
	private Set vdconsignacaos = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set sgprefere2s = new HashSet(0);
	private Set vdvendacomises = new HashSet(0);
	private Set vdclientes = new HashSet(0);
	private Set atatendentes = new HashSet(0);
	private Set eqrecmercs = new HashSet(0);
	private Set vdcomissaos = new HashSet(0);
	private Set sgprefere2s_1 = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set vditregracomises = new HashSet(0);
	private Set crfichaavals = new HashSet(0);
	private Set tkcontatos = new HashSet(0);
	private Set vdorcamentos = new HashSet(0);

	public Vdvendedor() {
	}

	public Vdvendedor(VdvendedorId id, Sgfilial sgfilial, char ativocomis,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.ativocomis = ativocomis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdvendedor(VdvendedorId id, Vdsetor vdsetor, Sgfilial sgfilial,
			Fnconta fnconta, Rhfuncao rhfuncao, Vdclcomis vdclcomis,
			Fnplanejamento fnplanejamento, Eqsecao eqsecao,
			Vdtipovend vdtipovend, String nomevend, String endvend,
			Integer numvend, String complvend, String bairvend, String cidvend,
			String cepvend, String ufvend, String fonevend, String faxvend,
			String emailvend, BigDecimal perccomvend, Character comipivend,
			String cpfvend, String rgvend, String cnpjvend, String inscvend,
			String celvend, String codfornvend, String dddfonevend,
			String dddfaxvend, String dddcelvend, String sspvend,
			String obsvend, char ativocomis, byte[] imgassvend, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			BigDecimal vlrabono, BigDecimal vlrdesconto, Set vdconsignacaos,
			Set vdvendas, Set sgprefere2s, Set vdvendacomises, Set vdclientes,
			Set atatendentes, Set eqrecmercs, Set vdcomissaos,
			Set sgprefere2s_1, Set fnrecebers, Set vditregracomises,
			Set crfichaavals, Set tkcontatos, Set vdorcamentos) {
		this.id = id;
		this.vdsetor = vdsetor;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.rhfuncao = rhfuncao;
		this.vdclcomis = vdclcomis;
		this.fnplanejamento = fnplanejamento;
		this.eqsecao = eqsecao;
		this.vdtipovend = vdtipovend;
		this.nomevend = nomevend;
		this.endvend = endvend;
		this.numvend = numvend;
		this.complvend = complvend;
		this.bairvend = bairvend;
		this.cidvend = cidvend;
		this.cepvend = cepvend;
		this.ufvend = ufvend;
		this.fonevend = fonevend;
		this.faxvend = faxvend;
		this.emailvend = emailvend;
		this.perccomvend = perccomvend;
		this.comipivend = comipivend;
		this.cpfvend = cpfvend;
		this.rgvend = rgvend;
		this.cnpjvend = cnpjvend;
		this.inscvend = inscvend;
		this.celvend = celvend;
		this.codfornvend = codfornvend;
		this.dddfonevend = dddfonevend;
		this.dddfaxvend = dddfaxvend;
		this.dddcelvend = dddcelvend;
		this.sspvend = sspvend;
		this.obsvend = obsvend;
		this.ativocomis = ativocomis;
		this.imgassvend = imgassvend;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vlrabono = vlrabono;
		this.vlrdesconto = vlrdesconto;
		this.vdconsignacaos = vdconsignacaos;
		this.vdvendas = vdvendas;
		this.sgprefere2s = sgprefere2s;
		this.vdvendacomises = vdvendacomises;
		this.vdclientes = vdclientes;
		this.atatendentes = atatendentes;
		this.eqrecmercs = eqrecmercs;
		this.vdcomissaos = vdcomissaos;
		this.sgprefere2s_1 = sgprefere2s_1;
		this.fnrecebers = fnrecebers;
		this.vditregracomises = vditregracomises;
		this.crfichaavals = crfichaavals;
		this.tkcontatos = tkcontatos;
		this.vdorcamentos = vdorcamentos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvend", column = @Column(name = "CODVEND", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdvendedorId getId() {
		return this.id;
	}

	public void setId(VdvendedorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSETOR", referencedColumnName = "CODSETOR"),
			@JoinColumn(name = "CODFILIALSE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPSE", referencedColumnName = "CODEMP") })
	public Vdsetor getVdsetor() {
		return this.vdsetor;
	}

	public void setVdsetor(Vdsetor vdsetor) {
		this.vdsetor = vdsetor;
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
			@JoinColumn(name = "NUMCONTA", referencedColumnName = "NUMCONTA"),
			@JoinColumn(name = "CODFILIALCA", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCA", referencedColumnName = "CODEMP") })
	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFUNC", referencedColumnName = "CODFUNC"),
			@JoinColumn(name = "CODFILIALFU", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPFU", referencedColumnName = "CODEMP") })
	public Rhfuncao getRhfuncao() {
		return this.rhfuncao;
	}

	public void setRhfuncao(Rhfuncao rhfuncao) {
		this.rhfuncao = rhfuncao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLCOMIS", referencedColumnName = "CODCLCOMIS"),
			@JoinColumn(name = "CODFILIALCM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCM", referencedColumnName = "CODEMP") })
	public Vdclcomis getVdclcomis() {
		return this.vdclcomis;
	}

	public void setVdclcomis(Vdclcomis vdclcomis) {
		this.vdclcomis = vdclcomis;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLAN", referencedColumnName = "CODPLAN"),
			@JoinColumn(name = "CODFILIALPN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPN", referencedColumnName = "CODEMP") })
	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSECAO", referencedColumnName = "CODSECAO"),
			@JoinColumn(name = "CODFILIALSC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPSC", referencedColumnName = "CODEMP") })
	public Eqsecao getEqsecao() {
		return this.eqsecao;
	}

	public void setEqsecao(Eqsecao eqsecao) {
		this.eqsecao = eqsecao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOVEND", referencedColumnName = "CODTIPOVEND"),
			@JoinColumn(name = "CODFILIALTV", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTV", referencedColumnName = "CODEMP") })
	public Vdtipovend getVdtipovend() {
		return this.vdtipovend;
	}

	public void setVdtipovend(Vdtipovend vdtipovend) {
		this.vdtipovend = vdtipovend;
	}

	@Column(name = "NOMEVEND", length = 40)
	public String getNomevend() {
		return this.nomevend;
	}

	public void setNomevend(String nomevend) {
		this.nomevend = nomevend;
	}

	@Column(name = "ENDVEND", length = 50)
	public String getEndvend() {
		return this.endvend;
	}

	public void setEndvend(String endvend) {
		this.endvend = endvend;
	}

	@Column(name = "NUMVEND")
	public Integer getNumvend() {
		return this.numvend;
	}

	public void setNumvend(Integer numvend) {
		this.numvend = numvend;
	}

	@Column(name = "COMPLVEND", length = 20)
	public String getComplvend() {
		return this.complvend;
	}

	public void setComplvend(String complvend) {
		this.complvend = complvend;
	}

	@Column(name = "BAIRVEND", length = 30)
	public String getBairvend() {
		return this.bairvend;
	}

	public void setBairvend(String bairvend) {
		this.bairvend = bairvend;
	}

	@Column(name = "CIDVEND", length = 30)
	public String getCidvend() {
		return this.cidvend;
	}

	public void setCidvend(String cidvend) {
		this.cidvend = cidvend;
	}

	@Column(name = "CEPVEND", length = 8)
	public String getCepvend() {
		return this.cepvend;
	}

	public void setCepvend(String cepvend) {
		this.cepvend = cepvend;
	}

	@Column(name = "UFVEND", length = 2)
	public String getUfvend() {
		return this.ufvend;
	}

	public void setUfvend(String ufvend) {
		this.ufvend = ufvend;
	}

	@Column(name = "FONEVEND", length = 12)
	public String getFonevend() {
		return this.fonevend;
	}

	public void setFonevend(String fonevend) {
		this.fonevend = fonevend;
	}

	@Column(name = "FAXVEND", length = 8)
	public String getFaxvend() {
		return this.faxvend;
	}

	public void setFaxvend(String faxvend) {
		this.faxvend = faxvend;
	}

	@Column(name = "EMAILVEND", length = 50)
	public String getEmailvend() {
		return this.emailvend;
	}

	public void setEmailvend(String emailvend) {
		this.emailvend = emailvend;
	}

	@Column(name = "PERCCOMVEND", precision = 7, scale = 3)
	public BigDecimal getPerccomvend() {
		return this.perccomvend;
	}

	public void setPerccomvend(BigDecimal perccomvend) {
		this.perccomvend = perccomvend;
	}

	@Column(name = "COMIPIVEND", length = 1)
	public Character getComipivend() {
		return this.comipivend;
	}

	public void setComipivend(Character comipivend) {
		this.comipivend = comipivend;
	}

	@Column(name = "CPFVEND", length = 11)
	public String getCpfvend() {
		return this.cpfvend;
	}

	public void setCpfvend(String cpfvend) {
		this.cpfvend = cpfvend;
	}

	@Column(name = "RGVEND", length = 13)
	public String getRgvend() {
		return this.rgvend;
	}

	public void setRgvend(String rgvend) {
		this.rgvend = rgvend;
	}

	@Column(name = "CNPJVEND", length = 14)
	public String getCnpjvend() {
		return this.cnpjvend;
	}

	public void setCnpjvend(String cnpjvend) {
		this.cnpjvend = cnpjvend;
	}

	@Column(name = "INSCVEND", length = 20)
	public String getInscvend() {
		return this.inscvend;
	}

	public void setInscvend(String inscvend) {
		this.inscvend = inscvend;
	}

	@Column(name = "CELVEND", length = 12)
	public String getCelvend() {
		return this.celvend;
	}

	public void setCelvend(String celvend) {
		this.celvend = celvend;
	}

	@Column(name = "CODFORNVEND", length = 13)
	public String getCodfornvend() {
		return this.codfornvend;
	}

	public void setCodfornvend(String codfornvend) {
		this.codfornvend = codfornvend;
	}

	@Column(name = "DDDFONEVEND", length = 4)
	public String getDddfonevend() {
		return this.dddfonevend;
	}

	public void setDddfonevend(String dddfonevend) {
		this.dddfonevend = dddfonevend;
	}

	@Column(name = "DDDFAXVEND", length = 4)
	public String getDddfaxvend() {
		return this.dddfaxvend;
	}

	public void setDddfaxvend(String dddfaxvend) {
		this.dddfaxvend = dddfaxvend;
	}

	@Column(name = "DDDCELVEND", length = 4)
	public String getDddcelvend() {
		return this.dddcelvend;
	}

	public void setDddcelvend(String dddcelvend) {
		this.dddcelvend = dddcelvend;
	}

	@Column(name = "SSPVEND", length = 10)
	public String getSspvend() {
		return this.sspvend;
	}

	public void setSspvend(String sspvend) {
		this.sspvend = sspvend;
	}

	@Column(name = "OBSVEND", length = 500)
	public String getObsvend() {
		return this.obsvend;
	}

	public void setObsvend(String obsvend) {
		this.obsvend = obsvend;
	}

	@Column(name = "ATIVOCOMIS", nullable = false, length = 1)
	public char getAtivocomis() {
		return this.ativocomis;
	}

	public void setAtivocomis(char ativocomis) {
		this.ativocomis = ativocomis;
	}

	@Column(name = "IMGASSVEND")
	public byte[] getImgassvend() {
		return this.imgassvend;
	}

	public void setImgassvend(byte[] imgassvend) {
		this.imgassvend = imgassvend;
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

	@Column(name = "VLRABONO", precision = 15, scale = 5)
	public BigDecimal getVlrabono() {
		return this.vlrabono;
	}

	public void setVlrabono(BigDecimal vlrabono) {
		this.vlrabono = vlrabono;
	}

	@Column(name = "VLRDESCONTO", precision = 15, scale = 5)
	public BigDecimal getVlrdesconto() {
		return this.vlrdesconto;
	}

	public void setVlrdesconto(BigDecimal vlrdesconto) {
		this.vlrdesconto = vlrdesconto;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVdconsignacaos() {
		return this.vdconsignacaos;
	}

	public void setVdconsignacaos(Set vdconsignacaos) {
		this.vdconsignacaos = vdconsignacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getSgprefere2s() {
		return this.sgprefere2s;
	}

	public void setSgprefere2s(Set sgprefere2s) {
		this.sgprefere2s = sgprefere2s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVdvendacomises() {
		return this.vdvendacomises;
	}

	public void setVdvendacomises(Set vdvendacomises) {
		this.vdvendacomises = vdvendacomises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getAtatendentes() {
		return this.atatendentes;
	}

	public void setAtatendentes(Set atatendentes) {
		this.atatendentes = atatendentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVdcomissaos() {
		return this.vdcomissaos;
	}

	public void setVdcomissaos(Set vdcomissaos) {
		this.vdcomissaos = vdcomissaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getSgprefere2s_1() {
		return this.sgprefere2s_1;
	}

	public void setSgprefere2s_1(Set sgprefere2s_1) {
		this.sgprefere2s_1 = sgprefere2s_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVditregracomises() {
		return this.vditregracomises;
	}

	public void setVditregracomises(Set vditregracomises) {
		this.vditregracomises = vditregracomises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getCrfichaavals() {
		return this.crfichaavals;
	}

	public void setCrfichaavals(Set crfichaavals) {
		this.crfichaavals = crfichaavals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getTkcontatos() {
		return this.tkcontatos;
	}

	public void setTkcontatos(Set tkcontatos) {
		this.tkcontatos = tkcontatos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvendedor")
	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}
*/
}

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpforneced generated by hbm2java
 */
@Entity
@Table(name = "CPFORNECED")
public class Cpforneced implements java.io.Serializable {

	private CpfornecedId id;
	private Sgfilial sgfilial;
	private Fnhistpad fnhistpad;
	private Sgunifcod sgunifcod;
	private Lftipofisccli lftipofisccli;
	private Cptipofor cptipofor;
	private Fnbanco fnbanco;
	private Sgmunicipio sgmunicipio;
	private String razfor;
	private String nomefor;
	private Date datafor;
	private Character ativofor;
	private char pessoafor;
	private String cnpjfor;
	private String cpffor;
	private String inscfor;
	private String rgfor;
	private String endfor;
	private Integer numfor;
	private String complfor;
	private String bairfor;
	private String cepfor;
	private String cidfor;
	private String uffor;
	private String contfor;
	private String fonefor;
	private String faxfor;
	private String agenciafor;
	private String contafor;
	private String emailfor;
	private String obsfor;
	private String celfor;
	private Character clifor;
	private String sspfor;
	private String dddfonefor;
	private String dddfaxfor;
	private String dddcelfor;
	private String sitefor;
	private String codcontdeb;
	private String codcontcred;
	private String codforcontab;
	private String suframafor;
	private Short nrodependfor;
	private String inscconreg;
	private String codexportador;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Eqclifor> eqclifors = new HashSet<Eqclifor>(0);
	private Set<Eqrecmerc> eqrecmercs = new HashSet<Eqrecmerc>(0);
	private Set<Fnsublanca> fnsublancas = new HashSet<Fnsublanca>(0);
	private Set<Cptabfor> cptabfors = new HashSet<Cptabfor>(0);
	private Set<Sgfilial> sgfilials = new HashSet<Sgfilial>(0);
	private Set<Cpcompra> cpcompras = new HashSet<Cpcompra>(0);
	private Set<Cpimportacao> cpimportacaos = new HashSet<Cpimportacao>(0);
	private Set<Cpordcompra> cpordcompras = new HashSet<Cpordcompra>(0);
	private Set<Vditcontratofor> vditcontratofors = new HashSet<Vditcontratofor>(
			0);
	private Set<Fnpagar> fnpagars = new HashSet<Fnpagar>(0);
	private Set<Vdtransp> vdtransps = new HashSet<Vdtransp>(0);
	private Set<Sgprefere1> sgprefere1s = new HashSet<Sgprefere1>(0);
	private Cphomologfor cphomologfor;
	private Set<Vdclientefor> vdclientefors = new HashSet<Vdclientefor>(0);
	private Set<Cpprodfor> cpprodfors = new HashSet<Cpprodfor>(0);
	private Set<Fnlanca> fnlancas = new HashSet<Fnlanca>(0);
	private Set<Sgeqvclifor> sgeqvclifors = new HashSet<Sgeqvclifor>(0);

	public Cpforneced() {
	}

	public Cpforneced(CpfornecedId id, Sgfilial sgfilial, Cptipofor cptipofor,
			String razfor, String nomefor, Date datafor, char pessoafor,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cptipofor = cptipofor;
		this.razfor = razfor;
		this.nomefor = nomefor;
		this.datafor = datafor;
		this.pessoafor = pessoafor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpforneced(CpfornecedId id, Sgfilial sgfilial, Fnhistpad fnhistpad,
			Sgunifcod sgunifcod, Lftipofisccli lftipofisccli,
			Cptipofor cptipofor, Fnbanco fnbanco, Sgmunicipio sgmunicipio,
			String razfor, String nomefor, Date datafor, Character ativofor,
			char pessoafor, String cnpjfor, String cpffor, String inscfor,
			String rgfor, String endfor, Integer numfor, String complfor,
			String bairfor, String cepfor, String cidfor, String uffor,
			String contfor, String fonefor, String faxfor, String agenciafor,
			String contafor, String emailfor, String obsfor, String celfor,
			Character clifor, String sspfor, String dddfonefor,
			String dddfaxfor, String dddcelfor, String sitefor,
			String codcontdeb, String codcontcred, String codforcontab,
			String suframafor, Short nrodependfor, String inscconreg,
			String codexportador, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Eqclifor> eqclifors,
			Set<Eqrecmerc> eqrecmercs, Set<Fnsublanca> fnsublancas,
			Set<Cptabfor> cptabfors, Set<Sgfilial> sgfilials,
			Set<Cpcompra> cpcompras, Set<Cpimportacao> cpimportacaos,
			Set<Cpordcompra> cpordcompras,
			Set<Vditcontratofor> vditcontratofors, Set<Fnpagar> fnpagars,
			Set<Vdtransp> vdtransps, Set<Sgprefere1> sgprefere1s,
			Cphomologfor cphomologfor, Set<Vdclientefor> vdclientefors,
			Set<Cpprodfor> cpprodfors, Set<Fnlanca> fnlancas,
			Set<Sgeqvclifor> sgeqvclifors) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnhistpad = fnhistpad;
		this.sgunifcod = sgunifcod;
		this.lftipofisccli = lftipofisccli;
		this.cptipofor = cptipofor;
		this.fnbanco = fnbanco;
		this.sgmunicipio = sgmunicipio;
		this.razfor = razfor;
		this.nomefor = nomefor;
		this.datafor = datafor;
		this.ativofor = ativofor;
		this.pessoafor = pessoafor;
		this.cnpjfor = cnpjfor;
		this.cpffor = cpffor;
		this.inscfor = inscfor;
		this.rgfor = rgfor;
		this.endfor = endfor;
		this.numfor = numfor;
		this.complfor = complfor;
		this.bairfor = bairfor;
		this.cepfor = cepfor;
		this.cidfor = cidfor;
		this.uffor = uffor;
		this.contfor = contfor;
		this.fonefor = fonefor;
		this.faxfor = faxfor;
		this.agenciafor = agenciafor;
		this.contafor = contafor;
		this.emailfor = emailfor;
		this.obsfor = obsfor;
		this.celfor = celfor;
		this.clifor = clifor;
		this.sspfor = sspfor;
		this.dddfonefor = dddfonefor;
		this.dddfaxfor = dddfaxfor;
		this.dddcelfor = dddcelfor;
		this.sitefor = sitefor;
		this.codcontdeb = codcontdeb;
		this.codcontcred = codcontcred;
		this.codforcontab = codforcontab;
		this.suframafor = suframafor;
		this.nrodependfor = nrodependfor;
		this.inscconreg = inscconreg;
		this.codexportador = codexportador;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqclifors = eqclifors;
		this.eqrecmercs = eqrecmercs;
		this.fnsublancas = fnsublancas;
		this.cptabfors = cptabfors;
		this.sgfilials = sgfilials;
		this.cpcompras = cpcompras;
		this.cpimportacaos = cpimportacaos;
		this.cpordcompras = cpordcompras;
		this.vditcontratofors = vditcontratofors;
		this.fnpagars = fnpagars;
		this.vdtransps = vdtransps;
		this.sgprefere1s = sgprefere1s;
		this.cphomologfor = cphomologfor;
		this.vdclientefors = vdclientefors;
		this.cpprodfors = cpprodfors;
		this.fnlancas = fnlancas;
		this.sgeqvclifors = sgeqvclifors;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfor", column = @Column(name = "CODFOR", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpfornecedId getId() {
		return this.id;
	}

	public void setId(CpfornecedId id) {
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
			@JoinColumn(name = "CODHIST", referencedColumnName = "CODHIST"),
			@JoinColumn(name = "CODFILIALHP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPHP", referencedColumnName = "CODEMP") })
	public Fnhistpad getFnhistpad() {
		return this.fnhistpad;
	}

	public void setFnhistpad(Fnhistpad fnhistpad) {
		this.fnhistpad = fnhistpad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODUNIFCOD", referencedColumnName = "CODUNIFCOD"),
			@JoinColumn(name = "CODFILIALUC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPUC", referencedColumnName = "CODEMP") })
	public Sgunifcod getSgunifcod() {
		return this.sgunifcod;
	}

	public void setSgunifcod(Sgunifcod sgunifcod) {
		this.sgunifcod = sgunifcod;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFISCFOR", referencedColumnName = "CODFISCCLI"),
			@JoinColumn(name = "CODFILIALFF", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPFF", referencedColumnName = "CODEMP") })
	public Lftipofisccli getLftipofisccli() {
		return this.lftipofisccli;
	}

	public void setLftipofisccli(Lftipofisccli lftipofisccli) {
		this.lftipofisccli = lftipofisccli;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOFOR", referencedColumnName = "CODTIPOFOR", nullable = false),
			@JoinColumn(name = "CODFILIALTF", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTF", referencedColumnName = "CODEMP", nullable = false) })
	public Cptipofor getCptipofor() {
		return this.cptipofor;
	}

	public void setCptipofor(Cptipofor cptipofor) {
		this.cptipofor = cptipofor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO"),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMP") })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMUNIC", referencedColumnName = "CODMUNIC"),
			@JoinColumn(name = "SIGLAUF", referencedColumnName = "SIGLAUF"),
			@JoinColumn(name = "CODPAIS", referencedColumnName = "CODPAIS") })
	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	@Column(name = "RAZFOR", nullable = false, length = 60)
	public String getRazfor() {
		return this.razfor;
	}

	public void setRazfor(String razfor) {
		this.razfor = razfor;
	}

	@Column(name = "NOMEFOR", nullable = false, length = 50)
	public String getNomefor() {
		return this.nomefor;
	}

	public void setNomefor(String nomefor) {
		this.nomefor = nomefor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATAFOR", nullable = false, length = 10)
	public Date getDatafor() {
		return this.datafor;
	}

	public void setDatafor(Date datafor) {
		this.datafor = datafor;
	}

	@Column(name = "ATIVOFOR", length = 1)
	public Character getAtivofor() {
		return this.ativofor;
	}

	public void setAtivofor(Character ativofor) {
		this.ativofor = ativofor;
	}

	@Column(name = "PESSOAFOR", nullable = false, length = 1)
	public char getPessoafor() {
		return this.pessoafor;
	}

	public void setPessoafor(char pessoafor) {
		this.pessoafor = pessoafor;
	}

	@Column(name = "CNPJFOR", length = 14)
	public String getCnpjfor() {
		return this.cnpjfor;
	}

	public void setCnpjfor(String cnpjfor) {
		this.cnpjfor = cnpjfor;
	}

	@Column(name = "CPFFOR", length = 11)
	public String getCpffor() {
		return this.cpffor;
	}

	public void setCpffor(String cpffor) {
		this.cpffor = cpffor;
	}

	@Column(name = "INSCFOR", length = 20)
	public String getInscfor() {
		return this.inscfor;
	}

	public void setInscfor(String inscfor) {
		this.inscfor = inscfor;
	}

	@Column(name = "RGFOR", length = 13)
	public String getRgfor() {
		return this.rgfor;
	}

	public void setRgfor(String rgfor) {
		this.rgfor = rgfor;
	}

	@Column(name = "ENDFOR", length = 50)
	public String getEndfor() {
		return this.endfor;
	}

	public void setEndfor(String endfor) {
		this.endfor = endfor;
	}

	@Column(name = "NUMFOR")
	public Integer getNumfor() {
		return this.numfor;
	}

	public void setNumfor(Integer numfor) {
		this.numfor = numfor;
	}

	@Column(name = "COMPLFOR", length = 20)
	public String getComplfor() {
		return this.complfor;
	}

	public void setComplfor(String complfor) {
		this.complfor = complfor;
	}

	@Column(name = "BAIRFOR", length = 30)
	public String getBairfor() {
		return this.bairfor;
	}

	public void setBairfor(String bairfor) {
		this.bairfor = bairfor;
	}

	@Column(name = "CEPFOR", length = 8)
	public String getCepfor() {
		return this.cepfor;
	}

	public void setCepfor(String cepfor) {
		this.cepfor = cepfor;
	}

	@Column(name = "CIDFOR", length = 30)
	public String getCidfor() {
		return this.cidfor;
	}

	public void setCidfor(String cidfor) {
		this.cidfor = cidfor;
	}

	@Column(name = "UFFOR", length = 2)
	public String getUffor() {
		return this.uffor;
	}

	public void setUffor(String uffor) {
		this.uffor = uffor;
	}

	@Column(name = "CONTFOR", length = 40)
	public String getContfor() {
		return this.contfor;
	}

	public void setContfor(String contfor) {
		this.contfor = contfor;
	}

	@Column(name = "FONEFOR", length = 12)
	public String getFonefor() {
		return this.fonefor;
	}

	public void setFonefor(String fonefor) {
		this.fonefor = fonefor;
	}

	@Column(name = "FAXFOR", length = 8)
	public String getFaxfor() {
		return this.faxfor;
	}

	public void setFaxfor(String faxfor) {
		this.faxfor = faxfor;
	}

	@Column(name = "AGENCIAFOR", length = 6)
	public String getAgenciafor() {
		return this.agenciafor;
	}

	public void setAgenciafor(String agenciafor) {
		this.agenciafor = agenciafor;
	}

	@Column(name = "CONTAFOR", length = 10)
	public String getContafor() {
		return this.contafor;
	}

	public void setContafor(String contafor) {
		this.contafor = contafor;
	}

	@Column(name = "EMAILFOR", length = 50)
	public String getEmailfor() {
		return this.emailfor;
	}

	public void setEmailfor(String emailfor) {
		this.emailfor = emailfor;
	}

	@Column(name = "OBSFOR", length = 10000)
	public String getObsfor() {
		return this.obsfor;
	}

	public void setObsfor(String obsfor) {
		this.obsfor = obsfor;
	}

	@Column(name = "CELFOR", length = 8)
	public String getCelfor() {
		return this.celfor;
	}

	public void setCelfor(String celfor) {
		this.celfor = celfor;
	}

	@Column(name = "CLIFOR", length = 1)
	public Character getClifor() {
		return this.clifor;
	}

	public void setClifor(Character clifor) {
		this.clifor = clifor;
	}

	@Column(name = "SSPFOR", length = 10)
	public String getSspfor() {
		return this.sspfor;
	}

	public void setSspfor(String sspfor) {
		this.sspfor = sspfor;
	}

	@Column(name = "DDDFONEFOR", length = 4)
	public String getDddfonefor() {
		return this.dddfonefor;
	}

	public void setDddfonefor(String dddfonefor) {
		this.dddfonefor = dddfonefor;
	}

	@Column(name = "DDDFAXFOR", length = 4)
	public String getDddfaxfor() {
		return this.dddfaxfor;
	}

	public void setDddfaxfor(String dddfaxfor) {
		this.dddfaxfor = dddfaxfor;
	}

	@Column(name = "DDDCELFOR", length = 4)
	public String getDddcelfor() {
		return this.dddcelfor;
	}

	public void setDddcelfor(String dddcelfor) {
		this.dddcelfor = dddcelfor;
	}

	@Column(name = "SITEFOR", length = 50)
	public String getSitefor() {
		return this.sitefor;
	}

	public void setSitefor(String sitefor) {
		this.sitefor = sitefor;
	}

	@Column(name = "CODCONTDEB", length = 20)
	public String getCodcontdeb() {
		return this.codcontdeb;
	}

	public void setCodcontdeb(String codcontdeb) {
		this.codcontdeb = codcontdeb;
	}

	@Column(name = "CODCONTCRED", length = 20)
	public String getCodcontcred() {
		return this.codcontcred;
	}

	public void setCodcontcred(String codcontcred) {
		this.codcontcred = codcontcred;
	}

	@Column(name = "CODFORCONTAB", length = 20)
	public String getCodforcontab() {
		return this.codforcontab;
	}

	public void setCodforcontab(String codforcontab) {
		this.codforcontab = codforcontab;
	}

	@Column(name = "SUFRAMAFOR", length = 9)
	public String getSuframafor() {
		return this.suframafor;
	}

	public void setSuframafor(String suframafor) {
		this.suframafor = suframafor;
	}

	@Column(name = "NRODEPENDFOR")
	public Short getNrodependfor() {
		return this.nrodependfor;
	}

	public void setNrodependfor(Short nrodependfor) {
		this.nrodependfor = nrodependfor;
	}

	@Column(name = "INSCCONREG", length = 15)
	public String getInscconreg() {
		return this.inscconreg;
	}

	public void setInscconreg(String inscconreg) {
		this.inscconreg = inscconreg;
	}

	@Column(name = "CODEXPORTADOR", length = 20)
	public String getCodexportador() {
		return this.codexportador;
	}

	public void setCodexportador(String codexportador) {
		this.codexportador = codexportador;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Eqclifor> getEqclifors() {
		return this.eqclifors;
	}

	public void setEqclifors(Set<Eqclifor> eqclifors) {
		this.eqclifors = eqclifors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Eqrecmerc> getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set<Eqrecmerc> eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Fnsublanca> getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set<Fnsublanca> fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Cptabfor> getCptabfors() {
		return this.cptabfors;
	}

	public void setCptabfors(Set<Cptabfor> cptabfors) {
		this.cptabfors = cptabfors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Sgfilial> getSgfilials() {
		return this.sgfilials;
	}

	public void setSgfilials(Set<Sgfilial> sgfilials) {
		this.sgfilials = sgfilials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Cpcompra> getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set<Cpcompra> cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Cpimportacao> getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set<Cpimportacao> cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Cpordcompra> getCpordcompras() {
		return this.cpordcompras;
	}

	public void setCpordcompras(Set<Cpordcompra> cpordcompras) {
		this.cpordcompras = cpordcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Vditcontratofor> getVditcontratofors() {
		return this.vditcontratofors;
	}

	public void setVditcontratofors(Set<Vditcontratofor> vditcontratofors) {
		this.vditcontratofors = vditcontratofors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Fnpagar> getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set<Fnpagar> fnpagars) {
		this.fnpagars = fnpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Vdtransp> getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set<Vdtransp> vdtransps) {
		this.vdtransps = vdtransps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Sgprefere1> getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set<Sgprefere1> sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Cphomologfor getCphomologfor() {
		return this.cphomologfor;
	}

	public void setCphomologfor(Cphomologfor cphomologfor) {
		this.cphomologfor = cphomologfor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Vdclientefor> getVdclientefors() {
		return this.vdclientefors;
	}

	public void setVdclientefors(Set<Vdclientefor> vdclientefors) {
		this.vdclientefors = vdclientefors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Cpprodfor> getCpprodfors() {
		return this.cpprodfors;
	}

	public void setCpprodfors(Set<Cpprodfor> cpprodfors) {
		this.cpprodfors = cpprodfors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Fnlanca> getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set<Fnlanca> fnlancas) {
		this.fnlancas = fnlancas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpforneced")
	public Set<Sgeqvclifor> getSgeqvclifors() {
		return this.sgeqvclifors;
	}

	public void setSgeqvclifors(Set<Sgeqvclifor> sgeqvclifors) {
		this.sgeqvclifors = sgeqvclifors;
	}

}

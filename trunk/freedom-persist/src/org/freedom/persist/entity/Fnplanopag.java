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
 * Fnplanopag generated by hbm2java
 */
@Entity
@Table(name = "FNPLANOPAG")
public class Fnplanopag implements java.io.Serializable {

	private FnplanopagId id;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fnplanejamento fnplanejamento;
	private Fntbjuros fntbjuros;
	private Fncc fncc;
	private String descplanopag;
	private int parcplanopag;
	private char aporcplanopag;
	private Character autobaixaplanopag;
	private char ativoplanopag;
	private char cvplanopag;
	private BigDecimal percdesc;
	private char regrvctoplanopag;
	private char rvsabplanopag;
	private char rvdomplanopag;
	private char rvferplanopag;
	private char rvdiaplanopag;
	private short diavctoplanopag;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vdprecoprod> vdprecoprods = new HashSet<Vdprecoprod>(0);
	private Set<Fnrenegrec> fnrenegrecs = new HashSet<Fnrenegrec>(0);
	private Set<Vdcliente> vdclientes = new HashSet<Vdcliente>(0);
	private Set<Fnreceber> fnrecebers = new HashSet<Fnreceber>(0);
	private Set<Sgprefere4> sgprefere4s = new HashSet<Sgprefere4>(0);
	private Set<Sgprefere8> sgprefere8s = new HashSet<Sgprefere8>(0);
	private Set<Cpcompra> cpcompras = new HashSet<Cpcompra>(0);
	private Set<Fnpagar> fnpagars = new HashSet<Fnpagar>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkfnplan = new HashSet<Sgprefere1>(
			0);
	private Set<Cpordcompra> cpordcompras = new HashSet<Cpordcompra>(0);
	private Set<Cpcotacao> cpcotacaos = new HashSet<Cpcotacao>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkplanopagsv = new HashSet<Sgprefere1>(
			0);
	private Set<Fnparcpag> fnparcpags = new HashSet<Fnparcpag>(0);
	private Set<Eqtipomov> eqtipomovs = new HashSet<Eqtipomov>(0);
	private Set<Vdvendaconsig> vdvendaconsigs = new HashSet<Vdvendaconsig>(0);
	private Set<Vdvenda> vdvendas = new HashSet<Vdvenda>(0);
	private Set<Vdorcamento> vdorcamentos = new HashSet<Vdorcamento>(0);
	private Set<Cpimportacao> cpimportacaos = new HashSet<Cpimportacao>(0);

	public Fnplanopag() {
	}

	public Fnplanopag(FnplanopagId id, Sgfilial sgfilial, int parcplanopag,
			char aporcplanopag, char ativoplanopag, char cvplanopag,
			char regrvctoplanopag, char rvsabplanopag, char rvdomplanopag,
			char rvferplanopag, char rvdiaplanopag, short diavctoplanopag,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.parcplanopag = parcplanopag;
		this.aporcplanopag = aporcplanopag;
		this.ativoplanopag = ativoplanopag;
		this.cvplanopag = cvplanopag;
		this.regrvctoplanopag = regrvctoplanopag;
		this.rvsabplanopag = rvsabplanopag;
		this.rvdomplanopag = rvdomplanopag;
		this.rvferplanopag = rvferplanopag;
		this.rvdiaplanopag = rvdiaplanopag;
		this.diavctoplanopag = diavctoplanopag;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnplanopag(FnplanopagId id, Sgfilial sgfilial, Fnconta fnconta,
			Fnplanejamento fnplanejamento, Fntbjuros fntbjuros, Fncc fncc,
			String descplanopag, int parcplanopag, char aporcplanopag,
			Character autobaixaplanopag, char ativoplanopag, char cvplanopag,
			BigDecimal percdesc, char regrvctoplanopag, char rvsabplanopag,
			char rvdomplanopag, char rvferplanopag, char rvdiaplanopag,
			short diavctoplanopag, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt,
			Set<Vdprecoprod> vdprecoprods, Set<Fnrenegrec> fnrenegrecs,
			Set<Vdcliente> vdclientes, Set<Fnreceber> fnrecebers,
			Set<Sgprefere4> sgprefere4s, Set<Sgprefere8> sgprefere8s,
			Set<Cpcompra> cpcompras, Set<Fnpagar> fnpagars,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkfnplan,
			Set<Cpordcompra> cpordcompras, Set<Cpcotacao> cpcotacaos,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplanopagsv,
			Set<Fnparcpag> fnparcpags, Set<Eqtipomov> eqtipomovs,
			Set<Vdvendaconsig> vdvendaconsigs, Set<Vdvenda> vdvendas,
			Set<Vdorcamento> vdorcamentos, Set<Cpimportacao> cpimportacaos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fnplanejamento = fnplanejamento;
		this.fntbjuros = fntbjuros;
		this.fncc = fncc;
		this.descplanopag = descplanopag;
		this.parcplanopag = parcplanopag;
		this.aporcplanopag = aporcplanopag;
		this.autobaixaplanopag = autobaixaplanopag;
		this.ativoplanopag = ativoplanopag;
		this.cvplanopag = cvplanopag;
		this.percdesc = percdesc;
		this.regrvctoplanopag = regrvctoplanopag;
		this.rvsabplanopag = rvsabplanopag;
		this.rvdomplanopag = rvdomplanopag;
		this.rvferplanopag = rvferplanopag;
		this.rvdiaplanopag = rvdiaplanopag;
		this.diavctoplanopag = diavctoplanopag;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdprecoprods = vdprecoprods;
		this.fnrenegrecs = fnrenegrecs;
		this.vdclientes = vdclientes;
		this.fnrecebers = fnrecebers;
		this.sgprefere4s = sgprefere4s;
		this.sgprefere8s = sgprefere8s;
		this.cpcompras = cpcompras;
		this.fnpagars = fnpagars;
		this.sgprefere1sForSgprefere1fkfnplan = sgprefere1sForSgprefere1fkfnplan;
		this.cpordcompras = cpordcompras;
		this.cpcotacaos = cpcotacaos;
		this.sgprefere1sForSgprefere1fkplanopagsv = sgprefere1sForSgprefere1fkplanopagsv;
		this.fnparcpags = fnparcpags;
		this.eqtipomovs = eqtipomovs;
		this.vdvendaconsigs = vdvendaconsigs;
		this.vdvendas = vdvendas;
		this.vdorcamentos = vdorcamentos;
		this.cpimportacaos = cpimportacaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codplanopag", column = @Column(name = "CODPLANOPAG", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnplanopagId getId() {
		return this.id;
	}

	public void setId(FnplanopagId id) {
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
			@JoinColumn(name = "CODTBJ", referencedColumnName = "CODTBJ"),
			@JoinColumn(name = "CODFILIALTBJ", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTBJ", referencedColumnName = "CODEMP") })
	public Fntbjuros getFntbjuros() {
		return this.fntbjuros;
	}

	public void setFntbjuros(Fntbjuros fntbjuros) {
		this.fntbjuros = fntbjuros;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCC", referencedColumnName = "CODCC"),
			@JoinColumn(name = "ANOCC", referencedColumnName = "ANOCC"),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP") })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@Column(name = "DESCPLANOPAG", length = 40)
	public String getDescplanopag() {
		return this.descplanopag;
	}

	public void setDescplanopag(String descplanopag) {
		this.descplanopag = descplanopag;
	}

	@Column(name = "PARCPLANOPAG", nullable = false)
	public int getParcplanopag() {
		return this.parcplanopag;
	}

	public void setParcplanopag(int parcplanopag) {
		this.parcplanopag = parcplanopag;
	}

	@Column(name = "APORCPLANOPAG", nullable = false, length = 1)
	public char getAporcplanopag() {
		return this.aporcplanopag;
	}

	public void setAporcplanopag(char aporcplanopag) {
		this.aporcplanopag = aporcplanopag;
	}

	@Column(name = "AUTOBAIXAPLANOPAG", length = 1)
	public Character getAutobaixaplanopag() {
		return this.autobaixaplanopag;
	}

	public void setAutobaixaplanopag(Character autobaixaplanopag) {
		this.autobaixaplanopag = autobaixaplanopag;
	}

	@Column(name = "ATIVOPLANOPAG", nullable = false, length = 1)
	public char getAtivoplanopag() {
		return this.ativoplanopag;
	}

	public void setAtivoplanopag(char ativoplanopag) {
		this.ativoplanopag = ativoplanopag;
	}

	@Column(name = "CVPLANOPAG", nullable = false, length = 1)
	public char getCvplanopag() {
		return this.cvplanopag;
	}

	public void setCvplanopag(char cvplanopag) {
		this.cvplanopag = cvplanopag;
	}

	@Column(name = "PERCDESC", precision = 15, scale = 5)
	public BigDecimal getPercdesc() {
		return this.percdesc;
	}

	public void setPercdesc(BigDecimal percdesc) {
		this.percdesc = percdesc;
	}

	@Column(name = "REGRVCTOPLANOPAG", nullable = false, length = 1)
	public char getRegrvctoplanopag() {
		return this.regrvctoplanopag;
	}

	public void setRegrvctoplanopag(char regrvctoplanopag) {
		this.regrvctoplanopag = regrvctoplanopag;
	}

	@Column(name = "RVSABPLANOPAG", nullable = false, length = 1)
	public char getRvsabplanopag() {
		return this.rvsabplanopag;
	}

	public void setRvsabplanopag(char rvsabplanopag) {
		this.rvsabplanopag = rvsabplanopag;
	}

	@Column(name = "RVDOMPLANOPAG", nullable = false, length = 1)
	public char getRvdomplanopag() {
		return this.rvdomplanopag;
	}

	public void setRvdomplanopag(char rvdomplanopag) {
		this.rvdomplanopag = rvdomplanopag;
	}

	@Column(name = "RVFERPLANOPAG", nullable = false, length = 1)
	public char getRvferplanopag() {
		return this.rvferplanopag;
	}

	public void setRvferplanopag(char rvferplanopag) {
		this.rvferplanopag = rvferplanopag;
	}

	@Column(name = "RVDIAPLANOPAG", nullable = false, length = 1)
	public char getRvdiaplanopag() {
		return this.rvdiaplanopag;
	}

	public void setRvdiaplanopag(char rvdiaplanopag) {
		this.rvdiaplanopag = rvdiaplanopag;
	}

	@Column(name = "DIAVCTOPLANOPAG", nullable = false)
	public short getDiavctoplanopag() {
		return this.diavctoplanopag;
	}

	public void setDiavctoplanopag(short diavctoplanopag) {
		this.diavctoplanopag = diavctoplanopag;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Vdprecoprod> getVdprecoprods() {
		return this.vdprecoprods;
	}

	public void setVdprecoprods(Set<Vdprecoprod> vdprecoprods) {
		this.vdprecoprods = vdprecoprods;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Fnrenegrec> getFnrenegrecs() {
		return this.fnrenegrecs;
	}

	public void setFnrenegrecs(Set<Fnrenegrec> fnrenegrecs) {
		this.fnrenegrecs = fnrenegrecs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Vdcliente> getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set<Vdcliente> vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Fnreceber> getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set<Fnreceber> fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Sgprefere4> getSgprefere4s() {
		return this.sgprefere4s;
	}

	public void setSgprefere4s(Set<Sgprefere4> sgprefere4s) {
		this.sgprefere4s = sgprefere4s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Sgprefere8> getSgprefere8s() {
		return this.sgprefere8s;
	}

	public void setSgprefere8s(Set<Sgprefere8> sgprefere8s) {
		this.sgprefere8s = sgprefere8s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Cpcompra> getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set<Cpcompra> cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Fnpagar> getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set<Fnpagar> fnpagars) {
		this.fnpagars = fnpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopagBySgprefere1fkfnplan")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkfnplan() {
		return this.sgprefere1sForSgprefere1fkfnplan;
	}

	public void setSgprefere1sForSgprefere1fkfnplan(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkfnplan) {
		this.sgprefere1sForSgprefere1fkfnplan = sgprefere1sForSgprefere1fkfnplan;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Cpordcompra> getCpordcompras() {
		return this.cpordcompras;
	}

	public void setCpordcompras(Set<Cpordcompra> cpordcompras) {
		this.cpordcompras = cpordcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Cpcotacao> getCpcotacaos() {
		return this.cpcotacaos;
	}

	public void setCpcotacaos(Set<Cpcotacao> cpcotacaos) {
		this.cpcotacaos = cpcotacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopagBySgprefere1fkplanopagsv")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkplanopagsv() {
		return this.sgprefere1sForSgprefere1fkplanopagsv;
	}

	public void setSgprefere1sForSgprefere1fkplanopagsv(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplanopagsv) {
		this.sgprefere1sForSgprefere1fkplanopagsv = sgprefere1sForSgprefere1fkplanopagsv;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Fnparcpag> getFnparcpags() {
		return this.fnparcpags;
	}

	public void setFnparcpags(Set<Fnparcpag> fnparcpags) {
		this.fnparcpags = fnparcpags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Eqtipomov> getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set<Eqtipomov> eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Vdvendaconsig> getVdvendaconsigs() {
		return this.vdvendaconsigs;
	}

	public void setVdvendaconsigs(Set<Vdvendaconsig> vdvendaconsigs) {
		this.vdvendaconsigs = vdvendaconsigs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Vdvenda> getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set<Vdvenda> vdvendas) {
		this.vdvendas = vdvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Vdorcamento> getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set<Vdorcamento> vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanopag")
	public Set<Cpimportacao> getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set<Cpimportacao> cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

}

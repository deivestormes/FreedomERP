package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqproduto generated by hbm2java
 */
public class Eqproduto implements java.io.Serializable {

	private EqprodutoId id;
	private Sgfilial sgfilial;
	private Equnidade equnidade;
	private Lfclfiscal lfclfiscal;
	private Fnmoeda fnmoeda;
	private Eqsecao eqsecao;
	private Eqalmox eqalmox;
	private Crtipochamado crtipochamado;
	private Eqmarca eqmarca;
	private Eqgrupo eqgrupo;
	private Fncc fncc;
	private Vdprazoent vdprazoent;
	private String descprod;
	private String refprod;
	private String descauxprod;
	private String tipoprod;
	private char cvprod;
	private String codbarprod;
	private char cloteprod;
	private char serieprod;
	private String codfabprod;
	private BigDecimal comisprod;
	private BigDecimal pesoliqprod;
	private BigDecimal pesobrutprod;
	private BigDecimal qtdminprod;
	private BigDecimal qtdmaxprod;
	private Date dtmpmprod;
	private BigDecimal custompmprod;
	private BigDecimal custopepsprod;
	private BigDecimal custoinfoprod;
	private BigDecimal precobaseprod;
	private BigDecimal precocomisprod;
	private BigDecimal sldprod;
	private BigDecimal sldresprod;
	private BigDecimal sldconsigprod;
	private BigDecimal sldliqprod;
	private Character ativoprod;
	private Date dtultcpprod;
	private BigDecimal qtdultcpprod;
	private String desccompprod;
	private String obsprod;
	private Character verifprod;
	private String localprod;
	private char rmaprod;
	private char usareceitaprod;
	private char usatelaadicpdv;
	private BigDecimal vlrdensidade;
	private BigDecimal vlrconcent;
	private BigDecimal comprimento;
	private BigDecimal largura;
	private BigDecimal espessura;
	private char guiatrafprod;
	private BigDecimal qtdembalagem;
	private String codeanprod;
	private BigDecimal cubagem;
	private BigDecimal qtdhorasserv;
	private Short nrodiasvalid;
	private Character desccli;
	private Short qtdporplano;
	private Short nroplanos;
	private Character certfsc;
	private BigDecimal fatorfsc;
	private Integer codempog;
	private Short codfilialog;
	private Integer codprodog;
	private Integer codempmg;
	private Short codfilialmg;
	private Integer codmodg;
	private Integer prazorepo;
	private BigDecimal mediavenda;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqfatconvs = new HashSet(0);
	private Set cpitsolicitacaos = new HashSet(0);
	private Set vditkits = new HashSet(0);
	private Set eqtipoexpedicaos = new HashSet(0);
	private Set ppitretcps = new HashSet(0);
	private Set vdfotoprods = new HashSet(0);
	private Set ppopsubprods = new HashSet(0);
	private Mgproduto mgproduto;
	private Set cpitimportacaos = new HashSet(0);
	private Set vditcontratosForVditcontratofkeqprodu = new HashSet(0);
	private Set ppitestruturas = new HashSet(0);
	private Set svavaliacaos = new HashSet(0);
	private Set eqitrmas = new HashSet(0);
	private Set vditorcamentos = new HashSet(0);
	private Set cpsumsols = new HashSet(0);
	private Set vdremconsigs = new HashSet(0);
	private Set eqitsimilars = new HashSet(0);
	private Set cptabfors = new HashSet(0);
	private Set cpprodfors = new HashSet(0);
	private Set vditvendas = new HashSet(0);
	private Set vditcontratosForVditcontratofkeqprodpe = new HashSet(0);
	private Set ppestruturas = new HashSet(0);
	private Set critfichaavals = new HashSet(0);
	private Set eqitrecmercs = new HashSet(0);
	private Set eqlotes = new HashSet(0);
	private Set sgprefere4s = new HashSet(0);
	private Set eqmovprods = new HashSet(0);
	private Set vdvendaconsigs = new HashSet(0);
	private Set eqprodplans = new HashSet(0);
	private Set eqmodgrades = new HashSet(0);
	private Set ppitops = new HashSet(0);
	private Set eqexpedicaos = new HashSet(0);
	private Set eqinvprods = new HashSet(0);
	private Set eqrecmercs = new HashSet(0);
	private Set svexecucaos = new HashSet(0);
	private Set eqtiporecmercs = new HashSet(0);
	private Set cpitcompras = new HashSet(0);
	private Set eqsaldoprods = new HashSet(0);
	private Set ppitestruturasubprods = new HashSet(0);
	private Set vdprecoprods = new HashSet(0);
	private Set eqitrecmercitoses = new HashSet(0);
	private Set svitoses = new HashSet(0);
	private Set eqcodaltprods = new HashSet(0);
	private Set eqseries = new HashSet(0);
	private Set cpitordcompras = new HashSet(0);
	private Set eqitexpedicaos = new HashSet(0);
	private Set vdkits = new HashSet(0);

	public Eqproduto() {
	}

	public Eqproduto(EqprodutoId id, Sgfilial sgfilial, Equnidade equnidade,
			Lfclfiscal lfclfiscal, Fnmoeda fnmoeda, Eqalmox eqalmox,
			Eqmarca eqmarca, Eqgrupo eqgrupo, String descprod, String refprod,
			String tipoprod, char cvprod, char cloteprod, char serieprod,
			char rmaprod, char usareceitaprod, char usatelaadicpdv,
			char guiatrafprod, BigDecimal qtdembalagem, char emmanut,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.equnidade = equnidade;
		this.lfclfiscal = lfclfiscal;
		this.fnmoeda = fnmoeda;
		this.eqalmox = eqalmox;
		this.eqmarca = eqmarca;
		this.eqgrupo = eqgrupo;
		this.descprod = descprod;
		this.refprod = refprod;
		this.tipoprod = tipoprod;
		this.cvprod = cvprod;
		this.cloteprod = cloteprod;
		this.serieprod = serieprod;
		this.rmaprod = rmaprod;
		this.usareceitaprod = usareceitaprod;
		this.usatelaadicpdv = usatelaadicpdv;
		this.guiatrafprod = guiatrafprod;
		this.qtdembalagem = qtdembalagem;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqproduto(EqprodutoId id, Sgfilial sgfilial, Equnidade equnidade,
			Lfclfiscal lfclfiscal, Fnmoeda fnmoeda, Eqsecao eqsecao,
			Eqalmox eqalmox, Crtipochamado crtipochamado, Eqmarca eqmarca,
			Eqgrupo eqgrupo, Fncc fncc, Vdprazoent vdprazoent, String descprod,
			String refprod, String descauxprod, String tipoprod, char cvprod,
			String codbarprod, char cloteprod, char serieprod,
			String codfabprod, BigDecimal comisprod, BigDecimal pesoliqprod,
			BigDecimal pesobrutprod, BigDecimal qtdminprod,
			BigDecimal qtdmaxprod, Date dtmpmprod, BigDecimal custompmprod,
			BigDecimal custopepsprod, BigDecimal custoinfoprod,
			BigDecimal precobaseprod, BigDecimal precocomisprod,
			BigDecimal sldprod, BigDecimal sldresprod,
			BigDecimal sldconsigprod, BigDecimal sldliqprod,
			Character ativoprod, Date dtultcpprod, BigDecimal qtdultcpprod,
			String desccompprod, String obsprod, Character verifprod,
			String localprod, char rmaprod, char usareceitaprod,
			char usatelaadicpdv, BigDecimal vlrdensidade,
			BigDecimal vlrconcent, BigDecimal comprimento, BigDecimal largura,
			BigDecimal espessura, char guiatrafprod, BigDecimal qtdembalagem,
			String codeanprod, BigDecimal cubagem, BigDecimal qtdhorasserv,
			Short nrodiasvalid, Character desccli, Short qtdporplano,
			Short nroplanos, Character certfsc, BigDecimal fatorfsc,
			Integer codempog, Short codfilialog, Integer codprodog,
			Integer codempmg, Short codfilialmg, Integer codmodg,
			Integer prazorepo, BigDecimal mediavenda, char emmanut, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqfatconvs, Set cpitsolicitacaos, Set vditkits,
			Set eqtipoexpedicaos, Set ppitretcps, Set vdfotoprods,
			Set ppopsubprods, Mgproduto mgproduto, Set cpitimportacaos,
			Set vditcontratosForVditcontratofkeqprodu, Set ppitestruturas,
			Set svavaliacaos, Set eqitrmas, Set vditorcamentos, Set cpsumsols,
			Set vdremconsigs, Set eqitsimilars, Set cptabfors, Set cpprodfors,
			Set vditvendas, Set vditcontratosForVditcontratofkeqprodpe,
			Set ppestruturas, Set critfichaavals, Set eqitrecmercs,
			Set eqlotes, Set sgprefere4s, Set eqmovprods, Set vdvendaconsigs,
			Set eqprodplans, Set eqmodgrades, Set ppitops, Set eqexpedicaos,
			Set eqinvprods, Set eqrecmercs, Set svexecucaos,
			Set eqtiporecmercs, Set cpitcompras, Set eqsaldoprods,
			Set ppitestruturasubprods, Set vdprecoprods, Set eqitrecmercitoses,
			Set svitoses, Set eqcodaltprods, Set eqseries, Set cpitordcompras,
			Set eqitexpedicaos, Set vdkits) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.equnidade = equnidade;
		this.lfclfiscal = lfclfiscal;
		this.fnmoeda = fnmoeda;
		this.eqsecao = eqsecao;
		this.eqalmox = eqalmox;
		this.crtipochamado = crtipochamado;
		this.eqmarca = eqmarca;
		this.eqgrupo = eqgrupo;
		this.fncc = fncc;
		this.vdprazoent = vdprazoent;
		this.descprod = descprod;
		this.refprod = refprod;
		this.descauxprod = descauxprod;
		this.tipoprod = tipoprod;
		this.cvprod = cvprod;
		this.codbarprod = codbarprod;
		this.cloteprod = cloteprod;
		this.serieprod = serieprod;
		this.codfabprod = codfabprod;
		this.comisprod = comisprod;
		this.pesoliqprod = pesoliqprod;
		this.pesobrutprod = pesobrutprod;
		this.qtdminprod = qtdminprod;
		this.qtdmaxprod = qtdmaxprod;
		this.dtmpmprod = dtmpmprod;
		this.custompmprod = custompmprod;
		this.custopepsprod = custopepsprod;
		this.custoinfoprod = custoinfoprod;
		this.precobaseprod = precobaseprod;
		this.precocomisprod = precocomisprod;
		this.sldprod = sldprod;
		this.sldresprod = sldresprod;
		this.sldconsigprod = sldconsigprod;
		this.sldliqprod = sldliqprod;
		this.ativoprod = ativoprod;
		this.dtultcpprod = dtultcpprod;
		this.qtdultcpprod = qtdultcpprod;
		this.desccompprod = desccompprod;
		this.obsprod = obsprod;
		this.verifprod = verifprod;
		this.localprod = localprod;
		this.rmaprod = rmaprod;
		this.usareceitaprod = usareceitaprod;
		this.usatelaadicpdv = usatelaadicpdv;
		this.vlrdensidade = vlrdensidade;
		this.vlrconcent = vlrconcent;
		this.comprimento = comprimento;
		this.largura = largura;
		this.espessura = espessura;
		this.guiatrafprod = guiatrafprod;
		this.qtdembalagem = qtdembalagem;
		this.codeanprod = codeanprod;
		this.cubagem = cubagem;
		this.qtdhorasserv = qtdhorasserv;
		this.nrodiasvalid = nrodiasvalid;
		this.desccli = desccli;
		this.qtdporplano = qtdporplano;
		this.nroplanos = nroplanos;
		this.certfsc = certfsc;
		this.fatorfsc = fatorfsc;
		this.codempog = codempog;
		this.codfilialog = codfilialog;
		this.codprodog = codprodog;
		this.codempmg = codempmg;
		this.codfilialmg = codfilialmg;
		this.codmodg = codmodg;
		this.prazorepo = prazorepo;
		this.mediavenda = mediavenda;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqfatconvs = eqfatconvs;
		this.cpitsolicitacaos = cpitsolicitacaos;
		this.vditkits = vditkits;
		this.eqtipoexpedicaos = eqtipoexpedicaos;
		this.ppitretcps = ppitretcps;
		this.vdfotoprods = vdfotoprods;
		this.ppopsubprods = ppopsubprods;
		this.mgproduto = mgproduto;
		this.cpitimportacaos = cpitimportacaos;
		this.vditcontratosForVditcontratofkeqprodu = vditcontratosForVditcontratofkeqprodu;
		this.ppitestruturas = ppitestruturas;
		this.svavaliacaos = svavaliacaos;
		this.eqitrmas = eqitrmas;
		this.vditorcamentos = vditorcamentos;
		this.cpsumsols = cpsumsols;
		this.vdremconsigs = vdremconsigs;
		this.eqitsimilars = eqitsimilars;
		this.cptabfors = cptabfors;
		this.cpprodfors = cpprodfors;
		this.vditvendas = vditvendas;
		this.vditcontratosForVditcontratofkeqprodpe = vditcontratosForVditcontratofkeqprodpe;
		this.ppestruturas = ppestruturas;
		this.critfichaavals = critfichaavals;
		this.eqitrecmercs = eqitrecmercs;
		this.eqlotes = eqlotes;
		this.sgprefere4s = sgprefere4s;
		this.eqmovprods = eqmovprods;
		this.vdvendaconsigs = vdvendaconsigs;
		this.eqprodplans = eqprodplans;
		this.eqmodgrades = eqmodgrades;
		this.ppitops = ppitops;
		this.eqexpedicaos = eqexpedicaos;
		this.eqinvprods = eqinvprods;
		this.eqrecmercs = eqrecmercs;
		this.svexecucaos = svexecucaos;
		this.eqtiporecmercs = eqtiporecmercs;
		this.cpitcompras = cpitcompras;
		this.eqsaldoprods = eqsaldoprods;
		this.ppitestruturasubprods = ppitestruturasubprods;
		this.vdprecoprods = vdprecoprods;
		this.eqitrecmercitoses = eqitrecmercitoses;
		this.svitoses = svitoses;
		this.eqcodaltprods = eqcodaltprods;
		this.eqseries = eqseries;
		this.cpitordcompras = cpitordcompras;
		this.eqitexpedicaos = eqitexpedicaos;
		this.vdkits = vdkits;
	}

	public EqprodutoId getId() {
		return this.id;
	}

	public void setId(EqprodutoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Equnidade getEqunidade() {
		return this.equnidade;
	}

	public void setEqunidade(Equnidade equnidade) {
		this.equnidade = equnidade;
	}

	public Lfclfiscal getLfclfiscal() {
		return this.lfclfiscal;
	}

	public void setLfclfiscal(Lfclfiscal lfclfiscal) {
		this.lfclfiscal = lfclfiscal;
	}

	public Fnmoeda getFnmoeda() {
		return this.fnmoeda;
	}

	public void setFnmoeda(Fnmoeda fnmoeda) {
		this.fnmoeda = fnmoeda;
	}

	public Eqsecao getEqsecao() {
		return this.eqsecao;
	}

	public void setEqsecao(Eqsecao eqsecao) {
		this.eqsecao = eqsecao;
	}

	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	public Crtipochamado getCrtipochamado() {
		return this.crtipochamado;
	}

	public void setCrtipochamado(Crtipochamado crtipochamado) {
		this.crtipochamado = crtipochamado;
	}

	public Eqmarca getEqmarca() {
		return this.eqmarca;
	}

	public void setEqmarca(Eqmarca eqmarca) {
		this.eqmarca = eqmarca;
	}

	public Eqgrupo getEqgrupo() {
		return this.eqgrupo;
	}

	public void setEqgrupo(Eqgrupo eqgrupo) {
		this.eqgrupo = eqgrupo;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public Vdprazoent getVdprazoent() {
		return this.vdprazoent;
	}

	public void setVdprazoent(Vdprazoent vdprazoent) {
		this.vdprazoent = vdprazoent;
	}

	public String getDescprod() {
		return this.descprod;
	}

	public void setDescprod(String descprod) {
		this.descprod = descprod;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public String getDescauxprod() {
		return this.descauxprod;
	}

	public void setDescauxprod(String descauxprod) {
		this.descauxprod = descauxprod;
	}

	public String getTipoprod() {
		return this.tipoprod;
	}

	public void setTipoprod(String tipoprod) {
		this.tipoprod = tipoprod;
	}

	public char getCvprod() {
		return this.cvprod;
	}

	public void setCvprod(char cvprod) {
		this.cvprod = cvprod;
	}

	public String getCodbarprod() {
		return this.codbarprod;
	}

	public void setCodbarprod(String codbarprod) {
		this.codbarprod = codbarprod;
	}

	public char getCloteprod() {
		return this.cloteprod;
	}

	public void setCloteprod(char cloteprod) {
		this.cloteprod = cloteprod;
	}

	public char getSerieprod() {
		return this.serieprod;
	}

	public void setSerieprod(char serieprod) {
		this.serieprod = serieprod;
	}

	public String getCodfabprod() {
		return this.codfabprod;
	}

	public void setCodfabprod(String codfabprod) {
		this.codfabprod = codfabprod;
	}

	public BigDecimal getComisprod() {
		return this.comisprod;
	}

	public void setComisprod(BigDecimal comisprod) {
		this.comisprod = comisprod;
	}

	public BigDecimal getPesoliqprod() {
		return this.pesoliqprod;
	}

	public void setPesoliqprod(BigDecimal pesoliqprod) {
		this.pesoliqprod = pesoliqprod;
	}

	public BigDecimal getPesobrutprod() {
		return this.pesobrutprod;
	}

	public void setPesobrutprod(BigDecimal pesobrutprod) {
		this.pesobrutprod = pesobrutprod;
	}

	public BigDecimal getQtdminprod() {
		return this.qtdminprod;
	}

	public void setQtdminprod(BigDecimal qtdminprod) {
		this.qtdminprod = qtdminprod;
	}

	public BigDecimal getQtdmaxprod() {
		return this.qtdmaxprod;
	}

	public void setQtdmaxprod(BigDecimal qtdmaxprod) {
		this.qtdmaxprod = qtdmaxprod;
	}

	public Date getDtmpmprod() {
		return this.dtmpmprod;
	}

	public void setDtmpmprod(Date dtmpmprod) {
		this.dtmpmprod = dtmpmprod;
	}

	public BigDecimal getCustompmprod() {
		return this.custompmprod;
	}

	public void setCustompmprod(BigDecimal custompmprod) {
		this.custompmprod = custompmprod;
	}

	public BigDecimal getCustopepsprod() {
		return this.custopepsprod;
	}

	public void setCustopepsprod(BigDecimal custopepsprod) {
		this.custopepsprod = custopepsprod;
	}

	public BigDecimal getCustoinfoprod() {
		return this.custoinfoprod;
	}

	public void setCustoinfoprod(BigDecimal custoinfoprod) {
		this.custoinfoprod = custoinfoprod;
	}

	public BigDecimal getPrecobaseprod() {
		return this.precobaseprod;
	}

	public void setPrecobaseprod(BigDecimal precobaseprod) {
		this.precobaseprod = precobaseprod;
	}

	public BigDecimal getPrecocomisprod() {
		return this.precocomisprod;
	}

	public void setPrecocomisprod(BigDecimal precocomisprod) {
		this.precocomisprod = precocomisprod;
	}

	public BigDecimal getSldprod() {
		return this.sldprod;
	}

	public void setSldprod(BigDecimal sldprod) {
		this.sldprod = sldprod;
	}

	public BigDecimal getSldresprod() {
		return this.sldresprod;
	}

	public void setSldresprod(BigDecimal sldresprod) {
		this.sldresprod = sldresprod;
	}

	public BigDecimal getSldconsigprod() {
		return this.sldconsigprod;
	}

	public void setSldconsigprod(BigDecimal sldconsigprod) {
		this.sldconsigprod = sldconsigprod;
	}

	public BigDecimal getSldliqprod() {
		return this.sldliqprod;
	}

	public void setSldliqprod(BigDecimal sldliqprod) {
		this.sldliqprod = sldliqprod;
	}

	public Character getAtivoprod() {
		return this.ativoprod;
	}

	public void setAtivoprod(Character ativoprod) {
		this.ativoprod = ativoprod;
	}

	public Date getDtultcpprod() {
		return this.dtultcpprod;
	}

	public void setDtultcpprod(Date dtultcpprod) {
		this.dtultcpprod = dtultcpprod;
	}

	public BigDecimal getQtdultcpprod() {
		return this.qtdultcpprod;
	}

	public void setQtdultcpprod(BigDecimal qtdultcpprod) {
		this.qtdultcpprod = qtdultcpprod;
	}

	public String getDesccompprod() {
		return this.desccompprod;
	}

	public void setDesccompprod(String desccompprod) {
		this.desccompprod = desccompprod;
	}

	public String getObsprod() {
		return this.obsprod;
	}

	public void setObsprod(String obsprod) {
		this.obsprod = obsprod;
	}

	public Character getVerifprod() {
		return this.verifprod;
	}

	public void setVerifprod(Character verifprod) {
		this.verifprod = verifprod;
	}

	public String getLocalprod() {
		return this.localprod;
	}

	public void setLocalprod(String localprod) {
		this.localprod = localprod;
	}

	public char getRmaprod() {
		return this.rmaprod;
	}

	public void setRmaprod(char rmaprod) {
		this.rmaprod = rmaprod;
	}

	public char getUsareceitaprod() {
		return this.usareceitaprod;
	}

	public void setUsareceitaprod(char usareceitaprod) {
		this.usareceitaprod = usareceitaprod;
	}

	public char getUsatelaadicpdv() {
		return this.usatelaadicpdv;
	}

	public void setUsatelaadicpdv(char usatelaadicpdv) {
		this.usatelaadicpdv = usatelaadicpdv;
	}

	public BigDecimal getVlrdensidade() {
		return this.vlrdensidade;
	}

	public void setVlrdensidade(BigDecimal vlrdensidade) {
		this.vlrdensidade = vlrdensidade;
	}

	public BigDecimal getVlrconcent() {
		return this.vlrconcent;
	}

	public void setVlrconcent(BigDecimal vlrconcent) {
		this.vlrconcent = vlrconcent;
	}

	public BigDecimal getComprimento() {
		return this.comprimento;
	}

	public void setComprimento(BigDecimal comprimento) {
		this.comprimento = comprimento;
	}

	public BigDecimal getLargura() {
		return this.largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getEspessura() {
		return this.espessura;
	}

	public void setEspessura(BigDecimal espessura) {
		this.espessura = espessura;
	}

	public char getGuiatrafprod() {
		return this.guiatrafprod;
	}

	public void setGuiatrafprod(char guiatrafprod) {
		this.guiatrafprod = guiatrafprod;
	}

	public BigDecimal getQtdembalagem() {
		return this.qtdembalagem;
	}

	public void setQtdembalagem(BigDecimal qtdembalagem) {
		this.qtdembalagem = qtdembalagem;
	}

	public String getCodeanprod() {
		return this.codeanprod;
	}

	public void setCodeanprod(String codeanprod) {
		this.codeanprod = codeanprod;
	}

	public BigDecimal getCubagem() {
		return this.cubagem;
	}

	public void setCubagem(BigDecimal cubagem) {
		this.cubagem = cubagem;
	}

	public BigDecimal getQtdhorasserv() {
		return this.qtdhorasserv;
	}

	public void setQtdhorasserv(BigDecimal qtdhorasserv) {
		this.qtdhorasserv = qtdhorasserv;
	}

	public Short getNrodiasvalid() {
		return this.nrodiasvalid;
	}

	public void setNrodiasvalid(Short nrodiasvalid) {
		this.nrodiasvalid = nrodiasvalid;
	}

	public Character getDesccli() {
		return this.desccli;
	}

	public void setDesccli(Character desccli) {
		this.desccli = desccli;
	}

	public Short getQtdporplano() {
		return this.qtdporplano;
	}

	public void setQtdporplano(Short qtdporplano) {
		this.qtdporplano = qtdporplano;
	}

	public Short getNroplanos() {
		return this.nroplanos;
	}

	public void setNroplanos(Short nroplanos) {
		this.nroplanos = nroplanos;
	}

	public Character getCertfsc() {
		return this.certfsc;
	}

	public void setCertfsc(Character certfsc) {
		this.certfsc = certfsc;
	}

	public BigDecimal getFatorfsc() {
		return this.fatorfsc;
	}

	public void setFatorfsc(BigDecimal fatorfsc) {
		this.fatorfsc = fatorfsc;
	}

	public Integer getCodempog() {
		return this.codempog;
	}

	public void setCodempog(Integer codempog) {
		this.codempog = codempog;
	}

	public Short getCodfilialog() {
		return this.codfilialog;
	}

	public void setCodfilialog(Short codfilialog) {
		this.codfilialog = codfilialog;
	}

	public Integer getCodprodog() {
		return this.codprodog;
	}

	public void setCodprodog(Integer codprodog) {
		this.codprodog = codprodog;
	}

	public Integer getCodempmg() {
		return this.codempmg;
	}

	public void setCodempmg(Integer codempmg) {
		this.codempmg = codempmg;
	}

	public Short getCodfilialmg() {
		return this.codfilialmg;
	}

	public void setCodfilialmg(Short codfilialmg) {
		this.codfilialmg = codfilialmg;
	}

	public Integer getCodmodg() {
		return this.codmodg;
	}

	public void setCodmodg(Integer codmodg) {
		this.codmodg = codmodg;
	}

	public Integer getPrazorepo() {
		return this.prazorepo;
	}

	public void setPrazorepo(Integer prazorepo) {
		this.prazorepo = prazorepo;
	}

	public BigDecimal getMediavenda() {
		return this.mediavenda;
	}

	public void setMediavenda(BigDecimal mediavenda) {
		this.mediavenda = mediavenda;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getEqfatconvs() {
		return this.eqfatconvs;
	}

	public void setEqfatconvs(Set eqfatconvs) {
		this.eqfatconvs = eqfatconvs;
	}

	public Set getCpitsolicitacaos() {
		return this.cpitsolicitacaos;
	}

	public void setCpitsolicitacaos(Set cpitsolicitacaos) {
		this.cpitsolicitacaos = cpitsolicitacaos;
	}

	public Set getVditkits() {
		return this.vditkits;
	}

	public void setVditkits(Set vditkits) {
		this.vditkits = vditkits;
	}

	public Set getEqtipoexpedicaos() {
		return this.eqtipoexpedicaos;
	}

	public void setEqtipoexpedicaos(Set eqtipoexpedicaos) {
		this.eqtipoexpedicaos = eqtipoexpedicaos;
	}

	public Set getPpitretcps() {
		return this.ppitretcps;
	}

	public void setPpitretcps(Set ppitretcps) {
		this.ppitretcps = ppitretcps;
	}

	public Set getVdfotoprods() {
		return this.vdfotoprods;
	}

	public void setVdfotoprods(Set vdfotoprods) {
		this.vdfotoprods = vdfotoprods;
	}

	public Set getPpopsubprods() {
		return this.ppopsubprods;
	}

	public void setPpopsubprods(Set ppopsubprods) {
		this.ppopsubprods = ppopsubprods;
	}

	public Mgproduto getMgproduto() {
		return this.mgproduto;
	}

	public void setMgproduto(Mgproduto mgproduto) {
		this.mgproduto = mgproduto;
	}

	public Set getCpitimportacaos() {
		return this.cpitimportacaos;
	}

	public void setCpitimportacaos(Set cpitimportacaos) {
		this.cpitimportacaos = cpitimportacaos;
	}

	public Set getVditcontratosForVditcontratofkeqprodu() {
		return this.vditcontratosForVditcontratofkeqprodu;
	}

	public void setVditcontratosForVditcontratofkeqprodu(
			Set vditcontratosForVditcontratofkeqprodu) {
		this.vditcontratosForVditcontratofkeqprodu = vditcontratosForVditcontratofkeqprodu;
	}

	public Set getPpitestruturas() {
		return this.ppitestruturas;
	}

	public void setPpitestruturas(Set ppitestruturas) {
		this.ppitestruturas = ppitestruturas;
	}

	public Set getSvavaliacaos() {
		return this.svavaliacaos;
	}

	public void setSvavaliacaos(Set svavaliacaos) {
		this.svavaliacaos = svavaliacaos;
	}

	public Set getEqitrmas() {
		return this.eqitrmas;
	}

	public void setEqitrmas(Set eqitrmas) {
		this.eqitrmas = eqitrmas;
	}

	public Set getVditorcamentos() {
		return this.vditorcamentos;
	}

	public void setVditorcamentos(Set vditorcamentos) {
		this.vditorcamentos = vditorcamentos;
	}

	public Set getCpsumsols() {
		return this.cpsumsols;
	}

	public void setCpsumsols(Set cpsumsols) {
		this.cpsumsols = cpsumsols;
	}

	public Set getVdremconsigs() {
		return this.vdremconsigs;
	}

	public void setVdremconsigs(Set vdremconsigs) {
		this.vdremconsigs = vdremconsigs;
	}

	public Set getEqitsimilars() {
		return this.eqitsimilars;
	}

	public void setEqitsimilars(Set eqitsimilars) {
		this.eqitsimilars = eqitsimilars;
	}

	public Set getCptabfors() {
		return this.cptabfors;
	}

	public void setCptabfors(Set cptabfors) {
		this.cptabfors = cptabfors;
	}

	public Set getCpprodfors() {
		return this.cpprodfors;
	}

	public void setCpprodfors(Set cpprodfors) {
		this.cpprodfors = cpprodfors;
	}

	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

	public Set getVditcontratosForVditcontratofkeqprodpe() {
		return this.vditcontratosForVditcontratofkeqprodpe;
	}

	public void setVditcontratosForVditcontratofkeqprodpe(
			Set vditcontratosForVditcontratofkeqprodpe) {
		this.vditcontratosForVditcontratofkeqprodpe = vditcontratosForVditcontratofkeqprodpe;
	}

	public Set getPpestruturas() {
		return this.ppestruturas;
	}

	public void setPpestruturas(Set ppestruturas) {
		this.ppestruturas = ppestruturas;
	}

	public Set getCritfichaavals() {
		return this.critfichaavals;
	}

	public void setCritfichaavals(Set critfichaavals) {
		this.critfichaavals = critfichaavals;
	}

	public Set getEqitrecmercs() {
		return this.eqitrecmercs;
	}

	public void setEqitrecmercs(Set eqitrecmercs) {
		this.eqitrecmercs = eqitrecmercs;
	}

	public Set getEqlotes() {
		return this.eqlotes;
	}

	public void setEqlotes(Set eqlotes) {
		this.eqlotes = eqlotes;
	}

	public Set getSgprefere4s() {
		return this.sgprefere4s;
	}

	public void setSgprefere4s(Set sgprefere4s) {
		this.sgprefere4s = sgprefere4s;
	}

	public Set getEqmovprods() {
		return this.eqmovprods;
	}

	public void setEqmovprods(Set eqmovprods) {
		this.eqmovprods = eqmovprods;
	}

	public Set getVdvendaconsigs() {
		return this.vdvendaconsigs;
	}

	public void setVdvendaconsigs(Set vdvendaconsigs) {
		this.vdvendaconsigs = vdvendaconsigs;
	}

	public Set getEqprodplans() {
		return this.eqprodplans;
	}

	public void setEqprodplans(Set eqprodplans) {
		this.eqprodplans = eqprodplans;
	}

	public Set getEqmodgrades() {
		return this.eqmodgrades;
	}

	public void setEqmodgrades(Set eqmodgrades) {
		this.eqmodgrades = eqmodgrades;
	}

	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	public Set getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

	public Set getEqinvprods() {
		return this.eqinvprods;
	}

	public void setEqinvprods(Set eqinvprods) {
		this.eqinvprods = eqinvprods;
	}

	public Set getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	public Set getSvexecucaos() {
		return this.svexecucaos;
	}

	public void setSvexecucaos(Set svexecucaos) {
		this.svexecucaos = svexecucaos;
	}

	public Set getEqtiporecmercs() {
		return this.eqtiporecmercs;
	}

	public void setEqtiporecmercs(Set eqtiporecmercs) {
		this.eqtiporecmercs = eqtiporecmercs;
	}

	public Set getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	public Set getEqsaldoprods() {
		return this.eqsaldoprods;
	}

	public void setEqsaldoprods(Set eqsaldoprods) {
		this.eqsaldoprods = eqsaldoprods;
	}

	public Set getPpitestruturasubprods() {
		return this.ppitestruturasubprods;
	}

	public void setPpitestruturasubprods(Set ppitestruturasubprods) {
		this.ppitestruturasubprods = ppitestruturasubprods;
	}

	public Set getVdprecoprods() {
		return this.vdprecoprods;
	}

	public void setVdprecoprods(Set vdprecoprods) {
		this.vdprecoprods = vdprecoprods;
	}

	public Set getEqitrecmercitoses() {
		return this.eqitrecmercitoses;
	}

	public void setEqitrecmercitoses(Set eqitrecmercitoses) {
		this.eqitrecmercitoses = eqitrecmercitoses;
	}

	public Set getSvitoses() {
		return this.svitoses;
	}

	public void setSvitoses(Set svitoses) {
		this.svitoses = svitoses;
	}

	public Set getEqcodaltprods() {
		return this.eqcodaltprods;
	}

	public void setEqcodaltprods(Set eqcodaltprods) {
		this.eqcodaltprods = eqcodaltprods;
	}

	public Set getEqseries() {
		return this.eqseries;
	}

	public void setEqseries(Set eqseries) {
		this.eqseries = eqseries;
	}

	public Set getCpitordcompras() {
		return this.cpitordcompras;
	}

	public void setCpitordcompras(Set cpitordcompras) {
		this.cpitordcompras = cpitordcompras;
	}

	public Set getEqitexpedicaos() {
		return this.eqitexpedicaos;
	}

	public void setEqitexpedicaos(Set eqitexpedicaos) {
		this.eqitexpedicaos = eqitexpedicaos;
	}

	public Set getVdkits() {
		return this.vdkits;
	}

	public void setVdkits(Set vdkits) {
		this.vdkits = vdkits;
	}

}

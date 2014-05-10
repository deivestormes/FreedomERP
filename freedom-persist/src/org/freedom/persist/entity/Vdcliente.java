package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdcliente generated by hbm2java
 */
public class Vdcliente implements java.io.Serializable {

	private VdclienteId id;
	private Vdtipocli vdtipocli;
	private Sgmunicipio sgmunicipioByVdclientefksgmuniccob;
	private Fnbanco fnbanco;
	private Vdclascli vdclascli;
	private Sgmunicipio sgmunicipioByVdclientefksgmunic;
	private Fntipocred fntipocred;
	private Sgfilial sgfilial;
	private Fntipocob fntipocob;
	private Sgmunicipio sgmunicipioByVdclientefksgmunicent;
	private Fnhistpad fnhistpad;
	private Sgunifcod sgunifcod;
	private Fnplanopag fnplanopag;
	private Lftipofisccli lftipofisccli;
	private Vdvendedor vdvendedor;
	private Vdsetor vdsetor;
	private Vdtransp vdtransp;
	private Fncartcob fncartcob;
	private Sgittabela sgittabela;
	private String razcli;
	private String nomecli;
	private Date datacli;
	private char pessoacli;
	private char consumidorcli;
	private char ativocli;
	private String cnpjcli;
	private String insccli;
	private String cpfcli;
	private String rgcli;
	private String sspcli;
	private String endcli;
	private Integer numcli;
	private String complcli;
	private String edificiocli;
	private String baircli;
	private String cidcli;
	private String ufcli;
	private String cepcli;
	private String dddcli;
	private String fonecli;
	private String ramalcli;
	private String dddfaxcli;
	private String faxcli;
	private String emailcli;
	private String emailcob;
	private String emailent;
	private String emailnfecli;
	private String contcli;
	private String endcob;
	private Integer numcob;
	private String complcob;
	private String baircob;
	private String cidcob;
	private String ufcob;
	private String cepcob;
	private String dddfonecob;
	private String fonecob;
	private String dddfaxcob;
	private String faxcob;
	private String endent;
	private Integer nument;
	private String complent;
	private String bairent;
	private String cident;
	private String ufent;
	private String cepent;
	private String dddfoneent;
	private String foneent;
	private String dddfaxent;
	private String faxent;
	private String dddcelent;
	private String celent;
	private String obscli;
	private String agenciacli;
	private String ncontabcocli;
	private Integer codemppq;
	private Short codfilialpq;
	private Integer codpesq;
	private String incracli;
	private Date dtinitr;
	private Date dtvenctotr;
	private String nirfcli;
	private Character simplescli;
	private String dddcelcli;
	private String celcli;
	private String natcli;
	private String ufnatcli;
	private String temporescli;
	private String apelidocli;
	private String sitecli;
	private String codcontdeb;
	private String codcontcred;
	private String codclicontab;
	private byte[] fotocli;
	private byte[] imgasscli;
	private String suframacli;
	private char prodruralcli;
	private char ctocli;
	private String codcnae;
	private String inscmuncli;
	private BigDecimal percdesccli;
	private String contclicob;
	private String contclient;
	private Character descipi;
	private char identclibco;
	private Date dtnasccli;
	private char sitrevcli;
	private String idusurevcli;
	private Date dtrevcli;
	private Date hrevcli;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set atatendimentos = new HashSet(0);
	private Set tkcampanhactos = new HashSet(0);
	private Set atmodatendos = new HashSet(0);
	private Set tkhistoricos = new HashSet(0);
	private Set tkcontclis = new HashSet(0);
	private Set vdclirefps = new HashSet(0);
	private Set eqrecmercs = new HashSet(0);
	private Set vdclirefcs = new HashSet(0);
	private Set vdcliimovs = new HashSet(0);
	private Set fnrestricaos = new HashSet(0);
	private Set eqmovexps = new HashSet(0);
	private Set eqclifors = new HashSet(0);
	private Set fnlibcreds = new HashSet(0);
	private Set fnsublancas = new HashSet(0);
	private Set vdclicontases = new HashSet(0);
	private Set vdclimetavends = new HashSet(0);
	private Set vdcliterras = new HashSet(0);
	private Set crchamados = new HashSet(0);
	private Set sgprefere4s = new HashSet(0);
	private Set vdsetorrotas = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set sgeqvclifors = new HashSet(0);
	private Set vdvendaconsigs = new HashSet(0);
	private Set vdobsclis = new HashSet(0);
	private Set vdcliautps = new HashSet(0);
	private Set tksitcamps = new HashSet(0);
	private Set vdorcamentos = new HashSet(0);
	private Set fnfbnclis = new HashSet(0);
	private Set vdcliveics = new HashSet(0);
	private Set fnlancas = new HashSet(0);
	private Vdclicompl vdclicompl;
	private Set vdcontratos = new HashSet(0);
	private Set vdclisocioses = new HashSet(0);
	private Set tkcampanhaclis = new HashSet(0);
	private Set svoses = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set eqlanctoexps = new HashSet(0);

	public Vdcliente() {
	}

	public Vdcliente(VdclienteId id, Vdtipocli vdtipocli, Sgfilial sgfilial,
			String razcli, String nomecli, Date datacli, char pessoacli,
			char consumidorcli, char ativocli, char prodruralcli, char ctocli,
			char identclibco, char sitrevcli, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.vdtipocli = vdtipocli;
		this.sgfilial = sgfilial;
		this.razcli = razcli;
		this.nomecli = nomecli;
		this.datacli = datacli;
		this.pessoacli = pessoacli;
		this.consumidorcli = consumidorcli;
		this.ativocli = ativocli;
		this.prodruralcli = prodruralcli;
		this.ctocli = ctocli;
		this.identclibco = identclibco;
		this.sitrevcli = sitrevcli;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcliente(VdclienteId id, Vdtipocli vdtipocli,
			Sgmunicipio sgmunicipioByVdclientefksgmuniccob, Fnbanco fnbanco,
			Vdclascli vdclascli, Sgmunicipio sgmunicipioByVdclientefksgmunic,
			Fntipocred fntipocred, Sgfilial sgfilial, Fntipocob fntipocob,
			Sgmunicipio sgmunicipioByVdclientefksgmunicent,
			Fnhistpad fnhistpad, Sgunifcod sgunifcod, Fnplanopag fnplanopag,
			Lftipofisccli lftipofisccli, Vdvendedor vdvendedor,
			Vdsetor vdsetor, Vdtransp vdtransp, Fncartcob fncartcob,
			Sgittabela sgittabela, String razcli, String nomecli, Date datacli,
			char pessoacli, char consumidorcli, char ativocli, String cnpjcli,
			String insccli, String cpfcli, String rgcli, String sspcli,
			String endcli, Integer numcli, String complcli, String edificiocli,
			String baircli, String cidcli, String ufcli, String cepcli,
			String dddcli, String fonecli, String ramalcli, String dddfaxcli,
			String faxcli, String emailcli, String emailcob, String emailent,
			String emailnfecli, String contcli, String endcob, Integer numcob,
			String complcob, String baircob, String cidcob, String ufcob,
			String cepcob, String dddfonecob, String fonecob, String dddfaxcob,
			String faxcob, String endent, Integer nument, String complent,
			String bairent, String cident, String ufent, String cepent,
			String dddfoneent, String foneent, String dddfaxent, String faxent,
			String dddcelent, String celent, String obscli, String agenciacli,
			String ncontabcocli, Integer codemppq, Short codfilialpq,
			Integer codpesq, String incracli, Date dtinitr, Date dtvenctotr,
			String nirfcli, Character simplescli, String dddcelcli,
			String celcli, String natcli, String ufnatcli, String temporescli,
			String apelidocli, String sitecli, String codcontdeb,
			String codcontcred, String codclicontab, byte[] fotocli,
			byte[] imgasscli, String suframacli, char prodruralcli,
			char ctocli, String codcnae, String inscmuncli,
			BigDecimal percdesccli, String contclicob, String contclient,
			Character descipi, char identclibco, Date dtnasccli,
			char sitrevcli, String idusurevcli, Date dtrevcli, Date hrevcli,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set atatendimentos, Set tkcampanhactos,
			Set atmodatendos, Set tkhistoricos, Set tkcontclis, Set vdclirefps,
			Set eqrecmercs, Set vdclirefcs, Set vdcliimovs, Set fnrestricaos,
			Set eqmovexps, Set eqclifors, Set fnlibcreds, Set fnsublancas,
			Set vdclicontases, Set vdclimetavends, Set vdcliterras,
			Set crchamados, Set sgprefere4s, Set vdsetorrotas, Set vdvendas,
			Set sgeqvclifors, Set vdvendaconsigs, Set vdobsclis,
			Set vdcliautps, Set tksitcamps, Set vdorcamentos, Set fnfbnclis,
			Set vdcliveics, Set fnlancas, Vdclicompl vdclicompl,
			Set vdcontratos, Set vdclisocioses, Set tkcampanhaclis, Set svoses,
			Set fnrecebers, Set eqlanctoexps) {
		this.id = id;
		this.vdtipocli = vdtipocli;
		this.sgmunicipioByVdclientefksgmuniccob = sgmunicipioByVdclientefksgmuniccob;
		this.fnbanco = fnbanco;
		this.vdclascli = vdclascli;
		this.sgmunicipioByVdclientefksgmunic = sgmunicipioByVdclientefksgmunic;
		this.fntipocred = fntipocred;
		this.sgfilial = sgfilial;
		this.fntipocob = fntipocob;
		this.sgmunicipioByVdclientefksgmunicent = sgmunicipioByVdclientefksgmunicent;
		this.fnhistpad = fnhistpad;
		this.sgunifcod = sgunifcod;
		this.fnplanopag = fnplanopag;
		this.lftipofisccli = lftipofisccli;
		this.vdvendedor = vdvendedor;
		this.vdsetor = vdsetor;
		this.vdtransp = vdtransp;
		this.fncartcob = fncartcob;
		this.sgittabela = sgittabela;
		this.razcli = razcli;
		this.nomecli = nomecli;
		this.datacli = datacli;
		this.pessoacli = pessoacli;
		this.consumidorcli = consumidorcli;
		this.ativocli = ativocli;
		this.cnpjcli = cnpjcli;
		this.insccli = insccli;
		this.cpfcli = cpfcli;
		this.rgcli = rgcli;
		this.sspcli = sspcli;
		this.endcli = endcli;
		this.numcli = numcli;
		this.complcli = complcli;
		this.edificiocli = edificiocli;
		this.baircli = baircli;
		this.cidcli = cidcli;
		this.ufcli = ufcli;
		this.cepcli = cepcli;
		this.dddcli = dddcli;
		this.fonecli = fonecli;
		this.ramalcli = ramalcli;
		this.dddfaxcli = dddfaxcli;
		this.faxcli = faxcli;
		this.emailcli = emailcli;
		this.emailcob = emailcob;
		this.emailent = emailent;
		this.emailnfecli = emailnfecli;
		this.contcli = contcli;
		this.endcob = endcob;
		this.numcob = numcob;
		this.complcob = complcob;
		this.baircob = baircob;
		this.cidcob = cidcob;
		this.ufcob = ufcob;
		this.cepcob = cepcob;
		this.dddfonecob = dddfonecob;
		this.fonecob = fonecob;
		this.dddfaxcob = dddfaxcob;
		this.faxcob = faxcob;
		this.endent = endent;
		this.nument = nument;
		this.complent = complent;
		this.bairent = bairent;
		this.cident = cident;
		this.ufent = ufent;
		this.cepent = cepent;
		this.dddfoneent = dddfoneent;
		this.foneent = foneent;
		this.dddfaxent = dddfaxent;
		this.faxent = faxent;
		this.dddcelent = dddcelent;
		this.celent = celent;
		this.obscli = obscli;
		this.agenciacli = agenciacli;
		this.ncontabcocli = ncontabcocli;
		this.codemppq = codemppq;
		this.codfilialpq = codfilialpq;
		this.codpesq = codpesq;
		this.incracli = incracli;
		this.dtinitr = dtinitr;
		this.dtvenctotr = dtvenctotr;
		this.nirfcli = nirfcli;
		this.simplescli = simplescli;
		this.dddcelcli = dddcelcli;
		this.celcli = celcli;
		this.natcli = natcli;
		this.ufnatcli = ufnatcli;
		this.temporescli = temporescli;
		this.apelidocli = apelidocli;
		this.sitecli = sitecli;
		this.codcontdeb = codcontdeb;
		this.codcontcred = codcontcred;
		this.codclicontab = codclicontab;
		this.fotocli = fotocli;
		this.imgasscli = imgasscli;
		this.suframacli = suframacli;
		this.prodruralcli = prodruralcli;
		this.ctocli = ctocli;
		this.codcnae = codcnae;
		this.inscmuncli = inscmuncli;
		this.percdesccli = percdesccli;
		this.contclicob = contclicob;
		this.contclient = contclient;
		this.descipi = descipi;
		this.identclibco = identclibco;
		this.dtnasccli = dtnasccli;
		this.sitrevcli = sitrevcli;
		this.idusurevcli = idusurevcli;
		this.dtrevcli = dtrevcli;
		this.hrevcli = hrevcli;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atatendimentos = atatendimentos;
		this.tkcampanhactos = tkcampanhactos;
		this.atmodatendos = atmodatendos;
		this.tkhistoricos = tkhistoricos;
		this.tkcontclis = tkcontclis;
		this.vdclirefps = vdclirefps;
		this.eqrecmercs = eqrecmercs;
		this.vdclirefcs = vdclirefcs;
		this.vdcliimovs = vdcliimovs;
		this.fnrestricaos = fnrestricaos;
		this.eqmovexps = eqmovexps;
		this.eqclifors = eqclifors;
		this.fnlibcreds = fnlibcreds;
		this.fnsublancas = fnsublancas;
		this.vdclicontases = vdclicontases;
		this.vdclimetavends = vdclimetavends;
		this.vdcliterras = vdcliterras;
		this.crchamados = crchamados;
		this.sgprefere4s = sgprefere4s;
		this.vdsetorrotas = vdsetorrotas;
		this.vdvendas = vdvendas;
		this.sgeqvclifors = sgeqvclifors;
		this.vdvendaconsigs = vdvendaconsigs;
		this.vdobsclis = vdobsclis;
		this.vdcliautps = vdcliautps;
		this.tksitcamps = tksitcamps;
		this.vdorcamentos = vdorcamentos;
		this.fnfbnclis = fnfbnclis;
		this.vdcliveics = vdcliveics;
		this.fnlancas = fnlancas;
		this.vdclicompl = vdclicompl;
		this.vdcontratos = vdcontratos;
		this.vdclisocioses = vdclisocioses;
		this.tkcampanhaclis = tkcampanhaclis;
		this.svoses = svoses;
		this.fnrecebers = fnrecebers;
		this.eqlanctoexps = eqlanctoexps;
	}

	public VdclienteId getId() {
		return this.id;
	}

	public void setId(VdclienteId id) {
		this.id = id;
	}

	public Vdtipocli getVdtipocli() {
		return this.vdtipocli;
	}

	public void setVdtipocli(Vdtipocli vdtipocli) {
		this.vdtipocli = vdtipocli;
	}

	public Sgmunicipio getSgmunicipioByVdclientefksgmuniccob() {
		return this.sgmunicipioByVdclientefksgmuniccob;
	}

	public void setSgmunicipioByVdclientefksgmuniccob(
			Sgmunicipio sgmunicipioByVdclientefksgmuniccob) {
		this.sgmunicipioByVdclientefksgmuniccob = sgmunicipioByVdclientefksgmuniccob;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Vdclascli getVdclascli() {
		return this.vdclascli;
	}

	public void setVdclascli(Vdclascli vdclascli) {
		this.vdclascli = vdclascli;
	}

	public Sgmunicipio getSgmunicipioByVdclientefksgmunic() {
		return this.sgmunicipioByVdclientefksgmunic;
	}

	public void setSgmunicipioByVdclientefksgmunic(
			Sgmunicipio sgmunicipioByVdclientefksgmunic) {
		this.sgmunicipioByVdclientefksgmunic = sgmunicipioByVdclientefksgmunic;
	}

	public Fntipocred getFntipocred() {
		return this.fntipocred;
	}

	public void setFntipocred(Fntipocred fntipocred) {
		this.fntipocred = fntipocred;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	public Sgmunicipio getSgmunicipioByVdclientefksgmunicent() {
		return this.sgmunicipioByVdclientefksgmunicent;
	}

	public void setSgmunicipioByVdclientefksgmunicent(
			Sgmunicipio sgmunicipioByVdclientefksgmunicent) {
		this.sgmunicipioByVdclientefksgmunicent = sgmunicipioByVdclientefksgmunicent;
	}

	public Fnhistpad getFnhistpad() {
		return this.fnhistpad;
	}

	public void setFnhistpad(Fnhistpad fnhistpad) {
		this.fnhistpad = fnhistpad;
	}

	public Sgunifcod getSgunifcod() {
		return this.sgunifcod;
	}

	public void setSgunifcod(Sgunifcod sgunifcod) {
		this.sgunifcod = sgunifcod;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Lftipofisccli getLftipofisccli() {
		return this.lftipofisccli;
	}

	public void setLftipofisccli(Lftipofisccli lftipofisccli) {
		this.lftipofisccli = lftipofisccli;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Vdsetor getVdsetor() {
		return this.vdsetor;
	}

	public void setVdsetor(Vdsetor vdsetor) {
		this.vdsetor = vdsetor;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	public Sgittabela getSgittabela() {
		return this.sgittabela;
	}

	public void setSgittabela(Sgittabela sgittabela) {
		this.sgittabela = sgittabela;
	}

	public String getRazcli() {
		return this.razcli;
	}

	public void setRazcli(String razcli) {
		this.razcli = razcli;
	}

	public String getNomecli() {
		return this.nomecli;
	}

	public void setNomecli(String nomecli) {
		this.nomecli = nomecli;
	}

	public Date getDatacli() {
		return this.datacli;
	}

	public void setDatacli(Date datacli) {
		this.datacli = datacli;
	}

	public char getPessoacli() {
		return this.pessoacli;
	}

	public void setPessoacli(char pessoacli) {
		this.pessoacli = pessoacli;
	}

	public char getConsumidorcli() {
		return this.consumidorcli;
	}

	public void setConsumidorcli(char consumidorcli) {
		this.consumidorcli = consumidorcli;
	}

	public char getAtivocli() {
		return this.ativocli;
	}

	public void setAtivocli(char ativocli) {
		this.ativocli = ativocli;
	}

	public String getCnpjcli() {
		return this.cnpjcli;
	}

	public void setCnpjcli(String cnpjcli) {
		this.cnpjcli = cnpjcli;
	}

	public String getInsccli() {
		return this.insccli;
	}

	public void setInsccli(String insccli) {
		this.insccli = insccli;
	}

	public String getCpfcli() {
		return this.cpfcli;
	}

	public void setCpfcli(String cpfcli) {
		this.cpfcli = cpfcli;
	}

	public String getRgcli() {
		return this.rgcli;
	}

	public void setRgcli(String rgcli) {
		this.rgcli = rgcli;
	}

	public String getSspcli() {
		return this.sspcli;
	}

	public void setSspcli(String sspcli) {
		this.sspcli = sspcli;
	}

	public String getEndcli() {
		return this.endcli;
	}

	public void setEndcli(String endcli) {
		this.endcli = endcli;
	}

	public Integer getNumcli() {
		return this.numcli;
	}

	public void setNumcli(Integer numcli) {
		this.numcli = numcli;
	}

	public String getComplcli() {
		return this.complcli;
	}

	public void setComplcli(String complcli) {
		this.complcli = complcli;
	}

	public String getEdificiocli() {
		return this.edificiocli;
	}

	public void setEdificiocli(String edificiocli) {
		this.edificiocli = edificiocli;
	}

	public String getBaircli() {
		return this.baircli;
	}

	public void setBaircli(String baircli) {
		this.baircli = baircli;
	}

	public String getCidcli() {
		return this.cidcli;
	}

	public void setCidcli(String cidcli) {
		this.cidcli = cidcli;
	}

	public String getUfcli() {
		return this.ufcli;
	}

	public void setUfcli(String ufcli) {
		this.ufcli = ufcli;
	}

	public String getCepcli() {
		return this.cepcli;
	}

	public void setCepcli(String cepcli) {
		this.cepcli = cepcli;
	}

	public String getDddcli() {
		return this.dddcli;
	}

	public void setDddcli(String dddcli) {
		this.dddcli = dddcli;
	}

	public String getFonecli() {
		return this.fonecli;
	}

	public void setFonecli(String fonecli) {
		this.fonecli = fonecli;
	}

	public String getRamalcli() {
		return this.ramalcli;
	}

	public void setRamalcli(String ramalcli) {
		this.ramalcli = ramalcli;
	}

	public String getDddfaxcli() {
		return this.dddfaxcli;
	}

	public void setDddfaxcli(String dddfaxcli) {
		this.dddfaxcli = dddfaxcli;
	}

	public String getFaxcli() {
		return this.faxcli;
	}

	public void setFaxcli(String faxcli) {
		this.faxcli = faxcli;
	}

	public String getEmailcli() {
		return this.emailcli;
	}

	public void setEmailcli(String emailcli) {
		this.emailcli = emailcli;
	}

	public String getEmailcob() {
		return this.emailcob;
	}

	public void setEmailcob(String emailcob) {
		this.emailcob = emailcob;
	}

	public String getEmailent() {
		return this.emailent;
	}

	public void setEmailent(String emailent) {
		this.emailent = emailent;
	}

	public String getEmailnfecli() {
		return this.emailnfecli;
	}

	public void setEmailnfecli(String emailnfecli) {
		this.emailnfecli = emailnfecli;
	}

	public String getContcli() {
		return this.contcli;
	}

	public void setContcli(String contcli) {
		this.contcli = contcli;
	}

	public String getEndcob() {
		return this.endcob;
	}

	public void setEndcob(String endcob) {
		this.endcob = endcob;
	}

	public Integer getNumcob() {
		return this.numcob;
	}

	public void setNumcob(Integer numcob) {
		this.numcob = numcob;
	}

	public String getComplcob() {
		return this.complcob;
	}

	public void setComplcob(String complcob) {
		this.complcob = complcob;
	}

	public String getBaircob() {
		return this.baircob;
	}

	public void setBaircob(String baircob) {
		this.baircob = baircob;
	}

	public String getCidcob() {
		return this.cidcob;
	}

	public void setCidcob(String cidcob) {
		this.cidcob = cidcob;
	}

	public String getUfcob() {
		return this.ufcob;
	}

	public void setUfcob(String ufcob) {
		this.ufcob = ufcob;
	}

	public String getCepcob() {
		return this.cepcob;
	}

	public void setCepcob(String cepcob) {
		this.cepcob = cepcob;
	}

	public String getDddfonecob() {
		return this.dddfonecob;
	}

	public void setDddfonecob(String dddfonecob) {
		this.dddfonecob = dddfonecob;
	}

	public String getFonecob() {
		return this.fonecob;
	}

	public void setFonecob(String fonecob) {
		this.fonecob = fonecob;
	}

	public String getDddfaxcob() {
		return this.dddfaxcob;
	}

	public void setDddfaxcob(String dddfaxcob) {
		this.dddfaxcob = dddfaxcob;
	}

	public String getFaxcob() {
		return this.faxcob;
	}

	public void setFaxcob(String faxcob) {
		this.faxcob = faxcob;
	}

	public String getEndent() {
		return this.endent;
	}

	public void setEndent(String endent) {
		this.endent = endent;
	}

	public Integer getNument() {
		return this.nument;
	}

	public void setNument(Integer nument) {
		this.nument = nument;
	}

	public String getComplent() {
		return this.complent;
	}

	public void setComplent(String complent) {
		this.complent = complent;
	}

	public String getBairent() {
		return this.bairent;
	}

	public void setBairent(String bairent) {
		this.bairent = bairent;
	}

	public String getCident() {
		return this.cident;
	}

	public void setCident(String cident) {
		this.cident = cident;
	}

	public String getUfent() {
		return this.ufent;
	}

	public void setUfent(String ufent) {
		this.ufent = ufent;
	}

	public String getCepent() {
		return this.cepent;
	}

	public void setCepent(String cepent) {
		this.cepent = cepent;
	}

	public String getDddfoneent() {
		return this.dddfoneent;
	}

	public void setDddfoneent(String dddfoneent) {
		this.dddfoneent = dddfoneent;
	}

	public String getFoneent() {
		return this.foneent;
	}

	public void setFoneent(String foneent) {
		this.foneent = foneent;
	}

	public String getDddfaxent() {
		return this.dddfaxent;
	}

	public void setDddfaxent(String dddfaxent) {
		this.dddfaxent = dddfaxent;
	}

	public String getFaxent() {
		return this.faxent;
	}

	public void setFaxent(String faxent) {
		this.faxent = faxent;
	}

	public String getDddcelent() {
		return this.dddcelent;
	}

	public void setDddcelent(String dddcelent) {
		this.dddcelent = dddcelent;
	}

	public String getCelent() {
		return this.celent;
	}

	public void setCelent(String celent) {
		this.celent = celent;
	}

	public String getObscli() {
		return this.obscli;
	}

	public void setObscli(String obscli) {
		this.obscli = obscli;
	}

	public String getAgenciacli() {
		return this.agenciacli;
	}

	public void setAgenciacli(String agenciacli) {
		this.agenciacli = agenciacli;
	}

	public String getNcontabcocli() {
		return this.ncontabcocli;
	}

	public void setNcontabcocli(String ncontabcocli) {
		this.ncontabcocli = ncontabcocli;
	}

	public Integer getCodemppq() {
		return this.codemppq;
	}

	public void setCodemppq(Integer codemppq) {
		this.codemppq = codemppq;
	}

	public Short getCodfilialpq() {
		return this.codfilialpq;
	}

	public void setCodfilialpq(Short codfilialpq) {
		this.codfilialpq = codfilialpq;
	}

	public Integer getCodpesq() {
		return this.codpesq;
	}

	public void setCodpesq(Integer codpesq) {
		this.codpesq = codpesq;
	}

	public String getIncracli() {
		return this.incracli;
	}

	public void setIncracli(String incracli) {
		this.incracli = incracli;
	}

	public Date getDtinitr() {
		return this.dtinitr;
	}

	public void setDtinitr(Date dtinitr) {
		this.dtinitr = dtinitr;
	}

	public Date getDtvenctotr() {
		return this.dtvenctotr;
	}

	public void setDtvenctotr(Date dtvenctotr) {
		this.dtvenctotr = dtvenctotr;
	}

	public String getNirfcli() {
		return this.nirfcli;
	}

	public void setNirfcli(String nirfcli) {
		this.nirfcli = nirfcli;
	}

	public Character getSimplescli() {
		return this.simplescli;
	}

	public void setSimplescli(Character simplescli) {
		this.simplescli = simplescli;
	}

	public String getDddcelcli() {
		return this.dddcelcli;
	}

	public void setDddcelcli(String dddcelcli) {
		this.dddcelcli = dddcelcli;
	}

	public String getCelcli() {
		return this.celcli;
	}

	public void setCelcli(String celcli) {
		this.celcli = celcli;
	}

	public String getNatcli() {
		return this.natcli;
	}

	public void setNatcli(String natcli) {
		this.natcli = natcli;
	}

	public String getUfnatcli() {
		return this.ufnatcli;
	}

	public void setUfnatcli(String ufnatcli) {
		this.ufnatcli = ufnatcli;
	}

	public String getTemporescli() {
		return this.temporescli;
	}

	public void setTemporescli(String temporescli) {
		this.temporescli = temporescli;
	}

	public String getApelidocli() {
		return this.apelidocli;
	}

	public void setApelidocli(String apelidocli) {
		this.apelidocli = apelidocli;
	}

	public String getSitecli() {
		return this.sitecli;
	}

	public void setSitecli(String sitecli) {
		this.sitecli = sitecli;
	}

	public String getCodcontdeb() {
		return this.codcontdeb;
	}

	public void setCodcontdeb(String codcontdeb) {
		this.codcontdeb = codcontdeb;
	}

	public String getCodcontcred() {
		return this.codcontcred;
	}

	public void setCodcontcred(String codcontcred) {
		this.codcontcred = codcontcred;
	}

	public String getCodclicontab() {
		return this.codclicontab;
	}

	public void setCodclicontab(String codclicontab) {
		this.codclicontab = codclicontab;
	}

	public byte[] getFotocli() {
		return this.fotocli;
	}

	public void setFotocli(byte[] fotocli) {
		this.fotocli = fotocli;
	}

	public byte[] getImgasscli() {
		return this.imgasscli;
	}

	public void setImgasscli(byte[] imgasscli) {
		this.imgasscli = imgasscli;
	}

	public String getSuframacli() {
		return this.suframacli;
	}

	public void setSuframacli(String suframacli) {
		this.suframacli = suframacli;
	}

	public char getProdruralcli() {
		return this.prodruralcli;
	}

	public void setProdruralcli(char prodruralcli) {
		this.prodruralcli = prodruralcli;
	}

	public char getCtocli() {
		return this.ctocli;
	}

	public void setCtocli(char ctocli) {
		this.ctocli = ctocli;
	}

	public String getCodcnae() {
		return this.codcnae;
	}

	public void setCodcnae(String codcnae) {
		this.codcnae = codcnae;
	}

	public String getInscmuncli() {
		return this.inscmuncli;
	}

	public void setInscmuncli(String inscmuncli) {
		this.inscmuncli = inscmuncli;
	}

	public BigDecimal getPercdesccli() {
		return this.percdesccli;
	}

	public void setPercdesccli(BigDecimal percdesccli) {
		this.percdesccli = percdesccli;
	}

	public String getContclicob() {
		return this.contclicob;
	}

	public void setContclicob(String contclicob) {
		this.contclicob = contclicob;
	}

	public String getContclient() {
		return this.contclient;
	}

	public void setContclient(String contclient) {
		this.contclient = contclient;
	}

	public Character getDescipi() {
		return this.descipi;
	}

	public void setDescipi(Character descipi) {
		this.descipi = descipi;
	}

	public char getIdentclibco() {
		return this.identclibco;
	}

	public void setIdentclibco(char identclibco) {
		this.identclibco = identclibco;
	}

	public Date getDtnasccli() {
		return this.dtnasccli;
	}

	public void setDtnasccli(Date dtnasccli) {
		this.dtnasccli = dtnasccli;
	}

	public char getSitrevcli() {
		return this.sitrevcli;
	}

	public void setSitrevcli(char sitrevcli) {
		this.sitrevcli = sitrevcli;
	}

	public String getIdusurevcli() {
		return this.idusurevcli;
	}

	public void setIdusurevcli(String idusurevcli) {
		this.idusurevcli = idusurevcli;
	}

	public Date getDtrevcli() {
		return this.dtrevcli;
	}

	public void setDtrevcli(Date dtrevcli) {
		this.dtrevcli = dtrevcli;
	}

	public Date getHrevcli() {
		return this.hrevcli;
	}

	public void setHrevcli(Date hrevcli) {
		this.hrevcli = hrevcli;
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

	public Set getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

	public Set getTkcampanhactos() {
		return this.tkcampanhactos;
	}

	public void setTkcampanhactos(Set tkcampanhactos) {
		this.tkcampanhactos = tkcampanhactos;
	}

	public Set getAtmodatendos() {
		return this.atmodatendos;
	}

	public void setAtmodatendos(Set atmodatendos) {
		this.atmodatendos = atmodatendos;
	}

	public Set getTkhistoricos() {
		return this.tkhistoricos;
	}

	public void setTkhistoricos(Set tkhistoricos) {
		this.tkhistoricos = tkhistoricos;
	}

	public Set getTkcontclis() {
		return this.tkcontclis;
	}

	public void setTkcontclis(Set tkcontclis) {
		this.tkcontclis = tkcontclis;
	}

	public Set getVdclirefps() {
		return this.vdclirefps;
	}

	public void setVdclirefps(Set vdclirefps) {
		this.vdclirefps = vdclirefps;
	}

	public Set getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	public Set getVdclirefcs() {
		return this.vdclirefcs;
	}

	public void setVdclirefcs(Set vdclirefcs) {
		this.vdclirefcs = vdclirefcs;
	}

	public Set getVdcliimovs() {
		return this.vdcliimovs;
	}

	public void setVdcliimovs(Set vdcliimovs) {
		this.vdcliimovs = vdcliimovs;
	}

	public Set getFnrestricaos() {
		return this.fnrestricaos;
	}

	public void setFnrestricaos(Set fnrestricaos) {
		this.fnrestricaos = fnrestricaos;
	}

	public Set getEqmovexps() {
		return this.eqmovexps;
	}

	public void setEqmovexps(Set eqmovexps) {
		this.eqmovexps = eqmovexps;
	}

	public Set getEqclifors() {
		return this.eqclifors;
	}

	public void setEqclifors(Set eqclifors) {
		this.eqclifors = eqclifors;
	}

	public Set getFnlibcreds() {
		return this.fnlibcreds;
	}

	public void setFnlibcreds(Set fnlibcreds) {
		this.fnlibcreds = fnlibcreds;
	}

	public Set getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	public Set getVdclicontases() {
		return this.vdclicontases;
	}

	public void setVdclicontases(Set vdclicontases) {
		this.vdclicontases = vdclicontases;
	}

	public Set getVdclimetavends() {
		return this.vdclimetavends;
	}

	public void setVdclimetavends(Set vdclimetavends) {
		this.vdclimetavends = vdclimetavends;
	}

	public Set getVdcliterras() {
		return this.vdcliterras;
	}

	public void setVdcliterras(Set vdcliterras) {
		this.vdcliterras = vdcliterras;
	}

	public Set getCrchamados() {
		return this.crchamados;
	}

	public void setCrchamados(Set crchamados) {
		this.crchamados = crchamados;
	}

	public Set getSgprefere4s() {
		return this.sgprefere4s;
	}

	public void setSgprefere4s(Set sgprefere4s) {
		this.sgprefere4s = sgprefere4s;
	}

	public Set getVdsetorrotas() {
		return this.vdsetorrotas;
	}

	public void setVdsetorrotas(Set vdsetorrotas) {
		this.vdsetorrotas = vdsetorrotas;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getSgeqvclifors() {
		return this.sgeqvclifors;
	}

	public void setSgeqvclifors(Set sgeqvclifors) {
		this.sgeqvclifors = sgeqvclifors;
	}

	public Set getVdvendaconsigs() {
		return this.vdvendaconsigs;
	}

	public void setVdvendaconsigs(Set vdvendaconsigs) {
		this.vdvendaconsigs = vdvendaconsigs;
	}

	public Set getVdobsclis() {
		return this.vdobsclis;
	}

	public void setVdobsclis(Set vdobsclis) {
		this.vdobsclis = vdobsclis;
	}

	public Set getVdcliautps() {
		return this.vdcliautps;
	}

	public void setVdcliautps(Set vdcliautps) {
		this.vdcliautps = vdcliautps;
	}

	public Set getTksitcamps() {
		return this.tksitcamps;
	}

	public void setTksitcamps(Set tksitcamps) {
		this.tksitcamps = tksitcamps;
	}

	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

	public Set getFnfbnclis() {
		return this.fnfbnclis;
	}

	public void setFnfbnclis(Set fnfbnclis) {
		this.fnfbnclis = fnfbnclis;
	}

	public Set getVdcliveics() {
		return this.vdcliveics;
	}

	public void setVdcliveics(Set vdcliveics) {
		this.vdcliveics = vdcliveics;
	}

	public Set getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set fnlancas) {
		this.fnlancas = fnlancas;
	}

	public Vdclicompl getVdclicompl() {
		return this.vdclicompl;
	}

	public void setVdclicompl(Vdclicompl vdclicompl) {
		this.vdclicompl = vdclicompl;
	}

	public Set getVdcontratos() {
		return this.vdcontratos;
	}

	public void setVdcontratos(Set vdcontratos) {
		this.vdcontratos = vdcontratos;
	}

	public Set getVdclisocioses() {
		return this.vdclisocioses;
	}

	public void setVdclisocioses(Set vdclisocioses) {
		this.vdclisocioses = vdclisocioses;
	}

	public Set getTkcampanhaclis() {
		return this.tkcampanhaclis;
	}

	public void setTkcampanhaclis(Set tkcampanhaclis) {
		this.tkcampanhaclis = tkcampanhaclis;
	}

	public Set getSvoses() {
		return this.svoses;
	}

	public void setSvoses(Set svoses) {
		this.svoses = svoses;
	}

	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	public Set getEqlanctoexps() {
		return this.eqlanctoexps;
	}

	public void setEqlanctoexps(Set eqlanctoexps) {
		this.eqlanctoexps = eqlanctoexps;
	}

}

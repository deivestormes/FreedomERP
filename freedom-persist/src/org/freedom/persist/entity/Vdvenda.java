package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdvenda generated by hbm2java
 */
public class Vdvenda implements java.io.Serializable {

	private VdvendaId id;
	private Ppop ppop;
	private Pvcaixa pvcaixa;
	private Fnbanco fnbanco;
	private Eqrecmerc eqrecmerc;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fntipocob fntipocob;
	private Vdcliente vdcliente;
	private Fnplanopag fnplanopag;
	private Lfserie lfserie;
	private Eqtipomov eqtipomov;
	private Vdclcomis vdclcomis;
	private Vdvendedor vdvendedor;
	private Fncartcob fncartcob;
	private String subtipovenda;
	private int docvenda;
	private Date dtsaidavenda;
	private Date dtemitvenda;
	private Date dtcompvenda;
	private BigDecimal vlrprodvenda;
	private BigDecimal percdescvenda;
	private BigDecimal vlrdescvenda;
	private BigDecimal vlrdescitvenda;
	private BigDecimal vlrvenda;
	private BigDecimal vlrbaseicmsvenda;
	private BigDecimal vlricmsvenda;
	private Character calcicmsvenda;
	private Character impicmsvenda;
	private BigDecimal vlrisentasvenda;
	private BigDecimal vlroutrasvenda;
	private BigDecimal vlrbaseipivenda;
	private BigDecimal vlrliqvenda;
	private BigDecimal perccomisvenda;
	private BigDecimal vlrcomisvenda;
	private String statusvenda;
	private BigDecimal vlrfretevenda;
	private BigDecimal vlradicvenda;
	private BigDecimal vlripivenda;
	private Character calcipivenda;
	private Character impipivenda;
	private String obsvenda;
	private BigDecimal vlrbaseissvenda;
	private BigDecimal vlrissvenda;
	private Character calcissvenda;
	private Character impiissvenda;
	private String impnotavenda;
	private Character flag;
	private Character codclascomis;
	private BigDecimal vlrpisvenda;
	private Character calcpisvenda;
	private Character imppisvenda;
	private BigDecimal vlrcofinsvenda;
	private Character calccofinsvenda;
	private Character impcofinsvenda;
	private BigDecimal vlrirvenda;
	private Character calcirvenda;
	private Character impirvenda;
	private BigDecimal vlrcsocialvenda;
	private Character calccsocialvenda;
	private Character impcsocialvenda;
	private BigDecimal percmcomisvenda;
	private String pedclivenda;
	private BigDecimal vlricmsstvenda;
	private BigDecimal vlrbaseicmsstvenda;
	private Character emmanut;
	private char bloqvenda;
	private BigDecimal vlricmssimples;
	private BigDecimal percicmssimples;
	private BigDecimal vlrbasepisvenda;
	private BigDecimal vlrbasecofinsvenda;
	private BigDecimal vlrbasecomis;
	private String chavenfevenda;
	private String obsrec;
	private String infcompl;
	private String sitdoc;
	private String obsnfe;
	private Character descipivenda;
	private char localserv;
	private char nroatualizado;
	private Long cnf;
	private char sitcomplvenda;
	private String motivocancvenda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vditromaneios = new HashSet(0);
	private Vdfretevd vdfretevd;
	private Set lffretevendas = new HashSet(0);
	private Set vdvendacomises = new HashSet(0);
	private Set vdauxvendas = new HashSet(0);
	private Vdvendaentrega vdvendaentrega;
	private Set vditvendas = new HashSet(0);
	private Set vdcomissaos = new HashSet(0);
	private Set ppitops = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set fnlibcreds = new HashSet(0);
	private Set vdtefs = new HashSet(0);

	public Vdvenda() {
	}

	public Vdvenda(VdvendaId id, Sgfilial sgfilial, Vdcliente vdcliente,
			Fnplanopag fnplanopag, Lfserie lfserie, Eqtipomov eqtipomov,
			String subtipovenda, int docvenda, Date dtsaidavenda,
			Date dtemitvenda, Date dtcompvenda, String statusvenda,
			char bloqvenda, char localserv, char nroatualizado,
			char sitcomplvenda, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.lfserie = lfserie;
		this.eqtipomov = eqtipomov;
		this.subtipovenda = subtipovenda;
		this.docvenda = docvenda;
		this.dtsaidavenda = dtsaidavenda;
		this.dtemitvenda = dtemitvenda;
		this.dtcompvenda = dtcompvenda;
		this.statusvenda = statusvenda;
		this.bloqvenda = bloqvenda;
		this.localserv = localserv;
		this.nroatualizado = nroatualizado;
		this.sitcomplvenda = sitcomplvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdvenda(VdvendaId id, Ppop ppop, Pvcaixa pvcaixa, Fnbanco fnbanco,
			Eqrecmerc eqrecmerc, Sgfilial sgfilial, Fnconta fnconta,
			Fntipocob fntipocob, Vdcliente vdcliente, Fnplanopag fnplanopag,
			Lfserie lfserie, Eqtipomov eqtipomov, Vdclcomis vdclcomis,
			Vdvendedor vdvendedor, Fncartcob fncartcob, String subtipovenda,
			int docvenda, Date dtsaidavenda, Date dtemitvenda,
			Date dtcompvenda, BigDecimal vlrprodvenda,
			BigDecimal percdescvenda, BigDecimal vlrdescvenda,
			BigDecimal vlrdescitvenda, BigDecimal vlrvenda,
			BigDecimal vlrbaseicmsvenda, BigDecimal vlricmsvenda,
			Character calcicmsvenda, Character impicmsvenda,
			BigDecimal vlrisentasvenda, BigDecimal vlroutrasvenda,
			BigDecimal vlrbaseipivenda, BigDecimal vlrliqvenda,
			BigDecimal perccomisvenda, BigDecimal vlrcomisvenda,
			String statusvenda, BigDecimal vlrfretevenda,
			BigDecimal vlradicvenda, BigDecimal vlripivenda,
			Character calcipivenda, Character impipivenda, String obsvenda,
			BigDecimal vlrbaseissvenda, BigDecimal vlrissvenda,
			Character calcissvenda, Character impiissvenda,
			String impnotavenda, Character flag, Character codclascomis,
			BigDecimal vlrpisvenda, Character calcpisvenda,
			Character imppisvenda, BigDecimal vlrcofinsvenda,
			Character calccofinsvenda, Character impcofinsvenda,
			BigDecimal vlrirvenda, Character calcirvenda, Character impirvenda,
			BigDecimal vlrcsocialvenda, Character calccsocialvenda,
			Character impcsocialvenda, BigDecimal percmcomisvenda,
			String pedclivenda, BigDecimal vlricmsstvenda,
			BigDecimal vlrbaseicmsstvenda, Character emmanut, char bloqvenda,
			BigDecimal vlricmssimples, BigDecimal percicmssimples,
			BigDecimal vlrbasepisvenda, BigDecimal vlrbasecofinsvenda,
			BigDecimal vlrbasecomis, String chavenfevenda, String obsrec,
			String infcompl, String sitdoc, String obsnfe,
			Character descipivenda, char localserv, char nroatualizado,
			Long cnf, char sitcomplvenda, String motivocancvenda, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vditromaneios, Vdfretevd vdfretevd, Set lffretevendas,
			Set vdvendacomises, Set vdauxvendas, Vdvendaentrega vdvendaentrega,
			Set vditvendas, Set vdcomissaos, Set ppitops, Set fnrecebers,
			Set fnlibcreds, Set vdtefs) {
		this.id = id;
		this.ppop = ppop;
		this.pvcaixa = pvcaixa;
		this.fnbanco = fnbanco;
		this.eqrecmerc = eqrecmerc;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fntipocob = fntipocob;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.lfserie = lfserie;
		this.eqtipomov = eqtipomov;
		this.vdclcomis = vdclcomis;
		this.vdvendedor = vdvendedor;
		this.fncartcob = fncartcob;
		this.subtipovenda = subtipovenda;
		this.docvenda = docvenda;
		this.dtsaidavenda = dtsaidavenda;
		this.dtemitvenda = dtemitvenda;
		this.dtcompvenda = dtcompvenda;
		this.vlrprodvenda = vlrprodvenda;
		this.percdescvenda = percdescvenda;
		this.vlrdescvenda = vlrdescvenda;
		this.vlrdescitvenda = vlrdescitvenda;
		this.vlrvenda = vlrvenda;
		this.vlrbaseicmsvenda = vlrbaseicmsvenda;
		this.vlricmsvenda = vlricmsvenda;
		this.calcicmsvenda = calcicmsvenda;
		this.impicmsvenda = impicmsvenda;
		this.vlrisentasvenda = vlrisentasvenda;
		this.vlroutrasvenda = vlroutrasvenda;
		this.vlrbaseipivenda = vlrbaseipivenda;
		this.vlrliqvenda = vlrliqvenda;
		this.perccomisvenda = perccomisvenda;
		this.vlrcomisvenda = vlrcomisvenda;
		this.statusvenda = statusvenda;
		this.vlrfretevenda = vlrfretevenda;
		this.vlradicvenda = vlradicvenda;
		this.vlripivenda = vlripivenda;
		this.calcipivenda = calcipivenda;
		this.impipivenda = impipivenda;
		this.obsvenda = obsvenda;
		this.vlrbaseissvenda = vlrbaseissvenda;
		this.vlrissvenda = vlrissvenda;
		this.calcissvenda = calcissvenda;
		this.impiissvenda = impiissvenda;
		this.impnotavenda = impnotavenda;
		this.flag = flag;
		this.codclascomis = codclascomis;
		this.vlrpisvenda = vlrpisvenda;
		this.calcpisvenda = calcpisvenda;
		this.imppisvenda = imppisvenda;
		this.vlrcofinsvenda = vlrcofinsvenda;
		this.calccofinsvenda = calccofinsvenda;
		this.impcofinsvenda = impcofinsvenda;
		this.vlrirvenda = vlrirvenda;
		this.calcirvenda = calcirvenda;
		this.impirvenda = impirvenda;
		this.vlrcsocialvenda = vlrcsocialvenda;
		this.calccsocialvenda = calccsocialvenda;
		this.impcsocialvenda = impcsocialvenda;
		this.percmcomisvenda = percmcomisvenda;
		this.pedclivenda = pedclivenda;
		this.vlricmsstvenda = vlricmsstvenda;
		this.vlrbaseicmsstvenda = vlrbaseicmsstvenda;
		this.emmanut = emmanut;
		this.bloqvenda = bloqvenda;
		this.vlricmssimples = vlricmssimples;
		this.percicmssimples = percicmssimples;
		this.vlrbasepisvenda = vlrbasepisvenda;
		this.vlrbasecofinsvenda = vlrbasecofinsvenda;
		this.vlrbasecomis = vlrbasecomis;
		this.chavenfevenda = chavenfevenda;
		this.obsrec = obsrec;
		this.infcompl = infcompl;
		this.sitdoc = sitdoc;
		this.obsnfe = obsnfe;
		this.descipivenda = descipivenda;
		this.localserv = localserv;
		this.nroatualizado = nroatualizado;
		this.cnf = cnf;
		this.sitcomplvenda = sitcomplvenda;
		this.motivocancvenda = motivocancvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vditromaneios = vditromaneios;
		this.vdfretevd = vdfretevd;
		this.lffretevendas = lffretevendas;
		this.vdvendacomises = vdvendacomises;
		this.vdauxvendas = vdauxvendas;
		this.vdvendaentrega = vdvendaentrega;
		this.vditvendas = vditvendas;
		this.vdcomissaos = vdcomissaos;
		this.ppitops = ppitops;
		this.fnrecebers = fnrecebers;
		this.fnlibcreds = fnlibcreds;
		this.vdtefs = vdtefs;
	}

	public VdvendaId getId() {
		return this.id;
	}

	public void setId(VdvendaId id) {
		this.id = id;
	}

	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Lfserie getLfserie() {
		return this.lfserie;
	}

	public void setLfserie(Lfserie lfserie) {
		this.lfserie = lfserie;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Vdclcomis getVdclcomis() {
		return this.vdclcomis;
	}

	public void setVdclcomis(Vdclcomis vdclcomis) {
		this.vdclcomis = vdclcomis;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	public String getSubtipovenda() {
		return this.subtipovenda;
	}

	public void setSubtipovenda(String subtipovenda) {
		this.subtipovenda = subtipovenda;
	}

	public int getDocvenda() {
		return this.docvenda;
	}

	public void setDocvenda(int docvenda) {
		this.docvenda = docvenda;
	}

	public Date getDtsaidavenda() {
		return this.dtsaidavenda;
	}

	public void setDtsaidavenda(Date dtsaidavenda) {
		this.dtsaidavenda = dtsaidavenda;
	}

	public Date getDtemitvenda() {
		return this.dtemitvenda;
	}

	public void setDtemitvenda(Date dtemitvenda) {
		this.dtemitvenda = dtemitvenda;
	}

	public Date getDtcompvenda() {
		return this.dtcompvenda;
	}

	public void setDtcompvenda(Date dtcompvenda) {
		this.dtcompvenda = dtcompvenda;
	}

	public BigDecimal getVlrprodvenda() {
		return this.vlrprodvenda;
	}

	public void setVlrprodvenda(BigDecimal vlrprodvenda) {
		this.vlrprodvenda = vlrprodvenda;
	}

	public BigDecimal getPercdescvenda() {
		return this.percdescvenda;
	}

	public void setPercdescvenda(BigDecimal percdescvenda) {
		this.percdescvenda = percdescvenda;
	}

	public BigDecimal getVlrdescvenda() {
		return this.vlrdescvenda;
	}

	public void setVlrdescvenda(BigDecimal vlrdescvenda) {
		this.vlrdescvenda = vlrdescvenda;
	}

	public BigDecimal getVlrdescitvenda() {
		return this.vlrdescitvenda;
	}

	public void setVlrdescitvenda(BigDecimal vlrdescitvenda) {
		this.vlrdescitvenda = vlrdescitvenda;
	}

	public BigDecimal getVlrvenda() {
		return this.vlrvenda;
	}

	public void setVlrvenda(BigDecimal vlrvenda) {
		this.vlrvenda = vlrvenda;
	}

	public BigDecimal getVlrbaseicmsvenda() {
		return this.vlrbaseicmsvenda;
	}

	public void setVlrbaseicmsvenda(BigDecimal vlrbaseicmsvenda) {
		this.vlrbaseicmsvenda = vlrbaseicmsvenda;
	}

	public BigDecimal getVlricmsvenda() {
		return this.vlricmsvenda;
	}

	public void setVlricmsvenda(BigDecimal vlricmsvenda) {
		this.vlricmsvenda = vlricmsvenda;
	}

	public Character getCalcicmsvenda() {
		return this.calcicmsvenda;
	}

	public void setCalcicmsvenda(Character calcicmsvenda) {
		this.calcicmsvenda = calcicmsvenda;
	}

	public Character getImpicmsvenda() {
		return this.impicmsvenda;
	}

	public void setImpicmsvenda(Character impicmsvenda) {
		this.impicmsvenda = impicmsvenda;
	}

	public BigDecimal getVlrisentasvenda() {
		return this.vlrisentasvenda;
	}

	public void setVlrisentasvenda(BigDecimal vlrisentasvenda) {
		this.vlrisentasvenda = vlrisentasvenda;
	}

	public BigDecimal getVlroutrasvenda() {
		return this.vlroutrasvenda;
	}

	public void setVlroutrasvenda(BigDecimal vlroutrasvenda) {
		this.vlroutrasvenda = vlroutrasvenda;
	}

	public BigDecimal getVlrbaseipivenda() {
		return this.vlrbaseipivenda;
	}

	public void setVlrbaseipivenda(BigDecimal vlrbaseipivenda) {
		this.vlrbaseipivenda = vlrbaseipivenda;
	}

	public BigDecimal getVlrliqvenda() {
		return this.vlrliqvenda;
	}

	public void setVlrliqvenda(BigDecimal vlrliqvenda) {
		this.vlrliqvenda = vlrliqvenda;
	}

	public BigDecimal getPerccomisvenda() {
		return this.perccomisvenda;
	}

	public void setPerccomisvenda(BigDecimal perccomisvenda) {
		this.perccomisvenda = perccomisvenda;
	}

	public BigDecimal getVlrcomisvenda() {
		return this.vlrcomisvenda;
	}

	public void setVlrcomisvenda(BigDecimal vlrcomisvenda) {
		this.vlrcomisvenda = vlrcomisvenda;
	}

	public String getStatusvenda() {
		return this.statusvenda;
	}

	public void setStatusvenda(String statusvenda) {
		this.statusvenda = statusvenda;
	}

	public BigDecimal getVlrfretevenda() {
		return this.vlrfretevenda;
	}

	public void setVlrfretevenda(BigDecimal vlrfretevenda) {
		this.vlrfretevenda = vlrfretevenda;
	}

	public BigDecimal getVlradicvenda() {
		return this.vlradicvenda;
	}

	public void setVlradicvenda(BigDecimal vlradicvenda) {
		this.vlradicvenda = vlradicvenda;
	}

	public BigDecimal getVlripivenda() {
		return this.vlripivenda;
	}

	public void setVlripivenda(BigDecimal vlripivenda) {
		this.vlripivenda = vlripivenda;
	}

	public Character getCalcipivenda() {
		return this.calcipivenda;
	}

	public void setCalcipivenda(Character calcipivenda) {
		this.calcipivenda = calcipivenda;
	}

	public Character getImpipivenda() {
		return this.impipivenda;
	}

	public void setImpipivenda(Character impipivenda) {
		this.impipivenda = impipivenda;
	}

	public String getObsvenda() {
		return this.obsvenda;
	}

	public void setObsvenda(String obsvenda) {
		this.obsvenda = obsvenda;
	}

	public BigDecimal getVlrbaseissvenda() {
		return this.vlrbaseissvenda;
	}

	public void setVlrbaseissvenda(BigDecimal vlrbaseissvenda) {
		this.vlrbaseissvenda = vlrbaseissvenda;
	}

	public BigDecimal getVlrissvenda() {
		return this.vlrissvenda;
	}

	public void setVlrissvenda(BigDecimal vlrissvenda) {
		this.vlrissvenda = vlrissvenda;
	}

	public Character getCalcissvenda() {
		return this.calcissvenda;
	}

	public void setCalcissvenda(Character calcissvenda) {
		this.calcissvenda = calcissvenda;
	}

	public Character getImpiissvenda() {
		return this.impiissvenda;
	}

	public void setImpiissvenda(Character impiissvenda) {
		this.impiissvenda = impiissvenda;
	}

	public String getImpnotavenda() {
		return this.impnotavenda;
	}

	public void setImpnotavenda(String impnotavenda) {
		this.impnotavenda = impnotavenda;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public Character getCodclascomis() {
		return this.codclascomis;
	}

	public void setCodclascomis(Character codclascomis) {
		this.codclascomis = codclascomis;
	}

	public BigDecimal getVlrpisvenda() {
		return this.vlrpisvenda;
	}

	public void setVlrpisvenda(BigDecimal vlrpisvenda) {
		this.vlrpisvenda = vlrpisvenda;
	}

	public Character getCalcpisvenda() {
		return this.calcpisvenda;
	}

	public void setCalcpisvenda(Character calcpisvenda) {
		this.calcpisvenda = calcpisvenda;
	}

	public Character getImppisvenda() {
		return this.imppisvenda;
	}

	public void setImppisvenda(Character imppisvenda) {
		this.imppisvenda = imppisvenda;
	}

	public BigDecimal getVlrcofinsvenda() {
		return this.vlrcofinsvenda;
	}

	public void setVlrcofinsvenda(BigDecimal vlrcofinsvenda) {
		this.vlrcofinsvenda = vlrcofinsvenda;
	}

	public Character getCalccofinsvenda() {
		return this.calccofinsvenda;
	}

	public void setCalccofinsvenda(Character calccofinsvenda) {
		this.calccofinsvenda = calccofinsvenda;
	}

	public Character getImpcofinsvenda() {
		return this.impcofinsvenda;
	}

	public void setImpcofinsvenda(Character impcofinsvenda) {
		this.impcofinsvenda = impcofinsvenda;
	}

	public BigDecimal getVlrirvenda() {
		return this.vlrirvenda;
	}

	public void setVlrirvenda(BigDecimal vlrirvenda) {
		this.vlrirvenda = vlrirvenda;
	}

	public Character getCalcirvenda() {
		return this.calcirvenda;
	}

	public void setCalcirvenda(Character calcirvenda) {
		this.calcirvenda = calcirvenda;
	}

	public Character getImpirvenda() {
		return this.impirvenda;
	}

	public void setImpirvenda(Character impirvenda) {
		this.impirvenda = impirvenda;
	}

	public BigDecimal getVlrcsocialvenda() {
		return this.vlrcsocialvenda;
	}

	public void setVlrcsocialvenda(BigDecimal vlrcsocialvenda) {
		this.vlrcsocialvenda = vlrcsocialvenda;
	}

	public Character getCalccsocialvenda() {
		return this.calccsocialvenda;
	}

	public void setCalccsocialvenda(Character calccsocialvenda) {
		this.calccsocialvenda = calccsocialvenda;
	}

	public Character getImpcsocialvenda() {
		return this.impcsocialvenda;
	}

	public void setImpcsocialvenda(Character impcsocialvenda) {
		this.impcsocialvenda = impcsocialvenda;
	}

	public BigDecimal getPercmcomisvenda() {
		return this.percmcomisvenda;
	}

	public void setPercmcomisvenda(BigDecimal percmcomisvenda) {
		this.percmcomisvenda = percmcomisvenda;
	}

	public String getPedclivenda() {
		return this.pedclivenda;
	}

	public void setPedclivenda(String pedclivenda) {
		this.pedclivenda = pedclivenda;
	}

	public BigDecimal getVlricmsstvenda() {
		return this.vlricmsstvenda;
	}

	public void setVlricmsstvenda(BigDecimal vlricmsstvenda) {
		this.vlricmsstvenda = vlricmsstvenda;
	}

	public BigDecimal getVlrbaseicmsstvenda() {
		return this.vlrbaseicmsstvenda;
	}

	public void setVlrbaseicmsstvenda(BigDecimal vlrbaseicmsstvenda) {
		this.vlrbaseicmsstvenda = vlrbaseicmsstvenda;
	}

	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
		this.emmanut = emmanut;
	}

	public char getBloqvenda() {
		return this.bloqvenda;
	}

	public void setBloqvenda(char bloqvenda) {
		this.bloqvenda = bloqvenda;
	}

	public BigDecimal getVlricmssimples() {
		return this.vlricmssimples;
	}

	public void setVlricmssimples(BigDecimal vlricmssimples) {
		this.vlricmssimples = vlricmssimples;
	}

	public BigDecimal getPercicmssimples() {
		return this.percicmssimples;
	}

	public void setPercicmssimples(BigDecimal percicmssimples) {
		this.percicmssimples = percicmssimples;
	}

	public BigDecimal getVlrbasepisvenda() {
		return this.vlrbasepisvenda;
	}

	public void setVlrbasepisvenda(BigDecimal vlrbasepisvenda) {
		this.vlrbasepisvenda = vlrbasepisvenda;
	}

	public BigDecimal getVlrbasecofinsvenda() {
		return this.vlrbasecofinsvenda;
	}

	public void setVlrbasecofinsvenda(BigDecimal vlrbasecofinsvenda) {
		this.vlrbasecofinsvenda = vlrbasecofinsvenda;
	}

	public BigDecimal getVlrbasecomis() {
		return this.vlrbasecomis;
	}

	public void setVlrbasecomis(BigDecimal vlrbasecomis) {
		this.vlrbasecomis = vlrbasecomis;
	}

	public String getChavenfevenda() {
		return this.chavenfevenda;
	}

	public void setChavenfevenda(String chavenfevenda) {
		this.chavenfevenda = chavenfevenda;
	}

	public String getObsrec() {
		return this.obsrec;
	}

	public void setObsrec(String obsrec) {
		this.obsrec = obsrec;
	}

	public String getInfcompl() {
		return this.infcompl;
	}

	public void setInfcompl(String infcompl) {
		this.infcompl = infcompl;
	}

	public String getSitdoc() {
		return this.sitdoc;
	}

	public void setSitdoc(String sitdoc) {
		this.sitdoc = sitdoc;
	}

	public String getObsnfe() {
		return this.obsnfe;
	}

	public void setObsnfe(String obsnfe) {
		this.obsnfe = obsnfe;
	}

	public Character getDescipivenda() {
		return this.descipivenda;
	}

	public void setDescipivenda(Character descipivenda) {
		this.descipivenda = descipivenda;
	}

	public char getLocalserv() {
		return this.localserv;
	}

	public void setLocalserv(char localserv) {
		this.localserv = localserv;
	}

	public char getNroatualizado() {
		return this.nroatualizado;
	}

	public void setNroatualizado(char nroatualizado) {
		this.nroatualizado = nroatualizado;
	}

	public Long getCnf() {
		return this.cnf;
	}

	public void setCnf(Long cnf) {
		this.cnf = cnf;
	}

	public char getSitcomplvenda() {
		return this.sitcomplvenda;
	}

	public void setSitcomplvenda(char sitcomplvenda) {
		this.sitcomplvenda = sitcomplvenda;
	}

	public String getMotivocancvenda() {
		return this.motivocancvenda;
	}

	public void setMotivocancvenda(String motivocancvenda) {
		this.motivocancvenda = motivocancvenda;
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

	public Set getVditromaneios() {
		return this.vditromaneios;
	}

	public void setVditromaneios(Set vditromaneios) {
		this.vditromaneios = vditromaneios;
	}

	public Vdfretevd getVdfretevd() {
		return this.vdfretevd;
	}

	public void setVdfretevd(Vdfretevd vdfretevd) {
		this.vdfretevd = vdfretevd;
	}

	public Set getLffretevendas() {
		return this.lffretevendas;
	}

	public void setLffretevendas(Set lffretevendas) {
		this.lffretevendas = lffretevendas;
	}

	public Set getVdvendacomises() {
		return this.vdvendacomises;
	}

	public void setVdvendacomises(Set vdvendacomises) {
		this.vdvendacomises = vdvendacomises;
	}

	public Set getVdauxvendas() {
		return this.vdauxvendas;
	}

	public void setVdauxvendas(Set vdauxvendas) {
		this.vdauxvendas = vdauxvendas;
	}

	public Vdvendaentrega getVdvendaentrega() {
		return this.vdvendaentrega;
	}

	public void setVdvendaentrega(Vdvendaentrega vdvendaentrega) {
		this.vdvendaentrega = vdvendaentrega;
	}

	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

	public Set getVdcomissaos() {
		return this.vdcomissaos;
	}

	public void setVdcomissaos(Set vdcomissaos) {
		this.vdcomissaos = vdcomissaos;
	}

	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	public Set getFnlibcreds() {
		return this.fnlibcreds;
	}

	public void setFnlibcreds(Set fnlibcreds) {
		this.fnlibcreds = fnlibcreds;
	}

	public Set getVdtefs() {
		return this.vdtefs;
	}

	public void setVdtefs(Set vdtefs) {
		this.vdtefs = vdtefs;
	}

}

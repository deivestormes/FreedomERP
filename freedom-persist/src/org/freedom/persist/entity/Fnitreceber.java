package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnitreceber generated by hbm2java
 */
public class Fnitreceber implements java.io.Serializable {

	private FnitreceberId id;
	private Fnconta fnconta;
	private Fntipocob fntipocob;
	private Fnsinal fnsinal;
	private Fnplanejamento fnplanejamento;
	private Fnreceber fnreceber;
	private Vditcontrato vditcontrato;
	private Fnbanco fnbanco;
	private Fncartcob fncartcob;
	private BigDecimal vlritrec;
	private BigDecimal vlrdescitrec;
	private BigDecimal vlrmultaitrec;
	private BigDecimal vlrjurositrec;
	private BigDecimal vlrdevitrec;
	private BigDecimal vlrparcitrec;
	private BigDecimal vlrpagoitrec;
	private BigDecimal vlrapagitrec;
	private BigDecimal vlrcomiitrec;
	private BigDecimal vlrcancitrec;
	private BigDecimal vlrbasecomis;
	private char descpont;
	private Date dtitrec;
	private Date dtcompitrec;
	private Date dtvencitrec;
	private Date dtprevitrec;
	private Date dtpagoitrec;
	private Date dtliqitrec;
	private String statusitrec;
	private String obsitrec;
	private String doclancaitrec;
	private Character flag;
	private Integer codempcc;
	private Short codfilialcc;
	private Short anocc;
	private String codcc;
	private char impreciboitrec;
	private Integer reciboitrec;
	private char altusuitrec;
	private char pdvitrec;
	private char recemcob;
	private Date dtiniemcob;
	private Date dtfimemcob;
	private Integer seqnossonumero;
	private String nossonumero;
	private char emmanut;
	private Character multibaixa;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnmovimentos = new HashSet(0);
	private Set fnitrenegrecs = new HashSet(0);
	private Set fnlancas = new HashSet(0);
	private Set vdcomissaos = new HashSet(0);
	private Set fnitborderos = new HashSet(0);
	private Set fnsublancas = new HashSet(0);
	private Fnfbnrec fnfbnrec;
	private Set atatendimentoitrecs = new HashSet(0);

	public Fnitreceber() {
	}

	public Fnitreceber(FnitreceberId id, Fnreceber fnreceber,
			BigDecimal vlritrec, BigDecimal vlrdevitrec, char descpont,
			Date dtitrec, Date dtcompitrec, Date dtvencitrec,
			String statusitrec, char impreciboitrec, char altusuitrec,
			char pdvitrec, char recemcob, char emmanut, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.fnreceber = fnreceber;
		this.vlritrec = vlritrec;
		this.vlrdevitrec = vlrdevitrec;
		this.descpont = descpont;
		this.dtitrec = dtitrec;
		this.dtcompitrec = dtcompitrec;
		this.dtvencitrec = dtvencitrec;
		this.statusitrec = statusitrec;
		this.impreciboitrec = impreciboitrec;
		this.altusuitrec = altusuitrec;
		this.pdvitrec = pdvitrec;
		this.recemcob = recemcob;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnitreceber(FnitreceberId id, Fnconta fnconta, Fntipocob fntipocob,
			Fnsinal fnsinal, Fnplanejamento fnplanejamento,
			Fnreceber fnreceber, Vditcontrato vditcontrato, Fnbanco fnbanco,
			Fncartcob fncartcob, BigDecimal vlritrec, BigDecimal vlrdescitrec,
			BigDecimal vlrmultaitrec, BigDecimal vlrjurositrec,
			BigDecimal vlrdevitrec, BigDecimal vlrparcitrec,
			BigDecimal vlrpagoitrec, BigDecimal vlrapagitrec,
			BigDecimal vlrcomiitrec, BigDecimal vlrcancitrec,
			BigDecimal vlrbasecomis, char descpont, Date dtitrec,
			Date dtcompitrec, Date dtvencitrec, Date dtprevitrec,
			Date dtpagoitrec, Date dtliqitrec, String statusitrec,
			String obsitrec, String doclancaitrec, Character flag,
			Integer codempcc, Short codfilialcc, Short anocc, String codcc,
			char impreciboitrec, Integer reciboitrec, char altusuitrec,
			char pdvitrec, char recemcob, Date dtiniemcob, Date dtfimemcob,
			Integer seqnossonumero, String nossonumero, char emmanut,
			Character multibaixa, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set fnmovimentos,
			Set fnitrenegrecs, Set fnlancas, Set vdcomissaos, Set fnitborderos,
			Set fnsublancas, Fnfbnrec fnfbnrec, Set atatendimentoitrecs) {
		this.id = id;
		this.fnconta = fnconta;
		this.fntipocob = fntipocob;
		this.fnsinal = fnsinal;
		this.fnplanejamento = fnplanejamento;
		this.fnreceber = fnreceber;
		this.vditcontrato = vditcontrato;
		this.fnbanco = fnbanco;
		this.fncartcob = fncartcob;
		this.vlritrec = vlritrec;
		this.vlrdescitrec = vlrdescitrec;
		this.vlrmultaitrec = vlrmultaitrec;
		this.vlrjurositrec = vlrjurositrec;
		this.vlrdevitrec = vlrdevitrec;
		this.vlrparcitrec = vlrparcitrec;
		this.vlrpagoitrec = vlrpagoitrec;
		this.vlrapagitrec = vlrapagitrec;
		this.vlrcomiitrec = vlrcomiitrec;
		this.vlrcancitrec = vlrcancitrec;
		this.vlrbasecomis = vlrbasecomis;
		this.descpont = descpont;
		this.dtitrec = dtitrec;
		this.dtcompitrec = dtcompitrec;
		this.dtvencitrec = dtvencitrec;
		this.dtprevitrec = dtprevitrec;
		this.dtpagoitrec = dtpagoitrec;
		this.dtliqitrec = dtliqitrec;
		this.statusitrec = statusitrec;
		this.obsitrec = obsitrec;
		this.doclancaitrec = doclancaitrec;
		this.flag = flag;
		this.codempcc = codempcc;
		this.codfilialcc = codfilialcc;
		this.anocc = anocc;
		this.codcc = codcc;
		this.impreciboitrec = impreciboitrec;
		this.reciboitrec = reciboitrec;
		this.altusuitrec = altusuitrec;
		this.pdvitrec = pdvitrec;
		this.recemcob = recemcob;
		this.dtiniemcob = dtiniemcob;
		this.dtfimemcob = dtfimemcob;
		this.seqnossonumero = seqnossonumero;
		this.nossonumero = nossonumero;
		this.emmanut = emmanut;
		this.multibaixa = multibaixa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnmovimentos = fnmovimentos;
		this.fnitrenegrecs = fnitrenegrecs;
		this.fnlancas = fnlancas;
		this.vdcomissaos = vdcomissaos;
		this.fnitborderos = fnitborderos;
		this.fnsublancas = fnsublancas;
		this.fnfbnrec = fnfbnrec;
		this.atatendimentoitrecs = atatendimentoitrecs;
	}

	public FnitreceberId getId() {
		return this.id;
	}

	public void setId(FnitreceberId id) {
		this.id = id;
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

	public Fnsinal getFnsinal() {
		return this.fnsinal;
	}

	public void setFnsinal(Fnsinal fnsinal) {
		this.fnsinal = fnsinal;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Fnreceber getFnreceber() {
		return this.fnreceber;
	}

	public void setFnreceber(Fnreceber fnreceber) {
		this.fnreceber = fnreceber;
	}

	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	public BigDecimal getVlritrec() {
		return this.vlritrec;
	}

	public void setVlritrec(BigDecimal vlritrec) {
		this.vlritrec = vlritrec;
	}

	public BigDecimal getVlrdescitrec() {
		return this.vlrdescitrec;
	}

	public void setVlrdescitrec(BigDecimal vlrdescitrec) {
		this.vlrdescitrec = vlrdescitrec;
	}

	public BigDecimal getVlrmultaitrec() {
		return this.vlrmultaitrec;
	}

	public void setVlrmultaitrec(BigDecimal vlrmultaitrec) {
		this.vlrmultaitrec = vlrmultaitrec;
	}

	public BigDecimal getVlrjurositrec() {
		return this.vlrjurositrec;
	}

	public void setVlrjurositrec(BigDecimal vlrjurositrec) {
		this.vlrjurositrec = vlrjurositrec;
	}

	public BigDecimal getVlrdevitrec() {
		return this.vlrdevitrec;
	}

	public void setVlrdevitrec(BigDecimal vlrdevitrec) {
		this.vlrdevitrec = vlrdevitrec;
	}

	public BigDecimal getVlrparcitrec() {
		return this.vlrparcitrec;
	}

	public void setVlrparcitrec(BigDecimal vlrparcitrec) {
		this.vlrparcitrec = vlrparcitrec;
	}

	public BigDecimal getVlrpagoitrec() {
		return this.vlrpagoitrec;
	}

	public void setVlrpagoitrec(BigDecimal vlrpagoitrec) {
		this.vlrpagoitrec = vlrpagoitrec;
	}

	public BigDecimal getVlrapagitrec() {
		return this.vlrapagitrec;
	}

	public void setVlrapagitrec(BigDecimal vlrapagitrec) {
		this.vlrapagitrec = vlrapagitrec;
	}

	public BigDecimal getVlrcomiitrec() {
		return this.vlrcomiitrec;
	}

	public void setVlrcomiitrec(BigDecimal vlrcomiitrec) {
		this.vlrcomiitrec = vlrcomiitrec;
	}

	public BigDecimal getVlrcancitrec() {
		return this.vlrcancitrec;
	}

	public void setVlrcancitrec(BigDecimal vlrcancitrec) {
		this.vlrcancitrec = vlrcancitrec;
	}

	public BigDecimal getVlrbasecomis() {
		return this.vlrbasecomis;
	}

	public void setVlrbasecomis(BigDecimal vlrbasecomis) {
		this.vlrbasecomis = vlrbasecomis;
	}

	public char getDescpont() {
		return this.descpont;
	}

	public void setDescpont(char descpont) {
		this.descpont = descpont;
	}

	public Date getDtitrec() {
		return this.dtitrec;
	}

	public void setDtitrec(Date dtitrec) {
		this.dtitrec = dtitrec;
	}

	public Date getDtcompitrec() {
		return this.dtcompitrec;
	}

	public void setDtcompitrec(Date dtcompitrec) {
		this.dtcompitrec = dtcompitrec;
	}

	public Date getDtvencitrec() {
		return this.dtvencitrec;
	}

	public void setDtvencitrec(Date dtvencitrec) {
		this.dtvencitrec = dtvencitrec;
	}

	public Date getDtprevitrec() {
		return this.dtprevitrec;
	}

	public void setDtprevitrec(Date dtprevitrec) {
		this.dtprevitrec = dtprevitrec;
	}

	public Date getDtpagoitrec() {
		return this.dtpagoitrec;
	}

	public void setDtpagoitrec(Date dtpagoitrec) {
		this.dtpagoitrec = dtpagoitrec;
	}

	public Date getDtliqitrec() {
		return this.dtliqitrec;
	}

	public void setDtliqitrec(Date dtliqitrec) {
		this.dtliqitrec = dtliqitrec;
	}

	public String getStatusitrec() {
		return this.statusitrec;
	}

	public void setStatusitrec(String statusitrec) {
		this.statusitrec = statusitrec;
	}

	public String getObsitrec() {
		return this.obsitrec;
	}

	public void setObsitrec(String obsitrec) {
		this.obsitrec = obsitrec;
	}

	public String getDoclancaitrec() {
		return this.doclancaitrec;
	}

	public void setDoclancaitrec(String doclancaitrec) {
		this.doclancaitrec = doclancaitrec;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public Integer getCodempcc() {
		return this.codempcc;
	}

	public void setCodempcc(Integer codempcc) {
		this.codempcc = codempcc;
	}

	public Short getCodfilialcc() {
		return this.codfilialcc;
	}

	public void setCodfilialcc(Short codfilialcc) {
		this.codfilialcc = codfilialcc;
	}

	public Short getAnocc() {
		return this.anocc;
	}

	public void setAnocc(Short anocc) {
		this.anocc = anocc;
	}

	public String getCodcc() {
		return this.codcc;
	}

	public void setCodcc(String codcc) {
		this.codcc = codcc;
	}

	public char getImpreciboitrec() {
		return this.impreciboitrec;
	}

	public void setImpreciboitrec(char impreciboitrec) {
		this.impreciboitrec = impreciboitrec;
	}

	public Integer getReciboitrec() {
		return this.reciboitrec;
	}

	public void setReciboitrec(Integer reciboitrec) {
		this.reciboitrec = reciboitrec;
	}

	public char getAltusuitrec() {
		return this.altusuitrec;
	}

	public void setAltusuitrec(char altusuitrec) {
		this.altusuitrec = altusuitrec;
	}

	public char getPdvitrec() {
		return this.pdvitrec;
	}

	public void setPdvitrec(char pdvitrec) {
		this.pdvitrec = pdvitrec;
	}

	public char getRecemcob() {
		return this.recemcob;
	}

	public void setRecemcob(char recemcob) {
		this.recemcob = recemcob;
	}

	public Date getDtiniemcob() {
		return this.dtiniemcob;
	}

	public void setDtiniemcob(Date dtiniemcob) {
		this.dtiniemcob = dtiniemcob;
	}

	public Date getDtfimemcob() {
		return this.dtfimemcob;
	}

	public void setDtfimemcob(Date dtfimemcob) {
		this.dtfimemcob = dtfimemcob;
	}

	public Integer getSeqnossonumero() {
		return this.seqnossonumero;
	}

	public void setSeqnossonumero(Integer seqnossonumero) {
		this.seqnossonumero = seqnossonumero;
	}

	public String getNossonumero() {
		return this.nossonumero;
	}

	public void setNossonumero(String nossonumero) {
		this.nossonumero = nossonumero;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Character getMultibaixa() {
		return this.multibaixa;
	}

	public void setMultibaixa(Character multibaixa) {
		this.multibaixa = multibaixa;
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

	public Set getFnmovimentos() {
		return this.fnmovimentos;
	}

	public void setFnmovimentos(Set fnmovimentos) {
		this.fnmovimentos = fnmovimentos;
	}

	public Set getFnitrenegrecs() {
		return this.fnitrenegrecs;
	}

	public void setFnitrenegrecs(Set fnitrenegrecs) {
		this.fnitrenegrecs = fnitrenegrecs;
	}

	public Set getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set fnlancas) {
		this.fnlancas = fnlancas;
	}

	public Set getVdcomissaos() {
		return this.vdcomissaos;
	}

	public void setVdcomissaos(Set vdcomissaos) {
		this.vdcomissaos = vdcomissaos;
	}

	public Set getFnitborderos() {
		return this.fnitborderos;
	}

	public void setFnitborderos(Set fnitborderos) {
		this.fnitborderos = fnitborderos;
	}

	public Set getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	public Fnfbnrec getFnfbnrec() {
		return this.fnfbnrec;
	}

	public void setFnfbnrec(Fnfbnrec fnfbnrec) {
		this.fnfbnrec = fnfbnrec;
	}

	public Set getAtatendimentoitrecs() {
		return this.atatendimentoitrecs;
	}

	public void setAtatendimentoitrecs(Set atatendimentoitrecs) {
		this.atatendimentoitrecs = atatendimentoitrecs;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Lfitcompra generated by hbm2java
 */
public class Lfitcompra implements java.io.Serializable {

	private LfitcompraId id;
	private Cpitcompra cpitcompra;
	private BigDecimal aliqcofins;
	private Integer codempsp;
	private Short codfilialsp;
	private String codsittribpis;
	private String impsittribpis;
	private Integer codempsc;
	private Short codfilialsc;
	private String codsittribcof;
	private String impsittribcof;
	private Integer codempsi;
	private Short codfilialsi;
	private String codsittribipi;
	private String impsittribipi;
	private BigDecimal vlripiunidtrib;
	private Short modbcicms;
	private Short modbcicmsst;
	private BigDecimal aliqredbcicms;
	private BigDecimal aliqredbcicmsst;
	private BigDecimal aliqicmsst;
	private BigDecimal aliqpis;
	private BigDecimal vlrpisunidtrib;
	private BigDecimal vlrbasepis;
	private BigDecimal vlrbasecofins;
	private BigDecimal vlrcofunidtrib;
	private BigDecimal vlrir;
	private BigDecimal vlrpis;
	private BigDecimal vlrcofins;
	private BigDecimal vlrcsocial;
	private Character origfisc;
	private String codtrattrib;
	private BigDecimal margemvlagritcompra;
	private BigDecimal vlrbaseicmsstitcompra;
	private BigDecimal vlricmsstitcompra;
	private BigDecimal percissitcompra;
	private BigDecimal vlrbaseissitcompra;
	private BigDecimal vlrissitcompra;
	private BigDecimal percicmssimples;
	private char emmanut;
	private BigDecimal vlrbaseicmsstitretcompra;
	private BigDecimal vlricmsstretitcompra;
	private BigDecimal aliqii;
	private BigDecimal vlrbaseii;
	private BigDecimal vlrii;
	private BigDecimal vlricmsdiferido;
	private BigDecimal vlricmsdevido;
	private BigDecimal vlricmscredpresum;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lfitcompra() {
	}

	public Lfitcompra(Cpitcompra cpitcompra, char emmanut, Date dtins,
			Date hins, String idusuins) {
		this.cpitcompra = cpitcompra;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfitcompra(Cpitcompra cpitcompra, BigDecimal aliqcofins,
			Integer codempsp, Short codfilialsp, String codsittribpis,
			String impsittribpis, Integer codempsc, Short codfilialsc,
			String codsittribcof, String impsittribcof, Integer codempsi,
			Short codfilialsi, String codsittribipi, String impsittribipi,
			BigDecimal vlripiunidtrib, Short modbcicms, Short modbcicmsst,
			BigDecimal aliqredbcicms, BigDecimal aliqredbcicmsst,
			BigDecimal aliqicmsst, BigDecimal aliqpis,
			BigDecimal vlrpisunidtrib, BigDecimal vlrbasepis,
			BigDecimal vlrbasecofins, BigDecimal vlrcofunidtrib,
			BigDecimal vlrir, BigDecimal vlrpis, BigDecimal vlrcofins,
			BigDecimal vlrcsocial, Character origfisc, String codtrattrib,
			BigDecimal margemvlagritcompra, BigDecimal vlrbaseicmsstitcompra,
			BigDecimal vlricmsstitcompra, BigDecimal percissitcompra,
			BigDecimal vlrbaseissitcompra, BigDecimal vlrissitcompra,
			BigDecimal percicmssimples, char emmanut,
			BigDecimal vlrbaseicmsstitretcompra,
			BigDecimal vlricmsstretitcompra, BigDecimal aliqii,
			BigDecimal vlrbaseii, BigDecimal vlrii, BigDecimal vlricmsdiferido,
			BigDecimal vlricmsdevido, BigDecimal vlricmscredpresum, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.cpitcompra = cpitcompra;
		this.aliqcofins = aliqcofins;
		this.codempsp = codempsp;
		this.codfilialsp = codfilialsp;
		this.codsittribpis = codsittribpis;
		this.impsittribpis = impsittribpis;
		this.codempsc = codempsc;
		this.codfilialsc = codfilialsc;
		this.codsittribcof = codsittribcof;
		this.impsittribcof = impsittribcof;
		this.codempsi = codempsi;
		this.codfilialsi = codfilialsi;
		this.codsittribipi = codsittribipi;
		this.impsittribipi = impsittribipi;
		this.vlripiunidtrib = vlripiunidtrib;
		this.modbcicms = modbcicms;
		this.modbcicmsst = modbcicmsst;
		this.aliqredbcicms = aliqredbcicms;
		this.aliqredbcicmsst = aliqredbcicmsst;
		this.aliqicmsst = aliqicmsst;
		this.aliqpis = aliqpis;
		this.vlrpisunidtrib = vlrpisunidtrib;
		this.vlrbasepis = vlrbasepis;
		this.vlrbasecofins = vlrbasecofins;
		this.vlrcofunidtrib = vlrcofunidtrib;
		this.vlrir = vlrir;
		this.vlrpis = vlrpis;
		this.vlrcofins = vlrcofins;
		this.vlrcsocial = vlrcsocial;
		this.origfisc = origfisc;
		this.codtrattrib = codtrattrib;
		this.margemvlagritcompra = margemvlagritcompra;
		this.vlrbaseicmsstitcompra = vlrbaseicmsstitcompra;
		this.vlricmsstitcompra = vlricmsstitcompra;
		this.percissitcompra = percissitcompra;
		this.vlrbaseissitcompra = vlrbaseissitcompra;
		this.vlrissitcompra = vlrissitcompra;
		this.percicmssimples = percicmssimples;
		this.emmanut = emmanut;
		this.vlrbaseicmsstitretcompra = vlrbaseicmsstitretcompra;
		this.vlricmsstretitcompra = vlricmsstretitcompra;
		this.aliqii = aliqii;
		this.vlrbaseii = vlrbaseii;
		this.vlrii = vlrii;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public LfitcompraId getId() {
		return this.id;
	}

	public void setId(LfitcompraId id) {
		this.id = id;
	}

	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
	}

	public BigDecimal getAliqcofins() {
		return this.aliqcofins;
	}

	public void setAliqcofins(BigDecimal aliqcofins) {
		this.aliqcofins = aliqcofins;
	}

	public Integer getCodempsp() {
		return this.codempsp;
	}

	public void setCodempsp(Integer codempsp) {
		this.codempsp = codempsp;
	}

	public Short getCodfilialsp() {
		return this.codfilialsp;
	}

	public void setCodfilialsp(Short codfilialsp) {
		this.codfilialsp = codfilialsp;
	}

	public String getCodsittribpis() {
		return this.codsittribpis;
	}

	public void setCodsittribpis(String codsittribpis) {
		this.codsittribpis = codsittribpis;
	}

	public String getImpsittribpis() {
		return this.impsittribpis;
	}

	public void setImpsittribpis(String impsittribpis) {
		this.impsittribpis = impsittribpis;
	}

	public Integer getCodempsc() {
		return this.codempsc;
	}

	public void setCodempsc(Integer codempsc) {
		this.codempsc = codempsc;
	}

	public Short getCodfilialsc() {
		return this.codfilialsc;
	}

	public void setCodfilialsc(Short codfilialsc) {
		this.codfilialsc = codfilialsc;
	}

	public String getCodsittribcof() {
		return this.codsittribcof;
	}

	public void setCodsittribcof(String codsittribcof) {
		this.codsittribcof = codsittribcof;
	}

	public String getImpsittribcof() {
		return this.impsittribcof;
	}

	public void setImpsittribcof(String impsittribcof) {
		this.impsittribcof = impsittribcof;
	}

	public Integer getCodempsi() {
		return this.codempsi;
	}

	public void setCodempsi(Integer codempsi) {
		this.codempsi = codempsi;
	}

	public Short getCodfilialsi() {
		return this.codfilialsi;
	}

	public void setCodfilialsi(Short codfilialsi) {
		this.codfilialsi = codfilialsi;
	}

	public String getCodsittribipi() {
		return this.codsittribipi;
	}

	public void setCodsittribipi(String codsittribipi) {
		this.codsittribipi = codsittribipi;
	}

	public String getImpsittribipi() {
		return this.impsittribipi;
	}

	public void setImpsittribipi(String impsittribipi) {
		this.impsittribipi = impsittribipi;
	}

	public BigDecimal getVlripiunidtrib() {
		return this.vlripiunidtrib;
	}

	public void setVlripiunidtrib(BigDecimal vlripiunidtrib) {
		this.vlripiunidtrib = vlripiunidtrib;
	}

	public Short getModbcicms() {
		return this.modbcicms;
	}

	public void setModbcicms(Short modbcicms) {
		this.modbcicms = modbcicms;
	}

	public Short getModbcicmsst() {
		return this.modbcicmsst;
	}

	public void setModbcicmsst(Short modbcicmsst) {
		this.modbcicmsst = modbcicmsst;
	}

	public BigDecimal getAliqredbcicms() {
		return this.aliqredbcicms;
	}

	public void setAliqredbcicms(BigDecimal aliqredbcicms) {
		this.aliqredbcicms = aliqredbcicms;
	}

	public BigDecimal getAliqredbcicmsst() {
		return this.aliqredbcicmsst;
	}

	public void setAliqredbcicmsst(BigDecimal aliqredbcicmsst) {
		this.aliqredbcicmsst = aliqredbcicmsst;
	}

	public BigDecimal getAliqicmsst() {
		return this.aliqicmsst;
	}

	public void setAliqicmsst(BigDecimal aliqicmsst) {
		this.aliqicmsst = aliqicmsst;
	}

	public BigDecimal getAliqpis() {
		return this.aliqpis;
	}

	public void setAliqpis(BigDecimal aliqpis) {
		this.aliqpis = aliqpis;
	}

	public BigDecimal getVlrpisunidtrib() {
		return this.vlrpisunidtrib;
	}

	public void setVlrpisunidtrib(BigDecimal vlrpisunidtrib) {
		this.vlrpisunidtrib = vlrpisunidtrib;
	}

	public BigDecimal getVlrbasepis() {
		return this.vlrbasepis;
	}

	public void setVlrbasepis(BigDecimal vlrbasepis) {
		this.vlrbasepis = vlrbasepis;
	}

	public BigDecimal getVlrbasecofins() {
		return this.vlrbasecofins;
	}

	public void setVlrbasecofins(BigDecimal vlrbasecofins) {
		this.vlrbasecofins = vlrbasecofins;
	}

	public BigDecimal getVlrcofunidtrib() {
		return this.vlrcofunidtrib;
	}

	public void setVlrcofunidtrib(BigDecimal vlrcofunidtrib) {
		this.vlrcofunidtrib = vlrcofunidtrib;
	}

	public BigDecimal getVlrir() {
		return this.vlrir;
	}

	public void setVlrir(BigDecimal vlrir) {
		this.vlrir = vlrir;
	}

	public BigDecimal getVlrpis() {
		return this.vlrpis;
	}

	public void setVlrpis(BigDecimal vlrpis) {
		this.vlrpis = vlrpis;
	}

	public BigDecimal getVlrcofins() {
		return this.vlrcofins;
	}

	public void setVlrcofins(BigDecimal vlrcofins) {
		this.vlrcofins = vlrcofins;
	}

	public BigDecimal getVlrcsocial() {
		return this.vlrcsocial;
	}

	public void setVlrcsocial(BigDecimal vlrcsocial) {
		this.vlrcsocial = vlrcsocial;
	}

	public Character getOrigfisc() {
		return this.origfisc;
	}

	public void setOrigfisc(Character origfisc) {
		this.origfisc = origfisc;
	}

	public String getCodtrattrib() {
		return this.codtrattrib;
	}

	public void setCodtrattrib(String codtrattrib) {
		this.codtrattrib = codtrattrib;
	}

	public BigDecimal getMargemvlagritcompra() {
		return this.margemvlagritcompra;
	}

	public void setMargemvlagritcompra(BigDecimal margemvlagritcompra) {
		this.margemvlagritcompra = margemvlagritcompra;
	}

	public BigDecimal getVlrbaseicmsstitcompra() {
		return this.vlrbaseicmsstitcompra;
	}

	public void setVlrbaseicmsstitcompra(BigDecimal vlrbaseicmsstitcompra) {
		this.vlrbaseicmsstitcompra = vlrbaseicmsstitcompra;
	}

	public BigDecimal getVlricmsstitcompra() {
		return this.vlricmsstitcompra;
	}

	public void setVlricmsstitcompra(BigDecimal vlricmsstitcompra) {
		this.vlricmsstitcompra = vlricmsstitcompra;
	}

	public BigDecimal getPercissitcompra() {
		return this.percissitcompra;
	}

	public void setPercissitcompra(BigDecimal percissitcompra) {
		this.percissitcompra = percissitcompra;
	}

	public BigDecimal getVlrbaseissitcompra() {
		return this.vlrbaseissitcompra;
	}

	public void setVlrbaseissitcompra(BigDecimal vlrbaseissitcompra) {
		this.vlrbaseissitcompra = vlrbaseissitcompra;
	}

	public BigDecimal getVlrissitcompra() {
		return this.vlrissitcompra;
	}

	public void setVlrissitcompra(BigDecimal vlrissitcompra) {
		this.vlrissitcompra = vlrissitcompra;
	}

	public BigDecimal getPercicmssimples() {
		return this.percicmssimples;
	}

	public void setPercicmssimples(BigDecimal percicmssimples) {
		this.percicmssimples = percicmssimples;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public BigDecimal getVlrbaseicmsstitretcompra() {
		return this.vlrbaseicmsstitretcompra;
	}

	public void setVlrbaseicmsstitretcompra(BigDecimal vlrbaseicmsstitretcompra) {
		this.vlrbaseicmsstitretcompra = vlrbaseicmsstitretcompra;
	}

	public BigDecimal getVlricmsstretitcompra() {
		return this.vlricmsstretitcompra;
	}

	public void setVlricmsstretitcompra(BigDecimal vlricmsstretitcompra) {
		this.vlricmsstretitcompra = vlricmsstretitcompra;
	}

	public BigDecimal getAliqii() {
		return this.aliqii;
	}

	public void setAliqii(BigDecimal aliqii) {
		this.aliqii = aliqii;
	}

	public BigDecimal getVlrbaseii() {
		return this.vlrbaseii;
	}

	public void setVlrbaseii(BigDecimal vlrbaseii) {
		this.vlrbaseii = vlrbaseii;
	}

	public BigDecimal getVlrii() {
		return this.vlrii;
	}

	public void setVlrii(BigDecimal vlrii) {
		this.vlrii = vlrii;
	}

	public BigDecimal getVlricmsdiferido() {
		return this.vlricmsdiferido;
	}

	public void setVlricmsdiferido(BigDecimal vlricmsdiferido) {
		this.vlricmsdiferido = vlricmsdiferido;
	}

	public BigDecimal getVlricmsdevido() {
		return this.vlricmsdevido;
	}

	public void setVlricmsdevido(BigDecimal vlricmsdevido) {
		this.vlricmsdevido = vlricmsdevido;
	}

	public BigDecimal getVlricmscredpresum() {
		return this.vlricmscredpresum;
	}

	public void setVlricmscredpresum(BigDecimal vlricmscredpresum) {
		this.vlricmscredpresum = vlricmscredpresum;
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

}

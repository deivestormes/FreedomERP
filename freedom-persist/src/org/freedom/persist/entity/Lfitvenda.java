package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Lfitvenda generated by hbm2java
 */
public class Lfitvenda implements java.io.Serializable {

	private LfitvendaId id;
	private Lfsittrib lfsittribByLfitvendafklfsittribpis;
	private Lfsittrib lfsittribByLfitvendafklfsittribcof;
	private Vditvenda vditvenda;
	private Lfsittrib lfsittribByLfitvendafklfsittribipi;
	private BigDecimal aliqcofins;
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
	private BigDecimal vlrbaseicmsitvenda;
	private BigDecimal vlrbaseicmsfreteitvenda;
	private BigDecimal vlricmsfreteitvenda;
	private BigDecimal vlrbasencm;
	private BigDecimal aliqnacncm;
	private BigDecimal aliqimpncm;
	private BigDecimal vlrnacncm;
	private BigDecimal vlrimpncm;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lfitvenda() {
	}

	public Lfitvenda(Vditvenda vditvenda, BigDecimal vlrbasencm,
			BigDecimal aliqnacncm, BigDecimal aliqimpncm, BigDecimal vlrnacncm,
			BigDecimal vlrimpncm, char emmanut, Date dtins, Date hins,
			String idusuins) {
		this.vditvenda = vditvenda;
		this.vlrbasencm = vlrbasencm;
		this.aliqnacncm = aliqnacncm;
		this.aliqimpncm = aliqimpncm;
		this.vlrnacncm = vlrnacncm;
		this.vlrimpncm = vlrimpncm;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfitvenda(Lfsittrib lfsittribByLfitvendafklfsittribpis,
			Lfsittrib lfsittribByLfitvendafklfsittribcof, Vditvenda vditvenda,
			Lfsittrib lfsittribByLfitvendafklfsittribipi,
			BigDecimal aliqcofins, BigDecimal vlripiunidtrib, Short modbcicms,
			Short modbcicmsst, BigDecimal aliqredbcicms,
			BigDecimal aliqredbcicmsst, BigDecimal aliqicmsst,
			BigDecimal aliqpis, BigDecimal vlrpisunidtrib,
			BigDecimal vlrbasepis, BigDecimal vlrbasecofins,
			BigDecimal vlrcofunidtrib, BigDecimal vlrir, BigDecimal vlrpis,
			BigDecimal vlrcofins, BigDecimal vlrcsocial,
			BigDecimal vlrbaseicmsitvenda, BigDecimal vlrbaseicmsfreteitvenda,
			BigDecimal vlricmsfreteitvenda, BigDecimal vlrbasencm,
			BigDecimal aliqnacncm, BigDecimal aliqimpncm, BigDecimal vlrnacncm,
			BigDecimal vlrimpncm, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.lfsittribByLfitvendafklfsittribpis = lfsittribByLfitvendafklfsittribpis;
		this.lfsittribByLfitvendafklfsittribcof = lfsittribByLfitvendafklfsittribcof;
		this.vditvenda = vditvenda;
		this.lfsittribByLfitvendafklfsittribipi = lfsittribByLfitvendafklfsittribipi;
		this.aliqcofins = aliqcofins;
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
		this.vlrbaseicmsitvenda = vlrbaseicmsitvenda;
		this.vlrbaseicmsfreteitvenda = vlrbaseicmsfreteitvenda;
		this.vlricmsfreteitvenda = vlricmsfreteitvenda;
		this.vlrbasencm = vlrbasencm;
		this.aliqnacncm = aliqnacncm;
		this.aliqimpncm = aliqimpncm;
		this.vlrnacncm = vlrnacncm;
		this.vlrimpncm = vlrimpncm;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public LfitvendaId getId() {
		return this.id;
	}

	public void setId(LfitvendaId id) {
		this.id = id;
	}

	public Lfsittrib getLfsittribByLfitvendafklfsittribpis() {
		return this.lfsittribByLfitvendafklfsittribpis;
	}

	public void setLfsittribByLfitvendafklfsittribpis(
			Lfsittrib lfsittribByLfitvendafklfsittribpis) {
		this.lfsittribByLfitvendafklfsittribpis = lfsittribByLfitvendafklfsittribpis;
	}

	public Lfsittrib getLfsittribByLfitvendafklfsittribcof() {
		return this.lfsittribByLfitvendafklfsittribcof;
	}

	public void setLfsittribByLfitvendafklfsittribcof(
			Lfsittrib lfsittribByLfitvendafklfsittribcof) {
		this.lfsittribByLfitvendafklfsittribcof = lfsittribByLfitvendafklfsittribcof;
	}

	public Vditvenda getVditvenda() {
		return this.vditvenda;
	}

	public void setVditvenda(Vditvenda vditvenda) {
		this.vditvenda = vditvenda;
	}

	public Lfsittrib getLfsittribByLfitvendafklfsittribipi() {
		return this.lfsittribByLfitvendafklfsittribipi;
	}

	public void setLfsittribByLfitvendafklfsittribipi(
			Lfsittrib lfsittribByLfitvendafklfsittribipi) {
		this.lfsittribByLfitvendafklfsittribipi = lfsittribByLfitvendafklfsittribipi;
	}

	public BigDecimal getAliqcofins() {
		return this.aliqcofins;
	}

	public void setAliqcofins(BigDecimal aliqcofins) {
		this.aliqcofins = aliqcofins;
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

	public BigDecimal getVlrbaseicmsitvenda() {
		return this.vlrbaseicmsitvenda;
	}

	public void setVlrbaseicmsitvenda(BigDecimal vlrbaseicmsitvenda) {
		this.vlrbaseicmsitvenda = vlrbaseicmsitvenda;
	}

	public BigDecimal getVlrbaseicmsfreteitvenda() {
		return this.vlrbaseicmsfreteitvenda;
	}

	public void setVlrbaseicmsfreteitvenda(BigDecimal vlrbaseicmsfreteitvenda) {
		this.vlrbaseicmsfreteitvenda = vlrbaseicmsfreteitvenda;
	}

	public BigDecimal getVlricmsfreteitvenda() {
		return this.vlricmsfreteitvenda;
	}

	public void setVlricmsfreteitvenda(BigDecimal vlricmsfreteitvenda) {
		this.vlricmsfreteitvenda = vlricmsfreteitvenda;
	}

	public BigDecimal getVlrbasencm() {
		return this.vlrbasencm;
	}

	public void setVlrbasencm(BigDecimal vlrbasencm) {
		this.vlrbasencm = vlrbasencm;
	}

	public BigDecimal getAliqnacncm() {
		return this.aliqnacncm;
	}

	public void setAliqnacncm(BigDecimal aliqnacncm) {
		this.aliqnacncm = aliqnacncm;
	}

	public BigDecimal getAliqimpncm() {
		return this.aliqimpncm;
	}

	public void setAliqimpncm(BigDecimal aliqimpncm) {
		this.aliqimpncm = aliqimpncm;
	}

	public BigDecimal getVlrnacncm() {
		return this.vlrnacncm;
	}

	public void setVlrnacncm(BigDecimal vlrnacncm) {
		this.vlrnacncm = vlrnacncm;
	}

	public BigDecimal getVlrimpncm() {
		return this.vlrimpncm;
	}

	public void setVlrimpncm(BigDecimal vlrimpncm) {
		this.vlrimpncm = vlrimpncm;
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

}

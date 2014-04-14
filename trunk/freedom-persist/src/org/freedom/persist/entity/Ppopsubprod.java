package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Ppopsubprod generated by hbm2java
 */
public class Ppopsubprod implements java.io.Serializable {

	private PpopsubprodId id;
	private Eqproduto eqproduto;
	private Ppfase ppfase;
	private Eqtipomov eqtipomov;
	private Eqlote eqlote;
	private Ppop ppop;
	private String refprod;
	private BigDecimal qtditsp;
	private short seqof;
	private Date dtsubprod;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppopsubprod() {
	}

	public Ppopsubprod(PpopsubprodId id, Eqproduto eqproduto, Ppfase ppfase,
			Eqtipomov eqtipomov, Eqlote eqlote, Ppop ppop, String refprod,
			BigDecimal qtditsp, short seqof, char emmanut, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.ppfase = ppfase;
		this.eqtipomov = eqtipomov;
		this.eqlote = eqlote;
		this.ppop = ppop;
		this.refprod = refprod;
		this.qtditsp = qtditsp;
		this.seqof = seqof;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppopsubprod(PpopsubprodId id, Eqproduto eqproduto, Ppfase ppfase,
			Eqtipomov eqtipomov, Eqlote eqlote, Ppop ppop, String refprod,
			BigDecimal qtditsp, short seqof, Date dtsubprod, char emmanut,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.ppfase = ppfase;
		this.eqtipomov = eqtipomov;
		this.eqlote = eqlote;
		this.ppop = ppop;
		this.refprod = refprod;
		this.qtditsp = qtditsp;
		this.seqof = seqof;
		this.dtsubprod = dtsubprod;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PpopsubprodId getId() {
		return this.id;
	}

	public void setId(PpopsubprodId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Ppfase getPpfase() {
		return this.ppfase;
	}

	public void setPpfase(Ppfase ppfase) {
		this.ppfase = ppfase;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Eqlote getEqlote() {
		return this.eqlote;
	}

	public void setEqlote(Eqlote eqlote) {
		this.eqlote = eqlote;
	}

	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public BigDecimal getQtditsp() {
		return this.qtditsp;
	}

	public void setQtditsp(BigDecimal qtditsp) {
		this.qtditsp = qtditsp;
	}

	public short getSeqof() {
		return this.seqof;
	}

	public void setSeqof(short seqof) {
		this.seqof = seqof;
	}

	public Date getDtsubprod() {
		return this.dtsubprod;
	}

	public void setDtsubprod(Date dtsubprod) {
		this.dtsubprod = dtsubprod;
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

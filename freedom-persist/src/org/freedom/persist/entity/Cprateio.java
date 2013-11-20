package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cprateio generated by hbm2java
 */
public class Cprateio implements java.io.Serializable {

	private CprateioId id;
	private Cpcompra cpcompra;
	private Fnplanejamento fnplanejamento;
	private Fncc fncc;
	private BigDecimal percrateio;
	private BigDecimal vlrrateio;
	private char sitrateio;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cprateio() {
	}

	public Cprateio(CprateioId id, Cpcompra cpcompra,
			Fnplanejamento fnplanejamento, Fncc fncc, BigDecimal percrateio,
			BigDecimal vlrrateio, char sitrateio, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.fnplanejamento = fnplanejamento;
		this.fncc = fncc;
		this.percrateio = percrateio;
		this.vlrrateio = vlrrateio;
		this.sitrateio = sitrateio;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cprateio(CprateioId id, Cpcompra cpcompra,
			Fnplanejamento fnplanejamento, Fncc fncc, BigDecimal percrateio,
			BigDecimal vlrrateio, char sitrateio, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.fnplanejamento = fnplanejamento;
		this.fncc = fncc;
		this.percrateio = percrateio;
		this.vlrrateio = vlrrateio;
		this.sitrateio = sitrateio;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CprateioId getId() {
		return this.id;
	}

	public void setId(CprateioId id) {
		this.id = id;
	}

	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public BigDecimal getPercrateio() {
		return this.percrateio;
	}

	public void setPercrateio(BigDecimal percrateio) {
		this.percrateio = percrateio;
	}

	public BigDecimal getVlrrateio() {
		return this.vlrrateio;
	}

	public void setVlrrateio(BigDecimal vlrrateio) {
		this.vlrrateio = vlrrateio;
	}

	public char getSitrateio() {
		return this.sitrateio;
	}

	public void setSitrateio(char sitrateio) {
		this.sitrateio = sitrateio;
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

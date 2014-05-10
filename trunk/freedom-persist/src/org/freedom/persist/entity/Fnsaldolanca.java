package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Fnsaldolanca generated by hbm2java
 */
public class Fnsaldolanca implements java.io.Serializable {

	private FnsaldolancaId id;
	private Sgfilial sgfilial;
	private Fnplanejamento fnplanejamento;
	private BigDecimal prevsl;
	private BigDecimal saldosl;
	private Character fechado;
	private Character emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnsaldolanca() {
	}

	public Fnsaldolanca(FnsaldolancaId id, Sgfilial sgfilial,
			Fnplanejamento fnplanejamento, BigDecimal saldosl, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnplanejamento = fnplanejamento;
		this.saldosl = saldosl;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnsaldolanca(FnsaldolancaId id, Sgfilial sgfilial,
			Fnplanejamento fnplanejamento, BigDecimal prevsl,
			BigDecimal saldosl, Character fechado, Character emmanut,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnplanejamento = fnplanejamento;
		this.prevsl = prevsl;
		this.saldosl = saldosl;
		this.fechado = fechado;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnsaldolancaId getId() {
		return this.id;
	}

	public void setId(FnsaldolancaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public BigDecimal getPrevsl() {
		return this.prevsl;
	}

	public void setPrevsl(BigDecimal prevsl) {
		this.prevsl = prevsl;
	}

	public BigDecimal getSaldosl() {
		return this.saldosl;
	}

	public void setSaldosl(BigDecimal saldosl) {
		this.saldosl = saldosl;
	}

	public Character getFechado() {
		return this.fechado;
	}

	public void setFechado(Character fechado) {
		this.fechado = fechado;
	}

	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
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

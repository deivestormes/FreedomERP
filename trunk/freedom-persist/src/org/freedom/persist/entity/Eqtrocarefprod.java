package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqtrocarefprod generated by hbm2java
 */
public class Eqtrocarefprod implements java.io.Serializable {

	private long id;
	private Sgfilial sgfilial;
	private String motivo;
	private Date dttroca;
	private String situacao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqittrocarefprods = new HashSet(0);

	public Eqtrocarefprod() {
	}

	public Eqtrocarefprod(long id, Sgfilial sgfilial, Date dttroca,
			String situacao, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.dttroca = dttroca;
		this.situacao = situacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Eqtrocarefprod(long id, Sgfilial sgfilial, String motivo,
			Date dttroca, String situacao, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqittrocarefprods) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.motivo = motivo;
		this.dttroca = dttroca;
		this.situacao = situacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqittrocarefprods = eqittrocarefprods;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Date getDttroca() {
		return this.dttroca;
	}

	public void setDttroca(Date dttroca) {
		this.dttroca = dttroca;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
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

	public Set getEqittrocarefprods() {
		return this.eqittrocarefprods;
	}

	public void setEqittrocarefprods(Set eqittrocarefprods) {
		this.eqittrocarefprods = eqittrocarefprods;
	}

}

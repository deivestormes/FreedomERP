package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqguiatraf generated by hbm2java
 */
public class Eqguiatraf implements java.io.Serializable {

	private EqguiatrafId id;
	private Cpcompra cpcompra;
	private Date dtemisguiatraf;
	private String nroguiatraf;
	private String nroseloguiatraf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqguiatraf() {
	}

	public Eqguiatraf(EqguiatrafId id, Cpcompra cpcompra, Date dtemisguiatraf,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.dtemisguiatraf = dtemisguiatraf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqguiatraf(EqguiatrafId id, Cpcompra cpcompra, Date dtemisguiatraf,
			String nroguiatraf, String nroseloguiatraf, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.dtemisguiatraf = dtemisguiatraf;
		this.nroguiatraf = nroguiatraf;
		this.nroseloguiatraf = nroseloguiatraf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqguiatrafId getId() {
		return this.id;
	}

	public void setId(EqguiatrafId id) {
		this.id = id;
	}

	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	public Date getDtemisguiatraf() {
		return this.dtemisguiatraf;
	}

	public void setDtemisguiatraf(Date dtemisguiatraf) {
		this.dtemisguiatraf = dtemisguiatraf;
	}

	public String getNroguiatraf() {
		return this.nroguiatraf;
	}

	public void setNroguiatraf(String nroguiatraf) {
		this.nroguiatraf = nroguiatraf;
	}

	public String getNroseloguiatraf() {
		return this.nroseloguiatraf;
	}

	public void setNroseloguiatraf(String nroseloguiatraf) {
		this.nroseloguiatraf = nroseloguiatraf;
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

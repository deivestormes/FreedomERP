package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqitrecmercitcp generated by hbm2java
 */
public class Eqitrecmercitcp implements java.io.Serializable {

	private EqitrecmercitcpId id;
	private Eqitrecmerc eqitrecmerc;
	private Cpitcompra cpitcompra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqitrecmercitcp() {
	}

	public Eqitrecmercitcp(EqitrecmercitcpId id, Eqitrecmerc eqitrecmerc,
			Cpitcompra cpitcompra, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqitrecmerc = eqitrecmerc;
		this.cpitcompra = cpitcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrecmercitcp(EqitrecmercitcpId id, Eqitrecmerc eqitrecmerc,
			Cpitcompra cpitcompra, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqitrecmerc = eqitrecmerc;
		this.cpitcompra = cpitcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqitrecmercitcpId getId() {
		return this.id;
	}

	public void setId(EqitrecmercitcpId id) {
		this.id = id;
	}

	public Eqitrecmerc getEqitrecmerc() {
		return this.eqitrecmerc;
	}

	public void setEqitrecmerc(Eqitrecmerc eqitrecmerc) {
		this.eqitrecmerc = eqitrecmerc;
	}

	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
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

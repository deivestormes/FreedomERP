package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgitfluxo generated by hbm2java
 */
public class Sgitfluxo implements java.io.Serializable {

	private SgitfluxoId id;
	private Sgfluxo sgfluxo;
	private Sgprocesso sgprocesso;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgitfluxo() {
	}

	public Sgitfluxo(SgitfluxoId id, Sgfluxo sgfluxo, Sgprocesso sgprocesso,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfluxo = sgfluxo;
		this.sgprocesso = sgprocesso;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgitfluxo(SgitfluxoId id, Sgfluxo sgfluxo, Sgprocesso sgprocesso,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.sgfluxo = sgfluxo;
		this.sgprocesso = sgprocesso;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SgitfluxoId getId() {
		return this.id;
	}

	public void setId(SgitfluxoId id) {
		this.id = id;
	}

	public Sgfluxo getSgfluxo() {
		return this.sgfluxo;
	}

	public void setSgfluxo(Sgfluxo sgfluxo) {
		this.sgfluxo = sgfluxo;
	}

	public Sgprocesso getSgprocesso() {
		return this.sgprocesso;
	}

	public void setSgprocesso(Sgprocesso sgprocesso) {
		this.sgprocesso = sgprocesso;
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

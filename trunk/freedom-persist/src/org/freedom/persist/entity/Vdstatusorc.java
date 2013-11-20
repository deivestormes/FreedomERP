package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Vdstatusorc generated by hbm2java
 */
public class Vdstatusorc implements java.io.Serializable {

	private VdstatusorcId id;
	private Sgittabela sgittabela;
	private Vdorcamento vdorcamento;
	private Date dtastorc;
	private Date horastorc;
	private String motivostorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdstatusorc() {
	}

	public Vdstatusorc(VdstatusorcId id, Sgittabela sgittabela,
			Vdorcamento vdorcamento, Date dtastorc, Date horastorc, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.vdorcamento = vdorcamento;
		this.dtastorc = dtastorc;
		this.horastorc = horastorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdstatusorc(VdstatusorcId id, Sgittabela sgittabela,
			Vdorcamento vdorcamento, Date dtastorc, Date horastorc,
			String motivostorc, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.vdorcamento = vdorcamento;
		this.dtastorc = dtastorc;
		this.horastorc = horastorc;
		this.motivostorc = motivostorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdstatusorcId getId() {
		return this.id;
	}

	public void setId(VdstatusorcId id) {
		this.id = id;
	}

	public Sgittabela getSgittabela() {
		return this.sgittabela;
	}

	public void setSgittabela(Sgittabela sgittabela) {
		this.sgittabela = sgittabela;
	}

	public Vdorcamento getVdorcamento() {
		return this.vdorcamento;
	}

	public void setVdorcamento(Vdorcamento vdorcamento) {
		this.vdorcamento = vdorcamento;
	}

	public Date getDtastorc() {
		return this.dtastorc;
	}

	public void setDtastorc(Date dtastorc) {
		this.dtastorc = dtastorc;
	}

	public Date getHorastorc() {
		return this.horastorc;
	}

	public void setHorastorc(Date horastorc) {
		this.horastorc = horastorc;
	}

	public String getMotivostorc() {
		return this.motivostorc;
	}

	public void setMotivostorc(String motivostorc) {
		this.motivostorc = motivostorc;
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

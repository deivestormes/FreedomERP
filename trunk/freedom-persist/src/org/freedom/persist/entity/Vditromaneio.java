package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Vditromaneio generated by hbm2java
 */
public class Vditromaneio implements java.io.Serializable {

	private VditromaneioId id;
	private Vdromaneio vdromaneio;
	private Vdvenda vdvenda;
	private Date dtprevitroma;
	private Character flag;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditromaneio() {
	}

	public Vditromaneio(VditromaneioId id, Vdromaneio vdromaneio,
			Vdvenda vdvenda, Date dtprevitroma, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.vdromaneio = vdromaneio;
		this.vdvenda = vdvenda;
		this.dtprevitroma = dtprevitroma;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditromaneio(VditromaneioId id, Vdromaneio vdromaneio,
			Vdvenda vdvenda, Date dtprevitroma, Character flag, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdromaneio = vdromaneio;
		this.vdvenda = vdvenda;
		this.dtprevitroma = dtprevitroma;
		this.flag = flag;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VditromaneioId getId() {
		return this.id;
	}

	public void setId(VditromaneioId id) {
		this.id = id;
	}

	public Vdromaneio getVdromaneio() {
		return this.vdromaneio;
	}

	public void setVdromaneio(Vdromaneio vdromaneio) {
		this.vdromaneio = vdromaneio;
	}

	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	public Date getDtprevitroma() {
		return this.dtprevitroma;
	}

	public void setDtprevitroma(Date dtprevitroma) {
		this.dtprevitroma = dtprevitroma;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
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

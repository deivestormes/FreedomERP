package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Atconvatribtb generated by hbm2java
 */
public class Atconvatribtb implements java.io.Serializable {

	private AtconvatribtbId id;
	private Sgittabela sgittabela;
	private Atconvatrib atconvatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Atconvatribtb() {
	}

	public Atconvatribtb(AtconvatribtbId id, Sgittabela sgittabela,
			Atconvatrib atconvatrib, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.atconvatrib = atconvatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atconvatribtb(AtconvatribtbId id, Sgittabela sgittabela,
			Atconvatrib atconvatrib, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.atconvatrib = atconvatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public AtconvatribtbId getId() {
		return this.id;
	}

	public void setId(AtconvatribtbId id) {
		this.id = id;
	}

	public Sgittabela getSgittabela() {
		return this.sgittabela;
	}

	public void setSgittabela(Sgittabela sgittabela) {
		this.sgittabela = sgittabela;
	}

	public Atconvatrib getAtconvatrib() {
		return this.atconvatrib;
	}

	public void setAtconvatrib(Atconvatrib atconvatrib) {
		this.atconvatrib = atconvatrib;
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

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgferiado generated by hbm2java
 */
public class Sgferiado implements java.io.Serializable {

	private SgferiadoId id;
	private String descfer;
	private char bancfer;
	private char trabfer;
	private char optfer;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgferiado() {
	}

	public Sgferiado(SgferiadoId id, String descfer, char bancfer,
			char trabfer, char optfer, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descfer = descfer;
		this.bancfer = bancfer;
		this.trabfer = trabfer;
		this.optfer = optfer;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SgferiadoId getId() {
		return this.id;
	}

	public void setId(SgferiadoId id) {
		this.id = id;
	}

	public String getDescfer() {
		return this.descfer;
	}

	public void setDescfer(String descfer) {
		this.descfer = descfer;
	}

	public char getBancfer() {
		return this.bancfer;
	}

	public void setBancfer(char bancfer) {
		this.bancfer = bancfer;
	}

	public char getTrabfer() {
		return this.trabfer;
	}

	public void setTrabfer(char trabfer) {
		this.trabfer = trabfer;
	}

	public char getOptfer() {
		return this.optfer;
	}

	public void setOptfer(char optfer) {
		this.optfer = optfer;
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

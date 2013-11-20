package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgsistema generated by hbm2java
 */
public class Sgsistema implements java.io.Serializable {

	private int codsis;
	private String descsis;
	private String comentsis;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgsistema() {
	}

	public Sgsistema(int codsis, String descsis, Date dtins, Date hins,
			String idusuins) {
		this.codsis = codsis;
		this.descsis = descsis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgsistema(int codsis, String descsis, String comentsis, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codsis = codsis;
		this.descsis = descsis;
		this.comentsis = comentsis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public int getCodsis() {
		return this.codsis;
	}

	public void setCodsis(int codsis) {
		this.codsis = codsis;
	}

	public String getDescsis() {
		return this.descsis;
	}

	public void setDescsis(String descsis) {
		this.descsis = descsis;
	}

	public String getComentsis() {
		return this.comentsis;
	}

	public void setComentsis(String comentsis) {
		this.comentsis = comentsis;
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

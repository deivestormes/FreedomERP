package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rhdepto generated by hbm2java
 */
public class Rhdepto implements java.io.Serializable {

	private RhdeptoId id;
	private String descdep;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set rhempregados = new HashSet(0);

	public Rhdepto() {
	}

	public Rhdepto(RhdeptoId id, String descdep, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descdep = descdep;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhdepto(RhdeptoId id, String descdep, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set rhempregados) {
		this.id = id;
		this.descdep = descdep;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhempregados = rhempregados;
	}

	public RhdeptoId getId() {
		return this.id;
	}

	public void setId(RhdeptoId id) {
		this.id = id;
	}

	public String getDescdep() {
		return this.descdep;
	}

	public void setDescdep(String descdep) {
		this.descdep = descdep;
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

	public Set getRhempregados() {
		return this.rhempregados;
	}

	public void setRhempregados(Set rhempregados) {
		this.rhempregados = rhempregados;
	}

}

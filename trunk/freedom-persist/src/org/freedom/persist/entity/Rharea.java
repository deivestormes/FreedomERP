package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rharea generated by hbm2java
 */
public class Rharea implements java.io.Serializable {

	private RhareaId id;
	private Sgfilial sgfilial;
	private String descarea;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set rhcursos = new HashSet(0);

	public Rharea() {
	}

	public Rharea(RhareaId id, Sgfilial sgfilial, String descarea, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descarea = descarea;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rharea(RhareaId id, Sgfilial sgfilial, String descarea, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set rhcursos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descarea = descarea;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhcursos = rhcursos;
	}

	public RhareaId getId() {
		return this.id;
	}

	public void setId(RhareaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescarea() {
		return this.descarea;
	}

	public void setDescarea(String descarea) {
		this.descarea = descarea;
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

	public Set getRhcursos() {
		return this.rhcursos;
	}

	public void setRhcursos(Set rhcursos) {
		this.rhcursos = rhcursos;
	}

}

package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pptiporec generated by hbm2java
 */
public class Pptiporec implements java.io.Serializable {

	private PptiporecId id;
	private Sgfilial sgfilial;
	private String desctprec;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppopfases = new HashSet(0);
	private Set pprecursos = new HashSet(0);
	private Set ppestrufases = new HashSet(0);

	public Pptiporec() {
	}

	public Pptiporec(PptiporecId id, Sgfilial sgfilial, String desctprec,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctprec = desctprec;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pptiporec(PptiporecId id, Sgfilial sgfilial, String desctprec,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set ppopfases, Set pprecursos, Set ppestrufases) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctprec = desctprec;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppopfases = ppopfases;
		this.pprecursos = pprecursos;
		this.ppestrufases = ppestrufases;
	}

	public PptiporecId getId() {
		return this.id;
	}

	public void setId(PptiporecId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctprec() {
		return this.desctprec;
	}

	public void setDesctprec(String desctprec) {
		this.desctprec = desctprec;
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

	public Set getPpopfases() {
		return this.ppopfases;
	}

	public void setPpopfases(Set ppopfases) {
		this.ppopfases = ppopfases;
	}

	public Set getPprecursos() {
		return this.pprecursos;
	}

	public void setPprecursos(Set pprecursos) {
		this.pprecursos = pprecursos;
	}

	public Set getPpestrufases() {
		return this.ppestrufases;
	}

	public void setPpestrufases(Set ppestrufases) {
		this.ppestrufases = ppestrufases;
	}

}

package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lftrattrib generated by hbm2java
 */
public class Lftrattrib implements java.io.Serializable {

	private LftrattribId id;
	private Sgfilial sgfilial;
	private String desctrattrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vditvendas = new HashSet(0);
	private Set lfitclfiscals = new HashSet(0);
	private Set lffretes = new HashSet(0);

	public Lftrattrib() {
	}

	public Lftrattrib(LftrattribId id, Sgfilial sgfilial, String desctrattrib,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctrattrib = desctrattrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lftrattrib(LftrattribId id, Sgfilial sgfilial, String desctrattrib,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set vditvendas, Set lfitclfiscals, Set lffretes) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctrattrib = desctrattrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vditvendas = vditvendas;
		this.lfitclfiscals = lfitclfiscals;
		this.lffretes = lffretes;
	}

	public LftrattribId getId() {
		return this.id;
	}

	public void setId(LftrattribId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctrattrib() {
		return this.desctrattrib;
	}

	public void setDesctrattrib(String desctrattrib) {
		this.desctrattrib = desctrattrib;
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

	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

	public Set getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

	public Set getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set lffretes) {
		this.lffretes = lffretes;
	}

}

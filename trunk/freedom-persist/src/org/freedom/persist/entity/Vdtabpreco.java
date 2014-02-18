package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdtabpreco generated by hbm2java
 */
public class Vdtabpreco implements java.io.Serializable {

	private VdtabprecoId id;
	private Sgfilial sgfilial;
	private String desctab;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgprefere1s = new HashSet(0);
	private Set eqtipomovs = new HashSet(0);
	private Set vdprecoprods = new HashSet(0);

	public Vdtabpreco() {
	}

	public Vdtabpreco(VdtabprecoId id, Sgfilial sgfilial, String desctab,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctab = desctab;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdtabpreco(VdtabprecoId id, Sgfilial sgfilial, String desctab,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set sgprefere1s, Set eqtipomovs, Set vdprecoprods) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctab = desctab;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere1s = sgprefere1s;
		this.eqtipomovs = eqtipomovs;
		this.vdprecoprods = vdprecoprods;
	}

	public VdtabprecoId getId() {
		return this.id;
	}

	public void setId(VdtabprecoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctab() {
		return this.desctab;
	}

	public void setDesctab(String desctab) {
		this.desctab = desctab;
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

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	public Set getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

	public Set getVdprecoprods() {
		return this.vdprecoprods;
	}

	public void setVdprecoprods(Set vdprecoprods) {
		this.vdprecoprods = vdprecoprods;
	}

}

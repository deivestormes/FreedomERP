package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rhcaracteristica generated by hbm2java
 */
public class Rhcaracteristica implements java.io.Serializable {

	private RhcaracteristicaId id;
	private Sgfilial sgfilial;
	private String desccarac;
	private String obscarac;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set rhvagacaracqualis = new HashSet(0);
	private Set rhvagacaracrests = new HashSet(0);
	private Set rhcandidatocaracs = new HashSet(0);

	public Rhcaracteristica() {
	}

	public Rhcaracteristica(RhcaracteristicaId id, Sgfilial sgfilial,
			String desccarac, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desccarac = desccarac;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcaracteristica(RhcaracteristicaId id, Sgfilial sgfilial,
			String desccarac, String obscarac, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set rhvagacaracqualis, Set rhvagacaracrests, Set rhcandidatocaracs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desccarac = desccarac;
		this.obscarac = obscarac;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhvagacaracqualis = rhvagacaracqualis;
		this.rhvagacaracrests = rhvagacaracrests;
		this.rhcandidatocaracs = rhcandidatocaracs;
	}

	public RhcaracteristicaId getId() {
		return this.id;
	}

	public void setId(RhcaracteristicaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesccarac() {
		return this.desccarac;
	}

	public void setDesccarac(String desccarac) {
		this.desccarac = desccarac;
	}

	public String getObscarac() {
		return this.obscarac;
	}

	public void setObscarac(String obscarac) {
		this.obscarac = obscarac;
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

	public Set getRhvagacaracqualis() {
		return this.rhvagacaracqualis;
	}

	public void setRhvagacaracqualis(Set rhvagacaracqualis) {
		this.rhvagacaracqualis = rhvagacaracqualis;
	}

	public Set getRhvagacaracrests() {
		return this.rhvagacaracrests;
	}

	public void setRhvagacaracrests(Set rhvagacaracrests) {
		this.rhvagacaracrests = rhvagacaracrests;
	}

	public Set getRhcandidatocaracs() {
		return this.rhcandidatocaracs;
	}

	public void setRhcandidatocaracs(Set rhcandidatocaracs) {
		this.rhcandidatocaracs = rhcandidatocaracs;
	}

}

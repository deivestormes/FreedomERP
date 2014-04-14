package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Rhvagacandidato generated by hbm2java
 */
public class Rhvagacandidato implements java.io.Serializable {

	private RhvagacandidatoId id;
	private Rhcandidato rhcandidato;
	private Rhvaga rhvaga;
	private String stvagacand;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhvagacandidato() {
	}

	public Rhvagacandidato(RhvagacandidatoId id, Rhcandidato rhcandidato,
			Rhvaga rhvaga, String stvagacand, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.rhcandidato = rhcandidato;
		this.rhvaga = rhvaga;
		this.stvagacand = stvagacand;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhvagacandidato(RhvagacandidatoId id, Rhcandidato rhcandidato,
			Rhvaga rhvaga, String stvagacand, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.rhcandidato = rhcandidato;
		this.rhvaga = rhvaga;
		this.stvagacand = stvagacand;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public RhvagacandidatoId getId() {
		return this.id;
	}

	public void setId(RhvagacandidatoId id) {
		this.id = id;
	}

	public Rhcandidato getRhcandidato() {
		return this.rhcandidato;
	}

	public void setRhcandidato(Rhcandidato rhcandidato) {
		this.rhcandidato = rhcandidato;
	}

	public Rhvaga getRhvaga() {
		return this.rhvaga;
	}

	public void setRhvaga(Rhvaga rhvaga) {
		this.rhvaga = rhvaga;
	}

	public String getStvagacand() {
		return this.stvagacand;
	}

	public void setStvagacand(String stvagacand) {
		this.stvagacand = stvagacand;
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

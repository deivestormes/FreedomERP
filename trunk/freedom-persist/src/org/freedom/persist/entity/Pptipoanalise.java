package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pptipoanalise generated by hbm2java
 */
public class Pptipoanalise implements java.io.Serializable {

	private PptipoanaliseId id;
	private Equnidade equnidade;
	private Ppmetodoanalise ppmetodoanalise;
	private String desctpanalise;
	private String obstpanalise;
	private String tipoexpec;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppestruanalises = new HashSet(0);

	public Pptipoanalise() {
	}

	public Pptipoanalise(PptipoanaliseId id, Ppmetodoanalise ppmetodoanalise,
			String tipoexpec, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.ppmetodoanalise = ppmetodoanalise;
		this.tipoexpec = tipoexpec;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Pptipoanalise(PptipoanaliseId id, Equnidade equnidade,
			Ppmetodoanalise ppmetodoanalise, String desctpanalise,
			String obstpanalise, String tipoexpec, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set ppestruanalises) {
		this.id = id;
		this.equnidade = equnidade;
		this.ppmetodoanalise = ppmetodoanalise;
		this.desctpanalise = desctpanalise;
		this.obstpanalise = obstpanalise;
		this.tipoexpec = tipoexpec;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppestruanalises = ppestruanalises;
	}

	public PptipoanaliseId getId() {
		return this.id;
	}

	public void setId(PptipoanaliseId id) {
		this.id = id;
	}

	public Equnidade getEqunidade() {
		return this.equnidade;
	}

	public void setEqunidade(Equnidade equnidade) {
		this.equnidade = equnidade;
	}

	public Ppmetodoanalise getPpmetodoanalise() {
		return this.ppmetodoanalise;
	}

	public void setPpmetodoanalise(Ppmetodoanalise ppmetodoanalise) {
		this.ppmetodoanalise = ppmetodoanalise;
	}

	public String getDesctpanalise() {
		return this.desctpanalise;
	}

	public void setDesctpanalise(String desctpanalise) {
		this.desctpanalise = desctpanalise;
	}

	public String getObstpanalise() {
		return this.obstpanalise;
	}

	public void setObstpanalise(String obstpanalise) {
		this.obstpanalise = obstpanalise;
	}

	public String getTipoexpec() {
		return this.tipoexpec;
	}

	public void setTipoexpec(String tipoexpec) {
		this.tipoexpec = tipoexpec;
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

	public Set getPpestruanalises() {
		return this.ppestruanalises;
	}

	public void setPpestruanalises(Set ppestruanalises) {
		this.ppestruanalises = ppestruanalises;
	}

}

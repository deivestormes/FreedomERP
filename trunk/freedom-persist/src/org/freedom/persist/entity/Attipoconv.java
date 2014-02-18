package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Attipoconv generated by hbm2java
 */
public class Attipoconv implements java.io.Serializable {

	private AttipoconvId id;
	private Sgfilial sgfilial;
	private String desctpconv;
	private String classtpconv;
	private String codauxtpconv;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set atconveniados = new HashSet(0);
	private Set vdorcamentos = new HashSet(0);

	public Attipoconv() {
	}

	public Attipoconv(AttipoconvId id, Sgfilial sgfilial, String desctpconv,
			String codauxtpconv, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctpconv = desctpconv;
		this.codauxtpconv = codauxtpconv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Attipoconv(AttipoconvId id, Sgfilial sgfilial, String desctpconv,
			String classtpconv, String codauxtpconv, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set atconveniados, Set vdorcamentos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctpconv = desctpconv;
		this.classtpconv = classtpconv;
		this.codauxtpconv = codauxtpconv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atconveniados = atconveniados;
		this.vdorcamentos = vdorcamentos;
	}

	public AttipoconvId getId() {
		return this.id;
	}

	public void setId(AttipoconvId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctpconv() {
		return this.desctpconv;
	}

	public void setDesctpconv(String desctpconv) {
		this.desctpconv = desctpconv;
	}

	public String getClasstpconv() {
		return this.classtpconv;
	}

	public void setClasstpconv(String classtpconv) {
		this.classtpconv = classtpconv;
	}

	public String getCodauxtpconv() {
		return this.codauxtpconv;
	}

	public void setCodauxtpconv(String codauxtpconv) {
		this.codauxtpconv = codauxtpconv;
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

	public Set getAtconveniados() {
		return this.atconveniados;
	}

	public void setAtconveniados(Set atconveniados) {
		this.atconveniados = atconveniados;
	}

	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

}

package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Attipoatendo generated by hbm2java
 */
public class Attipoatendo implements java.io.Serializable {

	private AttipoatendoId id;
	private Sgfilial sgfilial;
	private Sgfluxo sgfluxo;
	private String desctpatendo;
	private char tipoatendo;
	private char ativoatendo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgprefere2sForSgprefere2fk2attip = new HashSet(0);
	private Set sgprefere2sForSgprefere2fkattipo = new HashSet(0);
	private Set atmodatendos = new HashSet(0);
	private Set sgprefere2sForSgprefere2fk3attip = new HashSet(0);
	private Set attipoatendosetors = new HashSet(0);
	private Set atatendimentos = new HashSet(0);

	public Attipoatendo() {
	}

	public Attipoatendo(AttipoatendoId id, Sgfilial sgfilial,
			String desctpatendo, char tipoatendo, char ativoatendo, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctpatendo = desctpatendo;
		this.tipoatendo = tipoatendo;
		this.ativoatendo = ativoatendo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Attipoatendo(AttipoatendoId id, Sgfilial sgfilial, Sgfluxo sgfluxo,
			String desctpatendo, char tipoatendo, char ativoatendo, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgprefere2sForSgprefere2fk2attip,
			Set sgprefere2sForSgprefere2fkattipo, Set atmodatendos,
			Set sgprefere2sForSgprefere2fk3attip, Set attipoatendosetors,
			Set atatendimentos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgfluxo = sgfluxo;
		this.desctpatendo = desctpatendo;
		this.tipoatendo = tipoatendo;
		this.ativoatendo = ativoatendo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere2sForSgprefere2fk2attip = sgprefere2sForSgprefere2fk2attip;
		this.sgprefere2sForSgprefere2fkattipo = sgprefere2sForSgprefere2fkattipo;
		this.atmodatendos = atmodatendos;
		this.sgprefere2sForSgprefere2fk3attip = sgprefere2sForSgprefere2fk3attip;
		this.attipoatendosetors = attipoatendosetors;
		this.atatendimentos = atatendimentos;
	}

	public AttipoatendoId getId() {
		return this.id;
	}

	public void setId(AttipoatendoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Sgfluxo getSgfluxo() {
		return this.sgfluxo;
	}

	public void setSgfluxo(Sgfluxo sgfluxo) {
		this.sgfluxo = sgfluxo;
	}

	public String getDesctpatendo() {
		return this.desctpatendo;
	}

	public void setDesctpatendo(String desctpatendo) {
		this.desctpatendo = desctpatendo;
	}

	public char getTipoatendo() {
		return this.tipoatendo;
	}

	public void setTipoatendo(char tipoatendo) {
		this.tipoatendo = tipoatendo;
	}

	public char getAtivoatendo() {
		return this.ativoatendo;
	}

	public void setAtivoatendo(char ativoatendo) {
		this.ativoatendo = ativoatendo;
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

	public Set getSgprefere2sForSgprefere2fk2attip() {
		return this.sgprefere2sForSgprefere2fk2attip;
	}

	public void setSgprefere2sForSgprefere2fk2attip(
			Set sgprefere2sForSgprefere2fk2attip) {
		this.sgprefere2sForSgprefere2fk2attip = sgprefere2sForSgprefere2fk2attip;
	}

	public Set getSgprefere2sForSgprefere2fkattipo() {
		return this.sgprefere2sForSgprefere2fkattipo;
	}

	public void setSgprefere2sForSgprefere2fkattipo(
			Set sgprefere2sForSgprefere2fkattipo) {
		this.sgprefere2sForSgprefere2fkattipo = sgprefere2sForSgprefere2fkattipo;
	}

	public Set getAtmodatendos() {
		return this.atmodatendos;
	}

	public void setAtmodatendos(Set atmodatendos) {
		this.atmodatendos = atmodatendos;
	}

	public Set getSgprefere2sForSgprefere2fk3attip() {
		return this.sgprefere2sForSgprefere2fk3attip;
	}

	public void setSgprefere2sForSgprefere2fk3attip(
			Set sgprefere2sForSgprefere2fk3attip) {
		this.sgprefere2sForSgprefere2fk3attip = sgprefere2sForSgprefere2fk3attip;
	}

	public Set getAttipoatendosetors() {
		return this.attipoatendosetors;
	}

	public void setAttipoatendosetors(Set attipoatendosetors) {
		this.attipoatendosetors = attipoatendosetors;
	}

	public Set getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

}

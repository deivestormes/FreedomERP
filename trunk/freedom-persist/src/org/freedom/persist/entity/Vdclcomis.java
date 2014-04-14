package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdclcomis generated by hbm2java
 */
public class Vdclcomis implements java.io.Serializable {

	private VdclcomisId id;
	private String descclcomis;
	private BigDecimal percfatclcomis;
	private BigDecimal percpgtoclcomis;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdorcamentos = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set vdvendedors = new HashSet(0);

	public Vdclcomis() {
	}

	public Vdclcomis(VdclcomisId id, String descclcomis, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descclcomis = descclcomis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdclcomis(VdclcomisId id, String descclcomis,
			BigDecimal percfatclcomis, BigDecimal percpgtoclcomis, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdorcamentos, Set vdvendas, Set vdvendedors) {
		this.id = id;
		this.descclcomis = descclcomis;
		this.percfatclcomis = percfatclcomis;
		this.percpgtoclcomis = percpgtoclcomis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdorcamentos = vdorcamentos;
		this.vdvendas = vdvendas;
		this.vdvendedors = vdvendedors;
	}

	public VdclcomisId getId() {
		return this.id;
	}

	public void setId(VdclcomisId id) {
		this.id = id;
	}

	public String getDescclcomis() {
		return this.descclcomis;
	}

	public void setDescclcomis(String descclcomis) {
		this.descclcomis = descclcomis;
	}

	public BigDecimal getPercfatclcomis() {
		return this.percfatclcomis;
	}

	public void setPercfatclcomis(BigDecimal percfatclcomis) {
		this.percfatclcomis = percfatclcomis;
	}

	public BigDecimal getPercpgtoclcomis() {
		return this.percpgtoclcomis;
	}

	public void setPercpgtoclcomis(BigDecimal percpgtoclcomis) {
		this.percpgtoclcomis = percpgtoclcomis;
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

	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getVdvendedors() {
		return this.vdvendedors;
	}

	public void setVdvendedors(Set vdvendedors) {
		this.vdvendedors = vdvendedors;
	}

}

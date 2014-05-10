package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lftipofisccli generated by hbm2java
 */
public class Lftipofisccli implements java.io.Serializable {

	private LftipofisccliId id;
	private Eqtipomov eqtipomov;
	private String descfisccli;
	private char calccofinstf;
	private char calccsocialtf;
	private char calcicmstf;
	private char calcipitf;
	private char calcirtf;
	private char calcisstf;
	private char calcpistf;
	private char impcofinstf;
	private char impcsocialtf;
	private char impicmstf;
	private char impisstf;
	private char impipitf;
	private char impirtf;
	private char imppistf;
	private char leitransp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdclientes = new HashSet(0);
	private Set cpforneceds = new HashSet(0);
	private Set lfitclfiscals = new HashSet(0);

	public Lftipofisccli() {
	}

	public Lftipofisccli(LftipofisccliId id, String descfisccli,
			char calccofinstf, char calccsocialtf, char calcicmstf,
			char calcipitf, char calcirtf, char calcisstf, char calcpistf,
			char impcofinstf, char impcsocialtf, char impicmstf, char impisstf,
			char impipitf, char impirtf, char imppistf, char leitransp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descfisccli = descfisccli;
		this.calccofinstf = calccofinstf;
		this.calccsocialtf = calccsocialtf;
		this.calcicmstf = calcicmstf;
		this.calcipitf = calcipitf;
		this.calcirtf = calcirtf;
		this.calcisstf = calcisstf;
		this.calcpistf = calcpistf;
		this.impcofinstf = impcofinstf;
		this.impcsocialtf = impcsocialtf;
		this.impicmstf = impicmstf;
		this.impisstf = impisstf;
		this.impipitf = impipitf;
		this.impirtf = impirtf;
		this.imppistf = imppistf;
		this.leitransp = leitransp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lftipofisccli(LftipofisccliId id, Eqtipomov eqtipomov,
			String descfisccli, char calccofinstf, char calccsocialtf,
			char calcicmstf, char calcipitf, char calcirtf, char calcisstf,
			char calcpistf, char impcofinstf, char impcsocialtf,
			char impicmstf, char impisstf, char impipitf, char impirtf,
			char imppistf, char leitransp, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdclientes, Set cpforneceds, Set lfitclfiscals) {
		this.id = id;
		this.eqtipomov = eqtipomov;
		this.descfisccli = descfisccli;
		this.calccofinstf = calccofinstf;
		this.calccsocialtf = calccsocialtf;
		this.calcicmstf = calcicmstf;
		this.calcipitf = calcipitf;
		this.calcirtf = calcirtf;
		this.calcisstf = calcisstf;
		this.calcpistf = calcpistf;
		this.impcofinstf = impcofinstf;
		this.impcsocialtf = impcsocialtf;
		this.impicmstf = impicmstf;
		this.impisstf = impisstf;
		this.impipitf = impipitf;
		this.impirtf = impirtf;
		this.imppistf = imppistf;
		this.leitransp = leitransp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.cpforneceds = cpforneceds;
		this.lfitclfiscals = lfitclfiscals;
	}

	public LftipofisccliId getId() {
		return this.id;
	}

	public void setId(LftipofisccliId id) {
		this.id = id;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public String getDescfisccli() {
		return this.descfisccli;
	}

	public void setDescfisccli(String descfisccli) {
		this.descfisccli = descfisccli;
	}

	public char getCalccofinstf() {
		return this.calccofinstf;
	}

	public void setCalccofinstf(char calccofinstf) {
		this.calccofinstf = calccofinstf;
	}

	public char getCalccsocialtf() {
		return this.calccsocialtf;
	}

	public void setCalccsocialtf(char calccsocialtf) {
		this.calccsocialtf = calccsocialtf;
	}

	public char getCalcicmstf() {
		return this.calcicmstf;
	}

	public void setCalcicmstf(char calcicmstf) {
		this.calcicmstf = calcicmstf;
	}

	public char getCalcipitf() {
		return this.calcipitf;
	}

	public void setCalcipitf(char calcipitf) {
		this.calcipitf = calcipitf;
	}

	public char getCalcirtf() {
		return this.calcirtf;
	}

	public void setCalcirtf(char calcirtf) {
		this.calcirtf = calcirtf;
	}

	public char getCalcisstf() {
		return this.calcisstf;
	}

	public void setCalcisstf(char calcisstf) {
		this.calcisstf = calcisstf;
	}

	public char getCalcpistf() {
		return this.calcpistf;
	}

	public void setCalcpistf(char calcpistf) {
		this.calcpistf = calcpistf;
	}

	public char getImpcofinstf() {
		return this.impcofinstf;
	}

	public void setImpcofinstf(char impcofinstf) {
		this.impcofinstf = impcofinstf;
	}

	public char getImpcsocialtf() {
		return this.impcsocialtf;
	}

	public void setImpcsocialtf(char impcsocialtf) {
		this.impcsocialtf = impcsocialtf;
	}

	public char getImpicmstf() {
		return this.impicmstf;
	}

	public void setImpicmstf(char impicmstf) {
		this.impicmstf = impicmstf;
	}

	public char getImpisstf() {
		return this.impisstf;
	}

	public void setImpisstf(char impisstf) {
		this.impisstf = impisstf;
	}

	public char getImpipitf() {
		return this.impipitf;
	}

	public void setImpipitf(char impipitf) {
		this.impipitf = impipitf;
	}

	public char getImpirtf() {
		return this.impirtf;
	}

	public void setImpirtf(char impirtf) {
		this.impirtf = impirtf;
	}

	public char getImppistf() {
		return this.imppistf;
	}

	public void setImppistf(char imppistf) {
		this.imppistf = imppistf;
	}

	public char getLeitransp() {
		return this.leitransp;
	}

	public void setLeitransp(char leitransp) {
		this.leitransp = leitransp;
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

	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	public Set getCpforneceds() {
		return this.cpforneceds;
	}

	public void setCpforneceds(Set cpforneceds) {
		this.cpforneceds = cpforneceds;
	}

	public Set getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

}

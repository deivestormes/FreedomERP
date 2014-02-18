package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fncartcob generated by hbm2java
 */
public class Fncartcob implements java.io.Serializable {

	private FncartcobId id;
	private Fnbanco fnbanco;
	private String variacaocartcob;
	private String desccartcob;
	private String cartcobcnab;
	private Character codcartcobcnab;
	private String convcob;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnrecebers = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set fnitrecebers = new HashSet(0);
	private Set fnitmodboletos = new HashSet(0);
	private Set vdmodcontrs = new HashSet(0);
	private Set vdclientes = new HashSet(0);

	public Fncartcob() {
	}

	public Fncartcob(FncartcobId id, Fnbanco fnbanco, String desccartcob,
			String cartcobcnab, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.desccartcob = desccartcob;
		this.cartcobcnab = cartcobcnab;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fncartcob(FncartcobId id, Fnbanco fnbanco, String variacaocartcob,
			String desccartcob, String cartcobcnab, Character codcartcobcnab,
			String convcob, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set fnrecebers, Set vdvendas,
			Set fnitrecebers, Set fnitmodboletos, Set vdmodcontrs,
			Set vdclientes) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.variacaocartcob = variacaocartcob;
		this.desccartcob = desccartcob;
		this.cartcobcnab = cartcobcnab;
		this.codcartcobcnab = codcartcobcnab;
		this.convcob = convcob;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnrecebers = fnrecebers;
		this.vdvendas = vdvendas;
		this.fnitrecebers = fnitrecebers;
		this.fnitmodboletos = fnitmodboletos;
		this.vdmodcontrs = vdmodcontrs;
		this.vdclientes = vdclientes;
	}

	public FncartcobId getId() {
		return this.id;
	}

	public void setId(FncartcobId id) {
		this.id = id;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public String getVariacaocartcob() {
		return this.variacaocartcob;
	}

	public void setVariacaocartcob(String variacaocartcob) {
		this.variacaocartcob = variacaocartcob;
	}

	public String getDesccartcob() {
		return this.desccartcob;
	}

	public void setDesccartcob(String desccartcob) {
		this.desccartcob = desccartcob;
	}

	public String getCartcobcnab() {
		return this.cartcobcnab;
	}

	public void setCartcobcnab(String cartcobcnab) {
		this.cartcobcnab = cartcobcnab;
	}

	public Character getCodcartcobcnab() {
		return this.codcartcobcnab;
	}

	public void setCodcartcobcnab(Character codcartcobcnab) {
		this.codcartcobcnab = codcartcobcnab;
	}

	public String getConvcob() {
		return this.convcob;
	}

	public void setConvcob(String convcob) {
		this.convcob = convcob;
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

	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	public Set getFnitmodboletos() {
		return this.fnitmodboletos;
	}

	public void setFnitmodboletos(Set fnitmodboletos) {
		this.fnitmodboletos = fnitmodboletos;
	}

	public Set getVdmodcontrs() {
		return this.vdmodcontrs;
	}

	public void setVdmodcontrs(Set vdmodcontrs) {
		this.vdmodcontrs = vdmodcontrs;
	}

	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

}

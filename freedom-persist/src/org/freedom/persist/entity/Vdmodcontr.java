package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdmodcontr generated by hbm2java
 */
public class Vdmodcontr implements java.io.Serializable {

	private VdmodcontrId id;
	private Fnbanco fnbanco;
	private Fncartcob fncartcob;
	private String descmodcontr;
	private String layoutmodcontr;
	private char tpmodcontr;
	private String texto1;
	private String texto2;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdcontratos = new HashSet(0);

	public Vdmodcontr() {
	}

	public Vdmodcontr(VdmodcontrId id, String descmodcontr,
			String layoutmodcontr, char tpmodcontr, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descmodcontr = descmodcontr;
		this.layoutmodcontr = layoutmodcontr;
		this.tpmodcontr = tpmodcontr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdmodcontr(VdmodcontrId id, Fnbanco fnbanco, Fncartcob fncartcob,
			String descmodcontr, String layoutmodcontr, char tpmodcontr,
			String texto1, String texto2, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdcontratos) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.fncartcob = fncartcob;
		this.descmodcontr = descmodcontr;
		this.layoutmodcontr = layoutmodcontr;
		this.tpmodcontr = tpmodcontr;
		this.texto1 = texto1;
		this.texto2 = texto2;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdcontratos = vdcontratos;
	}

	public VdmodcontrId getId() {
		return this.id;
	}

	public void setId(VdmodcontrId id) {
		this.id = id;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	public String getDescmodcontr() {
		return this.descmodcontr;
	}

	public void setDescmodcontr(String descmodcontr) {
		this.descmodcontr = descmodcontr;
	}

	public String getLayoutmodcontr() {
		return this.layoutmodcontr;
	}

	public void setLayoutmodcontr(String layoutmodcontr) {
		this.layoutmodcontr = layoutmodcontr;
	}

	public char getTpmodcontr() {
		return this.tpmodcontr;
	}

	public void setTpmodcontr(char tpmodcontr) {
		this.tpmodcontr = tpmodcontr;
	}

	public String getTexto1() {
		return this.texto1;
	}

	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	public String getTexto2() {
		return this.texto2;
	}

	public void setTexto2(String texto2) {
		this.texto2 = texto2;
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

	public Set getVdcontratos() {
		return this.vdcontratos;
	}

	public void setVdcontratos(Set vdcontratos) {
		this.vdcontratos = vdcontratos;
	}

}

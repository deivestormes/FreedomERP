package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Tkctogrpint generated by hbm2java
 */
public class Tkctogrpint implements java.io.Serializable {

	private TkctogrpintId id;
	private Tkcontato tkcontato;
	private Eqgrupo eqgrupo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkctogrpint() {
	}

	public Tkctogrpint(TkctogrpintId id, Tkcontato tkcontato, Eqgrupo eqgrupo,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.eqgrupo = eqgrupo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkctogrpint(TkctogrpintId id, Tkcontato tkcontato, Eqgrupo eqgrupo,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.eqgrupo = eqgrupo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public TkctogrpintId getId() {
		return this.id;
	}

	public void setId(TkctogrpintId id) {
		this.id = id;
	}

	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	public Eqgrupo getEqgrupo() {
		return this.eqgrupo;
	}

	public void setEqgrupo(Eqgrupo eqgrupo) {
		this.eqgrupo = eqgrupo;
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

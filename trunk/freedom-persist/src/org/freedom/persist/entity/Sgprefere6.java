package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgprefere6 generated by hbm2java
 */
public class Sgprefere6 implements java.io.Serializable {

	private Sgprefere6Id id;
	private String nomeemp;
	private String nomeempcnab;
	private char sobrescrevehist;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgitprefere6s = new HashSet(0);

	public Sgprefere6() {
	}

	public Sgprefere6(Sgprefere6Id id, String nomeemp, String nomeempcnab,
			char sobrescrevehist, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.nomeemp = nomeemp;
		this.nomeempcnab = nomeempcnab;
		this.sobrescrevehist = sobrescrevehist;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere6(Sgprefere6Id id, String nomeemp, String nomeempcnab,
			char sobrescrevehist, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set sgitprefere6s) {
		this.id = id;
		this.nomeemp = nomeemp;
		this.nomeempcnab = nomeempcnab;
		this.sobrescrevehist = sobrescrevehist;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgitprefere6s = sgitprefere6s;
	}

	public Sgprefere6Id getId() {
		return this.id;
	}

	public void setId(Sgprefere6Id id) {
		this.id = id;
	}

	public String getNomeemp() {
		return this.nomeemp;
	}

	public void setNomeemp(String nomeemp) {
		this.nomeemp = nomeemp;
	}

	public String getNomeempcnab() {
		return this.nomeempcnab;
	}

	public void setNomeempcnab(String nomeempcnab) {
		this.nomeempcnab = nomeempcnab;
	}

	public char getSobrescrevehist() {
		return this.sobrescrevehist;
	}

	public void setSobrescrevehist(char sobrescrevehist) {
		this.sobrescrevehist = sobrescrevehist;
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

	public Set getSgitprefere6s() {
		return this.sgitprefere6s;
	}

	public void setSgitprefere6s(Set sgitprefere6s) {
		this.sgitprefere6s = sgitprefere6s;
	}

}

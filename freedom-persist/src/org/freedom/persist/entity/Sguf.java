package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sguf generated by hbm2java
 */
public class Sguf implements java.io.Serializable {

	private SgufId id;
	private Sgpais sgpais;
	private String nomeuf;
	private String nomecurto;
	private short coduf;
	private String regiaouf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitclfiscals = new HashSet(0);
	private Set sgmunicipios = new HashSet(0);

	public Sguf() {
	}

	public Sguf(SgufId id, Sgpais sgpais, String nomeuf, String nomecurto,
			short coduf, String regiaouf, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgpais = sgpais;
		this.nomeuf = nomeuf;
		this.nomecurto = nomecurto;
		this.coduf = coduf;
		this.regiaouf = regiaouf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sguf(SgufId id, Sgpais sgpais, String nomeuf, String nomecurto,
			short coduf, String regiaouf, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set lfitclfiscals, Set sgmunicipios) {
		this.id = id;
		this.sgpais = sgpais;
		this.nomeuf = nomeuf;
		this.nomecurto = nomecurto;
		this.coduf = coduf;
		this.regiaouf = regiaouf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitclfiscals = lfitclfiscals;
		this.sgmunicipios = sgmunicipios;
	}

	public SgufId getId() {
		return this.id;
	}

	public void setId(SgufId id) {
		this.id = id;
	}

	public Sgpais getSgpais() {
		return this.sgpais;
	}

	public void setSgpais(Sgpais sgpais) {
		this.sgpais = sgpais;
	}

	public String getNomeuf() {
		return this.nomeuf;
	}

	public void setNomeuf(String nomeuf) {
		this.nomeuf = nomeuf;
	}

	public String getNomecurto() {
		return this.nomecurto;
	}

	public void setNomecurto(String nomecurto) {
		this.nomecurto = nomecurto;
	}

	public short getCoduf() {
		return this.coduf;
	}

	public void setCoduf(short coduf) {
		this.coduf = coduf;
	}

	public String getRegiaouf() {
		return this.regiaouf;
	}

	public void setRegiaouf(String regiaouf) {
		this.regiaouf = regiaouf;
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

	public Set getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

	public Set getSgmunicipios() {
		return this.sgmunicipios;
	}

	public void setSgmunicipios(Set sgmunicipios) {
		this.sgmunicipios = sgmunicipios;
	}

}

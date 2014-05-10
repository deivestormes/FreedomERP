package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tkatividade generated by hbm2java
 */
public class Tkatividade implements java.io.Serializable {

	private TkatividadeId id;
	private String descativ;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgprefere3sForSgprefere3fktkatce = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkatte = new HashSet(0);
	private Set tkctoativs = new HashSet(0);

	public Tkatividade() {
	}

	public Tkatividade(TkatividadeId id, String descativ, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.descativ = descativ;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkatividade(TkatividadeId id, String descativ, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgprefere3sForSgprefere3fktkatce,
			Set sgprefere3sForSgprefere3fktkatte, Set tkctoativs) {
		this.id = id;
		this.descativ = descativ;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere3sForSgprefere3fktkatce = sgprefere3sForSgprefere3fktkatce;
		this.sgprefere3sForSgprefere3fktkatte = sgprefere3sForSgprefere3fktkatte;
		this.tkctoativs = tkctoativs;
	}

	public TkatividadeId getId() {
		return this.id;
	}

	public void setId(TkatividadeId id) {
		this.id = id;
	}

	public String getDescativ() {
		return this.descativ;
	}

	public void setDescativ(String descativ) {
		this.descativ = descativ;
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

	public Set getSgprefere3sForSgprefere3fktkatce() {
		return this.sgprefere3sForSgprefere3fktkatce;
	}

	public void setSgprefere3sForSgprefere3fktkatce(
			Set sgprefere3sForSgprefere3fktkatce) {
		this.sgprefere3sForSgprefere3fktkatce = sgprefere3sForSgprefere3fktkatce;
	}

	public Set getSgprefere3sForSgprefere3fktkatte() {
		return this.sgprefere3sForSgprefere3fktkatte;
	}

	public void setSgprefere3sForSgprefere3fktkatte(
			Set sgprefere3sForSgprefere3fktkatte) {
		this.sgprefere3sForSgprefere3fktkatte = sgprefere3sForSgprefere3fktkatte;
	}

	public Set getTkctoativs() {
		return this.tkctoativs;
	}

	public void setTkctoativs(Set tkctoativs) {
		this.tkctoativs = tkctoativs;
	}

}

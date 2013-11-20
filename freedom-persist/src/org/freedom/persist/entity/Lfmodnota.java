package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lfmodnota generated by hbm2java
 */
public class Lfmodnota implements java.io.Serializable {

	private LfmodnotaId id;
	private Sgfilial sgfilial;
	private String descmodnota;
	private char tipomodnota;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqtipomovs = new HashSet(0);

	public Lfmodnota() {
	}

	public Lfmodnota(LfmodnotaId id, Sgfilial sgfilial, String descmodnota,
			char tipomodnota, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmodnota = descmodnota;
		this.tipomodnota = tipomodnota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfmodnota(LfmodnotaId id, Sgfilial sgfilial, String descmodnota,
			char tipomodnota, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set eqtipomovs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmodnota = descmodnota;
		this.tipomodnota = tipomodnota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqtipomovs = eqtipomovs;
	}

	public LfmodnotaId getId() {
		return this.id;
	}

	public void setId(LfmodnotaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescmodnota() {
		return this.descmodnota;
	}

	public void setDescmodnota(String descmodnota) {
		this.descmodnota = descmodnota;
	}

	public char getTipomodnota() {
		return this.tipomodnota;
	}

	public void setTipomodnota(char tipomodnota) {
		this.tipomodnota = tipomodnota;
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

	public Set getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

}

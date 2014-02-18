package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tksetorcto generated by hbm2java
 */
public class Tksetorcto implements java.io.Serializable {

	private TksetorctoId id;
	private String descsetorcto;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set tkcontatos = new HashSet(0);

	public Tksetorcto() {
	}

	public Tksetorcto(TksetorctoId id, String descsetorcto, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.descsetorcto = descsetorcto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tksetorcto(TksetorctoId id, String descsetorcto, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set tkcontatos) {
		this.id = id;
		this.descsetorcto = descsetorcto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkcontatos = tkcontatos;
	}

	public TksetorctoId getId() {
		return this.id;
	}

	public void setId(TksetorctoId id) {
		this.id = id;
	}

	public String getDescsetorcto() {
		return this.descsetorcto;
	}

	public void setDescsetorcto(String descsetorcto) {
		this.descsetorcto = descsetorcto;
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

	public Set getTkcontatos() {
		return this.tkcontatos;
	}

	public void setTkcontatos(Set tkcontatos) {
		this.tkcontatos = tkcontatos;
	}

}

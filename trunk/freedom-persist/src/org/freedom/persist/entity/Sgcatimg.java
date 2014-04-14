package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgcatimg generated by hbm2java
 */
public class Sgcatimg implements java.io.Serializable {

	private SgcatimgId id;
	private Sgfilial sgfilial;
	private String desccatimg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgimagems = new HashSet(0);

	public Sgcatimg() {
	}

	public Sgcatimg(SgcatimgId id, Sgfilial sgfilial, String desccatimg,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desccatimg = desccatimg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgcatimg(SgcatimgId id, Sgfilial sgfilial, String desccatimg,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set sgimagems) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desccatimg = desccatimg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgimagems = sgimagems;
	}

	public SgcatimgId getId() {
		return this.id;
	}

	public void setId(SgcatimgId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesccatimg() {
		return this.desccatimg;
	}

	public void setDesccatimg(String desccatimg) {
		this.desccatimg = desccatimg;
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

	public Set getSgimagems() {
		return this.sgimagems;
	}

	public void setSgimagems(Set sgimagems) {
		this.sgimagems = sgimagems;
	}

}

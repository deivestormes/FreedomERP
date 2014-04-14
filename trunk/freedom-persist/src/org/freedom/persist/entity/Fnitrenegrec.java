package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Fnitrenegrec generated by hbm2java
 */
public class Fnitrenegrec implements java.io.Serializable {

	private FnitrenegrecId id;
	private Fnitreceber fnitreceber;
	private Date dtini;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnitrenegrec() {
	}

	public Fnitrenegrec(FnitrenegrecId id, Fnitreceber fnitreceber, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnitrenegrec(FnitrenegrecId id, Fnitreceber fnitreceber, Date dtini,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.dtini = dtini;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnitrenegrecId getId() {
		return this.id;
	}

	public void setId(FnitrenegrecId id) {
		this.id = id;
	}

	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	public Date getDtini() {
		return this.dtini;
	}

	public void setDtini(Date dtini) {
		this.dtini = dtini;
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

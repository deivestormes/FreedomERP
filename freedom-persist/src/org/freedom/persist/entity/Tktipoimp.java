package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tktipoimp generated by hbm2java
 */
public class Tktipoimp implements java.io.Serializable {

	private TktipoimpId id;
	private String desctpimp;
	private char transbintpimp;
	private char cseptpimp;
	private char enterlntpimp;
	private String septpimp;
	private String layouttpimp;
	private Short delcrttpimp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set tkcontatos = new HashSet(0);

	public Tktipoimp() {
	}

	public Tktipoimp(TktipoimpId id, String desctpimp, char transbintpimp,
			char cseptpimp, char enterlntpimp, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.desctpimp = desctpimp;
		this.transbintpimp = transbintpimp;
		this.cseptpimp = cseptpimp;
		this.enterlntpimp = enterlntpimp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tktipoimp(TktipoimpId id, String desctpimp, char transbintpimp,
			char cseptpimp, char enterlntpimp, String septpimp,
			String layouttpimp, Short delcrttpimp, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set tkcontatos) {
		this.id = id;
		this.desctpimp = desctpimp;
		this.transbintpimp = transbintpimp;
		this.cseptpimp = cseptpimp;
		this.enterlntpimp = enterlntpimp;
		this.septpimp = septpimp;
		this.layouttpimp = layouttpimp;
		this.delcrttpimp = delcrttpimp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkcontatos = tkcontatos;
	}

	public TktipoimpId getId() {
		return this.id;
	}

	public void setId(TktipoimpId id) {
		this.id = id;
	}

	public String getDesctpimp() {
		return this.desctpimp;
	}

	public void setDesctpimp(String desctpimp) {
		this.desctpimp = desctpimp;
	}

	public char getTransbintpimp() {
		return this.transbintpimp;
	}

	public void setTransbintpimp(char transbintpimp) {
		this.transbintpimp = transbintpimp;
	}

	public char getCseptpimp() {
		return this.cseptpimp;
	}

	public void setCseptpimp(char cseptpimp) {
		this.cseptpimp = cseptpimp;
	}

	public char getEnterlntpimp() {
		return this.enterlntpimp;
	}

	public void setEnterlntpimp(char enterlntpimp) {
		this.enterlntpimp = enterlntpimp;
	}

	public String getSeptpimp() {
		return this.septpimp;
	}

	public void setSeptpimp(String septpimp) {
		this.septpimp = septpimp;
	}

	public String getLayouttpimp() {
		return this.layouttpimp;
	}

	public void setLayouttpimp(String layouttpimp) {
		this.layouttpimp = layouttpimp;
	}

	public Short getDelcrttpimp() {
		return this.delcrttpimp;
	}

	public void setDelcrttpimp(Short delcrttpimp) {
		this.delcrttpimp = delcrttpimp;
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

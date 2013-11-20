package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lftabicms generated by hbm2java
 */
public class Lftabicms implements java.io.Serializable {

	private LftabicmsId id;
	private BigDecimal aliqti;
	private Short aliqintrati;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitnatopers = new HashSet(0);

	public Lftabicms() {
	}

	public Lftabicms(LftabicmsId id, BigDecimal aliqti, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.aliqti = aliqti;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lftabicms(LftabicmsId id, BigDecimal aliqti, Short aliqintrati,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set lfitnatopers) {
		this.id = id;
		this.aliqti = aliqti;
		this.aliqintrati = aliqintrati;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitnatopers = lfitnatopers;
	}

	public LftabicmsId getId() {
		return this.id;
	}

	public void setId(LftabicmsId id) {
		this.id = id;
	}

	public BigDecimal getAliqti() {
		return this.aliqti;
	}

	public void setAliqti(BigDecimal aliqti) {
		this.aliqti = aliqti;
	}

	public Short getAliqintrati() {
		return this.aliqintrati;
	}

	public void setAliqintrati(Short aliqintrati) {
		this.aliqintrati = aliqintrati;
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

	public Set getLfitnatopers() {
		return this.lfitnatopers;
	}

	public void setLfitnatopers(Set lfitnatopers) {
		this.lfitnatopers = lfitnatopers;
	}

}

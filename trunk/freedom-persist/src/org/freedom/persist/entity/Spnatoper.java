package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Spnatoper generated by hbm2java
 */
public class Spnatoper implements java.io.Serializable {

	private SpnatoperId id;
	private String descProd;
	private Date dtIni;
	private Date dtFim;
	private String ncm;
	private String ncmEx;
	private String exIpi;
	private String unid;
	private BigDecimal aliqPis;
	private BigDecimal aliqCofin;
	private String exTabOperSemCsl;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfclfiscals = new HashSet(0);

	public Spnatoper() {
	}

	public Spnatoper(SpnatoperId id, String descProd, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt) {
		this.id = id;
		this.descProd = descProd;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Spnatoper(SpnatoperId id, String descProd, Date dtIni, Date dtFim,
			String ncm, String ncmEx, String exIpi, String unid,
			BigDecimal aliqPis, BigDecimal aliqCofin, String exTabOperSemCsl,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set lfclfiscals) {
		this.id = id;
		this.descProd = descProd;
		this.dtIni = dtIni;
		this.dtFim = dtFim;
		this.ncm = ncm;
		this.ncmEx = ncmEx;
		this.exIpi = exIpi;
		this.unid = unid;
		this.aliqPis = aliqPis;
		this.aliqCofin = aliqCofin;
		this.exTabOperSemCsl = exTabOperSemCsl;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfclfiscals = lfclfiscals;
	}

	public SpnatoperId getId() {
		return this.id;
	}

	public void setId(SpnatoperId id) {
		this.id = id;
	}

	public String getDescProd() {
		return this.descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}

	public Date getDtIni() {
		return this.dtIni;
	}

	public void setDtIni(Date dtIni) {
		this.dtIni = dtIni;
	}

	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public String getNcm() {
		return this.ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getNcmEx() {
		return this.ncmEx;
	}

	public void setNcmEx(String ncmEx) {
		this.ncmEx = ncmEx;
	}

	public String getExIpi() {
		return this.exIpi;
	}

	public void setExIpi(String exIpi) {
		this.exIpi = exIpi;
	}

	public String getUnid() {
		return this.unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public BigDecimal getAliqPis() {
		return this.aliqPis;
	}

	public void setAliqPis(BigDecimal aliqPis) {
		this.aliqPis = aliqPis;
	}

	public BigDecimal getAliqCofin() {
		return this.aliqCofin;
	}

	public void setAliqCofin(BigDecimal aliqCofin) {
		this.aliqCofin = aliqCofin;
	}

	public String getExTabOperSemCsl() {
		return this.exTabOperSemCsl;
	}

	public void setExTabOperSemCsl(String exTabOperSemCsl) {
		this.exTabOperSemCsl = exTabOperSemCsl;
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

	public Set getLfclfiscals() {
		return this.lfclfiscals;
	}

	public void setLfclfiscals(Set lfclfiscals) {
		this.lfclfiscals = lfclfiscals;
	}

}

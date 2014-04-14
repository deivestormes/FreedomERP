package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqittrocarefprod generated by hbm2java
 */
public class Eqittrocarefprod implements java.io.Serializable {

	private long idIt;
	private Sgfilial sgfilial;
	private Eqtrocarefprod eqtrocarefprod;
	private Date dtexec;
	private int codemppd;
	private short codfilialpd;
	private int codprod;
	private String refprodold;
	private String refprodnew;
	private String situacao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqittrocarplogs = new HashSet(0);

	public Eqittrocarefprod() {
	}

	public Eqittrocarefprod(long idIt, Sgfilial sgfilial,
			Eqtrocarefprod eqtrocarefprod, Date dtexec, int codemppd,
			short codfilialpd, int codprod, String refprodold,
			String refprodnew, String situacao, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt) {
		this.idIt = idIt;
		this.sgfilial = sgfilial;
		this.eqtrocarefprod = eqtrocarefprod;
		this.dtexec = dtexec;
		this.codemppd = codemppd;
		this.codfilialpd = codfilialpd;
		this.codprod = codprod;
		this.refprodold = refprodold;
		this.refprodnew = refprodnew;
		this.situacao = situacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Eqittrocarefprod(long idIt, Sgfilial sgfilial,
			Eqtrocarefprod eqtrocarefprod, Date dtexec, int codemppd,
			short codfilialpd, int codprod, String refprodold,
			String refprodnew, String situacao, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqittrocarplogs) {
		this.idIt = idIt;
		this.sgfilial = sgfilial;
		this.eqtrocarefprod = eqtrocarefprod;
		this.dtexec = dtexec;
		this.codemppd = codemppd;
		this.codfilialpd = codfilialpd;
		this.codprod = codprod;
		this.refprodold = refprodold;
		this.refprodnew = refprodnew;
		this.situacao = situacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqittrocarplogs = eqittrocarplogs;
	}

	public long getIdIt() {
		return this.idIt;
	}

	public void setIdIt(long idIt) {
		this.idIt = idIt;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqtrocarefprod getEqtrocarefprod() {
		return this.eqtrocarefprod;
	}

	public void setEqtrocarefprod(Eqtrocarefprod eqtrocarefprod) {
		this.eqtrocarefprod = eqtrocarefprod;
	}

	public Date getDtexec() {
		return this.dtexec;
	}

	public void setDtexec(Date dtexec) {
		this.dtexec = dtexec;
	}

	public int getCodemppd() {
		return this.codemppd;
	}

	public void setCodemppd(int codemppd) {
		this.codemppd = codemppd;
	}

	public short getCodfilialpd() {
		return this.codfilialpd;
	}

	public void setCodfilialpd(short codfilialpd) {
		this.codfilialpd = codfilialpd;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public String getRefprodold() {
		return this.refprodold;
	}

	public void setRefprodold(String refprodold) {
		this.refprodold = refprodold;
	}

	public String getRefprodnew() {
		return this.refprodnew;
	}

	public void setRefprodnew(String refprodnew) {
		this.refprodnew = refprodnew;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
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

	public Set getEqittrocarplogs() {
		return this.eqittrocarplogs;
	}

	public void setEqittrocarplogs(Set eqittrocarplogs) {
		this.eqittrocarplogs = eqittrocarplogs;
	}

}

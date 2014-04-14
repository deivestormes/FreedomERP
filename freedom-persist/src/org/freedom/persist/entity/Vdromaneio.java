package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdromaneio generated by hbm2java
 */
public class Vdromaneio implements java.io.Serializable {

	private VdromaneioId id;
	private Sgfilial sgfilial;
	private Eqexpedicao eqexpedicao;
	private Vdtransp vdtransp;
	private Date dataroma;
	private Date dtsaidaroma;
	private Date dtprevroma;
	private Date dtentregaroma;
	private String statusroma;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqexpedicaos = new HashSet(0);
	private Set vditromaneios = new HashSet(0);

	public Vdromaneio() {
	}

	public Vdromaneio(VdromaneioId id, Sgfilial sgfilial, Date dataroma,
			Date dtsaidaroma, Date dtprevroma, String statusroma, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.dataroma = dataroma;
		this.dtsaidaroma = dtsaidaroma;
		this.dtprevroma = dtprevroma;
		this.statusroma = statusroma;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdromaneio(VdromaneioId id, Sgfilial sgfilial,
			Eqexpedicao eqexpedicao, Vdtransp vdtransp, Date dataroma,
			Date dtsaidaroma, Date dtprevroma, Date dtentregaroma,
			String statusroma, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set eqexpedicaos,
			Set vditromaneios) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqexpedicao = eqexpedicao;
		this.vdtransp = vdtransp;
		this.dataroma = dataroma;
		this.dtsaidaroma = dtsaidaroma;
		this.dtprevroma = dtprevroma;
		this.dtentregaroma = dtentregaroma;
		this.statusroma = statusroma;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqexpedicaos = eqexpedicaos;
		this.vditromaneios = vditromaneios;
	}

	public VdromaneioId getId() {
		return this.id;
	}

	public void setId(VdromaneioId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqexpedicao getEqexpedicao() {
		return this.eqexpedicao;
	}

	public void setEqexpedicao(Eqexpedicao eqexpedicao) {
		this.eqexpedicao = eqexpedicao;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public Date getDataroma() {
		return this.dataroma;
	}

	public void setDataroma(Date dataroma) {
		this.dataroma = dataroma;
	}

	public Date getDtsaidaroma() {
		return this.dtsaidaroma;
	}

	public void setDtsaidaroma(Date dtsaidaroma) {
		this.dtsaidaroma = dtsaidaroma;
	}

	public Date getDtprevroma() {
		return this.dtprevroma;
	}

	public void setDtprevroma(Date dtprevroma) {
		this.dtprevroma = dtprevroma;
	}

	public Date getDtentregaroma() {
		return this.dtentregaroma;
	}

	public void setDtentregaroma(Date dtentregaroma) {
		this.dtentregaroma = dtentregaroma;
	}

	public String getStatusroma() {
		return this.statusroma;
	}

	public void setStatusroma(String statusroma) {
		this.statusroma = statusroma;
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

	public Set getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

	public Set getVditromaneios() {
		return this.vditromaneios;
	}

	public void setVditromaneios(Set vditromaneios) {
		this.vditromaneios = vditromaneios;
	}

}

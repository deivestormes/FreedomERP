package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Atconvatrib generated by hbm2java
 */
public class Atconvatrib implements java.io.Serializable {

	private AtconvatribId id;
	private Atconveniado atconveniado;
	private Atatribuicao atatribuicao;
	private String obsconvatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set atconvatribtbs = new HashSet(0);

	public Atconvatrib() {
	}

	public Atconvatrib(AtconvatribId id, Atconveniado atconveniado,
			Atatribuicao atatribuicao, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.atconveniado = atconveniado;
		this.atatribuicao = atatribuicao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atconvatrib(AtconvatribId id, Atconveniado atconveniado,
			Atatribuicao atatribuicao, String obsconvatrib, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set atconvatribtbs) {
		this.id = id;
		this.atconveniado = atconveniado;
		this.atatribuicao = atatribuicao;
		this.obsconvatrib = obsconvatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atconvatribtbs = atconvatribtbs;
	}

	public AtconvatribId getId() {
		return this.id;
	}

	public void setId(AtconvatribId id) {
		this.id = id;
	}

	public Atconveniado getAtconveniado() {
		return this.atconveniado;
	}

	public void setAtconveniado(Atconveniado atconveniado) {
		this.atconveniado = atconveniado;
	}

	public Atatribuicao getAtatribuicao() {
		return this.atatribuicao;
	}

	public void setAtatribuicao(Atatribuicao atatribuicao) {
		this.atatribuicao = atatribuicao;
	}

	public String getObsconvatrib() {
		return this.obsconvatrib;
	}

	public void setObsconvatrib(String obsconvatrib) {
		this.obsconvatrib = obsconvatrib;
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

	public Set getAtconvatribtbs() {
		return this.atconvatribtbs;
	}

	public void setAtconvatribtbs(Set atconvatribtbs) {
		this.atconvatribtbs = atconvatribtbs;
	}

}

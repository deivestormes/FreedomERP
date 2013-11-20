package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Crmotivofb generated by hbm2java
 */
public class Crmotivofb implements java.io.Serializable {

	private long id;
	private Sgfilial sgfilial;
	private String descricao;
	private String tipo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set crfeedbacks = new HashSet(0);

	public Crmotivofb() {
	}

	public Crmotivofb(long id, Sgfilial sgfilial, String descricao,
			String tipo, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descricao = descricao;
		this.tipo = tipo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crmotivofb(long id, Sgfilial sgfilial, String descricao,
			String tipo, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set crfeedbacks) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descricao = descricao;
		this.tipo = tipo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crfeedbacks = crfeedbacks;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public Set getCrfeedbacks() {
		return this.crfeedbacks;
	}

	public void setCrfeedbacks(Set crfeedbacks) {
		this.crfeedbacks = crfeedbacks;
	}

}

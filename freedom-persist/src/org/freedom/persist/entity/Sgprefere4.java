package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgprefere4 generated by hbm2java
 */
public class Sgprefere4 implements java.io.Serializable {

	private Sgprefere4Id id;
	private Eqproduto eqproduto;
	private Sgfilial sgfilial;
	private Vdcliente vdcliente;
	private Eqtipomov eqtipomov;
	private Fnplanopag fnplanopag;
	private Short prazo;
	private char adicpdv;
	private char aprovorc;
	private Integer diasvencorc;
	private char usabuscagenprod;
	private char autofechavenda;
	private char usaloteorc;
	private char habreceber;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere4() {
	}

	public Sgprefere4(Sgfilial sgfilial, char adicpdv, char aprovorc,
			char usabuscagenprod, char autofechavenda, char usaloteorc,
			char habreceber, Date dtins, Date hins, String idusuins) {
		this.sgfilial = sgfilial;
		this.adicpdv = adicpdv;
		this.aprovorc = aprovorc;
		this.usabuscagenprod = usabuscagenprod;
		this.autofechavenda = autofechavenda;
		this.usaloteorc = usaloteorc;
		this.habreceber = habreceber;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgprefere4(Eqproduto eqproduto, Sgfilial sgfilial,
			Vdcliente vdcliente, Eqtipomov eqtipomov, Fnplanopag fnplanopag,
			Short prazo, char adicpdv, char aprovorc, Integer diasvencorc,
			char usabuscagenprod, char autofechavenda, char usaloteorc,
			char habreceber, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.eqtipomov = eqtipomov;
		this.fnplanopag = fnplanopag;
		this.prazo = prazo;
		this.adicpdv = adicpdv;
		this.aprovorc = aprovorc;
		this.diasvencorc = diasvencorc;
		this.usabuscagenprod = usabuscagenprod;
		this.autofechavenda = autofechavenda;
		this.usaloteorc = usaloteorc;
		this.habreceber = habreceber;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere4Id getId() {
		return this.id;
	}

	public void setId(Sgprefere4Id id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Short getPrazo() {
		return this.prazo;
	}

	public void setPrazo(Short prazo) {
		this.prazo = prazo;
	}

	public char getAdicpdv() {
		return this.adicpdv;
	}

	public void setAdicpdv(char adicpdv) {
		this.adicpdv = adicpdv;
	}

	public char getAprovorc() {
		return this.aprovorc;
	}

	public void setAprovorc(char aprovorc) {
		this.aprovorc = aprovorc;
	}

	public Integer getDiasvencorc() {
		return this.diasvencorc;
	}

	public void setDiasvencorc(Integer diasvencorc) {
		this.diasvencorc = diasvencorc;
	}

	public char getUsabuscagenprod() {
		return this.usabuscagenprod;
	}

	public void setUsabuscagenprod(char usabuscagenprod) {
		this.usabuscagenprod = usabuscagenprod;
	}

	public char getAutofechavenda() {
		return this.autofechavenda;
	}

	public void setAutofechavenda(char autofechavenda) {
		this.autofechavenda = autofechavenda;
	}

	public char getUsaloteorc() {
		return this.usaloteorc;
	}

	public void setUsaloteorc(char usaloteorc) {
		this.usaloteorc = usaloteorc;
	}

	public char getHabreceber() {
		return this.habreceber;
	}

	public void setHabreceber(char habreceber) {
		this.habreceber = habreceber;
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

package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqmovexp generated by hbm2java
 */
public class Eqmovexp implements java.io.Serializable {

	private EqmovexpId id;
	private Eqtipoexp eqtipoexp;
	private Sgfilial sgfilial;
	private Vdcliente vdcliente;
	private Date dtsaimovexp;
	private int qtdmovexp;
	private Date dtentmovexp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqmovexp() {
	}

	public Eqmovexp(EqmovexpId id, Eqtipoexp eqtipoexp, Sgfilial sgfilial,
			Vdcliente vdcliente, Date dtsaimovexp, int qtdmovexp, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqtipoexp = eqtipoexp;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.dtsaimovexp = dtsaimovexp;
		this.qtdmovexp = qtdmovexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqmovexp(EqmovexpId id, Eqtipoexp eqtipoexp, Sgfilial sgfilial,
			Vdcliente vdcliente, Date dtsaimovexp, int qtdmovexp,
			Date dtentmovexp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqtipoexp = eqtipoexp;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.dtsaimovexp = dtsaimovexp;
		this.qtdmovexp = qtdmovexp;
		this.dtentmovexp = dtentmovexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqmovexpId getId() {
		return this.id;
	}

	public void setId(EqmovexpId id) {
		this.id = id;
	}

	public Eqtipoexp getEqtipoexp() {
		return this.eqtipoexp;
	}

	public void setEqtipoexp(Eqtipoexp eqtipoexp) {
		this.eqtipoexp = eqtipoexp;
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

	public Date getDtsaimovexp() {
		return this.dtsaimovexp;
	}

	public void setDtsaimovexp(Date dtsaimovexp) {
		this.dtsaimovexp = dtsaimovexp;
	}

	public int getQtdmovexp() {
		return this.qtdmovexp;
	}

	public void setQtdmovexp(int qtdmovexp) {
		this.qtdmovexp = qtdmovexp;
	}

	public Date getDtentmovexp() {
		return this.dtentmovexp;
	}

	public void setDtentmovexp(Date dtentmovexp) {
		this.dtentmovexp = dtentmovexp;
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

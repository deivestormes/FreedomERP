package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqlanctoexp generated by hbm2java
 */
public class Eqlanctoexp implements java.io.Serializable {

	private EqlanctoexpId id;
	private Eqtipoexp eqtipoexp;
	private Sgfilial sgfilial;
	private Vdcliente vdcliente;
	private Date dtlexp;
	private int qtdlexp;
	private Date dtretlexp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqlanctoexp() {
	}

	public Eqlanctoexp(EqlanctoexpId id, Eqtipoexp eqtipoexp,
			Sgfilial sgfilial, Vdcliente vdcliente, Date dtlexp, int qtdlexp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqtipoexp = eqtipoexp;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.dtlexp = dtlexp;
		this.qtdlexp = qtdlexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqlanctoexp(EqlanctoexpId id, Eqtipoexp eqtipoexp,
			Sgfilial sgfilial, Vdcliente vdcliente, Date dtlexp, int qtdlexp,
			Date dtretlexp, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.eqtipoexp = eqtipoexp;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.dtlexp = dtlexp;
		this.qtdlexp = qtdlexp;
		this.dtretlexp = dtretlexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqlanctoexpId getId() {
		return this.id;
	}

	public void setId(EqlanctoexpId id) {
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

	public Date getDtlexp() {
		return this.dtlexp;
	}

	public void setDtlexp(Date dtlexp) {
		this.dtlexp = dtlexp;
	}

	public int getQtdlexp() {
		return this.qtdlexp;
	}

	public void setQtdlexp(int qtdlexp) {
		this.qtdlexp = qtdlexp;
	}

	public Date getDtretlexp() {
		return this.dtretlexp;
	}

	public void setDtretlexp(Date dtretlexp) {
		this.dtretlexp = dtretlexp;
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

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqprodacesso generated by hbm2java
 */
public class Eqprodacesso implements java.io.Serializable {

	private EqprodacessoId id;
	private Pvcaixa pvcaixa;
	private Fncc fncc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqprodacesso() {
	}

	public Eqprodacesso(EqprodacessoId id, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqprodacesso(EqprodacessoId id, Pvcaixa pvcaixa, Fncc fncc,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.fncc = fncc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqprodacessoId getId() {
		return this.id;
	}

	public void setId(EqprodacessoId id) {
		this.id = id;
	}

	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
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

package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Eqprodplan generated by hbm2java
 */
public class Eqprodplan implements java.io.Serializable {

	private EqprodplanId id;
	private Eqproduto eqproduto;
	private Fnplanejamento fnplanejamento;
	private Fncc fncc;
	private char tipopp;
	private BigDecimal percpp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqprodplan() {
	}

	public Eqprodplan(EqprodplanId id, Eqproduto eqproduto,
			Fnplanejamento fnplanejamento, Fncc fncc, char tipopp,
			BigDecimal percpp, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.fnplanejamento = fnplanejamento;
		this.fncc = fncc;
		this.tipopp = tipopp;
		this.percpp = percpp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqprodplan(EqprodplanId id, Eqproduto eqproduto,
			Fnplanejamento fnplanejamento, Fncc fncc, char tipopp,
			BigDecimal percpp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.fnplanejamento = fnplanejamento;
		this.fncc = fncc;
		this.tipopp = tipopp;
		this.percpp = percpp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqprodplanId getId() {
		return this.id;
	}

	public void setId(EqprodplanId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public char getTipopp() {
		return this.tipopp;
	}

	public void setTipopp(char tipopp) {
		this.tipopp = tipopp;
	}

	public BigDecimal getPercpp() {
		return this.percpp;
	}

	public void setPercpp(BigDecimal percpp) {
		this.percpp = percpp;
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

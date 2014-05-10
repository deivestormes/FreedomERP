package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vdremconsig generated by hbm2java
 */
public class Vdremconsig implements java.io.Serializable {

	private VdremconsigId id;
	private Eqproduto eqproduto;
	private Vdconsignacao vdconsignacao;
	private BigDecimal qtdsaida;
	private BigDecimal qtddevol;
	private BigDecimal qtdtroca;
	private BigDecimal qtdbonif;
	private BigDecimal preco;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdremconsig() {
	}

	public Vdremconsig(VdremconsigId id, Eqproduto eqproduto,
			Vdconsignacao vdconsignacao, BigDecimal qtdsaida, BigDecimal preco,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.vdconsignacao = vdconsignacao;
		this.qtdsaida = qtdsaida;
		this.preco = preco;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdremconsig(VdremconsigId id, Eqproduto eqproduto,
			Vdconsignacao vdconsignacao, BigDecimal qtdsaida,
			BigDecimal qtddevol, BigDecimal qtdtroca, BigDecimal qtdbonif,
			BigDecimal preco, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.vdconsignacao = vdconsignacao;
		this.qtdsaida = qtdsaida;
		this.qtddevol = qtddevol;
		this.qtdtroca = qtdtroca;
		this.qtdbonif = qtdbonif;
		this.preco = preco;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdremconsigId getId() {
		return this.id;
	}

	public void setId(VdremconsigId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Vdconsignacao getVdconsignacao() {
		return this.vdconsignacao;
	}

	public void setVdconsignacao(Vdconsignacao vdconsignacao) {
		this.vdconsignacao = vdconsignacao;
	}

	public BigDecimal getQtdsaida() {
		return this.qtdsaida;
	}

	public void setQtdsaida(BigDecimal qtdsaida) {
		this.qtdsaida = qtdsaida;
	}

	public BigDecimal getQtddevol() {
		return this.qtddevol;
	}

	public void setQtddevol(BigDecimal qtddevol) {
		this.qtddevol = qtddevol;
	}

	public BigDecimal getQtdtroca() {
		return this.qtdtroca;
	}

	public void setQtdtroca(BigDecimal qtdtroca) {
		this.qtdtroca = qtdtroca;
	}

	public BigDecimal getQtdbonif() {
		return this.qtdbonif;
	}

	public void setQtdbonif(BigDecimal qtdbonif) {
		this.qtdbonif = qtdbonif;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
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

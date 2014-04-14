package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Rhempregadosal generated by hbm2java
 */
public class Rhempregadosal implements java.io.Serializable {

	private RhempregadosalId id;
	private Rhempregado rhempregado;
	private BigDecimal valorsal;
	private BigDecimal custohoratrab;
	private Date dtvigor;
	private String obssal;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhempregadosal() {
	}

	public Rhempregadosal(RhempregadosalId id, Rhempregado rhempregado,
			Date dtvigor, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.rhempregado = rhempregado;
		this.dtvigor = dtvigor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhempregadosal(RhempregadosalId id, Rhempregado rhempregado,
			BigDecimal valorsal, BigDecimal custohoratrab, Date dtvigor,
			String obssal, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.rhempregado = rhempregado;
		this.valorsal = valorsal;
		this.custohoratrab = custohoratrab;
		this.dtvigor = dtvigor;
		this.obssal = obssal;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public RhempregadosalId getId() {
		return this.id;
	}

	public void setId(RhempregadosalId id) {
		this.id = id;
	}

	public Rhempregado getRhempregado() {
		return this.rhempregado;
	}

	public void setRhempregado(Rhempregado rhempregado) {
		this.rhempregado = rhempregado;
	}

	public BigDecimal getValorsal() {
		return this.valorsal;
	}

	public void setValorsal(BigDecimal valorsal) {
		this.valorsal = valorsal;
	}

	public BigDecimal getCustohoratrab() {
		return this.custohoratrab;
	}

	public void setCustohoratrab(BigDecimal custohoratrab) {
		this.custohoratrab = custohoratrab;
	}

	public Date getDtvigor() {
		return this.dtvigor;
	}

	public void setDtvigor(Date dtvigor) {
		this.dtvigor = dtvigor;
	}

	public String getObssal() {
		return this.obssal;
	}

	public void setObssal(String obssal) {
		this.obssal = obssal;
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

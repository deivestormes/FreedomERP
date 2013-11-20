package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Fnittbjuros generated by hbm2java
 */
public class Fnittbjuros implements java.io.Serializable {

	private FnittbjurosId id;
	private Fntbjuros fntbjuros;
	private BigDecimal percittbj;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnittbjuros() {
	}

	public Fnittbjuros(FnittbjurosId id, Fntbjuros fntbjuros,
			BigDecimal percittbj, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fntbjuros = fntbjuros;
		this.percittbj = percittbj;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnittbjuros(FnittbjurosId id, Fntbjuros fntbjuros,
			BigDecimal percittbj, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fntbjuros = fntbjuros;
		this.percittbj = percittbj;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnittbjurosId getId() {
		return this.id;
	}

	public void setId(FnittbjurosId id) {
		this.id = id;
	}

	public Fntbjuros getFntbjuros() {
		return this.fntbjuros;
	}

	public void setFntbjuros(Fntbjuros fntbjuros) {
		this.fntbjuros = fntbjuros;
	}

	public BigDecimal getPercittbj() {
		return this.percittbj;
	}

	public void setPercittbj(BigDecimal percittbj) {
		this.percittbj = percittbj;
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

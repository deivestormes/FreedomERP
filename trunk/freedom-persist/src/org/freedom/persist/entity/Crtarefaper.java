package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Crtarefaper generated by hbm2java
 */
public class Crtarefaper implements java.io.Serializable {

	private CrtarefaperId id;
	private Crtarefa crtarefa;
	private Date dtiniper;
	private Date dtfimper;
	private String tempoesttarefa;
	private BigDecimal tempodectarefa;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Crtarefaper() {
	}

	public Crtarefaper(CrtarefaperId id, Crtarefa crtarefa, Date dtiniper,
			Date dtfimper, String tempoesttarefa, BigDecimal tempodectarefa,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.crtarefa = crtarefa;
		this.dtiniper = dtiniper;
		this.dtfimper = dtfimper;
		this.tempoesttarefa = tempoesttarefa;
		this.tempodectarefa = tempodectarefa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crtarefaper(CrtarefaperId id, Crtarefa crtarefa, Date dtiniper,
			Date dtfimper, String tempoesttarefa, BigDecimal tempodectarefa,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.crtarefa = crtarefa;
		this.dtiniper = dtiniper;
		this.dtfimper = dtfimper;
		this.tempoesttarefa = tempoesttarefa;
		this.tempodectarefa = tempodectarefa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CrtarefaperId getId() {
		return this.id;
	}

	public void setId(CrtarefaperId id) {
		this.id = id;
	}

	public Crtarefa getCrtarefa() {
		return this.crtarefa;
	}

	public void setCrtarefa(Crtarefa crtarefa) {
		this.crtarefa = crtarefa;
	}

	public Date getDtiniper() {
		return this.dtiniper;
	}

	public void setDtiniper(Date dtiniper) {
		this.dtiniper = dtiniper;
	}

	public Date getDtfimper() {
		return this.dtfimper;
	}

	public void setDtfimper(Date dtfimper) {
		this.dtfimper = dtfimper;
	}

	public String getTempoesttarefa() {
		return this.tempoesttarefa;
	}

	public void setTempoesttarefa(String tempoesttarefa) {
		this.tempoesttarefa = tempoesttarefa;
	}

	public BigDecimal getTempodectarefa() {
		return this.tempodectarefa;
	}

	public void setTempodectarefa(BigDecimal tempodectarefa) {
		this.tempodectarefa = tempodectarefa;
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

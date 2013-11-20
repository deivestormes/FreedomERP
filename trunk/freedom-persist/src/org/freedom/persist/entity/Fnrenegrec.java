package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnrenegrec generated by hbm2java
 */
public class Fnrenegrec implements java.io.Serializable {

	private FnrenegrecId id;
	private Fnplanopag fnplanopag;
	private Date dtrenegrec;
	private BigDecimal vlroriginal;
	private BigDecimal vlrdesconto;
	private BigDecimal vlradicional;
	private BigDecimal vlrjuros;
	private BigDecimal vlrliqrenegrec;
	private String obsrenegrec;
	private Date dtini;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnrecebers = new HashSet(0);

	public Fnrenegrec() {
	}

	public Fnrenegrec(FnrenegrecId id, Fnplanopag fnplanopag, Date dtrenegrec,
			BigDecimal vlroriginal, BigDecimal vlrliqrenegrec, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.fnplanopag = fnplanopag;
		this.dtrenegrec = dtrenegrec;
		this.vlroriginal = vlroriginal;
		this.vlrliqrenegrec = vlrliqrenegrec;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnrenegrec(FnrenegrecId id, Fnplanopag fnplanopag, Date dtrenegrec,
			BigDecimal vlroriginal, BigDecimal vlrdesconto,
			BigDecimal vlradicional, BigDecimal vlrjuros,
			BigDecimal vlrliqrenegrec, String obsrenegrec, Date dtini,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set fnrecebers) {
		this.id = id;
		this.fnplanopag = fnplanopag;
		this.dtrenegrec = dtrenegrec;
		this.vlroriginal = vlroriginal;
		this.vlrdesconto = vlrdesconto;
		this.vlradicional = vlradicional;
		this.vlrjuros = vlrjuros;
		this.vlrliqrenegrec = vlrliqrenegrec;
		this.obsrenegrec = obsrenegrec;
		this.dtini = dtini;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnrecebers = fnrecebers;
	}

	public FnrenegrecId getId() {
		return this.id;
	}

	public void setId(FnrenegrecId id) {
		this.id = id;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Date getDtrenegrec() {
		return this.dtrenegrec;
	}

	public void setDtrenegrec(Date dtrenegrec) {
		this.dtrenegrec = dtrenegrec;
	}

	public BigDecimal getVlroriginal() {
		return this.vlroriginal;
	}

	public void setVlroriginal(BigDecimal vlroriginal) {
		this.vlroriginal = vlroriginal;
	}

	public BigDecimal getVlrdesconto() {
		return this.vlrdesconto;
	}

	public void setVlrdesconto(BigDecimal vlrdesconto) {
		this.vlrdesconto = vlrdesconto;
	}

	public BigDecimal getVlradicional() {
		return this.vlradicional;
	}

	public void setVlradicional(BigDecimal vlradicional) {
		this.vlradicional = vlradicional;
	}

	public BigDecimal getVlrjuros() {
		return this.vlrjuros;
	}

	public void setVlrjuros(BigDecimal vlrjuros) {
		this.vlrjuros = vlrjuros;
	}

	public BigDecimal getVlrliqrenegrec() {
		return this.vlrliqrenegrec;
	}

	public void setVlrliqrenegrec(BigDecimal vlrliqrenegrec) {
		this.vlrliqrenegrec = vlrliqrenegrec;
	}

	public String getObsrenegrec() {
		return this.obsrenegrec;
	}

	public void setObsrenegrec(String obsrenegrec) {
		this.obsrenegrec = obsrenegrec;
	}

	public Date getDtini() {
		return this.dtini;
	}

	public void setDtini(Date dtini) {
		this.dtini = dtini;
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

	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

}

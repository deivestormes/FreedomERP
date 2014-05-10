package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppestruanalise generated by hbm2java
 */
public class Ppestruanalise implements java.io.Serializable {

	private PpestruanaliseId id;
	private Pptipoanalise pptipoanalise;
	private Ppestrufase ppestrufase;
	private BigDecimal vlrmin;
	private BigDecimal vlrmax;
	private String especificacao;
	private char emitcert;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppopcqs = new HashSet(0);

	public Ppestruanalise() {
	}

	public Ppestruanalise(PpestruanaliseId id, Pptipoanalise pptipoanalise,
			Ppestrufase ppestrufase, char emitcert, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.pptipoanalise = pptipoanalise;
		this.ppestrufase = ppestrufase;
		this.emitcert = emitcert;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Ppestruanalise(PpestruanaliseId id, Pptipoanalise pptipoanalise,
			Ppestrufase ppestrufase, BigDecimal vlrmin, BigDecimal vlrmax,
			String especificacao, char emitcert, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt, Set ppopcqs) {
		this.id = id;
		this.pptipoanalise = pptipoanalise;
		this.ppestrufase = ppestrufase;
		this.vlrmin = vlrmin;
		this.vlrmax = vlrmax;
		this.especificacao = especificacao;
		this.emitcert = emitcert;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppopcqs = ppopcqs;
	}

	public PpestruanaliseId getId() {
		return this.id;
	}

	public void setId(PpestruanaliseId id) {
		this.id = id;
	}

	public Pptipoanalise getPptipoanalise() {
		return this.pptipoanalise;
	}

	public void setPptipoanalise(Pptipoanalise pptipoanalise) {
		this.pptipoanalise = pptipoanalise;
	}

	public Ppestrufase getPpestrufase() {
		return this.ppestrufase;
	}

	public void setPpestrufase(Ppestrufase ppestrufase) {
		this.ppestrufase = ppestrufase;
	}

	public BigDecimal getVlrmin() {
		return this.vlrmin;
	}

	public void setVlrmin(BigDecimal vlrmin) {
		this.vlrmin = vlrmin;
	}

	public BigDecimal getVlrmax() {
		return this.vlrmax;
	}

	public void setVlrmax(BigDecimal vlrmax) {
		this.vlrmax = vlrmax;
	}

	public String getEspecificacao() {
		return this.especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public char getEmitcert() {
		return this.emitcert;
	}

	public void setEmitcert(char emitcert) {
		this.emitcert = emitcert;
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

	public Set getPpopcqs() {
		return this.ppopcqs;
	}

	public void setPpopcqs(Set ppopcqs) {
		this.ppopcqs = ppopcqs;
	}

}

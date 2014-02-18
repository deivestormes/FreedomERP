package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgtabela generated by hbm2java
 */
public class Sgtabela implements java.io.Serializable {

	private SgtabelaId id;
	private Sgfilial sgfilial;
	private String desctb;
	private String siglatb;
	private Date dtins;
	private String idusuins;
	private Date dtalt;
	private String idusualt;
	private Date hins;
	private Date halt;
	private Set sgittabelas = new HashSet(0);
	private Set sgobjetotbs = new HashSet(0);

	public Sgtabela() {
	}

	public Sgtabela(SgtabelaId id, Sgfilial sgfilial, String desctb) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctb = desctb;
	}

	public Sgtabela(SgtabelaId id, Sgfilial sgfilial, String desctb,
			String siglatb, Date dtins, String idusuins, Date dtalt,
			String idusualt, Date hins, Date halt, Set sgittabelas,
			Set sgobjetotbs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctb = desctb;
		this.siglatb = siglatb;
		this.dtins = dtins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.idusualt = idusualt;
		this.hins = hins;
		this.halt = halt;
		this.sgittabelas = sgittabelas;
		this.sgobjetotbs = sgobjetotbs;
	}

	public SgtabelaId getId() {
		return this.id;
	}

	public void setId(SgtabelaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctb() {
		return this.desctb;
	}

	public void setDesctb(String desctb) {
		this.desctb = desctb;
	}

	public String getSiglatb() {
		return this.siglatb;
	}

	public void setSiglatb(String siglatb) {
		this.siglatb = siglatb;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
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

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public Set getSgittabelas() {
		return this.sgittabelas;
	}

	public void setSgittabelas(Set sgittabelas) {
		this.sgittabelas = sgittabelas;
	}

	public Set getSgobjetotbs() {
		return this.sgobjetotbs;
	}

	public void setSgobjetotbs(Set sgobjetotbs) {
		this.sgobjetotbs = sgobjetotbs;
	}

}

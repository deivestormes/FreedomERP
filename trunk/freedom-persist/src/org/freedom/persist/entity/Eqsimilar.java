package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqsimilar generated by hbm2java
 */
public class Eqsimilar implements java.io.Serializable {

	private EqsimilarId id;
	private String descsim;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqitsimilars = new HashSet(0);

	public Eqsimilar() {
	}

	public Eqsimilar(EqsimilarId id, String descsim, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descsim = descsim;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqsimilar(EqsimilarId id, String descsim, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqitsimilars) {
		this.id = id;
		this.descsim = descsim;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqitsimilars = eqitsimilars;
	}

	public EqsimilarId getId() {
		return this.id;
	}

	public void setId(EqsimilarId id) {
		this.id = id;
	}

	public String getDescsim() {
		return this.descsim;
	}

	public void setDescsim(String descsim) {
		this.descsim = descsim;
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

	public Set getEqitsimilars() {
		return this.eqitsimilars;
	}

	public void setEqitsimilars(Set eqitsimilars) {
		this.eqitsimilars = eqitsimilars;
	}

}

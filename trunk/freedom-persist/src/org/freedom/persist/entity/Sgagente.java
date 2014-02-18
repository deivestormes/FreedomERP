package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgagente generated by hbm2java
 */
public class Sgagente implements java.io.Serializable {

	private SgagenteId id;
	private String descage;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgagendas = new HashSet(0);
	private Set sgusuarios = new HashSet(0);

	public Sgagente() {
	}

	public Sgagente(SgagenteId id, String descage, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descage = descage;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgagente(SgagenteId id, String descage, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgagendas, Set sgusuarios) {
		this.id = id;
		this.descage = descage;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgagendas = sgagendas;
		this.sgusuarios = sgusuarios;
	}

	public SgagenteId getId() {
		return this.id;
	}

	public void setId(SgagenteId id) {
		this.id = id;
	}

	public String getDescage() {
		return this.descage;
	}

	public void setDescage(String descage) {
		this.descage = descage;
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

	public Set getSgagendas() {
		return this.sgagendas;
	}

	public void setSgagendas(Set sgagendas) {
		this.sgagendas = sgagendas;
	}

	public Set getSgusuarios() {
		return this.sgusuarios;
	}

	public void setSgusuarios(Set sgusuarios) {
		this.sgusuarios = sgusuarios;
	}

}

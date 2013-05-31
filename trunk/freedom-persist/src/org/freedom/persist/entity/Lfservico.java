package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lfservico generated by hbm2java
 */
@Entity
@Table(name = "LFSERVICO")
public class Lfservico implements java.io.Serializable {

	private String codserv;
	private String descserv;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Lfclfiscal> lfclfiscals = new HashSet<Lfclfiscal>(0);

	public Lfservico() {
	}

	public Lfservico(String codserv, Date dtins, Date hins, String idusuins) {
		this.codserv = codserv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfservico(String codserv, String descserv, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Lfclfiscal> lfclfiscals) {
		this.codserv = codserv;
		this.descserv = descserv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfclfiscals = lfclfiscals;
	}

	@Id
	@Column(name = "CODSERV", unique = true, nullable = false, length = 5)
	public String getCodserv() {
		return this.codserv;
	}

	public void setCodserv(String codserv) {
		this.codserv = codserv;
	}

	@Column(name = "DESCSERV", length = 500)
	public String getDescserv() {
		return this.descserv;
	}

	public void setDescserv(String descserv) {
		this.descserv = descserv;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfservico")
	public Set<Lfclfiscal> getLfclfiscals() {
		return this.lfclfiscals;
	}

	public void setLfclfiscals(Set<Lfclfiscal> lfclfiscals) {
		this.lfclfiscals = lfclfiscals;
	}

}

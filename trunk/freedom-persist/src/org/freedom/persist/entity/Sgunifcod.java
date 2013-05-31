package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgunifcod generated by hbm2java
 */
@Entity
@Table(name = "SGUNIFCOD")
public class Sgunifcod implements java.io.Serializable {

	private SgunifcodId id;
	private char tipounifcod;
	private String descunifcod;
	private Integer codtmp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vdtransp> vdtransps = new HashSet<Vdtransp>(0);
	private Set<Lffrete> lffretesForLffretefksgunifcodd = new HashSet<Lffrete>(
			0);
	private Set<Lffrete> lffretesForLffretefksgunifcodr = new HashSet<Lffrete>(
			0);
	private Set<Sgfilial> sgfilials = new HashSet<Sgfilial>(0);
	private Set<Vdcliente> vdclientes = new HashSet<Vdcliente>(0);
	private Set<Cpforneced> cpforneceds = new HashSet<Cpforneced>(0);

	public Sgunifcod() {
	}

	public Sgunifcod(SgunifcodId id, char tipounifcod, String descunifcod,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.tipounifcod = tipounifcod;
		this.descunifcod = descunifcod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgunifcod(SgunifcodId id, char tipounifcod, String descunifcod,
			Integer codtmp, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set<Vdtransp> vdtransps,
			Set<Lffrete> lffretesForLffretefksgunifcodd,
			Set<Lffrete> lffretesForLffretefksgunifcodr,
			Set<Sgfilial> sgfilials, Set<Vdcliente> vdclientes,
			Set<Cpforneced> cpforneceds) {
		this.id = id;
		this.tipounifcod = tipounifcod;
		this.descunifcod = descunifcod;
		this.codtmp = codtmp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdtransps = vdtransps;
		this.lffretesForLffretefksgunifcodd = lffretesForLffretefksgunifcodd;
		this.lffretesForLffretefksgunifcodr = lffretesForLffretefksgunifcodr;
		this.sgfilials = sgfilials;
		this.vdclientes = vdclientes;
		this.cpforneceds = cpforneceds;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codunifcod", column = @Column(name = "CODUNIFCOD", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgunifcodId getId() {
		return this.id;
	}

	public void setId(SgunifcodId id) {
		this.id = id;
	}

	@Column(name = "TIPOUNIFCOD", nullable = false, length = 1)
	public char getTipounifcod() {
		return this.tipounifcod;
	}

	public void setTipounifcod(char tipounifcod) {
		this.tipounifcod = tipounifcod;
	}

	@Column(name = "DESCUNIFCOD", nullable = false, length = 80)
	public String getDescunifcod() {
		return this.descunifcod;
	}

	public void setDescunifcod(String descunifcod) {
		this.descunifcod = descunifcod;
	}

	@Column(name = "CODTMP")
	public Integer getCodtmp() {
		return this.codtmp;
	}

	public void setCodtmp(Integer codtmp) {
		this.codtmp = codtmp;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgunifcod")
	public Set<Vdtransp> getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set<Vdtransp> vdtransps) {
		this.vdtransps = vdtransps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgunifcodByLffretefksgunifcodd")
	public Set<Lffrete> getLffretesForLffretefksgunifcodd() {
		return this.lffretesForLffretefksgunifcodd;
	}

	public void setLffretesForLffretefksgunifcodd(
			Set<Lffrete> lffretesForLffretefksgunifcodd) {
		this.lffretesForLffretefksgunifcodd = lffretesForLffretefksgunifcodd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgunifcodByLffretefksgunifcodr")
	public Set<Lffrete> getLffretesForLffretefksgunifcodr() {
		return this.lffretesForLffretefksgunifcodr;
	}

	public void setLffretesForLffretefksgunifcodr(
			Set<Lffrete> lffretesForLffretefksgunifcodr) {
		this.lffretesForLffretefksgunifcodr = lffretesForLffretefksgunifcodr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgunifcod")
	public Set<Sgfilial> getSgfilials() {
		return this.sgfilials;
	}

	public void setSgfilials(Set<Sgfilial> sgfilials) {
		this.sgfilials = sgfilials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgunifcod")
	public Set<Vdcliente> getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set<Vdcliente> vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgunifcod")
	public Set<Cpforneced> getCpforneceds() {
		return this.cpforneceds;
	}

	public void setCpforneceds(Set<Cpforneced> cpforneceds) {
		this.cpforneceds = cpforneceds;
	}

}

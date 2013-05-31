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
 * Lfmensagem generated by hbm2java
 */
@Entity
@Table(name = "LFMENSAGEM")
public class Lfmensagem implements java.io.Serializable {

	private LfmensagemId id;
	private String mens;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Eqtipomov> eqtipomovs = new HashSet<Eqtipomov>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens2 = new HashSet<Sgprefere1>(
			0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens3 = new HashSet<Sgprefere1>(
			0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens = new HashSet<Sgprefere1>(
			0);
	private Set<Lfitclfiscal> lfitclfiscals = new HashSet<Lfitclfiscal>(0);
	private Set<Vditvenda> vditvendas = new HashSet<Vditvenda>(0);

	public Lfmensagem() {
	}

	public Lfmensagem(LfmensagemId id, String mens, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.mens = mens;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfmensagem(LfmensagemId id, String mens, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Eqtipomov> eqtipomovs,
			Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens2,
			Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens3,
			Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens,
			Set<Lfitclfiscal> lfitclfiscals, Set<Vditvenda> vditvendas) {
		this.id = id;
		this.mens = mens;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqtipomovs = eqtipomovs;
		this.sgprefere1sForSgprefere1fklfmens2 = sgprefere1sForSgprefere1fklfmens2;
		this.sgprefere1sForSgprefere1fklfmens3 = sgprefere1sForSgprefere1fklfmens3;
		this.sgprefere1sForSgprefere1fklfmens = sgprefere1sForSgprefere1fklfmens;
		this.lfitclfiscals = lfitclfiscals;
		this.vditvendas = vditvendas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmens", column = @Column(name = "CODMENS", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfmensagemId getId() {
		return this.id;
	}

	public void setId(LfmensagemId id) {
		this.id = id;
	}

	@Column(name = "MENS", nullable = false, length = 10000)
	public String getMens() {
		return this.mens;
	}

	public void setMens(String mens) {
		this.mens = mens;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmensagem")
	public Set<Eqtipomov> getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set<Eqtipomov> eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmensagemBySgprefere1fklfmens2")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fklfmens2() {
		return this.sgprefere1sForSgprefere1fklfmens2;
	}

	public void setSgprefere1sForSgprefere1fklfmens2(
			Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens2) {
		this.sgprefere1sForSgprefere1fklfmens2 = sgprefere1sForSgprefere1fklfmens2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmensagemBySgprefere1fklfmens3")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fklfmens3() {
		return this.sgprefere1sForSgprefere1fklfmens3;
	}

	public void setSgprefere1sForSgprefere1fklfmens3(
			Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens3) {
		this.sgprefere1sForSgprefere1fklfmens3 = sgprefere1sForSgprefere1fklfmens3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmensagemBySgprefere1fklfmens")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fklfmens() {
		return this.sgprefere1sForSgprefere1fklfmens;
	}

	public void setSgprefere1sForSgprefere1fklfmens(
			Set<Sgprefere1> sgprefere1sForSgprefere1fklfmens) {
		this.sgprefere1sForSgprefere1fklfmens = sgprefere1sForSgprefere1fklfmens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmensagem")
	public Set<Lfitclfiscal> getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set<Lfitclfiscal> lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmensagem")
	public Set<Vditvenda> getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set<Vditvenda> vditvendas) {
		this.vditvendas = vditvendas;
	}

}

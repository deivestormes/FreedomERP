package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgittabela generated by hbm2java
 */
@Entity
@Table(name = "SGITTABELA")
public class Sgittabela implements java.io.Serializable {

	private SgittabelaId id;
	private Sgtabela sgtabela;
	private String descittb;
	private char padraoittb;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vdcliente> vdclientes = new HashSet<Vdcliente>(0);
	private Set<Vdstatusorc> vdstatusorcs = new HashSet<Vdstatusorc>(0);
	private Set<Sgprefere2> sgprefere2sForSgprefere2fksgitt2 = new HashSet<Sgprefere2>(
			0);
	private Set<Atconvatribtb> atconvatribtbs = new HashSet<Atconvatribtb>(0);
	private Set<Sgprefere2> sgprefere2sForSgprefere2fksgitta = new HashSet<Sgprefere2>(
			0);

	public Sgittabela() {
	}

	public Sgittabela(SgittabelaId id, Sgtabela sgtabela, String descittb,
			char padraoittb, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgtabela = sgtabela;
		this.descittb = descittb;
		this.padraoittb = padraoittb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgittabela(SgittabelaId id, Sgtabela sgtabela, String descittb,
			char padraoittb, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Vdcliente> vdclientes,
			Set<Vdstatusorc> vdstatusorcs,
			Set<Sgprefere2> sgprefere2sForSgprefere2fksgitt2,
			Set<Atconvatribtb> atconvatribtbs,
			Set<Sgprefere2> sgprefere2sForSgprefere2fksgitta) {
		this.id = id;
		this.sgtabela = sgtabela;
		this.descittb = descittb;
		this.padraoittb = padraoittb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.vdstatusorcs = vdstatusorcs;
		this.sgprefere2sForSgprefere2fksgitt2 = sgprefere2sForSgprefere2fksgitt2;
		this.atconvatribtbs = atconvatribtbs;
		this.sgprefere2sForSgprefere2fksgitta = sgprefere2sForSgprefere2fksgitta;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codittb", column = @Column(name = "CODITTB", nullable = false)),
			@AttributeOverride(name = "codtb", column = @Column(name = "CODTB", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgittabelaId getId() {
		return this.id;
	}

	public void setId(SgittabelaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTB", referencedColumnName = "CODTB", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgtabela getSgtabela() {
		return this.sgtabela;
	}

	public void setSgtabela(Sgtabela sgtabela) {
		this.sgtabela = sgtabela;
	}

	@Column(name = "DESCITTB", nullable = false, length = 50)
	public String getDescittb() {
		return this.descittb;
	}

	public void setDescittb(String descittb) {
		this.descittb = descittb;
	}

	@Column(name = "PADRAOITTB", nullable = false, length = 1)
	public char getPadraoittb() {
		return this.padraoittb;
	}

	public void setPadraoittb(char padraoittb) {
		this.padraoittb = padraoittb;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgittabela")
	public Set<Vdcliente> getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set<Vdcliente> vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgittabela")
	public Set<Vdstatusorc> getVdstatusorcs() {
		return this.vdstatusorcs;
	}

	public void setVdstatusorcs(Set<Vdstatusorc> vdstatusorcs) {
		this.vdstatusorcs = vdstatusorcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgittabelaBySgprefere2fksgitt2")
	public Set<Sgprefere2> getSgprefere2sForSgprefere2fksgitt2() {
		return this.sgprefere2sForSgprefere2fksgitt2;
	}

	public void setSgprefere2sForSgprefere2fksgitt2(
			Set<Sgprefere2> sgprefere2sForSgprefere2fksgitt2) {
		this.sgprefere2sForSgprefere2fksgitt2 = sgprefere2sForSgprefere2fksgitt2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgittabela")
	public Set<Atconvatribtb> getAtconvatribtbs() {
		return this.atconvatribtbs;
	}

	public void setAtconvatribtbs(Set<Atconvatribtb> atconvatribtbs) {
		this.atconvatribtbs = atconvatribtbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgittabelaBySgprefere2fksgitta")
	public Set<Sgprefere2> getSgprefere2sForSgprefere2fksgitta() {
		return this.sgprefere2sForSgprefere2fksgitta;
	}

	public void setSgprefere2sForSgprefere2fksgitta(
			Set<Sgprefere2> sgprefere2sForSgprefere2fksgitta) {
		this.sgprefere2sForSgprefere2fksgitta = sgprefere2sForSgprefere2fksgitta;
	}

}

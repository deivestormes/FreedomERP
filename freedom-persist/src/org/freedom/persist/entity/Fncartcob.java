package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Fncartcob generated by hbm2java
 */
@Entity
@Table(name = "FNCARTCOB")
public class Fncartcob implements java.io.Serializable {

	private FncartcobId id;
	private Fnbanco fnbanco;
	private String variacaocartcob;
	private String desccartcob;
	private String cartcobcnab;
	private Character codcartcobcnab;
	private String convcob;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnrecebers = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set fnitrecebers = new HashSet(0);
	private Set fnitmodboletos = new HashSet(0);
	private Set vdmodcontrs = new HashSet(0);
	private Set vdclientes = new HashSet(0);

	public Fncartcob() {
	}

	public Fncartcob(FncartcobId id, Fnbanco fnbanco, String desccartcob,
			String cartcobcnab, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.desccartcob = desccartcob;
		this.cartcobcnab = cartcobcnab;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fncartcob(FncartcobId id, Fnbanco fnbanco, String variacaocartcob,
			String desccartcob, String cartcobcnab, Character codcartcobcnab,
			String convcob, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set fnrecebers, Set vdvendas,
			Set fnitrecebers, Set fnitmodboletos, Set vdmodcontrs,
			Set vdclientes) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.variacaocartcob = variacaocartcob;
		this.desccartcob = desccartcob;
		this.cartcobcnab = cartcobcnab;
		this.codcartcobcnab = codcartcobcnab;
		this.convcob = convcob;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnrecebers = fnrecebers;
		this.vdvendas = vdvendas;
		this.fnitrecebers = fnitrecebers;
		this.fnitmodboletos = fnitmodboletos;
		this.vdmodcontrs = vdmodcontrs;
		this.vdclientes = vdclientes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcartcob", column = @Column(name = "CODCARTCOB", nullable = false, length = 3)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codbanco", column = @Column(name = "CODBANCO", nullable = false, length = 3)),
			@AttributeOverride(name = "codfilialbo", column = @Column(name = "CODFILIALBO", nullable = false)),
			@AttributeOverride(name = "codempbo", column = @Column(name = "CODEMPBO", nullable = false)) })
	public FncartcobId getId() {
		return this.id;
	}

	public void setId(FncartcobId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@Column(name = "VARIACAOCARTCOB", length = 10)
	public String getVariacaocartcob() {
		return this.variacaocartcob;
	}

	public void setVariacaocartcob(String variacaocartcob) {
		this.variacaocartcob = variacaocartcob;
	}

	@Column(name = "DESCCARTCOB", nullable = false, length = 50)
	public String getDesccartcob() {
		return this.desccartcob;
	}

	public void setDesccartcob(String desccartcob) {
		this.desccartcob = desccartcob;
	}

	@Column(name = "CARTCOBCNAB", nullable = false, length = 3)
	public String getCartcobcnab() {
		return this.cartcobcnab;
	}

	public void setCartcobcnab(String cartcobcnab) {
		this.cartcobcnab = cartcobcnab;
	}

	@Column(name = "CODCARTCOBCNAB", length = 1)
	public Character getCodcartcobcnab() {
		return this.codcartcobcnab;
	}

	public void setCodcartcobcnab(Character codcartcobcnab) {
		this.codcartcobcnab = codcartcobcnab;
	}

	@Column(name = "CONVCOB", length = 20)
	public String getConvcob() {
		return this.convcob;
	}

	public void setConvcob(String convcob) {
		this.convcob = convcob;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncartcob")
	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncartcob")
	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncartcob")
	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncartcob")
	public Set getFnitmodboletos() {
		return this.fnitmodboletos;
	}

	public void setFnitmodboletos(Set fnitmodboletos) {
		this.fnitmodboletos = fnitmodboletos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncartcob")
	public Set getVdmodcontrs() {
		return this.vdmodcontrs;
	}

	public void setVdmodcontrs(Set vdmodcontrs) {
		this.vdmodcontrs = vdmodcontrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncartcob")
	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}
*/
}

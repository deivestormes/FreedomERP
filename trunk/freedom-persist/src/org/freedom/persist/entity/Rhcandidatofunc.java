package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rhcandidatofunc generated by hbm2java
 */
@Entity
@Table(name = "RHCANDIDATOFUNC")
public class Rhcandidatofunc implements java.io.Serializable {

	private RhcandidatofuncId id;
	private Rhcandidato rhcandidato;
	private Rhfuncao rhfuncao;
	private String empresa;
	private Date dtinifunc;
	private Date dtfimfunc;
	private String obsfunc;
	private BigDecimal salario;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhcandidatofunc() {
	}

	public Rhcandidatofunc(RhcandidatofuncId id, Rhcandidato rhcandidato,
			Rhfuncao rhfuncao, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.rhcandidato = rhcandidato;
		this.rhfuncao = rhfuncao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcandidatofunc(RhcandidatofuncId id, Rhcandidato rhcandidato,
			Rhfuncao rhfuncao, String empresa, Date dtinifunc, Date dtfimfunc,
			String obsfunc, BigDecimal salario, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.rhcandidato = rhcandidato;
		this.rhfuncao = rhfuncao;
		this.empresa = empresa;
		this.dtinifunc = dtinifunc;
		this.dtfimfunc = dtfimfunc;
		this.obsfunc = obsfunc;
		this.salario = salario;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcand", column = @Column(name = "CODCAND", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfunc", column = @Column(name = "CODFUNC", nullable = false)),
			@AttributeOverride(name = "codfilialfc", column = @Column(name = "CODFILIALFC", nullable = false)),
			@AttributeOverride(name = "codempfc", column = @Column(name = "CODEMPFC", nullable = false)),
			@AttributeOverride(name = "seqcandfunc", column = @Column(name = "SEQCANDFUNC", nullable = false)) })
	public RhcandidatofuncId getId() {
		return this.id;
	}

	public void setId(RhcandidatofuncId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAND", referencedColumnName = "CODCAND", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhcandidato getRhcandidato() {
		return this.rhcandidato;
	}

	public void setRhcandidato(Rhcandidato rhcandidato) {
		this.rhcandidato = rhcandidato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFUNC", referencedColumnName = "CODFUNC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALFC", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPFC", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhfuncao getRhfuncao() {
		return this.rhfuncao;
	}

	public void setRhfuncao(Rhfuncao rhfuncao) {
		this.rhfuncao = rhfuncao;
	}

	@Column(name = "EMPRESA", length = 60)
	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINIFUNC", length = 10)
	public Date getDtinifunc() {
		return this.dtinifunc;
	}

	public void setDtinifunc(Date dtinifunc) {
		this.dtinifunc = dtinifunc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTFIMFUNC", length = 10)
	public Date getDtfimfunc() {
		return this.dtfimfunc;
	}

	public void setDtfimfunc(Date dtfimfunc) {
		this.dtfimfunc = dtfimfunc;
	}

	@Column(name = "OBSFUNC", length = 500)
	public String getObsfunc() {
		return this.obsfunc;
	}

	public void setObsfunc(String obsfunc) {
		this.obsfunc = obsfunc;
	}

	@Column(name = "SALARIO", precision = 15, scale = 5)
	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
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

}

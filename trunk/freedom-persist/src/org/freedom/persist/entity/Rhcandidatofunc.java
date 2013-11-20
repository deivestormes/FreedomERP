package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Rhcandidatofunc generated by hbm2java
 */
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

	public RhcandidatofuncId getId() {
		return this.id;
	}

	public void setId(RhcandidatofuncId id) {
		this.id = id;
	}

	public Rhcandidato getRhcandidato() {
		return this.rhcandidato;
	}

	public void setRhcandidato(Rhcandidato rhcandidato) {
		this.rhcandidato = rhcandidato;
	}

	public Rhfuncao getRhfuncao() {
		return this.rhfuncao;
	}

	public void setRhfuncao(Rhfuncao rhfuncao) {
		this.rhfuncao = rhfuncao;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Date getDtinifunc() {
		return this.dtinifunc;
	}

	public void setDtinifunc(Date dtinifunc) {
		this.dtinifunc = dtinifunc;
	}

	public Date getDtfimfunc() {
		return this.dtfimfunc;
	}

	public void setDtfimfunc(Date dtfimfunc) {
		this.dtfimfunc = dtfimfunc;
	}

	public String getObsfunc() {
		return this.obsfunc;
	}

	public void setObsfunc(String obsfunc) {
		this.obsfunc = obsfunc;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
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

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cpsolicitacao generated by hbm2java
 */
public class Cpsolicitacao implements java.io.Serializable {

	private CpsolicitacaoId id;
	private Sgfilial sgfilial;
	private Sgusuario sgusuario;
	private Fncc fncc;
	private Date dtemitsol;
	private String sitsol;
	private String origsol;
	private String motivosol;
	private Date dtaaprovsol;
	private Integer codempua;
	private Short codfilialua;
	private String idusuaprov;
	private String idusucancsol;
	private String motivocancsol;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set cpcompras = new HashSet(0);
	private Set cpitsolicitacaos = new HashSet(0);

	public Cpsolicitacao() {
	}

	public Cpsolicitacao(CpsolicitacaoId id, Sgfilial sgfilial,
			Sgusuario sgusuario, Fncc fncc, Date dtemitsol, String sitsol,
			String origsol, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgusuario = sgusuario;
		this.fncc = fncc;
		this.dtemitsol = dtemitsol;
		this.sitsol = sitsol;
		this.origsol = origsol;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpsolicitacao(CpsolicitacaoId id, Sgfilial sgfilial,
			Sgusuario sgusuario, Fncc fncc, Date dtemitsol, String sitsol,
			String origsol, String motivosol, Date dtaaprovsol,
			Integer codempua, Short codfilialua, String idusuaprov,
			String idusucancsol, String motivocancsol, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set cpcompras, Set cpitsolicitacaos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgusuario = sgusuario;
		this.fncc = fncc;
		this.dtemitsol = dtemitsol;
		this.sitsol = sitsol;
		this.origsol = origsol;
		this.motivosol = motivosol;
		this.dtaaprovsol = dtaaprovsol;
		this.codempua = codempua;
		this.codfilialua = codfilialua;
		this.idusuaprov = idusuaprov;
		this.idusucancsol = idusucancsol;
		this.motivocancsol = motivocancsol;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpcompras = cpcompras;
		this.cpitsolicitacaos = cpitsolicitacaos;
	}

	public CpsolicitacaoId getId() {
		return this.id;
	}

	public void setId(CpsolicitacaoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public Date getDtemitsol() {
		return this.dtemitsol;
	}

	public void setDtemitsol(Date dtemitsol) {
		this.dtemitsol = dtemitsol;
	}

	public String getSitsol() {
		return this.sitsol;
	}

	public void setSitsol(String sitsol) {
		this.sitsol = sitsol;
	}

	public String getOrigsol() {
		return this.origsol;
	}

	public void setOrigsol(String origsol) {
		this.origsol = origsol;
	}

	public String getMotivosol() {
		return this.motivosol;
	}

	public void setMotivosol(String motivosol) {
		this.motivosol = motivosol;
	}

	public Date getDtaaprovsol() {
		return this.dtaaprovsol;
	}

	public void setDtaaprovsol(Date dtaaprovsol) {
		this.dtaaprovsol = dtaaprovsol;
	}

	public Integer getCodempua() {
		return this.codempua;
	}

	public void setCodempua(Integer codempua) {
		this.codempua = codempua;
	}

	public Short getCodfilialua() {
		return this.codfilialua;
	}

	public void setCodfilialua(Short codfilialua) {
		this.codfilialua = codfilialua;
	}

	public String getIdusuaprov() {
		return this.idusuaprov;
	}

	public void setIdusuaprov(String idusuaprov) {
		this.idusuaprov = idusuaprov;
	}

	public String getIdusucancsol() {
		return this.idusucancsol;
	}

	public void setIdusucancsol(String idusucancsol) {
		this.idusucancsol = idusucancsol;
	}

	public String getMotivocancsol() {
		return this.motivocancsol;
	}

	public void setMotivocancsol(String motivocancsol) {
		this.motivocancsol = motivocancsol;
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

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	public Set getCpitsolicitacaos() {
		return this.cpitsolicitacaos;
	}

	public void setCpitsolicitacaos(Set cpitsolicitacaos) {
		this.cpitsolicitacaos = cpitsolicitacaos;
	}

}

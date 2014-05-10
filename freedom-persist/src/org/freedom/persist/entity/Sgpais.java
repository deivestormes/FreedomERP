package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgpais generated by hbm2java
 */
public class Sgpais implements java.io.Serializable {

	private short codpais;
	private String nomepais;
	private String sigla3cpais;
	private Short ddipais;
	private String sigla2cpais;
	private Integer codbacenpais;
	private String codeanpais;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgufs = new HashSet(0);

	public Sgpais() {
	}

	public Sgpais(short codpais, String nomepais, String sigla3cpais,
			String sigla2cpais, Date dtins, Date hins, String idusuins) {
		this.codpais = codpais;
		this.nomepais = nomepais;
		this.sigla3cpais = sigla3cpais;
		this.sigla2cpais = sigla2cpais;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgpais(short codpais, String nomepais, String sigla3cpais,
			Short ddipais, String sigla2cpais, Integer codbacenpais,
			String codeanpais, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set sgufs) {
		this.codpais = codpais;
		this.nomepais = nomepais;
		this.sigla3cpais = sigla3cpais;
		this.ddipais = ddipais;
		this.sigla2cpais = sigla2cpais;
		this.codbacenpais = codbacenpais;
		this.codeanpais = codeanpais;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgufs = sgufs;
	}

	public short getCodpais() {
		return this.codpais;
	}

	public void setCodpais(short codpais) {
		this.codpais = codpais;
	}

	public String getNomepais() {
		return this.nomepais;
	}

	public void setNomepais(String nomepais) {
		this.nomepais = nomepais;
	}

	public String getSigla3cpais() {
		return this.sigla3cpais;
	}

	public void setSigla3cpais(String sigla3cpais) {
		this.sigla3cpais = sigla3cpais;
	}

	public Short getDdipais() {
		return this.ddipais;
	}

	public void setDdipais(Short ddipais) {
		this.ddipais = ddipais;
	}

	public String getSigla2cpais() {
		return this.sigla2cpais;
	}

	public void setSigla2cpais(String sigla2cpais) {
		this.sigla2cpais = sigla2cpais;
	}

	public Integer getCodbacenpais() {
		return this.codbacenpais;
	}

	public void setCodbacenpais(Integer codbacenpais) {
		this.codbacenpais = codbacenpais;
	}

	public String getCodeanpais() {
		return this.codeanpais;
	}

	public void setCodeanpais(String codeanpais) {
		this.codeanpais = codeanpais;
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

	public Set getSgufs() {
		return this.sgufs;
	}

	public void setSgufs(Set sgufs) {
		this.sgufs = sgufs;
	}

}

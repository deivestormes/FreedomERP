package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqitrecmercitos generated by hbm2java
 */
public class Eqitrecmercitos implements java.io.Serializable {

	private EqitrecmercitosId id;
	private Sgfilial sgfilial;
	private Eqserie eqserie;
	private Eqitrecmerc eqitrecmerc;
	private Eqproduto eqproduto;
	private String refprodpd;
	private BigDecimal qtditos;
	private String obsitos;
	private String statusitos;
	private Character gerarma;
	private Character gerachamado;
	private Character geranovo;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppops = new HashSet(0);
	private Set eqitrmas = new HashSet(0);
	private Set eqitrecmercitositorcs = new HashSet(0);
	private Set crchamados = new HashSet(0);

	public Eqitrecmercitos() {
	}

	public Eqitrecmercitos(EqitrecmercitosId id, Sgfilial sgfilial,
			Eqserie eqserie, Eqitrecmerc eqitrecmerc, Eqproduto eqproduto,
			String refprodpd, BigDecimal qtditos, String statusitos,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqserie = eqserie;
		this.eqitrecmerc = eqitrecmerc;
		this.eqproduto = eqproduto;
		this.refprodpd = refprodpd;
		this.qtditos = qtditos;
		this.statusitos = statusitos;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrecmercitos(EqitrecmercitosId id, Sgfilial sgfilial,
			Eqserie eqserie, Eqitrecmerc eqitrecmerc, Eqproduto eqproduto,
			String refprodpd, BigDecimal qtditos, String obsitos,
			String statusitos, Character gerarma, Character gerachamado,
			Character geranovo, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt, Set ppops,
			Set eqitrmas, Set eqitrecmercitositorcs, Set crchamados) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqserie = eqserie;
		this.eqitrecmerc = eqitrecmerc;
		this.eqproduto = eqproduto;
		this.refprodpd = refprodpd;
		this.qtditos = qtditos;
		this.obsitos = obsitos;
		this.statusitos = statusitos;
		this.gerarma = gerarma;
		this.gerachamado = gerachamado;
		this.geranovo = geranovo;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppops = ppops;
		this.eqitrmas = eqitrmas;
		this.eqitrecmercitositorcs = eqitrecmercitositorcs;
		this.crchamados = crchamados;
	}

	public EqitrecmercitosId getId() {
		return this.id;
	}

	public void setId(EqitrecmercitosId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqserie getEqserie() {
		return this.eqserie;
	}

	public void setEqserie(Eqserie eqserie) {
		this.eqserie = eqserie;
	}

	public Eqitrecmerc getEqitrecmerc() {
		return this.eqitrecmerc;
	}

	public void setEqitrecmerc(Eqitrecmerc eqitrecmerc) {
		this.eqitrecmerc = eqitrecmerc;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public String getRefprodpd() {
		return this.refprodpd;
	}

	public void setRefprodpd(String refprodpd) {
		this.refprodpd = refprodpd;
	}

	public BigDecimal getQtditos() {
		return this.qtditos;
	}

	public void setQtditos(BigDecimal qtditos) {
		this.qtditos = qtditos;
	}

	public String getObsitos() {
		return this.obsitos;
	}

	public void setObsitos(String obsitos) {
		this.obsitos = obsitos;
	}

	public String getStatusitos() {
		return this.statusitos;
	}

	public void setStatusitos(String statusitos) {
		this.statusitos = statusitos;
	}

	public Character getGerarma() {
		return this.gerarma;
	}

	public void setGerarma(Character gerarma) {
		this.gerarma = gerarma;
	}

	public Character getGerachamado() {
		return this.gerachamado;
	}

	public void setGerachamado(Character gerachamado) {
		this.gerachamado = gerachamado;
	}

	public Character getGeranovo() {
		return this.geranovo;
	}

	public void setGeranovo(Character geranovo) {
		this.geranovo = geranovo;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

	public Set getPpops() {
		return this.ppops;
	}

	public void setPpops(Set ppops) {
		this.ppops = ppops;
	}

	public Set getEqitrmas() {
		return this.eqitrmas;
	}

	public void setEqitrmas(Set eqitrmas) {
		this.eqitrmas = eqitrmas;
	}

	public Set getEqitrecmercitositorcs() {
		return this.eqitrecmercitositorcs;
	}

	public void setEqitrecmercitositorcs(Set eqitrecmercitositorcs) {
		this.eqitrecmercitositorcs = eqitrecmercitositorcs;
	}

	public Set getCrchamados() {
		return this.crchamados;
	}

	public void setCrchamados(Set crchamados) {
		this.crchamados = crchamados;
	}

}

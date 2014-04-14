package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnpagtocomi generated by hbm2java
 */
public class Fnpagtocomi implements java.io.Serializable {

	private FnpagtocomiId id;
	private Sgfilial sgfilial;
	private Fnplanejamento fnplanejamento;
	private Fnconta fnconta;
	private int codempca;
	private short codfilialca;
	private BigDecimal vlrpcomi;
	private int docpcomi;
	private String obspcomi;
	private Date dtcomppcomi;
	private Date datapcomi;
	private Character flag;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnlancas = new HashSet(0);
	private Set vdcomissaos = new HashSet(0);

	public Fnpagtocomi() {
	}

	public Fnpagtocomi(FnpagtocomiId id, Sgfilial sgfilial,
			Fnplanejamento fnplanejamento, Fnconta fnconta, int codempca,
			short codfilialca, int docpcomi, Date dtcomppcomi, Date datapcomi,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnplanejamento = fnplanejamento;
		this.fnconta = fnconta;
		this.codempca = codempca;
		this.codfilialca = codfilialca;
		this.docpcomi = docpcomi;
		this.dtcomppcomi = dtcomppcomi;
		this.datapcomi = datapcomi;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnpagtocomi(FnpagtocomiId id, Sgfilial sgfilial,
			Fnplanejamento fnplanejamento, Fnconta fnconta, int codempca,
			short codfilialca, BigDecimal vlrpcomi, int docpcomi,
			String obspcomi, Date dtcomppcomi, Date datapcomi, Character flag,
			char emmanut, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set fnlancas, Set vdcomissaos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnplanejamento = fnplanejamento;
		this.fnconta = fnconta;
		this.codempca = codempca;
		this.codfilialca = codfilialca;
		this.vlrpcomi = vlrpcomi;
		this.docpcomi = docpcomi;
		this.obspcomi = obspcomi;
		this.dtcomppcomi = dtcomppcomi;
		this.datapcomi = datapcomi;
		this.flag = flag;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnlancas = fnlancas;
		this.vdcomissaos = vdcomissaos;
	}

	public FnpagtocomiId getId() {
		return this.id;
	}

	public void setId(FnpagtocomiId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public int getCodempca() {
		return this.codempca;
	}

	public void setCodempca(int codempca) {
		this.codempca = codempca;
	}

	public short getCodfilialca() {
		return this.codfilialca;
	}

	public void setCodfilialca(short codfilialca) {
		this.codfilialca = codfilialca;
	}

	public BigDecimal getVlrpcomi() {
		return this.vlrpcomi;
	}

	public void setVlrpcomi(BigDecimal vlrpcomi) {
		this.vlrpcomi = vlrpcomi;
	}

	public int getDocpcomi() {
		return this.docpcomi;
	}

	public void setDocpcomi(int docpcomi) {
		this.docpcomi = docpcomi;
	}

	public String getObspcomi() {
		return this.obspcomi;
	}

	public void setObspcomi(String obspcomi) {
		this.obspcomi = obspcomi;
	}

	public Date getDtcomppcomi() {
		return this.dtcomppcomi;
	}

	public void setDtcomppcomi(Date dtcomppcomi) {
		this.dtcomppcomi = dtcomppcomi;
	}

	public Date getDatapcomi() {
		return this.datapcomi;
	}

	public void setDatapcomi(Date datapcomi) {
		this.datapcomi = datapcomi;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
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

	public Set getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set fnlancas) {
		this.fnlancas = fnlancas;
	}

	public Set getVdcomissaos() {
		return this.vdcomissaos;
	}

	public void setVdcomissaos(Set vdcomissaos) {
		this.vdcomissaos = vdcomissaos;
	}

}

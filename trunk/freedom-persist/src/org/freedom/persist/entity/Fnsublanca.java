package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnsublanca generated by hbm2java
 */
public class Fnsublanca implements java.io.Serializable {

	private FnsublancaId id;
	private Fnitpagar fnitpagar;
	private Fnitreceber fnitreceber;
	private Cpforneced cpforneced;
	private Vdcliente vdcliente;
	private Fnplanejamento fnplanejamento;
	private Vditcontrato vditcontrato;
	private Fnlanca fnlanca;
	private Fncc fncc;
	private String statussublanca;
	private Character origsublanca;
	private Date dtcompsublanca;
	private Date dtprevsublanca;
	private char tiposublanca;
	private Date datasublanca;
	private BigDecimal vlrsublanca;
	private Character flag;
	private String histsublanca;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdconsignacaosForVdconsigfkfnsublancadev = new HashSet(0);
	private Set vdvendaconsigsForVdvendaconsigfkfnsublanca = new HashSet(0);
	private Set vdconsignacaosForVdconsigfkfnsublanca = new HashSet(0);
	private Set vdvendaconsigsForVdvendaconsigfkfnsublancasc = new HashSet(0);

	public Fnsublanca() {
	}

	public Fnsublanca(FnsublancaId id, Fnplanejamento fnplanejamento,
			Fnlanca fnlanca, String statussublanca, Date dtcompsublanca,
			char tiposublanca, char emmanut, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.fnplanejamento = fnplanejamento;
		this.fnlanca = fnlanca;
		this.statussublanca = statussublanca;
		this.dtcompsublanca = dtcompsublanca;
		this.tiposublanca = tiposublanca;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnsublanca(FnsublancaId id, Fnitpagar fnitpagar,
			Fnitreceber fnitreceber, Cpforneced cpforneced,
			Vdcliente vdcliente, Fnplanejamento fnplanejamento,
			Vditcontrato vditcontrato, Fnlanca fnlanca, Fncc fncc,
			String statussublanca, Character origsublanca, Date dtcompsublanca,
			Date dtprevsublanca, char tiposublanca, Date datasublanca,
			BigDecimal vlrsublanca, Character flag, String histsublanca,
			char emmanut, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt,
			Set vdconsignacaosForVdconsigfkfnsublancadev,
			Set vdvendaconsigsForVdvendaconsigfkfnsublanca,
			Set vdconsignacaosForVdconsigfkfnsublanca,
			Set vdvendaconsigsForVdvendaconsigfkfnsublancasc) {
		this.id = id;
		this.fnitpagar = fnitpagar;
		this.fnitreceber = fnitreceber;
		this.cpforneced = cpforneced;
		this.vdcliente = vdcliente;
		this.fnplanejamento = fnplanejamento;
		this.vditcontrato = vditcontrato;
		this.fnlanca = fnlanca;
		this.fncc = fncc;
		this.statussublanca = statussublanca;
		this.origsublanca = origsublanca;
		this.dtcompsublanca = dtcompsublanca;
		this.dtprevsublanca = dtprevsublanca;
		this.tiposublanca = tiposublanca;
		this.datasublanca = datasublanca;
		this.vlrsublanca = vlrsublanca;
		this.flag = flag;
		this.histsublanca = histsublanca;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdconsignacaosForVdconsigfkfnsublancadev = vdconsignacaosForVdconsigfkfnsublancadev;
		this.vdvendaconsigsForVdvendaconsigfkfnsublanca = vdvendaconsigsForVdvendaconsigfkfnsublanca;
		this.vdconsignacaosForVdconsigfkfnsublanca = vdconsignacaosForVdconsigfkfnsublanca;
		this.vdvendaconsigsForVdvendaconsigfkfnsublancasc = vdvendaconsigsForVdvendaconsigfkfnsublancasc;
	}

	public FnsublancaId getId() {
		return this.id;
	}

	public void setId(FnsublancaId id) {
		this.id = id;
	}

	public Fnitpagar getFnitpagar() {
		return this.fnitpagar;
	}

	public void setFnitpagar(Fnitpagar fnitpagar) {
		this.fnitpagar = fnitpagar;
	}

	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	public Fnlanca getFnlanca() {
		return this.fnlanca;
	}

	public void setFnlanca(Fnlanca fnlanca) {
		this.fnlanca = fnlanca;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public String getStatussublanca() {
		return this.statussublanca;
	}

	public void setStatussublanca(String statussublanca) {
		this.statussublanca = statussublanca;
	}

	public Character getOrigsublanca() {
		return this.origsublanca;
	}

	public void setOrigsublanca(Character origsublanca) {
		this.origsublanca = origsublanca;
	}

	public Date getDtcompsublanca() {
		return this.dtcompsublanca;
	}

	public void setDtcompsublanca(Date dtcompsublanca) {
		this.dtcompsublanca = dtcompsublanca;
	}

	public Date getDtprevsublanca() {
		return this.dtprevsublanca;
	}

	public void setDtprevsublanca(Date dtprevsublanca) {
		this.dtprevsublanca = dtprevsublanca;
	}

	public char getTiposublanca() {
		return this.tiposublanca;
	}

	public void setTiposublanca(char tiposublanca) {
		this.tiposublanca = tiposublanca;
	}

	public Date getDatasublanca() {
		return this.datasublanca;
	}

	public void setDatasublanca(Date datasublanca) {
		this.datasublanca = datasublanca;
	}

	public BigDecimal getVlrsublanca() {
		return this.vlrsublanca;
	}

	public void setVlrsublanca(BigDecimal vlrsublanca) {
		this.vlrsublanca = vlrsublanca;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public String getHistsublanca() {
		return this.histsublanca;
	}

	public void setHistsublanca(String histsublanca) {
		this.histsublanca = histsublanca;
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

	public Set getVdconsignacaosForVdconsigfkfnsublancadev() {
		return this.vdconsignacaosForVdconsigfkfnsublancadev;
	}

	public void setVdconsignacaosForVdconsigfkfnsublancadev(
			Set vdconsignacaosForVdconsigfkfnsublancadev) {
		this.vdconsignacaosForVdconsigfkfnsublancadev = vdconsignacaosForVdconsigfkfnsublancadev;
	}

	public Set getVdvendaconsigsForVdvendaconsigfkfnsublanca() {
		return this.vdvendaconsigsForVdvendaconsigfkfnsublanca;
	}

	public void setVdvendaconsigsForVdvendaconsigfkfnsublanca(
			Set vdvendaconsigsForVdvendaconsigfkfnsublanca) {
		this.vdvendaconsigsForVdvendaconsigfkfnsublanca = vdvendaconsigsForVdvendaconsigfkfnsublanca;
	}

	public Set getVdconsignacaosForVdconsigfkfnsublanca() {
		return this.vdconsignacaosForVdconsigfkfnsublanca;
	}

	public void setVdconsignacaosForVdconsigfkfnsublanca(
			Set vdconsignacaosForVdconsigfkfnsublanca) {
		this.vdconsignacaosForVdconsigfkfnsublanca = vdconsignacaosForVdconsigfkfnsublanca;
	}

	public Set getVdvendaconsigsForVdvendaconsigfkfnsublancasc() {
		return this.vdvendaconsigsForVdvendaconsigfkfnsublancasc;
	}

	public void setVdvendaconsigsForVdvendaconsigfkfnsublancasc(
			Set vdvendaconsigsForVdvendaconsigfkfnsublancasc) {
		this.vdvendaconsigsForVdvendaconsigfkfnsublancasc = vdvendaconsigsForVdvendaconsigfkfnsublancasc;
	}

}

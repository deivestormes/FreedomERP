package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnplanopag generated by hbm2java
 */
public class Fnplanopag implements java.io.Serializable {

	private FnplanopagId id;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fnplanejamento fnplanejamento;
	private Fntbjuros fntbjuros;
	private Fncc fncc;
	private String descplanopag;
	private int parcplanopag;
	private char aporcplanopag;
	private Character autobaixaplanopag;
	private char ativoplanopag;
	private char cvplanopag;
	private BigDecimal percdesc;
	private char regrvctoplanopag;
	private char rvsabplanopag;
	private char rvdomplanopag;
	private char rvferplanopag;
	private char rvdiaplanopag;
	private short diavctoplanopag;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdprecoprods = new HashSet(0);
	private Set fnrenegrecs = new HashSet(0);
	private Set vdclientes = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set sgprefere4s = new HashSet(0);
	private Set sgprefere8s = new HashSet(0);
	private Set cpcompras = new HashSet(0);
	private Set fnpagars = new HashSet(0);
	private Set sgprefere1sForSgprefere1fkfnplan = new HashSet(0);
	private Set cpordcompras = new HashSet(0);
	private Set cpcotacaos = new HashSet(0);
	private Set sgprefere1sForSgprefere1fkplanopagsv = new HashSet(0);
	private Set fnparcpags = new HashSet(0);
	private Set eqtipomovs = new HashSet(0);
	private Set vdvendaconsigs = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set vdorcamentos = new HashSet(0);
	private Set cpimportacaos = new HashSet(0);

	public Fnplanopag() {
	}

	public Fnplanopag(FnplanopagId id, Sgfilial sgfilial, int parcplanopag,
			char aporcplanopag, char ativoplanopag, char cvplanopag,
			char regrvctoplanopag, char rvsabplanopag, char rvdomplanopag,
			char rvferplanopag, char rvdiaplanopag, short diavctoplanopag,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.parcplanopag = parcplanopag;
		this.aporcplanopag = aporcplanopag;
		this.ativoplanopag = ativoplanopag;
		this.cvplanopag = cvplanopag;
		this.regrvctoplanopag = regrvctoplanopag;
		this.rvsabplanopag = rvsabplanopag;
		this.rvdomplanopag = rvdomplanopag;
		this.rvferplanopag = rvferplanopag;
		this.rvdiaplanopag = rvdiaplanopag;
		this.diavctoplanopag = diavctoplanopag;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnplanopag(FnplanopagId id, Sgfilial sgfilial, Fnconta fnconta,
			Fnplanejamento fnplanejamento, Fntbjuros fntbjuros, Fncc fncc,
			String descplanopag, int parcplanopag, char aporcplanopag,
			Character autobaixaplanopag, char ativoplanopag, char cvplanopag,
			BigDecimal percdesc, char regrvctoplanopag, char rvsabplanopag,
			char rvdomplanopag, char rvferplanopag, char rvdiaplanopag,
			short diavctoplanopag, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set vdprecoprods,
			Set fnrenegrecs, Set vdclientes, Set fnrecebers, Set sgprefere4s,
			Set sgprefere8s, Set cpcompras, Set fnpagars,
			Set sgprefere1sForSgprefere1fkfnplan, Set cpordcompras,
			Set cpcotacaos, Set sgprefere1sForSgprefere1fkplanopagsv,
			Set fnparcpags, Set eqtipomovs, Set vdvendaconsigs, Set vdvendas,
			Set vdorcamentos, Set cpimportacaos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fnplanejamento = fnplanejamento;
		this.fntbjuros = fntbjuros;
		this.fncc = fncc;
		this.descplanopag = descplanopag;
		this.parcplanopag = parcplanopag;
		this.aporcplanopag = aporcplanopag;
		this.autobaixaplanopag = autobaixaplanopag;
		this.ativoplanopag = ativoplanopag;
		this.cvplanopag = cvplanopag;
		this.percdesc = percdesc;
		this.regrvctoplanopag = regrvctoplanopag;
		this.rvsabplanopag = rvsabplanopag;
		this.rvdomplanopag = rvdomplanopag;
		this.rvferplanopag = rvferplanopag;
		this.rvdiaplanopag = rvdiaplanopag;
		this.diavctoplanopag = diavctoplanopag;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdprecoprods = vdprecoprods;
		this.fnrenegrecs = fnrenegrecs;
		this.vdclientes = vdclientes;
		this.fnrecebers = fnrecebers;
		this.sgprefere4s = sgprefere4s;
		this.sgprefere8s = sgprefere8s;
		this.cpcompras = cpcompras;
		this.fnpagars = fnpagars;
		this.sgprefere1sForSgprefere1fkfnplan = sgprefere1sForSgprefere1fkfnplan;
		this.cpordcompras = cpordcompras;
		this.cpcotacaos = cpcotacaos;
		this.sgprefere1sForSgprefere1fkplanopagsv = sgprefere1sForSgprefere1fkplanopagsv;
		this.fnparcpags = fnparcpags;
		this.eqtipomovs = eqtipomovs;
		this.vdvendaconsigs = vdvendaconsigs;
		this.vdvendas = vdvendas;
		this.vdorcamentos = vdorcamentos;
		this.cpimportacaos = cpimportacaos;
	}

	public FnplanopagId getId() {
		return this.id;
	}

	public void setId(FnplanopagId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Fntbjuros getFntbjuros() {
		return this.fntbjuros;
	}

	public void setFntbjuros(Fntbjuros fntbjuros) {
		this.fntbjuros = fntbjuros;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public String getDescplanopag() {
		return this.descplanopag;
	}

	public void setDescplanopag(String descplanopag) {
		this.descplanopag = descplanopag;
	}

	public int getParcplanopag() {
		return this.parcplanopag;
	}

	public void setParcplanopag(int parcplanopag) {
		this.parcplanopag = parcplanopag;
	}

	public char getAporcplanopag() {
		return this.aporcplanopag;
	}

	public void setAporcplanopag(char aporcplanopag) {
		this.aporcplanopag = aporcplanopag;
	}

	public Character getAutobaixaplanopag() {
		return this.autobaixaplanopag;
	}

	public void setAutobaixaplanopag(Character autobaixaplanopag) {
		this.autobaixaplanopag = autobaixaplanopag;
	}

	public char getAtivoplanopag() {
		return this.ativoplanopag;
	}

	public void setAtivoplanopag(char ativoplanopag) {
		this.ativoplanopag = ativoplanopag;
	}

	public char getCvplanopag() {
		return this.cvplanopag;
	}

	public void setCvplanopag(char cvplanopag) {
		this.cvplanopag = cvplanopag;
	}

	public BigDecimal getPercdesc() {
		return this.percdesc;
	}

	public void setPercdesc(BigDecimal percdesc) {
		this.percdesc = percdesc;
	}

	public char getRegrvctoplanopag() {
		return this.regrvctoplanopag;
	}

	public void setRegrvctoplanopag(char regrvctoplanopag) {
		this.regrvctoplanopag = regrvctoplanopag;
	}

	public char getRvsabplanopag() {
		return this.rvsabplanopag;
	}

	public void setRvsabplanopag(char rvsabplanopag) {
		this.rvsabplanopag = rvsabplanopag;
	}

	public char getRvdomplanopag() {
		return this.rvdomplanopag;
	}

	public void setRvdomplanopag(char rvdomplanopag) {
		this.rvdomplanopag = rvdomplanopag;
	}

	public char getRvferplanopag() {
		return this.rvferplanopag;
	}

	public void setRvferplanopag(char rvferplanopag) {
		this.rvferplanopag = rvferplanopag;
	}

	public char getRvdiaplanopag() {
		return this.rvdiaplanopag;
	}

	public void setRvdiaplanopag(char rvdiaplanopag) {
		this.rvdiaplanopag = rvdiaplanopag;
	}

	public short getDiavctoplanopag() {
		return this.diavctoplanopag;
	}

	public void setDiavctoplanopag(short diavctoplanopag) {
		this.diavctoplanopag = diavctoplanopag;
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

	public Set getVdprecoprods() {
		return this.vdprecoprods;
	}

	public void setVdprecoprods(Set vdprecoprods) {
		this.vdprecoprods = vdprecoprods;
	}

	public Set getFnrenegrecs() {
		return this.fnrenegrecs;
	}

	public void setFnrenegrecs(Set fnrenegrecs) {
		this.fnrenegrecs = fnrenegrecs;
	}

	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	public Set getSgprefere4s() {
		return this.sgprefere4s;
	}

	public void setSgprefere4s(Set sgprefere4s) {
		this.sgprefere4s = sgprefere4s;
	}

	public Set getSgprefere8s() {
		return this.sgprefere8s;
	}

	public void setSgprefere8s(Set sgprefere8s) {
		this.sgprefere8s = sgprefere8s;
	}

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	public Set getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set fnpagars) {
		this.fnpagars = fnpagars;
	}

	public Set getSgprefere1sForSgprefere1fkfnplan() {
		return this.sgprefere1sForSgprefere1fkfnplan;
	}

	public void setSgprefere1sForSgprefere1fkfnplan(
			Set sgprefere1sForSgprefere1fkfnplan) {
		this.sgprefere1sForSgprefere1fkfnplan = sgprefere1sForSgprefere1fkfnplan;
	}

	public Set getCpordcompras() {
		return this.cpordcompras;
	}

	public void setCpordcompras(Set cpordcompras) {
		this.cpordcompras = cpordcompras;
	}

	public Set getCpcotacaos() {
		return this.cpcotacaos;
	}

	public void setCpcotacaos(Set cpcotacaos) {
		this.cpcotacaos = cpcotacaos;
	}

	public Set getSgprefere1sForSgprefere1fkplanopagsv() {
		return this.sgprefere1sForSgprefere1fkplanopagsv;
	}

	public void setSgprefere1sForSgprefere1fkplanopagsv(
			Set sgprefere1sForSgprefere1fkplanopagsv) {
		this.sgprefere1sForSgprefere1fkplanopagsv = sgprefere1sForSgprefere1fkplanopagsv;
	}

	public Set getFnparcpags() {
		return this.fnparcpags;
	}

	public void setFnparcpags(Set fnparcpags) {
		this.fnparcpags = fnparcpags;
	}

	public Set getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

	public Set getVdvendaconsigs() {
		return this.vdvendaconsigs;
	}

	public void setVdvendaconsigs(Set vdvendaconsigs) {
		this.vdvendaconsigs = vdvendaconsigs;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

	public Set getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

}

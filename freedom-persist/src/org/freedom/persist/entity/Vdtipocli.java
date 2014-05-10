package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdtipocli generated by hbm2java
 */
public class Vdtipocli implements java.io.Serializable {

	private VdtipocliId id;
	private Sgfilial sgfilial;
	private String desctipocli;
	private char cheqtipocli;
	private char fistipocli;
	private char jurtipocli;
	private char filtipocli;
	private char loctrabtipocli;
	private char refcomltipocli;
	private char banctipocli;
	private char refpestipocli;
	private char conjtipocli;
	private char veictipocli;
	private char imovtipocli;
	private char terratipocli;
	private char pesautcptipocli;
	private char avaltipocli;
	private char sociotipocli;
	private char prodruraltipocli;
	private char web;
	private String siglatipocli;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdclientes = new HashSet(0);
	private Set sgprefere2s = new HashSet(0);
	private Set sgprefere1s = new HashSet(0);
	private Set tkcontatos = new HashSet(0);

	public Vdtipocli() {
	}

	public Vdtipocli(VdtipocliId id, Sgfilial sgfilial, String desctipocli,
			char cheqtipocli, char fistipocli, char jurtipocli,
			char filtipocli, char loctrabtipocli, char refcomltipocli,
			char banctipocli, char refpestipocli, char conjtipocli,
			char veictipocli, char imovtipocli, char terratipocli,
			char pesautcptipocli, char avaltipocli, char sociotipocli,
			char prodruraltipocli, char web, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipocli = desctipocli;
		this.cheqtipocli = cheqtipocli;
		this.fistipocli = fistipocli;
		this.jurtipocli = jurtipocli;
		this.filtipocli = filtipocli;
		this.loctrabtipocli = loctrabtipocli;
		this.refcomltipocli = refcomltipocli;
		this.banctipocli = banctipocli;
		this.refpestipocli = refpestipocli;
		this.conjtipocli = conjtipocli;
		this.veictipocli = veictipocli;
		this.imovtipocli = imovtipocli;
		this.terratipocli = terratipocli;
		this.pesautcptipocli = pesautcptipocli;
		this.avaltipocli = avaltipocli;
		this.sociotipocli = sociotipocli;
		this.prodruraltipocli = prodruraltipocli;
		this.web = web;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdtipocli(VdtipocliId id, Sgfilial sgfilial, String desctipocli,
			char cheqtipocli, char fistipocli, char jurtipocli,
			char filtipocli, char loctrabtipocli, char refcomltipocli,
			char banctipocli, char refpestipocli, char conjtipocli,
			char veictipocli, char imovtipocli, char terratipocli,
			char pesautcptipocli, char avaltipocli, char sociotipocli,
			char prodruraltipocli, char web, String siglatipocli, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdclientes, Set sgprefere2s, Set sgprefere1s, Set tkcontatos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipocli = desctipocli;
		this.cheqtipocli = cheqtipocli;
		this.fistipocli = fistipocli;
		this.jurtipocli = jurtipocli;
		this.filtipocli = filtipocli;
		this.loctrabtipocli = loctrabtipocli;
		this.refcomltipocli = refcomltipocli;
		this.banctipocli = banctipocli;
		this.refpestipocli = refpestipocli;
		this.conjtipocli = conjtipocli;
		this.veictipocli = veictipocli;
		this.imovtipocli = imovtipocli;
		this.terratipocli = terratipocli;
		this.pesautcptipocli = pesautcptipocli;
		this.avaltipocli = avaltipocli;
		this.sociotipocli = sociotipocli;
		this.prodruraltipocli = prodruraltipocli;
		this.web = web;
		this.siglatipocli = siglatipocli;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.sgprefere2s = sgprefere2s;
		this.sgprefere1s = sgprefere1s;
		this.tkcontatos = tkcontatos;
	}

	public VdtipocliId getId() {
		return this.id;
	}

	public void setId(VdtipocliId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctipocli() {
		return this.desctipocli;
	}

	public void setDesctipocli(String desctipocli) {
		this.desctipocli = desctipocli;
	}

	public char getCheqtipocli() {
		return this.cheqtipocli;
	}

	public void setCheqtipocli(char cheqtipocli) {
		this.cheqtipocli = cheqtipocli;
	}

	public char getFistipocli() {
		return this.fistipocli;
	}

	public void setFistipocli(char fistipocli) {
		this.fistipocli = fistipocli;
	}

	public char getJurtipocli() {
		return this.jurtipocli;
	}

	public void setJurtipocli(char jurtipocli) {
		this.jurtipocli = jurtipocli;
	}

	public char getFiltipocli() {
		return this.filtipocli;
	}

	public void setFiltipocli(char filtipocli) {
		this.filtipocli = filtipocli;
	}

	public char getLoctrabtipocli() {
		return this.loctrabtipocli;
	}

	public void setLoctrabtipocli(char loctrabtipocli) {
		this.loctrabtipocli = loctrabtipocli;
	}

	public char getRefcomltipocli() {
		return this.refcomltipocli;
	}

	public void setRefcomltipocli(char refcomltipocli) {
		this.refcomltipocli = refcomltipocli;
	}

	public char getBanctipocli() {
		return this.banctipocli;
	}

	public void setBanctipocli(char banctipocli) {
		this.banctipocli = banctipocli;
	}

	public char getRefpestipocli() {
		return this.refpestipocli;
	}

	public void setRefpestipocli(char refpestipocli) {
		this.refpestipocli = refpestipocli;
	}

	public char getConjtipocli() {
		return this.conjtipocli;
	}

	public void setConjtipocli(char conjtipocli) {
		this.conjtipocli = conjtipocli;
	}

	public char getVeictipocli() {
		return this.veictipocli;
	}

	public void setVeictipocli(char veictipocli) {
		this.veictipocli = veictipocli;
	}

	public char getImovtipocli() {
		return this.imovtipocli;
	}

	public void setImovtipocli(char imovtipocli) {
		this.imovtipocli = imovtipocli;
	}

	public char getTerratipocli() {
		return this.terratipocli;
	}

	public void setTerratipocli(char terratipocli) {
		this.terratipocli = terratipocli;
	}

	public char getPesautcptipocli() {
		return this.pesautcptipocli;
	}

	public void setPesautcptipocli(char pesautcptipocli) {
		this.pesautcptipocli = pesautcptipocli;
	}

	public char getAvaltipocli() {
		return this.avaltipocli;
	}

	public void setAvaltipocli(char avaltipocli) {
		this.avaltipocli = avaltipocli;
	}

	public char getSociotipocli() {
		return this.sociotipocli;
	}

	public void setSociotipocli(char sociotipocli) {
		this.sociotipocli = sociotipocli;
	}

	public char getProdruraltipocli() {
		return this.prodruraltipocli;
	}

	public void setProdruraltipocli(char prodruraltipocli) {
		this.prodruraltipocli = prodruraltipocli;
	}

	public char getWeb() {
		return this.web;
	}

	public void setWeb(char web) {
		this.web = web;
	}

	public String getSiglatipocli() {
		return this.siglatipocli;
	}

	public void setSiglatipocli(String siglatipocli) {
		this.siglatipocli = siglatipocli;
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

	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	public Set getSgprefere2s() {
		return this.sgprefere2s;
	}

	public void setSgprefere2s(Set sgprefere2s) {
		this.sgprefere2s = sgprefere2s;
	}

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	public Set getTkcontatos() {
		return this.tkcontatos;
	}

	public void setTkcontatos(Set tkcontatos) {
		this.tkcontatos = tkcontatos;
	}

}

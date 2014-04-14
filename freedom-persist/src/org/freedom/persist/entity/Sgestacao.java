package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgestacao generated by hbm2java
 */
public class Sgestacao implements java.io.Serializable {

	private SgestacaoId id;
	private Sgproxyweb sgproxyweb;
	private String descest;
	private char mododemoest;
	private char nfeest;
	private char ativaest;
	private Short tamfontetxt;
	private String fontetxt;
	private String pathcacerts;
	private String hostest;
	private String ipest;
	private String macaddressest;
	private String desclocalest;
	private String nomecontest;
	private String ramalest;
	private String emailest;
	private String pathpdfreader;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set pvcaixas = new HashSet(0);
	private Set sgestacaobals = new HashSet(0);
	private Set sgestacaoimps = new HashSet(0);
	private Set ppprocessaoptmps = new HashSet(0);

	public Sgestacao() {
	}

	public Sgestacao(SgestacaoId id, String descest, char mododemoest,
			char nfeest, char ativaest, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descest = descest;
		this.mododemoest = mododemoest;
		this.nfeest = nfeest;
		this.ativaest = ativaest;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgestacao(SgestacaoId id, Sgproxyweb sgproxyweb, String descest,
			char mododemoest, char nfeest, char ativaest, Short tamfontetxt,
			String fontetxt, String pathcacerts, String hostest, String ipest,
			String macaddressest, String desclocalest, String nomecontest,
			String ramalest, String emailest, String pathpdfreader, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set pvcaixas, Set sgestacaobals, Set sgestacaoimps,
			Set ppprocessaoptmps) {
		this.id = id;
		this.sgproxyweb = sgproxyweb;
		this.descest = descest;
		this.mododemoest = mododemoest;
		this.nfeest = nfeest;
		this.ativaest = ativaest;
		this.tamfontetxt = tamfontetxt;
		this.fontetxt = fontetxt;
		this.pathcacerts = pathcacerts;
		this.hostest = hostest;
		this.ipest = ipest;
		this.macaddressest = macaddressest;
		this.desclocalest = desclocalest;
		this.nomecontest = nomecontest;
		this.ramalest = ramalest;
		this.emailest = emailest;
		this.pathpdfreader = pathpdfreader;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.pvcaixas = pvcaixas;
		this.sgestacaobals = sgestacaobals;
		this.sgestacaoimps = sgestacaoimps;
		this.ppprocessaoptmps = ppprocessaoptmps;
	}

	public SgestacaoId getId() {
		return this.id;
	}

	public void setId(SgestacaoId id) {
		this.id = id;
	}

	public Sgproxyweb getSgproxyweb() {
		return this.sgproxyweb;
	}

	public void setSgproxyweb(Sgproxyweb sgproxyweb) {
		this.sgproxyweb = sgproxyweb;
	}

	public String getDescest() {
		return this.descest;
	}

	public void setDescest(String descest) {
		this.descest = descest;
	}

	public char getMododemoest() {
		return this.mododemoest;
	}

	public void setMododemoest(char mododemoest) {
		this.mododemoest = mododemoest;
	}

	public char getNfeest() {
		return this.nfeest;
	}

	public void setNfeest(char nfeest) {
		this.nfeest = nfeest;
	}

	public char getAtivaest() {
		return this.ativaest;
	}

	public void setAtivaest(char ativaest) {
		this.ativaest = ativaest;
	}

	public Short getTamfontetxt() {
		return this.tamfontetxt;
	}

	public void setTamfontetxt(Short tamfontetxt) {
		this.tamfontetxt = tamfontetxt;
	}

	public String getFontetxt() {
		return this.fontetxt;
	}

	public void setFontetxt(String fontetxt) {
		this.fontetxt = fontetxt;
	}

	public String getPathcacerts() {
		return this.pathcacerts;
	}

	public void setPathcacerts(String pathcacerts) {
		this.pathcacerts = pathcacerts;
	}

	public String getHostest() {
		return this.hostest;
	}

	public void setHostest(String hostest) {
		this.hostest = hostest;
	}

	public String getIpest() {
		return this.ipest;
	}

	public void setIpest(String ipest) {
		this.ipest = ipest;
	}

	public String getMacaddressest() {
		return this.macaddressest;
	}

	public void setMacaddressest(String macaddressest) {
		this.macaddressest = macaddressest;
	}

	public String getDesclocalest() {
		return this.desclocalest;
	}

	public void setDesclocalest(String desclocalest) {
		this.desclocalest = desclocalest;
	}

	public String getNomecontest() {
		return this.nomecontest;
	}

	public void setNomecontest(String nomecontest) {
		this.nomecontest = nomecontest;
	}

	public String getRamalest() {
		return this.ramalest;
	}

	public void setRamalest(String ramalest) {
		this.ramalest = ramalest;
	}

	public String getEmailest() {
		return this.emailest;
	}

	public void setEmailest(String emailest) {
		this.emailest = emailest;
	}

	public String getPathpdfreader() {
		return this.pathpdfreader;
	}

	public void setPathpdfreader(String pathpdfreader) {
		this.pathpdfreader = pathpdfreader;
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

	public Set getPvcaixas() {
		return this.pvcaixas;
	}

	public void setPvcaixas(Set pvcaixas) {
		this.pvcaixas = pvcaixas;
	}

	public Set getSgestacaobals() {
		return this.sgestacaobals;
	}

	public void setSgestacaobals(Set sgestacaobals) {
		this.sgestacaobals = sgestacaobals;
	}

	public Set getSgestacaoimps() {
		return this.sgestacaoimps;
	}

	public void setSgestacaoimps(Set sgestacaoimps) {
		this.sgestacaoimps = sgestacaoimps;
	}

	public Set getPpprocessaoptmps() {
		return this.ppprocessaoptmps;
	}

	public void setPpprocessaoptmps(Set ppprocessaoptmps) {
		this.ppprocessaoptmps = ppprocessaoptmps;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgproxyweb generated by hbm2java
 */
public class Sgproxyweb implements java.io.Serializable {

	private SgproxywebId id;
	private String descproxy;
	private String hostproxy;
	private int portaproxy;
	private char autproxy;
	private String usuproxy;
	private String senhaproxy;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgestacaos = new HashSet(0);

	public Sgproxyweb() {
	}

	public Sgproxyweb(SgproxywebId id, String descproxy, String hostproxy,
			int portaproxy, char autproxy, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descproxy = descproxy;
		this.hostproxy = hostproxy;
		this.portaproxy = portaproxy;
		this.autproxy = autproxy;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgproxyweb(SgproxywebId id, String descproxy, String hostproxy,
			int portaproxy, char autproxy, String usuproxy, String senhaproxy,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set sgestacaos) {
		this.id = id;
		this.descproxy = descproxy;
		this.hostproxy = hostproxy;
		this.portaproxy = portaproxy;
		this.autproxy = autproxy;
		this.usuproxy = usuproxy;
		this.senhaproxy = senhaproxy;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgestacaos = sgestacaos;
	}

	public SgproxywebId getId() {
		return this.id;
	}

	public void setId(SgproxywebId id) {
		this.id = id;
	}

	public String getDescproxy() {
		return this.descproxy;
	}

	public void setDescproxy(String descproxy) {
		this.descproxy = descproxy;
	}

	public String getHostproxy() {
		return this.hostproxy;
	}

	public void setHostproxy(String hostproxy) {
		this.hostproxy = hostproxy;
	}

	public int getPortaproxy() {
		return this.portaproxy;
	}

	public void setPortaproxy(int portaproxy) {
		this.portaproxy = portaproxy;
	}

	public char getAutproxy() {
		return this.autproxy;
	}

	public void setAutproxy(char autproxy) {
		this.autproxy = autproxy;
	}

	public String getUsuproxy() {
		return this.usuproxy;
	}

	public void setUsuproxy(String usuproxy) {
		this.usuproxy = usuproxy;
	}

	public String getSenhaproxy() {
		return this.senhaproxy;
	}

	public void setSenhaproxy(String senhaproxy) {
		this.senhaproxy = senhaproxy;
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

	public Set getSgestacaos() {
		return this.sgestacaos;
	}

	public void setSgestacaos(Set sgestacaos) {
		this.sgestacaos = sgestacaos;
	}

}

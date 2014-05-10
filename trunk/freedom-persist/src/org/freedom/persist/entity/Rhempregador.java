package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rhempregador generated by hbm2java
 */
public class Rhempregador implements java.io.Serializable {

	private RhempregadorId id;
	private Sgfilial sgfilial;
	private String nomeempr;
	private char ativoempr;
	private String cnpjempr;
	private String inscempr;
	private String endempr;
	private Integer numempr;
	private String bairempr;
	private String cidempr;
	private String ufempr;
	private String cepempr;
	private String dddempr;
	private String foneempr;
	private String ramalempr;
	private String dddfaxempr;
	private String faxempr;
	private String emailempr;
	private String contempr;
	private String obsempr;
	private String dddcelempr;
	private String celempr;
	private String siteempr;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set rhvagas = new HashSet(0);

	public Rhempregador() {
	}

	public Rhempregador(RhempregadorId id, Sgfilial sgfilial, String nomeempr,
			char ativoempr, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomeempr = nomeempr;
		this.ativoempr = ativoempr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhempregador(RhempregadorId id, Sgfilial sgfilial, String nomeempr,
			char ativoempr, String cnpjempr, String inscempr, String endempr,
			Integer numempr, String bairempr, String cidempr, String ufempr,
			String cepempr, String dddempr, String foneempr, String ramalempr,
			String dddfaxempr, String faxempr, String emailempr,
			String contempr, String obsempr, String dddcelempr, String celempr,
			String siteempr, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set rhvagas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomeempr = nomeempr;
		this.ativoempr = ativoempr;
		this.cnpjempr = cnpjempr;
		this.inscempr = inscempr;
		this.endempr = endempr;
		this.numempr = numempr;
		this.bairempr = bairempr;
		this.cidempr = cidempr;
		this.ufempr = ufempr;
		this.cepempr = cepempr;
		this.dddempr = dddempr;
		this.foneempr = foneempr;
		this.ramalempr = ramalempr;
		this.dddfaxempr = dddfaxempr;
		this.faxempr = faxempr;
		this.emailempr = emailempr;
		this.contempr = contempr;
		this.obsempr = obsempr;
		this.dddcelempr = dddcelempr;
		this.celempr = celempr;
		this.siteempr = siteempr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhvagas = rhvagas;
	}

	public RhempregadorId getId() {
		return this.id;
	}

	public void setId(RhempregadorId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getNomeempr() {
		return this.nomeempr;
	}

	public void setNomeempr(String nomeempr) {
		this.nomeempr = nomeempr;
	}

	public char getAtivoempr() {
		return this.ativoempr;
	}

	public void setAtivoempr(char ativoempr) {
		this.ativoempr = ativoempr;
	}

	public String getCnpjempr() {
		return this.cnpjempr;
	}

	public void setCnpjempr(String cnpjempr) {
		this.cnpjempr = cnpjempr;
	}

	public String getInscempr() {
		return this.inscempr;
	}

	public void setInscempr(String inscempr) {
		this.inscempr = inscempr;
	}

	public String getEndempr() {
		return this.endempr;
	}

	public void setEndempr(String endempr) {
		this.endempr = endempr;
	}

	public Integer getNumempr() {
		return this.numempr;
	}

	public void setNumempr(Integer numempr) {
		this.numempr = numempr;
	}

	public String getBairempr() {
		return this.bairempr;
	}

	public void setBairempr(String bairempr) {
		this.bairempr = bairempr;
	}

	public String getCidempr() {
		return this.cidempr;
	}

	public void setCidempr(String cidempr) {
		this.cidempr = cidempr;
	}

	public String getUfempr() {
		return this.ufempr;
	}

	public void setUfempr(String ufempr) {
		this.ufempr = ufempr;
	}

	public String getCepempr() {
		return this.cepempr;
	}

	public void setCepempr(String cepempr) {
		this.cepempr = cepempr;
	}

	public String getDddempr() {
		return this.dddempr;
	}

	public void setDddempr(String dddempr) {
		this.dddempr = dddempr;
	}

	public String getFoneempr() {
		return this.foneempr;
	}

	public void setFoneempr(String foneempr) {
		this.foneempr = foneempr;
	}

	public String getRamalempr() {
		return this.ramalempr;
	}

	public void setRamalempr(String ramalempr) {
		this.ramalempr = ramalempr;
	}

	public String getDddfaxempr() {
		return this.dddfaxempr;
	}

	public void setDddfaxempr(String dddfaxempr) {
		this.dddfaxempr = dddfaxempr;
	}

	public String getFaxempr() {
		return this.faxempr;
	}

	public void setFaxempr(String faxempr) {
		this.faxempr = faxempr;
	}

	public String getEmailempr() {
		return this.emailempr;
	}

	public void setEmailempr(String emailempr) {
		this.emailempr = emailempr;
	}

	public String getContempr() {
		return this.contempr;
	}

	public void setContempr(String contempr) {
		this.contempr = contempr;
	}

	public String getObsempr() {
		return this.obsempr;
	}

	public void setObsempr(String obsempr) {
		this.obsempr = obsempr;
	}

	public String getDddcelempr() {
		return this.dddcelempr;
	}

	public void setDddcelempr(String dddcelempr) {
		this.dddcelempr = dddcelempr;
	}

	public String getCelempr() {
		return this.celempr;
	}

	public void setCelempr(String celempr) {
		this.celempr = celempr;
	}

	public String getSiteempr() {
		return this.siteempr;
	}

	public void setSiteempr(String siteempr) {
		this.siteempr = siteempr;
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

	public Set getRhvagas() {
		return this.rhvagas;
	}

	public void setRhvagas(Set rhvagas) {
		this.rhvagas = rhvagas;
	}

}

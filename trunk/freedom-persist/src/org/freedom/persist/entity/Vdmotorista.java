package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdmotorista generated by hbm2java
 */
public class Vdmotorista implements java.io.Serializable {

	private VdmotoristaId id;
	private Vdtransp vdtransp;
	private Sgmunicipio sgmunicipio;
	private String cnh;
	private String nomemot;
	private String cpfmot;
	private String endmot;
	private Integer nummot;
	private String complmot;
	private String bairmot;
	private String cepmot;
	private String fonemot;
	private String celmot;
	private String dddmot;
	private String conjugemot;
	private Short nrodependmot;
	private String rgmot;
	private String sspmot;
	private String nropismot;
	private String obsmot;
	private String emailmot;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdtransps = new HashSet(0);
	private Set eqexpedicaos = new HashSet(0);

	public Vdmotorista() {
	}

	public Vdmotorista(VdmotoristaId id, String cnh, String nomemot,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cnh = cnh;
		this.nomemot = nomemot;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdmotorista(VdmotoristaId id, Vdtransp vdtransp,
			Sgmunicipio sgmunicipio, String cnh, String nomemot, String cpfmot,
			String endmot, Integer nummot, String complmot, String bairmot,
			String cepmot, String fonemot, String celmot, String dddmot,
			String conjugemot, Short nrodependmot, String rgmot, String sspmot,
			String nropismot, String obsmot, String emailmot, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdtransps, Set eqexpedicaos) {
		this.id = id;
		this.vdtransp = vdtransp;
		this.sgmunicipio = sgmunicipio;
		this.cnh = cnh;
		this.nomemot = nomemot;
		this.cpfmot = cpfmot;
		this.endmot = endmot;
		this.nummot = nummot;
		this.complmot = complmot;
		this.bairmot = bairmot;
		this.cepmot = cepmot;
		this.fonemot = fonemot;
		this.celmot = celmot;
		this.dddmot = dddmot;
		this.conjugemot = conjugemot;
		this.nrodependmot = nrodependmot;
		this.rgmot = rgmot;
		this.sspmot = sspmot;
		this.nropismot = nropismot;
		this.obsmot = obsmot;
		this.emailmot = emailmot;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdtransps = vdtransps;
		this.eqexpedicaos = eqexpedicaos;
	}

	public VdmotoristaId getId() {
		return this.id;
	}

	public void setId(VdmotoristaId id) {
		this.id = id;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	public String getCnh() {
		return this.cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNomemot() {
		return this.nomemot;
	}

	public void setNomemot(String nomemot) {
		this.nomemot = nomemot;
	}

	public String getCpfmot() {
		return this.cpfmot;
	}

	public void setCpfmot(String cpfmot) {
		this.cpfmot = cpfmot;
	}

	public String getEndmot() {
		return this.endmot;
	}

	public void setEndmot(String endmot) {
		this.endmot = endmot;
	}

	public Integer getNummot() {
		return this.nummot;
	}

	public void setNummot(Integer nummot) {
		this.nummot = nummot;
	}

	public String getComplmot() {
		return this.complmot;
	}

	public void setComplmot(String complmot) {
		this.complmot = complmot;
	}

	public String getBairmot() {
		return this.bairmot;
	}

	public void setBairmot(String bairmot) {
		this.bairmot = bairmot;
	}

	public String getCepmot() {
		return this.cepmot;
	}

	public void setCepmot(String cepmot) {
		this.cepmot = cepmot;
	}

	public String getFonemot() {
		return this.fonemot;
	}

	public void setFonemot(String fonemot) {
		this.fonemot = fonemot;
	}

	public String getCelmot() {
		return this.celmot;
	}

	public void setCelmot(String celmot) {
		this.celmot = celmot;
	}

	public String getDddmot() {
		return this.dddmot;
	}

	public void setDddmot(String dddmot) {
		this.dddmot = dddmot;
	}

	public String getConjugemot() {
		return this.conjugemot;
	}

	public void setConjugemot(String conjugemot) {
		this.conjugemot = conjugemot;
	}

	public Short getNrodependmot() {
		return this.nrodependmot;
	}

	public void setNrodependmot(Short nrodependmot) {
		this.nrodependmot = nrodependmot;
	}

	public String getRgmot() {
		return this.rgmot;
	}

	public void setRgmot(String rgmot) {
		this.rgmot = rgmot;
	}

	public String getSspmot() {
		return this.sspmot;
	}

	public void setSspmot(String sspmot) {
		this.sspmot = sspmot;
	}

	public String getNropismot() {
		return this.nropismot;
	}

	public void setNropismot(String nropismot) {
		this.nropismot = nropismot;
	}

	public String getObsmot() {
		return this.obsmot;
	}

	public void setObsmot(String obsmot) {
		this.obsmot = obsmot;
	}

	public String getEmailmot() {
		return this.emailmot;
	}

	public void setEmailmot(String emailmot) {
		this.emailmot = emailmot;
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

	public Set getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set vdtransps) {
		this.vdtransps = vdtransps;
	}

	public Set getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

}

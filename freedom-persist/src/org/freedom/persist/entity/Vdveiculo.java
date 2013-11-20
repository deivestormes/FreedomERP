package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdveiculo generated by hbm2java
 */
public class Vdveiculo implements java.io.Serializable {

	private VdveiculoId id;
	private Vdtransp vdtransp;
	private Sgmunicipio sgmunicipio;
	private String placa;
	private String renavam;
	private String fabricante;
	private String modelo;
	private String desccor;
	private Integer codcor;
	private String obs;
	private Integer anofabric;
	private Integer anomodelo;
	private String rntc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqexpedicaos = new HashSet(0);
	private Set vdtransps = new HashSet(0);

	public Vdveiculo() {
	}

	public Vdveiculo(VdveiculoId id, String placa, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.placa = placa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdveiculo(VdveiculoId id, Vdtransp vdtransp,
			Sgmunicipio sgmunicipio, String placa, String renavam,
			String fabricante, String modelo, String desccor, Integer codcor,
			String obs, Integer anofabric, Integer anomodelo, String rntc,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set eqexpedicaos, Set vdtransps) {
		this.id = id;
		this.vdtransp = vdtransp;
		this.sgmunicipio = sgmunicipio;
		this.placa = placa;
		this.renavam = renavam;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.desccor = desccor;
		this.codcor = codcor;
		this.obs = obs;
		this.anofabric = anofabric;
		this.anomodelo = anomodelo;
		this.rntc = rntc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqexpedicaos = eqexpedicaos;
		this.vdtransps = vdtransps;
	}

	public VdveiculoId getId() {
		return this.id;
	}

	public void setId(VdveiculoId id) {
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

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return this.renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDesccor() {
		return this.desccor;
	}

	public void setDesccor(String desccor) {
		this.desccor = desccor;
	}

	public Integer getCodcor() {
		return this.codcor;
	}

	public void setCodcor(Integer codcor) {
		this.codcor = codcor;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getAnofabric() {
		return this.anofabric;
	}

	public void setAnofabric(Integer anofabric) {
		this.anofabric = anofabric;
	}

	public Integer getAnomodelo() {
		return this.anomodelo;
	}

	public void setAnomodelo(Integer anomodelo) {
		this.anomodelo = anomodelo;
	}

	public String getRntc() {
		return this.rntc;
	}

	public void setRntc(String rntc) {
		this.rntc = rntc;
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

	public Set getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

	public Set getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set vdtransps) {
		this.vdtransps = vdtransps;
	}

}

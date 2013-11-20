package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Vdclisocios generated by hbm2java
 */
public class Vdclisocios implements java.io.Serializable {

	private VdclisociosId id;
	private Vdcliente vdcliente;
	private Date dtnascsocio;
	private String rgsocio;
	private String sspsocio;
	private String cpfsocio;
	private Integer perccotassocio;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdclisocios() {
	}

	public Vdclisocios(VdclisociosId id, Vdcliente vdcliente, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdclisocios(VdclisociosId id, Vdcliente vdcliente, Date dtnascsocio,
			String rgsocio, String sspsocio, String cpfsocio,
			Integer perccotassocio, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.dtnascsocio = dtnascsocio;
		this.rgsocio = rgsocio;
		this.sspsocio = sspsocio;
		this.cpfsocio = cpfsocio;
		this.perccotassocio = perccotassocio;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdclisociosId getId() {
		return this.id;
	}

	public void setId(VdclisociosId id) {
		this.id = id;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Date getDtnascsocio() {
		return this.dtnascsocio;
	}

	public void setDtnascsocio(Date dtnascsocio) {
		this.dtnascsocio = dtnascsocio;
	}

	public String getRgsocio() {
		return this.rgsocio;
	}

	public void setRgsocio(String rgsocio) {
		this.rgsocio = rgsocio;
	}

	public String getSspsocio() {
		return this.sspsocio;
	}

	public void setSspsocio(String sspsocio) {
		this.sspsocio = sspsocio;
	}

	public String getCpfsocio() {
		return this.cpfsocio;
	}

	public void setCpfsocio(String cpfsocio) {
		this.cpfsocio = cpfsocio;
	}

	public Integer getPerccotassocio() {
		return this.perccotassocio;
	}

	public void setPerccotassocio(Integer perccotassocio) {
		this.perccotassocio = perccotassocio;
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

}

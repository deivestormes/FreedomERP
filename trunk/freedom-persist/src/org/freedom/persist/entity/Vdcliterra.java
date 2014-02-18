package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Vdcliterra generated by hbm2java
 */
public class Vdcliterra implements java.io.Serializable {

	private VdcliterraId id;
	private Vdcliente vdcliente;
	private String endterra;
	private Integer numterra;
	private String bairterra;
	private String cidterra;
	private String ufterra;
	private String areaterra;
	private Integer qtdcafeterra;
	private Integer qtdgadoterra;
	private String obsterra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdcliterra() {
	}

	public Vdcliterra(VdcliterraId id, Vdcliente vdcliente, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcliterra(VdcliterraId id, Vdcliente vdcliente, String endterra,
			Integer numterra, String bairterra, String cidterra,
			String ufterra, String areaterra, Integer qtdcafeterra,
			Integer qtdgadoterra, String obsterra, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.endterra = endterra;
		this.numterra = numterra;
		this.bairterra = bairterra;
		this.cidterra = cidterra;
		this.ufterra = ufterra;
		this.areaterra = areaterra;
		this.qtdcafeterra = qtdcafeterra;
		this.qtdgadoterra = qtdgadoterra;
		this.obsterra = obsterra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdcliterraId getId() {
		return this.id;
	}

	public void setId(VdcliterraId id) {
		this.id = id;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public String getEndterra() {
		return this.endterra;
	}

	public void setEndterra(String endterra) {
		this.endterra = endterra;
	}

	public Integer getNumterra() {
		return this.numterra;
	}

	public void setNumterra(Integer numterra) {
		this.numterra = numterra;
	}

	public String getBairterra() {
		return this.bairterra;
	}

	public void setBairterra(String bairterra) {
		this.bairterra = bairterra;
	}

	public String getCidterra() {
		return this.cidterra;
	}

	public void setCidterra(String cidterra) {
		this.cidterra = cidterra;
	}

	public String getUfterra() {
		return this.ufterra;
	}

	public void setUfterra(String ufterra) {
		this.ufterra = ufterra;
	}

	public String getAreaterra() {
		return this.areaterra;
	}

	public void setAreaterra(String areaterra) {
		this.areaterra = areaterra;
	}

	public Integer getQtdcafeterra() {
		return this.qtdcafeterra;
	}

	public void setQtdcafeterra(Integer qtdcafeterra) {
		this.qtdcafeterra = qtdcafeterra;
	}

	public Integer getQtdgadoterra() {
		return this.qtdgadoterra;
	}

	public void setQtdgadoterra(Integer qtdgadoterra) {
		this.qtdgadoterra = qtdgadoterra;
	}

	public String getObsterra() {
		return this.obsterra;
	}

	public void setObsterra(String obsterra) {
		this.obsterra = obsterra;
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

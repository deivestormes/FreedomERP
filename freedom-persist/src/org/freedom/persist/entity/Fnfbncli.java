package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Fnfbncli generated by hbm2java
 */
public class Fnfbncli implements java.io.Serializable {

	private FnfbncliId id;
	private Vdcliente vdcliente;
	private Sgitprefere6 sgitprefere6;
	private Fnconta fnconta;
	private Fnplanejamento fnplanejamento;
	private String numcontacli;
	private String agenciacli;
	private String identcli;
	private String stipofebraban;
	private char tiporemcli;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnfbncli() {
	}

	public Fnfbncli(FnfbncliId id, Vdcliente vdcliente,
			Sgitprefere6 sgitprefere6, String identcli, String stipofebraban,
			char tiporemcli, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.sgitprefere6 = sgitprefere6;
		this.identcli = identcli;
		this.stipofebraban = stipofebraban;
		this.tiporemcli = tiporemcli;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnfbncli(FnfbncliId id, Vdcliente vdcliente,
			Sgitprefere6 sgitprefere6, Fnconta fnconta,
			Fnplanejamento fnplanejamento, String numcontacli,
			String agenciacli, String identcli, String stipofebraban,
			char tiporemcli, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.sgitprefere6 = sgitprefere6;
		this.fnconta = fnconta;
		this.fnplanejamento = fnplanejamento;
		this.numcontacli = numcontacli;
		this.agenciacli = agenciacli;
		this.identcli = identcli;
		this.stipofebraban = stipofebraban;
		this.tiporemcli = tiporemcli;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnfbncliId getId() {
		return this.id;
	}

	public void setId(FnfbncliId id) {
		this.id = id;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Sgitprefere6 getSgitprefere6() {
		return this.sgitprefere6;
	}

	public void setSgitprefere6(Sgitprefere6 sgitprefere6) {
		this.sgitprefere6 = sgitprefere6;
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

	public String getNumcontacli() {
		return this.numcontacli;
	}

	public void setNumcontacli(String numcontacli) {
		this.numcontacli = numcontacli;
	}

	public String getAgenciacli() {
		return this.agenciacli;
	}

	public void setAgenciacli(String agenciacli) {
		this.agenciacli = agenciacli;
	}

	public String getIdentcli() {
		return this.identcli;
	}

	public void setIdentcli(String identcli) {
		this.identcli = identcli;
	}

	public String getStipofebraban() {
		return this.stipofebraban;
	}

	public void setStipofebraban(String stipofebraban) {
		this.stipofebraban = stipofebraban;
	}

	public char getTiporemcli() {
		return this.tiporemcli;
	}

	public void setTiporemcli(char tiporemcli) {
		this.tiporemcli = tiporemcli;
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

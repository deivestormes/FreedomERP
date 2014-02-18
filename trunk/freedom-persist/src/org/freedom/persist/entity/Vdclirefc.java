package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vdclirefc generated by hbm2java
 */
public class Vdclirefc implements java.io.Serializable {

	private VdclirefcId id;
	private Vdcliente vdcliente;
	private String nomeemprefc;
	private String dddrefc;
	private String fonerefc;
	private Date dtmaiorcp;
	private BigDecimal vlrmaiorcp;
	private Short nroparcmaiorcp;
	private Date dtultcp;
	private BigDecimal vlrultcp;
	private Short nroparcultcp;
	private Date dtprimcp;
	private Character pontual;
	private String mediaatraso;
	private String conceito;
	private Character avalista;
	private String informante;
	private String obsrefc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdclirefc() {
	}

	public Vdclirefc(VdclirefcId id, Vdcliente vdcliente, String nomeemprefc,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomeemprefc = nomeemprefc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdclirefc(VdclirefcId id, Vdcliente vdcliente, String nomeemprefc,
			String dddrefc, String fonerefc, Date dtmaiorcp,
			BigDecimal vlrmaiorcp, Short nroparcmaiorcp, Date dtultcp,
			BigDecimal vlrultcp, Short nroparcultcp, Date dtprimcp,
			Character pontual, String mediaatraso, String conceito,
			Character avalista, String informante, String obsrefc, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomeemprefc = nomeemprefc;
		this.dddrefc = dddrefc;
		this.fonerefc = fonerefc;
		this.dtmaiorcp = dtmaiorcp;
		this.vlrmaiorcp = vlrmaiorcp;
		this.nroparcmaiorcp = nroparcmaiorcp;
		this.dtultcp = dtultcp;
		this.vlrultcp = vlrultcp;
		this.nroparcultcp = nroparcultcp;
		this.dtprimcp = dtprimcp;
		this.pontual = pontual;
		this.mediaatraso = mediaatraso;
		this.conceito = conceito;
		this.avalista = avalista;
		this.informante = informante;
		this.obsrefc = obsrefc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdclirefcId getId() {
		return this.id;
	}

	public void setId(VdclirefcId id) {
		this.id = id;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public String getNomeemprefc() {
		return this.nomeemprefc;
	}

	public void setNomeemprefc(String nomeemprefc) {
		this.nomeemprefc = nomeemprefc;
	}

	public String getDddrefc() {
		return this.dddrefc;
	}

	public void setDddrefc(String dddrefc) {
		this.dddrefc = dddrefc;
	}

	public String getFonerefc() {
		return this.fonerefc;
	}

	public void setFonerefc(String fonerefc) {
		this.fonerefc = fonerefc;
	}

	public Date getDtmaiorcp() {
		return this.dtmaiorcp;
	}

	public void setDtmaiorcp(Date dtmaiorcp) {
		this.dtmaiorcp = dtmaiorcp;
	}

	public BigDecimal getVlrmaiorcp() {
		return this.vlrmaiorcp;
	}

	public void setVlrmaiorcp(BigDecimal vlrmaiorcp) {
		this.vlrmaiorcp = vlrmaiorcp;
	}

	public Short getNroparcmaiorcp() {
		return this.nroparcmaiorcp;
	}

	public void setNroparcmaiorcp(Short nroparcmaiorcp) {
		this.nroparcmaiorcp = nroparcmaiorcp;
	}

	public Date getDtultcp() {
		return this.dtultcp;
	}

	public void setDtultcp(Date dtultcp) {
		this.dtultcp = dtultcp;
	}

	public BigDecimal getVlrultcp() {
		return this.vlrultcp;
	}

	public void setVlrultcp(BigDecimal vlrultcp) {
		this.vlrultcp = vlrultcp;
	}

	public Short getNroparcultcp() {
		return this.nroparcultcp;
	}

	public void setNroparcultcp(Short nroparcultcp) {
		this.nroparcultcp = nroparcultcp;
	}

	public Date getDtprimcp() {
		return this.dtprimcp;
	}

	public void setDtprimcp(Date dtprimcp) {
		this.dtprimcp = dtprimcp;
	}

	public Character getPontual() {
		return this.pontual;
	}

	public void setPontual(Character pontual) {
		this.pontual = pontual;
	}

	public String getMediaatraso() {
		return this.mediaatraso;
	}

	public void setMediaatraso(String mediaatraso) {
		this.mediaatraso = mediaatraso;
	}

	public String getConceito() {
		return this.conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}

	public Character getAvalista() {
		return this.avalista;
	}

	public void setAvalista(Character avalista) {
		this.avalista = avalista;
	}

	public String getInformante() {
		return this.informante;
	}

	public void setInformante(String informante) {
		this.informante = informante;
	}

	public String getObsrefc() {
		return this.obsrefc;
	}

	public void setObsrefc(String obsrefc) {
		this.obsrefc = obsrefc;
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

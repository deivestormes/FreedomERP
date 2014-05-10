package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cpfretecp generated by hbm2java
 */
public class Cpfretecp implements java.io.Serializable {

	private CpfretecpId id;
	private Cpcompra cpcompra;
	private Vdtransp vdtransp;
	private char tipofretecp;
	private String placafretecp;
	private String uffretecp;
	private BigDecimal vlrfretecp;
	private BigDecimal qtdfretecp;
	private BigDecimal pesobrutcp;
	private BigDecimal pesoliqcp;
	private String espfretecp;
	private String marcafretecp;
	private String conhecfretecp;
	private BigDecimal perccomprafretecp;
	private char adicfretecp;
	private char adicfretebaseicm;
	private BigDecimal aliqicmsfretecp;
	private BigDecimal vlricmsfretecp;
	private BigDecimal vlrsegfretecp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpfretecp() {
	}

	public Cpfretecp(Cpcompra cpcompra, char tipofretecp, String placafretecp,
			String uffretecp, BigDecimal vlrfretecp, BigDecimal qtdfretecp,
			BigDecimal pesobrutcp, BigDecimal pesoliqcp, String espfretecp,
			String marcafretecp, char adicfretecp, char adicfretebaseicm,
			Date dtins, Date hins, String idusuins) {
		this.cpcompra = cpcompra;
		this.tipofretecp = tipofretecp;
		this.placafretecp = placafretecp;
		this.uffretecp = uffretecp;
		this.vlrfretecp = vlrfretecp;
		this.qtdfretecp = qtdfretecp;
		this.pesobrutcp = pesobrutcp;
		this.pesoliqcp = pesoliqcp;
		this.espfretecp = espfretecp;
		this.marcafretecp = marcafretecp;
		this.adicfretecp = adicfretecp;
		this.adicfretebaseicm = adicfretebaseicm;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpfretecp(Cpcompra cpcompra, Vdtransp vdtransp, char tipofretecp,
			String placafretecp, String uffretecp, BigDecimal vlrfretecp,
			BigDecimal qtdfretecp, BigDecimal pesobrutcp, BigDecimal pesoliqcp,
			String espfretecp, String marcafretecp, String conhecfretecp,
			BigDecimal perccomprafretecp, char adicfretecp,
			char adicfretebaseicm, BigDecimal aliqicmsfretecp,
			BigDecimal vlricmsfretecp, BigDecimal vlrsegfretecp, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.cpcompra = cpcompra;
		this.vdtransp = vdtransp;
		this.tipofretecp = tipofretecp;
		this.placafretecp = placafretecp;
		this.uffretecp = uffretecp;
		this.vlrfretecp = vlrfretecp;
		this.qtdfretecp = qtdfretecp;
		this.pesobrutcp = pesobrutcp;
		this.pesoliqcp = pesoliqcp;
		this.espfretecp = espfretecp;
		this.marcafretecp = marcafretecp;
		this.conhecfretecp = conhecfretecp;
		this.perccomprafretecp = perccomprafretecp;
		this.adicfretecp = adicfretecp;
		this.adicfretebaseicm = adicfretebaseicm;
		this.aliqicmsfretecp = aliqicmsfretecp;
		this.vlricmsfretecp = vlricmsfretecp;
		this.vlrsegfretecp = vlrsegfretecp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CpfretecpId getId() {
		return this.id;
	}

	public void setId(CpfretecpId id) {
		this.id = id;
	}

	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public char getTipofretecp() {
		return this.tipofretecp;
	}

	public void setTipofretecp(char tipofretecp) {
		this.tipofretecp = tipofretecp;
	}

	public String getPlacafretecp() {
		return this.placafretecp;
	}

	public void setPlacafretecp(String placafretecp) {
		this.placafretecp = placafretecp;
	}

	public String getUffretecp() {
		return this.uffretecp;
	}

	public void setUffretecp(String uffretecp) {
		this.uffretecp = uffretecp;
	}

	public BigDecimal getVlrfretecp() {
		return this.vlrfretecp;
	}

	public void setVlrfretecp(BigDecimal vlrfretecp) {
		this.vlrfretecp = vlrfretecp;
	}

	public BigDecimal getQtdfretecp() {
		return this.qtdfretecp;
	}

	public void setQtdfretecp(BigDecimal qtdfretecp) {
		this.qtdfretecp = qtdfretecp;
	}

	public BigDecimal getPesobrutcp() {
		return this.pesobrutcp;
	}

	public void setPesobrutcp(BigDecimal pesobrutcp) {
		this.pesobrutcp = pesobrutcp;
	}

	public BigDecimal getPesoliqcp() {
		return this.pesoliqcp;
	}

	public void setPesoliqcp(BigDecimal pesoliqcp) {
		this.pesoliqcp = pesoliqcp;
	}

	public String getEspfretecp() {
		return this.espfretecp;
	}

	public void setEspfretecp(String espfretecp) {
		this.espfretecp = espfretecp;
	}

	public String getMarcafretecp() {
		return this.marcafretecp;
	}

	public void setMarcafretecp(String marcafretecp) {
		this.marcafretecp = marcafretecp;
	}

	public String getConhecfretecp() {
		return this.conhecfretecp;
	}

	public void setConhecfretecp(String conhecfretecp) {
		this.conhecfretecp = conhecfretecp;
	}

	public BigDecimal getPerccomprafretecp() {
		return this.perccomprafretecp;
	}

	public void setPerccomprafretecp(BigDecimal perccomprafretecp) {
		this.perccomprafretecp = perccomprafretecp;
	}

	public char getAdicfretecp() {
		return this.adicfretecp;
	}

	public void setAdicfretecp(char adicfretecp) {
		this.adicfretecp = adicfretecp;
	}

	public char getAdicfretebaseicm() {
		return this.adicfretebaseicm;
	}

	public void setAdicfretebaseicm(char adicfretebaseicm) {
		this.adicfretebaseicm = adicfretebaseicm;
	}

	public BigDecimal getAliqicmsfretecp() {
		return this.aliqicmsfretecp;
	}

	public void setAliqicmsfretecp(BigDecimal aliqicmsfretecp) {
		this.aliqicmsfretecp = aliqicmsfretecp;
	}

	public BigDecimal getVlricmsfretecp() {
		return this.vlricmsfretecp;
	}

	public void setVlricmsfretecp(BigDecimal vlricmsfretecp) {
		this.vlricmsfretecp = vlricmsfretecp;
	}

	public BigDecimal getVlrsegfretecp() {
		return this.vlrsegfretecp;
	}

	public void setVlrsegfretecp(BigDecimal vlrsegfretecp) {
		this.vlrsegfretecp = vlrsegfretecp;
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

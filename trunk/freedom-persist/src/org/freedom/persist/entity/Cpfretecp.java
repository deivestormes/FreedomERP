package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpfretecp generated by hbm2java
 */
@Entity
@Table(name = "CPFRETECP")
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

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpfretecpId getId() {
		return this.id;
	}

	public void setId(CpfretecpId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@Column(name = "TIPOFRETECP", nullable = false, length = 1)
	public char getTipofretecp() {
		return this.tipofretecp;
	}

	public void setTipofretecp(char tipofretecp) {
		this.tipofretecp = tipofretecp;
	}

	@Column(name = "PLACAFRETECP", nullable = false, length = 10)
	public String getPlacafretecp() {
		return this.placafretecp;
	}

	public void setPlacafretecp(String placafretecp) {
		this.placafretecp = placafretecp;
	}

	@Column(name = "UFFRETECP", nullable = false, length = 2)
	public String getUffretecp() {
		return this.uffretecp;
	}

	public void setUffretecp(String uffretecp) {
		this.uffretecp = uffretecp;
	}

	@Column(name = "VLRFRETECP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrfretecp() {
		return this.vlrfretecp;
	}

	public void setVlrfretecp(BigDecimal vlrfretecp) {
		this.vlrfretecp = vlrfretecp;
	}

	@Column(name = "QTDFRETECP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdfretecp() {
		return this.qtdfretecp;
	}

	public void setQtdfretecp(BigDecimal qtdfretecp) {
		this.qtdfretecp = qtdfretecp;
	}

	@Column(name = "PESOBRUTCP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPesobrutcp() {
		return this.pesobrutcp;
	}

	public void setPesobrutcp(BigDecimal pesobrutcp) {
		this.pesobrutcp = pesobrutcp;
	}

	@Column(name = "PESOLIQCP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPesoliqcp() {
		return this.pesoliqcp;
	}

	public void setPesoliqcp(BigDecimal pesoliqcp) {
		this.pesoliqcp = pesoliqcp;
	}

	@Column(name = "ESPFRETECP", nullable = false, length = 10)
	public String getEspfretecp() {
		return this.espfretecp;
	}

	public void setEspfretecp(String espfretecp) {
		this.espfretecp = espfretecp;
	}

	@Column(name = "MARCAFRETECP", nullable = false, length = 10)
	public String getMarcafretecp() {
		return this.marcafretecp;
	}

	public void setMarcafretecp(String marcafretecp) {
		this.marcafretecp = marcafretecp;
	}

	@Column(name = "CONHECFRETECP", length = 13)
	public String getConhecfretecp() {
		return this.conhecfretecp;
	}

	public void setConhecfretecp(String conhecfretecp) {
		this.conhecfretecp = conhecfretecp;
	}

	@Column(name = "PERCCOMPRAFRETECP", precision = 9)
	public BigDecimal getPerccomprafretecp() {
		return this.perccomprafretecp;
	}

	public void setPerccomprafretecp(BigDecimal perccomprafretecp) {
		this.perccomprafretecp = perccomprafretecp;
	}

	@Column(name = "ADICFRETECP", nullable = false, length = 1)
	public char getAdicfretecp() {
		return this.adicfretecp;
	}

	public void setAdicfretecp(char adicfretecp) {
		this.adicfretecp = adicfretecp;
	}

	@Column(name = "ADICFRETEBASEICM", nullable = false, length = 1)
	public char getAdicfretebaseicm() {
		return this.adicfretebaseicm;
	}

	public void setAdicfretebaseicm(char adicfretebaseicm) {
		this.adicfretebaseicm = adicfretebaseicm;
	}

	@Column(name = "ALIQICMSFRETECP", precision = 15, scale = 5)
	public BigDecimal getAliqicmsfretecp() {
		return this.aliqicmsfretecp;
	}

	public void setAliqicmsfretecp(BigDecimal aliqicmsfretecp) {
		this.aliqicmsfretecp = aliqicmsfretecp;
	}

	@Column(name = "VLRICMSFRETECP", precision = 15, scale = 5)
	public BigDecimal getVlricmsfretecp() {
		return this.vlricmsfretecp;
	}

	public void setVlricmsfretecp(BigDecimal vlricmsfretecp) {
		this.vlricmsfretecp = vlricmsfretecp;
	}

	@Column(name = "VLRSEGFRETECP", precision = 15, scale = 5)
	public BigDecimal getVlrsegfretecp() {
		return this.vlrsegfretecp;
	}

	public void setVlrsegfretecp(BigDecimal vlrsegfretecp) {
		this.vlrsegfretecp = vlrsegfretecp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

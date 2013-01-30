package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppitop generated by hbm2java
 */
@Entity
@Table(name = "PPITOP")
public class Ppitop implements java.io.Serializable {

	private PpitopId id;
	private Eqproduto eqproduto;
	private Ppfase ppfase;
	private Ppopacaocorret ppopacaocorret;
	private Vdvenda vdvenda;
	private Cpcompra cpcompra;
	private Eqlote eqlote;
	private Ppop ppop;
	private String refprod;
	private BigDecimal qtditop;
	private Short seqitopcp;
	private String codloterat;
	private BigDecimal qtdcopiaitop;
	private char gerarma;
	private char bloqop;
	private Character permiteajusteitop;
	private Character tipoexterno;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppitop() {
	}

	public Ppitop(PpitopId id, Eqproduto eqproduto, Ppfase ppfase,
			Ppopacaocorret ppopacaocorret, Eqlote eqlote, Ppop ppop,
			String refprod, BigDecimal qtditop, char gerarma, char bloqop,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.ppfase = ppfase;
		this.ppopacaocorret = ppopacaocorret;
		this.eqlote = eqlote;
		this.ppop = ppop;
		this.refprod = refprod;
		this.qtditop = qtditop;
		this.gerarma = gerarma;
		this.bloqop = bloqop;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppitop(PpitopId id, Eqproduto eqproduto, Ppfase ppfase,
			Ppopacaocorret ppopacaocorret, Vdvenda vdvenda, Cpcompra cpcompra,
			Eqlote eqlote, Ppop ppop, String refprod, BigDecimal qtditop,
			Short seqitopcp, String codloterat, BigDecimal qtdcopiaitop,
			char gerarma, char bloqop, Character permiteajusteitop,
			Character tipoexterno, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.ppfase = ppfase;
		this.ppopacaocorret = ppopacaocorret;
		this.vdvenda = vdvenda;
		this.cpcompra = cpcompra;
		this.eqlote = eqlote;
		this.ppop = ppop;
		this.refprod = refprod;
		this.qtditop = qtditop;
		this.seqitopcp = seqitopcp;
		this.codloterat = codloterat;
		this.qtdcopiaitop = qtdcopiaitop;
		this.gerarma = gerarma;
		this.bloqop = bloqop;
		this.permiteajusteitop = permiteajusteitop;
		this.tipoexterno = tipoexterno;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codop", column = @Column(name = "CODOP", nullable = false)),
			@AttributeOverride(name = "seqop", column = @Column(name = "SEQOP", nullable = false)),
			@AttributeOverride(name = "seqitop", column = @Column(name = "SEQITOP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpitopId getId() {
		return this.id;
	}

	public void setId(PpitopId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFASE", referencedColumnName = "CODFASE", nullable = false),
			@JoinColumn(name = "CODFILIALFS", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPFS", referencedColumnName = "CODEMP", nullable = false) })
	public Ppfase getPpfase() {
		return this.ppfase;
	}

	public void setPpfase(Ppfase ppfase) {
		this.ppfase = ppfase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOP", referencedColumnName = "CODOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQOP", referencedColumnName = "SEQOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQAC", referencedColumnName = "SEQAC", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Ppopacaocorret getPpopacaocorret() {
		return this.ppopacaocorret;
	}

	public void setPpopacaocorret(Ppopacaocorret ppopacaocorret) {
		this.ppopacaocorret = ppopacaocorret;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA"),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA"),
			@JoinColumn(name = "CODFILIALCP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCP", referencedColumnName = "CODEMP") })
	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLOTE", referencedColumnName = "CODLOTE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALLE", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPLE", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Eqlote getEqlote() {
		return this.eqlote;
	}

	public void setEqlote(Eqlote eqlote) {
		this.eqlote = eqlote;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOP", referencedColumnName = "CODOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQOP", referencedColumnName = "SEQOP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "QTDITOP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditop() {
		return this.qtditop;
	}

	public void setQtditop(BigDecimal qtditop) {
		this.qtditop = qtditop;
	}

	@Column(name = "SEQITOPCP")
	public Short getSeqitopcp() {
		return this.seqitopcp;
	}

	public void setSeqitopcp(Short seqitopcp) {
		this.seqitopcp = seqitopcp;
	}

	@Column(name = "CODLOTERAT", length = 20)
	public String getCodloterat() {
		return this.codloterat;
	}

	public void setCodloterat(String codloterat) {
		this.codloterat = codloterat;
	}

	@Column(name = "QTDCOPIAITOP", precision = 15, scale = 5)
	public BigDecimal getQtdcopiaitop() {
		return this.qtdcopiaitop;
	}

	public void setQtdcopiaitop(BigDecimal qtdcopiaitop) {
		this.qtdcopiaitop = qtdcopiaitop;
	}

	@Column(name = "GERARMA", nullable = false, length = 1)
	public char getGerarma() {
		return this.gerarma;
	}

	public void setGerarma(char gerarma) {
		this.gerarma = gerarma;
	}

	@Column(name = "BLOQOP", nullable = false, length = 1)
	public char getBloqop() {
		return this.bloqop;
	}

	public void setBloqop(char bloqop) {
		this.bloqop = bloqop;
	}

	@Column(name = "PERMITEAJUSTEITOP", length = 1)
	public Character getPermiteajusteitop() {
		return this.permiteajusteitop;
	}

	public void setPermiteajusteitop(Character permiteajusteitop) {
		this.permiteajusteitop = permiteajusteitop;
	}

	@Column(name = "TIPOEXTERNO", length = 1)
	public Character getTipoexterno() {
		return this.tipoexterno;
	}

	public void setTipoexterno(Character tipoexterno) {
		this.tipoexterno = tipoexterno;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

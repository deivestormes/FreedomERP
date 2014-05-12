package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vditvenda generated by hbm2java
 */
@Entity
@Table(name = "VDITVENDA")
public class Vditvenda implements java.io.Serializable {

	private VditvendaId id;
	private Eqproduto eqproduto;
	private Lfnatoper lfnatoper;
	private Lftrattrib lftrattrib;
	private Vdvenda vdvenda;
	private Atconveniado atconveniado;
	private Vdprazoent vdprazoent;
	private Lfmensagem lfmensagem;
	private Eqserie eqserie;
	private Sglog sglog;
	private Cpitcompra cpitcompra;
	private Eqalmox eqalmox;
	private Eqlote eqlote;
	private Lfitclfiscal lfitclfiscal;
	private BigDecimal qtditvenda;
	private BigDecimal qtditvendacanc;
	private BigDecimal precoitvenda;
	private BigDecimal percdescitvenda;
	private BigDecimal vlrdescitvenda;
	private BigDecimal percicmsitvenda;
	private BigDecimal vlrbaseicmsitvenda;
	private BigDecimal vlricmsitvenda;
	private BigDecimal percipiitvenda;
	private BigDecimal vlrbaseipiitvenda;
	private BigDecimal vlripiitvenda;
	private BigDecimal vlrliqitvenda;
	private BigDecimal perccomisitvenda;
	private BigDecimal vlrcomisitvenda;
	private BigDecimal vlradicitvenda;
	private BigDecimal percissitvenda;
	private BigDecimal vlrissitvenda;
	private BigDecimal vlrfreteitvenda;
	private BigDecimal vlrproditvenda;
	private BigDecimal vlrisentasitvenda;
	private BigDecimal vlroutrasitvenda;
	private String refprod;
	private BigDecimal vlrbaseissitvenda;
	private BigDecimal vlrbaseicmsbrutitvenda;
	private BigDecimal vlrbaseicmsstitvenda;
	private BigDecimal vlricmsstitvenda;
	private BigDecimal vlrbasecomisitvenda;
	private BigDecimal margemvlagritvenda;
	private String obsitvenda;
	private Character origfisc;
	private String tipofisc;
	private String tipost;
	private String strdescitvenda;
	private BigDecimal qtddevitvenda;
	private Character cancitvenda;
	private Short diaspe;
	private Integer codempvr;
	private Short codfilialvr;
	private Character tipovendavr;
	private Integer codvendavr;
	private Integer coditvendavr;
	private Integer codempns;
	private Short codfilialns;
	private BigDecimal vlrbaseicmsstretitvenda;
	private BigDecimal vlricmsstretitvenda;
	private Character calcstcm;
	private Character emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Lfitvenda lfitvenda;
	private Set eqmovseries = new HashSet(0);
	private Set vditvendaitvendasForVditvendafkitvend2 = new HashSet(0);
	private Set vdvendaconsigs = new HashSet(0);
	private Vditvendavditcontr vditvendavditcontr;
	private Set vditvendaitvendasForVditvendafkitvend1 = new HashSet(0);
	private Vditcustovenda vditcustovenda;
	private Set cpcompravendas = new HashSet(0);
	private Set vdvendaorcs = new HashSet(0);
	private Set eqmovprods = new HashSet(0);
	private Set cpdevolucaos = new HashSet(0);

	public Vditvenda() {
	}

	public Vditvenda(VditvendaId id, Eqproduto eqproduto, Lfnatoper lfnatoper,
			Vdvenda vdvenda, Eqserie eqserie, Eqalmox eqalmox, Eqlote eqlote,
			BigDecimal qtditvenda, BigDecimal precoitvenda, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.lfnatoper = lfnatoper;
		this.vdvenda = vdvenda;
		this.eqserie = eqserie;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.qtditvenda = qtditvenda;
		this.precoitvenda = precoitvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditvenda(VditvendaId id, Eqproduto eqproduto, Lfnatoper lfnatoper,
			Lftrattrib lftrattrib, Vdvenda vdvenda, Atconveniado atconveniado,
			Vdprazoent vdprazoent, Lfmensagem lfmensagem, Eqserie eqserie,
			Sglog sglog, Cpitcompra cpitcompra, Eqalmox eqalmox, Eqlote eqlote,
			Lfitclfiscal lfitclfiscal, BigDecimal qtditvenda,
			BigDecimal qtditvendacanc, BigDecimal precoitvenda,
			BigDecimal percdescitvenda, BigDecimal vlrdescitvenda,
			BigDecimal percicmsitvenda, BigDecimal vlrbaseicmsitvenda,
			BigDecimal vlricmsitvenda, BigDecimal percipiitvenda,
			BigDecimal vlrbaseipiitvenda, BigDecimal vlripiitvenda,
			BigDecimal vlrliqitvenda, BigDecimal perccomisitvenda,
			BigDecimal vlrcomisitvenda, BigDecimal vlradicitvenda,
			BigDecimal percissitvenda, BigDecimal vlrissitvenda,
			BigDecimal vlrfreteitvenda, BigDecimal vlrproditvenda,
			BigDecimal vlrisentasitvenda, BigDecimal vlroutrasitvenda,
			String refprod, BigDecimal vlrbaseissitvenda,
			BigDecimal vlrbaseicmsbrutitvenda, BigDecimal vlrbaseicmsstitvenda,
			BigDecimal vlricmsstitvenda, BigDecimal vlrbasecomisitvenda,
			BigDecimal margemvlagritvenda, String obsitvenda,
			Character origfisc, String tipofisc, String tipost,
			String strdescitvenda, BigDecimal qtddevitvenda,
			Character cancitvenda, Short diaspe, Integer codempvr,
			Short codfilialvr, Character tipovendavr, Integer codvendavr,
			Integer coditvendavr, Integer codempns, Short codfilialns,
			BigDecimal vlrbaseicmsstretitvenda, BigDecimal vlricmsstretitvenda,
			Character calcstcm, Character emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Lfitvenda lfitvenda, Set eqmovseries,
			Set vditvendaitvendasForVditvendafkitvend2, Set vdvendaconsigs,
			Vditvendavditcontr vditvendavditcontr,
			Set vditvendaitvendasForVditvendafkitvend1,
			Vditcustovenda vditcustovenda, Set cpcompravendas, Set vdvendaorcs,
			Set eqmovprods, Set cpdevolucaos) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.lfnatoper = lfnatoper;
		this.lftrattrib = lftrattrib;
		this.vdvenda = vdvenda;
		this.atconveniado = atconveniado;
		this.vdprazoent = vdprazoent;
		this.lfmensagem = lfmensagem;
		this.eqserie = eqserie;
		this.sglog = sglog;
		this.cpitcompra = cpitcompra;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.lfitclfiscal = lfitclfiscal;
		this.qtditvenda = qtditvenda;
		this.qtditvendacanc = qtditvendacanc;
		this.precoitvenda = precoitvenda;
		this.percdescitvenda = percdescitvenda;
		this.vlrdescitvenda = vlrdescitvenda;
		this.percicmsitvenda = percicmsitvenda;
		this.vlrbaseicmsitvenda = vlrbaseicmsitvenda;
		this.vlricmsitvenda = vlricmsitvenda;
		this.percipiitvenda = percipiitvenda;
		this.vlrbaseipiitvenda = vlrbaseipiitvenda;
		this.vlripiitvenda = vlripiitvenda;
		this.vlrliqitvenda = vlrliqitvenda;
		this.perccomisitvenda = perccomisitvenda;
		this.vlrcomisitvenda = vlrcomisitvenda;
		this.vlradicitvenda = vlradicitvenda;
		this.percissitvenda = percissitvenda;
		this.vlrissitvenda = vlrissitvenda;
		this.vlrfreteitvenda = vlrfreteitvenda;
		this.vlrproditvenda = vlrproditvenda;
		this.vlrisentasitvenda = vlrisentasitvenda;
		this.vlroutrasitvenda = vlroutrasitvenda;
		this.refprod = refprod;
		this.vlrbaseissitvenda = vlrbaseissitvenda;
		this.vlrbaseicmsbrutitvenda = vlrbaseicmsbrutitvenda;
		this.vlrbaseicmsstitvenda = vlrbaseicmsstitvenda;
		this.vlricmsstitvenda = vlricmsstitvenda;
		this.vlrbasecomisitvenda = vlrbasecomisitvenda;
		this.margemvlagritvenda = margemvlagritvenda;
		this.obsitvenda = obsitvenda;
		this.origfisc = origfisc;
		this.tipofisc = tipofisc;
		this.tipost = tipost;
		this.strdescitvenda = strdescitvenda;
		this.qtddevitvenda = qtddevitvenda;
		this.cancitvenda = cancitvenda;
		this.diaspe = diaspe;
		this.codempvr = codempvr;
		this.codfilialvr = codfilialvr;
		this.tipovendavr = tipovendavr;
		this.codvendavr = codvendavr;
		this.coditvendavr = coditvendavr;
		this.codempns = codempns;
		this.codfilialns = codfilialns;
		this.vlrbaseicmsstretitvenda = vlrbaseicmsstretitvenda;
		this.vlricmsstretitvenda = vlricmsstretitvenda;
		this.calcstcm = calcstcm;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitvenda = lfitvenda;
		this.eqmovseries = eqmovseries;
		this.vditvendaitvendasForVditvendafkitvend2 = vditvendaitvendasForVditvendafkitvend2;
		this.vdvendaconsigs = vdvendaconsigs;
		this.vditvendavditcontr = vditvendavditcontr;
		this.vditvendaitvendasForVditvendafkitvend1 = vditvendaitvendasForVditvendafkitvend1;
		this.vditcustovenda = vditcustovenda;
		this.cpcompravendas = cpcompravendas;
		this.vdvendaorcs = vdvendaorcs;
		this.eqmovprods = eqmovprods;
		this.cpdevolucaos = cpdevolucaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "coditvenda", column = @Column(name = "CODITVENDA", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VditvendaId getId() {
		return this.id;
	}

	public void setId(VditvendaId id) {
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
			@JoinColumn(name = "CODNAT", referencedColumnName = "CODNAT", nullable = false),
			@JoinColumn(name = "CODFILIALNT", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPNT", referencedColumnName = "CODEMP", nullable = false) })
	public Lfnatoper getLfnatoper() {
		return this.lfnatoper;
	}

	public void setLfnatoper(Lfnatoper lfnatoper) {
		this.lfnatoper = lfnatoper;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRATTRIB", referencedColumnName = "CODTRATTRIB"),
			@JoinColumn(name = "CODFILIALTT", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTT", referencedColumnName = "CODEMP") })
	public Lftrattrib getLftrattrib() {
		return this.lftrattrib;
	}

	public void setLftrattrib(Lftrattrib lftrattrib) {
		this.lftrattrib = lftrattrib;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONV", referencedColumnName = "CODCONV"),
			@JoinColumn(name = "CODFILIALCV", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCV", referencedColumnName = "CODEMP") })
	public Atconveniado getAtconveniado() {
		return this.atconveniado;
	}

	public void setAtconveniado(Atconveniado atconveniado) {
		this.atconveniado = atconveniado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPE", referencedColumnName = "CODPE"),
			@JoinColumn(name = "CODFILIALPE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPE", referencedColumnName = "CODEMP") })
	public Vdprazoent getVdprazoent() {
		return this.vdprazoent;
	}

	public void setVdprazoent(Vdprazoent vdprazoent) {
		this.vdprazoent = vdprazoent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMENS", referencedColumnName = "CODMENS"),
			@JoinColumn(name = "CODFILIALME", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPME", referencedColumnName = "CODEMP") })
	public Lfmensagem getLfmensagem() {
		return this.lfmensagem;
	}

	public void setLfmensagem(Lfmensagem lfmensagem) {
		this.lfmensagem = lfmensagem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMSERIETMP", referencedColumnName = "NUMSERIE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqserie getEqserie() {
		return this.eqserie;
	}

	public void setEqserie(Eqserie eqserie) {
		this.eqserie = eqserie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLOG", referencedColumnName = "CODLOG"),
			@JoinColumn(name = "CODFILIALLG", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPLG", referencedColumnName = "CODEMP") })
	public Sglog getSglog() {
		return this.sglog;
	}

	public void setSglog(Sglog sglog) {
		this.sglog = sglog;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA"),
			@JoinColumn(name = "CODITCOMPRA", referencedColumnName = "CODITCOMPRA"),
			@JoinColumn(name = "CODFILIALCP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCP", referencedColumnName = "CODEMP") })
	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX", nullable = false),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP", nullable = false) })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
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
			@JoinColumn(name = "CODEMPIF", referencedColumnName = "CODEMP"),
			@JoinColumn(name = "CODFILIALIF", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODFISC", referencedColumnName = "CODFISC"),
			@JoinColumn(name = "CODITFISC", referencedColumnName = "CODITFISC") })
	public Lfitclfiscal getLfitclfiscal() {
		return this.lfitclfiscal;
	}

	public void setLfitclfiscal(Lfitclfiscal lfitclfiscal) {
		this.lfitclfiscal = lfitclfiscal;
	}

	@Column(name = "QTDITVENDA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditvenda() {
		return this.qtditvenda;
	}

	public void setQtditvenda(BigDecimal qtditvenda) {
		this.qtditvenda = qtditvenda;
	}

	@Column(name = "QTDITVENDACANC", precision = 15, scale = 5)
	public BigDecimal getQtditvendacanc() {
		return this.qtditvendacanc;
	}

	public void setQtditvendacanc(BigDecimal qtditvendacanc) {
		this.qtditvendacanc = qtditvendacanc;
	}

	@Column(name = "PRECOITVENDA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPrecoitvenda() {
		return this.precoitvenda;
	}

	public void setPrecoitvenda(BigDecimal precoitvenda) {
		this.precoitvenda = precoitvenda;
	}

	@Column(name = "PERCDESCITVENDA", precision = 15, scale = 5)
	public BigDecimal getPercdescitvenda() {
		return this.percdescitvenda;
	}

	public void setPercdescitvenda(BigDecimal percdescitvenda) {
		this.percdescitvenda = percdescitvenda;
	}

	@Column(name = "VLRDESCITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrdescitvenda() {
		return this.vlrdescitvenda;
	}

	public void setVlrdescitvenda(BigDecimal vlrdescitvenda) {
		this.vlrdescitvenda = vlrdescitvenda;
	}

	@Column(name = "PERCICMSITVENDA", precision = 15, scale = 5)
	public BigDecimal getPercicmsitvenda() {
		return this.percicmsitvenda;
	}

	public void setPercicmsitvenda(BigDecimal percicmsitvenda) {
		this.percicmsitvenda = percicmsitvenda;
	}

	@Column(name = "VLRBASEICMSITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsitvenda() {
		return this.vlrbaseicmsitvenda;
	}

	public void setVlrbaseicmsitvenda(BigDecimal vlrbaseicmsitvenda) {
		this.vlrbaseicmsitvenda = vlrbaseicmsitvenda;
	}

	@Column(name = "VLRICMSITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlricmsitvenda() {
		return this.vlricmsitvenda;
	}

	public void setVlricmsitvenda(BigDecimal vlricmsitvenda) {
		this.vlricmsitvenda = vlricmsitvenda;
	}

	@Column(name = "PERCIPIITVENDA", precision = 15, scale = 5)
	public BigDecimal getPercipiitvenda() {
		return this.percipiitvenda;
	}

	public void setPercipiitvenda(BigDecimal percipiitvenda) {
		this.percipiitvenda = percipiitvenda;
	}

	@Column(name = "VLRBASEIPIITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseipiitvenda() {
		return this.vlrbaseipiitvenda;
	}

	public void setVlrbaseipiitvenda(BigDecimal vlrbaseipiitvenda) {
		this.vlrbaseipiitvenda = vlrbaseipiitvenda;
	}

	@Column(name = "VLRIPIITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlripiitvenda() {
		return this.vlripiitvenda;
	}

	public void setVlripiitvenda(BigDecimal vlripiitvenda) {
		this.vlripiitvenda = vlripiitvenda;
	}

	@Column(name = "VLRLIQITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrliqitvenda() {
		return this.vlrliqitvenda;
	}

	public void setVlrliqitvenda(BigDecimal vlrliqitvenda) {
		this.vlrliqitvenda = vlrliqitvenda;
	}

	@Column(name = "PERCCOMISITVENDA", precision = 15, scale = 5)
	public BigDecimal getPerccomisitvenda() {
		return this.perccomisitvenda;
	}

	public void setPerccomisitvenda(BigDecimal perccomisitvenda) {
		this.perccomisitvenda = perccomisitvenda;
	}

	@Column(name = "VLRCOMISITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrcomisitvenda() {
		return this.vlrcomisitvenda;
	}

	public void setVlrcomisitvenda(BigDecimal vlrcomisitvenda) {
		this.vlrcomisitvenda = vlrcomisitvenda;
	}

	@Column(name = "VLRADICITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlradicitvenda() {
		return this.vlradicitvenda;
	}

	public void setVlradicitvenda(BigDecimal vlradicitvenda) {
		this.vlradicitvenda = vlradicitvenda;
	}

	@Column(name = "PERCISSITVENDA", precision = 15, scale = 5)
	public BigDecimal getPercissitvenda() {
		return this.percissitvenda;
	}

	public void setPercissitvenda(BigDecimal percissitvenda) {
		this.percissitvenda = percissitvenda;
	}

	@Column(name = "VLRISSITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrissitvenda() {
		return this.vlrissitvenda;
	}

	public void setVlrissitvenda(BigDecimal vlrissitvenda) {
		this.vlrissitvenda = vlrissitvenda;
	}

	@Column(name = "VLRFRETEITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrfreteitvenda() {
		return this.vlrfreteitvenda;
	}

	public void setVlrfreteitvenda(BigDecimal vlrfreteitvenda) {
		this.vlrfreteitvenda = vlrfreteitvenda;
	}

	@Column(name = "VLRPRODITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrproditvenda() {
		return this.vlrproditvenda;
	}

	public void setVlrproditvenda(BigDecimal vlrproditvenda) {
		this.vlrproditvenda = vlrproditvenda;
	}

	@Column(name = "VLRISENTASITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrisentasitvenda() {
		return this.vlrisentasitvenda;
	}

	public void setVlrisentasitvenda(BigDecimal vlrisentasitvenda) {
		this.vlrisentasitvenda = vlrisentasitvenda;
	}

	@Column(name = "VLROUTRASITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlroutrasitvenda() {
		return this.vlroutrasitvenda;
	}

	public void setVlroutrasitvenda(BigDecimal vlroutrasitvenda) {
		this.vlroutrasitvenda = vlroutrasitvenda;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "VLRBASEISSITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseissitvenda() {
		return this.vlrbaseissitvenda;
	}

	public void setVlrbaseissitvenda(BigDecimal vlrbaseissitvenda) {
		this.vlrbaseissitvenda = vlrbaseissitvenda;
	}

	@Column(name = "VLRBASEICMSBRUTITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsbrutitvenda() {
		return this.vlrbaseicmsbrutitvenda;
	}

	public void setVlrbaseicmsbrutitvenda(BigDecimal vlrbaseicmsbrutitvenda) {
		this.vlrbaseicmsbrutitvenda = vlrbaseicmsbrutitvenda;
	}

	@Column(name = "VLRBASEICMSSTITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsstitvenda() {
		return this.vlrbaseicmsstitvenda;
	}

	public void setVlrbaseicmsstitvenda(BigDecimal vlrbaseicmsstitvenda) {
		this.vlrbaseicmsstitvenda = vlrbaseicmsstitvenda;
	}

	@Column(name = "VLRICMSSTITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlricmsstitvenda() {
		return this.vlricmsstitvenda;
	}

	public void setVlricmsstitvenda(BigDecimal vlricmsstitvenda) {
		this.vlricmsstitvenda = vlricmsstitvenda;
	}

	@Column(name = "VLRBASECOMISITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbasecomisitvenda() {
		return this.vlrbasecomisitvenda;
	}

	public void setVlrbasecomisitvenda(BigDecimal vlrbasecomisitvenda) {
		this.vlrbasecomisitvenda = vlrbasecomisitvenda;
	}

	@Column(name = "MARGEMVLAGRITVENDA", precision = 15, scale = 5)
	public BigDecimal getMargemvlagritvenda() {
		return this.margemvlagritvenda;
	}

	public void setMargemvlagritvenda(BigDecimal margemvlagritvenda) {
		this.margemvlagritvenda = margemvlagritvenda;
	}

	@Column(name = "OBSITVENDA", length = 10000)
	public String getObsitvenda() {
		return this.obsitvenda;
	}

	public void setObsitvenda(String obsitvenda) {
		this.obsitvenda = obsitvenda;
	}

	@Column(name = "ORIGFISC", length = 1)
	public Character getOrigfisc() {
		return this.origfisc;
	}

	public void setOrigfisc(Character origfisc) {
		this.origfisc = origfisc;
	}

	@Column(name = "TIPOFISC", length = 2)
	public String getTipofisc() {
		return this.tipofisc;
	}

	public void setTipofisc(String tipofisc) {
		this.tipofisc = tipofisc;
	}

	@Column(name = "TIPOST", length = 2)
	public String getTipost() {
		return this.tipost;
	}

	public void setTipost(String tipost) {
		this.tipost = tipost;
	}

	@Column(name = "STRDESCITVENDA", length = 50)
	public String getStrdescitvenda() {
		return this.strdescitvenda;
	}

	public void setStrdescitvenda(String strdescitvenda) {
		this.strdescitvenda = strdescitvenda;
	}

	@Column(name = "QTDDEVITVENDA", precision = 15, scale = 5)
	public BigDecimal getQtddevitvenda() {
		return this.qtddevitvenda;
	}

	public void setQtddevitvenda(BigDecimal qtddevitvenda) {
		this.qtddevitvenda = qtddevitvenda;
	}

	@Column(name = "CANCITVENDA", length = 1)
	public Character getCancitvenda() {
		return this.cancitvenda;
	}

	public void setCancitvenda(Character cancitvenda) {
		this.cancitvenda = cancitvenda;
	}

	@Column(name = "DIASPE")
	public Short getDiaspe() {
		return this.diaspe;
	}

	public void setDiaspe(Short diaspe) {
		this.diaspe = diaspe;
	}

	@Column(name = "CODEMPVR")
	public Integer getCodempvr() {
		return this.codempvr;
	}

	public void setCodempvr(Integer codempvr) {
		this.codempvr = codempvr;
	}

	@Column(name = "CODFILIALVR")
	public Short getCodfilialvr() {
		return this.codfilialvr;
	}

	public void setCodfilialvr(Short codfilialvr) {
		this.codfilialvr = codfilialvr;
	}

	@Column(name = "TIPOVENDAVR", length = 1)
	public Character getTipovendavr() {
		return this.tipovendavr;
	}

	public void setTipovendavr(Character tipovendavr) {
		this.tipovendavr = tipovendavr;
	}

	@Column(name = "CODVENDAVR")
	public Integer getCodvendavr() {
		return this.codvendavr;
	}

	public void setCodvendavr(Integer codvendavr) {
		this.codvendavr = codvendavr;
	}

	@Column(name = "CODITVENDAVR")
	public Integer getCoditvendavr() {
		return this.coditvendavr;
	}

	public void setCoditvendavr(Integer coditvendavr) {
		this.coditvendavr = coditvendavr;
	}

	@Column(name = "CODEMPNS")
	public Integer getCodempns() {
		return this.codempns;
	}

	public void setCodempns(Integer codempns) {
		this.codempns = codempns;
	}

	@Column(name = "CODFILIALNS")
	public Short getCodfilialns() {
		return this.codfilialns;
	}

	public void setCodfilialns(Short codfilialns) {
		this.codfilialns = codfilialns;
	}

	@Column(name = "VLRBASEICMSSTRETITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsstretitvenda() {
		return this.vlrbaseicmsstretitvenda;
	}

	public void setVlrbaseicmsstretitvenda(BigDecimal vlrbaseicmsstretitvenda) {
		this.vlrbaseicmsstretitvenda = vlrbaseicmsstretitvenda;
	}

	@Column(name = "VLRICMSSTRETITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlricmsstretitvenda() {
		return this.vlricmsstretitvenda;
	}

	public void setVlricmsstretitvenda(BigDecimal vlricmsstretitvenda) {
		this.vlricmsstretitvenda = vlricmsstretitvenda;
	}

	@Column(name = "CALCSTCM", length = 1)
	public Character getCalcstcm() {
		return this.calcstcm;
	}

	public void setCalcstcm(Character calcstcm) {
		this.calcstcm = calcstcm;
	}

	@Column(name = "EMMANUT", length = 1)
	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
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

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Lfitvenda getLfitvenda() {
		return this.lfitvenda;
	}

	public void setLfitvenda(Lfitvenda lfitvenda) {
		this.lfitvenda = lfitvenda;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Set getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvendaByVditvendafkitvend2")
	public Set getVditvendaitvendasForVditvendafkitvend2() {
		return this.vditvendaitvendasForVditvendafkitvend2;
	}

	public void setVditvendaitvendasForVditvendafkitvend2(
			Set vditvendaitvendasForVditvendafkitvend2) {
		this.vditvendaitvendasForVditvendafkitvend2 = vditvendaitvendasForVditvendafkitvend2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Set getVdvendaconsigs() {
		return this.vdvendaconsigs;
	}

	public void setVdvendaconsigs(Set vdvendaconsigs) {
		this.vdvendaconsigs = vdvendaconsigs;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Vditvendavditcontr getVditvendavditcontr() {
		return this.vditvendavditcontr;
	}

	public void setVditvendavditcontr(Vditvendavditcontr vditvendavditcontr) {
		this.vditvendavditcontr = vditvendavditcontr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvendaByVditvendafkitvend1")
	public Set getVditvendaitvendasForVditvendafkitvend1() {
		return this.vditvendaitvendasForVditvendafkitvend1;
	}

	public void setVditvendaitvendasForVditvendafkitvend1(
			Set vditvendaitvendasForVditvendafkitvend1) {
		this.vditvendaitvendasForVditvendafkitvend1 = vditvendaitvendasForVditvendafkitvend1;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Vditcustovenda getVditcustovenda() {
		return this.vditcustovenda;
	}

	public void setVditcustovenda(Vditcustovenda vditcustovenda) {
		this.vditcustovenda = vditcustovenda;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Set getCpcompravendas() {
		return this.cpcompravendas;
	}

	public void setCpcompravendas(Set cpcompravendas) {
		this.cpcompravendas = cpcompravendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Set getVdvendaorcs() {
		return this.vdvendaorcs;
	}

	public void setVdvendaorcs(Set vdvendaorcs) {
		this.vdvendaorcs = vdvendaorcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Set getEqmovprods() {
		return this.eqmovprods;
	}

	public void setEqmovprods(Set eqmovprods) {
		this.eqmovprods = eqmovprods;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditvenda")
	public Set getCpdevolucaos() {
		return this.cpdevolucaos;
	}

	public void setCpdevolucaos(Set cpdevolucaos) {
		this.cpdevolucaos = cpdevolucaos;
	}
*/
}

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
 * Vdorcamento generated by hbm2java
 */
@Entity
@Table(name = "VDORCAMENTO")
public class Vdorcamento implements java.io.Serializable {

	private VdorcamentoId id;
	private Atatendente atatendente;
	private Vdcliente vdcliente;
	private Fnplanopag fnplanopag;
	private Vdclcomis vdclcomis;
	private Eqtipomov eqtipomov;
	private Attipoconv attipoconv;
	private Vdvendedor vdvendedor;
	private Vdtransp vdtransp;
	private Atconveniado atconveniado;
	private Date dtorc;
	private Date dtvencorc;
	private BigDecimal vlrprodorc;
	private BigDecimal percdescorc;
	private BigDecimal vlrdescorc;
	private BigDecimal percadicorc;
	private BigDecimal vlradicorc;
	private BigDecimal vlrdescitorc;
	private BigDecimal vlrliqorc;
	private String statusorc;
	private String obsorc;
	private String txt01;
	private Short prazoentorc;
	private Character emmanut;
	private Character tipofrete;
	private Character adicfrete;
	private BigDecimal vlrfreteorc;
	private BigDecimal vlrcomisorc;
	private Date dtaprovorc;
	private Date dtpreventorc;
	private Date hpreventorc;
	private String justificcancorc;
	private String acorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdstatusorcs = new HashSet(0);
	private Set atatendimentoorcs = new HashSet(0);
	private Vddetorc vddetorc;
	private Set vditorcamentos = new HashSet(0);

	public Vdorcamento() {
	}

	public Vdorcamento(VdorcamentoId id, Vdcliente vdcliente,
			Vdvendedor vdvendedor, Date dtorc, Date dtvencorc,
			String statusorc, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.vdvendedor = vdvendedor;
		this.dtorc = dtorc;
		this.dtvencorc = dtvencorc;
		this.statusorc = statusorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdorcamento(VdorcamentoId id, Atatendente atatendente,
			Vdcliente vdcliente, Fnplanopag fnplanopag, Vdclcomis vdclcomis,
			Eqtipomov eqtipomov, Attipoconv attipoconv, Vdvendedor vdvendedor,
			Vdtransp vdtransp, Atconveniado atconveniado, Date dtorc,
			Date dtvencorc, BigDecimal vlrprodorc, BigDecimal percdescorc,
			BigDecimal vlrdescorc, BigDecimal percadicorc,
			BigDecimal vlradicorc, BigDecimal vlrdescitorc,
			BigDecimal vlrliqorc, String statusorc, String obsorc,
			String txt01, Short prazoentorc, Character emmanut,
			Character tipofrete, Character adicfrete, BigDecimal vlrfreteorc,
			BigDecimal vlrcomisorc, Date dtaprovorc, Date dtpreventorc,
			Date hpreventorc, String justificcancorc, String acorc, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdstatusorcs, Set atatendimentoorcs, Vddetorc vddetorc,
			Set vditorcamentos) {
		this.id = id;
		this.atatendente = atatendente;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.vdclcomis = vdclcomis;
		this.eqtipomov = eqtipomov;
		this.attipoconv = attipoconv;
		this.vdvendedor = vdvendedor;
		this.vdtransp = vdtransp;
		this.atconveniado = atconveniado;
		this.dtorc = dtorc;
		this.dtvencorc = dtvencorc;
		this.vlrprodorc = vlrprodorc;
		this.percdescorc = percdescorc;
		this.vlrdescorc = vlrdescorc;
		this.percadicorc = percadicorc;
		this.vlradicorc = vlradicorc;
		this.vlrdescitorc = vlrdescitorc;
		this.vlrliqorc = vlrliqorc;
		this.statusorc = statusorc;
		this.obsorc = obsorc;
		this.txt01 = txt01;
		this.prazoentorc = prazoentorc;
		this.emmanut = emmanut;
		this.tipofrete = tipofrete;
		this.adicfrete = adicfrete;
		this.vlrfreteorc = vlrfreteorc;
		this.vlrcomisorc = vlrcomisorc;
		this.dtaprovorc = dtaprovorc;
		this.dtpreventorc = dtpreventorc;
		this.hpreventorc = hpreventorc;
		this.justificcancorc = justificcancorc;
		this.acorc = acorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdstatusorcs = vdstatusorcs;
		this.atatendimentoorcs = atatendimentoorcs;
		this.vddetorc = vddetorc;
		this.vditorcamentos = vditorcamentos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdorcamentoId getId() {
		return this.id;
	}

	public void setId(VdorcamentoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATEND", referencedColumnName = "CODATEND"),
			@JoinColumn(name = "CODFILIALAE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAE", referencedColumnName = "CODEMP") })
	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP", nullable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANOPAG", referencedColumnName = "CODPLANOPAG"),
			@JoinColumn(name = "CODFILIALPG", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPG", referencedColumnName = "CODEMP") })
	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLCOMIS", referencedColumnName = "CODCLCOMIS"),
			@JoinColumn(name = "CODFILIALCM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCM", referencedColumnName = "CODEMP") })
	public Vdclcomis getVdclcomis() {
		return this.vdclcomis;
	}

	public void setVdclcomis(Vdclcomis vdclcomis) {
		this.vdclcomis = vdclcomis;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOV", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTM", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPCONV", referencedColumnName = "CODTPCONV"),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP") })
	public Attipoconv getAttipoconv() {
		return this.attipoconv;
	}

	public void setAttipoconv(Attipoconv attipoconv) {
		this.attipoconv = attipoconv;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND", nullable = false),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP", nullable = false) })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DTORC", nullable = false, length = 10)
	public Date getDtorc() {
		return this.dtorc;
	}

	public void setDtorc(Date dtorc) {
		this.dtorc = dtorc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTVENCORC", nullable = false, length = 10)
	public Date getDtvencorc() {
		return this.dtvencorc;
	}

	public void setDtvencorc(Date dtvencorc) {
		this.dtvencorc = dtvencorc;
	}

	@Column(name = "VLRPRODORC", precision = 15, scale = 5)
	public BigDecimal getVlrprodorc() {
		return this.vlrprodorc;
	}

	public void setVlrprodorc(BigDecimal vlrprodorc) {
		this.vlrprodorc = vlrprodorc;
	}

	@Column(name = "PERCDESCORC", precision = 15, scale = 5)
	public BigDecimal getPercdescorc() {
		return this.percdescorc;
	}

	public void setPercdescorc(BigDecimal percdescorc) {
		this.percdescorc = percdescorc;
	}

	@Column(name = "VLRDESCORC", precision = 15, scale = 5)
	public BigDecimal getVlrdescorc() {
		return this.vlrdescorc;
	}

	public void setVlrdescorc(BigDecimal vlrdescorc) {
		this.vlrdescorc = vlrdescorc;
	}

	@Column(name = "PERCADICORC", precision = 15, scale = 5)
	public BigDecimal getPercadicorc() {
		return this.percadicorc;
	}

	public void setPercadicorc(BigDecimal percadicorc) {
		this.percadicorc = percadicorc;
	}

	@Column(name = "VLRADICORC", precision = 15, scale = 5)
	public BigDecimal getVlradicorc() {
		return this.vlradicorc;
	}

	public void setVlradicorc(BigDecimal vlradicorc) {
		this.vlradicorc = vlradicorc;
	}

	@Column(name = "VLRDESCITORC", precision = 15, scale = 5)
	public BigDecimal getVlrdescitorc() {
		return this.vlrdescitorc;
	}

	public void setVlrdescitorc(BigDecimal vlrdescitorc) {
		this.vlrdescitorc = vlrdescitorc;
	}

	@Column(name = "VLRLIQORC", precision = 15, scale = 5)
	public BigDecimal getVlrliqorc() {
		return this.vlrliqorc;
	}

	public void setVlrliqorc(BigDecimal vlrliqorc) {
		this.vlrliqorc = vlrliqorc;
	}

	@Column(name = "STATUSORC", nullable = false, length = 2)
	public String getStatusorc() {
		return this.statusorc;
	}

	public void setStatusorc(String statusorc) {
		this.statusorc = statusorc;
	}

	@Column(name = "OBSORC", length = 10000)
	public String getObsorc() {
		return this.obsorc;
	}

	public void setObsorc(String obsorc) {
		this.obsorc = obsorc;
	}

	@Column(name = "TXT01", length = 20)
	public String getTxt01() {
		return this.txt01;
	}

	public void setTxt01(String txt01) {
		this.txt01 = txt01;
	}

	@Column(name = "PRAZOENTORC")
	public Short getPrazoentorc() {
		return this.prazoentorc;
	}

	public void setPrazoentorc(Short prazoentorc) {
		this.prazoentorc = prazoentorc;
	}

	@Column(name = "EMMANUT", length = 1)
	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
		this.emmanut = emmanut;
	}

	@Column(name = "TIPOFRETE", length = 1)
	public Character getTipofrete() {
		return this.tipofrete;
	}

	public void setTipofrete(Character tipofrete) {
		this.tipofrete = tipofrete;
	}

	@Column(name = "ADICFRETE", length = 1)
	public Character getAdicfrete() {
		return this.adicfrete;
	}

	public void setAdicfrete(Character adicfrete) {
		this.adicfrete = adicfrete;
	}

	@Column(name = "VLRFRETEORC", precision = 15, scale = 5)
	public BigDecimal getVlrfreteorc() {
		return this.vlrfreteorc;
	}

	public void setVlrfreteorc(BigDecimal vlrfreteorc) {
		this.vlrfreteorc = vlrfreteorc;
	}

	@Column(name = "VLRCOMISORC", precision = 15, scale = 5)
	public BigDecimal getVlrcomisorc() {
		return this.vlrcomisorc;
	}

	public void setVlrcomisorc(BigDecimal vlrcomisorc) {
		this.vlrcomisorc = vlrcomisorc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAPROVORC", length = 10)
	public Date getDtaprovorc() {
		return this.dtaprovorc;
	}

	public void setDtaprovorc(Date dtaprovorc) {
		this.dtaprovorc = dtaprovorc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVENTORC", length = 10)
	public Date getDtpreventorc() {
		return this.dtpreventorc;
	}

	public void setDtpreventorc(Date dtpreventorc) {
		this.dtpreventorc = dtpreventorc;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HPREVENTORC", length = 8)
	public Date getHpreventorc() {
		return this.hpreventorc;
	}

	public void setHpreventorc(Date hpreventorc) {
		this.hpreventorc = hpreventorc;
	}

	@Column(name = "JUSTIFICCANCORC", length = 500)
	public String getJustificcancorc() {
		return this.justificcancorc;
	}

	public void setJustificcancorc(String justificcancorc) {
		this.justificcancorc = justificcancorc;
	}

	@Column(name = "ACORC", length = 80)
	public String getAcorc() {
		return this.acorc;
	}

	public void setAcorc(String acorc) {
		this.acorc = acorc;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdorcamento")
	public Set getVdstatusorcs() {
		return this.vdstatusorcs;
	}

	public void setVdstatusorcs(Set vdstatusorcs) {
		this.vdstatusorcs = vdstatusorcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdorcamento")
	public Set getAtatendimentoorcs() {
		return this.atatendimentoorcs;
	}

	public void setAtatendimentoorcs(Set atatendimentoorcs) {
		this.atatendimentoorcs = atatendimentoorcs;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vdorcamento")
	public Vddetorc getVddetorc() {
		return this.vddetorc;
	}

	public void setVddetorc(Vddetorc vddetorc) {
		this.vddetorc = vddetorc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdorcamento")
	public Set getVditorcamentos() {
		return this.vditorcamentos;
	}

	public void setVditorcamentos(Set vditorcamentos) {
		this.vditorcamentos = vditorcamentos;
	}
*/
}

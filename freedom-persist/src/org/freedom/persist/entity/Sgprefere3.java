package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Sgprefere3 generated by hbm2java
 */
@Entity
@Table(name = "SGPREFERE3")
public class Sgprefere3 implements java.io.Serializable {

	private Sgprefere3Id id;
	private Tkemail tkemailBySgprefere3fktkemea;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg6;
	private Atmodatendo atmodatendoBySgprefere3atmodme;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg1;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg5;
	private Tkemail tkemailBySgprefere3fktkemen;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg8;
	private Tkemail tkemailBySgprefere3fktkemai;
	private Atmodatendo atmodatendoBySgprefere3atmodfj;
	private Tkemail tkemailBySgprefere3fktkeme2;
	private Tkconfemail tkconfemailBySgprefere3fktkconf;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg2;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg3;
	private Tkatividade tkatividadeBySgprefere3fktkatte;
	private Atmodatendo atmodatendoBySgprefere3atmodmi;
	private Tktipocont tktipocontBySgprefere3fktktip1;
	private Tkemail tkemailBySgprefere3fktkemec;
	private Tkatividade tkatividadeBySgprefere3fktkatce;
	private Atmodatendo atmodatendoBySgprefere3atmodfi;
	private Atmodatendo atmodatendoBySgprefere3atmodap;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg4;
	private Tktipocont tktipocontBySgprefere3fktktip2;
	private Tkconfemail tkconfemailBySgprefere3fktkcon2;
	private Eqvargrade eqvargradeBySgprefere3fktkvarg7;
	private String smtpmail;
	private Character smtpsslmail;
	private Character smtpautmail;
	private Integer portamail;
	private String usermail;
	private String passmail;
	private String endmail;
	private char autohoratend;
	private Character bloqatendcliatraso;
	private Character mostracliatraso;
	private Integer codempao;
	private Short codfilialao;
	private Integer codatendo;
	private Integer codempfi;
	private String emailnotif1;
	private String emailnotif2;
	private short tempomaxint;
	private char lancapontoaf;
	private short tolregponto;
	private char usactoseq;
	private String layoutfichaaval;
	private String layoutprefichaaval;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere3() {
	}

	public Sgprefere3(Sgprefere3Id id, char autohoratend, short tempomaxint,
			char lancapontoaf, short tolregponto, char usactoseq, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.autohoratend = autohoratend;
		this.tempomaxint = tempomaxint;
		this.lancapontoaf = lancapontoaf;
		this.tolregponto = tolregponto;
		this.usactoseq = usactoseq;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgprefere3(Sgprefere3Id id, Tkemail tkemailBySgprefere3fktkemea,
			Eqvargrade eqvargradeBySgprefere3fktkvarg6,
			Atmodatendo atmodatendoBySgprefere3atmodme,
			Eqvargrade eqvargradeBySgprefere3fktkvarg1,
			Eqvargrade eqvargradeBySgprefere3fktkvarg5,
			Tkemail tkemailBySgprefere3fktkemen,
			Eqvargrade eqvargradeBySgprefere3fktkvarg8,
			Tkemail tkemailBySgprefere3fktkemai,
			Atmodatendo atmodatendoBySgprefere3atmodfj,
			Tkemail tkemailBySgprefere3fktkeme2,
			Tkconfemail tkconfemailBySgprefere3fktkconf,
			Eqvargrade eqvargradeBySgprefere3fktkvarg2,
			Eqvargrade eqvargradeBySgprefere3fktkvarg3,
			Tkatividade tkatividadeBySgprefere3fktkatte,
			Atmodatendo atmodatendoBySgprefere3atmodmi,
			Tktipocont tktipocontBySgprefere3fktktip1,
			Tkemail tkemailBySgprefere3fktkemec,
			Tkatividade tkatividadeBySgprefere3fktkatce,
			Atmodatendo atmodatendoBySgprefere3atmodfi,
			Atmodatendo atmodatendoBySgprefere3atmodap,
			Eqvargrade eqvargradeBySgprefere3fktkvarg4,
			Tktipocont tktipocontBySgprefere3fktktip2,
			Tkconfemail tkconfemailBySgprefere3fktkcon2,
			Eqvargrade eqvargradeBySgprefere3fktkvarg7, String smtpmail,
			Character smtpsslmail, Character smtpautmail, Integer portamail,
			String usermail, String passmail, String endmail,
			char autohoratend, Character bloqatendcliatraso,
			Character mostracliatraso, Integer codempao, Short codfilialao,
			Integer codatendo, Integer codempfi, String emailnotif1,
			String emailnotif2, short tempomaxint, char lancapontoaf,
			short tolregponto, char usactoseq, String layoutfichaaval,
			String layoutprefichaaval, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.tkemailBySgprefere3fktkemea = tkemailBySgprefere3fktkemea;
		this.eqvargradeBySgprefere3fktkvarg6 = eqvargradeBySgprefere3fktkvarg6;
		this.atmodatendoBySgprefere3atmodme = atmodatendoBySgprefere3atmodme;
		this.eqvargradeBySgprefere3fktkvarg1 = eqvargradeBySgprefere3fktkvarg1;
		this.eqvargradeBySgprefere3fktkvarg5 = eqvargradeBySgprefere3fktkvarg5;
		this.tkemailBySgprefere3fktkemen = tkemailBySgprefere3fktkemen;
		this.eqvargradeBySgprefere3fktkvarg8 = eqvargradeBySgprefere3fktkvarg8;
		this.tkemailBySgprefere3fktkemai = tkemailBySgprefere3fktkemai;
		this.atmodatendoBySgprefere3atmodfj = atmodatendoBySgprefere3atmodfj;
		this.tkemailBySgprefere3fktkeme2 = tkemailBySgprefere3fktkeme2;
		this.tkconfemailBySgprefere3fktkconf = tkconfemailBySgprefere3fktkconf;
		this.eqvargradeBySgprefere3fktkvarg2 = eqvargradeBySgprefere3fktkvarg2;
		this.eqvargradeBySgprefere3fktkvarg3 = eqvargradeBySgprefere3fktkvarg3;
		this.tkatividadeBySgprefere3fktkatte = tkatividadeBySgprefere3fktkatte;
		this.atmodatendoBySgprefere3atmodmi = atmodatendoBySgprefere3atmodmi;
		this.tktipocontBySgprefere3fktktip1 = tktipocontBySgprefere3fktktip1;
		this.tkemailBySgprefere3fktkemec = tkemailBySgprefere3fktkemec;
		this.tkatividadeBySgprefere3fktkatce = tkatividadeBySgprefere3fktkatce;
		this.atmodatendoBySgprefere3atmodfi = atmodatendoBySgprefere3atmodfi;
		this.atmodatendoBySgprefere3atmodap = atmodatendoBySgprefere3atmodap;
		this.eqvargradeBySgprefere3fktkvarg4 = eqvargradeBySgprefere3fktkvarg4;
		this.tktipocontBySgprefere3fktktip2 = tktipocontBySgprefere3fktktip2;
		this.tkconfemailBySgprefere3fktkcon2 = tkconfemailBySgprefere3fktkcon2;
		this.eqvargradeBySgprefere3fktkvarg7 = eqvargradeBySgprefere3fktkvarg7;
		this.smtpmail = smtpmail;
		this.smtpsslmail = smtpsslmail;
		this.smtpautmail = smtpautmail;
		this.portamail = portamail;
		this.usermail = usermail;
		this.passmail = passmail;
		this.endmail = endmail;
		this.autohoratend = autohoratend;
		this.bloqatendcliatraso = bloqatendcliatraso;
		this.mostracliatraso = mostracliatraso;
		this.codempao = codempao;
		this.codfilialao = codfilialao;
		this.codatendo = codatendo;
		this.codempfi = codempfi;
		this.emailnotif1 = emailnotif1;
		this.emailnotif2 = emailnotif2;
		this.tempomaxint = tempomaxint;
		this.lancapontoaf = lancapontoaf;
		this.tolregponto = tolregponto;
		this.usactoseq = usactoseq;
		this.layoutfichaaval = layoutfichaaval;
		this.layoutprefichaaval = layoutprefichaaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public Sgprefere3Id getId() {
		return this.id;
	}

	public void setId(Sgprefere3Id id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMAILEA", referencedColumnName = "CODEMAIL"),
			@JoinColumn(name = "CODFILIALEA", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEA", referencedColumnName = "CODEMP") })
	public Tkemail getTkemailBySgprefere3fktkemea() {
		return this.tkemailBySgprefere3fktkemea;
	}

	public void setTkemailBySgprefere3fktkemea(
			Tkemail tkemailBySgprefere3fktkemea) {
		this.tkemailBySgprefere3fktkemea = tkemailBySgprefere3fktkemea;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG6", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV6", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV6", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg6() {
		return this.eqvargradeBySgprefere3fktkvarg6;
	}

	public void setEqvargradeBySgprefere3fktkvarg6(
			Eqvargrade eqvargradeBySgprefere3fktkvarg6) {
		this.eqvargradeBySgprefere3fktkvarg6 = eqvargradeBySgprefere3fktkvarg6;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODELME", referencedColumnName = "CODMODEL"),
			@JoinColumn(name = "CODFILIALME", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPME", referencedColumnName = "CODEMP") })
	public Atmodatendo getAtmodatendoBySgprefere3atmodme() {
		return this.atmodatendoBySgprefere3atmodme;
	}

	public void setAtmodatendoBySgprefere3atmodme(
			Atmodatendo atmodatendoBySgprefere3atmodme) {
		this.atmodatendoBySgprefere3atmodme = atmodatendoBySgprefere3atmodme;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG1", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV1", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV1", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg1() {
		return this.eqvargradeBySgprefere3fktkvarg1;
	}

	public void setEqvargradeBySgprefere3fktkvarg1(
			Eqvargrade eqvargradeBySgprefere3fktkvarg1) {
		this.eqvargradeBySgprefere3fktkvarg1 = eqvargradeBySgprefere3fktkvarg1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG5", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV5", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV5", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg5() {
		return this.eqvargradeBySgprefere3fktkvarg5;
	}

	public void setEqvargradeBySgprefere3fktkvarg5(
			Eqvargrade eqvargradeBySgprefere3fktkvarg5) {
		this.eqvargradeBySgprefere3fktkvarg5 = eqvargradeBySgprefere3fktkvarg5;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMAILEN", referencedColumnName = "CODEMAIL"),
			@JoinColumn(name = "CODFILIALEN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEN", referencedColumnName = "CODEMP") })
	public Tkemail getTkemailBySgprefere3fktkemen() {
		return this.tkemailBySgprefere3fktkemen;
	}

	public void setTkemailBySgprefere3fktkemen(
			Tkemail tkemailBySgprefere3fktkemen) {
		this.tkemailBySgprefere3fktkemen = tkemailBySgprefere3fktkemen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG8", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV8", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV8", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg8() {
		return this.eqvargradeBySgprefere3fktkvarg8;
	}

	public void setEqvargradeBySgprefere3fktkvarg8(
			Eqvargrade eqvargradeBySgprefere3fktkvarg8) {
		this.eqvargradeBySgprefere3fktkvarg8 = eqvargradeBySgprefere3fktkvarg8;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMAILNC", referencedColumnName = "CODEMAIL"),
			@JoinColumn(name = "CODFILIALNC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPNC", referencedColumnName = "CODEMP") })
	public Tkemail getTkemailBySgprefere3fktkemai() {
		return this.tkemailBySgprefere3fktkemai;
	}

	public void setTkemailBySgprefere3fktkemai(
			Tkemail tkemailBySgprefere3fktkemai) {
		this.tkemailBySgprefere3fktkemai = tkemailBySgprefere3fktkemai;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODELFJ", referencedColumnName = "CODMODEL"),
			@JoinColumn(name = "CODFILIALFJ", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPFJ", referencedColumnName = "CODEMP") })
	public Atmodatendo getAtmodatendoBySgprefere3atmodfj() {
		return this.atmodatendoBySgprefere3atmodfj;
	}

	public void setAtmodatendoBySgprefere3atmodfj(
			Atmodatendo atmodatendoBySgprefere3atmodfj) {
		this.atmodatendoBySgprefere3atmodfj = atmodatendoBySgprefere3atmodfj;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMAILEN2", referencedColumnName = "CODEMAIL"),
			@JoinColumn(name = "CODFILIALE2", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPE2", referencedColumnName = "CODEMP") })
	public Tkemail getTkemailBySgprefere3fktkeme2() {
		return this.tkemailBySgprefere3fktkeme2;
	}

	public void setTkemailBySgprefere3fktkeme2(
			Tkemail tkemailBySgprefere3fktkeme2) {
		this.tkemailBySgprefere3fktkeme2 = tkemailBySgprefere3fktkeme2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONFEMAIL", referencedColumnName = "CODCONFEMAIL"),
			@JoinColumn(name = "CODFILIALCF", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCF", referencedColumnName = "CODEMP") })
	public Tkconfemail getTkconfemailBySgprefere3fktkconf() {
		return this.tkconfemailBySgprefere3fktkconf;
	}

	public void setTkconfemailBySgprefere3fktkconf(
			Tkconfemail tkconfemailBySgprefere3fktkconf) {
		this.tkconfemailBySgprefere3fktkconf = tkconfemailBySgprefere3fktkconf;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG2", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV2", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV2", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg2() {
		return this.eqvargradeBySgprefere3fktkvarg2;
	}

	public void setEqvargradeBySgprefere3fktkvarg2(
			Eqvargrade eqvargradeBySgprefere3fktkvarg2) {
		this.eqvargradeBySgprefere3fktkvarg2 = eqvargradeBySgprefere3fktkvarg2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG3", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV3", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV3", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg3() {
		return this.eqvargradeBySgprefere3fktkvarg3;
	}

	public void setEqvargradeBySgprefere3fktkvarg3(
			Eqvargrade eqvargradeBySgprefere3fktkvarg3) {
		this.eqvargradeBySgprefere3fktkvarg3 = eqvargradeBySgprefere3fktkvarg3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATIVTE", referencedColumnName = "CODATIV"),
			@JoinColumn(name = "CODFILIALTE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTE", referencedColumnName = "CODEMP") })
	public Tkatividade getTkatividadeBySgprefere3fktkatte() {
		return this.tkatividadeBySgprefere3fktkatte;
	}

	public void setTkatividadeBySgprefere3fktkatte(
			Tkatividade tkatividadeBySgprefere3fktkatte) {
		this.tkatividadeBySgprefere3fktkatte = tkatividadeBySgprefere3fktkatte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODELMI", referencedColumnName = "CODMODEL"),
			@JoinColumn(name = "CODFILIALMI", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPMI", referencedColumnName = "CODEMP") })
	public Atmodatendo getAtmodatendoBySgprefere3atmodmi() {
		return this.atmodatendoBySgprefere3atmodmi;
	}

	public void setAtmodatendoBySgprefere3atmodmi(
			Atmodatendo atmodatendoBySgprefere3atmodmi) {
		this.atmodatendoBySgprefere3atmodmi = atmodatendoBySgprefere3atmodmi;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCONT1", referencedColumnName = "CODTIPOCONT"),
			@JoinColumn(name = "CODFILIALT1", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPT1", referencedColumnName = "CODEMP") })
	public Tktipocont getTktipocontBySgprefere3fktktip1() {
		return this.tktipocontBySgprefere3fktktip1;
	}

	public void setTktipocontBySgprefere3fktktip1(
			Tktipocont tktipocontBySgprefere3fktktip1) {
		this.tktipocontBySgprefere3fktktip1 = tktipocontBySgprefere3fktktip1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMAILEC", referencedColumnName = "CODEMAIL"),
			@JoinColumn(name = "CODFILIALEC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEC", referencedColumnName = "CODEMP") })
	public Tkemail getTkemailBySgprefere3fktkemec() {
		return this.tkemailBySgprefere3fktkemec;
	}

	public void setTkemailBySgprefere3fktkemec(
			Tkemail tkemailBySgprefere3fktkemec) {
		this.tkemailBySgprefere3fktkemec = tkemailBySgprefere3fktkemec;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATIVCE", referencedColumnName = "CODATIV"),
			@JoinColumn(name = "CODFILIALCE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCE", referencedColumnName = "CODEMP") })
	public Tkatividade getTkatividadeBySgprefere3fktkatce() {
		return this.tkatividadeBySgprefere3fktkatce;
	}

	public void setTkatividadeBySgprefere3fktkatce(
			Tkatividade tkatividadeBySgprefere3fktkatce) {
		this.tkatividadeBySgprefere3fktkatce = tkatividadeBySgprefere3fktkatce;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODELFI", referencedColumnName = "CODMODEL", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALFI", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPMI", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Atmodatendo getAtmodatendoBySgprefere3atmodfi() {
		return this.atmodatendoBySgprefere3atmodfi;
	}

	public void setAtmodatendoBySgprefere3atmodfi(
			Atmodatendo atmodatendoBySgprefere3atmodfi) {
		this.atmodatendoBySgprefere3atmodfi = atmodatendoBySgprefere3atmodfi;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODELAP", referencedColumnName = "CODMODEL"),
			@JoinColumn(name = "CODFILIALAP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAP", referencedColumnName = "CODEMP") })
	public Atmodatendo getAtmodatendoBySgprefere3atmodap() {
		return this.atmodatendoBySgprefere3atmodap;
	}

	public void setAtmodatendoBySgprefere3atmodap(
			Atmodatendo atmodatendoBySgprefere3atmodap) {
		this.atmodatendoBySgprefere3atmodap = atmodatendoBySgprefere3atmodap;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG4", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV4", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV4", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg4() {
		return this.eqvargradeBySgprefere3fktkvarg4;
	}

	public void setEqvargradeBySgprefere3fktkvarg4(
			Eqvargrade eqvargradeBySgprefere3fktkvarg4) {
		this.eqvargradeBySgprefere3fktkvarg4 = eqvargradeBySgprefere3fktkvarg4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCONT2", referencedColumnName = "CODTIPOCONT"),
			@JoinColumn(name = "CODFILIALT2", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPT2", referencedColumnName = "CODEMP") })
	public Tktipocont getTktipocontBySgprefere3fktktip2() {
		return this.tktipocontBySgprefere3fktktip2;
	}

	public void setTktipocontBySgprefere3fktktip2(
			Tktipocont tktipocontBySgprefere3fktktip2) {
		this.tktipocontBySgprefere3fktktip2 = tktipocontBySgprefere3fktktip2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONFEMAIL2", referencedColumnName = "CODCONFEMAIL"),
			@JoinColumn(name = "CODFILIALC2", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPC2", referencedColumnName = "CODEMP") })
	public Tkconfemail getTkconfemailBySgprefere3fktkcon2() {
		return this.tkconfemailBySgprefere3fktkcon2;
	}

	public void setTkconfemailBySgprefere3fktkcon2(
			Tkconfemail tkconfemailBySgprefere3fktkcon2) {
		this.tkconfemailBySgprefere3fktkcon2 = tkconfemailBySgprefere3fktkcon2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG7", referencedColumnName = "CODVARG"),
			@JoinColumn(name = "CODFILIALV7", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPV7", referencedColumnName = "CODEMP") })
	public Eqvargrade getEqvargradeBySgprefere3fktkvarg7() {
		return this.eqvargradeBySgprefere3fktkvarg7;
	}

	public void setEqvargradeBySgprefere3fktkvarg7(
			Eqvargrade eqvargradeBySgprefere3fktkvarg7) {
		this.eqvargradeBySgprefere3fktkvarg7 = eqvargradeBySgprefere3fktkvarg7;
	}

	@Column(name = "SMTPMAIL", length = 40)
	public String getSmtpmail() {
		return this.smtpmail;
	}

	public void setSmtpmail(String smtpmail) {
		this.smtpmail = smtpmail;
	}

	@Column(name = "SMTPSSLMAIL", length = 1)
	public Character getSmtpsslmail() {
		return this.smtpsslmail;
	}

	public void setSmtpsslmail(Character smtpsslmail) {
		this.smtpsslmail = smtpsslmail;
	}

	@Column(name = "SMTPAUTMAIL", length = 1)
	public Character getSmtpautmail() {
		return this.smtpautmail;
	}

	public void setSmtpautmail(Character smtpautmail) {
		this.smtpautmail = smtpautmail;
	}

	@Column(name = "PORTAMAIL")
	public Integer getPortamail() {
		return this.portamail;
	}

	public void setPortamail(Integer portamail) {
		this.portamail = portamail;
	}

	@Column(name = "USERMAIL", length = 40)
	public String getUsermail() {
		return this.usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

	@Column(name = "PASSMAIL", length = 40)
	public String getPassmail() {
		return this.passmail;
	}

	public void setPassmail(String passmail) {
		this.passmail = passmail;
	}

	@Column(name = "ENDMAIL", length = 60)
	public String getEndmail() {
		return this.endmail;
	}

	public void setEndmail(String endmail) {
		this.endmail = endmail;
	}

	@Column(name = "AUTOHORATEND", nullable = false, length = 1)
	public char getAutohoratend() {
		return this.autohoratend;
	}

	public void setAutohoratend(char autohoratend) {
		this.autohoratend = autohoratend;
	}

	@Column(name = "BLOQATENDCLIATRASO", length = 1)
	public Character getBloqatendcliatraso() {
		return this.bloqatendcliatraso;
	}

	public void setBloqatendcliatraso(Character bloqatendcliatraso) {
		this.bloqatendcliatraso = bloqatendcliatraso;
	}

	@Column(name = "MOSTRACLIATRASO", length = 1)
	public Character getMostracliatraso() {
		return this.mostracliatraso;
	}

	public void setMostracliatraso(Character mostracliatraso) {
		this.mostracliatraso = mostracliatraso;
	}

	@Column(name = "CODEMPAO")
	public Integer getCodempao() {
		return this.codempao;
	}

	public void setCodempao(Integer codempao) {
		this.codempao = codempao;
	}

	@Column(name = "CODFILIALAO")
	public Short getCodfilialao() {
		return this.codfilialao;
	}

	public void setCodfilialao(Short codfilialao) {
		this.codfilialao = codfilialao;
	}

	@Column(name = "CODATENDO")
	public Integer getCodatendo() {
		return this.codatendo;
	}

	public void setCodatendo(Integer codatendo) {
		this.codatendo = codatendo;
	}

	@Column(name = "CODEMPFI")
	public Integer getCodempfi() {
		return this.codempfi;
	}

	public void setCodempfi(Integer codempfi) {
		this.codempfi = codempfi;
	}

	@Column(name = "EMAILNOTIF1", length = 250)
	public String getEmailnotif1() {
		return this.emailnotif1;
	}

	public void setEmailnotif1(String emailnotif1) {
		this.emailnotif1 = emailnotif1;
	}

	@Column(name = "EMAILNOTIF2", length = 250)
	public String getEmailnotif2() {
		return this.emailnotif2;
	}

	public void setEmailnotif2(String emailnotif2) {
		this.emailnotif2 = emailnotif2;
	}

	@Column(name = "TEMPOMAXINT", nullable = false)
	public short getTempomaxint() {
		return this.tempomaxint;
	}

	public void setTempomaxint(short tempomaxint) {
		this.tempomaxint = tempomaxint;
	}

	@Column(name = "LANCAPONTOAF", nullable = false, length = 1)
	public char getLancapontoaf() {
		return this.lancapontoaf;
	}

	public void setLancapontoaf(char lancapontoaf) {
		this.lancapontoaf = lancapontoaf;
	}

	@Column(name = "TOLREGPONTO", nullable = false)
	public short getTolregponto() {
		return this.tolregponto;
	}

	public void setTolregponto(short tolregponto) {
		this.tolregponto = tolregponto;
	}

	@Column(name = "USACTOSEQ", nullable = false, length = 1)
	public char getUsactoseq() {
		return this.usactoseq;
	}

	public void setUsactoseq(char usactoseq) {
		this.usactoseq = usactoseq;
	}

	@Column(name = "LAYOUTFICHAAVAL", length = 100)
	public String getLayoutfichaaval() {
		return this.layoutfichaaval;
	}

	public void setLayoutfichaaval(String layoutfichaaval) {
		this.layoutfichaaval = layoutfichaaval;
	}

	@Column(name = "LAYOUTPREFICHAAVAL", length = 100)
	public String getLayoutprefichaaval() {
		return this.layoutprefichaaval;
	}

	public void setLayoutprefichaaval(String layoutprefichaaval) {
		this.layoutprefichaaval = layoutprefichaaval;
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

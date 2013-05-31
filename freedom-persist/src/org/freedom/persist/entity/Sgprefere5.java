package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Sgprefere5 generated by hbm2java
 */
@Entity
@Table(name = "SGPREFERE5")
public class Sgprefere5 implements java.io.Serializable {

	private Sgprefere5Id id;
	private Sgfilial sgfilial;
	private Eqtipomov eqtipomovBySgprefere5fktipomoven;
	private Eqtipomov eqtipomovBySgprefere5fkeqtipo;
	private Eqtipomov eqtipomovBySgprefere5fktipomovsp;
	private Eqtipomov eqtipomovBySgprefere5fktipomovre;
	private String classop;
	private String nomeresp;
	private String identprofresp;
	private String cargoresp;
	private short mesesdesccp;
	private String sitrmaop;
	private byte[] imgassresp;
	private char baixarmaaprov;
	private char ratauto;
	private char apagarmaop;
	private char nomerelanal;
	private String sitpadop;
	private String sitpadopconv;
	private char habconvcp;
	private char opseq;
	private Character prodetapas;
	private char expedirrma;
	private char validaqtdop;
	private char validafaseop;
	private char editqtdop;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere5() {
	}

	public Sgprefere5(Sgfilial sgfilial, short mesesdesccp, char baixarmaaprov,
			char ratauto, char apagarmaop, char nomerelanal, String sitpadop,
			String sitpadopconv, char habconvcp, char opseq, char expedirrma,
			char validaqtdop, char validafaseop, char editqtdop, Date dtins,
			Date hins, String idusuins) {
		this.sgfilial = sgfilial;
		this.mesesdesccp = mesesdesccp;
		this.baixarmaaprov = baixarmaaprov;
		this.ratauto = ratauto;
		this.apagarmaop = apagarmaop;
		this.nomerelanal = nomerelanal;
		this.sitpadop = sitpadop;
		this.sitpadopconv = sitpadopconv;
		this.habconvcp = habconvcp;
		this.opseq = opseq;
		this.expedirrma = expedirrma;
		this.validaqtdop = validaqtdop;
		this.validafaseop = validafaseop;
		this.editqtdop = editqtdop;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgprefere5(Sgfilial sgfilial,
			Eqtipomov eqtipomovBySgprefere5fktipomoven,
			Eqtipomov eqtipomovBySgprefere5fkeqtipo,
			Eqtipomov eqtipomovBySgprefere5fktipomovsp,
			Eqtipomov eqtipomovBySgprefere5fktipomovre, String classop,
			String nomeresp, String identprofresp, String cargoresp,
			short mesesdesccp, String sitrmaop, byte[] imgassresp,
			char baixarmaaprov, char ratauto, char apagarmaop,
			char nomerelanal, String sitpadop, String sitpadopconv,
			char habconvcp, char opseq, Character prodetapas, char expedirrma,
			char validaqtdop, char validafaseop, char editqtdop, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.sgfilial = sgfilial;
		this.eqtipomovBySgprefere5fktipomoven = eqtipomovBySgprefere5fktipomoven;
		this.eqtipomovBySgprefere5fkeqtipo = eqtipomovBySgprefere5fkeqtipo;
		this.eqtipomovBySgprefere5fktipomovsp = eqtipomovBySgprefere5fktipomovsp;
		this.eqtipomovBySgprefere5fktipomovre = eqtipomovBySgprefere5fktipomovre;
		this.classop = classop;
		this.nomeresp = nomeresp;
		this.identprofresp = identprofresp;
		this.cargoresp = cargoresp;
		this.mesesdesccp = mesesdesccp;
		this.sitrmaop = sitrmaop;
		this.imgassresp = imgassresp;
		this.baixarmaaprov = baixarmaaprov;
		this.ratauto = ratauto;
		this.apagarmaop = apagarmaop;
		this.nomerelanal = nomerelanal;
		this.sitpadop = sitpadop;
		this.sitpadopconv = sitpadopconv;
		this.habconvcp = habconvcp;
		this.opseq = opseq;
		this.prodetapas = prodetapas;
		this.expedirrma = expedirrma;
		this.validaqtdop = validaqtdop;
		this.validafaseop = validafaseop;
		this.editqtdop = editqtdop;
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
	public Sgprefere5Id getId() {
		return this.id;
	}

	public void setId(Sgprefere5Id id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVEN", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALEN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEN", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgprefere5fktipomoven() {
		return this.eqtipomovBySgprefere5fktipomoven;
	}

	public void setEqtipomovBySgprefere5fktipomoven(
			Eqtipomov eqtipomovBySgprefere5fktipomoven) {
		this.eqtipomovBySgprefere5fktipomoven = eqtipomovBySgprefere5fktipomoven;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOV", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTM", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgprefere5fkeqtipo() {
		return this.eqtipomovBySgprefere5fkeqtipo;
	}

	public void setEqtipomovBySgprefere5fkeqtipo(
			Eqtipomov eqtipomovBySgprefere5fkeqtipo) {
		this.eqtipomovBySgprefere5fkeqtipo = eqtipomovBySgprefere5fkeqtipo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVSP", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTS", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgprefere5fktipomovsp() {
		return this.eqtipomovBySgprefere5fktipomovsp;
	}

	public void setEqtipomovBySgprefere5fktipomovsp(
			Eqtipomov eqtipomovBySgprefere5fktipomovsp) {
		this.eqtipomovBySgprefere5fktipomovsp = eqtipomovBySgprefere5fktipomovsp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVRE", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALRE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPRE", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgprefere5fktipomovre() {
		return this.eqtipomovBySgprefere5fktipomovre;
	}

	public void setEqtipomovBySgprefere5fktipomovre(
			Eqtipomov eqtipomovBySgprefere5fktipomovre) {
		this.eqtipomovBySgprefere5fktipomovre = eqtipomovBySgprefere5fktipomovre;
	}

	@Column(name = "CLASSOP", length = 20)
	public String getClassop() {
		return this.classop;
	}

	public void setClassop(String classop) {
		this.classop = classop;
	}

	@Column(name = "NOMERESP", length = 50)
	public String getNomeresp() {
		return this.nomeresp;
	}

	public void setNomeresp(String nomeresp) {
		this.nomeresp = nomeresp;
	}

	@Column(name = "IDENTPROFRESP", length = 30)
	public String getIdentprofresp() {
		return this.identprofresp;
	}

	public void setIdentprofresp(String identprofresp) {
		this.identprofresp = identprofresp;
	}

	@Column(name = "CARGORESP", length = 30)
	public String getCargoresp() {
		return this.cargoresp;
	}

	public void setCargoresp(String cargoresp) {
		this.cargoresp = cargoresp;
	}

	@Column(name = "MESESDESCCP", nullable = false)
	public short getMesesdesccp() {
		return this.mesesdesccp;
	}

	public void setMesesdesccp(short mesesdesccp) {
		this.mesesdesccp = mesesdesccp;
	}

	@Column(name = "SITRMAOP", length = 2)
	public String getSitrmaop() {
		return this.sitrmaop;
	}

	public void setSitrmaop(String sitrmaop) {
		this.sitrmaop = sitrmaop;
	}

	@Column(name = "IMGASSRESP")
	public byte[] getImgassresp() {
		return this.imgassresp;
	}

	public void setImgassresp(byte[] imgassresp) {
		this.imgassresp = imgassresp;
	}

	@Column(name = "BAIXARMAAPROV", nullable = false, length = 1)
	public char getBaixarmaaprov() {
		return this.baixarmaaprov;
	}

	public void setBaixarmaaprov(char baixarmaaprov) {
		this.baixarmaaprov = baixarmaaprov;
	}

	@Column(name = "RATAUTO", nullable = false, length = 1)
	public char getRatauto() {
		return this.ratauto;
	}

	public void setRatauto(char ratauto) {
		this.ratauto = ratauto;
	}

	@Column(name = "APAGARMAOP", nullable = false, length = 1)
	public char getApagarmaop() {
		return this.apagarmaop;
	}

	public void setApagarmaop(char apagarmaop) {
		this.apagarmaop = apagarmaop;
	}

	@Column(name = "NOMERELANAL", nullable = false, length = 1)
	public char getNomerelanal() {
		return this.nomerelanal;
	}

	public void setNomerelanal(char nomerelanal) {
		this.nomerelanal = nomerelanal;
	}

	@Column(name = "SITPADOP", nullable = false, length = 2)
	public String getSitpadop() {
		return this.sitpadop;
	}

	public void setSitpadop(String sitpadop) {
		this.sitpadop = sitpadop;
	}

	@Column(name = "SITPADOPCONV", nullable = false, length = 2)
	public String getSitpadopconv() {
		return this.sitpadopconv;
	}

	public void setSitpadopconv(String sitpadopconv) {
		this.sitpadopconv = sitpadopconv;
	}

	@Column(name = "HABCONVCP", nullable = false, length = 1)
	public char getHabconvcp() {
		return this.habconvcp;
	}

	public void setHabconvcp(char habconvcp) {
		this.habconvcp = habconvcp;
	}

	@Column(name = "OPSEQ", nullable = false, length = 1)
	public char getOpseq() {
		return this.opseq;
	}

	public void setOpseq(char opseq) {
		this.opseq = opseq;
	}

	@Column(name = "PRODETAPAS", length = 1)
	public Character getProdetapas() {
		return this.prodetapas;
	}

	public void setProdetapas(Character prodetapas) {
		this.prodetapas = prodetapas;
	}

	@Column(name = "EXPEDIRRMA", nullable = false, length = 1)
	public char getExpedirrma() {
		return this.expedirrma;
	}

	public void setExpedirrma(char expedirrma) {
		this.expedirrma = expedirrma;
	}

	@Column(name = "VALIDAQTDOP", nullable = false, length = 1)
	public char getValidaqtdop() {
		return this.validaqtdop;
	}

	public void setValidaqtdop(char validaqtdop) {
		this.validaqtdop = validaqtdop;
	}

	@Column(name = "VALIDAFASEOP", nullable = false, length = 1)
	public char getValidafaseop() {
		return this.validafaseop;
	}

	public void setValidafaseop(char validafaseop) {
		this.validafaseop = validafaseop;
	}

	@Column(name = "EDITQTDOP", nullable = false, length = 1)
	public char getEditqtdop() {
		return this.editqtdop;
	}

	public void setEditqtdop(char editqtdop) {
		this.editqtdop = editqtdop;
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

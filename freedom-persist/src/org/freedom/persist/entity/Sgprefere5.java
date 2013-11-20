package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgprefere5 generated by hbm2java
 */
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
	private char bloqopsemsaldo;
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
			char validaqtdop, char validafaseop, char editqtdop,
			char bloqopsemsaldo, Date dtins, Date hins, String idusuins) {
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
		this.bloqopsemsaldo = bloqopsemsaldo;
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
			char validaqtdop, char validafaseop, char editqtdop,
			char bloqopsemsaldo, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
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
		this.bloqopsemsaldo = bloqopsemsaldo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere5Id getId() {
		return this.id;
	}

	public void setId(Sgprefere5Id id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqtipomov getEqtipomovBySgprefere5fktipomoven() {
		return this.eqtipomovBySgprefere5fktipomoven;
	}

	public void setEqtipomovBySgprefere5fktipomoven(
			Eqtipomov eqtipomovBySgprefere5fktipomoven) {
		this.eqtipomovBySgprefere5fktipomoven = eqtipomovBySgprefere5fktipomoven;
	}

	public Eqtipomov getEqtipomovBySgprefere5fkeqtipo() {
		return this.eqtipomovBySgprefere5fkeqtipo;
	}

	public void setEqtipomovBySgprefere5fkeqtipo(
			Eqtipomov eqtipomovBySgprefere5fkeqtipo) {
		this.eqtipomovBySgprefere5fkeqtipo = eqtipomovBySgprefere5fkeqtipo;
	}

	public Eqtipomov getEqtipomovBySgprefere5fktipomovsp() {
		return this.eqtipomovBySgprefere5fktipomovsp;
	}

	public void setEqtipomovBySgprefere5fktipomovsp(
			Eqtipomov eqtipomovBySgprefere5fktipomovsp) {
		this.eqtipomovBySgprefere5fktipomovsp = eqtipomovBySgprefere5fktipomovsp;
	}

	public Eqtipomov getEqtipomovBySgprefere5fktipomovre() {
		return this.eqtipomovBySgprefere5fktipomovre;
	}

	public void setEqtipomovBySgprefere5fktipomovre(
			Eqtipomov eqtipomovBySgprefere5fktipomovre) {
		this.eqtipomovBySgprefere5fktipomovre = eqtipomovBySgprefere5fktipomovre;
	}

	public String getClassop() {
		return this.classop;
	}

	public void setClassop(String classop) {
		this.classop = classop;
	}

	public String getNomeresp() {
		return this.nomeresp;
	}

	public void setNomeresp(String nomeresp) {
		this.nomeresp = nomeresp;
	}

	public String getIdentprofresp() {
		return this.identprofresp;
	}

	public void setIdentprofresp(String identprofresp) {
		this.identprofresp = identprofresp;
	}

	public String getCargoresp() {
		return this.cargoresp;
	}

	public void setCargoresp(String cargoresp) {
		this.cargoresp = cargoresp;
	}

	public short getMesesdesccp() {
		return this.mesesdesccp;
	}

	public void setMesesdesccp(short mesesdesccp) {
		this.mesesdesccp = mesesdesccp;
	}

	public String getSitrmaop() {
		return this.sitrmaop;
	}

	public void setSitrmaop(String sitrmaop) {
		this.sitrmaop = sitrmaop;
	}

	public byte[] getImgassresp() {
		return this.imgassresp;
	}

	public void setImgassresp(byte[] imgassresp) {
		this.imgassresp = imgassresp;
	}

	public char getBaixarmaaprov() {
		return this.baixarmaaprov;
	}

	public void setBaixarmaaprov(char baixarmaaprov) {
		this.baixarmaaprov = baixarmaaprov;
	}

	public char getRatauto() {
		return this.ratauto;
	}

	public void setRatauto(char ratauto) {
		this.ratauto = ratauto;
	}

	public char getApagarmaop() {
		return this.apagarmaop;
	}

	public void setApagarmaop(char apagarmaop) {
		this.apagarmaop = apagarmaop;
	}

	public char getNomerelanal() {
		return this.nomerelanal;
	}

	public void setNomerelanal(char nomerelanal) {
		this.nomerelanal = nomerelanal;
	}

	public String getSitpadop() {
		return this.sitpadop;
	}

	public void setSitpadop(String sitpadop) {
		this.sitpadop = sitpadop;
	}

	public String getSitpadopconv() {
		return this.sitpadopconv;
	}

	public void setSitpadopconv(String sitpadopconv) {
		this.sitpadopconv = sitpadopconv;
	}

	public char getHabconvcp() {
		return this.habconvcp;
	}

	public void setHabconvcp(char habconvcp) {
		this.habconvcp = habconvcp;
	}

	public char getOpseq() {
		return this.opseq;
	}

	public void setOpseq(char opseq) {
		this.opseq = opseq;
	}

	public Character getProdetapas() {
		return this.prodetapas;
	}

	public void setProdetapas(Character prodetapas) {
		this.prodetapas = prodetapas;
	}

	public char getExpedirrma() {
		return this.expedirrma;
	}

	public void setExpedirrma(char expedirrma) {
		this.expedirrma = expedirrma;
	}

	public char getValidaqtdop() {
		return this.validaqtdop;
	}

	public void setValidaqtdop(char validaqtdop) {
		this.validaqtdop = validaqtdop;
	}

	public char getValidafaseop() {
		return this.validafaseop;
	}

	public void setValidafaseop(char validafaseop) {
		this.validafaseop = validafaseop;
	}

	public char getEditqtdop() {
		return this.editqtdop;
	}

	public void setEditqtdop(char editqtdop) {
		this.editqtdop = editqtdop;
	}

	public char getBloqopsemsaldo() {
		return this.bloqopsemsaldo;
	}

	public void setBloqopsemsaldo(char bloqopsemsaldo) {
		this.bloqopsemsaldo = bloqopsemsaldo;
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

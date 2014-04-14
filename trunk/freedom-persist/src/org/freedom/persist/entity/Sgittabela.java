package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgittabela generated by hbm2java
 */
public class Sgittabela implements java.io.Serializable {

	private SgittabelaId id;
	private Sgtabela sgtabela;
	private String descittb;
	private char padraoittb;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdclientes = new HashSet(0);
	private Set vdstatusorcs = new HashSet(0);
	private Set sgprefere2sForSgprefere2fksgitt2 = new HashSet(0);
	private Set atconvatribtbs = new HashSet(0);
	private Set sgprefere2sForSgprefere2fksgitta = new HashSet(0);

	public Sgittabela() {
	}

	public Sgittabela(SgittabelaId id, Sgtabela sgtabela, String descittb,
			char padraoittb, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgtabela = sgtabela;
		this.descittb = descittb;
		this.padraoittb = padraoittb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgittabela(SgittabelaId id, Sgtabela sgtabela, String descittb,
			char padraoittb, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set vdclientes,
			Set vdstatusorcs, Set sgprefere2sForSgprefere2fksgitt2,
			Set atconvatribtbs, Set sgprefere2sForSgprefere2fksgitta) {
		this.id = id;
		this.sgtabela = sgtabela;
		this.descittb = descittb;
		this.padraoittb = padraoittb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.vdstatusorcs = vdstatusorcs;
		this.sgprefere2sForSgprefere2fksgitt2 = sgprefere2sForSgprefere2fksgitt2;
		this.atconvatribtbs = atconvatribtbs;
		this.sgprefere2sForSgprefere2fksgitta = sgprefere2sForSgprefere2fksgitta;
	}

	public SgittabelaId getId() {
		return this.id;
	}

	public void setId(SgittabelaId id) {
		this.id = id;
	}

	public Sgtabela getSgtabela() {
		return this.sgtabela;
	}

	public void setSgtabela(Sgtabela sgtabela) {
		this.sgtabela = sgtabela;
	}

	public String getDescittb() {
		return this.descittb;
	}

	public void setDescittb(String descittb) {
		this.descittb = descittb;
	}

	public char getPadraoittb() {
		return this.padraoittb;
	}

	public void setPadraoittb(char padraoittb) {
		this.padraoittb = padraoittb;
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

	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	public Set getVdstatusorcs() {
		return this.vdstatusorcs;
	}

	public void setVdstatusorcs(Set vdstatusorcs) {
		this.vdstatusorcs = vdstatusorcs;
	}

	public Set getSgprefere2sForSgprefere2fksgitt2() {
		return this.sgprefere2sForSgprefere2fksgitt2;
	}

	public void setSgprefere2sForSgprefere2fksgitt2(
			Set sgprefere2sForSgprefere2fksgitt2) {
		this.sgprefere2sForSgprefere2fksgitt2 = sgprefere2sForSgprefere2fksgitt2;
	}

	public Set getAtconvatribtbs() {
		return this.atconvatribtbs;
	}

	public void setAtconvatribtbs(Set atconvatribtbs) {
		this.atconvatribtbs = atconvatribtbs;
	}

	public Set getSgprefere2sForSgprefere2fksgitta() {
		return this.sgprefere2sForSgprefere2fksgitta;
	}

	public void setSgprefere2sForSgprefere2fksgitta(
			Set sgprefere2sForSgprefere2fksgitta) {
		this.sgprefere2sForSgprefere2fksgitta = sgprefere2sForSgprefere2fksgitta;
	}

}

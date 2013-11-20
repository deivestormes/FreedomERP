package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqmodgrade generated by hbm2java
 */
public class Eqmodgrade implements java.io.Serializable {

	private EqmodgradeId id;
	private Eqproduto eqproduto;
	private Sgfilial sgfilial;
	private String descmodg;
	private String descprodmodg;
	private String desccompprodmodg;
	private String refmodg;
	private String codfabmodg;
	private String codbarmodg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqitmodgrades = new HashSet(0);

	public Eqmodgrade() {
	}

	public Eqmodgrade(EqmodgradeId id, Eqproduto eqproduto, Sgfilial sgfilial,
			String descmodg, String descprodmodg, String refmodg,
			String codfabmodg, String codbarmodg, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.descmodg = descmodg;
		this.descprodmodg = descprodmodg;
		this.refmodg = refmodg;
		this.codfabmodg = codfabmodg;
		this.codbarmodg = codbarmodg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqmodgrade(EqmodgradeId id, Eqproduto eqproduto, Sgfilial sgfilial,
			String descmodg, String descprodmodg, String desccompprodmodg,
			String refmodg, String codfabmodg, String codbarmodg, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqitmodgrades) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.descmodg = descmodg;
		this.descprodmodg = descprodmodg;
		this.desccompprodmodg = desccompprodmodg;
		this.refmodg = refmodg;
		this.codfabmodg = codfabmodg;
		this.codbarmodg = codbarmodg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqitmodgrades = eqitmodgrades;
	}

	public EqmodgradeId getId() {
		return this.id;
	}

	public void setId(EqmodgradeId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescmodg() {
		return this.descmodg;
	}

	public void setDescmodg(String descmodg) {
		this.descmodg = descmodg;
	}

	public String getDescprodmodg() {
		return this.descprodmodg;
	}

	public void setDescprodmodg(String descprodmodg) {
		this.descprodmodg = descprodmodg;
	}

	public String getDesccompprodmodg() {
		return this.desccompprodmodg;
	}

	public void setDesccompprodmodg(String desccompprodmodg) {
		this.desccompprodmodg = desccompprodmodg;
	}

	public String getRefmodg() {
		return this.refmodg;
	}

	public void setRefmodg(String refmodg) {
		this.refmodg = refmodg;
	}

	public String getCodfabmodg() {
		return this.codfabmodg;
	}

	public void setCodfabmodg(String codfabmodg) {
		this.codfabmodg = codfabmodg;
	}

	public String getCodbarmodg() {
		return this.codbarmodg;
	}

	public void setCodbarmodg(String codbarmodg) {
		this.codbarmodg = codbarmodg;
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

	public Set getEqitmodgrades() {
		return this.eqitmodgrades;
	}

	public void setEqitmodgrades(Set eqitmodgrades) {
		this.eqitmodgrades = eqitmodgrades;
	}

}

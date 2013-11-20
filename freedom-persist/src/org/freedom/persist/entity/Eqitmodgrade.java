package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Eqitmodgrade generated by hbm2java
 */
public class Eqitmodgrade implements java.io.Serializable {

	private EqitmodgradeId id;
	private Eqvargrade eqvargrade;
	private Eqmodgrade eqmodgrade;
	private int ordemitmodg;
	private String refitmodg;
	private int codempvg;
	private short codfilialvg;
	private String codfabitmodg;
	private String codbaritmodg;
	private String descitmodg;
	private String desccompitmodg;
	private BigDecimal precoitvarg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqitmodgrade() {
	}

	public Eqitmodgrade(EqitmodgradeId id, Eqvargrade eqvargrade,
			Eqmodgrade eqmodgrade, int ordemitmodg, int codempvg,
			short codfilialvg, String descitmodg, BigDecimal precoitvarg,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqvargrade = eqvargrade;
		this.eqmodgrade = eqmodgrade;
		this.ordemitmodg = ordemitmodg;
		this.codempvg = codempvg;
		this.codfilialvg = codfilialvg;
		this.descitmodg = descitmodg;
		this.precoitvarg = precoitvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitmodgrade(EqitmodgradeId id, Eqvargrade eqvargrade,
			Eqmodgrade eqmodgrade, int ordemitmodg, String refitmodg,
			int codempvg, short codfilialvg, String codfabitmodg,
			String codbaritmodg, String descitmodg, String desccompitmodg,
			BigDecimal precoitvarg, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqvargrade = eqvargrade;
		this.eqmodgrade = eqmodgrade;
		this.ordemitmodg = ordemitmodg;
		this.refitmodg = refitmodg;
		this.codempvg = codempvg;
		this.codfilialvg = codfilialvg;
		this.codfabitmodg = codfabitmodg;
		this.codbaritmodg = codbaritmodg;
		this.descitmodg = descitmodg;
		this.desccompitmodg = desccompitmodg;
		this.precoitvarg = precoitvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqitmodgradeId getId() {
		return this.id;
	}

	public void setId(EqitmodgradeId id) {
		this.id = id;
	}

	public Eqvargrade getEqvargrade() {
		return this.eqvargrade;
	}

	public void setEqvargrade(Eqvargrade eqvargrade) {
		this.eqvargrade = eqvargrade;
	}

	public Eqmodgrade getEqmodgrade() {
		return this.eqmodgrade;
	}

	public void setEqmodgrade(Eqmodgrade eqmodgrade) {
		this.eqmodgrade = eqmodgrade;
	}

	public int getOrdemitmodg() {
		return this.ordemitmodg;
	}

	public void setOrdemitmodg(int ordemitmodg) {
		this.ordemitmodg = ordemitmodg;
	}

	public String getRefitmodg() {
		return this.refitmodg;
	}

	public void setRefitmodg(String refitmodg) {
		this.refitmodg = refitmodg;
	}

	public int getCodempvg() {
		return this.codempvg;
	}

	public void setCodempvg(int codempvg) {
		this.codempvg = codempvg;
	}

	public short getCodfilialvg() {
		return this.codfilialvg;
	}

	public void setCodfilialvg(short codfilialvg) {
		this.codfilialvg = codfilialvg;
	}

	public String getCodfabitmodg() {
		return this.codfabitmodg;
	}

	public void setCodfabitmodg(String codfabitmodg) {
		this.codfabitmodg = codfabitmodg;
	}

	public String getCodbaritmodg() {
		return this.codbaritmodg;
	}

	public void setCodbaritmodg(String codbaritmodg) {
		this.codbaritmodg = codbaritmodg;
	}

	public String getDescitmodg() {
		return this.descitmodg;
	}

	public void setDescitmodg(String descitmodg) {
		this.descitmodg = descitmodg;
	}

	public String getDesccompitmodg() {
		return this.desccompitmodg;
	}

	public void setDesccompitmodg(String desccompitmodg) {
		this.desccompitmodg = desccompitmodg;
	}

	public BigDecimal getPrecoitvarg() {
		return this.precoitvarg;
	}

	public void setPrecoitvarg(BigDecimal precoitvarg) {
		this.precoitvarg = precoitvarg;
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

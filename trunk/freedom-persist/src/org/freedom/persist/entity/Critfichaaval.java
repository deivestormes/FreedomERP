package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Critfichaaval generated by hbm2java
 */
public class Critfichaaval implements java.io.Serializable {

	private CritfichaavalId id;
	private Eqproduto eqproduto;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg6;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg3;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg8;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg2;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg1;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg7;
	private Crambienteaval crambienteaval;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg5;
	private Eqitvargrade eqitvargradeByCritfichaavalfkvg4;
	private Crfichaaval crfichaaval;
	private String descitfichaaval;
	private BigDecimal altitfichaaval;
	private BigDecimal compitfichaaval;
	private BigDecimal tiritfichaaval;
	private BigDecimal m2itfichaaval;
	private BigDecimal vlrunititfichaaval;
	private BigDecimal vlrtotitfichaaval;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set crfichaorcs = new HashSet(0);

	public Critfichaaval() {
	}

	public Critfichaaval(CritfichaavalId id, Eqproduto eqproduto,
			Crambienteaval crambienteaval, Crfichaaval crfichaaval,
			String descitfichaaval, BigDecimal altitfichaaval,
			BigDecimal compitfichaaval, BigDecimal tiritfichaaval,
			BigDecimal m2itfichaaval, BigDecimal vlrunititfichaaval,
			BigDecimal vlrtotitfichaaval, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.crambienteaval = crambienteaval;
		this.crfichaaval = crfichaaval;
		this.descitfichaaval = descitfichaaval;
		this.altitfichaaval = altitfichaaval;
		this.compitfichaaval = compitfichaaval;
		this.tiritfichaaval = tiritfichaaval;
		this.m2itfichaaval = m2itfichaaval;
		this.vlrunititfichaaval = vlrunititfichaaval;
		this.vlrtotitfichaaval = vlrtotitfichaaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Critfichaaval(CritfichaavalId id, Eqproduto eqproduto,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg6,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg3,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg8,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg2,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg1,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg7,
			Crambienteaval crambienteaval,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg5,
			Eqitvargrade eqitvargradeByCritfichaavalfkvg4,
			Crfichaaval crfichaaval, String descitfichaaval,
			BigDecimal altitfichaaval, BigDecimal compitfichaaval,
			BigDecimal tiritfichaaval, BigDecimal m2itfichaaval,
			BigDecimal vlrunititfichaaval, BigDecimal vlrtotitfichaaval,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set crfichaorcs) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqitvargradeByCritfichaavalfkvg6 = eqitvargradeByCritfichaavalfkvg6;
		this.eqitvargradeByCritfichaavalfkvg3 = eqitvargradeByCritfichaavalfkvg3;
		this.eqitvargradeByCritfichaavalfkvg8 = eqitvargradeByCritfichaavalfkvg8;
		this.eqitvargradeByCritfichaavalfkvg2 = eqitvargradeByCritfichaavalfkvg2;
		this.eqitvargradeByCritfichaavalfkvg1 = eqitvargradeByCritfichaavalfkvg1;
		this.eqitvargradeByCritfichaavalfkvg7 = eqitvargradeByCritfichaavalfkvg7;
		this.crambienteaval = crambienteaval;
		this.eqitvargradeByCritfichaavalfkvg5 = eqitvargradeByCritfichaavalfkvg5;
		this.eqitvargradeByCritfichaavalfkvg4 = eqitvargradeByCritfichaavalfkvg4;
		this.crfichaaval = crfichaaval;
		this.descitfichaaval = descitfichaaval;
		this.altitfichaaval = altitfichaaval;
		this.compitfichaaval = compitfichaaval;
		this.tiritfichaaval = tiritfichaaval;
		this.m2itfichaaval = m2itfichaaval;
		this.vlrunititfichaaval = vlrunititfichaaval;
		this.vlrtotitfichaaval = vlrtotitfichaaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crfichaorcs = crfichaorcs;
	}

	public CritfichaavalId getId() {
		return this.id;
	}

	public void setId(CritfichaavalId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg6() {
		return this.eqitvargradeByCritfichaavalfkvg6;
	}

	public void setEqitvargradeByCritfichaavalfkvg6(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg6) {
		this.eqitvargradeByCritfichaavalfkvg6 = eqitvargradeByCritfichaavalfkvg6;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg3() {
		return this.eqitvargradeByCritfichaavalfkvg3;
	}

	public void setEqitvargradeByCritfichaavalfkvg3(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg3) {
		this.eqitvargradeByCritfichaavalfkvg3 = eqitvargradeByCritfichaavalfkvg3;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg8() {
		return this.eqitvargradeByCritfichaavalfkvg8;
	}

	public void setEqitvargradeByCritfichaavalfkvg8(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg8) {
		this.eqitvargradeByCritfichaavalfkvg8 = eqitvargradeByCritfichaavalfkvg8;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg2() {
		return this.eqitvargradeByCritfichaavalfkvg2;
	}

	public void setEqitvargradeByCritfichaavalfkvg2(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg2) {
		this.eqitvargradeByCritfichaavalfkvg2 = eqitvargradeByCritfichaavalfkvg2;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg1() {
		return this.eqitvargradeByCritfichaavalfkvg1;
	}

	public void setEqitvargradeByCritfichaavalfkvg1(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg1) {
		this.eqitvargradeByCritfichaavalfkvg1 = eqitvargradeByCritfichaavalfkvg1;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg7() {
		return this.eqitvargradeByCritfichaavalfkvg7;
	}

	public void setEqitvargradeByCritfichaavalfkvg7(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg7) {
		this.eqitvargradeByCritfichaavalfkvg7 = eqitvargradeByCritfichaavalfkvg7;
	}

	public Crambienteaval getCrambienteaval() {
		return this.crambienteaval;
	}

	public void setCrambienteaval(Crambienteaval crambienteaval) {
		this.crambienteaval = crambienteaval;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg5() {
		return this.eqitvargradeByCritfichaavalfkvg5;
	}

	public void setEqitvargradeByCritfichaavalfkvg5(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg5) {
		this.eqitvargradeByCritfichaavalfkvg5 = eqitvargradeByCritfichaavalfkvg5;
	}

	public Eqitvargrade getEqitvargradeByCritfichaavalfkvg4() {
		return this.eqitvargradeByCritfichaavalfkvg4;
	}

	public void setEqitvargradeByCritfichaavalfkvg4(
			Eqitvargrade eqitvargradeByCritfichaavalfkvg4) {
		this.eqitvargradeByCritfichaavalfkvg4 = eqitvargradeByCritfichaavalfkvg4;
	}

	public Crfichaaval getCrfichaaval() {
		return this.crfichaaval;
	}

	public void setCrfichaaval(Crfichaaval crfichaaval) {
		this.crfichaaval = crfichaaval;
	}

	public String getDescitfichaaval() {
		return this.descitfichaaval;
	}

	public void setDescitfichaaval(String descitfichaaval) {
		this.descitfichaaval = descitfichaaval;
	}

	public BigDecimal getAltitfichaaval() {
		return this.altitfichaaval;
	}

	public void setAltitfichaaval(BigDecimal altitfichaaval) {
		this.altitfichaaval = altitfichaaval;
	}

	public BigDecimal getCompitfichaaval() {
		return this.compitfichaaval;
	}

	public void setCompitfichaaval(BigDecimal compitfichaaval) {
		this.compitfichaaval = compitfichaaval;
	}

	public BigDecimal getTiritfichaaval() {
		return this.tiritfichaaval;
	}

	public void setTiritfichaaval(BigDecimal tiritfichaaval) {
		this.tiritfichaaval = tiritfichaaval;
	}

	public BigDecimal getM2itfichaaval() {
		return this.m2itfichaaval;
	}

	public void setM2itfichaaval(BigDecimal m2itfichaaval) {
		this.m2itfichaaval = m2itfichaaval;
	}

	public BigDecimal getVlrunititfichaaval() {
		return this.vlrunititfichaaval;
	}

	public void setVlrunititfichaaval(BigDecimal vlrunititfichaaval) {
		this.vlrunititfichaaval = vlrunititfichaaval;
	}

	public BigDecimal getVlrtotitfichaaval() {
		return this.vlrtotitfichaaval;
	}

	public void setVlrtotitfichaaval(BigDecimal vlrtotitfichaaval) {
		this.vlrtotitfichaaval = vlrtotitfichaaval;
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

	public Set getCrfichaorcs() {
		return this.crfichaorcs;
	}

	public void setCrfichaorcs(Set crfichaorcs) {
		this.crfichaorcs = crfichaorcs;
	}

}

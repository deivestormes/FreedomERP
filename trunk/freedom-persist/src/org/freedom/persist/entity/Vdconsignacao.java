package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdconsignacao generated by hbm2java
 */
public class Vdconsignacao implements java.io.Serializable {

	private VdconsignacaoId id;
	private Fnsublanca fnsublancaByVdconsigfkfnsublancadev;
	private Vdvendedor vdvendedor;
	private Fnsublanca fnsublancaByVdconsigfkfnsublanca;
	private int docconsig;
	private Date dtconsig;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdvendaconsigs = new HashSet(0);
	private Set vdremconsigs = new HashSet(0);

	public Vdconsignacao() {
	}

	public Vdconsignacao(VdconsignacaoId id, Vdvendedor vdvendedor,
			int docconsig, Date dtconsig, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdvendedor = vdvendedor;
		this.docconsig = docconsig;
		this.dtconsig = dtconsig;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdconsignacao(VdconsignacaoId id,
			Fnsublanca fnsublancaByVdconsigfkfnsublancadev,
			Vdvendedor vdvendedor, Fnsublanca fnsublancaByVdconsigfkfnsublanca,
			int docconsig, Date dtconsig, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdvendaconsigs, Set vdremconsigs) {
		this.id = id;
		this.fnsublancaByVdconsigfkfnsublancadev = fnsublancaByVdconsigfkfnsublancadev;
		this.vdvendedor = vdvendedor;
		this.fnsublancaByVdconsigfkfnsublanca = fnsublancaByVdconsigfkfnsublanca;
		this.docconsig = docconsig;
		this.dtconsig = dtconsig;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdvendaconsigs = vdvendaconsigs;
		this.vdremconsigs = vdremconsigs;
	}

	public VdconsignacaoId getId() {
		return this.id;
	}

	public void setId(VdconsignacaoId id) {
		this.id = id;
	}

	public Fnsublanca getFnsublancaByVdconsigfkfnsublancadev() {
		return this.fnsublancaByVdconsigfkfnsublancadev;
	}

	public void setFnsublancaByVdconsigfkfnsublancadev(
			Fnsublanca fnsublancaByVdconsigfkfnsublancadev) {
		this.fnsublancaByVdconsigfkfnsublancadev = fnsublancaByVdconsigfkfnsublancadev;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Fnsublanca getFnsublancaByVdconsigfkfnsublanca() {
		return this.fnsublancaByVdconsigfkfnsublanca;
	}

	public void setFnsublancaByVdconsigfkfnsublanca(
			Fnsublanca fnsublancaByVdconsigfkfnsublanca) {
		this.fnsublancaByVdconsigfkfnsublanca = fnsublancaByVdconsigfkfnsublanca;
	}

	public int getDocconsig() {
		return this.docconsig;
	}

	public void setDocconsig(int docconsig) {
		this.docconsig = docconsig;
	}

	public Date getDtconsig() {
		return this.dtconsig;
	}

	public void setDtconsig(Date dtconsig) {
		this.dtconsig = dtconsig;
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

	public Set getVdvendaconsigs() {
		return this.vdvendaconsigs;
	}

	public void setVdvendaconsigs(Set vdvendaconsigs) {
		this.vdvendaconsigs = vdvendaconsigs;
	}

	public Set getVdremconsigs() {
		return this.vdremconsigs;
	}

	public void setVdremconsigs(Set vdremconsigs) {
		this.vdremconsigs = vdremconsigs;
	}

}

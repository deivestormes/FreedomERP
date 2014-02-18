package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vditcontratofor generated by hbm2java
 */
public class Vditcontratofor implements java.io.Serializable {

	private VditcontratoforId id;
	private Cpforneced cpforneced;
	private Vditcontrato vditcontrato;
	private int codempfr;
	private BigDecimal vlrapagfor;
	private Date dtprevinifor;
	private Date dtprevfinfor;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditcontratofor() {
	}

	public Vditcontratofor(VditcontratoforId id, Cpforneced cpforneced,
			Vditcontrato vditcontrato, int codempfr, BigDecimal vlrapagfor,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.vditcontrato = vditcontrato;
		this.codempfr = codempfr;
		this.vlrapagfor = vlrapagfor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Vditcontratofor(VditcontratoforId id, Cpforneced cpforneced,
			Vditcontrato vditcontrato, int codempfr, BigDecimal vlrapagfor,
			Date dtprevinifor, Date dtprevfinfor, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.vditcontrato = vditcontrato;
		this.codempfr = codempfr;
		this.vlrapagfor = vlrapagfor;
		this.dtprevinifor = dtprevinifor;
		this.dtprevfinfor = dtprevfinfor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VditcontratoforId getId() {
		return this.id;
	}

	public void setId(VditcontratoforId id) {
		this.id = id;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	public int getCodempfr() {
		return this.codempfr;
	}

	public void setCodempfr(int codempfr) {
		this.codempfr = codempfr;
	}

	public BigDecimal getVlrapagfor() {
		return this.vlrapagfor;
	}

	public void setVlrapagfor(BigDecimal vlrapagfor) {
		this.vlrapagfor = vlrapagfor;
	}

	public Date getDtprevinifor() {
		return this.dtprevinifor;
	}

	public void setDtprevinifor(Date dtprevinifor) {
		this.dtprevinifor = dtprevinifor;
	}

	public Date getDtprevfinfor() {
		return this.dtprevfinfor;
	}

	public void setDtprevfinfor(Date dtprevfinfor) {
		this.dtprevfinfor = dtprevfinfor;
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

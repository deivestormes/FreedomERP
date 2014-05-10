package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Pefalta generated by hbm2java
 */
public class Pefalta implements java.io.Serializable {

	private PefaltaId id;
	private Rhempregado rhempregado;
	private char periodofalta;
	private char tipofalta;
	private Date hiniintfalta;
	private Date hfinintfalta;
	private Date hfinfalta;
	private String justiffalta;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Pefalta() {
	}

	public Pefalta(PefaltaId id, Rhempregado rhempregado, char periodofalta,
			char tipofalta, Date hiniintfalta, Date hfinintfalta,
			Date hfinfalta, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.rhempregado = rhempregado;
		this.periodofalta = periodofalta;
		this.tipofalta = tipofalta;
		this.hiniintfalta = hiniintfalta;
		this.hfinintfalta = hfinintfalta;
		this.hfinfalta = hfinfalta;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Pefalta(PefaltaId id, Rhempregado rhempregado, char periodofalta,
			char tipofalta, Date hiniintfalta, Date hfinintfalta,
			Date hfinfalta, String justiffalta, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.rhempregado = rhempregado;
		this.periodofalta = periodofalta;
		this.tipofalta = tipofalta;
		this.hiniintfalta = hiniintfalta;
		this.hfinintfalta = hfinintfalta;
		this.hfinfalta = hfinfalta;
		this.justiffalta = justiffalta;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PefaltaId getId() {
		return this.id;
	}

	public void setId(PefaltaId id) {
		this.id = id;
	}

	public Rhempregado getRhempregado() {
		return this.rhempregado;
	}

	public void setRhempregado(Rhempregado rhempregado) {
		this.rhempregado = rhempregado;
	}

	public char getPeriodofalta() {
		return this.periodofalta;
	}

	public void setPeriodofalta(char periodofalta) {
		this.periodofalta = periodofalta;
	}

	public char getTipofalta() {
		return this.tipofalta;
	}

	public void setTipofalta(char tipofalta) {
		this.tipofalta = tipofalta;
	}

	public Date getHiniintfalta() {
		return this.hiniintfalta;
	}

	public void setHiniintfalta(Date hiniintfalta) {
		this.hiniintfalta = hiniintfalta;
	}

	public Date getHfinintfalta() {
		return this.hfinintfalta;
	}

	public void setHfinintfalta(Date hfinintfalta) {
		this.hfinintfalta = hfinintfalta;
	}

	public Date getHfinfalta() {
		return this.hfinfalta;
	}

	public void setHfinfalta(Date hfinfalta) {
		this.hfinfalta = hfinfalta;
	}

	public String getJustiffalta() {
		return this.justiffalta;
	}

	public void setJustiffalta(String justiffalta) {
		this.justiffalta = justiffalta;
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

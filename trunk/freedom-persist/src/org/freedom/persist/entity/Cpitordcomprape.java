package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cpitordcomprape generated by hbm2java
 */
public class Cpitordcomprape implements java.io.Serializable {

	private CpitordcomprapeId id;
	private Cpitordcompra cpitordcompra;
	private Date dtitpe;
	private BigDecimal qtditpe;
	private BigDecimal qtditentpe;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpitordcomprape() {
	}

	public Cpitordcomprape(CpitordcomprapeId id, Cpitordcompra cpitordcompra,
			Date dtitpe, BigDecimal qtditpe, BigDecimal qtditentpe, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.cpitordcompra = cpitordcompra;
		this.dtitpe = dtitpe;
		this.qtditpe = qtditpe;
		this.qtditentpe = qtditentpe;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpitordcomprape(CpitordcomprapeId id, Cpitordcompra cpitordcompra,
			Date dtitpe, BigDecimal qtditpe, BigDecimal qtditentpe, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpitordcompra = cpitordcompra;
		this.dtitpe = dtitpe;
		this.qtditpe = qtditpe;
		this.qtditentpe = qtditentpe;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CpitordcomprapeId getId() {
		return this.id;
	}

	public void setId(CpitordcomprapeId id) {
		this.id = id;
	}

	public Cpitordcompra getCpitordcompra() {
		return this.cpitordcompra;
	}

	public void setCpitordcompra(Cpitordcompra cpitordcompra) {
		this.cpitordcompra = cpitordcompra;
	}

	public Date getDtitpe() {
		return this.dtitpe;
	}

	public void setDtitpe(Date dtitpe) {
		this.dtitpe = dtitpe;
	}

	public BigDecimal getQtditpe() {
		return this.qtditpe;
	}

	public void setQtditpe(BigDecimal qtditpe) {
		this.qtditpe = qtditpe;
	}

	public BigDecimal getQtditentpe() {
		return this.qtditentpe;
	}

	public void setQtditentpe(BigDecimal qtditentpe) {
		this.qtditentpe = qtditentpe;
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

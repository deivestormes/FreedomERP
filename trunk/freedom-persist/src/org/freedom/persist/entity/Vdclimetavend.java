package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vdclimetavend generated by hbm2java
 */
public class Vdclimetavend implements java.io.Serializable {

	private VdclimetavendId id;
	private Vdcliente vdcliente;
	private BigDecimal vlrmetavend;
	private String obsmetavend;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdclimetavend() {
	}

	public Vdclimetavend(VdclimetavendId id, Vdcliente vdcliente,
			BigDecimal vlrmetavend, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.vlrmetavend = vlrmetavend;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdclimetavend(VdclimetavendId id, Vdcliente vdcliente,
			BigDecimal vlrmetavend, String obsmetavend, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.vlrmetavend = vlrmetavend;
		this.obsmetavend = obsmetavend;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdclimetavendId getId() {
		return this.id;
	}

	public void setId(VdclimetavendId id) {
		this.id = id;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public BigDecimal getVlrmetavend() {
		return this.vlrmetavend;
	}

	public void setVlrmetavend(BigDecimal vlrmetavend) {
		this.vlrmetavend = vlrmetavend;
	}

	public String getObsmetavend() {
		return this.obsmetavend;
	}

	public void setObsmetavend(String obsmetavend) {
		this.obsmetavend = obsmetavend;
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

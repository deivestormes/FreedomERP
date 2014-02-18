package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Pvcaixaimp generated by hbm2java
 */
public class Pvcaixaimp implements java.io.Serializable {

	private PvcaixaimpId id;
	private Pvcaixa pvcaixa;
	private Sgimpressora sgimpressora;
	private Character imppad;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Pvcaixaimp() {
	}

	public Pvcaixaimp(PvcaixaimpId id, Pvcaixa pvcaixa,
			Sgimpressora sgimpressora, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.sgimpressora = sgimpressora;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pvcaixaimp(PvcaixaimpId id, Pvcaixa pvcaixa,
			Sgimpressora sgimpressora, Character imppad, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.sgimpressora = sgimpressora;
		this.imppad = imppad;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PvcaixaimpId getId() {
		return this.id;
	}

	public void setId(PvcaixaimpId id) {
		this.id = id;
	}

	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	public Sgimpressora getSgimpressora() {
		return this.sgimpressora;
	}

	public void setSgimpressora(Sgimpressora sgimpressora) {
		this.sgimpressora = sgimpressora;
	}

	public Character getImppad() {
		return this.imppad;
	}

	public void setImppad(Character imppad) {
		this.imppad = imppad;
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

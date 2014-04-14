package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Pvsequencia generated by hbm2java
 */
public class Pvsequencia implements java.io.Serializable {

	private PvsequenciaId id;
	private Pvcaixa pvcaixa;
	private int seqcaixa;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Pvsequencia() {
	}

	public Pvsequencia(Pvcaixa pvcaixa, int seqcaixa, Date dtins, Date hins,
			String idusuins) {
		this.pvcaixa = pvcaixa;
		this.seqcaixa = seqcaixa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pvsequencia(Pvcaixa pvcaixa, int seqcaixa, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.pvcaixa = pvcaixa;
		this.seqcaixa = seqcaixa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PvsequenciaId getId() {
		return this.id;
	}

	public void setId(PvsequenciaId id) {
		this.id = id;
	}

	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	public int getSeqcaixa() {
		return this.seqcaixa;
	}

	public void setSeqcaixa(int seqcaixa) {
		this.seqcaixa = seqcaixa;
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

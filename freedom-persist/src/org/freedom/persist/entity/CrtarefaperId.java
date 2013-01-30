package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrtarefaperId generated by hbm2java
 */
@Embeddable
public class CrtarefaperId implements java.io.Serializable {

	private int codtarefa;
	private short mestper;
	private short anotper;
	private short codfilial;
	private int codemp;

	public CrtarefaperId() {
	}

	public CrtarefaperId(int codtarefa, short mestper, short anotper,
			short codfilial, int codemp) {
		this.codtarefa = codtarefa;
		this.mestper = mestper;
		this.anotper = anotper;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTAREFA", nullable = false)
	public int getCodtarefa() {
		return this.codtarefa;
	}

	public void setCodtarefa(int codtarefa) {
		this.codtarefa = codtarefa;
	}

	@Column(name = "MESTPER", nullable = false)
	public short getMestper() {
		return this.mestper;
	}

	public void setMestper(short mestper) {
		this.mestper = mestper;
	}

	@Column(name = "ANOTPER", nullable = false)
	public short getAnotper() {
		return this.anotper;
	}

	public void setAnotper(short anotper) {
		this.anotper = anotper;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrtarefaperId))
			return false;
		CrtarefaperId castOther = (CrtarefaperId) other;

		return (this.getCodtarefa() == castOther.getCodtarefa())
				&& (this.getMestper() == castOther.getMestper())
				&& (this.getAnotper() == castOther.getAnotper())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtarefa();
		result = 37 * result + this.getMestper();
		result = 37 * result + this.getAnotper();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

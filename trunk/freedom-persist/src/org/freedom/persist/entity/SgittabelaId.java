package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgittabelaId generated by hbm2java
 */
@Embeddable
public class SgittabelaId implements java.io.Serializable {

	private int codittb;
	private short codtb;
	private short codfilial;
	private int codemp;

	public SgittabelaId() {
	}

	public SgittabelaId(int codittb, short codtb, short codfilial, int codemp) {
		this.codittb = codittb;
		this.codtb = codtb;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODITTB", nullable = false)
	public int getCodittb() {
		return this.codittb;
	}

	public void setCodittb(int codittb) {
		this.codittb = codittb;
	}

	@Column(name = "CODTB", nullable = false)
	public short getCodtb() {
		return this.codtb;
	}

	public void setCodtb(short codtb) {
		this.codtb = codtb;
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
		if (!(other instanceof SgittabelaId))
			return false;
		SgittabelaId castOther = (SgittabelaId) other;

		return (this.getCodittb() == castOther.getCodittb())
				&& (this.getCodtb() == castOther.getCodtb())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodittb();
		result = 37 * result + this.getCodtb();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

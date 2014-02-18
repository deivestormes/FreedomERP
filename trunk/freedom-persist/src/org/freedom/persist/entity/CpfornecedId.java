package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * CpfornecedId generated by hbm2java
 */
public class CpfornecedId implements java.io.Serializable {

	private int codfor;
	private short codfilial;
	private int codemp;

	public CpfornecedId() {
	}

	public CpfornecedId(int codfor, short codfilial, int codemp) {
		this.codfor = codfor;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodfor() {
		return this.codfor;
	}

	public void setCodfor(int codfor) {
		this.codfor = codfor;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

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
		if (!(other instanceof CpfornecedId))
			return false;
		CpfornecedId castOther = (CpfornecedId) other;

		return (this.getCodfor() == castOther.getCodfor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

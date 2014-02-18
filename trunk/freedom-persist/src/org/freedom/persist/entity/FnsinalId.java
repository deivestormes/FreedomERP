package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FnsinalId generated by hbm2java
 */
public class FnsinalId implements java.io.Serializable {

	private short codsinal;
	private int codemp;
	private short codfilial;

	public FnsinalId() {
	}

	public FnsinalId(short codsinal, int codemp, short codfilial) {
		this.codsinal = codsinal;
		this.codemp = codemp;
		this.codfilial = codfilial;
	}

	public short getCodsinal() {
		return this.codsinal;
	}

	public void setCodsinal(short codsinal) {
		this.codsinal = codsinal;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FnsinalId))
			return false;
		FnsinalId castOther = (FnsinalId) other;

		return (this.getCodsinal() == castOther.getCodsinal())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodsinal();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		return result;
	}

}

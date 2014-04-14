package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * LftipofisccliId generated by hbm2java
 */
public class LftipofisccliId implements java.io.Serializable {

	private int codfisccli;
	private int codfilial;
	private int codemp;

	public LftipofisccliId() {
	}

	public LftipofisccliId(int codfisccli, int codfilial, int codemp) {
		this.codfisccli = codfisccli;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodfisccli() {
		return this.codfisccli;
	}

	public void setCodfisccli(int codfisccli) {
		this.codfisccli = codfisccli;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof LftipofisccliId))
			return false;
		LftipofisccliId castOther = (LftipofisccliId) other;

		return (this.getCodfisccli() == castOther.getCodfisccli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfisccli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

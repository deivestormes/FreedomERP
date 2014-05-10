package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * EqmovexpId generated by hbm2java
 */
public class EqmovexpId implements java.io.Serializable {

	private int codmovexp;
	private short codfilial;
	private int codemp;

	public EqmovexpId() {
	}

	public EqmovexpId(int codmovexp, short codfilial, int codemp) {
		this.codmovexp = codmovexp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodmovexp() {
		return this.codmovexp;
	}

	public void setCodmovexp(int codmovexp) {
		this.codmovexp = codmovexp;
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
		if (!(other instanceof EqmovexpId))
			return false;
		EqmovexpId castOther = (EqmovexpId) other;

		return (this.getCodmovexp() == castOther.getCodmovexp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmovexp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

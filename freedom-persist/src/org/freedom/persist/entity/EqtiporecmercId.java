package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * EqtiporecmercId generated by hbm2java
 */
public class EqtiporecmercId implements java.io.Serializable {

	private int codtiporecmerc;
	private short codfilial;
	private int codemp;

	public EqtiporecmercId() {
	}

	public EqtiporecmercId(int codtiporecmerc, short codfilial, int codemp) {
		this.codtiporecmerc = codtiporecmerc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtiporecmerc() {
		return this.codtiporecmerc;
	}

	public void setCodtiporecmerc(int codtiporecmerc) {
		this.codtiporecmerc = codtiporecmerc;
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
		if (!(other instanceof EqtiporecmercId))
			return false;
		EqtiporecmercId castOther = (EqtiporecmercId) other;

		return (this.getCodtiporecmerc() == castOther.getCodtiporecmerc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtiporecmerc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

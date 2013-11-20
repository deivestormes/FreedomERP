package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * EqtipoexpId generated by hbm2java
 */
public class EqtipoexpId implements java.io.Serializable {

	private int codtipoexp;
	private short codfilial;
	private int codemp;

	public EqtipoexpId() {
	}

	public EqtipoexpId(int codtipoexp, short codfilial, int codemp) {
		this.codtipoexp = codtipoexp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtipoexp() {
		return this.codtipoexp;
	}

	public void setCodtipoexp(int codtipoexp) {
		this.codtipoexp = codtipoexp;
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
		if (!(other instanceof EqtipoexpId))
			return false;
		EqtipoexpId castOther = (EqtipoexpId) other;

		return (this.getCodtipoexp() == castOther.getCodtipoexp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipoexp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

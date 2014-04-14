package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SglogId generated by hbm2java
 */
public class SglogId implements java.io.Serializable {

	private int codlog;
	private short codfilial;
	private int codemp;

	public SglogId() {
	}

	public SglogId(int codlog, short codfilial, int codemp) {
		this.codlog = codlog;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodlog() {
		return this.codlog;
	}

	public void setCodlog(int codlog) {
		this.codlog = codlog;
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
		if (!(other instanceof SglogId))
			return false;
		SglogId castOther = (SglogId) other;

		return (this.getCodlog() == castOther.getCodlog())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodlog();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

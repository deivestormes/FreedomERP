package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * SgfilialId generated by hbm2java
 */
public class SgfilialId implements java.io.Serializable {

	private short codfilial;
	private int codemp;

	public SgfilialId() {
	}

	public SgfilialId(short codfilial, int codemp) {
		this.codfilial = codfilial;
		this.codemp = codemp;
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
		if (!(other instanceof SgfilialId))
			return false;
		SgfilialId castOther = (SgfilialId) other;

		return (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

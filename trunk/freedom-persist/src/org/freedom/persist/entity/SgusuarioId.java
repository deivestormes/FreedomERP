package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * SgusuarioId generated by hbm2java
 */
public class SgusuarioId implements java.io.Serializable {

	private String idusu;
	private short codfilial;
	private int codemp;

	public SgusuarioId() {
	}

	public SgusuarioId(String idusu, short codfilial, int codemp) {
		this.idusu = idusu;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getIdusu() {
		return this.idusu;
	}

	public void setIdusu(String idusu) {
		this.idusu = idusu;
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
		if (!(other instanceof SgusuarioId))
			return false;
		SgusuarioId castOther = (SgusuarioId) other;

		return ((this.getIdusu() == castOther.getIdusu()) || (this.getIdusu() != null
				&& castOther.getIdusu() != null && this.getIdusu().equals(
				castOther.getIdusu())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdusu() == null ? 0 : this.getIdusu().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

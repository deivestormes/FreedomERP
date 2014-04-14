package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * CpimportacaoId generated by hbm2java
 */
public class CpimportacaoId implements java.io.Serializable {

	private int codimp;
	private short codfilial;
	private int codemp;

	public CpimportacaoId() {
	}

	public CpimportacaoId(int codimp, short codfilial, int codemp) {
		this.codimp = codimp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodimp() {
		return this.codimp;
	}

	public void setCodimp(int codimp) {
		this.codimp = codimp;
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
		if (!(other instanceof CpimportacaoId))
			return false;
		CpimportacaoId castOther = (CpimportacaoId) other;

		return (this.getCodimp() == castOther.getCodimp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodimp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

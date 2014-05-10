package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * CpitimportacaoId generated by hbm2java
 */
public class CpitimportacaoId implements java.io.Serializable {

	private int codimp;
	private short coditimp;
	private short codfilial;
	private int codemp;

	public CpitimportacaoId() {
	}

	public CpitimportacaoId(int codimp, short coditimp, short codfilial,
			int codemp) {
		this.codimp = codimp;
		this.coditimp = coditimp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodimp() {
		return this.codimp;
	}

	public void setCodimp(int codimp) {
		this.codimp = codimp;
	}

	public short getCoditimp() {
		return this.coditimp;
	}

	public void setCoditimp(short coditimp) {
		this.coditimp = coditimp;
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
		if (!(other instanceof CpitimportacaoId))
			return false;
		CpitimportacaoId castOther = (CpitimportacaoId) other;

		return (this.getCodimp() == castOther.getCodimp())
				&& (this.getCoditimp() == castOther.getCoditimp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodimp();
		result = 37 * result + this.getCoditimp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * CrtipochamadoId generated by hbm2java
 */
public class CrtipochamadoId implements java.io.Serializable {

	private int codtpchamado;
	private short codfilial;
	private int codemp;

	public CrtipochamadoId() {
	}

	public CrtipochamadoId(int codtpchamado, short codfilial, int codemp) {
		this.codtpchamado = codtpchamado;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtpchamado() {
		return this.codtpchamado;
	}

	public void setCodtpchamado(int codtpchamado) {
		this.codtpchamado = codtpchamado;
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
		if (!(other instanceof CrtipochamadoId))
			return false;
		CrtipochamadoId castOther = (CrtipochamadoId) other;

		return (this.getCodtpchamado() == castOther.getCodtpchamado())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtpchamado();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

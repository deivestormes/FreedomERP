package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * AtconveniadoId generated by hbm2java
 */
public class AtconveniadoId implements java.io.Serializable {

	private int codconv;
	private short codfilial;
	private int codemp;

	public AtconveniadoId() {
	}

	public AtconveniadoId(int codconv, short codfilial, int codemp) {
		this.codconv = codconv;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodconv() {
		return this.codconv;
	}

	public void setCodconv(int codconv) {
		this.codconv = codconv;
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
		if (!(other instanceof AtconveniadoId))
			return false;
		AtconveniadoId castOther = (AtconveniadoId) other;

		return (this.getCodconv() == castOther.getCodconv())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodconv();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

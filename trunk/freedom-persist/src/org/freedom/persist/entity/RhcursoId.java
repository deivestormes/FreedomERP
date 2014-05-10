package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * RhcursoId generated by hbm2java
 */
public class RhcursoId implements java.io.Serializable {

	private int codcurso;
	private short codfilial;
	private int codemp;

	public RhcursoId() {
	}

	public RhcursoId(int codcurso, short codfilial, int codemp) {
		this.codcurso = codcurso;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcurso() {
		return this.codcurso;
	}

	public void setCodcurso(int codcurso) {
		this.codcurso = codcurso;
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
		if (!(other instanceof RhcursoId))
			return false;
		RhcursoId castOther = (RhcursoId) other;

		return (this.getCodcurso() == castOther.getCodcurso())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcurso();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

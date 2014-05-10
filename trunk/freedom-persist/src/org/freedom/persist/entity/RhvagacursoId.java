package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * RhvagacursoId generated by hbm2java
 */
public class RhvagacursoId implements java.io.Serializable {

	private int codvaga;
	private short codfilial;
	private int codemp;
	private int codcurso;
	private short codfilialcs;
	private int codempcs;

	public RhvagacursoId() {
	}

	public RhvagacursoId(int codvaga, short codfilial, int codemp,
			int codcurso, short codfilialcs, int codempcs) {
		this.codvaga = codvaga;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codcurso = codcurso;
		this.codfilialcs = codfilialcs;
		this.codempcs = codempcs;
	}

	public int getCodvaga() {
		return this.codvaga;
	}

	public void setCodvaga(int codvaga) {
		this.codvaga = codvaga;
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

	public int getCodcurso() {
		return this.codcurso;
	}

	public void setCodcurso(int codcurso) {
		this.codcurso = codcurso;
	}

	public short getCodfilialcs() {
		return this.codfilialcs;
	}

	public void setCodfilialcs(short codfilialcs) {
		this.codfilialcs = codfilialcs;
	}

	public int getCodempcs() {
		return this.codempcs;
	}

	public void setCodempcs(int codempcs) {
		this.codempcs = codempcs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RhvagacursoId))
			return false;
		RhvagacursoId castOther = (RhvagacursoId) other;

		return (this.getCodvaga() == castOther.getCodvaga())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodcurso() == castOther.getCodcurso())
				&& (this.getCodfilialcs() == castOther.getCodfilialcs())
				&& (this.getCodempcs() == castOther.getCodempcs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvaga();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodcurso();
		result = 37 * result + this.getCodfilialcs();
		result = 37 * result + this.getCodempcs();
		return result;
	}

}

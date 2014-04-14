package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * RhcandidatocursoId generated by hbm2java
 */
public class RhcandidatocursoId implements java.io.Serializable {

	private int codcand;
	private short codfilial;
	private int codemp;
	private int codcurso;
	private short codfilialcs;
	private int codempcs;

	public RhcandidatocursoId() {
	}

	public RhcandidatocursoId(int codcand, short codfilial, int codemp,
			int codcurso, short codfilialcs, int codempcs) {
		this.codcand = codcand;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codcurso = codcurso;
		this.codfilialcs = codfilialcs;
		this.codempcs = codempcs;
	}

	public int getCodcand() {
		return this.codcand;
	}

	public void setCodcand(int codcand) {
		this.codcand = codcand;
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
		if (!(other instanceof RhcandidatocursoId))
			return false;
		RhcandidatocursoId castOther = (RhcandidatocursoId) other;

		return (this.getCodcand() == castOther.getCodcand())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodcurso() == castOther.getCodcurso())
				&& (this.getCodfilialcs() == castOther.getCodfilialcs())
				&& (this.getCodempcs() == castOther.getCodempcs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcand();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodcurso();
		result = 37 * result + this.getCodfilialcs();
		result = 37 * result + this.getCodempcs();
		return result;
	}

}

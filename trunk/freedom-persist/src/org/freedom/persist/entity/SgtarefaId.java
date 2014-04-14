package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SgtarefaId generated by hbm2java
 */
public class SgtarefaId implements java.io.Serializable {

	private int codtarefa;
	private short codfilial;
	private int codemp;

	public SgtarefaId() {
	}

	public SgtarefaId(int codtarefa, short codfilial, int codemp) {
		this.codtarefa = codtarefa;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtarefa() {
		return this.codtarefa;
	}

	public void setCodtarefa(int codtarefa) {
		this.codtarefa = codtarefa;
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
		if (!(other instanceof SgtarefaId))
			return false;
		SgtarefaId castOther = (SgtarefaId) other;

		return (this.getCodtarefa() == castOther.getCodtarefa())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtarefa();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

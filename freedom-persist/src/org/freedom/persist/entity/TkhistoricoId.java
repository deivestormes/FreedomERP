package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TkhistoricoId generated by hbm2java
 */
@Embeddable
public class TkhistoricoId implements java.io.Serializable {

	private int codhisttk;
	private short codfilial;
	private int codemp;

	public TkhistoricoId() {
	}

	public TkhistoricoId(int codhisttk, short codfilial, int codemp) {
		this.codhisttk = codhisttk;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODHISTTK", nullable = false)
	public int getCodhisttk() {
		return this.codhisttk;
	}

	public void setCodhisttk(int codhisttk) {
		this.codhisttk = codhisttk;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
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
		if (!(other instanceof TkhistoricoId))
			return false;
		TkhistoricoId castOther = (TkhistoricoId) other;

		return (this.getCodhisttk() == castOther.getCodhisttk())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodhisttk();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

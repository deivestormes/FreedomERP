package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdromaneioId generated by hbm2java
 */
@Embeddable
public class VdromaneioId implements java.io.Serializable {

	private int codroma;
	private short codfilial;
	private int codemp;

	public VdromaneioId() {
	}

	public VdromaneioId(int codroma, short codfilial, int codemp) {
		this.codroma = codroma;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODROMA", nullable = false)
	public int getCodroma() {
		return this.codroma;
	}

	public void setCodroma(int codroma) {
		this.codroma = codroma;
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
		if (!(other instanceof VdromaneioId))
			return false;
		VdromaneioId castOther = (VdromaneioId) other;

		return (this.getCodroma() == castOther.getCodroma())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodroma();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

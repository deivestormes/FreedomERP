package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdveiculoId generated by hbm2java
 */
@Embeddable
public class VdveiculoId implements java.io.Serializable {

	private int codveic;
	private short codfilial;
	private int codemp;

	public VdveiculoId() {
	}

	public VdveiculoId(int codveic, short codfilial, int codemp) {
		this.codveic = codveic;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODVEIC", nullable = false)
	public int getCodveic() {
		return this.codveic;
	}

	public void setCodveic(int codveic) {
		this.codveic = codveic;
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
		if (!(other instanceof VdveiculoId))
			return false;
		VdveiculoId castOther = (VdveiculoId) other;

		return (this.getCodveic() == castOther.getCodveic())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodveic();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TksetorctoId generated by hbm2java
 */
@Embeddable
public class TksetorctoId implements java.io.Serializable {

	private int codsetorcto;
	private short codfilial;
	private int codemp;

	public TksetorctoId() {
	}

	public TksetorctoId(int codsetorcto, short codfilial, int codemp) {
		this.codsetorcto = codsetorcto;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODSETORCTO", nullable = false)
	public int getCodsetorcto() {
		return this.codsetorcto;
	}

	public void setCodsetorcto(int codsetorcto) {
		this.codsetorcto = codsetorcto;
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
		if (!(other instanceof TksetorctoId))
			return false;
		TksetorctoId castOther = (TksetorctoId) other;

		return (this.getCodsetorcto() == castOther.getCodsetorcto())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodsetorcto();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

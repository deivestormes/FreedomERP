package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqalmoxId generated by hbm2java
 */
@Embeddable
public class EqalmoxId implements java.io.Serializable {

	private int codalmox;
	private short codfilial;
	private int codemp;

	public EqalmoxId() {
	}

	public EqalmoxId(int codalmox, short codfilial, int codemp) {
		this.codalmox = codalmox;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODALMOX", nullable = false)
	public int getCodalmox() {
		return this.codalmox;
	}

	public void setCodalmox(int codalmox) {
		this.codalmox = codalmox;
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
		if (!(other instanceof EqalmoxId))
			return false;
		EqalmoxId castOther = (EqalmoxId) other;

		return (this.getCodalmox() == castOther.getCodalmox())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodalmox();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AttipoatendosetorId generated by hbm2java
 */
@Embeddable
public class AttipoatendosetorId implements java.io.Serializable {

	private int codsetat;
	private short codfilialst;
	private int codempst;
	private int codtpatendo;
	private short codfilial;
	private int codemp;

	public AttipoatendosetorId() {
	}

	public AttipoatendosetorId(int codsetat, short codfilialst, int codempst,
			int codtpatendo, short codfilial, int codemp) {
		this.codsetat = codsetat;
		this.codfilialst = codfilialst;
		this.codempst = codempst;
		this.codtpatendo = codtpatendo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODSETAT", nullable = false)
	public int getCodsetat() {
		return this.codsetat;
	}

	public void setCodsetat(int codsetat) {
		this.codsetat = codsetat;
	}

	@Column(name = "CODFILIALST", nullable = false)
	public short getCodfilialst() {
		return this.codfilialst;
	}

	public void setCodfilialst(short codfilialst) {
		this.codfilialst = codfilialst;
	}

	@Column(name = "CODEMPST", nullable = false)
	public int getCodempst() {
		return this.codempst;
	}

	public void setCodempst(int codempst) {
		this.codempst = codempst;
	}

	@Column(name = "CODTPATENDO", nullable = false)
	public int getCodtpatendo() {
		return this.codtpatendo;
	}

	public void setCodtpatendo(int codtpatendo) {
		this.codtpatendo = codtpatendo;
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
		if (!(other instanceof AttipoatendosetorId))
			return false;
		AttipoatendosetorId castOther = (AttipoatendosetorId) other;

		return (this.getCodsetat() == castOther.getCodsetat())
				&& (this.getCodfilialst() == castOther.getCodfilialst())
				&& (this.getCodempst() == castOther.getCodempst())
				&& (this.getCodtpatendo() == castOther.getCodtpatendo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodsetat();
		result = 37 * result + this.getCodfilialst();
		result = 37 * result + this.getCodempst();
		result = 37 * result + this.getCodtpatendo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

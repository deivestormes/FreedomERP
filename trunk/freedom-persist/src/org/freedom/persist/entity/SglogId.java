package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SglogId generated by hbm2java
 */
@Embeddable
public class SglogId implements java.io.Serializable {

	private int codlog;
	private short codfilial;
	private int codemp;

	public SglogId() {
	}

	public SglogId(int codlog, short codfilial, int codemp) {
		this.codlog = codlog;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODLOG", nullable = false)
	public int getCodlog() {
		return this.codlog;
	}

	public void setCodlog(int codlog) {
		this.codlog = codlog;
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
		if (!(other instanceof SglogId))
			return false;
		SglogId castOther = (SglogId) other;

		return (this.getCodlog() == castOther.getCodlog())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodlog();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgproxywebId generated by hbm2java
 */
@Embeddable
public class SgproxywebId implements java.io.Serializable {

	private int codproxy;
	private short codfilial;
	private int codemp;

	public SgproxywebId() {
	}

	public SgproxywebId(int codproxy, short codfilial, int codemp) {
		this.codproxy = codproxy;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPROXY", nullable = false)
	public int getCodproxy() {
		return this.codproxy;
	}

	public void setCodproxy(int codproxy) {
		this.codproxy = codproxy;
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
		if (!(other instanceof SgproxywebId))
			return false;
		SgproxywebId castOther = (SgproxywebId) other;

		return (this.getCodproxy() == castOther.getCodproxy())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodproxy();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

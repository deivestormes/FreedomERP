package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SggrpusuId generated by hbm2java
 */
@Embeddable
public class SggrpusuId implements java.io.Serializable {

	private String idgrpusu;
	private short codfilial;
	private int codemp;

	public SggrpusuId() {
	}

	public SggrpusuId(String idgrpusu, short codfilial, int codemp) {
		this.idgrpusu = idgrpusu;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "IDGRPUSU", nullable = false, length = 8)
	public String getIdgrpusu() {
		return this.idgrpusu;
	}

	public void setIdgrpusu(String idgrpusu) {
		this.idgrpusu = idgrpusu;
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
		if (!(other instanceof SggrpusuId))
			return false;
		SggrpusuId castOther = (SggrpusuId) other;

		return ((this.getIdgrpusu() == castOther.getIdgrpusu()) || (this
				.getIdgrpusu() != null && castOther.getIdgrpusu() != null && this
				.getIdgrpusu().equals(castOther.getIdgrpusu())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdgrpusu() == null ? 0 : this.getIdgrpusu().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

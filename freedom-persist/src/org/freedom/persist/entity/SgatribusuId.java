package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgatribusuId generated by hbm2java
 */
@Embeddable
public class SgatribusuId implements java.io.Serializable {

	private String idusu;
	private short codfilialuu;
	private int codempuu;
	private String idatrib;
	private short codfilial;
	private int codemp;

	public SgatribusuId() {
	}

	public SgatribusuId(String idusu, short codfilialuu, int codempuu,
			String idatrib, short codfilial, int codemp) {
		this.idusu = idusu;
		this.codfilialuu = codfilialuu;
		this.codempuu = codempuu;
		this.idatrib = idatrib;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "IDUSU", nullable = false, length = 8)
	public String getIdusu() {
		return this.idusu;
	}

	public void setIdusu(String idusu) {
		this.idusu = idusu;
	}

	@Column(name = "CODFILIALUU", nullable = false)
	public short getCodfilialuu() {
		return this.codfilialuu;
	}

	public void setCodfilialuu(short codfilialuu) {
		this.codfilialuu = codfilialuu;
	}

	@Column(name = "CODEMPUU", nullable = false)
	public int getCodempuu() {
		return this.codempuu;
	}

	public void setCodempuu(int codempuu) {
		this.codempuu = codempuu;
	}

	@Column(name = "IDATRIB", nullable = false, length = 10)
	public String getIdatrib() {
		return this.idatrib;
	}

	public void setIdatrib(String idatrib) {
		this.idatrib = idatrib;
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
		if (!(other instanceof SgatribusuId))
			return false;
		SgatribusuId castOther = (SgatribusuId) other;

		return ((this.getIdusu() == castOther.getIdusu()) || (this.getIdusu() != null
				&& castOther.getIdusu() != null && this.getIdusu().equals(
				castOther.getIdusu())))
				&& (this.getCodfilialuu() == castOther.getCodfilialuu())
				&& (this.getCodempuu() == castOther.getCodempuu())
				&& ((this.getIdatrib() == castOther.getIdatrib()) || (this
						.getIdatrib() != null && castOther.getIdatrib() != null && this
						.getIdatrib().equals(castOther.getIdatrib())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdusu() == null ? 0 : this.getIdusu().hashCode());
		result = 37 * result + this.getCodfilialuu();
		result = 37 * result + this.getCodempuu();
		result = 37 * result
				+ (getIdatrib() == null ? 0 : this.getIdatrib().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdclisociosId generated by hbm2java
 */
@Embeddable
public class VdclisociosId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;
	private String nomesocio;

	public VdclisociosId() {
	}

	public VdclisociosId(int codcli, short codfilial, int codemp,
			String nomesocio) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.nomesocio = nomesocio;
	}

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
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

	@Column(name = "NOMESOCIO", nullable = false, length = 50)
	public String getNomesocio() {
		return this.nomesocio;
	}

	public void setNomesocio(String nomesocio) {
		this.nomesocio = nomesocio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdclisociosId))
			return false;
		VdclisociosId castOther = (VdclisociosId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& ((this.getNomesocio() == castOther.getNomesocio()) || (this
						.getNomesocio() != null
						&& castOther.getNomesocio() != null && this
						.getNomesocio().equals(castOther.getNomesocio())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result
				+ (getNomesocio() == null ? 0 : this.getNomesocio().hashCode());
		return result;
	}

}

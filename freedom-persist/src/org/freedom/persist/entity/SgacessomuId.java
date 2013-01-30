package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgacessomuId generated by hbm2java
 */
@Embeddable
public class SgacessomuId implements java.io.Serializable {

	private int codmenu;
	private int codmodu;
	private int codsis;
	private String idusu;
	private short codfilial;
	private int codemp;

	public SgacessomuId() {
	}

	public SgacessomuId(int codmenu, int codmodu, int codsis, String idusu,
			short codfilial, int codemp) {
		this.codmenu = codmenu;
		this.codmodu = codmodu;
		this.codsis = codsis;
		this.idusu = idusu;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMENU", nullable = false)
	public int getCodmenu() {
		return this.codmenu;
	}

	public void setCodmenu(int codmenu) {
		this.codmenu = codmenu;
	}

	@Column(name = "CODMODU", nullable = false)
	public int getCodmodu() {
		return this.codmodu;
	}

	public void setCodmodu(int codmodu) {
		this.codmodu = codmodu;
	}

	@Column(name = "CODSIS", nullable = false)
	public int getCodsis() {
		return this.codsis;
	}

	public void setCodsis(int codsis) {
		this.codsis = codsis;
	}

	@Column(name = "IDUSU", nullable = false, length = 8)
	public String getIdusu() {
		return this.idusu;
	}

	public void setIdusu(String idusu) {
		this.idusu = idusu;
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
		if (!(other instanceof SgacessomuId))
			return false;
		SgacessomuId castOther = (SgacessomuId) other;

		return (this.getCodmenu() == castOther.getCodmenu())
				&& (this.getCodmodu() == castOther.getCodmodu())
				&& (this.getCodsis() == castOther.getCodsis())
				&& ((this.getIdusu() == castOther.getIdusu()) || (this
						.getIdusu() != null && castOther.getIdusu() != null && this
						.getIdusu().equals(castOther.getIdusu())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmenu();
		result = 37 * result + this.getCodmodu();
		result = 37 * result + this.getCodsis();
		result = 37 * result
				+ (getIdusu() == null ? 0 : this.getIdusu().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

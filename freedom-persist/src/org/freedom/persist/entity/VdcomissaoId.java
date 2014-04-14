package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * VdcomissaoId generated by hbm2java
 */
public class VdcomissaoId implements java.io.Serializable {

	private int codcomi;
	private short codfilial;
	private int codemp;

	public VdcomissaoId() {
	}

	public VdcomissaoId(int codcomi, short codfilial, int codemp) {
		this.codcomi = codcomi;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcomi() {
		return this.codcomi;
	}

	public void setCodcomi(int codcomi) {
		this.codcomi = codcomi;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

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
		if (!(other instanceof VdcomissaoId))
			return false;
		VdcomissaoId castOther = (VdcomissaoId) other;

		return (this.getCodcomi() == castOther.getCodcomi())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcomi();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

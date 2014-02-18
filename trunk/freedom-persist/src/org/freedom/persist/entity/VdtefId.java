package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * VdtefId generated by hbm2java
 */
public class VdtefId implements java.io.Serializable {

	private int codvenda;
	private String nsutef;
	private char tipovenda;
	private int codfilial;
	private int codemp;

	public VdtefId() {
	}

	public VdtefId(int codvenda, String nsutef, char tipovenda, int codfilial,
			int codemp) {
		this.codvenda = codvenda;
		this.nsutef = nsutef;
		this.tipovenda = tipovenda;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodvenda() {
		return this.codvenda;
	}

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	public String getNsutef() {
		return this.nsutef;
	}

	public void setNsutef(String nsutef) {
		this.nsutef = nsutef;
	}

	public char getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(char tipovenda) {
		this.tipovenda = tipovenda;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof VdtefId))
			return false;
		VdtefId castOther = (VdtefId) other;

		return (this.getCodvenda() == castOther.getCodvenda())
				&& ((this.getNsutef() == castOther.getNsutef()) || (this
						.getNsutef() != null && castOther.getNsutef() != null && this
						.getNsutef().equals(castOther.getNsutef())))
				&& (this.getTipovenda() == castOther.getTipovenda())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvenda();
		result = 37 * result
				+ (getNsutef() == null ? 0 : this.getNsutef().hashCode());
		result = 37 * result + this.getTipovenda();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

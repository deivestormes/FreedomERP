package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * TkorigcontId generated by hbm2java
 */
public class TkorigcontId implements java.io.Serializable {

	private int codorigcont;
	private short codfilial;
	private int codemp;

	public TkorigcontId() {
	}

	public TkorigcontId(int codorigcont, short codfilial, int codemp) {
		this.codorigcont = codorigcont;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodorigcont() {
		return this.codorigcont;
	}

	public void setCodorigcont(int codorigcont) {
		this.codorigcont = codorigcont;
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
		if (!(other instanceof TkorigcontId))
			return false;
		TkorigcontId castOther = (TkorigcontId) other;

		return (this.getCodorigcont() == castOther.getCodorigcont())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodorigcont();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

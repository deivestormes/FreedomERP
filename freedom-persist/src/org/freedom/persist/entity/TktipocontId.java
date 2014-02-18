package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * TktipocontId generated by hbm2java
 */
public class TktipocontId implements java.io.Serializable {

	private int codtipocont;
	private short codfilial;
	private int codemp;

	public TktipocontId() {
	}

	public TktipocontId(int codtipocont, short codfilial, int codemp) {
		this.codtipocont = codtipocont;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtipocont() {
		return this.codtipocont;
	}

	public void setCodtipocont(int codtipocont) {
		this.codtipocont = codtipocont;
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
		if (!(other instanceof TktipocontId))
			return false;
		TktipocontId castOther = (TktipocontId) other;

		return (this.getCodtipocont() == castOther.getCodtipocont())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipocont();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

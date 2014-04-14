package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * CpitcompraId generated by hbm2java
 */
public class CpitcompraId implements java.io.Serializable {

	private int codcompra;
	private int coditcompra;
	private short codfilial;
	private int codemp;

	public CpitcompraId() {
	}

	public CpitcompraId(int codcompra, int coditcompra, short codfilial,
			int codemp) {
		this.codcompra = codcompra;
		this.coditcompra = coditcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
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
		if (!(other instanceof CpitcompraId))
			return false;
		CpitcompraId castOther = (CpitcompraId) other;

		return (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

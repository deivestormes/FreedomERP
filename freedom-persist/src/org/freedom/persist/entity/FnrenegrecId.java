package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FnrenegrecId generated by hbm2java
 */
public class FnrenegrecId implements java.io.Serializable {

	private int codrenegrec;
	private short codfilial;
	private int codemp;

	public FnrenegrecId() {
	}

	public FnrenegrecId(int codrenegrec, short codfilial, int codemp) {
		this.codrenegrec = codrenegrec;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodrenegrec() {
		return this.codrenegrec;
	}

	public void setCodrenegrec(int codrenegrec) {
		this.codrenegrec = codrenegrec;
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
		if (!(other instanceof FnrenegrecId))
			return false;
		FnrenegrecId castOther = (FnrenegrecId) other;

		return (this.getCodrenegrec() == castOther.getCodrenegrec())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodrenegrec();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

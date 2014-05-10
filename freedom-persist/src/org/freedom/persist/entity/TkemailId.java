package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * TkemailId generated by hbm2java
 */
public class TkemailId implements java.io.Serializable {

	private int codemail;
	private short codfilial;
	private int codemp;

	public TkemailId() {
	}

	public TkemailId(int codemail, short codfilial, int codemp) {
		this.codemail = codemail;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodemail() {
		return this.codemail;
	}

	public void setCodemail(int codemail) {
		this.codemail = codemail;
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
		if (!(other instanceof TkemailId))
			return false;
		TkemailId castOther = (TkemailId) other;

		return (this.getCodemail() == castOther.getCodemail())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemail();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

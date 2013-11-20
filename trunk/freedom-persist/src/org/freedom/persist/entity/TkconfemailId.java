package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * TkconfemailId generated by hbm2java
 */
public class TkconfemailId implements java.io.Serializable {

	private int codconfemail;
	private short codfilial;
	private int codemp;

	public TkconfemailId() {
	}

	public TkconfemailId(int codconfemail, short codfilial, int codemp) {
		this.codconfemail = codconfemail;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodconfemail() {
		return this.codconfemail;
	}

	public void setCodconfemail(int codconfemail) {
		this.codconfemail = codconfemail;
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
		if (!(other instanceof TkconfemailId))
			return false;
		TkconfemailId castOther = (TkconfemailId) other;

		return (this.getCodconfemail() == castOther.getCodconfemail())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodconfemail();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

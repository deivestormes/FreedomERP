package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnitrenegrecId generated by hbm2java
 */
@Embeddable
public class FnitrenegrecId implements java.io.Serializable {

	private short coditrenegrec;
	private int codrenegrec;
	private short codfilial;
	private int codemp;

	public FnitrenegrecId() {
	}

	public FnitrenegrecId(short coditrenegrec, int codrenegrec,
			short codfilial, int codemp) {
		this.coditrenegrec = coditrenegrec;
		this.codrenegrec = codrenegrec;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODITRENEGREC", nullable = false)
	public short getCoditrenegrec() {
		return this.coditrenegrec;
	}

	public void setCoditrenegrec(short coditrenegrec) {
		this.coditrenegrec = coditrenegrec;
	}

	@Column(name = "CODRENEGREC", nullable = false)
	public int getCodrenegrec() {
		return this.codrenegrec;
	}

	public void setCodrenegrec(int codrenegrec) {
		this.codrenegrec = codrenegrec;
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
		if (!(other instanceof FnitrenegrecId))
			return false;
		FnitrenegrecId castOther = (FnitrenegrecId) other;

		return (this.getCoditrenegrec() == castOther.getCoditrenegrec())
				&& (this.getCodrenegrec() == castOther.getCodrenegrec())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditrenegrec();
		result = 37 * result + this.getCodrenegrec();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
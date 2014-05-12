package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqsaldoprodId generated by hbm2java
 */
@Embeddable
public class EqsaldoprodId implements java.io.Serializable {

	private int codprod;
	private short codfilial;
	private int codemp;
	private int codalmox;
	private short codfilialax;
	private int codempax;

	public EqsaldoprodId() {
	}

	public EqsaldoprodId(int codprod, short codfilial, int codemp,
			int codalmox, short codfilialax, int codempax) {
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codalmox = codalmox;
		this.codfilialax = codfilialax;
		this.codempax = codempax;
	}

	@Column(name = "CODPROD", nullable = false)
	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
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

	@Column(name = "CODALMOX", nullable = false)
	public int getCodalmox() {
		return this.codalmox;
	}

	public void setCodalmox(int codalmox) {
		this.codalmox = codalmox;
	}

	@Column(name = "CODFILIALAX", nullable = false)
	public short getCodfilialax() {
		return this.codfilialax;
	}

	public void setCodfilialax(short codfilialax) {
		this.codfilialax = codfilialax;
	}

	@Column(name = "CODEMPAX", nullable = false)
	public int getCodempax() {
		return this.codempax;
	}

	public void setCodempax(int codempax) {
		this.codempax = codempax;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqsaldoprodId))
			return false;
		EqsaldoprodId castOther = (EqsaldoprodId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodalmox() == castOther.getCodalmox())
				&& (this.getCodfilialax() == castOther.getCodfilialax())
				&& (this.getCodempax() == castOther.getCodempax());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodalmox();
		result = 37 * result + this.getCodfilialax();
		result = 37 * result + this.getCodempax();
		return result;
	}

}

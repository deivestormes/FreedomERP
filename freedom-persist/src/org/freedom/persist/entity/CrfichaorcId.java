package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrfichaorcId generated by hbm2java
 */
@Embeddable
public class CrfichaorcId implements java.io.Serializable {

	private int seqfichaaval;
	private int seqitfichaaval;
	private int codfilial;
	private int codemp;
	private int codorc;
	private int coditorc;
	private char tipoorc;
	private int codfilialor;
	private int codempor;

	public CrfichaorcId() {
	}

	public CrfichaorcId(int seqfichaaval, int seqitfichaaval, int codfilial,
			int codemp, int codorc, int coditorc, char tipoorc,
			int codfilialor, int codempor) {
		this.seqfichaaval = seqfichaaval;
		this.seqitfichaaval = seqitfichaaval;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codorc = codorc;
		this.coditorc = coditorc;
		this.tipoorc = tipoorc;
		this.codfilialor = codfilialor;
		this.codempor = codempor;
	}

	@Column(name = "SEQFICHAAVAL", nullable = false)
	public int getSeqfichaaval() {
		return this.seqfichaaval;
	}

	public void setSeqfichaaval(int seqfichaaval) {
		this.seqfichaaval = seqfichaaval;
	}

	@Column(name = "SEQITFICHAAVAL", nullable = false)
	public int getSeqitfichaaval() {
		return this.seqitfichaaval;
	}

	public void setSeqitfichaaval(int seqitfichaaval) {
		this.seqitfichaaval = seqitfichaaval;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODORC", nullable = false)
	public int getCodorc() {
		return this.codorc;
	}

	public void setCodorc(int codorc) {
		this.codorc = codorc;
	}

	@Column(name = "CODITORC", nullable = false)
	public int getCoditorc() {
		return this.coditorc;
	}

	public void setCoditorc(int coditorc) {
		this.coditorc = coditorc;
	}

	@Column(name = "TIPOORC", nullable = false, length = 1)
	public char getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(char tipoorc) {
		this.tipoorc = tipoorc;
	}

	@Column(name = "CODFILIALOR", nullable = false)
	public int getCodfilialor() {
		return this.codfilialor;
	}

	public void setCodfilialor(int codfilialor) {
		this.codfilialor = codfilialor;
	}

	@Column(name = "CODEMPOR", nullable = false)
	public int getCodempor() {
		return this.codempor;
	}

	public void setCodempor(int codempor) {
		this.codempor = codempor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrfichaorcId))
			return false;
		CrfichaorcId castOther = (CrfichaorcId) other;

		return (this.getSeqfichaaval() == castOther.getSeqfichaaval())
				&& (this.getSeqitfichaaval() == castOther.getSeqitfichaaval())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodorc() == castOther.getCodorc())
				&& (this.getCoditorc() == castOther.getCoditorc())
				&& (this.getTipoorc() == castOther.getTipoorc())
				&& (this.getCodfilialor() == castOther.getCodfilialor())
				&& (this.getCodempor() == castOther.getCodempor());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSeqfichaaval();
		result = 37 * result + this.getSeqitfichaaval();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodorc();
		result = 37 * result + this.getCoditorc();
		result = 37 * result + this.getTipoorc();
		result = 37 * result + this.getCodfilialor();
		result = 37 * result + this.getCodempor();
		return result;
	}

}

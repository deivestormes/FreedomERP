package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * AtatendimentoorcId generated by hbm2java
 */
public class AtatendimentoorcId implements java.io.Serializable {

	private int codatendo;
	private short codfilial;
	private int codemp;
	private int codorc;
	private char tipoorc;
	private short codfilialoc;
	private int codempoc;

	public AtatendimentoorcId() {
	}

	public AtatendimentoorcId(int codatendo, short codfilial, int codemp,
			int codorc, char tipoorc, short codfilialoc, int codempoc) {
		this.codatendo = codatendo;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codorc = codorc;
		this.tipoorc = tipoorc;
		this.codfilialoc = codfilialoc;
		this.codempoc = codempoc;
	}

	public int getCodatendo() {
		return this.codatendo;
	}

	public void setCodatendo(int codatendo) {
		this.codatendo = codatendo;
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

	public int getCodorc() {
		return this.codorc;
	}

	public void setCodorc(int codorc) {
		this.codorc = codorc;
	}

	public char getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(char tipoorc) {
		this.tipoorc = tipoorc;
	}

	public short getCodfilialoc() {
		return this.codfilialoc;
	}

	public void setCodfilialoc(short codfilialoc) {
		this.codfilialoc = codfilialoc;
	}

	public int getCodempoc() {
		return this.codempoc;
	}

	public void setCodempoc(int codempoc) {
		this.codempoc = codempoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AtatendimentoorcId))
			return false;
		AtatendimentoorcId castOther = (AtatendimentoorcId) other;

		return (this.getCodatendo() == castOther.getCodatendo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodorc() == castOther.getCodorc())
				&& (this.getTipoorc() == castOther.getTipoorc())
				&& (this.getCodfilialoc() == castOther.getCodfilialoc())
				&& (this.getCodempoc() == castOther.getCodempoc());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodatendo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodorc();
		result = 37 * result + this.getTipoorc();
		result = 37 * result + this.getCodfilialoc();
		result = 37 * result + this.getCodempoc();
		return result;
	}

}

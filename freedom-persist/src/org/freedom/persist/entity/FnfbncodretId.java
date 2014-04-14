package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * FnfbncodretId generated by hbm2java
 */
public class FnfbncodretId implements java.io.Serializable {

	private String codret;
	private String tipofebraban;
	private String codbanco;
	private short codfilialbo;
	private int codempbo;
	private short codfilial;
	private int codemp;

	public FnfbncodretId() {
	}

	public FnfbncodretId(String codret, String tipofebraban, String codbanco,
			short codfilialbo, int codempbo, short codfilial, int codemp) {
		this.codret = codret;
		this.tipofebraban = tipofebraban;
		this.codbanco = codbanco;
		this.codfilialbo = codfilialbo;
		this.codempbo = codempbo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodret() {
		return this.codret;
	}

	public void setCodret(String codret) {
		this.codret = codret;
	}

	public String getTipofebraban() {
		return this.tipofebraban;
	}

	public void setTipofebraban(String tipofebraban) {
		this.tipofebraban = tipofebraban;
	}

	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	public short getCodfilialbo() {
		return this.codfilialbo;
	}

	public void setCodfilialbo(short codfilialbo) {
		this.codfilialbo = codfilialbo;
	}

	public int getCodempbo() {
		return this.codempbo;
	}

	public void setCodempbo(int codempbo) {
		this.codempbo = codempbo;
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
		if (!(other instanceof FnfbncodretId))
			return false;
		FnfbncodretId castOther = (FnfbncodretId) other;

		return ((this.getCodret() == castOther.getCodret()) || (this
				.getCodret() != null && castOther.getCodret() != null && this
				.getCodret().equals(castOther.getCodret())))
				&& ((this.getTipofebraban() == castOther.getTipofebraban()) || (this
						.getTipofebraban() != null
						&& castOther.getTipofebraban() != null && this
						.getTipofebraban().equals(castOther.getTipofebraban())))
				&& ((this.getCodbanco() == castOther.getCodbanco()) || (this
						.getCodbanco() != null
						&& castOther.getCodbanco() != null && this
						.getCodbanco().equals(castOther.getCodbanco())))
				&& (this.getCodfilialbo() == castOther.getCodfilialbo())
				&& (this.getCodempbo() == castOther.getCodempbo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodret() == null ? 0 : this.getCodret().hashCode());
		result = 37
				* result
				+ (getTipofebraban() == null ? 0 : this.getTipofebraban()
						.hashCode());
		result = 37 * result
				+ (getCodbanco() == null ? 0 : this.getCodbanco().hashCode());
		result = 37 * result + this.getCodfilialbo();
		result = 37 * result + this.getCodempbo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

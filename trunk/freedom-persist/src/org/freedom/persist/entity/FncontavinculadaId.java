package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FncontavinculadaId generated by hbm2java
 */
public class FncontavinculadaId implements java.io.Serializable {

	private String numconta;
	private short codfilial;
	private int codemp;
	private String numcontacv;
	private short codfilialcv;
	private int codempcv;

	public FncontavinculadaId() {
	}

	public FncontavinculadaId(String numconta, short codfilial, int codemp,
			String numcontacv, short codfilialcv, int codempcv) {
		this.numconta = numconta;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.numcontacv = numcontacv;
		this.codfilialcv = codfilialcv;
		this.codempcv = codempcv;
	}

	public String getNumconta() {
		return this.numconta;
	}

	public void setNumconta(String numconta) {
		this.numconta = numconta;
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

	public String getNumcontacv() {
		return this.numcontacv;
	}

	public void setNumcontacv(String numcontacv) {
		this.numcontacv = numcontacv;
	}

	public short getCodfilialcv() {
		return this.codfilialcv;
	}

	public void setCodfilialcv(short codfilialcv) {
		this.codfilialcv = codfilialcv;
	}

	public int getCodempcv() {
		return this.codempcv;
	}

	public void setCodempcv(int codempcv) {
		this.codempcv = codempcv;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FncontavinculadaId))
			return false;
		FncontavinculadaId castOther = (FncontavinculadaId) other;

		return ((this.getNumconta() == castOther.getNumconta()) || (this
				.getNumconta() != null && castOther.getNumconta() != null && this
				.getNumconta().equals(castOther.getNumconta())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& ((this.getNumcontacv() == castOther.getNumcontacv()) || (this
						.getNumcontacv() != null
						&& castOther.getNumcontacv() != null && this
						.getNumcontacv().equals(castOther.getNumcontacv())))
				&& (this.getCodfilialcv() == castOther.getCodfilialcv())
				&& (this.getCodempcv() == castOther.getCodempcv());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNumconta() == null ? 0 : this.getNumconta().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37
				* result
				+ (getNumcontacv() == null ? 0 : this.getNumcontacv()
						.hashCode());
		result = 37 * result + this.getCodfilialcv();
		result = 37 * result + this.getCodempcv();
		return result;
	}

}

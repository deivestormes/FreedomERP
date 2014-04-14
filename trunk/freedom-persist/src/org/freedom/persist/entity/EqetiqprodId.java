package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * EqetiqprodId generated by hbm2java
 */
public class EqetiqprodId implements java.io.Serializable {

	private int nrconexao;
	private int codemp;
	private short codfilial;
	private int codprod;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public EqetiqprodId() {
	}

	public EqetiqprodId(int nrconexao, int codemp, short codfilial,
			int codprod, Date dtins, Date hins, String idusuins) {
		this.nrconexao = nrconexao;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codprod = codprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public EqetiqprodId(int nrconexao, int codemp, short codfilial,
			int codprod, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.nrconexao = nrconexao;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codprod = codprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public int getNrconexao() {
		return this.nrconexao;
	}

	public void setNrconexao(int nrconexao) {
		this.nrconexao = nrconexao;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqetiqprodId))
			return false;
		EqetiqprodId castOther = (EqetiqprodId) other;

		return (this.getNrconexao() == castOther.getNrconexao())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodprod() == castOther.getCodprod())
				&& ((this.getDtins() == castOther.getDtins()) || (this
						.getDtins() != null && castOther.getDtins() != null && this
						.getDtins().equals(castOther.getDtins())))
				&& ((this.getHins() == castOther.getHins()) || (this.getHins() != null
						&& castOther.getHins() != null && this.getHins()
						.equals(castOther.getHins())))
				&& ((this.getIdusuins() == castOther.getIdusuins()) || (this
						.getIdusuins() != null
						&& castOther.getIdusuins() != null && this
						.getIdusuins().equals(castOther.getIdusuins())))
				&& ((this.getDtalt() == castOther.getDtalt()) || (this
						.getDtalt() != null && castOther.getDtalt() != null && this
						.getDtalt().equals(castOther.getDtalt())))
				&& ((this.getHalt() == castOther.getHalt()) || (this.getHalt() != null
						&& castOther.getHalt() != null && this.getHalt()
						.equals(castOther.getHalt())))
				&& ((this.getIdusualt() == castOther.getIdusualt()) || (this
						.getIdusualt() != null
						&& castOther.getIdusualt() != null && this
						.getIdusualt().equals(castOther.getIdusualt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNrconexao();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodprod();
		result = 37 * result
				+ (getDtins() == null ? 0 : this.getDtins().hashCode());
		result = 37 * result
				+ (getHins() == null ? 0 : this.getHins().hashCode());
		result = 37 * result
				+ (getIdusuins() == null ? 0 : this.getIdusuins().hashCode());
		result = 37 * result
				+ (getDtalt() == null ? 0 : this.getDtalt().hashCode());
		result = 37 * result
				+ (getHalt() == null ? 0 : this.getHalt().hashCode());
		result = 37 * result
				+ (getIdusualt() == null ? 0 : this.getIdusualt().hashCode());
		return result;
	}

}

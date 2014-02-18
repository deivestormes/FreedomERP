package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * AtagendaId generated by hbm2java
 */
public class AtagendaId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codag;
	private int codempsa;
	private short codfilialsa;
	private int codsetat;
	private Date dtacadag;
	private Date horacatag;
	private Date dtaag;
	private Date horaag;
	private String descagenda;
	private Integer codempae;
	private Short codfilialae;
	private Integer codatend;
	private Date dtaatendag;
	private Date horaatendag;
	private String obsagenda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public AtagendaId() {
	}

	public AtagendaId(int codemp, short codfilial, int codag, int codempsa,
			short codfilialsa, int codsetat, Date dtacadag, Date horacatag,
			Date dtaag, Date horaag, String descagenda, Date dtins, Date hins,
			String idusuins) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codag = codag;
		this.codempsa = codempsa;
		this.codfilialsa = codfilialsa;
		this.codsetat = codsetat;
		this.dtacadag = dtacadag;
		this.horacatag = horacatag;
		this.dtaag = dtaag;
		this.horaag = horaag;
		this.descagenda = descagenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public AtagendaId(int codemp, short codfilial, int codag, int codempsa,
			short codfilialsa, int codsetat, Date dtacadag, Date horacatag,
			Date dtaag, Date horaag, String descagenda, Integer codempae,
			Short codfilialae, Integer codatend, Date dtaatendag,
			Date horaatendag, String obsagenda, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codag = codag;
		this.codempsa = codempsa;
		this.codfilialsa = codfilialsa;
		this.codsetat = codsetat;
		this.dtacadag = dtacadag;
		this.horacatag = horacatag;
		this.dtaag = dtaag;
		this.horaag = horaag;
		this.descagenda = descagenda;
		this.codempae = codempae;
		this.codfilialae = codfilialae;
		this.codatend = codatend;
		this.dtaatendag = dtaatendag;
		this.horaatendag = horaatendag;
		this.obsagenda = obsagenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
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

	public int getCodag() {
		return this.codag;
	}

	public void setCodag(int codag) {
		this.codag = codag;
	}

	public int getCodempsa() {
		return this.codempsa;
	}

	public void setCodempsa(int codempsa) {
		this.codempsa = codempsa;
	}

	public short getCodfilialsa() {
		return this.codfilialsa;
	}

	public void setCodfilialsa(short codfilialsa) {
		this.codfilialsa = codfilialsa;
	}

	public int getCodsetat() {
		return this.codsetat;
	}

	public void setCodsetat(int codsetat) {
		this.codsetat = codsetat;
	}

	public Date getDtacadag() {
		return this.dtacadag;
	}

	public void setDtacadag(Date dtacadag) {
		this.dtacadag = dtacadag;
	}

	public Date getHoracatag() {
		return this.horacatag;
	}

	public void setHoracatag(Date horacatag) {
		this.horacatag = horacatag;
	}

	public Date getDtaag() {
		return this.dtaag;
	}

	public void setDtaag(Date dtaag) {
		this.dtaag = dtaag;
	}

	public Date getHoraag() {
		return this.horaag;
	}

	public void setHoraag(Date horaag) {
		this.horaag = horaag;
	}

	public String getDescagenda() {
		return this.descagenda;
	}

	public void setDescagenda(String descagenda) {
		this.descagenda = descagenda;
	}

	public Integer getCodempae() {
		return this.codempae;
	}

	public void setCodempae(Integer codempae) {
		this.codempae = codempae;
	}

	public Short getCodfilialae() {
		return this.codfilialae;
	}

	public void setCodfilialae(Short codfilialae) {
		this.codfilialae = codfilialae;
	}

	public Integer getCodatend() {
		return this.codatend;
	}

	public void setCodatend(Integer codatend) {
		this.codatend = codatend;
	}

	public Date getDtaatendag() {
		return this.dtaatendag;
	}

	public void setDtaatendag(Date dtaatendag) {
		this.dtaatendag = dtaatendag;
	}

	public Date getHoraatendag() {
		return this.horaatendag;
	}

	public void setHoraatendag(Date horaatendag) {
		this.horaatendag = horaatendag;
	}

	public String getObsagenda() {
		return this.obsagenda;
	}

	public void setObsagenda(String obsagenda) {
		this.obsagenda = obsagenda;
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
		if (!(other instanceof AtagendaId))
			return false;
		AtagendaId castOther = (AtagendaId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodag() == castOther.getCodag())
				&& (this.getCodempsa() == castOther.getCodempsa())
				&& (this.getCodfilialsa() == castOther.getCodfilialsa())
				&& (this.getCodsetat() == castOther.getCodsetat())
				&& ((this.getDtacadag() == castOther.getDtacadag()) || (this
						.getDtacadag() != null
						&& castOther.getDtacadag() != null && this
						.getDtacadag().equals(castOther.getDtacadag())))
				&& ((this.getHoracatag() == castOther.getHoracatag()) || (this
						.getHoracatag() != null
						&& castOther.getHoracatag() != null && this
						.getHoracatag().equals(castOther.getHoracatag())))
				&& ((this.getDtaag() == castOther.getDtaag()) || (this
						.getDtaag() != null && castOther.getDtaag() != null && this
						.getDtaag().equals(castOther.getDtaag())))
				&& ((this.getHoraag() == castOther.getHoraag()) || (this
						.getHoraag() != null && castOther.getHoraag() != null && this
						.getHoraag().equals(castOther.getHoraag())))
				&& ((this.getDescagenda() == castOther.getDescagenda()) || (this
						.getDescagenda() != null
						&& castOther.getDescagenda() != null && this
						.getDescagenda().equals(castOther.getDescagenda())))
				&& ((this.getCodempae() == castOther.getCodempae()) || (this
						.getCodempae() != null
						&& castOther.getCodempae() != null && this
						.getCodempae().equals(castOther.getCodempae())))
				&& ((this.getCodfilialae() == castOther.getCodfilialae()) || (this
						.getCodfilialae() != null
						&& castOther.getCodfilialae() != null && this
						.getCodfilialae().equals(castOther.getCodfilialae())))
				&& ((this.getCodatend() == castOther.getCodatend()) || (this
						.getCodatend() != null
						&& castOther.getCodatend() != null && this
						.getCodatend().equals(castOther.getCodatend())))
				&& ((this.getDtaatendag() == castOther.getDtaatendag()) || (this
						.getDtaatendag() != null
						&& castOther.getDtaatendag() != null && this
						.getDtaatendag().equals(castOther.getDtaatendag())))
				&& ((this.getHoraatendag() == castOther.getHoraatendag()) || (this
						.getHoraatendag() != null
						&& castOther.getHoraatendag() != null && this
						.getHoraatendag().equals(castOther.getHoraatendag())))
				&& ((this.getObsagenda() == castOther.getObsagenda()) || (this
						.getObsagenda() != null
						&& castOther.getObsagenda() != null && this
						.getObsagenda().equals(castOther.getObsagenda())))
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

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodag();
		result = 37 * result + this.getCodempsa();
		result = 37 * result + this.getCodfilialsa();
		result = 37 * result + this.getCodsetat();
		result = 37 * result
				+ (getDtacadag() == null ? 0 : this.getDtacadag().hashCode());
		result = 37 * result
				+ (getHoracatag() == null ? 0 : this.getHoracatag().hashCode());
		result = 37 * result
				+ (getDtaag() == null ? 0 : this.getDtaag().hashCode());
		result = 37 * result
				+ (getHoraag() == null ? 0 : this.getHoraag().hashCode());
		result = 37
				* result
				+ (getDescagenda() == null ? 0 : this.getDescagenda()
						.hashCode());
		result = 37 * result
				+ (getCodempae() == null ? 0 : this.getCodempae().hashCode());
		result = 37
				* result
				+ (getCodfilialae() == null ? 0 : this.getCodfilialae()
						.hashCode());
		result = 37 * result
				+ (getCodatend() == null ? 0 : this.getCodatend().hashCode());
		result = 37
				* result
				+ (getDtaatendag() == null ? 0 : this.getDtaatendag()
						.hashCode());
		result = 37
				* result
				+ (getHoraatendag() == null ? 0 : this.getHoraatendag()
						.hashCode());
		result = 37 * result
				+ (getObsagenda() == null ? 0 : this.getObsagenda().hashCode());
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

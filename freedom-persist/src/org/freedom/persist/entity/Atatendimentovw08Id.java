package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Atatendimentovw08Id generated by hbm2java
 */
public class Atatendimentovw08Id implements java.io.Serializable {

	private Date dataatendo;
	private Date dtfincontr;
	private Integer codempae;
	private Short codfilialae;
	private Integer codatend;
	private String nomeatend;
	private Integer codempct;
	private Short codfilialct;
	private Integer codcontr;
	private Short coditcontr;
	private String desccontr;
	private String descitcontr;
	private String tpcobcontr;
	private String sitcontr;
	private BigDecimal totalcomis;
	private Integer codempoc;
	private Short codfilialoc;
	private Character tipoorc;
	private Integer codorc;

	public Atatendimentovw08Id() {
	}

	public Atatendimentovw08Id(Date dataatendo, Date dtfincontr,
			Integer codempae, Short codfilialae, Integer codatend,
			String nomeatend, Integer codempct, Short codfilialct,
			Integer codcontr, Short coditcontr, String desccontr,
			String descitcontr, String tpcobcontr, String sitcontr,
			BigDecimal totalcomis, Integer codempoc, Short codfilialoc,
			Character tipoorc, Integer codorc) {
		this.dataatendo = dataatendo;
		this.dtfincontr = dtfincontr;
		this.codempae = codempae;
		this.codfilialae = codfilialae;
		this.codatend = codatend;
		this.nomeatend = nomeatend;
		this.codempct = codempct;
		this.codfilialct = codfilialct;
		this.codcontr = codcontr;
		this.coditcontr = coditcontr;
		this.desccontr = desccontr;
		this.descitcontr = descitcontr;
		this.tpcobcontr = tpcobcontr;
		this.sitcontr = sitcontr;
		this.totalcomis = totalcomis;
		this.codempoc = codempoc;
		this.codfilialoc = codfilialoc;
		this.tipoorc = tipoorc;
		this.codorc = codorc;
	}

	public Date getDataatendo() {
		return this.dataatendo;
	}

	public void setDataatendo(Date dataatendo) {
		this.dataatendo = dataatendo;
	}

	public Date getDtfincontr() {
		return this.dtfincontr;
	}

	public void setDtfincontr(Date dtfincontr) {
		this.dtfincontr = dtfincontr;
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

	public String getNomeatend() {
		return this.nomeatend;
	}

	public void setNomeatend(String nomeatend) {
		this.nomeatend = nomeatend;
	}

	public Integer getCodempct() {
		return this.codempct;
	}

	public void setCodempct(Integer codempct) {
		this.codempct = codempct;
	}

	public Short getCodfilialct() {
		return this.codfilialct;
	}

	public void setCodfilialct(Short codfilialct) {
		this.codfilialct = codfilialct;
	}

	public Integer getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(Integer codcontr) {
		this.codcontr = codcontr;
	}

	public Short getCoditcontr() {
		return this.coditcontr;
	}

	public void setCoditcontr(Short coditcontr) {
		this.coditcontr = coditcontr;
	}

	public String getDesccontr() {
		return this.desccontr;
	}

	public void setDesccontr(String desccontr) {
		this.desccontr = desccontr;
	}

	public String getDescitcontr() {
		return this.descitcontr;
	}

	public void setDescitcontr(String descitcontr) {
		this.descitcontr = descitcontr;
	}

	public String getTpcobcontr() {
		return this.tpcobcontr;
	}

	public void setTpcobcontr(String tpcobcontr) {
		this.tpcobcontr = tpcobcontr;
	}

	public String getSitcontr() {
		return this.sitcontr;
	}

	public void setSitcontr(String sitcontr) {
		this.sitcontr = sitcontr;
	}

	public BigDecimal getTotalcomis() {
		return this.totalcomis;
	}

	public void setTotalcomis(BigDecimal totalcomis) {
		this.totalcomis = totalcomis;
	}

	public Integer getCodempoc() {
		return this.codempoc;
	}

	public void setCodempoc(Integer codempoc) {
		this.codempoc = codempoc;
	}

	public Short getCodfilialoc() {
		return this.codfilialoc;
	}

	public void setCodfilialoc(Short codfilialoc) {
		this.codfilialoc = codfilialoc;
	}

	public Character getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(Character tipoorc) {
		this.tipoorc = tipoorc;
	}

	public Integer getCodorc() {
		return this.codorc;
	}

	public void setCodorc(Integer codorc) {
		this.codorc = codorc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Atatendimentovw08Id))
			return false;
		Atatendimentovw08Id castOther = (Atatendimentovw08Id) other;

		return ((this.getDataatendo() == castOther.getDataatendo()) || (this
				.getDataatendo() != null && castOther.getDataatendo() != null && this
				.getDataatendo().equals(castOther.getDataatendo())))
				&& ((this.getDtfincontr() == castOther.getDtfincontr()) || (this
						.getDtfincontr() != null
						&& castOther.getDtfincontr() != null && this
						.getDtfincontr().equals(castOther.getDtfincontr())))
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
				&& ((this.getNomeatend() == castOther.getNomeatend()) || (this
						.getNomeatend() != null
						&& castOther.getNomeatend() != null && this
						.getNomeatend().equals(castOther.getNomeatend())))
				&& ((this.getCodempct() == castOther.getCodempct()) || (this
						.getCodempct() != null
						&& castOther.getCodempct() != null && this
						.getCodempct().equals(castOther.getCodempct())))
				&& ((this.getCodfilialct() == castOther.getCodfilialct()) || (this
						.getCodfilialct() != null
						&& castOther.getCodfilialct() != null && this
						.getCodfilialct().equals(castOther.getCodfilialct())))
				&& ((this.getCodcontr() == castOther.getCodcontr()) || (this
						.getCodcontr() != null
						&& castOther.getCodcontr() != null && this
						.getCodcontr().equals(castOther.getCodcontr())))
				&& ((this.getCoditcontr() == castOther.getCoditcontr()) || (this
						.getCoditcontr() != null
						&& castOther.getCoditcontr() != null && this
						.getCoditcontr().equals(castOther.getCoditcontr())))
				&& ((this.getDesccontr() == castOther.getDesccontr()) || (this
						.getDesccontr() != null
						&& castOther.getDesccontr() != null && this
						.getDesccontr().equals(castOther.getDesccontr())))
				&& ((this.getDescitcontr() == castOther.getDescitcontr()) || (this
						.getDescitcontr() != null
						&& castOther.getDescitcontr() != null && this
						.getDescitcontr().equals(castOther.getDescitcontr())))
				&& ((this.getTpcobcontr() == castOther.getTpcobcontr()) || (this
						.getTpcobcontr() != null
						&& castOther.getTpcobcontr() != null && this
						.getTpcobcontr().equals(castOther.getTpcobcontr())))
				&& ((this.getSitcontr() == castOther.getSitcontr()) || (this
						.getSitcontr() != null
						&& castOther.getSitcontr() != null && this
						.getSitcontr().equals(castOther.getSitcontr())))
				&& ((this.getTotalcomis() == castOther.getTotalcomis()) || (this
						.getTotalcomis() != null
						&& castOther.getTotalcomis() != null && this
						.getTotalcomis().equals(castOther.getTotalcomis())))
				&& ((this.getCodempoc() == castOther.getCodempoc()) || (this
						.getCodempoc() != null
						&& castOther.getCodempoc() != null && this
						.getCodempoc().equals(castOther.getCodempoc())))
				&& ((this.getCodfilialoc() == castOther.getCodfilialoc()) || (this
						.getCodfilialoc() != null
						&& castOther.getCodfilialoc() != null && this
						.getCodfilialoc().equals(castOther.getCodfilialoc())))
				&& ((this.getTipoorc() == castOther.getTipoorc()) || (this
						.getTipoorc() != null && castOther.getTipoorc() != null && this
						.getTipoorc().equals(castOther.getTipoorc())))
				&& ((this.getCodorc() == castOther.getCodorc()) || (this
						.getCodorc() != null && castOther.getCodorc() != null && this
						.getCodorc().equals(castOther.getCodorc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDataatendo() == null ? 0 : this.getDataatendo()
						.hashCode());
		result = 37
				* result
				+ (getDtfincontr() == null ? 0 : this.getDtfincontr()
						.hashCode());
		result = 37 * result
				+ (getCodempae() == null ? 0 : this.getCodempae().hashCode());
		result = 37
				* result
				+ (getCodfilialae() == null ? 0 : this.getCodfilialae()
						.hashCode());
		result = 37 * result
				+ (getCodatend() == null ? 0 : this.getCodatend().hashCode());
		result = 37 * result
				+ (getNomeatend() == null ? 0 : this.getNomeatend().hashCode());
		result = 37 * result
				+ (getCodempct() == null ? 0 : this.getCodempct().hashCode());
		result = 37
				* result
				+ (getCodfilialct() == null ? 0 : this.getCodfilialct()
						.hashCode());
		result = 37 * result
				+ (getCodcontr() == null ? 0 : this.getCodcontr().hashCode());
		result = 37
				* result
				+ (getCoditcontr() == null ? 0 : this.getCoditcontr()
						.hashCode());
		result = 37 * result
				+ (getDesccontr() == null ? 0 : this.getDesccontr().hashCode());
		result = 37
				* result
				+ (getDescitcontr() == null ? 0 : this.getDescitcontr()
						.hashCode());
		result = 37
				* result
				+ (getTpcobcontr() == null ? 0 : this.getTpcobcontr()
						.hashCode());
		result = 37 * result
				+ (getSitcontr() == null ? 0 : this.getSitcontr().hashCode());
		result = 37
				* result
				+ (getTotalcomis() == null ? 0 : this.getTotalcomis()
						.hashCode());
		result = 37 * result
				+ (getCodempoc() == null ? 0 : this.getCodempoc().hashCode());
		result = 37
				* result
				+ (getCodfilialoc() == null ? 0 : this.getCodfilialoc()
						.hashCode());
		result = 37 * result
				+ (getTipoorc() == null ? 0 : this.getTipoorc().hashCode());
		result = 37 * result
				+ (getCodorc() == null ? 0 : this.getCodorc().hashCode());
		return result;
	}

}

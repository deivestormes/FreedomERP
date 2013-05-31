package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Atatendimentovw07Id generated by hbm2java
 */
@Embeddable
public class Atatendimentovw07Id implements java.io.Serializable {

	private Integer codempcl;
	private Short codfilialcl;
	private Integer codcli;
	private Character razcli;
	private Integer codempct;
	private Short codfilialct;
	private Integer codcontr;
	private Character desccontr;
	private String descsitcontr;
	private Character sitcontr;
	private Character tpcontr;
	private Character tpcobcontr;
	private BigDecimal qtdcontr;
	private BigDecimal tothoras;

	public Atatendimentovw07Id() {
	}

	public Atatendimentovw07Id(Integer codempcl, Short codfilialcl,
			Integer codcli, Character razcli, Integer codempct,
			Short codfilialct, Integer codcontr, Character desccontr,
			String descsitcontr, Character sitcontr, Character tpcontr,
			Character tpcobcontr, BigDecimal qtdcontr, BigDecimal tothoras) {
		this.codempcl = codempcl;
		this.codfilialcl = codfilialcl;
		this.codcli = codcli;
		this.razcli = razcli;
		this.codempct = codempct;
		this.codfilialct = codfilialct;
		this.codcontr = codcontr;
		this.desccontr = desccontr;
		this.descsitcontr = descsitcontr;
		this.sitcontr = sitcontr;
		this.tpcontr = tpcontr;
		this.tpcobcontr = tpcobcontr;
		this.qtdcontr = qtdcontr;
		this.tothoras = tothoras;
	}

	@Column(name = "CODEMPCL")
	public Integer getCodempcl() {
		return this.codempcl;
	}

	public void setCodempcl(Integer codempcl) {
		this.codempcl = codempcl;
	}

	@Column(name = "CODFILIALCL")
	public Short getCodfilialcl() {
		return this.codfilialcl;
	}

	public void setCodfilialcl(Short codfilialcl) {
		this.codfilialcl = codfilialcl;
	}

	@Column(name = "CODCLI")
	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	@Column(name = "RAZCLI", length = 0)
	public Character getRazcli() {
		return this.razcli;
	}

	public void setRazcli(Character razcli) {
		this.razcli = razcli;
	}

	@Column(name = "CODEMPCT")
	public Integer getCodempct() {
		return this.codempct;
	}

	public void setCodempct(Integer codempct) {
		this.codempct = codempct;
	}

	@Column(name = "CODFILIALCT")
	public Short getCodfilialct() {
		return this.codfilialct;
	}

	public void setCodfilialct(Short codfilialct) {
		this.codfilialct = codfilialct;
	}

	@Column(name = "CODCONTR")
	public Integer getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(Integer codcontr) {
		this.codcontr = codcontr;
	}

	@Column(name = "DESCCONTR", length = 0)
	public Character getDesccontr() {
		return this.desccontr;
	}

	public void setDesccontr(Character desccontr) {
		this.desccontr = desccontr;
	}

	@Column(name = "DESCSITCONTR", length = 0)
	public String getDescsitcontr() {
		return this.descsitcontr;
	}

	public void setDescsitcontr(String descsitcontr) {
		this.descsitcontr = descsitcontr;
	}

	@Column(name = "SITCONTR", length = 0)
	public Character getSitcontr() {
		return this.sitcontr;
	}

	public void setSitcontr(Character sitcontr) {
		this.sitcontr = sitcontr;
	}

	@Column(name = "TPCONTR", length = 0)
	public Character getTpcontr() {
		return this.tpcontr;
	}

	public void setTpcontr(Character tpcontr) {
		this.tpcontr = tpcontr;
	}

	@Column(name = "TPCOBCONTR", length = 0)
	public Character getTpcobcontr() {
		return this.tpcobcontr;
	}

	public void setTpcobcontr(Character tpcobcontr) {
		this.tpcobcontr = tpcobcontr;
	}

	@Column(name = "QTDCONTR", precision = 0, scale = 5)
	public BigDecimal getQtdcontr() {
		return this.qtdcontr;
	}

	public void setQtdcontr(BigDecimal qtdcontr) {
		this.qtdcontr = qtdcontr;
	}

	@Column(name = "TOTHORAS", precision = 0, scale = 4)
	public BigDecimal getTothoras() {
		return this.tothoras;
	}

	public void setTothoras(BigDecimal tothoras) {
		this.tothoras = tothoras;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Atatendimentovw07Id))
			return false;
		Atatendimentovw07Id castOther = (Atatendimentovw07Id) other;

		return ((this.getCodempcl() == castOther.getCodempcl()) || (this
				.getCodempcl() != null && castOther.getCodempcl() != null && this
				.getCodempcl().equals(castOther.getCodempcl())))
				&& ((this.getCodfilialcl() == castOther.getCodfilialcl()) || (this
						.getCodfilialcl() != null
						&& castOther.getCodfilialcl() != null && this
						.getCodfilialcl().equals(castOther.getCodfilialcl())))
				&& ((this.getCodcli() == castOther.getCodcli()) || (this
						.getCodcli() != null && castOther.getCodcli() != null && this
						.getCodcli().equals(castOther.getCodcli())))
				&& ((this.getRazcli() == castOther.getRazcli()) || (this
						.getRazcli() != null && castOther.getRazcli() != null && this
						.getRazcli().equals(castOther.getRazcli())))
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
				&& ((this.getDesccontr() == castOther.getDesccontr()) || (this
						.getDesccontr() != null
						&& castOther.getDesccontr() != null && this
						.getDesccontr().equals(castOther.getDesccontr())))
				&& ((this.getDescsitcontr() == castOther.getDescsitcontr()) || (this
						.getDescsitcontr() != null
						&& castOther.getDescsitcontr() != null && this
						.getDescsitcontr().equals(castOther.getDescsitcontr())))
				&& ((this.getSitcontr() == castOther.getSitcontr()) || (this
						.getSitcontr() != null
						&& castOther.getSitcontr() != null && this
						.getSitcontr().equals(castOther.getSitcontr())))
				&& ((this.getTpcontr() == castOther.getTpcontr()) || (this
						.getTpcontr() != null && castOther.getTpcontr() != null && this
						.getTpcontr().equals(castOther.getTpcontr())))
				&& ((this.getTpcobcontr() == castOther.getTpcobcontr()) || (this
						.getTpcobcontr() != null
						&& castOther.getTpcobcontr() != null && this
						.getTpcobcontr().equals(castOther.getTpcobcontr())))
				&& ((this.getQtdcontr() == castOther.getQtdcontr()) || (this
						.getQtdcontr() != null
						&& castOther.getQtdcontr() != null && this
						.getQtdcontr().equals(castOther.getQtdcontr())))
				&& ((this.getTothoras() == castOther.getTothoras()) || (this
						.getTothoras() != null
						&& castOther.getTothoras() != null && this
						.getTothoras().equals(castOther.getTothoras())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodempcl() == null ? 0 : this.getCodempcl().hashCode());
		result = 37
				* result
				+ (getCodfilialcl() == null ? 0 : this.getCodfilialcl()
						.hashCode());
		result = 37 * result
				+ (getCodcli() == null ? 0 : this.getCodcli().hashCode());
		result = 37 * result
				+ (getRazcli() == null ? 0 : this.getRazcli().hashCode());
		result = 37 * result
				+ (getCodempct() == null ? 0 : this.getCodempct().hashCode());
		result = 37
				* result
				+ (getCodfilialct() == null ? 0 : this.getCodfilialct()
						.hashCode());
		result = 37 * result
				+ (getCodcontr() == null ? 0 : this.getCodcontr().hashCode());
		result = 37 * result
				+ (getDesccontr() == null ? 0 : this.getDesccontr().hashCode());
		result = 37
				* result
				+ (getDescsitcontr() == null ? 0 : this.getDescsitcontr()
						.hashCode());
		result = 37 * result
				+ (getSitcontr() == null ? 0 : this.getSitcontr().hashCode());
		result = 37 * result
				+ (getTpcontr() == null ? 0 : this.getTpcontr().hashCode());
		result = 37
				* result
				+ (getTpcobcontr() == null ? 0 : this.getTpcobcontr()
						.hashCode());
		result = 37 * result
				+ (getQtdcontr() == null ? 0 : this.getQtdcontr().hashCode());
		result = 37 * result
				+ (getTothoras() == null ? 0 : this.getTothoras().hashCode());
		return result;
	}

}

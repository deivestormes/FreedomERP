package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vditregracomis generated by hbm2java
 */
@Entity
@Table(name = "VDITREGRACOMIS")
public class Vditregracomis implements java.io.Serializable {

	private VditregracomisId id;
	private Vdregracomis vdregracomis;
	private Vdvendedor vdvendedor;
	private Vdtipovend vdtipovend;
	private char obrigitrc;
	private BigDecimal perccomisitrc;
	private String idusualt;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private Set vdvendacomises = new HashSet(0);

	public Vditregracomis() {
	}

	public Vditregracomis(VditregracomisId id, Vdregracomis vdregracomis,
			Vdtipovend vdtipovend, char obrigitrc, BigDecimal perccomisitrc,
			String idusualt, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt) {
		this.id = id;
		this.vdregracomis = vdregracomis;
		this.vdtipovend = vdtipovend;
		this.obrigitrc = obrigitrc;
		this.perccomisitrc = perccomisitrc;
		this.idusualt = idusualt;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Vditregracomis(VditregracomisId id, Vdregracomis vdregracomis,
			Vdvendedor vdvendedor, Vdtipovend vdtipovend, char obrigitrc,
			BigDecimal perccomisitrc, String idusualt, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, Set vdvendacomises) {
		this.id = id;
		this.vdregracomis = vdregracomis;
		this.vdvendedor = vdvendedor;
		this.vdtipovend = vdtipovend;
		this.obrigitrc = obrigitrc;
		this.perccomisitrc = perccomisitrc;
		this.idusualt = idusualt;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.vdvendacomises = vdvendacomises;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codregrcomis", column = @Column(name = "CODREGRCOMIS", nullable = false)),
			@AttributeOverride(name = "seqitrc", column = @Column(name = "SEQITRC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VditregracomisId getId() {
		return this.id;
	}

	public void setId(VditregracomisId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODREGRCOMIS", referencedColumnName = "CODREGRCOMIS", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdregracomis getVdregracomis() {
		return this.vdregracomis;
	}

	public void setVdregracomis(Vdregracomis vdregracomis) {
		this.vdregracomis = vdregracomis;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOVEND", referencedColumnName = "CODTIPOVEND", nullable = false),
			@JoinColumn(name = "CODFILIALTV", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTV", referencedColumnName = "CODEMP", nullable = false) })
	public Vdtipovend getVdtipovend() {
		return this.vdtipovend;
	}

	public void setVdtipovend(Vdtipovend vdtipovend) {
		this.vdtipovend = vdtipovend;
	}

	@Column(name = "OBRIGITRC", nullable = false, length = 1)
	public char getObrigitrc() {
		return this.obrigitrc;
	}

	public void setObrigitrc(char obrigitrc) {
		this.obrigitrc = obrigitrc;
	}

	@Column(name = "PERCCOMISITRC", nullable = false, precision = 7, scale = 3)
	public BigDecimal getPerccomisitrc() {
		return this.perccomisitrc;
	}

	public void setPerccomisitrc(BigDecimal perccomisitrc) {
		this.perccomisitrc = perccomisitrc;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditregracomis")
	public Set getVdvendacomises() {
		return this.vdvendacomises;
	}

	public void setVdvendacomises(Set vdvendacomises) {
		this.vdvendacomises = vdvendacomises;
	}
*/
}

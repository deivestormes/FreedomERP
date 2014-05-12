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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lftabicms generated by hbm2java
 */
@Entity
@Table(name = "LFTABICMS")
public class Lftabicms implements java.io.Serializable {

	private LftabicmsId id;
	private BigDecimal aliqti;
	private Short aliqintrati;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitnatopers = new HashSet(0);

	public Lftabicms() {
	}

	public Lftabicms(LftabicmsId id, BigDecimal aliqti, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.aliqti = aliqti;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lftabicms(LftabicmsId id, BigDecimal aliqti, Short aliqintrati,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set lfitnatopers) {
		this.id = id;
		this.aliqti = aliqti;
		this.aliqintrati = aliqintrati;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitnatopers = lfitnatopers;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ufti", column = @Column(name = "UFTI", nullable = false, length = 2)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LftabicmsId getId() {
		return this.id;
	}

	public void setId(LftabicmsId id) {
		this.id = id;
	}

	@Column(name = "ALIQTI", nullable = false, precision = 9)
	public BigDecimal getAliqti() {
		return this.aliqti;
	}

	public void setAliqti(BigDecimal aliqti) {
		this.aliqti = aliqti;
	}

	@Column(name = "ALIQINTRATI")
	public Short getAliqintrati() {
		return this.aliqintrati;
	}

	public void setAliqintrati(Short aliqintrati) {
		this.aliqintrati = aliqintrati;
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
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lftabicms")
	public Set getLfitnatopers() {
		return this.lfitnatopers;
	}

	public void setLfitnatopers(Set lfitnatopers) {
		this.lfitnatopers = lfitnatopers;
	}
*/
}

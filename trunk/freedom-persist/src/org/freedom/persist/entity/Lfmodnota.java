package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Lfmodnota generated by hbm2java
 */
@Entity
@Table(name = "LFMODNOTA")
public class Lfmodnota implements java.io.Serializable {

	private LfmodnotaId id;
	private Sgfilial sgfilial;
	private String descmodnota;
	private char tipomodnota;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Eqtipomov> eqtipomovs = new HashSet<Eqtipomov>(0);

	public Lfmodnota() {
	}

	public Lfmodnota(LfmodnotaId id, Sgfilial sgfilial, String descmodnota,
			char tipomodnota, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmodnota = descmodnota;
		this.tipomodnota = tipomodnota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfmodnota(LfmodnotaId id, Sgfilial sgfilial, String descmodnota,
			char tipomodnota, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Eqtipomov> eqtipomovs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmodnota = descmodnota;
		this.tipomodnota = tipomodnota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqtipomovs = eqtipomovs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmodnota", column = @Column(name = "CODMODNOTA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfmodnotaId getId() {
		return this.id;
	}

	public void setId(LfmodnotaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCMODNOTA", nullable = false, length = 30)
	public String getDescmodnota() {
		return this.descmodnota;
	}

	public void setDescmodnota(String descmodnota) {
		this.descmodnota = descmodnota;
	}

	@Column(name = "TIPOMODNOTA", nullable = false, length = 1)
	public char getTipomodnota() {
		return this.tipomodnota;
	}

	public void setTipomodnota(char tipomodnota) {
		this.tipomodnota = tipomodnota;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfmodnota")
	public Set<Eqtipomov> getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set<Eqtipomov> eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

}

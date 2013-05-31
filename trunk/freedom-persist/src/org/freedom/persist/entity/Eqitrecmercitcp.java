package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqitrecmercitcp generated by hbm2java
 */
@Entity
@Table(name = "EQITRECMERCITCP")
public class Eqitrecmercitcp implements java.io.Serializable {

	private EqitrecmercitcpId id;
	private Eqitrecmerc eqitrecmerc;
	private Cpitcompra cpitcompra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqitrecmercitcp() {
	}

	public Eqitrecmercitcp(EqitrecmercitcpId id, Eqitrecmerc eqitrecmerc,
			Cpitcompra cpitcompra, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqitrecmerc = eqitrecmerc;
		this.cpitcompra = cpitcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrecmercitcp(EqitrecmercitcpId id, Eqitrecmerc eqitrecmerc,
			Cpitcompra cpitcompra, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqitrecmerc = eqitrecmerc;
		this.cpitcompra = cpitcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ticket", column = @Column(name = "TICKET", nullable = false)),
			@AttributeOverride(name = "coditrecmerc", column = @Column(name = "CODITRECMERC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codempcp", column = @Column(name = "CODEMPCP", nullable = false)),
			@AttributeOverride(name = "codfilialcp", column = @Column(name = "CODFILIALCP", nullable = false)),
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "coditcompra", column = @Column(name = "CODITCOMPRA", nullable = false)) })
	public EqitrecmercitcpId getId() {
		return this.id;
	}

	public void setId(EqitrecmercitcpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITRECMERC", referencedColumnName = "CODITRECMERC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqitrecmerc getEqitrecmerc() {
		return this.eqitrecmerc;
	}

	public void setEqitrecmerc(Eqitrecmerc eqitrecmerc) {
		this.eqitrecmerc = eqitrecmerc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITCOMPRA", referencedColumnName = "CODITCOMPRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCP", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
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

}

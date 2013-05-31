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
 * Tkcampanhacto generated by hbm2java
 */
@Entity
@Table(name = "TKCAMPANHACTO")
public class Tkcampanhacto implements java.io.Serializable {

	private TkcampanhactoId id;
	private Tkcontato tkcontato;
	private Vdcliente vdcliente;
	private Tkcampanha tkcampanha;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkcampanhacto() {
	}

	public Tkcampanhacto(TkcampanhactoId id, Tkcampanha tkcampanha, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.tkcampanha = tkcampanha;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcampanhacto(TkcampanhactoId id, Tkcontato tkcontato,
			Vdcliente vdcliente, Tkcampanha tkcampanha, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.vdcliente = vdcliente;
		this.tkcampanha = tkcampanha;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcamp", column = @Column(name = "CODCAMP", nullable = false, length = 13)),
			@AttributeOverride(name = "seqcampcto", column = @Column(name = "SEQCAMPCTO", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)) })
	public TkcampanhactoId getId() {
		return this.id;
	}

	public void setId(TkcampanhactoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCTO", referencedColumnName = "CODCTO"),
			@JoinColumn(name = "CODFILIALCO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCO", referencedColumnName = "CODEMP") })
	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI"),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP") })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAMP", referencedColumnName = "CODCAMP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Tkcampanha getTkcampanha() {
		return this.tkcampanha;
	}

	public void setTkcampanha(Tkcampanha tkcampanha) {
		this.tkcampanha = tkcampanha;
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

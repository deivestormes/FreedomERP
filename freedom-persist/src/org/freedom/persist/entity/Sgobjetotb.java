package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Sgobjetotb generated by hbm2java
 */
@Entity
@Table(name = "SGOBJETOTB")
public class Sgobjetotb implements java.io.Serializable {

	private SgobjetotbId id;
	private Sgtabela sgtabela;
	private Sgobjeto sgobjeto;
	private char obrigobjtb;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgobjetotb() {
	}

	public Sgobjetotb(SgobjetotbId id, Sgtabela sgtabela, Sgobjeto sgobjeto,
			char obrigobjtb, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgtabela = sgtabela;
		this.sgobjeto = sgobjeto;
		this.obrigobjtb = obrigobjtb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgobjetotb(SgobjetotbId id, Sgtabela sgtabela, Sgobjeto sgobjeto,
			char obrigobjtb, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgtabela = sgtabela;
		this.sgobjeto = sgobjeto;
		this.obrigobjtb = obrigobjtb;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtb", column = @Column(name = "CODTB", nullable = false)),
			@AttributeOverride(name = "codfilialtb", column = @Column(name = "CODFILIALTB", nullable = false)),
			@AttributeOverride(name = "codemptb", column = @Column(name = "CODEMPTB", nullable = false)),
			@AttributeOverride(name = "idobj", column = @Column(name = "IDOBJ", nullable = false, length = 30)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgobjetotbId getId() {
		return this.id;
	}

	public void setId(SgobjetotbId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTB", referencedColumnName = "CODTB", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALTB", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPTB", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgtabela getSgtabela() {
		return this.sgtabela;
	}

	public void setSgtabela(Sgtabela sgtabela) {
		this.sgtabela = sgtabela;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IDOBJ", referencedColumnName = "IDOBJ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgobjeto getSgobjeto() {
		return this.sgobjeto;
	}

	public void setSgobjeto(Sgobjeto sgobjeto) {
		this.sgobjeto = sgobjeto;
	}

	@Column(name = "OBRIGOBJTB", nullable = false, length = 1)
	public char getObrigobjtb() {
		return this.obrigobjtb;
	}

	public void setObrigobjtb(char obrigobjtb) {
		this.obrigobjtb = obrigobjtb;
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

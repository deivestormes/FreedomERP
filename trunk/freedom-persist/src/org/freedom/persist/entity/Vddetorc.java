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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vddetorc generated by hbm2java
 */
@Entity
@Table(name = "VDDETORC")
public class Vddetorc implements java.io.Serializable {

	private VddetorcId id;
	private Vdorcamento vdorcamento;
	private String titdetorc;
	private String ativdetorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vditdetorc> vditdetorcs = new HashSet<Vditdetorc>(0);

	public Vddetorc() {
	}

	public Vddetorc(Vdorcamento vdorcamento, String titdetorc,
			String ativdetorc, Date dtins, Date hins, String idusuins) {
		this.vdorcamento = vdorcamento;
		this.titdetorc = titdetorc;
		this.ativdetorc = ativdetorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vddetorc(Vdorcamento vdorcamento, String titdetorc,
			String ativdetorc, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Vditdetorc> vditdetorcs) {
		this.vdorcamento = vdorcamento;
		this.titdetorc = titdetorc;
		this.ativdetorc = ativdetorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vditdetorcs = vditdetorcs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VddetorcId getId() {
		return this.id;
	}

	public void setId(VddetorcId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Vdorcamento getVdorcamento() {
		return this.vdorcamento;
	}

	public void setVdorcamento(Vdorcamento vdorcamento) {
		this.vdorcamento = vdorcamento;
	}

	@Column(name = "TITDETORC", nullable = false, length = 100)
	public String getTitdetorc() {
		return this.titdetorc;
	}

	public void setTitdetorc(String titdetorc) {
		this.titdetorc = titdetorc;
	}

	@Column(name = "ATIVDETORC", nullable = false, length = 2000)
	public String getAtivdetorc() {
		return this.ativdetorc;
	}

	public void setAtivdetorc(String ativdetorc) {
		this.ativdetorc = ativdetorc;
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

	@Column(name = "IDUSUINS", nullable = false, length = 128)
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

	@Column(name = "IDUSUALT", length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vddetorc")
	public Set<Vditdetorc> getVditdetorcs() {
		return this.vditdetorcs;
	}

	public void setVditdetorcs(Set<Vditdetorc> vditdetorcs) {
		this.vditdetorcs = vditdetorcs;
	}

}

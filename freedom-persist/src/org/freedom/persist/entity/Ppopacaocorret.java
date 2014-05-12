package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Ppopacaocorret generated by hbm2java
 */
@Entity
@Table(name = "PPOPACAOCORRET")
public class Ppopacaocorret implements java.io.Serializable {

	private PpopacaocorretId id;
	private String tpcausa;
	private String obscausa;
	private String tpacao;
	private String obsacao;
	private String status;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppitops = new HashSet(0);
	private Set ppopcqs = new HashSet(0);

	public Ppopacaocorret() {
	}

	public Ppopacaocorret(PpopacaocorretId id, String tpcausa, String status,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.tpcausa = tpcausa;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Ppopacaocorret(PpopacaocorretId id, String tpcausa, String obscausa,
			String tpacao, String obsacao, String status, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set ppitops, Set ppopcqs) {
		this.id = id;
		this.tpcausa = tpcausa;
		this.obscausa = obscausa;
		this.tpacao = tpacao;
		this.obsacao = obsacao;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppitops = ppitops;
		this.ppopcqs = ppopcqs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codop", column = @Column(name = "CODOP", nullable = false)),
			@AttributeOverride(name = "seqop", column = @Column(name = "SEQOP", nullable = false)),
			@AttributeOverride(name = "seqac", column = @Column(name = "SEQAC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpopacaocorretId getId() {
		return this.id;
	}

	public void setId(PpopacaocorretId id) {
		this.id = id;
	}

	@Column(name = "TPCAUSA", nullable = false, length = 2)
	public String getTpcausa() {
		return this.tpcausa;
	}

	public void setTpcausa(String tpcausa) {
		this.tpcausa = tpcausa;
	}

	@Column(name = "OBSCAUSA", length = 500)
	public String getObscausa() {
		return this.obscausa;
	}

	public void setObscausa(String obscausa) {
		this.obscausa = obscausa;
	}

	@Column(name = "TPACAO", length = 2)
	public String getTpacao() {
		return this.tpacao;
	}

	public void setTpacao(String tpacao) {
		this.tpacao = tpacao;
	}

	@Column(name = "OBSACAO", length = 500)
	public String getObsacao() {
		return this.obsacao;
	}

	public void setObsacao(String obsacao) {
		this.obsacao = obsacao;
	}

	@Column(name = "STATUS", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppopacaocorret")
	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppopacaocorret")
	public Set getPpopcqs() {
		return this.ppopcqs;
	}

	public void setPpopcqs(Set ppopcqs) {
		this.ppopcqs = ppopcqs;
	}
*/
}

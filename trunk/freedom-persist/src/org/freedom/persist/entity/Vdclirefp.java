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
 * Vdclirefp generated by hbm2java
 */
@Entity
@Table(name = "VDCLIREFP")
public class Vdclirefp implements java.io.Serializable {

	private VdclirefpId id;
	private Vdcliente vdcliente;
	private String nomerefp;
	private String endrefp;
	private Integer numrefp;
	private String complrefp;
	private String bairrefp;
	private String cidrefp;
	private String ufrefp;
	private String ceprefp;
	private String dddrefp;
	private String fonerefp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdclirefp() {
	}

	public Vdclirefp(VdclirefpId id, Vdcliente vdcliente, String nomerefp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomerefp = nomerefp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdclirefp(VdclirefpId id, Vdcliente vdcliente, String nomerefp,
			String endrefp, Integer numrefp, String complrefp, String bairrefp,
			String cidrefp, String ufrefp, String ceprefp, String dddrefp,
			String fonerefp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomerefp = nomerefp;
		this.endrefp = endrefp;
		this.numrefp = numrefp;
		this.complrefp = complrefp;
		this.bairrefp = bairrefp;
		this.cidrefp = cidrefp;
		this.ufrefp = ufrefp;
		this.ceprefp = ceprefp;
		this.dddrefp = dddrefp;
		this.fonerefp = fonerefp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI", nullable = false)),
			@AttributeOverride(name = "codrefp", column = @Column(name = "CODREFP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdclirefpId getId() {
		return this.id;
	}

	public void setId(VdclirefpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@Column(name = "NOMEREFP", nullable = false, length = 50)
	public String getNomerefp() {
		return this.nomerefp;
	}

	public void setNomerefp(String nomerefp) {
		this.nomerefp = nomerefp;
	}

	@Column(name = "ENDREFP", length = 50)
	public String getEndrefp() {
		return this.endrefp;
	}

	public void setEndrefp(String endrefp) {
		this.endrefp = endrefp;
	}

	@Column(name = "NUMREFP")
	public Integer getNumrefp() {
		return this.numrefp;
	}

	public void setNumrefp(Integer numrefp) {
		this.numrefp = numrefp;
	}

	@Column(name = "COMPLREFP", length = 30)
	public String getComplrefp() {
		return this.complrefp;
	}

	public void setComplrefp(String complrefp) {
		this.complrefp = complrefp;
	}

	@Column(name = "BAIRREFP", length = 30)
	public String getBairrefp() {
		return this.bairrefp;
	}

	public void setBairrefp(String bairrefp) {
		this.bairrefp = bairrefp;
	}

	@Column(name = "CIDREFP", length = 30)
	public String getCidrefp() {
		return this.cidrefp;
	}

	public void setCidrefp(String cidrefp) {
		this.cidrefp = cidrefp;
	}

	@Column(name = "UFREFP", length = 2)
	public String getUfrefp() {
		return this.ufrefp;
	}

	public void setUfrefp(String ufrefp) {
		this.ufrefp = ufrefp;
	}

	@Column(name = "CEPREFP", length = 8)
	public String getCeprefp() {
		return this.ceprefp;
	}

	public void setCeprefp(String ceprefp) {
		this.ceprefp = ceprefp;
	}

	@Column(name = "DDDREFP", length = 4)
	public String getDddrefp() {
		return this.dddrefp;
	}

	public void setDddrefp(String dddrefp) {
		this.dddrefp = dddrefp;
	}

	@Column(name = "FONEREFP", length = 12)
	public String getFonerefp() {
		return this.fonerefp;
	}

	public void setFonerefp(String fonerefp) {
		this.fonerefp = fonerefp;
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

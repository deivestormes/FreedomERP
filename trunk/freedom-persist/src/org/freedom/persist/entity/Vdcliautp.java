package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Vdcliautp generated by hbm2java
 */
@Entity
@Table(name = "VDCLIAUTP")
public class Vdcliautp implements java.io.Serializable {

	private VdcliautpId id;
	private Vdcliente vdcliente;
	private String nomeautp;
	private String endautp;
	private Integer numautp;
	private String complautp;
	private String bairautp;
	private String cidautp;
	private String ufautp;
	private String cepautp;
	private String dddautp;
	private String foneautp;
	private String rgautp;
	private String sspautp;
	private String cpfautp;
	private String funcautp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdcliautp() {
	}

	public Vdcliautp(VdcliautpId id, Vdcliente vdcliente, String nomeautp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomeautp = nomeautp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcliautp(VdcliautpId id, Vdcliente vdcliente, String nomeautp,
			String endautp, Integer numautp, String complautp, String bairautp,
			String cidautp, String ufautp, String cepautp, String dddautp,
			String foneautp, String rgautp, String sspautp, String cpfautp,
			String funcautp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomeautp = nomeautp;
		this.endautp = endautp;
		this.numautp = numautp;
		this.complautp = complautp;
		this.bairautp = bairautp;
		this.cidautp = cidautp;
		this.ufautp = ufautp;
		this.cepautp = cepautp;
		this.dddautp = dddautp;
		this.foneautp = foneautp;
		this.rgautp = rgautp;
		this.sspautp = sspautp;
		this.cpfautp = cpfautp;
		this.funcautp = funcautp;
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
			@AttributeOverride(name = "codautp", column = @Column(name = "CODAUTP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdcliautpId getId() {
		return this.id;
	}

	public void setId(VdcliautpId id) {
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

	@Column(name = "NOMEAUTP", nullable = false, length = 50)
	public String getNomeautp() {
		return this.nomeautp;
	}

	public void setNomeautp(String nomeautp) {
		this.nomeautp = nomeautp;
	}

	@Column(name = "ENDAUTP", length = 50)
	public String getEndautp() {
		return this.endautp;
	}

	public void setEndautp(String endautp) {
		this.endautp = endautp;
	}

	@Column(name = "NUMAUTP")
	public Integer getNumautp() {
		return this.numautp;
	}

	public void setNumautp(Integer numautp) {
		this.numautp = numautp;
	}

	@Column(name = "COMPLAUTP", length = 30)
	public String getComplautp() {
		return this.complautp;
	}

	public void setComplautp(String complautp) {
		this.complautp = complautp;
	}

	@Column(name = "BAIRAUTP", length = 30)
	public String getBairautp() {
		return this.bairautp;
	}

	public void setBairautp(String bairautp) {
		this.bairautp = bairautp;
	}

	@Column(name = "CIDAUTP", length = 30)
	public String getCidautp() {
		return this.cidautp;
	}

	public void setCidautp(String cidautp) {
		this.cidautp = cidautp;
	}

	@Column(name = "UFAUTP", length = 2)
	public String getUfautp() {
		return this.ufautp;
	}

	public void setUfautp(String ufautp) {
		this.ufautp = ufautp;
	}

	@Column(name = "CEPAUTP", length = 8)
	public String getCepautp() {
		return this.cepautp;
	}

	public void setCepautp(String cepautp) {
		this.cepautp = cepautp;
	}

	@Column(name = "DDDAUTP", length = 4)
	public String getDddautp() {
		return this.dddautp;
	}

	public void setDddautp(String dddautp) {
		this.dddautp = dddautp;
	}

	@Column(name = "FONEAUTP", length = 12)
	public String getFoneautp() {
		return this.foneautp;
	}

	public void setFoneautp(String foneautp) {
		this.foneautp = foneautp;
	}

	@Column(name = "RGAUTP", length = 13)
	public String getRgautp() {
		return this.rgautp;
	}

	public void setRgautp(String rgautp) {
		this.rgautp = rgautp;
	}

	@Column(name = "SSPAUTP", length = 10)
	public String getSspautp() {
		return this.sspautp;
	}

	public void setSspautp(String sspautp) {
		this.sspautp = sspautp;
	}

	@Column(name = "CPFAUTP", length = 11)
	public String getCpfautp() {
		return this.cpfautp;
	}

	public void setCpfautp(String cpfautp) {
		this.cpfautp = cpfautp;
	}

	@Column(name = "FUNCAUTP", length = 30)
	public String getFuncautp() {
		return this.funcautp;
	}

	public void setFuncautp(String funcautp) {
		this.funcautp = funcautp;
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

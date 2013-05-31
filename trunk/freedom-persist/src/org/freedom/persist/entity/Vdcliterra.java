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
 * Vdcliterra generated by hbm2java
 */
@Entity
@Table(name = "VDCLITERRA")
public class Vdcliterra implements java.io.Serializable {

	private VdcliterraId id;
	private Vdcliente vdcliente;
	private String endterra;
	private Integer numterra;
	private String bairterra;
	private String cidterra;
	private String ufterra;
	private String areaterra;
	private Integer qtdcafeterra;
	private Integer qtdgadoterra;
	private String obsterra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdcliterra() {
	}

	public Vdcliterra(VdcliterraId id, Vdcliente vdcliente, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcliterra(VdcliterraId id, Vdcliente vdcliente, String endterra,
			Integer numterra, String bairterra, String cidterra,
			String ufterra, String areaterra, Integer qtdcafeterra,
			Integer qtdgadoterra, String obsterra, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.endterra = endterra;
		this.numterra = numterra;
		this.bairterra = bairterra;
		this.cidterra = cidterra;
		this.ufterra = ufterra;
		this.areaterra = areaterra;
		this.qtdcafeterra = qtdcafeterra;
		this.qtdgadoterra = qtdgadoterra;
		this.obsterra = obsterra;
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
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codterra", column = @Column(name = "CODTERRA", nullable = false)) })
	public VdcliterraId getId() {
		return this.id;
	}

	public void setId(VdcliterraId id) {
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

	@Column(name = "ENDTERRA", length = 50)
	public String getEndterra() {
		return this.endterra;
	}

	public void setEndterra(String endterra) {
		this.endterra = endterra;
	}

	@Column(name = "NUMTERRA")
	public Integer getNumterra() {
		return this.numterra;
	}

	public void setNumterra(Integer numterra) {
		this.numterra = numterra;
	}

	@Column(name = "BAIRTERRA", length = 30)
	public String getBairterra() {
		return this.bairterra;
	}

	public void setBairterra(String bairterra) {
		this.bairterra = bairterra;
	}

	@Column(name = "CIDTERRA", length = 30)
	public String getCidterra() {
		return this.cidterra;
	}

	public void setCidterra(String cidterra) {
		this.cidterra = cidterra;
	}

	@Column(name = "UFTERRA", length = 2)
	public String getUfterra() {
		return this.ufterra;
	}

	public void setUfterra(String ufterra) {
		this.ufterra = ufterra;
	}

	@Column(name = "AREATERRA", length = 30)
	public String getAreaterra() {
		return this.areaterra;
	}

	public void setAreaterra(String areaterra) {
		this.areaterra = areaterra;
	}

	@Column(name = "QTDCAFETERRA")
	public Integer getQtdcafeterra() {
		return this.qtdcafeterra;
	}

	public void setQtdcafeterra(Integer qtdcafeterra) {
		this.qtdcafeterra = qtdcafeterra;
	}

	@Column(name = "QTDGADOTERRA")
	public Integer getQtdgadoterra() {
		return this.qtdgadoterra;
	}

	public void setQtdgadoterra(Integer qtdgadoterra) {
		this.qtdgadoterra = qtdgadoterra;
	}

	@Column(name = "OBSTERRA", length = 500)
	public String getObsterra() {
		return this.obsterra;
	}

	public void setObsterra(String obsterra) {
		this.obsterra = obsterra;
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

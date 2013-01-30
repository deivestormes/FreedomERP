package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vdlogsitcontr generated by hbm2java
 */
@Entity
@Table(name = "VDLOGSITCONTR")
public class Vdlogsitcontr implements java.io.Serializable {

	private VdlogsitcontrId id;
	private String sitcontr;
	private String descsitcontr;
	private Date dtprevfin;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdlogsitcontr() {
	}

	public Vdlogsitcontr(VdlogsitcontrId id, String sitcontr, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sitcontr = sitcontr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdlogsitcontr(VdlogsitcontrId id, String sitcontr,
			String descsitcontr, Date dtprevfin, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sitcontr = sitcontr;
		this.descsitcontr = descsitcontr;
		this.dtprevfin = dtprevfin;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR", nullable = false)),
			@AttributeOverride(name = "seqlog", column = @Column(name = "SEQLOG", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdlogsitcontrId getId() {
		return this.id;
	}

	public void setId(VdlogsitcontrId id) {
		this.id = id;
	}

	@Column(name = "SITCONTR", nullable = false, length = 2)
	public String getSitcontr() {
		return this.sitcontr;
	}

	public void setSitcontr(String sitcontr) {
		this.sitcontr = sitcontr;
	}

	@Column(name = "DESCSITCONTR", length = 2000)
	public String getDescsitcontr() {
		return this.descsitcontr;
	}

	public void setDescsitcontr(String descsitcontr) {
		this.descsitcontr = descsitcontr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVFIN", length = 10)
	public Date getDtprevfin() {
		return this.dtprevfin;
	}

	public void setDtprevfin(Date dtprevfin) {
		this.dtprevfin = dtprevfin;
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

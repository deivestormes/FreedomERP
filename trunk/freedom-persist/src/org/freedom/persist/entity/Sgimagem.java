package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Sgimagem generated by hbm2java
 */
@Entity
@Table(name = "SGIMAGEM")
public class Sgimagem implements java.io.Serializable {

	private SgimagemId id;
	private Sgcatimg sgcatimg;
	private String descimg;
	private byte[] binimg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sgprefere1> sgprefere1s = new HashSet<Sgprefere1>(0);

	public Sgimagem() {
	}

	public Sgimagem(SgimagemId id, Sgcatimg sgcatimg, String descimg,
			byte[] binimg, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgcatimg = sgcatimg;
		this.descimg = descimg;
		this.binimg = binimg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgimagem(SgimagemId id, Sgcatimg sgcatimg, String descimg,
			byte[] binimg, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set<Sgprefere1> sgprefere1s) {
		this.id = id;
		this.sgcatimg = sgcatimg;
		this.descimg = descimg;
		this.binimg = binimg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere1s = sgprefere1s;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codimg", column = @Column(name = "CODIMG", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgimagemId getId() {
		return this.id;
	}

	public void setId(SgimagemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCATIMG", referencedColumnName = "CODCATIMG", nullable = false),
			@JoinColumn(name = "CODFILIALCI", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCI", referencedColumnName = "CODEMP", nullable = false) })
	public Sgcatimg getSgcatimg() {
		return this.sgcatimg;
	}

	public void setSgcatimg(Sgcatimg sgcatimg) {
		this.sgcatimg = sgcatimg;
	}

	@Column(name = "DESCIMG", nullable = false, length = 100)
	public String getDescimg() {
		return this.descimg;
	}

	public void setDescimg(String descimg) {
		this.descimg = descimg;
	}

	@Column(name = "BINIMG", nullable = false)
	public byte[] getBinimg() {
		return this.binimg;
	}

	public void setBinimg(byte[] binimg) {
		this.binimg = binimg;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgimagem")
	public Set<Sgprefere1> getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set<Sgprefere1> sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

}

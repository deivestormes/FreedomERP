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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgimpressora generated by hbm2java
 */
@Entity
@Table(name = "SGIMPRESSORA")
public class Sgimpressora implements java.io.Serializable {

	private SgimpressoraId id;
	private Sgfilial sgfilial;
	private String descimp;
	private String tipoimp;
	private Integer linpagimp;
	private String nserieimp;
	private String portawinimp;
	private String portalinimp;
	private Integer codemppl;
	private Short codfilialpl;
	private String codpapel;
	private String destimp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set pvcaixaimps = new HashSet(0);
	private Set sgestacaoimps = new HashSet(0);

	public Sgimpressora() {
	}

	public Sgimpressora(SgimpressoraId id, Sgfilial sgfilial, String descimp,
			String tipoimp, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descimp = descimp;
		this.tipoimp = tipoimp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgimpressora(SgimpressoraId id, Sgfilial sgfilial, String descimp,
			String tipoimp, Integer linpagimp, String nserieimp,
			String portawinimp, String portalinimp, Integer codemppl,
			Short codfilialpl, String codpapel, String destimp, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set pvcaixaimps, Set sgestacaoimps) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descimp = descimp;
		this.tipoimp = tipoimp;
		this.linpagimp = linpagimp;
		this.nserieimp = nserieimp;
		this.portawinimp = portawinimp;
		this.portalinimp = portalinimp;
		this.codemppl = codemppl;
		this.codfilialpl = codfilialpl;
		this.codpapel = codpapel;
		this.destimp = destimp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.pvcaixaimps = pvcaixaimps;
		this.sgestacaoimps = sgestacaoimps;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codimp", column = @Column(name = "CODIMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgimpressoraId getId() {
		return this.id;
	}

	public void setId(SgimpressoraId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCIMP", nullable = false, length = 40)
	public String getDescimp() {
		return this.descimp;
	}

	public void setDescimp(String descimp) {
		this.descimp = descimp;
	}

	@Column(name = "TIPOIMP", nullable = false, length = 2)
	public String getTipoimp() {
		return this.tipoimp;
	}

	public void setTipoimp(String tipoimp) {
		this.tipoimp = tipoimp;
	}

	@Column(name = "LINPAGIMP")
	public Integer getLinpagimp() {
		return this.linpagimp;
	}

	public void setLinpagimp(Integer linpagimp) {
		this.linpagimp = linpagimp;
	}

	@Column(name = "NSERIEIMP", length = 20)
	public String getNserieimp() {
		return this.nserieimp;
	}

	public void setNserieimp(String nserieimp) {
		this.nserieimp = nserieimp;
	}

	@Column(name = "PORTAWINIMP", length = 4)
	public String getPortawinimp() {
		return this.portawinimp;
	}

	public void setPortawinimp(String portawinimp) {
		this.portawinimp = portawinimp;
	}

	@Column(name = "PORTALINIMP", length = 60)
	public String getPortalinimp() {
		return this.portalinimp;
	}

	public void setPortalinimp(String portalinimp) {
		this.portalinimp = portalinimp;
	}

	@Column(name = "CODEMPPL")
	public Integer getCodemppl() {
		return this.codemppl;
	}

	public void setCodemppl(Integer codemppl) {
		this.codemppl = codemppl;
	}

	@Column(name = "CODFILIALPL")
	public Short getCodfilialpl() {
		return this.codfilialpl;
	}

	public void setCodfilialpl(Short codfilialpl) {
		this.codfilialpl = codfilialpl;
	}

	@Column(name = "CODPAPEL", length = 10)
	public String getCodpapel() {
		return this.codpapel;
	}

	public void setCodpapel(String codpapel) {
		this.codpapel = codpapel;
	}

	@Column(name = "DESTIMP", length = 2)
	public String getDestimp() {
		return this.destimp;
	}

	public void setDestimp(String destimp) {
		this.destimp = destimp;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgimpressora")
	public Set getPvcaixaimps() {
		return this.pvcaixaimps;
	}

	public void setPvcaixaimps(Set pvcaixaimps) {
		this.pvcaixaimps = pvcaixaimps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgimpressora")
	public Set getSgestacaoimps() {
		return this.sgestacaoimps;
	}

	public void setSgestacaoimps(Set sgestacaoimps) {
		this.sgestacaoimps = sgestacaoimps;
	}
*/
}

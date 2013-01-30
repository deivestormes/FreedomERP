package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Rhcandidato generated by hbm2java
 */
@Entity
@Table(name = "RHCANDIDATO")
public class Rhcandidato implements java.io.Serializable {

	private RhcandidatoId id;
	private Sgfilial sgfilial;
	private Sgestcivil sgestcivil;
	private String nomecand;
	private String endcand;
	private Integer numcand;
	private String ufcand;
	private String cidcand;
	private String baircand;
	private String cepcand;
	private String fonecand;
	private String dddcand;
	private String celcand;
	private Date dtnasccand;
	private char sexocand;
	private String pispasepcand;
	private String ctpscand;
	private String cpfcand;
	private String rgcand;
	private String sspcand;
	private String titeleitcand;
	private String emailcand;
	private String outrosempregos;
	private BigDecimal pretensaosal;
	private String stcand;
	private Date dtultst;
	private String obscand;
	private Short nrofilhos;
	private char isenctransp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Rhcandidatostatus> rhcandidatostatuses = new HashSet<Rhcandidatostatus>(
			0);
	private Set<Rhcandidatofunc> rhcandidatofuncs = new HashSet<Rhcandidatofunc>(
			0);
	private Set<Rhcandidatocurso> rhcandidatocursos = new HashSet<Rhcandidatocurso>(
			0);
	private Set<Rhvagacandidato> rhvagacandidatos = new HashSet<Rhvagacandidato>(
			0);
	private Set<Rhcandidatocarac> rhcandidatocaracs = new HashSet<Rhcandidatocarac>(
			0);

	public Rhcandidato() {
	}

	public Rhcandidato(RhcandidatoId id, Sgfilial sgfilial,
			Sgestcivil sgestcivil, String nomecand, char sexocand,
			String stcand, Date dtultst, char isenctransp, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgestcivil = sgestcivil;
		this.nomecand = nomecand;
		this.sexocand = sexocand;
		this.stcand = stcand;
		this.dtultst = dtultst;
		this.isenctransp = isenctransp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcandidato(RhcandidatoId id, Sgfilial sgfilial,
			Sgestcivil sgestcivil, String nomecand, String endcand,
			Integer numcand, String ufcand, String cidcand, String baircand,
			String cepcand, String fonecand, String dddcand, String celcand,
			Date dtnasccand, char sexocand, String pispasepcand,
			String ctpscand, String cpfcand, String rgcand, String sspcand,
			String titeleitcand, String emailcand, String outrosempregos,
			BigDecimal pretensaosal, String stcand, Date dtultst,
			String obscand, Short nrofilhos, char isenctransp, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Rhcandidatostatus> rhcandidatostatuses,
			Set<Rhcandidatofunc> rhcandidatofuncs,
			Set<Rhcandidatocurso> rhcandidatocursos,
			Set<Rhvagacandidato> rhvagacandidatos,
			Set<Rhcandidatocarac> rhcandidatocaracs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.sgestcivil = sgestcivil;
		this.nomecand = nomecand;
		this.endcand = endcand;
		this.numcand = numcand;
		this.ufcand = ufcand;
		this.cidcand = cidcand;
		this.baircand = baircand;
		this.cepcand = cepcand;
		this.fonecand = fonecand;
		this.dddcand = dddcand;
		this.celcand = celcand;
		this.dtnasccand = dtnasccand;
		this.sexocand = sexocand;
		this.pispasepcand = pispasepcand;
		this.ctpscand = ctpscand;
		this.cpfcand = cpfcand;
		this.rgcand = rgcand;
		this.sspcand = sspcand;
		this.titeleitcand = titeleitcand;
		this.emailcand = emailcand;
		this.outrosempregos = outrosempregos;
		this.pretensaosal = pretensaosal;
		this.stcand = stcand;
		this.dtultst = dtultst;
		this.obscand = obscand;
		this.nrofilhos = nrofilhos;
		this.isenctransp = isenctransp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhcandidatostatuses = rhcandidatostatuses;
		this.rhcandidatofuncs = rhcandidatofuncs;
		this.rhcandidatocursos = rhcandidatocursos;
		this.rhvagacandidatos = rhvagacandidatos;
		this.rhcandidatocaracs = rhcandidatocaracs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcand", column = @Column(name = "CODCAND", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public RhcandidatoId getId() {
		return this.id;
	}

	public void setId(RhcandidatoId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODESTCIVIL", referencedColumnName = "CODESTCIVIL", nullable = false),
			@JoinColumn(name = "CODFILIALES", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPES", referencedColumnName = "CODEMP", nullable = false) })
	public Sgestcivil getSgestcivil() {
		return this.sgestcivil;
	}

	public void setSgestcivil(Sgestcivil sgestcivil) {
		this.sgestcivil = sgestcivil;
	}

	@Column(name = "NOMECAND", nullable = false, length = 50)
	public String getNomecand() {
		return this.nomecand;
	}

	public void setNomecand(String nomecand) {
		this.nomecand = nomecand;
	}

	@Column(name = "ENDCAND", length = 50)
	public String getEndcand() {
		return this.endcand;
	}

	public void setEndcand(String endcand) {
		this.endcand = endcand;
	}

	@Column(name = "NUMCAND")
	public Integer getNumcand() {
		return this.numcand;
	}

	public void setNumcand(Integer numcand) {
		this.numcand = numcand;
	}

	@Column(name = "UFCAND", length = 2)
	public String getUfcand() {
		return this.ufcand;
	}

	public void setUfcand(String ufcand) {
		this.ufcand = ufcand;
	}

	@Column(name = "CIDCAND", length = 50)
	public String getCidcand() {
		return this.cidcand;
	}

	public void setCidcand(String cidcand) {
		this.cidcand = cidcand;
	}

	@Column(name = "BAIRCAND", length = 30)
	public String getBaircand() {
		return this.baircand;
	}

	public void setBaircand(String baircand) {
		this.baircand = baircand;
	}

	@Column(name = "CEPCAND", length = 8)
	public String getCepcand() {
		return this.cepcand;
	}

	public void setCepcand(String cepcand) {
		this.cepcand = cepcand;
	}

	@Column(name = "FONECAND", length = 12)
	public String getFonecand() {
		return this.fonecand;
	}

	public void setFonecand(String fonecand) {
		this.fonecand = fonecand;
	}

	@Column(name = "DDDCAND", length = 4)
	public String getDddcand() {
		return this.dddcand;
	}

	public void setDddcand(String dddcand) {
		this.dddcand = dddcand;
	}

	@Column(name = "CELCAND", length = 8)
	public String getCelcand() {
		return this.celcand;
	}

	public void setCelcand(String celcand) {
		this.celcand = celcand;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTNASCCAND", length = 10)
	public Date getDtnasccand() {
		return this.dtnasccand;
	}

	public void setDtnasccand(Date dtnasccand) {
		this.dtnasccand = dtnasccand;
	}

	@Column(name = "SEXOCAND", nullable = false, length = 1)
	public char getSexocand() {
		return this.sexocand;
	}

	public void setSexocand(char sexocand) {
		this.sexocand = sexocand;
	}

	@Column(name = "PISPASEPCAND", length = 20)
	public String getPispasepcand() {
		return this.pispasepcand;
	}

	public void setPispasepcand(String pispasepcand) {
		this.pispasepcand = pispasepcand;
	}

	@Column(name = "CTPSCAND", length = 20)
	public String getCtpscand() {
		return this.ctpscand;
	}

	public void setCtpscand(String ctpscand) {
		this.ctpscand = ctpscand;
	}

	@Column(name = "CPFCAND", length = 11)
	public String getCpfcand() {
		return this.cpfcand;
	}

	public void setCpfcand(String cpfcand) {
		this.cpfcand = cpfcand;
	}

	@Column(name = "RGCAND", length = 13)
	public String getRgcand() {
		return this.rgcand;
	}

	public void setRgcand(String rgcand) {
		this.rgcand = rgcand;
	}

	@Column(name = "SSPCAND", length = 10)
	public String getSspcand() {
		return this.sspcand;
	}

	public void setSspcand(String sspcand) {
		this.sspcand = sspcand;
	}

	@Column(name = "TITELEITCAND", length = 15)
	public String getTiteleitcand() {
		return this.titeleitcand;
	}

	public void setTiteleitcand(String titeleitcand) {
		this.titeleitcand = titeleitcand;
	}

	@Column(name = "EMAILCAND", length = 50)
	public String getEmailcand() {
		return this.emailcand;
	}

	public void setEmailcand(String emailcand) {
		this.emailcand = emailcand;
	}

	@Column(name = "OUTROSEMPREGOS", length = 1000)
	public String getOutrosempregos() {
		return this.outrosempregos;
	}

	public void setOutrosempregos(String outrosempregos) {
		this.outrosempregos = outrosempregos;
	}

	@Column(name = "PRETENSAOSAL", precision = 15, scale = 5)
	public BigDecimal getPretensaosal() {
		return this.pretensaosal;
	}

	public void setPretensaosal(BigDecimal pretensaosal) {
		this.pretensaosal = pretensaosal;
	}

	@Column(name = "STCAND", nullable = false, length = 2)
	public String getStcand() {
		return this.stcand;
	}

	public void setStcand(String stcand) {
		this.stcand = stcand;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTULTST", nullable = false, length = 10)
	public Date getDtultst() {
		return this.dtultst;
	}

	public void setDtultst(Date dtultst) {
		this.dtultst = dtultst;
	}

	@Column(name = "OBSCAND", length = 1000)
	public String getObscand() {
		return this.obscand;
	}

	public void setObscand(String obscand) {
		this.obscand = obscand;
	}

	@Column(name = "NROFILHOS")
	public Short getNrofilhos() {
		return this.nrofilhos;
	}

	public void setNrofilhos(Short nrofilhos) {
		this.nrofilhos = nrofilhos;
	}

	@Column(name = "ISENCTRANSP", nullable = false, length = 1)
	public char getIsenctransp() {
		return this.isenctransp;
	}

	public void setIsenctransp(char isenctransp) {
		this.isenctransp = isenctransp;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcandidato")
	public Set<Rhcandidatostatus> getRhcandidatostatuses() {
		return this.rhcandidatostatuses;
	}

	public void setRhcandidatostatuses(
			Set<Rhcandidatostatus> rhcandidatostatuses) {
		this.rhcandidatostatuses = rhcandidatostatuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcandidato")
	public Set<Rhcandidatofunc> getRhcandidatofuncs() {
		return this.rhcandidatofuncs;
	}

	public void setRhcandidatofuncs(Set<Rhcandidatofunc> rhcandidatofuncs) {
		this.rhcandidatofuncs = rhcandidatofuncs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcandidato")
	public Set<Rhcandidatocurso> getRhcandidatocursos() {
		return this.rhcandidatocursos;
	}

	public void setRhcandidatocursos(Set<Rhcandidatocurso> rhcandidatocursos) {
		this.rhcandidatocursos = rhcandidatocursos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcandidato")
	public Set<Rhvagacandidato> getRhvagacandidatos() {
		return this.rhvagacandidatos;
	}

	public void setRhvagacandidatos(Set<Rhvagacandidato> rhvagacandidatos) {
		this.rhvagacandidatos = rhvagacandidatos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcandidato")
	public Set<Rhcandidatocarac> getRhcandidatocaracs() {
		return this.rhcandidatocaracs;
	}

	public void setRhcandidatocaracs(Set<Rhcandidatocarac> rhcandidatocaracs) {
		this.rhcandidatocaracs = rhcandidatocaracs;
	}

}

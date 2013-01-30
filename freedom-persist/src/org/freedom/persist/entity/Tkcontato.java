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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tkcontato generated by hbm2java
 */
@Entity
@Table(name = "TKCONTATO")
public class Tkcontato implements java.io.Serializable {

	private TkcontatoId id;
	private Tktipocont tktipocont;
	private Tksetorcto tksetorcto;
	private Vdtipocli vdtipocli;
	private Vdvendedor vdvendedor;
	private Vdsetor vdsetor;
	private Tkorigcont tkorigcont;
	private Tktipoimp tktipoimp;
	private Sgmunicipio sgmunicipio;
	private String razcto;
	private String nomecto;
	private Date datacto;
	private char pessoacto;
	private char ativocto;
	private String cnpjcto;
	private String insccto;
	private String cpfcto;
	private String rgcto;
	private String endcto;
	private Integer numcto;
	private String complcto;
	private String edificiocto;
	private String baircto;
	private String cidcto;
	private String ufcto;
	private String cepcto;
	private String dddcto;
	private String fonecto;
	private String faxcto;
	private String emailcto;
	private String contcto;
	private String cargocontcto;
	private String obscto;
	private char removcto;
	private Integer numempcto;
	private String celcto;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Crfichaaval> crfichaavals = new HashSet<Crfichaaval>(0);
	private Set<Tkhistorico> tkhistoricos = new HashSet<Tkhistorico>(0);
	private Set<Tkcontcli> tkcontclis = new HashSet<Tkcontcli>(0);
	private Set<Tksitcamp> tksitcamps = new HashSet<Tksitcamp>(0);
	private Set<Tkcontpessoa> tkcontpessoas = new HashSet<Tkcontpessoa>(0);
	private Set<Tkctogrpint> tkctogrpints = new HashSet<Tkctogrpint>(0);
	private Set<Tkctoativ> tkctoativs = new HashSet<Tkctoativ>(0);
	private Set<Tkcampanhacto> tkcampanhactos = new HashSet<Tkcampanhacto>(0);

	public Tkcontato() {
	}

	public Tkcontato(TkcontatoId id, Vdsetor vdsetor, Tkorigcont tkorigcont,
			String razcto, String nomecto, Date datacto, char pessoacto,
			char ativocto, char removcto, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdsetor = vdsetor;
		this.tkorigcont = tkorigcont;
		this.razcto = razcto;
		this.nomecto = nomecto;
		this.datacto = datacto;
		this.pessoacto = pessoacto;
		this.ativocto = ativocto;
		this.removcto = removcto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcontato(TkcontatoId id, Tktipocont tktipocont,
			Tksetorcto tksetorcto, Vdtipocli vdtipocli, Vdvendedor vdvendedor,
			Vdsetor vdsetor, Tkorigcont tkorigcont, Tktipoimp tktipoimp,
			Sgmunicipio sgmunicipio, String razcto, String nomecto,
			Date datacto, char pessoacto, char ativocto, String cnpjcto,
			String insccto, String cpfcto, String rgcto, String endcto,
			Integer numcto, String complcto, String edificiocto,
			String baircto, String cidcto, String ufcto, String cepcto,
			String dddcto, String fonecto, String faxcto, String emailcto,
			String contcto, String cargocontcto, String obscto, char removcto,
			Integer numempcto, String celcto, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Crfichaaval> crfichaavals, Set<Tkhistorico> tkhistoricos,
			Set<Tkcontcli> tkcontclis, Set<Tksitcamp> tksitcamps,
			Set<Tkcontpessoa> tkcontpessoas, Set<Tkctogrpint> tkctogrpints,
			Set<Tkctoativ> tkctoativs, Set<Tkcampanhacto> tkcampanhactos) {
		this.id = id;
		this.tktipocont = tktipocont;
		this.tksetorcto = tksetorcto;
		this.vdtipocli = vdtipocli;
		this.vdvendedor = vdvendedor;
		this.vdsetor = vdsetor;
		this.tkorigcont = tkorigcont;
		this.tktipoimp = tktipoimp;
		this.sgmunicipio = sgmunicipio;
		this.razcto = razcto;
		this.nomecto = nomecto;
		this.datacto = datacto;
		this.pessoacto = pessoacto;
		this.ativocto = ativocto;
		this.cnpjcto = cnpjcto;
		this.insccto = insccto;
		this.cpfcto = cpfcto;
		this.rgcto = rgcto;
		this.endcto = endcto;
		this.numcto = numcto;
		this.complcto = complcto;
		this.edificiocto = edificiocto;
		this.baircto = baircto;
		this.cidcto = cidcto;
		this.ufcto = ufcto;
		this.cepcto = cepcto;
		this.dddcto = dddcto;
		this.fonecto = fonecto;
		this.faxcto = faxcto;
		this.emailcto = emailcto;
		this.contcto = contcto;
		this.cargocontcto = cargocontcto;
		this.obscto = obscto;
		this.removcto = removcto;
		this.numempcto = numempcto;
		this.celcto = celcto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crfichaavals = crfichaavals;
		this.tkhistoricos = tkhistoricos;
		this.tkcontclis = tkcontclis;
		this.tksitcamps = tksitcamps;
		this.tkcontpessoas = tkcontpessoas;
		this.tkctogrpints = tkctogrpints;
		this.tkctoativs = tkctoativs;
		this.tkcampanhactos = tkcampanhactos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcto", column = @Column(name = "CODCTO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TkcontatoId getId() {
		return this.id;
	}

	public void setId(TkcontatoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCONT", referencedColumnName = "CODTIPOCONT"),
			@JoinColumn(name = "CODFILIALTO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTO", referencedColumnName = "CODEMP") })
	public Tktipocont getTktipocont() {
		return this.tktipocont;
	}

	public void setTktipocont(Tktipocont tktipocont) {
		this.tktipocont = tktipocont;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSETORCTO", referencedColumnName = "CODSETORCTO"),
			@JoinColumn(name = "CODFILIALSO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPSO", referencedColumnName = "CODEMP") })
	public Tksetorcto getTksetorcto() {
		return this.tksetorcto;
	}

	public void setTksetorcto(Tksetorcto tksetorcto) {
		this.tksetorcto = tksetorcto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCLI", referencedColumnName = "CODTIPOCLI"),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP") })
	public Vdtipocli getVdtipocli() {
		return this.vdtipocli;
	}

	public void setVdtipocli(Vdtipocli vdtipocli) {
		this.vdtipocli = vdtipocli;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSETOR", referencedColumnName = "CODSETOR", nullable = false),
			@JoinColumn(name = "CODFILIALSR", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPSR", referencedColumnName = "CODEMP", nullable = false) })
	public Vdsetor getVdsetor() {
		return this.vdsetor;
	}

	public void setVdsetor(Vdsetor vdsetor) {
		this.vdsetor = vdsetor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODORIGCONT", referencedColumnName = "CODORIGCONT", nullable = false),
			@JoinColumn(name = "CODFILIALOC", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPOC", referencedColumnName = "CODEMP", nullable = false) })
	public Tkorigcont getTkorigcont() {
		return this.tkorigcont;
	}

	public void setTkorigcont(Tkorigcont tkorigcont) {
		this.tkorigcont = tkorigcont;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPIMP", referencedColumnName = "CODTPIMP"),
			@JoinColumn(name = "CODFILIALTI", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTI", referencedColumnName = "CODEMP") })
	public Tktipoimp getTktipoimp() {
		return this.tktipoimp;
	}

	public void setTktipoimp(Tktipoimp tktipoimp) {
		this.tktipoimp = tktipoimp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMUNIC", referencedColumnName = "CODMUNIC"),
			@JoinColumn(name = "SIGLAUF", referencedColumnName = "SIGLAUF"),
			@JoinColumn(name = "CODPAIS", referencedColumnName = "CODPAIS") })
	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	@Column(name = "RAZCTO", nullable = false, length = 60)
	public String getRazcto() {
		return this.razcto;
	}

	public void setRazcto(String razcto) {
		this.razcto = razcto;
	}

	@Column(name = "NOMECTO", nullable = false, length = 50)
	public String getNomecto() {
		return this.nomecto;
	}

	public void setNomecto(String nomecto) {
		this.nomecto = nomecto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATACTO", nullable = false, length = 10)
	public Date getDatacto() {
		return this.datacto;
	}

	public void setDatacto(Date datacto) {
		this.datacto = datacto;
	}

	@Column(name = "PESSOACTO", nullable = false, length = 1)
	public char getPessoacto() {
		return this.pessoacto;
	}

	public void setPessoacto(char pessoacto) {
		this.pessoacto = pessoacto;
	}

	@Column(name = "ATIVOCTO", nullable = false, length = 1)
	public char getAtivocto() {
		return this.ativocto;
	}

	public void setAtivocto(char ativocto) {
		this.ativocto = ativocto;
	}

	@Column(name = "CNPJCTO", length = 14)
	public String getCnpjcto() {
		return this.cnpjcto;
	}

	public void setCnpjcto(String cnpjcto) {
		this.cnpjcto = cnpjcto;
	}

	@Column(name = "INSCCTO", length = 20)
	public String getInsccto() {
		return this.insccto;
	}

	public void setInsccto(String insccto) {
		this.insccto = insccto;
	}

	@Column(name = "CPFCTO", length = 11)
	public String getCpfcto() {
		return this.cpfcto;
	}

	public void setCpfcto(String cpfcto) {
		this.cpfcto = cpfcto;
	}

	@Column(name = "RGCTO", length = 13)
	public String getRgcto() {
		return this.rgcto;
	}

	public void setRgcto(String rgcto) {
		this.rgcto = rgcto;
	}

	@Column(name = "ENDCTO", length = 50)
	public String getEndcto() {
		return this.endcto;
	}

	public void setEndcto(String endcto) {
		this.endcto = endcto;
	}

	@Column(name = "NUMCTO")
	public Integer getNumcto() {
		return this.numcto;
	}

	public void setNumcto(Integer numcto) {
		this.numcto = numcto;
	}

	@Column(name = "COMPLCTO", length = 20)
	public String getComplcto() {
		return this.complcto;
	}

	public void setComplcto(String complcto) {
		this.complcto = complcto;
	}

	@Column(name = "EDIFICIOCTO", length = 30)
	public String getEdificiocto() {
		return this.edificiocto;
	}

	public void setEdificiocto(String edificiocto) {
		this.edificiocto = edificiocto;
	}

	@Column(name = "BAIRCTO", length = 30)
	public String getBaircto() {
		return this.baircto;
	}

	public void setBaircto(String baircto) {
		this.baircto = baircto;
	}

	@Column(name = "CIDCTO", length = 30)
	public String getCidcto() {
		return this.cidcto;
	}

	public void setCidcto(String cidcto) {
		this.cidcto = cidcto;
	}

	@Column(name = "UFCTO", length = 2)
	public String getUfcto() {
		return this.ufcto;
	}

	public void setUfcto(String ufcto) {
		this.ufcto = ufcto;
	}

	@Column(name = "CEPCTO", length = 8)
	public String getCepcto() {
		return this.cepcto;
	}

	public void setCepcto(String cepcto) {
		this.cepcto = cepcto;
	}

	@Column(name = "DDDCTO", length = 4)
	public String getDddcto() {
		return this.dddcto;
	}

	public void setDddcto(String dddcto) {
		this.dddcto = dddcto;
	}

	@Column(name = "FONECTO", length = 12)
	public String getFonecto() {
		return this.fonecto;
	}

	public void setFonecto(String fonecto) {
		this.fonecto = fonecto;
	}

	@Column(name = "FAXCTO", length = 8)
	public String getFaxcto() {
		return this.faxcto;
	}

	public void setFaxcto(String faxcto) {
		this.faxcto = faxcto;
	}

	@Column(name = "EMAILCTO", length = 50)
	public String getEmailcto() {
		return this.emailcto;
	}

	public void setEmailcto(String emailcto) {
		this.emailcto = emailcto;
	}

	@Column(name = "CONTCTO", length = 40)
	public String getContcto() {
		return this.contcto;
	}

	public void setContcto(String contcto) {
		this.contcto = contcto;
	}

	@Column(name = "CARGOCONTCTO", length = 30)
	public String getCargocontcto() {
		return this.cargocontcto;
	}

	public void setCargocontcto(String cargocontcto) {
		this.cargocontcto = cargocontcto;
	}

	@Column(name = "OBSCTO", length = 10000)
	public String getObscto() {
		return this.obscto;
	}

	public void setObscto(String obscto) {
		this.obscto = obscto;
	}

	@Column(name = "REMOVCTO", nullable = false, length = 1)
	public char getRemovcto() {
		return this.removcto;
	}

	public void setRemovcto(char removcto) {
		this.removcto = removcto;
	}

	@Column(name = "NUMEMPCTO")
	public Integer getNumempcto() {
		return this.numempcto;
	}

	public void setNumempcto(Integer numempcto) {
		this.numempcto = numempcto;
	}

	@Column(name = "CELCTO", length = 12)
	public String getCelcto() {
		return this.celcto;
	}

	public void setCelcto(String celcto) {
		this.celcto = celcto;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Crfichaaval> getCrfichaavals() {
		return this.crfichaavals;
	}

	public void setCrfichaavals(Set<Crfichaaval> crfichaavals) {
		this.crfichaavals = crfichaavals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tkhistorico> getTkhistoricos() {
		return this.tkhistoricos;
	}

	public void setTkhistoricos(Set<Tkhistorico> tkhistoricos) {
		this.tkhistoricos = tkhistoricos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tkcontcli> getTkcontclis() {
		return this.tkcontclis;
	}

	public void setTkcontclis(Set<Tkcontcli> tkcontclis) {
		this.tkcontclis = tkcontclis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tksitcamp> getTksitcamps() {
		return this.tksitcamps;
	}

	public void setTksitcamps(Set<Tksitcamp> tksitcamps) {
		this.tksitcamps = tksitcamps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tkcontpessoa> getTkcontpessoas() {
		return this.tkcontpessoas;
	}

	public void setTkcontpessoas(Set<Tkcontpessoa> tkcontpessoas) {
		this.tkcontpessoas = tkcontpessoas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tkctogrpint> getTkctogrpints() {
		return this.tkctogrpints;
	}

	public void setTkctogrpints(Set<Tkctogrpint> tkctogrpints) {
		this.tkctogrpints = tkctogrpints;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tkctoativ> getTkctoativs() {
		return this.tkctoativs;
	}

	public void setTkctoativs(Set<Tkctoativ> tkctoativs) {
		this.tkctoativs = tkctoativs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcontato")
	public Set<Tkcampanhacto> getTkcampanhactos() {
		return this.tkcampanhactos;
	}

	public void setTkcampanhactos(Set<Tkcampanhacto> tkcampanhactos) {
		this.tkcampanhactos = tkcampanhactos;
	}

}

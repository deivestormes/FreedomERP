package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tkcontato generated by hbm2java
 */
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
	private Set crfichaavals = new HashSet(0);
	private Set tkhistoricos = new HashSet(0);
	private Set tkcontclis = new HashSet(0);
	private Set tksitcamps = new HashSet(0);
	private Set tkcontpessoas = new HashSet(0);
	private Set tkctogrpints = new HashSet(0);
	private Set tkctoativs = new HashSet(0);
	private Set tkcampanhactos = new HashSet(0);

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
			Set crfichaavals, Set tkhistoricos, Set tkcontclis, Set tksitcamps,
			Set tkcontpessoas, Set tkctogrpints, Set tkctoativs,
			Set tkcampanhactos) {
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

	public TkcontatoId getId() {
		return this.id;
	}

	public void setId(TkcontatoId id) {
		this.id = id;
	}

	public Tktipocont getTktipocont() {
		return this.tktipocont;
	}

	public void setTktipocont(Tktipocont tktipocont) {
		this.tktipocont = tktipocont;
	}

	public Tksetorcto getTksetorcto() {
		return this.tksetorcto;
	}

	public void setTksetorcto(Tksetorcto tksetorcto) {
		this.tksetorcto = tksetorcto;
	}

	public Vdtipocli getVdtipocli() {
		return this.vdtipocli;
	}

	public void setVdtipocli(Vdtipocli vdtipocli) {
		this.vdtipocli = vdtipocli;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Vdsetor getVdsetor() {
		return this.vdsetor;
	}

	public void setVdsetor(Vdsetor vdsetor) {
		this.vdsetor = vdsetor;
	}

	public Tkorigcont getTkorigcont() {
		return this.tkorigcont;
	}

	public void setTkorigcont(Tkorigcont tkorigcont) {
		this.tkorigcont = tkorigcont;
	}

	public Tktipoimp getTktipoimp() {
		return this.tktipoimp;
	}

	public void setTktipoimp(Tktipoimp tktipoimp) {
		this.tktipoimp = tktipoimp;
	}

	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	public String getRazcto() {
		return this.razcto;
	}

	public void setRazcto(String razcto) {
		this.razcto = razcto;
	}

	public String getNomecto() {
		return this.nomecto;
	}

	public void setNomecto(String nomecto) {
		this.nomecto = nomecto;
	}

	public Date getDatacto() {
		return this.datacto;
	}

	public void setDatacto(Date datacto) {
		this.datacto = datacto;
	}

	public char getPessoacto() {
		return this.pessoacto;
	}

	public void setPessoacto(char pessoacto) {
		this.pessoacto = pessoacto;
	}

	public char getAtivocto() {
		return this.ativocto;
	}

	public void setAtivocto(char ativocto) {
		this.ativocto = ativocto;
	}

	public String getCnpjcto() {
		return this.cnpjcto;
	}

	public void setCnpjcto(String cnpjcto) {
		this.cnpjcto = cnpjcto;
	}

	public String getInsccto() {
		return this.insccto;
	}

	public void setInsccto(String insccto) {
		this.insccto = insccto;
	}

	public String getCpfcto() {
		return this.cpfcto;
	}

	public void setCpfcto(String cpfcto) {
		this.cpfcto = cpfcto;
	}

	public String getRgcto() {
		return this.rgcto;
	}

	public void setRgcto(String rgcto) {
		this.rgcto = rgcto;
	}

	public String getEndcto() {
		return this.endcto;
	}

	public void setEndcto(String endcto) {
		this.endcto = endcto;
	}

	public Integer getNumcto() {
		return this.numcto;
	}

	public void setNumcto(Integer numcto) {
		this.numcto = numcto;
	}

	public String getComplcto() {
		return this.complcto;
	}

	public void setComplcto(String complcto) {
		this.complcto = complcto;
	}

	public String getEdificiocto() {
		return this.edificiocto;
	}

	public void setEdificiocto(String edificiocto) {
		this.edificiocto = edificiocto;
	}

	public String getBaircto() {
		return this.baircto;
	}

	public void setBaircto(String baircto) {
		this.baircto = baircto;
	}

	public String getCidcto() {
		return this.cidcto;
	}

	public void setCidcto(String cidcto) {
		this.cidcto = cidcto;
	}

	public String getUfcto() {
		return this.ufcto;
	}

	public void setUfcto(String ufcto) {
		this.ufcto = ufcto;
	}

	public String getCepcto() {
		return this.cepcto;
	}

	public void setCepcto(String cepcto) {
		this.cepcto = cepcto;
	}

	public String getDddcto() {
		return this.dddcto;
	}

	public void setDddcto(String dddcto) {
		this.dddcto = dddcto;
	}

	public String getFonecto() {
		return this.fonecto;
	}

	public void setFonecto(String fonecto) {
		this.fonecto = fonecto;
	}

	public String getFaxcto() {
		return this.faxcto;
	}

	public void setFaxcto(String faxcto) {
		this.faxcto = faxcto;
	}

	public String getEmailcto() {
		return this.emailcto;
	}

	public void setEmailcto(String emailcto) {
		this.emailcto = emailcto;
	}

	public String getContcto() {
		return this.contcto;
	}

	public void setContcto(String contcto) {
		this.contcto = contcto;
	}

	public String getCargocontcto() {
		return this.cargocontcto;
	}

	public void setCargocontcto(String cargocontcto) {
		this.cargocontcto = cargocontcto;
	}

	public String getObscto() {
		return this.obscto;
	}

	public void setObscto(String obscto) {
		this.obscto = obscto;
	}

	public char getRemovcto() {
		return this.removcto;
	}

	public void setRemovcto(char removcto) {
		this.removcto = removcto;
	}

	public Integer getNumempcto() {
		return this.numempcto;
	}

	public void setNumempcto(Integer numempcto) {
		this.numempcto = numempcto;
	}

	public String getCelcto() {
		return this.celcto;
	}

	public void setCelcto(String celcto) {
		this.celcto = celcto;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getCrfichaavals() {
		return this.crfichaavals;
	}

	public void setCrfichaavals(Set crfichaavals) {
		this.crfichaavals = crfichaavals;
	}

	public Set getTkhistoricos() {
		return this.tkhistoricos;
	}

	public void setTkhistoricos(Set tkhistoricos) {
		this.tkhistoricos = tkhistoricos;
	}

	public Set getTkcontclis() {
		return this.tkcontclis;
	}

	public void setTkcontclis(Set tkcontclis) {
		this.tkcontclis = tkcontclis;
	}

	public Set getTksitcamps() {
		return this.tksitcamps;
	}

	public void setTksitcamps(Set tksitcamps) {
		this.tksitcamps = tksitcamps;
	}

	public Set getTkcontpessoas() {
		return this.tkcontpessoas;
	}

	public void setTkcontpessoas(Set tkcontpessoas) {
		this.tkcontpessoas = tkcontpessoas;
	}

	public Set getTkctogrpints() {
		return this.tkctogrpints;
	}

	public void setTkctogrpints(Set tkctogrpints) {
		this.tkctogrpints = tkctogrpints;
	}

	public Set getTkctoativs() {
		return this.tkctoativs;
	}

	public void setTkctoativs(Set tkctoativs) {
		this.tkctoativs = tkctoativs;
	}

	public Set getTkcampanhactos() {
		return this.tkcampanhactos;
	}

	public void setTkcampanhactos(Set tkcampanhactos) {
		this.tkcampanhactos = tkcampanhactos;
	}

}

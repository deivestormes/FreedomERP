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
 * Vdtipocli generated by hbm2java
 */
@Entity
@Table(name = "VDTIPOCLI")
public class Vdtipocli implements java.io.Serializable {

	private VdtipocliId id;
	private Sgfilial sgfilial;
	private String desctipocli;
	private char cheqtipocli;
	private char fistipocli;
	private char jurtipocli;
	private char filtipocli;
	private char loctrabtipocli;
	private char refcomltipocli;
	private char banctipocli;
	private char refpestipocli;
	private char conjtipocli;
	private char veictipocli;
	private char imovtipocli;
	private char terratipocli;
	private char pesautcptipocli;
	private char avaltipocli;
	private char sociotipocli;
	private char prodruraltipocli;
	private char web;
	private String siglatipocli;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vdcliente> vdclientes = new HashSet<Vdcliente>(0);
	private Set<Sgprefere2> sgprefere2s = new HashSet<Sgprefere2>(0);
	private Set<Sgprefere1> sgprefere1s = new HashSet<Sgprefere1>(0);
	private Set<Tkcontato> tkcontatos = new HashSet<Tkcontato>(0);

	public Vdtipocli() {
	}

	public Vdtipocli(VdtipocliId id, Sgfilial sgfilial, String desctipocli,
			char cheqtipocli, char fistipocli, char jurtipocli,
			char filtipocli, char loctrabtipocli, char refcomltipocli,
			char banctipocli, char refpestipocli, char conjtipocli,
			char veictipocli, char imovtipocli, char terratipocli,
			char pesautcptipocli, char avaltipocli, char sociotipocli,
			char prodruraltipocli, char web, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipocli = desctipocli;
		this.cheqtipocli = cheqtipocli;
		this.fistipocli = fistipocli;
		this.jurtipocli = jurtipocli;
		this.filtipocli = filtipocli;
		this.loctrabtipocli = loctrabtipocli;
		this.refcomltipocli = refcomltipocli;
		this.banctipocli = banctipocli;
		this.refpestipocli = refpestipocli;
		this.conjtipocli = conjtipocli;
		this.veictipocli = veictipocli;
		this.imovtipocli = imovtipocli;
		this.terratipocli = terratipocli;
		this.pesautcptipocli = pesautcptipocli;
		this.avaltipocli = avaltipocli;
		this.sociotipocli = sociotipocli;
		this.prodruraltipocli = prodruraltipocli;
		this.web = web;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdtipocli(VdtipocliId id, Sgfilial sgfilial, String desctipocli,
			char cheqtipocli, char fistipocli, char jurtipocli,
			char filtipocli, char loctrabtipocli, char refcomltipocli,
			char banctipocli, char refpestipocli, char conjtipocli,
			char veictipocli, char imovtipocli, char terratipocli,
			char pesautcptipocli, char avaltipocli, char sociotipocli,
			char prodruraltipocli, char web, String siglatipocli, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Vdcliente> vdclientes, Set<Sgprefere2> sgprefere2s,
			Set<Sgprefere1> sgprefere1s, Set<Tkcontato> tkcontatos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipocli = desctipocli;
		this.cheqtipocli = cheqtipocli;
		this.fistipocli = fistipocli;
		this.jurtipocli = jurtipocli;
		this.filtipocli = filtipocli;
		this.loctrabtipocli = loctrabtipocli;
		this.refcomltipocli = refcomltipocli;
		this.banctipocli = banctipocli;
		this.refpestipocli = refpestipocli;
		this.conjtipocli = conjtipocli;
		this.veictipocli = veictipocli;
		this.imovtipocli = imovtipocli;
		this.terratipocli = terratipocli;
		this.pesautcptipocli = pesautcptipocli;
		this.avaltipocli = avaltipocli;
		this.sociotipocli = sociotipocli;
		this.prodruraltipocli = prodruraltipocli;
		this.web = web;
		this.siglatipocli = siglatipocli;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.sgprefere2s = sgprefere2s;
		this.sgprefere1s = sgprefere1s;
		this.tkcontatos = tkcontatos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtipocli", column = @Column(name = "CODTIPOCLI", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdtipocliId getId() {
		return this.id;
	}

	public void setId(VdtipocliId id) {
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

	@Column(name = "DESCTIPOCLI", nullable = false, length = 40)
	public String getDesctipocli() {
		return this.desctipocli;
	}

	public void setDesctipocli(String desctipocli) {
		this.desctipocli = desctipocli;
	}

	@Column(name = "CHEQTIPOCLI", nullable = false, length = 1)
	public char getCheqtipocli() {
		return this.cheqtipocli;
	}

	public void setCheqtipocli(char cheqtipocli) {
		this.cheqtipocli = cheqtipocli;
	}

	@Column(name = "FISTIPOCLI", nullable = false, length = 1)
	public char getFistipocli() {
		return this.fistipocli;
	}

	public void setFistipocli(char fistipocli) {
		this.fistipocli = fistipocli;
	}

	@Column(name = "JURTIPOCLI", nullable = false, length = 1)
	public char getJurtipocli() {
		return this.jurtipocli;
	}

	public void setJurtipocli(char jurtipocli) {
		this.jurtipocli = jurtipocli;
	}

	@Column(name = "FILTIPOCLI", nullable = false, length = 1)
	public char getFiltipocli() {
		return this.filtipocli;
	}

	public void setFiltipocli(char filtipocli) {
		this.filtipocli = filtipocli;
	}

	@Column(name = "LOCTRABTIPOCLI", nullable = false, length = 1)
	public char getLoctrabtipocli() {
		return this.loctrabtipocli;
	}

	public void setLoctrabtipocli(char loctrabtipocli) {
		this.loctrabtipocli = loctrabtipocli;
	}

	@Column(name = "REFCOMLTIPOCLI", nullable = false, length = 1)
	public char getRefcomltipocli() {
		return this.refcomltipocli;
	}

	public void setRefcomltipocli(char refcomltipocli) {
		this.refcomltipocli = refcomltipocli;
	}

	@Column(name = "BANCTIPOCLI", nullable = false, length = 1)
	public char getBanctipocli() {
		return this.banctipocli;
	}

	public void setBanctipocli(char banctipocli) {
		this.banctipocli = banctipocli;
	}

	@Column(name = "REFPESTIPOCLI", nullable = false, length = 1)
	public char getRefpestipocli() {
		return this.refpestipocli;
	}

	public void setRefpestipocli(char refpestipocli) {
		this.refpestipocli = refpestipocli;
	}

	@Column(name = "CONJTIPOCLI", nullable = false, length = 1)
	public char getConjtipocli() {
		return this.conjtipocli;
	}

	public void setConjtipocli(char conjtipocli) {
		this.conjtipocli = conjtipocli;
	}

	@Column(name = "VEICTIPOCLI", nullable = false, length = 1)
	public char getVeictipocli() {
		return this.veictipocli;
	}

	public void setVeictipocli(char veictipocli) {
		this.veictipocli = veictipocli;
	}

	@Column(name = "IMOVTIPOCLI", nullable = false, length = 1)
	public char getImovtipocli() {
		return this.imovtipocli;
	}

	public void setImovtipocli(char imovtipocli) {
		this.imovtipocli = imovtipocli;
	}

	@Column(name = "TERRATIPOCLI", nullable = false, length = 1)
	public char getTerratipocli() {
		return this.terratipocli;
	}

	public void setTerratipocli(char terratipocli) {
		this.terratipocli = terratipocli;
	}

	@Column(name = "PESAUTCPTIPOCLI", nullable = false, length = 1)
	public char getPesautcptipocli() {
		return this.pesautcptipocli;
	}

	public void setPesautcptipocli(char pesautcptipocli) {
		this.pesautcptipocli = pesautcptipocli;
	}

	@Column(name = "AVALTIPOCLI", nullable = false, length = 1)
	public char getAvaltipocli() {
		return this.avaltipocli;
	}

	public void setAvaltipocli(char avaltipocli) {
		this.avaltipocli = avaltipocli;
	}

	@Column(name = "SOCIOTIPOCLI", nullable = false, length = 1)
	public char getSociotipocli() {
		return this.sociotipocli;
	}

	public void setSociotipocli(char sociotipocli) {
		this.sociotipocli = sociotipocli;
	}

	@Column(name = "PRODRURALTIPOCLI", nullable = false, length = 1)
	public char getProdruraltipocli() {
		return this.prodruraltipocli;
	}

	public void setProdruraltipocli(char prodruraltipocli) {
		this.prodruraltipocli = prodruraltipocli;
	}

	@Column(name = "WEB", nullable = false, length = 1)
	public char getWeb() {
		return this.web;
	}

	public void setWeb(char web) {
		this.web = web;
	}

	@Column(name = "SIGLATIPOCLI", length = 3)
	public String getSiglatipocli() {
		return this.siglatipocli;
	}

	public void setSiglatipocli(String siglatipocli) {
		this.siglatipocli = siglatipocli;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdtipocli")
	public Set<Vdcliente> getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set<Vdcliente> vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdtipocli")
	public Set<Sgprefere2> getSgprefere2s() {
		return this.sgprefere2s;
	}

	public void setSgprefere2s(Set<Sgprefere2> sgprefere2s) {
		this.sgprefere2s = sgprefere2s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdtipocli")
	public Set<Sgprefere1> getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set<Sgprefere1> sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdtipocli")
	public Set<Tkcontato> getTkcontatos() {
		return this.tkcontatos;
	}

	public void setTkcontatos(Set<Tkcontato> tkcontatos) {
		this.tkcontatos = tkcontatos;
	}

}

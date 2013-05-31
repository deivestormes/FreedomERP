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
 * Fnplanejamento generated by hbm2java
 */
@Entity
@Table(name = "FNPLANEJAMENTO")
public class Fnplanejamento implements java.io.Serializable {

	private FnplanejamentoId id;
	private Sgfilial sgfilial;
	private Fnhistpad fnhistpad;
	private Fnplanejamento fnplanejamento;
	private String descplan;
	private int nivelplan;
	private Integer codredplan;
	private Integer codempsp;
	private Short codfilialsp;
	private char tipoplan;
	private String finplan;
	private char compsldcxplan;
	private String codcontcred;
	private String codcontdeb;
	private char esfinplan;
	private char clasfinplan;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Fnsublanca> fnsublancas = new HashSet<Fnsublanca>(0);
	private Set<Cprateio> cprateios = new HashSet<Cprateio>(0);
	private Set<Fnplanejamento> fnplanejamentos = new HashSet<Fnplanejamento>(0);
	private Set<Fnitreceber> fnitrecebers = new HashSet<Fnitreceber>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkplancheque = new HashSet<Sgprefere1>(
			0);
	private Set<Fnconta> fncontas = new HashSet<Fnconta>(0);
	private Set<Fnreceber> fnrecebers = new HashSet<Fnreceber>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkplanjr = new HashSet<Sgprefere1>(
			0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkplandr = new HashSet<Sgprefere1>(
			0);
	private Set<Sgprefere7> sgprefere7sForSgpref7fnplanvdconsig = new HashSet<Sgprefere7>(
			0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkplanjp = new HashSet<Sgprefere1>(
			0);
	private Set<Fnlanca> fnlancas = new HashSet<Fnlanca>(0);
	private Set<Vdvendedor> vdvendedors = new HashSet<Vdvendedor>(0);
	private Set<Fnsaldolanca> fnsaldolancas = new HashSet<Fnsaldolanca>(0);
	private Set<Fnitpagar> fnitpagars = new HashSet<Fnitpagar>(0);
	private Set<Fnpagar> fnpagars = new HashSet<Fnpagar>(0);
	private Set<Fnfbncli> fnfbnclis = new HashSet<Fnfbncli>(0);
	private Set<Sgprefere7> sgprefere7sForSgpref7fkfnplanconsig = new HashSet<Sgprefere7>(
			0);
	private Set<Eqprodplan> eqprodplans = new HashSet<Eqprodplan>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkplandc = new HashSet<Sgprefere1>(
			0);
	private Set<Cpcompra> cpcompras = new HashSet<Cpcompra>(0);
	private Set<Fnpagtocomi> fnpagtocomis = new HashSet<Fnpagtocomi>(0);
	private Set<Fnplanopag> fnplanopags = new HashSet<Fnplanopag>(0);

	public Fnplanejamento() {
	}

	public Fnplanejamento(FnplanejamentoId id, Sgfilial sgfilial,
			Fnplanejamento fnplanejamento, String descplan, int nivelplan,
			char tipoplan, char compsldcxplan, char esfinplan,
			char clasfinplan, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnplanejamento = fnplanejamento;
		this.descplan = descplan;
		this.nivelplan = nivelplan;
		this.tipoplan = tipoplan;
		this.compsldcxplan = compsldcxplan;
		this.esfinplan = esfinplan;
		this.clasfinplan = clasfinplan;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnplanejamento(FnplanejamentoId id, Sgfilial sgfilial,
			Fnhistpad fnhistpad, Fnplanejamento fnplanejamento,
			String descplan, int nivelplan, Integer codredplan,
			Integer codempsp, Short codfilialsp, char tipoplan, String finplan,
			char compsldcxplan, String codcontcred, String codcontdeb,
			char esfinplan, char clasfinplan, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Fnsublanca> fnsublancas, Set<Cprateio> cprateios,
			Set<Fnplanejamento> fnplanejamentos, Set<Fnitreceber> fnitrecebers,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplancheque,
			Set<Fnconta> fncontas, Set<Fnreceber> fnrecebers,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplanjr,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplandr,
			Set<Sgprefere7> sgprefere7sForSgpref7fnplanvdconsig,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplanjp,
			Set<Fnlanca> fnlancas, Set<Vdvendedor> vdvendedors,
			Set<Fnsaldolanca> fnsaldolancas, Set<Fnitpagar> fnitpagars,
			Set<Fnpagar> fnpagars, Set<Fnfbncli> fnfbnclis,
			Set<Sgprefere7> sgprefere7sForSgpref7fkfnplanconsig,
			Set<Eqprodplan> eqprodplans,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplandc,
			Set<Cpcompra> cpcompras, Set<Fnpagtocomi> fnpagtocomis,
			Set<Fnplanopag> fnplanopags) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnhistpad = fnhistpad;
		this.fnplanejamento = fnplanejamento;
		this.descplan = descplan;
		this.nivelplan = nivelplan;
		this.codredplan = codredplan;
		this.codempsp = codempsp;
		this.codfilialsp = codfilialsp;
		this.tipoplan = tipoplan;
		this.finplan = finplan;
		this.compsldcxplan = compsldcxplan;
		this.codcontcred = codcontcred;
		this.codcontdeb = codcontdeb;
		this.esfinplan = esfinplan;
		this.clasfinplan = clasfinplan;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnsublancas = fnsublancas;
		this.cprateios = cprateios;
		this.fnplanejamentos = fnplanejamentos;
		this.fnitrecebers = fnitrecebers;
		this.sgprefere1sForSgprefere1fkplancheque = sgprefere1sForSgprefere1fkplancheque;
		this.fncontas = fncontas;
		this.fnrecebers = fnrecebers;
		this.sgprefere1sForSgprefere1fkplanjr = sgprefere1sForSgprefere1fkplanjr;
		this.sgprefere1sForSgprefere1fkplandr = sgprefere1sForSgprefere1fkplandr;
		this.sgprefere7sForSgpref7fnplanvdconsig = sgprefere7sForSgpref7fnplanvdconsig;
		this.sgprefere1sForSgprefere1fkplanjp = sgprefere1sForSgprefere1fkplanjp;
		this.fnlancas = fnlancas;
		this.vdvendedors = vdvendedors;
		this.fnsaldolancas = fnsaldolancas;
		this.fnitpagars = fnitpagars;
		this.fnpagars = fnpagars;
		this.fnfbnclis = fnfbnclis;
		this.sgprefere7sForSgpref7fkfnplanconsig = sgprefere7sForSgpref7fkfnplanconsig;
		this.eqprodplans = eqprodplans;
		this.sgprefere1sForSgprefere1fkplandc = sgprefere1sForSgprefere1fkplandc;
		this.cpcompras = cpcompras;
		this.fnpagtocomis = fnpagtocomis;
		this.fnplanopags = fnplanopags;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codplan", column = @Column(name = "CODPLAN", nullable = false, length = 13)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnplanejamentoId getId() {
		return this.id;
	}

	public void setId(FnplanejamentoId id) {
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
			@JoinColumn(name = "CODHIST", referencedColumnName = "CODHIST"),
			@JoinColumn(name = "CODFILIALHP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPHP", referencedColumnName = "CODEMP") })
	public Fnhistpad getFnhistpad() {
		return this.fnhistpad;
	}

	public void setFnhistpad(Fnhistpad fnhistpad) {
		this.fnhistpad = fnhistpad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSUBPLAN", referencedColumnName = "CODPLAN", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	@Column(name = "DESCPLAN", nullable = false, length = 50)
	public String getDescplan() {
		return this.descplan;
	}

	public void setDescplan(String descplan) {
		this.descplan = descplan;
	}

	@Column(name = "NIVELPLAN", nullable = false)
	public int getNivelplan() {
		return this.nivelplan;
	}

	public void setNivelplan(int nivelplan) {
		this.nivelplan = nivelplan;
	}

	@Column(name = "CODREDPLAN")
	public Integer getCodredplan() {
		return this.codredplan;
	}

	public void setCodredplan(Integer codredplan) {
		this.codredplan = codredplan;
	}

	@Column(name = "CODEMPSP")
	public Integer getCodempsp() {
		return this.codempsp;
	}

	public void setCodempsp(Integer codempsp) {
		this.codempsp = codempsp;
	}

	@Column(name = "CODFILIALSP")
	public Short getCodfilialsp() {
		return this.codfilialsp;
	}

	public void setCodfilialsp(Short codfilialsp) {
		this.codfilialsp = codfilialsp;
	}

	@Column(name = "TIPOPLAN", nullable = false, length = 1)
	public char getTipoplan() {
		return this.tipoplan;
	}

	public void setTipoplan(char tipoplan) {
		this.tipoplan = tipoplan;
	}

	@Column(name = "FINPLAN", length = 3)
	public String getFinplan() {
		return this.finplan;
	}

	public void setFinplan(String finplan) {
		this.finplan = finplan;
	}

	@Column(name = "COMPSLDCXPLAN", nullable = false, length = 1)
	public char getCompsldcxplan() {
		return this.compsldcxplan;
	}

	public void setCompsldcxplan(char compsldcxplan) {
		this.compsldcxplan = compsldcxplan;
	}

	@Column(name = "CODCONTCRED", length = 20)
	public String getCodcontcred() {
		return this.codcontcred;
	}

	public void setCodcontcred(String codcontcred) {
		this.codcontcred = codcontcred;
	}

	@Column(name = "CODCONTDEB", length = 20)
	public String getCodcontdeb() {
		return this.codcontdeb;
	}

	public void setCodcontdeb(String codcontdeb) {
		this.codcontdeb = codcontdeb;
	}

	@Column(name = "ESFINPLAN", nullable = false, length = 1)
	public char getEsfinplan() {
		return this.esfinplan;
	}

	public void setEsfinplan(char esfinplan) {
		this.esfinplan = esfinplan;
	}

	@Column(name = "CLASFINPLAN", nullable = false, length = 1)
	public char getClasfinplan() {
		return this.clasfinplan;
	}

	public void setClasfinplan(char clasfinplan) {
		this.clasfinplan = clasfinplan;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnsublanca> getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set<Fnsublanca> fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Cprateio> getCprateios() {
		return this.cprateios;
	}

	public void setCprateios(Set<Cprateio> cprateios) {
		this.cprateios = cprateios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnplanejamento> getFnplanejamentos() {
		return this.fnplanejamentos;
	}

	public void setFnplanejamentos(Set<Fnplanejamento> fnplanejamentos) {
		this.fnplanejamentos = fnplanejamentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnitreceber> getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set<Fnitreceber> fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgprefere1fkplancheque")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkplancheque() {
		return this.sgprefere1sForSgprefere1fkplancheque;
	}

	public void setSgprefere1sForSgprefere1fkplancheque(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplancheque) {
		this.sgprefere1sForSgprefere1fkplancheque = sgprefere1sForSgprefere1fkplancheque;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnconta> getFncontas() {
		return this.fncontas;
	}

	public void setFncontas(Set<Fnconta> fncontas) {
		this.fncontas = fncontas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnreceber> getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set<Fnreceber> fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgprefere1fkplanjr")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkplanjr() {
		return this.sgprefere1sForSgprefere1fkplanjr;
	}

	public void setSgprefere1sForSgprefere1fkplanjr(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplanjr) {
		this.sgprefere1sForSgprefere1fkplanjr = sgprefere1sForSgprefere1fkplanjr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgprefere1fkplandr")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkplandr() {
		return this.sgprefere1sForSgprefere1fkplandr;
	}

	public void setSgprefere1sForSgprefere1fkplandr(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplandr) {
		this.sgprefere1sForSgprefere1fkplandr = sgprefere1sForSgprefere1fkplandr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgpref7fnplanvdconsig")
	public Set<Sgprefere7> getSgprefere7sForSgpref7fnplanvdconsig() {
		return this.sgprefere7sForSgpref7fnplanvdconsig;
	}

	public void setSgprefere7sForSgpref7fnplanvdconsig(
			Set<Sgprefere7> sgprefere7sForSgpref7fnplanvdconsig) {
		this.sgprefere7sForSgpref7fnplanvdconsig = sgprefere7sForSgpref7fnplanvdconsig;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgprefere1fkplanjp")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkplanjp() {
		return this.sgprefere1sForSgprefere1fkplanjp;
	}

	public void setSgprefere1sForSgprefere1fkplanjp(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplanjp) {
		this.sgprefere1sForSgprefere1fkplanjp = sgprefere1sForSgprefere1fkplanjp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnlanca> getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set<Fnlanca> fnlancas) {
		this.fnlancas = fnlancas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Vdvendedor> getVdvendedors() {
		return this.vdvendedors;
	}

	public void setVdvendedors(Set<Vdvendedor> vdvendedors) {
		this.vdvendedors = vdvendedors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnsaldolanca> getFnsaldolancas() {
		return this.fnsaldolancas;
	}

	public void setFnsaldolancas(Set<Fnsaldolanca> fnsaldolancas) {
		this.fnsaldolancas = fnsaldolancas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnitpagar> getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set<Fnitpagar> fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnpagar> getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set<Fnpagar> fnpagars) {
		this.fnpagars = fnpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnfbncli> getFnfbnclis() {
		return this.fnfbnclis;
	}

	public void setFnfbnclis(Set<Fnfbncli> fnfbnclis) {
		this.fnfbnclis = fnfbnclis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgpref7fkfnplanconsig")
	public Set<Sgprefere7> getSgprefere7sForSgpref7fkfnplanconsig() {
		return this.sgprefere7sForSgpref7fkfnplanconsig;
	}

	public void setSgprefere7sForSgpref7fkfnplanconsig(
			Set<Sgprefere7> sgprefere7sForSgpref7fkfnplanconsig) {
		this.sgprefere7sForSgpref7fkfnplanconsig = sgprefere7sForSgpref7fkfnplanconsig;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Eqprodplan> getEqprodplans() {
		return this.eqprodplans;
	}

	public void setEqprodplans(Set<Eqprodplan> eqprodplans) {
		this.eqprodplans = eqprodplans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamentoBySgprefere1fkplandc")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkplandc() {
		return this.sgprefere1sForSgprefere1fkplandc;
	}

	public void setSgprefere1sForSgprefere1fkplandc(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkplandc) {
		this.sgprefere1sForSgprefere1fkplandc = sgprefere1sForSgprefere1fkplandc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Cpcompra> getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set<Cpcompra> cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnpagtocomi> getFnpagtocomis() {
		return this.fnpagtocomis;
	}

	public void setFnpagtocomis(Set<Fnpagtocomi> fnpagtocomis) {
		this.fnpagtocomis = fnpagtocomis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnplanejamento")
	public Set<Fnplanopag> getFnplanopags() {
		return this.fnplanopags;
	}

	public void setFnplanopags(Set<Fnplanopag> fnplanopags) {
		this.fnplanopags = fnplanopags;
	}

}

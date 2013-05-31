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
 * Fnmoeda generated by hbm2java
 */
@Entity
@Table(name = "FNMOEDA")
public class Fnmoeda implements java.io.Serializable {

	private FnmoedaId id;
	private Sgfilial sgfilial;
	private char tipomoeda;
	private char atualizamoeda;
	private String singmoeda;
	private String plurmoeda;
	private char codfbnmoeda;
	private String decsmoeda;
	private String decpmoeda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpimportacao> cpimportacaos = new HashSet<Cpimportacao>(0);
	private Set<Eqproduto> eqprodutos = new HashSet<Eqproduto>(0);
	private Set<Fnconta> fncontas = new HashSet<Fnconta>(0);
	private Set<Sgprefere1> sgprefere1s = new HashSet<Sgprefere1>(0);
	private Set<Fncotmoeda> fncotmoedas = new HashSet<Fncotmoeda>(0);

	public Fnmoeda() {
	}

	public Fnmoeda(FnmoedaId id, Sgfilial sgfilial, char tipomoeda,
			char atualizamoeda, String singmoeda, String plurmoeda,
			char codfbnmoeda, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tipomoeda = tipomoeda;
		this.atualizamoeda = atualizamoeda;
		this.singmoeda = singmoeda;
		this.plurmoeda = plurmoeda;
		this.codfbnmoeda = codfbnmoeda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnmoeda(FnmoedaId id, Sgfilial sgfilial, char tipomoeda,
			char atualizamoeda, String singmoeda, String plurmoeda,
			char codfbnmoeda, String decsmoeda, String decpmoeda, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Cpimportacao> cpimportacaos, Set<Eqproduto> eqprodutos,
			Set<Fnconta> fncontas, Set<Sgprefere1> sgprefere1s,
			Set<Fncotmoeda> fncotmoedas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tipomoeda = tipomoeda;
		this.atualizamoeda = atualizamoeda;
		this.singmoeda = singmoeda;
		this.plurmoeda = plurmoeda;
		this.codfbnmoeda = codfbnmoeda;
		this.decsmoeda = decsmoeda;
		this.decpmoeda = decpmoeda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpimportacaos = cpimportacaos;
		this.eqprodutos = eqprodutos;
		this.fncontas = fncontas;
		this.sgprefere1s = sgprefere1s;
		this.fncotmoedas = fncotmoedas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmoeda", column = @Column(name = "CODMOEDA", nullable = false, length = 4)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnmoedaId getId() {
		return this.id;
	}

	public void setId(FnmoedaId id) {
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

	@Column(name = "TIPOMOEDA", nullable = false, length = 1)
	public char getTipomoeda() {
		return this.tipomoeda;
	}

	public void setTipomoeda(char tipomoeda) {
		this.tipomoeda = tipomoeda;
	}

	@Column(name = "ATUALIZAMOEDA", nullable = false, length = 1)
	public char getAtualizamoeda() {
		return this.atualizamoeda;
	}

	public void setAtualizamoeda(char atualizamoeda) {
		this.atualizamoeda = atualizamoeda;
	}

	@Column(name = "SINGMOEDA", nullable = false, length = 20)
	public String getSingmoeda() {
		return this.singmoeda;
	}

	public void setSingmoeda(String singmoeda) {
		this.singmoeda = singmoeda;
	}

	@Column(name = "PLURMOEDA", nullable = false, length = 20)
	public String getPlurmoeda() {
		return this.plurmoeda;
	}

	public void setPlurmoeda(String plurmoeda) {
		this.plurmoeda = plurmoeda;
	}

	@Column(name = "CODFBNMOEDA", nullable = false, length = 1)
	public char getCodfbnmoeda() {
		return this.codfbnmoeda;
	}

	public void setCodfbnmoeda(char codfbnmoeda) {
		this.codfbnmoeda = codfbnmoeda;
	}

	@Column(name = "DECSMOEDA", length = 20)
	public String getDecsmoeda() {
		return this.decsmoeda;
	}

	public void setDecsmoeda(String decsmoeda) {
		this.decsmoeda = decsmoeda;
	}

	@Column(name = "DECPMOEDA", length = 20)
	public String getDecpmoeda() {
		return this.decpmoeda;
	}

	public void setDecpmoeda(String decpmoeda) {
		this.decpmoeda = decpmoeda;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmoeda")
	public Set<Cpimportacao> getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set<Cpimportacao> cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmoeda")
	public Set<Eqproduto> getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set<Eqproduto> eqprodutos) {
		this.eqprodutos = eqprodutos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmoeda")
	public Set<Fnconta> getFncontas() {
		return this.fncontas;
	}

	public void setFncontas(Set<Fnconta> fncontas) {
		this.fncontas = fncontas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmoeda")
	public Set<Sgprefere1> getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set<Sgprefere1> sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmoeda")
	public Set<Fncotmoeda> getFncotmoedas() {
		return this.fncotmoedas;
	}

	public void setFncotmoedas(Set<Fncotmoeda> fncotmoedas) {
		this.fncotmoedas = fncotmoedas;
	}

}

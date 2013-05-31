package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Vditcontrato generated by hbm2java
 */
@Entity
@Table(name = "VDITCONTRATO")
public class Vditcontrato implements java.io.Serializable {

	private VditcontratoId id;
	private Eqproduto eqprodutoByVditcontratofkeqprodu;
	private Eqproduto eqprodutoByVditcontratofkeqprodpe;
	private String descitcontr;
	private BigDecimal qtditcontr;
	private BigDecimal vlritcontr;
	private BigDecimal vlritcontrexced;
	private int indexitcontr;
	private String keylic;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private short acumuloitcontr;
	private char franquiaitcontr;
	private Set<Atatendimento> atatendimentos = new HashSet<Atatendimento>(0);
	private Set<Fnitreceber> fnitrecebers = new HashSet<Fnitreceber>(0);
	private Set<Fnsublanca> fnsublancas = new HashSet<Fnsublanca>(0);
	private Set<Eqrma> eqrmas = new HashSet<Eqrma>(0);
	private Set<Vditcontratoand> vditcontratoands = new HashSet<Vditcontratoand>(
			0);
	private Set<Vditcontratofor> vditcontratofors = new HashSet<Vditcontratofor>(
			0);
	private Set<Fnitpagar> fnitpagars = new HashSet<Fnitpagar>(0);
	private Set<Crtarefa> crtarefas = new HashSet<Crtarefa>(0);
	private Set<Vdcontrorc> vdcontrorcs = new HashSet<Vdcontrorc>(0);
	private Set<Crchamado> crchamados = new HashSet<Crchamado>(0);
	private Set<Atmodatendo> atmodatendos = new HashSet<Atmodatendo>(0);

	public Vditcontrato() {
	}

	public Vditcontrato(VditcontratoId id,
			Eqproduto eqprodutoByVditcontratofkeqprodu,
			Eqproduto eqprodutoByVditcontratofkeqprodpe, BigDecimal qtditcontr,
			BigDecimal vlritcontr, BigDecimal vlritcontrexced,
			int indexitcontr, Date dtins, Date hins, String idusuins,
			short acumuloitcontr, char franquiaitcontr) {
		this.id = id;
		this.eqprodutoByVditcontratofkeqprodu = eqprodutoByVditcontratofkeqprodu;
		this.eqprodutoByVditcontratofkeqprodpe = eqprodutoByVditcontratofkeqprodpe;
		this.qtditcontr = qtditcontr;
		this.vlritcontr = vlritcontr;
		this.vlritcontrexced = vlritcontrexced;
		this.indexitcontr = indexitcontr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.acumuloitcontr = acumuloitcontr;
		this.franquiaitcontr = franquiaitcontr;
	}

	public Vditcontrato(VditcontratoId id,
			Eqproduto eqprodutoByVditcontratofkeqprodu,
			Eqproduto eqprodutoByVditcontratofkeqprodpe, String descitcontr,
			BigDecimal qtditcontr, BigDecimal vlritcontr,
			BigDecimal vlritcontrexced, int indexitcontr, String keylic,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, short acumuloitcontr, char franquiaitcontr,
			Set<Atatendimento> atatendimentos, Set<Fnitreceber> fnitrecebers,
			Set<Fnsublanca> fnsublancas, Set<Eqrma> eqrmas,
			Set<Vditcontratoand> vditcontratoands,
			Set<Vditcontratofor> vditcontratofors, Set<Fnitpagar> fnitpagars,
			Set<Crtarefa> crtarefas, Set<Vdcontrorc> vdcontrorcs,
			Set<Crchamado> crchamados, Set<Atmodatendo> atmodatendos) {
		this.id = id;
		this.eqprodutoByVditcontratofkeqprodu = eqprodutoByVditcontratofkeqprodu;
		this.eqprodutoByVditcontratofkeqprodpe = eqprodutoByVditcontratofkeqprodpe;
		this.descitcontr = descitcontr;
		this.qtditcontr = qtditcontr;
		this.vlritcontr = vlritcontr;
		this.vlritcontrexced = vlritcontrexced;
		this.indexitcontr = indexitcontr;
		this.keylic = keylic;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.acumuloitcontr = acumuloitcontr;
		this.franquiaitcontr = franquiaitcontr;
		this.atatendimentos = atatendimentos;
		this.fnitrecebers = fnitrecebers;
		this.fnsublancas = fnsublancas;
		this.eqrmas = eqrmas;
		this.vditcontratoands = vditcontratoands;
		this.vditcontratofors = vditcontratofors;
		this.fnitpagars = fnitpagars;
		this.crtarefas = crtarefas;
		this.vdcontrorcs = vdcontrorcs;
		this.crchamados = crchamados;
		this.atmodatendos = atmodatendos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR", nullable = false)),
			@AttributeOverride(name = "coditcontr", column = @Column(name = "CODITCONTR", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VditcontratoId getId() {
		return this.id;
	}

	public void setId(VditcontratoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqprodutoByVditcontratofkeqprodu() {
		return this.eqprodutoByVditcontratofkeqprodu;
	}

	public void setEqprodutoByVditcontratofkeqprodu(
			Eqproduto eqprodutoByVditcontratofkeqprodu) {
		this.eqprodutoByVditcontratofkeqprodu = eqprodutoByVditcontratofkeqprodu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPRODPE", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPE", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqprodutoByVditcontratofkeqprodpe() {
		return this.eqprodutoByVditcontratofkeqprodpe;
	}

	public void setEqprodutoByVditcontratofkeqprodpe(
			Eqproduto eqprodutoByVditcontratofkeqprodpe) {
		this.eqprodutoByVditcontratofkeqprodpe = eqprodutoByVditcontratofkeqprodpe;
	}

	@Column(name = "DESCITCONTR", length = 80)
	public String getDescitcontr() {
		return this.descitcontr;
	}

	public void setDescitcontr(String descitcontr) {
		this.descitcontr = descitcontr;
	}

	@Column(name = "QTDITCONTR", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditcontr() {
		return this.qtditcontr;
	}

	public void setQtditcontr(BigDecimal qtditcontr) {
		this.qtditcontr = qtditcontr;
	}

	@Column(name = "VLRITCONTR", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlritcontr() {
		return this.vlritcontr;
	}

	public void setVlritcontr(BigDecimal vlritcontr) {
		this.vlritcontr = vlritcontr;
	}

	@Column(name = "VLRITCONTREXCED", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlritcontrexced() {
		return this.vlritcontrexced;
	}

	public void setVlritcontrexced(BigDecimal vlritcontrexced) {
		this.vlritcontrexced = vlritcontrexced;
	}

	@Column(name = "INDEXITCONTR", nullable = false)
	public int getIndexitcontr() {
		return this.indexitcontr;
	}

	public void setIndexitcontr(int indexitcontr) {
		this.indexitcontr = indexitcontr;
	}

	@Column(name = "KEYLIC", length = 500)
	public String getKeylic() {
		return this.keylic;
	}

	public void setKeylic(String keylic) {
		this.keylic = keylic;
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

	@Column(name = "ACUMULOITCONTR", nullable = false)
	public short getAcumuloitcontr() {
		return this.acumuloitcontr;
	}

	public void setAcumuloitcontr(short acumuloitcontr) {
		this.acumuloitcontr = acumuloitcontr;
	}

	@Column(name = "FRANQUIAITCONTR", nullable = false, length = 1)
	public char getFranquiaitcontr() {
		return this.franquiaitcontr;
	}

	public void setFranquiaitcontr(char franquiaitcontr) {
		this.franquiaitcontr = franquiaitcontr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Atatendimento> getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set<Atatendimento> atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Fnitreceber> getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set<Fnitreceber> fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Fnsublanca> getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set<Fnsublanca> fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Eqrma> getEqrmas() {
		return this.eqrmas;
	}

	public void setEqrmas(Set<Eqrma> eqrmas) {
		this.eqrmas = eqrmas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Vditcontratoand> getVditcontratoands() {
		return this.vditcontratoands;
	}

	public void setVditcontratoands(Set<Vditcontratoand> vditcontratoands) {
		this.vditcontratoands = vditcontratoands;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Vditcontratofor> getVditcontratofors() {
		return this.vditcontratofors;
	}

	public void setVditcontratofors(Set<Vditcontratofor> vditcontratofors) {
		this.vditcontratofors = vditcontratofors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Fnitpagar> getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set<Fnitpagar> fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Crtarefa> getCrtarefas() {
		return this.crtarefas;
	}

	public void setCrtarefas(Set<Crtarefa> crtarefas) {
		this.crtarefas = crtarefas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Vdcontrorc> getVdcontrorcs() {
		return this.vdcontrorcs;
	}

	public void setVdcontrorcs(Set<Vdcontrorc> vdcontrorcs) {
		this.vdcontrorcs = vdcontrorcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Crchamado> getCrchamados() {
		return this.crchamados;
	}

	public void setCrchamados(Set<Crchamado> crchamados) {
		this.crchamados = crchamados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vditcontrato")
	public Set<Atmodatendo> getAtmodatendos() {
		return this.atmodatendos;
	}

	public void setAtmodatendos(Set<Atmodatendo> atmodatendos) {
		this.atmodatendos = atmodatendos;
	}

}

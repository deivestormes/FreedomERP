package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqlote generated by hbm2java
 */
public class Eqlote implements java.io.Serializable {

	private EqloteId id;
	private Sgfilial sgfilial;
	private Eqproduto eqproduto;
	private Date venctolote;
	private BigDecimal sldlote;
	private BigDecimal sldreslote;
	private BigDecimal sldconsiglote;
	private BigDecimal sldliqlote;
	private BigDecimal qtdprodlote;
	private Date dinilote;
	private short diasavisolote;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqsaldolotes = new HashSet(0);
	private Set ppops = new HashSet(0);
	private Set eqitrmas = new HashSet(0);
	private Set cpitcompras = new HashSet(0);
	private Set eqmovprods = new HashSet(0);
	private Set ppopsubprods = new HashSet(0);
	private Set eqinvprods = new HashSet(0);
	private Set vditorcamentos = new HashSet(0);
	private Set ppitops = new HashSet(0);
	private Set vditvendas = new HashSet(0);

	public Eqlote() {
	}

	public Eqlote(EqloteId id, Sgfilial sgfilial, Eqproduto eqproduto,
			Date venctolote, short diasavisolote, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqproduto = eqproduto;
		this.venctolote = venctolote;
		this.diasavisolote = diasavisolote;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqlote(EqloteId id, Sgfilial sgfilial, Eqproduto eqproduto,
			Date venctolote, BigDecimal sldlote, BigDecimal sldreslote,
			BigDecimal sldconsiglote, BigDecimal sldliqlote,
			BigDecimal qtdprodlote, Date dinilote, short diasavisolote,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set eqsaldolotes, Set ppops, Set eqitrmas,
			Set cpitcompras, Set eqmovprods, Set ppopsubprods, Set eqinvprods,
			Set vditorcamentos, Set ppitops, Set vditvendas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqproduto = eqproduto;
		this.venctolote = venctolote;
		this.sldlote = sldlote;
		this.sldreslote = sldreslote;
		this.sldconsiglote = sldconsiglote;
		this.sldliqlote = sldliqlote;
		this.qtdprodlote = qtdprodlote;
		this.dinilote = dinilote;
		this.diasavisolote = diasavisolote;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqsaldolotes = eqsaldolotes;
		this.ppops = ppops;
		this.eqitrmas = eqitrmas;
		this.cpitcompras = cpitcompras;
		this.eqmovprods = eqmovprods;
		this.ppopsubprods = ppopsubprods;
		this.eqinvprods = eqinvprods;
		this.vditorcamentos = vditorcamentos;
		this.ppitops = ppitops;
		this.vditvendas = vditvendas;
	}

	public EqloteId getId() {
		return this.id;
	}

	public void setId(EqloteId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Date getVenctolote() {
		return this.venctolote;
	}

	public void setVenctolote(Date venctolote) {
		this.venctolote = venctolote;
	}

	public BigDecimal getSldlote() {
		return this.sldlote;
	}

	public void setSldlote(BigDecimal sldlote) {
		this.sldlote = sldlote;
	}

	public BigDecimal getSldreslote() {
		return this.sldreslote;
	}

	public void setSldreslote(BigDecimal sldreslote) {
		this.sldreslote = sldreslote;
	}

	public BigDecimal getSldconsiglote() {
		return this.sldconsiglote;
	}

	public void setSldconsiglote(BigDecimal sldconsiglote) {
		this.sldconsiglote = sldconsiglote;
	}

	public BigDecimal getSldliqlote() {
		return this.sldliqlote;
	}

	public void setSldliqlote(BigDecimal sldliqlote) {
		this.sldliqlote = sldliqlote;
	}

	public BigDecimal getQtdprodlote() {
		return this.qtdprodlote;
	}

	public void setQtdprodlote(BigDecimal qtdprodlote) {
		this.qtdprodlote = qtdprodlote;
	}

	public Date getDinilote() {
		return this.dinilote;
	}

	public void setDinilote(Date dinilote) {
		this.dinilote = dinilote;
	}

	public short getDiasavisolote() {
		return this.diasavisolote;
	}

	public void setDiasavisolote(short diasavisolote) {
		this.diasavisolote = diasavisolote;
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

	public Set getEqsaldolotes() {
		return this.eqsaldolotes;
	}

	public void setEqsaldolotes(Set eqsaldolotes) {
		this.eqsaldolotes = eqsaldolotes;
	}

	public Set getPpops() {
		return this.ppops;
	}

	public void setPpops(Set ppops) {
		this.ppops = ppops;
	}

	public Set getEqitrmas() {
		return this.eqitrmas;
	}

	public void setEqitrmas(Set eqitrmas) {
		this.eqitrmas = eqitrmas;
	}

	public Set getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	public Set getEqmovprods() {
		return this.eqmovprods;
	}

	public void setEqmovprods(Set eqmovprods) {
		this.eqmovprods = eqmovprods;
	}

	public Set getPpopsubprods() {
		return this.ppopsubprods;
	}

	public void setPpopsubprods(Set ppopsubprods) {
		this.ppopsubprods = ppopsubprods;
	}

	public Set getEqinvprods() {
		return this.eqinvprods;
	}

	public void setEqinvprods(Set eqinvprods) {
		this.eqinvprods = eqinvprods;
	}

	public Set getVditorcamentos() {
		return this.vditorcamentos;
	}

	public void setVditorcamentos(Set vditorcamentos) {
		this.vditorcamentos = vditorcamentos;
	}

	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

}

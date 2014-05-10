package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnpagar generated by hbm2java
 */
public class Fnpagar implements java.io.Serializable {

	private FnpagarId id;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fntipocob fntipocob;
	private Cpforneced cpforneced;
	private Fnplanopag fnplanopag;
	private Cpcompra cpcompra;
	private Fnplanejamento fnplanejamento;
	private Cpordcompra cpordcompra;
	private Fnbanco fnbanco;
	private Fncc fncc;
	private BigDecimal vlrdescpag;
	private BigDecimal vlrmultapag;
	private BigDecimal vlrjurospag;
	private BigDecimal vlrdevpag;
	private BigDecimal vlrparcpag;
	private BigDecimal vlrpagopag;
	private BigDecimal vlrapagpag;
	private Date datapag;
	private Date dtcomppag;
	private String statuspag;
	private Date dtquitpag;
	private int docpag;
	private BigDecimal vlrpag;
	private Integer nroparcpag;
	private String obspag;
	private BigDecimal vlradicpag;
	private Character flag;
	private char emmanut;
	private BigDecimal vlrbaseirrf;
	private BigDecimal vlrbaseinss;
	private BigDecimal vlrretirrf;
	private BigDecimal vlrretinss;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnitpagars = new HashSet(0);
	private Set lffretes = new HashSet(0);

	public Fnpagar() {
	}

	public Fnpagar(FnpagarId id, Sgfilial sgfilial, Cpforneced cpforneced,
			Fnplanopag fnplanopag, BigDecimal vlrdevpag, BigDecimal vlrparcpag,
			Date dtcomppag, String statuspag, int docpag, char emmanut,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.vlrdevpag = vlrdevpag;
		this.vlrparcpag = vlrparcpag;
		this.dtcomppag = dtcomppag;
		this.statuspag = statuspag;
		this.docpag = docpag;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnpagar(FnpagarId id, Sgfilial sgfilial, Fnconta fnconta,
			Fntipocob fntipocob, Cpforneced cpforneced, Fnplanopag fnplanopag,
			Cpcompra cpcompra, Fnplanejamento fnplanejamento,
			Cpordcompra cpordcompra, Fnbanco fnbanco, Fncc fncc,
			BigDecimal vlrdescpag, BigDecimal vlrmultapag,
			BigDecimal vlrjurospag, BigDecimal vlrdevpag,
			BigDecimal vlrparcpag, BigDecimal vlrpagopag,
			BigDecimal vlrapagpag, Date datapag, Date dtcomppag,
			String statuspag, Date dtquitpag, int docpag, BigDecimal vlrpag,
			Integer nroparcpag, String obspag, BigDecimal vlradicpag,
			Character flag, char emmanut, BigDecimal vlrbaseirrf,
			BigDecimal vlrbaseinss, BigDecimal vlrretirrf,
			BigDecimal vlrretinss, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set fnitpagars, Set lffretes) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fntipocob = fntipocob;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.cpcompra = cpcompra;
		this.fnplanejamento = fnplanejamento;
		this.cpordcompra = cpordcompra;
		this.fnbanco = fnbanco;
		this.fncc = fncc;
		this.vlrdescpag = vlrdescpag;
		this.vlrmultapag = vlrmultapag;
		this.vlrjurospag = vlrjurospag;
		this.vlrdevpag = vlrdevpag;
		this.vlrparcpag = vlrparcpag;
		this.vlrpagopag = vlrpagopag;
		this.vlrapagpag = vlrapagpag;
		this.datapag = datapag;
		this.dtcomppag = dtcomppag;
		this.statuspag = statuspag;
		this.dtquitpag = dtquitpag;
		this.docpag = docpag;
		this.vlrpag = vlrpag;
		this.nroparcpag = nroparcpag;
		this.obspag = obspag;
		this.vlradicpag = vlradicpag;
		this.flag = flag;
		this.emmanut = emmanut;
		this.vlrbaseirrf = vlrbaseirrf;
		this.vlrbaseinss = vlrbaseinss;
		this.vlrretirrf = vlrretirrf;
		this.vlrretinss = vlrretinss;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnitpagars = fnitpagars;
		this.lffretes = lffretes;
	}

	public FnpagarId getId() {
		return this.id;
	}

	public void setId(FnpagarId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Cpordcompra getCpordcompra() {
		return this.cpordcompra;
	}

	public void setCpordcompra(Cpordcompra cpordcompra) {
		this.cpordcompra = cpordcompra;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public BigDecimal getVlrdescpag() {
		return this.vlrdescpag;
	}

	public void setVlrdescpag(BigDecimal vlrdescpag) {
		this.vlrdescpag = vlrdescpag;
	}

	public BigDecimal getVlrmultapag() {
		return this.vlrmultapag;
	}

	public void setVlrmultapag(BigDecimal vlrmultapag) {
		this.vlrmultapag = vlrmultapag;
	}

	public BigDecimal getVlrjurospag() {
		return this.vlrjurospag;
	}

	public void setVlrjurospag(BigDecimal vlrjurospag) {
		this.vlrjurospag = vlrjurospag;
	}

	public BigDecimal getVlrdevpag() {
		return this.vlrdevpag;
	}

	public void setVlrdevpag(BigDecimal vlrdevpag) {
		this.vlrdevpag = vlrdevpag;
	}

	public BigDecimal getVlrparcpag() {
		return this.vlrparcpag;
	}

	public void setVlrparcpag(BigDecimal vlrparcpag) {
		this.vlrparcpag = vlrparcpag;
	}

	public BigDecimal getVlrpagopag() {
		return this.vlrpagopag;
	}

	public void setVlrpagopag(BigDecimal vlrpagopag) {
		this.vlrpagopag = vlrpagopag;
	}

	public BigDecimal getVlrapagpag() {
		return this.vlrapagpag;
	}

	public void setVlrapagpag(BigDecimal vlrapagpag) {
		this.vlrapagpag = vlrapagpag;
	}

	public Date getDatapag() {
		return this.datapag;
	}

	public void setDatapag(Date datapag) {
		this.datapag = datapag;
	}

	public Date getDtcomppag() {
		return this.dtcomppag;
	}

	public void setDtcomppag(Date dtcomppag) {
		this.dtcomppag = dtcomppag;
	}

	public String getStatuspag() {
		return this.statuspag;
	}

	public void setStatuspag(String statuspag) {
		this.statuspag = statuspag;
	}

	public Date getDtquitpag() {
		return this.dtquitpag;
	}

	public void setDtquitpag(Date dtquitpag) {
		this.dtquitpag = dtquitpag;
	}

	public int getDocpag() {
		return this.docpag;
	}

	public void setDocpag(int docpag) {
		this.docpag = docpag;
	}

	public BigDecimal getVlrpag() {
		return this.vlrpag;
	}

	public void setVlrpag(BigDecimal vlrpag) {
		this.vlrpag = vlrpag;
	}

	public Integer getNroparcpag() {
		return this.nroparcpag;
	}

	public void setNroparcpag(Integer nroparcpag) {
		this.nroparcpag = nroparcpag;
	}

	public String getObspag() {
		return this.obspag;
	}

	public void setObspag(String obspag) {
		this.obspag = obspag;
	}

	public BigDecimal getVlradicpag() {
		return this.vlradicpag;
	}

	public void setVlradicpag(BigDecimal vlradicpag) {
		this.vlradicpag = vlradicpag;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public BigDecimal getVlrbaseirrf() {
		return this.vlrbaseirrf;
	}

	public void setVlrbaseirrf(BigDecimal vlrbaseirrf) {
		this.vlrbaseirrf = vlrbaseirrf;
	}

	public BigDecimal getVlrbaseinss() {
		return this.vlrbaseinss;
	}

	public void setVlrbaseinss(BigDecimal vlrbaseinss) {
		this.vlrbaseinss = vlrbaseinss;
	}

	public BigDecimal getVlrretirrf() {
		return this.vlrretirrf;
	}

	public void setVlrretirrf(BigDecimal vlrretirrf) {
		this.vlrretirrf = vlrretirrf;
	}

	public BigDecimal getVlrretinss() {
		return this.vlrretinss;
	}

	public void setVlrretinss(BigDecimal vlrretinss) {
		this.vlrretinss = vlrretinss;
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

	public Set getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	public Set getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set lffretes) {
		this.lffretes = lffretes;
	}

}

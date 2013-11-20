package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lfsittrib generated by hbm2java
 */
public class Lfsittrib implements java.io.Serializable {

	private LfsittribId id;
	private Sgfilial sgfilial;
	private String descsittrib;
	private char operacao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitvendasForLfitvendafklfsittribipi = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribpis = new HashSet(0);
	private Set lfitvendasForLfitvendafklfsittribpis = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribiss = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribcof = new HashSet(0);
	private Set lfitvendasForLfitvendafklfsittribcof = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribipi = new HashSet(0);

	public Lfsittrib() {
	}

	public Lfsittrib(LfsittribId id, Sgfilial sgfilial, String descsittrib,
			char operacao, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsittrib = descsittrib;
		this.operacao = operacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfsittrib(LfsittribId id, Sgfilial sgfilial, String descsittrib,
			char operacao, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt,
			Set lfitvendasForLfitvendafklfsittribipi,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribpis,
			Set lfitvendasForLfitvendafklfsittribpis,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribiss,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribcof,
			Set lfitvendasForLfitvendafklfsittribcof,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribipi) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsittrib = descsittrib;
		this.operacao = operacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitvendasForLfitvendafklfsittribipi = lfitvendasForLfitvendafklfsittribipi;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribpis = lfitclfiscalsForLfitclsfiscalfklfsittribpis;
		this.lfitvendasForLfitvendafklfsittribpis = lfitvendasForLfitvendafklfsittribpis;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribiss = lfitclfiscalsForLfitclsfiscalfklfsittribiss;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribcof = lfitclfiscalsForLfitclsfiscalfklfsittribcof;
		this.lfitvendasForLfitvendafklfsittribcof = lfitvendasForLfitvendafklfsittribcof;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribipi = lfitclfiscalsForLfitclsfiscalfklfsittribipi;
	}

	public LfsittribId getId() {
		return this.id;
	}

	public void setId(LfsittribId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescsittrib() {
		return this.descsittrib;
	}

	public void setDescsittrib(String descsittrib) {
		this.descsittrib = descsittrib;
	}

	public char getOperacao() {
		return this.operacao;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
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

	public Set getLfitvendasForLfitvendafklfsittribipi() {
		return this.lfitvendasForLfitvendafklfsittribipi;
	}

	public void setLfitvendasForLfitvendafklfsittribipi(
			Set lfitvendasForLfitvendafklfsittribipi) {
		this.lfitvendasForLfitvendafklfsittribipi = lfitvendasForLfitvendafklfsittribipi;
	}

	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribpis() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribpis;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribpis(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribpis) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribpis = lfitclfiscalsForLfitclsfiscalfklfsittribpis;
	}

	public Set getLfitvendasForLfitvendafklfsittribpis() {
		return this.lfitvendasForLfitvendafklfsittribpis;
	}

	public void setLfitvendasForLfitvendafklfsittribpis(
			Set lfitvendasForLfitvendafklfsittribpis) {
		this.lfitvendasForLfitvendafklfsittribpis = lfitvendasForLfitvendafklfsittribpis;
	}

	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribiss() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribiss;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribiss(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribiss) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribiss = lfitclfiscalsForLfitclsfiscalfklfsittribiss;
	}

	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribcof() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribcof;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribcof(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribcof) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribcof = lfitclfiscalsForLfitclsfiscalfklfsittribcof;
	}

	public Set getLfitvendasForLfitvendafklfsittribcof() {
		return this.lfitvendasForLfitvendafklfsittribcof;
	}

	public void setLfitvendasForLfitvendafklfsittribcof(
			Set lfitvendasForLfitvendafklfsittribcof) {
		this.lfitvendasForLfitvendafklfsittribcof = lfitvendasForLfitvendafklfsittribcof;
	}

	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribipi() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribipi;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribipi(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribipi) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribipi = lfitclfiscalsForLfitclsfiscalfklfsittribipi;
	}

}

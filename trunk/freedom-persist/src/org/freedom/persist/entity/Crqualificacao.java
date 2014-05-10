package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Crqualificacao generated by hbm2java
 */
public class Crqualificacao implements java.io.Serializable {

	private CrqualificacaoId id;
	private String descqualific;
	private char finaliza;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set crchamados = new HashSet(0);

	public Crqualificacao() {
	}

	public Crqualificacao(CrqualificacaoId id, String descqualific,
			char finaliza, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descqualific = descqualific;
		this.finaliza = finaliza;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crqualificacao(CrqualificacaoId id, String descqualific,
			char finaliza, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set crchamados) {
		this.id = id;
		this.descqualific = descqualific;
		this.finaliza = finaliza;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crchamados = crchamados;
	}

	public CrqualificacaoId getId() {
		return this.id;
	}

	public void setId(CrqualificacaoId id) {
		this.id = id;
	}

	public String getDescqualific() {
		return this.descqualific;
	}

	public void setDescqualific(String descqualific) {
		this.descqualific = descqualific;
	}

	public char getFinaliza() {
		return this.finaliza;
	}

	public void setFinaliza(char finaliza) {
		this.finaliza = finaliza;
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

	public Set getCrchamados() {
		return this.crchamados;
	}

	public void setCrchamados(Set crchamados) {
		this.crchamados = crchamados;
	}

}

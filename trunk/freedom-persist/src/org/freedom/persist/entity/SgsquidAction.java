package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SgsquidAction generated by hbm2java
 */
public class SgsquidAction implements java.io.Serializable {

	private long id;
	private String sigla;
	private String descricao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgsquidLogs = new HashSet(0);

	public SgsquidAction() {
	}

	public SgsquidAction(long id, String sigla, String descricao, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sigla = sigla;
		this.descricao = descricao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public SgsquidAction(long id, String sigla, String descricao, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgsquidLogs) {
		this.id = id;
		this.sigla = sigla;
		this.descricao = descricao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgsquidLogs = sgsquidLogs;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public Set getSgsquidLogs() {
		return this.sgsquidLogs;
	}

	public void setSgsquidLogs(Set sgsquidLogs) {
		this.sgsquidLogs = sgsquidLogs;
	}

}

package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fntalaocheq generated by hbm2java
 */
public class Fntalaocheq implements java.io.Serializable {

	private FntalaocheqId id;
	private Date dttalao;
	private int cheqinitalao;
	private int cheqfimtalao;
	private int cheqatualtalao;
	private char ativotalao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fntipocobs = new HashSet(0);

	public Fntalaocheq() {
	}

	public Fntalaocheq(FntalaocheqId id, Date dttalao, int cheqinitalao,
			int cheqfimtalao, int cheqatualtalao, char ativotalao, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.dttalao = dttalao;
		this.cheqinitalao = cheqinitalao;
		this.cheqfimtalao = cheqfimtalao;
		this.cheqatualtalao = cheqatualtalao;
		this.ativotalao = ativotalao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Fntalaocheq(FntalaocheqId id, Date dttalao, int cheqinitalao,
			int cheqfimtalao, int cheqatualtalao, char ativotalao, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set fntipocobs) {
		this.id = id;
		this.dttalao = dttalao;
		this.cheqinitalao = cheqinitalao;
		this.cheqfimtalao = cheqfimtalao;
		this.cheqatualtalao = cheqatualtalao;
		this.ativotalao = ativotalao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fntipocobs = fntipocobs;
	}

	public FntalaocheqId getId() {
		return this.id;
	}

	public void setId(FntalaocheqId id) {
		this.id = id;
	}

	public Date getDttalao() {
		return this.dttalao;
	}

	public void setDttalao(Date dttalao) {
		this.dttalao = dttalao;
	}

	public int getCheqinitalao() {
		return this.cheqinitalao;
	}

	public void setCheqinitalao(int cheqinitalao) {
		this.cheqinitalao = cheqinitalao;
	}

	public int getCheqfimtalao() {
		return this.cheqfimtalao;
	}

	public void setCheqfimtalao(int cheqfimtalao) {
		this.cheqfimtalao = cheqfimtalao;
	}

	public int getCheqatualtalao() {
		return this.cheqatualtalao;
	}

	public void setCheqatualtalao(int cheqatualtalao) {
		this.cheqatualtalao = cheqatualtalao;
	}

	public char getAtivotalao() {
		return this.ativotalao;
	}

	public void setAtivotalao(char ativotalao) {
		this.ativotalao = ativotalao;
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

	public Set getFntipocobs() {
		return this.fntipocobs;
	}

	public void setFntipocobs(Set fntipocobs) {
		this.fntipocobs = fntipocobs;
	}

}

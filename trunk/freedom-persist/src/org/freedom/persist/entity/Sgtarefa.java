package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgtarefa generated by hbm2java
 */
public class Sgtarefa implements java.io.Serializable {

	private SgtarefaId id;
	private String desctarefa;
	private int codempob;
	private int codobj;
	private String tipotarefa;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgtarefa() {
	}

	public Sgtarefa(SgtarefaId id, String desctarefa, int codempob, int codobj,
			String tipotarefa, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.desctarefa = desctarefa;
		this.codempob = codempob;
		this.codobj = codobj;
		this.tipotarefa = tipotarefa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgtarefa(SgtarefaId id, String desctarefa, int codempob, int codobj,
			String tipotarefa, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.desctarefa = desctarefa;
		this.codempob = codempob;
		this.codobj = codobj;
		this.tipotarefa = tipotarefa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SgtarefaId getId() {
		return this.id;
	}

	public void setId(SgtarefaId id) {
		this.id = id;
	}

	public String getDesctarefa() {
		return this.desctarefa;
	}

	public void setDesctarefa(String desctarefa) {
		this.desctarefa = desctarefa;
	}

	public int getCodempob() {
		return this.codempob;
	}

	public void setCodempob(int codempob) {
		this.codempob = codempob;
	}

	public int getCodobj() {
		return this.codobj;
	}

	public void setCodobj(int codobj) {
		this.codobj = codobj;
	}

	public String getTipotarefa() {
		return this.tipotarefa;
	}

	public void setTipotarefa(String tipotarefa) {
		this.tipotarefa = tipotarefa;
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

}

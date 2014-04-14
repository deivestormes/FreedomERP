package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sglog generated by hbm2java
 */
public class Sglog implements java.io.Serializable {

	private SglogId id;
	private Pvcaixa pvcaixa;
	private Sgusuario sgusuario;
	private Date datalog;
	private Date horalog;
	private String claslog;
	private String tipolog;
	private String desclog;
	private String obslog;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vditorcamentos = new HashSet(0);
	private Set vditvendas = new HashSet(0);

	public Sglog() {
	}

	public Sglog(SglogId id, Pvcaixa pvcaixa, Sgusuario sgusuario,
			Date datalog, Date horalog, String claslog, String tipolog,
			String desclog, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.sgusuario = sgusuario;
		this.datalog = datalog;
		this.horalog = horalog;
		this.claslog = claslog;
		this.tipolog = tipolog;
		this.desclog = desclog;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sglog(SglogId id, Pvcaixa pvcaixa, Sgusuario sgusuario,
			Date datalog, Date horalog, String claslog, String tipolog,
			String desclog, String obslog, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vditorcamentos, Set vditvendas) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.sgusuario = sgusuario;
		this.datalog = datalog;
		this.horalog = horalog;
		this.claslog = claslog;
		this.tipolog = tipolog;
		this.desclog = desclog;
		this.obslog = obslog;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vditorcamentos = vditorcamentos;
		this.vditvendas = vditvendas;
	}

	public SglogId getId() {
		return this.id;
	}

	public void setId(SglogId id) {
		this.id = id;
	}

	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	public Date getDatalog() {
		return this.datalog;
	}

	public void setDatalog(Date datalog) {
		this.datalog = datalog;
	}

	public Date getHoralog() {
		return this.horalog;
	}

	public void setHoralog(Date horalog) {
		this.horalog = horalog;
	}

	public String getClaslog() {
		return this.claslog;
	}

	public void setClaslog(String claslog) {
		this.claslog = claslog;
	}

	public String getTipolog() {
		return this.tipolog;
	}

	public void setTipolog(String tipolog) {
		this.tipolog = tipolog;
	}

	public String getDesclog() {
		return this.desclog;
	}

	public void setDesclog(String desclog) {
		this.desclog = desclog;
	}

	public String getObslog() {
		return this.obslog;
	}

	public void setObslog(String obslog) {
		this.obslog = obslog;
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

	public Set getVditorcamentos() {
		return this.vditorcamentos;
	}

	public void setVditorcamentos(Set vditorcamentos) {
		this.vditorcamentos = vditorcamentos;
	}

	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

}

package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Crchamadoanexo generated by hbm2java
 */
public class Crchamadoanexo implements java.io.Serializable {

	private CrchamadoanexoId id;
	private Crchamado crchamado;
	private String descanexo;
	private String anexo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Crchamadoanexo() {
	}

	public Crchamadoanexo(CrchamadoanexoId id, Crchamado crchamado, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.crchamado = crchamado;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crchamadoanexo(CrchamadoanexoId id, Crchamado crchamado,
			String descanexo, String anexo, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.crchamado = crchamado;
		this.descanexo = descanexo;
		this.anexo = anexo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CrchamadoanexoId getId() {
		return this.id;
	}

	public void setId(CrchamadoanexoId id) {
		this.id = id;
	}

	public Crchamado getCrchamado() {
		return this.crchamado;
	}

	public void setCrchamado(Crchamado crchamado) {
		this.crchamado = crchamado;
	}

	public String getDescanexo() {
		return this.descanexo;
	}

	public void setDescanexo(String descanexo) {
		this.descanexo = descanexo;
	}

	public String getAnexo() {
		return this.anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
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

package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Crchamadoanexo generated by hbm2java
 */
@Entity
@Table(name = "CRCHAMADOANEXO")
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

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codchamado", column = @Column(name = "CODCHAMADO", nullable = false)),
			@AttributeOverride(name = "codanexo", column = @Column(name = "CODANEXO", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)) })
	public CrchamadoanexoId getId() {
		return this.id;
	}

	public void setId(CrchamadoanexoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCHAMADO", referencedColumnName = "CODCHAMADO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Crchamado getCrchamado() {
		return this.crchamado;
	}

	public void setCrchamado(Crchamado crchamado) {
		this.crchamado = crchamado;
	}

	@Column(name = "DESCANEXO", length = 200)
	public String getDescanexo() {
		return this.descanexo;
	}

	public void setDescanexo(String descanexo) {
		this.descanexo = descanexo;
	}

	@Column(name = "ANEXO", length = 0)
	public String getAnexo() {
		return this.anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
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

}

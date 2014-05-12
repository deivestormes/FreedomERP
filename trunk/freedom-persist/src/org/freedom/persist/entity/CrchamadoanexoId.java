package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrchamadoanexoId generated by hbm2java
 */
@Embeddable
public class CrchamadoanexoId implements java.io.Serializable {

	private int codchamado;
	private short codanexo;
	private int codemp;
	private short codfilial;

	public CrchamadoanexoId() {
	}

	public CrchamadoanexoId(int codchamado, short codanexo, int codemp,
			short codfilial) {
		this.codchamado = codchamado;
		this.codanexo = codanexo;
		this.codemp = codemp;
		this.codfilial = codfilial;
	}

	@Column(name = "CODCHAMADO", nullable = false)
	public int getCodchamado() {
		return this.codchamado;
	}

	public void setCodchamado(int codchamado) {
		this.codchamado = codchamado;
	}

	@Column(name = "CODANEXO", nullable = false)
	public short getCodanexo() {
		return this.codanexo;
	}

	public void setCodanexo(short codanexo) {
		this.codanexo = codanexo;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrchamadoanexoId))
			return false;
		CrchamadoanexoId castOther = (CrchamadoanexoId) other;

		return (this.getCodchamado() == castOther.getCodchamado())
				&& (this.getCodanexo() == castOther.getCodanexo())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodchamado();
		result = 37 * result + this.getCodanexo();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		return result;
	}

}

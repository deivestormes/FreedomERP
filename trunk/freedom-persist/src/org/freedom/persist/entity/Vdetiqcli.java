package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vdetiqcli generated by hbm2java
 */
@Entity
@Table(name = "VDETIQCLI")
public class Vdetiqcli implements java.io.Serializable {

	private VdetiqcliId id;

	public Vdetiqcli() {
	}

	public Vdetiqcli(VdetiqcliId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nrconexao", column = @Column(name = "NRCONEXAO", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI", nullable = false)),
			@AttributeOverride(name = "dtins", column = @Column(name = "DTINS", nullable = false, length = 10)),
			@AttributeOverride(name = "hins", column = @Column(name = "HINS", nullable = false, length = 8)),
			@AttributeOverride(name = "idusuins", column = @Column(name = "IDUSUINS", nullable = false, length = 8)),
			@AttributeOverride(name = "dtalt", column = @Column(name = "DTALT", length = 10)),
			@AttributeOverride(name = "halt", column = @Column(name = "HALT", length = 8)),
			@AttributeOverride(name = "idusualt", column = @Column(name = "IDUSUALT", length = 8)) })
	public VdetiqcliId getId() {
		return this.id;
	}

	public void setId(VdetiqcliId id) {
		this.id = id;
	}

}

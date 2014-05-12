package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Sgdebug generated by hbm2java
 */
@Entity
@Table(name = "SGDEBUG", uniqueConstraints = @UniqueConstraint(columnNames = "SEQ"))
public class Sgdebug implements java.io.Serializable {

	private SgdebugId id;

	public Sgdebug() {
	}

	public Sgdebug(SgdebugId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", unique = true, nullable = false)),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", length = 10)),
			@AttributeOverride(name = "hora", column = @Column(name = "HORA", length = 8)),
			@AttributeOverride(name = "rotina", column = @Column(name = "ROTINA", length = 60)),
			@AttributeOverride(name = "texto", column = @Column(name = "TEXTO", length = 100)) })
	public SgdebugId getId() {
		return this.id;
	}

	public void setId(SgdebugId id) {
		this.id = id;
	}

}

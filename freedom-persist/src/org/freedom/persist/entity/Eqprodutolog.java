package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Eqprodutolog generated by hbm2java
 */
@Entity
@Table(name = "EQPRODUTOLOG")
public class Eqprodutolog implements java.io.Serializable {

	private EqprodutologId id;

	public Eqprodutolog() {
	}

	public Eqprodutolog(EqprodutologId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "precobaseprodant", column = @Column(name = "PRECOBASEPRODANT", nullable = false, precision = 15, scale = 5)),
			@AttributeOverride(name = "precobaseprodnovo", column = @Column(name = "PRECOBASEPRODNOVO", nullable = false, precision = 15, scale = 5)),
			@AttributeOverride(name = "seqlog", column = @Column(name = "SEQLOG", nullable = false)),
			@AttributeOverride(name = "precoproc", column = @Column(name = "PRECOPROC", nullable = false, length = 1)),
			@AttributeOverride(name = "dtins", column = @Column(name = "DTINS", nullable = false, length = 10)),
			@AttributeOverride(name = "hins", column = @Column(name = "HINS", nullable = false, length = 8)),
			@AttributeOverride(name = "idusuins", column = @Column(name = "IDUSUINS", nullable = false, length = 8)),
			@AttributeOverride(name = "dtalt", column = @Column(name = "DTALT", length = 10)),
			@AttributeOverride(name = "halt", column = @Column(name = "HALT", length = 8)),
			@AttributeOverride(name = "idusualt", column = @Column(name = "IDUSUALT", length = 8)) })
	public EqprodutologId getId() {
		return this.id;
	}

	public void setId(EqprodutologId id) {
		this.id = id;
	}

}
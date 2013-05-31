package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Pplistaopvw01 generated by hbm2java
 */
@Entity
@Table(name = "PPLISTAOPVW01")
public class Pplistaopvw01 implements java.io.Serializable {

	private Pplistaopvw01Id id;

	public Pplistaopvw01() {
	}

	public Pplistaopvw01(Pplistaopvw01Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP")),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL")),
			@AttributeOverride(name = "dtemitop", column = @Column(name = "DTEMITOP", length = 10)),
			@AttributeOverride(name = "dtfabrop", column = @Column(name = "DTFABROP", length = 10)),
			@AttributeOverride(name = "codop", column = @Column(name = "CODOP")),
			@AttributeOverride(name = "seqop", column = @Column(name = "SEQOP")),
			@AttributeOverride(name = "descest", column = @Column(name = "DESCEST", length = 50)),
			@AttributeOverride(name = "sitop", column = @Column(name = "SITOP", length = 2)),
			@AttributeOverride(name = "tempotot", column = @Column(name = "TEMPOTOT", precision = 0, scale = 5)),
			@AttributeOverride(name = "tempofin", column = @Column(name = "TEMPOFIN", precision = 0, scale = 5)),
			@AttributeOverride(name = "faseatual", column = @Column(name = "FASEATUAL")),
			@AttributeOverride(name = "totfases", column = @Column(name = "TOTFASES")),
			@AttributeOverride(name = "qtdsug", column = @Column(name = "QTDSUG", precision = 15, scale = 5)),
			@AttributeOverride(name = "qtdprev", column = @Column(name = "QTDPREV", precision = 15, scale = 5)),
			@AttributeOverride(name = "qtdfinal", column = @Column(name = "QTDFINAL", precision = 15, scale = 5)),
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD")),
			@AttributeOverride(name = "refprod", column = @Column(name = "REFPROD", length = 20)),
			@AttributeOverride(name = "codsecao", column = @Column(name = "CODSECAO", length = 13)) })
	public Pplistaopvw01Id getId() {
		return this.id;
	}

	public void setId(Pplistaopvw01Id id) {
		this.id = id;
	}

}

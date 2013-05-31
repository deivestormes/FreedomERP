package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Eqconfestoqvw01 generated by hbm2java
 */
@Entity
@Table(name = "EQCONFESTOQVW01")
public class Eqconfestoqvw01 implements java.io.Serializable {

	private Eqconfestoqvw01Id id;

	public Eqconfestoqvw01() {
	}

	public Eqconfestoqvw01(Eqconfestoqvw01Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP")),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL")),
			@AttributeOverride(name = "ativoprod", column = @Column(name = "ATIVOPROD", length = 1)),
			@AttributeOverride(name = "descprod", column = @Column(name = "DESCPROD", length = 100)),
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD")),
			@AttributeOverride(name = "refprod", column = @Column(name = "REFPROD", length = 20)),
			@AttributeOverride(name = "sldliqprod", column = @Column(name = "SLDLIQPROD", precision = 15, scale = 5)),
			@AttributeOverride(name = "qtdinvp", column = @Column(name = "QTDINVP", precision = 0, scale = 5)),
			@AttributeOverride(name = "qtditcompra", column = @Column(name = "QTDITCOMPRA", precision = 0, scale = 5)),
			@AttributeOverride(name = "qtdfinalprodop", column = @Column(name = "QTDFINALPRODOP", precision = 0, scale = 5)),
			@AttributeOverride(name = "qtdexpitrma", column = @Column(name = "QTDEXPITRMA", precision = 0, scale = 5)),
			@AttributeOverride(name = "qtditvenda", column = @Column(name = "QTDITVENDA", precision = 0, scale = 5)),
			@AttributeOverride(name = "sldmovprod", column = @Column(name = "SLDMOVPROD", precision = 0, scale = 5)),
			@AttributeOverride(name = "sldliqprodax", column = @Column(name = "SLDLIQPRODAX", precision = 0, scale = 5)) })
	public Eqconfestoqvw01Id getId() {
		return this.id;
	}

	public void setId(Eqconfestoqvw01Id id) {
		this.id = id;
	}

}

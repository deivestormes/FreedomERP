package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Atatendimentovw02 generated by hbm2java
 */
@Entity
@Table(name = "ATATENDIMENTOVW02")
public class Atatendimentovw02 implements java.io.Serializable {

	private Atatendimentovw02Id id;

	public Atatendimentovw02() {
	}

	public Atatendimentovw02(Atatendimentovw02Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP")),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL")),
			@AttributeOverride(name = "codatendo", column = @Column(name = "CODATENDO")),
			@AttributeOverride(name = "codempae", column = @Column(name = "CODEMPAE")),
			@AttributeOverride(name = "codfilialae", column = @Column(name = "CODFILIALAE")),
			@AttributeOverride(name = "codatend", column = @Column(name = "CODATEND")),
			@AttributeOverride(name = "nomeatend", column = @Column(name = "NOMEATEND", length = 50)),
			@AttributeOverride(name = "partpremiatend", column = @Column(name = "PARTPREMIATEND", length = 1)),
			@AttributeOverride(name = "codempep", column = @Column(name = "CODEMPEP")),
			@AttributeOverride(name = "codfilialep", column = @Column(name = "CODFILIALEP")),
			@AttributeOverride(name = "matempr", column = @Column(name = "MATEMPR")),
			@AttributeOverride(name = "codempea", column = @Column(name = "CODEMPEA")),
			@AttributeOverride(name = "codfilialea", column = @Column(name = "CODFILIALEA")),
			@AttributeOverride(name = "codespec", column = @Column(name = "CODESPEC")),
			@AttributeOverride(name = "descespec", column = @Column(name = "DESCESPEC", length = 100)),
			@AttributeOverride(name = "codempct", column = @Column(name = "CODEMPCT")),
			@AttributeOverride(name = "codfilialct", column = @Column(name = "CODFILIALCT")),
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR")),
			@AttributeOverride(name = "coditcontr", column = @Column(name = "CODITCONTR")),
			@AttributeOverride(name = "codempta", column = @Column(name = "CODEMPTA")),
			@AttributeOverride(name = "codfilialta", column = @Column(name = "CODFILIALTA")),
			@AttributeOverride(name = "codtarefa", column = @Column(name = "CODTAREFA")),
			@AttributeOverride(name = "tpcobcontr", column = @Column(name = "TPCOBCONTR", length = 2)),
			@AttributeOverride(name = "anoatendo", column = @Column(name = "ANOATENDO")),
			@AttributeOverride(name = "mesatendo", column = @Column(name = "MESATENDO")),
			@AttributeOverride(name = "qtdcontr", column = @Column(name = "QTDCONTR", precision = 0, scale = 5)),
			@AttributeOverride(name = "qtditcontr", column = @Column(name = "QTDITCONTR", precision = 15, scale = 5)),
			@AttributeOverride(name = "vlritcontr", column = @Column(name = "VLRITCONTR", precision = 15, scale = 5)),
			@AttributeOverride(name = "vlritcontrexced", column = @Column(name = "VLRITCONTREXCED", precision = 15, scale = 5)),
			@AttributeOverride(name = "dtinicio", column = @Column(name = "DTINICIO", length = 10)),
			@AttributeOverride(name = "statusatendo", column = @Column(name = "STATUSATENDO", length = 2)),
			@AttributeOverride(name = "razcli", column = @Column(name = "RAZCLI", length = 60)),
			@AttributeOverride(name = "nomecli", column = @Column(name = "NOMECLI", length = 50)),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI")),
			@AttributeOverride(name = "codempcl", column = @Column(name = "CODEMPCL")),
			@AttributeOverride(name = "codfilialcl", column = @Column(name = "CODFILIALCL")),
			@AttributeOverride(name = "codempch", column = @Column(name = "CODEMPCH")),
			@AttributeOverride(name = "codfilialch", column = @Column(name = "CODFILIALCH")),
			@AttributeOverride(name = "codchamado", column = @Column(name = "CODCHAMADO")),
			@AttributeOverride(name = "descchamado", column = @Column(name = "DESCCHAMADO", length = 100)),
			@AttributeOverride(name = "codempto", column = @Column(name = "CODEMPTO")),
			@AttributeOverride(name = "codfilialto", column = @Column(name = "CODFILIALTO")),
			@AttributeOverride(name = "codtpatendo", column = @Column(name = "CODTPATENDO")),
			@AttributeOverride(name = "desctpatendo", column = @Column(name = "DESCTPATENDO", length = 50)),
			@AttributeOverride(name = "obsatendo", column = @Column(name = "OBSATENDO", length = 10000)),
			@AttributeOverride(name = "dataatendo", column = @Column(name = "DATAATENDO", length = 10)),
			@AttributeOverride(name = "dataatendofin", column = @Column(name = "DATAATENDOFIN", length = 10)),
			@AttributeOverride(name = "horaatendo", column = @Column(name = "HORAATENDO", length = 8)),
			@AttributeOverride(name = "horaatendofin", column = @Column(name = "HORAATENDOFIN", length = 8)),
			@AttributeOverride(name = "pgcomiespec", column = @Column(name = "PGCOMIESPEC", length = 1)),
			@AttributeOverride(name = "cobcliespec", column = @Column(name = "COBCLIESPEC", length = 1)),
			@AttributeOverride(name = "contmetaespec", column = @Column(name = "CONTMETAESPEC", length = 1)),
			@AttributeOverride(name = "mrelcobespec", column = @Column(name = "MRELCOBESPEC", length = 1)),
			@AttributeOverride(name = "bhespec", column = @Column(name = "BHESPEC", length = 1)),
			@AttributeOverride(name = "tempomincobespec", column = @Column(name = "TEMPOMINCOBESPEC")),
			@AttributeOverride(name = "tempomaxcobespec", column = @Column(name = "TEMPOMAXCOBESPEC")),
			@AttributeOverride(name = "perccomiespec", column = @Column(name = "PERCCOMIESPEC", precision = 15, scale = 5)),
			@AttributeOverride(name = "totalmin", column = @Column(name = "TOTALMIN", precision = 0, scale = 4)),
			@AttributeOverride(name = "totalgeral", column = @Column(name = "TOTALGERAL", precision = 0, scale = 4)),
			@AttributeOverride(name = "totalmeta", column = @Column(name = "TOTALMETA", precision = 0, scale = 4)),
			@AttributeOverride(name = "totalcomis", column = @Column(name = "TOTALCOMIS", precision = 0, scale = 4)),
			@AttributeOverride(name = "totalcobcli", column = @Column(name = "TOTALCOBCLI", precision = 0, scale = 4)),
			@AttributeOverride(name = "totalbh", column = @Column(name = "TOTALBH", precision = 0, scale = 4)),
			@AttributeOverride(name = "sitrevatendo", column = @Column(name = "SITREVATENDO", length = 2)),
			@AttributeOverride(name = "tipoatendo", column = @Column(name = "TIPOATENDO", length = 1)),
			@AttributeOverride(name = "docatendo", column = @Column(name = "DOCATENDO")),
			@AttributeOverride(name = "codempoc", column = @Column(name = "CODEMPOC")),
			@AttributeOverride(name = "codfilialoc", column = @Column(name = "CODFILIALOC")),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", length = 1)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC")) })
	public Atatendimentovw02Id getId() {
		return this.id;
	}

	public void setId(Atatendimentovw02Id id) {
		this.id = id;
	}

}

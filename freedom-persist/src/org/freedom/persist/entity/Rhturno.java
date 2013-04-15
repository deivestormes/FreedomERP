package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rhturno generated by hbm2java
 */
@Entity
@Table(name = "RHTURNO")
public class Rhturno implements java.io.Serializable {

	private RhturnoId id;
	private String descturno;
	private short nhsturno;
	private char tipoturno;
	private Date hiniturno;
	private Date hfimturno;
	private Date hiniintturno;
	private Date hfimintturno;
	private short tolentrada;
	private short tolsaida;
	private char trabsabturno;
	private char trabdomturno;
	private BigDecimal percbhtbsabturno;
	private BigDecimal percbhtbdomturno;
	private BigDecimal percbhtbferturno;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Rhexpedmes> rhexpedmeses = new HashSet<Rhexpedmes>(0);
	private Set<Rhempregado> rhempregados = new HashSet<Rhempregado>(0);
	private Set<Rhvaga> rhvagas = new HashSet<Rhvaga>(0);
	private Set<Rhexpediente> rhexpedientes = new HashSet<Rhexpediente>(0);

	public Rhturno() {
	}

	public Rhturno(RhturnoId id, String descturno, short nhsturno,
			char tipoturno, Date hiniturno, Date hfimturno, short tolentrada,
			short tolsaida, char trabsabturno, char trabdomturno,
			BigDecimal percbhtbsabturno, BigDecimal percbhtbdomturno,
			BigDecimal percbhtbferturno, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descturno = descturno;
		this.nhsturno = nhsturno;
		this.tipoturno = tipoturno;
		this.hiniturno = hiniturno;
		this.hfimturno = hfimturno;
		this.tolentrada = tolentrada;
		this.tolsaida = tolsaida;
		this.trabsabturno = trabsabturno;
		this.trabdomturno = trabdomturno;
		this.percbhtbsabturno = percbhtbsabturno;
		this.percbhtbdomturno = percbhtbdomturno;
		this.percbhtbferturno = percbhtbferturno;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhturno(RhturnoId id, String descturno, short nhsturno,
			char tipoturno, Date hiniturno, Date hfimturno, Date hiniintturno,
			Date hfimintturno, short tolentrada, short tolsaida,
			char trabsabturno, char trabdomturno, BigDecimal percbhtbsabturno,
			BigDecimal percbhtbdomturno, BigDecimal percbhtbferturno,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Rhexpedmes> rhexpedmeses,
			Set<Rhempregado> rhempregados, Set<Rhvaga> rhvagas,
			Set<Rhexpediente> rhexpedientes) {
		this.id = id;
		this.descturno = descturno;
		this.nhsturno = nhsturno;
		this.tipoturno = tipoturno;
		this.hiniturno = hiniturno;
		this.hfimturno = hfimturno;
		this.hiniintturno = hiniintturno;
		this.hfimintturno = hfimintturno;
		this.tolentrada = tolentrada;
		this.tolsaida = tolsaida;
		this.trabsabturno = trabsabturno;
		this.trabdomturno = trabdomturno;
		this.percbhtbsabturno = percbhtbsabturno;
		this.percbhtbdomturno = percbhtbdomturno;
		this.percbhtbferturno = percbhtbferturno;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhexpedmeses = rhexpedmeses;
		this.rhempregados = rhempregados;
		this.rhvagas = rhvagas;
		this.rhexpedientes = rhexpedientes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codturno", column = @Column(name = "CODTURNO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public RhturnoId getId() {
		return this.id;
	}

	public void setId(RhturnoId id) {
		this.id = id;
	}

	@Column(name = "DESCTURNO", nullable = false, length = 60)
	public String getDescturno() {
		return this.descturno;
	}

	public void setDescturno(String descturno) {
		this.descturno = descturno;
	}

	@Column(name = "NHSTURNO", nullable = false)
	public short getNhsturno() {
		return this.nhsturno;
	}

	public void setNhsturno(short nhsturno) {
		this.nhsturno = nhsturno;
	}

	@Column(name = "TIPOTURNO", nullable = false, length = 1)
	public char getTipoturno() {
		return this.tipoturno;
	}

	public void setTipoturno(char tipoturno) {
		this.tipoturno = tipoturno;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINITURNO", nullable = false, length = 8)
	public Date getHiniturno() {
		return this.hiniturno;
	}

	public void setHiniturno(Date hiniturno) {
		this.hiniturno = hiniturno;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HFIMTURNO", nullable = false, length = 8)
	public Date getHfimturno() {
		return this.hfimturno;
	}

	public void setHfimturno(Date hfimturno) {
		this.hfimturno = hfimturno;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINIINTTURNO", length = 8)
	public Date getHiniintturno() {
		return this.hiniintturno;
	}

	public void setHiniintturno(Date hiniintturno) {
		this.hiniintturno = hiniintturno;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HFIMINTTURNO", length = 8)
	public Date getHfimintturno() {
		return this.hfimintturno;
	}

	public void setHfimintturno(Date hfimintturno) {
		this.hfimintturno = hfimintturno;
	}

	@Column(name = "TOLENTRADA", nullable = false)
	public short getTolentrada() {
		return this.tolentrada;
	}

	public void setTolentrada(short tolentrada) {
		this.tolentrada = tolentrada;
	}

	@Column(name = "TOLSAIDA", nullable = false)
	public short getTolsaida() {
		return this.tolsaida;
	}

	public void setTolsaida(short tolsaida) {
		this.tolsaida = tolsaida;
	}

	@Column(name = "TRABSABTURNO", nullable = false, length = 1)
	public char getTrabsabturno() {
		return this.trabsabturno;
	}

	public void setTrabsabturno(char trabsabturno) {
		this.trabsabturno = trabsabturno;
	}

	@Column(name = "TRABDOMTURNO", nullable = false, length = 1)
	public char getTrabdomturno() {
		return this.trabdomturno;
	}

	public void setTrabdomturno(char trabdomturno) {
		this.trabdomturno = trabdomturno;
	}

	@Column(name = "PERCBHTBSABTURNO", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPercbhtbsabturno() {
		return this.percbhtbsabturno;
	}

	public void setPercbhtbsabturno(BigDecimal percbhtbsabturno) {
		this.percbhtbsabturno = percbhtbsabturno;
	}

	@Column(name = "PERCBHTBDOMTURNO", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPercbhtbdomturno() {
		return this.percbhtbdomturno;
	}

	public void setPercbhtbdomturno(BigDecimal percbhtbdomturno) {
		this.percbhtbdomturno = percbhtbdomturno;
	}

	@Column(name = "PERCBHTBFERTURNO", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPercbhtbferturno() {
		return this.percbhtbferturno;
	}

	public void setPercbhtbferturno(BigDecimal percbhtbferturno) {
		this.percbhtbferturno = percbhtbferturno;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhturno")
	public Set<Rhexpedmes> getRhexpedmeses() {
		return this.rhexpedmeses;
	}

	public void setRhexpedmeses(Set<Rhexpedmes> rhexpedmeses) {
		this.rhexpedmeses = rhexpedmeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhturno")
	public Set<Rhempregado> getRhempregados() {
		return this.rhempregados;
	}

	public void setRhempregados(Set<Rhempregado> rhempregados) {
		this.rhempregados = rhempregados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhturno")
	public Set<Rhvaga> getRhvagas() {
		return this.rhvagas;
	}

	public void setRhvagas(Set<Rhvaga> rhvagas) {
		this.rhvagas = rhvagas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhturno")
	public Set<Rhexpediente> getRhexpedientes() {
		return this.rhexpedientes;
	}

	public void setRhexpedientes(Set<Rhexpediente> rhexpedientes) {
		this.rhexpedientes = rhexpedientes;
	}

}
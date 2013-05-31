package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vdfretevd generated by hbm2java
 */
@Entity
@Table(name = "VDFRETEVD")
public class Vdfretevd implements java.io.Serializable {

	private VdfretevdId id;
	private Vdvenda vdvenda;
	private Vdtransp vdtransp;
	private char tipofretevd;
	private String placafretevd;
	private String uffretevd;
	private BigDecimal vlrfretevd;
	private BigDecimal qtdfretevd;
	private BigDecimal pesobrutvd;
	private BigDecimal pesoliqvd;
	private String espfretevd;
	private String marcafretevd;
	private String conhecfretevd;
	private BigDecimal percvendafretevd;
	private Character flag;
	private char adicfretevd;
	private char adicfretebaseicm;
	private BigDecimal vlrbaseicmsfretevd;
	private BigDecimal aliqicmsfretevd;
	private BigDecimal vlricmsfretevd;
	private BigDecimal vlrsegfretevd;
	private String rntcvd;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdfretevd() {
	}

	public Vdfretevd(Vdvenda vdvenda, char tipofretevd, String placafretevd,
			String uffretevd, BigDecimal vlrfretevd, BigDecimal qtdfretevd,
			BigDecimal pesobrutvd, BigDecimal pesoliqvd, String espfretevd,
			String marcafretevd, char adicfretevd, char adicfretebaseicm,
			Date dtins, Date hins, String idusuins) {
		this.vdvenda = vdvenda;
		this.tipofretevd = tipofretevd;
		this.placafretevd = placafretevd;
		this.uffretevd = uffretevd;
		this.vlrfretevd = vlrfretevd;
		this.qtdfretevd = qtdfretevd;
		this.pesobrutvd = pesobrutvd;
		this.pesoliqvd = pesoliqvd;
		this.espfretevd = espfretevd;
		this.marcafretevd = marcafretevd;
		this.adicfretevd = adicfretevd;
		this.adicfretebaseicm = adicfretebaseicm;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdfretevd(Vdvenda vdvenda, Vdtransp vdtransp, char tipofretevd,
			String placafretevd, String uffretevd, BigDecimal vlrfretevd,
			BigDecimal qtdfretevd, BigDecimal pesobrutvd, BigDecimal pesoliqvd,
			String espfretevd, String marcafretevd, String conhecfretevd,
			BigDecimal percvendafretevd, Character flag, char adicfretevd,
			char adicfretebaseicm, BigDecimal vlrbaseicmsfretevd,
			BigDecimal aliqicmsfretevd, BigDecimal vlricmsfretevd,
			BigDecimal vlrsegfretevd, String rntcvd, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.vdvenda = vdvenda;
		this.vdtransp = vdtransp;
		this.tipofretevd = tipofretevd;
		this.placafretevd = placafretevd;
		this.uffretevd = uffretevd;
		this.vlrfretevd = vlrfretevd;
		this.qtdfretevd = qtdfretevd;
		this.pesobrutvd = pesobrutvd;
		this.pesoliqvd = pesoliqvd;
		this.espfretevd = espfretevd;
		this.marcafretevd = marcafretevd;
		this.conhecfretevd = conhecfretevd;
		this.percvendafretevd = percvendafretevd;
		this.flag = flag;
		this.adicfretevd = adicfretevd;
		this.adicfretebaseicm = adicfretebaseicm;
		this.vlrbaseicmsfretevd = vlrbaseicmsfretevd;
		this.aliqicmsfretevd = aliqicmsfretevd;
		this.vlricmsfretevd = vlricmsfretevd;
		this.vlrsegfretevd = vlrsegfretevd;
		this.rntcvd = rntcvd;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdfretevdId getId() {
		return this.id;
	}

	public void setId(VdfretevdId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@Column(name = "TIPOFRETEVD", nullable = false, length = 1)
	public char getTipofretevd() {
		return this.tipofretevd;
	}

	public void setTipofretevd(char tipofretevd) {
		this.tipofretevd = tipofretevd;
	}

	@Column(name = "PLACAFRETEVD", nullable = false, length = 10)
	public String getPlacafretevd() {
		return this.placafretevd;
	}

	public void setPlacafretevd(String placafretevd) {
		this.placafretevd = placafretevd;
	}

	@Column(name = "UFFRETEVD", nullable = false, length = 2)
	public String getUffretevd() {
		return this.uffretevd;
	}

	public void setUffretevd(String uffretevd) {
		this.uffretevd = uffretevd;
	}

	@Column(name = "VLRFRETEVD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrfretevd() {
		return this.vlrfretevd;
	}

	public void setVlrfretevd(BigDecimal vlrfretevd) {
		this.vlrfretevd = vlrfretevd;
	}

	@Column(name = "QTDFRETEVD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdfretevd() {
		return this.qtdfretevd;
	}

	public void setQtdfretevd(BigDecimal qtdfretevd) {
		this.qtdfretevd = qtdfretevd;
	}

	@Column(name = "PESOBRUTVD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPesobrutvd() {
		return this.pesobrutvd;
	}

	public void setPesobrutvd(BigDecimal pesobrutvd) {
		this.pesobrutvd = pesobrutvd;
	}

	@Column(name = "PESOLIQVD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPesoliqvd() {
		return this.pesoliqvd;
	}

	public void setPesoliqvd(BigDecimal pesoliqvd) {
		this.pesoliqvd = pesoliqvd;
	}

	@Column(name = "ESPFRETEVD", nullable = false, length = 10)
	public String getEspfretevd() {
		return this.espfretevd;
	}

	public void setEspfretevd(String espfretevd) {
		this.espfretevd = espfretevd;
	}

	@Column(name = "MARCAFRETEVD", nullable = false, length = 10)
	public String getMarcafretevd() {
		return this.marcafretevd;
	}

	public void setMarcafretevd(String marcafretevd) {
		this.marcafretevd = marcafretevd;
	}

	@Column(name = "CONHECFRETEVD", length = 13)
	public String getConhecfretevd() {
		return this.conhecfretevd;
	}

	public void setConhecfretevd(String conhecfretevd) {
		this.conhecfretevd = conhecfretevd;
	}

	@Column(name = "PERCVENDAFRETEVD", precision = 9)
	public BigDecimal getPercvendafretevd() {
		return this.percvendafretevd;
	}

	public void setPercvendafretevd(BigDecimal percvendafretevd) {
		this.percvendafretevd = percvendafretevd;
	}

	@Column(name = "FLAG", length = 1)
	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	@Column(name = "ADICFRETEVD", nullable = false, length = 1)
	public char getAdicfretevd() {
		return this.adicfretevd;
	}

	public void setAdicfretevd(char adicfretevd) {
		this.adicfretevd = adicfretevd;
	}

	@Column(name = "ADICFRETEBASEICM", nullable = false, length = 1)
	public char getAdicfretebaseicm() {
		return this.adicfretebaseicm;
	}

	public void setAdicfretebaseicm(char adicfretebaseicm) {
		this.adicfretebaseicm = adicfretebaseicm;
	}

	@Column(name = "VLRBASEICMSFRETEVD", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsfretevd() {
		return this.vlrbaseicmsfretevd;
	}

	public void setVlrbaseicmsfretevd(BigDecimal vlrbaseicmsfretevd) {
		this.vlrbaseicmsfretevd = vlrbaseicmsfretevd;
	}

	@Column(name = "ALIQICMSFRETEVD", precision = 15, scale = 5)
	public BigDecimal getAliqicmsfretevd() {
		return this.aliqicmsfretevd;
	}

	public void setAliqicmsfretevd(BigDecimal aliqicmsfretevd) {
		this.aliqicmsfretevd = aliqicmsfretevd;
	}

	@Column(name = "VLRICMSFRETEVD", precision = 15, scale = 5)
	public BigDecimal getVlricmsfretevd() {
		return this.vlricmsfretevd;
	}

	public void setVlricmsfretevd(BigDecimal vlricmsfretevd) {
		this.vlricmsfretevd = vlricmsfretevd;
	}

	@Column(name = "VLRSEGFRETEVD", precision = 15, scale = 5)
	public BigDecimal getVlrsegfretevd() {
		return this.vlrsegfretevd;
	}

	public void setVlrsegfretevd(BigDecimal vlrsegfretevd) {
		this.vlrsegfretevd = vlrsegfretevd;
	}

	@Column(name = "RNTCVD", length = 20)
	public String getRntcvd() {
		return this.rntcvd;
	}

	public void setRntcvd(String rntcvd) {
		this.rntcvd = rntcvd;
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

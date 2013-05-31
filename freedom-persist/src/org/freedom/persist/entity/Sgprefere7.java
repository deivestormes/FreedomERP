package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Sgprefere7 generated by hbm2java
 */
@Entity
@Table(name = "SGPREFERE7")
public class Sgprefere7 implements java.io.Serializable {

	private Sgprefere7Id id;
	private Fnplanejamento fnplanejamentoBySgpref7fkfnplanconsig;
	private Eqtipomov eqtipomovBySgpref7fkeqtipmco;
	private Fnplanejamento fnplanejamentoBySgpref7fnplanvdconsig;
	private Eqtipomov eqtipomovBySgpref7fkeqtipmtv;
	private Eqtipomov eqtipomovBySgpref7fkeqtipmtp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere7() {
	}

	public Sgprefere7(Sgprefere7Id id, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere7(Sgprefere7Id id,
			Fnplanejamento fnplanejamentoBySgpref7fkfnplanconsig,
			Eqtipomov eqtipomovBySgpref7fkeqtipmco,
			Fnplanejamento fnplanejamentoBySgpref7fnplanvdconsig,
			Eqtipomov eqtipomovBySgpref7fkeqtipmtv,
			Eqtipomov eqtipomovBySgpref7fkeqtipmtp, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnplanejamentoBySgpref7fkfnplanconsig = fnplanejamentoBySgpref7fkfnplanconsig;
		this.eqtipomovBySgpref7fkeqtipmco = eqtipomovBySgpref7fkeqtipmco;
		this.fnplanejamentoBySgpref7fnplanvdconsig = fnplanejamentoBySgpref7fnplanvdconsig;
		this.eqtipomovBySgpref7fkeqtipmtv = eqtipomovBySgpref7fkeqtipmtv;
		this.eqtipomovBySgpref7fkeqtipmtp = eqtipomovBySgpref7fkeqtipmtp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public Sgprefere7Id getId() {
		return this.id;
	}

	public void setId(Sgprefere7Id id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANCONSIG", referencedColumnName = "CODPLAN"),
			@JoinColumn(name = "CODFILIALPC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPC", referencedColumnName = "CODEMP") })
	public Fnplanejamento getFnplanejamentoBySgpref7fkfnplanconsig() {
		return this.fnplanejamentoBySgpref7fkfnplanconsig;
	}

	public void setFnplanejamentoBySgpref7fkfnplanconsig(
			Fnplanejamento fnplanejamentoBySgpref7fkfnplanconsig) {
		this.fnplanejamentoBySgpref7fkfnplanconsig = fnplanejamentoBySgpref7fkfnplanconsig;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVCO", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALCO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCO", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgpref7fkeqtipmco() {
		return this.eqtipomovBySgpref7fkeqtipmco;
	}

	public void setEqtipomovBySgpref7fkeqtipmco(
			Eqtipomov eqtipomovBySgpref7fkeqtipmco) {
		this.eqtipomovBySgpref7fkeqtipmco = eqtipomovBySgpref7fkeqtipmco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANVDCONSIG", referencedColumnName = "CODPLAN"),
			@JoinColumn(name = "CODFILIALPV", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPV", referencedColumnName = "CODEMP") })
	public Fnplanejamento getFnplanejamentoBySgpref7fnplanvdconsig() {
		return this.fnplanejamentoBySgpref7fnplanvdconsig;
	}

	public void setFnplanejamentoBySgpref7fnplanvdconsig(
			Fnplanejamento fnplanejamentoBySgpref7fnplanvdconsig) {
		this.fnplanejamentoBySgpref7fnplanvdconsig = fnplanejamentoBySgpref7fnplanvdconsig;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVTV", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTV", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTV", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgpref7fkeqtipmtv() {
		return this.eqtipomovBySgpref7fkeqtipmtv;
	}

	public void setEqtipomovBySgpref7fkeqtipmtv(
			Eqtipomov eqtipomovBySgpref7fkeqtipmtv) {
		this.eqtipomovBySgpref7fkeqtipmtv = eqtipomovBySgpref7fkeqtipmtv;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVTP", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTP", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgpref7fkeqtipmtp() {
		return this.eqtipomovBySgpref7fkeqtipmtp;
	}

	public void setEqtipomovBySgpref7fkeqtipmtp(
			Eqtipomov eqtipomovBySgpref7fkeqtipmtp) {
		this.eqtipomovBySgpref7fkeqtipmtp = eqtipomovBySgpref7fkeqtipmtp;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SgsquidLog generated by hbm2java
 */
@Entity
@Table(name = "SGSQUID_LOG")
public class SgsquidLog implements java.io.Serializable {

	private long id;
	private SgsquidHier sgsquidHier;
	private SgsquidAction sgsquidAction;
	private SgsquidMethod sgsquidMethod;
	private int codemp;
	private short codfilial;
	private Date dtlog;
	private Date hlog;
	private int duration;
	private String clientaddress;
	private int bytes;
	private String url;
	private String autentication;
	private String types;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public SgsquidLog() {
	}

	public SgsquidLog(long id, SgsquidAction sgsquidAction,
			SgsquidMethod sgsquidMethod, int codemp, short codfilial,
			Date dtlog, Date hlog, int duration, String clientaddress,
			int bytes, String url, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgsquidAction = sgsquidAction;
		this.sgsquidMethod = sgsquidMethod;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.dtlog = dtlog;
		this.hlog = hlog;
		this.duration = duration;
		this.clientaddress = clientaddress;
		this.bytes = bytes;
		this.url = url;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public SgsquidLog(long id, SgsquidHier sgsquidHier,
			SgsquidAction sgsquidAction, SgsquidMethod sgsquidMethod,
			int codemp, short codfilial, Date dtlog, Date hlog, int duration,
			String clientaddress, int bytes, String url, String autentication,
			String types, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.sgsquidHier = sgsquidHier;
		this.sgsquidAction = sgsquidAction;
		this.sgsquidMethod = sgsquidMethod;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.dtlog = dtlog;
		this.hlog = hlog;
		this.duration = duration;
		this.clientaddress = clientaddress;
		this.bytes = bytes;
		this.url = url;
		this.autentication = autentication;
		this.types = types;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_HIER")
	public SgsquidHier getSgsquidHier() {
		return this.sgsquidHier;
	}

	public void setSgsquidHier(SgsquidHier sgsquidHier) {
		this.sgsquidHier = sgsquidHier;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ACTION", nullable = false)
	public SgsquidAction getSgsquidAction() {
		return this.sgsquidAction;
	}

	public void setSgsquidAction(SgsquidAction sgsquidAction) {
		this.sgsquidAction = sgsquidAction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_METHOD", nullable = false)
	public SgsquidMethod getSgsquidMethod() {
		return this.sgsquidMethod;
	}

	public void setSgsquidMethod(SgsquidMethod sgsquidMethod) {
		this.sgsquidMethod = sgsquidMethod;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DTLOG", nullable = false, length = 10)
	public Date getDtlog() {
		return this.dtlog;
	}

	public void setDtlog(Date dtlog) {
		this.dtlog = dtlog;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HLOG", nullable = false, length = 8)
	public Date getHlog() {
		return this.hlog;
	}

	public void setHlog(Date hlog) {
		this.hlog = hlog;
	}

	@Column(name = "DURATION", nullable = false)
	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column(name = "CLIENTADDRESS", nullable = false, length = 30)
	public String getClientaddress() {
		return this.clientaddress;
	}

	public void setClientaddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}

	@Column(name = "BYTES", nullable = false)
	public int getBytes() {
		return this.bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	@Column(name = "URL", nullable = false, length = 500)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "AUTENTICATION", length = 128)
	public String getAutentication() {
		return this.autentication;
	}

	public void setAutentication(String autentication) {
		this.autentication = autentication;
	}

	@Column(name = "TYPES", length = 250)
	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
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

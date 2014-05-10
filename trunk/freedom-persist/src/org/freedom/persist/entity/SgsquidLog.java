package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * SgsquidLog generated by hbm2java
 */
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

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SgsquidHier getSgsquidHier() {
		return this.sgsquidHier;
	}

	public void setSgsquidHier(SgsquidHier sgsquidHier) {
		this.sgsquidHier = sgsquidHier;
	}

	public SgsquidAction getSgsquidAction() {
		return this.sgsquidAction;
	}

	public void setSgsquidAction(SgsquidAction sgsquidAction) {
		this.sgsquidAction = sgsquidAction;
	}

	public SgsquidMethod getSgsquidMethod() {
		return this.sgsquidMethod;
	}

	public void setSgsquidMethod(SgsquidMethod sgsquidMethod) {
		this.sgsquidMethod = sgsquidMethod;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public Date getDtlog() {
		return this.dtlog;
	}

	public void setDtlog(Date dtlog) {
		this.dtlog = dtlog;
	}

	public Date getHlog() {
		return this.hlog;
	}

	public void setHlog(Date hlog) {
		this.hlog = hlog;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getClientaddress() {
		return this.clientaddress;
	}

	public void setClientaddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}

	public int getBytes() {
		return this.bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAutentication() {
		return this.autentication;
	}

	public void setAutentication(String autentication) {
		this.autentication = autentication;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}

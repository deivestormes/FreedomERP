package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sglogcrud generated by hbm2java
 */
public class Sglogcrud implements java.io.Serializable {

	private long id;
	private String tablename;
	private char operation;
	private char eventlog;
	private Date dtlog;
	private Date hlog;
	private String idusu;
	private String xml;

	public Sglogcrud() {
	}

	public Sglogcrud(long id, String tablename, char operation, char eventlog,
			Date dtlog, Date hlog, String idusu, String xml) {
		this.id = id;
		this.tablename = tablename;
		this.operation = operation;
		this.eventlog = eventlog;
		this.dtlog = dtlog;
		this.hlog = hlog;
		this.idusu = idusu;
		this.xml = xml;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public char getOperation() {
		return this.operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public char getEventlog() {
		return this.eventlog;
	}

	public void setEventlog(char eventlog) {
		this.eventlog = eventlog;
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

	public String getIdusu() {
		return this.idusu;
	}

	public void setIdusu(String idusu) {
		this.idusu = idusu;
	}

	public String getXml() {
		return this.xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

}

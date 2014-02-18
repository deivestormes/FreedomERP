package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Tkcontpessoa generated by hbm2java
 */
public class Tkcontpessoa implements java.io.Serializable {

	private TkcontpessoaId id;
	private Tkcontato tkcontato;
	private Crpessoa crpessoa;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkcontpessoa() {
	}

	public Tkcontpessoa(TkcontpessoaId id, Tkcontato tkcontato,
			Crpessoa crpessoa, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.crpessoa = crpessoa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcontpessoa(TkcontpessoaId id, Tkcontato tkcontato,
			Crpessoa crpessoa, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.crpessoa = crpessoa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public TkcontpessoaId getId() {
		return this.id;
	}

	public void setId(TkcontpessoaId id) {
		this.id = id;
	}

	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	public Crpessoa getCrpessoa() {
		return this.crpessoa;
	}

	public void setCrpessoa(Crpessoa crpessoa) {
		this.crpessoa = crpessoa;
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

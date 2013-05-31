package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.UniqueConstraint;

/**
 * Tkconfemail generated by hbm2java
 */
@Entity
@Table(name = "TKCONFEMAIL", uniqueConstraints = @UniqueConstraint(columnNames = {
		"EMAILREMET", "CODEMP", "CODFILIAL" }))
public class Tkconfemail implements java.io.Serializable {

	private TkconfemailId id;
	private String emailremet;
	private String nomeremet;
	private String usuarioremet;
	private char criptsenha;
	private String senharemet;
	private String emailresp;
	private String hostsmtp;
	private char usassl;
	private char usaautsmtp;
	private int portasmtp;
	private String assinatremet;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Tkemail> tkemails = new HashSet<Tkemail>(0);
	private Set<Sgprefere3> sgprefere3sForSgprefere3fktkconf = new HashSet<Sgprefere3>(
			0);
	private Set<Sgusuario> sgusuarios = new HashSet<Sgusuario>(0);
	private Set<Sgprefere3> sgprefere3sForSgprefere3fktkcon2 = new HashSet<Sgprefere3>(
			0);

	public Tkconfemail() {
	}

	public Tkconfemail(TkconfemailId id, String emailremet, String nomeremet,
			String usuarioremet, char criptsenha, String emailresp,
			String hostsmtp, char usassl, char usaautsmtp, int portasmtp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.emailremet = emailremet;
		this.nomeremet = nomeremet;
		this.usuarioremet = usuarioremet;
		this.criptsenha = criptsenha;
		this.emailresp = emailresp;
		this.hostsmtp = hostsmtp;
		this.usassl = usassl;
		this.usaautsmtp = usaautsmtp;
		this.portasmtp = portasmtp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkconfemail(TkconfemailId id, String emailremet, String nomeremet,
			String usuarioremet, char criptsenha, String senharemet,
			String emailresp, String hostsmtp, char usassl, char usaautsmtp,
			int portasmtp, String assinatremet, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Tkemail> tkemails,
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkconf,
			Set<Sgusuario> sgusuarios,
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkcon2) {
		this.id = id;
		this.emailremet = emailremet;
		this.nomeremet = nomeremet;
		this.usuarioremet = usuarioremet;
		this.criptsenha = criptsenha;
		this.senharemet = senharemet;
		this.emailresp = emailresp;
		this.hostsmtp = hostsmtp;
		this.usassl = usassl;
		this.usaautsmtp = usaautsmtp;
		this.portasmtp = portasmtp;
		this.assinatremet = assinatremet;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkemails = tkemails;
		this.sgprefere3sForSgprefere3fktkconf = sgprefere3sForSgprefere3fktkconf;
		this.sgusuarios = sgusuarios;
		this.sgprefere3sForSgprefere3fktkcon2 = sgprefere3sForSgprefere3fktkcon2;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codconfemail", column = @Column(name = "CODCONFEMAIL", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TkconfemailId getId() {
		return this.id;
	}

	public void setId(TkconfemailId id) {
		this.id = id;
	}

	@Column(name = "EMAILREMET", nullable = false, length = 60)
	public String getEmailremet() {
		return this.emailremet;
	}

	public void setEmailremet(String emailremet) {
		this.emailremet = emailremet;
	}

	@Column(name = "NOMEREMET", nullable = false, length = 50)
	public String getNomeremet() {
		return this.nomeremet;
	}

	public void setNomeremet(String nomeremet) {
		this.nomeremet = nomeremet;
	}

	@Column(name = "USUARIOREMET", nullable = false, length = 40)
	public String getUsuarioremet() {
		return this.usuarioremet;
	}

	public void setUsuarioremet(String usuarioremet) {
		this.usuarioremet = usuarioremet;
	}

	@Column(name = "CRIPTSENHA", nullable = false, length = 1)
	public char getCriptsenha() {
		return this.criptsenha;
	}

	public void setCriptsenha(char criptsenha) {
		this.criptsenha = criptsenha;
	}

	@Column(name = "SENHAREMET", length = 40)
	public String getSenharemet() {
		return this.senharemet;
	}

	public void setSenharemet(String senharemet) {
		this.senharemet = senharemet;
	}

	@Column(name = "EMAILRESP", nullable = false, length = 60)
	public String getEmailresp() {
		return this.emailresp;
	}

	public void setEmailresp(String emailresp) {
		this.emailresp = emailresp;
	}

	@Column(name = "HOSTSMTP", nullable = false, length = 40)
	public String getHostsmtp() {
		return this.hostsmtp;
	}

	public void setHostsmtp(String hostsmtp) {
		this.hostsmtp = hostsmtp;
	}

	@Column(name = "USASSL", nullable = false, length = 1)
	public char getUsassl() {
		return this.usassl;
	}

	public void setUsassl(char usassl) {
		this.usassl = usassl;
	}

	@Column(name = "USAAUTSMTP", nullable = false, length = 1)
	public char getUsaautsmtp() {
		return this.usaautsmtp;
	}

	public void setUsaautsmtp(char usaautsmtp) {
		this.usaautsmtp = usaautsmtp;
	}

	@Column(name = "PORTASMTP", nullable = false)
	public int getPortasmtp() {
		return this.portasmtp;
	}

	public void setPortasmtp(int portasmtp) {
		this.portasmtp = portasmtp;
	}

	@Column(name = "ASSINATREMET", length = 1000)
	public String getAssinatremet() {
		return this.assinatremet;
	}

	public void setAssinatremet(String assinatremet) {
		this.assinatremet = assinatremet;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkconfemail")
	public Set<Tkemail> getTkemails() {
		return this.tkemails;
	}

	public void setTkemails(Set<Tkemail> tkemails) {
		this.tkemails = tkemails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkconfemailBySgprefere3fktkconf")
	public Set<Sgprefere3> getSgprefere3sForSgprefere3fktkconf() {
		return this.sgprefere3sForSgprefere3fktkconf;
	}

	public void setSgprefere3sForSgprefere3fktkconf(
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkconf) {
		this.sgprefere3sForSgprefere3fktkconf = sgprefere3sForSgprefere3fktkconf;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkconfemail")
	public Set<Sgusuario> getSgusuarios() {
		return this.sgusuarios;
	}

	public void setSgusuarios(Set<Sgusuario> sgusuarios) {
		this.sgusuarios = sgusuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkconfemailBySgprefere3fktkcon2")
	public Set<Sgprefere3> getSgprefere3sForSgprefere3fktkcon2() {
		return this.sgprefere3sForSgprefere3fktkcon2;
	}

	public void setSgprefere3sForSgprefere3fktkcon2(
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkcon2) {
		this.sgprefere3sForSgprefere3fktkcon2 = sgprefere3sForSgprefere3fktkcon2;
	}

}

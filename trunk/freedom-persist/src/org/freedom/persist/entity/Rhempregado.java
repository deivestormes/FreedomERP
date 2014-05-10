package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rhempregado generated by hbm2java
 */
public class Rhempregado implements java.io.Serializable {

	private RhempregadoId id;
	private Rhdepto rhdepto;
	private Rhempregado rhempregado;
	private Rhfuncao rhfuncao;
	private Rhturno rhturno;
	private String nomeempr;
	private String apelidoempr;
	private String endempr;
	private Integer numempr;
	private String cidempr;
	private String bairempr;
	private String cepempr;
	private String foneempr;
	private Date dtadmissao;
	private byte[] fotoempr;
	private String statusempr;
	private char sexoempr;
	private Date dtnascempr;
	private String ctpsempr;
	private String seriectpsempr;
	private String ufctpsempr;
	private String certreservempr;
	private String pispasepempr;
	private String rgempr;
	private String orgexprhempr;
	private String cpfempr;
	private String ufrgempr;
	private Date dtexprgempr;
	private String titeleitempr;
	private Integer zonaeleitempr;
	private Integer secaoeleitempr;
	private String cnhempr;
	private String maeempr;
	private String paiempr;
	private String complendempr;
	private String ufempr;
	private Date dtdemissaoempr;
	private String dddempr;
	private String fone2empr;
	private String celempr;
	private String emailempr;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set pebatidas = new HashSet(0);
	private Set rhpontos = new HashSet(0);
	private Set fnsublancas = new HashSet(0);
	private Set atatendentes = new HashSet(0);
	private Set rhempregadobenefs = new HashSet(0);
	private Set fnitrecebers = new HashSet(0);
	private Set rhempregados = new HashSet(0);
	private Set pefaltas = new HashSet(0);
	private Set fnitpagars = new HashSet(0);
	private Set rhempregadosals = new HashSet(0);

	public Rhempregado() {
	}

	public Rhempregado(RhempregadoId id, Rhdepto rhdepto,
			Rhempregado rhempregado, Rhfuncao rhfuncao, Rhturno rhturno,
			String nomeempr, String apelidoempr, Date dtadmissao,
			String statusempr, char sexoempr, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.rhdepto = rhdepto;
		this.rhempregado = rhempregado;
		this.rhfuncao = rhfuncao;
		this.rhturno = rhturno;
		this.nomeempr = nomeempr;
		this.apelidoempr = apelidoempr;
		this.dtadmissao = dtadmissao;
		this.statusempr = statusempr;
		this.sexoempr = sexoempr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhempregado(RhempregadoId id, Rhdepto rhdepto,
			Rhempregado rhempregado, Rhfuncao rhfuncao, Rhturno rhturno,
			String nomeempr, String apelidoempr, String endempr,
			Integer numempr, String cidempr, String bairempr, String cepempr,
			String foneempr, Date dtadmissao, byte[] fotoempr,
			String statusempr, char sexoempr, Date dtnascempr, String ctpsempr,
			String seriectpsempr, String ufctpsempr, String certreservempr,
			String pispasepempr, String rgempr, String orgexprhempr,
			String cpfempr, String ufrgempr, Date dtexprgempr,
			String titeleitempr, Integer zonaeleitempr, Integer secaoeleitempr,
			String cnhempr, String maeempr, String paiempr,
			String complendempr, String ufempr, Date dtdemissaoempr,
			String dddempr, String fone2empr, String celempr, String emailempr,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set pebatidas, Set rhpontos, Set fnsublancas,
			Set atatendentes, Set rhempregadobenefs, Set fnitrecebers,
			Set rhempregados, Set pefaltas, Set fnitpagars, Set rhempregadosals) {
		this.id = id;
		this.rhdepto = rhdepto;
		this.rhempregado = rhempregado;
		this.rhfuncao = rhfuncao;
		this.rhturno = rhturno;
		this.nomeempr = nomeempr;
		this.apelidoempr = apelidoempr;
		this.endempr = endempr;
		this.numempr = numempr;
		this.cidempr = cidempr;
		this.bairempr = bairempr;
		this.cepempr = cepempr;
		this.foneempr = foneempr;
		this.dtadmissao = dtadmissao;
		this.fotoempr = fotoempr;
		this.statusempr = statusempr;
		this.sexoempr = sexoempr;
		this.dtnascempr = dtnascempr;
		this.ctpsempr = ctpsempr;
		this.seriectpsempr = seriectpsempr;
		this.ufctpsempr = ufctpsempr;
		this.certreservempr = certreservempr;
		this.pispasepempr = pispasepempr;
		this.rgempr = rgempr;
		this.orgexprhempr = orgexprhempr;
		this.cpfempr = cpfempr;
		this.ufrgempr = ufrgempr;
		this.dtexprgempr = dtexprgempr;
		this.titeleitempr = titeleitempr;
		this.zonaeleitempr = zonaeleitempr;
		this.secaoeleitempr = secaoeleitempr;
		this.cnhempr = cnhempr;
		this.maeempr = maeempr;
		this.paiempr = paiempr;
		this.complendempr = complendempr;
		this.ufempr = ufempr;
		this.dtdemissaoempr = dtdemissaoempr;
		this.dddempr = dddempr;
		this.fone2empr = fone2empr;
		this.celempr = celempr;
		this.emailempr = emailempr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.pebatidas = pebatidas;
		this.rhpontos = rhpontos;
		this.fnsublancas = fnsublancas;
		this.atatendentes = atatendentes;
		this.rhempregadobenefs = rhempregadobenefs;
		this.fnitrecebers = fnitrecebers;
		this.rhempregados = rhempregados;
		this.pefaltas = pefaltas;
		this.fnitpagars = fnitpagars;
		this.rhempregadosals = rhempregadosals;
	}

	public RhempregadoId getId() {
		return this.id;
	}

	public void setId(RhempregadoId id) {
		this.id = id;
	}

	public Rhdepto getRhdepto() {
		return this.rhdepto;
	}

	public void setRhdepto(Rhdepto rhdepto) {
		this.rhdepto = rhdepto;
	}

	public Rhempregado getRhempregado() {
		return this.rhempregado;
	}

	public void setRhempregado(Rhempregado rhempregado) {
		this.rhempregado = rhempregado;
	}

	public Rhfuncao getRhfuncao() {
		return this.rhfuncao;
	}

	public void setRhfuncao(Rhfuncao rhfuncao) {
		this.rhfuncao = rhfuncao;
	}

	public Rhturno getRhturno() {
		return this.rhturno;
	}

	public void setRhturno(Rhturno rhturno) {
		this.rhturno = rhturno;
	}

	public String getNomeempr() {
		return this.nomeempr;
	}

	public void setNomeempr(String nomeempr) {
		this.nomeempr = nomeempr;
	}

	public String getApelidoempr() {
		return this.apelidoempr;
	}

	public void setApelidoempr(String apelidoempr) {
		this.apelidoempr = apelidoempr;
	}

	public String getEndempr() {
		return this.endempr;
	}

	public void setEndempr(String endempr) {
		this.endempr = endempr;
	}

	public Integer getNumempr() {
		return this.numempr;
	}

	public void setNumempr(Integer numempr) {
		this.numempr = numempr;
	}

	public String getCidempr() {
		return this.cidempr;
	}

	public void setCidempr(String cidempr) {
		this.cidempr = cidempr;
	}

	public String getBairempr() {
		return this.bairempr;
	}

	public void setBairempr(String bairempr) {
		this.bairempr = bairempr;
	}

	public String getCepempr() {
		return this.cepempr;
	}

	public void setCepempr(String cepempr) {
		this.cepempr = cepempr;
	}

	public String getFoneempr() {
		return this.foneempr;
	}

	public void setFoneempr(String foneempr) {
		this.foneempr = foneempr;
	}

	public Date getDtadmissao() {
		return this.dtadmissao;
	}

	public void setDtadmissao(Date dtadmissao) {
		this.dtadmissao = dtadmissao;
	}

	public byte[] getFotoempr() {
		return this.fotoempr;
	}

	public void setFotoempr(byte[] fotoempr) {
		this.fotoempr = fotoempr;
	}

	public String getStatusempr() {
		return this.statusempr;
	}

	public void setStatusempr(String statusempr) {
		this.statusempr = statusempr;
	}

	public char getSexoempr() {
		return this.sexoempr;
	}

	public void setSexoempr(char sexoempr) {
		this.sexoempr = sexoempr;
	}

	public Date getDtnascempr() {
		return this.dtnascempr;
	}

	public void setDtnascempr(Date dtnascempr) {
		this.dtnascempr = dtnascempr;
	}

	public String getCtpsempr() {
		return this.ctpsempr;
	}

	public void setCtpsempr(String ctpsempr) {
		this.ctpsempr = ctpsempr;
	}

	public String getSeriectpsempr() {
		return this.seriectpsempr;
	}

	public void setSeriectpsempr(String seriectpsempr) {
		this.seriectpsempr = seriectpsempr;
	}

	public String getUfctpsempr() {
		return this.ufctpsempr;
	}

	public void setUfctpsempr(String ufctpsempr) {
		this.ufctpsempr = ufctpsempr;
	}

	public String getCertreservempr() {
		return this.certreservempr;
	}

	public void setCertreservempr(String certreservempr) {
		this.certreservempr = certreservempr;
	}

	public String getPispasepempr() {
		return this.pispasepempr;
	}

	public void setPispasepempr(String pispasepempr) {
		this.pispasepempr = pispasepempr;
	}

	public String getRgempr() {
		return this.rgempr;
	}

	public void setRgempr(String rgempr) {
		this.rgempr = rgempr;
	}

	public String getOrgexprhempr() {
		return this.orgexprhempr;
	}

	public void setOrgexprhempr(String orgexprhempr) {
		this.orgexprhempr = orgexprhempr;
	}

	public String getCpfempr() {
		return this.cpfempr;
	}

	public void setCpfempr(String cpfempr) {
		this.cpfempr = cpfempr;
	}

	public String getUfrgempr() {
		return this.ufrgempr;
	}

	public void setUfrgempr(String ufrgempr) {
		this.ufrgempr = ufrgempr;
	}

	public Date getDtexprgempr() {
		return this.dtexprgempr;
	}

	public void setDtexprgempr(Date dtexprgempr) {
		this.dtexprgempr = dtexprgempr;
	}

	public String getTiteleitempr() {
		return this.titeleitempr;
	}

	public void setTiteleitempr(String titeleitempr) {
		this.titeleitempr = titeleitempr;
	}

	public Integer getZonaeleitempr() {
		return this.zonaeleitempr;
	}

	public void setZonaeleitempr(Integer zonaeleitempr) {
		this.zonaeleitempr = zonaeleitempr;
	}

	public Integer getSecaoeleitempr() {
		return this.secaoeleitempr;
	}

	public void setSecaoeleitempr(Integer secaoeleitempr) {
		this.secaoeleitempr = secaoeleitempr;
	}

	public String getCnhempr() {
		return this.cnhempr;
	}

	public void setCnhempr(String cnhempr) {
		this.cnhempr = cnhempr;
	}

	public String getMaeempr() {
		return this.maeempr;
	}

	public void setMaeempr(String maeempr) {
		this.maeempr = maeempr;
	}

	public String getPaiempr() {
		return this.paiempr;
	}

	public void setPaiempr(String paiempr) {
		this.paiempr = paiempr;
	}

	public String getComplendempr() {
		return this.complendempr;
	}

	public void setComplendempr(String complendempr) {
		this.complendempr = complendempr;
	}

	public String getUfempr() {
		return this.ufempr;
	}

	public void setUfempr(String ufempr) {
		this.ufempr = ufempr;
	}

	public Date getDtdemissaoempr() {
		return this.dtdemissaoempr;
	}

	public void setDtdemissaoempr(Date dtdemissaoempr) {
		this.dtdemissaoempr = dtdemissaoempr;
	}

	public String getDddempr() {
		return this.dddempr;
	}

	public void setDddempr(String dddempr) {
		this.dddempr = dddempr;
	}

	public String getFone2empr() {
		return this.fone2empr;
	}

	public void setFone2empr(String fone2empr) {
		this.fone2empr = fone2empr;
	}

	public String getCelempr() {
		return this.celempr;
	}

	public void setCelempr(String celempr) {
		this.celempr = celempr;
	}

	public String getEmailempr() {
		return this.emailempr;
	}

	public void setEmailempr(String emailempr) {
		this.emailempr = emailempr;
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

	public Set getPebatidas() {
		return this.pebatidas;
	}

	public void setPebatidas(Set pebatidas) {
		this.pebatidas = pebatidas;
	}

	public Set getRhpontos() {
		return this.rhpontos;
	}

	public void setRhpontos(Set rhpontos) {
		this.rhpontos = rhpontos;
	}

	public Set getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	public Set getAtatendentes() {
		return this.atatendentes;
	}

	public void setAtatendentes(Set atatendentes) {
		this.atatendentes = atatendentes;
	}

	public Set getRhempregadobenefs() {
		return this.rhempregadobenefs;
	}

	public void setRhempregadobenefs(Set rhempregadobenefs) {
		this.rhempregadobenefs = rhempregadobenefs;
	}

	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	public Set getRhempregados() {
		return this.rhempregados;
	}

	public void setRhempregados(Set rhempregados) {
		this.rhempregados = rhempregados;
	}

	public Set getPefaltas() {
		return this.pefaltas;
	}

	public void setPefaltas(Set pefaltas) {
		this.pefaltas = pefaltas;
	}

	public Set getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	public Set getRhempregadosals() {
		return this.rhempregadosals;
	}

	public void setRhempregadosals(Set rhempregadosals) {
		this.rhempregadosals = rhempregadosals;
	}

}

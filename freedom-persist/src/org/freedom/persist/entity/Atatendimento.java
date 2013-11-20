package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Atatendimento generated by hbm2java
 */
public class Atatendimento implements java.io.Serializable {

	private AtatendimentoId id;
	private Sgfilial sgfilial;
	private Atatendente atatendente;
	private Crtarefa crtarefa;
	private Attipoatendo attipoatendo;
	private Atsetor atsetor;
	private Vdcliente vdcliente;
	private Atespecatend atespecatend;
	private Crchamado crchamado;
	private Vditcontrato vditcontrato;
	private Atclasatendo atclasatendo;
	private Sgusuario sgusuario;
	private Atconveniado atconveniado;
	private Date dataatendo;
	private Date horaatendo;
	private Date dataatendofin;
	private Date horaatendofin;
	private String obsatendo;
	private String obsinterno;
	private String statusatendo;
	private String sitrevatendo;
	private int docatendo;
	private char concluichamado;
	private String sitatendo;
	private char emmanut;
	private char bloqatendo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set atatendimentoorcs = new HashSet(0);
	private Set atatendimentoitrecs = new HashSet(0);
	private Set atatendoagendas = new HashSet(0);

	public Atatendimento() {
	}

	public Atatendimento(AtatendimentoId id, Sgfilial sgfilial,
			Atatendente atatendente, Attipoatendo attipoatendo,
			Atsetor atsetor, Sgusuario sgusuario, Date dataatendo,
			Date horaatendo, Date dataatendofin, Date horaatendofin,
			String statusatendo, String sitrevatendo, int docatendo,
			char concluichamado, char emmanut, char bloqatendo, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.atatendente = atatendente;
		this.attipoatendo = attipoatendo;
		this.atsetor = atsetor;
		this.sgusuario = sgusuario;
		this.dataatendo = dataatendo;
		this.horaatendo = horaatendo;
		this.dataatendofin = dataatendofin;
		this.horaatendofin = horaatendofin;
		this.statusatendo = statusatendo;
		this.sitrevatendo = sitrevatendo;
		this.docatendo = docatendo;
		this.concluichamado = concluichamado;
		this.emmanut = emmanut;
		this.bloqatendo = bloqatendo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atatendimento(AtatendimentoId id, Sgfilial sgfilial,
			Atatendente atatendente, Crtarefa crtarefa,
			Attipoatendo attipoatendo, Atsetor atsetor, Vdcliente vdcliente,
			Atespecatend atespecatend, Crchamado crchamado,
			Vditcontrato vditcontrato, Atclasatendo atclasatendo,
			Sgusuario sgusuario, Atconveniado atconveniado, Date dataatendo,
			Date horaatendo, Date dataatendofin, Date horaatendofin,
			String obsatendo, String obsinterno, String statusatendo,
			String sitrevatendo, int docatendo, char concluichamado,
			String sitatendo, char emmanut, char bloqatendo, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set atatendimentoorcs, Set atatendimentoitrecs, Set atatendoagendas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.atatendente = atatendente;
		this.crtarefa = crtarefa;
		this.attipoatendo = attipoatendo;
		this.atsetor = atsetor;
		this.vdcliente = vdcliente;
		this.atespecatend = atespecatend;
		this.crchamado = crchamado;
		this.vditcontrato = vditcontrato;
		this.atclasatendo = atclasatendo;
		this.sgusuario = sgusuario;
		this.atconveniado = atconveniado;
		this.dataatendo = dataatendo;
		this.horaatendo = horaatendo;
		this.dataatendofin = dataatendofin;
		this.horaatendofin = horaatendofin;
		this.obsatendo = obsatendo;
		this.obsinterno = obsinterno;
		this.statusatendo = statusatendo;
		this.sitrevatendo = sitrevatendo;
		this.docatendo = docatendo;
		this.concluichamado = concluichamado;
		this.sitatendo = sitatendo;
		this.emmanut = emmanut;
		this.bloqatendo = bloqatendo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atatendimentoorcs = atatendimentoorcs;
		this.atatendimentoitrecs = atatendimentoitrecs;
		this.atatendoagendas = atatendoagendas;
	}

	public AtatendimentoId getId() {
		return this.id;
	}

	public void setId(AtatendimentoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	public Crtarefa getCrtarefa() {
		return this.crtarefa;
	}

	public void setCrtarefa(Crtarefa crtarefa) {
		this.crtarefa = crtarefa;
	}

	public Attipoatendo getAttipoatendo() {
		return this.attipoatendo;
	}

	public void setAttipoatendo(Attipoatendo attipoatendo) {
		this.attipoatendo = attipoatendo;
	}

	public Atsetor getAtsetor() {
		return this.atsetor;
	}

	public void setAtsetor(Atsetor atsetor) {
		this.atsetor = atsetor;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Atespecatend getAtespecatend() {
		return this.atespecatend;
	}

	public void setAtespecatend(Atespecatend atespecatend) {
		this.atespecatend = atespecatend;
	}

	public Crchamado getCrchamado() {
		return this.crchamado;
	}

	public void setCrchamado(Crchamado crchamado) {
		this.crchamado = crchamado;
	}

	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	public Atclasatendo getAtclasatendo() {
		return this.atclasatendo;
	}

	public void setAtclasatendo(Atclasatendo atclasatendo) {
		this.atclasatendo = atclasatendo;
	}

	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	public Atconveniado getAtconveniado() {
		return this.atconveniado;
	}

	public void setAtconveniado(Atconveniado atconveniado) {
		this.atconveniado = atconveniado;
	}

	public Date getDataatendo() {
		return this.dataatendo;
	}

	public void setDataatendo(Date dataatendo) {
		this.dataatendo = dataatendo;
	}

	public Date getHoraatendo() {
		return this.horaatendo;
	}

	public void setHoraatendo(Date horaatendo) {
		this.horaatendo = horaatendo;
	}

	public Date getDataatendofin() {
		return this.dataatendofin;
	}

	public void setDataatendofin(Date dataatendofin) {
		this.dataatendofin = dataatendofin;
	}

	public Date getHoraatendofin() {
		return this.horaatendofin;
	}

	public void setHoraatendofin(Date horaatendofin) {
		this.horaatendofin = horaatendofin;
	}

	public String getObsatendo() {
		return this.obsatendo;
	}

	public void setObsatendo(String obsatendo) {
		this.obsatendo = obsatendo;
	}

	public String getObsinterno() {
		return this.obsinterno;
	}

	public void setObsinterno(String obsinterno) {
		this.obsinterno = obsinterno;
	}

	public String getStatusatendo() {
		return this.statusatendo;
	}

	public void setStatusatendo(String statusatendo) {
		this.statusatendo = statusatendo;
	}

	public String getSitrevatendo() {
		return this.sitrevatendo;
	}

	public void setSitrevatendo(String sitrevatendo) {
		this.sitrevatendo = sitrevatendo;
	}

	public int getDocatendo() {
		return this.docatendo;
	}

	public void setDocatendo(int docatendo) {
		this.docatendo = docatendo;
	}

	public char getConcluichamado() {
		return this.concluichamado;
	}

	public void setConcluichamado(char concluichamado) {
		this.concluichamado = concluichamado;
	}

	public String getSitatendo() {
		return this.sitatendo;
	}

	public void setSitatendo(String sitatendo) {
		this.sitatendo = sitatendo;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public char getBloqatendo() {
		return this.bloqatendo;
	}

	public void setBloqatendo(char bloqatendo) {
		this.bloqatendo = bloqatendo;
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

	public Set getAtatendimentoorcs() {
		return this.atatendimentoorcs;
	}

	public void setAtatendimentoorcs(Set atatendimentoorcs) {
		this.atatendimentoorcs = atatendimentoorcs;
	}

	public Set getAtatendimentoitrecs() {
		return this.atatendimentoitrecs;
	}

	public void setAtatendimentoitrecs(Set atatendimentoitrecs) {
		this.atatendimentoitrecs = atatendimentoitrecs;
	}

	public Set getAtatendoagendas() {
		return this.atatendoagendas;
	}

	public void setAtatendoagendas(Set atatendoagendas) {
		this.atatendoagendas = atatendoagendas;
	}

}

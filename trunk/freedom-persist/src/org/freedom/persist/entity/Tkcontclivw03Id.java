package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Tkcontclivw03Id generated by hbm2java
 */
@Embeddable
public class Tkcontclivw03Id implements java.io.Serializable {

	private Character tipocto;
	private Integer codemp;
	private Short codfilial;
	private Integer codcto;
	private String razcto;
	private String nomecto;
	private String contcto;
	private String emailcto;
	private String obscto;
	private Integer codempto;
	private Short codfilialto;
	private Integer codtipocont;
	private Integer codempsr;
	private Short codfilialsr;
	private Integer codsetor;
	private Integer codempoc;
	private Short codfilialoc;
	private Integer codorigcont;
	private Integer codempti;
	private Short codfilialti;
	private Integer codtipocli;
	private Integer codempcc;
	private Short codfilialcc;
	private Integer codclascli;
	private Character ativo;
	private Date dtins;
	private Date dtalt;
	private Date dtinscc;
	private Date dtaltcc;

	public Tkcontclivw03Id() {
	}

	public Tkcontclivw03Id(Character tipocto, Integer codemp, Short codfilial,
			Integer codcto, String razcto, String nomecto, String contcto,
			String emailcto, String obscto, Integer codempto,
			Short codfilialto, Integer codtipocont, Integer codempsr,
			Short codfilialsr, Integer codsetor, Integer codempoc,
			Short codfilialoc, Integer codorigcont, Integer codempti,
			Short codfilialti, Integer codtipocli, Integer codempcc,
			Short codfilialcc, Integer codclascli, Character ativo, Date dtins,
			Date dtalt, Date dtinscc, Date dtaltcc) {
		this.tipocto = tipocto;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codcto = codcto;
		this.razcto = razcto;
		this.nomecto = nomecto;
		this.contcto = contcto;
		this.emailcto = emailcto;
		this.obscto = obscto;
		this.codempto = codempto;
		this.codfilialto = codfilialto;
		this.codtipocont = codtipocont;
		this.codempsr = codempsr;
		this.codfilialsr = codfilialsr;
		this.codsetor = codsetor;
		this.codempoc = codempoc;
		this.codfilialoc = codfilialoc;
		this.codorigcont = codorigcont;
		this.codempti = codempti;
		this.codfilialti = codfilialti;
		this.codtipocli = codtipocli;
		this.codempcc = codempcc;
		this.codfilialcc = codfilialcc;
		this.codclascli = codclascli;
		this.ativo = ativo;
		this.dtins = dtins;
		this.dtalt = dtalt;
		this.dtinscc = dtinscc;
		this.dtaltcc = dtaltcc;
	}

	@Column(name = "TIPOCTO", length = 1)
	public Character getTipocto() {
		return this.tipocto;
	}

	public void setTipocto(Character tipocto) {
		this.tipocto = tipocto;
	}

	@Column(name = "CODEMP")
	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL")
	public Short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(Short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODCTO")
	public Integer getCodcto() {
		return this.codcto;
	}

	public void setCodcto(Integer codcto) {
		this.codcto = codcto;
	}

	@Column(name = "RAZCTO", length = 60)
	public String getRazcto() {
		return this.razcto;
	}

	public void setRazcto(String razcto) {
		this.razcto = razcto;
	}

	@Column(name = "NOMECTO", length = 50)
	public String getNomecto() {
		return this.nomecto;
	}

	public void setNomecto(String nomecto) {
		this.nomecto = nomecto;
	}

	@Column(name = "CONTCTO", length = 40)
	public String getContcto() {
		return this.contcto;
	}

	public void setContcto(String contcto) {
		this.contcto = contcto;
	}

	@Column(name = "EMAILCTO", length = 50)
	public String getEmailcto() {
		return this.emailcto;
	}

	public void setEmailcto(String emailcto) {
		this.emailcto = emailcto;
	}

	@Column(name = "OBSCTO", length = 10000)
	public String getObscto() {
		return this.obscto;
	}

	public void setObscto(String obscto) {
		this.obscto = obscto;
	}

	@Column(name = "CODEMPTO")
	public Integer getCodempto() {
		return this.codempto;
	}

	public void setCodempto(Integer codempto) {
		this.codempto = codempto;
	}

	@Column(name = "CODFILIALTO")
	public Short getCodfilialto() {
		return this.codfilialto;
	}

	public void setCodfilialto(Short codfilialto) {
		this.codfilialto = codfilialto;
	}

	@Column(name = "CODTIPOCONT")
	public Integer getCodtipocont() {
		return this.codtipocont;
	}

	public void setCodtipocont(Integer codtipocont) {
		this.codtipocont = codtipocont;
	}

	@Column(name = "CODEMPSR")
	public Integer getCodempsr() {
		return this.codempsr;
	}

	public void setCodempsr(Integer codempsr) {
		this.codempsr = codempsr;
	}

	@Column(name = "CODFILIALSR")
	public Short getCodfilialsr() {
		return this.codfilialsr;
	}

	public void setCodfilialsr(Short codfilialsr) {
		this.codfilialsr = codfilialsr;
	}

	@Column(name = "CODSETOR")
	public Integer getCodsetor() {
		return this.codsetor;
	}

	public void setCodsetor(Integer codsetor) {
		this.codsetor = codsetor;
	}

	@Column(name = "CODEMPOC")
	public Integer getCodempoc() {
		return this.codempoc;
	}

	public void setCodempoc(Integer codempoc) {
		this.codempoc = codempoc;
	}

	@Column(name = "CODFILIALOC")
	public Short getCodfilialoc() {
		return this.codfilialoc;
	}

	public void setCodfilialoc(Short codfilialoc) {
		this.codfilialoc = codfilialoc;
	}

	@Column(name = "CODORIGCONT")
	public Integer getCodorigcont() {
		return this.codorigcont;
	}

	public void setCodorigcont(Integer codorigcont) {
		this.codorigcont = codorigcont;
	}

	@Column(name = "CODEMPTI")
	public Integer getCodempti() {
		return this.codempti;
	}

	public void setCodempti(Integer codempti) {
		this.codempti = codempti;
	}

	@Column(name = "CODFILIALTI")
	public Short getCodfilialti() {
		return this.codfilialti;
	}

	public void setCodfilialti(Short codfilialti) {
		this.codfilialti = codfilialti;
	}

	@Column(name = "CODTIPOCLI")
	public Integer getCodtipocli() {
		return this.codtipocli;
	}

	public void setCodtipocli(Integer codtipocli) {
		this.codtipocli = codtipocli;
	}

	@Column(name = "CODEMPCC")
	public Integer getCodempcc() {
		return this.codempcc;
	}

	public void setCodempcc(Integer codempcc) {
		this.codempcc = codempcc;
	}

	@Column(name = "CODFILIALCC")
	public Short getCodfilialcc() {
		return this.codfilialcc;
	}

	public void setCodfilialcc(Short codfilialcc) {
		this.codfilialcc = codfilialcc;
	}

	@Column(name = "CODCLASCLI")
	public Integer getCodclascli() {
		return this.codclascli;
	}

	public void setCodclascli(Integer codclascli) {
		this.codclascli = codclascli;
	}

	@Column(name = "ATIVO", length = 1)
	public Character getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Character ativo) {
		this.ativo = ativo;
	}

	@Column(name = "DTINS", length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Column(name = "DTINSCC", length = 10)
	public Date getDtinscc() {
		return this.dtinscc;
	}

	public void setDtinscc(Date dtinscc) {
		this.dtinscc = dtinscc;
	}

	@Column(name = "DTALTCC", length = 10)
	public Date getDtaltcc() {
		return this.dtaltcc;
	}

	public void setDtaltcc(Date dtaltcc) {
		this.dtaltcc = dtaltcc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Tkcontclivw03Id))
			return false;
		Tkcontclivw03Id castOther = (Tkcontclivw03Id) other;

		return ((this.getTipocto() == castOther.getTipocto()) || (this
				.getTipocto() != null && castOther.getTipocto() != null && this
				.getTipocto().equals(castOther.getTipocto())))
				&& ((this.getCodemp() == castOther.getCodemp()) || (this
						.getCodemp() != null && castOther.getCodemp() != null && this
						.getCodemp().equals(castOther.getCodemp())))
				&& ((this.getCodfilial() == castOther.getCodfilial()) || (this
						.getCodfilial() != null
						&& castOther.getCodfilial() != null && this
						.getCodfilial().equals(castOther.getCodfilial())))
				&& ((this.getCodcto() == castOther.getCodcto()) || (this
						.getCodcto() != null && castOther.getCodcto() != null && this
						.getCodcto().equals(castOther.getCodcto())))
				&& ((this.getRazcto() == castOther.getRazcto()) || (this
						.getRazcto() != null && castOther.getRazcto() != null && this
						.getRazcto().equals(castOther.getRazcto())))
				&& ((this.getNomecto() == castOther.getNomecto()) || (this
						.getNomecto() != null && castOther.getNomecto() != null && this
						.getNomecto().equals(castOther.getNomecto())))
				&& ((this.getContcto() == castOther.getContcto()) || (this
						.getContcto() != null && castOther.getContcto() != null && this
						.getContcto().equals(castOther.getContcto())))
				&& ((this.getEmailcto() == castOther.getEmailcto()) || (this
						.getEmailcto() != null
						&& castOther.getEmailcto() != null && this
						.getEmailcto().equals(castOther.getEmailcto())))
				&& ((this.getObscto() == castOther.getObscto()) || (this
						.getObscto() != null && castOther.getObscto() != null && this
						.getObscto().equals(castOther.getObscto())))
				&& ((this.getCodempto() == castOther.getCodempto()) || (this
						.getCodempto() != null
						&& castOther.getCodempto() != null && this
						.getCodempto().equals(castOther.getCodempto())))
				&& ((this.getCodfilialto() == castOther.getCodfilialto()) || (this
						.getCodfilialto() != null
						&& castOther.getCodfilialto() != null && this
						.getCodfilialto().equals(castOther.getCodfilialto())))
				&& ((this.getCodtipocont() == castOther.getCodtipocont()) || (this
						.getCodtipocont() != null
						&& castOther.getCodtipocont() != null && this
						.getCodtipocont().equals(castOther.getCodtipocont())))
				&& ((this.getCodempsr() == castOther.getCodempsr()) || (this
						.getCodempsr() != null
						&& castOther.getCodempsr() != null && this
						.getCodempsr().equals(castOther.getCodempsr())))
				&& ((this.getCodfilialsr() == castOther.getCodfilialsr()) || (this
						.getCodfilialsr() != null
						&& castOther.getCodfilialsr() != null && this
						.getCodfilialsr().equals(castOther.getCodfilialsr())))
				&& ((this.getCodsetor() == castOther.getCodsetor()) || (this
						.getCodsetor() != null
						&& castOther.getCodsetor() != null && this
						.getCodsetor().equals(castOther.getCodsetor())))
				&& ((this.getCodempoc() == castOther.getCodempoc()) || (this
						.getCodempoc() != null
						&& castOther.getCodempoc() != null && this
						.getCodempoc().equals(castOther.getCodempoc())))
				&& ((this.getCodfilialoc() == castOther.getCodfilialoc()) || (this
						.getCodfilialoc() != null
						&& castOther.getCodfilialoc() != null && this
						.getCodfilialoc().equals(castOther.getCodfilialoc())))
				&& ((this.getCodorigcont() == castOther.getCodorigcont()) || (this
						.getCodorigcont() != null
						&& castOther.getCodorigcont() != null && this
						.getCodorigcont().equals(castOther.getCodorigcont())))
				&& ((this.getCodempti() == castOther.getCodempti()) || (this
						.getCodempti() != null
						&& castOther.getCodempti() != null && this
						.getCodempti().equals(castOther.getCodempti())))
				&& ((this.getCodfilialti() == castOther.getCodfilialti()) || (this
						.getCodfilialti() != null
						&& castOther.getCodfilialti() != null && this
						.getCodfilialti().equals(castOther.getCodfilialti())))
				&& ((this.getCodtipocli() == castOther.getCodtipocli()) || (this
						.getCodtipocli() != null
						&& castOther.getCodtipocli() != null && this
						.getCodtipocli().equals(castOther.getCodtipocli())))
				&& ((this.getCodempcc() == castOther.getCodempcc()) || (this
						.getCodempcc() != null
						&& castOther.getCodempcc() != null && this
						.getCodempcc().equals(castOther.getCodempcc())))
				&& ((this.getCodfilialcc() == castOther.getCodfilialcc()) || (this
						.getCodfilialcc() != null
						&& castOther.getCodfilialcc() != null && this
						.getCodfilialcc().equals(castOther.getCodfilialcc())))
				&& ((this.getCodclascli() == castOther.getCodclascli()) || (this
						.getCodclascli() != null
						&& castOther.getCodclascli() != null && this
						.getCodclascli().equals(castOther.getCodclascli())))
				&& ((this.getAtivo() == castOther.getAtivo()) || (this
						.getAtivo() != null && castOther.getAtivo() != null && this
						.getAtivo().equals(castOther.getAtivo())))
				&& ((this.getDtins() == castOther.getDtins()) || (this
						.getDtins() != null && castOther.getDtins() != null && this
						.getDtins().equals(castOther.getDtins())))
				&& ((this.getDtalt() == castOther.getDtalt()) || (this
						.getDtalt() != null && castOther.getDtalt() != null && this
						.getDtalt().equals(castOther.getDtalt())))
				&& ((this.getDtinscc() == castOther.getDtinscc()) || (this
						.getDtinscc() != null && castOther.getDtinscc() != null && this
						.getDtinscc().equals(castOther.getDtinscc())))
				&& ((this.getDtaltcc() == castOther.getDtaltcc()) || (this
						.getDtaltcc() != null && castOther.getDtaltcc() != null && this
						.getDtaltcc().equals(castOther.getDtaltcc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTipocto() == null ? 0 : this.getTipocto().hashCode());
		result = 37 * result
				+ (getCodemp() == null ? 0 : this.getCodemp().hashCode());
		result = 37 * result
				+ (getCodfilial() == null ? 0 : this.getCodfilial().hashCode());
		result = 37 * result
				+ (getCodcto() == null ? 0 : this.getCodcto().hashCode());
		result = 37 * result
				+ (getRazcto() == null ? 0 : this.getRazcto().hashCode());
		result = 37 * result
				+ (getNomecto() == null ? 0 : this.getNomecto().hashCode());
		result = 37 * result
				+ (getContcto() == null ? 0 : this.getContcto().hashCode());
		result = 37 * result
				+ (getEmailcto() == null ? 0 : this.getEmailcto().hashCode());
		result = 37 * result
				+ (getObscto() == null ? 0 : this.getObscto().hashCode());
		result = 37 * result
				+ (getCodempto() == null ? 0 : this.getCodempto().hashCode());
		result = 37
				* result
				+ (getCodfilialto() == null ? 0 : this.getCodfilialto()
						.hashCode());
		result = 37
				* result
				+ (getCodtipocont() == null ? 0 : this.getCodtipocont()
						.hashCode());
		result = 37 * result
				+ (getCodempsr() == null ? 0 : this.getCodempsr().hashCode());
		result = 37
				* result
				+ (getCodfilialsr() == null ? 0 : this.getCodfilialsr()
						.hashCode());
		result = 37 * result
				+ (getCodsetor() == null ? 0 : this.getCodsetor().hashCode());
		result = 37 * result
				+ (getCodempoc() == null ? 0 : this.getCodempoc().hashCode());
		result = 37
				* result
				+ (getCodfilialoc() == null ? 0 : this.getCodfilialoc()
						.hashCode());
		result = 37
				* result
				+ (getCodorigcont() == null ? 0 : this.getCodorigcont()
						.hashCode());
		result = 37 * result
				+ (getCodempti() == null ? 0 : this.getCodempti().hashCode());
		result = 37
				* result
				+ (getCodfilialti() == null ? 0 : this.getCodfilialti()
						.hashCode());
		result = 37
				* result
				+ (getCodtipocli() == null ? 0 : this.getCodtipocli()
						.hashCode());
		result = 37 * result
				+ (getCodempcc() == null ? 0 : this.getCodempcc().hashCode());
		result = 37
				* result
				+ (getCodfilialcc() == null ? 0 : this.getCodfilialcc()
						.hashCode());
		result = 37
				* result
				+ (getCodclascli() == null ? 0 : this.getCodclascli()
						.hashCode());
		result = 37 * result
				+ (getAtivo() == null ? 0 : this.getAtivo().hashCode());
		result = 37 * result
				+ (getDtins() == null ? 0 : this.getDtins().hashCode());
		result = 37 * result
				+ (getDtalt() == null ? 0 : this.getDtalt().hashCode());
		result = 37 * result
				+ (getDtinscc() == null ? 0 : this.getDtinscc().hashCode());
		result = 37 * result
				+ (getDtaltcc() == null ? 0 : this.getDtaltcc().hashCode());
		return result;
	}

}

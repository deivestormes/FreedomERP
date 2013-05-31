package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdcliveicId generated by hbm2java
 */
@Embeddable
public class VdcliveicId implements java.io.Serializable {

	private String placaveic;
	private int codcli;
	private short codfilial;
	private int codemp;

	public VdcliveicId() {
	}

	public VdcliveicId(String placaveic, int codcli, short codfilial, int codemp) {
		this.placaveic = placaveic;
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "PLACAVEIC", nullable = false, length = 10)
	public String getPlacaveic() {
		return this.placaveic;
	}

	public void setPlacaveic(String placaveic) {
		this.placaveic = placaveic;
	}

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdcliveicId))
			return false;
		VdcliveicId castOther = (VdcliveicId) other;

		return ((this.getPlacaveic() == castOther.getPlacaveic()) || (this
				.getPlacaveic() != null && castOther.getPlacaveic() != null && this
				.getPlacaveic().equals(castOther.getPlacaveic())))
				&& (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPlacaveic() == null ? 0 : this.getPlacaveic().hashCode());
		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}

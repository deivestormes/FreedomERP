package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * TkcontcliId generated by hbm2java
 */
public class TkcontcliId implements java.io.Serializable {

	private int codcto;
	private short codfilialcto;
	private int codempcto;
	private int codcli;
	private int codempcli;
	private short codfilialcli;

	public TkcontcliId() {
	}

	public TkcontcliId(int codcto, short codfilialcto, int codempcto,
			int codcli, int codempcli, short codfilialcli) {
		this.codcto = codcto;
		this.codfilialcto = codfilialcto;
		this.codempcto = codempcto;
		this.codcli = codcli;
		this.codempcli = codempcli;
		this.codfilialcli = codfilialcli;
	}

	public int getCodcto() {
		return this.codcto;
	}

	public void setCodcto(int codcto) {
		this.codcto = codcto;
	}

	public short getCodfilialcto() {
		return this.codfilialcto;
	}

	public void setCodfilialcto(short codfilialcto) {
		this.codfilialcto = codfilialcto;
	}

	public int getCodempcto() {
		return this.codempcto;
	}

	public void setCodempcto(int codempcto) {
		this.codempcto = codempcto;
	}

	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	public int getCodempcli() {
		return this.codempcli;
	}

	public void setCodempcli(int codempcli) {
		this.codempcli = codempcli;
	}

	public short getCodfilialcli() {
		return this.codfilialcli;
	}

	public void setCodfilialcli(short codfilialcli) {
		this.codfilialcli = codfilialcli;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TkcontcliId))
			return false;
		TkcontcliId castOther = (TkcontcliId) other;

		return (this.getCodcto() == castOther.getCodcto())
				&& (this.getCodfilialcto() == castOther.getCodfilialcto())
				&& (this.getCodempcto() == castOther.getCodempcto())
				&& (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodempcli() == castOther.getCodempcli())
				&& (this.getCodfilialcli() == castOther.getCodfilialcli());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcto();
		result = 37 * result + this.getCodfilialcto();
		result = 37 * result + this.getCodempcto();
		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodempcli();
		result = 37 * result + this.getCodfilialcli();
		return result;
	}

}

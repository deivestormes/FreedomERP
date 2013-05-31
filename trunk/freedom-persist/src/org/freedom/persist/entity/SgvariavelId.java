package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgvariavelId generated by hbm2java
 */
@Embeddable
public class SgvariavelId implements java.io.Serializable {

	private String idvar;
	private int idcon;

	public SgvariavelId() {
	}

	public SgvariavelId(String idvar, int idcon) {
		this.idvar = idvar;
		this.idcon = idcon;
	}

	@Column(name = "IDVAR", nullable = false, length = 18)
	public String getIdvar() {
		return this.idvar;
	}

	public void setIdvar(String idvar) {
		this.idvar = idvar;
	}

	@Column(name = "IDCON", nullable = false)
	public int getIdcon() {
		return this.idcon;
	}

	public void setIdcon(int idcon) {
		this.idcon = idcon;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgvariavelId))
			return false;
		SgvariavelId castOther = (SgvariavelId) other;

		return ((this.getIdvar() == castOther.getIdvar()) || (this.getIdvar() != null
				&& castOther.getIdvar() != null && this.getIdvar().equals(
				castOther.getIdvar())))
				&& (this.getIdcon() == castOther.getIdcon());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdvar() == null ? 0 : this.getIdvar().hashCode());
		result = 37 * result + this.getIdcon();
		return result;
	}

}

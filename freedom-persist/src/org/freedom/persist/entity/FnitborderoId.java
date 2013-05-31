package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnitborderoId generated by hbm2java
 */
@Embeddable
public class FnitborderoId implements java.io.Serializable {

	private int codbor;
	private int codfilial;
	private int codemp;
	private int codrec;
	private int nparcitrec;
	private int codfilialrc;
	private int codemprc;

	public FnitborderoId() {
	}

	public FnitborderoId(int codbor, int codfilial, int codemp, int codrec,
			int nparcitrec, int codfilialrc, int codemprc) {
		this.codbor = codbor;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codrec = codrec;
		this.nparcitrec = nparcitrec;
		this.codfilialrc = codfilialrc;
		this.codemprc = codemprc;
	}

	@Column(name = "CODBOR", nullable = false)
	public int getCodbor() {
		return this.codbor;
	}

	public void setCodbor(int codbor) {
		this.codbor = codbor;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODREC", nullable = false)
	public int getCodrec() {
		return this.codrec;
	}

	public void setCodrec(int codrec) {
		this.codrec = codrec;
	}

	@Column(name = "NPARCITREC", nullable = false)
	public int getNparcitrec() {
		return this.nparcitrec;
	}

	public void setNparcitrec(int nparcitrec) {
		this.nparcitrec = nparcitrec;
	}

	@Column(name = "CODFILIALRC", nullable = false)
	public int getCodfilialrc() {
		return this.codfilialrc;
	}

	public void setCodfilialrc(int codfilialrc) {
		this.codfilialrc = codfilialrc;
	}

	@Column(name = "CODEMPRC", nullable = false)
	public int getCodemprc() {
		return this.codemprc;
	}

	public void setCodemprc(int codemprc) {
		this.codemprc = codemprc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FnitborderoId))
			return false;
		FnitborderoId castOther = (FnitborderoId) other;

		return (this.getCodbor() == castOther.getCodbor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodrec() == castOther.getCodrec())
				&& (this.getNparcitrec() == castOther.getNparcitrec())
				&& (this.getCodfilialrc() == castOther.getCodfilialrc())
				&& (this.getCodemprc() == castOther.getCodemprc());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodbor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodrec();
		result = 37 * result + this.getNparcitrec();
		result = 37 * result + this.getCodfilialrc();
		result = 37 * result + this.getCodemprc();
		return result;
	}

}

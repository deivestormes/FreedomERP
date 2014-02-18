package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FnitborderoId generated by hbm2java
 */
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

	public int getCodbor() {
		return this.codbor;
	}

	public void setCodbor(int codbor) {
		this.codbor = codbor;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public int getCodrec() {
		return this.codrec;
	}

	public void setCodrec(int codrec) {
		this.codrec = codrec;
	}

	public int getNparcitrec() {
		return this.nparcitrec;
	}

	public void setNparcitrec(int nparcitrec) {
		this.nparcitrec = nparcitrec;
	}

	public int getCodfilialrc() {
		return this.codfilialrc;
	}

	public void setCodfilialrc(int codfilialrc) {
		this.codfilialrc = codfilialrc;
	}

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

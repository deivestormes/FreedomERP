package org.freedom.modulos.gms.business.object;


public class GestaoSol {
	public static enum GRID_SOL {   IMGCOLUNA, SITITSOL, SEL, CODPROD, REFPROD, DESCPROD, QTDITSOL, QTDAPROVITSOL, CODSOL, CODITSOL, SLDPROD, CODCC, IDUSUITSOL, IDUSUAPROVITSOL }
	
	public class SelectedSol{
		Integer codsol;
		Integer coditsol;
		String statussol;
	}

}

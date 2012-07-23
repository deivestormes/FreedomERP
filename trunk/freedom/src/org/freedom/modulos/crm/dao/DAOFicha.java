package org.freedom.modulos.crm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.freedom.infra.dao.AbstractDAO;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.modulos.crm.business.object.FichaOrc;
import org.freedom.modulos.crm.business.object.ItOrcamento;
import org.freedom.modulos.crm.business.object.Orcamento;


public class DAOFicha extends AbstractDAO {
	
	private Object prefs[] = null;
	
	public DAOFicha( DbConnection cn) {

		super( cn );
	}
	
	public StringBuilder getSqlFichaAval() {
		StringBuilder sql= new StringBuilder();
		
		sql.append("select f.razfilial, f.dddfilial, f.fonefilial ");
		sql.append(", f.endfilial, f.numfilial, f.siglauf siglauff ");
		sql.append(", f.bairfilial, f.cnpjfilial,f.emailfilial " );
		sql.append(", m.nomemunic nomemunicf ");
		sql.append(", c.razcto, c.endcto, c.numcto, c.baircto ");
		sql.append(", c.siglauf siglaufc, c.cpfcto, c.dddcto ");
		sql.append(", c.fonecto, c.cnpjcto, c.celcto ");
		sql.append(", c.contcto, mc.nomemunic nomemunicc, c.pessoacto, c.emailcto ");
		sql.append(", fa.seqfichaaval, fa.codmotaval, fa.dtfichaaval ");
		sql.append(", fa.localfichaaval, fa.finalifichaaval, fa.predentrfichaaval, fa.andarfichaaval ");
		sql.append(", fa.cobertfichaaval, fa.estrutfichaaval, fa.ocupadofichaaval, fa.mobilfichaaval, fa.janelafichaaval ");
		sql.append(", fa.sacadafichaaval, fa.outrosfichaaval, fa.obsfichaaval, fa.ocupadofichaaval ");
		sql.append("from sgfilial f ");
		sql.append("left outer join sgmunicipio m on ");
		sql.append("m.codmunic=f.codmunic and m.codpais=f.codpais ");
		sql.append("and m.siglauf=f.siglauf ");
		sql.append("inner join tkcontato c on ");
		sql.append("c.codemp=? and c.codfilial=? and c.codcto=? ");
		sql.append("left outer join sgmunicipio mc on ");
		sql.append("mc.codmunic=c.codmunic and mc.codpais=c.codpais ");
		sql.append("and mc.siglauf=c.siglauf ");
		sql.append("left outer join crfichaaval fa on ");
		sql.append("fa.codemp=? and fa.codfilial=? and fa.seqfichaaval=? ");
		sql.append("and fa.codempco = c.codemp and fa.codfilialco= c.codfilial and fa.codcto=c.codcto ");
		sql.append("left outer join critfichaaval itfa on ");
		sql.append("itfa.codemp = fa.codemp and itfa.codfilial= fa.codfilial and itfa.seqfichaaval= fa.seqfichaaval ");
		sql.append("where f.codemp=? and f.codfilial=? ");
 		
		return sql;
	}
	
	public Integer getCliente(int codemp, int codfilial, int codcto) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		Integer codcli = null;
		
		try {
			sql = new StringBuilder();
			sql.append( "select c.codcli from tkcontcli c where c.codempcto=? and c.codfilialcto =? and c.codcto=?" );
			
			ps = getConn().prepareStatement( sql.toString() );
			int param = 1;
			ps.setInt( param++, codemp );
			ps.setInt( param++, codfilial );
			ps.setInt( param++, codcto );
						
			rs = ps.executeQuery();
			
			if(rs.next()){
				codcli = rs.getInt( "CODCLI" );
			}
			
		} finally {
			rs = null;
			ps = null;
			sql = null;
		}
		
		return codcli;
	}
	
	public Integer getTransp(Integer codemp, Integer codfilial, Integer codcli) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs =null;
		Integer codtran = null;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select c.codtran from vdcliente c where c.codemp=? and c.codfilial=? and c.codcli=?");
			ps = getConn().prepareStatement( sql.toString() );
			int param = 1;
			ps.setInt( param++, codemp );
			ps.setInt( param++, codfilial );
			ps.setInt( param++, codcli );
			rs = ps.executeQuery();
			
			if(rs.next()){
				codtran = rs.getInt( "codtran" );
			}
		
		} finally {
			rs.close();
			ps.close();
		}
			
		return codtran;
	}
	
	public Integer getVendedor(Integer codemp, Integer codfilial, Integer codcli) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs =null;
		Integer codcomiss = null;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select c.codvend from vdcliente c where c.codemp=? and c.codfilial=? and c.codcli=?");
			ps = getConn().prepareStatement( sql.toString() );
			int param = 1;
			ps.setInt( param++, codemp );
			ps.setInt( param++, codfilial );
			ps.setInt( param++, codcli );
			rs = ps.executeQuery();
			
			if(rs.next()){
				codcomiss = rs.getInt( "codvend" );
			}
		
		} finally {
			rs.close();
			ps.close();
		}

		return codcomiss;
	}
	
	public Integer populaOrc(Integer codemp, Integer codfilial, Integer codcto, Date dtorc, Date dtvencorc, Integer codplanopag) throws SQLException{
		
		Integer codcli = null;
		Integer codtran = null;
		Integer codvend = null;
		Integer codorc = null;
				
		codcli = getCliente( codemp, codfilial, codcto );
		codtran = getTransp( codemp, codfilial, codcli );
		codvend = getVendedor( codemp, codfilial, codcli );
		codorc = loadUltCodOrc();
		
		Orcamento orcamento = new Orcamento();
		orcamento.setCodemp( codemp );
		orcamento.setCodfilial( codfilial );
		orcamento.setTipoorc("O");
		orcamento.setCodorc( codorc );
		orcamento.setCodempcl( Aplicativo.iCodEmp );
		orcamento.setCodfilialcl( ListaCampos.getMasterFilial( "VDCLIENTE" ) );
		orcamento.setCodcli( codcli );
		orcamento.setDtorc( dtorc );
		orcamento.setDtvencorc( dtvencorc );
		orcamento.setCodempvd( Aplicativo.iCodEmp );
		orcamento.setCodfilialvd( ListaCampos.getMasterFilial( "VDVEND" )  );
		orcamento.setCodvend( codvend );
		orcamento.setCodemppg( Aplicativo.iCodEmp );
		orcamento.setCodfilialpg( ListaCampos.getMasterFilial( "FNPLANOPAG" )  );
		orcamento.setCodplanopag( codplanopag );
		orcamento.setCodemptn( Aplicativo.iCodEmp );
		orcamento.setCodfilialtn( ListaCampos.getMasterFilial( "VDTRANSP" )  );
		orcamento.setCodtran( codtran );
		orcamento.setStatusorc( "*" );
		
		insert_orc( orcamento );
		
		return codorc;
	
	}
		
	public void insert_orc(Orcamento orc) throws SQLException {
		StringBuilder sql = new StringBuilder();
		PreparedStatement ps = null;
		ResultSet rs = null;

		sql.append( "INSERT INTO VDORCAMENTO ( ")
		   .append("CODEMP, CODFILIAL, TIPOORC, CODORC, DTORC, DTVENCORC, " )
		   .append("CODEMPCL, CODFILIALCL, CODCLI,") 
		   .append("CODEMPVD, CODFILIALVD, CODVEND, ")
		   .append("CODEMPPG, CODFILIALPG, CODPLANOPAG, ")
		   .append("CODEMPTN, CODFILIALTN, CODTRAN, STATUSORC ) ")
		   .append("VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" );
		
		ps = getConn().prepareStatement( sql.toString() );
		
		ps.setInt( FichaOrc.INSERT_ORC.CODEMP.ordinal() , orc.getCodemp() );
		ps.setInt( FichaOrc.INSERT_ORC.CODFILIAL.ordinal() , orc.getCodfilial() );
		ps.setString( FichaOrc.INSERT_ORC.TIPOORC.ordinal() , orc.getTipoorc() );
		ps.setInt( FichaOrc.INSERT_ORC.CODORC.ordinal() , orc.getCodorc() );
		ps.setDate( FichaOrc.INSERT_ORC.DTORC.ordinal() , Funcoes.dateToSQLDate( orc.getDtorc() ));
		ps.setDate( FichaOrc.INSERT_ORC.DTVENCORC.ordinal() ,Funcoes.dateToSQLDate( orc.getDtvencorc()) );
		ps.setInt( FichaOrc.INSERT_ORC.CODEMPCL.ordinal() , orc.getCodempcl() );
		ps.setInt( FichaOrc.INSERT_ORC.CODFILIALCL.ordinal() , orc.getCodfilialcl() );
		ps.setInt( FichaOrc.INSERT_ORC.CODCLI.ordinal() , orc.getCodcli() );
		ps.setInt( FichaOrc.INSERT_ORC.CODEMPVD.ordinal() , orc.getCodempvd() );
		ps.setInt( FichaOrc.INSERT_ORC.CODFILIALVD.ordinal() , orc.getCodfilialvd() );
		ps.setInt( FichaOrc.INSERT_ORC.CODVEND.ordinal() , orc.getCodvend() );
		ps.setInt( FichaOrc.INSERT_ORC.CODEMPPG.ordinal() , orc.getCodemppg() );
		ps.setInt( FichaOrc.INSERT_ORC.CODFILIALPG.ordinal() , orc.getCodfilialpg() );
		ps.setInt( FichaOrc.INSERT_ORC.CODPLANOPAG.ordinal() , orc.getCodplanopag() );
		ps.setInt( FichaOrc.INSERT_ORC.CODEMPTN.ordinal() , orc.getCodemptn() );
		ps.setInt( FichaOrc.INSERT_ORC.CODFILIALTN.ordinal() , orc.getCodfilialtn() );
		ps.setInt( FichaOrc.INSERT_ORC.CODTRAN.ordinal() , orc.getCodtran() );
		ps.setString(FichaOrc.INSERT_ORC.STATUSORC.ordinal() , orc.getStatusorc() );
		
		ps.executeUpdate();
		getConn().commit();
	}
	
	
	public void insert_item_orc(ItOrcamento item) throws SQLException {
		StringBuilder sql = new StringBuilder();
		PreparedStatement ps = null;
		ResultSet rs = null;

		sql.append( "INSERT INTO VDITORCAMENTO ( ")
		   .append("CODEMP, CODFILIAL, TIPOORC, CODORC, CODITORC, " )
		   .append("CODEMPPD, CODFILIALPD, CODPROD,") 
		   .append("CODEMPAX, CODFILIALAX, CODALMOX, QTDITORC, PRECOITORC ) ")
		   .append("VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)" );
		
		ps = getConn().prepareStatement( sql.toString() );
		
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODEMP.ordinal() , item.getCodemp() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODFILIAL.ordinal() , item.getCodfilial() );
		ps.setString( FichaOrc.INSERT_ITEM_ORC.TIPOORC.ordinal() , item.getTipoorc() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODORC.ordinal() , item.getCodorc() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODITORC.ordinal() , item.getCoditorc());
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODEMPPD.ordinal() , item.getCodemppd() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODFILIALPD.ordinal() , item.getCodfilialpd() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODPROD.ordinal() , item.getCodprod() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODEMPAX.ordinal() , item.getCodempax() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODFILIALAX.ordinal() , item.getCodfilialax() );
		ps.setInt( FichaOrc.INSERT_ITEM_ORC.CODALMOX.ordinal() , item.getCodalmox() );
		ps.setBigDecimal(  FichaOrc.INSERT_ITEM_ORC.QTDITORC.ordinal() , item.getQtditorc() );
		ps.setBigDecimal( FichaOrc.INSERT_ITEM_ORC.PRECOITORC.ordinal() , item.getPrecoitorc() );
		
		ps.executeUpdate();
		getConn().commit();
	}
	
	public void insert_fichaorc(FichaOrc ficha) throws SQLException{
		StringBuilder sql = new StringBuilder();
		PreparedStatement ps = null;
		ResultSet rs = null;

		sql.append( "INSERT INTO CRFICHAORC ( ")
		   .append("CODEMP, CODFILIAL, SEQFICHAAVAL, SEQITFICHAAVAL, " )
		   .append("CODEMPOR, CODFILIALOR, TIPOORC, CODORC, CODITORC ) ") 
		   .append("VALUES (?,?,?,?,?,?,?,?,?)" );
		
		ps = getConn().prepareStatement( sql.toString() );
		
		ps.setInt( FichaOrc.INSERT_FICHAORC.CODEMP.ordinal() , ficha.getCodemp() );
		ps.setInt( FichaOrc.INSERT_FICHAORC.CODFILIAL.ordinal() , ficha.getCodfilial() );
		ps.setInt( FichaOrc.INSERT_FICHAORC.SEQFICHAAVAL.ordinal() , ficha.getSeqfichaaval() );
		ps.setInt( FichaOrc.INSERT_FICHAORC.SEQITFICHAAVAL.ordinal() , ficha.getSeqitfichaaval() );
		ps.setInt( FichaOrc.INSERT_FICHAORC.CODEMPOR.ordinal() , ficha.getCodempor() );
		ps.setInt( FichaOrc.INSERT_FICHAORC.CODFILIALOR.ordinal() , ficha.getCodfilialor() );
		ps.setString( FichaOrc.INSERT_FICHAORC.TIPOORC.ordinal() , ficha.getTipoorc());
		ps.setInt( FichaOrc.INSERT_FICHAORC.CODORC.ordinal() , ficha.getCodorc() );
		ps.setInt( FichaOrc.INSERT_FICHAORC.CODITORC.ordinal() , ficha.getCoditorc());
		
		ps.executeUpdate();
		getConn().commit();

	}
	
	public Integer loadUltCodOrc() throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		PreparedStatement psOrc = null;
		ResultSet rsOrc = null;
		Integer codorc = null;
		 
		try {
			StringBuilder sql = new StringBuilder();
			sql.append( "select max(o.codorc) + 1 codorc from vdorcamento o " );
			ps = getConn().prepareStatement( sql.toString() );
			rs = ps.executeQuery();
			if(rs.next()){
				codorc = rs.getInt( "codorc" );
			}

		}finally{
			ps.close();
			rs.close();
		}
		return codorc;
	}
	
	public ArrayList<Orcamento> loadOrcamento(Integer codemp, Integer codfilial, Integer seqfichaaval) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs =null;
		Orcamento result = null;
		StringBuilder sql = new StringBuilder();
		ArrayList<Orcamento> itens_orc = new ArrayList<Orcamento>();
		
		sql.append(" select o.codorc, o.codempcl, o.codfilialcl, o.codcli, c.razcli, o.dtorc, ")
		   .append( "o.dtvencorc, o.codemppg, o.codfilialpg, o.codplanopag, p.descplanopag, ")
		   .append(" it.coditorc, it.qtditorc, it.precoitorc, o.tipoorc ")
		   .append(" from crfichaorc fo, vdorcamento o, vdcliente c, fnplanopag p, vditorcamento it ")
		   .append(" where fo.codemp=? and fo.codfilial=? and fo.seqfichaaval=? and ")
		   .append(" it.codemp=fo.codemp and it.codfilial=fo.codfilial and ")
		   .append(" it.codorc=fo.codorc and it.tipoorc=fo.tipoorc and it.coditorc= fo.coditorc and ")
		   .append(" o.codemp=it.codemp and o.codfilial=it.codfilial and o.codorc=it.codorc and o.tipoorc=it.tipoorc and ")
		   .append(" c.codemp=o.codempcl and c.codfilial=o.codfilialcl and c.codcli=o.codcli and ")
		   .append(" p.codemp=o.codemppg and p.codfilial=o.codfilialpg and p.codplanopag=o.codplanopag ")
		   .append(" order by fo.codorc, fo.coditorc ");
		
		ps = getConn().prepareStatement( sql.toString() );
		int param = 1;
		ps.setInt( param++, codemp );
		ps.setInt( param++, codfilial );
		ps.setInt( param++, seqfichaaval );
		rs = ps.executeQuery();
		
		while(rs.next()){
			result = new Orcamento();
			result.setCodemp( codemp );
			result.setCodfilial( codfilial );
			result.setCodorc( rs.getInt( "codorc" ) );
			result.setCoditorc( rs.getInt( "coditorc" ));
			result.setCodempcl( rs.getInt( "codempcl" ) );
			result.setCodfilialcl( rs.getInt( "codfilialcl" ) );
			result.setDtorc( rs.getDate("dtorc" ) );
			result.setDtvencorc( rs.getDate("dtvencorc") );
			result.setCodemppg( rs.getInt( "codemppg" ) );
			result.setCodfilialpg( rs.getInt( "codfilialpg" ) );
			result.setCodplanopag( rs.getInt( "codplanopag" ) );
			result.setQtditorc( rs.getBigDecimal( "qtditorc" ));
			result.setPrecoitorc(rs.getBigDecimal("precoitorc"));
			result.setTipoorc(rs.getString( "tipoorc" ));	
			
			itens_orc.add( result );
		}
		return itens_orc;
	}
	
	
	public void setPrefs(Integer codemp, Integer codfilial) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		
		prefs = new Object[ FichaOrc.PREFS.values().length];
		
		try {
			sql = new StringBuilder("select p.usactoseq, p.layoutfichaaval, pf.codplanopag " );
			sql.append( "from sgprefere3 p , sgprefere4 pf "); 
			sql.append( "where  p.codemp=? and p.codfilial=? and pf.codemp=p.codemp and pf.codfilial=p.codfilial" );
			
			ps = getConn().prepareStatement( sql.toString() );
			int param=1;
			ps.setInt( param++, codemp );
			ps.setInt( param++, codfilial );
			rs = ps.executeQuery();
			if ( rs.next() ) {
				
				prefs[ FichaOrc.PREFS.USACTOSEQ.ordinal() ] = rs.getString( FichaOrc.PREFS.USACTOSEQ.toString() );
				prefs[ FichaOrc.PREFS.LAYOUTFICHAAVAL.ordinal() ] = rs.getString( FichaOrc.PREFS.LAYOUTFICHAAVAL.toString() );
				prefs[ FichaOrc.PREFS.CODPLANOPAG.ordinal() ] = rs.getInt(  FichaOrc.PREFS.CODPLANOPAG.toString() );
			}
			rs.close();
			ps.close();
			getConn().commit();
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}
	}
	
	public Object[] getPrefs() {
		return this.prefs;
	}

}

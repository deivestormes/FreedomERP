package org.freedom.modulos.gms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.freedom.infra.dao.AbstractDAO;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.modulos.gms.business.object.CotacaoPrecos;


public class DAOCotPreco extends AbstractDAO {

	public DAOCotPreco( DbConnection cn) {

		super( cn );
	
	}
	
	public boolean [] buscaInfoUsuAtual(   boolean baprovacab, boolean bcotacao, String codcc, Integer codempcc, Integer codfilialcc ) throws SQLException {
		
		StringBuilder sql = null;	
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sAprova = null;
		String sCotacao = null;
		try {
			sql = new StringBuilder("SELECT ");
			sql.append( "ANOCC,CODCC,CODEMPCC,CODFILIALCC,APROVCPSOLICITACAOUSU,COMPRASUSU " );
			sql.append( "FROM SGUSUARIO " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=?  AND IDUSU=? " );
				
			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGUSUARIO" ) );
			ps.setString( 3, Aplicativo.strUsuario );
			rs = ps.executeQuery();
			if ( rs.next() ) {
				sAprova = rs.getString( "APROVCPSOLICITACAOUSU" );
				sCotacao = rs.getString( "COMPRASUSU" );
				if ( sAprova != null ) {
					if ( !sAprova.equals( "ND" ) ) {
						if ( sAprova.equals( "TD" ) )
							baprovacab = true;
						else if ( ( codcc.trim().equals( rs.getString( "CODCC" ).trim() ) ) 
								&& ( codempcc == rs.getInt( "CODEMPCC" ) ) && ( codfilialcc == rs.getInt( "CODFILIALCC" ) ) 
								&& ( sAprova.equals( "CC" ) ) ) {
							baprovacab = true;
						}
						else {
							baprovacab = false;
						}
	
					}
				}
			}
			

			if ( sCotacao != null ) {
				if ( sCotacao.equals( "S" ) )
					bcotacao = true;
				else
					bcotacao = false;
			}
		
			getConn().commit();
	
		} finally {
			rs = null;
			ps = null;
			sql = null;
		}
		boolean [] result = { baprovacab , bcotacao };
		return result;
	}
	
	
	public Boolean getPrefs( Integer codemp, Integer codfilial ) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Boolean usarefprod = false;
		StringBuilder sql = null;
		try {
			sql = new StringBuilder();
			sql.append( " SELECT USAREFPROD FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=? " );
			
			
			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codemp );
			ps.setInt( 2, codfilial );
			rs = ps.executeQuery();
			if ( rs.next() ) {
				if ( rs.getString( "UsaRefProd" ).trim().equals( "S" ) )
				usarefprod = true;
			}
			rs.close();
			ps.close();
		} finally {
			rs = null;
			ps = null;
			sql = null;
		}

		return usarefprod;
	}
	
	public Integer getAnoCC( Integer codemp, Integer codfilial ) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Integer anocc = 0;
		StringBuilder sql = null;
		try {
			sql = new StringBuilder();
			sql.append( " SELECT ANOCENTROCUSTO FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=? " );
			
			
			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codemp );
			ps.setInt( 2, codfilial );
			rs = ps.executeQuery();
			if ( rs.next() ) {
				anocc = rs.getInt( "ANOCENTROCUSTO" );
			}
			rs.close();
			ps.close();
		} finally {
			rs = null;
			ps = null;
			sql = null;
		}

		return anocc;
	}
	
	public Map<String, Object> setParam(Integer codemp, Integer codfilial, String idusu) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			sql = new StringBuilder("SELECT ");
			sql.append( "ANOCC, CODCC " );
			sql.append( "FROM SGUSUARIO " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=? AND IDUsu=? " );
			
			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codemp );
			ps.setInt( 2, codfilial );
			ps.setString( 3, idusu );
			rs = ps.executeQuery();
			
			if ( rs.next() ) {
				
				result.put( "anocc", new Integer(rs.getInt( "ANOCC" ) ) );
				result.put( "codcc", getString( rs.getString( "CODCC" ) ) );
				
			}

			getConn().commit();
		} finally {
			rs = null;
			ps = null;
			sql = null;
		}
		return result;
	}
	
	public void recarregaPrecosPedidos( CotacaoPrecos cot ) throws Exception {

		StringBuilder sql_itens = new StringBuilder();
		StringBuilder sql_update = new StringBuilder();
	
		PreparedStatement ps_update = null;
		PreparedStatement ps_select = null;
		
		ResultSet rs = null;

		try {
	
			// Query para selecionar a compra ;
			sql_itens.append( "select " );
			sql_itens.append( "cp.codcompra, ic.coditcompra " );
			sql_itens.append( "from cpitcompra ic, cpcompra cp " );
			
			sql_itens.append( "left outer join eqrecmerc rm on ");
			sql_itens.append( "rm.codemp=cp.codemprm and rm.codfilial=cp.codfilialrm and rm.ticket=cp.ticket ");
			
			sql_itens.append( "where " ); 
			sql_itens.append( "cp.codempfr=? and cp.codfilialfr=? and cp.codfor=? and " );
			sql_itens.append( "cp.codemppg=? and cp.codfilialpg=? and cp.codplanopag=? and cp.dtentcompra between ? and ? " );
			sql_itens.append( "and ic.codemp=cp.codemp and ic.codfilial=cp.codfilial and ic.codcompra=cp.codcompra and " );
			sql_itens.append( "ic.codemppd=? and ic.codfilialpd=? and ic.codprod=? " );
			sql_itens.append( "and cp.statuscompra in ('P1','P2','P3') " );
			
			if( "S".equals( cot.getUsarendacot() ) ) {			
				sql_itens.append( "and rm.rendaamostragem=? ");				
			}

			// Query para atualizar o pre�o;
			sql_update.append( "update cpitcompra ic " );
			sql_update.append( "set ic.precoitcompra=?, ic.aprovpreco=?, ic.vlrliqitcompra = ( (? * ic.qtditcompra) - (coalesce(ic.vlrdescitcompra,0) ) ) " );
			sql_update.append( "where ic.codemp=? and ic.codfilial=? and ic.codcompra=? and ic.coditcompra=? " );
			
			// Executando query dos itens de compra a serem atualizados

			ps_select = getConn().prepareStatement( sql_itens.toString() );

			int iparam = 1;

			ps_select.setInt( iparam++, cot.getCodempfr());
			ps_select.setInt( iparam++, cot.getCodfilialfr() );
			ps_select.setInt( iparam++, cot.getCodfor() );

			ps_select.setInt( iparam++, cot.getCodemppg() );
			ps_select.setInt( iparam++, cot.getCodfilialpg() );
			ps_select.setInt( iparam++, cot.getCodplanpag()	 );

			ps_select.setDate( iparam++, Funcoes.dateToSQLDate( cot.getDtcot() ) );
			ps_select.setDate( iparam++, Funcoes.dateToSQLDate( cot.getDtvalidcot()) );

			ps_select.setInt( iparam++, cot.getCodemppd() );
			ps_select.setInt( iparam++, cot.getCodfilialpd() );
			ps_select.setInt( iparam++, cot.getCodprod() );
			
			if( "S".equals( cot.getUsarendacot() ) ) {
				ps_select.setInt( iparam++, cot.getRenda() );
			}
			
		

			rs = ps_select.executeQuery();
			System.out.println("Query:" + sql_itens.toString());

			// Percorrendo os itens para realiza��o da atualiza��o do pre�o.
			while ( rs.next() ) {
				
				Integer codcompra = rs.getInt( "CODCOMPRA" );
				Integer coditcompra = rs.getInt( "CODITCOMPRA" );
				
				System.out.println("CODCOMPRA:" + codcompra );
				System.out.println("CODITCOMPRA:" + coditcompra );
				
				ps_update = getConn().prepareStatement( sql_update.toString() );

				iparam = 1;
				
				ps_update.setBigDecimal( iparam++, cot.getPrecocot() );
				ps_update.setString( iparam++, "S" );
				ps_update.setBigDecimal( iparam++, cot.getPrecocot() );

				ps_update.setInt( iparam++, Aplicativo.iCodEmp );
				ps_update.setInt( iparam++, ListaCampos.getMasterFilial( "CPCOMPRA" ) );
				ps_update.setInt( iparam++, codcompra );
				ps_update.setInt( iparam++, coditcompra );

				ps_update.executeUpdate();

			}

			getConn().commit();

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	
	private String getString( String value ){
		String result = null;
		
		if (value == null){
			result = "";
		} else {
			result = value;
		}
		return result;
	}	

}

/*
 * Created on 18/10/2004
 * Autor: robson 
 * Descri��o: Classe m�e para telas de venda e or�amento
 */
package org.freedom.modulos.std;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FDetalhe;
import org.freedom.telas.FObservacao;


/**
 * @author robson
 *
 * O Objetivo desta classe � de proporcionar a implementa��o do c�digo comum
 * entre as telas de or�amento e de venda
 */
public abstract class FVD extends FDetalhe {

    public abstract int[] getParansPreco();
    
    public abstract void setParansPreco(BigDecimal bdPreco);
    
    public FVD() {
    	super();
    }
    /**
     * Busca a observa��o do cliente.
     * @param iCodCli codigo do cliente a pesquisar.
     * @return String contendo a observa��o do cliente.
     */
    public String getObsCli(int iCodCli) {
    	String sRetorno = "";
    	String sSQL = "SELECT OBSCLI FROM VDCLIENTE WHERE CODEMP=? AND CODFILIAL=? AND CODCLI=?";
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	try {
    		ps = con.prepareStatement(sSQL);
    		ps.setInt(1, Aplicativo.iCodEmp);
    		ps.setInt(2, ListaCampos.getMasterFilial("VDCLIENTE"));
    		ps.setInt(3, iCodCli);
    		rs = ps.executeQuery();
    		if (rs.next()) {
    			if (rs.getString("OBSCLI")!=null)
    				sRetorno = rs.getString("OBSCLI").trim();
    		}
    		rs.close();
    		ps.close();
    		if (!con.getAutoCommit())
    			con.commit();
    	}
    	catch (SQLException e) {
    		Funcoes.mensagemErro(null, "Erro carregando observa��es do cliente.\n"+e.getMessage());
    	}
    	finally {
    		rs = null;
    		ps = null;
    	}
    	return sRetorno;
    }
    /**
     * mostra uma FObsevacao contendo a descri��o completa do produto,
     * quando clicado duas vezes sobre o JTextFieldFK do item.
     * @param txaObsIt JTextAreaPad.
     * @param iCodProd codigo do produto.
     * @param sDescProd descri��o do produto.
     */
	protected void mostraTelaDecricao( JTextAreaPad txaObsIt, int iCodProd, String sDescProd ) {
		if (iCodProd == 0)
			return;
		String sDesc = txaObsIt.getVlrString();
		if (sDesc.equals(""))
			sDesc = buscaDescComp( iCodProd );
		if (sDesc.equals(""))
			sDesc = sDescProd;

		FObservacao obs = new FObservacao("Descri��o completa", sDesc, 500);
		obs.setVisible(true);
		if (obs.OK) {
			txaObsIt.setVlrString(obs.getTexto());
			lcDet.edit();
		}
		obs.dispose();
	}
	/**
	 * Busca descri��o completa do produto na tabela de produtos .
	 * @param iCodProd codigo do produto a pesquizar.
	 * @return String contendo a descri��o completa do produto.
	 */
	private String buscaDescComp( int iCodProd) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sRet = "";
		String sSQL = "SELECT DESCCOMPPROD FROM EQPRODUTO WHERE CODPROD=?"
				+ " AND CODEMP=? AND CODFILIAL=?";
		try {
			ps = con.prepareStatement(sSQL);
			ps.setInt(1, iCodProd);
			ps.setInt(2, Aplicativo.iCodEmp);
			ps.setInt(3, ListaCampos.getMasterFilial( "EQPRODUTO" ));
			rs = ps.executeQuery();
			if (rs.next()) {
				sRet = rs.getString("DescCompProd");
			}

		} catch (SQLException err) {
			Funcoes.mensagemErro(this, "Erro ao buscar descri��o completa!\n"
					+ err.getMessage(),true,con,err);
			err.printStackTrace();
		}
		return sRet != null ? sRet : "";
	}
    /**
     * Mostra a observa��o geral.
     * @param sTabela tabela a pesquisar.
     * @param iCod codigo da chave primaria.
     */
    public void mostraObs(String sTabela, int iCod) {
    	FObservacao obs = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	String sSQLselect = null;
    	String sSQLupdate = null;
		try {
			try {
				if(sTabela.equals("VDVENDA")) {
					sSQLselect = "SELECT OBSVENDA FROM VDVENDA WHERE CODEMP=? AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='V'";
					sSQLupdate = "UPDATE VDVENDA SET OBSVENDA=? WHERE CODEMP=? AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='V'";
				}
				else if(sTabela.equals("VDORCAMENTO")) {
					sSQLselect = "SELECT OBSORC FROM VDORCAMENTO WHERE CODEMP=? AND CODFILIAL=? AND CODORC=?";
					sSQLupdate = "UPDATE VDORCAMENTO SET OBSORC=? WHERE CODEMP=? AND CODFILIAL=? AND CODORC=?";
				}
					
				ps = con.prepareStatement(sSQLselect);
				ps.setInt(1, Aplicativo.iCodEmp);
				ps.setInt(2, ListaCampos.getMasterFilial( sTabela ));
				ps.setInt(3, iCod);
				rs = ps.executeQuery();
				if (rs.next())
					obs = new FObservacao((rs.getString(1) != null ? rs
							.getString(1) : ""));
				else
					obs = new FObservacao("");

				if (!con.getAutoCommit())
					con.commit();
				
			} catch (SQLException err) {
				Funcoes.mensagemErro(this, "Erro ao carregar a observa��o!\n"
						+ err.getMessage(),true,con,err);
			}
			if (obs != null) {
				obs.setVisible(true);
				if (obs.OK) {
					try {
						ps = con.prepareStatement(sSQLupdate);
						ps.setString(1, obs.getTexto());
						ps.setInt(2, Aplicativo.iCodEmp);
						ps.setInt(3, ListaCampos.getMasterFilial( sTabela ));
						ps.setInt(4, iCod);
						ps.executeUpdate();
						if (!con.getAutoCommit())
							con.commit();
					} catch (SQLException err) {
						Funcoes.mensagemErro(this,
								"Erro ao inserir observa��o no or�amento!\n"
										+ err.getMessage(),true,con,err);
					}
				}
				obs.dispose();
			}
		} finally {
			ps = null;
	    	rs = null;
	    	sSQLselect = null;
	    	sSQLupdate = null;
		}
    	
    }
    /**
     * Verifica o proximo codigo na tabela para evitar
     * erros de chave primaria no banco de dados.
     * essa verifica��o depende da configura��o do sistema.
     * @param sTabela tabela a verificar
     * @param campo campo da chave primaria
     */
    public void testaCodPK(String sTabela, JTextFieldPad campo) {
    	
    	PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("SELECT * FROM SPGERANUM(?,?,?)");
			ps.setInt(1, Aplicativo.iCodEmp);
			if(sTabela.equals("VDVENDA")) {
				ps.setInt(2, ListaCampos.getMasterFilial("VDVENDA"));
				ps.setString(3, "VD");
			}
			else if(sTabela.equals("VDORCAMENTO")) {
				ps.setInt(2, ListaCampos.getMasterFilial("VDORCAMENTO"));
				ps.setString(3, "OC");
			}
			rs = ps.executeQuery();
			rs.next();
			campo.setVlrString(rs.getString(1));
			rs.close();
			ps.close();
			if (!con.getAutoCommit())
				con.commit();
		} catch (SQLException err) {
			Funcoes.mensagemErro(this, "Erro ao confirmar n�mero do pedido!\n"
					+ err.getMessage(),true,con,err);
		} finally {
			ps = null;
			rs = null;
		}
    	
    }
    /**
     * Calcula o valor do produto
     * @param arg0 pre�o do produto
     * @param arg1 quantidade do produto
     * @return valor do produto
     */
	protected BigDecimal calcVlrProd(BigDecimal arg0, BigDecimal arg1) {
		BigDecimal bdRetorno;
		bdRetorno = arg0.multiply(arg1).divide(
				new BigDecimal("1"), Aplicativo.casasDecFin, BigDecimal.ROUND_HALF_UP);
		return bdRetorno;
	}
    
    public void buscaPreco() {
    	String sSQL = "SELECT PRECO FROM VDBUSCAPRECOSP(?,?,?,?,?,?,?,?,?,?,?,?)";
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	int[] iParans;
    	try {
    	  ps = con.prepareStatement(sSQL);
    	  
    	  iParans = getParansPreco();
    	  
    	  ps.setInt(1,iParans[0]);
    	  ps.setInt(2,iParans[1]);
    	  ps.setInt(3,iParans[2]);
    	  ps.setInt(4,iParans[3]);
    	  ps.setInt(5,iParans[4]);
    	  ps.setInt(6,iParans[5]);
    	  ps.setInt(7,iParans[6]);
    	  ps.setInt(8,iParans[7]);
    	  ps.setInt(9,iParans[8]);
    	  ps.setInt(10,iParans[9]);
    	  ps.setInt(11,iParans[10]);
    	  ps.setInt(12,iParans[11]);
    	  rs = ps.executeQuery();
    	  rs.next();
    	  setParansPreco(rs.getString(1) != null ? (new BigDecimal(rs.getString(1))) : (new BigDecimal("0")));
    	  rs.close();
    	  ps.close();
    	  if (!con.getAutoCommit())
    	      con.commit();

    	}
    	catch (SQLException err) {
    		Funcoes.mensagemErro(this,"Erro ao carregar o pre�o!\n"+err.getMessage(),true,con,err);
    	}
    	finally {
    	    sSQL = null;
    	    ps = null;
    	    rs = null;
    	}
    }
}


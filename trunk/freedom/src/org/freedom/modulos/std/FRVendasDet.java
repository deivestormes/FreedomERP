/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FRVendasDet.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios sobre a classe...
 * 
 */

package org.freedom.modulos.std;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.BorderFactory;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrinterJob;
import org.freedom.telas.FRelatorio;

public class FRVendasDet extends FRelatorio {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDataini = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDatafim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JCheckBoxPad cbVendaCanc = new JCheckBoxPad( "Mostrar Canceladas", "S", "N" );

	private JRadioGroup rgTipo = null;

	private JRadioGroup rgFaturados = null;

	private JRadioGroup rgFinanceiro = null;

	private ListaCampos lcCliente = new ListaCampos( this );

	private ListaCampos lcProd = new ListaCampos( this );

	public FRVendasDet() {

		setTitulo( "Vendas Detalhadas" );
		setAtribos( 80, 80, 295, 370 );
		
		Vector vLabs = new Vector();
		Vector vVals = new Vector();

		vLabs.addElement( "Grafico" );
		vLabs.addElement( "Texto" );
		vVals.addElement( "G" );
		vVals.addElement( "T" );
		rgTipo = new JRadioGroup( 1, 2, vLabs, vVals );
		rgTipo.setVlrString( "T" );
		
		Vector vLabs1 = new Vector();
		Vector vVals1 = new Vector();

		vLabs1.addElement( "Faturado" );
		vLabs1.addElement( "N�o Faturado" );
		vLabs1.addElement( "Ambos" );
		vVals1.addElement( "S" );
		vVals1.addElement( "N" );
		vVals1.addElement( "A" );
		rgFaturados = new JRadioGroup( 3, 1, vLabs1, vVals1 );
		rgFaturados.setVlrString( "S" );
		
		Vector vLabs2 = new Vector();
		Vector vVals2 = new Vector();

		vLabs2.addElement( "Financeiro" );
		vLabs2.addElement( "N�o Finaceiro" );
		vLabs2.addElement( "Ambos" );
		vVals2.addElement( "S" );
		vVals2.addElement( "N" );
		vVals2.addElement( "A" );
		rgFinanceiro = new JRadioGroup( 3, 1, vLabs2, vVals2 );
		rgFinanceiro.setVlrString( "S" );

		lcCliente.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
		lcCliente.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
		txtCodCli.setTabelaExterna( lcCliente );
		txtCodCli.setNomeCampo( "CodCli" );
		txtCodCli.setFK( true );
		lcCliente.setReadOnly( true );
		lcCliente.montaSql( false, "CLIENTE", "VD" );

		lcProd.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, false ) );
		lcProd.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		txtCodProd.setTabelaExterna( lcProd );
		txtCodProd.setNomeCampo( "CodProd" );
		txtCodProd.setFK( true );
		lcProd.setReadOnly( true );
		lcProd.montaSql( false, "PRODUTO", "EQ" );

		txtDataini.setRequerido( true );
		txtDatafim.setRequerido( true );

		GregorianCalendar cal = new GregorianCalendar();
		txtDatafim.setVlrDate( cal.getTime() );
		cal.roll( Calendar.MONTH, -1 );
		txtDataini.setVlrDate( cal.getTime() );

		JLabelPad lbLinha = new JLabelPad();
		lbLinha.setBorder( BorderFactory.createEtchedBorder() );

		adic( new JLabelPad( "Periodo:" ), 7, 5, 100, 20 );
		adic( lbLinha, 60, 15, 210, 2 );
		adic( new JLabelPad( "De:" ), 7, 30, 30, 20 );
		adic( txtDataini, 32, 30, 97, 20 );
		adic( new JLabelPad( "At�:" ), 140, 30, 30, 20 );
		adic( txtDatafim, 170, 30, 100, 20 );

		adic( new JLabelPad( "C�d.cli." ), 7, 60, 80, 20 );
		adic( txtCodCli, 7, 80, 80, 20 );
		adic( new JLabelPad( "Raz�o social do cliente" ), 90, 60, 200, 20 );
		adic( txtRazCli, 90, 80, 183, 20 );
		adic( new JLabelPad( "C�d.prod" ), 7, 100, 80, 20 );
		adic( txtCodProd, 7, 120, 80, 20 );
		adic( new JLabelPad( "Descri��o do produto" ), 90, 100, 200, 20 );
		adic( txtDescProd, 90, 120, 183, 20 );

		adic( rgTipo, 7, 150, 265, 30 );
		adic( rgFaturados, 7, 185, 120, 70 );
		adic( rgFinanceiro, 153, 185, 120, 70 );
		adic( cbVendaCanc, 7, 265, 200, 20 );

	}

	public void imprimir( boolean bVisualizar ) {

		if ( txtDatafim.getVlrDate().before( txtDataini.getVlrDate() ) ) {
			Funcoes.mensagemInforma( this, "Data final maior que a data inicial!" );
			return;
		}

		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer sSQL = new StringBuffer();
		StringBuffer sCab = new StringBuffer();
		String sWhere1 = null;
		String sWhere2 = null;
		String sWhere3 = "";
		String sWhere4 = "";
		String sWhere5 = "";
		boolean bComRef = comRef();

		try {

			if ( rgFaturados.getVlrString().equals( "S" ) ) {
				sWhere1 = " AND TM.FISCALTIPOMOV='S' ";
				sCab.append( "FATURADO" );
			}
			else if ( rgFaturados.getVlrString().equals( "N" ) ) {
				sWhere1 = " AND TM.FISCALTIPOMOV='N' ";
				if ( sCab.length() > 0 ) {
					sCab.append( " - " );
				}
				sCab.append( "NAO FATURADO" );
			}
			else if ( rgFaturados.getVlrString().equals( "A" ) ) {
				sWhere1 = " AND TM.FISCALTIPOMOV IN ('S','N') ";
			}

			if ( rgFinanceiro.getVlrString().equals( "S" ) ) {
				sWhere2 = " AND TM.SOMAVDTIPOMOV='S' ";
				if ( sCab.length() > 0 ) {
					sCab.append( " - " );
				}
				sCab.append( "FINANCEIRO" );
			}
			else if ( rgFinanceiro.getVlrString().equals( "N" ) ) {
				sWhere2 = " AND TM.SOMAVDTIPOMOV='N' ";
				if ( sCab.length() > 0 ) {
					sCab.append( " - " );
				}
				sCab.append( "NAO FINANCEIRO" );
			}
			else if ( rgFinanceiro.getVlrString().equals( "A" ) ) {
				sWhere2 = " AND TM.SOMAVDTIPOMOV IN ('S','N') ";
			}
			if ( cbVendaCanc.getVlrString().equals( "N" ) ) {
				sWhere3 = " AND NOT SUBSTR(V.STATUSVENDA,1,1)='C' ";
			}
			if ( txtCodCli.getVlrInteger().intValue() > 0 ) {
				sWhere4 = " AND C.CODCLI=" + txtCodCli.getVlrInteger().intValue() + " ";
				if ( sCab.length() > 0 ) {
					sCab.append( "\n" );
				}
				sCab.append( "Cliente : " );
				sCab.append( txtRazCli.getVlrString() );
			}
			if ( txtCodProd.getVlrInteger().intValue() > 0 ) {
				sWhere5 = " AND IT.CODPROD=" + txtCodProd.getVlrInteger().intValue() + " ";
				if ( sCab.length() > 0 ) {
					sCab.append( "\n" );
				}
				sCab.append( "Produto : " );
				sCab.append( txtDescProd.getVlrString() );
			}

			sSQL.append( "SELECT " );
			sSQL.append( "	( SELECT VO.CODORC FROM VDVENDAORC VO " );
			sSQL.append( "	  WHERE VO.CODEMP=IT.CODEMP AND VO.CODFILIAL=IT.CODFILIAL " ); 
			sSQL.append( "	  AND VO.CODVENDA=IT.CODVENDA AND VO.CODITVENDA=IT.CODITVENDA AND VO.TIPOVENDA=IT.TIPOVENDA ) AS CODORC, " );
			sSQL.append( "V.CODVENDA,V.DOCVENDA,V.DTEMITVENDA,V.DTSAIDAVENDA,PP.DESCPLANOPAG,V.CODCLI," );
			sSQL.append( "C.RAZCLI,V.VLRDESCVENDA,V.VLRLIQVENDA,IT.CODPROD,IT.REFPROD,P.DESCPROD,IT.CODLOTE," ); 
			sSQL.append( "IT.QTDITVENDA,IT.PRECOITVENDA,IT.VLRDESCITVENDA,IT.VLRLIQITVENDA " );
			sSQL.append( "FROM VDVENDA V, FNPLANOPAG PP, VDCLIENTE C, VDITVENDA IT, EQPRODUTO P, EQTIPOMOV TM  " ); 
			sSQL.append( "WHERE V.DTEMITVENDA BETWEEN ? AND ? AND V.CODEMP=? AND V.CODFILIAL=? " );
			sSQL.append( "AND PP.CODEMP=V.CODEMPPG AND PP.CODFILIAL=V.CODFILIAL AND PP.CODPLANOPAG=V.CODPLANOPAG " );
			sSQL.append( "AND C.CODEMP=V.CODEMPCL AND C.CODFILIAL=V.CODFILIALCL AND C.CODCLI=V.CODCLI " );
			sSQL.append( "AND TM.CODEMP=V.CODEMPTM AND TM.CODFILIAL=V.CODFILIALTM AND TM.CODTIPOMOV=V.CODTIPOMOV " );
			sSQL.append( "AND IT.CODEMP=V.CODEMP AND IT.CODFILIAL=V.CODFILIAL AND IT.CODVENDA=V.CODVENDA AND IT.TIPOVENDA=V.TIPOVENDA " ); 
			sSQL.append( "AND P.CODEMP=IT.CODEMPPD AND P.CODFILIAL=IT.CODFILIALPD AND P.CODPROD=IT.CODPROD " );
			sSQL.append( sWhere1 ); 
			sSQL.append( sWhere2 ); 
			sSQL.append( sWhere3 ); 
			sSQL.append( sWhere4 ); 
			sSQL.append( sWhere5 );
			sSQL.append( "ORDER BY V.CODVENDA,IT.CODITVENDA,V.DTEMITVENDA" );

			ps = con.prepareStatement( sSQL.toString() );
			ps.setDate( 1, Funcoes.dateToSQLDate( txtDataini.getVlrDate() ) );
			ps.setDate( 2, Funcoes.dateToSQLDate( txtDatafim.getVlrDate() ) );
			ps.setInt( 3, Aplicativo.iCodEmp );
			ps.setInt( 4, ListaCampos.getMasterFilial( "VDVENDA" ) );
			rs = ps.executeQuery();			

			if ( "T".equals( rgTipo.getVlrString() ) ) {
				imprimirTexto( bVisualizar, rs, sCab.toString(), bComRef );
			}
			else if ( "G".equals( rgTipo.getVlrString() ) ) {
				imprimirGrafico( bVisualizar, rs, sCab.toString(), bComRef );
			}
			
			rs.close();
			ps.close();
			
			if ( !con.getAutoCommit() ) {
				con.commit();
			}
		} catch ( Exception err ) {
			Funcoes.mensagemErro( this, "Erro ao montar relatorio!" + err.getMessage(), true, con, err );
			err.printStackTrace();
		} 
	}
	
	private void imprimirTexto( final boolean bVisualizar, final ResultSet rs, final String sCab, final boolean bComRef ) {
		
		String sLinFina = Funcoes.replicate( "-", 133 );
		String sLinDupla = Funcoes.replicate( "=", 133 );
		BigDecimal bVlrDesc = new BigDecimal( "0" );
		BigDecimal bVlrLiq = new BigDecimal( "0" );
		BigDecimal bVlrDescTot = new BigDecimal( "0" );
		BigDecimal bVlrLiqTot = new BigDecimal( "0" );
		ImprimeOS imp = null;
		int linPag = 0;
		int iCodVendaAnt = 0;
		boolean montou = false;

		try {

			imp = new ImprimeOS( "", con );
			linPag = imp.verifLinPag() - 1;
			imp.montaCab();
			imp.setTitulo( "Relat�rio de Vendas Detalhado" );
			imp.addSubTitulo( "RELATORIO DE VENDAS DETALHADO   -   PERIODO DE :" + txtDataini.getVlrString() + " At�: " + txtDatafim.getVlrString() + sCab );
			imp.limpaPags();

			while ( rs.next() ) {
				
				if ( ! montou ) {
					montou = true;
				}

				if ( imp.pRow() >= linPag - 1 ) {
					imp.pulaLinha( 1, imp.comprimido() );
					imp.say( 0, "+" + sLinFina + "+" );
					imp.incPags();
					imp.eject();
				}

				if ( imp.pRow() == 0 ) {
					imp.impCab( 136, true );
					imp.pulaLinha( 0, imp.comprimido() );
					imp.say( 0, "|" + sLinFina + "|" );
				}

				if ( iCodVendaAnt != rs.getInt( "CodVenda" ) ) {
					if ( iCodVendaAnt != 0 ) {
						imp.pulaLinha( 1, imp.comprimido() );
						imp.say( 0, "|" + sLinDupla + "|" );
						imp.pulaLinha( 1, imp.comprimido() );
						imp.say( 0, "|" );
						imp.say( 64, " Totais da venda: " );
						imp.say( 94, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( bVlrDesc.setScale( 2, BigDecimal.ROUND_HALF_UP ) ) ) );
						imp.say( 109, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( bVlrLiq.setScale( 2, BigDecimal.ROUND_HALF_UP ) ) ) );
						imp.say( 124, "|" );
						imp.say( 135, "|" );
						imp.pulaLinha( 1, imp.comprimido() );
						imp.say( 0, "|" + sLinDupla + "|" );
					}
					imp.pulaLinha( 1, imp.comprimido() );
					imp.say( 0, "| Pedido: " );
					imp.say( 10, Funcoes.strZero( rs.getString( "CodVenda" ), 8 ) );
					imp.say( 25, "Doc: " );
					imp.say( 30, Funcoes.strZero( rs.getString( "DocVenda" ), 8 ) );
					imp.say( 45, "Emiss�o: " );
					imp.say( 53, Funcoes.sqlDateToStrDate( rs.getDate( "DtEmitVenda" ) ) );
					imp.say( 68, "Saida: " );
					imp.say( 75, Funcoes.sqlDateToStrDate( rs.getDate( "DtSaidaVenda" ) ) );
					imp.say( 90, "Plano Pagto.: " );
					imp.say( 104, Funcoes.copy( rs.getString( "DescPlanoPag" ), 30 ) );
					imp.say( 135, "|" );
					imp.pulaLinha( 1, imp.comprimido() );
					imp.say( 0, "| Cliente: " );
					imp.say( 11, rs.getInt( "CodCli" ) + " - " + rs.getString( "RazCli" ) );
					imp.say( 135, "|" );
					imp.pulaLinha( 1, imp.comprimido() );
					imp.say( 0, "|" + sLinFina + "|" );
					imp.pulaLinha( 1, imp.comprimido() );
					imp.say( 0, "| Cod/Ref" );
					imp.say( 16, "| Descri��o" );
					imp.say( 54, "| Lote" );
					imp.say( 69, "| Quant." );
					imp.say( 79, "| Preco" );
					imp.say( 94, "| Vlr.Desc." );
					imp.say( 109, "| Vlr.Liq." );
					imp.say( 124, "| Orcam." );
					imp.say( 135, "|" );
					imp.pulaLinha( 1, imp.comprimido() );
					imp.say( imp.pRow(), 0, "|" + sLinFina + "|" );

					bVlrLiq = rs.getBigDecimal( "VlrLiqVenda" ).setScale( 2, BigDecimal.ROUND_HALF_UP );
					bVlrDescTot = bVlrDescTot.add( bVlrDesc ).setScale( 2, BigDecimal.ROUND_HALF_UP );
					bVlrLiqTot = bVlrLiqTot.add( bVlrLiq ).setScale( 2, BigDecimal.ROUND_HALF_UP );
					bVlrDesc = new BigDecimal( "0" );
				}

				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "| " + ( bComRef ? rs.getString( "RefProd" ) : rs.getString( "CodProd" ) ) );
				imp.say( 16, "| " + Funcoes.copy( rs.getString( "DescProd" ), 34 ) );
				imp.say( 54, "| " + Funcoes.copy( rs.getString( "CodLote" ), 13 ) );
				imp.say( 69, "| " + rs.getBigDecimal( "QtdItVenda" ).setScale( 1, BigDecimal.ROUND_HALF_UP ) );
				imp.say( 79, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( rs.getFloat( "PrecoItVenda" ) ) ) );
				imp.say( 94, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( rs.getFloat( "VlrDescItVenda" ) ) ) );
				imp.say( 109, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( rs.getFloat( "VlrLiqItVenda" ) ) ) );
				imp.say( 124, "| " + ( rs.getString( 1 ) != null ? rs.getString( 1 ) : "" ) );
				imp.say( 135, "|" );

				bVlrDesc = bVlrDesc.add( rs.getBigDecimal( "VlrDescItVenda" ) );

				iCodVendaAnt = rs.getInt( "CodVenda" );
			}

			if ( montou ) {
				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "|" + sLinDupla + "|" );
				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "|" );
				imp.say( 64, " Totais da venda: " );
				imp.say( 94, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( bVlrDesc.setScale( 2, BigDecimal.ROUND_HALF_UP ) ) ) );
				imp.say( 109, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( bVlrLiq.setScale( 2, BigDecimal.ROUND_HALF_UP ) ) ) );
				imp.say( 124, "|" );
				imp.say( 135, "|" );
				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "|" + sLinDupla + "|" );
				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "|" + sLinDupla + "|" );
				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "|" );
				imp.say( 64, " TOTAL GERAL : " );
				imp.say( 94, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( bVlrDescTot.setScale( 2, BigDecimal.ROUND_HALF_UP ) ) ) );
				imp.say( 109, "| " + Funcoes.strDecimalToStrCurrency( 12, 2, String.valueOf( bVlrLiqTot.setScale( 2, BigDecimal.ROUND_HALF_UP ) ) ) );
				imp.say( 124, "|" );
				imp.say( 135, "|" );
				imp.pulaLinha( 1, imp.comprimido() );
				imp.say( 0, "+" + sLinDupla + "+" );
			}

			imp.eject();
			imp.fechaGravacao();

			if ( bVisualizar ) {
				imp.preview( this );
			}
			else {
				imp.print();
			}
			
		} catch ( Exception err ) {
			Funcoes.mensagemErro( this, "Erro ao montar relatorio!" + err.getMessage(), true, con, err );
			err.printStackTrace();
		} 
	}

	public void imprimirGrafico( final boolean bVisualizar, final ResultSet rs, final String sCab, final boolean bComRef ) {

		HashMap hParam = new HashMap();
		hParam.put( "COMREF", bComRef ? "S" : "N" );
		
		FPrinterJob dlGr = new FPrinterJob( "relatorios/VendasDetalhadas.jasper", "Vendas Detalhadas", sCab, rs, hParam, this );

		if ( bVisualizar ) {
			dlGr.setVisible( true );
		}
		else {
			try {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			} catch ( Exception err ) {
				Funcoes.mensagemErro( this, "Erro na impress�o de relat�rio de vendas detalhadas!" + err.getMessage(), true, con, err );
			}
		}
	}

	private boolean comRef() {

		boolean bRetorno = false;
		String sSQL = "SELECT USAREFPROD FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			rs = ps.executeQuery();
			if ( rs.next() ) {
				if ( rs.getString( "UsaRefProd" ).trim().equals( "S" ) )
					bRetorno = true;
			}
			if ( !con.getAutoCommit() )
				con.commit();
		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro ao carregar a tabela PREFERE1!\n" + err.getMessage(), true, con, err );
		} finally {
			ps = null;
			rs = null;
			sSQL = null;
		}
		return bRetorno;
	}

	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		lcProd.setConexao( cn );
		lcCliente.setConexao( cn );
	}
}

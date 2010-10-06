/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.std <BR>
 *         Classe:
 * @(#)FRVendasItem.java <BR>
 * 
 *                       Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 *                       modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 *                       na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 *                       Este programa � distribuido na esperan�a que possa ser util, mas SEM NENHUMA GARANTIA; <BR>
 *                       sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 *                       Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 *                       Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *                       de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 *                       Coment�rios sobre a classe...
 * 
 */

package org.freedom.modulos.gms.view.frame.report;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.border.TitledBorder;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JCheckBoxPad;
import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.component.JRadioGroup;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FPrinterJob;
import org.freedom.library.swing.frame.FRelatorio;
import org.freedom.library.swing.util.SwingParams;

public class FRComisProd extends FRelatorio {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDataini = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDatafim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtCodSecao = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldFK txtDescSecao = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JRadioGroup<?, ?> rgTipo = null;
	
	private ListaCampos lcSecao = new ListaCampos( this );

	private ListaCampos lcCliente = new ListaCampos( this );
	
	private JCheckBoxPad cbFinalizados = new JCheckBoxPad( "Apenas �tens finalizados", "S", "N" );

	private boolean comref = false;

	boolean cliente = false;

	boolean diario = false;

	public FRComisProd() {

		setTitulo( "Relat�rio de comissionamento/produtividade" );
		setAtribos( 80, 80, 380, 380 );

		txtDescSecao.setAtivo( false );
		txtRazCli.setAtivo( false );

		Vector<String> vLabs = new Vector<String>();
		Vector<String> vVals = new Vector<String>();

		vLabs.addElement( "Por �tem" );
		vLabs.addElement( "Por T�cnico" );
		vVals.addElement( "I" );
		vVals.addElement( "T" );
		
		rgTipo = new JRadioGroup<String, String>( 1, 2, vLabs, vVals );
		rgTipo.setVlrString( "I" );

		lcSecao.add( new GuardaCampo( txtCodSecao, "CodSecao", "C�d.Se��o", ListaCampos.DB_PK, false ) );
		lcSecao.add( new GuardaCampo( txtDescSecao, "DescSecao", "Descri��o da se��o", ListaCampos.DB_SI, false ) );
		txtCodSecao.setTabelaExterna( lcSecao, null );
		txtCodSecao.setNomeCampo( "CodSecao" );
		txtCodSecao.setFK( true );
		lcSecao.setReadOnly( true );
		lcSecao.montaSql( false, "SECAO", "EQ" );

		txtDataini.setVlrDate( new Date() );
		txtDatafim.setVlrDate( new Date() );

		lcCliente.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
		lcCliente.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
		txtCodCli.setTabelaExterna( lcCliente, null );
		txtCodCli.setNomeCampo( "CodCli" );
		txtCodCli.setFK( true );
		lcCliente.setReadOnly( true );
		lcCliente.montaSql( false, "CLIENTE", "VD" );

		JPanelPad pnPeriodo = new JPanelPad();
		pnPeriodo.setBorder( SwingParams.getPanelLabel( "Per�odo", Color.BLACK, TitledBorder.LEFT ) );

		adic( pnPeriodo, 4, 5, 325, 60 );

		pnPeriodo.adic( new JLabelPad( "De:" ), 5, 05, 30, 20 );
		pnPeriodo.adic( txtDataini, 35, 05, 90, 20 );
		pnPeriodo.adic( new JLabelPad( "At�:" ), 135, 05, 30, 20 );
		pnPeriodo.adic( txtDatafim, 170, 05, 90, 20 );

		JPanelPad pnTipo = new JPanelPad();
		pnTipo.setBorder( SwingParams.getPanelLabel( "Tipo", Color.BLACK, TitledBorder.LEFT ) );

		adic( pnTipo, 4, 70, 325, 70 );
		pnTipo.adic( rgTipo, 3, 3, 300, 30 );
		
		JPanelPad pnFiltros = new JPanelPad();
		pnFiltros.setBorder( SwingParams.getPanelLabel( "Filtros", Color.BLACK, TitledBorder.LEFT ) );

		adic( pnFiltros, 4, 145, 325, 150 );

		pnFiltros.adic( new JLabelPad( "C�d.Se��o" ), 4, 5, 70, 20 );
		pnFiltros.adic( txtCodSecao, 4, 25, 70, 20 );

		pnFiltros.adic( new JLabelPad( "Descri��o da se��o de produ��o" ), 77, 5, 230, 20 );
		pnFiltros.adic( txtDescSecao, 77, 25, 230, 20 );

		pnFiltros.adic( new JLabelPad( "C�d.Cliente" ), 4, 45, 70, 20 );
		pnFiltros.adic( txtCodCli, 4, 65, 70, 20 );

		pnFiltros.adic( new JLabelPad( "Raz�o social do cliente" ), 77, 45, 230, 20 );
		pnFiltros.adic( txtRazCli, 77, 65, 230, 20 );
		
		pnFiltros.adic( cbFinalizados, 2, 95, 230, 20 );

	}

	public void imprimir( boolean visualizar ) {

		if ( txtDatafim.getVlrDate().before( txtDataini.getVlrDate() ) ) {
			Funcoes.mensagemInforma( this, "Data final maior que a data inicial!" );
			return;
		}

		if( "I".equals( rgTipo.getVlrString() )){
			imprimirPorItem( visualizar );
		}
		else if( "T".equals( rgTipo.getVlrString() )) {
			imprimirPorTecnico( visualizar );
		}

	}

	public void imprimirPorItem( boolean visualizar ) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		StringBuffer sCab = new StringBuffer();
		StringBuffer sCab2 = new StringBuffer();

		int param = 1;

		try {

			sql.append( "select ");

			sql.append( "pd.codsecao, se.descsecao, op.dtfabrop, op.qtdfinalprodop, pd.codprod, pd.refprod, ");
			sql.append( "pd.descprod, rm.ticket, cl.codcli, cl.razcli, it.numserie, ");
			sql.append( "pd.precocomisprod, rc.perccomisgeral/100 perccomisgeral, op.garantia ");

			sql.append( "from eqproduto pd , vdregracomis rc, eqsecao se, ppop op ");

			sql.append( "left outer join eqrecmerc rm on ");
			sql.append( "rm.codemp=op.codempos and rm.codfilial=op.codfilialos and rm.ticket=op.ticket ");

			sql.append( "left outer join vdcliente cl on ");
			sql.append( "cl.codemp=rm.codempcl and cl.codfilial=rm.codfilialcl and cl.codcli=rm.codcli ");

			sql.append( "left outer join eqitrecmerc it on ");
			sql.append( "it.codemp=op.codempos and it.codfilial=op.codfilialos and it.ticket=op.ticket and it.coditrecmerc=op.coditrecmerc ");

			sql.append( "where "); 

			sql.append( "pd.codemp=op.codemp and pd.codfilial=op.codfilial and pd.codprod=op.codprod ");
			sql.append( "and rc.codempsc=pd.codempsc and rc.codfilialsc=pd.codfilialsc and rc.codsecao=pd.codsecao ");
			sql.append( "and se.codemp=pd.codempsc and se.codfilial=pd.codfilialsc and se.codsecao=pd.codsecao ");
			sql.append( "and op.codemp=? and op.codfilial=? and op.dtfabrop between ? and ? ");
			sql.append( "and op.sitop='FN' " );

			if ( txtCodCli.getVlrInteger() > 0 ) {
				sql.append( "and rm.codempcl=? and rm.codfilialcl=? and rm.codcli=? " );
			}

			if ( !"".equals( txtCodSecao.getVlrString() ) ) {
				sql.append( "and pd.codempsc=? and pd.codfilialsc=? and pd.codsecao=? " );
			}
			
			if( "S".equals( cbFinalizados.getVlrString()) ) {
				sql.append( " and op.sitop = 'FN' " );
			}


		//	sql.append( "group by 1,2,3,4 " );

			sql.append( "order by pd.codsecao, rm.dtent, rm.codcli, pd.refprod " );

			ps = con.prepareStatement( sql.toString() );

			ps.setInt( param++, Aplicativo.iCodEmp );
			ps.setInt( param++, Aplicativo.iCodFilial );
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDataini.getVlrDate() ) );
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDatafim.getVlrDate() ) );

			sCab.append( "Per�odo de " + Funcoes.dateToStrDate( txtDataini.getVlrDate() ) + " at� " + Funcoes.dateToStrDate( txtDataini.getVlrDate() ) );

			if ( txtCodCli.getVlrInteger() > 0 ) {
				ps.setInt( param++, lcCliente.getCodEmp() );
				ps.setInt( param++, lcCliente.getCodFilial() );
				ps.setInt( param++, txtCodCli.getVlrInteger() );

				sCab2.append( "Cliente: " + txtRazCli.getVlrString() + "\n" );
			}

			if ( !"".equals( txtCodSecao.getVlrString() ) ) {
				ps.setInt( param++, lcSecao.getCodEmp() );
				ps.setInt( param++, lcSecao.getCodFilial() );
				ps.setString( param++, txtCodSecao.getVlrString() );

				sCab2.append( "Se��o: " + txtDescSecao.getVlrString() );
			}

			rs = ps.executeQuery();

			imprimirGrafico( visualizar, rs, sCab.toString() + "\n" + sCab2.toString(), comref, "layout/rel/REL_COMIS_PROD_DET.jasper" );

			rs.close();
			ps.close();

			con.commit();

		} catch ( Exception err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao montar relatorio!\n" + err.getMessage(), true, con, err );
		} finally {
			System.gc();
		}
	}
	
	public void imprimirPorTecnico( boolean visualizar ) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		StringBuffer sCab = new StringBuffer();
		StringBuffer sCab2 = new StringBuffer();

		int param = 1;

		try { 

			sql.append( "select ");

			sql.append( "se.codsecao, se.descsecao, rc.perccomisgeral/100 perccomisgeral, ");

			sql.append( "sum( case when op.garantia='S' then ((qtdfinalprodop * pd.precocomisprod ) * (rc.perccomisgeral/100)) * -1 else ");
			sql.append( "((qtdfinalprodop * pd.precocomisprod ) * (rc.perccomisgeral/100)) end ) comissecao ");
			sql.append( ", vd.nomevend, irc.perccomisitrc/100 percomisvendedor ");

			sql.append( "from eqproduto pd , vdregracomis rc, vditregracomis irc, eqsecao se, ppop op ");

			sql.append( "left outer join eqrecmerc rm on ");
			sql.append( "rm.codemp=op.codempos and rm.codfilial=op.codfilialos and rm.ticket=op.ticket ");

			sql.append( "left outer join eqitrecmerc it on ");
			sql.append( "it.codemp=op.codempos and it.codfilial=op.codfilialos and it.ticket=op.ticket and it.coditrecmerc=op.coditrecmerc ");

			sql.append( "inner join vdvendedor vd on ");
			sql.append( "vd.codemp=irc.codempvd and vd.codfilial = irc.codfilialvd and vd.codvend=irc.codvend ");

			sql.append( "where ");

			sql.append( "pd.codemp=op.codemp and pd.codfilial=op.codfilial and pd.codprod=op.codprod ");
			sql.append( "and rc.codempsc=pd.codempsc and rc.codfilialsc=pd.codfilialsc and rc.codsecao=pd.codsecao ");
			sql.append( "and irc.codemp=rc.codemp and irc.codfilial=rc.codfilial and irc.codregrcomis=rc.codregrcomis ");
			sql.append( "and se.codemp=pd.codempsc and se.codfilial=pd.codfilialsc and se.codsecao=pd.codsecao ");
			sql.append( "and op.codemp=? and op.codfilial=? and op.dtfabrop between ? and ? ");
			sql.append( "and op.sitop='FN' ");

			if ( txtCodCli.getVlrInteger() > 0 ) {
				sql.append( "and rm.codempcl=? and rm.codfilialcl=? and rm.codcli=? " );
			}

			if ( !"".equals( txtCodSecao.getVlrString() ) ) {
				sql.append( "and pd.codempsc=? and pd.codfilialsc=? and pd.codsecao=? " );
			}
			
			if( "S".equals( cbFinalizados.getVlrString()) ) {
				sql.append( " and op.sitop = 'FN' " );
			}

			sql.append( "group by 1,2,3,5,6" );
			
//			sql.append( "order by pd.codsecao, op.dtfabrop " );

			ps = con.prepareStatement( sql.toString() );

			ps.setInt( param++, Aplicativo.iCodEmp );
			ps.setInt( param++, Aplicativo.iCodFilial );
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDataini.getVlrDate() ) );
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDatafim.getVlrDate() ) );

			sCab.append( "Per�odo de " + Funcoes.dateToStrDate( txtDataini.getVlrDate() ) + " at� " + Funcoes.dateToStrDate( txtDataini.getVlrDate() ) );

			if ( !"".equals( txtCodSecao.getVlrString() ) ) {
				ps.setInt( param++, lcSecao.getCodEmp() );
				ps.setInt( param++, lcSecao.getCodFilial() );
				ps.setString( param++, txtCodSecao.getVlrString() );

				sCab2.append( "Se��o: " + txtDescSecao.getVlrString() );
			}

			rs = ps.executeQuery();

			imprimirGrafico( visualizar, rs, sCab.toString() + "\n" + sCab2.toString(), comref, "layout/rel/REL_COMIS_PROD_TEC.jasper" );

			rs.close();
			ps.close();

			con.commit();

		} catch ( Exception err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao montar relatorio!\n" + err.getMessage(), true, con, err );
		} finally {
			System.gc();
		}
	}


	public void imprimirGrafico( final boolean bVisualizar, final ResultSet rs, final String sCab, final boolean bComRef , String rel ) {

		HashMap<String, Object> hParam = new HashMap<String, Object>();
		hParam.put( "COMREF", bComRef ? "S" : "N" );

		FPrinterJob dlGr = null;

	
		dlGr = new FPrinterJob( rel, "Relat�rio de comississionamento por produ��o detalhado", sCab, rs, hParam, this );
		

		if ( bVisualizar ) {
			dlGr.setVisible( true );
		}
		else {
			try {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			} catch ( Exception err ) {
				Funcoes.mensagemErro( this, "Erro na impress�o de relat�rio de coletas!" + err.getMessage(), true, con, err );
			}
		}
	}

	private boolean comRef() {

		boolean bRetorno = false;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = con.prepareStatement( "SELECT USAREFPROD FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			rs = ps.executeQuery();

			if ( rs.next() ) {
				bRetorno = "S".equals( rs.getString( "UsaRefProd" ) );
			}

			rs.close();
			ps.close();
			con.commit();

		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro ao carregar a tabela PREFERE1!\n" + err.getMessage(), true, con, err );
		}
		return bRetorno;
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );

		lcSecao.setConexao( cn );

		lcCliente.setConexao( cn );

		comref = comRef();
	}
}

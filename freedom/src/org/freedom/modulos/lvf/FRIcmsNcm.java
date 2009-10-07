/**
 * @version 07/10/2009 <BR>
 * @author Setpoint Inform�tica Ltda.<BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FRVolVendasProd.java <BR>
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Tela de filtros para o relat�rio ICMS por NCM e CFOP.
 * 
 */

package org.freedom.modulos.lvf;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrinterJob;
import org.freedom.telas.FRelatorio;

public class FRIcmsNcm extends FRelatorio {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDataini = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDatafim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

//	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

//	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

//	private ListaCampos lcCli = new ListaCampos( this, "CL" );

//	private ListaCampos lcComiss = new ListaCampos( this, "VD" );
	
//	private JTextFieldPad txtCodGrupo = new JTextFieldPad( JTextFieldPad.TP_STRING, 14, 0 );

//	private JTextFieldFK txtDescGrupo = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
//	private final ListaCampos lcProduto = new ListaCampos( this );
	
//	private final JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

//	private final JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
//	private ListaCampos lcGrupo = new ListaCampos( this );

	public FRIcmsNcm() {

		super( false );
		setTitulo( "Volume de vendas por produto" );
		setAtribos( 50, 50, 355, 140 );

		montaListaCampos();
		montaTela();
	}
	
	private void montaListaCampos() {
	
//		lcCli.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
//		lcCli.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
//		txtCodCli.setTabelaExterna( lcCli );
//		txtCodCli.setNomeCampo( "CodCli" );
//		txtCodCli.setFK( true );
//		lcCli.setReadOnly( true );
//		lcCli.montaSql( false, "CLIENTE", "VD" );
	
/*		lcComiss.add( new GuardaCampo( txtCodComiss, "CodVend", "C�d.comiss.", ListaCampos.DB_PK, false ) );
		lcComiss.add( new GuardaCampo( txtNomeComiss, "NomeVend", "Nome do comissionado", ListaCampos.DB_SI, false ) );
		txtCodComiss.setTabelaExterna( lcComiss );
		txtCodComiss.setNomeCampo( "CodVend" );
		txtCodComiss.setFK( true );
		lcComiss.setReadOnly( true );
		lcComiss.montaSql( false, "VENDEDOR", "VD" );
*/
		
/*		lcGrupo.add( new GuardaCampo( txtCodGrupo, "CodGrup", "C�d.grupo", ListaCampos.DB_PK, false ) );
		lcGrupo.add( new GuardaCampo( txtDescGrupo, "DescGrup", "Descri��o do grupo", ListaCampos.DB_SI, false ) );
		lcGrupo.montaSql( false, "GRUPO", "EQ" );
		lcGrupo.setReadOnly( true );
		txtCodGrupo.setTabelaExterna( lcGrupo );
		txtCodGrupo.setFK( true );
		txtCodGrupo.setNomeCampo( "CodGrup" );
		
		lcProduto.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.produto", ListaCampos.DB_PK, false ) );
		lcProduto.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		txtCodProd.setTabelaExterna( lcProduto );
		txtCodProd.setNomeCampo( "CodProd" );
		txtCodProd.setFK( true );
		lcProduto.setReadOnly( true );
		lcProduto.montaSql( false, "PRODUTO", "EQ" );*/

	}

	private void montaTela() {

		JLabelPad lbLinha = new JLabelPad();
		lbLinha.setBorder( BorderFactory.createEtchedBorder() );
		JLabelPad lbPeriodo = new JLabelPad( "Periodo:", SwingConstants.CENTER );
		lbPeriodo.setOpaque( true );

		adic( lbPeriodo, 15, 5, 80, 20 );
		adic( lbLinha, 7, 15, 320, 45 );

		adic( new JLabelPad( "De:", SwingConstants.CENTER ), 17, 30, 40, 20 );
		adic( txtDataini, 57, 30, 100, 20 );
		adic( new JLabelPad( "At�:", SwingConstants.CENTER ), 157, 30, 45, 20 );
		adic( txtDatafim, 202, 30, 100, 20 );
		
/*		adic( new JLabelPad( "C�d.Cli" ), 7, 70, 90, 20 );
		adic( txtCodCli, 7, 90, 90, 20 );
		adic( new JLabelPad( "Raz�o social do cliente" ), 100, 70, 227, 20 );
		adic( txtRazCli, 100, 90, 227, 20 );
		
		adic( new JLabelPad( "C�d.Grupo" ), 7, 110, 90, 20 );
		adic( txtCodGrupo, 7, 130, 90, 20 );
		adic( new JLabelPad( "Descri��o do grupo" ), 100, 110, 227, 20 );
		adic( txtDescGrupo, 100, 130, 227, 20 );

		adic( new JLabelPad( "C�d.Prod." ), 7, 150, 90, 20 );
		adic( txtCodProd, 7, 170, 90, 20 );
		adic( new JLabelPad( "Descri��o do produto" ), 100, 150, 227, 20 );
		adic( txtDescProd, 100, 170, 227, 20 );*/

		Calendar cPeriodo = Calendar.getInstance();
		txtDatafim.setVlrDate( cPeriodo.getTime() );
		cPeriodo.set( Calendar.DAY_OF_MONTH, cPeriodo.get( Calendar.DAY_OF_MONTH ) - 30 );
		txtDataini.setVlrDate( cPeriodo.getTime() );
	}

	public void imprimir( boolean bVisualizar ) {

		if ( txtDatafim.getVlrDate().before( txtDataini.getVlrDate() ) ) {
			Funcoes.mensagemInforma( this, "Data final maior que a data inicial!" );
			return;
		}

		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		StringBuffer sCab = new StringBuffer();

		sCab.append( "Per�do de : " + Funcoes.dateToStrDate( txtDataini.getVlrDate() ) + "At� : " + Funcoes.dateToStrDate( txtDatafim.getVlrDate() ) );
		
		try {

			
			sql.append( "select lf.codncm,nt.descnat,iv.codnat,sum(iv.vlrliqitvenda) vlrcontabil,sum(iv.vlrbaseicmsitvenda) vlrbase ,sum(iv.vlricmsitvenda) vlricms,sum(iv.vlrliqitvenda-iv.vlrbaseicmsitvenda) vlroutras " );
			sql.append( "from vdvenda vd, lfclfiscal lf, lfitclfiscal lfi, vditvenda iv, eqtipomov tm, lfnatoper nt " );
			sql.append(	"where ");
			sql.append( "iv.codemp=vd.codemp and iv.codfilial=vd.codfilial and iv.codvenda=vd.codvenda and iv.tipovenda=vd.tipovenda and ");
			sql.append( "lf.codemp=iv.codempif and lf.codfilial=iv.codfilialif and lf.codfisc=iv.codfisc and ");
			sql.append( "lfi.codemp=lf.codemp and lfi.codfilial=lf.codfilial and lfi.codfisc=lf.codfisc and lfi.coditfisc=iv.coditfisc and ");
			sql.append( "vd.codemp=? and vd.codfilial=? and ");
			sql.append( "nt.codemp=iv.codempnt and nt.codfilial=iv.codfilialnt and nt.codnat=iv.codnat and ");
			sql.append( "tm.codemp=vd.codemptm and tm.codfilial=vd.codfilialtm and tm.codtipomov=vd.codtipomov and ");
			sql.append( "vd.dtemitvenda between ? and ? and substring(vd.statusvenda from 1 for 1)!='C' and ");
			sql.append( "tm.fiscaltipomov='S' ");
			sql.append( "group by 1,2,3 ");
			
/*			if(! "".equals( txtCodGrupo.getVlrString())) {				
				if(txtCodGrupo.getVlrString().trim().length()==12) {
					sql.append( " and pd.codgrup = '" + txtCodGrupo.getVlrString() + "'"  );					
				}
				else {
					sql.append( " and pd.codgrup like '" + txtCodGrupo.getVlrString() + "%'"  );
				}
				
				sCab.append( "\n Grupo:" + txtCodGrupo.getVlrString().trim() + "-" + txtDescGrupo.getVlrString().trim() );				
			}
			
			if(txtCodCli.getVlrInteger()>0) {
				sql.append( " and vd.codempcl=? and vd.codfilialcl=? and vd.codcli=? " );
				sCab.append( "\n Cliente:" + txtCodCli.getVlrString().trim() + "-" + txtRazCli.getVlrString().trim() );
			}
			
			if(txtCodProd.getVlrInteger()>0) {
				sql.append( " and iv.codemppd=? and iv.codfilialpd=? and iv.codprod=? " );
				sCab.append( "\n Produto:" + txtCodProd.getVlrString().trim() + "-" + txtDescProd.getVlrString().trim() );
			}
*/

			ps = con.prepareStatement( sql.toString() );

			int param = 1;
			
			ps.setInt( param++, Aplicativo.iCodEmp );
			ps.setInt( param++, Aplicativo.iCodFilial );
			
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDataini.getVlrDate() ) );			
			ps.setDate( param++, Funcoes.dateToSQLDate( txtDatafim.getVlrDate() ) );
			
			
/*						
			if ( txtCodCli.getVlrInteger() > 0 ) {
				ps.setInt( param++, lcCli.getCodEmp() );
				ps.setInt( param++, lcCli.getCodFilial() );
				ps.setInt( param++, txtCodCli.getVlrInteger() );
			}
			
			if ( txtCodProd.getVlrInteger() > 0 ) {
				ps.setInt( param++, lcProduto.getCodEmp() );
				ps.setInt( param++, lcProduto.getCodFilial() );	
				ps.setInt( param++, txtCodProd.getVlrInteger() );
			}
	*/		
			rs = ps.executeQuery();

			imprimiGrafico( bVisualizar, rs, sCab.toString() );

			con.commit();

		} catch ( Exception e ) {
			e.printStackTrace();
			Funcoes.mensagemInforma( this, "Erro ao buscar dados do relat�rio!" );
		}
	}

	private void imprimiGrafico( final boolean bVisualizar, final ResultSet rs, final String sCab ) {

		FPrinterJob dlGr = null;
		HashMap<String, Object> hParam = new HashMap<String, Object>();

		hParam.put( "CODEMP", Aplicativo.iCodEmp );
		hParam.put( "CODFILIAL", ListaCampos.getMasterFilial( "VDVENDA" ) );
		hParam.put( "RAZAOEMP", Aplicativo.sEmpSis );
		hParam.put( "FILTROS", sCab );
		
		dlGr = new FPrinterJob( "layout/rel/REL_ICMS_01.jasper", "Relat�rio de ICMS por NCM", sCab, rs, hParam, this );

		if ( bVisualizar ) {
			dlGr.setVisible( true );
		}
		else {
			try {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			} catch ( Exception err ) {
				Funcoes.mensagemErro( this, "Erro na impress�o do relat�rio!" + err.getMessage(), true, con, err );
			}
		}
	}

	public void setConexao( DbConnection cn ) {
		super.setConexao( cn );
//		lcCli.setConexao( con );
//		lcComiss.setConexao( con );
//		lcGrupo.setConexao( con );
//		lcProduto.setConexao( con );
	}
}

/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FVendedor.java <BR>
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
 * Tela de cadastro de comissionados (vendedores).
 * 
 */

package org.freedom.modulos.std;

import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.PainelImagem;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FTabDados;


public class FVendedor extends FTabDados implements PostListener {

	private static final long serialVersionUID = 1L;

	private JPanelPad pinComiss = new JPanelPad( 470, 300 );

	private JPanelPad pinAss = new JPanelPad( 470, 300 );

	private JPanelPad pnObs = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 1 ) );

	private JTextAreaPad txaObs = new JTextAreaPad();

	private JScrollPane spnObs = new JScrollPane( txaObs );

	private JTextFieldPad txtCodVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtNomeVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtCpfVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldPad txtRgVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 12, 0 );

	private JTextFieldPad txtCnpjVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 18, 0 );

	private JTextFieldPad txtInscVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private JTextFieldPad txtEndVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtNumVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtBairVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtComplVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );

	private JTextFieldPad txtCidVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtCepVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtDDDFoneVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private JTextFieldPad txtFoneVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 12, 0 );

	private JTextFieldPad txtDDDCelVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private JTextFieldPad txtCelVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 12, 0 );

	private JTextFieldPad txtDDDFaxVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private JTextFieldPad txtFaxVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtUFVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	private JTextFieldPad txtEmailVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtPercComVend = new JTextFieldPad( JTextFieldPad.TP_DECIMAL, 7, 3 );

	private JTextFieldPad txtCodFornVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldPad txtCodPlan = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldFK txtDescPlan = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodFunc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescFunc = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCodTipoVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescTipoVend = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodClComis = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescClComis = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtSSPVend = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private JTextFieldPad txtCodSetor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescSetor = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private PainelImagem imgAssOrc = new PainelImagem( 65000 );

	private JCheckBoxPad cbAtivo = new JCheckBoxPad( "Ativo", "S", "N" );

	private ListaCampos lcPlan = new ListaCampos( this, "PN" );

	private ListaCampos lcSetor = new ListaCampos( this, "SE" );

	private ListaCampos lcClComis = new ListaCampos( this, "CM" );

	private ListaCampos lcFuncao = new ListaCampos( this, "FU" );
	
	private ListaCampos lcTipoComis = new ListaCampos( this, "TV" );

	public FVendedor() {

		super();
		setTitulo( "Cadastro de comissionados" );
		setAtribos( 50, 10, 440, 560 );

		lcPlan.add( new GuardaCampo( txtCodPlan, "CodPlan", "C�d.plan.", ListaCampos.DB_PK, txtDescPlan, false ) );
		lcPlan.add( new GuardaCampo( txtDescPlan, "DescPlan", "Descri�ao do planejamento", ListaCampos.DB_SI, false ) );
		lcPlan.setWhereAdic( "TIPOPLAN = 'D'" );
		lcPlan.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlan.setQueryCommit( false );
		lcPlan.setReadOnly( true );
		txtCodPlan.setTabelaExterna( lcPlan );

		lcFuncao.add( new GuardaCampo( txtCodFunc, "CodFunc", "C�d.fun��o", ListaCampos.DB_PK, txtDescFunc, false ) );
		lcFuncao.add( new GuardaCampo( txtDescFunc, "DescFunc", "Descri�ao da fun��o", ListaCampos.DB_SI, false ) );

		txtCodFunc.setTabelaExterna( lcFuncao );
		txtCodFunc.setNomeCampo( "codfunc" );
		txtCodFunc.setFK( true );
		lcFuncao.setQueryCommit( false );
		lcFuncao.setReadOnly( true );
		lcFuncao.montaSql( false, "FUNCAO", "RH" );

		
		lcClComis.add( new GuardaCampo( txtCodClComis, "CodClComis", "C�d.cl.comis.", ListaCampos.DB_PK, txtDescClComis, true ) );
		lcClComis.add( new GuardaCampo( txtDescClComis, "DescClComis", "Descri�ao da classifica��o da comiss�o", ListaCampos.DB_SI, false ) );
		lcClComis.montaSql( false, "CLCOMIS", "VD" );
		lcClComis.setQueryCommit( false );
		lcClComis.setReadOnly( true );
		txtCodClComis.setTabelaExterna( lcClComis );
		
		lcTipoComis.add( new GuardaCampo( txtCodTipoVend, "CodTipoVend", "C�d.tp.comis.", ListaCampos.DB_PK, txtDescTipoVend, true ) );
		lcTipoComis.add( new GuardaCampo( txtDescTipoVend, "DescTipoVend", "Descri��o tipo de venda", ListaCampos.DB_SI, false ) );

		txtCodTipoVend.setTabelaExterna( lcTipoComis );
		txtCodTipoVend.setNomeCampo( "CodTipoVend" );
		txtCodTipoVend.setFK( true );
		lcTipoComis.setQueryCommit( false );
		lcTipoComis.setReadOnly( true );
		lcTipoComis.montaSql( false, "TIPOVEND", "VD" );

		setPainel( pinComiss );
		adicTab( "Comissionado", pinComiss );

		adicCampo( txtCodVend, 7, 20, 100, 20, "CodVend", "C�d.comiss.", ListaCampos.DB_PK, true );
		adicCampo( txtNomeVend, 110, 20, 192, 20, "NomeVend", "Nome do comissionado", ListaCampos.DB_SI, true );
		adicDB( cbAtivo, 305, 20, 70, 20, "AtivoComis", "Ativo", true );
		adicCampo( txtCpfVend, 7, 60, 130, 20, "CpfVend", "CPF", ListaCampos.DB_SI, false );
		adicCampo( txtRgVend, 140, 60, 149, 20, "RgVend", "RG", ListaCampos.DB_SI, false );
		adicCampo( txtSSPVend, 292, 60, 80, 20, "SSPVend", "Org�o exp.", ListaCampos.DB_SI, false );
		adicCampo( txtCnpjVend, 7, 100, 180, 20, "CnpjVend", "CNPJ", ListaCampos.DB_SI, false );
		adicCampo( txtInscVend, 190, 100, 182, 20, "InscVend", "IE", ListaCampos.DB_SI, false );
		adicCampo( txtEndVend, 7, 140, 260, 20, "EndVend", "Endere�o", ListaCampos.DB_SI, false );
		adicCampo( txtNumVend, 270, 140, 50, 20, "NumVend", "Num.", ListaCampos.DB_SI, false );
		adicCampo( txtComplVend, 323, 140, 49, 20, "ComplVend", "Compl.", ListaCampos.DB_SI, false );
		adicCampo( txtBairVend, 7, 180, 120, 20, "BairVend", "Bairro", ListaCampos.DB_SI, false );
		adicCampo( txtCidVend, 130, 180, 120, 20, "CidVend", "Cidade", ListaCampos.DB_SI, false );
		adicCampo( txtCepVend, 253, 180, 80, 20, "CepVend", "Cep", ListaCampos.DB_SI, false );
		adicCampo( txtUFVend, 336, 180, 36, 20, "UFVend", "UF", ListaCampos.DB_SI, false );
		adicCampo( txtDDDFoneVend, 7, 220, 40, 20, "DDDFoneVend", "DDD", ListaCampos.DB_SI, false );
		adicCampo( txtFoneVend, 50, 220, 77, 20, "FoneVend", "Telefone", ListaCampos.DB_SI, false );
		adicCampo( txtDDDFaxVend, 130, 220, 40, 20, "DDDFaxVend", "DDD", ListaCampos.DB_SI, false );
		adicCampo( txtFaxVend, 177, 220, 77, 20, "FaxVend", "Fax", ListaCampos.DB_SI, false );
		adicCampo( txtDDDCelVend, 257, 220, 40, 20, "DDDCelVend", "DDD", ListaCampos.DB_SI, false );
		adicCampo( txtCelVend, 300, 220, 72, 20, "CelVend", "Cel", ListaCampos.DB_SI, false );
		adicCampo( txtEmailVend, 7, 260, 200, 20, "EmailVend", "E-Mail", ListaCampos.DB_SI, false );
		adicCampo( txtPercComVend, 210, 260, 77, 20, "PercComVend", "Comiss�o", ListaCampos.DB_SI, false );
		adicCampo( txtCodFornVend, 290, 260, 82, 20, "CodFornVend", "C�d.comis.for.", ListaCampos.DB_SI, false );
		adicCampo( txtCodPlan, 7, 300, 100, 20, "CodPlan", "C�d.plan.", ListaCampos.DB_FK, txtDescPlan, false );
		adicDescFK( txtDescPlan, 110, 300, 262, 20, "DescPlan", "Descri��o do planejamento" );
		adicCampo( txtCodClComis, 7, 340, 100, 20, "CodClComis", "C�d.cl.comis.", ListaCampos.DB_FK, txtDescClComis, false );
		adicDescFK( txtDescClComis, 110, 340, 262, 20, "DescClComis", "Descri��o da Classificacao da comiss�o" );
		adicCampo( txtCodFunc, 7, 380, 100, 20, "CodFunc", "C�d.fun��o", ListaCampos.DB_FK, txtDescFunc, false );
		adicDescFK( txtDescFunc, 110, 380, 262, 20, "DescFunc", "Descri��o da fun��o" );
		adicCampo( txtCodTipoVend, 7, 420, 100, 20, "CodTipoVend", "C�d.tp.vend", ListaCampos.DB_FK, txtDescTipoVend, false );
		adicDescFK( txtDescTipoVend, 110, 420, 262, 20, "DescTipoVend", "Descri��o do tipo de comissionado" );
		
		txtCpfVend.setMascara( JTextFieldPad.MC_CPF );
		txtCnpjVend.setMascara( JTextFieldPad.MC_CNPJ );
		txtCepVend.setMascara( JTextFieldPad.MC_CEP );
		txtFoneVend.setMascara( JTextFieldPad.MC_FONE );
		txtCelVend.setMascara( JTextFieldPad.MC_FONE );
		txtFaxVend.setMascara( JTextFieldPad.MC_FONE );
		lcCampos.addPostListener( this );
		lcCampos.setQueryInsert( false );
		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );

		adicTab( "Observa��es", pnObs );
		adicDBLiv( txaObs, "ObsVend", "Observa��es", false );
		pnObs.add( spnObs );
		
		setPainel( pinAss );
		adicTab( "Assinatura", pinAss );
		adicDB( imgAssOrc, 15, 30, 340, 85, "ImgAssVend", "Assinatura ( 340 pixel X 85 pixel )", true );
		
		setListaCampos( true, "VENDEDOR", "VD" );
		lcCampos.setQueryInsert( false );
		
		setImprimir( true );
	}

	private void montaSetor() {

		Rectangle rec = getBounds();
		rec.height += 40;
		setBounds( rec );

		lcSetor.add( new GuardaCampo( txtCodSetor, "CodSetor", "C�d.setor", ListaCampos.DB_PK, txtDescSetor, false ) );
		lcSetor.add( new GuardaCampo( txtDescSetor, "DescSetor", "Descri�ao do setor", ListaCampos.DB_SI, false ) );
		lcSetor.montaSql( false, "SETOR", "VD" );
		lcSetor.setQueryCommit( false );
		lcSetor.setReadOnly( true );
		txtCodSetor.setTabelaExterna( lcSetor );

		setPainel( pinComiss );
		
		adicCampo( txtCodSetor, 7, 420, 100, 20, "CodSetor", "C�d.setor", ListaCampos.DB_FK, txtDescSetor, false );
		adicDescFK( txtDescSetor, 110, 420, 262, 20, "DescSetor", "Descri��o do setor" );
		lcSetor.setConexao( con );
	}

	private boolean ehSetorVend() {

		boolean bRet = false;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sSQL = "SELECT SETORVENDA FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
		try {
			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, Aplicativo.iCodFilial );
			rs = ps.executeQuery();
			if ( rs.next() ) {
				String sVal = null;
				if ( ( sVal = rs.getString( "SetorVenda" ) ) != null ) {
					if ( "VA".indexOf( sVal ) >= 0 ) // Se tiver V ou A no sVal!
						bRet = true;
				}
			}
		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro ao verificar setor!\n" + err.getMessage(), true, con, err );
			err.printStackTrace();
		} finally {
			ps = null;
			rs = null;
			sSQL = null;
		}
		return bRet;

	}

	private void imprimir( boolean bVisualizar ) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		String sSQL = "";
		String sWhere = "";
		String sValores[] = null;
		int linPag = 0;
		int iContaReg = 0;

		ImprimeOS imp = new ImprimeOS( "", con );
		DLRVendedor dl = new DLRVendedor( this, con );
		Vector<String> vFiltros = new Vector<String>();

		dl.setVisible( true );
		if ( dl.OK == false ) {
			dl.dispose();
			return;
		}
		sValores = dl.getValores();
		dl.dispose();

		if ( sValores[ 1 ].length() > 0 ) {
			System.out.println( "CIDADE NO FILTRO:" + sValores[ 1 ] );
			sWhere += " AND VD.CIDVEND = '" + sValores[ 1 ] + "'";
			vFiltros.add( "CIDADE = " + sValores[ 1 ].trim() );
		}
		else
			System.out.println( "Cidade nula no filtro" );

		if ( sValores[ 2 ].length() > 0 ) {
			sWhere += " AND VD.CODCLCOMIS=" + sValores[ 2 ];
			vFiltros.add( "CLAS.COMISS�O = " + sValores[ 2 ] );
		}
		if ( sValores[ 3 ].length() > 0 ) {
			sWhere += " AND VD.CODSETOR = " + sValores[ 3 ];
			vFiltros.add( "SETOR = " + sValores[ 3 ] );
		}
		if ( sValores[ 4 ].length() > 0 ) {
			sWhere += " AND VD.CODFUNC = " + sValores[ 4 ];
			vFiltros.add( "FUN��O = " + sValores[ 4 ] );
		}

		sSQL = "select VD.CODVEND,VD.NOMEVEND,VD.DDDFONEVEND,VD.CIDVEND,VD.FONEVEND,VD.FAXVEND,VD.EMAILVEND,VD.PERCCOMVEND,VD.COMIPIVEND," + "VD.CELVEND,VD.CODSETOR," + "(SELECT SE.DESCSETOR FROM VDSETOR SE WHERE SE.CODEMP=VD.CODEMPSE AND SE.CODFILIAL=VD.CODFILIALSE AND SE.CODSETOR=VD.CODSETOR),"
				+ "VD.CODCLCOMIS," + "(SELECT CM.DESCCLCOMIS FROM VDCLCOMIS CM WHERE CM.CODEMP=VD.codempcm AND CM.CODFILIAL=VD.codfilialcm AND CM.codclcomis=VD.codclcomis)," + "VD.CODFUNC,"
				+ "(SELECT FU.DESCFUNC FROM RHFUNCAO FU WHERE FU.CODEMP=VD.codempfu AND FU.CODFILIAL=VD.codfilialfu AND FU.codfunc=VD.codfunc)" + "FROM vdvendedor VD " + "WHERE VD.CODEMP=? AND VD.CODFILIAL=? " + sWhere + " order by " + sValores[ 0 ];

		System.out.println( "sql � " + sSQL );
		try {

			linPag = imp.verifLinPag() - 1;
			imp.limpaPags();
			imp.setTitulo( "Relat�rio de Comissionados" );
			imp.addSubTitulo( "RELAT�RIO DE COMISSIONADOS" );
			imp.addSubTitulo( "Filtrado por:" );

			for ( int i = 0; i < vFiltros.size(); i++ ) {
				String sTmp = (String) vFiltros.elementAt( i );
				imp.addSubTitulo( sTmp );
			}

			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "VDVENDEDOR" ) );
			rs = ps.executeQuery();

			while ( rs.next() ) {
				if ( imp.pRow() == 0 ) {
					imp.montaCab();
					imp.impCab( 136, true );
					imp.say( imp.pRow(), 0, imp.comprimido() );
					imp.say( imp.pRow(), 0, "|" + Funcoes.replicate( "-", 133 ) + "|" );
					imp.say( imp.pRow() + 1, 0, imp.comprimido() );
					imp.say( imp.pRow(), 0, "|" );
					imp.say( imp.pRow(), 4, "C�digo" );
					imp.say( imp.pRow(), 12, "|" );
					imp.say( imp.pRow(), 14, "Nome:" );
					imp.say( imp.pRow(), 46, "|" );
					imp.say( imp.pRow(), 48, "Setor:" );
					imp.say( imp.pRow(), 58, "|" );
					imp.say( imp.pRow(), 60, "Fu��o:" );
					imp.say( imp.pRow(), 70, "|" );
					imp.say( imp.pRow(), 72, "Cl.comis.:" );
					imp.say( imp.pRow(), 84, "|" );
					imp.say( imp.pRow(), 92, "Fone:" );
					imp.say( imp.pRow(), 106, "|" );
					imp.say( imp.pRow(), 108, "Cidade:" );
					imp.say( imp.pRow(), 135, "|" );
					imp.say( imp.pRow() + 1, 0, imp.comprimido() );
					imp.say( imp.pRow(), 0, "|" + Funcoes.replicate( "-", 133 ) + "|" );
				}

				imp.say( imp.pRow() + 1, 0, imp.comprimido() );
				imp.say( imp.pRow(), 0, "|" );
				imp.say( imp.pRow(), 4, rs.getString( "CodVend" ) );
				imp.say( imp.pRow(), 12, "|" );
				imp.say( imp.pRow(), 14, rs.getString( "NomeVend" ) != null ? rs.getString( "NomeVend" ).substring( 0, 30 ) : "" );
				imp.say( imp.pRow(), 46, "|" );
				imp.say( imp.pRow(), 48, rs.getString( "CodSetor" ) != null ? rs.getString( "CodSetor" ) : "" );
				imp.say( imp.pRow(), 58, "|" );
				imp.say( imp.pRow(), 60, rs.getString( "CodFunc" ) != null ? rs.getString( "CodFunc" ) : "" );
				imp.say( imp.pRow(), 70, "|" );
				imp.say( imp.pRow(), 72, rs.getString( "CodClComis" ) != null ? rs.getString( "CodClComis" ) : "" );
				imp.say( imp.pRow(), 84, "|" );
				imp.say( imp.pRow(), 86, rs.getString( "DDDFoneVend" ) != null ? "(" + rs.getString( "DDDFoneVend" ) + ")" : "" );
				imp.say( imp.pRow(), 92, rs.getString( "FoneVend" ) != null ? Funcoes.setMascara( rs.getString( "FoneVend" ).trim(), "####-####" ) : "" );
				imp.say( imp.pRow(), 106, "|" );
				imp.say( imp.pRow(), 108, rs.getString( "CidVend" ) != null ? rs.getString( "CidVend" ).substring( 0, 19 ) : "" );
				imp.say( imp.pRow(), 135, "|" );

				if ( imp.pRow() >= linPag ) {
					imp.say( imp.pRow() + 1, 0, imp.comprimido() );
					imp.say( imp.pRow(), 0, "+" + Funcoes.replicate( "-", 133 ) + "+" );
					imp.incPags();
					imp.eject();
				}
				iContaReg++;
			}
			imp.say( imp.pRow() + 1, 0, imp.comprimido() );
			imp.say( imp.pRow(), 0, "+" + Funcoes.replicate( "-", 133 ) + "+" );
			imp.eject();

			imp.fechaGravacao();
			if ( !con.getAutoCommit() )
				con.commit();
			dl.dispose();
		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro consulta tabela de clientes!\n" + err.getMessage(), true, con, err );
			err.printStackTrace();
		} finally {
			ps = null;
			rs = null;
			sSQL = null;
			sWhere = null;
			sValores = null;
			dl = null;
			vFiltros = null;
		}

		if ( bVisualizar )
			imp.preview( this );
		else
			imp.print();
	}

	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		if ( ehSetorVend() )
			montaSetor();
		lcClComis.setConexao( cn );
		lcPlan.setConexao( cn );
		lcFuncao.setConexao( cn );
		lcTipoComis.setConexao( cn );
		setListaCampos( true, "VENDEDOR", "VD" );
	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp ) {
			imprimir( true );
		}
		else if ( evt.getSource() == btImp )
			imprimir( false );
		super.actionPerformed( evt );
	}

	public void beforePost( PostEvent pevt ) {

		if ( txtInscVend.getText().trim().length() < 1 ) {
			if ( Funcoes.mensagemConfirma( this, "Inscri��o Estadual em branco! Inserir ISENTO?" ) == JOptionPane.OK_OPTION )
				txtInscVend.setVlrString( "ISENTO" );
			pevt.cancela();
			txtInscVend.requestFocus();
		}
		else if ( txtInscVend.getText().trim().toUpperCase().compareTo( "ISENTO" ) == 0 )
			return;
		else if ( txtUFVend.getText().trim().length() < 2 ) {
			pevt.cancela();
			Funcoes.mensagemInforma( this, "Campo UF � requerido! ! !" );
			txtUFVend.requestFocus();
		}
		else if ( Funcoes.vIE( txtInscVend.getText(), txtUFVend.getText() ) )
			txtInscVend.setVlrString( Funcoes.sIEValida );
		else {
			pevt.cancela();
			Funcoes.mensagemInforma( this, "Inscri��o Estadual Inv�lida ! ! !" );
			txtInscVend.requestFocus();
		}
	}

}

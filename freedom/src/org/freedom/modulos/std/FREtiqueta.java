/**
 * @version 19/12/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FREtiqueta.java <BR>
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
 * Classe para impress�o de etiquetas de clientes.
 * 
 */

package org.freedom.modulos.std;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.CheckBoxEvent;
import org.freedom.acao.CheckBoxListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JComboBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FRelatorio;

public class FREtiqueta extends FRelatorio implements CarregaListener, CheckBoxListener {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtCodModEtiq = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescModEtiq = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtNomeVend = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodSetor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldFK txtDescSetor = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodTipo = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescTipo = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtUfCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0);
	
	private JTextFieldPad txtCidadeCli = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0);

	private ListaCampos lcModEtiq = new ListaCampos( this );

	private ListaCampos lcSetor = new ListaCampos( this );

	private ListaCampos lcTipo = new ListaCampos( this );

	private ListaCampos lcCliente = new ListaCampos( this );

	private ListaCampos lcPapel = new ListaCampos( this, "PL" );

	private ListaCampos lcVendedor = new ListaCampos( this, "VD" );

	private JTextAreaPad txaEtiqueta = new JTextAreaPad( 500 );

	private JTextFieldPad txtNColModEtiq = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private ObjetoEtiquetaCli objEtiqCli = new ObjetoEtiquetaCli();
	
	private ObjetoEtiquetaComis objEtiqComis = new ObjetoEtiquetaComis();

	private JTextFieldPad txtCodPapel = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private JTextFieldPad txtDescPapel = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtLinPapel = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtColPapel = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtEECModEtiq = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtComprimido = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private JPanelPad pnTotal = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pnDet = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinCab = new JPanelPad( 480, 230 );

	private Tabela tab = new Tabela();

	private JScrollPane spnDet = new JScrollPane( tab );

	private JButton btAdiciona = new JButton( Icone.novo( "btGerar.gif" ) );

	private JButton btLimpa = new JButton( Icone.novo( "btRetorno.gif" ) );

	private boolean bMontaTab = true;

	private JButton btExcluir = new JButton( Icone.novo( "btExcluir.gif" ) );

	private JComboBoxPad cbAtivoCli = null;
	
	private JCheckBoxPad cbComissionados = new JCheckBoxPad("Comissionados? ", "S", "N");

	public FREtiqueta() {

		setPanel( pnTotal );

		setTitulo( "Impress�o de etiquetas" );

		setAtribos( 20, 20, 600, 350 );

		pnDet.add( spnDet, BorderLayout.CENTER );
		pnTotal.add( pinCab, BorderLayout.NORTH );
		pnTotal.add( pnDet, BorderLayout.CENTER );

		Vector<String> lAtivo = new Vector<String>();
		Vector<String> vAtivo = new Vector<String>();
		lAtivo.addElement( "<--Selecione-->" );
		lAtivo.addElement( "Ativos" );
		lAtivo.addElement( "Inativos" );
		vAtivo.addElement( "" );
		vAtivo.addElement( "Ativos" );
		vAtivo.addElement( "Inativos" );

		cbAtivoCli = new JComboBoxPad( lAtivo, vAtivo, JComboBoxPad.TP_INTEGER, 5, 0 );

		lcPapel.add( new GuardaCampo( txtCodPapel, "Codpapel", "Cod.papel", ListaCampos.DB_PK, false ) );
		lcPapel.add( new GuardaCampo( txtDescPapel, "Descpapel", "Descri��o do papel", ListaCampos.DB_SI, false ) );
		lcPapel.add( new GuardaCampo( txtColPapel, "Colpapel", "Num. colunas", ListaCampos.DB_SI, false ) );
		lcPapel.add( new GuardaCampo( txtLinPapel, "Linpapel", "Lin. colunas", ListaCampos.DB_SI, false ) );
		lcPapel.montaSql( false, "PAPEL", "SG" );
		lcPapel.setQueryCommit( false );
		lcPapel.setReadOnly( true );
		txtCodPapel.setTabelaExterna( lcPapel );

		lcModEtiq.add( new GuardaCampo( txtCodModEtiq, "CodModEtiq", "C�d.mod.", ListaCampos.DB_PK, true ) );
		lcModEtiq.add( new GuardaCampo( txtDescModEtiq, "DescModEtiq", "Descri��o do modelo de etiqueta", ListaCampos.DB_SI, false ) );
		lcModEtiq.add( new GuardaCampo( txaEtiqueta, "TxaModEtiq", "Corpo", ListaCampos.DB_SI, false ) );
		lcModEtiq.add( new GuardaCampo( txtNColModEtiq, "NColModEtiq", "Colunas", ListaCampos.DB_SI, false ) );
		lcModEtiq.add( new GuardaCampo( txtCodPapel, "Codpapel", "C�d.papel", ListaCampos.DB_FK, false ) );
		lcModEtiq.add( new GuardaCampo( txtEECModEtiq, "EECModEtiq", "entre col.", ListaCampos.DB_SI, false ) );
		lcModEtiq.add( new GuardaCampo( txtComprimido, "Comprimido", "Imp. Comp.", ListaCampos.DB_SI, false ) );

		lcModEtiq.setReadOnly( true );
		lcModEtiq.montaSql( false, "MODETIQUETA", "SG" );
		txtCodModEtiq.setTabelaExterna( lcModEtiq );
		txtCodModEtiq.setFK( true );
		txtCodModEtiq.setNomeCampo( "CodModEtiq" );

		lcSetor.add( new GuardaCampo( txtCodSetor, "CodSetor", "C�d.setor", ListaCampos.DB_PK, false ) );
		lcSetor.add( new GuardaCampo( txtDescSetor, "DescSetor", "Descri��o do setor", ListaCampos.DB_SI, false ) );
		lcSetor.setReadOnly( true );
		lcSetor.montaSql( false, "SETOR", "VD" );
		txtCodSetor.setTabelaExterna( lcSetor );
		txtCodSetor.setFK( true );
		txtCodSetor.setNomeCampo( "CodSetor" );

		lcTipo.add( new GuardaCampo( txtCodTipo, "CodTipoCli", "C�d.tp.cli.", ListaCampos.DB_PK, txtDescTipo, false ) );
		lcTipo.add( new GuardaCampo( txtDescTipo, "DescTipoCli", "Descri��o do tipo de cliente", ListaCampos.DB_SI, false ) );
		lcTipo.setReadOnly( true );
		lcTipo.montaSql( false, "TIPOCLI", "VD" );
		txtCodTipo.setTabelaExterna( lcTipo );
		txtCodTipo.setFK( true );
		txtCodTipo.setNomeCampo( "CodTipoCli" );

		lcVendedor.add( new GuardaCampo( txtCodVend, "CodVend", "C�d.Comiss.", ListaCampos.DB_PK, txtNomeVend, false ) );
		lcVendedor.add( new GuardaCampo( txtNomeVend, "NomeVend", "Nome do Comissionado", ListaCampos.DB_SI, false ) );
		lcVendedor.setReadOnly( true );
		lcVendedor.montaSql( false, "VENDEDOR", "VD" );
		txtCodVend.setTabelaExterna( lcVendedor );
		txtCodVend.setFK( true );
		txtCodVend.setNomeCampo( "CodVend" );

		lcCliente.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.Cli.", ListaCampos.DB_PK, txtRazCli, false ) );
		lcCliente.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o do cliente", ListaCampos.DB_SI, false ) );
		lcCliente.setReadOnly( true );
		lcCliente.montaSql( false, "CLIENTE", "VD" );
		txtCodCli.setTabelaExterna( lcCliente );
		txtCodCli.setFK( true );
		txtCodCli.setNomeCampo( "CodCli" );

		pinCab.adic( new JLabelPad( "C�d.mod." ), 7, 5, 80, 20 );
		pinCab.adic( txtCodModEtiq, 7, 25, 80, 20 );
		pinCab.adic( new JLabelPad( "Descri��o do modelo" ), 90, 5, 260, 20 );
		pinCab.adic( txtDescModEtiq, 90, 25, 260, 20 );

		pinCab.adic( new JLabelPad( "Status" ), 370, 5, 100, 20 );
		pinCab.adic( cbAtivoCli, 370, 25, 135, 25 );
		
		pinCab.adic( new JLabelPad("Cidade do Cliente"), 370, 85, 100, 20 );
		pinCab.adic( txtCidadeCli, 370, 105, 100, 20 );
		
		pinCab.adic( new JLabelPad("UF do cliente"), 370, 125, 100, 20 );
		pinCab.adic( txtUfCli, 370, 145, 100, 20 );
		
		pinCab.adic( cbComissionados, 370, 180, 150, 20 );

		pinCab.adic( new JLabelPad( "C�d.tp.cli." ), 7, 45, 280, 20 );
		pinCab.adic( txtCodTipo, 7, 65, 80, 20 );
		pinCab.adic( new JLabelPad( "Descri��o do tipo de cliente" ), 90, 45, 280, 20 );
		pinCab.adic( txtDescTipo, 90, 65, 260, 20 );

		pinCab.adic( new JLabelPad( "C�d.setor" ), 7, 85, 280, 20 );
		pinCab.adic( txtCodSetor, 7, 105, 80, 20 );
		pinCab.adic( new JLabelPad( "Descri��o do setor" ), 90, 85, 280, 20 );
		pinCab.adic( txtDescSetor, 90, 105, 260, 20 );

		pinCab.adic( new JLabelPad( "C�d.Cli." ), 7, 125, 280, 20 );
		pinCab.adic( txtCodCli, 7, 145, 80, 20 );

		pinCab.adic( new JLabelPad( "Raz�o do cliente" ), 90, 125, 280, 20 );
		pinCab.adic( txtRazCli, 90, 145, 260, 20 );

		pinCab.adic( new JLabelPad( "C�d.Comiss." ), 7, 165, 280, 20 );
		pinCab.adic( txtCodVend, 7, 185, 80, 20 );

		pinCab.adic( new JLabelPad( "Nome do comissionado" ), 90, 165, 280, 20 );
		pinCab.adic( txtNomeVend, 90, 185, 260, 20 );

		btAdiciona.setToolTipText( "Adiciona" );
		btLimpa.setToolTipText( "Limpa o grid" );
		btExcluir.setToolTipText( "Exclui o �tem selecionado" );

		pinCab.adic( btAdiciona, 555, 15, 30, 30 );
		pinCab.adic( btLimpa, 555, 48, 30, 30 );
		pinCab.adic( btExcluir, 555, 81, 30, 30 );

		lcModEtiq.addCarregaListener( this );

		btAdiciona.addActionListener( this );
		btLimpa.addActionListener( this );
		btExcluir.addActionListener( this );
		cbComissionados.addCheckBoxListener( this );

		setPrimeiroFoco( txtCodModEtiq );

	}

	private void excluir() {

		if ( tab.getLinhaSel() > -1 ) {
			tab.delLinha( tab.getLinhaSel() );
		}
	}

	public void montaTabela( Tabela tb ) {
		
		objEtiqCli.setTexto( txaEtiqueta.getVlrString() );
		Vector<?> vLabelsColunas = objEtiqCli.getLabelsColunasAdic();
		Vector<?> vTamanhos = objEtiqCli.getTamsAdic();
		tb.limpa();
		
		for ( int i = 0; vLabelsColunas.size() > i; i++ ) {
			tb.adicColuna( vLabelsColunas.elementAt( i ).toString() );
			String sTmp = vTamanhos.elementAt( i ).toString();
			int iiTam = Integer.parseInt( sTmp ) * 5;
			tb.setTamColuna( iiTam, i );
		}

		for ( int i = 0; vLabelsColunas.size() > i; i++ ) {
			String sTmp = vTamanhos.elementAt( i ).toString();
			int iiTam = Integer.parseInt( sTmp ) * 7;
			tb.setTamColuna( iiTam, i );
		}

		bMontaTab = false;
	}

	@SuppressWarnings("unchecked")
	public void adicItens() {

		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement( montaQuery( "VDCLIENTE" ) );
			rs = ps.executeQuery();

			Vector<Object> vLinha = new Vector<Object>();

			while ( rs.next() ) {
				vLinha = new Vector<Object>();
				for ( int i = 1; objEtiqCli.getCamposAdic().size() >= i; i++ ) {
					String sTmp = rs.getString( i ) != null ? rs.getString( i ) : "";
					vLinha.addElement( sTmp );
				}
				tab.adicLinha( (Vector<Object>) vLinha.clone() );
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btAdiciona ) {
			if ( ( txtCodModEtiq.getVlrInteger().intValue() > 0 ) ) {
				if ( bMontaTab )
					montaTabela( tab );
				adicItens();
			}
			else if ( txtCodModEtiq.getVlrInteger().intValue() == 0 ) {
				Funcoes.mensagemInforma( this, "Voc� deve selecionar um modelo de etiqueta!" );
			}
		}
		else if ( evt.getSource() == btLimpa ) {
			tab.limpa();
		}
		else if ( evt.getSource() == btExcluir )
			excluir();

		super.actionPerformed( evt );
	}

	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		lcModEtiq.setConexao( cn );
		lcSetor.setConexao( cn );
		lcTipo.setConexao( cn );
		lcPapel.setConexao( cn );
		lcCliente.setConexao( cn );
		lcVendedor.setConexao( cn );
	}

	@SuppressWarnings("unchecked")
	public void imprimir( boolean bVisualizar ) {

		String sTxa = txaEtiqueta.getVlrString();

		PreparedStatement ps = null;
		ResultSet rs = null;
		int iNColModEtiq = txtNColModEtiq.getVlrInteger().intValue();

		ImprimeOS imp = null;
		try {
			if ( txtCodModEtiq.getVlrString().equals( "" ) ) {
				Funcoes.mensagemInforma( this, "C�digo do modelo em branco!" );
				return;
			}
			imp = new ImprimeOS( "", con );
			imp.setImpEject( true );
			imp.verifLinPag();
			imp.setTitulo( "Etiquetas" );

			if ( sTxa != null ) {
				try {
					ps = con.prepareStatement( montaQuery( "VDCLIENTE" ) );
					rs = ps.executeQuery();
					Vector<Vector<?>> vCol = new Vector<Vector<?>>();
					Vector<Vector<Vector<?>>> vCols = new Vector<Vector<Vector<?>>>();
					Vector<?> vVal = new Vector<Object>();

					int iAdic = 0;
					for ( int i = 0; tab.getNumLinhas() > i; i++ ) {
						vVal = aplicCampos( i );
						vCol.addElement( vVal );
						iAdic++;

						if ( iNColModEtiq == iAdic ) {
							vCols.addElement( (Vector<Vector<?>>) vCol.clone() );
							vCol = new Vector<Vector<?>>();
							iAdic = 0;
						}
					}

					if ( vCol.size() > 0 ) // Recolhe os restos e joga em um nov elemento...
						vCols.addElement( vCol );

					impCol( imp, vCols );

					rs.close();
					ps.close();
					if ( !con.getAutoCommit() )
						con.commit();

				} catch ( SQLException err ) {
					Funcoes.mensagemErro( this, "Erro ao consultar informa��es!\n" + err.getMessage(), true, con, err );
					err.printStackTrace();
				}

				imp.eject();
				imp.fechaGravacao();

				if ( bVisualizar ) {
					imp.preview( this );
				}
				else {
					imp.print();
				}

			}
		} finally {
			ps = null;
			rs = null;
			imp = null;
		}

	}

	private String montaQuery( String sTabela ) {
		
		String sSQL = "";
		try {
			String sCampos = "";
			Vector<?> vCamposAdic = null;
			
			if( cbComissionados.getVlrString().equals( "N" ) ){
				vCamposAdic = objEtiqCli.getCamposAdic();
			}
			else if( cbComissionados.getVlrString().equals( "S" )){
				vCamposAdic = objEtiqComis.getCamposAdic();
			}			
			
			String sWhere = "WHERE CODEMP=" + Aplicativo.iCodEmp + " AND CODFILIAL=" + ListaCampos.getMasterFilial( sTabela );

			try {
				if ( !txtCodSetor.getVlrString().equals( "" ) ) {
					sWhere += " AND CODSETOR=" + txtCodSetor.getVlrInteger().intValue();
					sWhere += " AND CODEMPSR=" + Aplicativo.iCodEmp;
					sWhere += " AND CODFILIALSR=" + lcSetor.getCodFilial();
				}
				if ( !txtCodTipo.getVlrString().equals( "" ) ) {
					sWhere += " AND CODTIPOCLI=" + txtCodTipo.getVlrInteger().intValue();
					sWhere += " AND CODEMPTC=" + Aplicativo.iCodEmp;
					sWhere += " AND CODFILIALTC=" + lcTipo.getCodFilial();
				}
				if ( !txtCodCli.getVlrString().equals( "" ) ) {
					sWhere += " AND CODCLI=" + txtCodCli.getVlrInteger().intValue();
				}
				if( !txtCidadeCli.getVlrString().equals( "" ) ){
					sWhere += " AND CIDCLI=" + "'" + txtCidadeCli.getVlrString().trim() + "'";
				}
				if (!txtUfCli.getVlrString().equals( "" )){
					sWhere += " AND UFCLI=" + "'" + txtUfCli.getVlrString().trim() + "'";
				}
				if ( cbAtivoCli.getVlrString() != null ) {
					if ( cbAtivoCli.getVlrString().equals( "Ativos" ) )
						sWhere += " AND ATIVOCLI='S'";
					else if ( cbAtivoCli.getVlrString().equals( "Inativos" ) )
						sWhere += " AND ATIVOCLI='N'";
				}
				if ( !txtCodVend.getVlrString().equals( "" ) ) {
					sWhere += " AND CODVEND=" + txtCodVend.getVlrInteger().intValue();
					sWhere += " AND CODEMPVD=" + Aplicativo.iCodEmp;
					sWhere += " AND CODFILIALVD=" + lcVendedor.getCodFilial();
				}

				for ( int i = 0; vCamposAdic.size() > i; i++ ) {
					sCampos = sCampos + vCamposAdic.elementAt( i ).toString() + ",";
				}

				sSQL = "SELECT " + sCampos.substring( 0, sCampos.length() - 1 ) + " FROM " + sTabela + " " + sWhere + " ORDER BY 1";
			} catch ( Exception e ) {
				e.printStackTrace();
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return sSQL;
	}

	private void impCol( ImprimeOS imp, Vector<Vector<Vector<?>>> vCols ) {

		try {
			int iColsEtiq = txtNColModEtiq.getVlrInteger().intValue();
			int iLins = txtLinPapel.getVlrInteger().intValue();
			int iColPapel = txtColPapel.getVlrInteger().intValue();
			int iEECEtiq = txtEECModEtiq.getVlrInteger().intValue();
			int iCol = 0;
			int iSalto = 1;
			int iNumLinEtiq = objEtiqCli.getNumLinEtiq();
			try {
				if ( txtComprimido.getVlrString() != null )
					if ( txtComprimido.getVlrString().equals( "S" ) )
						imp.say( imp.pRow(), 0, "" + imp.comprimido() );
				for ( int i1 = 0; vCols.size() > i1; i1++ ) {
					Vector<?> vCol = ( vCols.elementAt( i1 ) );
					for ( int iNumLinhaEtiqAtual = 0; iNumLinEtiq > iNumLinhaEtiqAtual; iNumLinhaEtiqAtual++ ) {
						for ( int i2 = 0; iColsEtiq > i2; i2++ ) {

							if ( vCol.size() > i2 ) {
								Vector<?> vEtiqueta = (Vector<?>) vCol.elementAt( i2 );
								String sImp = "";
								if ( vEtiqueta.size() > iNumLinhaEtiqAtual )
									sImp = vEtiqueta.elementAt( iNumLinhaEtiqAtual ).toString();
								imp.say( imp.pRow() + iSalto, iCol, sImp );
							}

							iSalto = 0;
							iCol += ( ( iColPapel / iColsEtiq ) + ( iEECEtiq ) );

							if ( iCol >= iColPapel ) {
								iCol = 0;
								iSalto = 1;

							}

							if ( ( imp.pRow() == ( iLins ) ) && ( ( iColsEtiq - 1 ) == ( i2 ) ) ) {
								imp.eject();
								imp.incPags();
								iCol = 0;
								iSalto = 1;

								if ( ( iNumLinhaEtiqAtual < ( iNumLinEtiq - 1 ) ) ) {
									iNumLinhaEtiqAtual = 0;
									i2 = -1;
								}

							}
						}
						iSalto = 1;
					}
				}
			} catch ( Exception e ) {
				e.printStackTrace();
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {
			vCols = null;
		}
	}

	public void afterCarrega( CarregaEvent cevt ) {

		objEtiqCli.setTexto( txaEtiqueta.getVlrString() );
	}

	public void beforeCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcModEtiq ) {
			if ( tab.getNumLinhas() > 0 ) {
				Funcoes.mensagemInforma( this, "Voc� deve limpar a sele��o atual caso queira trocar de modelo!" );
				lcModEtiq.cancelCarrega();
				cevt.cancela();
				return;
			}
		}
	}

	private Vector<?> aplicCampos( int iLinha ) {

		String sCampo = "";
		String sRetorno = txaEtiqueta.getVlrString();
		sRetorno = sRetorno.replaceAll( "\\\n", "[Q]" );
		Vector<?> vRet = null;
		if ( iLinha > -1 ) {
			try {
				Vector<?> vMascAdic = objEtiqCli.getMascarasAdic();
				Vector<?> vValAdic = objEtiqCli.getValoresAdic();
				Vector<?> vCamposAdic = objEtiqCli.getCamposAdic();
				if ( sRetorno != null ) {
					try {
						for ( int i = 0; vCamposAdic.size() > i; i++ ) {
							String sValAdic = vValAdic.elementAt( i ).toString();
							String sFragmento = sRetorno.substring( sRetorno.indexOf( "[" + sValAdic ) );
							sFragmento = sFragmento.substring( 0, ( "\\" + sFragmento ).indexOf( "]" ) );

							sCampo = tab.getValor( iLinha, i ).toString();

							if ( vMascAdic.elementAt( i ) != null )
								sCampo = Funcoes.setMascara( sCampo, vMascAdic.elementAt( i ).toString() );

							int iTmp = Funcoes.contaChar( sFragmento, '-' );

							if ( sCampo.length() >= iTmp )
								sCampo = sCampo.substring( 0, iTmp );
							else
								sCampo = sCampo + Funcoes.replicate( " ", iTmp - sCampo.length() );

							sRetorno = sRetorno.replaceAll( "\\" + sFragmento, sCampo );

						}
					} catch ( Exception err ) {
						Funcoes.mensagemErro( this, "Erro na troca de dados!\n" + err.getMessage(), true, con, err );
					}
				}
				vRet = Funcoes.stringToVector( sRetorno, "[Q]" );
			} finally {
				sCampo = null;
				sRetorno = null;
			}
		}
		return vRet;
	}

	public void valorAlterado( CheckBoxEvent evt ) {
		
		if( cbComissionados.getVlrString().equals( "S" )){
		
			txtCodCli.setVlrString( "" );
			txtCodSetor.setVlrString( "" );
			txtCodTipo.setVlrString( "" );
			
			txtDescTipo.setVlrString( "" );
			txtDescSetor.setVlrString( "" );
			txtRazCli.setVlrString( "" );
			
			txtCodCli.setSoLeitura( true );
			txtCodSetor.setSoLeitura( true );
			txtCodTipo.setSoLeitura( true );
		}
		if( cbComissionados.getVlrString().equals( "N" )){
			
			txtCodCli.setSoLeitura( false );
			txtCodSetor.setSoLeitura( false );
			txtCodTipo.setSoLeitura( false );
		}
	}
}

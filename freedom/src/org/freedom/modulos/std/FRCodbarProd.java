/**
 * @version 23/08/2007 <BR>
 * @author Setpoint Inform�tica Ltda./Reginaldo Garcia Heua <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FRCodbarProd.java <BR>
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
 */
package org.freedom.modulos.std;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FRelatorio;

public class FRCodbarProd extends FRelatorio implements ActionListener, CarregaListener, KeyListener {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtRefProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodBarProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtQtdPod = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	private JButton btExecuta = new JButton( Icone.novo( "btExecuta.gif" ) );

	private JButton btExcluir = new JButton( Icone.novo( "btCancelar.gif" ) );

	private JButton btExcluirTudo = new JButton( Icone.novo( "btNada.gif" ) );

	private Tabela tabGrid = new Tabela();

	private JScrollPane spnGrid = new JScrollPane( tabGrid );

	private ListaCampos lcProduto = new ListaCampos( this );

	private JPanelPad pnCampos = new JPanelPad( 600, 65 );

	private JPanelPad pnBotoesGrid = new JPanelPad( 35, 200 );

	private JPanelPad pnGrid = new JPanelPad( 600, 200 );

	private JComboBox cbSel = null;
	

	public FRCodbarProd() {

		super( true );
		setTitulo( "Etiquetas de c�digo de barras" );
		setAtribos( 80, 30, 490, 380 );

		montaTela();
		montaListaCampos();
	}

	private void montaTela() {

		Container c = getContentPane();

		c.add( pnCampos, BorderLayout.NORTH );
		c.add( pnGrid, BorderLayout.CENTER );
		c.add( pnBotoesGrid, BorderLayout.EAST );
		c.add( spnGrid );

		pnCampos.adic( new JLabelPad( "C�d. Produto" ), 07, 05, 100, 20 );
		pnCampos.adic( txtCodProd, 07, 23, 80, 20 );
		pnCampos.adic( new JLabelPad( "Descri��o do produto" ), 93, 05, 200, 20 );
		pnCampos.adic( txtDescProd, 93, 23, 280, 20 );
		pnCampos.adic( new JLabelPad( "qtd." ), 375, 05, 30, 20 );
		pnCampos.adic( txtQtdPod, 375, 23, 30, 20 );
		pnCampos.adic( btExecuta, 410, 15, 30, 30 );
		pnBotoesGrid.adic( btExcluir, 0, 0, 30, 30 );
		pnBotoesGrid.adic( btExcluirTudo, 0, 30, 30, 30 );

		tabGrid.adicColuna( "C�d. prod" );
		tabGrid.adicColuna( "Descri��o do produto" );
		tabGrid.adicColuna( "Qtd" );

		tabGrid.setTamColuna( 60, EProduto.CODPROD.ordinal() );
		tabGrid.setTamColuna( 300, EProduto.DESCPROD.ordinal() );
		tabGrid.setTamColuna( 60, EProduto.QTDPROD.ordinal() );

		lcProduto.addCarregaListener( this );
		btExecuta.addActionListener( this );
		btExcluir.addActionListener( this );
		btExcluirTudo.addActionListener( this );
		txtQtdPod.addKeyListener( this );

		btExecuta.setToolTipText( "Executar" );
		btExcluir.setToolTipText( "Ecluir" );
		btExcluirTudo.setToolTipText( "Excluir tudo" );

	}

	private void montaListaCampos() {

		/***********
		 * Produto *
		 ***********/

		lcProduto.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.produto", ListaCampos.DB_PK, true ) );
		lcProduto.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProduto.add( new GuardaCampo( txtRefProd, "RefProd", "Ref. produto", ListaCampos.DB_SI, false ) );
		lcProduto.add( new GuardaCampo( txtCodBarProd, "CodBarProd", "C�d. Barras", ListaCampos.DB_SI, false ) );
		txtCodProd.setTabelaExterna( lcProduto );
		txtCodProd.setNomeCampo( "CodProd" );
		txtCodProd.setFK( true );
		lcProduto.setReadOnly( true );
		lcProduto.montaSql( false, "PRODUTO", "EQ" );

	}

	private void adicLinha() {

		int qtd = txtQtdPod.getVlrInteger().intValue();
		int codprod = txtCodProd.getVlrInteger().intValue();
		int pos = -1;

		if ( codprod == 0 ) {

			Funcoes.mensagemInforma( this, "Produto n�o encontrado!" );
			txtCodProd.requestFocus();
			return;
		}

		for ( int i = 0; i < tabGrid.getNumLinhas(); i++ ) {

			if ( codprod == ( (Integer) tabGrid.getValor( i, EProduto.CODPROD.ordinal() ) ).intValue() ) {
				pos = i;
				qtd += (Integer) tabGrid.getValor( i, EProduto.QTDPROD.ordinal() );
				break;
			}
		}

		if ( pos == -1 ) {

			tabGrid.adicLinha();
			pos = tabGrid.getNumLinhas() - 1;
		}

		tabGrid.setValor( codprod, pos, EProduto.CODPROD.ordinal() );
		tabGrid.setValor( txtDescProd.getVlrString(), pos, EProduto.DESCPROD.ordinal() );
		tabGrid.setValor( qtd, pos, EProduto.QTDPROD.ordinal() );

	}

	private void excluiLinha() {

		if ( tabGrid.getLinhaSel() != -1 ) {

			tabGrid.delLinha( tabGrid.getLinhaSel() );
		}
		else {

			Funcoes.mensagemInforma( this, "Selecione uma linha na lista!" );
		}
	}

	private void excluiTudo() {

		tabGrid.limpa();
	}
	
	private int getNrConexao() {
		
		int conexao = -1;
		
		StringBuilder sql = new StringBuilder();
		
		sql.append( "SELEC CURRENT_CONNECTION FROM SGEMPRESA E WHERE C.CODEMP=?" );
		
		try {
			
			PreparedStatement ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			
			ResultSet rs = ps.executeQuery();
			
			if ( rs.next() ) {
				conexao = rs.getInt( "NRCONEXAO" );
			}
			
			rs.close();
			ps.close();
			
			if ( ! con.getAutoCommit() ) {
				con.commit();
			}
			
		} catch ( SQLException e ) {
			e.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar n�mero da conex�o!\n" + e.getMessage(), true, con, e );
		}
		
		return conexao;
	}
	
	private boolean removeEtiquetas() {
		
		boolean retorno = false;
		
		StringBuilder sql = new StringBuilder();
		
		sql.append( "DELETE FROM EQETIQPROD E WHERE E.NRCONEXAO=?" );
		
		try {
			
			PreparedStatement ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, getNrConexao() );
			
			int exec = ps.executeUpdate();
			
			ps.close();
			
			if ( ! con.getAutoCommit() ) {
				con.commit();
			}
			
			if ( exec > 0 ) {
				retorno = true;
			}
			
		} catch ( SQLException e ) {
			e.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao limpar tabela temporaria de etiquetas!\n" + e.getMessage(), true, con, e );
		}
		
		return retorno;
	}
	
	private boolean persistEtiquetas() {
		
		boolean retorno = false;
		
		int conexao = getNrConexao();
		
		StringBuilder sSql = new StringBuilder();
		
		sSql.append( "INSERT INTO EQETIQPROD " );
		sSql.append( "( NRCONEXAO, CODEMP, CODFILIAL, CODPROD ) " );
		sSql.append( "VALUES " );
		sSql.append( "( ?, ?, ?, ? )" );
		
		String sql = sSql.toString();
		
		int codprod = 0;
		int quantidade = 0;
		
		etiquetas : {
			
			for ( int i = 0; i < tabGrid.getNumLinhas(); i++ ) {

				codprod = (Integer) tabGrid.getValor( i, EProduto.CODPROD.ordinal() );
				quantidade = (Integer) tabGrid.getValor( i, EProduto.QTDPROD.ordinal() );
				
				for ( int j = 0; j < quantidade ; j++ ) {
					
					if ( ! insetEtiqueta( conexao, codprod, sql ) ) {
						
						break etiquetas;
					}
				}
			}
			
			retorno = true;
		}
		
		return retorno;
	}
	
	private boolean insetEtiqueta( int conexao, int codprod, String sql ) {
		
		boolean retorno = true;
		
		try {
			
			PreparedStatement ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, conexao );
			ps.setInt( 2, Aplicativo.iCodEmp );
			ps.setInt( 3, ListaCampos.getMasterFilial( "EQETIQPROD" ) );
			ps.setInt( 4, codprod );
			
			ps.execute();
			
			if ( ! con.getAutoCommit() ) {
				con.commit();
			}
		} catch ( SQLException e ) {
			retorno = false;
			e.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao relacionar etiquetas!\n" + e.getMessage(), true, con, e );
		}
		
		return retorno;
	}

	public void imprimir( boolean b ) {
		
		if ( removeEtiquetas() ) {
			
			if ( persistEtiquetas() ) {

				// Montar jasper com etiquetas...	
			}
		}
	}

	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		lcProduto.setConexao( cn );

	}

	public void afterCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcProduto ) {
			txtQtdPod.setVlrString( "1" );
		}
	}

	@ Override
	public void keyPressed( KeyEvent kevt ) {

		super.keyPressed( kevt );

		if ( kevt.getSource() == txtQtdPod ) {

			if ( kevt.getKeyCode() == KeyEvent.VK_ENTER ) {
				btExecuta.doClick();
			}
		}
	}

	public void actionPerformed( ActionEvent evt ) {

		super.actionPerformed( evt );

		if ( evt.getSource() == btExecuta ) {
			adicLinha();
			txtCodProd.requestFocus();
		}
		if ( evt.getSource() == btExcluir ) {
			excluiLinha();
		}
		if ( evt.getSource() == btExcluirTudo ) {
			excluiTudo();
			txtCodProd.requestFocus();
		}
	}

	public void beforeCarrega( CarregaEvent cevt ) {

	}

	private enum EProduto {
		
		CODPROD, 
		DESCPROD, 
		QTDPROD
	}
}

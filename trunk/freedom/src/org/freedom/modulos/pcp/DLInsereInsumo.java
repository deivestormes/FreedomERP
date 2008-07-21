package org.freedom.modulos.pcp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;


public class DLInsereInsumo extends FFDialogo implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	
	private final JPanelPad pnControl = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private final JPanelPad pinCab = new JPanelPad( 400, 70 );
	
	private final Tabela tabInsumos = new Tabela();
	
	private final JTextFieldPad txtCodProd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private final JTextFieldPad txtRefProd = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );
	 
	private final JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private final JTextFieldPad txtQtd = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private final JTextFieldPad txtLote = new JTextFieldPad( JTextFieldPad.TP_STRING, 15, 0 );
	
	private JTextFieldFK txtDtIniLote = new JTextFieldFK( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JTextFieldFK txtDtVencLote = new JTextFieldFK( JTextFieldPad.TP_DATE, 10, 0 );
	
	private final JCheckBoxPad cbRma = new JCheckBoxPad( "", "S", "N" );
	
	private final JButton btInserir = new JButton( Icone.novo("btGerar.gif"));

	private final ListaCampos lcProd = new ListaCampos( this, ""  );
	
	private int iLinha = 0;
	
	private final Object[] keys;
	
	private ListaCampos lcLote = new ListaCampos( this, "" );
	
	private enum eInsert {
	
		CODPROD, REFERENCIA, DESCPROD, QTD, LOTE, RMA
	};
	
	
	public DLInsereInsumo( Connection con, Object[] keys ){
		
		setTitulo( "Inser��o de itens" );
		setAtribos( 625, 300 );
		setConexao( con );
		
		this.keys = keys;
		
		montaListaCampos();
		montaTela();
		
		txtQtd.addKeyListener( this );
		
	}
	
	private void montaListaCampos(){
		
		/*************
		 *  Produto  *
		 *************/
		  
		lcProd.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, false ) );
		lcProd.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
		lcProd.add( new GuardaCampo( txtRefProd, "RefProd", "Refer�ncia", ListaCampos.DB_SI, false ) );
		txtCodProd.setTabelaExterna( lcProd );
		txtCodProd.setNomeCampo( "CodProd" );
		txtCodProd.setFK( true );
		lcProd.setReadOnly( true );
		lcProd.montaSql( false, "PRODUTO", "EQ" );
		
		/*************
		 *   Lote    *
		 *************/

		lcLote.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.Prod", ListaCampos.DB_PF, false ) );
		lcLote.add( new GuardaCampo( txtLote, "CodLote", "C�d.lote", ListaCampos.DB_PK, false ) );
		lcLote.add( new GuardaCampo( txtDtVencLote, "VenctoLote", "Vencimento do lote", ListaCampos.DB_SI, false ) );
		lcLote.add( new GuardaCampo( txtDtIniLote, "DIniLote", "Data do lote", ListaCampos.DB_SI, false ) );
		txtLote.setTabelaExterna( lcLote );
		txtLote.setNomeCampo( "CodLote" );
		txtLote.setFK( true );
		lcLote.setReadOnly( true );
		lcLote.setDinWhereAdic( "CODPROD = #N", txtCodProd );
		lcLote.montaSql( false, "LOTE", "EQ" );
	}

	private void montaTela(){
		
		pnControl.add( pinCab, BorderLayout.NORTH );
		pnControl.add( new JScrollPane( tabInsumos ), BorderLayout.CENTER );
		c.add( pnControl, BorderLayout.CENTER );
		
		tabInsumos.adicColuna( "C�d.Prod" );
		tabInsumos.adicColuna( "Ref.Prod" );
		tabInsumos.adicColuna( "Descri��o do produto" );
		tabInsumos.adicColuna( "Qtd." );
		tabInsumos.adicColuna( "Lote" );
		tabInsumos.adicColuna( "RMA" );
		
		tabInsumos.setTamColuna( 350, eInsert.DESCPROD.ordinal() );
		
		setPainel( pinCab );
		adic( new JLabelPad( "C�d.Prod" ), 7, 10, 90, 20 );
		adic( txtCodProd, 7, 30, 90, 20 );
		adic( new JLabelPad( "Descri��o do produto" ), 100, 10, 250, 20 );
		adic( txtDescProd, 100, 30, 250, 20 );
		adic( new JLabelPad( "Qtd." ), 353, 10, 60, 20 );
		adic( txtQtd, 353, 30, 60, 20 );
		adic( new JLabelPad( "Lote" ), 416, 10, 50, 20 );
		adic( txtLote, 416, 30, 100, 20 );
		adic( new JLabelPad( "RMA" ), 529, 10, 30, 20 );
		adic( cbRma, 529, 30, 30, 20 );
		adic( btInserir, 570, 25, 30, 30 );
		
		txtCodProd.setRequerido( true );
		txtQtd.setRequerido( true );
		
		btInserir.addActionListener( this );
		
	}
	
	private void insertGrid( int codprod, String descprod, BigDecimal qtd, String referencia, boolean rma ){
		
		int linha = -1;
		
		if ( codprod == 0 ) {
			Funcoes.mensagemInforma( this, "Produto n�o encontrado!" );
			txtCodProd.requestFocus();
			return;
		}
		if( "S".equals( temLote() )){
			if( txtLote.getVlrString().equals( "" )){
				Funcoes.mensagemInforma( this, "Informe o lote!" );
				return;
			} 
		}
		
		for ( int i = 0; i < tabInsumos.getNumLinhas(); i++ ) {
			if ( codprod == ( (Integer) tabInsumos.getValor( i, eInsert.CODPROD.ordinal() ) ).intValue() ) {
				linha = i;
				qtd = qtd.add( (BigDecimal) tabInsumos.getValor( i, eInsert.QTD.ordinal() ) );	
				
				break;
			}
		}

		if ( linha == -1 ) {
			tabInsumos.adicLinha();
			linha = tabInsumos.getNumLinhas() - 1;
		}

		tabInsumos.setValor( codprod, linha, eInsert.CODPROD.ordinal() );
		tabInsumos.setValor( referencia, linha, eInsert.REFERENCIA.ordinal() );
		tabInsumos.setValor( descprod, linha, eInsert.DESCPROD.ordinal() );
		tabInsumos.setValor( txtLote.getVlrInteger(), linha, eInsert.LOTE.ordinal() );
		tabInsumos.setValor( qtd, linha, eInsert.QTD.ordinal() );
		tabInsumos.setValor( rma, linha, eInsert.RMA.ordinal() );
	}
	
	private void limpaCampo(){
		
		txtCodProd.setVlrString( "" );
		txtDescProd.setVlrString( "" );
		txtQtd.setVlrString( "" );		
		cbRma.setVlrString( "N" );
	}
	
	protected void postItens() {
		
		try {
			
			Integer fase = getCodFase();
			
			Integer newCodItOp = getNewCodItOp();
			
			StringBuilder sql = new StringBuilder();
			sql.append( "INSERT INTO PPITOP " );
			sql.append( "(CODEMP, CODFILIAL, CODOP, SEQOP, SEQITOP," );
			sql.append( " CODEMPPD, CODFILIALPD, CODPROD, QTDITOP," );
			sql.append( " CODEMPFS, CODFILIALFS, CODFASE," );
			sql.append( " CODEMPLE, CODFILIALLE, CODLOTE," );
			sql.append( " REFPROD, GERARMA, SEQAC) " );
			sql.append( "VALUES " );
			sql.append( "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" );

			PreparedStatement ps = null;
			
			for ( int i = 0; i < tabInsumos.getNumLinhas(); i++ ) {

				ps = con.prepareStatement( sql.toString() );
				ps.setInt( 1, Aplicativo.iCodEmp );
				ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
				ps.setInt( 3, (Integer)keys[ 0 ] );
				ps.setInt( 4, (Integer)keys[ 1 ] );
				ps.setInt( 5, newCodItOp );
				ps.setInt( 6, Aplicativo.iCodEmp );
				ps.setInt( 7, ListaCampos.getMasterFilial( "EQPRODUTO" ) );
				ps.setInt( 8, (Integer)tabInsumos.getValor( i, eInsert.CODPROD.ordinal() ) );
				ps.setBigDecimal( 9, (BigDecimal)tabInsumos.getValor( i, eInsert.QTD.ordinal() ) );
				ps.setInt( 10, Aplicativo.iCodEmp );
				ps.setInt( 11, ListaCampos.getMasterFilial( "PPOPFASE" ) );
				ps.setInt( 12, fase );
				ps.setInt( 13, Aplicativo.iCodEmp );
				ps.setInt( 14, ListaCampos.getMasterFilial( "EQLOTE" ) );
				ps.setString( 15, (String)tabInsumos.getValor( i, eInsert.LOTE.ordinal() ) );
				ps.setString( 16, (String)tabInsumos.getValor( i, eInsert.REFERENCIA.ordinal() ) );
				ps.setString( 17, (Boolean)tabInsumos.getValor( i, eInsert.RMA.ordinal() ) ? "S" : "N" );
				ps.setInt( 18, (Integer)keys[ 3 ] );
			}

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}
		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao inserir itens!\n" + err.getMessage(), true, con, err );
		}
	}
	
	private Integer getCodFase() {
		
		Integer fase = null;
		
		try {

			StringBuilder sql = new StringBuilder();
			sql.append( "SELECT F.CODFASE " );
			sql.append( "FROM" );
			sql.append( "  PPOPFASE F, PPOPCQ O, PPESTRUANALISE A " );
			sql.append( "WHERE" );
			sql.append( "  F.CODEMP=A.CODEMPFS AND F.CODFILIAL=A.CODFILIALFS AND F.CODFASE=A.CODFASE AND" );
			sql.append( "  A.CODEMP=O.CODEMPEA AND A.CODFILIAL=O.CODFILIALEA AND A.CODESTANALISE=O.CODESTANALISE AND" );
			sql.append( "  O.CODEMP=? AND O.CODFILIAL=? AND O.CODOP=? AND O.SEQOP=? AND O.SEQOPCQ=?" );

			PreparedStatement ps = con.prepareStatement( "SELECT P1.USAREFPROD FROM SGPREFERE1 P1 WHERE P1.CODEMP=? AND P1.CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			ps.setInt( 3, (Integer)keys[ 0 ] );
			ps.setInt( 4, (Integer)keys[ 1 ] );
			ps.setInt( 5, (Integer)keys[ 2 ] );
			
			ResultSet rs = ps.executeQuery();

			while( rs.next() ) {
				fase = rs.getInt( "CODFASE" );
			}

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}
		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar fase!\n" + err.getMessage(), true, con, err );
		}
		
		return fase;
	}
	
	private String temLote(){
		
		String ret = "";
		StringBuffer sql = new StringBuffer();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sql.append( "SELECT P.CLOTEPROD FROM EQPRODUTO P WHERE CODPROD=? AND CODEMP=? AND CODFILIAL=?" );
		
		try {
			
			ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, txtCodProd.getVlrInteger() );
			ps.setInt( 2, Aplicativo.iCodEmp );
			ps.setInt( 3, ListaCampos.getMasterFilial( "EQPRODUTO" ) );
						
			rs = ps.executeQuery();
			
			if( rs.next() ){
				
				ret = rs.getString( "CLOTEPROD" );
			}
			
		} catch ( SQLException e ) {
		
			e.printStackTrace();
		}
		
		return ret;
	}
	
	private Integer getNewCodItOp() {
		
		Integer itop = null;
		
		try {

			StringBuilder sql = new StringBuilder();
			sql.append( "SELECT MAX(SEQITOP) FROM PPITOP WHERE CODEMP=? AND CODFILIAL=? AND CODOP=? AND SEQOP=?" );

			PreparedStatement ps = con.prepareStatement( "SELECT P1.USAREFPROD FROM SGPREFERE1 P1 WHERE P1.CODEMP=? AND P1.CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			ps.setInt( 3, (Integer)keys[ 0 ] );
			ps.setInt( 4, (Integer)keys[ 1 ] );
			
			ResultSet rs = ps.executeQuery();

			if( rs.next() ) {
				itop = rs.getInt( 1 );
			}

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}
		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar c�digo do item da op!\n" + err.getMessage(), true, con, err );
		}
		
		return itop;
	}
	
	@ Override
	public void ok() {

		// TODO Auto-generated method stub
		super.ok();
	}

	public void setConexao( Connection con ){
		
		super.setConexao( con );
		lcProd.setConexao( con );
		lcLote.setConexao( con );
	}
	
	public void keyPressed( KeyEvent kevt ) {

		super.keyPressed(kevt);
		
		if( kevt.getSource() == txtQtd ){
			if( kevt.getKeyCode() == KeyEvent.VK_ENTER ){
				if( "S".equals( temLote() )){
					txtLote.setRequerido( true );
				}
				else{
					txtLote.setRequerido( false ); 
				}
			}
		}
	}


	public void actionPerformed( ActionEvent evt ) {
	
		super.actionPerformed(evt);
		
		if( evt.getSource() == btInserir ){		
			insertGrid( 
					txtCodProd.getVlrInteger(), 
					txtDescProd.getVlrString(), 
					txtQtd.getVlrBigDecimal(), 
					txtRefProd.getVlrString(), 
					cbRma.isSelected() );
		}
	}
}

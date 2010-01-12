/*
 * Projeto: Freedom
 * Pacote: org.freedom.modules.crm
 * Classe: @(#)FPCP.java
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 * escreva para a Funda��o do Software Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA <BR> 
 */

package org.freedom.modulos.gms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.RowSorter;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.TabelaEditEvent;
import org.freedom.acao.TabelaEditListener;
import org.freedom.acao.TabelaSelEvent;
import org.freedom.acao.TabelaSelListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.JButtonPad;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTabbedPanePad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.modulos.std.FOrcamento;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFilho;
import org.freedom.telas.SwingParams;


/**
 * Painel de controle para recep��o de materias primas
 * 
 * @author Setpoint Inform�tica Ltda./Anderson Sanchez
 * @version 08/01/2010
 */

public class FPainelRecepcao extends FFilho implements ActionListener, TabelaSelListener, MouseListener, KeyListener, CarregaListener, TabelaEditListener, ChangeListener {

	private static final long serialVersionUID = 1L;	
	private static final Color GREEN = new Color( 45, 190, 64 );

	// *** Paineis tela
	
	private JPanelPad panelGeral = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	private JPanelPad panelMaster = new JPanelPad( 700, 60 );
	private JPanelPad panelAbas = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 1 ) );
	private JTabbedPanePad tabbedAbas = new JTabbedPanePad();
	private JPanelPad panelSouth = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );	
	private JPanelPad panelLegenda = new JPanelPad();	
	private JPanelPad panelNavegador = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 1 ) );
	private JPanelPad panelFiltros = new JPanelPad("Filtros", Color.BLUE);
	
	// *** Paineis Detalhamento
	
	private JPanelPad panelDet = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );		
	private JPanelPad panelTabDet = new JPanelPad( 700, 0 );
	private JPanelPad panelGridDet = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 1 ) );
	private JPanelPad panelTabDetItens = new JPanelPad( JPanelPad.TP_JPANEL, new GridLayout( 1, 1 ) );
	private Tabela tabDet = null;
	
	// *** Labels
	
	private JLabelPad sepdet = new JLabelPad();
		
	// *** Geral

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	// *** Campos

//	private JTextFieldFK txtDescProd = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	// ** Checkbox
	
	private JCheckBoxPad cbEtapa1 =  new JCheckBoxPad( "Pesagem 1", "S", "N" );
	private JCheckBoxPad cbEtapa2 =  new JCheckBoxPad( "Descarregamento/Renda", "S", "N" );
	private JCheckBoxPad cbEtapa3 =  new JCheckBoxPad( "Pesagem 2", "S", "N" );
	
	// ** Legenda
	
	private ImageIcon imgPesagem1 = Icone.novo( "blAzul1_18x18.png" );
	private ImageIcon imgDescarregamento = Icone.novo( "blAzul2_18x18.png" );
	private ImageIcon imgPesagem2 = Icone.novo( "blAzul3_18x18.png" );
	private ImageIcon imgColuna = null;
	
	// *** Listacampos

//	private ListaCampos lcCliente = new ListaCampos( this, "CL" );
//	private ListaCampos lcProd = new ListaCampos( this );

	// *** Bot�es
	private JButtonPad btRecarregar = new JButtonPad( "Recarregar", Icone.novo( "btExecuta.gif" ) );
	private JButtonPad btNovo = new JButtonPad( Icone.novo( "btNovo.gif" ) );	
	private JButtonPad btExcluir = new JButtonPad( Icone.novo( "btExcluir.gif" ) );
	private JButtonPad btEditar = new JButtonPad( Icone.novo( "btEditar.gif" ) );
		
	// Enums
	
	private enum DETALHAMENTO {
		STATUS, TICKET, DATA, HORA, PLACA, CODTRANSP, RAZTRANSP; 
	}
	
	public FPainelRecepcao() {
		
		super( false );
		
		setTitulo( "Painel de recep��o de mat�ria prima", this.getClass().getName() );
		setAtribos( 20, 20, 740, 400 );
		
    	int x = (int) (Aplicativo.telaPrincipal.dpArea.getSize().getWidth()-getWidth())/2;
    	int y = (int) (Aplicativo.telaPrincipal.dpArea.getSize().getHeight()-getHeight())/2;
    	
    	setLocation( x, y );
		
		montaListaCampos();
		criaTabelas();
		montaTela();				
		montaListeners();
		carregaValoresPadrao();
	
	}

	private void carregaValoresPadrao() {
		cbEtapa1.setVlrString( "S" );
	}
	
	private void montaListaCampos() {
		
//		lcProd.add( new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, false ) );
//		lcProd.add( new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false ) );
//		lcProd.setWhereAdic( "TIPOPROD='F'" );
//		txtCodProd.setTabelaExterna( lcProd );		
//		txtCodProd.setNomeCampo( "CodProd" );
//		txtCodProd.setFK( true );
//		lcProd.setReadOnly( true );
//		lcProd.montaSql( false, "PRODUTO", "EQ" );
		
//		lcCliente.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
//		lcCliente.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
//		txtCodCli.setTabelaExterna( lcCliente );
//		txtCodCli.setNomeCampo( "CodCli" );
//		txtCodCli.setFK( true );
//		lcCliente.setReadOnly( true );
//		lcCliente.montaSql( false, "CLIENTE", "VD" );	

	}
	
	private void montaListeners() {
		
		btRecarregar.addActionListener( this );
		btNovo.addActionListener( this );
		btExcluir.addActionListener( this );
		btEditar.addActionListener( this );
	
//		lcProd.addCarregaListener( this );
//		lcCliente.addCarregaListener( this );
		
		tabDet.addTabelaSelListener( this );	
		tabDet.addMouseListener( this );	
		
	}

	private void montaTela() {
		
		getTela().add( panelGeral, BorderLayout.CENTER );
		panelGeral.add( panelMaster, BorderLayout.NORTH );
		
		// ***** Cabe�alho
		
		panelFiltros.adic( cbEtapa1, 2, 0, 90, 20 );
		panelFiltros.adic( cbEtapa2, 105, 0, 180, 20 );
		panelFiltros.adic( cbEtapa3, 285, 0, 90, 20 );
		
		panelMaster.adic( panelFiltros, 4, 0, 390, 52 );

		panelMaster.adic( btRecarregar, 595, 8, 123, 42 );
		
//		***** Abas
		
		panelGeral.add( panelAbas, BorderLayout.CENTER );
		panelGeral.add( panelAbas);
		panelAbas.add( tabbedAbas );
		
		tabbedAbas.addTab( "Detalhamento", panelDet );
		
		tabbedAbas.addChangeListener( this );
		
		
		// ***** Detalhamento
		
		panelDet.add( panelTabDet, BorderLayout.NORTH );
		panelDet.add( panelGridDet, BorderLayout.CENTER );		
		panelGridDet.add( panelTabDetItens );
		
		panelTabDetItens.add( new JScrollPane( tabDet ) );
		
		// ***** Rodap�
		
		Color statusColor = new Color( 111, 106, 177 );
		Font statusFont = SwingParams.getFontpadmed(); 
		
		JLabelPad labelPesagem1 = new JLabelPad( "Pesagem 1" );
		labelPesagem1.setForeground( statusColor );
		labelPesagem1.setFont( statusFont );
		panelLegenda.adic( new JLabelPad( imgPesagem1 ), 60, 5, 18, 18 );
		panelLegenda.adic( labelPesagem1, 84, 7, 80, 15 );
		
		JLabelPad labelDescarregamento = new JLabelPad( "Descarregamento" );
		labelDescarregamento.setForeground( statusColor );
		labelDescarregamento.setFont( statusFont );
		panelLegenda.adic( new JLabelPad( imgDescarregamento ), 164, 5, 18, 18 );
		panelLegenda.adic( labelDescarregamento, 188, 7, 100, 15 );
		
		JLabelPad faturadas = new JLabelPad( "Pesagem 2" );
		faturadas.setForeground( statusColor );
		faturadas.setFont( statusFont );
		panelLegenda.adic( new JLabelPad( imgPesagem2 ), 294, 5, 18, 18 );		
		panelLegenda.adic( faturadas, 318, 7, 100, 15 );
		
		panelLegenda.setBorder( null );		
		
		panelGeral.add( panelSouth, BorderLayout.SOUTH );
		panelSouth.setBorder( BorderFactory.createEtchedBorder() );

		panelNavegador.add( btNovo );
		panelNavegador.add( btExcluir );
		panelNavegador.add( btEditar );
		
		panelSouth.add( panelNavegador, BorderLayout.WEST);
		panelSouth.add( panelLegenda, BorderLayout.CENTER );		
		panelSouth.add( adicBotaoSair(), BorderLayout.EAST);
				
	}
	
	private void criaTabelas() {
		
		// Tabela de detalhamento
		
		tabDet = new Tabela();

		tabDet.adicColuna( "" );
		tabDet.adicColuna( "Ticket" );
		tabDet.adicColuna( "Data" );
		tabDet.adicColuna( "Hora" );
		tabDet.adicColuna( "Placa" );
		tabDet.adicColuna( "Cod.T." );
		tabDet.adicColuna( "Transportador" );
				
		tabDet.setTamColuna( 10, DETALHAMENTO.STATUS.ordinal() );
		tabDet.setTamColuna( 70, DETALHAMENTO.TICKET.ordinal() );
		tabDet.setTamColuna( 70, DETALHAMENTO.DATA.ordinal() );
		tabDet.setTamColuna( 70, DETALHAMENTO.HORA.ordinal() );
		tabDet.setTamColuna( 70, DETALHAMENTO.PLACA.ordinal() );
		tabDet.setTamColuna( 60, DETALHAMENTO.CODTRANSP.ordinal() );		
		tabDet.setTamColuna( 350, DETALHAMENTO.RAZTRANSP.ordinal() );

		
	}
	
	private void montaGrid() {
			
		try {

			StringBuilder sql = new StringBuilder();

			sql.append( "select ");
			sql.append( "rm.ticket, rm.dtins data, rm.hins hora, rm.placaveiculo, rm.codtran, tr.nometran ");			
			sql.append( "from eqrecmerc rm, vdtransp tr ");
			sql.append( "where tr.codemp=rm.codemptr and tr.codfilial=rm.codfilialtr and tr.codtran=rm.codtran ");
			sql.append( "and rm.codemp=? and rm.codfilial=? " );
			
			StringBuffer status = new StringBuffer("");

/*			
			if("S".equals(cbEtapa1.getVlrString())) {
				status.append( " 'PE' ");
			}
			if("S".equals(cbEtapa2.getVlrString())) {
				if ( status.length() > 0 ) {
					status.append( "," );
				}
				status.append( " 'EP' " );
			}
			if("S".equals(cbEtapa3.getVlrString())) {
				if ( status.length() > 0 ) {
					status.append( "," );
				}
				status.append( " 'PD' " );
			}

			if ( status.length() > 0 ) {
				sql.append( " and io.sitproditorc in (" );
				sql.append( status );
				sql.append( ") ");
			}
			else {
				sql.append( " and io.sitproditorc not in('PE','EP','PD') " );
			}
					 
	*/		
		
			System.out.println("SQL:" + sql.toString());
			
			PreparedStatement ps = con.prepareStatement( sql.toString() );
			
			int iparam = 1;
			
			ps.setInt( iparam++, Aplicativo.iCodEmp );
			ps.setInt( iparam++, ListaCampos.getMasterFilial( "EQRECMERC" ) );
			
			ResultSet rs = ps.executeQuery();		
			
			tabDet.limpa();
						
			int row = 0;
			
			while ( rs.next() ) {
				
				tabDet.adicLinha();
				
				
				if ( "PE".equals( rs.getString( "sitproditorc" ) ) ) {
					imgColuna = imgPesagem1;
				}
				else if ( "EP".equals( rs.getString( "sitproditorc" ) ) ) {
					imgColuna = imgDescarregamento;
				}
				else if ( "PD".equals( rs.getString( "sitproditorc" ) ) ) {
					imgColuna = imgPesagem2;
				}
											
				
				tabDet.setValor( imgColuna, row, DETALHAMENTO.STATUS.ordinal() );
				tabDet.setValor( Funcoes.dateToStrDate( rs.getDate( DETALHAMENTO.DATA.toString() ) ), row, DETALHAMENTO.DATA.ordinal() );
				tabDet.setValor( rs.getInt( DETALHAMENTO.HORA.toString().trim() ), row, DETALHAMENTO.HORA.ordinal() );
				tabDet.setValor( rs.getInt( DETALHAMENTO.PLACA.toString().trim() ), row, DETALHAMENTO.PLACA.ordinal() );				
				tabDet.setValor( Funcoes.dateToStrDate( rs.getDate( DETALHAMENTO.CODTRANSP.toString() ) ), row, DETALHAMENTO.CODTRANSP.ordinal() );
				tabDet.setValor( Funcoes.dateToStrDate( rs.getDate( DETALHAMENTO.RAZTRANSP.toString() ) ), row, DETALHAMENTO.RAZTRANSP.ordinal() );
				
				row++;
				
			}

			// Permitindo reordena��o
			
			if(row>0) {
				RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabDet.getModel());    
				tabDet.setRowSorter(sorter);				   
			}
			else {
				tabDet.setRowSorter( null );
			}
			
		} 
		catch ( Exception e ) {
			e.printStackTrace();
		}
		
	}
	
	public void actionPerformed( ActionEvent e ) {

		if ( e.getSource() == btRecarregar ) {
			montaGrid();
		}
		else if ( e.getSource() == btNovo ) {
			novoRecebimento();
		}
	}

	private void novoRecebimento() {
		
		FRecMerc recebimento = new FRecMerc();
		
		try {
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void valorAlterado( TabelaSelEvent e ) {
		/*		
		if ( e.getTabela() == tabOrcamentos && tabOrcamentos.getLinhaSel() > -1 && !carregandoOrcamentos ) {
			buscaItensVenda( (Integer)tabOrcamentos.getValor( tabOrcamentos.getLinhaSel(), VENDAS.CODVENDA.ordinal() ), "V" );
		}
		*/
	}

	public void mouseClicked( MouseEvent mevt ) {
		Tabela tabEv = (Tabela) mevt.getSource();
		
		if ( mevt.getClickCount() == 2 ) {					
			if( tabEv == tabDet && tabEv.getLinhaSel() > -1 ) {
				ImageIcon imgclicada = (ImageIcon) tabEv.getValor( tabEv.getLinhaSel(), DETALHAMENTO.STATUS.ordinal() );
				
				if(imgclicada.equals( imgPesagem1 )) {
					FOrcamento orc = null;    
					if ( Aplicativo.telaPrincipal.temTela( FOrcamento.class.getName() ) ) {
						orc = (FOrcamento) Aplicativo.telaPrincipal.getTela( FOrcamento.class.getName() );
					}
					else {
						orc = new FOrcamento();
						Aplicativo.telaPrincipal.criatela( "Or�amento", orc, con );
					}    	    		 
//					orc.exec( (Integer) tabEv.getValor( tabEv.getLinhaSel(), DETALHAMENTO.CODORC.ordinal() ) );
				}
				else {
//					FOP op = new FOP((Integer) tabDet.getValor( tabEv.getLinhaSel(), DETALHAMENTO.CODOP.ordinal() ), (Integer) tabDet.getValor( tabEv.getLinhaSel(), DETALHAMENTO.SEQOP.ordinal() ));
	//				Aplicativo.telaPrincipal.criatela( "Ordens de produ��o", op, con );    	    		 
				}
			}
		}
				
	}

	public void mouseEntered( MouseEvent e ) { }

	public void mouseExited( MouseEvent e ) { }

	public void mousePressed( MouseEvent e ) { }

	public void mouseReleased( MouseEvent e ) { }

	public void keyPressed( KeyEvent e ) {
		
		if ( e.getSource() == btRecarregar && e.getKeyCode() == KeyEvent.VK_ENTER ) {
			btRecarregar.doClick();
		}
	}

	public void keyReleased( KeyEvent e ) { }

	public void keyTyped( KeyEvent e ) { }

	public void beforeCarrega( CarregaEvent e ) { }

	public void afterCarrega( CarregaEvent e ) {

//		if ( lcProd == e.getListaCampos() || lcCliente == e.getListaCampos() ) {
			montaGrid();
//		}
		
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
//		lcCliente.setConexao( con );
//		lcProd.setConexao( con );
		
	}

	public void valorAlterado( TabelaEditEvent evt ) {

		// TODO Auto-generated method stub
		
	}
	
	private void selectAll(Tabela tab) {
		for ( int i = 0; i < tab.getNumLinhas(); i++ ) {
			tab.setValor( new Boolean( true ), i, 0 );
		}
	}
	
	private void limpaNaoSelecionados(Tabela tab) {
		int linhas = tab.getNumLinhas();
		int pos = 0;
		try {			
			for ( int i = 0; i < linhas; i++ ) {
				if ( tab.getValor( i, 0 )!=null && ! ( (Boolean) tab.getValor( i, 0 ) ).booleanValue() ) { //xxx
					tab.tiraLinha( i );
					i--;
				}					
			}									
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void stateChanged( ChangeEvent cevt ) {

		if ( cevt.getSource() == tabbedAbas ) {
			if ( tabbedAbas.getSelectedIndex() == 1 ) {
//				geraTabTemp();	
			}
		}
	}
	
	
	
}


/**
 * @version 8/02/2007 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues<BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.fnc <BR>
 * Classe:
 * @(#)FPrefereFBB.java <BR>
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
 * Tela de preferencias para Febraban
 * 
 */

package org.freedom.modulos.fnc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.PostEvent;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.Tabela;
import org.freedom.telas.FTabDados;

public class FPrefereFBB extends FTabDados implements CarregaListener {

	private static final long serialVersionUID = 1L;
	
	private final JPanelPad panelGeral = new JPanelPad();
	
	private final JPanelPad panelSiacc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private final JPanelPad panelTabSiacc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private final JPanelPad panelCamposSiacc = new JPanelPad();
	
	private final JPanelPad panelNavSiacc = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private final JPanelPad panelCnab = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private final JPanelPad panelTabCnab = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );
	
	private final JPanelPad panelCamposCnab = new JPanelPad();
	
	private final JPanelPad panelNavCnab = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private final JTextFieldPad txtNomeEmp = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );
	
	private final JTextFieldPad txtTipoSiacc = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private final JTextFieldPad txtCodBancoSiacc = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private final JTextFieldFK txtNomeBancoSiacc = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private final JTextFieldPad txtCodConvSiacc = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );
	
	private final JTextFieldPad txtVersaoSiacc = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private final JTextFieldPad txtIdentServSiacc = new JTextFieldPad( JTextFieldPad.TP_STRING, 17, 0 );
	
	private final JTextFieldPad txtContaComprSiacc = new JTextFieldPad( JTextFieldPad.TP_STRING, 16, 0 );
		
	private final JTextFieldPad txtNroSeqSiacc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JRadioGroup rgIdentAmbCliSiacc;
	
	private JRadioGroup rgIdentAmbBcoSiacc;
	
	private final JTextFieldPad txtTipoCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private final JTextFieldPad txtCodBancoCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 4, 0 );

	private final JTextFieldFK txtNomeBancoCnab = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private final JTextFieldPad txtCodConvCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 20, 0 );
	
	private final JTextFieldPad txtVersaoCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );
	
	private final JTextFieldPad txtIdentServCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 17, 0 );
	
	private final JTextFieldPad txtContaComprCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 16, 0 );
		
	private final JTextFieldPad txtNroSeqCnab = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private final JTextFieldPad txtAgenciaCnab = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );
	
	private final JTextFieldPad txtDigAgenciaCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private final JTextFieldPad txtContaCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 12, 0 );
	
	private final JTextFieldPad txtDigContaCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private final JTextFieldPad txtDigAgContaCnab = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );
	
	private JRadioGroup rgIdentAmbCliCnab;
	
	private JRadioGroup rgIdentAmbBcoCnab;

	private final ListaCampos lcSiacc = new ListaCampos( this, "BO" );

	private final ListaCampos lcCnab = new ListaCampos( this, "BO" );

	private final ListaCampos lcBancoSiacc = new ListaCampos( this, "BO" );

	private final ListaCampos lcBancoCnab = new ListaCampos( this, "BO" );
	
	private final Navegador nvSiacc = new Navegador( true );
	
	private final Navegador nvCnab = new Navegador( true );
	
	private final Tabela tabSiacc = new Tabela();
	
	private final Tabela tabCnab = new Tabela();
	
	private static final String TP_SIACC = "01";
	
	private static final String TP_CNAB = "02";

	public FPrefereFBB() {

		setTitulo( "Prefer�ncias Gerais" );
		setAtribos( 50, 50, 400, 470 );
		
		montaRadioGrupos();
		montaListaCampos();
		montaTela();
		
		lcSiacc.montaTab();
		lcCnab.montaTab();
		
		tabSiacc.setTamColuna( 40, 0 );
		tabSiacc.setTamColuna( 80, 1 );
		tabSiacc.setTamColuna( 150, 2 );
		tabSiacc.setTamColuna( 50, 3 );
		
		tabCnab.setTamColuna( 40, 0 );
		tabCnab.setTamColuna( 80, 1 );
		tabCnab.setTamColuna( 150, 2 );
		tabCnab.setTamColuna( 50, 3 );
		
		txtTipoSiacc.setVlrString( TP_SIACC );
		txtTipoCnab.setVlrString( TP_CNAB );
		
		lcCnab.addPostListener( this );
		lcSiacc.addPostListener( this );
		
		lcCampos.addCarregaListener( this );
		lcCnab.addCarregaListener( this );
		lcSiacc.addCarregaListener( this );
	}
	
	private void montaRadioGrupos() {
		
		Vector<String> vLabs0 = new Vector<String>();
		Vector<String> vVals0 = new Vector<String>();
		vLabs0.add( "Produ��o" );
		vLabs0.add( "Teste" );
		vVals0.add( "P" );
		vVals0.add( "T" );
		rgIdentAmbCliSiacc = new JRadioGroup( 2, 1, vLabs0, vVals0 );
		
		Vector<String> vLabs1 = new Vector<String>();
		Vector<String> vVals1 = new Vector<String>();
		vLabs1.add( "Produ��o" );
		vLabs1.add( "Teste" );
		vVals1.add( "P" );
		vVals1.add( "T" );
		rgIdentAmbBcoSiacc = new JRadioGroup( 2, 1, vLabs1, vVals1 );
		
		Vector<String> vLabs2 = new Vector<String>();
		Vector<String> vVals2 = new Vector<String>();
		vLabs2.add( "Produ��o" );
		vLabs2.add( "Teste" );
		vVals2.add( "P" );
		vVals2.add( "T" );
		rgIdentAmbCliCnab = new JRadioGroup( 2, 1, vLabs2, vVals2 );
		
		Vector<String> vLabs3 = new Vector<String>();
		Vector<String> vVals3 = new Vector<String>();
		vLabs3.add( "Produ��o" );
		vLabs3.add( "Teste" );
		vVals3.add( "P" );
		vVals3.add( "T" );
		rgIdentAmbBcoCnab = new JRadioGroup( 2, 1, vLabs3, vVals3 );
	}
	
	private void montaListaCampos() {


		/**********************
		 *   FNBANCO  SIACC   *
		 **********************/
		lcBancoSiacc.add( new GuardaCampo( txtCodBancoSiacc, "CodBanco", "C�d.banco", ListaCampos.DB_PK, true ) );
		lcBancoSiacc.add( new GuardaCampo( txtNomeBancoSiacc, "NomeBanco", "Nome do Banco", ListaCampos.DB_SI, false ) );
		lcBancoSiacc.setDinWhereAdic( " CODBANCO=#N ", txtCodBancoSiacc );
		lcBancoSiacc.montaSql( false, "BANCO", "FN" );
		lcBancoSiacc.setQueryCommit( false );
		lcBancoSiacc.setReadOnly( true );
		txtCodBancoSiacc.setTabelaExterna( lcBancoSiacc );
		
		lcSiacc.setMaster( lcCampos );
		lcSiacc.setTabela( tabSiacc );
		
		lcCampos.adicDetalhe( lcSiacc );
		
		/**********************
		 *    FNBANCO  CNAB   *
		 **********************/
		lcBancoCnab.add( new GuardaCampo( txtCodBancoCnab, "CodBanco", "C�d.banco", ListaCampos.DB_PK, true ) );
		lcBancoCnab.add( new GuardaCampo( txtNomeBancoCnab, "NomeBanco", "Nome do Banco", ListaCampos.DB_SI, false ) );
		lcBancoCnab.setDinWhereAdic( " CODBANCO=#N ", txtCodBancoCnab );
		lcBancoCnab.montaSql( false, "BANCO", "FN" );
		lcBancoCnab.setQueryCommit( false );
		lcBancoCnab.setReadOnly( true );
		txtCodBancoCnab.setTabelaExterna( lcBancoCnab );

		lcCnab.setMaster( lcCampos );
		lcCnab.setTabela( tabCnab );
		
		lcCampos.adicDetalhe( lcCnab );
	}
	
	private void montaTela() {

		/*****************
		 *     GERAL     *
		 *****************/
		
		lcCampos.setMensInserir( false );

		setPainel( panelGeral );
		adicTab( "Geral", panelGeral );
		adicCampo( txtNomeEmp, 7, 30, 250, 20, "NomeEmp", "Nome da empresa", ListaCampos.DB_SI, true );		
		
		nav.setAtivo( 0, false );
		lcCampos.setPodeExc( false );

		setListaCampos( false, "PREFERE6", "SG" );

		/*****************
		 *     SIACC     *
		 *****************/		
		setListaCampos( lcSiacc );
		setNavegador( nvSiacc );

		adicTab( "SIACC", panelSiacc );
		setPainel( panelCamposSiacc, panelSiacc );
		
		panelSiacc.add( panelTabSiacc, BorderLayout.NORTH );
		panelSiacc.add( panelCamposSiacc, BorderLayout.CENTER );
		panelSiacc.add( panelNavSiacc, BorderLayout.SOUTH );
		
		panelTabSiacc.setPreferredSize( new Dimension( 300, 100 ) );
		panelTabSiacc.setBorder( BorderFactory.createEtchedBorder() );
		panelTabSiacc.add( new JScrollPane( tabSiacc ), BorderLayout.CENTER );

		lcSiacc.add( new GuardaCampo( txtTipoSiacc, "TipoFebraban", "Tipo", ListaCampos.DB_PK, true ) );
		adicCampo( txtCodBancoSiacc, 7, 30, 100, 20, "CodBanco", "C�d.banco", ListaCampos.DB_PF, txtNomeBancoSiacc, true );
		adicDescFK( txtNomeBancoSiacc, 110, 30, 260, 20, "NomeBanco", "Nome do banco" );		
		adicCampo( txtCodConvSiacc, 7, 70, 140, 20, "CodConv", "Conv�nio", ListaCampos.DB_SI, false );
		adicCampo( txtVersaoSiacc, 150, 70, 100, 20, "VerLayout", "Vers�o", ListaCampos.DB_SI, false );
		adicCampo( txtIdentServSiacc, 253, 70, 117, 20, "IdentServ", "Ident. Servi�o", ListaCampos.DB_SI, false );
		adicCampo( txtContaComprSiacc, 7, 110, 240, 20, "ContaCompr", "Conta Compromisso", ListaCampos.DB_SI, false );
		adicCampo( txtNroSeqSiacc, 250, 110, 120, 20, "NroSeq", "Sequ�ncia", ListaCampos.DB_SI, false );
		adicDB( rgIdentAmbCliSiacc, 7, 160, 178, 60, "IdentAmbCli", "Ambiente do cliente", false );
		adicDB( rgIdentAmbBcoSiacc, 193, 160, 178, 60, "IdentAmbBco", "Ambiente do banco", false );
		setListaCampos( false, "ITPREFERE6", "SG" );
		lcSiacc.setWhereAdic( " TIPOFEBRABAN='01' " );
				
		panelNavSiacc.setPreferredSize( new Dimension( 300, 30 ) );
		panelNavSiacc.setBorder( BorderFactory.createEtchedBorder() );
		panelNavSiacc.add( nvSiacc, BorderLayout.WEST );
		
		
		/****************
		 *     CNAB     *
		 ****************/		
		setListaCampos( lcCnab );
		setNavegador( nvCnab );
		
		panelTabCnab.setPreferredSize( new Dimension( 300, 100 ) );
		panelTabCnab.setBorder( BorderFactory.createEtchedBorder() );
		panelTabCnab.add( new JScrollPane( tabCnab ), BorderLayout.CENTER );

		adicTab( "CNAB", panelCnab );
		setPainel( panelCamposCnab, panelCnab );
		
		panelCnab.add( panelTabCnab, BorderLayout.NORTH );
		panelCnab.add( panelCamposCnab, BorderLayout.CENTER );
		panelCnab.add( panelNavCnab, BorderLayout.SOUTH );

		lcCnab.add( new GuardaCampo( txtTipoCnab, "TipoFebraban", "Tipo", ListaCampos.DB_PK, true ) );
		adicCampo( txtCodBancoCnab, 7, 30, 100, 20, "CodBanco", "C�d.banco", ListaCampos.DB_PF, txtNomeBancoCnab, true );
		adicDescFK( txtNomeBancoCnab, 110, 30, 260, 20, "NomeBanco", "Nome do banco" );		
		adicCampo( txtCodConvCnab, 7, 70, 140, 20, "CodConv", "Conv�nio", ListaCampos.DB_SI, false );
		adicCampo( txtVersaoCnab, 150, 70, 50, 20, "VerLayout", "Vers�o", ListaCampos.DB_SI, false );
		adicCampo( txtIdentServCnab, 203, 70, 100, 20, "IdentServ", "Ident. Servi�o", ListaCampos.DB_SI, false );
		adicCampo( txtNroSeqCnab, 306, 70, 63, 20, "NroSeq", "Sequ�ncia", ListaCampos.DB_SI, false );
		//adicCampo( txtContaComprCnab, 7, 110, 240, 20, "ContaCompr", "Conta Compromisso", ListaCampos.DB_SI, false );
		
		adicCampo( txtAgenciaCnab, 7, 110, 60, 20, "Agencia", "Ag�ncia", ListaCampos.DB_SI, false );
		adicCampo( txtDigAgenciaCnab, 70, 110, 50, 20, "DigAgencia", "Dig.", ListaCampos.DB_SI, false );
		adicCampo( txtContaCnab, 123, 110, 110, 20, "NumConta", "Conta", ListaCampos.DB_SI, false );
		adicCampo( txtDigContaCnab, 236, 110, 50, 20, "DigConta", "Dig.", ListaCampos.DB_SI, false );
		adicCampo( txtDigAgContaCnab, 289, 110, 80, 20, "DigAgConta", "Dig. Ag/Conta", ListaCampos.DB_SI, false );
		
		//adicCampo( txtNroSeqCnab, 250, 110, 120, 20, "NroSeq", "Sequ�ncia", ListaCampos.DB_SI, false );
		adicDB( rgIdentAmbCliCnab, 7, 160, 178, 60, "IdentAmbCli", "Ambiente do cliente", false );
		adicDB( rgIdentAmbBcoCnab, 193, 160, 178, 60, "IdentAmbBco", "Ambiente do banco", false );
		setListaCampos( false, "ITPREFERE6", "SG" );
		lcCnab.setWhereAdic( " TIPOFEBRABAN='02' " );
		
		panelNavCnab.setPreferredSize( new Dimension( 300, 30 ) );
		panelNavCnab.setBorder( BorderFactory.createEtchedBorder() );
		panelNavCnab.add( nvCnab, BorderLayout.WEST );		
	}

	public void afterCarrega( CarregaEvent e ) { }

	public void beforeCarrega( CarregaEvent e ) {

		if ( e.getListaCampos() == lcCampos ) {

			txtTipoCnab.setVlrString( TP_CNAB );
			txtTipoSiacc.setVlrString( TP_SIACC );
		}
	}

	public void beforePost( PostEvent e ) {

		if ( e.getListaCampos() == lcSiacc ) {
			
			txtTipoSiacc.setVlrString( TP_SIACC );
		}
		else if ( e.getListaCampos() == lcCnab ) {
			
			txtTipoCnab.setVlrString( TP_CNAB );
		}
	}
	
	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		
		lcSiacc.setConexao( cn );
		lcCnab.setConexao( cn );
		lcBancoSiacc.setConexao( cn );
		lcBancoCnab.setConexao( cn );

		lcCampos.carregaDados();
	}
}

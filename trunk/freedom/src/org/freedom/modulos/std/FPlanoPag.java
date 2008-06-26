/**
 * @version 11/02/2002 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FPlanoPag.java <BR>
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
 * Cadastro de planos de pagamento.
 * 
 */

package org.freedom.modulos.std;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.acao.RadioGroupEvent;
import org.freedom.acao.RadioGroupListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.JPanelPad;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FDetalhe;

public class FPlanoPag extends FDetalhe implements CarregaListener, InsertListener, PostListener, RadioGroupListener {

	private static final long serialVersionUID = 1L;

	private JPanelPad pinCab = new JPanelPad();

	private JPanelPad pinDet = new JPanelPad();

	private JTextFieldPad txtCodPlanoPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtDescPlanoPag = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtNumParc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtNumItemPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 2, 0 );

	private JTextFieldPad txtPercItemPag = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 9, 5 );

	private JTextFieldPad txtDiasItemPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private JTextFieldPad txtDescItemPag = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtNumConta = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private JTextFieldFK txtDescConta = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodPlan = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private JTextFieldFK txtDescPlan = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodCC = new JTextFieldPad( JTextFieldPad.TP_STRING, 19, 0 );

	private JTextFieldPad txtAnoCC = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 4, 0 );

	private JTextFieldFK txtDescCC = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtCodTbJ = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
	 
	private JTextFieldFK txtDescTbJ = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
	
	private JTextFieldPad txtPercDesc = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 6, 2 );
	
	private JCheckBoxPad cbAtivo = null;
	
	private JCheckBoxPad cbSabado = null;
	
	private JCheckBoxPad cbDomingo = null;
	
	private JCheckBoxPad cbFeriado = null;
	
	private JRadioGroup<String, String> rgCV = null;
	
	private JRadioGroup<String, String> rgRegraVenc = null;
	
	private Vector<String> vLabsCV = new Vector<String>();

	private Vector<String> vValsCV = new Vector<String>();
	
	private Vector<String> vValsRegraVenc = new Vector<String>();

	private Vector<String> vLabsRebraVenc = new Vector<String>();

	private ListaCampos lcConta = new ListaCampos( this, "CA" );

	private ListaCampos lcPlan = new ListaCampos( this, "PN" );

	private ListaCampos lcCC = new ListaCampos( this, "CC" );
	
	private ListaCampos lcTabJuros = new ListaCampos( this, "TBJ"  );

	private JCheckBoxPad cbAutoBaixa = new JCheckBoxPad( "Gerar lan�amento financeiro j� quitado?", "S", "N" );

	private JCheckBoxPad cbApOrcPlanoPag = new JCheckBoxPad( "Or�amento aprovado por padr�o?", "S", "N" );

	public FPlanoPag() {

		setTitulo( "Cadastro de Planos de Pagamento" );
		setAtribos( 50, 50, 765, 480 );
		

		vValsCV.addElement( "C" );
		vValsCV.addElement( "V" );
		vValsCV.addElement( "A" );
		vLabsCV.addElement( "Compra" );
		vLabsCV.addElement( "Venda" );
		vLabsCV.addElement( "Ambos" );
		rgCV = new JRadioGroup<String, String>( 1, 3, vLabsCV, vValsCV );
		rgCV.setVlrString( "V" );
		
		vValsRegraVenc.addElement( "A" );
		vValsRegraVenc.addElement( "P" );
		vValsRegraVenc.addElement( "N" );
		vLabsRebraVenc.addElement( "Antecipar" );
		vLabsRebraVenc.addElement( "Prorrogar" );
		vLabsRebraVenc.addElement( "Nenhuma" );
		rgRegraVenc = new JRadioGroup<String, String>( 1, 3, vLabsRebraVenc, vValsRegraVenc );
		rgRegraVenc.setVlrString( "N" );
		
		cbAtivo = new JCheckBoxPad( "Ativo", "S", "N" );
		cbAtivo.setVlrString( "S" );
		
		cbSabado = new JCheckBoxPad( "Sabado", "S", "N" );
	
		cbDomingo = new JCheckBoxPad( "Domingo", "S", "N" );

		cbFeriado = new JCheckBoxPad( "Feriado", "S", "N" );
	
		
		lcConta.add( new GuardaCampo( txtNumConta, "NumConta", "N� Conta", ListaCampos.DB_PK, false ) );
		lcConta.add( new GuardaCampo( txtDescConta, "DescConta", "Descri��o da conta", ListaCampos.DB_SI, false ) );
		lcConta.montaSql( false, "CONTA", "FN" );
		lcConta.setQueryCommit( false );
		lcConta.setReadOnly( true );
		txtNumConta.setTabelaExterna( lcConta );

		lcPlan.add( new GuardaCampo( txtCodPlan, "CodPlan", "C�d.planj.", ListaCampos.DB_PK, false ) );
		lcPlan.add( new GuardaCampo( txtDescPlan, "DescPlan", "Descri��o do planejamento", ListaCampos.DB_SI, false ) );
		lcPlan.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlan.setQueryCommit( false );
		lcPlan.setReadOnly( true );
		txtCodPlan.setTabelaExterna( lcPlan );

		lcCC.add( new GuardaCampo( txtCodCC, "CodCC", "C�d.CC.", ListaCampos.DB_PK, false ) );
		lcCC.add( new GuardaCampo( txtDescCC, "DescCC", "Descri��o do Centro de custo", ListaCampos.DB_SI, false ) );
		lcCC.add( new GuardaCampo( txtAnoCC, "AnoCC", "Ano", ListaCampos.DB_PK, false ) );
		lcCC.setWhereAdic( "NIVELCC=10" );
		lcCC.montaSql( false, "CC", "FN" );
		lcCC.setQueryCommit( false );
		lcCC.setReadOnly( true );
		txtCodCC.setTabelaExterna( lcCC );
		
		lcTabJuros.add( new GuardaCampo( txtCodTbJ, "CodTbj", "C�d.tb.jur.", ListaCampos.DB_PK, false ) );
		lcTabJuros.add( new GuardaCampo( txtDescTbJ, "DescTbJ", "Descri��o da tabela de juros", ListaCampos.DB_SI, false ) );
		lcTabJuros.montaSql( false, "TBJUROS", "FN" );
		lcTabJuros.setQueryCommit( false );
		lcTabJuros.setReadOnly( true );
		txtCodTbJ.setTabelaExterna( lcTabJuros );
		

		setAltCab( 270 );
		pinCab = new JPanelPad();
		setListaCampos( lcCampos );
		setPainel( pinCab, pnCliCab );

		adicCampo( txtCodPlanoPag, 7, 20, 70, 20, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_PK, null, true );
		adicCampo( txtDescPlanoPag, 80, 20, 217, 20, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI, null, true );
		adicCampo( txtNumParc, 300, 20, 67, 20, "ParcPlanoPag", "N� Parcs.", ListaCampos.DB_SI, null, true );
		adicCampo( txtNumConta, 370, 20, 97, 20, "NumConta", "N.Conta", ListaCampos.DB_FK, false );
		adicDescFK( txtDescConta, 470, 20, 267, 20, "DescConta", "Descri��o da conta" ); 
		adicCampo( txtCodPlan, 7, 60, 100, 20, "CodPlan", "C�d.planj.", ListaCampos.DB_FK, false );
		adicDescFK( txtDescPlan, 110, 60, 257, 20, "DescPlan", "Descri��o do planejamento" );
		adicCampo( txtCodCC, 370, 60, 97, 20, "CodCC", "Centro de custo", ListaCampos.DB_FK, false );
		adicDescFK( txtDescCC, 470, 60, 267, 20, "DescCC", "Descri��o do centro de custo" );
		adicCampoInvisivel( txtAnoCC, "AnoCC", "Ano.C.C.", ListaCampos.DB_SI, false );
		adicCampo( txtCodTbJ, 7, 100, 70, 20,"CodTbJ","C�d.tb.juros", ListaCampos.DB_FK, false );
		adicDescFK( txtDescTbJ, 80, 100, 217, 20, "DescTbJ", "Descri��o da tabela de juros" );
		adicCampo( txtPercDesc, 300, 100, 70, 20, "PercDesc", "% Desconto", ListaCampos.DB_SI, false );
		adicDB( rgRegraVenc, 375, 100, 363, 37, "RegrVctoPlanoPag", "Regra de vencimento:", true );
		adicDB( rgCV, 7, 140, 363, 37, "CVPlanoPag", "Cadastro para:", true );
		adicDB( cbApOrcPlanoPag, 7, 180, 250, 20, "ApOrcPlanoPag", "", true ); 
		adicDB( cbAtivo, 7, 200, 250, 20, "AtivoPlanoPag", "", true ); 
		adicDB( cbSabado, 375, 140, 250, 20, "RvSabPlanoPag", "", true ); 
		adicDB( cbDomingo, 375, 160, 250, 20, "RvDomPlanoPag", "", true ); 
		adicDB( cbFeriado, 375, 180, 250, 20, "RvFerPlanoPag", "", true ); 
		
		
		setListaCampos( true, "PLANOPAG", "FN" );
		lcCampos.setQueryInsert( true );

		setAltDet( 60 );
		pinDet = new JPanelPad( 440, 50 );
		setPainel( pinDet, pnDet );
		setListaCampos( lcDet );
		setNavegador( navRod );

		adicCampo( txtNumItemPag, 7, 20, 60, 20, "NroParcPag", "Item", ListaCampos.DB_PK, true );
		adicCampo( txtPercItemPag, 70, 20, 97, 20, "PercPag", "Percento", ListaCampos.DB_SI, true );
		adicCampo( txtDiasItemPag, 170, 20, 57, 20, "DiasPag", "Dias", ListaCampos.DB_SI, false );
		adicCampo( txtDescItemPag, 230, 20, 143, 20, "DescParcPag", "Descri��o", ListaCampos.DB_SI, false );
		adicDB( cbAutoBaixa, 380, 20, 300, 20, "AutoBaixaParc", "", false ); 

		setListaCampos( true, "PARCPAG", "FN" );
		lcDet.setQueryInsert( false );

		navRod.setAtivo( 4, false );
		navRod.setAtivo( 5, false );
		montaTab();
		lcCC.addCarregaListener( this );
		lcCampos.addCarregaListener( this );
		lcCampos.addInsertListener( this );
		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );
		rgRegraVenc.addRadioGroupListener( this );
		setImprimir( true );
	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp ) {
			imprimir( true );
		}
		else if ( evt.getSource() == btImp )
			imprimir( false );
		super.actionPerformed( evt );
	}

	private int buscaAnoBaseCC() {

		int iRet = 0;
		String sSQL = "SELECT ANOCENTROCUSTO FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
		try {
			PreparedStatement ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			ResultSet rs = ps.executeQuery();
			if ( rs.next() )
				iRet = rs.getInt( "ANOCENTROCUSTO" );
			rs.close();
			ps.close();
		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro ao buscar o ano-base para o centro de custo.\n" + err.getMessage(), true, con, err );
		}
		return iRet;
	}

	private void imprimir( boolean bVisualizar ) {

		ImprimeOS imp = new ImprimeOS( "", con );
		int linPag = imp.verifLinPag() - 1;
		imp.montaCab();
		imp.setTitulo( "Relat�rio de Planos de Pagamento" );
		DLRPlanoPag dl = new DLRPlanoPag();
		dl.setVisible( true );
		if ( dl.OK == false ) {
			dl.dispose();
			return;
		}
		String sSQL = "SELECT PLANO.CODPLANOPAG,PLANO.DESCPLANOPAG,PLANO.PARCPLANOPAG," + 
			"PARC.NROPARCPAG,PARC.PERCPAG,PARC.DIASPAG " + 
			"FROM FNPLANOPAG PLANO,FNPARCPAG PARC " + 
			"WHERE PARC.CODPLANOPAG=PLANO.CODPLANOPAG " + 
			"ORDER BY " + dl.getValor();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sCodMaster = "";
		try {
			ps = con.prepareStatement( sSQL );
			rs = ps.executeQuery();
			imp.limpaPags();
			sCodMaster = "";
			while ( rs.next() ) {
				if ( imp.pRow() == 0 ) {
					imp.impCab( 80, false );
					imp.say( imp.pRow() + 0, 0, "" + imp.normal() );
					imp.say( imp.pRow() + 0, 0, "" );
					imp.say( imp.pRow() + 0, 2, "C�digo" );
					imp.say( imp.pRow() + 0, 20, "Descri��o" );
					imp.say( imp.pRow() + 0, 70, "N. Parcel." );
					imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
					imp.say( imp.pRow() + 0, 0, Funcoes.replicate( "*", 80 ) );
				}

				if ( !rs.getString( "CodPlanoPag" ).equals( sCodMaster ) ) {
					if ( sCodMaster.trim().length() != 0 ) {
						imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
						imp.say( imp.pRow() + 0, 0, Funcoes.replicate( "*", 80 ) );
					}
					imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
					imp.say( imp.pRow() + 0, 2, rs.getString( "CodPlanoPag" ) );
					imp.say( imp.pRow() + 0, 20, rs.getString( "DescPlanoPag" ) );
					imp.say( imp.pRow() + 0, 70, rs.getString( "ParcPlanoPag" ) );
					imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
					imp.say( imp.pRow() + 0, 0, Funcoes.replicate( "-", 80 ) );
					imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
					imp.say( imp.pRow() + 0, 10, "Item" );
					imp.say( imp.pRow() + 0, 35, "Perc." );
					imp.say( imp.pRow() + 0, 60, "Dias" );
					imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
					imp.say( imp.pRow() + 0, 0, Funcoes.replicate( "-", 80 ) );
				}

				imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
				imp.say( imp.pRow() + 0, 10, rs.getString( "NroParcPag" ) );
				imp.say( imp.pRow() + 0, 35, rs.getString( "PercPag" ) );
				imp.say( imp.pRow() + 0, 60, rs.getString( "DiasPag" ) );

				if ( imp.pRow() >= linPag ) {
					imp.incPags();
					imp.eject();
				}

				sCodMaster = rs.getString( "CodPlanoPag" );

			}

			imp.say( imp.pRow() + 1, 0, "" + imp.normal() );
			imp.say( imp.pRow() + 0, 0, Funcoes.replicate( "=", 80 ) );
			imp.eject();

			imp.fechaGravacao();

			// rs.close();
			// ps.close();
			if ( !con.getAutoCommit() )
				con.commit();
			dl.dispose();
		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro consulta tabela de Almoxarifados!\n" + err.getMessage(), true, con, err );
		}

		if ( bVisualizar ) {
			imp.preview( this );
		}
		else {
			imp.print();
		}
	}

	public void beforeInsert( InsertEvent ievt ) {

	}

	public void beforePost( PostEvent pevt ) {

		if ( pevt.getListaCampos() == lcCampos ) {
			if ( cbAutoBaixa.getVlrString().equals( "S" ) && ( txtNumConta.getVlrString().equals( "" ) || txtCodPlan.getVlrString().equals( "" ) ) ) {
				Funcoes.mensagemInforma( this, "Para quitar os pagamentos � necess�rio um 'N.Conta' e um 'C�d. Planejamento'!" );
				pevt.cancela();
			}
		}
	}

	public void beforeCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcCC && txtAnoCC.getVlrInteger().intValue() == 0 ) {
			txtAnoCC.setVlrInteger( new Integer( buscaAnoBaseCC() ) );
		}
	}

	public void afterCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcCampos && cevt.ok ){
			txtNumParc.setEditable( false );
		}
		if( "N".equals( rgRegraVenc.getVlrString())){
			cbSabado.setEnabled( false );
			cbDomingo.setEnabled( false );
			cbFeriado.setEnabled( false );
		}else{
			cbSabado.setEnabled( true );
			cbDomingo.setEnabled( true );
			cbFeriado.setEnabled( true );
		}
	}

	public void afterInsert( InsertEvent ievt ) {

		if( ievt.getListaCampos() == lcCampos ){
			txtNumParc.setEditable( true );
			rgRegraVenc.setVlrString( "N" );
		}
	}

	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		lcConta.setConexao( cn );
		lcPlan.setConexao( cn );
		lcCC.setConexao( cn );
		lcTabJuros.setConexao( cn );
	}

	public void valorAlterado( RadioGroupEvent evt ) {

		if( evt.getSource() == rgRegraVenc  ){
			
			if( "N".equals( rgRegraVenc.getVlrString())){
				cbSabado.setEnabled( false );
				cbDomingo.setEnabled( false );
				cbFeriado.setEnabled( false );
			}else{
				cbSabado.setEnabled( true );
				cbDomingo.setEnabled( true );
				cbFeriado.setEnabled( true );
			}
		}
		
	}

}

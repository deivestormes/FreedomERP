/**
 * @version 28/08/2012 <BR>
 * @author Setpoint Inform�tica Ltda./S�rgio Murilo Macedo<BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.std.view.frame.crud.detail <BR>
 *         Classe: @(#)FCalcCusto.java <BR>
 * 
 *         Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 *         modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 *         na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 *         Este programa � distribuido na esperan�a que possa ser util, mas SEM NENHUMA GARANTIA; <BR>
 *         sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 *         Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 *         Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *         escreva para a Funda��o do Software Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA <BR>
 * <BR>
 * 
 *         Cadastro de custo f�rmula para custo de aquisi��o.
 * 
 */

package org.freedom.modulos.std.view.frame.crud.detail;

import java.util.Vector;

import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JComboBoxPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.FDetalhe;
import org.freedom.modulos.gms.view.frame.crud.tabbed.FProduto;
import org.freedom.modulos.std.view.dialog.utility.DLBuscaProd;

public class FCalcCusto extends FDetalhe {

	private static final long serialVersionUID = 1L;

	private JPanelPad pinCab = new JPanelPad();

	private JPanelPad pinDet = new JPanelPad();

	private JTextFieldPad txtCodCalc = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtDescCalc = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );
	
	private Vector<String> vValsSigla = new Vector<String>();

	private Vector<String> vLabsSigla = new Vector<String>();
	
	private JComboBoxPad cbSiglaCalc = new JComboBoxPad( vLabsSigla, vValsSigla, JComboBoxPad.TP_STRING, 10, 0 );
	
	private Vector<String> vValsOperacao = new Vector<String>();

	private Vector<String> vLabsOperacao = new Vector<String>();
	
	private JComboBoxPad cbOperacaoCalc = new JComboBoxPad( vLabsOperacao, vValsOperacao, JComboBoxPad.TP_STRING, 1, 0 );

	public FCalcCusto() {

		setTitulo( "Custo de Aquisi��o" );
		setAtribos( 50, 20, 500, 400 );
		setAltCab( 90 );
		pinCab = new JPanelPad( 500, 80 );
		setListaCampos( lcCampos );
		setPainel( pinCab, pnCliCab );
		
		adicCampo( txtCodCalc, 7, 20, 70, 20, "CodCalc", "C�d.calc", ListaCampos.DB_PK, true );
		adicCampo( txtDescCalc, 80, 20, 250, 20, "DescCalc", "Descri��o do custo de aquisi��o", ListaCampos.DB_SI, true );
		
		setListaCampos( true, "CALCCUSTO", "LF" );
		setAltDet( 80 );
		pinDet = new JPanelPad( 500, 80 );
		setPainel( pinDet, pnDet );
		setListaCampos( lcDet );
		setNavegador( navRod );

		vValsSigla.addElement( "Teste" );
		vLabsSigla.addElement( "<N�o Selecionado>" );
		cbSiglaCalc.setItensGeneric( vLabsSigla, vValsSigla );
		
		vValsOperacao.addElement(  "T" );
		vLabsOperacao.addElement( "<N�o Selecionado>" );
		cbOperacaoCalc.setItensGeneric( vLabsOperacao, vValsOperacao );
		
		adicDB( cbSiglaCalc, 7, 20, 120, 20, "SiglaCalc", "Sigla", false );
		adicDB( cbOperacaoCalc, 140, 20, 200, 20, "OperacaoCalc", "Opera��o", false );
		
	/*	adicCampo( txtCodItModG, 7, 20, 70, 20, "CodItModG", "Item", ListaCampos.DB_PK, true );
		adicCampo( txtCodVarG, 80, 20, 77, 20, "CodVarG", "C�d.var.g.", ListaCampos.DB_FK, true );
		adicDescFK( txtDescVarG, 160, 20, 197, 20, "DescVarG", "Descri��o da variante" );
		adicCampo( txtDescItModG, 360, 20, 200, 20, "DescItModG", "Descri��o", ListaCampos.DB_SI, true );
		adicCampo( txtRefItModG, 7, 60, 87, 20, "RefItModG", "Ref.inicial", ListaCampos.DB_SI, true );
		adicCampo( txtCodFabItModG, 100, 60, 87, 20, "CodFabItModG", "C�d.fab.inic.", ListaCampos.DB_SI, true );
		adicCampo( txtCodBarItModG, 190, 60, 100, 20, "CodBarItModG", "C�d.bar.inic.", ListaCampos.DB_SI, true );*/
		setListaCampos( true, "ITCALCCUSTO", "LF" );
		montaTab();
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		//lcProd.setConexao( cn );
		//lcVarG.setConexao( cn );
		//txtCodProd.setBuscaAdic( new DLBuscaProd( con, "CODPROD", lcProd.getWhereAdic() ) );
	}
}

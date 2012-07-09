/**
 * @version 06/07/2012 <BR>
 * @author Setpoint Inform�tica Ltda./Bruno Nascimento <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.crm <BR>
 *         Classe: @(#)FModContr.java <BR>
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
 *         Tela de cadastro do Modelo de Contrato.
 * 
 */

package org.freedom.modulos.crm.view.frame.crud.plain;

import java.util.Vector;

import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JRadioGroup;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.FDados;
import org.freedom.modulos.fnc.view.frame.crud.plain.FBanco;

public class FModContr extends FDados {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtCodModContr= new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldPad txtCodBanco = new JTextFieldPad( JTextFieldPad.TP_STRING, 3, 0 );

	private JTextFieldFK txtNomeBanco = new JTextFieldFK( JTextFieldFK.TP_STRING, 50, 0 );
	
	private JTextFieldPad txtDescModContr = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );
	
	private JTextFieldPad txtLayoutModContr = new JTextFieldPad( JTextFieldPad.TP_STRING, 100, 0 );	
	
	private JRadioGroup<String, String> rgTpModContr = null;
	
	
	private ListaCampos lcBanco = new ListaCampos( this, "BO" );
		
	public FModContr( ) {

		super();
		montaListaCampos();
		montaTela();

	}
	
	private void montaTela(){
		
		Vector<String> vTpModContrLab = new Vector<String>();
		Vector<String> vTpModControVal = new Vector<String>();

		vTpModContrLab.addElement( "SIACC" );
		vTpModContrLab.addElement( "OUTROS" );
		vTpModControVal.addElement( "S" );
		vTpModControVal.addElement( "O" );
		rgTpModContr = new JRadioGroup<String, String>( 1, 2, vTpModContrLab, vTpModControVal );

		setTitulo( "Modelo do Contrato" );
		setAtribos( 50, 50, 500, 300 );
		
		adicCampo( txtCodModContr, 7, 20, 100, 20, "CODMODCONTR", "Cod.Mod.Contr.", ListaCampos.DB_PK, true );		
		adicCampo( txtDescModContr, 110, 20, 350, 20, "DESCMODCONTR", "Descri��o do Modelo de Contrato", ListaCampos.DB_SI, true );
		adicCampo( txtLayoutModContr, 7, 63, 453, 20, "LAYOUTMODCONTR", "Layout do Modelo de Contrato", ListaCampos.DB_SI, true );
		adicCampo( txtCodBanco, 7, 103, 80, 20, "CODBANCO", "C�d.banco", ListaCampos.DB_FK, txtNomeBanco, false );
		adicDescFK( txtNomeBanco, 90, 103, 370, 20, "NOMEBANCO", "Nome do banco" );
		adicDB( rgTpModContr, 7, 143, 300, 30, "TPMODCONTR", "Tipo do modelo do contrato", false );
		
		setListaCampos( true, "MODCONTR", "VD" );
	
	}

	private void montaListaCampos() {	

		lcBanco.add( new GuardaCampo( txtCodBanco, "CodBanco", "C�d.banco", ListaCampos.DB_PK, false ) );
		lcBanco.add( new GuardaCampo( txtNomeBanco, "NomeBanco", "Nome do banco", ListaCampos.DB_SI, false ) );
		lcBanco.montaSql( false, "BANCO", "FN" );
		lcBanco.setQueryCommit( false );
		lcBanco.setReadOnly( true );
		txtCodBanco.setTabelaExterna( lcBanco, FBanco.class.getCanonicalName() );

	}
	
	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		lcBanco.setConexao( cn );
		
	}
}
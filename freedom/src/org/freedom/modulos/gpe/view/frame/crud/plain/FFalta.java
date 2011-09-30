/**
 * @version 30/09/2011 <BR>
 * @author Setpoint Inform�tica Ltda./Bruno Nascimento <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.gpe.view.frame.crud.plain <BR>
 *         Classe:
 * @(#)FFALTA.java <BR>
 * 
 *                Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 *                modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 *                na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 *                Este programa � distribuido na esperan�a que possa ser util, mas SEM NENHUMA GARANTIA; <BR>
 *                sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 *                Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 *                Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *                de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 *                Formul�rio para cadastro de Falta no sistema.
 * 
 */

package org.freedom.modulos.gpe.view.frame.crud.plain;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JCheckBoxPad;
import org.freedom.library.swing.component.JComboBoxPad;
import org.freedom.library.swing.component.JRadioGroup;
import org.freedom.library.swing.component.JTextAreaPad;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FDados;
import org.freedom.modulos.gpe.business.object.Batida;
import org.freedom.modulos.gpe.dao.DAOBatida;
import org.freedom.modulos.grh.view.frame.crud.plain.FTurnos;

public class FFalta extends FDados implements InsertListener, KeyListener {

	private static final long serialVersionUID = 1L;

	private final JTextFieldPad txtMatempr = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 6, 0 );
	
	private final JTextFieldFK txtNomeempr = new JTextFieldFK( JTextFieldFK.TP_STRING, 50, 0);
	
	private final JTextFieldPad txtDtFalta = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtHIniFalta = new JTextFieldPad( JTextFieldPad.TP_TIME, 5, 0 );

	private final JTextFieldPad txtHFinFalta = new JTextFieldPad( JTextFieldPad.TP_TIME, 5, 0 );
	
	private final JTextFieldPad txtHIniIntFalta = new JTextFieldPad( JTextFieldPad.TP_TIME, 5, 0 );
	
	private final JTextFieldPad txtHFinIntFalta = new JTextFieldPad( JTextFieldPad.TP_TIME, 5, 0 );
	
	//FK
	private final JTextFieldFK txtCodTurno = new JTextFieldFK( JTextFieldPad.TP_INTEGER, 10, 0 );

	private final JTextFieldFK txtDescTurno = new JTextFieldFK( JTextFieldPad.TP_STRING, 60, 0 );

	private final JTextFieldFK txtHIniTurno = new JTextFieldFK( JTextFieldPad.TP_TIME, 8, 0 );

	private final JTextFieldFK txtHFimTurno = new JTextFieldFK( JTextFieldPad.TP_TIME, 8, 0 );
	
	private JTextAreaPad txaJustificativa = new JTextAreaPad( 2000 );
	private JScrollPane scrol = new JScrollPane( txaJustificativa );
	
	private final Vector<String> labels = new Vector<String>();
	
	private final Vector<String> values = new Vector<String>();

	private JRadioGroup<String, String>  rgPeriodo = null;
	
	private final Vector<String> vLabsTipo = new Vector<String>();
	
	private final Vector<String> vValsTipo = new Vector<String>();

	private JRadioGroup<String, String> rgTipoFalta = null;
	
	private final ListaCampos lcEmpr = new ListaCampos(this, "EP");
	
	private final ListaCampos lcTurno = new ListaCampos(this);
	
	private DAOBatida daobatida = null; 
	
	public FFalta() {

		super();
		setTitulo( "Cadastro de Falta" );
		setAtribos( 50, 50, 600, 350 );
		
		montaListaCampos();

		montaTela();

		lcCampos.addInsertListener( this );
		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );
		txtHIniFalta.addKeyListener( this );

		setImprimir( true );
	}

	private void montaTela() {

		nav.setNavigation( false );
		txtCodTurno.setSoLeitura( true );
		txtDescTurno.setSoLeitura( true );
		txtHFimTurno.setSoLeitura( true );
		txtHIniTurno.setSoLeitura( true );
		
		labels.addElement( "Integral" );
		labels.addElement( "Meio" );
		values.addElement( "I" );
		values.addElement( "M" );
		rgPeriodo = new JRadioGroup<String, String>( 1, 2, labels, values );
		rgPeriodo.setEnabled( false );
		
		vLabsTipo.addElement( "Justificado" );
		vLabsTipo.addElement( "Injustificado" );
		vValsTipo.addElement("J");
		vValsTipo.addElement("I");
		rgTipoFalta = new JRadioGroup<String, String>( 1, 2,  vLabsTipo, vValsTipo );
		rgTipoFalta.setEnabled( false );
		
		adicCampo( txtDtFalta, 7, 20, 90, 20, "DtFalta", "Data Falta", ListaCampos.DB_FK, true );
		adicCampo( txtMatempr, 100, 20, 70, 20, "Matempr", "Matr�cula", ListaCampos.DB_PF, txtNomeempr, true );
		adicDescFK( txtNomeempr, 173, 20, 343, 20, "Nomeempr", "Nome" );
		
		adic( txtCodTurno, 7, 63, 90, 20 , "C�d.Turno", false);
		adic( txtDescTurno, 100, 63, 230, 20, "Descri��o do Turno", false);
		adic( txtHIniTurno, 333, 63, 90, 20, "In�cio Turno", false);
		adic( txtHFimTurno, 426, 63, 90, 20, "Final do Turno", false);
		
		adicDB( rgPeriodo, 7, 106, 250, 30, "Periodofalta", "Tipo de batida", false );
		adicDB( rgTipoFalta, 265,106, 250, 30, "TipoFalta", "Tipo de batida", false );
		
		adicCampo( txtHIniFalta, 7, 160, 100, 20, "HIniFalta", "Hor�rio de inicio", ListaCampos.DB_SI, true);
		adicCampo( txtHFinFalta, 143, 160, 100, 20, "HFinFalta", "Ini. Intervaldo", ListaCampos.DB_SI, true);
		adicCampo( txtHIniIntFalta, 276, 160, 100, 20, "HIniIntFalta", "Fin. Intervaldo", ListaCampos.DB_SI, true);
		adicCampo( txtHFinIntFalta, 409, 160, 100, 20, "HFinIntFalta", "Hor�rio Final", ListaCampos.DB_SI, true);
		
	
		adicDB(txaJustificativa, 7, 203, 509, 50, "Justiffalta", "Descri��o Detalhada da tarefa",  false);
		
		setListaCampos( true, "FALTA", "PE" );
		lcCampos.setQueryInsert( false );
		
		
		
	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp ) {
			imprimir( true );
		}
		else if ( evt.getSource() == btImp ) {
			imprimir( false );
		}

		super.actionPerformed( evt );
	}

	private void montaListaCampos() {
		lcEmpr.add( new GuardaCampo( txtMatempr, "Matempr", "Matr�cula", ListaCampos.DB_PK, true ) );
		lcEmpr.add( new GuardaCampo( txtNomeempr, "Nomeempr", "Nome", ListaCampos.DB_SI, false ) );
		lcEmpr.add( new GuardaCampo( txtCodTurno, "Codturno", "Turno", ListaCampos.DB_FK, false ) );
		lcEmpr.montaSql( false, "EMPREGADO", "RH" );
		lcEmpr.setQueryCommit( false );
		lcEmpr.setReadOnly( true );
		txtMatempr.setTabelaExterna( lcEmpr, FTurnos.class.getCanonicalName() );
		
		
		lcTurno.add( new GuardaCampo( txtCodTurno, "CodTurno", "C�d.Turno", ListaCampos.DB_PK, false ) );
		lcTurno.add( new GuardaCampo( txtDescTurno, "DescTurno", "Descri��o do Turno", ListaCampos.DB_SI, false ) );
		lcTurno.add( new GuardaCampo( txtHIniTurno, "HIniTurno", "In�cio Turno", ListaCampos.DB_SI, false ) );
		lcTurno.add( new GuardaCampo( txtHFimTurno, "HFimTurno", "Final do Turno", ListaCampos.DB_SI, false ) );
		lcTurno.montaSql( false, "TURNO", "RH" );
		lcTurno.setQueryCommit( false );
		lcTurno.setReadOnly( true );
		txtCodTurno.setTabelaExterna( lcTurno, FTurnos.class.getCanonicalName() );
		txtCodTurno.setFK( true );

		

	}
	private void imprimir( boolean bVisualizar ) {

	}

	public void afterInsert( InsertEvent ievt ) {

		if (ievt.getListaCampos()==lcCampos) {
			rgPeriodo.setVlrString( "I" );
			rgTipoFalta.setVlrString( "J" );
		}
		
	}

	public void beforeInsert( InsertEvent ievt ) {

	}
	
	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		
		lcEmpr.setConexao( cn );
		lcTurno.setConexao( cn );
		
	}
	public void keyPressed( KeyEvent kevt ) {
		/*
		if ( ( kevt.getKeyCode() == KeyEvent.VK_ENTER ) && ( kevt.getSource() == txtMatempr ) && (txtMatempr.getVlrInteger().intValue()>0 ) )  {
			if ( ( lcCampos.getStatus() == ListaCampos.LCS_INSERT ) || ( lcCampos.getStatus() == ListaCampos.LCS_EDIT )  ) {
				lcCampos.post();
				lcCampos.limpaCampos( true );
				txtDtFalta.requestFocus();
			}
		}
		*/
	}
	
	/*
	public Batida carregaPonto(String aftela) {
		
		Batida result = null;
		daobatida = new DAOBatida( con );
		try {
			daobatida.setPrefs( Aplicativo.iCodEmp, ListaCampos.getMasterFilial( "SGPREFERE3" ) );
			result = daobatida.carregaPonto(Aplicativo.iCodEmp, ListaCampos.getMasterFilial( "SGUSUARIO" ), Aplicativo.strUsuario, aftela);
		} catch ( SQLException e ) {
			Funcoes.mensagemErro( this, "Erro carregando prefer�ncias !\n" + e.getMessage() );
			e.printStackTrace();
		}
		return result;
	
	
	}
	*/
}

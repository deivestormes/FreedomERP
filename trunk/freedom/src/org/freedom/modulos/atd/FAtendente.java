/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.atd <BR>
 *         Classe: @(#)FAtendente.java <BR>
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *         de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 *         Coment�rios sobre a classe...
 * 
 */

package org.freedom.modulos.atd;

import java.awt.event.ActionEvent;
import org.freedom.infra.model.jdbc.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

import org.freedom.bmps.Icone;
import org.freedom.componentes.Endereco;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FDados;
import org.freedom.webservices.WSCep;

public class FAtendente extends FDados {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtCodAtend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtNomeAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtRgAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private JTextFieldPad txtCpfAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 11, 0 );

	private JTextFieldPad txtIdentificAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 18, 0 );

	private JTextFieldPad txtEndAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtNumAtend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtBairAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtCidAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private JTextFieldPad txtCepAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtFoneAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 12, 0 );

	private JTextFieldPad txtCelAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtFaxAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldPad txtUFAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	private JTextFieldPad txtEmailAtend = new JTextFieldPad( JTextFieldPad.TP_STRING, 60, 0 );

	private JTextFieldPad txtCodTipoAtend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescTipoAtend = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtIDUsu = new JTextFieldPad( JTextFieldPad.TP_STRING, 8, 0 );

	private JTextFieldFK txtNomeUsu = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescVend = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private ListaCampos lcTipoAtend = new ListaCampos( this, "TA" );
	
	private JTextFieldPad txtMatEmpr = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldFK txtNomeEmpr = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private ListaCampos lcUsu = new ListaCampos( this, "US" );

	private ListaCampos lcVend = new ListaCampos( this, "VE" );
	
	private ListaCampos lcEmpregado = new ListaCampos( this, "EP" );

	private JButton btBuscaEnd = new JButton( Icone.novo( "btBuscacep.gif" ) );

	private Map<String, Object> bPref = null;

	public FAtendente() {

		super();
		setTitulo( "Cadastro de Atendentes" );
		setAtribos( 50, 20, 490, 490 );

		lcTipoAtend.add( new GuardaCampo( txtCodTipoAtend, "CodTpAtend", "C�d.tp.atend.", ListaCampos.DB_PK, false ), "txtCodVendx" );
		lcTipoAtend.add( new GuardaCampo( txtDescTipoAtend, "DescTpAtend", "Descri�ao do tipo de atendente", ListaCampos.DB_SI, false ), "txtCodVendx" );
		lcTipoAtend.montaSql( false, "TIPOATEND", "AT" );
		lcTipoAtend.setQueryCommit( false );
		lcTipoAtend.setReadOnly( true );
		txtCodTipoAtend.setTabelaExterna( lcTipoAtend );

		lcVend.add( new GuardaCampo( txtCodVend, "CodVend", "C�d.comis.", ListaCampos.DB_PK, false ) );
		lcVend.add( new GuardaCampo( txtDescVend, "NomeVend", "Nome do comissionado", ListaCampos.DB_SI, false ) );
		lcVend.montaSql( false, "VENDEDOR", "VD" );
		lcVend.setQueryCommit( false );
		lcVend.setReadOnly( true );
		txtCodVend.setTabelaExterna( lcVend );

		lcUsu.add( new GuardaCampo( txtIDUsu, "IdUsu", "ID", ListaCampos.DB_PK, false ) );
		lcUsu.add( new GuardaCampo( txtNomeUsu, "NomeUsu", "Nome do usu�rio", ListaCampos.DB_SI, false ) );
		lcUsu.montaSql( false, "USUARIO", "SG" );
		lcUsu.setQueryCommit( false );
		lcUsu.setReadOnly( true );
		txtIDUsu.setTabelaExterna( lcUsu );
				
		lcEmpregado.add( new GuardaCampo( txtMatEmpr, "MatEmpr", "Matr�cula.", ListaCampos.DB_PK, false ) );
		lcEmpregado.add( new GuardaCampo( txtNomeEmpr, "NomeEmpr", "Nome do empregado", ListaCampos.DB_SI, false ) );
		lcEmpregado.montaSql( false, "EMPREGADO", "RH" );
		lcEmpregado.setQueryCommit( false );
		lcEmpregado.setReadOnly( true );
		txtMatEmpr.setTabelaExterna( lcEmpregado );


	}

	private void montaTela() {

		adicCampo( txtCodAtend, 7, 20, 80, 20, "CodAtend", "C�d.atend.", ListaCampos.DB_PK, true );
		adicCampo( txtNomeAtend, 90, 20, 370, 20, "NomeAtend", "Nome do atendente", ListaCampos.DB_SI, true );
		adicCampo( txtCpfAtend, 7, 60, 150, 20, "CpfAtend", "CPF", ListaCampos.DB_SI, false );
		adicCampo( txtIdentificAtend, 160, 60, 150, 20, "IdentificAtend", "Identifica��o", ListaCampos.DB_SI, false );
		adicCampo( txtRgAtend, 313, 60, 149, 20, "RgAtend", "RG", ListaCampos.DB_SI, false );
		adicCampo( txtCepAtend, 7, 100, 68, 20, "CepAtend", "Cep", ListaCampos.DB_SI, false );
		adic( btBuscaEnd, 78, 100, 20, 20 );
		adicCampo( txtEndAtend, 101, 100, 295, 20, "EndAtend", "Endere�o", ListaCampos.DB_SI, false );
		adicCampo( txtNumAtend, 398, 100, 65, 20, "NumAtend", "N�mero", ListaCampos.DB_SI, false );
		adicCampo( txtBairAtend, 7, 140, 195, 20, "BairAtend", "Bairro", ListaCampos.DB_SI, false );
		adicCampo( txtCidAtend, 205, 140, 195, 20, "CidAtend", "Cidade", ListaCampos.DB_SI, false );
		adicCampo( txtUFAtend, 403, 140, 59, 20, "UFAtend", "UF", ListaCampos.DB_SI, false );
		adicCampo( txtFoneAtend, 7, 180, 150, 20, "FoneAtend", "Telefone", ListaCampos.DB_SI, false );
		adicCampo( txtFaxAtend, 160, 180, 150, 20, "FaxAtend", "Fax", ListaCampos.DB_SI, false );
		adicCampo( txtCelAtend, 313, 180, 149, 20, "CelAtend", "Cel", ListaCampos.DB_SI, false );
		adicCampo( txtCodTipoAtend, 7, 220, 100, 20, "CodTpAtend", "C�d.tp.atend.", ListaCampos.DB_FK, txtDescTipoAtend, true );
		adicDescFK( txtDescTipoAtend, 110, 220, 352, 20, "DescTpAtend", "Descri��o do tipo de atendente" );
		adicCampo( txtIDUsu, 7, 260, 100, 20, "IdUsu", "ID", ListaCampos.DB_FK, txtNomeUsu, false );
		adicDescFK( txtNomeUsu, 110, 260, 352, 20, "NomeUsu", "Nome do usu�rio" );
		adicCampo( txtCodVend, 7, 300, 100, 20, "CodVend", "C�d.comis.", ListaCampos.DB_FK, txtDescVend, false );
		adicDescFK( txtDescVend, 110, 300, 352, 20, "NomeVend", "Nome do comissionado" );
		adicCampo( txtMatEmpr, 7, 340, 100, 20, "MatEmpr", "Matricula", ListaCampos.DB_FK, txtNomeEmpr, false );
		adicDescFK( txtNomeEmpr, 110, 340, 352, 20, "NomeEmpr", "Nome do empregado" );		
		adicCampo( txtEmailAtend, 7, 380, 455, 20, "EmailAtend", "E-Mail", ListaCampos.DB_SI, false );
		
		txtRgAtend.setMascara( JTextFieldPad.MC_RG );
		txtCepAtend.setMascara( JTextFieldPad.MC_CEP );
		txtFoneAtend.setMascara( JTextFieldPad.MC_FONEDDD );
		txtCelAtend.setMascara( JTextFieldPad.MC_FONE );
		txtFaxAtend.setMascara( JTextFieldPad.MC_FONE );
		setListaCampos( true, "ATENDENTE", "AT" );
		lcCampos.setQueryInsert( false );

		if ( (Boolean) bPref.get( "BUSCACEP" ) ) {
			btBuscaEnd.setEnabled( true );
		}
		else {
			btBuscaEnd.setEnabled( false );
		}

		btBuscaEnd.addActionListener( this );
		btBuscaEnd.setToolTipText( "Busca Endere�o a partir do CEP" );

	}

	private Map<String, Object> getPrefere() {

		Map<String, Object> retorno = new HashMap<String, Object>();
		StringBuilder sSQL = new StringBuilder();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			sSQL.append( "SELECT BUSCACEP " );
			sSQL.append( "FROM SGPREFERE1 P  " );
			sSQL.append( "WHERE P.CODEMP=? AND P.CODFILIAL=?" );

			try {

				ps = con.prepareStatement( sSQL.toString() );
				ps.setInt( 1, Aplicativo.iCodEmp );
				ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );

				rs = ps.executeQuery();

				if ( rs.next() ) {

					retorno.put( "BUSCACEP", new Boolean( "S".equals( rs.getString( "BUSCACEP" ) ) ) );
				}

				rs.close();
				ps.close();
				con.commit();
			} catch ( SQLException err ) {

				Funcoes.mensagemErro( this, "Erro ao verificar prefer�ncias!\n" + err.getMessage(), true, con, err );
				err.printStackTrace();
			}
		} finally {
			sSQL = null;
			ps = null;
			rs = null;
		}
		return retorno;
	}

	private void buscaEndereco() {

		if ( !"".equals( txtCepAtend.getVlrString() ) ) {

			txtEndAtend.setEnabled( false );
			// txtComplVend.setEnabled( false );
			txtBairAtend.setEnabled( false );
			txtCidAtend.setEnabled( false );
			txtUFAtend.setEnabled( false );
			// txtCodPais.setEnabled( false );
			// txtSiglaUF.setEnabled( false );
			// txtCodMun.setEnabled( false );
			// txtDDDFoneVend.setEnabled( false );
			// txtDDDFaxVend.setEnabled( false );
			// txtDDDCelVend.setEnabled( false );

			Thread th = new Thread( new Runnable() {

				public void run() {

					try {
						WSCep cep = new WSCep();
						cep.setCon( con );
						cep.setCep( txtCepAtend.getVlrString() );
						cep.busca();
						Endereco endereco = cep.getEndereco();

						txtEndAtend.setVlrString( endereco.getTipo() + " " + endereco.getLogradouro() );
						// txtComplVend.setVlrString( endereco.getComplemento() );
						txtBairAtend.setVlrString( endereco.getBairro() );
						txtCidAtend.setVlrString( endereco.getCidade() );
						txtUFAtend.setVlrString( endereco.getSiglauf() );
						// txtCodPais.setVlrInteger( endereco.getCodpais() );
						// txtSiglaUF.setVlrString( endereco.getSiglauf() );
						// txtCodMun.setVlrString( endereco.getCodmunic() );

						// lcPais.carregaDados();
						// lcUF.carregaDados();
						// lcMunic.carregaDados();

						txtNumAtend.requestFocus();
					} catch ( Exception e ) {
						Funcoes.mensagemInforma( null, "N�o foi encontrado o endere�o para o CEP informado!" );
					} finally {
						txtEndAtend.setEnabled( true );
						// txtComplAtend.setEnabled( true );
						txtBairAtend.setEnabled( true );
						txtCidAtend.setEnabled( true );
						txtUFAtend.setEnabled( true );
						// txtCodPais.setEnabled( true );
						// txtSiglaUF.setEnabled( true );
						// txtCodMun.setEnabled( true );
						// txtDDDFoneVend.setEnabled( true );
						// txtDDDFaxVend.setEnabled( true );
						// txtDDDCelVend.setEnabled( true );
					}
				}
			} );
			try {
				th.start();
			} catch ( Exception err ) {
				Funcoes.mensagemInforma( null, "N�o foi encontrado o endere�o para o CEP informado!" );
				txtCepAtend.requestFocus();
			}
		}
		else {
			Funcoes.mensagemInforma( null, "Digite um CEP para busca!" );
			txtCepAtend.requestFocus();
		}

	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btBuscaEnd ) {

			buscaEndereco();
		}
		super.actionPerformed( evt );
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		bPref = getPrefere();

		montaTela();

		lcTipoAtend.setConexao( cn );
		lcUsu.setConexao( cn );
		lcVend.setConexao( cn );
		lcEmpregado.setConexao( cn );
	}
}

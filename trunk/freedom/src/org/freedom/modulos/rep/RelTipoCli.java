/**
 * @version 03/2007 <BR>
 * @author Setpoint Inform�tica Ltda.<BR>
 * @author Alex Rodrigues<BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.rep <BR>
 * Classe:
 * @(#)RelTipoCli.java <BR>
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
 * Relatorio de tipo de cliente.
 * 
 */

package org.freedom.modulos.rep;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JLabel;

import net.sf.jasperreports.engine.JasperPrintManager;

import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrinterJob;
import org.freedom.telas.FRelatorio;

public class RelTipoCli extends FRelatorio {

	private static final long serialVersionUID = 1;
	
	private JRadioGroup rgOrdem;

	public RelTipoCli() {

		super();
		setTitulo( "Relatorio de tipos de clientes" );		
		setAtribos( 50, 50, 285, 150 );
		
		Vector<String> labs = new Vector<String>();
		labs.add( "C�digo" );
		labs.add( "Descri��o" );
		Vector<String> vals = new Vector<String>();
		vals.add( "CODTIPOCLI" );
		vals.add( "DESCTIPOCLI" );
		rgOrdem = new JRadioGroup( 1, 2, labs, vals );
		
		adic( new JLabel( "Ordem do relatorio :" ), 10, 10, 200, 20 );
		adic( rgOrdem, 10, 35, 250, 30 );
	}

	@ Override
	public void imprimir( boolean visualizar ) {

		try {
			
			StringBuilder sql = new StringBuilder();
			
			sql.append( "SELECT TP.CODTIPOCLI AS CODIGO ,TP.DESCTIPOCLI AS DESCRICAO,TP.TIPOCLI AS TIPO," );
			sql.append( "(SELECT COUNT(CLI.CODCLI) FROM RPCLIENTE CLI " );
			sql.append( "WHERE CLI.CODEMPTC=TP.CODEMP AND CLI.CODFILIALTC=TP.CODFILIAL AND CLI.CODTIPOCLI=TP.CODTIPOCLI) AS QTD " ); 
			sql.append( "FROM RPTIPOCLI TP " );
			sql.append( "WHERE TP.CODEMP=? AND TP.CODFILIAL=? " );
			sql.append( "ORDER BY " + rgOrdem.getVlrString() );
			
			PreparedStatement ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "RPTIPOCLI" ) );
			ResultSet rs = ps.executeQuery();
			
			HashMap<String,Object> hParam = new HashMap<String, Object>();

			hParam.put( "CODEMP", Aplicativo.iCodEmp );
			hParam.put( "SUBREPORT_DIR", "/opt/freedom/reports/" );
			hParam.put( "REPORT_CONNECTION", con );
			
			FPrinterJob dlGr = new FPrinterJob( "modulos/rep/relatorios/rptipocli.jasper", "TIPOS DE CLIENTE", null, rs, hParam, this );

			if ( visualizar ) {
				dlGr.setVisible( true );
			}
			else {
				JasperPrintManager.printReport( dlGr.getRelatorio(), true );
			}
			
			dispose();
		} catch ( Exception e ) {
			Funcoes.mensagemErro( this, "Erro ao montar relatorio!\n" + e.getMessage() );
			e.printStackTrace();
		}

	}

}

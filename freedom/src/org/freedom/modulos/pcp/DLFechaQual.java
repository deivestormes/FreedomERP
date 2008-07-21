/**
 * @version 17/07/2008 <BR>
 * @author Setpoint Inform�tica Ltda./Reginaldo Garcia Heua <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.pcp <BR>
 * Classe:
 * @(#)DLFechaQual.java <BR>
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
package org.freedom.modulos.pcp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Vector;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;

public class DLFechaQual extends FFDialogo {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDescEst = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtDescAfer = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );

	private JTextFieldPad txtVlrAfer = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDec );

	private JTextFieldPad txtVlrMin = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDec );

	private JTextFieldPad txtVlrMax = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDec );

	private Vector<String> vLabs1 = new Vector<String>();

	private Vector<String> vVals1 = new Vector<String>();

	private JRadioGroup<?, ?> rgTipo = null;

	String tipo = "";

	public DLFechaQual( String sDescAnalise, String sTipo, BigDecimal bVlrMin, BigDecimal bVlrMax, BigDecimal vlrAfer, String sAfer, String status, boolean editable ) {

		setTitulo( "Qualidade" );
		setAtribos( 390, 220 );

		adic( new JLabelPad( "Descri��o da analise" ), 7, 5, 360, 20 );
		adic( txtDescEst, 7, 25, 360, 20 );

		tipo = sTipo;

		vLabs1.addElement( "Pendente" );
		vLabs1.addElement( "Recusada" );
		vLabs1.addElement( "Aprovada" );
		vLabs1.addElement( "Corrigida" );
		vVals1.addElement( "PE" );
		vVals1.addElement( "RC" );
		vVals1.addElement( "AP" );
		vVals1.addElement( "CO" );

		rgTipo = new JRadioGroup<String, String>( 1, 3, vLabs1, vVals1 );

		if ( "DT".equals( sTipo ) ) {

			adic( new JLabelPad( "Aferi��o" ), 7, 45, 360, 20 );
			adic( txtDescAfer, 7, 65, 360, 20 );
			adic( rgTipo, 7, 95, 360, 30 );
			rgTipo.setVlrString( status );

			txtDescAfer.setRequerido( true );
			txtDescAfer.setVlrString( sAfer );
		}
		else if ( "MM".equals( sTipo ) ) {

			adic( new JLabelPad( "Vlr.M�n." ), 7, 45, 70, 20 );
			adic( txtVlrMin, 7, 65, 70, 20 );
			adic( new JLabelPad( "Vlr.M�x." ), 80, 45, 70, 20 );
			adic( txtVlrMax, 80, 65, 70, 20 );
			adic( new JLabelPad( "Aferi��o" ), 7, 85, 210, 20 );
			adic( txtVlrAfer, 7, 105, 70, 20 );

			txtVlrMin.setSoLeitura( true );
			txtVlrMax.setSoLeitura( true );
			txtVlrAfer.setRequerido( true );

			txtVlrMin.setVlrBigDecimal( bVlrMin );
			txtVlrMax.setVlrBigDecimal( bVlrMax );
			txtVlrAfer.setVlrBigDecimal( vlrAfer == null ? new BigDecimal( 0 ) : vlrAfer );
		}

		txtDescEst.setVlrString( sDescAnalise );
		txtDescEst.setAtivo( false );
		
		if ( ! editable ) {
			rgTipo.setAtivo( false );
			txtVlrAfer.setAtivo( false );
			txtDescAfer.setAtivo( false );
		}

	}

	public String getStatus() {

		return rgTipo.getVlrString();
	}

	public HashMap<String, Object> getValor() {

		HashMap<String, Object> hRet = new HashMap<String, Object>();

		try {
			hRet.put( "DESCAFER", txtDescAfer.getVlrString() );
			hRet.put( "VLRAFER", txtVlrAfer.getVlrBigDecimal() );
		} catch ( Exception e ) {
			e.printStackTrace();
		}

		return hRet;
	}

	public void ok() {

		if ( "DT".equals( tipo ) ) {
			if ( ( txtDescAfer.getVlrString().equals( "" ) ) ) {
				Funcoes.mensagemInforma( this, "Informe a descri��o!" );
				return;
			}
			else {
				super.ok();
			}
		}
		else if ( "MM".equals( tipo ) ) {
			if ( ( txtVlrAfer.getVlrString().equals( "" ) ) ) {
				Funcoes.mensagemInforma( this, "Informe o valor!" );
				return;
			}
			else {
				super.ok();
			}
		}
	}
}

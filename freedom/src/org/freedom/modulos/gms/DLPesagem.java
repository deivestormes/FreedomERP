/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)DLBaixaRec.java <BR>
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios sobre a classe...
 */

package org.freedom.modulos.gms;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.BigDecimal;
import java.util.Date;

import javax.comm.SerialPort;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.EditEvent;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.funcoes.Funcoes;
import org.freedom.infra.driver.scale.FilizolaBP15;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.telas.FFDialogo;
import org.freedom.telas.SwingParams;

public class DLPesagem extends FFDialogo implements CarregaListener, FocusListener {//, SerialPortEventListener  {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtPeso1 = new JTextFieldPad( JTextFieldPad.TP_DECIMAL, 15, 2 );
	
	private JTextFieldPad txtPeso2 = new JTextFieldPad( JTextFieldPad.TP_DECIMAL, 15, 2 );

	private JTextFieldPad txtData = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );
	
	private JTextFieldPad txtHora = new JTextFieldPad( JTextFieldPad.TP_TIME, 8, 0 );
	
	private JLabelPad lbpeso1 = new JLabelPad(( "Peso 1" ));
	
	private JLabelPad lbpeso2 = new JLabelPad(( "Peso 2" ));
	
	private SerialPort porta =  null;
	
	public DLPesagem( Component cOrig, String tipoprocrecmerc ) {

		super( cOrig );
		int irow = 0; // Variavel para salto na posi��o do campo de data e hora
		
		setTitulo( "Pesagem" );
		
		ajustaCampos();
		carregaPadroes();
		txtPeso1.setVlrBigDecimal( new BigDecimal( 0 ) );
		
		adic( lbpeso1 , 7, 0, 252, 20 );
		adic( txtPeso1, 7, 20, 252, 50 );

		if( FTipoRecMerc.DESCARREGAMENTO.equals( tipoprocrecmerc ) ) {
			 
			adic( lbpeso2 , 7, 80, 252, 20 );
			adic( txtPeso2, 7, 100, 252, 50 );
			
			irow = 80;
		}

		
		setAtribos( 280, 250 + irow );		
		
		adic( new JLabelPad( "Data" ), 7, 80 + irow, 135, 20 );
		adic( txtData, 7, 100 + irow, 135, 50 );
		
		adic( new JLabelPad( "Hora" ), 147, 80 + irow, 110, 20 );
		adic( txtHora, 147, 100 + irow, 110, 50 );
		
//		listaPortasSeriais();
		
//		abrePorta("/dev/ttyS0");		
		
		FilizolaBP15 balanca = new FilizolaBP15();
		
		balanca.getWeight();
		
	}
	
	private void ajustaCampos() {
		
		txtData.setAtivo( false );
		txtHora.setAtivo( false );
		
		txtPeso1.setFont( SwingParams.getFontboldextra(20) );
		txtPeso2.setFont( SwingParams.getFontboldextra(20) );
		txtData.setFont( SwingParams.getFontboldextra(10) );
		txtHora.setFont( SwingParams.getFontboldextra(10) );
		
	}
	
	private void carregaPadroes() {
		
//		Date dataatual = new Date();
//		txtData.setVlrDate( dataatual );
//		txtHora.setVlrTime( dataatual );		
		
	}

	public BigDecimal getPeso1() {
		return txtPeso1.getVlrBigDecimal();
	}

	public BigDecimal getPeso2() {
		return txtPeso2.getVlrBigDecimal();
	}
	
	public Date getData() {
		return txtData.getVlrDate();
	}
	
	public String getHora() {
		return txtHora.getVlrString();
	}
	
	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btOK ) {
				carregaPadroes();
				super.actionPerformed( evt );			
		}
		else {
			super.actionPerformed( evt );
		}
	}

	public void focusGained( FocusEvent fevt ) { }

	public void focusLost( FocusEvent fevt ) {

	}

	public void beforeCarrega( CarregaEvent cevt ) {

	}

	public void afterCarrega( CarregaEvent cevt ) {

	}

	public void beforeEdit( EditEvent eevt ) { }

	public void afterEdit( EditEvent eevt ) { }

	public void setConexao( DbConnection cn ) {
	
		super.setConexao( cn );
	}
	/*
	public String[] listaPortasSeriais() {
		
		Enumeration listadeportas = null;
		String[] portas = new String[10];
		
		try {
			listadeportas = CommPortIdentifier.getPortIdentifiers();
			
			int i = 0;
			
			
			
			while (listadeportas.hasMoreElements()) {
								
				CommPortIdentifier ips = (CommPortIdentifier) listadeportas.nextElement();
				portas[i] = ips.getName();
				
				System.out.println(ips.getName());
				
				i++;
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return portas;	
		
	}
	
	*/
/*	
	private void abrePorta(String nomeporta) {
	
		try {
						
			CommPortIdentifier cp = CommPortIdentifier.getPortIdentifier(nomeporta);
			
			if ( cp.isCurrentlyOwned() ) {			
				Funcoes.mensagemErro( this, "A porta " + nomeporta + " est� em uso no momento por " + cp.getCurrentOwner() + "!\nTente novamente mais tarde." );							
			}
			else {
				
				porta = (SerialPort) cp.open( "SComm", 1000 );
				
				System.out.println("Abriu porta!");
				
//				porta.setSerialPortParams( 9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_2, SerialPort.PARITY_EVEN );
				porta.setSerialPortParams( 9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_2, SerialPort.PARITY_NONE );

				escutaPorta();
				
				lePorta();
				
			}
						
		}
		catch (PortInUseException e) {
			Funcoes.mensagemErro( this, "A porta " + nomeporta + " est� em uso no momento!\nTente novamente mais tarde." );
			btCancel.doClick();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	*/
	/*
	private void escutaPorta() {
		
		try {
	
			porta.addEventListener( this );
			
			porta.notifyOnDataAvailable( true );
				
			System.out.println("Escutando na porta...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	*/
	
	/*
	private void lePorta() {
		try {
			
			OutputStream saida = porta.getOutputStream();
			
			saida.write( 0x05 );
			
			saida.write( 0x00 );	
			
			Thread.sleep( 100 );
			
			saida.flush();
			
			System.out.println("Setou par�metros");
			
			Thread.sleep( 100 );
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	*/
	
	/*
	public void serialEvent( SerialPortEvent ev ) {
		
		String leitura = null;
		
		try {

			InputStream entrada = porta.getInputStream();

			System.out.println("Aguardando dados para leitura...");
			Funcoes.espera( 2 );
		
			if(ev.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
				
				entrada = porta.getInputStream();
				
				int nodeBytes = 0;
				
				byte[] bufferLeitura = new byte[100];
				
				System.out.println("Lendo dados da porta serial...");
				
				while ( entrada.available() > 0 ) {
					
					nodeBytes = entrada.read( bufferLeitura );	
					System.out.println("Teste");
				
				}
				
				String strleitura = new String(bufferLeitura);
				
				String leitura2 = Funcoes.alltrim( strleitura );
				
				System.out.println("Leitura no listener:" + leitura2);
				
				int posicaobranca = leitura2.indexOf( " " );
				
				if(posicaobranca<22 && posicaobranca>-1) {
					leitura2 = leitura2.substring( posicaobranca );
					leitura2 = Funcoes.alltrim( leitura2 );
				}
				
				if(leitura2.length()>=22) {
				
					leitura2 = leitura2.substring( 0, 22 );
					
					String validador = leitura2.substring( 11, 12 )  + leitura2.substring( 14, 15 ) + leitura2.substring( 19, 20 );
					
					if("//:".equals( validador )) {
						
						leitura = leitura2;
						
						porta.notifyOnDataAvailable( false );					
						porta.close();
						System.out.println("Finalizou leitura e fechou a porta!");
						
					}
					
					
				}
				
				
				if(bufferLeitura.length>0) {
					System.out.println( strleitura );
				}
				else {
					System.out.println( "nada lido!" );
				}
				
				System.out.println( "n�mero de bytes lidos:" + nodeBytes );
				
				
			}
			else {
				System.out.println("Porta n�o est� pronta!");
			}
				
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(leitura != null) {
				parseLeitura( leitura );
			}
			porta.close();
			System.out.println("Fechou Porta!");
		}
		
	}
	*/
	private void parseLeitura(String leitura) {
		
		String peso = "";
		String data = "";
		String hora = "";
		
		try {
			
			peso = leitura.substring( 0,  07 );
			data = leitura.substring( 9,  17 );
			hora = leitura.substring( 17, 22 );
			
			txtPeso1.setVlrBigDecimal( Funcoes.strToBd( peso ) );
			txtData.setVlrDate( Funcoes.strDate6digToDate( data ) );
			txtHora.setVlrString( hora );
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    public void cancel() {
    	super.cancel();
    	porta.close();
    	System.out.println("Fechou porta...");
    }
	
	
	
	
	
	
	

	
	

}

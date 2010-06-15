package org.freedom.infra.driver.scale;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;

import org.freedom.infra.comm.CtrlPort;
import org.freedom.infra.comm.Serial;
import org.freedom.infra.functions.ConversionFunctions;

public final class Bci10000 extends AbstractScale {

	private BigDecimal weight = null;

	private Date date = null;

	private Time time = null;

	public static final byte STX = 2;
	
	public static final byte ETX = 3;

	public static final String NOME_BAL = "Rodovi�ria BCI 10000";

	private volatile boolean reading = true; // Indica se ainda est� lendo o
	// buffer.

	private volatile boolean available = false;

	// private volatile boolean validstring = false;

	public synchronized void initialize(Integer com, Integer timeout, Integer baudrate,
			Integer databits, Integer stopbits, Integer parity) {

		this.com = com;

		serialParams.setTimeout(timeout);
		serialParams.setBauderate(baudrate);
		serialParams.setDatabits(databits);
		serialParams.setStopbits(stopbits);
		serialParams.setParity(parity);

		activePort(this);

		reading = true;

		readReturn();

	}

	public String getName() {
		return NOME_BAL;
	}

	public void stopRead() {
		try {
			SerialPort porta = Serial.getInstance().getSerialPort();
			porta.removeEventListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected synchronized void readReturn() {

		byte[] result = null;
		byte[] bufferTmp = null;
		byte[] tmp = null;

		InputStream input = CtrlPort.getInstance().getInput();

		try {

			available = false;

			while (reading) {

				Thread.sleep(1000);
				// Thread.currentThread().join(100);

				if (available) {

					// System.out.println("Tamanho buffer:"+input.available());
					while (input.available() < 16) {
 						Thread.sleep(100);
//						Thread.currentThread().join(100);
//						
						System.out.println("Tamanho buffer:" + input.available());
					}

					result = new byte[input.available()];
					// result = new byte[ 256 ];

					int nodeBytes = 0;

					if (result != null) {

						while (input.available() > 0) {

							nodeBytes = input.read(result);

						}

						System.out.println("tamanho da cadeia de leitura:" + nodeBytes);

						if (buffer == null) {
							bufferTmp = result;
						} else {
							isRead = true;
							tmp = buffer;
							bufferTmp = new byte[tmp.length + result.length];

							for (int i = 0; i < bufferTmp.length; i++) {
								if (i < tmp.length) {
									bufferTmp[i] = tmp[i];
								} else {
									bufferTmp[i] = result[i - tmp.length];
								}
							}
						}

						buffer = bufferTmp;

						try {
							String str = new String(buffer);
							System.out.println("Leitura:" + str);

							// str = str.trim();

							// pega os ultimos 56 caracteres do buffer
							if (str.length() > 56) {

								System.out.println("***Entrou no parse!");

								int i = 0;
								int charref = -1;
								while (str.length() > i) {
									charref = (byte) str.charAt(i);
									System.out.println("char lido:" + charref);
									// Localiza o caractere de refer�ncia (145) e captura os
									// carateres correspondentes ao peso
									if (charref == STX) {

										System.out.println("STX na posicao:" + i);

										if (str.length() >= (i + 10)) {
											str = str.substring(i + 4, i + 10);
										} else {
											str = str.substring(i + 4);
										}

										break;
									}

									i++;
								}

								System.out.println("strlimpa:" + str);

//								strweight = str;

								buffer = null;

								System.out.println("Finalizou leitura!");

								System.out.println("peso lido: " + str);

								// Porta deve ser desabilitada para finalizar a leitura dos
								// pesos da balan�a.

								reading = false; // Parar a leitura se leitura estiver OK

								//Thread.currentThread().interrupt();

								setWeight(ConversionFunctions.stringToBigDecimal(str));
								Date datahora = new Date();
								setDate(datahora); 

								setTime(ConversionFunctions.strTimetoTime(ConversionFunctions.dateToStrTime(datahora)));

							} 
							else {
								System.out.println("***Sring menor que 20!");
							}

						} catch (Exception e) {
							e.printStackTrace();
						}

					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Testes para verificar se adianta desabilitar a porta
			stopRead();
			CtrlPort.getInstance().disablePort();
		}

	}

	public void setDate(Date date) {

		this.date = date;
	}

	public Date getDate() {

		return date;

	}

	private void setTime(Time time) {

		this.time = time;

	}

	public Time getTime() {

		return time;
	}
/*
	private synchronized void parseString(String str) {

		String strweight = "";

		try {

			System.out.println("Leitura:" + str);

			// str = str.trim();

			// pega os ultimos 56 caracteres do buffer
			if (str.length() > 56) {

				System.out.println("***Entrou no parse!");

				int i = 0;
				int charref = -1;
				while (str.length() > i) {
					charref = (byte) str.charAt(i);
					System.out.println("char lido:" + charref);
					// Localiza o caractere de refer�ncia (145) e captura os
					// carateres correspondentes ao peso
					if (charref == STX) {

						System.out.println("STX na posicao:" + i);

						if (str.length() >= (i + 8)) {
							str = str.substring(i + 2, i + 8);
						} else {
							str = str.substring(i + 2);
						}

						break;
					}

					i++;
				}

				System.out.println("strlimpa:" + str);

				strweight = str;

				buffer = null;

				System.out.println("Finalizou leitura!");

				System.out.println("peso lido: " + str);

				// Porta deve ser desabilitada para finalizar a leitura dos
				// pesos da balan�a.

				reading = false; // Parar a leitura se leitura estiver OK

				// Thread.currentThread().interrupt();

				setWeight(ConversionFunctions.stringToBigDecimal(strweight));
				Date datahora = new Date();
				setDate(datahora);

				setTime(ConversionFunctions.strTimetoTime(ConversionFunctions
						.dateToStrTime(datahora)));

			} else {
				System.out.println("***Sring menor que 20!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	public void serialEvent( SerialPortEvent event ) {


		if ( event.getEventType() == SerialPortEvent.DATA_AVAILABLE ) {
			available = true;

		}
		else {
			
			System.out.println("evento:" + event.getEventType());
			available =false;
		}
		
	}

	private void setWeight(BigDecimal weight) {

		this.weight = weight;

	}

	public BigDecimal getWeight() {

		return weight;
	}

}

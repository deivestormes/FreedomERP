/**
 * @version 17/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.pdv <BR>
 * Classe: @(#)FLeFiscal.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR> 
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios sobre a classe...
 * 
 */

package org.freedom.modulos.pdv;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Painel;
import org.freedom.componentes.Tabela;
import org.freedom.drivers.JBemaFI32;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FTabDados;

public class FLeFiscal extends FTabDados {
	private Painel pinCab = new Painel(0,60);
	private Painel pinGeral = new Painel();
	private Painel pinAliq = new Painel();
	private Painel pinTrib = new Painel();
	private Painel pinTributado = new Painel();
	private Painel pinIsen = new Painel();
	private Painel pinIsento = new Painel();
	private JPanel pnMapa = new JPanel(new GridLayout(1,1));
	private JTextFieldPad txtDataX = new JTextFieldPad();
	private JTextFieldPad txtNumTermX = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
	private JTextFieldFK txtDescTermX = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
	private JTextFieldPad txtAliq1 = new JTextFieldPad();
	private JTextFieldPad txtAliq2 = new JTextFieldPad();
	private JTextFieldPad txtAliq3 = new JTextFieldPad();
	private JTextFieldPad txtAliq4 = new JTextFieldPad();
	private JTextFieldPad txtAliq5 = new JTextFieldPad();
	private JTextFieldPad txtAliq6 = new JTextFieldPad();
	private JTextFieldPad txtAliq7 = new JTextFieldPad();
	private JTextFieldPad txtAliq8 = new JTextFieldPad();
	private JTextFieldPad txtAliq9 = new JTextFieldPad();
	private JTextFieldPad txtAliq10 = new JTextFieldPad();
	private JTextFieldPad txtAliq11 = new JTextFieldPad();
	private JTextFieldPad txtAliq12 = new JTextFieldPad();
	private JTextFieldPad txtAliq13 = new JTextFieldPad();
	private JTextFieldPad txtAliq14 = new JTextFieldPad();
	private JTextFieldPad txtAliq15 = new JTextFieldPad();
	private JTextFieldPad txtAliq16 = new JTextFieldPad();
	private JTextFieldPad txtT1 = new JTextFieldPad();
	private JTextFieldPad txtT2 = new JTextFieldPad();
	private JTextFieldPad txtT3 = new JTextFieldPad();
	private JTextFieldPad txtT4 = new JTextFieldPad();
	private JTextFieldPad txtT5 = new JTextFieldPad();
	private JTextFieldPad txtT6 = new JTextFieldPad();
	private JTextFieldPad txtT7 = new JTextFieldPad();
	private JTextFieldPad txtT8 = new JTextFieldPad();
	private JTextFieldPad txtT9 = new JTextFieldPad();
	private JTextFieldPad txtT10 = new JTextFieldPad();
	private JTextFieldPad txtT11 = new JTextFieldPad();
	private JTextFieldPad txtT12 = new JTextFieldPad();
	private JTextFieldPad txtT13 = new JTextFieldPad();
	private JTextFieldPad txtT14 = new JTextFieldPad();
	private JTextFieldPad txtT15 = new JTextFieldPad();
	private JTextFieldPad txtT16 = new JTextFieldPad();
	private JTextFieldPad txtTN1 = new JTextFieldPad();
	private JTextFieldPad txtTN2 = new JTextFieldPad();
	private JTextFieldPad txtTN3 = new JTextFieldPad();
	private JTextFieldPad txtTN4 = new JTextFieldPad();
	private JTextFieldPad txtTN5 = new JTextFieldPad();
	private JTextFieldPad txtTN6 = new JTextFieldPad();
	private JTextFieldPad txtTN7 = new JTextFieldPad();
	private JTextFieldPad txtTN8 = new JTextFieldPad();
	private JTextFieldPad txtTN9 = new JTextFieldPad();
	private JTextFieldPad txtTSangria = new JTextFieldPad();
	private JTextFieldPad txtPrimCupom = new JTextFieldPad();
	private JTextFieldPad txtTSuprimento = new JTextFieldPad();
	private JTextFieldPad txtUltCupom = new JTextFieldPad();
	private JTextFieldPad txtTotal = new JTextFieldPad();
	private JTextFieldPad txtCanc = new JTextFieldPad();
	private JTextFieldPad txtVlrCanc = new JTextFieldPad();
	private JTextFieldPad txtRed = new JTextFieldPad();
	private JTextFieldPad txtVlrDesc = new JTextFieldPad();
	private JTextFieldPad txtSequencia = new JTextFieldPad();
	private JTextFieldPad txtVlrIsento = new JTextFieldPad();
	private JTextFieldPad txtVlrNI = new JTextFieldPad();
	private JTextFieldPad txtVlrSubst = new JTextFieldPad();
	private Tabela tab = new Tabela();
	private JScrollPane spnTab = new JScrollPane(tab);
	private ListaCampos lcCaixa = new ListaCampos(this,"");
	private JButton btExec = new JButton(Icone.novo("btExecuta.gif"));
	private JBemaFI32 bf = (FreedomPDV.bECFTerm ? new JBemaFI32() : null);
	public FLeFiscal() {
		setTitulo("Leitura de mem�ria fiscal");
		setAtribos(60,60,540,470);

		txtPrimCupom.setAtivo(false);
		txtRed.setAtivo(false);
		
		lcCaixa.add(new GuardaCampo( txtNumTermX, 7, 100, 80, 20, "CodCaixa", "Terminal", true, false, null, JTextFieldPad.TP_INTEGER,true),"txtCodTipoForx");
		lcCaixa.add(new GuardaCampo( txtDescTermX, 90, 100, 207, 20, "DescCaixa", "Descri��o", false, false, null, JTextFieldPad.TP_STRING,false),"txtDescTipoForx");
		lcCaixa.montaSql(false, "CAIXA", "PV");    
		lcCaixa.setQueryCommit(false);
		lcCaixa.setReadOnly(true);
		txtNumTermX.setTabelaExterna(lcCaixa);

		pnCliente.add(pinCab,BorderLayout.NORTH);
		
		setPainel(pinCab);
		adicCampo(txtDataX, 7, 20, 100, 20, "Dtlx", "Data da leitura", JTextFieldPad.TP_DATE, 10, 0, true, false, null, true);
		adicCampo(txtNumTermX, 110,20,77,20, "CodCaixa", "C�digo", JTextFieldPad.TP_INTEGER, 8, 0, true, true, null, true);
		adicDescFK(txtDescTermX, 190,20,240,20, "DescCaixa", "e descri��o do caixa/m�quina", JTextFieldPad.TP_STRING, 50, 0);
		adic(btExec,470,10,30,30);

		adicTab("Geral", pinGeral); 
		setPainel(pinGeral);
		
		JLabel lbAliq = new JLabel(" Aliquotas ICMS");
		lbAliq.setOpaque(true);
		
		adic(lbAliq,15,5,90,15);
		adic(pinAliq,7,10,423,100);
		
		setPainel(pinAliq);
		adicCampo(txtAliq1,  7,25,50,20,   "Aliq01", "T1",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq2,  60,25,47,20,  "Aliq02", "T2",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq3,  110,25,47,20, "Aliq03", "T3",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq4,  160,25,47,20, "Aliq04", "T4",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq5,  210,25,47,20, "Aliq05", "T5",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq6,  260,25,47,20, "Aliq06", "T6",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq7,  310,25,47,20, "Aliq07", "T7",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq8,  360,25,50,20, "Aliq08", "T8",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq9,  7,65,50,20,   "Aliq09", "T9",  JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq10, 60,65,47,20,  "Aliq10", "T10", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq11, 110,65,47,20, "Aliq11", "T11", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq12, 160,65,47,20, "Aliq12", "T12", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq13, 210,65,47,20, "Aliq13", "T13", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq14, 260,65,47,20, "Aliq14", "T14", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq15, 310,65,47,20, "Aliq15", "T15", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		adicCampo(txtAliq16, 360,65,50,20, "Aliq16", "T16", JTextFieldPad.TP_DECIMAL, 5, 2, false, false, null, false);
		
		setPainel(pinGeral);
		
		JLabel lbLinha = new JLabel("");
		lbLinha.setBorder(BorderFactory.createEtchedBorder());
		JLabel lbContadores = new JLabel("  Contadores:");
		lbContadores.setOpaque(true);
		adic(lbContadores,15,125,100,15);
		adic(lbLinha,7,130,500,2);
		
		adicCampo(txtPrimCupom, 7,160,85,20, "PrimCupomLX", "Prim. Cupom", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null, false);
		adicCampo(txtUltCupom, 95,160,82,20, "UltCupomLX", "Ult. Cupom", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null, false);
		adicCampo(txtCanc,180,160,82,20, "NumCancLX", "Cancelados", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null, false);
		adicCampo(txtRed,265,160,82,20, "NumRedLX", "Redu��es", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null, false);
		adicCampo(txtSequencia,350,160,80,20, "ContaLX", "Contador", JTextFieldPad.TP_INTEGER, 8, 0, false, false, null, false);
		
		JLabel lbLinha2 = new JLabel("");
		lbLinha2.setBorder(BorderFactory.createEtchedBorder());
		JLabel lbContadores2 = new JLabel("  Totalizadores:");
		lbContadores2.setOpaque(true);
		adic(lbContadores2,15,195,100,15);
		adic(lbLinha2,7,200,500,2);
		
		adicCampo(txtTSangria, 7,230,105,20, "TSangria", "Sangria", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTSuprimento, 115,230,102,20, "TSuprimento", "Suprimento", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtVlrCanc, 220,230,102,20, "VlrCancLX", "Cancelamento", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtVlrDesc, 325,230,105,20, "VlrDescLX", "Desconto", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTotal, 7,270,100,20, "TGTotal", "Grande Total", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		
		adicTab("Tributado", pinTributado); 
		setPainel(pinTributado);
		
		JLabel lbTrib = new JLabel("  Valor dos totalizadores de ICMS.");
		lbTrib.setOpaque(true);
		
		adic(lbTrib,15,5,200,15);
		adic(pinTrib,7,10,423,180);
		
		setPainel(pinTrib);
		adicCampo(txtT1,  7,25,100,20,   "TT01", "T1",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT2,  110,25,97,20,  "TT02", "T2",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT3,  210,25,97,20,  "TT03", "T3",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT4,  310,25,100,20, "TT04", "T4",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT5,  7,65,100,20,   "TT05", "T5",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT6,  110,65,97,20,  "TT06", "T6",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT7,  210,65,97,20,  "TT07", "T7",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT8,  310,65,100,20, "TT08", "T8",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT9,  7,105,100,20,  "TT09", "T9",  JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT10, 110,105,97,20, "TT10", "T10", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT11, 210,105,97,20, "TT11", "T11", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT12, 310,105,100,20,"TT12", "T12", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT13, 7,145,100,20,  "TT13", "T13", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT14, 110,145,97,20, "TT14", "T14", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT15, 210,145,97,20, "TT15", "T15", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtT16, 310,145,100,20,"TT16", "T16", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		
		adicTab("Isento", pinIsento); 
		setPainel(pinIsento);
		
		JLabel lbIsento = new JLabel("  Valor dos totalizadores n�o sujeitos ao ICMS.");
		lbIsento.setOpaque(true);
		
		adic(lbIsento,15,5,280,15);
		adic(pinIsen,7,10,323,140);
		
		setPainel(pinIsen);
		adicCampo(txtTN1, 7,25,100,20,  "TN1", "T1", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN2, 110,25,97,20, "TN2", "T2", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN3, 210,25,97,20, "TN3", "T3", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN4, 7,65,100,20,  "TN4", "T4", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN5, 110,65,97,20, "TN5", "T5", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN6, 210,65,97,20, "TN6", "T6", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN7, 7,105,100,20, "TN7", "T7", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN8, 110,105,97,20,"TN8", "T8", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtTN9, 210,105,97,20,"TN9", "T9", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
        
		setPainel(pinIsento);
		adicCampo(txtVlrIsento, 350,45,130,20, "TIsencao", "Tot. Isencao", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtVlrNI, 350,85,130,20, "TNIncidencia", "Tot. de n�o incid�ncia", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);
		adicCampo(txtVlrSubst, 350,125,130,20, "TSubstituicao", "Tot. de substitui��o", JTextFieldPad.TP_DECIMAL, 15, 2, false, false, null, false);

		setListaCampos( false, "LEITURAX", "PV");

        pnMapa.add(spnTab);
		adicTab("Mapa fiscal", pnMapa);
		
		montaTabela();
		
		btExec.addActionListener(this); 

    }
    private void montaTabela() {
    	tab.adicColuna("%Aliq");
		tab.adicColuna("Total Isen��o");
		tab.adicColuna("Total n�o Incid�ncia");
		tab.adicColuna("Total Substitui��o");
		tab.adicColuna("Total Sangria");
		tab.adicColuna("Total Suprimento");
		tab.adicColuna("Grande Total");
		tab.adicColuna("Valor Cont�bil");
		tab.adicColuna("Base de C�lculo");
		tab.adicColuna("Valor do Imposto");
		tab.adicColuna("Total Cancelamentos");
		tab.adicColuna("Total Descontos");
		tab.adicColuna("N�. Cancelamentos");
		tab.adicColuna("N�. Redu��es");
		tab.adicColuna("Contador");
		tab.adicColuna("Ultimo Cupom");
		
		tab.setTamColuna(70,0);  
		tab.setTamColuna(100,1);  
		tab.setTamColuna(120,2);
		tab.setTamColuna(100,3);
		tab.setTamColuna(90,4);
		tab.setTamColuna(100,5);
		tab.setTamColuna(90,6);
		tab.setTamColuna(100,7);
		tab.setTamColuna(110,8);
		tab.setTamColuna(120,9);
		tab.setTamColuna(130,10);
		tab.setTamColuna(110,11);
		tab.setTamColuna(130,12);
		tab.setTamColuna(100,13);
		tab.setTamColuna(80,14);
		tab.setTamColuna(100,15);
    }
    private void buscaAliquotas() {
		String sAliquota = "";
		if (FreedomPDV.bECFTerm) {
		   String sAliquotas = (bf.retornaAliquotas(Aplicativo.strUsuario,FreedomPDV.bModoDemo)+"").trim();
		   int iTot = (((sAliquotas.length())+1)/5);
		   for (int i=1;i<=iTot;i++) {
		      sAliquota = sAliquotas.substring((5*i)-5,(5*i)-3)+"."+sAliquotas.substring((5*i)-3,(5*i)-1);
 		      lcCampos.getCampo("Aliq"+Funcoes.strZero(""+(i),2)).setVlrDouble(new Double(sAliquota));
	       }
		}
    }

    private void carregaContadores(){        
    	String sSqlPrimCupom = "SELECT FIRST 1 DOCVENDA FROM VDVENDA WHERE CODEMP=? AND "+
    	                       "CODFILIAL=? AND CODEMPCX=? AND CODFILIALCX=? AND CODCAIXA=? AND "+
							   "DTEMITVENDA=? AND TIPOVENDA='E' ORDER BY DTEMITVENDA,DOCVENDA";

	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    try {
		  ps = con.prepareStatement(sSqlPrimCupom);
		  ps.setInt(1,Aplicativo.iCodEmp);
		  ps.setInt(2,ListaCampos.getMasterFilial("VDVENDA"));
          ps.setInt(3,Aplicativo.iCodEmp);
          ps.setInt(4,Aplicativo.iCodFilial);
		  ps.setInt(5,Aplicativo.iNumEst);
          ps.setDate(6,Funcoes.dateToSQLDate(txtDataX.getVlrDate()));
		  rs = ps.executeQuery();

		  if (rs.next()) {
		     txtPrimCupom.setVlrInteger(new Integer(rs.getInt("DOCVENDA")));    
		  }
		  else {
		  	 txtPrimCupom.setVlrInteger(new Integer(0));
		  }
		  rs.close();
		  ps.close();
	    }
	    catch (SQLException err) {
		  Funcoes.mensagemErro(this,"Erro ao buscar primeiro cupom!\n"+err.getMessage());
	    }
    	
		if (FreedomPDV.bECFTerm) {
            txtRed.setVlrInteger(new Integer (bf.numeroReducoes(Aplicativo.strUsuario,FreedomPDV.bModoDemo)));
            txtUltCupom.setVlrInteger(new Integer (bf.numeroCupom(Aplicativo.strUsuario,FreedomPDV.bModoDemo)-1));
            txtCanc.setVlrInteger(new Integer (bf.numeroCancelados(Aplicativo.strUsuario,FreedomPDV.bModoDemo)));
            txtRed.setVlrInteger(new Integer (bf.numeroReducoes(Aplicativo.strUsuario,FreedomPDV.bModoDemo)));
		}
		else {
			txtRed.setVlrInteger(new Integer(0));
			txtUltCupom.setVlrInteger(new Integer(0));
			txtCanc.setVlrInteger(new Integer(0));
			txtRed.setVlrInteger(new Integer(0));
		}
			
			
    	
    }
    private void carregaTotalizadores(){
		if (FreedomPDV.bECFTerm) {
			String sTotalizadores[] = (bf.retornaTotalizadores(Aplicativo.strUsuario,FreedomPDV.bModoDemo)+"").trim().split(",");
			String sTot = "";
			
			sTot = sTotalizadores[5].substring(0,12)+"."+sTotalizadores[5].substring(12);
            txtTSangria.setVlrDouble(new Double(sTot));
			sTot = sTotalizadores[6].substring(0,12)+"."+sTotalizadores[6].substring(12);
            txtTSuprimento.setVlrDouble(new Double(sTot));
            txtVlrCanc.setVlrDouble(new Double(bf.cancelamentos(Aplicativo.strUsuario,FreedomPDV.bModoDemo)));
            txtVlrDesc.setVlrDouble(new Double(bf.descontos(Aplicativo.strUsuario,FreedomPDV.bModoDemo)));
			sTot = sTotalizadores[7].substring(0,16)+"."+sTotalizadores[7].substring(16);
            txtTotal.setVlrBigDecimal(new BigDecimal(sTot));

            //Totalizadores fiscais:
			for (int i=0;i<(224-13);i+=14) {
			      sTot = sTotalizadores[0].substring(i,i+12)+"."+sTotalizadores[0].substring(i+12,i+14);
			      lcCampos.getCampo("TT"+Funcoes.strZero(""+((i/14)+1),2)).setVlrDouble(new Double(sTot));
			}
			
			//Totalizadores n�o fiscais:
			for (int i=0;i<(126-13);i+=14) {
			      sTot = sTotalizadores[4].substring(i,i+12)+"."+sTotalizadores[4].substring(i+12,i+14);
			      lcCampos.getCampo("TN"+((i/14)+1)).setVlrDouble(new Double(sTot));
			}
			sTot = sTotalizadores[1].substring(0,12)+"."+sTotalizadores[1].substring(12);
            txtVlrIsento.setVlrDouble(new Double(sTot));
			sTot = sTotalizadores[2].substring(0,12)+"."+sTotalizadores[2].substring(12);
            txtVlrNI.setVlrDouble(new Double(sTot));
			sTot = sTotalizadores[3].substring(0,12)+"."+sTotalizadores[3].substring(12);
            txtVlrSubst.setVlrDouble(new Double(sTot));
		}
		else {
			txtVlrCanc.setVlrInteger(new Integer(0));
			txtVlrDesc.setVlrInteger(new Integer(0));
			txtTotal.setVlrInteger(new Integer(0));
		}    

    }
    
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == btExec) {
			buscaAliquotas();
			carregaContadores();
			carregaTotalizadores();
		}
		super.actionPerformed(evt);
	} 
	public void execShow(Connection cn) {
		con = cn;
		lcCampos.setConexao(cn);
		lcCaixa.setConexao(cn);
/*		if (verifCaixa())
		  carregaInfo();*/
		super.execShow(cn);
	}
}

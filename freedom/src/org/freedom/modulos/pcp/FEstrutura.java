/**
 * @version 01/09/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.pcp <BR>
 * Classe: @(#)FEstrutura.java <BR>
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
 * Tela para cadastro de estruturas de produtos.
 * 
 */ 

package org.freedom.modulos.pcp;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.FDetalhe;

public class FEstrutura extends FDetalhe implements ActionListener, CarregaListener, PostListener{
  private JPanelPad pinCab = new JPanelPad();
  private JPanelPad pinDet = new JPanelPad();
  private JTextFieldPad txtCodProd = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescProd = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldFK txtCLoteProd = new JTextFieldFK(JTextFieldPad.TP_STRING,1,0);
  private JTextFieldPad txtCodFase = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescFase = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtDescEst = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtQtdEst = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtNumSeq = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtCodProd2 = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescProd2 = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtQtdMat = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtRMA = new JTextFieldPad(JTextFieldPad.TP_STRING,1,0);
  private JTextFieldPad txtRefProd = new JTextFieldPad(JTextFieldPad.TP_STRING,13,0);
  private JTextFieldPad txtItRefProd = new JTextFieldPad(JTextFieldPad.TP_STRING,13,0);
  private JTextFieldPad txtCodModLote = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtNroDiasValid = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
  private JTextFieldPad txtSeqEst = new JTextFieldPad(JTextFieldPad.TP_INTEGER,5,0);
  private JTextFieldFK txtDescModLote = new JTextFieldFK(JTextFieldPad.TP_STRING,30,0);
  private JCheckBoxPad cbRmaAutoItEst = new JCheckBoxPad("Sim","S","N");
  private JCheckBoxPad cbAtiva = new JCheckBoxPad("Sim","S","N");
  private JButton btFase = new JButton("Fases",Icone.novo("btFechaVenda.gif"));
  private ListaCampos lcProd = new ListaCampos(this,"PD");
  private ListaCampos lcProd2 = new ListaCampos(this,"PD");
  private ListaCampos lcFase = new ListaCampos(this,"FS");
  private ListaCampos lcModLote = new ListaCampos(this,"ML");
  String sRma = "";
  
  public FEstrutura() {
    setTitulo("Estrutura de produtos");
    setAtribos( 50, 20, 568, 460);
    setAltCab(170);
    
    pnGImp.removeAll();
	pnGImp.setLayout(new GridLayout(1, 2));
	pnGImp.setPreferredSize(new Dimension(100, 26));
	pnGImp.add(btPrevimp);
	pnGImp.add(btImp);
    
	btFase.setToolTipText("Fases da produ��o");
    
    btFase.setEnabled(false);
    cbAtiva.setVlrString("N");
    
    pinCab = new JPanelPad(500,90);
    setListaCampos(lcCampos);
    setPainel( pinCab, pnCliCab);
    lcCampos.addPostListener(this);
    lcProd.setUsaME(false);    
    lcProd.add(new GuardaCampo( txtCodProd, "CodProd", "C�d.prod.", ListaCampos.DB_PK, true));
    lcProd.add(new GuardaCampo( txtDescProd, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false));
    lcProd.add(new GuardaCampo( txtRefProd, "RefProd", "Referencia", ListaCampos.DB_SI,false));
    lcProd.add(new GuardaCampo( txtCLoteProd, "CLoteProd", "Usa Lote", ListaCampos.DB_SI,false));
    lcProd.setWhereAdic("TIPOPROD='F'");
    lcProd.montaSql(false, "PRODUTO", "EQ");
    lcProd.setQueryCommit(false);
    lcProd.setReadOnly(true);
    txtRefProd.setTabelaExterna(lcProd);
    txtCodProd.setTabelaExterna(lcProd);
    txtDescProd.setListaCampos(lcProd);
       
    lcProd2.add(new GuardaCampo( txtCodProd2, "CodProd", "C�d.prod.", ListaCampos.DB_PK, true));
    lcProd2.add(new GuardaCampo( txtDescProd2, "DescProd", "Descri��o do produto", ListaCampos.DB_SI, false));
    lcProd2.add(new GuardaCampo( txtItRefProd, "RefProd", "Referencia", ListaCampos.DB_SI,false));
    lcProd2.add(new GuardaCampo( txtRMA, "RMAProd", "RMA", ListaCampos.DB_SI, false));

    lcProd2.montaSql(false, "PRODUTO", "EQ");
    lcProd2.setQueryCommit(false);
    lcProd2.setReadOnly(true);
    txtCodProd2.setTabelaExterna(lcProd2);
    txtDescProd2.setListaCampos(lcProd2);

    lcFase.add(new GuardaCampo( txtCodFase, "CodFase", "C�d.fase", ListaCampos.DB_PK, true));
    lcFase.add(new GuardaCampo( txtDescFase, "DescFase", "Descri��o da fase", ListaCampos.DB_SI, false));
    lcFase.setDinWhereAdic("CODFASE IN (SELECT CODFASE FROM PPESTRUFASE WHERE " +
            "CODEMP=PPFASE.CODEMP AND CODFILIAL=PPFASE.CODFILIAL AND CODPROD=#N)",txtCodProd);
    lcFase.montaSql(false, "FASE", "PP");
    lcFase.setQueryCommit(false);
    lcFase.setReadOnly(true);
    txtCodFase.setTabelaExterna(lcFase);
    txtDescFase.setListaCampos(lcFase);

    lcModLote.add(new GuardaCampo( txtCodModLote, "CodModLote", "C�d.Mod.Lote", ListaCampos.DB_PK, false));
    lcModLote.add(new GuardaCampo( txtDescModLote, "DescModLote", "Descri��o do modelo de lote", ListaCampos.DB_SI, false));
    lcModLote.montaSql(false, "MODLOTE", "EQ");
    lcModLote.setQueryCommit(false);
    lcModLote.setReadOnly(true);
    txtCodModLote.setTabelaExterna(lcModLote);
    txtDescModLote.setListaCampos(lcModLote);

    adicCampo(txtCodProd, 7, 20, 80, 20,"CodProd","C�d.prod.", ListaCampos.DB_PF, txtDescProd, true);
    adicDescFK(txtDescProd, 90, 20, 372, 20, "DescProd", "Descri��o do produto");
//    adicCampo(txtQtdEst, 435, 20, 108, 20,"QtdEst","Quantidade", ListaCampos.DB_SI, true);
    adicCampo(txtSeqEst,465,20,78,20, "SeqEst", "Seq.Est.",ListaCampos.DB_PK,true);
    adic(btFase,445,55,100,25);
    adicCampo(txtQtdEst, 7, 60, 80, 20,"QtdEst","Quantidade", ListaCampos.DB_SI, true);
    adicCampo(txtDescEst, 90, 60, 297, 20,"DescEst","Descri��o", ListaCampos.DB_SI, true);
    adicCampoInvisivel(txtRefProd, "RefProd", "Ref.prod.", ListaCampos.DB_FK, false);
    adicDB(cbAtiva,392,60,50,20,"ATIVOEST","Ativa",true);
    adicCampo(txtCodModLote,7,100,80,20,"CodModLote","C�d.Mod.Lote",ListaCampos.DB_FK,txtDescModLote,false);
    adicDescFK(txtDescModLote, 90, 100, 297, 20, "DescModLote", "Descri��o do modelo do lote");
    adicCampo(txtNroDiasValid,390,100,100,20,"NroDiasValid","Dias de validade",ListaCampos.DB_SI,false);
    
    setListaCampos( false, "ESTRUTURA", "PP");
    lcCampos.setQueryInsert(false);
    setAltDet(100);
    pinDet = new JPanelPad(590,110);
    setPainel( pinDet, pnDet);
    setListaCampos(lcDet);
    setNavegador(navRod);
    
    cbRmaAutoItEst.setVlrString("N");

    adicCampo(txtNumSeq, 7, 20, 40, 20,"SeqItEst","Item", ListaCampos.DB_PK, true);
    adicCampo(txtCodProd2, 50, 20, 77, 20,"CodProdPD","C�d.prod.", ListaCampos.DB_FK, txtDescProd2, true);
    adicDescFK(txtDescProd2, 130, 20, 307, 20, "DescProd", "Descri��o do produto");
    adicCampo(txtQtdMat, 440, 20, 100, 20,"QtdItEst","Quantidade", ListaCampos.DB_SI, true);
    adicCampo(txtCodFase, 7, 60, 70, 20,"CodFase","C�d.fase", ListaCampos.DB_FK, txtDescFase, true);
    adicDescFK(txtDescFase, 80, 60, 360, 20, "DescFase", "Descri��o da fase");
    adicDB(cbRmaAutoItEst,442,60,120,20,"RmaAutoItEst", "RMA Autom�tica", true);
    adicCampoInvisivel(txtRefProd, "RefProd", "Ref.prod.est.", ListaCampos.DB_SI, false);
    adicCampoInvisivel(txtItRefProd,"RefProdPD", "Ref.prod.it.", ListaCampos.DB_SI, false);
    setListaCampos( true, "ITESTRUTURA", "PP");
    lcDet.setQueryInsert(false);
    montaTab();
    
    txtCodProd2.setNomeCampo("CodProd");
    
    btFase.addActionListener(this);
    lcCampos.addCarregaListener(this);
    lcDet.addCarregaListener(this);
    lcProd.addCarregaListener(this);
    lcProd2.addCarregaListener(this);
    tab.setTamColuna(50,0);
    tab.setTamColuna(150,2);
    tab.setTamColuna(150,5);
        
    cbRmaAutoItEst.setEnabled(false);
    
    btImp.addActionListener(this);
	btPrevimp.addActionListener(this);
	
	setImprimir(true);
    
  }
  private void imprimir(boolean bVisualizar) {
    ImprimeOS imp = new ImprimeOS("",con);
    int linPag = imp.verifLinPag()-1;
    int iTot = 0;
    String[] sValores;
    String sWhere = "";
    imp.montaCab();
    imp.setTitulo("Relat�rio de Estrutura do Produto");
   
    DLREstrutura dl = new DLREstrutura();
    dl.setVisible(true);
    if (dl.OK == false) {
      dl.dispose();
      return;
    }
    sValores = dl.getValores();
	dl.dispose();
    
	if (sValores[2].equals("A")) {
		sWhere += " AND E.CODPROD="+txtCodProd.getVlrString();
		sWhere += " AND E.SEQEST="+txtSeqEst.getVlrString();
	}
    
    if (sValores[1].equals("R")){
    	
    	String sSQL = "SELECT E.CODPROD, PD.DESCPROD, E.SEQEST, E.QTDEST, E.DESCEST, E.ATIVOEST, E.CODMODLOTE, E.NRODIASVALID" +
					  " FROM PPESTRUTURA E, EQPRODUTO PD " +
					  " WHERE PD.CODEMP=E.CODEMP AND PD.CODFILIAL=E.CODFILIAL AND E.CODPROD=PD.CODPROD " +
					    sWhere+
					  " ORDER BY "+sValores[0];

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
		
		ps = con.prepareStatement(sSQL);
		rs = ps.executeQuery();
		  
		imp.limpaPags();
		
		while ( rs.next() ) {
		   if (imp.pRow()==0) {
		      imp.impCab(136, true);
		      imp.say(imp.pRow()+0,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",133)+"|");
		      imp.say(imp.pRow()+1,0,"| C�d.prod.");
		      imp.say(imp.pRow()+0,13,"| Descri��o do produto");
		      imp.say(imp.pRow()+0,50,"| Seq.Est.");
		      imp.say(imp.pRow()+0,60,"| Qtd.");
		      imp.say(imp.pRow()+0,70,"| Descri��o");
		      imp.say(imp.pRow()+0,101,"| Ativo");
		      imp.say(imp.pRow()+0,110,"| Mod.Lote");
		      imp.say(imp.pRow()+0,121,"| Valid");
		      imp.say(imp.pRow()+0,135,"|");
		   }
		   	  
		   	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",133)+"|");
		   	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"| " + rs.getString("CodProd"));
		      imp.say(imp.pRow()+0,13,"| " + rs.getString("DescProd").substring(0,34));
		      imp.say(imp.pRow()+0,50,"| " + rs.getString("SeqEst"));
		      imp.say(imp.pRow()+0,60,"| " + rs.getString("QtdEst"));
		      imp.say(imp.pRow()+0,70,"| " + rs.getString("DescEst").substring(0,29));
		      imp.say(imp.pRow()+0,100,"| " + (rs.getString("AtivoEst").equals("S") ? "Sim" : "N�o"));
		      imp.say(imp.pRow()+0,110,"| " + rs.getString("CodModLote"));
		      imp.say(imp.pRow()+0,121,"| " + rs.getString("NroDiasValid")+" Dias");
		      imp.say(imp.pRow()+0,135,"|");
		      
		   
		   if (imp.pRow()>=linPag) {
			      imp.say(imp.pRow()+1,0,""+imp.comprimido());
			      imp.say(imp.pRow()+0,0,"+"+Funcoes.replicate("=",133)+"+");
			      imp.incPags();
			      imp.eject();
		   }
		}
		imp.say(imp.pRow()+1,0,""+imp.comprimido());
	    imp.say(imp.pRow()+0,0,"+"+Funcoes.replicate("=",133)+"+");
		
	    imp.eject();
		
		imp.fechaGravacao();
		
		if (!con.getAutoCommit())
			con.commit();
		dl.dispose();
		}  
		catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro consulta tabela de estrutura do produto!\n"+err.getMessage(),true,con,err);      
		}
    }
    else if (sValores[1].equals("C")){
    	
    	String sCodProd = "";
    	String sSQL = "SELECT E.CODPROD, PD.DESCPROD, E.SEQEST, E.QTDEST, E.DESCEST, E.ATIVOEST," +
    				  " E.CODMODLOTE, E.NRODIASVALID, IT.SEQITEST, IT.CODPRODPD, PI.DESCPROD, IT.QTDITEST," +
    				  " IT.CODFASE, F.DESCFASE, IT.RMAAUTOITEST" +
					  " FROM PPESTRUTURA E, PPITESTRUTURA IT, EQPRODUTO PD, EQPRODUTO PI, PPFASE F " +
					  " WHERE E.CODPROD=PD.CODPROD AND E.CODEMP=PD.CODEMP AND E.CODFILIAL=PD.CODFILIAL" +
					  " AND IT.CODPROD=E.CODPROD AND IT.SEQEST=E.SEQEST AND IT.CODEMP=E.CODEMP AND IT.CODFILIAL=E.CODFILIAL" +
					  " AND IT.CODPRODPD=PI.CODPROD AND IT.CODEMPPD=PI.CODEMP AND IT.CODFILIALPD=PI.CODFILIAL" +
					  " AND IT.CODFASE=F.CODFASE AND IT.CODEMPFS=F.CODEMP AND IT.CODFILIALFS=F.CODFILIAL" +
					  sWhere+
					  " ORDER BY "+sValores[0]+", IT.CODPROD, IT.CODFASE";
					 
					  
    	System.out.println(sSQL);

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
		
		ps = con.prepareStatement(sSQL);
		rs = ps.executeQuery();
		
		sCodProd = txtCodProd.getVlrString();		
		int cont = 0;
		imp.limpaPags();
		
		while ( rs.next() ) {
		   if (imp.pRow()==0) {
		      imp.impCab(136, true);
		      imp.say(imp.pRow()+ 0,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate(" ",133)+"|");
		      
		   }
		   if (!sCodProd.equals(rs.getString(1))){
	   		cont=0;
	   		sCodProd = rs.getString(1);
		   }
		   if (sCodProd.equals(rs.getString(1)) && cont==0){
		      imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("=",133)+"|");
		      imp.say(imp.pRow()+1,0,"| C�d.prod.");
		      imp.say(imp.pRow()+0,13,"| Descri��o do produto");
		      imp.say(imp.pRow()+0,50,"| Seq.Est.");
		      imp.say(imp.pRow()+0,60,"| Qtd.");
		      imp.say(imp.pRow()+0,70,"| Descri��o");
		      imp.say(imp.pRow()+0,101,"| Ativo");
		      imp.say(imp.pRow()+0,110,"| Mod.Lote");
		      imp.say(imp.pRow()+0,121,"| Valid");
		      imp.say(imp.pRow()+0,135,"|");		      
		      imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("=",133)+"|");
		      
		   	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"| " + rs.getString(1));
		      imp.say(imp.pRow()+0,13,"| " + rs.getString(2).substring(0,34));
		      imp.say(imp.pRow()+0,50,"| " + rs.getString(3));
		      imp.say(imp.pRow()+0,60,"| " + rs.getString(4));
		      imp.say(imp.pRow()+0,70,"| " + rs.getString(5).substring(0,29));
		      imp.say(imp.pRow()+0,100,"| " + (rs.getString(6).equals("S") ? "Sim" : "N�o"));
		      imp.say(imp.pRow()+0,110,"| " + rs.getString(7));
		      imp.say(imp.pRow()+0,121,"| " + rs.getString(8)+" Dias");
		      imp.say(imp.pRow()+0,135,"|");
		      imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",133)+"|");
		      imp.say(imp.pRow()+1,0,"| Item");
		      imp.say(imp.pRow()+0,8,"| Cod.prod");
		      imp.say(imp.pRow()+0,20,"| Descri��o do produto");
		      imp.say(imp.pRow()+0,60,"| Qtd.");
		      imp.say(imp.pRow()+0,70,"| Cod.fase");
		      imp.say(imp.pRow()+0,80,"| Descri��o da fase");
		      imp.say(imp.pRow()+0,123,"| Auto Rma");
		      imp.say(imp.pRow()+0,135,"|");
		      imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",133)+"|");
		      cont++;
		   }
		   	  
		   	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
		      imp.say(imp.pRow()+0,0,"| " + rs.getString(9));
		      imp.say(imp.pRow()+0,8,"| " + rs.getString(10));
		      imp.say(imp.pRow()+0,20,"| " + rs.getString(11).substring(0,38));
		      imp.say(imp.pRow()+0,60,"| " + rs.getString(12));
		      imp.say(imp.pRow()+0,70,"| " + rs.getString(13));
		      imp.say(imp.pRow()+0,80,"| " + rs.getString(14).substring(0,38));
		      imp.say(imp.pRow()+0,123,"|   " + (rs.getString(15).equals("S") ? "Sim" : "N�o"));
		      imp.say(imp.pRow()+0,135,"|");
		   
		  		   
		   if (imp.pRow()>=linPag) {
			      imp.say(imp.pRow()+1,0,""+imp.comprimido());
			      imp.say(imp.pRow()+0,0,"+"+Funcoes.replicate("=",133)+"+");
			      imp.incPags();
			      imp.eject();
		   }
		}
		imp.say(imp.pRow()+1,0,""+imp.comprimido());
	    imp.say(imp.pRow()+0,0,"+"+Funcoes.replicate("=",133)+"+");
	      
		imp.eject();
		
		imp.fechaGravacao();
		
		if (!con.getAutoCommit())
			con.commit();
		dl.dispose();
		}  
		catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro consulta tabela de insumos do produto!\n"+err.getMessage(),true,con,err);      
		}
    }
    
    if (bVisualizar) {
      imp.preview(this);
    }
    else {
      imp.print();
    }
  }
  private void abreFase() {
    if (fPrim.temTela("Estrutura x Fase")==false) {
    	
      FEstFase tela = new FEstFase(txtCodProd.getVlrInteger().intValue(),txtSeqEst.getVlrInteger().intValue());
      fPrim.criatela("Estrutura x Fase",tela,con);
      tela.setConexao(con);
    }
  }
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btFase){
        abreFase();
    }
    else if (evt.getSource() == btPrevimp) {   	
        imprimir(true);
    }
    else if (evt.getSource() == btImp) 
      imprimir(false);
    super.actionPerformed(evt);
  }
  public void setConexao(Connection cn) {
    super.setConexao(cn);
    lcProd.setConexao(cn);
    lcProd2.setConexao(cn);
    lcFase.setConexao(cn);
    lcModLote.setConexao(cn);
  }
  public void afterCarrega(CarregaEvent cevt) {  	
  
  	if (cevt.getListaCampos() == lcCampos) {
        boolean bMostraBt = (lcCampos.getStatus() != ListaCampos.LCS_NONE) && (lcCampos.getStatus() != ListaCampos.LCS_INSERT);
    	btFase.setEnabled(bMostraBt);
    }
    else if (cevt.getListaCampos() == lcProd2) {
    	String sRma = txtRMA.getVlrString();
	    if (sRma.equals("S"))
	    	cbRmaAutoItEst.setEnabled(true);
    	else 
    		cbRmaAutoItEst.setEnabled(false);
    }    	
    else if (cevt.getListaCampos() == lcProd) {
    	if(txtCLoteProd.getVlrString().equals("S")){
    	    txtCodModLote.setAtivo(true);   
    	    txtNroDiasValid.setAtivo(true);
			
    	} 
    	else {
    	    txtCodModLote.setAtivo(false);
    	    txtNroDiasValid.setAtivo(false);
    	}
    }
  }      
  
  public void beforeCarrega(CarregaEvent cevt) {
  }
  public void afterPost(PostEvent pevt) { 
    if (pevt.getListaCampos() == lcCampos) {      
    	btFase.setEnabled((lcCampos.getStatus() != ListaCampos.LCS_NONE) && (lcCampos.getStatus() != ListaCampos.LCS_INSERT));        
    }  
  }
}

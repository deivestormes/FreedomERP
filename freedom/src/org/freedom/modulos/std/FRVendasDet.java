/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FRVendasDet.java <BR>
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

package org.freedom.modulos.std;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.swing.BorderFactory;

import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FRelatorio;

public class FRVendasDet extends FRelatorio {
	private static final long serialVersionUID = 1L;

  private JTextFieldPad txtDataini = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0); 
  private JTextFieldPad txtDatafim = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0); 
  private JCheckBoxPad cbVendaCanc = new JCheckBoxPad("Mostrar Canceladas", "S", "N");
  private JRadioGroup rgFaturados = null;
  private JRadioGroup rgFinanceiro = null;
  private Vector vLabsFat = new Vector();
  private Vector vValsFat = new Vector();
  private Vector vLabsFin = new Vector();
  private Vector vValsFin = new Vector();
  
  public FRVendasDet() {
    setTitulo("Vendas Detalhadas");
    setAtribos(80,80,295,240);

    vLabsFat.addElement("Faturado");
	vLabsFat.addElement("N�o Faturado");
	vLabsFat.addElement("Ambos");
	vValsFat.addElement("S");
	vValsFat.addElement("N");
	vValsFat.addElement("A");
	rgFaturados = new JRadioGroup(3, 1, vLabsFat, vValsFat);
	rgFaturados.setVlrString("S");
	
	vLabsFin.addElement("Financeiro");
	vLabsFin.addElement("N�o Finaceiro");
	vLabsFin.addElement("Ambos");
	vValsFin.addElement("S");
	vValsFin.addElement("N");
	vValsFin.addElement("A");
	rgFinanceiro = new JRadioGroup(3, 1, vLabsFin, vValsFin);
	rgFinanceiro.setVlrString("S");
	
    txtDataini.setRequerido(true);
    txtDatafim.setRequerido(true);

    GregorianCalendar cal = new GregorianCalendar();
    txtDatafim.setVlrDate(cal.getTime());
    cal.roll(Calendar.MONTH,-1);
    txtDataini.setVlrDate(cal.getTime());
    
    JLabelPad lbLinha = new JLabelPad();
    lbLinha.setBorder(BorderFactory.createEtchedBorder());
    
    adic(new JLabelPad("Periodo:"),7,5,100,20);
    adic(lbLinha,60,15,210,2);
    adic(new JLabelPad("De:"),7,30,30,20);
    adic(txtDataini,32,30,97,20);
    adic(new JLabelPad("At�:"),140,30,30,20);
    adic(txtDatafim,170,30,100,20);
	adic(rgFaturados, 7, 60, 120, 70);
	adic(rgFinanceiro, 153, 60, 120, 70);
	adic(cbVendaCanc, 7, 140, 200, 20);
	
  }
  
  public void imprimir(boolean bVisualizar) {
    boolean bComRef = comRef();
    int iCodVendaAnt = 0;
    
    if (txtDatafim.getVlrDate().before(txtDataini.getVlrDate())) {
      Funcoes.mensagemInforma(this, "Data final maior que a data inicial!");
      return;
    }

    ImprimeOS imp = new ImprimeOS("", con);
    int linPag = imp.verifLinPag()-1;
    String sCab = "";
  	String sWhere1 = "";
  	String sWhere2 = "";
  	String sWhere3 = "";
    String sDataini = "";
    String sDatafim = "";

    BigDecimal bVlrDesc = new BigDecimal("0");
    BigDecimal bVlrLiq = new BigDecimal("0");

    sDataini = txtDataini.getVlrString();
    sDatafim = txtDatafim.getVlrString();

    if(rgFaturados.getVlrString().equals("S")){
		sWhere1 = " AND TM.FISCALTIPOMOV='S' ";
		sCab += " - SO FATURADO";
	}
	else if(rgFaturados.getVlrString().equals("N")){
		sWhere1 = " AND TM.FISCALTIPOMOV='N' ";
		sCab += " - NAO FATURADO";
	}
	else if(rgFaturados.getVlrString().equals("A")){
		sWhere1 = " AND TM.FISCALTIPOMOV IN ('S','N') ";
	}	
	if(rgFinanceiro.getVlrString().equals("S")){
		sWhere2 = " AND TM.SOMAVDTIPOMOV='S' ";
		sCab += " - SO FINANCEIRO";
	}
	else if(rgFinanceiro.getVlrString().equals("N")){
		sWhere2 = " AND TM.SOMAVDTIPOMOV='N' ";
		sCab += " - NAO FINANCEIRO";
	}
	else if(rgFinanceiro.getVlrString().equals("A")){
		sWhere2 = " AND TM.SOMAVDTIPOMOV IN ('S','N') ";
	}

	if(cbVendaCanc.getVlrString().equals("N"))
		sWhere3 = " AND NOT SUBSTR(V.STATUSVENDA,1,1)='C' ";
    
    String sSQL = "SELECT (SELECT VO.CODORC FROM VDVENDAORC VO WHERE"
    		    + " VO.CODVENDA=V.CODVENDA AND VO.CODEMP=V.CODEMP"
    		    + " AND VO.CODFILIAL=V.CODFILIAL),V.CODVENDA,V.DOCVENDA,V.DTEMITVENDA,"
    		    + "V.DTSAIDAVENDA,PP.DESCPLANOPAG,V.CODCLI,C.RAZCLI,V.VLRDESCVENDA,"
    		    + "V.VLRLIQVENDA,IT.CODPROD,IT.REFPROD,"
    		    + "P.DESCPROD,IT.QTDITVENDA,IT.PRECOITVENDA,IT.VLRDESCITVENDA,"
    		    + "IT.VLRLIQITVENDA FROM VDVENDA V, FNPLANOPAG PP, VDCLIENTE C,"
    		    + "VDITVENDA IT, EQPRODUTO P , EQTIPOMOV TM WHERE V.DTEMITVENDA BETWEEN ? AND ?"
    		    + " AND V.CODEMP=? AND V.CODFILIAL=? AND PP.CODPLANOPAG=V.CODPLANOPAG"
    		    + " AND PP.CODEMP=V.CODEMPPG AND PP.CODFILIAL=V.CODFILIAL"
    		    + " AND C.CODCLI=V.CODCLI AND C.CODEMP=V.CODEMPCL"
    		    + " AND C.CODEMP=V.CODEMP AND TM.CODEMP=V.CODEMPTM AND TM.CODFILIAL=V.CODFILIALTM AND TM.CODTIPOMOV=V.CODTIPOMOV "
    		    + sWhere1 + sWhere2 + sWhere3			  
    		    + " AND C.CODFILIAL=V.CODFILIALCL AND IT.CODVENDA=V.CODVENDA"
    		    + " AND IT.CODEMP=V.CODEMP AND P.CODPROD=IT.CODPROD"
    		    + " AND P.CODEMP=IT.CODEMPPD AND P.CODFILIAL=IT.CODFILIALPD"
    		    + " AND IT.CODFILIAL=V.CODFILIAL ORDER BY V.DTEMITVENDA,V.CODVENDA";
    
    System.out.println(sSQL);
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
      ps.setDate(1, Funcoes.dateToSQLDate(txtDataini.getVlrDate()));
      ps.setDate(2, Funcoes.dateToSQLDate(txtDatafim.getVlrDate()));
      ps.setInt(3, Aplicativo.iCodEmp);
      ps.setInt(4, ListaCampos.getMasterFilial("VDVENDA"));
      rs = ps.executeQuery();
      imp.limpaPags();
      imp.montaCab();
  	  imp.setTitulo("Relat�rio de Vendas Detalhado");
  	  imp.addSubTitulo("RELATORIO DE VENDAS DETALHADO   -   PERIODO DE :"+ sDataini + " At�: " + sDatafim + sCab);
  	  
      while (rs.next()) {
        if (imp.pRow()>=(linPag-1)) {
          imp.say(imp.pRow()+1,0,""+imp.comprimido());
          imp.say(imp.pRow()+0,0,"+"+Funcoes.replicate("-",133)+"+");
          imp.incPags();
          imp.eject();
        }
        
        if (iCodVendaAnt != rs.getInt("CodVenda")) {
        	if (imp.pRow() == 0) {            	
                imp.impCab(136, true);    
                imp.say(imp.pRow() + 0, 0, "" + imp.comprimido());
                imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate(" ", 133) + "|");
            }
          imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
          imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("-", 133) + "|");
          imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
          imp.say(imp.pRow() + 0, 0, "| Pedido: ");
          imp.say(imp.pRow() + 0, 10, Funcoes.strZero(rs.getString("CodVenda"), 8));
          imp.say(imp.pRow() + 0, 25, "Doc: ");
          imp.say(imp.pRow() + 0, 30, Funcoes.strZero(rs.getString("DocVenda"), 8));
          imp.say(imp.pRow() + 0, 45, "Emiss�o: ");
          imp.say(imp.pRow() + 0, 53, Funcoes.sqlDateToStrDate(rs.getDate("DtEmitVenda")));
          imp.say(imp.pRow() + 0, 68, "Saida: ");
          imp.say(imp.pRow() + 0, 75, Funcoes.sqlDateToStrDate(rs.getDate("DtSaidaVenda")));
          imp.say(imp.pRow() + 0, 90, "Plano Pagto.: ");
          imp.say(imp.pRow() + 0, 104, Funcoes.copy(rs.getString("DescPlanoPag"), 30));
          imp.say(imp.pRow() + 0, 135, "|");
          imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
          imp.say(imp.pRow() + 0, 0, "| Cliente: ");
          imp.say(imp.pRow() + 0, 11, rs.getInt("CodCli")+" - "+rs.getString("RazCli"));
          imp.say(imp.pRow() + 0, 135, "|");
          imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
          imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("-", 133) + "|");
          imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
          imp.say(imp.pRow() + 0, 0, "| Cod/Ref");
          imp.say(imp.pRow() + 0, 16, "| Descri��o");
          imp.say(imp.pRow() + 0, 69, "| Quant.");
          imp.say(imp.pRow() + 0, 79, "| Preco");
          imp.say(imp.pRow() + 0, 94, "| Vlr.Desc.");
          imp.say(imp.pRow() + 0, 109, "| Vlr.Liq.");
          imp.say(imp.pRow() + 0, 124, "| Orcam.");
          imp.say(imp.pRow() + 0, 135, "|");
          imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
          imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("-", 133) + "|");
          bVlrDesc = rs.getBigDecimal("VlrDescVenda");
          bVlrLiq = rs.getBigDecimal("VlrLiqVenda");
         
          if (iCodVendaAnt > 0) {
            imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
            imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("-", 133) + "|");
            imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
            imp.say(imp.pRow() + 0, 0, "|");
            imp.say(imp.pRow() + 0, 64, " Totais da venda: ");
            imp.say(imp.pRow() + 0, 94, "| "+Funcoes.strDecimalToStrCurrency(12, 2, "" + bVlrDesc));
            imp.say(imp.pRow() + 0, 109, "| "+Funcoes.strDecimalToStrCurrency(12, 2, "" + bVlrLiq));
            imp.say(imp.pRow() + 0, 124, "|");
            imp.say(imp.pRow() + 0, 135, "|");
            imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
            imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("-", 133) + "|");
          }
        
        imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
        imp.say(imp.pRow() + 0, 0, "| "+(bComRef ? rs.getString("RefProd") : rs.getString("CodProd")));
        imp.say(imp.pRow() + 0, 16, "| "+rs.getString("DescProd"));
        imp.say(imp.pRow() + 0, 69, "| "+rs.getBigDecimal("QtdItVenda").setScale(1,BigDecimal.ROUND_HALF_UP));
        imp.say(imp.pRow() + 0, 79, "| "+Funcoes.strDecimalToStrCurrency(12,2,rs.getString("PrecoItVenda")));
        imp.say(imp.pRow() + 0, 94, "| "+Funcoes.strDecimalToStrCurrency(12,2,rs.getString("VlrDescItVenda")));
        imp.say(imp.pRow() + 0, 109, "| "+Funcoes.strDecimalToStrCurrency(12,2,rs.getString("VlrLiqItVenda")));
        imp.say(imp.pRow() + 0, 124, "| "+(rs.getString(1) != null ? rs.getString(1) : ""));
        imp.say(imp.pRow() + 0, 135, "|");
        iCodVendaAnt = rs.getInt("CodVenda");
        }
      }
      if (iCodVendaAnt > 0) {
        imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
        imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("-", 133) + "|");
        imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
        imp.say(imp.pRow() + 0, 0, "|");
        imp.say(imp.pRow() + 0, 64, " Totais da venda: ");
        imp.say(imp.pRow() + 0, 94, "| "+Funcoes.strDecimalToStrCurrency(12, 2, "" + bVlrDesc));
        imp.say(imp.pRow() + 0, 109, "| "+Funcoes.strDecimalToStrCurrency(12, 2, "" + bVlrLiq));
        imp.say(imp.pRow() + 0, 124, "|");
        imp.say(imp.pRow() + 0, 135, "|");
      }
      
      imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
      imp.say(imp.pRow() + 0, 0, "+" + Funcoes.replicate("=", 133) + "+");

      imp.eject();

      imp.fechaGravacao();

      //     rs.close();
      //     ps.close();
      if (!con.getAutoCommit())
        con.commit();
      //     dl.dispose();
    }
    catch (SQLException err) {
      Funcoes.mensagemErro(this, "Erro consulta tabela de pre�os!"
          + err.getMessage(),true,con,err);
    }

    if (bVisualizar) {
      imp.preview(this);
    }
    else {
      imp.print();
    }
  }
  private boolean comRef() {
    boolean bRetorno = false;
    String sSQL = "SELECT USAREFPROD FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
	  ps.setInt(1,Aplicativo.iCodEmp);
	  ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
      rs = ps.executeQuery();
      if (rs.next()) {
        if (rs.getString("UsaRefProd").trim().equals("S"))
          bRetorno = true;
      }
//      rs.close();
//      ps.close();
      if (!con.getAutoCommit())
      	con.commit();
    }
    catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao carregar a tabela PREFERE1!\n"+err.getMessage(),true,con,err);
    }
    return bRetorno;
  }
}

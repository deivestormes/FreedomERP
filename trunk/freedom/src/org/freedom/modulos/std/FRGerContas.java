/**
 * @version 24/03/2004 <BR>
 * @author Setpoint Inform�tica Ltda./Anderson Sanchez <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FRGerContas.java <BR>
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
 * Tela de op��es para o relat�rio de gerenciamento de contas.
 * 
 */

package org.freedom.modulos.std;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrinterJob;
import org.freedom.telas.FRelatorio;

public class FRGerContas extends FRelatorio  {

  private static final long serialVersionUID = 1L;
  private JTextFieldPad txtAno = new JTextFieldPad(JTextFieldPad.TP_INTEGER,4,0);
  private JTextFieldPad txtCodVend = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtNomeVend = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JCheckBoxPad cbVendas = new JCheckBoxPad("S� vendas?","S","N");
  private JCheckBoxPad cbCliPrinc = new JCheckBoxPad("Mostrar no cliente principal?","S","N");
  private JCheckBoxPad cbIncluiPed = new JCheckBoxPad("Incluir pedidos n�o faturados?","S","N");
  private JLabelPad lbCodVend = new JLabelPad("C�d.comiss.");
  private JLabelPad lbDescVend = new JLabelPad("Nome do comissionado");
  private ListaCampos lcVendedor = new ListaCampos(this);
  private Vector vLabOrdemRel = new Vector();
  private Vector vValOrdemRel = new Vector();
  private JRadioGroup rgOrdemRel = null;
  private final int TAM_GRUPO = 14;
  private JTextFieldPad txtCodGrup1 = new JTextFieldPad(JTextFieldPad.TP_STRING, TAM_GRUPO, 0);
  private JTextFieldFK txtDescGrup1 = new JTextFieldFK(JTextFieldPad.TP_STRING, 40, 0);
  private JTextFieldPad txtCodGrup2 = new JTextFieldPad(JTextFieldPad.TP_STRING, TAM_GRUPO, 0);
  private JTextFieldFK txtDescGrup2 = new JTextFieldFK(JTextFieldPad.TP_STRING, 40, 0);
  private ListaCampos lcGrup1 = new ListaCampos(this);
  private ListaCampos lcGrup2 = new ListaCampos(this);
  private JLabelPad lbCodGrup1 = new JLabelPad("C�d.grupo/somar");
  private JLabelPad lbDescCodGrup1 = new JLabelPad("Descri��o do grupo/somar");
  private JLabelPad lbCodGrup2 = new JLabelPad("C�d.grupo/subtrair");
  private JLabelPad lbDescCodGrup2 = new JLabelPad("Descri��o do grupo/subtrair");
  private final int JAN = 0;
  private final int FEV = 1;
  private final int MAR = 2;
  private final int ABR = 3;
  private final int MAI = 4;
  private final int JUN = 5;
  private final int JUL = 6;  
  private final int AGO = 7;
  private final int SET = 8;
  private final int OUT = 9;
  private final int NOV = 10;
  private final int DEZ = 11;


  public FRGerContas() {
    setTitulo("Gerenciamento de contas");
    setAtribos(80,0,500,310);

    txtAno.setRequerido(true);
    txtAno.setVlrInteger(new Integer((new GregorianCalendar()).get(Calendar.YEAR)));

    cbVendas.setVlrString("S");
    cbCliPrinc.setVlrString("S");
    cbIncluiPed.setVlrString("N");        
    
    vLabOrdemRel.addElement("Valor");
    vLabOrdemRel.addElement("Raz�o social");
    vLabOrdemRel.addElement("C�d.cli.");
    vLabOrdemRel.addElement("Cidade");
    vLabOrdemRel.addElement("Categoria");
    vLabOrdemRel.addElement("Classifica��o");
    
    vValOrdemRel.addElement("V");
    vValOrdemRel.addElement("R");
    vValOrdemRel.addElement("C");
    vValOrdemRel.addElement("D");
    vValOrdemRel.addElement("T");
    vValOrdemRel.addElement("S");
        
    rgOrdemRel = new JRadioGroup(3,2,vLabOrdemRel,vValOrdemRel);
                
	lcGrup1.add(new GuardaCampo(txtCodGrup1, "CodGrup", "C�d.grupo",ListaCampos.DB_PK, false));
	lcGrup1.add(new GuardaCampo(txtDescGrup1, "DescGrup","Descri��o do gurpo", ListaCampos.DB_SI, false));
	lcGrup1.montaSql(false, "GRUPO", "EQ");
	lcGrup1.setReadOnly(true);
	txtCodGrup1.setTabelaExterna(lcGrup1);
	txtCodGrup1.setFK(true);
	txtCodGrup1.setNomeCampo("CodGrup");

	lcGrup2.add(new GuardaCampo(txtCodGrup2, "CodGrup", "C�d.grupo",ListaCampos.DB_PK, false));
	lcGrup2.add(new GuardaCampo(txtDescGrup2, "DescGrup","Descri��o do grupo", ListaCampos.DB_SI, false));
	lcGrup2.montaSql(false, "GRUPO", "EQ");
	lcGrup2.setReadOnly(true);
	txtCodGrup2.setTabelaExterna(lcGrup2);
	txtCodGrup2.setFK(true);
	txtCodGrup2.setNomeCampo("CodGrup");
/*    
    lcSetor.add(new GuardaCampo( txtCodSetor, "CodSetor","C�d.setor", ListaCampos.DB_PK, false ));
    lcSetor.add(new GuardaCampo( txtDescSetor, "DescSetor","Descri��o do setor", ListaCampos.DB_SI, false ));
    lcSetor.montaSql(false,"SETOR","VD");
    lcSetor.setReadOnly(true);
    txtCodSetor.setTabelaExterna(lcSetor);
    txtCodSetor.setFK(true);
    txtCodSetor.setNomeCampo("CodSetor");
*/
    lcVendedor.add(new GuardaCampo( txtCodVend, "CodVend","C�d.comiss.", ListaCampos.DB_PK, false ));
    lcVendedor.add(new GuardaCampo( txtNomeVend, "NomeVend","Nome do comissionado", ListaCampos.DB_SI, false ));
    lcVendedor.montaSql(false,"VENDEDOR","VD");
    lcVendedor.setReadOnly(true);
    txtCodVend.setTabelaExterna(lcVendedor);
    txtCodVend.setFK(true);
    txtCodVend.setNomeCampo("CodVend");
    
    adic(new JLabelPad("Ordem"),280,0,80,20);
    adic(rgOrdemRel,280,20,180,70);
    adic(new JLabelPad("Ano"),7,0,250,20);
    adic(txtAno,7,20,70,20);
    adic(lbCodVend,7,45,250,20);
    adic(txtCodVend,7,65,70,20);
    adic(lbDescVend,80,45,250,20);
    adic(txtNomeVend,80,65,190,20);
	adic(lbCodGrup1, 7, 90, 250, 20);
	adic(lbDescCodGrup1, 130, 90, 250, 20);
	adic(txtCodGrup1, 7, 110, 120, 20);
	adic(txtDescGrup1, 130, 110, 327, 20);
	adic(lbCodGrup2, 7, 130, 250, 20);
	adic(lbDescCodGrup2, 130, 130, 250, 20);
	adic(txtCodGrup2, 7, 150, 120, 20);
	adic(txtDescGrup2, 130, 150, 327, 20);
    adic(cbVendas,7,180,100,25);
    adic(cbCliPrinc,110,180,250,25);
    adic(cbIncluiPed,7,205,295,25);    
  }


	private ResultSet rodaQuery() {
		String sSql = "";
		String sWhere = "";
		String sWhereCli = "";
		String sWhereTM = "";
		String sCodGrup1 = "";
		String sOrdemRel = "";
		String sOrderBy = "";
		String sCodGrup2 = "";
		String sFiltros1 = "";
		String sFiltros2 = "";

		int iCodCli = 0;
		int iCodVend = 0;
//		ImprimeOS imp = null;
		int iParam = 1;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			//imp = new ImprimeOS("", con);

			sFiltros1 = "";
			sFiltros2 = "";
			sWhereTM += " AND TM.SOMAVDTIPOMOV='S' " ;

			if (cbCliPrinc.getVlrString().equals("S")) {
				sFiltros2 += (!sFiltros2.equals("") ? " / " : "")+ "ADIC. CLIENTES PRINCIPAIS";
			}
			
			sCodGrup1 = txtCodGrup1.getVlrString().trim();
			sCodGrup2 = txtCodGrup2.getVlrString().trim();
			iCodVend = txtCodVend.getVlrInteger().intValue();
			sOrdemRel = rgOrdemRel.getVlrString();

			if (!sCodGrup1.equals("")) {
				sWhere += "AND G.CODEMP=? AND G.CODFILIAL=? AND G.CODGRUP LIKE ? ";
				sFiltros1 += (!sFiltros1.equals("") ? " / " : "") + "G.: "
						+ txtDescGrup1.getText().trim();
			}
			if (!sCodGrup2.equals("")) {
				sWhere += "AND ( NOT P.CODGRUP=? ) ";
				sFiltros1 += (!sFiltros1.equals("") ? " / " : "")
						+ " EXCL. G.: " + txtDescGrup2.getText().trim();
			}

			if (iCodVend != 0) {
				sWhere += "AND V.CODVEND=? ";
				sWhereCli = "AND C.CODVEND=? ";
				sFiltros2 += (!sFiltros2.equals("") ? " / " : "") + " REPR.: "
						+ iCodVend + "-" + txtNomeVend.getVlrString().trim();
			}

			vValOrdemRel.addElement("V");
		    vValOrdemRel.addElement("R");
		    vValOrdemRel.addElement("C");
		    vValOrdemRel.addElement("D");
		    vValOrdemRel.addElement("T");
		    vValOrdemRel.addElement("S");

			
			if (sOrdemRel.equals("V")) {
				sOrderBy = "6,2";
			} 
			else if (sOrdemRel.equals("R")) {
				sOrderBy = "2,3";
			} 
			else if (sOrdemRel.equals("C")) {
				sOrderBy = "1,2";
			}
			else if (sOrdemRel.equals("D")) {
				sOrderBy = "3,2";
			}
			else if (sOrdemRel.equals("T")) {
				sOrderBy = "4,2";
			}
			else if (sOrdemRel.equals("S")) {
				sOrderBy = "5,2";
			}

			int iAno = txtAno.getVlrInteger().intValue();
			
			java.sql.Date dtIniJan = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(JAN,iAno));
			java.sql.Date dtIniFev = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(FEV,iAno));
			java.sql.Date dtIniMar = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(MAR,iAno));
			java.sql.Date dtIniAbr = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(ABR,iAno));
			java.sql.Date dtIniMai = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(MAI,iAno));
			java.sql.Date dtIniJun = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(JUN,iAno));
			java.sql.Date dtIniJul = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(JUL,iAno));
			java.sql.Date dtIniAgo = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(AGO,iAno));
			java.sql.Date dtIniSet = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(SET,iAno));
			java.sql.Date dtIniOut = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(OUT,iAno));
			java.sql.Date dtIniNov = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(NOV,iAno));
			java.sql.Date dtIniDez = Funcoes.dateToSQLDate(Funcoes.getDataIniMes(DEZ,iAno));	
			
			java.sql.Date dtFimJan = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(JAN,iAno));
			java.sql.Date dtFimFev = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(FEV,iAno));
			java.sql.Date dtFimMar = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(MAR,iAno));
			java.sql.Date dtFimAbr = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(ABR,iAno));
			java.sql.Date dtFimMai = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(MAI,iAno));
			java.sql.Date dtFimJun = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(JUN,iAno));
			java.sql.Date dtFimJul = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(JUL,iAno));
			java.sql.Date dtFimAgo = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(AGO,iAno));
			java.sql.Date dtFimSet = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(SET,iAno));
			java.sql.Date dtFimOut = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(OUT,iAno));
			java.sql.Date dtFimNov = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(NOV,iAno));
			java.sql.Date dtFimDez = Funcoes.dateToSQLDate(Funcoes.getDataFimMes(DEZ,iAno));
				
			sSql = "SELECT C2.CODCLI,C2.RAZCLI,C2.CIDCLI,TI.SIGLATIPOCLI,CLA.SIGLACLASCLI,"
 			   	 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS JAN, "
			   	 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS FEV, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS MAR, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS ABR, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS MAI, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS JUN, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS JUL, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS AGO, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS SETE, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS OUT, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS NOV, "
				 + "  SUM((SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=C2.CODEMP AND HIS.CODFILIALCL=C2.CODFILIAL AND HIS.CODCLI=C2.CODCLI AND HIS.TIPOHISTTK='V' AND HIS.DATAHISTTK BETWEEN ? AND ? )) AS DEZ, "				
				//Vendas no ano
				 
				 
				  +" SUM((SELECT SUM(COALESCE(IV.VLRLIQITVENDA,0)) FROM VDVENDA V, VDITVENDA IV, VDVENDEDOR VD, EQPRODUTO P, EQGRUPO G,EQTIPOMOV TM, VDCLIENTE C "
				  +" WHERE V.CODEMP=? AND V.CODFILIAL=? AND V.DTEMITVENDA BETWEEN ? AND ?"
				  +" AND V.CODEMPCL=C.CODEMP AND V.CODFILIALCL=C.CODFILIAL AND V.CODCLI=C.CODCLI"
				  +" AND C2.CODEMP=C.CODEMPPQ AND C2.CODFILIAL=C.CODFILIALPQ AND C2.CODCLI=C.CODPESQ"
				  +" AND  IV.CODEMP=V.CODEMP AND IV.CODFILIAL=V.CODFILIAL AND IV.CODVENDA=V.CODVENDA AND IV.TIPOVENDA=V.TIPOVENDA"
				  +" AND VD.CODEMP=V.CODEMPVD AND VD.CODFILIAL=V.CODFILIALVD AND VD.CODVEND=V.CODVEND AND VD.CODSETOR IS NOT NULL AND P.CODEMP=IV.CODEMPPD"
				  +" AND P.CODFILIAL=IV.CODFILIALPD AND P.CODPROD=IV.CODPROD AND G.CODEMP=P.CODEMPGP AND G.CODFILIAL=P.CODFILIALGP "
				  +" AND TM.CODEMP=V.CODEMPTM  AND TM.CODFILIAL=V.CODFILIALTM AND TM.CODTIPOMOV=V.CODTIPOMOV AND ( NOT SUBSTR(V.STATUSVENDA,1,1)='C' )  AND TM.SOMAVDTIPOMOV='S'"
					+ sWhereTM  
					+ (sCodGrup1.equals("") ? " AND P.CODGRUP=G.CODGRUP " : " AND SUBSTR(P.CODGRUP,1," + sCodGrup1.length() + ")=G.CODGRUP ")						  
				  		+ sWhere +")) VENDASATUAL,"

				 //Vendas no ano anterior
					
				  +" SUM((SELECT SUM(COALESCE(IV.VLRLIQITVENDA,0)) FROM VDVENDA V, VDITVENDA IV, VDVENDEDOR VD, EQPRODUTO P, EQGRUPO G,EQTIPOMOV TM, VDCLIENTE C "
				  +" WHERE V.CODEMP=? AND V.CODFILIAL=? AND V.DTEMITVENDA BETWEEN ? AND ?"
				  +" AND V.CODEMPCL=C.CODEMP AND V.CODFILIALCL=C.CODFILIAL AND V.CODCLI=C.CODCLI"
				  +" AND C2.CODEMP=C.CODEMPPQ AND C2.CODFILIAL=C.CODFILIALPQ AND C2.CODCLI=C.CODPESQ"
				  +" AND  IV.CODEMP=V.CODEMP AND IV.CODFILIAL=V.CODFILIAL AND IV.CODVENDA=V.CODVENDA AND IV.TIPOVENDA=V.TIPOVENDA"
				  +" AND VD.CODEMP=V.CODEMPVD AND VD.CODFILIAL=V.CODFILIALVD AND VD.CODVEND=V.CODVEND AND VD.CODSETOR IS NOT NULL AND P.CODEMP=IV.CODEMPPD"
				  +" AND P.CODFILIAL=IV.CODFILIALPD AND P.CODPROD=IV.CODPROD AND G.CODEMP=P.CODEMPGP AND G.CODFILIAL=P.CODFILIALGP "
				  +" AND TM.CODEMP=V.CODEMPTM  AND TM.CODFILIAL=V.CODFILIALTM AND TM.CODTIPOMOV=V.CODTIPOMOV AND ( NOT SUBSTR(V.STATUSVENDA,1,1)='C' )  AND TM.SOMAVDTIPOMOV='S'"
					+ sWhereTM + 
					 (sCodGrup1.equals("") ? " AND P.CODGRUP=G.CODGRUP " : " AND SUBSTR(P.CODGRUP,1," + sCodGrup1.length() + ")=G.CODGRUP ")						  
				  		+ sWhere +")) VENDASANTERIOR,"
					  
					//meta estimada para ano seguinte					
					+" SUM((SELECT COALESCE(CM.VLRMETAVEND,0) FROM VDCLIMETAVEND CM WHERE CM.CODEMP=C2.CODEMP AND " +
					"CM.CODFILIAL=C2.CODFILIAL AND CM.CODCLI=C2.CODCLI AND " +
					"ANOMETAVEND=("+txtAno.getVlrInteger()+"+1))) AS VENDASMETA "					
					
					//From principal
					
					+ " FROM VDTIPOCLI TI, VDCLIENTE C, VDCLIENTE C2, VDCLASCLI CLA "

					//Where principal
					
					+ " WHERE CLA.CODEMP=C2.CODEMPCC AND CLA.CODFILIAL=C2.CODFILIALCC AND CLA.CODCLASCLI=C2.CODCLASCLI AND "					
					+ (cbCliPrinc.getVlrString().equals("S") ? "C2.CODEMP=C.CODEMPPQ AND C2.CODFILIAL=C.CODFILIALPQ AND C2.CODCLI=C.CODPESQ AND "
							: "C2.CODEMP=C.CODEMP AND C2.CODFILIAL=C.CODFILIAL AND C2.CODCLI=C.CODCLI AND ")
					+ "TI.CODEMP=C2.CODEMPTI AND TI.CODFILIAL=C2.CODFILIALTI AND "
					+ "TI.CODTIPOCLI=C2.CODTIPOCLI "+sWhereCli 
					+ " GROUP BY 1,2,3,4,5 " + "ORDER BY " + sOrderBy;
														
			
			System.out.println(sSql);

			try {
				ps = con.prepareStatement(sSql);
								
				ps.setDate(iParam++,dtIniJan);
				ps.setDate(iParam++,dtFimJan);
				ps.setDate(iParam++,dtIniFev);
				ps.setDate(iParam++,dtFimFev);
				ps.setDate(iParam++,dtIniMar);
				ps.setDate(iParam++,dtFimMar);
				ps.setDate(iParam++,dtIniAbr);
				ps.setDate(iParam++,dtFimAbr);
				ps.setDate(iParam++,dtIniMai);
				ps.setDate(iParam++,dtFimMai);
				ps.setDate(iParam++,dtIniJun);
				ps.setDate(iParam++,dtFimJun);
				ps.setDate(iParam++,dtIniJul);
				ps.setDate(iParam++,dtFimJul);
				ps.setDate(iParam++,dtIniAgo);
				ps.setDate(iParam++,dtFimAgo);
				ps.setDate(iParam++,dtIniSet);
				ps.setDate(iParam++,dtFimSet);
				ps.setDate(iParam++,dtIniOut);
				ps.setDate(iParam++,dtFimOut);
				ps.setDate(iParam++,dtIniNov);
				ps.setDate(iParam++,dtFimNov);
				ps.setDate(iParam++,dtIniDez);
				ps.setDate(iParam++,dtFimDez);
				
				ps.setInt(iParam++, Aplicativo.iCodEmp);
				ps.setInt(iParam++, ListaCampos.getMasterFilial("VDVENDA"));

				ps.setDate(iParam++,Funcoes.dateToSQLDate(Funcoes.getDataIniMes(JAN,iAno)));
				ps.setDate(iParam++,Funcoes.dateToSQLDate(Funcoes.getDataFimMes(DEZ,iAno)));										
				
				if (!sCodGrup1.equals("")) {
					ps.setInt(iParam, Aplicativo.iCodEmp);
					ps.setInt(iParam + 1, ListaCampos.getMasterFilial("EQGRUPO"));
					ps.setString(iParam + 2, sCodGrup1 + (sCodGrup1.length() < TAM_GRUPO ? "%" : ""));
					iParam += 3;
				}
				if (!sCodGrup2.equals("")) {
					ps.setString(iParam, sCodGrup2);
					iParam += 1;
				}
				if (iCodVend != 0) {
					ps.setInt(iParam, iCodVend);
					iParam += 1;
				}
				if (iCodCli != 0) {
					ps.setInt(iParam, iCodCli);
					iParam += 1;
				}

				ps.setInt(iParam++, Aplicativo.iCodEmp);
				ps.setInt(iParam++, ListaCampos.getMasterFilial("VDVENDA"));
				
				ps.setDate(iParam++,Funcoes.dateToSQLDate(Funcoes.getDataIniMes(JAN,iAno-1)));
				ps.setDate(iParam++,Funcoes.dateToSQLDate(Funcoes.getDataFimMes(DEZ,iAno-1)));										

				if (!sCodGrup1.equals("")) {
					ps.setInt(iParam, Aplicativo.iCodEmp);
					ps.setInt(iParam + 1, ListaCampos.getMasterFilial("EQGRUPO"));
					ps.setString(iParam + 2, sCodGrup1 + (sCodGrup1.length() < TAM_GRUPO ? "%" : ""));
					iParam += 3;
				}
				if (!sCodGrup2.equals("")) {
					ps.setString(iParam, sCodGrup2);
					iParam += 1;
				}
				if (iCodVend != 0) {
					ps.setInt(iParam, iCodVend);
					iParam += 1;
				}
				if (iCodCli != 0) {
					ps.setInt(iParam, iCodCli);
					iParam += 1;
				}

				if (iCodVend != 0) {
					ps.setInt(iParam, iCodVend);
					iParam += 1;
				}
				
				rs = ps.executeQuery();

			} 
			catch (SQLException err) {
				Funcoes.mensagemErro(this, "Erro executando a consulta.\n"+ err.getMessage(),true,con,err);
				err.printStackTrace();
			}			
		} 
		finally {
			sWhere = null;
			sSql = null;
			sCodGrup1 = null;
			sCodGrup2 = null;
			sOrdemRel = null;
			sOrderBy = null;
			iCodVend = 0;
			iCodCli = 0;
			sWhereTM = null;
			sFiltros1 = null;
			sFiltros2 = null;
			//imp = null;
			ps = null;
		}
		return rs;

	}
	
  public void imprimir(boolean bVisualizar) {
	    
	FPrinterJob dlGr = null;
//	HashMap hParam = new HashMap();
//	hParam.put("ANO",txtAno.getVlrInteger());
//	hParam.put("CODEMPVEND",new Integer(lcVendedor.getCodEmp()));
//	hParam.put("CODFILIALVEND",new Integer(lcVendedor.getCodFilial()));
//	hParam.put("CODVEND",txtCodVend.getVlrInteger());
//	hParam.put("ORDEM",rgOrdemRel.getVlrString());
	/*	
	String sSql = "SELECT CLI.CODCLI,CLI.RAZCLI,CLI.CIDCLI,TC.SIGLATIPOCLI,CLA.SIGLACLASCLI, " +
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =1) AS JAN, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =2) AS FEV, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =3) AS MAR, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =4) AS ABR, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =5) AS MAI, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =6) AS JUN, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =7) AS JUL, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =8) AS AGO, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =9) AS SETE, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =10) AS OUT, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =11) AS NOV, "+
	"  (SELECT (CAST((COALESCE(SUM(1),0)) AS INTEGER)) FROM TKHISTORICO HIS WHERE HIS.CODEMPCL=CLI.CODEMP AND HIS.CODFILIALCL=CLI.CODFILIAL AND HIS.CODCLI=CLI.CODCLI AND HIS.TIPOHISTTK='V' AND EXTRACT(YEAR FROM HIS.DATAHISTTK)="+txtAno.getVlrInteger()+" AND EXTRACT(MONTH FROM HIS.DATAHISTTK) =12) AS DEZ, "+
	"  (SELECT COALESCE(SUM(IV.VLRLIQITVENDA),0) FROM VDVENDA V, VDITVENDA IV, EQTIPOMOV TM  "+
	"	WHERE V.CODCLI=CLI.CODCLI and V.CODEMPCL=CLI.CODEMP AND V.CODFILIALCL=CLI.CODFILIAL  "+
	"        AND EXTRACT(YEAR FROM V.DTEMITVENDA)="+txtAno.getVlrInteger()+"  "+
	"	AND IV.CODEMP=V.CODEMP AND IV.CODFILIAL=V.CODFILIAL AND IV.CODVENDA=V.CODVENDA AND IV.TIPOVENDA=V.TIPOVENDA "+
	"        AND TM.CODEMP=V.CODEMPTM AND TM.CODFILIAL=V.CODFILIALTM AND TM.CODTIPOMOV=V.CODTIPOMOV "+
	"        AND TM.SOMAVDTIPOMOV='S') AS VENDASATUAL, "+
	"  (SELECT COALESCE(SUM(IV.VLRLIQITVENDA),0) FROM VDVENDA V, VDITVENDA IV, EQTIPOMOV TM "+ 
	"	WHERE V.CODCLI=CLI.CODCLI and V.CODEMPCL=CLI.CODEMP AND V.CODFILIALCL=CLI.CODFILIAL  "+
	"        AND EXTRACT(YEAR FROM V.DTEMITVENDA)=("+txtAno.getVlrInteger()+"-1)  "+
	"	AND IV.CODEMP=V.CODEMP AND IV.CODFILIAL=V.CODFILIAL AND IV.CODVENDA=V.CODVENDA AND IV.TIPOVENDA=V.TIPOVENDA "+
	"        AND TM.CODEMP=V.CODEMPTM AND TM.CODFILIAL=V.CODFILIALTM AND TM.CODTIPOMOV=V.CODTIPOMOV "+
	"        AND TM.SOMAVDTIPOMOV='S') AS VENDASANTERIOR, " +
	"  (SELECT COALESCE(CM.VLRMETAVEND,0) FROM VDCLIMETAVEND CM WHERE CM.CODEMP=CLI.CODEMP AND CM.CODFILIAL=CLI.CODFILIAL AND CM.CODCLI=CLI.CODCLI AND ANOMETAVEND=("+txtAno.getVlrInteger()+"+1)) AS VENDASMETA " + 
	"FROM VDCLIENTE CLI, VDCLASCLI CLA, VDTIPOCLI TC WHERE CLA.CODEMP=CLI.CODEMPCC AND CLA.CODFILIAL=CLI.CODFILIALCC AND CLA.CODCLASCLI=CLI.CODCLASCLI "+
	"AND TC.CODEMP=CLI.CODEMPTC AND TC.CODFILIAL=CLI.CODFILIALTC AND TC.CODTIPOCLI=CLI.CODTIPOCLI "+
	"AND CLI.CODVEND=? AND CLI.CODEMPVD=? AND CODFILIALVD=? "+ 
	"ORDER BY "+rgOrdemRel.getVlrString(); 
*/
	dlGr = new FPrinterJob("relatorios/gercontas.jasper","Gerenciamento de contas","",rodaQuery(),this);	
	
	
	
	
//	dlGr = new FPrinterJob("relatorios/gercontas.jasper","Gerenciamento de contas","",this,hParam,con); 
			
			
	if(bVisualizar)
		dlGr.setVisible(true);  
	else{			
		try {
			JasperPrintManager.printReport(dlGr.getRelatorio(),true);
		}
		catch(Exception err){
			Funcoes.mensagemErro(this,"Erro na impress�o de recursos de produ��o!"+err.getMessage(),true,con,err);
		}
	}
	
	
	
  }

  public void setConexao(Connection cn) {
    super.setConexao(cn);
//    lcSetor.setConexao(cn);
    lcVendedor.setConexao(cn);
    lcGrup1.setConexao(cn);
    lcGrup2.setConexao(cn);
    
  }
  
  
  
}

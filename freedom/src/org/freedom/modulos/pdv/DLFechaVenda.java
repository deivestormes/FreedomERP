package org.freedom.modulos.pdv;

/**
 * @version 30/06/2004 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.pdv <BR>
 * Classe: @(#)FFechaVenda.java <BR>
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

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.comutacao.Tef;
import org.freedom.drivers.JBemaFI32;
import org.freedom.funcoes.Funcoes;
import org.freedom.funcoes.Logger;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;

public class DLFechaVenda extends FFDialogo implements FocusListener {
	private JTextFieldPad txtCodPlanoPag = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
	private JTextFieldFK txtDescPlanoPag = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
	private JTextFieldFK txtVlrCupom = new JTextFieldFK(JTextFieldPad.TP_DECIMAL,12,2);
	private JTextFieldPad txtVlrDinheiro = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,12,2);
	private JTextFieldPad txtVlrCheque = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,12,2);
	private JTextFieldPad txtVlrChequeElet = new JTextFieldPad(JTextFieldPad.TP_DECIMAL,12,2);
	private JTextFieldFK txtVlrPago = new JTextFieldFK(JTextFieldPad.TP_DECIMAL,12,2);
	private JTextFieldFK txtVlrTroco = new JTextFieldFK(JTextFieldPad.TP_DECIMAL,12,2);
	private ListaCampos lcPlanoPag = new ListaCampos(this,"PG");
	private JBemaFI32 bf = (FreedomPDV.bECFTerm ? new JBemaFI32() : null);
	private Tef tef = null;
	private int iCodVenda = 0;
	private int iNumCupom = 0;
	public DLFechaVenda(BigDecimal valCupom, int iCodVenda, int iNumCupom) {
		super(Aplicativo.telaPrincipal);
		setTitulo("Fechamento de venda");
		setAtribos(330,275);
		
		this.iCodVenda = iCodVenda;
		this.iNumCupom = iNumCupom;
		
		txtVlrCupom.setVlrBigDecimal(valCupom);
		
		lcPlanoPag.add(new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_PK, true));
		lcPlanoPag.add(new GuardaCampo( txtDescPlanoPag, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI,false));
		lcPlanoPag.montaSql(false, "PLANOPAG", "FN");
		lcPlanoPag.setReadOnly(true);
		txtCodPlanoPag.setTabelaExterna(lcPlanoPag);
		txtCodPlanoPag.setFK(true);
		
		adic(new JLabel("C�d.p.pag."),7,5,250,15);
		adic(txtCodPlanoPag,7,20,80,20);
		adic(new JLabel("Descri��o da forma de pagamento"),90,5,250,15);
		adic(txtDescPlanoPag,90,20,200,20);
		
		JLabel lbLinha = new JLabel();
		lbLinha.setBorder(BorderFactory.createEtchedBorder());
		
		adic(lbLinha,7,50,300,2);
		
		adic(new JLabel("Valor total do cupom: "),7,60,150,20);
		adic(txtVlrCupom,160,60,100,20);
		adic(new JLabel("Valor em dinheiro: "),7,85,150,20);
		adic(txtVlrDinheiro,160,85,100,20);
		adic(new JLabel("Valor em cheque: "),7,110,150,20);
		adic(txtVlrCheque,160,110,100,20);
		adic(new JLabel("Valor em ch. elet./cart�o: "),7,135,150,20);
		adic(txtVlrChequeElet,160,135,100,20);
		adic(new JLabel("Valor pago: "),7,160,150,20);
		adic(txtVlrPago,160,160,100,20);
		adic(new JLabel("Valor troco: "),7,185,150,20);
		adic(txtVlrTroco,160,185,100,20);
		
		txtVlrDinheiro.addFocusListener(this);
		txtVlrCheque.addFocusListener(this);
		txtVlrChequeElet.addFocusListener(this);
		
	}
	private boolean processaTef() {
		boolean bRet = false;
		Properties retTef = tef.solicVenda(iNumCupom, txtVlrChequeElet.getVlrBigDecimal());
		
		if (retTef == null)
			return false;
/*		
		bf.iniciaModoTef(Aplicativo.strUsuario,FreedomPDV.bModoDemo);
		bf.abreComprovanteNaoFiscalVinculado(Aplicativo.strUsuario,"Cartao",FreedomPDV.bModoDemo);
		bf.usaComprovanteNaoFiscalVinculadoTEF(Aplicativo.strUsuario,"Linha a ser Impressa...",FreedomPDV.bModoDemo);
		bf.fechaComprovanteNaoFiscalVinculado(Aplicativo.strUsuario,FreedomPDV.bModoDemo);
        bf.finalizaModoTEF();
*/
		
		return bRet;
			
	}
	private boolean verifCaixa() {
		boolean bRetorno = false;
		int iRet = -1;
		try {
			String sSQL = "SELECT * FROM PVVERIFCAIXASP (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iNumEst);
			ps.setInt(2,Aplicativo.iCodEmp);
			ps.setInt(3,ListaCampos.getMasterFilial("PVCAIXA"));
			ps.setDate(4,Funcoes.dateToSQLDate(new Date()));
			ps.setInt(5,Aplicativo.iCodFilial);
			ps.setString(6,Aplicativo.strUsuario);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				iRet = rs.getInt(1);
			}
			rs.close();
			ps.close();
		}
		catch(SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao verificar o caixa!!\n"+err.getMessage());
		}
		if (iRet != 4 && iRet != 2)
			Funcoes.mensagemErro(this,"Caixa n�o esta aberto!!");
		else
			bRetorno = true;
		return bRetorno;
	}
	private boolean gravaVenda() {
		boolean bRet = false;
		String sSQL = "UPDATE VDVENDA SET STATUSVENDA='V2' WHERE CODEMP=?" +
		" AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='E'";
		try {
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("VDVENDA"));
			ps.setInt(3,iCodVenda);
			ps.executeUpdate();
			bRet = true;
		}
		catch (SQLException err) {
			Logger.gravaLogTxt("",Aplicativo.strUsuario,Logger.LGEB_BD,"Erro ao gravar a venda: "+err.getMessage());
		}
		return bRet;
	}
	private void finalizaVenda() {
		String sSQL = "UPDATE VDVENDA SET STATUSVENDA='V3' WHERE CODEMP=?" +
		" AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='E'";
		try {
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("VDVENDA"));
			ps.setInt(3,iCodVenda);
			ps.executeUpdate();
		}
		catch (SQLException err) {
			Logger.gravaLogTxt("",Aplicativo.strUsuario,Logger.LGEB_BD,"Erro ao finalizar a venda: "+err.getMessage());
		}
	}
	private boolean execFechamento() {
		boolean bRet = false;
		if (txtVlrPago.getVlrDouble().doubleValue() == 0) {
			Funcoes.mensagemInforma(this,"Digite o valor pago!");
			return false;
		}
		else if (txtCodPlanoPag.getVlrInteger().intValue() == 0) {
			Funcoes.mensagemInforma(this,"Digite o c�digo da forma de pagamento!");
			return false;
		}
		else if (txtVlrPago.getVlrDouble().doubleValue() < txtVlrCupom.getVlrDouble().doubleValue()) {
			Funcoes.mensagemInforma(this,"Valor pago menor que o valor da venda!");
			return false;
		}
		else if (txtVlrChequeElet.getVlrDouble().doubleValue() > 0 && processaTef())
			return false;
		else if (!gravaVenda()) 
			return false;
		try {
			
//			Fecha a venda:			

			String sSQL = "EXECUTE PROCEDURE PVFECHAVENDASP(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("PVMOVCAIXA"));
			ps.setBigDecimal(3,txtVlrPago.getVlrBigDecimal());
			ps.setInt(4,Aplicativo.iNumEst);
			ps.setDate(5,Funcoes.dateToSQLDate(new Date()));
			ps.setString(6,Aplicativo.strUsuario);
			ps.execute();
			ps.close();
	      	if (!con.getAutoCommit())
	      		con.commit();
			bRet = true;
		}
		catch (SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao executar fechamento!\n"+err.getMessage());
			Logger.gravaLogTxt("",Aplicativo.strUsuario,Logger.LGEB_BD,"Erro ao executar fechamento.");
		}
		return bRet;
	}
	private boolean execTroco() {
		boolean bRet = false;
		
// Sangria para o troco:		
		
		try {
			String sSQL = "EXECUTE PROCEDURE PVSANGRIASP(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,ListaCampos.getMasterFilial("PVMOVCAIXA"));
			ps.setBigDecimal(3,txtVlrTroco.getVlrBigDecimal());
			ps.setInt(4,Aplicativo.iNumEst);
			ps.setDate(5,Funcoes.dateToSQLDate(new Date()));
			ps.setString(6,Aplicativo.strUsuario);
			ps.execute();
			ps.close();
			if (!con.getAutoCommit())
				con.commit();
			bRet = true;
		}
		catch (SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao executar o troco!\n"+err.getMessage());
			Logger.gravaLogTxt("",Aplicativo.strUsuario,Logger.LGEB_BD,"Erro ao executar o troco.");
		}
		return bRet;
	}
	private void recalcPago() {
		txtVlrPago.setVlrBigDecimal(
				txtVlrDinheiro.getVlrBigDecimal().add(
						txtVlrCheque.getVlrBigDecimal().add(
								txtVlrChequeElet.getVlrBigDecimal()
						)
				)
		);
		txtVlrTroco.setVlrBigDecimal(
				txtVlrPago.getVlrBigDecimal().subtract(
						txtVlrCupom.getVlrBigDecimal()
				)
		);
	}
	private int buscaPlanoPag() {
		int iRet = 0;
		String sSQL = "SELECT CODPLANOPAG FROM SGPREFERE4 WHERE " +
		"CODEMP=? AND CODFILIAL=?";
		try {
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1,Aplicativo.iCodEmp);
			ps.setInt(2,Aplicativo.iCodFilial);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				iRet = rs.getInt("CodPlanoPag");
			}
			rs.close();
			ps.close();
		}
		catch(SQLException err) {
			Funcoes.mensagemErro(this,"Erro ao buscar o plano de pagemento.\n"+
					"Provavelmente n�o foram gravadas corretamente as prefer�ncias!\n"+err.getMessage());
			Logger.gravaLogTxt("",Aplicativo.strUsuario,Logger.LGEB_BD,"Erro ao buscar o plano de pagemento.");
		}
		return iRet;
	}
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == btOK) {
			if (execFechamento()) {
				if (FreedomPDV.bECFTerm)
					if (bf.fechaCupomFiscal(Aplicativo.strUsuario,Funcoes.copy(txtDescPlanoPag.getVlrString(),16),"","",0.0,txtVlrPago.getVlrDouble().doubleValue(),"",FreedomPDV.bModoDemo))
						finalizaVenda();
			    if (txtVlrTroco.getVlrDouble().doubleValue() > 0)
					execTroco();
			}
			else
				return;
		}
		super.actionPerformed(evt);
	}
	public void focusLost(FocusEvent fevt) {
		if (fevt.getSource() == txtVlrDinheiro ||
				fevt.getSource() == txtVlrCheque ||
				fevt.getSource() == txtVlrChequeElet) {
			recalcPago();
		}
	}
	public void focusGained(FocusEvent arg0) { }
	public void setTef(Tef tef) {
		this.tef = tef; 
	}
	public void setConexao(Connection cn) {
		super.setConexao(cn);
		lcPlanoPag.setConexao(cn);
		txtCodPlanoPag.setVlrInteger(new Integer(buscaPlanoPag()));
		lcPlanoPag.carregaDados();
	}
}


/**
 * @version 14/11/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.telas <BR>
 * Classe:
 * @(#)FPrincipal.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para
 * Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste
 * Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc�
 * pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa �
 * preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios para a classe...
 */

package org.freedom.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import org.freedom.bmps.Icone;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JMenuPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.StatusBar;
import org.freedom.funcoes.Funcoes;
import org.freedom.modulos.atd.FAgenda;

public class FPrincipal extends JFrame implements ActionListener {

	private Connection con = null;
    
	public JMenuBar bar = new JMenuBar();

	private JToolBar tBar = new JToolBar();

	// public JMenuPad arquivoMenu = new JMenuPad();
	private JMenuItem sairMI = new JMenuItem();

	private Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

	private JButton btCalc = new JButton(Icone.novo("btCalc.gif"));

	private JButton btAgenda = new JButton(Icone.novo("btAgenda.gif"));

	public JPanelPad pinBotoesDir = new JPanelPad();

	public Container c = getContentPane();

	public JDesktopPane dpArea = new JDesktopPane();

	public StatusBar statusBar = new StatusBar();
	
	public FPrincipal(String sImgFundo) {
		c.setLayout(new BorderLayout());

		JPanelPad pn = new JPanelPad(JPanelPad.TP_JPANEL);
		pn.setLayout(new GridLayout(1, 1));

		setJMenuBar(bar);

		sairMI.setText("Sair");
		sairMI.setMnemonic('r');

		c.add(pn);

		btCalc.setPreferredSize(new Dimension(34, 34));
		btCalc.setToolTipText("Calculadora");
		btCalc.addActionListener(this);

		btAgenda.setPreferredSize(new Dimension(34, 34));
		btAgenda.setToolTipText("Agenda");
		btAgenda.addActionListener(this);
		pinBotoesDir.setBorder(null);
		c.add(tBar, BorderLayout.NORTH);
		tBar.setLayout(new BorderLayout());
		pinBotoesDir.setPreferredSize(new Dimension(102, 34));
		tBar.add(pinBotoesDir, BorderLayout.EAST);

		pinBotoesDir.add(btCalc);
		pinBotoesDir.add(btAgenda);

		montaStatus();

		int iWidthArea = (int) tela.getWidth();
		int iHeightArea = (int) tela.getHeight();
		
		setSize(iWidthArea, iHeightArea - 50);

		setExtendedState(MAXIMIZED_BOTH);
		c.add(dpArea, BorderLayout.CENTER);

//		dpArea.setBackground(new Color(69,62,113));
		dpArea.setBackground(new Color(153,153,204));

		ImageIcon icFundo = Icone.novo(sImgFundo); 
		JLabelPad lbFundo = new JLabelPad(icFundo);
	  	ImageIcon icStpinf = Icone.novo("lgSTP.jpg"); 
		JLabelPad lbStpinf = new JLabelPad(icStpinf);
	  	ImageIcon icFreedom = Icone.novo("lgFreedom.jpg"); 
		JLabelPad lbFreedom = new JLabelPad(icFreedom);

		int iWidthImgFundo = icFundo.getIconWidth();
		int iHeightImgFundo = icFundo.getIconHeight();
		int iWidthImgStpinf = icStpinf.getIconWidth();
		int iHeightImgStpinf = icStpinf.getIconHeight();
		int iWidthImgFreedom = icFreedom.getIconWidth();
		int iHeightImgFreedom = icFreedom.getIconHeight();
		
	    lbFundo.setBounds((iWidthArea/2)-(iWidthImgFundo/2),((iHeightArea-200)/2)-(iHeightImgFundo/2),iWidthImgFundo,iHeightImgFundo);
	    lbStpinf.setBounds(20,iHeightArea-250,iWidthImgStpinf,iHeightImgStpinf);
	    lbFreedom.setBounds(iWidthArea-155,iHeightArea-265,iWidthImgFreedom,iHeightImgFreedom);
	    
	    dpArea.add(lbFundo);
	    dpArea.add(lbStpinf);
	    dpArea.add(lbFreedom);

		sairMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecharJanela();
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				fecharJanela();
			}
		});

	}

	public void addKeyListerExterno(KeyListener arg0) {
		this.addKeyListener(arg0);
		btCalc.addKeyListener(arg0);
		bar.addKeyListener(arg0);
		tBar.addKeyListener(arg0);
		btAgenda.addKeyListener(arg0);
	}

	public void montaStatus() {
		c.add(statusBar, BorderLayout.SOUTH);
	}

	public void remConFilial() {
		String sSQL = "EXECUTE PROCEDURE SGFIMCONSP(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1, Aplicativo.iCodEmp);
			ps.setInt(2, Aplicativo.iCodFilialPad);
			ps.setString(3, Aplicativo.strUsuario);
			ps.execute();
			ps.close();
			if (!con.getAutoCommit())
				con.commit();
		} catch (SQLException err) {
			Funcoes.mensagemErro(this,
					"Erro ao remover filial ativa no banco!\n"
							+ err.getMessage());
		}
	}

	public void setConexao(Connection conGeral) {
		con = conGeral;
	}

	public void fecharJanela() {
		if (con != null) {
			try {
				remConFilial();
				con.close();
			} catch (java.sql.SQLException e) {
				Funcoes
						.mensagemErro(this,
								"N�o foi poss�vel fechar a conexao com o banco de dados!");
			}
		}
		System.exit(0);
	}

	public void adicFilha(Container filha) {
		dpArea.add(filha);
	}

	public void adicMenu(JMenuPad menu) {
		bar.add(menu);
	}

	/*
	 * public void adicItemArq(JMenuItemPad menu) { arquivoMenu.add(menu); }
	 * 
	 * public void setMenu() { arquivoMenu.addSeparator();
	 * arquivoMenu.add(sairMI);
	 *  } public void tiraEmp() { arquivoMenu.remove(0); }
	 */
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == btCalc) {
			Calc calc = new Calc();
			dpArea.add("Calc", calc);
			calc.show();
		} else if (evt.getSource() == btAgenda) {
			if (this.temTela("Agenda") == false) {
				FAgenda tela = new FAgenda();
				this.criatela("Agenda", tela, con);
			}
		}

	}

	public boolean temTela(String nome) {
		boolean retorno = false;
		int i = 0;

		JInternalFrame[] telas = dpArea.getAllFrames();
		JInternalFrame tela = null;

		while (true) {

			try {
				tela = telas[i];
			} catch (java.lang.Exception e) {
				break;
			}

			if (tela == null) {
				break;
			} else if (tela.getName() == null) {
				i++;
				continue;
			} else if (tela.getName().equals(nome)) {
				try {
					tela.setSelected(true);
				} catch (Exception e) {
				}
				retorno = true;
				break;
			}

			i++;
		}

		return retorno;

	}

	public JInternalFrame getTela(String nome) {
		JInternalFrame retorno = null;

		JInternalFrame[] telas = dpArea.getAllFrames();
		JInternalFrame tela = null;

		for (int i = 0; i < telas.length; i++) {

			try {
				tela = telas[i];
			} catch (java.lang.Exception e) {
				break;
			}

			if (tela == null) {
				break;
			} else if (tela.getName() == null) {
				break;
			} else if (tela.getName().equals(nome)) {
				try {
					retorno = tela;
					break;
				} catch (Exception e) {
					retorno = null;
					break;
				}
			}
		}

		return retorno;

	}
	public void criatela(String nome, FFDialogo comp, Connection cn) {
		comp.setName(nome);
		comp.setTitulo(nome);
		comp.setConexao(cn);
		comp.execShow();
	}
	public void criatela(String nome, FFilho comp, Connection cn) {
		comp.setName(nome);
		comp.setTitulo(nome);
		dpArea.add(nome, comp);
		comp.setConexao(cn);
		comp.execShow();
		try {
			comp.setSelected(true);
		} catch (Exception e) {
		}
	}

	public void criatela(String nome, FDialogo comp, Connection cn) {
		comp.setName(nome);
		comp.setTitulo(nome);
		comp.setConexao(cn);
		comp.setVisible(true);
	}

	/**
	 * Ajusta a identifica��o do sistema. <BR>
	 * 
	 * @param sDesc -
	 *            Descri��o do sistema.
	 * @param iCod -
	 *            C�digo do sistema.
	 * @param iMod -
	 *            C�digo do m�dulo.
	 *  
	 */

	public void setIdent(String sDesc, int iCod, int iMod) {
		setTitle(sDesc);
		/*
		 * arquivoMenu.setCodSistema(iCod); arquivoMenu.setCodModulo(iMod);
		 * arquivoMenu.setCodMenu(100000000); arquivoMenu.setNivel(0);
		 */
	}

	/**
	 * Adiciona um componente na barra de ferramentas. <BR>
	 * 
	 * @param comp -
	 *            Componente a ser adicionado.
	 *  
	 */

	public void adicCompInBar(Component comp, String sAling) {
		tBar.add(comp, sAling);
	}
}
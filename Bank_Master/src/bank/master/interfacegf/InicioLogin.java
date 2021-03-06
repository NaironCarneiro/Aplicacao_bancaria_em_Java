
package bank.master.interfacegf;

import bank.master.classes.LoginConta;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nairon
 */
public class InicioLogin extends javax.swing.JFrame {

	/**
	 * Creates new form InicioLogin
	 */
	public InicioLogin() {
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jFrame1 = new javax.swing.JFrame();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		usuario = new javax.swing.JTextField();
		SenhaUser = new javax.swing.JPasswordField();
		jButtonEntrar = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButtonDeposito = new javax.swing.JButton();
		mensagemErro = new javax.swing.JLabel();
		buttonCriar = new javax.swing.JButton();

		jLabel2.setText("Para acessar sua conta preencha os campos");

		jFrame1.setAlwaysOnTop(true);
		jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);

		usuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				usuarioActionPerformed(evt);
			}
		});

		jButtonEntrar.setBackground(new java.awt.Color(0, 255, 102));
		jButtonEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButtonEntrar.setText("Acessar");
		jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonEntrarActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 204, 51));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Seja bem vindo ao Banco Master");

		jLabel3.setBackground(new java.awt.Color(0, 0, 0));
		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Para acessar sua conta preencha seus dados de login");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel4.setText("Número da Conta");

		jLabel5.setText("Senha");

		jButtonDeposito.setBackground(new java.awt.Color(0, 255, 204));
		jButtonDeposito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jButtonDeposito.setText("Realizar um depósito");
		jButtonDeposito.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonDepositoActionPerformed(evt);
			}
		});

		buttonCriar.setBackground(new java.awt.Color(255, 255, 255));
		buttonCriar.setForeground(new java.awt.Color(0, 51, 204));
		buttonCriar.setText("Criar minha Conta");
		buttonCriar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonCriarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(158, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5)
												.addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(SenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4))
										.addGap(228, 228, 228))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel3).addGap(171, 171, 171))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel1).addGap(137, 137, 137))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(buttonCriar).addGap(288, 288,
												288))))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(244, 244, 244).addComponent(mensagemErro)
								.addGap(49, 49, 49).addComponent(jButtonEntrar))
						.addGroup(layout.createSequentialGroup().addGap(266, 266, 266).addComponent(jButtonDeposito)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(jLabel1).addGap(33, 33, 33)
						.addComponent(jLabel3).addGap(39, 39, 39).addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jLabel5).addGap(7, 7, 7)
						.addComponent(SenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(mensagemErro)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonEntrar)
						.addGap(21, 21, 21).addComponent(buttonCriar)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
						.addComponent(jButtonDeposito).addGap(26, 26, 26)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonDepositoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDepositoActionPerformed
		JanelaDepositar deposito = new JanelaDepositar();
		// jDesktopPane1.add(deposito);
		deposito.setVisible(true);

	}// GEN-LAST:event_jButtonDepositoActionPerformed

	private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonEntrarActionPerformed

		int user = Integer.parseInt(usuario.getText());
		String sen = String.valueOf(SenhaUser.getPassword());

		try {
			LoginConta conta = new LoginConta(user, sen);
			if (conta.login()) {
				AcoesExtras acoes = new AcoesExtras();
				acoes.setVisible(true);

				dispose();
			} else {
//               
//                if( usuario.getText().isEmpty()){
//                     JOptionPane.showMessageDialog(null, "Por Favor preencha os campos!");
//                }

				JOptionPane.showMessageDialog(null,
						"Problema de autentica��o, Por favor verifique suas credenciais e tente novamente !");
			}
		} catch (IOException ex) {
			Logger.getLogger(InicioLogin.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jButtonEntrarActionPerformed

	private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usuarioActionPerformed

	}// GEN-LAST:event_usuarioActionPerformed

	private void buttonCriarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonCriarActionPerformed
		JanelaCriarConta criar = new JanelaCriarConta();
		criar.setVisible(true);
		dispose();
	}// GEN-LAST:event_buttonCriarActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new InicioLogin().setVisible(true);

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPasswordField SenhaUser;
	private javax.swing.JButton buttonCriar;
	private javax.swing.JButton jButtonDeposito;
	private javax.swing.JButton jButtonEntrar;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JLabel mensagemErro;
	private javax.swing.JTextField usuario;
	// End of variables declaration//GEN-END:variables

	private boolean acoes(boolean b) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}
}

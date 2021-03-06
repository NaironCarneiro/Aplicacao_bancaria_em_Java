/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.master.interfacegf;

import bank.master.classes.Conta;
import bank.master.classes.LoginConta;
import java.io.IOException;

/**
 *
 * @author Nairon
 */
public class JanelaSaldo extends javax.swing.JFrame {

	/**
	 * Creates new form JanelaSaldo
	 */
	public JanelaSaldo() throws IOException {
		initComponents();

		Conta conta = new Conta();
		conta.carregarDados(LoginConta.sessao, LoginConta.numConta);
		mostrarsaldo.setText("Seu Saldo em conta é R$ " + String.valueOf(conta.getSaldo()));
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

		jLabel1 = new javax.swing.JLabel();
		buttonFechar = new javax.swing.JButton();
		mostrarsaldo = new javax.swing.JLabel();

		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setLocation(new java.awt.Point(350, 100));
		setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

		buttonFechar.setText("Fechar");
		buttonFechar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonFecharActionPerformed(evt);
			}
		});

		mostrarsaldo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(31, 31, 31)
										.addComponent(mostrarsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 476,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1))
								.addGroup(layout.createSequentialGroup().addGap(224, 224, 224)
										.addComponent(buttonFechar)))
						.addContainerGap(22, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(mostrarsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
						.addComponent(buttonFechar).addGap(23, 23, 23)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonFecharActionPerformed

		dispose();
	}// GEN-LAST:event_buttonFecharActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonFechar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel mostrarsaldo;
	// End of variables declaration//GEN-END:variables
}

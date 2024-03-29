/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MoradorJpaController;
import Controller.RepublicaJpaController;
import Model.Morador;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import View.CadastroRep;

/**
 *
 * @author Angelo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jtfLogin = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        jBtnAcesso = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfSenha = new org.edisoncor.gui.passwordField.PasswordFieldRoundBackground();
        jLabel4 = new javax.swing.JLabel();
        buttonRound2 = new org.edisoncor.gui.button.ButtonRound();
        buttonRound3 = new org.edisoncor.gui.button.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage2.setBackground(new java.awt.Color(255, 0, 0));
        panelImage2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bg.png")));
        panelImage2.setMinimumSize(new java.awt.Dimension(630, 450));
        panelImage2.setLayout(null);

        jtfLogin.setForeground(new java.awt.Color(153, 153, 153));
        jtfLogin.setToolTipText("");
        jtfLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelImage2.add(jtfLogin);
        jtfLogin.setBounds(320, 230, 168, 30);

        jBtnAcesso.setBackground(java.awt.SystemColor.textHighlight);
        jBtnAcesso.setText("acessar");
        jBtnAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcessoActionPerformed(evt);
            }
        });
        panelImage2.add(jBtnAcesso);
        jBtnAcesso.setBounds(290, 330, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/password2.png")));
        panelImage2.add(jLabel1);
        jLabel1.setBounds(280, 270, 0, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/password2.png"))); // NOI18N
        panelImage2.add(jLabel2);
        jLabel2.setBounds(280, 280, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Anotação 2019-09-28 092152.png"))); // NOI18N
        panelImage2.add(jLabel3);
        jLabel3.setBounds(260, 60, 230, 140);

        jtfSenha.setDescripcion(" "); // NOI18N
        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });
        panelImage2.add(jtfSenha);
        jtfSenha.setBounds(320, 280, 170, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user2.png"))); // NOI18N
        panelImage2.add(jLabel4);
        jLabel4.setBounds(280, 230, 30, 30);

        buttonRound2.setBackground(new java.awt.Color(255, 255, 255));
        buttonRound2.setForeground(new java.awt.Color(0, 0, 0));
        buttonRound2.setText("Cadastrar-se");
        buttonRound2.setColorDeSombra(new java.awt.Color(255, 255, 255));
        buttonRound2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });
        panelImage2.add(buttonRound2);
        buttonRound2.setBounds(230, 420, 300, 20);

        buttonRound3.setBackground(new java.awt.Color(255, 255, 255));
        buttonRound3.setForeground(new java.awt.Color(0, 0, 0));
        buttonRound3.setText("Cadastrar República");
        buttonRound3.setColorDeSombra(new java.awt.Color(255, 255, 255));
        buttonRound3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound3ActionPerformed(evt);
            }
        });
        panelImage2.add(buttonRound3);
        buttonRound3.setBounds(230, 390, 300, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcessoActionPerformed
            Morador morador = new Morador();
            Menu menu = new Menu();

        morador.setLogin(jtfLogin.getText());
        morador.setSenha(jtfSenha.getText());
        Morador usuario = new Morador();
        
        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("WeRepPU2");
        
        MoradorJpaController moradorJpaController = new MoradorJpaController(entityManagerFactory);
        morador = moradorJpaController.login(morador);
        
        if(morador.getLogin() != null){
            JOptionPane.showMessageDialog(null,"Login realizado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            menu.setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Erro! Usuario e/ou senha inválidos!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jBtnAcessoActionPerformed

    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSenhaActionPerformed

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        // TODO add your handling code here:
        CadastroMorador novomorador = new CadastroMorador(); 
        novomorador.setVisible(true);
    }//GEN-LAST:event_buttonRound2ActionPerformed

    private void buttonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound3ActionPerformed

        CadastroRep cadastroRep = new CadastroRep();
        cadastroRep.setVisible(true);
        
    }//GEN-LAST:event_buttonRound3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound buttonRound2;
    private org.edisoncor.gui.button.ButtonRound buttonRound3;
    private org.edisoncor.gui.button.ButtonSeven jBtnAcesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private org.edisoncor.gui.textField.TextFieldRoundIcon jtfLogin;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundBackground jtfSenha;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;


/**
 *
 * @author Isabela Nunes
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        saudacao();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/repme.png")).getImage());
        
    }

   

    public String getHora() {
        // cria um StringBuilder
        StringBuilder sb = new StringBuilder();
        // cria um GregorianCalendar que vai conter a hora atual
        GregorianCalendar d = new GregorianCalendar();
        // anexa do StringBuilder os dados da hora
        sb.append(d.get(GregorianCalendar.HOUR_OF_DAY));
        //sb.append( ":" );
        //sb.append( d.get( GregorianCalendar.MINUTE ) );
        //sb.append( ":" );
        //sb.append( d.get( GregorianCalendar.SECOND ) );
        // retorna a String do StringBuilder
        return sb.toString();
    }

    public void saudacao() {
        lblHora.setText(getHora());
        int hora = Integer.parseInt(lblHora.getText());
        //System.out.println("hora");
        if (hora >= 12 && hora < 18) {
            jLblSaudacao.setText("Boa tarde,");
        } else if (hora > 0 && hora < 12) {
            jLblSaudacao.setText("Bom dia,");
        } else {
            jLblSaudacao.setText("Boa noite,");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelNice5 = new org.edisoncor.gui.panel.PanelNice();
        panelNice6 = new org.edisoncor.gui.panel.PanelNice();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        lblHora = new javax.swing.JLabel();
        jLblSaudacao = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrarRep = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        buttonTransluceIcon1 = new org.edisoncor.gui.button.ButtonTransluceIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bg2.png"))); // NOI18N

        panelNice5.setBackground(new java.awt.Color(255, 255, 255));
        panelNice5.setLayout(null);

        panelNice6.setBackground(new java.awt.Color(255, 255, 255));
        panelNice6.setLayout(null);
        panelNice5.add(panelNice6);
        panelNice6.setBounds(0, 0, 0, 0);

        labelRound1.setForeground(new java.awt.Color(0, 0, 0));
        labelRound1.setText("MENU");
        labelRound1.setColorDeSegundoBorde(new java.awt.Color(204, 204, 204));
        labelRound1.setColorDeSombra(new java.awt.Color(204, 204, 204));
        labelRound1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelRound1.setName(""); // NOI18N
        panelNice5.add(labelRound1);
        labelRound1.setBounds(0, 0, 530, 40);

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        panelNice5.add(lblHora);
        lblHora.setBounds(450, 210, 34, 14);

        jLblSaudacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblSaudacao.setText("Bom dia,");
        panelNice5.add(jLblSaudacao);
        jLblSaudacao.setBounds(80, 60, 100, 30);

        jLblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelNice5.add(jLblNome);
        jLblNome.setBounds(80, 100, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelNice5.add(jLabel2);
        jLabel2.setBounds(40, 80, 30, 40);

        jlblSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblSaldo.setText("R$ 00,00");
        panelNice5.add(jlblSaldo);
        jlblSaldo.setBounds(80, 170, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coins.png"))); // NOI18N
        panelNice5.add(jLabel3);
        jLabel3.setBounds(40, 150, 40, 40);

        btnCadastrarRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/house.png"))); // NOI18N
        btnCadastrarRep.setText("Republica");
        btnCadastrarRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarRepMouseClicked(evt);
            }
        });
        panelNice5.add(btnCadastrarRep);
        btnCadastrarRep.setBounds(40, 220, 100, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SALDO");
        panelNice5.add(jLabel1);
        jLabel1.setBounds(80, 140, 70, 30);
        panelNice5.add(clockFace1);
        clockFace1.setBounds(370, 40, 150, 150);

        buttonTransluceIcon1.setText("buttonTransluceIcon1");
        buttonTransluceIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransluceIcon1ActionPerformed(evt);
            }
        });
        panelNice5.add(buttonTransluceIcon1);
        buttonTransluceIcon1.setBounds(20, 225, 185, 40);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(panelNice5, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelNice5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarRepMouseClicked

      

    }//GEN-LAST:event_btnCadastrarRepMouseClicked
   void setSaldo(){
      
   }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void buttonTransluceIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransluceIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTransluceIcon1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadastrarRep;
    private org.edisoncor.gui.button.ButtonTransluceIcon buttonTransluceIcon1;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSaudacao;
    private javax.swing.JLabel jlblSaldo;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private javax.swing.JLabel lblHora;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private org.edisoncor.gui.panel.PanelNice panelNice6;
    // End of variables declaration//GEN-END:variables
}

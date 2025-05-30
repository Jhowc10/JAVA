/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.uninove.poo.sa.views;

/**
 *
 * @author tatia
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMnArquivo = new javax.swing.JMenu();
        jMnSair = new javax.swing.JMenuItem();
        jMnCadastro = new javax.swing.JMenu();
        jMnCadastraAluno = new javax.swing.JMenuItem();
        jMnCadastraProfessor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMnArquivo.setText("Arquivo");

        jMnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnSair.setText("Sair");
        jMnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnSairActionPerformed(evt);
            }
        });
        jMnArquivo.add(jMnSair);

        jMenuBar1.add(jMnArquivo);

        jMnCadastro.setText("Cadastro");

        jMnCadastraAluno.setText("Aluno");
        jMnCadastraAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadastraAlunoActionPerformed(evt);
            }
        });
        jMnCadastro.add(jMnCadastraAluno);

        jMnCadastraProfessor.setText("Professor");
        jMnCadastraProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadastraProfessorActionPerformed(evt);
            }
        });
        jMnCadastro.add(jMnCadastraProfessor);

        jMenuBar1.add(jMnCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnSairActionPerformed
        
        System.out.println("Executando o comando de sair");
        System.exit(0);
        
    }//GEN-LAST:event_jMnSairActionPerformed

    private void jMnCadastraAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadastraAlunoActionPerformed
        
        CadastraAluno cA = new CadastraAluno();
        cA.setVisible(true);
    }//GEN-LAST:event_jMnCadastraAlunoActionPerformed

    private void jMnCadastraProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadastraProfessorActionPerformed
        
        CadastroProfessor cP = new CadastroProfessor();
        cP.setVisible(true);
    }//GEN-LAST:event_jMnCadastraProfessorActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnArquivo;
    private javax.swing.JMenuItem jMnCadastraAluno;
    private javax.swing.JMenuItem jMnCadastraProfessor;
    private javax.swing.JMenu jMnCadastro;
    private javax.swing.JMenuItem jMnSair;
    // End of variables declaration//GEN-END:variables
}

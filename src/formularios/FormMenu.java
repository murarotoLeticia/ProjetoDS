/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author ANINHA
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
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

        jButton1 = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCaixa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEstoque = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        btDespesa = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        jLabel1Fundo2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 300));
        setMinimumSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        btCliente.setBackground(new java.awt.Color(117, 64, 15));
        btCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCliente.setForeground(new java.awt.Color(255, 255, 255));
        btCliente.setText("Cliente");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btCliente);
        btCliente.setBounds(10, 77, 120, 40);

        btFornecedor.setBackground(new java.awt.Color(117, 64, 15));
        btFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btFornecedor.setText("Fornecedor");
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(btFornecedor);
        btFornecedor.setBounds(159, 77, 120, 40);

        btProduto.setBackground(new java.awt.Color(117, 64, 15));
        btProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btProduto.setForeground(new java.awt.Color(255, 255, 255));
        btProduto.setText("Produto");
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btProduto);
        btProduto.setBounds(10, 134, 120, 40);

        btCaixa.setBackground(new java.awt.Color(117, 64, 15));
        btCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btCaixa.setText("CAIXA");
        btCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(btCaixa);
        btCaixa.setBounds(159, 192, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu        de       Opções");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(81, 19, 306, 29);

        btEstoque.setBackground(new java.awt.Color(117, 64, 15));
        btEstoque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btEstoque.setText("Estoque");
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btEstoque);
        btEstoque.setBounds(10, 192, 120, 40);

        btFuncionario.setBackground(new java.awt.Color(117, 64, 15));
        btFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btFuncionario.setText("Funcionário");
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btFuncionario);
        btFuncionario.setBounds(310, 77, 120, 40);

        btDespesa.setBackground(new java.awt.Color(117, 64, 15));
        btDespesa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDespesa.setForeground(new java.awt.Color(255, 255, 255));
        btDespesa.setText("Despesa");
        btDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDespesaActionPerformed(evt);
            }
        });
        getContentPane().add(btDespesa);
        btDespesa.setBounds(310, 134, 120, 40);

        btVenda.setBackground(new java.awt.Color(117, 64, 15));
        btVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btVenda.setForeground(new java.awt.Color(255, 255, 255));
        btVenda.setText("Venda");
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btVenda);
        btVenda.setBounds(310, 192, 120, 40);

        jLabel1Fundo2.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo2.setText("CAIXAAA");
        getContentPane().add(jLabel1Fundo2);
        jLabel1Fundo2.setBounds(-10, 0, 630, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixaActionPerformed
        FormCaixa form = new FormCaixa(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_btCaixaActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        FormCliente form = new FormCliente();
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
        FormFornecedor form = new FormFornecedor(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_btFornecedorActionPerformed

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        FormProduto form = new FormProduto();
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueActionPerformed
        // TODO add your handling code here:
        FormEstoque form = new FormEstoque(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_btEstoqueActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        // TODO add your handling code here:
        FormFuncionario form = new FormFuncionario();
        form.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDespesaActionPerformed
        // TODO add your handling code here:
        FormDespesa form = new FormDespesa(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_btDespesaActionPerformed

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        // TODO add your handling code here:
        FormVenda form = new FormVenda();
        form.setVisible(true);
    }//GEN-LAST:event_btVendaActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCaixa;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btDespesa;
    private javax.swing.JButton btEstoque;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fundo2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.CaixaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.javaflow.stores.JavaflowResourceStore;
import regrasDeNegocios.Caixa;
import utilitarios.ConexaoBD;

/**
 *
 * @author letic
 */
public class FormCaixa extends javax.swing.JDialog {
   CaixaDao cdao = new CaixaDao(); 
   String sql = "null";
    public FormCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela(sql);
        
        this.setIconImage(new ImageIcon("logo-ifro.png").getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btFecharCaixa = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_caixa = new javax.swing.JTable();
        txtPesquisaCaixa = new javax.swing.JFormattedTextField();
        jLabel1Fundo = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CAIXA");
        setMaximumSize(new java.awt.Dimension(635, 480));
        setMinimumSize(new java.awt.Dimension(635, 480));
        setPreferredSize(new java.awt.Dimension(635, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        btFecharCaixa.setBackground(new java.awt.Color(117, 64, 15));
        btFecharCaixa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btFecharCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btFecharCaixa.setText("Fechar Caixa");
        btFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(btFecharCaixa);
        btFecharCaixa.setBounds(320, 360, 230, 43);

        btImprimir.setBackground(new java.awt.Color(117, 64, 15));
        btImprimir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btImprimir.setText("Imprimir Relatório");
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btImprimir);
        btImprimir.setBounds(50, 360, 240, 43);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar por data");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 230, 30);

        jT_caixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data Abertura", "Saldo Inicial", "Valor Créditos", "Valor Débitos", "Saldo Final", "Status Caixa", "Data Fechamento"
            }
        ));
        jScrollPane3.setViewportView(jT_caixa);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(50, 90, 500, 240);

        try {
            txtPesquisaCaixa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPesquisaCaixa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaCaixaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaCaixaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisaCaixa);
        txtPesquisaCaixa.setBounds(290, 30, 190, 30);

        jLabel1Fundo.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo.setText("CAIXAAA");
        getContentPane().add(jLabel1Fundo);
        jLabel1Fundo.setBounds(0, 0, 630, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharCaixaActionPerformed
       cdao.fechaCaixa();
       preencherTabela(sql);
         
    }//GEN-LAST:event_btFecharCaixaActionPerformed

    private void txtPesquisaCaixaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaCaixaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaCaixaKeyPressed

    private void txtPesquisaCaixaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaCaixaKeyReleased
    preencherTabela(" select * from caixa where dataabertura_cai = '"+txtPesquisaCaixa.getText()+"'");            // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaCaixaKeyReleased

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        // TODO add your handling code here:
        String sql = "select * from caixa";
        try{
    Map param = new HashMap();
     Connection con = ConexaoBD.getConectarBD();
    PreparedStatement prepare = con.prepareStatement(sql);
    ResultSet res = prepare.executeQuery();
            JRResultSetDataSource relatorioResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/Cutelaria Artesanal Caixa.jasper", param,relatorioResult);
            JasperViewer jv = new JasperViewer(jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
            
       
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null,ex.getMessage());
    
    
  }
    }//GEN-LAST:event_btImprimirActionPerformed
    
    public void preencherTabela(String sql){
 
    List<Caixa> lista= cdao.listarTodos(sql);
    DefaultTableModel tabela =  (DefaultTableModel) jT_caixa.getModel();
    tabela.setRowCount(0);
    for(Caixa c: lista){
        tabela.addRow(new Object[]{c.getId_caixa(), c.getDataabetura_cai(),c.getSaldoinicial_cai(),c.getValorcreditos_cai(),c.getValordebitos_cai(),c.getSaldofinal_cai(), c.getStatus_cai(),c.getDatafechamento_cai() });
    }
    
    }
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
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCaixa dialog = new FormCaixa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFecharCaixa;
    private javax.swing.JButton btImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fundo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jT_caixa;
    private javax.swing.JFormattedTextField txtPesquisaCaixa;
    // End of variables declaration//GEN-END:variables
}

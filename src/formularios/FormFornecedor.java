
package formularios;

import dao.FornecedorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regrasDeNegocios.Fornecedor;
import utilitarios.ConexaoBD;

public class FormFornecedor extends javax.swing.JDialog {
    FornecedorDao fnDao = new FornecedorDao();
    Fornecedor f = new Fornecedor();
    String sql = "null";
    /**
     * Creates new form FormFornecedor
     */
    public FormFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela(sql);
         

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        paineGeralFornecedor = new javax.swing.JTabbedPane();
        painelListar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1Fundo2 = new javax.swing.JLabel();
        painelCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeForn = new javax.swing.JTextField();
        txtEnderecoForn = new javax.swing.JTextField();
        txtIdForn = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtTelefoneForn = new javax.swing.JFormattedTextField();
        txtCnpjForn = new javax.swing.JFormattedTextField();
        jLabel1Fundo = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORNECEDOR");

        paineGeralFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        painelListar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        painelListar.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");
        painelListar.add(jLabel8);
        jLabel8.setBounds(20, 30, 60, 30);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CNPJ", "Telefone", "Endereço"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        painelListar.add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 452, 190);

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        painelListar.add(txtPesquisa);
        txtPesquisa.setBounds(70, 30, 210, 30);

        btnNovo.setBackground(new java.awt.Color(117, 64, 15));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        painelListar.add(btnNovo);
        btnNovo.setBounds(60, 290, 90, 40);

        btnExcluir.setBackground(new java.awt.Color(117, 64, 15));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        painelListar.add(btnExcluir);
        btnExcluir.setBounds(320, 290, 100, 40);

        btRelatorio.setBackground(new java.awt.Color(117, 64, 15));
        btRelatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        painelListar.add(btRelatorio);
        btRelatorio.setBounds(310, 20, 130, 40);

        btnEditar.setBackground(new java.awt.Color(117, 64, 15));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        painelListar.add(btnEditar);
        btnEditar.setBounds(190, 290, 100, 40);

        jLabel1Fundo2.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo2.setText("CAIXAAA");
        painelListar.add(jLabel1Fundo2);
        jLabel1Fundo2.setBounds(0, 0, 630, 480);

        paineGeralFornecedor.addTab("Lista De Fornecedores", painelListar);

        painelCadastrar.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        painelCadastrar.add(jLabel1);
        jLabel1.setBounds(30, 85, 38, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CNPJ:");
        painelCadastrar.add(jLabel2);
        jLabel2.setBounds(30, 135, 40, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone:");
        painelCadastrar.add(jLabel3);
        jLabel3.setBounds(270, 140, 56, 15);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço:");
        painelCadastrar.add(jLabel5);
        jLabel5.setBounds(10, 170, 60, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:");
        painelCadastrar.add(jLabel7);
        jLabel7.setBounds(40, 50, 18, 20);

        txtNomeForn.setEnabled(false);
        painelCadastrar.add(txtNomeForn);
        txtNomeForn.setBounds(80, 90, 390, 25);

        txtEnderecoForn.setEnabled(false);
        painelCadastrar.add(txtEnderecoForn);
        txtEnderecoForn.setBounds(80, 170, 390, 30);

        txtIdForn.setEditable(false);
        txtIdForn.setEnabled(false);
        painelCadastrar.add(txtIdForn);
        txtIdForn.setBounds(80, 50, 100, 25);

        btnSalvar.setBackground(new java.awt.Color(117, 64, 15));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelCadastrar.add(btnSalvar);
        btnSalvar.setBounds(30, 250, 100, 40);

        btnAtualizar.setBackground(new java.awt.Color(117, 64, 15));
        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        painelCadastrar.add(btnAtualizar);
        btnAtualizar.setBounds(190, 250, 110, 40);

        btnCancelar.setBackground(new java.awt.Color(117, 64, 15));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        painelCadastrar.add(btnCancelar);
        btnCancelar.setBounds(360, 250, 100, 40);

        try {
            txtTelefoneForn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneForn.setEnabled(false);
        painelCadastrar.add(txtTelefoneForn);
        txtTelefoneForn.setBounds(340, 130, 130, 30);

        try {
            txtCnpjForn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjForn.setText("  .   .   /    -  ");
        txtCnpjForn.setEnabled(false);
        painelCadastrar.add(txtCnpjForn);
        txtCnpjForn.setBounds(80, 130, 130, 30);

        jLabel1Fundo.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo.setText("CAIXAAA");
        painelCadastrar.add(jLabel1Fundo);
        jLabel1Fundo.setBounds(0, 0, 630, 480);

        paineGeralFornecedor.addTab("Cadastrar", painelCadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineGeralFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineGeralFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
 if(!txtNomeForn.getText().equals("")  && !txtCnpjForn.getText().equals("")  && !txtTelefoneForn.getText().equals("")  && !txtEnderecoForn.getText().equals("")){        
        f.setNome_for(txtNomeForn.getText());
        f.setCnpj_for(txtCnpjForn.getText());
        f.setTelefone_for(txtTelefoneForn.getText());
        f.setEndereco_for(txtEnderecoForn.getText());
        fnDao.cadastrar(f);
        preencherTabela(sql);
        cancelar();
        paineGeralFornecedor.setSelectedIndex(0);
         }else{
          JOptionPane.showMessageDialog(null,"PorFavor preencha todos os campos");
       }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       paineGeralFornecedor.setSelectedIndex(0);
       cancelar();
       desabilidarCampos();
       limparcampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if(!txtNomeForn.getText().equals("")  && !txtCnpjForn.getText().equals("")  && !txtTelefoneForn.getText().equals("")  && !txtEnderecoForn.getText().equals("")){ 
        f.setId_fornecedor(Integer.parseInt(txtIdForn.getText()));
        f.setNome_for(txtNomeForn.getText());
        f.setCnpj_for(txtCnpjForn.getText());
        f.setTelefone_for(txtTelefoneForn.getText());
        f.setEndereco_for(txtEnderecoForn.getText());       
        fnDao.atualiza(f);
        preencherTabela(sql);
        paineGeralFornecedor.setSelectedIndex(0);
        cancelar();
         }else{
          JOptionPane.showMessageDialog(null,"PorFavor preencha todos os campos");
       }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilidarCampos();
        limparcampos();
        novo();
        paineGeralFornecedor.setSelectedIndex(1);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaTabela = tabela.getSelectedRow();
        if(linhaTabela >= 0){

            f.setId_fornecedor(Integer.parseInt(tabela.getValueAt(linhaTabela, 0).toString()));
            f.setNome_for(txtNomeForn.getText());
            fnDao.excluir(f);
            preencherTabela(sql);
            cancelar();
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um Fornecedor Na tabela");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linhaTabela = tabela.getSelectedRow();
        if(linhaTabela >= 0){

            txtIdForn.setText(tabela.getValueAt(linhaTabela, 0).toString());
            txtNomeForn.setText(tabela.getValueAt(linhaTabela, 1).toString());
            txtCnpjForn.setText(tabela.getValueAt(linhaTabela, 2).toString());
            txtTelefoneForn.setText(tabela.getValueAt(linhaTabela, 3).toString());
            txtEnderecoForn.setText(tabela.getValueAt(linhaTabela, 4).toString());
            paineGeralFornecedor.setSelectedIndex(1);
            habilidarCampos();
            editar();
            preencherTabela(sql);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um Fornecedor Na tabela");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
      clique();
    }//GEN-LAST:event_tabelaMouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
           preencherTabela("SELECT * FROM Fornecedor  where nome_for like '%"+txtPesquisa.getText()+"%'");
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        // TODO add your handling code here:
           String sql = "select * from fornecedor";
        try{
    Map param = new HashMap();
     Connection con = ConexaoBD.getConectarBD();
    PreparedStatement prepare = con.prepareStatement(sql);
    ResultSet res = prepare.executeQuery();
            JRResultSetDataSource relatorioResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/Cutelaria Artesanal Fornecedor.jasper", param,relatorioResult);
            JasperViewer jv = new JasperViewer(jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
            
 
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null,ex.getMessage());
    }
                                         
    }//GEN-LAST:event_btRelatorioActionPerformed

   public void preencherTabela(String sql){
       
       List<Fornecedor> lista = fnDao.listarTodos(sql);
       DefaultTableModel modeloTabela = (DefaultTableModel)tabela.getModel();
       modeloTabela.setRowCount(0);
       for(Fornecedor f : lista){
           modeloTabela.addRow(new Object[]{f.getId_fornecedor(), f.getNome_for(), f.getCnpj_for(), f.getTelefone_for(), f.getEndereco_for()});
       }
       
   }
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormFornecedor dialog = new FormFornecedor(new javax.swing.JFrame(), true);
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

    
     public void cancelar(){
    btnNovo.setEnabled(true);
    btnSalvar.setEnabled(false);
    btnCancelar.setEnabled(false);
    btnEditar.setEnabled(false);
    btnExcluir.setEnabled(false);
    btnAtualizar.setEnabled(false);

     }
     
    public void editar(){
    btnNovo.setEnabled(false);
    btnSalvar.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnEditar.setEnabled(false);
    btnAtualizar.setEnabled(true);
    btnExcluir.setEnabled(false);

    }
    
    
      public void novo(){
    btnNovo.setEnabled(false);
    btnSalvar.setEnabled(true);
    btnCancelar.setEnabled(true);
    btnEditar.setEnabled(false);
    btnExcluir.setEnabled(false);

    }
    public void clique(){
    btnCancelar.setEnabled(true);
    btnSalvar.setEnabled(false);
    btnNovo.setEnabled(false);
    btnEditar.setEnabled(true);
    btnExcluir.setEnabled(true);  
    }
       public void habilidarCampos(){

    txtNomeForn.setEnabled(true);
    txtCnpjForn.setEnabled(true);
    txtTelefoneForn.setEnabled(true);
    txtEnderecoForn.setEnabled(true);
    }
    public void desabilidarCampos(){

    txtNomeForn.setEnabled(false);
    txtCnpjForn.setEnabled(false);
    txtTelefoneForn.setEnabled(false);
    txtEnderecoForn.setEnabled(false);
    }
    public void limparcampos(){
       txtIdForn.setText(null);
       txtNomeForn.setText(null);
       txtCnpjForn.setText(null);
       txtTelefoneForn.setText(null);
       txtEnderecoForn.setText(null);
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fundo;
    private javax.swing.JLabel jLabel1Fundo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane paineGeralFornecedor;
    private javax.swing.JPanel painelCadastrar;
    private javax.swing.JPanel painelListar;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtCnpjForn;
    private javax.swing.JTextField txtEnderecoForn;
    private javax.swing.JTextField txtIdForn;
    private javax.swing.JTextField txtNomeForn;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtTelefoneForn;
    // End of variables declaration//GEN-END:variables
}

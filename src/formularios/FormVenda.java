package formularios;

import dao.ClienteDao;
import dao.FuncionarioDao;
import dao.ProdutoDao;
import dao.VendaDao;
import formularios.FormCliente;
import formularios.FormFuncionario;
import formularios.FormMenu;
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
import regrasDeNegocios.Funcionario;
import regrasDeNegocios.Produto;
import regrasDeNegocios.Cliente;
import regrasDeNegocios.Itens_venda;
import regrasDeNegocios.Venda;
import utilitarios.ConexaoBD;


public class FormVenda extends javax.swing.JFrame {
    VendaDao vdao = new VendaDao();
    Venda v = new Venda();
    Itens_venda vt= new Itens_venda();
    ProdutoDao pdao = new ProdutoDao();
    ClienteDao cdao = new ClienteDao();
    FuncionarioDao fdao = new FuncionarioDao();
    
    float valor = 0;
    int flagFechar =0;
    int quantidadeProd = 0;
    int quantidadeDisp = 0;
    String sql = "null";
    
    public FormVenda() {
        initComponents();
        preencherCBProduto();
        preencherCBCliente();
        preencherCBFuncionario();
        float aux = 0 ;
         jlVTotal.setText("R$"+valor);
    }

    FormVenda(FormMenu aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel7 = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        cbClienteVenda = new javax.swing.JComboBox();
        cbProdutoVenda = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_vendaProduto = new javax.swing.JTable();
        btAdicionar = new javax.swing.JButton();
        txtQuantidadeVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btNovaVenda = new javax.swing.JButton();
        btCancelaVenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlVTotal = new javax.swing.JLabel();
        btFinalizarVenda = new javax.swing.JButton();
        btnCli = new javax.swing.JButton();
        btnfunc = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btRelatorioVenda = new javax.swing.JButton();
        cbFuncionarioVenda = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbFormaDPag = new javax.swing.JComboBox();
        jLabel1Fundo4 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(610, 550));
        setMinimumSize(new java.awt.Dimension(610, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        lbQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lbQuantidade.setText("0");
        getContentPane().add(lbQuantidade);
        lbQuantidade.setBounds(170, 240, 100, 30);

        getContentPane().add(cbClienteVenda);
        cbClienteVenda.setBounds(100, 30, 390, 28);

        cbProdutoVenda.setEnabled(false);
        cbProdutoVenda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProdutoVendaItemStateChanged(evt);
            }
        });
        cbProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoVendaActionPerformed(evt);
            }
        });
        getContentPane().add(cbProdutoVenda);
        cbProdutoVenda.setBounds(80, 200, 510, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 42, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forma de pagamento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 51, 30);

        Tabela_vendaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "codigo prod", "Nome produto", "marca ", "Quantidade", "Valor Unitario", "valor Total"
            }
        ));
        jScrollPane1.setViewportView(Tabela_vendaProduto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 570, 102);

        btAdicionar.setBackground(new java.awt.Color(102, 51, 0));
        btAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionar.setText("Adicionar");
        btAdicionar.setEnabled(false);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btAdicionar);
        btAdicionar.setBounds(420, 240, 90, 30);

        txtQuantidadeVenda.setEnabled(false);
        txtQuantidadeVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeVendaFocusGained(evt);
            }
        });
        txtQuantidadeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeVendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantidadeVenda);
        txtQuantidadeVenda.setBounds(340, 240, 76, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 240, 71, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade Disponivel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 230, 137, 50);

        btNovaVenda.setBackground(new java.awt.Color(102, 51, 0));
        btNovaVenda.setForeground(new java.awt.Color(255, 255, 255));
        btNovaVenda.setText("Nova Venda");
        btNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btNovaVenda);
        btNovaVenda.setBounds(160, 160, 101, 30);

        btCancelaVenda.setBackground(new java.awt.Color(102, 51, 0));
        btCancelaVenda.setForeground(new java.awt.Color(255, 255, 255));
        btCancelaVenda.setText("Cancelar Venda");
        btCancelaVenda.setEnabled(false);
        btCancelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelaVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelaVenda);
        btCancelaVenda.setBounds(380, 160, 123, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor Total R$:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 400, 110, 20);

        jlVTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlVTotal.setText("jLabel7");
        getContentPane().add(jlVTotal);
        jlVTotal.setBounds(510, 390, 70, 40);

        btFinalizarVenda.setBackground(new java.awt.Color(102, 51, 0));
        btFinalizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btFinalizarVenda.setText("Finalizar Venda");
        btFinalizarVenda.setEnabled(false);
        btFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btFinalizarVenda);
        btFinalizarVenda.setBounds(400, 450, 190, 40);

        btnCli.setBackground(new java.awt.Color(102, 51, 0));
        btnCli.setForeground(new java.awt.Color(255, 255, 255));
        btnCli.setText("cliente");
        btnCli.setBorder(new javax.swing.border.MatteBorder(null));
        btnCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnCli);
        btnCli.setBounds(500, 30, 90, 30);

        btnfunc.setBackground(new java.awt.Color(102, 51, 0));
        btnfunc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnfunc.setForeground(new java.awt.Color(255, 255, 255));
        btnfunc.setText("funcionario");
        btnfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfuncActionPerformed(evt);
            }
        });
        getContentPane().add(btnfunc);
        btnfunc.setBounds(500, 70, 90, 30);

        btnRemover.setBackground(new java.awt.Color(102, 51, 0));
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(510, 240, 81, 30);

        btRelatorioVenda.setBackground(new java.awt.Color(102, 51, 0));
        btRelatorioVenda.setForeground(new java.awt.Color(255, 255, 255));
        btRelatorioVenda.setText("Relatório de Vendas");
        btRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btRelatorioVenda);
        btRelatorioVenda.setBounds(180, 450, 190, 40);

        getContentPane().add(cbFuncionarioVenda);
        cbFuncionarioVenda.setBounds(100, 70, 390, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Funcionario");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 70, 70, 30);

        cbFormaDPag.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbFormaDPag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro a vista ", "Credito a vista ", "Debito ", "Parcelamento em 2x", "Parcelamento em 3x", " " }));
        getContentPane().add(cbFormaDPag);
        cbFormaDPag.setBounds(160, 110, 330, 30);

        jLabel1Fundo4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo4.setText("CAIXAAA");
        jLabel1Fundo4.setMaximumSize(new java.awt.Dimension(610, 600));
        jLabel1Fundo4.setMinimumSize(new java.awt.Dimension(610, 600));
        jLabel1Fundo4.setPreferredSize(new java.awt.Dimension(610, 550));
        getContentPane().add(jLabel1Fundo4);
        jLabel1Fundo4.setBounds(0, 0, 610, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeVendaActionPerformed
   
    }//GEN-LAST:event_txtQuantidadeVendaActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
       
        
        v.setQuantidade(Integer.parseInt(txtQuantidadeVenda.getText()));
        Produto p = (Produto) cbProdutoVenda.getSelectedItem();
        v.setProduto(p);
        
        vdao.inserirProduto(v);
       
        btnRemover.setEnabled(true);   
        btFinalizarVenda.setEnabled(true);
        valor = 0;   
        preencherTabela(sql);
        jlVTotal.setText("R$"+valor);
      
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaVendaActionPerformed
        btnCli.setEnabled(false);
        btnfunc.setEnabled(false);
        
        cbClienteVenda.setEnabled(false);
        cbFuncionarioVenda.setEnabled(false);
        cbFormaDPag.setEnabled(false);
        
        cbProdutoVenda.setEnabled(true);
        btCancelaVenda.setEnabled(true);
        btNovaVenda.setEnabled(false);
         
        txtQuantidadeVenda.setEnabled(true);
        Cliente c = (Cliente) cbClienteVenda.getSelectedItem();
        Funcionario f = (Funcionario) cbFuncionarioVenda.getSelectedItem();
        v.setFormaDPagamento(cbFormaDPag.getSelectedItem().toString());
        v.setCliente(c);
        v.setFuncionario(f);
        vdao.novaVenda(v);
    }//GEN-LAST:event_btNovaVendaActionPerformed

    private void btCancelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelaVendaActionPerformed

        btnCli.setEnabled(true);
        btnfunc.setEnabled(true);
        
        cbClienteVenda.setEnabled(true);
        cbFuncionarioVenda.setEnabled(true);
        cbFormaDPag.setEnabled(true);
        
        cbProdutoVenda.setEnabled(false);
        btCancelaVenda.setEnabled(false);
        btNovaVenda.setEnabled(true); 
        txtQuantidadeVenda.setEnabled(false);
        btAdicionar.setEnabled(false);
        
        txtQuantidadeVenda.setText(null);
        vdao.cancelarVenda(flagFechar); // para atualizar tabela
        preencherTabela(sql);
    }//GEN-LAST:event_btCancelaVendaActionPerformed

    private void cbProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdutoVendaActionPerformed

    private void cbProdutoVendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProdutoVendaItemStateChanged
        Produto p = (Produto) cbProdutoVenda.getSelectedItem();
        
        lbQuantidade.setText(String.valueOf(p.getQuant_prod()));       
        
    }//GEN-LAST:event_cbProdutoVendaItemStateChanged

    private void txtQuantidadeVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeVendaFocusGained
      btAdicionar.setEnabled(true);
    }//GEN-LAST:event_txtQuantidadeVendaFocusGained

    private void btFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarVendaActionPerformed

        v.setValorTotal(valor);
        vdao.finalizarVenda(v);
        btnRemover.setEnabled(false);
        cbProdutoVenda.setEnabled(false);
        btCancelaVenda.setEnabled(false);
        btNovaVenda.setEnabled(true); 
        txtQuantidadeVenda.setEnabled(false);
        btAdicionar.setEnabled(false);
        btFinalizarVenda.setEnabled(false);
        preencherTabela(sql);
    }//GEN-LAST:event_btFinalizarVendaActionPerformed

    private void btnCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliActionPerformed
  FormCliente form = new FormCliente();
        form.setLocationRelativeTo(this);
        form.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCliActionPerformed

    private void btnfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfuncActionPerformed
 FormFuncionario form = new FormFuncionario();
        form.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnfuncActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        flagFechar =1;
        vdao.cancelarVenda(flagFechar);
    }//GEN-LAST:event_formWindowClosed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
    int opcao = Tabela_vendaProduto.getSelectedRow(); //Pega a lh selecionada que esta na tabela
        if(opcao>=0){
          String  x= Tabela_vendaProduto.getValueAt(opcao,0).toString();
          
          vdao.removerProduto(x);
         
        valor = 0;   
        preencherTabela(sql);
        jlVTotal.setText("R$"+valor);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioVendaActionPerformed
             
       String sql = "SELECT\n" +
"     *,\n" +
"     funcionario.`id_funcionario` AS funcionario_id_funcionario,\n" +
"     funcionario.`nome_func` AS funcionario_nome_func,\n" +
"     funcionario.`cpf_func` AS funcionario_cpf_func,\n" +
"     funcionario.`rg_func` AS funcionario_rg_func,\n" +
"     funcionario.`estadoCivil_func` AS funcionario_estadoCivil_func,\n" +
"     funcionario.`sexo_func` AS funcionario_sexo_func,\n" +
"     funcionario.`dataNasc_func` AS funcionario_dataNasc_func,\n" +
"     funcionario.`salario_func` AS funcionario_salario_func,\n" +
"     funcionario.`telefone_func` AS funcionario_telefone_func,\n" +
"     funcionario.`funcao_func` AS funcionario_funcao_func,\n" +
"     funcionario.`endereco_func` AS funcionario_endereco_func,\n" +
"     funcionario.`senha_func` AS funcionario_senha_func,\n" +
"     cliente.`id_cliente` AS cliente_id_cliente,\n" +
"     cliente.`nome_cli` AS cliente_nome_cli,\n" +
"     cliente.`cpf_cli` AS cliente_cpf_cli,\n" +
"     cliente.`rg_cli` AS cliente_rg_cli,\n" +
"     cliente.`estadoCivil_cli` AS cliente_estadoCivil_cli,\n" +
"     cliente.`sexo_cli` AS cliente_sexo_cli,\n" +
"     cliente.`dataNasc_cli` AS cliente_dataNasc_cli,\n" +
"     cliente.`telefone_cli` AS cliente_telefone_cli,\n" +
"     cliente.`endereco_cli` AS cliente_endereco_cli\n" +
"FROM\n" +
"     `funcionario` funcionario INNER JOIN `venda` venda ON funcionario.`id_funcionario` = venda.`id_funcionario`\n" +
"     INNER JOIN `cliente` cliente ON venda.`id_cliente` = cliente.`id_cliente`";
        try{
    Map param = new HashMap();
     Connection con = ConexaoBD.getConectarBD();
    PreparedStatement prepare = con.prepareStatement(sql);
    ResultSet res = prepare.executeQuery();
            JRResultSetDataSource relatorioResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/Cutelaria Artesanal Venda.jasper", param,relatorioResult);
            JasperViewer jv = new JasperViewer(jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
            
 
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    }//GEN-LAST:event_btRelatorioVendaActionPerformed
    
      public void preencherTabela(String sql) {
        List<Itens_venda> lista = vdao.listarTodos(sql);
        DefaultTableModel tabela = (DefaultTableModel) Tabela_vendaProduto.getModel();
        tabela.setRowCount(0);
        for (Itens_venda v : lista) {
            
            tabela.addRow(new Object[]{v.getProduto().getId_produto(),v.getProduto().getDescricao_prod(),v.getProduto().getMarca_prod(),v.getQuant_itenv(),v.getProduto().getValor_prod(),v.getValor_itenv()});
           valor = valor + (float) v.getValor_itenv();
        }
    }
 
    public void preencherCBFuncionario(){
        List<Funcionario> lista = fdao.listarTodos(sql);
        for (Funcionario f : lista){
            cbFuncionarioVenda.addItem(f);
        }
    }
    
    public void preencherCBCliente(){
        List<Cliente> lista = cdao.listarTodos(sql);
        for (Cliente c : lista){
            cbClienteVenda.addItem(c);
        }
    }
    
      public void preencherCBProduto(){
        
        List<Produto> lista = pdao.listarTodos(sql);
        for (Produto p : lista){
            cbProdutoVenda.addItem(p);
        }
    }
      
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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_vendaProduto;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelaVenda;
    private javax.swing.JButton btFinalizarVenda;
    private javax.swing.JButton btNovaVenda;
    private javax.swing.JButton btRelatorioVenda;
    private javax.swing.JButton btnCli;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnfunc;
    private javax.swing.JComboBox cbClienteVenda;
    private javax.swing.JComboBox cbFormaDPag;
    private javax.swing.JComboBox cbFuncionarioVenda;
    private javax.swing.JComboBox cbProdutoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fundo4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlVTotal;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JTextField txtQuantidadeVenda;
    // End of variables declaration//GEN-END:variables
}

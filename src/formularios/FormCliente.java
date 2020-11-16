/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.ClienteDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regrasDeNegocios.Cliente;
import utilitarios.ConexaoBD;
public class FormCliente extends javax.swing.JFrame {
    ClienteDao cldao= new ClienteDao();
    Cliente cl = new Cliente();
    String sql = "null";
    public FormCliente() {
        initComponents();
        btnCancelarL.setVisible(false);
        preencherTabela(sql);
         String dataNasc ;
        
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeralCliente = new javax.swing.JTabbedPane();
        paineListar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Cliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisaCli = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btnCancelarL = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        jLabel1Fundo2 = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSexoCli = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        CbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRgCli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEndereçoCli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCPFCLi = new javax.swing.JFormattedTextField();
        txtDataNascCli = new javax.swing.JFormattedTextField();
        txtFoneCli = new javax.swing.JFormattedTextField();
        jLabel1Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTE ");
        setMinimumSize(new java.awt.Dimension(587, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        painelGeralCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelGeralCliente.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        painelGeralCliente.setEnabled(false);

        paineListar.setLayout(null);

        tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "RG", "estado civil", "Sexo", "Data Nas", "Telefone", "endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Cliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabela_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_ClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_Cliente);

        paineListar.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 560, 220);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pesquisa por nome:");
        paineListar.add(jLabel7);
        jLabel7.setBounds(10, 28, 120, 36);

        txtPesquisaCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaCliKeyReleased(evt);
            }
        });
        paineListar.add(txtPesquisaCli);
        txtPesquisaCli.setBounds(135, 33, 420, 28);

        btnNovo.setBackground(new java.awt.Color(117, 64, 15));
        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        paineListar.add(btnNovo);
        btnNovo.setBounds(10, 310, 90, 40);

        btnExcluir.setBackground(new java.awt.Color(117, 64, 15));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        paineListar.add(btnExcluir);
        btnExcluir.setBounds(350, 310, 99, 40);

        btEditar.setBackground(new java.awt.Color(117, 64, 15));
        btEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        paineListar.add(btEditar);
        btEditar.setBounds(110, 310, 113, 43);

        btnCancelarL.setBackground(new java.awt.Color(117, 64, 15));
        btnCancelarL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelarL.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarL.setText("CANCELAR");
        btnCancelarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLActionPerformed(evt);
            }
        });
        paineListar.add(btnCancelarL);
        btnCancelarL.setBounds(240, 310, 100, 40);

        btRelatorio.setBackground(new java.awt.Color(117, 64, 15));
        btRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        paineListar.add(btRelatorio);
        btRelatorio.setBounds(470, 310, 90, 40);

        jLabel1Fundo2.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo2.setText("CAIXAAA");
        paineListar.add(jLabel1Fundo2);
        jLabel1Fundo2.setBounds(0, -60, 630, 480);

        painelGeralCliente.addTab("Listar", paineListar);

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        painelCadastro.add(jLabel1);
        jLabel1.setBounds(20, 77, 46, 30);

        txtNomeCli.setEnabled(false);
        painelCadastro.add(txtNomeCli);
        txtNomeCli.setBounds(90, 80, 480, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        painelCadastro.add(jLabel2);
        jLabel2.setBounds(30, 127, 32, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado civil:");
        painelCadastro.add(jLabel4);
        jLabel4.setBounds(300, 190, 81, 17);

        cbSexoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbSexoCli.setSelectedIndex(-1);
        cbSexoCli.setEnabled(false);
        cbSexoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoCliActionPerformed(evt);
            }
        });
        painelCadastro.add(cbSexoCli);
        cbSexoCli.setBounds(90, 240, 163, 30);

        btnSalvar.setBackground(new java.awt.Color(117, 64, 15));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelCadastro.add(btnSalvar);
        btnSalvar.setBounds(10, 340, 111, 49);

        btnAtualizar.setBackground(new java.awt.Color(117, 64, 15));
        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        painelCadastro.add(btnAtualizar);
        btnAtualizar.setBounds(240, 340, 111, 49);

        btnCancelar.setBackground(new java.awt.Color(117, 64, 15));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        painelCadastro.add(btnCancelar);
        btnCancelar.setBounds(460, 340, 111, 49);

        CbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo" }));
        CbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbEstadoCivilActionPerformed(evt);
            }
        });
        painelCadastro.add(CbEstadoCivil);
        CbEstadoCivil.setBounds(390, 180, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        painelCadastro.add(jLabel8);
        jLabel8.setBounds(30, 27, 22, 30);

        txtIdCli.setEditable(false);
        txtIdCli.setEnabled(false);
        painelCadastro.add(txtIdCli);
        txtIdCli.setBounds(90, 30, 143, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RG:");
        painelCadastro.add(jLabel9);
        jLabel9.setBounds(350, 130, 25, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FONE:");
        painelCadastro.add(jLabel10);
        jLabel10.setBounds(20, 177, 44, 30);

        txtRgCli.setEnabled(false);
        painelCadastro.add(txtRgCli);
        txtRgCli.setBounds(390, 130, 180, 33);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Endereço:");
        painelCadastro.add(jLabel11);
        jLabel11.setBounds(10, 293, 70, 17);

        txtEndereçoCli.setEnabled(false);
        txtEndereçoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndereçoCliActionPerformed(evt);
            }
        });
        painelCadastro.add(txtEndereçoCli);
        txtEndereçoCli.setBounds(90, 289, 480, 33);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SEXO:");
        painelCadastro.add(jLabel14);
        jLabel14.setBounds(20, 237, 44, 30);
        painelCadastro.add(jLabel3);
        jLabel3.setBounds(338, 168, 0, 0);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nascimento:");
        painelCadastro.add(jLabel6);
        jLabel6.setBounds(290, 250, 86, 17);

        try {
            txtCPFCLi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCLi.setEnabled(false);
        txtCPFCLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCLiActionPerformed(evt);
            }
        });
        painelCadastro.add(txtCPFCLi);
        txtCPFCLi.setBounds(90, 130, 163, 29);

        try {
            txtDataNascCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascCli.setEnabled(false);
        txtDataNascCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascCliActionPerformed(evt);
            }
        });
        painelCadastro.add(txtDataNascCli);
        txtDataNascCli.setBounds(390, 240, 180, 33);

        try {
            txtFoneCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFoneCli.setEnabled(false);
        txtFoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneCliActionPerformed(evt);
            }
        });
        painelCadastro.add(txtFoneCli);
        txtFoneCli.setBounds(90, 180, 163, 33);

        jLabel1Fundo.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo.setText("CAIXAAA");
        painelCadastro.add(jLabel1Fundo);
        jLabel1Fundo.setBounds(0, -60, 590, 470);

        painelGeralCliente.addTab("Cadastro", painelCadastro);

        getContentPane().add(painelGeralCliente);
        painelGeralCliente.setBounds(0, 0, 650, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    habilidarCampos();
    limparcampos();
    novo();
    painelGeralCliente.setSelectedIndex(1);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int opcao = tabela_Cliente.getSelectedRow();
        if (opcao >= 0) {
            cl.setId_cliente(Integer.parseInt(tabela_Cliente.getValueAt(opcao, 0).toString()));
            cl.setNome_cli(tabela_Cliente.getValueAt(opcao, 1).toString());
            cl.setCpf_cli(tabela_Cliente.getValueAt(opcao, 2).toString());
            cldao.deleter(cl);
            preencherTabela(sql);
            cancelar();
        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        int opcao = tabela_Cliente.getSelectedRow();
        if (opcao >= 0) {
            txtIdCli.setText(tabela_Cliente.getValueAt(opcao, 0).toString());
            txtNomeCli.setText(tabela_Cliente.getValueAt(opcao, 1).toString());
            txtCPFCLi.setText(tabela_Cliente.getValueAt(opcao, 2).toString());
            txtRgCli.setText(tabela_Cliente.getValueAt(opcao, 3).toString());
            CbEstadoCivil.setSelectedItem(tabela_Cliente.getValueAt(opcao, 4).toString());
            cbSexoCli.setSelectedItem(tabela_Cliente.getValueAt(opcao, 5));
            txtDataNascCli.setText(tabela_Cliente.getValueAt(opcao, 6).toString());
            txtFoneCli.setText(tabela_Cliente.getValueAt(opcao, 7).toString());
            txtEndereçoCli.setText(tabela_Cliente.getValueAt(opcao, 8).toString());
            painelGeralCliente.setSelectedIndex(1);
            painelGeralCliente.setEnabled(true);
            habilidarCampos();
            editar();
            
        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtEndereçoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndereçoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndereçoCliActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
        desabilidarCampos();
        limparcampos();
        painelGeralCliente.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
 if(!txtNomeCli.getText().equals("")  && !txtCPFCLi.getText().equals("  .   .   -  ")  && !txtRgCli.getText().equals("")  && !CbEstadoCivil.getSelectedItem().toString().equals("")  && !cbSexoCli.getSelectedItem().toString().equals("")  && !txtDataNascCli.getText().equals("    -  -  ")  && !txtFoneCli.getText().equals("(  )     -    ")  && !txtEndereçoCli.getText().equals("")  ){
      
        cl.setId_cliente(Integer.parseInt(txtIdCli.getText()));
        cl.setNome_cli(txtNomeCli.getText());
        cl.setCpf_cli(txtCPFCLi.getText());
        cl.setRg_cli(txtRgCli.getText());
        cl.setEstadoCivil(CbEstadoCivil.getSelectedItem().toString());
        cl.setSexo_cli(cbSexoCli.getSelectedItem().toString());
        
        cl.setDataNasc_cli(txtDataNascCli.getText());
        cl.setTelefone_cli(txtFoneCli.getText());
        cl.setEndereco_cli(txtEndereçoCli.getText());
        
        cldao.atualiza(cl);
        preencherTabela(sql);
        painelGeralCliente.setSelectedIndex(0);
        cancelar();
 }else{
          JOptionPane.showMessageDialog(null,"PorFavor preencha todos os campos");
       }
     
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    if(!txtNomeCli.getText().equals("")  && !txtCPFCLi.getText().equals("  .   .   -  ")  && !txtRgCli.getText().equals("")  && !CbEstadoCivil.getSelectedItem().toString().equals("")  && !cbSexoCli.getSelectedItem().toString().equals("")  && !txtDataNascCli.getText().equals("    -  -  ")  && !txtFoneCli.getText().equals("(  )     -    ")  && !txtEndereçoCli.getText().equals("")  ){
        
        cl.setNome_cli(txtNomeCli.getText());
        cl.setCpf_cli(txtCPFCLi.getText());
        cl.setRg_cli(txtRgCli.getText());
        cl.setEstadoCivil(CbEstadoCivil.getSelectedItem().toString());
        cl.setSexo_cli(cbSexoCli.getSelectedItem().toString());
        cl.setDataNasc_cli(txtDataNascCli.getText());
        cl.setTelefone_cli(txtFoneCli.getText());
        cl.setEndereco_cli(txtEndereçoCli.getText()); 
           cldao.inserir(cl);
        preencherTabela(sql);
        cancelar();
        painelGeralCliente.setSelectedIndex(0);
    }
       else {
          JOptionPane.showMessageDialog(null,"PorFavor preencha todos os campos");
       }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbSexoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoCliActionPerformed

    private void tabela_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_ClienteMouseClicked
       clique();
       btnCancelarL.setVisible(true);
    }//GEN-LAST:event_tabela_ClienteMouseClicked

    private void btnCancelarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLActionPerformed
        cancelar();
        btnCancelarL.setVisible(false);
    }//GEN-LAST:event_btnCancelarLActionPerformed

    private void txtPesquisaCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaCliKeyReleased
 preencherTabela("SELECT * FROM cliente where nome_cli like '%"+txtPesquisaCli.getText()+"%'");           // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaCliKeyReleased

    private void txtCPFCLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCLiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCLiActionPerformed

    private void txtFoneCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoneCliActionPerformed

    private void txtDataNascCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascCliActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        // TODO add your handling code here:
             String sql = "select * from cliente";
        try{
    Map param = new HashMap();
     Connection con = ConexaoBD.getConectarBD();
    PreparedStatement prepare = con.prepareStatement(sql);
    ResultSet res = prepare.executeQuery();
            JRResultSetDataSource relatorioResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/Cutelaria Artesanal Cliente.jasper", param,relatorioResult);
            JasperViewer jv = new JasperViewer(jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
            
 
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void CbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbEstadoCivilActionPerformed

    public void preencherTabela(String sql) {
        List<Cliente> lista = cldao.listarTodos(sql);
        DefaultTableModel tabela = (DefaultTableModel) tabela_Cliente.getModel();
        tabela.setRowCount(0);
        for (Cliente c : lista) {
            tabela.addRow(new Object[]{c.getId_cliente(), c.getNome_cli(), c.getCpf_cli(),c.getRg_cli(),c.getEstadoCivil(),c.getSexo_cli(), c.getDataNasc_cli(),  c.getTelefone_cli(), c.getEndereco_cli()});

        }

    }

    /**
     * @param args the command line arguments
     */
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
                new FormCliente().setVisible(true);
            }
        });
    }


    
     public void cancelar(){
    btnNovo.setEnabled(true);
    btnSalvar.setEnabled(false);
    btnCancelar.setEnabled(false);
    btEditar.setEnabled(false);
    btnExcluir.setEnabled(false);
    btnAtualizar.setEnabled(false);
   
     painelGeralCliente.setEnabled(false);
     btnCancelarL.setVisible(false);
   
     }
     
    public void editar(){
    btnNovo.setEnabled(false);
    btnSalvar.setEnabled(false);
    btnCancelar.setEnabled(true);
    btEditar.setEnabled(false);
    btnAtualizar.setEnabled(true);
    btnExcluir.setEnabled(false);

    }
    
    
      public void novo(){
    btnNovo.setEnabled(false);
    btnSalvar.setEnabled(true);
    btnCancelar.setEnabled(true);
    btEditar.setEnabled(false);
    btnExcluir.setEnabled(false);
   
     painelGeralCliente.setEnabled(true);
    }
    public void clique(){
    btnCancelar.setEnabled(true);
    btnSalvar.setEnabled(false);
    btnNovo.setEnabled(false);
    btEditar.setEnabled(true);
    btnExcluir.setEnabled(true);
  
    
    }
       public void habilidarCampos(){
    txtNomeCli.setEnabled(true);
    txtCPFCLi.setEnabled(true);
    txtRgCli.setEnabled(true);
    txtFoneCli.setEnabled(true);
    CbEstadoCivil.setEnabled(true);
    txtDataNascCli.setEnabled(true);
    txtEndereçoCli.setEnabled(true);
    cbSexoCli.setEnabled(true);
    }
    public void desabilidarCampos(){
    txtNomeCli.setEnabled(false);
    txtCPFCLi.setEnabled(false);
    txtRgCli.setEnabled(false);
    txtFoneCli.setEnabled(false);
    CbEstadoCivil.setEnabled(false);
    txtDataNascCli.setEnabled(false);
    txtEndereçoCli.setEnabled(false);
    cbSexoCli.setEnabled(false);
    }
    public void limparcampos(){
          txtIdCli.setText(null);
        txtNomeCli.setText(null);
        txtCPFCLi.setText(null);
        txtRgCli.setText(null);
        txtDataNascCli.setText(null);
        txtFoneCli.setText(null);
        txtEndereçoCli.setText(null);
    }
 
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbEstadoCivil;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarL;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbSexoCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1Fundo;
    private javax.swing.JLabel jLabel1Fundo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paineListar;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JTabbedPane painelGeralCliente;
    private javax.swing.JTable tabela_Cliente;
    private javax.swing.JFormattedTextField txtCPFCLi;
    private javax.swing.JFormattedTextField txtDataNascCli;
    private javax.swing.JTextField txtEndereçoCli;
    private javax.swing.JFormattedTextField txtFoneCli;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtPesquisaCli;
    private javax.swing.JTextField txtRgCli;
    // End of variables declaration//GEN-END:variables
}

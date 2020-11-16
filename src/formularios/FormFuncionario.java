
package formularios;

import dao.FuncionarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regrasDeNegocios.Funcionario;
import utilitarios.ConexaoBD;



public class FormFuncionario extends javax.swing.JFrame {
    boolean flag = false;
    FuncionarioDao fcdao= new FuncionarioDao();
    Funcionario fc = new Funcionario();
    String sql = "null";
    public FormFuncionario() {
        initComponents();
        preencherTabela(sql);
        btnCancelarL.setVisible(false);
        this.setIconImage(new ImageIcon("logo-ifro.png").getImage());
     
    }

    FormFuncionario(FormMenu aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeralFuncionario = new javax.swing.JTabbedPane();
        Listar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisaFunc = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Funcionario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnCancelarL = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        jLabel1Fundo4 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdFunc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRgFunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeFunc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSexoFunc = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSenhafunc = new javax.swing.JPasswordField();
        txtConfirmSenhafunc = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtCpfFunc = new javax.swing.JFormattedTextField();
        txtFoneFunc = new javax.swing.JFormattedTextField();
        txtDataNascFunc = new javax.swing.JFormattedTextField();
        txtEnderecoFunc = new javax.swing.JTextField();
        txtSalarioFunc = new javax.swing.JTextField();
        CbEstadoCivil = new javax.swing.JComboBox<>();
        lbSenha = new javax.swing.JLabel();
        cbFunção = new javax.swing.JComboBox();
        jLabel1Fundo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionario");

        painelGeralFuncionario.setEnabled(false);

        Listar.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pesquisa por nome:");
        Listar.add(jLabel7);
        jLabel7.setBounds(10, 20, 121, 36);

        txtPesquisaFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaFuncKeyReleased(evt);
            }
        });
        Listar.add(txtPesquisaFunc);
        txtPesquisaFunc.setBounds(140, 30, 190, 28);

        btnNovo.setBackground(new java.awt.Color(117, 64, 15));
        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        Listar.add(btnNovo);
        btnNovo.setBounds(30, 400, 100, 50);

        btnEditar.setBackground(new java.awt.Color(117, 64, 15));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        Listar.add(btnEditar);
        btnEditar.setBounds(150, 400, 113, 50);

        tabela_Funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "RG", "estado civil", "Sexo", "Data Nas", "salario", "Telefone", "função", "endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Funcionario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabela_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_FuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_Funcionario);

        Listar.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 508, 280);

        btnExcluir.setBackground(new java.awt.Color(117, 64, 15));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        Listar.add(btnExcluir);
        btnExcluir.setBounds(400, 400, 99, 50);

        btnCancelarL.setBackground(new java.awt.Color(117, 64, 15));
        btnCancelarL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelarL.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarL.setText("CANCELAR");
        btnCancelarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLActionPerformed(evt);
            }
        });
        Listar.add(btnCancelarL);
        btnCancelarL.setBounds(280, 400, 100, 50);

        btRelatorio.setBackground(new java.awt.Color(117, 64, 15));
        btRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        Listar.add(btRelatorio);
        btRelatorio.setBounds(360, 20, 140, 40);

        jLabel1Fundo4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo4.setText("CAIXAAA");
        Listar.add(jLabel1Fundo4);
        jLabel1Fundo4.setBounds(0, 0, 610, 500);

        painelGeralFuncionario.addTab("Listar", Listar);

        Cadastrar.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        Cadastrar.add(jLabel8);
        jLabel8.setBounds(30, 30, 19, 20);

        txtIdFunc.setEditable(false);
        txtIdFunc.setEnabled(false);
        txtIdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncActionPerformed(evt);
            }
        });
        Cadastrar.add(txtIdFunc);
        txtIdFunc.setBounds(80, 20, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RG:");
        Cadastrar.add(jLabel9);
        jLabel9.setBounds(320, 110, 23, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FONE:");
        Cadastrar.add(jLabel10);
        jLabel10.setBounds(30, 140, 39, 30);

        txtRgFunc.setEnabled(false);
        Cadastrar.add(txtRgFunc);
        txtRgFunc.setBounds(360, 100, 163, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Endereço");
        Cadastrar.add(jLabel11);
        jLabel11.setBounds(10, 270, 58, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        Cadastrar.add(jLabel1);
        jLabel1.setBounds(30, 70, 41, 17);

        txtNomeFunc.setEnabled(false);
        Cadastrar.add(txtNomeFunc);
        txtNomeFunc.setBounds(80, 60, 163, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nascimento");
        Cadastrar.add(jLabel5);
        jLabel5.setBounds(280, 180, 71, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        Cadastrar.add(jLabel2);
        jLabel2.setBounds(30, 110, 29, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SEXO:");
        Cadastrar.add(jLabel14);
        jLabel14.setBounds(30, 180, 39, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("estado civil");
        Cadastrar.add(jLabel4);
        jLabel4.setBounds(280, 140, 66, 30);

        cbSexoFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbSexoFunc.setSelectedIndex(-1);
        cbSexoFunc.setEnabled(false);
        Cadastrar.add(cbSexoFunc);
        cbSexoFunc.setBounds(80, 180, 163, 29);

        btnSalvar.setBackground(new java.awt.Color(117, 64, 15));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        Cadastrar.add(btnSalvar);
        btnSalvar.setBounds(10, 390, 121, 49);

        btnAtualizar.setBackground(new java.awt.Color(117, 64, 15));
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        Cadastrar.add(btnAtualizar);
        btnAtualizar.setBounds(210, 390, 146, 49);

        btnCancelar.setBackground(new java.awt.Color(117, 64, 15));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Cadastrar.add(btnCancelar);
        btnCancelar.setBounds(410, 390, 111, 49);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Função");
        Cadastrar.add(jLabel15);
        jLabel15.setBounds(300, 220, 45, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Salario");
        Cadastrar.add(jLabel16);
        jLabel16.setBounds(30, 220, 39, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Senha");
        Cadastrar.add(jLabel12);
        jLabel12.setBounds(30, 310, 38, 30);

        txtSenhafunc.setEnabled(false);
        txtSenhafunc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhafuncFocusGained(evt);
            }
        });
        txtSenhafunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhafuncActionPerformed(evt);
            }
        });
        Cadastrar.add(txtSenhafunc);
        txtSenhafunc.setBounds(80, 310, 160, 30);

        txtConfirmSenhafunc.setEnabled(false);
        txtConfirmSenhafunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmSenhafuncKeyReleased(evt);
            }
        });
        Cadastrar.add(txtConfirmSenhafunc);
        txtConfirmSenhafunc.setBounds(360, 310, 163, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("confirmar senha");
        Cadastrar.add(jLabel13);
        jLabel13.setBounds(250, 310, 98, 30);

        try {
            txtCpfFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfFunc.setEnabled(false);
        Cadastrar.add(txtCpfFunc);
        txtCpfFunc.setBounds(80, 100, 163, 29);

        try {
            txtFoneFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFoneFunc.setEnabled(false);
        Cadastrar.add(txtFoneFunc);
        txtFoneFunc.setBounds(80, 140, 163, 29);

        try {
            txtDataNascFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascFunc.setEnabled(false);
        Cadastrar.add(txtDataNascFunc);
        txtDataNascFunc.setBounds(360, 180, 163, 29);

        txtEnderecoFunc.setEnabled(false);
        Cadastrar.add(txtEnderecoFunc);
        txtEnderecoFunc.setBounds(80, 260, 440, 35);

        txtSalarioFunc.setEnabled(false);
        Cadastrar.add(txtSalarioFunc);
        txtSalarioFunc.setBounds(80, 220, 163, 29);

        CbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "viúvo" }));
        CbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbEstadoCivilActionPerformed(evt);
            }
        });
        Cadastrar.add(CbEstadoCivil);
        CbEstadoCivil.setBounds(360, 140, 160, 30);

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.add(lbSenha);
        lbSenha.setBounds(200, 350, 170, 30);

        cbFunção.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gerente ", "vendedor ", " " }));
        cbFunção.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFunçãoActionPerformed(evt);
            }
        });
        Cadastrar.add(cbFunção);
        cbFunção.setBounds(360, 220, 160, 30);

        jLabel1Fundo3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1Fundo3.setText("CAIXAAA");
        Cadastrar.add(jLabel1Fundo3);
        jLabel1Fundo3.setBounds(0, 0, 610, 490);

        painelGeralFuncionario.addTab("Cadastrar", Cadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeralFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeralFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      if(!txtNomeFunc.getText().equals("")  && !txtCpfFunc.getText().equals("")  && !txtRgFunc.getText().equals("")  && !CbEstadoCivil.getSelectedItem().toString().equals("")  
      && !cbSexoFunc.getSelectedItem().toString().equals("")  && !txtDataNascFunc.getText().equals("")  && !txtSalarioFunc.getText().equals("")  
      && !txtFoneFunc.getText().equals("")&& !cbFunção.getSelectedItem().toString().equals("") &&!txtEnderecoFunc.getText().equals("") &&!txtSenhafunc.getPassword().equals("")){
      
        if(flag == true){
        fc.setNome_func(txtNomeFunc.getText());
        fc.setCpf_func(txtCpfFunc.getText());
        fc.setRg_func(txtRgFunc.getText());
        fc.setEstadoCivil_func(CbEstadoCivil.getSelectedItem().toString());
        fc.setSexo_func(cbSexoFunc.getSelectedItem().toString());
        fc.setDataNascimento_func(txtDataNascFunc.getText());
        fc.setSalario_func(txtSalarioFunc.getText());
        fc.setTelefone_func(txtFoneFunc.getText());
        fc.setFuncao_func(cbFunção.getSelectedItem().toString());
        fc.setEndereco_func(txtEnderecoFunc.getText());
        fc.setSenha_func(String.valueOf(txtSenhafunc.getPassword()));

        fcdao.inserir(fc);
        preencherTabela(sql);
        cancelar();
        painelGeralFuncionario.setSelectedIndex(0); 
        }else{
        JOptionPane.showMessageDialog(this, "senhas nao sao iguais");
        }}else{
        JOptionPane.showMessageDialog(this, "por favor preencha todos os campos");
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
 if(!txtNomeFunc.getText().equals("")  && !txtCpfFunc.getText().equals("")  && !txtRgFunc.getText().equals("")  && !CbEstadoCivil.getSelectedItem().toString().equals("")
 && !txtDataNascFunc.getText().equals("")  && !txtSalarioFunc.getText().equals("")&& !txtFoneFunc.getText().equals("")
  &&!txtEnderecoFunc.getText().equals("") &&!txtSenhafunc.getPassword().equals("")){
      
        
        fc.setId_funcionario(Integer.parseInt(txtIdFunc.getText()));    
        fc.setNome_func(txtNomeFunc.getText());
        fc.setCpf_func(txtCpfFunc.getText());
        fc.setRg_func(txtRgFunc.getText());
        fc.setEstadoCivil_func(CbEstadoCivil.getSelectedItem().toString());
        fc.setSexo_func(cbSexoFunc.getSelectedItem().toString());
        fc.setDataNascimento_func(txtDataNascFunc.getText());
        fc.setSalario_func(txtSalarioFunc.getText());
        fc.setTelefone_func(txtFoneFunc.getText());
        fc.setFuncao_func(cbFunção.getSelectedItem().toString());
        fc.setEndereco_func(txtEnderecoFunc.getText());     
        fc.setSenha_func(String.valueOf(txtSenhafunc.getPassword()));     
        fcdao.atualizar(fc);
        preencherTabela(sql);
        painelGeralFuncionario.setSelectedIndex(0);
        cancelar();
        }else{
        JOptionPane.showMessageDialog(this, "por favor preencha todos os campos");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
                
        cancelar();
        desabilidarCampos();
        limparcampos();
        painelGeralFuncionario.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtConfirmSenhafuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmSenhafuncKeyReleased
      
        
        if (String.valueOf(txtSenhafunc.getPassword()).equals(String.valueOf(txtConfirmSenhafunc.getPassword()))){
           lbSenha.setText("senhas sao iguais");
           flag =  true;
       }
        else{
            lbSenha.setText("senhas digitadas sao diferentes");
            flag =  false;
        } 
           
    }//GEN-LAST:event_txtConfirmSenhafuncKeyReleased

    private void txtSenhafuncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhafuncFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhafuncFocusGained

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilidarCampos();
        limparcampos();
        novo();
        
        painelGeralFuncionario.setSelectedIndex(1);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int opcao = tabela_Funcionario.getSelectedRow();
        if (opcao >= 0) {
            txtIdFunc.setText(tabela_Funcionario.getValueAt(opcao, 0).toString());
            txtNomeFunc.setText(tabela_Funcionario.getValueAt(opcao, 1).toString());
            txtCpfFunc.setText(tabela_Funcionario.getValueAt(opcao, 2).toString());
            txtRgFunc.setText(tabela_Funcionario.getValueAt(opcao, 3).toString());
            CbEstadoCivil.setSelectedItem(tabela_Funcionario.getValueAt(opcao, 4).toString());
            cbSexoFunc.setSelectedItem(tabela_Funcionario.getValueAt(opcao, 5));
            txtDataNascFunc.setText(tabela_Funcionario.getValueAt(opcao, 6).toString());
            txtSalarioFunc.setText(tabela_Funcionario.getValueAt(opcao, 7).toString());
            txtFoneFunc.setText(tabela_Funcionario.getValueAt(opcao, 8).toString()); 
            cbFunção.setSelectedItem(tabela_Funcionario.getValueAt(opcao, 9).toString());
            txtEnderecoFunc.setText(tabela_Funcionario.getValueAt(opcao, 10).toString());
            habilidarCampos();
            editar();
            painelGeralFuncionario.setEnabled(true);
            painelGeralFuncionario.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int opcao = tabela_Funcionario.getSelectedRow();
        if (opcao >= 0) {
            
            fc.setId_funcionario(Integer.parseInt(tabela_Funcionario.getValueAt(opcao, 0).toString()));
            fc.setNome_func(tabela_Funcionario.getValueAt(opcao, 1).toString());
            fc.setCpf_func(tabela_Funcionario.getValueAt(opcao, 2).toString());  
            fcdao.deleter(fc);
            preencherTabela(sql);
            cancelar();
        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtSenhafuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhafuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhafuncActionPerformed

    private void txtIdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncActionPerformed

    private void tabela_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_FuncionarioMouseClicked
       clique();
       btnCancelarL.setVisible(true);
    }//GEN-LAST:event_tabela_FuncionarioMouseClicked

    private void btnCancelarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLActionPerformed
        cancelar();
        btnCancelarL.setVisible(false);
    }//GEN-LAST:event_btnCancelarLActionPerformed

    private void txtPesquisaFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaFuncKeyReleased
      preencherTabela("SELECT * FROM Funcionario where nome_func like '%"+txtPesquisaFunc.getText()+"%'");
    }//GEN-LAST:event_txtPesquisaFuncKeyReleased

    private void cbFunçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFunçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFunçãoActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        // TODO add your handling code here:
              String sql = "select * from funcionario";
        try{
    Map param = new HashMap();
     Connection con = ConexaoBD.getConectarBD();
    PreparedStatement prepare = con.prepareStatement(sql);
    ResultSet res = prepare.executeQuery();
            JRResultSetDataSource relatorioResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/Cutelaria Artesanal Funcionario.jasper", param,relatorioResult);
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
        List<Funcionario> lista = fcdao.listarTodos(sql);
        DefaultTableModel tabela = (DefaultTableModel) tabela_Funcionario.getModel();
        tabela.setRowCount(0);
        for (Funcionario f : lista) {
            tabela.addRow(new Object[]{f.getId_funcionario(), f.getNome_func(), f.getCpf_func(),f.getRg_func(),f.getEstadoCivil_func(),f.getSexo_func(), f.getDataNascimento_func(),f.getSalario_func(),  f.getTelefone_func(),f.getFuncao_func() ,f.getEndereco_func()});
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
                new FormFuncionario().setVisible(true);
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
     painelGeralFuncionario.setEnabled(false);
     lbSenha.setText(" ");
     btnCancelarL.setVisible(false);
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
    painelGeralFuncionario.setEnabled(true);
    }
    public void clique(){
    btnCancelar.setEnabled(true);
    btnSalvar.setEnabled(false);
    btnNovo.setEnabled(false);
    btnEditar.setEnabled(true);
    btnExcluir.setEnabled(true);

    
    }
       public void habilidarCampos(){
     
        txtNomeFunc.setEnabled(true);
        txtCpfFunc.setEnabled(true);
        txtRgFunc.setEnabled(true);
        CbEstadoCivil.setEnabled(true);
        txtDataNascFunc.setEnabled(true);
        txtSalarioFunc.setEnabled(true);
        txtFoneFunc.setEnabled(true);
        cbFunção.setEnabled(true);
        CbEstadoCivil.setEnabled(true);
        txtEnderecoFunc.setEnabled(true);
        txtSenhafunc.setEnabled(true);
        txtConfirmSenhafunc.setEnabled(true);
        cbSexoFunc.setEnabled(true);
    }
    public void desabilidarCampos(){
        
        txtNomeFunc.setEnabled(false);
        txtCpfFunc.setEnabled(false);
        txtRgFunc.setEnabled(false);
        CbEstadoCivil.setEnabled(false);
        txtDataNascFunc.setEnabled(false);
        txtSalarioFunc.setEnabled(false);
        txtFoneFunc.setEnabled(false);
        cbFunção.setEnabled(false);
        CbEstadoCivil.setEnabled(false);
        txtEnderecoFunc.setEnabled(false);
        txtSenhafunc.setEnabled(false);
        txtConfirmSenhafunc.setEnabled(false);
        cbSexoFunc.setEnabled(false);
    }
    public void limparcampos(){
        txtIdFunc.setText(null);
        txtNomeFunc.setText(null);
        txtCpfFunc.setText(null);
        txtRgFunc.setText(null);
        txtDataNascFunc.setText(null);
        txtSalarioFunc.setText(null);
        txtFoneFunc.setText(null);
        txtEnderecoFunc.setText(null);
        txtSenhafunc.setText(null);
        txtConfirmSenhafunc.setText(null);  
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastrar;
    private javax.swing.JComboBox<String> CbEstadoCivil;
    private javax.swing.JPanel Listar;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarL;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbFunção;
    private javax.swing.JComboBox<String> cbSexoFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1Fundo3;
    private javax.swing.JLabel jLabel1Fundo4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTabbedPane painelGeralFuncionario;
    private javax.swing.JTable tabela_Funcionario;
    private javax.swing.JPasswordField txtConfirmSenhafunc;
    private javax.swing.JFormattedTextField txtCpfFunc;
    private javax.swing.JFormattedTextField txtDataNascFunc;
    private javax.swing.JTextField txtEnderecoFunc;
    private javax.swing.JFormattedTextField txtFoneFunc;
    private javax.swing.JTextField txtIdFunc;
    private javax.swing.JTextField txtNomeFunc;
    private javax.swing.JTextField txtPesquisaFunc;
    private javax.swing.JTextField txtRgFunc;
    private javax.swing.JTextField txtSalarioFunc;
    private javax.swing.JPasswordField txtSenhafunc;
    // End of variables declaration//GEN-END:variables
}

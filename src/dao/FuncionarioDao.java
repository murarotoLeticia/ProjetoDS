/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import regrasDeNegocios.Funcionario;
import utilitarios.ConexaoBD;


/**
 *
 * @author karolaine
 */
public class FuncionarioDao {
    
   

    public void inserir(Funcionario f ) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "insert into Funcionario (nome_func,cpf_func,rg_func,estadoCivil_func,sexo_func,dataNasc_func,salario_func,telefone_func,funcao_func,endereco_func,senha_func)values (?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
               stm.setString(1, f.getNome_func());
               stm.setString(2, f.getCpf_func());
               stm.setString(3, f.getRg_func());
               stm.setString(4, f.getEstadoCivil_func());
               stm.setString(5, f.getSexo_func());
               stm.setString(6, f.getDataNascimento_func());
               stm.setString(7, f.getSalario_func()); 
               stm.setString(8, f.getTelefone_func());
               stm.setString(9, f.getFuncao_func());
               stm.setString(10, f.getEndereco_func());
               stm.setString(11, f.getSenha_func());
               stm.executeUpdate();
               stm.close();
               con.close();
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR" + ex.getMessage());
         }
    }
      public void atualizar(Funcionario f) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "UPDATE funcionario set nome_func = ?,cpf_func = ?,rg_func = ?,estadoCivil_func = ?,sexo_func = ?,dataNasc_func = ?,salario_func = ?,telefone_func = ?,funcao_func = ?,endereco_func = ?  WHERE id_funcionario=?";

        try (PreparedStatement stm = con.prepareStatement(sql)) {
               stm.setString(1, f.getNome_func());
               stm.setString(2, f.getCpf_func());
               stm.setString(3, f.getRg_func());
               stm.setString(4, f.getEstadoCivil_func());
               stm.setString(5, f.getSexo_func());
               stm.setString(6, f.getDataNascimento_func());
               stm.setString(7, f.getSalario_func()); 
               stm.setString(8, f.getTelefone_func());
               stm.setString(9, f.getFuncao_func());
               stm.setString(10, f.getEndereco_func());              
               stm.setInt(11,f.getId_funcionario());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "registro Atualizado com sucesso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar o registro" + ex.getMessage());
        }
        
    
    }

    public void deleter(Funcionario f) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "DELETE FROM Funcionario WHERE id_funcionario = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "deseja excluir o Funcionario?" + f.getNome_func(), "exclusão", JOptionPane.YES_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, f.getId_funcionario());
                stm.executeUpdate();
                stm.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Exclussão realizada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o registro " + ex.getMessage());
            }
        }
    }

    public List<Funcionario> listarTodos(String sql) {
        Connection con = ConexaoBD.getConectarBD();
        List<Funcionario> lista = new ArrayList<>();
        if (sql == "null" ){             
        sql = "SELECT * FROM Funcionario";
        }
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                Funcionario f = new Funcionario();
                f.setId_funcionario((resultado.getInt("id_funcionario")));
                f.setNome_func(resultado.getString("nome_func"));
                f.setCpf_func(resultado.getString("cpf_func"));
                f.setRg_func(resultado.getString("rg_func"));
                f.setEstadoCivil_func(resultado.getString("estadoCivil_func"));
                f.setSexo_func(resultado.getString("sexo_func"));
                f.setDataNascimento_func(resultado.getString("dataNasc_func"));
                f.setSalario_func(resultado.getString("salario_func"));
                f.setTelefone_func(resultado.getString("telefone_func"));
                f.setFuncao_func(resultado.getString("funcao_func"));
                f.setEndereco_func(resultado.getString("endereco_func"));
                lista.add(f);     
            }
                 stm.close();
                 con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR " + ex.getMessage());
        }
        return lista;
    }




    
    public Funcionario login (Funcionario f){
     Connection conexao = ConexaoBD.getConectarBD();

     String sql = "SELECT * FROM Funcionario WHERE cpf_func = ? and senha_func = ?";
        try(PreparedStatement smt = conexao.prepareStatement(sql)){
          smt.setString(1, f.getCpf_func());
          smt.setString(2, f.getSenha_func());
          ResultSet resultado = smt.executeQuery();
          resultado.next();
            if (resultado.getInt("id_funcionario") > 0 ) {
                
                f.setId_funcionario(resultado.getInt("id_funcionario"));
                f.setNome_func(resultado.getString("nome_func"));
                f.setSexo_func(resultado.getString("sexo_func"));
                f.setRg_func(resultado.getString("rg_func"));
                f.setCpf_func(resultado.getString("cpf_func"));
                f.setEndereco_func(resultado.getString("telefone_func"));
                f.setTelefone_func(resultado.getString("telefone_func"));
                f.setFuncao_func(resultado.getString("funcao_func"));
                f.setSenha_func(resultado.getString("senha_func"));
            }else{
            JOptionPane.showMessageDialog(null, "USUÁRIO OU SENHA INCORRETO! ");

            }
        } catch (Exception ex) {
           // JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR AO USUÁRIO"+ ex.getMessage());
        }
        return f;
        }
        
            
    
    
    
    }


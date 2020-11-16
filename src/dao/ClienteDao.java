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
import regrasDeNegocios.Cliente;
import utilitarios.ConexaoBD;


/**
 *
 * @author karolaine
 */
public class ClienteDao {
    
   

    public void inserir(Cliente c ) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "call cadastrocliente(?,?,?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
               stm.setString(1, c.getNome_cli());
               stm.setString(2, c.getCpf_cli());
               stm.setString(3, c.getRg_cli());
               stm.setString(4, c.getEstadoCivil());
               stm.setString(5, c.getSexo_cli());
               stm.setString(6, c.getDataNasc_cli());
               stm.setString(7, c.getTelefone_cli());
               stm.setString(8,c.getEndereco_cli());
                 ResultSet rs = stm.executeQuery();
                
                while(rs.next()){    
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
                }
               stm.close();
               con.close();
        

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR" + ex.getMessage());
         }
    }
      public void atualiza(Cliente c) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "UPDATE cliente set nome_cli=?,cpf_cli=?,rg_cli=?,estadoCivil_cli=?,sexo_cli=?,dataNasc_cli=?,telefone_cli=?,endereco_cli=?  WHERE id_cliente=?";

        try (PreparedStatement stm = con.prepareStatement(sql)) {
               stm.setString(1, c.getNome_cli());
               stm.setString(2, c.getCpf_cli());
               stm.setString(3, c.getRg_cli());
               stm.setString(4, c.getEstadoCivil());
               stm.setString(5, c.getSexo_cli());
               stm.setString(6, c.getDataNasc_cli());
               stm.setString(7, c.getTelefone_cli());
               stm.setString(8,c.getEndereco_cli());
               stm.setInt(9,c.getId_cliente());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "registro Atualizar com sucesso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar o registro" + ex.getMessage());
        }
        
    
    }

    public void deleter(Cliente c) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "deseja excluir o Cliente?" + c.getNome_cli(), "exclusão", JOptionPane.YES_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, c.getId_cliente());
                stm.executeUpdate();
                stm.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Exclussão realizada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o registro " + ex.getMessage());
            }
        }
    }

    public List<Cliente> listarTodos(String sql) {
        Connection con = ConexaoBD.getConectarBD();
        List<Cliente> lista = new ArrayList<>();
        if (sql == "null" ){             
        sql = "SELECT * FROM cliente";
        }
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                Cliente c = new Cliente();
                c.setId_cliente((resultado.getInt("id_cliente")));
                c.setNome_cli(resultado.getString("nome_cli"));
                c.setCpf_cli(resultado.getString("cpf_cli"));
                c.setRg_cli(resultado.getString("rg_cli"));
                c.setEstadoCivil(resultado.getString("estadoCivil_cli"));
                c.setSexo_cli(resultado.getString("sexo_cli"));
                c.setDataNasc_cli(resultado.getString("dataNasc_cli"));
                c.setTelefone_cli(resultado.getString("telefone_cli"));
                c.setEndereco_cli(resultado.getString("endereco_cli"));
                lista.add(c);                 
            }
                 stm.close();
                 con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR " + ex.getMessage());
        }
        return lista;
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import regrasDeNegocios.Fornecedor;
import regrasDeNegocios.Produto;
import utilitarios.ConexaoBD;

/**
 *
 
 */
public class ProdutoDao {
    public void inserir (Produto p){
     Connection con = ConexaoBD.getConectarBD();
     String sql= "call cadastroproduto(?,?,?,?,?)";
     try(PreparedStatement stm = con.prepareStatement(sql)){
             
         stm.setString(1, p.getDescricao_prod());
         stm.setString(2, p.getMarca_prod());
         stm.setFloat(3, p.getQuant_prod());
         stm.setFloat(4, p.getValor_prod());
         stm.setInt(5, p.getFornecedor().getId_fornecedor());
         stm.executeUpdate();
         con.close();
         JOptionPane.showMessageDialog(null,"cadastrado com sucesso!");
         
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Erro ao Cadastrar"+ex.getMessage());
     }
     
    }
    public void atualizar(Produto p){
        Connection con = ConexaoBD.getConectarBD(); 
        String sql= "UPDATE Produto SET descricao_prod=?,marca_prod =?,quant_prod=?,valor_prod=?, id_fornecedor=? WHERE id_produto=?"; 
        try(PreparedStatement stm= con.prepareStatement(sql)){
        
            stm.setString(1, p.getDescricao_prod());
            stm.setString(2, p.getMarca_prod());
            stm.setFloat(3, p.getQuant_prod());
            stm.setFloat(4, p.getValor_prod());
            stm.setInt(5, p.getFornecedor().getId_fornecedor());
            stm.setInt(6, p.getId_produto());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
         
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar"+ ex.getMessage()); 
            
        }
    }
    public void deletar(Produto p){
        Connection con = ConexaoBD.getConectarBD();
        String sql ="DELETE FROM Produto WHERE id_produto=?"; //passar o parametro;
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir o produto"+p.getDescricao_prod()+"?", "Exclusão", JOptionPane.YES_NO_OPTION);//janela de confirmação
        if(opcao==JOptionPane.YES_OPTION){//retorna zero
            try(PreparedStatement stm = con.prepareStatement(sql)){
                stm.setInt(1, p.getId_produto());
                stm.executeUpdate();
                stm.close();//fechou o prepared
                con.close();//fechou a conecção
                JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao Excluir"+ ex.getMessage());
                
            }
            
        }
        
    }
    public List<Produto> listarTodos(String sql){//REORNA UMA LISTA DO OBJETO produto
        Connection con=ConexaoBD.getConectarBD();
        List<Produto>lista = new ArrayList<>(); //criado uma lista
         if (sql == "null" ){             
         sql = "SELECT *FROM Produto INNER Join fornecedor on fornecedor.id_fornecedor = produto.id_fornecedor"; 
         }
        
        try(PreparedStatement stm = con.prepareStatement(sql)){ //preparar a sql
            ResultSet resultado= stm.executeQuery();
            while (resultado.next()){
                Produto p = new Produto();
                p.setId_produto(resultado.getInt("id_produto"));//igual do banco 
                p.setDescricao_prod(resultado.getString("descricao_prod"));
                p.setMarca_prod(resultado.getString("marca_prod"));
                p.setQuant_prod(resultado.getInt("quant_prod"));
                p.setValor_prod(resultado.getFloat("valor_prod")); 
                Fornecedor f = new Fornecedor();
                f.setId_fornecedor(resultado.getInt("fornecedor.id_fornecedor"));
                f.setNome_for(resultado.getString("fornecedor.nome_for"));
                f.setCnpj_for(resultado.getString("fornecedor.cnpj_for"));
                f.setEndereco_for(resultado.getString("fornecedor.endereco_for"));
                f.setTelefone_for(resultado.getString("fornecedor.telefone_for"));
                p.setFornecedor(f);
                lista.add(p);
             }
            stm.close();
            stm.close();
       }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao retornar"+ ex.getMessage());
       }
        return lista; 
    }
    
    
}

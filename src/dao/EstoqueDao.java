
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import regrasDeNegocios.Produto;
import regrasDeNegocios.Estoque;
import utilitarios.ConexaoBD;


public class EstoqueDao {
        public void inserir (Estoque e){
     Connection con = ConexaoBD.getConectarBD();
     String sql= "INSERT INTO estoque( quantidade_es,id_produto )"
             +"VALUES(?,?)";
     try(PreparedStatement stm = con.prepareStatement(sql)){
     
         stm.setInt(1, e.getQuantidade_es());
         stm.setInt(2,e.getProduto().getId_produto());
         stm.executeUpdate();
         con.close();
         JOptionPane.showMessageDialog(null,"cadastrado com sucesso!");
         
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Erro ao Cadastrar"+ex.getMessage());
     }
     
    }
        public void atualizar(Estoque e){
        Connection con = ConexaoBD.getConectarBD(); 
        String sql= "call atualizarEstoque(?,?,?)"; 
        try(PreparedStatement stm= con.prepareStatement(sql)){
            stm.setInt(1, e.getQuantidade_es());
            stm.setInt(2, e.getProduto().getId_produto());
            stm.setInt(3, e.getId_es());
            ResultSet rs = stm.executeQuery();
                
                while(rs.next()){    
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
                }
            stm.close();
            con.close();
  
         
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar"+ ex.getMessage()); 
            
        }
    }
    public void deletar(Estoque e){
        Connection con = ConexaoBD.getConectarBD();
        String sql ="DELETE FROM estoque WHERE id_es=?"; //passar o parametro;
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir o produto"+e.getProduto()+"?", "Exclusão", JOptionPane.YES_NO_OPTION);//janela de confirmação
        if(opcao==JOptionPane.YES_OPTION){//retorna zero
            try(PreparedStatement stm = con.prepareStatement(sql)){
                stm.setInt(1,e.getId_es());
                stm.executeUpdate();
                stm.close();//fechou o prepared
                con.close();//fechou a conecção
                JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao Excluir"+ ex.getMessage());
                
            }
            
        }
        
    }
    public List<Estoque> listarTodos(String sql){//REORNA UMA LISTA DO OBJETO produto
        Connection con=ConexaoBD.getConectarBD();
        List<Estoque>lista = new ArrayList<>(); //criado uma lista
        if (sql == "null" ){    
        sql = "SELECT *FROM estoque INNER Join produto on estoque.id_produto = produto.id_produto"; 
        }
        try(PreparedStatement stm = con.prepareStatement(sql)){ //preparar a sql
            ResultSet resultado= stm.executeQuery();
            while (resultado.next()){
                Estoque e = new Estoque();
                e.setId_es(resultado.getInt("Estoque.id_es"));//igual do banco 
                e.setQuantidade_es(resultado.getInt("Estoque.quantidade_es"));
            
                Produto p = new Produto();
                p.setId_produto(resultado.getInt("Produto.id_produto"));//igual do banco 
                p.setDescricao_prod(resultado.getString("Produto.descricao_prod"));
                p.setMarca_prod(resultado.getString("Produto.marca_prod"));
                p.setQuant_prod(resultado.getInt("Produto.quant_prod"));
                p.setValor_prod(resultado.getFloat("Produto.valor_prod"));
                e.setProduto(p);
                lista.add(e);
             }
            stm.close();
            con.close();
       }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao retornar"+ ex.getMessage());
       }
        return lista; 
    }
    
    
}

    
    



package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import regrasDeNegocios.Caixa;
import regrasDeNegocios.Pagamento;

import utilitarios.ConexaoBD;

public class PagamentoDao {
    public void inserir (Pagamento p) {
     Connection con = ConexaoBD.getConectarBD();
     String sql= "INSERT INTO pagamento(forma_pag, data_pag , valor_pag,quantidade_pag )"
             +"VALUES(?,?,?,?)";
     try(PreparedStatement stm = con.prepareStatement(sql)){
     
         
         stm.executeUpdate();
         con.close();
         JOptionPane.showMessageDialog(null,"cadastrado com sucesso!");
         
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Erro ao Cadastrar"+ex.getMessage());
     }
     
    }
    public void atualizar(Pagamento p){
        Connection con = ConexaoBD.getConectarBD(); 
        String sql= "UPDATE pagamento SET forma_pag=?, data_pag=? , valor_pag=? ,quantidade_pag=? WHERE id_pag=?"; 
        try(PreparedStatement stm= con.prepareStatement(sql)){
        
           
          
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
         
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar"+ ex.getMessage()); 
            
        }
    }
    public void deletar(Pagamento p){
        Connection con = ConexaoBD.getConectarBD();
        String sql ="DELETE FROM pagamento WHERE id_pag=?"; //passar o parametro;
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir o produto", "Exclusão", JOptionPane.YES_NO_OPTION);//janela de confirmação
        if(opcao==JOptionPane.YES_OPTION){//retorna zero
            try(PreparedStatement stm = con.prepareStatement(sql)){
             
                stm.executeUpdate();
                stm.close();//fechou o prepared
                con.close();//fechou a conecção
                JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao Excluir"+ ex.getMessage());
                
            }
            
        }
        
    }
    public List<Pagamento> listarTodos(){//REORNA UMA LISTA DO OBJETO produto
        Connection con=ConexaoBD.getConectarBD();
        List<Pagamento>lista = new ArrayList<>(); //criado uma lista
        String sql = "SELECT *FROM pagamento"; 
        try(PreparedStatement stm = con.prepareStatement(sql)){ //preparar a sql
            ResultSet resultado= stm.executeQuery();
            while (resultado.next()){
           
               
         
             }
            stm.close();
            stm.close();
       }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao retornar"+ ex.getMessage());
       }
        return lista; 
    }
    
    
}

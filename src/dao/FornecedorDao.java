
package dao;

import regrasDeNegocios.Fornecedor;
import utilitarios.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class FornecedorDao {
    
    public void cadastrar(Fornecedor f){
        Connection conexao = ConexaoBD.getConectarBD();
        String sql = "INSERT INTO fornecedor(nome_for,cnpj_for,telefone_for,endereco_for)VALUES (?,?,?,?)";
        try(PreparedStatement stm = conexao.prepareStatement(sql)){
            stm.setString(1, f.getNome_for());
            stm.setString(2, f.getCnpj_for());
            stm.setString(3, f.getTelefone_for());
            stm.setString(4, f.getEndereco_for());
            stm.executeUpdate();
            stm.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, f.getNome_for()+" Cadastrado Com Sucesso!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Falha ao Cadastrar: "+erro.getMessage());
        }
    }
    
    public void atualiza(Fornecedor f) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "UPDATE fornecedor set nome_for=?,cnpj_for=? ,telefone_for=?,endereco_for =?  WHERE id_fornecedor=?";

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, f.getNome_for());
            stm.setString(2, f.getCnpj_for());
            stm.setString(3, f.getTelefone_for());
            stm.setString(4, f.getEndereco_for());
            stm.setInt(5, f.getId_fornecedor());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "registro Atualizar com sucesso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar o registro" + ex.getMessage());
        }
        
    
    }

  
    
    
    public void excluir(Fornecedor f ){
        Connection conexao = ConexaoBD.getConectarBD();
        String sql = "DELETE FROM fornecedor WHERE id_fornecedor=?";
       
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o Fornecedor secionado?"+f.getNome_for(),"Excluir Fornecedor",JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
        try(PreparedStatement stm = conexao.prepareStatement(sql)){
            stm.setInt(1, f.getId_fornecedor());
            stm.executeLargeUpdate();
            stm.close();
            conexao.close();
            JOptionPane.showMessageDialog(null,"Fornecedor Excluido com Sucesso");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Falha ao Excluir Fornecedor: "+erro.getMessage());

        }
      }
    }
    
    public List<Fornecedor> listarTodos(String sql){
        Connection conexao = ConexaoBD.getConectarBD();
        List<Fornecedor> lista = new ArrayList<>();
         if (sql == "null" ){             
        sql = "SELECT * FROM Fornecedor";
        
        }
       
        try(PreparedStatement stm = conexao.prepareStatement(sql) ){
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                Fornecedor f = new Fornecedor();
                f.setId_fornecedor(resultado.getInt("id_fornecedor"));
                f.setNome_for(resultado.getString("nome_for"));
                f.setCnpj_for(resultado.getString("cnpj_for"));
                f.setTelefone_for(resultado.getString("telefone_for"));
                f.setEndereco_for(resultado.getString("endereco_for"));
                
                lista.add(f);
            }
                stm.close();
                conexao.close();
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Falha na Listagem: "+erro.getMessage());
        }
   
        return lista;
        
    }
    
}

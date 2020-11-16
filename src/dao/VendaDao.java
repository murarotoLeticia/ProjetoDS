package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import regrasDeNegocios.Cliente;
import regrasDeNegocios.Itens_venda;
import regrasDeNegocios.Produto;
import regrasDeNegocios.Venda;
import utilitarios.ConexaoBD;

public class VendaDao{
   
    public void novaVenda(Venda v){
         
         Connection con = ConexaoBD.getConectarBD();
        String sql = "call criarvenda(?,?,?)";
     
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, v.getFuncionario().getId_funcionario());  
            stm.setInt(2, v.getCliente().getId_cliente());
            stm.setString(3,v.getFormaDPagamento());
                
               ResultSet rs = stm.executeQuery();
               
               
                stm.close();
                con.close();
                        
           } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR" + ex.getMessage());
             
         }
    }
    
    public void cancelarVenda(int x){     
         Connection con = ConexaoBD.getConectarBD();
        String sql = "call cancelarVenda()";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
              ResultSet rs = stm.executeQuery();
              
               while(rs.next()){
                if (x==0){
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
              }
                }
               stm.close();
               con.close();
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO cancelar" + ex.getMessage());
         }
    }
    
    public void inserirProduto(Venda v){
          Connection con = ConexaoBD.getConectarBD();
        String sql = "call addprodutoAVenda(?,?)";             
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            
            stm.setInt(1, v.getQuantidade());   
            stm.setInt(2, v.getProduto().getId_produto());
               
               
              ResultSet rs  = stm.executeQuery();
              
            while(rs.next()){
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
                }
               stm.close();
               con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR" + ex.getMessage());
            
         }
    }
         
    public void removerProduto(String v){
          Connection con = ConexaoBD.getConectarBD();
        String sql = "call removerProduto(?)";             
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            
            stm.setString(1, v);   
                     
              ResultSet rs  = stm.executeQuery();
              
            while(rs.next()){
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
                }
               stm.close();
               con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR" + ex.getMessage());
            
         }
    }
    
    public void finalizarVenda(Venda v){
                Connection con = ConexaoBD.getConectarBD();
        String sql = "call finalizarvenda(?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
              stm.setFloat(1, v.getValorTotal() );
              ResultSet rs = stm.executeQuery();
               while(rs.next()){
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
                }
               stm.close();
               con.close();
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO cancelar" + ex.getMessage());
         }
    }
    
    
 public List<Itens_venda> listarTodos(String sql) {
        Connection con = ConexaoBD.getConectarBD();
        List<Itens_venda> lista = new ArrayList<>();
        if (sql == "null" ){             
        sql = "select * from Itens_venda inner join produto on produto.id_produto = Itens_venda.Id_produto where id_venda =( select id_venda from venda where status_vend like '%venda Iniciada%')";
        }
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                Itens_venda it= new Itens_venda();
                it.setId_itenv(resultado.getInt("Itens_Venda.id_produto"));
                it.setQuant_itenv(resultado.getInt("Itens_Venda.quant_itenv"));
                it.setValor_itenv(resultado.getInt("Itens_Venda.valor_itenv"));              
                Produto p = new Produto();
                p.setId_produto(resultado.getInt("produto.id_produto"));//igual do banco 
                p.setDescricao_prod(resultado.getString("produto.descricao_prod"));
                p.setMarca_prod(resultado.getString("produto.marca_prod"));
                p.setQuant_prod(resultado.getInt("produto.quant_prod"));
                p.setValor_prod(resultado.getFloat("produto.valor_prod"));
                it.setProduto(p);
                lista.add(it);                 
            }
                 stm.close();
                 con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR " + ex.getMessage());
        }
        return lista;
    }


}
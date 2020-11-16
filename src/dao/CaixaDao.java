package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utilitarios.ConexaoBD;
import regrasDeNegocios.Caixa;
import regrasDeNegocios.Venda;

public class CaixaDao {
    String z;
    String x;
   Caixa c = new Caixa();
    

    public Statement stm;
  


    public boolean checarSaldoCaixa() {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "call checarSaldoCaixa()";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
          
            stm.close();
            con.close();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR " + ex.getMessage());
        }
        return false;
    }

  

     public void fechaCaixa() {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "call fecharCaixa()";
        int opcao = JOptionPane.showConfirmDialog(null, "deseja fechar o caixa?" , "fechar caixa", JOptionPane.YES_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
        try (PreparedStatement stm = con.prepareStatement(sql)) {
              ResultSet rs = stm.executeQuery();
                
                while(rs.next()){    
                JOptionPane.showMessageDialog(null,rs.getString("Msg"));
                }
                stm.close();
                con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar" + ex.getMessage());
        }
    }
     }
    public void atualizar(Caixa c) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "UPDATE caixa SET dataabertura_cai =?, saldoinicial_cai=?,valorcreditos_cai=?,valordebitos_cai=?,status_cai=?,datafechamento_cai WHERE id_caixa=?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, c.getDataabetura_cai());
            stm.setDouble(2, c.getSaldoinicial_cai());
            stm.setDouble(3, c.getValorcreditos_cai());
            stm.setDouble(4, c.getValordebitos_cai());
            stm.setString(5, c.getStatus_cai());
            stm.setString(6, c.getDatafechamento_cai());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex.getMessage());
        }
    }

    public void deletar(Caixa c) {
        Connection con = ConexaoBD.getConectarBD();
        String sql = "DELETE FROM caixa WHERE id_caixa=?"; //passar o parametro;
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o produto" + c.getDataabetura_cai() + "?", "Exclusão", JOptionPane.YES_NO_OPTION);//janela de confirmação
        if (opcao == JOptionPane.YES_OPTION) {//retorna zero
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, c.getId_caixa());
                stm.executeUpdate();
                stm.close();//fechou o prepared
                con.close();//fechou a conecção
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir" + ex.getMessage());
            }
        }
    }

    public List<Caixa> listarTodos(String sql) {//REORNA UMA LISTA DO OBJETO produto
        Connection con = ConexaoBD.getConectarBD();
        List<Caixa> lista = new ArrayList<>(); //criado uma lista
        if (sql == "null" ){             
        sql = "SELECT *FROM caixa";
        }
        try (PreparedStatement stm = con.prepareStatement(sql)) { //preparar a sql
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                Caixa c = new Caixa();
                c.setId_caixa(resultado.getInt("id_caixa"));//igual do banco 
                c.setDataabetura_cai(resultado.getString("dataabertura_cai"));
                c.setSaldoinicial_cai(resultado.getDouble("saldoinicial_cai"));
                c.setValorcreditos_cai(resultado.getDouble("valorcreditos_cai"));
                c.setValordebitos_cai(resultado.getDouble("valordebitos_cai"));
                c.setSaldofinal_cai(resultado.getDouble("saldofinal_cai"));
                c.setStatus_cai(resultado.getString("status_cai"));
                c.setDatafechamento_cai(resultado.getString("datafechamento_cai"));
                lista.add(c);
            }
            stm.close();
            stm.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar" + ex.getMessage());
        }
        return lista;
    }

}

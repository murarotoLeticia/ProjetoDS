
package utilitarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class ConexaoBD {

    private static final String usuario = "root";
    private static final String senha = "12345";
    private static final String url = "jdbc:mysql://localhost:3306/cutelaria_artesanala?useTimezone=true&serverTimezone=UTC";
  
     
    public static Connection getConectarBD(){
        Connection conexctar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexctar = DriverManager.getConnection(url, usuario, senha);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Falha Na conexao: "+erro.getMessage());
        }
        
        return conexctar;
    }
    

    
}

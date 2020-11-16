
package regrasDeNegocios;

import java.sql.Date;


public class Estoque {

    private int id_es; 
    private int quantidade_es;
    private Produto produto; 
 

    public int getId_es() {
        return id_es;
    }

    public void setId_es(int id_es) {
        this.id_es = id_es;
    }

    public int getQuantidade_es() {
        return quantidade_es;
    }

    public void setQuantidade_es(int quantidade_es) {
        this.quantidade_es = quantidade_es;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
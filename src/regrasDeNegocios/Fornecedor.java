
package regrasDeNegocios;

public class Fornecedor {
    private int id_fornecedor;
    private String nome_for;
    private String cnpj_for;
    private String endereco_for;
    private String telefone_for;

 
    @Override
    public String toString() {
        return getNome_for(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id_fornecedor
     */
    public int getId_fornecedor() {
        return id_fornecedor;
    }

    /**
     * @param id_fornecedor the id_fornecedor to set
     */
    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    /**
     * @return the nome_for
     */
    public String getNome_for() {
        return nome_for;
    }

    /**
     * @param nome_for the nome_for to set
     */
    public void setNome_for(String nome_for) {
        this.nome_for = nome_for;
    }

    /**
     * @return the cnpj_for
     */
    public String getCnpj_for() {
        return cnpj_for;
    }

    /**
     * @param cnpj_for the cnpj_for to set
     */
    public void setCnpj_for(String cnpj_for) {
        this.cnpj_for = cnpj_for;
    }

    /**
     * @return the endereco_for
     */
    public String getEndereco_for() {
        return endereco_for;
    }

    /**
     * @param endereco_for the endereco_for to set
     */
    public void setEndereco_for(String endereco_for) {
        this.endereco_for = endereco_for;
    }

    /**
     * @return the telefone_for
     */
    public String getTelefone_for() {
        return telefone_for;
    }

    /**
     * @param telefone_for the telefone_for to set
     */
    public void setTelefone_for(String telefone_for) {
        this.telefone_for = telefone_for;
    }
    
    

   
 
}

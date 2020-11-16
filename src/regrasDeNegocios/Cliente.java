/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocios;

/**
 *
 *
 */
public class Cliente {
    
    private int id_cliente;
    private String nome_cli;
    private String cpf_cli;
    private String rg_cli;
    private String estadoCivil;
    private String sexo_cli;
    private String dataNasc_cli;
    private String telefone_cli;
    private String endereco_cli;

    /**
     * @return the id_Cliente
     */
  

    /**
     * @return the nome_cli
     */
    public String getNome_cli() {
        return nome_cli;
    }

    /**
     * @param nome_cli the nome_cli to set
     */
    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    /**
     * @return the cpf_cli
     */
    public String getCpf_cli() {
        return cpf_cli;
    }

    /**
     * @param cpf_cli the cpf_cli to set
     */
    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    /**
     * @return the rg_cli
     */
    public String getRg_cli() {
        return rg_cli;
    }

    /**
     * @param rg_cli the rg_cli to set
     */
    public void setRg_cli(String rg_cli) {
        this.rg_cli = rg_cli;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the sexo_cli
     */
    public String getSexo_cli() {
        return sexo_cli;
    }

    /**
     * @param sexo_cli the sexo_cli to set
     */
    public void setSexo_cli(String sexo_cli) {
        this.sexo_cli = sexo_cli;
    }

    /**
     * @return the dataNasc_cli
     */
    public String getDataNasc_cli() {
        return dataNasc_cli;
    }

    /**
     * @param dataNasc_cli the dataNasc_cli to set
     */
    public void setDataNasc_cli(String dataNasc_cli) {
        this.dataNasc_cli = dataNasc_cli;
    }

    /**
     * @return the telefone_cli
     */
    public String getTelefone_cli() {
        return telefone_cli;
    }

    /**
     * @param telefone_cli the telefone_cli to set
     */
    public void setTelefone_cli(String telefone_cli) {
        this.telefone_cli = telefone_cli;
    }

    /**
     * @return the endereco_cli
     */
    public String getEndereco_cli() {
        return endereco_cli;
    }

    /**
     * @param endereco_cli the endereco_cli to set
     */
    public void setEndereco_cli(String endereco_cli) {
        this.endereco_cli = endereco_cli;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return nome_cli; //To change body of generated methods, choose Tools | Templates.
    }


  
 
}
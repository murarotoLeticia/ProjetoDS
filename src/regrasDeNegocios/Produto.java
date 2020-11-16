/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocios;

/**
 *

 */
public class Produto {
    private int id_produto; 
    private String descricao_prod; 
    private String marca_prod; 
    private int quant_prod;
    private float valor_prod ;
    private Fornecedor fornecedor;

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the descricao_prod
     */
    public String getDescricao_prod() {
        return descricao_prod;
    }

    /**
     * @param descricao_prod the descricao_prod to set
     */
    public void setDescricao_prod(String descricao_prod) {
        this.descricao_prod = descricao_prod;
    }

    /**
     * @return the marca_prod
     */
    public String getMarca_prod() {
        return marca_prod;
    }

    /**
     * @param marca_prod the marca_prod to set
     */
    public void setMarca_prod(String marca_prod) {
        this.marca_prod = marca_prod;
    }

    public float getValor_prod() {
        return valor_prod;
    }

    /**
     * @param valor_prod the valor_prod to set
     */
    public void setValor_prod(float valor_prod) {
        this.valor_prod = valor_prod;
    }

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return descricao_prod; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the quant_prod
     */
    public int getQuant_prod() {
        return quant_prod;
    }

    /**
     * @param quant_prod the quant_prod to set
     */
    public void setQuant_prod(int quant_prod) {
        this.quant_prod = quant_prod;
    }
}
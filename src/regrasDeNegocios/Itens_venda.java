
package regrasDeNegocios;


public class Itens_venda {
    private int id_itenv;
    private int quant_itenv;
    private float valor_itenv;
    private Produto produto;
    private Venda venda;

    /**
     * @return the id_itenv
     */
    public int getId_itenv() {
        return id_itenv;
    }

    /**
     * @param id_itenv the id_itenv to set
     */
    public void setId_itenv(int id_itenv) {
        this.id_itenv = id_itenv;
    }

    /**
     * @return the quant_itenv
     */
    public int getQuant_itenv() {
        return quant_itenv;
    }

    /**
     * @param quant_itenv the quant_itenv to set
     */
    public void setQuant_itenv(int quant_itenv) {
        this.quant_itenv = quant_itenv;
    }

    /**
     * @return the valor_itenv
     */
    public float getValor_itenv() {
        return valor_itenv;
    }

    /**
     * @param valor_itenv the valor_itenv to set
     */
    public void setValor_itenv(float valor_itenv) {
        this.valor_itenv = valor_itenv;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

}
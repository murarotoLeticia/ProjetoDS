
package regrasDeNegocios;

import java.sql.Date;


public class Despesa {
    private int id_despesa; 
    private String descricao_desp; 
    private Double valor_desp ;
    private String datavencimento_desp;
    private String numerodoc_desp; 
    private String statusAtual_desp;

    /**
     * @return the id_despesa
     */
    public int getId_despesa() {
        return id_despesa;
    }

    /**
     * @param id_despesa the id_despesa to set
     */
    public void setId_despesa(int id_despesa) {
        this.id_despesa = id_despesa;
    }

    /**
     * @return the descricao_desp
     */
    public String getDescricao_desp() {
        return descricao_desp;
    }

    /**
     * @param descricao_desp the descricao_desp to set
     */
    public void setDescricao_desp(String descricao_desp) {
        this.descricao_desp = descricao_desp;
    }

    /**
     * @return the valor_desp
     */
    public Double getValor_desp() {
        return valor_desp;
    }

    /**
     * @param valor_desp the valor_desp to set
     */
    public void setValor_desp(Double valor_desp) {
        this.valor_desp = valor_desp;
    }

    /**
     * @return the datavencimento_desp
     */
    public String getDatavencimento_desp() {
        return datavencimento_desp;
    }

    /**
     * @param datavencimento_desp the datavencimento_desp to set
     */
    public void setDatavencimento_desp(String datavencimento_desp) {
        this.datavencimento_desp = datavencimento_desp;
    }

    /**
     * @return the numerodoc_desp
     */
    public String getNumerodoc_desp() {
        return numerodoc_desp;
    }

    /**
     * @param numerodoc_desp the numerodoc_desp to set
     */
    public void setNumerodoc_desp(String numerodoc_desp) {
        this.numerodoc_desp = numerodoc_desp;
    }

    /**
     * @return the statusAtual_desp
     */
    public String getStatusAtual_desp() {
        return statusAtual_desp;
    }

    /**
     * @param statusAtual_desp the statusAtual_desp to set
     */
    public void setStatusAtual_desp(String statusAtual_desp) {
        this.statusAtual_desp = statusAtual_desp;
    }
}
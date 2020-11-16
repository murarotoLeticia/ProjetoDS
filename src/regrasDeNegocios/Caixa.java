/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocios;


public class Caixa {
    private int id_caixa; 
    private String dataabetura_cai; 
    private String datafechamento_cai;
    private Double saldoinicial_cai;
    private Double valorcreditos_cai; 
    private Double valordebitos_cai;
    private Double saldofinal_cai;
    private String status_cai;
    private Double quant_caixa;

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public String getDataabetura_cai() {
        return dataabetura_cai;
    }

    public void setDataabetura_cai(String dataabetura_cai) {
        this.dataabetura_cai = dataabetura_cai;
    }

    public String getDatafechamento_cai() {
        return datafechamento_cai;
    }

    public void setDatafechamento_cai(String datafechamento_cai) {
        this.datafechamento_cai = datafechamento_cai;
    }

    public Double getSaldoinicial_cai() {
        return saldoinicial_cai;
    }

    public void setSaldoinicial_cai(Double saldoinicial_cai) {
        this.saldoinicial_cai = saldoinicial_cai;
    }

    public Double getValorcreditos_cai() {
        return valorcreditos_cai;
    }

    public void setValorcreditos_cai(Double valorcreditos_cai) {
        this.valorcreditos_cai = valorcreditos_cai;
    }

    public Double getValordebitos_cai() {
        return valordebitos_cai;
    }

    public void setValordebitos_cai(Double valordebitos_cai) {
        this.valordebitos_cai = valordebitos_cai;
    }

    public Double getSaldofinal_cai() {
        return saldofinal_cai;
    }

    public void setSaldofinal_cai(Double saldofinal_cai) {
        this.saldofinal_cai = saldofinal_cai;
    }

    public String getStatus_cai() {
        return status_cai;
    }

    public void setStatus_cai(String status_cai) {
        this.status_cai = status_cai;
    }

    /**
     * @return the quant_caixa
     */
    public Double getQuant_caixa() {
        return quant_caixa;
    }

    /**
     * @param quant_caixa the quant_caixa to set
     */
    public void setQuant_caixa(Double quant_caixa) {
        this.quant_caixa = quant_caixa;
    }

   
}


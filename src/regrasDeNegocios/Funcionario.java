
package regrasDeNegocios;

public class Funcionario {
    private int id_funcionario;
    private String nome_func;
    private String cpf_func;
    private String rg_func;
    private String EstadoCivil_func ;
    private String sexo_func;
    private String dataNascimento_func;
    private String salario_func;
    private String telefone_func;
    private String funcao_func;
    private String Endereco_func; 
    private String email_func;
    private String senha_func ;

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getCpf_func() {
        return cpf_func;
    }

    public void setCpf_func(String cpf_func) {
        this.cpf_func = cpf_func;
    }

    public String getRg_func() {
        return rg_func;
    }

    public void setRg_func(String rg_func) {
        this.rg_func = rg_func;
    }

    public String getEstadoCivil_func() {
        return EstadoCivil_func;
    }

    public void setEstadoCivil_func(String EstadoCivil_func) {
        this.EstadoCivil_func = EstadoCivil_func;
    }

    public String getSexo_func() {
        return sexo_func;
    }

    public void setSexo_func(String sexo_func) {
        this.sexo_func = sexo_func;
    }

    public String getDataNascimento_func() {
        return dataNascimento_func;
    }

    public void setDataNascimento_func(String dataNascimento_func) {
        this.dataNascimento_func = dataNascimento_func;
    }

    public String getSalario_func() {
        return salario_func;
    }

    public void setSalario_func(String salario_func) {
        this.salario_func = salario_func;
    }

    public String getTelefone_func() {
        return telefone_func;
    }

    public void setTelefone_func(String telefone_func) {
        this.telefone_func = telefone_func;
    }

    public String getFuncao_func() {
        return funcao_func;
    }

    public void setFuncao_func(String funcao_func) {
        this.funcao_func = funcao_func;
    }

    public String getEndereco_func() {
        return Endereco_func;
    }

    public void setEndereco_func(String Endereco_func) {
        this.Endereco_func = Endereco_func;
    }

    public String getEmail_func() {
        return email_func;
    }

    public void setEmail_func(String email_func) {
        this.email_func = email_func;
    }

    public String getSenha_func() {
        return senha_func;
    }

    public void setSenha_func(String senha_func) {
        this.senha_func = senha_func;
    }

    @Override
    public String toString() {
        return getNome_func(); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
         
    
   
}

package pets.modelo;

public class Endereco {
  
    //tributos
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;


    public Endereco(String rua, String numero, String bairro, String cidade, String estado){
        this.rua = rua;
        this.numero = Integer.parseInt(numero);
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        
    }
    
    
    
    
    //rua
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    //numero
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //bairro
    public String getBairro() {
        return bairro;
    }

    public void setBairo(String bairro) {
        this.bairro = bairro;
    }
    
    //cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    //estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    

}

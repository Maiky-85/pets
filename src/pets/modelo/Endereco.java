/*
 * PetSOS
 * Aplicativo para localicação de animais domésticos perdidos
 * Projeto de Programação Orientada a Objetos I
 */

/**
 * @author Brunna Dalzini
 * @author Maikysuel Braga
 * @author Rafaela Pessin
*/ 

package pets.modelo;

public class Endereco {
  
    // atributos
    private String rua;
    private int numero;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;
    private String complemento;


    public Endereco(String rua, String numero, String bairro, String municipio, String estado, String cep, String complemento) {
        
        this.rua = rua;
        this.numero = Integer.parseInt(numero);
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;

    }
    
    // rua
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    // numero
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // bairro
    public String getBairro() {
        return bairro;
    }

    public void setBairo(String bairro) {
        this.bairro = bairro;
    }
    
    // cidade
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    // estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    // complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}

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

public class Animal {
    
    // atributos da classe Animal
    private String nome;
    private String tipo;
    private String cor;
    private String raca;
    private String sexo;
    private String porte;
    private int idade;
    private String castracao;
    private String vacinaAntirrabica;
    private String vacinaV10;
    private String vermifugacao;
    private String ultimaLocalizacao;
    private String observacao;
    
    public Animal(String nome, String tipo, String cor, String raca, String sexo, String porte, String idade, String castracao, String vacinaV10, 
    String vacinaAntirrabica, String vermifugacao, String ultimaLocalizacao, String observacao){
        
        this.nome = nome;
	this.tipo = tipo;
	this.cor = cor;
	this.raca = raca;
        this.sexo = sexo;
        this.porte = porte;
        this.idade = Integer.parseInt(idade);                                   // conversão do dado de String para inteiro
        this.castracao = castracao;
        this.vacinaAntirrabica = vacinaAntirrabica;
        this.vacinaV10 = vacinaV10;
        this.vermifugacao = vermifugacao;
        this.ultimaLocalizacao = ultimaLocalizacao;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // tipo de animal
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // cor do animal
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // raça do animal
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    // sexo do animal
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // porte do animal
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    // idade do animal
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // informação sobre castração
    public String getCastracao() {
        return castracao;
    }

    public void setCastracao(String castracao) {
        this.castracao = castracao;
    }
    
    // informação sobre data da última vacina antirrábica
    public String getVacinaAntirrabica() {
        return vacinaAntirrabica;
    }

    public void setVacinaAntirrabica(String vacinaAntirrabica) {
        this.vacinaAntirrabica = vacinaAntirrabica;
    }
    
    // informação sobre data da última vacina V10
    public String getVacinaV10() {
        return vacinaV10;
    }

    public void setVacinaV10(String vacinaV10) {
        this.vacinaV10 = vacinaV10;
    }
    
    // informação sobre data da última vermifugação
    public String getVermifugacao() {
        return vermifugacao;
    }

    public void setVermifugacao(String vermifugacao) {
        this.vermifugacao = vermifugacao;
    }
    
    // informação sobre o último local onde estev ou foi visto o animal
    public String getUltimaLocalizacao() {
        return ultimaLocalizacao;
    }
    
    public void setUltimaLocalizacao(String ultimaLocalizacao) {
        this.ultimaLocalizacao = ultimaLocalizacao;
    }
    
    // informações adicionais sobre o animal
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}

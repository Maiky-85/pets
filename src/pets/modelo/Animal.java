    
package pets.modelo;

public class Animal {
    
    private String nome;
    private String tipo;
    private String cor;
    private String raca;
    private String sexo;
    private String porte;
    private int idade;
    private String castrado;
    private String vacinaV10;
    private String vacinaAntirrabica;
    private String vermifug;
    private String obs;
    
    
    
    public Animal(String nome, String tipo, String cor, String raca, String sexo,
    String porte, String idade, String castrado, String vacinaV10, String vacinaAntirrabica, String vermifug,
    String obs){
        this.nome = nome;
	this.tipo = tipo;
	this.cor = cor;
	this.raca = raca;
        this.sexo = sexo;
        this.porte = porte;
        this.idade = Integer.parseInt(idade);
        this.castrado = castrado;
        this.vacinaV10 = vacinaV10;
        this.vacinaAntirrabica = vacinaAntirrabica;
        this.vermifug = vermifug;
        this.obs = obs;
    }

  

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //raca
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
     //sexo
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
     //porte
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
     //idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     //castrado
    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }
    
     //vacinaV10
    public String getVacinaV10() {
        return vacinaV10;
    }

    public void setVacinaV10(String vacinaV10) {
        this.vacinaV10 = vacinaV10;
    }
    
     //vacinaAntirrabica
    public String getVacinaAntirrabica() {
        return vacinaAntirrabica;
    }

    public void setVacinaAntirrabica(String vacinas) {
        this.vacinaAntirrabica = vacinaAntirrabica;
    }
    
     //vermifugacao
    public String getVermifug() {
        return vermifug;
    }

    public void setVermifug(String vermifug) {
        this.vermifug = vermifug;
    }
    
     //raca
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}

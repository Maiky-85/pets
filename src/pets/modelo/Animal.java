    
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
    private String vacinas;
    private String vermifug;
    private String obs;
    
    public Animal(String nome, String tipo, String cor, String raca, String sexo,
    String porte, String idade, String castrado, String vacinas, String vermifug,
    String obs){
        this.nome = nome;
	this.tipo = tipo;
	this.cor = cor;
	this.raca = raca;
        this.sexo = sexo;
        this.porte = porte;
        this.idade = Integer.parseInt(idade);
        this.castrado = castrado;
        this.vacinas = vacinas;
        this.vermifug = vermifug;
        this.obs = obs;
    }

    public Animal(String text, String text0, String text1, Object selectedItem, Object selectedItem0, Object selectedItem1, String text2, String text3, String text4, String text5, String text6, String text7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
     //vacinas
    public String getVacinas() {
        return vacinas;
    }

    public void setVacinas(String vacinas) {
        this.vacinas = vacinas;
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

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

public class Dono {
    
    // atributos da classe Dono
    private String nome;
    private Endereco endereco;
    private Contato contato;
    private RedeSocial redeSocial;
    
    
    public Dono(String nome, Endereco endereco, Contato contato, RedeSocial redeSocial) {
        
        this.nome = nome;
	this.endereco = endereco;
	this.contato = contato;
        this.redeSocial = redeSocial;
    }
    
    // nome do dono
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // endeço do dono
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // contato do dono
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    // redes sociais da clínica
    public RedeSocial getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(RedeSocial redeSocial) {
        this.redeSocial = redeSocial;
    }
    
}

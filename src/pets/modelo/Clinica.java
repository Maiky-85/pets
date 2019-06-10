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

public class Clinica {
    
    // atributos da classe Clinica
    private String nome;
    private Endereco endereco;
    private Contato contato;
    private RedeSocial redeSocial;

    public Clinica(String nome, Endereco endereco, Contato contato, RedeSocial redeSocial) {
        
        this.setNome(nome);
	this.setEndereco(endereco);
	this.setContato(contato);
        this.setRedeSocial(redeSocial);
    }

    // nome da clínica
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // endereço da clínica
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // contato da clínica
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

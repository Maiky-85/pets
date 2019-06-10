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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Dono {
    
    // atributos da classe Dono
    private String nome;
    private Endereco endereco;
    private Contato contato;
    private RedeSocial redeSocial;
    private String senha;
    
    
    public Dono(String nome, Endereco endereco, Contato contato, RedeSocial redeSocial, String senha) {
        
        this.setNome(nome);
	this.setEndereco(endereco);
	this.setContato(contato);
        this.setRedeSocial(redeSocial);
        this.setSenha(senha);
    }
    
    // nome do dono
    public String getNome() throws FileNotFoundException {
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


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}

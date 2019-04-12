/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author Maiky
 */
public class Dono {
    //atributos
    private String nome;
    private Endereco endereco;
    private long telefone;
    private String email;

    public Dono(String nome, Endereco endereco , String telefone, String email){
        this.nome = nome;
	this.endereco = endereco;
	this.telefone = Long.parseLong(telefone);
	this.email = email;
    }

    
    
    //nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //endereco
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //telefone
    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

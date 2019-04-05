
package pets;

public class Clinica {
    
    //atributos
    private String nome;
    private Endereco endereco;
    private long telefone;
    private String email;

    public Clinica(String nome, Endereco endereco , String telefone, String email){
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

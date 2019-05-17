
package pets.modelo;

public class Clinica {
    
    // atributos da classe Clinica
    private String nome;
    private Endereco endereco;
    private long telefone;
    private String email;

    public Clinica(String nome, Endereco endereco, String telefone, String email){
        
        this.nome = nome;
	this.endereco = endereco;
	this.telefone = Long.parseLong(telefone);                               // conversão do dado de String para Long
	this.email = email;
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
    
    // telefone da clínica
    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    // email da clínica
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}

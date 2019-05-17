
package pets.modelo;

public class Dono {
    
    // atributos da classe Dono
    private String nome;
    private Endereco endereco;
    private long telefone;
    private String email;

    public Dono(String nome, Endereco endereco, String telefone, String email){
        
        this.nome = nome;
	this.endereco = endereco;
	this.telefone = Long.parseLong(telefone);                               // conversão do dado de String para Long
	this.email = email;
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
    
    // telefone do dono
    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    // email do dono
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

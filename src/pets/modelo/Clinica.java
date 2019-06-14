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

import javax.swing.JOptionPane;
import pets.persistenciaArquivo.PersistenciaArquivo;

public class Clinica {
    
    // atributos da classe Clinica
    private String nome;
    private Endereco endereco;
    private Contato contato;
    private RedeSocial redeSocial;
    
    public Clinica(){
        
    }

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
    
    public boolean cadastrarClinica(String nome, String rua, String numero, String bairro, String cidade, String estado, String cep, String complemento,
                                String numTelefone, String numCelular, String email, String facebook, String twitter, String instagram, String whatsapp)throws Exception{
        try{
            Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep, complemento);
            Contato contato = new Contato(numTelefone, numCelular, email);
            RedeSocial redeSocial = new RedeSocial(facebook, twitter, instagram, whatsapp);

            
            
            Clinica clinica = new Clinica(nome, endereco, contato, redeSocial);
            
            PersistenciaArquivo persistencia = new PersistenciaArquivo();
            persistencia.salvarDadosClinica(clinica);
            
            return true;
            
        }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);                
            }
    return false;
    }
}

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

public class Contato {
    
    // atributos da classe Contato
    private long numTelefone;
    private long numCelular;
    private String email;
    
    public Contato(String numTelefone, String numCelular, String email) throws Exception {
        
        //TratamentoMascara telefoneTratado = new TratamentoMascara(numTelefone);
        //TratamentoMascara celularTratado = new TratamentoMascara(numTelefone);
        numTelefone = numTelefone.replace("(", "");
        numTelefone = numTelefone.replace(")", "");
        numTelefone = numTelefone.replace("-", "");
        this.setTelefone(Long.parseLong(numTelefone));                          // conversão do dado de String para Long
	numCelular = numCelular.replace("(", "");
        numCelular = numCelular.replace(")", "");
        numCelular = numCelular.replace("-", "");
        this.setCelular(Long.parseLong(numCelular));                           // conversão do dado de String para Long
        this.setEmail(email);
    }
    
    // telefone da clínica
    public long getTelefone() {
        return numTelefone;
    }

    public void setTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }
    
    // celular da clínica
    public long getCelular() {
        return numCelular;
    }

    public void setCelular(long numCelular){
        this.numCelular = numCelular;
    }
    
    // email da clínica
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (!email.contains("@") || !email.contains(".com")){
            throw new Exception ("E-mail com formato inválido");
        }
        this.email = email;
    }
    
    
}

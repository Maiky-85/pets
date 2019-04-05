
package pets;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenciaArquivo {

    public void salvarDadosClinica(Clinica clinica) {

        
        FileWriter arq;
        try {
            arq = new FileWriter("clinicas.txt", true);  
            
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.append("\r\nClinica Veterinaria " + clinica.getNome() + 
                " | Endereco: Rua " + clinica.getEndereco().getRua() + 
                ", " + clinica.getEndereco().getNumero() +
                ", " + clinica.getEndereco().getBairro() +
                ", " + clinica.getEndereco().getCidade() +
                " - " + clinica.getEndereco().getEstado() +
                " | Telefone: " + clinica.getTelefone() + 
                " | Email: " + clinica.getEmail() + "\r\n");   
            
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

}
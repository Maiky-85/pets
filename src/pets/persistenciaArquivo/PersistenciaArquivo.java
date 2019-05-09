
package pets.persistenciaArquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pets.modelo.Animal;
import pets.modelo.Clinica;
import pets.modelo.Dono;

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
    
    public void salvarDadosDono(Dono dono) {

        
        FileWriter arq;
        try {
            arq = new FileWriter("dono.txt", true);  
            
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.append("\r\nDono Animal " + dono.getNome() + 
                " | Endereco: Rua " + dono.getEndereco().getRua() + 
                ", " + dono.getEndereco().getNumero() +
                ", " + dono.getEndereco().getBairro() +
                ", " + dono.getEndereco().getCidade() +
                " - " + dono.getEndereco().getEstado() +
                " | Telefone: " + dono.getTelefone() + 
                " | Email: " + dono.getEmail() + "\r\n");   
            
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void salvarDadosAnimal(Animal animal) {

        
        FileWriter arq;
        try {
            arq = new FileWriter("animal.txt", true);  
            
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.append("\r\n" + animal.getTipo() + " " + animal.getNome() + 
                " | Cor " + animal.getCor() + 
                " | Raça " + animal.getRaca() +
                " | Sexo: " + animal.getSexo()+
                " | Porte:  " + animal.getPorte() +
                " | Idade " + animal.getIdade() + "anos" +
                " | Castrado: " + animal.getCastrado() + 
                " | Vacinas: " + animal.getVacinas() + 
                " | Vermifugado: " + animal.getVermifug()+     
                " | Observações: " + animal.getObs() + "\r\n");   
            
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
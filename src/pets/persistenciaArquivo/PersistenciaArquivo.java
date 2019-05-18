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

package pets.persistenciaArquivo;

import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pets.modelo.Animal;
import pets.modelo.Clinica;
import pets.modelo.Dono;

public class PersistenciaArquivo {

    // salvar dados da clínica
    public void salvarDadosClinica(Clinica clinica) {

        FileWriter arq;
        
        try {
            arq = new FileWriter("clinicas.txt", true);  
                              
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.append("\r\nClinica Veterinaria: " + clinica.getNome() + 
                " | Endereco: Rua " + clinica.getEndereco().getRua() + 
                ", " + clinica.getEndereco().getNumero() +
                ", " + clinica.getEndereco().getBairro() +
                ", " + clinica.getEndereco().getCidade() +
                " - " + clinica.getEndereco().getEstado() +
                " | Telefone: " + clinica.getContato().getTelefone() + 
                " | Celular: " + clinica.getContato().getCelular() + 
                " | Email: " + clinica.getContato().getEmail() + 
                " | Facebook: " + clinica.getRedeSocial().getFacebook() + 
                " | Twitter: " + clinica.getRedeSocial().getTwitter() + 
                " | Instagram: " + clinica.getRedeSocial().getInstagram() + 
                " | WhatsApp: " + clinica.getRedeSocial().getWhatsapp() + "\r\n");   
            
            arq.close();         
        }
        
        catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    // salvar dados do dono do animal
    public void salvarDadosDono(Dono dono) {
        
        FileWriter arq;
        
        try {
            arq = new FileWriter("dono.txt", true);  
            
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.append("\r\nNome: " + dono.getNome() + 
                " | Endereco: Rua " + dono.getEndereco().getRua() + 
                ", " + dono.getEndereco().getNumero() +
                ", " + dono.getEndereco().getBairro() +
                ", " + dono.getEndereco().getCidade() +
                " - " + dono.getEndereco().getEstado() +
                " | Telefone: " + dono.getTelefone() + 
                " | Email: " + dono.getEmail() + "\r\n");   
            
            arq.close();
        } 
        
        catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    // salvar dados do animal
    public void salvarDadosAnimal(Animal animal) {
        
        FileWriter arq;
        
        try {
            arq = new FileWriter("animal.txt", true);  
            
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.append("\r\nTipo: " + animal.getTipo() + " | Nome: " + animal.getNome() + 
                " | Cor: " + animal.getCor() + 
                " | Raça: " + animal.getRaca() +
                " | Sexo: " + animal.getSexo()+
                " | Porte:  " + animal.getPorte() +
                " | Idade: " + animal.getIdade() + "anos" +
                " | Castrado: " + animal.getCastracao() + 
                " | Vacina V10: " + animal.getVacinaV10() + 
                " | Vacina Antirrábica: " + animal.getVacinaAntirrabica() + 
                " | Vermifugação: " + animal.getVermifugacao()+
                " | Último local visto: " + animal.getUltimaLocalizacao()+  
                " | Informações Adicionais: " + animal.getObservacao() + "\r\n");   
            
            arq.close();
            
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import pets.persistenciaArquivo.PersistenciaArquivo;

/**
 *
 * @author Maiky
 */
public class ContaLogada {
    public String emailLogado;
    
//    public ContaLogada(String emailLogado){
//        this.setEmailLogado(emailLogado);
//    }

    public String getEmailLogado() throws FileNotFoundException, IOException {
        File arqConta = new File("contaOn.txt");
        FileReader arqContaReader = new FileReader(arqConta);
        BufferedReader bufferedArqConta = new BufferedReader(arqContaReader);
        String emailLogado = bufferedArqConta.readLine();
        
        
        return emailLogado;
    }

    public void setEmailLogado(String emailLogado) throws Exception {
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        persistencia.contaLogada(emailLogado);
        
        //this.emailLogado = emailLogado;
        //System.out.println(emailLogado);
    }
    
    public String getNome() throws FileNotFoundException, IOException{
        
        
        File arq = new File("dono.csv");
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "";
        String email = "";
        String nome = "";
        boolean nomeOk = false;
        String contaOn = getEmailLogado();

        while ((linha = bufferedReader.readLine()) != null && !nomeOk){
            int i=0;  
            int j=0;
            
            while (linha.charAt(i) != ';'){
               
                email = email + linha.charAt(i);
                if (linha.charAt(i)==';'){
                   j=j+1;
                }               
                i=i+1; 
            }            
            if (email.equals(contaOn)){

                nomeOk = true;
                while (linha.charAt(i) != ';' || j<1){  //laço para concatenar o nome
                    if (j==1){
                        nome = nome + linha.charAt(i);
                    }   
                    if (linha.charAt(i)==';'){ //fim da linha TEM Q MELHORAR, POIS PRECISA DO ; NO FINAL
                       j=j+1;
                    }                 
                    i=i+1;
                }
            }
            else{
                email="";
            }
        }
        //if (nome.equals(email))
    return nome;    
    }


}

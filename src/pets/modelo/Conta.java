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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Maiky
 */
public class Conta {
    
    private String email;
    private String senha;
    
    public Conta(){
        
    }
    
    public Conta(String email, String senha) throws Exception{
        this.email = email;
        this.senha = senha;
        boolean emailOk = false;
        boolean senhaOk = false;
        
        File arq = new File("dono.csv");
        
        if (!arq.exists()){
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            
            escreveArq.println("Email;Dono do Animal;Endereço;Telefone;Celular;"
                    + "Facebook;Twitter;Instagram;Whatsapp;Senha");
            escreveArq.flush();
            escreveArq.close();
        }
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "";
        String emailVerificar="";
        String senhaVerificar="";

        while ((linha = bufferedReader.readLine()) != null && !emailOk) {   //laço para buscar e-mail
            int i=0;
            int j=0;          
            //Concatena as strings do nome
            while (linha.charAt(i) != ';'){
                emailVerificar = emailVerificar + linha.charAt(i);  
                if (linha.charAt(i)==';'){
                   j=j+1;
                }               
                i=i+1; 
            }
            if (emailVerificar.equals(email)){
                emailOk = true;
                while (linha.charAt(i) != ';' || j<9){  //laço para verificar senha cadastrada
                    if (j==9){
                        senhaVerificar = senhaVerificar + linha.charAt(i);
                    }   
                    if (linha.charAt(i)==';'){ //fim da linha TEM Q MELHORAR, POIS PRECISA DO ; NO FINAL
                       j=j+1;
                    }                 
                    i=i+1;
                }
                if (senhaVerificar.equals(senha)){
                    
                    senhaOk = true;                    
                    ContaLogada contaOn = new ContaLogada();
                    contaOn.setEmailLogado(email); 
                    
                }
            }
            else{
                emailVerificar="";
            }
        }
        fileReader.close();
        bufferedReader.close();
        if (!emailOk || !senhaOk){
            throw new Exception ("E-mail ou senha inválidos");        
        }        
        //return true;
    fileReader.close();
    bufferedReader.close();
    }
    
    public boolean VerificarConta(String email) throws FileNotFoundException, IOException{
        boolean emailCadastrado = false;
        
        File arq = new File("dono.csv");
        
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "";
        String emailVerificar="";

        while ((linha = bufferedReader.readLine()) != null && !emailCadastrado) {   //laço para buscar e-mail
            int i=0;
            int j=0;          
            //Concatena as strings do nome
            while (linha.charAt(i) != ';'){
                emailVerificar = emailVerificar + linha.charAt(i);  
                if (linha.charAt(i)==';'){
                   j=j+1;
                }               
                i=i+1; 
            }
            if (emailVerificar.equals(email)){
                emailCadastrado = true;                
            }
            else{
                emailVerificar="";
            }
        }
        fileReader.close();
        bufferedReader.close();
        if (emailCadastrado){
            fileReader.close();
            bufferedReader.close();
            return true;       
        }
        else{
            fileReader.close();
            bufferedReader.close();
            return false;
        }
        //return true;
    
    }
        
        
}       

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
        
        arqContaReader.close();
        bufferedArqConta.close();
        return emailLogado;
    }

    public void setEmailLogado(String emailLogado) throws Exception {
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        persistencia.contaLogada(emailLogado);
        
        //this.emailLogado = emailLogado;
        //System.out.println(emailLogado);
    }
    
    public String getCampo(int k) throws FileNotFoundException, IOException{
        
        
        File arq = new File("dono.csv");
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "";
        String email = "";
        String campo = "";
        boolean campoOk = false;
        String contaOn = getEmailLogado();

        while ((linha = bufferedReader.readLine()) != null && !campoOk){
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

                campoOk = true;
                while (linha.charAt(i) != ';' || j<k){  //laço para concatenar o nome
                    if (j==k){
                        campo = campo + linha.charAt(i);
                    }   
                    if (linha.charAt(i)==';'){ 
                       j=j+1;
                    }                 
                    i=i+1;
                }
            }
            else{
                email="";
            }
        }
    fileReader.close();
    bufferedReader.close();
    return campo;    
    }

public String getEndereco(String parte) throws FileNotFoundException, IOException{

        File arq = new File("dono.csv");
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "";
        String email = "";
        String nome = "";   //Endereço completo
        boolean nomeOk = false;
        String contaOn = getEmailLogado();

        while ((linha = bufferedReader.readLine()) != null && !nomeOk){ //busca o e-mail
            int i=0;  
            int j=0;
            
            while (linha.charAt(i) != ';'){
               
                email = email + linha.charAt(i);
                if (linha.charAt(i)==';'){
                   j=j+1;
                }               
                i=i+1; 
            }            
            if (email.equals(contaOn)){ //e-mail encontrado

                nomeOk = true;
                while (linha.charAt(i) != ';' || j<2){  //laço para concatenar o endereço
                    if (j==2){
                        nome = nome + linha.charAt(i);
                    }   
                    if (linha.charAt(i)==';'){
                       j=j+1;
                    }                 
                    i=i+1;
                }
            }
            else{
                email="";
            }
        }
    fileReader.close();
    bufferedReader.close();
    
    String parteEndereco="";
    int j=0;
    
    //Loop para concatenar Rua
    if (parte.equals("rua")){     
        for (int i=0;(nome.charAt(i) != ',');i++)
            parteEndereco = parteEndereco + nome.charAt(i);
        return parteEndereco;
    }
    //Loop para concatenar número
    if (parte.equals("numero")){
        for (int i=0;j<=1;i++){
            if (j==1 && nome.charAt(i) != ',')
                parteEndereco = parteEndereco + nome.charAt(i);          
            if (nome.charAt(i) == ',')
                j+=1;       
        }
        return parteEndereco;
    }
    
    //Loop para concatenar bairro
    if (parte.equals("bairro")){
        for (int i=0;j<=2;i++){
            if (j==2 && nome.charAt(i) != ',')
                parteEndereco = parteEndereco + nome.charAt(i);          
            if (nome.charAt(i) == ',')
                j+=1;       
        }
        return parteEndereco;
    }
    
    //Loop para concatenar cidade
    if (parte.equals("cidade")){
        for (int i=0;j<=3;i++){
            if (j==3 && nome.charAt(i) != ',')
                parteEndereco = parteEndereco + nome.charAt(i);          
            if (nome.charAt(i) == ',')
                j+=1;       
        }
        return parteEndereco;
    }
    
    //Loop para concatenar estado
    if (parte.equals("estado")){
        for (int i=0;j<=4;i++){
            if (j==4 && nome.charAt(i) != ',')
                parteEndereco = parteEndereco + nome.charAt(i);          
            if (nome.charAt(i) == ',')
                j+=1;       
        }
        switch(parteEndereco){
            case "AC":
                return "0";
            case "AL":
                return "1";
            case "AP":
                return "2";
            case "AM":
                return "3";
            case "BA":
                return "4";
            case "CE":
                return "5";
            case "DF":
                return "6";
            case "ES":
                return "7";
            case "GO":
                return "8";
            case "MA":
                return "9";
            case "MG":
                return "10";
            case "MS":
                return "11";
            case "MT":
                return "12";
            case "PA":
                return "13";
            case "PB":
                return "14";
            case "PE":
                return "15";
            case "PI":
                return "16";
            case "PR":
                return "17";
            case "RJ":
                return "18";
            case "RN":
                return "19";
            case "RO":
                return "20";
            case "RS":
                return "21";
            case "RR":
                return "22";
            case "SC":
                return "23";
            case "SE":
                return "24";
            case "SP":
                return "25";
            case "TO":
                return "26";
        }
    }
    
    //Loop para concatenar cep
    if (parte.equals("cep")){
        for (int i=0;j<=5;i++){
            if (j==5 && nome.charAt(i) != ',')
                parteEndereco = parteEndereco + nome.charAt(i);          
            if (nome.charAt(i) == ',')
                j+=1;       
        }
        return parteEndereco;
    }
    //Loop para concatenar número
    if (parte.equals("complemento")){
        for (int i=0;j<=6;i++){
            if (j==6 && nome.charAt(i) != ',')
                parteEndereco = parteEndereco + nome.charAt(i);          
            if (nome.charAt(i) == ',')
                j+=1;       
        }
        return parteEndereco;
    }
    
    return "";
    }

}

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
import javax.swing.JOptionPane;
import pets.persistenciaArquivo.PersistenciaArquivo;


/**
 *
 * @author Maiky
 */
public class Conta {
    
    private String email;
    private String senha;
    
    public Conta() throws IOException{
        File arq = new File("dono.csv");

        if (!arq.exists()){
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            
            escreveArq.println("Foto;Email;Dono do Animal;Endereço;Telefone;Celular;"
                    + "Facebook;Twitter;Instagram;Whatsapp;Senha");
            escreveArq.close();

        }
    }
    
    public boolean cadastrarConta(String email, String nome, String senha1, String senha2 )throws Exception {
        if (senha1.equals(senha2)){
           try {
                //verifica se e-mail já existe
                boolean verificarEmail = verificarContaExistente(email);
                
                if (!verificarEmail){
                    //cria um objeto do tipo Dono após criar Endereco, Contato e RedeSocial
                    Endereco endereco = new Endereco("","0","","","AC","00000000","");
                    Contato contatoDono = new Contato("00000000000","00000000000", email);                                  
                    RedeSocial redeSocial = new RedeSocial("","","","00000000000");
                    Dono novoDono = new Dono(null, nome, endereco, contatoDono, redeSocial,senha1);

                    // vai salvar os dados parciais do dono na persistencia de arquivo
                    PersistenciaArquivo persistencia = new PersistenciaArquivo();
                    persistencia.salvarDadosDono(novoDono);
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "e-mail já possui cadastro", "Atenção", JOptionPane.WARNING_MESSAGE);  
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Senhas devem ser iguais", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    return false;
    }        
    
    public void logarConta(String email, String senha) throws Exception{
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
            
            escreveArq.println("Foto;Email;Dono do Animal;Endereço;Telefone;Celular;"
                    + "Facebook;Twitter;Instagram;Whatsapp;Senha");
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
            while (j <= 1){
                if (j==1 && linha.charAt(i) != ';')
                    emailVerificar = emailVerificar + linha.charAt(i);  
                if (linha.charAt(i)==';'){
                   j+=1;
                }               
                i+=1; 
            }
            if (emailVerificar.equals(email)){
                emailOk = true;
                while (linha.charAt(i) != ';' || j<10){  //laço para verificar senha cadastrada
                    if (j==10){
                        senhaVerificar = senhaVerificar + linha.charAt(i);
                    }   
                    if (linha.charAt(i)==';'){ //fim da linha TEM Q MELHORAR, POIS PRECISA DO ; NO FINAL
                       j+=1;
                    }                 
                    i+=1;
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
    
    public boolean verificarContaExistente(String email) throws FileNotFoundException, IOException{
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
            while (j <= 1){
                if (j==1 && linha.charAt(i) != ';')
                    emailVerificar = emailVerificar + linha.charAt(i);  
                if (linha.charAt(i)==';'){
                   j+=1;
                }               
                i+=1; 
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
    }       
}       

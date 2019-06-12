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

package pets;

//import pets.modelo.Endereco;
//import pets.modelo.Dono;
//import pets.modelo.Clinica;
//import pets.modelo.Animal;
//import pets.persistenciaArquivo.PersistenciaArquivo;
//import javax.swing.JOptionPane;
//import pets.modelo.Contato;
//import pets.modelo.RedeSocial;
//import pets.telas.CadastroAnimal;
//import pets.telas.CadastroClinica;
//import pets.telas.CadastroDono;
import pets.telas.Principal;
import pets.telasMob.Inicial;
import pets.telasMob.TelaLogin;

public class Main {

    public static void main(String[] args) {
        
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        

        
        
//        Principal principal = new Principal();
//        principal.setVisible(true);
        
        /*
        String opcao = JOptionPane.showInputDialog("Selecione opção para entrada de dados."
                + "\n (1) Clínica  \n (2) Dono \n (3) Animal");
        
        if (Integer.parseInt(opcao) == 1){
        
            CadastroClinica cadastroClinica = new CadastroClinica();
            cadastroClinica.setVisible(true);
        }
        
        else if (Integer.parseInt(opcao) == 2){
            CadastroDono cadastroDono = new CadastroDono();
            cadastroDono.setVisible(true);
        }
        
        if (Integer.parseInt(opcao) == 3){
        
            CadastroAnimal cadastroAnimal = new CadastroAnimal();
            cadastroAnimal.setVisible(true);
           
        }
        */
        
    /*   

        String opcao = JOptionPane.showInputDialog("Selecione opção para entrada de dados."
                + "\n (1) Animal  \n (2) Dono \n (3) Clínica");
        
        if (Integer.parseInt(opcao) == 1){
            String nome = JOptionPane.showInputDialog("Nome");
            String tipo = JOptionPane.showInputDialog("Tipo de animal");
            String cor = JOptionPane.showInputDialog("Cor");	
            String raca = JOptionPane.showInputDialog("Raça");
            String sexo = JOptionPane.showInputDialog("Sexo (M) ou (F)");
            String porte = JOptionPane.showInputDialog("Porte (P) (M) (G) (GG)");
            String idade = JOptionPane.showInputDialog("Idade");
            String castracao = JOptionPane.showInputDialog("Castrado (S) ou (N)");
            String vacinaV10 = JOptionPane.showInputDialog("Vacina V10");
            String vacinaAntirrabica = JOptionPane.showInputDialog("Vacina Antirrabica");
            String vermifugacao = JOptionPane.showInputDialog("Vermifugação");
            String ultimaLocalizacao = JOptionPane.showInputDialog("Última Localização");
            String observacao = JOptionPane.showInputDialog("Observações");
                
            Animal novoAnimal = new Animal(nome, tipo, cor, raca, sexo, porte, idade, castracao, vacinaV10, vacinaAntirrabica, vermifugacao, ultimaLocalizacao, observacao);
            
            PersistenciaArquivo salvar = new PersistenciaArquivo();
            salvar.salvarDadosAnimal(novoAnimal);
        }
        
        else if (Integer.parseInt(opcao) == 2){*/
            
            /*String rua = JOptionPane.showInputDialog("Rua");
            String numero = JOptionPane.showInputDialog("Numero");
            String bairro = JOptionPane.showInputDialog("Bairro");	
            String municipio = JOptionPane.showInputDialog("Cidade");
            String estado = JOptionPane.showInputDialog("Estado");
            String cep = JOptionPane.showInputDialog("CEP");
            String complemento = JOptionPane.showInputDialog("Complemento");

            Endereco enderecoDono = new Endereco(rua, numero, bairro, municipio, estado, cep, complemento);*/

           /* String telefone = JOptionPane.showInputDialog("Telefone");
            String celular = JOptionPane.showInputDialog("Celular");
            String email = JOptionPane.showInputDialog("E-mail");
            
            Contato contato = new Contato(telefone, celular, email);
            
            String facebook = JOptionPane.showInputDialog("Facebook");
            String instagram = JOptionPane.showInputDialog("Instagram");
            String twitter = JOptionPane.showInputDialog("Twitter");
            String whatsapp = JOptionPane.showInputDialog("WhatsApp");
            
            RedeSocial redeSocial = new RedeSocial(facebook, instagram, twitter, whatsapp);
            
            //String nome = JOptionPane.showInputDialog("Nome");
            
            Dono donoAnimal = new Dono(contato, redeSocial);           
        
            PersistenciaArquivo salvar = new PersistenciaArquivo();

        }
        else if (Integer.parseInt(opcao) == 3){
        
        
            String rua = JOptionPane.showInputDialog("Rua");
            String numero = JOptionPane.showInputDialog("Numero");
            String bairro = JOptionPane.showInputDialog("Bairro");	
            String municipio = JOptionPane.showInputDialog("Cidade");
            String estado = JOptionPane.showInputDialog("Estado");
            String cep = JOptionPane.showInputDialog("CEP");
            String complemento = JOptionPane.showInputDialog("Complemento");
        
        
            Endereco enderecoClinica = new Endereco(rua, numero, bairro, municipio, estado, cep, complemento);

            String nome = JOptionPane.showInputDialog("Nome");
            
            String numTelefone = JOptionPane.showInputDialog("Telefone");
            String numCelular = JOptionPane.showInputDialog("Celular");
            String email = JOptionPane.showInputDialog("Email");
            Contato contato = new Contato(numTelefone, numCelular, email);
            
            String facebook = JOptionPane.showInputDialog("Facebook");
            String twitter = JOptionPane.showInputDialog("Twitter");
            String instagram = JOptionPane.showInputDialog("Instagram");
            String whatsapp = JOptionPane.showInputDialog("Whatsapp");
            
            RedeSocial redeSocial = new RedeSocial(facebook, twitter, instagram, whatsapp);
            
            Clinica clinicaVet = new Clinica(nome, enderecoClinica, contato, redeSocial);
        
            PersistenciaArquivo salvar = new PersistenciaArquivo();
            salvar.salvarDadosClinica(clinicaVet);
        }
        
        
        else{
            System.out.println("Opção Inválida");
        }
        
      */  
                
    }
    
}


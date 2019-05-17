
package pets;

import pets.modelo.Endereco;
import pets.modelo.Dono;
import pets.modelo.Clinica;
import pets.modelo.Animal;
import pets.persistenciaArquivo.PersistenciaArquivo;
import javax.swing.JOptionPane;
import pets.telas.CadastroAnimal;
import pets.telas.CadastroClinica;
import pets.telas.CadastroDono;

public class Main {

    public static void main(String[] args) {
        
        
        
//        CadastroClinica cadastroClinica = new CadastroClinica();
//        cadastroClinica.setVisible(true);
        
//        CadastroDono cadastroDono = new CadastroDono();
//        cadastroDono.setVisible(true);
        
      CadastroAnimal cadastroAnimal = new CadastroAnimal();
      cadastroAnimal.setVisible(true);
        
        /*String opcao = JOptionPane.showInputDialog("Selecione opção para entrada de dados."
                + "\n (1) Animal  \n (2) Dono \n (3) Clínica");
        
        if (Integer.parseInt(opcao) == 1){
            String nome = JOptionPane.showInputDialog("Nome");
            String tipo = JOptionPane.showInputDialog("Tipo de animal");
            String cor = JOptionPane.showInputDialog("Cor");	
            String raca = JOptionPane.showInputDialog("Raça");
            String sexo = JOptionPane.showInputDialog("Sexo (M) ou (F)");
            String porte = JOptionPane.showInputDialog("Porte (P) (M) (G) (GG)");
            String idade = JOptionPane.showInputDialog("Idade");
            String castrado = JOptionPane.showInputDialog("Castrado (S) ou (N)");
            String vacinas = JOptionPane.showInputDialog("Vacinas");
            String vermifug = JOptionPane.showInputDialog("Vermifugado (S) ou (N)");
            String obs = JOptionPane.showInputDialog("Observações");
            
            Animal novoAnimal = new Animal(nome, tipo, cor, raca,sexo,porte,
            idade,castrado,vacinas,vermifug,obs);
            
            PersistenciaArquivo salvar = new PersistenciaArquivo();
            salvar.salvarDadosAnimal(novoAnimal);
        }
        
        else if (Integer.parseInt(opcao) == 2){
            String rua = JOptionPane.showInputDialog("Rua");
            String numero = JOptionPane.showInputDialog("Numero");
            String bairro = JOptionPane.showInputDialog("Bairro");	
            String cidade = JOptionPane.showInputDialog("Cidade");
            String estado = JOptionPane.showInputDialog("Estado");

            Endereco enderecoDono = new Endereco(rua, numero, bairro, cidade, estado);

            String nome = JOptionPane.showInputDialog("Nome");
            String telefone = JOptionPane.showInputDialog("Telefone");
            String email = JOptionPane.showInputDialog("Email");

            Dono donoAnimal = new Dono(nome, enderecoDono, telefone, email);
        
            PersistenciaArquivo salvar = new PersistenciaArquivo();
            salvar.salvarDadosDono(donoAnimal);
        }
        else if (Integer.parseInt(opcao) == 3){
            String rua = JOptionPane.showInputDialog("Rua");
            String numero = JOptionPane.showInputDialog("Numero");
            String bairro = JOptionPane.showInputDialog("Bairro");	
            String cidade = JOptionPane.showInputDialog("Cidade");
            String estado = JOptionPane.showInputDialog("Estado");

            Endereco enderecoClinica = new Endereco(rua, numero, bairro, cidade, estado);

            String nome = JOptionPane.showInputDialog("Nome");
            String telefone = JOptionPane.showInputDialog("Telefone");
            String email = JOptionPane.showInputDialog("Email");

            Clinica clinicaVet = new Clinica(nome, enderecoClinica, telefone, email);
        
            PersistenciaArquivo salvar = new PersistenciaArquivo();
            salvar.salvarDadosClinica(clinicaVet);
        }
        
        else{
            System.out.println("Opção Inválida");
        }*/
        //comentario
                
    }
    
}
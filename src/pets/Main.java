
package pets;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
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
    
}
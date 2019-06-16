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

package pets.modelo;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import pets.persistenciaArquivo.PersistenciaArquivo;
import pets.telasMob.PerfilDono;

public class Dono {
    
    // atributos da classe Dono
    private String nome;
    private Endereco endereco;
    private Contato contato;
    private RedeSocial redeSocial;
    private String senha;
    
    
    public Dono(String nome, Endereco endereco, Contato contato, RedeSocial redeSocial, String senha) {
        
        this.setNome(nome);
	this.setEndereco(endereco);
	this.setContato(contato);
        this.setRedeSocial(redeSocial);
        this.setSenha(senha);
    }
    
    public Dono(){
        
    }
            
    // nome do dono
    public String getNome() throws FileNotFoundException {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // endeço do dono
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // contato do dono
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    // redes sociais da clínica
    public RedeSocial getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(RedeSocial redeSocial) {
        this.redeSocial = redeSocial;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public boolean atualizarDono(String nome, String senha, String senha2, String senhaAtual, String rua, String numero, String bairro, String cidade, String estado, String cep, String complemento,
                                String numTelefone, String numCelular, String email, String facebook, String twitter, String instagram, String whatsapp)throws Exception{
        try {
            ContaLogada contaLogada = new ContaLogada();
            String senhaSalva = contaLogada.getCampo(9);
            
            //cria um objeto do tipo Dono após criar Endereco, Contato e RedeSocial
            Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep, complemento);
            Contato contatoDono = new Contato(numTelefone, numCelular, email);
            RedeSocial redeSocial = new RedeSocial(facebook, twitter, instagram, whatsapp);

            if (senha.equals("") && senha2.equals("")){
                if (senhaAtual.equals(senhaSalva)){
                    Dono novoDono = new Dono(nome, endereco, contatoDono, redeSocial, senhaSalva);                    
                    
                    PersistenciaArquivo persistencia = new PersistenciaArquivo();     
                    persistencia.atualizarDadosDono(novoDono,"dono.csv");
                    //this.dispose();
                    //Inicial inicial = new Inicial();
                    //inicial.setVisible(true);
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Senha atual incorreta", "Atenção", JOptionPane.WARNING_MESSAGE);
                    
                    PerfilDono dono = new PerfilDono();
                    dono.setNovaSenha("");
                    dono.setNovaSenha2("");
                    dono.setCampoSenhaAtual("");
                }
            }
            else{
                if ((senha.equals(senha2))){
                    if (senhaAtual.equals(senhaSalva)){
                        Dono novoDono = new Dono(nome, endereco, contatoDono, redeSocial, senha);
                        PersistenciaArquivo persistencia = new PersistenciaArquivo();     
                        persistencia.atualizarDadosDono(novoDono,"dono.csv");
                        
                        return true;
                        //this.dispose();
                        //Inicial inicial = new Inicial();
                        //inicial.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Senha atual esta incorreta", "Atenção", JOptionPane.WARNING_MESSAGE);
                        PerfilDono dono = new PerfilDono();
                        dono.setNovaSenha("");
                        dono.setNovaSenha2("");
                        dono.setCampoSenhaAtual("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Novas senhas devem ser iguais", "Atenção", JOptionPane.WARNING_MESSAGE);
                    PerfilDono dono = new PerfilDono();
                    dono.setNovaSenha("");
                    dono.setNovaSenha2("");
                    dono.setCampoSenhaAtual("");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);                
        }
        
        
        return false;
    }
}

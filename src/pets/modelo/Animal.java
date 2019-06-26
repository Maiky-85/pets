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

import javax.swing.JOptionPane;
import pets.persistenciaArquivo.PersistenciaArquivo;

public class Animal {
    
    // atributos da classe Animal
    private String foto;
    private String nome;
    private String tipo;
    private String cor;
    private String raca;
    private String sexo;
    private String porte;
    private int idade;
    private String castracao;
    private String vacinaAntirrabica;
    private String vacinaV10;
    private String vermifugacao;
    private String ultimaLocalizacao;
    private String observacao;
    
    public Animal(){
        
    }
    
    public Animal(String foto, String nome, String tipo, String cor, String raca, String sexo, String porte, String idade, String castracao, String vacinaV10, 
    String vacinaAntirrabica, String vermifugacao, String ultimaLocalizacao, String observacao) {
        
        this.setFoto(foto);
        this.setNome(nome);
	this.setTipo(tipo);
	this.setCor(cor);
	this.setRaca(raca);
        this.setSexo(sexo);
        this.setPorte(porte);
        this.setIdade(Integer.parseInt(idade));                                   // conversão do dado de String para inteiro
        this.setCastracao(castracao);
        this.setVacinaAntirrabica(vacinaAntirrabica);
        this.setVacinaV10(vacinaV10);
        this.setVermifugacao(vermifugacao);
        this.setUltimaLocalizacao(ultimaLocalizacao);
        this.setObservacao(observacao);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // tipo de animal
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // cor do animal
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // raça do animal
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    // sexo do animal
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // porte do animal
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    // idade do animal
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // informação sobre castração
    public String getCastracao() {
        return castracao;
    }

    public void setCastracao(String castracao) {
        this.castracao = castracao;
    }
    
    // informação sobre data da última vacina antirrábica
    public String getVacinaAntirrabica() {
        return vacinaAntirrabica;
    }

    public void setVacinaAntirrabica(String vacinaAntirrabica) {
        this.vacinaAntirrabica = vacinaAntirrabica;
    }
    
    // informação sobre data da última vacina V10
    public String getVacinaV10() {
        return vacinaV10;
    }

    public void setVacinaV10(String vacinaV10) {
        this.vacinaV10 = vacinaV10;
    }
    
    // informação sobre data da última vermifugação
    public String getVermifugacao() {
        return vermifugacao;
    }

    public void setVermifugacao(String vermifugacao) {
        this.vermifugacao = vermifugacao;
    }
    
    // informação sobre o último local onde estev ou foi visto o animal
    public String getUltimaLocalizacao() {
        return ultimaLocalizacao;
    }
    
    public void setUltimaLocalizacao(String ultimaLocalizacao) {
        this.ultimaLocalizacao = ultimaLocalizacao;
    }
    
    // informações adicionais sobre o animal
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public boolean cadastrarAnimal(String foto, String nome, String tipo, String cor, String raca, String sexo, String porte, String idade, String castracao, String vacinaV10, 
    String vacinaAntirrabica, String vermifugacao, String ultimaLocalizacao, String observacao)throws Exception{
        try{
            Animal animal = new Animal(foto, nome, tipo, cor, raca, sexo, porte, idade, castracao, vacinaV10, 
                            vacinaAntirrabica, vermifugacao, ultimaLocalizacao, observacao);
            
            PersistenciaArquivo persistencia = new PersistenciaArquivo();
            persistencia.salvarDadosAnimal(animal);
            return true;
            
        }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);                
            }
    return false;
    }
}

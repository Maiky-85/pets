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

public class TratamentoMascara {
    
    String texto;
    
    public TratamentoMascara(String texto){
        
        texto = texto.replace("(", "");
        texto = texto.replace(")", "");
        texto = texto.replace("-", "");
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}

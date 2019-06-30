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

//import javax.swing.UIManager;
import pets.telasMob.TelaComecar;
//import pets.telasMob.TelaLogin;



public class Main {

    public static void main(String[] args) {
        
        //UIManager.put("ScrollBarUI", "my.package.TesteScrollBar");
        
        TelaComecar inicio = new TelaComecar();
        inicio.setVisible(true);
        
        /* //teste
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
          */  
    }
    
}


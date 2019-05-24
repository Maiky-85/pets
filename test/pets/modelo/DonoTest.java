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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DonoTest {
    
    public DonoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Dono.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        String expResult = "João da Silva";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Dono.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "João da Silva";
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono(nome, endereco, contato, redeSocial);
        
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Dono.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        Endereco expResult = endereco;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Dono.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContato method, of class Dono.
     */
    @Test
    public void testGetContato() {
        System.out.println("getContato");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        Contato expResult = contato;
        Contato result = instance.getContato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContato method, of class Dono.
     */
    @Test
    public void testSetContato() {
        System.out.println("setContato");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        instance.setContato(contato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRedeSocial method, of class Dono.
     */
    @Test
    public void testGetRedeSocial() {
        System.out.println("getRedeSocial");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        RedeSocial expResult = redeSocial;
        RedeSocial result = instance.getRedeSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRedeSocial method, of class Dono.
     */
    @Test
    public void testSetRedeSocial() {
        System.out.println("setRedeSocial");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial);
        
        instance.setRedeSocial(redeSocial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

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
    public void testGetNome() throws Exception {
        System.out.println("getNome");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial, "123");
        
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
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        String nome = "João da Silva";
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono(nome, endereco, contato, redeSocial,"123");
        
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Dono.
     */
    @Test
    public void testGetEndereco() throws Exception{
        System.out.println("getEndereco");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial, "123");
        
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
    public void testSetEndereco() throws Exception{
        System.out.println("setEndereco");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial,"123");
        
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContato method, of class Dono.
     */
    @Test
    public void testGetContato() throws Exception{
        System.out.println("getContato");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial,"123");
        
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
    public void testSetContato() throws Exception{
        System.out.println("setContato");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial,"123");
        
        instance.setContato(contato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRedeSocial method, of class Dono.
     */
    @Test
    public void testGetRedeSocial() throws Exception{
        System.out.println("getRedeSocial");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial,"123");
        
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
    public void testSetRedeSocial() throws Exception{
        System.out.println("setRedeSocial");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("2732265454", "27998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "027996343201");
        
        Dono instance = new Dono("João da Silva", endereco, contato, redeSocial,"123");
        
        instance.setRedeSocial(redeSocial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

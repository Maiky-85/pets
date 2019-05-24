/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafae
 */
public class ClinicaTest {
    
    public ClinicaTest() {
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
     * Test of getNome method, of class Clinica.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
       
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        String expResult = "Clínica Vida Animal";
        
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Clinica.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Clínica Vida Animal";
       
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica(nome, endereco, contato, redeSocial);
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Clinica.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        Endereco expResult = null; // FALTA COLOCAR AQUI
        
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Clinica.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
                
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContato method, of class Clinica.
     */
    @Test
    public void testGetContato() {
        System.out.println("getContato");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        Contato expResult = null; // FALTA COLOCAR AQUI
        Contato result = instance.getContato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContato method, of class Clinica.
     */
    @Test
    public void testSetContato() {
        System.out.println("setContato");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        
        instance.setContato(contato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRedeSocial method, of class Clinica.
     */
    @Test
    public void testGetRedeSocial() {
        System.out.println("getRedeSocial");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        RedeSocial expResult = null;    // FALTA COLOCAR AQUI
        RedeSocial result = instance.getRedeSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRedeSocial method, of class Clinica.
     */
    @Test
    public void testSetRedeSocial() {
        System.out.println("setRedeSocial");
        
        Endereco endereco = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        Contato contato = new Contato("(27) 32265454", "(27) 998970066", "vidaanimal@gmail.com");
        RedeSocial redeSocial = new RedeSocial("www.facebook.com/clinicavidaanimal/", "www.twitter.com/clinicavidaanimal/", "www.instagram.com/clinicavidaanimal/", "(027) 996343201");
        
        Clinica instance = new Clinica("Clínica Vida Animal", endereco, contato, redeSocial);
        
        instance.setRedeSocial(redeSocial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

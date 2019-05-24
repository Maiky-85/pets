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

public class EnderecoTest {
    
    public EnderecoTest() {
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
     * Test of getRua method, of class Endereco.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        String expResult = "Rua das Orquídeas";
        String result = instance.getRua();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRua method, of class Endereco.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String rua = "Rua das Orquídeas";
        Endereco instance = new Endereco(rua, "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        instance.setRua(rua);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Endereco.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        int expResult = 23;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Endereco.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 23;
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Endereco.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        String expResult = "Bairro Jardins";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBairo method, of class Endereco.
     */
    @Test
    public void testSetBairo() {
        System.out.println("setBairo");
        String bairro = "";
        Endereco instance = new Endereco("Rua das Orquídeas", "23", bairro, "Vitória", "ES", "29140567", "-");
        instance.setBairo(bairro);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMunicipio method, of class Endereco.
     */
    @Test
    public void testGetMunicipio() {
        System.out.println("getMunicipio");
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        String expResult = "Vitória";
        String result = instance.getMunicipio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMunicipio method, of class Endereco.
     */
    @Test
    public void testSetMunicipio() {
        System.out.println("setMunicipio");
        String municipio = "Vitória";
       Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", municipio, "ES", "29140567", "-");
        instance.setMunicipio(municipio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Endereco.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        String expResult = "ES";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Endereco.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "ES";
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", estado, "29140567", "-");
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Endereco.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        String expResult = "29140567";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Endereco.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "29140567";
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", cep, "-");
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getComplemento method, of class Endereco.
     */
    @Test
    public void testGetComplemento() {
        System.out.println("getComplemento");
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", "-");
        String expResult = "-";
        String result = instance.getComplemento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setComplemento method, of class Endereco.
     */
    @Test
    public void testSetComplemento() {
        System.out.println("setComplemento");
        String complemento = "-";
        Endereco instance = new Endereco("Rua das Orquídeas", "23", "Bairro Jardins", "Vitória", "ES", "29140567", complemento);
        instance.setComplemento(complemento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

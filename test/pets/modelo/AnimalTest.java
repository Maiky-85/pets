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

public class AnimalTest {
    
    public AnimalTest() {
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
     * Test of getNome method, of class Animal.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Bidu";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Animal.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Bidu";
        Animal instance = new Animal("",nome, "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
    /**
     * Test of getTipo method, of class Animal.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Cachorro";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Animal.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "Cachorro";
        Animal instance = new Animal("","Bidu", tipo, "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCor method, of class Animal.
     */
    @Test
    public void testGetCor() {
        System.out.println("getCor");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Preto";
        String result = instance.getCor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCor method, of class Animal.
     */
    @Test
    public void testSetCor() {
        System.out.println("setCor");
        String cor = "Preto";
        Animal instance = new Animal("","Bidu", "Cachorro", cor, "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setCor(cor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRaca method, of class Animal.
     */
    @Test
    public void testGetRaca() {
        System.out.println("getRaca");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Beagle";
        String result = instance.getRaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRaca method, of class Animal.
     */
    @Test
    public void testSetRaca() {
        System.out.println("setRaca");
        String raca = "Beagle";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", raca, "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setRaca(raca);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Animal.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Macho";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Animal.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "Macho";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", sexo, "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPorte method, of class Animal.
     */
    @Test
    public void testGetPorte() {
        System.out.println("getPorte");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Médio";
        String result = instance.getPorte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPorte method, of class Animal.
     */
    @Test
    public void testSetPorte() {
        System.out.println("setPorte");
        String porte = "Médio";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", porte, "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setPorte(porte);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdade method, of class Animal.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        int expResult = 7;
        int result = instance.getIdade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdade method, of class Animal.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 7;
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setIdade(idade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCastracao method, of class Animal.
     */
    @Test
    public void testGetCastracao() {
        System.out.println("getCastracao");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Sim";
        String result = instance.getCastracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCastracao method, of class Animal.
     */
    @Test
    public void testSetCastracao() {
        System.out.println("setCastracao");
        String castracao = "Sim";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", castracao, "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setCastracao(castracao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVacinaAntirrabica method, of class Animal.
     */
    @Test
    public void testGetVacinaAntirrabica() {
        System.out.println("getVacinaAntirrabica");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "02/05/2019";
        String result = instance.getVacinaAntirrabica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVacinaAntirrabica method, of class Animal.
     */
    @Test
    public void testSetVacinaAntirrabica() {
        System.out.println("setVacinaAntirrabica");
        String vacinaAntirrabica = "01/02/19";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", vacinaAntirrabica, "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setVacinaAntirrabica(vacinaAntirrabica);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVacinaV10 method, of class Animal.
     */
    @Test
    public void testGetVacinaV10() {
        System.out.println("getVacinaV10");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "01/02/19";
        String result = instance.getVacinaV10();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVacinaV10 method, of class Animal.
     */
    @Test
    public void testSetVacinaV10() {
        System.out.println("setVacinaV10");
        String vacinaV10 = "01/02/19";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", vacinaV10, "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        instance.setVacinaV10(vacinaV10);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVermifugacao method, of class Animal.
     */
    @Test
    public void testGetVermifugacao() {
        System.out.println("getVermifugacao");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "03/04/2019";
        String result = instance.getVermifugacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVermifugacao method, of class Animal.
     */
    @Test
    public void testSetVermifugacao() {
        System.out.println("setVermifugacao");
        String vermifugacao = "03/04/2019";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", vermifugacao, "Em casa", "Possui dermatite");
        instance.setVermifugacao(vermifugacao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimaLocalizacao method, of class Animal.
     */
    @Test
    public void testGetUltimaLocalizacao() {
        System.out.println("getUltimaLocalizacao");
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Em casa";
        String result = instance.getUltimaLocalizacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimaLocalizacao method, of class Animal.
     */
    @Test
    public void testSetUltimaLocalizacao() {
        System.out.println("setUltimaLocalizacao");
        String ultimaLocalizacao = "Em casa";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", ultimaLocalizacao, "Possui dermatite");
        instance.setUltimaLocalizacao(ultimaLocalizacao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacao method, of class Animal.
     */
    @Test
    public void testGetObservacao() {
        System.out.println("getObservacao");
       Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", "Possui dermatite");
        String expResult = "Possui dermatite";
        String result = instance.getObservacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacao method, of class Animal.
     */
    @Test
    public void testSetObservacao() {
        System.out.println("setObservacao");
        String observacao = "Possui dermatite";
        Animal instance = new Animal("","Bidu", "Cachorro", "Preto", "Beagle", "Macho", "Médio", "7", "Sim", "01/02/19", "02/05/2019", "03/04/2019", "Em casa", observacao);
        instance.setObservacao(observacao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

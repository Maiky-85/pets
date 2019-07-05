/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maiky
 */
public class TelaLoginTest {
    
    public TelaLoginTest() {
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
     * Test of main method, of class TelaLogin.
     */
    @Test
    public void testMain() {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        login.setCampoEmail("mm@.com");
        login.setCampoSenha("mm");   
        login.getBotaoEntrar().doClick();
    }
    
}

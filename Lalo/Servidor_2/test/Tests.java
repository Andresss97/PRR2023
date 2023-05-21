/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cliente_2.Client;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servidor_2.Server;

/**
 *
 * @author super
 */
public class Tests {
    
    public Tests() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Tests. For example:
    //
    // @Tests
    // public void hello() {}
    
    @Test
    public void crearServidor(){
    Server server = new Server(6001);
        assertTrue(server.serverOpen());
    
    }
    
    @Test
    public void cerrarServidor(){
    Server server = new Server(6001);
    assertTrue(server.serverClosed());

    }

    @Test
    public void conteoLetras(){

    Server server = new Server(6002);
    String frase = "Hola maquina";
    int esperado = 2;
    assertEquals(esperado,server.contarRecibidas("Hola Maquina"));


}
}
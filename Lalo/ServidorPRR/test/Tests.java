/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servidorprr.Server;
import clienteprr.Client;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    
    @Test
    public void Test1(){
    Server server = new Server();
    
        assertTrue(server.abierto());
    
    
    }
    @Test
    public void Test2(){
    Client client = new Client();
    assertTrue(client.isRunning());
    
    }
    
    @Test
    public void test3(){
        Server server = new Server();
        try {
            boolean expected = true;
            assertEquals(expected, server.serverClosed());
        }
        catch(Exception ex){
            
        }
    }
    @Test
    public void checkconnection(){
    Server server = new Server();
    Client cliente = new Client();
        try {
            cliente.connect();
        } catch (IOException ex) {
            System.out.println("Ups, no pude conectarme");;
        }
    
    
    
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

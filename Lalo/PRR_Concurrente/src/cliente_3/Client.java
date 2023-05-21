/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_3;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class Client {
    
    private Socket socket;
    public void connect(){
        
        try {
            /*Para poder iniciar el cliente antes que el server
            do{
            this.socket = new Socket("localhost",5050);
           }
            while(!this.socket.isConnected())
            */
            this.socket = new Socket("localhost",5050);
            System.out.println("Cliente conectado con éxito");
        } catch (IOException ex) {
            System.out.println("Unable to create client socket");
        }
    
    
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class Server {
    
    
    private ServerSocket serverSocket;
    private Socket socket;
    
    
    public Server(int port){
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException ex) {
            System.out.println("Unable to create the socket");
        }
   
    }
  
    public boolean serverOpen(){
    
    return true;
    
    }
    
    public boolean serverClosed(){
        try {
            this.serverSocket.close();
        } catch (IOException ex) {
            System.out.println("Unable to close");;
        }
    return true;
    }
    
    public void acceptClient(){
        try {   
            this.socket = this.serverSocket.accept();
            System.out.println("Cliente aceptado");
        } catch (IOException ex) {
            System.out.println("Unable to accept the client socket");;
        }
    }
    
    public int contarRecibidas(String frase){
        int espacios = 0;
        for(int i =0;i<frase.length();i++){
        char c = frase.charAt(i);
            if(c == ' '){
                espacios++;
            }
            }
        espacios++;
        
        
        return espacios;
      
    }
}

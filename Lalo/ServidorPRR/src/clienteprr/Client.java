/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteprr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
    private DataInputStream input;
    private DataOutputStream output;
    private boolean abierto;
    
    public Client(){
        /*try {
            this.socket = new Socket("localhost", 6000);
            abierto = true;
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }    */
    }
    
    public boolean isRunning(){
    return abierto;
    }
    
    public boolean connect() throws IOException{
        this.socket = new Socket("localhost", 6000);
        //si quiero testear y que devuelva boolean
       return false;
        //si quiero leer por consola
        //input = new DataInputStream(this.socket.getInputStream());
        //output = new DataOutputStream(this.socket.getOutputStream());
    }
    
    public String listen(){
        
        String data ="";
        while(this.socket.isConnected()){
            try{
             data = this.input.readUTF();
             break;
            
            }
        catch(Exception ex)  {
        
        }
        } 
    
    return data;
    }
}

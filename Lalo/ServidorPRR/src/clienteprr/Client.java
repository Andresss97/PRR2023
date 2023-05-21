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

/**
 *
 * @author super
 */
public class Client {
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;
    
    public void connect() throws IOException{
    this.socket = new Socket("localhost", 5050);
        System.out.println("Se ha conectado con éxito");
        
        input = new DataInputStream(this.socket.getInputStream());
        output = new DataOutputStream(this.socket.getOutputStream());
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

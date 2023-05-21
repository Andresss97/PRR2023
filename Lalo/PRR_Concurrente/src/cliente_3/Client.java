/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_3;

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
    private DataOutputStream dos;
    private DataInputStream dis;
    
    public void connect(){
        
        try {
            /*Para poder iniciar el cliente antes que el server
            do{
            this.socket = new Socket("localhost",5050);
           }
            while(!this.socket.isConnected())
            */
            this.socket = new Socket("localhost",5051);
            System.out.println("Cliente conectado con éxito");
            this.dos = new DataOutputStream(this.socket.getOutputStream());
            //this.dos.writeUTF("Hola me llamo Andrés");
            this.dis = new DataInputStream(this.socket.getInputStream());
        } catch (IOException ex) {
            System.out.println("Unable to create client socket");
        }

    }
    
    public void sendData(String data) {
        try {
            this.dos.writeUTF(data);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String receiveData() {
        try {
            return this.dis.readUTF();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

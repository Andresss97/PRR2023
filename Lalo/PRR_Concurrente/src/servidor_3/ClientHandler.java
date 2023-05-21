/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class ClientHandler implements Runnable {
    
    public static List<ClientHandler> clients = new ArrayList<ClientHandler>();
    private Socket socket;
    private static Server server;
    private DataInputStream dis;
    private DataOutputStream dos;

    public ClientHandler(Socket client, Server s){
        this.socket = client;
        server = s;
        try {
            this.dis = new DataInputStream(this.socket.getInputStream());
            this.dos = new DataOutputStream(this.socket.getOutputStream());
        }
        catch(Exception ex) {
            
        }
     
        clients.add(this);
        
        //Ahora me voy al constructor de Server para que el servidor este esperando clientes perma. Busca **
    }
    @Override
    public void run() {
        while(this.socket.isConnected()){
            try {
                String data = this.dis.readUTF();
                int palabras = server.contarRecibidas(data);
                String dataEnviar = "El número de palabras que ha enviado es: " + palabras;
                this.dos.writeUTF(dataEnviar);
                
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

package servidorprr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
    
    private ServerSocket socket;
    private DataInputStream input;
    private DataOutputStream output;
    private Socket cliente;
    private Boolean abierto;
    
 public Server(){
        
        try {
            this.socket = new ServerSocket(6000);
            abierto = true;
           // this.cliente = this.socket.accept();
        } catch (IOException ex) {
            //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   public boolean serverClosed(){
       
        try {
            this.socket.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
       
   
   
   }
    public boolean abierto(){  //Para el test1
  
    return abierto;
    
    }
    
    public void connect() throws IOException{
    
        //this.socket = new ServerSocket(5050);
        System.out.println("Esperando cliente:");
        //this.cliente = this.socket.accept();
        System.out.println("Se ha conectado con éxito");
        
        this.input = new DataInputStream(this.cliente.getInputStream());
        this.output = new DataOutputStream(this.cliente.getOutputStream());
        
        this.output.writeUTF("Hola estas conectado");
       
    }
    
    
   
    
    public String listen(){
    String s;
    
    s = "";
    
    return s;
    } 
    
}

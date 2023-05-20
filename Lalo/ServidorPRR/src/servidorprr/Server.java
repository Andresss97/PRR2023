package servidorprr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author super
 */
public class Server {
    
    private ServerSocket socket;
    private DataInputStream input;
    private DataOutputStream output;
    private Socket cliente;
    
    public void connect() throws IOException{
    
        this.socket = new ServerSocket(5050);
        System.out.println("Esperando cliente:");
        this.cliente = this.socket.accept();
        System.out.println("Se ha conectado con éxito");
    }
    
}

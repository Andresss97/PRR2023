/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteprr;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    private static Client client;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        client = new Client();
        
        try {
            client.connect();
            String data = client.listen();
            System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_3;

import java.awt.BorderLayout;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author super
 */
public class Cliente_3 {
    
    
    public static void main(String[] args) {
        //_ TODO code application logic here
   Client client = new Client();
   client.connect();
   Scanner scan = new Scanner(System.in);
   while(true) {
       System.out.println("Introduzca una frase:");
       String data = scan.nextLine();
       
       client.sendData(data);
       System.out.println(client.receiveData());
   }
    
    
        
    }
    
}

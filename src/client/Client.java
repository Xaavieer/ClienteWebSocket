/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JFrame;
import views.ClientInterface;

/**
 *
 * @author Xavier
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        ClientInterface client = new ClientInterface("Chat - Sockets Java");
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
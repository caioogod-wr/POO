/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista11_questao3_cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author caioo
 */
public class Lista11_Questao3_Cliente {
    static void fecha_cliente(BufferedReader RECEBE, PrintWriter ENVIA, Socket CLIENTE_SOCKET, BufferedReader INPUT) throws IOException {
        RECEBE.close();
        ENVIA.close();
        CLIENTE_SOCKET.close();
        INPUT.close();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
            PrintWriter ENVIA = new PrintWriter(CLIENTE_SOCKET.getOutputStream(), true);
            BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        
            String mensagem_cliente = "";
            mensagem_cliente = INPUT.readLine();
            if(mensagem_cliente.compareTo("POO") != 0) {
                System.out.println("Conexao nao autenticada");
                fecha_cliente(RECEBE, ENVIA, CLIENTE_SOCKET, INPUT);
            }
            
            while(mensagem_cliente.compareTo("Cambio") != 0) {
                mensagem_cliente = INPUT.readLine();
                ENVIA.println(mensagem_cliente);
            }
            
            String mensagem_servidor = "";
            while(mensagem_servidor.compareTo("Cambio") != 0) {
                mensagem_servidor = RECEBE.readLine();
                System.out.println(mensagem_servidor);
            }
            
            fecha_cliente(RECEBE, ENVIA, CLIENTE_SOCKET, INPUT);
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista11_questao3_servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author caioo
 */
public class Servidor {

    static void fecha_servidor(BufferedReader RECEBE, PrintWriter ENVIA, Socket SERVIDOR_SOCKET, ServerSocket OUVIDO, BufferedReader INPUT) throws IOException {
        RECEBE.close();
        ENVIA.close();
        SERVIDOR_SOCKET.close();
        OUVIDO.close();
        INPUT.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVIDOR_SOCKET.getInputStream()));
            PrintWriter ENVIA = new PrintWriter(SERVIDOR_SOCKET.getOutputStream(), true);
            BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
            
            String mensagem_cliente = "";
            /*str = RECEBE.readLine();
            if(str.compareTo("POO") != 0) {
                System.out.println("Conexao nao autenticada");
                fecha_servidor(RECEBE, ENVIA, SERVIDOR_SOCKET, OUVIDO, INPUT);
            }*/
            
            while(mensagem_cliente.compareTo("Cambio") != 0) {
                mensagem_cliente = RECEBE.readLine();
                System.out.println(mensagem_cliente);
            }
            
            String mensagem_servidor = "";
            while(mensagem_servidor.compareTo("Cambio") != 0) {
                mensagem_servidor = INPUT.readLine();
                ENVIA.println(mensagem_servidor);
            }
            
            fecha_servidor(RECEBE, ENVIA, SERVIDOR_SOCKET, OUVIDO, INPUT);
            
        } catch(IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}

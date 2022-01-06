package network.client_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;

public class Server {

    public static void main(String[] args) {


        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(6666)) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Клиент подсоединился");

                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

                while (true) {
                String clientRequest = in.readUTF();
                    System.out.println("Client request = " + clientRequest);
                    out.writeUTF(clientRequest + " | " + Instant.now());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

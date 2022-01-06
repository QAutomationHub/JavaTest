package network.client_server;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             Socket clientSocket = new Socket("localhost", 6666);
        ) {
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            while (true) {

                String scannerInput = scanner.nextLine();
                out.writeUTF(scannerInput);

                String serverOutput = in.readUTF();
                System.out.println(serverOutput);
            }


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

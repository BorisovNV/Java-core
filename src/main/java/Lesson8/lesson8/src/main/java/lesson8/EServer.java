package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EServer {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;


    public void start(int port) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)){
            clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился");
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (".".equals(inputLine)) {
                    out.println("good bye");
                    break;
                }
                out.println(inputLine);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        EServer eServer = new EServer();
        eServer.start(9999);
    }
}

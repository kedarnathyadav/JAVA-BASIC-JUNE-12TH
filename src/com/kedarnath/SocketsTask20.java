package com.kedarnath;

import java.io.*;
import java.net.*;

public class SocketsTask20 {
    public static void main(String[] args) {
        // Client
        new Thread(() -> {
            try (Socket socket = new Socket("localhost", 12345);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
                 
                out.println("Hello, Server");
                System.out.println("Server says: " + in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        
        // Server
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(12345);
                 Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                 
                System.out.println("Client says: " + in.readLine());
                out.println("Hello, Client");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

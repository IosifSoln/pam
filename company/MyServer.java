package com.company;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
public static final int PORT = 8081;

public  MyServer()  {
    try (ServerSocket serverSocket = new ServerSocket(PORT)){
while (true){
    System.out.println("ожидаем подключение клиентов");
    Socket socket = serverSocket.accept();
    System.out.println("клиент подключился");
    new ClientHandler(this , socket);

}
    } catch (IOException e){
        e.printStackTrace();
    }
}


}

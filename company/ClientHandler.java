package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.Socket;

import static sun.jvm.hotspot.runtime.PerfMemory.start;


public class ClientHandler {
    private Socket socket;
    private MyServer myServer;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public ClientHandler(MyServer myServer, Socket socket) {
        try {
            this.myServer = myServer;
            this.socket = socket;
            this.dataInputStream = new DataInputStream(socket.getInputStream());
            this.dataOutputStream = new DataOutputStream(socket.getOutputStream());
            new Thread(this::readMessages).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readMessages() {
while (true){
    try {
        Message message = new Gson().fromJson(dataInputStream.readUTF() ,Message.class );
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    }
}

package javaadv2.network.test;

import java.io.*;
import java.net.Socket;

public class Session implements Runnable{

    private final Socket socket;
    private final SessionManager sessionManager;
    private final DataOutputStream output;
    private final DataInputStream input;

    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.output = new DataOutputStream(socket.getOutputStream());
        this.input = new DataInputStream(socket.getInputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String receivedMessage = input.readUTF();
                sendToAll(receivedMessage);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendToAll(String message) throws IOException {
        for (Session session : sessionManager.getSessions()) {
            if (session != this) {
                output.writeUTF(message);
            }
        }
    }
}

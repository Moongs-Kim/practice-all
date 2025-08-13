package javaadv2.network.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static javaadv1.util.MyLogger.log;

public class ChatServer {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        SessionManager sessionManager = new SessionManager();
        ServerSocket serverSocket = new ServerSocket(PORT);

        try {
            while (true) {
                Socket socket = serverSocket.accept();
                log("소캣 연결: " + socket);

                Session session = new Session(socket, sessionManager);
                Thread thread = new Thread(session);
                thread.start();
            }
        } catch (IOException e) {
            log("서버 소캣 종료: " + e);
        }
    }

}

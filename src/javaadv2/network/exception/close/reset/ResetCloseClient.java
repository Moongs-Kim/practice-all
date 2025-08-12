package javaadv2.network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static javaadv2.util.MyLogger.log;

public class ResetCloseClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 12345);
        log("소캣 연결: " + socket);
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        output.write(1);

        Thread.sleep(1000);

        try {
            // java.net.SocketException: Connection reset 발생!
            int read = input.read();
            System.out.println("read = " + read);
        }
        catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            output.write(1);
        }
        catch (SocketException e) {
            //java.net.SocketException: Broken pipe
            e.printStackTrace();
        }
    }
}

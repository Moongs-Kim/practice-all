package javaadv2.network.test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static javaadv1.util.MyLogger.log;

public class ChatClient {

    public static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket("localhost", PORT);
             DataOutputStream output = new DataOutputStream(socket.getOutputStream());
             DataInputStream input = new DataInputStream(socket.getInputStream())) {

            log("소캣 연결: " + socket);
            Scanner scanner = new Scanner(System.in);
            MessageSender messageSender = new MessageSender(scanner, socket, output);
            MessageReceiver messageReceiver = new MessageReceiver(socket, input);

            Thread sendThread = new Thread(messageSender, "sender");
            Thread receiveThread = new Thread(messageReceiver, "receiver");

            sendThread.start();
            receiveThread.start();
        } catch (IOException e) {
            log(e);
        }

    }

    private static class MessageSender implements Runnable {

        private Scanner scanner;
        private Socket socket;
        private DataOutputStream output;

        public MessageSender(Scanner scanner, Socket socket, DataOutputStream output) throws IOException {
            this.scanner = scanner;
            this.socket = socket;
            this.output = output;
        }

        @Override
        public void run() {
            while (true) {
                System.out.print("입력: ");
                String message = scanner.nextLine();

                try {
                    output.writeUTF(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class MessageReceiver implements Runnable {

        private Socket socket;
        private DataInputStream input;

        public MessageReceiver(Socket socket, DataInputStream input) throws IOException {
            this.socket = socket;
            this.input = input;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("1너가 범인?");
                    String message = input.readUTF();
                    System.out.println(message);
                    System.out.println("2너가 범인?");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

}

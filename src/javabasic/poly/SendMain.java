package javabasic.poly;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}

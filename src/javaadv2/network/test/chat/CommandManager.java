package javaadv2.network.test.chat;

import java.io.IOException;

public interface CommandManager {
    void execute(String totalMessage, Session session) throws IOException;
}

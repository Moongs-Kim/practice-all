package javaadv2.network.test;

import java.util.ArrayList;
import java.util.List;

public class SessionManager {

    private List<Session> sessions = new ArrayList<>();

    public List<Session> getSessions() {
        return sessions;
    }

    public void add(Session session) {
        sessions.add(session);
    }

    public void remove(Session session) {
        sessions.remove(session);
    }
}

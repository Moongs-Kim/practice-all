package javamid2.collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage;

    public void visitPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
        System.out.println("방문: " + currentPage);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            String previousPage = history.pop();
            currentPage = previousPage;
            System.out.println("뒤로 가기: " + currentPage);
            return previousPage;
        }
        return null;
    }
}

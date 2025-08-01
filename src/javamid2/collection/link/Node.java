package javamid2.collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    //IDE 도움
    /*@Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    //[A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

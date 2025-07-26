package javamid2.generic.test.ex2;

public class Pair<K, V> {

    private K first;
    private V second;

    public void setFirst(K value) {
        this.first = value;
    }

    public void setSecond(V value) {
        this.second = value;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

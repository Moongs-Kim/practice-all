package javamid2.collection.compare.test;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getRank() == o2.getRank()) {
            if (o1.getSuit().ordinal() < o2.getSuit().ordinal()) {
                return -1;
            } else {
                return 1;
            }
        } else if(o1.getRank() < o2.getRank()) {
            return -1;
        } else {
            return 1;
        }
    }
}

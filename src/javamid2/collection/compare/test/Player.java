package javamid2.collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        List<Card> cardList = deck.getDeck();
        for (int i = 0; i < 5; i++) {
            cards.add(cardList.removeLast());
        }
    }

    public int showCard(CardComparator comparator) {
        sortCard(comparator);
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        int size = cards.size();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(String.valueOf(cards.get(i).getRank())).append("(")
                    .append(cards.get(i).getSuit().getSuit()).append(")");
            sum += cards.get(i).getRank();
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(name + "의 카드: " + sb.toString() + ", 합계: " + sum);
        return sum;
    }

    private void sortCard(CardComparator comparator) {
        cards.sort(comparator);
    }
}

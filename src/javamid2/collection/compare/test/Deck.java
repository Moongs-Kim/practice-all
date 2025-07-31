package javamid2.collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public static final int CARD_SIZE = 52;
    private List<Card> deck = new ArrayList<>(CARD_SIZE);

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (int i = 0; i < 13; i++) {
                deck.add(new Card(i + 1, suit));
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}

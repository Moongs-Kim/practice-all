package javamid2.collection.compare.test;

public enum Suit {
    SPADE("\u2660"),
    HEART("\u2665"),
    DIAMOND( "\u2666"),
    CLOVER("\u2663");

    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

}

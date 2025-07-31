package javamid2.collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");
        
        Deck deck = new Deck();
        deck.shuffle();
        
        player1.drawCard(deck);
        player2.drawCard(deck);

        int player1Rank = player1.showCard(new CardComparator());
        int player2Rank = player2.showCard(new CardComparator());

        winner(player1Rank, player2Rank);

    }

    private static void winner(int rank1, int rank2) {
        if (rank1 > rank2) {
            System.out.println("플레이어1 승리");
        } else if (rank1 < rank2) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
            
    }
}

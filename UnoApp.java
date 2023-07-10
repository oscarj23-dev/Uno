// import java.util.*;

public class UnoApp {
    private static final int STARTING_HAND = 7;
    public static void main(String[] args) {
        Player[] players = new Player[4];
        players[0] = new Player("Erik");
        players[1] = new Player("Clariza");
        players[2] = new Player("Lupita");
        players[3] = new Player("Oscar");
        
        Deck deck = new Deck();
        println(deck.getSize());
        dealHands(players, deck);
       
    }

    public static <T> void println(T thing) {
        System.out.println(thing);
    }

    public static void dealHands(Player[] players, Deck deck) {
        for (int i = 0; i < STARTING_HAND; i++) {
            for (Player player : players) {
                Card card = deck.dealCard();
                player.addCard(card);
            }
        }

        for(Player player : players) {
            println(player);
        }
    }
}

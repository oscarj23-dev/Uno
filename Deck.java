import java.util.*;

// Deck 109 cards: 25 in each of four color suits: red, yellow, green, blue.
// each suit consisting of one zero, two each of 1 through 9, 
// and two each of the action cards "Skip", "Draw Two", and "Reverse".
// deck also contains four "Wild" cards, four "Wild Draw Four", one "Wild Shuffle Hands"

public class Deck {

    private static final int WILD_CARD_COUNT = 9;
    private List<Card> deck;
    private Rank[] ranks;
    private Suit[] suits;

    public Deck() {
        deck = new ArrayList<>();
        ranks = Rank.values();
        suits = Suit.values();
        int cycles = 0;
        
        for (int suit = 0; suit < suits.length - 1; suit++) {
            deck.add(new Card(suits[suit], ranks[0])); 

            // main body of deck
            while (cycles < 2) {
                for (int rank = 1; rank < ranks.length - 3; rank++) {
                    deck.add(new Card(suits[suit], ranks[rank]));
                }
                cycles++;
            }
            cycles = 0;

            if (suit == 3) {
                for (int wild = 0; wild < WILD_CARD_COUNT; wild++) {
                    // adds 4 wilds, 4 wildPlusFours, 1 wildShuffleHand
                    if (wild < 4) {
                        deck.add(new Card(suits[4], ranks[13]));
                    } else if (wild < 8) {
                        deck.add(new Card(suits[4], ranks[14]));    
                    } else {
                        deck.add(new Card(suits[4], ranks[15]));
                    }        
                }
            }
        }

        shuffle();
    }

    public int getSize() {
        return deck.size();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : deck) {
            sb.append(card + ", ");
        }
        return sb.toString();
    }
    
}

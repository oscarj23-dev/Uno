import java.util.*;

public class Player {
    private Hand cardsInHand;
    private String name;

    public Player(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid name");
        }
        cardsInHand = new Hand();
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void addMultipleCards(List<Card> cards) {
        cardsInHand.addMultipleCards(cards);
    }

    public void addCard(Card card) {
        cardsInHand.addCard(card);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Card> cards = cardsInHand.getCards();
        for (Card card : cards) {
            sb.append(card + " ");
        }
        return sb.toString();
    }

}

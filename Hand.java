import java.util.*;

public class Hand {
    
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public int getSize() {
        return cards.size();
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public void addCard(Card card) {
        if (card == null) {
            throw new IllegalArgumentException("Deck is empty");
        }
        cards.add(card);
    }

    public void addMultipleCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public void discardCards(List<Card> removed) {
        cards.removeAll(removed);
    }


}

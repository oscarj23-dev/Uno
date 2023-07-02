public class UnoApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        println(deck);
        println(deck.getSize());
        
    }

    public static <T> void println(T thing) {
        System.out.println(thing);
    }
}

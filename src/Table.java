import java.util.*;

public class Table {
    public static List<Card> createTable(List<Card> originalDeck) {
        List<Card> tableDeck = new ArrayList<>();
        tableDeck.add(originalDeck.get(4));
        tableDeck.add(originalDeck.get(5));
        tableDeck.add(originalDeck.get(6));
        return tableDeck;
    }

    public static List<Card> addCardToTableDeck(List<Card> newOriginalDeck, List<Card> tableDeck) {
        tableDeck.add(newOriginalDeck.get(0));
        return tableDeck;
    }
}

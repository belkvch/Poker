import java.util.*;

public class PCDeck {
    public static List<Card> createPCDeck(List<Card> originalDeck) {
        List<Card> PCDeck = new ArrayList<>();
        PCDeck.add(originalDeck.get(2));
        PCDeck.add(originalDeck.get(3));
        return PCDeck;
    }


    public static List<Card> newDeckWithTablePC (List<Card> pcCDeck, List<Card> tableDeck) {
        List<Card> newDeckWithTablePC = new ArrayList<>();
        newDeckWithTablePC.addAll(pcCDeck);
        newDeckWithTablePC.addAll(tableDeck);
//        System.out.println("PC's deck witch table cards:"); just for check
//        for (Card card : newDeckWithTablePC) {
//            card.showCard();
//        }
//        System.out.println();
        return newDeckWithTablePC;
    }
}

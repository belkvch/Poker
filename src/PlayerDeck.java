import java.util.*;

public class PlayerDeck {
    public static List<Card> createPlayerDeck(List<Card> originalDeck) {
        List<Card> playerDeck = new ArrayList<>();
        playerDeck.add(originalDeck.get(0));
        playerDeck.add(originalDeck.get(1));
        return playerDeck;
    }


    public static List<Card> newDeckWithTablePlayer(List<Card> playerDeck, List<Card> tableDeck) {
        List<Card> newDeckWithTablePlayer = new ArrayList<>();
        newDeckWithTablePlayer.addAll(playerDeck);
        newDeckWithTablePlayer.addAll(tableDeck);
        return newDeckWithTablePlayer;
    }


}

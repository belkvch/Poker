import java.util.*;

public class Deck {
    public static List<Card> createDeck() {
        Card TwoDiamonds = new Card(2, "Diamonds");
        Card ThreeDiamonds = new Card(3, "Diamonds");
        Card FourDiamonds = new Card(4, "Diamonds");
        Card FiveDiamonds = new Card(5, "Diamonds");
        Card SixDiamonds = new Card(6, "Diamonds");
        Card SevenDiamonds = new Card(7, "Diamonds");
        Card EightDiamonds = new Card(8, "Diamonds");
        Card NineDiamonds = new Card(9, "Diamonds");
        Card TenDiamonds = new Card(10, "Diamonds");
        Card JackDiamonds = new Card(11, "Diamonds");
        Card QueenDiamonds = new Card(12, "Diamonds");
        Card KingDiamonds = new Card(13, "Diamonds");
        Card AceDiamonds = new Card(14, "Diamonds");

        Card TwoHearts = new Card(2, "Hearts");
        Card ThreeHearts = new Card(3, "Hearts");
        Card FourHearts = new Card(4, "Hearts");
        Card FiveHearts = new Card(5, "Hearts");
        Card SixHearts = new Card(6, "Hearts");
        Card SevenHearts = new Card(7, "Hearts");
        Card EightHearts = new Card(8, "Hearts");
        Card NineHearts = new Card(9, "Hearts");
        Card TenHearts = new Card(10, "Hearts");
        Card JackHearts = new Card(11, "Hearts");
        Card QueenHearts = new Card(12, "Hearts");
        Card KingHearts = new Card(13, "Hearts");
        Card AceHearts = new Card(14, "Hearts");

        Card TwoSpades = new Card(2, "Spades");
        Card ThreeSpades = new Card(3, "Spades");
        Card FourSpades = new Card(4, "Spades");
        Card FiveSpades = new Card(5, "Spades");
        Card SixSpades = new Card(6, "Spades");
        Card SevenSpades = new Card(7, "Spades");
        Card EightSpades = new Card(8, "Spades");
        Card NineSpades = new Card(9, "Spades");
        Card TenSpades = new Card(10, "Spades");
        Card JackSpades = new Card(11, "Spades");
        Card QueenSpades = new Card(12, "Spades");
        Card KingSpades = new Card(13, "Spades");
        Card AceSpades = new Card(14, "Spades");

        Card TwoClubs = new Card(2, "Clubs");
        Card ThreeClubs = new Card(3, "Clubs");
        Card FourClubs = new Card(4, "Clubs");
        Card FiveClubs = new Card(5, "Clubs");
        Card SixClubs = new Card(6, "Clubs");
        Card SevenClubs = new Card(7, "Clubs");
        Card EightClubs = new Card(8, "Clubs");
        Card NineClubs = new Card(9, "Clubs");
        Card TenClubs = new Card(10, "Clubs");
        Card JackClubs = new Card(11, "Clubs");
        Card QueenClubs = new Card(12, "Clubs");
        Card KingClubs = new Card(13, "Clubs");
        Card AceClubs = new Card(14, "Clubs");

        //making original deck
        List<Card> deck = new ArrayList<>();
        deck.add(TwoDiamonds);
        deck.add(ThreeDiamonds);
        deck.add(FourDiamonds);
        deck.add(FiveDiamonds);
        deck.add(SixDiamonds);
        deck.add(SevenDiamonds);
        deck.add(EightDiamonds);
        deck.add(NineDiamonds);
        deck.add(TenDiamonds);
        deck.add(JackDiamonds);
        deck.add(QueenDiamonds);
        deck.add(KingDiamonds);
        deck.add(AceDiamonds);

        deck.add(TwoHearts);
        deck.add(ThreeHearts);
        deck.add(FourHearts);
        deck.add(FiveHearts);
        deck.add(SixHearts);
        deck.add(SevenHearts);
        deck.add(EightHearts);
        deck.add(NineHearts);
        deck.add(TenHearts);
        deck.add(JackHearts);
        deck.add(QueenHearts);
        deck.add(KingHearts);
        deck.add(AceHearts);

        deck.add(TwoSpades);
        deck.add(ThreeSpades);
        deck.add(FourSpades);
        deck.add(FiveSpades);
        deck.add(SixSpades);
        deck.add(SevenSpades);
        deck.add(EightSpades);
        deck.add(NineSpades);
        deck.add(TenSpades);
        deck.add(JackSpades);
        deck.add(QueenSpades);
        deck.add(KingSpades);
        deck.add(AceSpades);

        deck.add(TwoClubs);
        deck.add(ThreeClubs);
        deck.add(FourClubs);
        deck.add(FiveClubs);
        deck.add(SixClubs);
        deck.add(SevenClubs);
        deck.add(EightClubs);
        deck.add(NineClubs);
        deck.add(TenClubs);
        deck.add(JackClubs);
        deck.add(QueenClubs);
        deck.add(KingClubs);
        deck.add(AceClubs);

        return deck;
    }

    public static List<Card> newOriginalDeck(List<Card> originalDeck) {
        originalDeck.remove(0);
        originalDeck.remove(1);
        originalDeck.remove(2);
        originalDeck.remove(3);
        originalDeck.remove(4);
        originalDeck.remove(5);
        originalDeck.remove(6);
        return originalDeck;
    }

    public static List<Card> deleteCardFromOriginalDeck(List<Card> newOriginalDeck) {
        newOriginalDeck.remove(0);
        return newOriginalDeck;
    }
}

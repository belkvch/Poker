import java.io.*;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello! It's my кривой poker. (with my perfect English)");
        Scanner in = new Scanner(System.in);
        int bet = 0;
        boolean flag;
        do {
            flag = true;
            System.out.println("Player, enter the bet. Your balance is 10. PC will support your bet. My bet is ");
            bet = in.nextInt();

            try {
                if (bet < 1 || bet > 10) {
                    flag = false;
                    System.out.println("Enter the number from 1 to 10");
                }
            } catch (NumberFormatException e) {
                flag = false;
                System.out.println("Invalid. Not a number. Try again.");
            }
            ;
        } while (!flag);
        PlayerBalance.balancePlayer = PlayerBalance.balancePlayer - bet;
        PCBalance.balancePC = PCBalance.balancePC - bet;
        TableBalance.balanceTable += bet;
        TableBalance.balanceTable += bet;
        System.out.println("The bank: " + TableBalance.balanceTable);
        System.out.println();

        List<Card> originalDeck = Deck.createDeck();

//        making random deck
//        System.out.println("Original List:");
//        for (Card card : originalDeck) {
//            card.showCard();
//        }

        Collections.shuffle(originalDeck);

        //deck after shuffle
//        System.out.println("Second List:");
//        for (Card card : originalDeck) {
//            card.showCard();
//        }

        List<Card> playerDeck = PlayerDeck.createPlayerDeck(originalDeck);
        List<Card> pcDeck = PCDeck.createPCDeck(originalDeck);
        List<Card> tableDeck = Table.createTable(originalDeck);
        List<Card> newOriginalDeck = Deck.newOriginalDeck(originalDeck);

        //check how many cards in deck
//        System.out.println("New List:");
//        for (Card card : originalDeck) {
//                card.showCard();
//        }

        //player's deck
        System.out.println("Player's deck:");
        for (Card card : playerDeck) {
            card.showCard();
        }
        System.out.println();

        //cards in table
        System.out.println("Cards in table:");
        for (Card card : tableDeck) {
            card.showCard();
        }
        System.out.println();

        //PC's deck
//        System.out.println("PC's deck:");
//        for (Card card : pcDeck) {
//            card.showCard();
//        }
//        System.out.println();

//        PC's and Player decks witch table cards
//        PlayerDeck.newDeckWithTable(playerDeck,tableDeck);
//        PCDeck.newDeckWithTablePC(pcDeck,tableDeck);

        //turn for player and PC's reaction
        Moves.turnPlayer();
        System.out.println();

        //add new cards
        System.out.println("Check new card.");
        newOriginalDeck = Deck.deleteCardFromOriginalDeck(newOriginalDeck);
        tableDeck = Table.addCardToTableDeck(newOriginalDeck, tableDeck);
        newOriginalDeck = Deck.deleteCardFromOriginalDeck(newOriginalDeck);

        //player's deck after fitst add
        System.out.println("Player's deck:");
        for (Card card : playerDeck) {
            card.showCard();
        }
        System.out.println();

        //cards in table after fitst add
        System.out.println("Cards in table:");
        for (Card card : tableDeck) {
            card.showCard();
        }
        System.out.println();

////        PC's deck after fitst add
//        System.out.println("PC's deck:");
//        for (Card card : pcDeck) {
//            card.showCard();
//        }
//        System.out.println();

        //turn for player and PC's reaction
        Moves.turnPlayer();
        System.out.println();

        //add new cards
        System.out.println("Check new card.");
        newOriginalDeck = Deck.deleteCardFromOriginalDeck(newOriginalDeck);
        tableDeck = Table.addCardToTableDeck(newOriginalDeck, tableDeck);
        newOriginalDeck = Deck.deleteCardFromOriginalDeck(newOriginalDeck);

        //player's deck after second add
        System.out.println("Player's deck:");
        for (Card card : playerDeck) {
            card.showCard();
        }
        System.out.println();

        //cards in table after second add
        System.out.println("Cards in table:");
        for (Card card : tableDeck) {
            card.showCard();
        }
        System.out.println();

        //turn for player and PC's reaction
        Moves.turnPlayer();
        System.out.println();

        //final
        List<Card> newDeckWithTablePlayer = PlayerDeck.newDeckWithTablePlayer(playerDeck, tableDeck);
        List<Card> newDeckWithTablePC = PCDeck.newDeckWithTablePC(pcDeck, tableDeck);

        int combiPlayer = Combinations.getCombiPoint(PlayerBalance.combiPointPlayer, newDeckWithTablePlayer);
        int combiPC = Combinations.getCombiPoint(PCBalance.combiPointPC, newDeckWithTablePC);
        if (combiPlayer > combiPC) {
            System.out.println("You win!");
            PlayerBalance.balancePlayer += TableBalance.balanceTable;
        } else if (combiPlayer < combiPC) {
            System.out.println("You lose!");
            PCBalance.balancePC += TableBalance.balanceTable;
        } else System.out.println("The dead heat!");
        System.out.println();
        System.out.println("Your balance is " + PlayerBalance.balancePlayer);
        System.out.println("PC's balance is " + PCBalance.balancePC);
        System.out.println("The bank is " + TableBalance.balanceTable);
    }
}

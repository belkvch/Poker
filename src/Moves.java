import java.util.*;

public class Moves {
    public static void turnPlayer() {

        Scanner in = new Scanner(System.in);
        int turn = 0;
        System.out.println("Player, your turn. Please, enter the nubmer.");
        System.out.println("1.bet");
        System.out.println("2.check");
        System.out.println("3.fold");
        turn = in.nextInt();
        switch (turn) {
            case (1):
                int bet = 0;
                boolean flag;
                do {
                    flag = true;
                    System.out.println("Player, enter the bet. My bet is ");
                    bet = in.nextInt();
                    try {
                        if (bet < 1 || bet > PlayerBalance.balancePlayer) {
                            flag = false;
                            System.out.println("Enter the correct number");
                        }
                    } catch (NumberFormatException e) {
                        flag = false;
                        System.out.println("Invalid. Not a number. Try again.");
                    }
                    ;
                } while (!flag);
                PlayerBalance.balancePlayer = PlayerBalance.balancePlayer - bet;
                TableBalance.balanceTable += bet;
                System.out.println("The bank: " + TableBalance.balanceTable);
                System.out.println("Your balance: " + PlayerBalance.balancePlayer);
                System.out.println();

                double number = Math.random();
                long randomPC = Math.round(number);
                if (randomPC == 0) {
                    System.out.println("PC support your bet.");
                    PCBalance.balancePC = PCBalance.balancePC - bet;
                    TableBalance.balanceTable += bet;
                    System.out.println();
                } else {
                    System.out.println("PC choose fold. You're the winner!");
                    System.exit(0);
                }
                break;

            case (2):
                System.out.println("PC choose check too.");
                System.out.println("The bank: " + TableBalance.balanceTable);
                System.out.println("Your balance: " + PlayerBalance.balancePlayer);
                return;
            case (3):
                System.out.println("Player, goodbye and good luck! Maybe next time you'll be more lucky.");
                System.out.println("PC is the winner.");
                System.exit(0);
            default:
                System.out.println("I'm not a clown. -3 points, bro.");
                PlayerBalance.balancePlayer = PlayerBalance.balancePlayer - 3;
                TableBalance.balanceTable += 3;
                System.out.println("The bank: " + TableBalance.balanceTable);
                System.out.println("Your balance: " + PlayerBalance.balancePlayer);
                if (PlayerBalance.balancePlayer == 0) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                System.out.println();
        }
    }
}


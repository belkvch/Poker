import java.util.*;

public class Combinations {
    public static int getCombiPoint(int combiPoint, List<Card> newDeckWithTable) {
        int combiSuitCount = 0;
        int combiValue = 0;
        int combiCount = 0;

        int valuesArray[] = new int[newDeckWithTable.size()];
        String suitArray[] = new String[newDeckWithTable.size()];

        //make array for Value
        for (int i = 0; i < newDeckWithTable.size(); i++) {
            valuesArray[i] = newDeckWithTable.get(i).getValue();
        }
//        System.out.println(Arrays.toString(valuesArray)); just for check

        //find combiValue and combiCount
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : valuesArray) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
            if (newValue != 1) {
                combiCount += newValue;
            }
        }
//        System.out.println(counter);  // Вывод: {1=1, 2=3, 3=1, 5=2}, т.е. 1 встретилось 1 раз, 2 - 3 раза, 3 - 1 раз, 5 - 2 раза
//        System.out.println(combiCount); //check combiCount - сумма повторов
//         find combiValue
        for (int value : counter.values()) {
            if (value > 1) {
                combiValue++;
            }
        }
//        System.out.println(combiValue); //check combiValue - сколько карт повторилось

        //make array for Suit
        for (int i = 0; i < newDeckWithTable.size(); i++) {
            suitArray[i] = newDeckWithTable.get(i).getSuit();
        }
//        System.out.println(Arrays.toString(suitArray)); //just for check

        //find combiValue and combiCount
        Map<String, Integer> counterTwo = new HashMap<>();
        for (String x : suitArray) {
            int newValue = counterTwo.getOrDefault(x, 0) + 1;
            counterTwo.put(x, newValue);
            if (newValue > 4) {
                combiSuitCount += newValue;
            }
        }
//         System.out.println(counterTwo);
//        System.out.println(combiSuitCount); //check combiSuitCount - повтор мастей


//COMBINATIONS:
        //for Straight and Straight-flush
        Arrays.sort(valuesArray);
        int[] valuesArrayStraight = new int[9];
        for (int i = 0; i < valuesArray.length; i++) { //making new array for combi
            valuesArrayStraight[i] = valuesArray[i];
        }
        valuesArrayStraight[7] = 0;
        valuesArrayStraight[8] = 0;
        int straight = 0;
//        System.out.println(Arrays.toString(valuesArrayStraight)); //check
        for (int i = 0; i < valuesArrayStraight.length - 2; i++) {
            if ((valuesArrayStraight[i] - valuesArrayStraight[i + 1]) == (-1) && (valuesArrayStraight[i] - valuesArrayStraight[i + 2]) == (-2)) {
                straight += 1;
            }
            if (straight > 4) {
                if (combiSuitCount > 4) {
                    combiPoint = 8;
                } else combiPoint = 4;
            }
        }


//        //for other combinations
        if (combiValue == 1 & combiCount == 2) {
            combiPoint = 1;
        } else if (combiValue == 2 & combiCount == 4) {
            combiPoint = 2;
        } else if (combiValue == 1 & combiCount == 5) {
            combiPoint = 3;
        } else if (combiValue == 2 & combiCount == 7) {
            combiPoint = 6;
        } else if (combiValue == 1 & combiCount == 9) {
            combiPoint = 7;
        }

        if (combiSuitCount > 4) {
            combiPoint = 5;
        }
//        System.out.println(combiPoint);
        return combiPoint;
    }
}

//        High Card - 0
//        One Pair - 1 YEP
//        Two pairs - 2 YEP
//        Three of a Kind - 3
//        Straight - 4 YEP
//        Flush - 5
//        Full House - 6
//        Four of a Kind - 7
//        Straight-flush - 8 YEP
//        WITHOUT Straight-flush (maybe later)
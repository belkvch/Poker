//package test.straight;
//
//import java.util.*;
//
//public class test4and8 {
//    public static void main(String[] args) {
//        int straight = 0;
//        int combiPoint = 0;
//        int combiSuitCount = 0;
//        int combiValue = 0;
//        int combiCount = 0;
//
//        int[] valuesArray = {1, 1, 1, 1, 2, 6, 7};
//
//        Map<Integer, Integer> counter = new HashMap<>();
//        for (int x : valuesArray) {
//            int newValue = counter.getOrDefault(x, 0) + 1;
//            counter.put(x, newValue);
//            if (newValue != 1) {
//                combiCount += newValue;
//            }
//        }
//        System.out.println(counter);  // Вывод: {1=1, 2=3, 3=1, 5=2}, т.е. 1 встретилось 1 раз, 2 - 3 раза, 3 - 1 раз, 5 - 2 раза
//        System.out.println(combiCount); //check combiCount - сумма повторов
////         find combiValue
//        for (int value : counter.values()) {
//            if (value > 1) {
//                combiValue++;
//            }
//        }
//        System.out.println(combiValue); //check combiValue - сколько карт повторилось
//
//
////
////        System.out.println(Arrays.toString(valuesArray));
////        int combiPoint = 0;
////        for (int i = 0; i < valuesArray.length - 2; i++) {
////            if ((valuesArray[i] - valuesArray[i + 1]) == (-1) && (valuesArray[i] - valuesArray[i + 2]) == (-2)) {
////                straight += 1;
////            }
////            if (straight > 4) {
////                if (combiSuitCount > 4) {
////                    combiPoint = 8;
////                } else combiPoint = 4;
////            }
////        }
//
//
//        if (combiValue == 1 & combiCount == 2) {
//            combiPoint = 1;
//        } else if (combiValue == 2 & combiCount == 4) {
//            combiPoint = 2;
//        } else if (combiValue == 1 & combiCount == 3) {
//            combiPoint = 3;
//        } else if (combiValue == 2 & combiCount == 5) {
//            combiPoint = 6;
//        } else if (combiValue == 1 & combiCount == 4) {
//            combiPoint = 7;
//        }
//
//
//        System.out.println(combiPoint);
//    }
//}
//

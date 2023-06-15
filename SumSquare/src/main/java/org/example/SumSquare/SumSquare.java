package org.example.SumSquare;

public class SumSquare {

    public static int potence(int number, int exponent){
        int result = 1;

        for (int counter = 0; counter < exponent; counter++) {
            result *= number;
        }

        return result;
    }

    public static int sumSquare(int startNumber, int endNumber, boolean isSumOfSquare){
        int sumSquare = 0;
        for (int counter = startNumber; counter <= endNumber; counter++) {
            sumSquare += isSumOfSquare ? potence(counter, 2): counter;
        }
        if (!isSumOfSquare){
            sumSquare = potence(sumSquare, 2);
        }
        return sumSquare;
    }

    public static int sumSquare(int startNumber, int endNumber){
        return sumSquare(startNumber, endNumber, false) - sumSquare(startNumber, endNumber, true);
    }

    public static boolean isANumber(String number){
        boolean isANumber = true;

        try {
            Integer.parseInt(number);
        }catch (Exception e){
            isANumber = false;
        }

        return isANumber;
    }

}

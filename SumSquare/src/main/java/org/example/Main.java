package org.example;

import org.example.SumSquare.SumSquare;

public class Main {
    public static void main(String[] args) {
        try {
            int startNumber = 0;
            int endNumber = 0;
            if (args.length != 2) {
                throw new Exception("The program must have 2 parameters");
            }
            if (!SumSquare.isANumber(args[0]) || !SumSquare.isANumber(args[1])) {
                throw new Exception(args[0] + " or " + args[1] + " are not numbers valids.");
            } else {
                startNumber = Integer.parseInt(args[0]);
                endNumber = Integer.parseInt(args[1]);
            }

            if (startNumber > endNumber) {
                throw new Exception("The first parameter " + startNumber + " can not be greater than second paramater " + endNumber + ".");
            }

            System.out.println(SumSquare.sumSquare(startNumber, endNumber));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
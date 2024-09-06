package org.example.Day4Exercise;

import java.util.*;

public class Problem3 {
    public static void run() {
        System.out.println("3. Write a function to remove all odd numbers in an array and return a new array that contains even\n" +
                "numbers only.");
        removeOddNumber();
    }

    public static void removeOddNumber() {
        try {
            Scanner scanInput = new Scanner(System.in);
            System.out.print("Input : ");
            String inArrNumber = scanInput.nextLine();
            String[] arrString = inArrNumber.split(",");
            List<Integer> result = new ArrayList<Integer>();
            for (String s : arrString) {
                int currentNumber = Integer.parseInt(s);
                if (currentNumber % 2 == 0)
                    result.add(currentNumber);
            }
            System.out.print("Output : " + result);
        } catch (Exception e) {
            System.out.println("Input is not array of integer.");
            removeOddNumber();
        }
    }

}

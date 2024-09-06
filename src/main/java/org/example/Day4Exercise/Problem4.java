package org.example.Day4Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static void run() {
        System.out.println("4. Create a function that can loop the number of times according to the input we provide, and will replace multiples of 3 with \"Fizz\", multiples of 5 with \"Buzz\", multiples of 3 and 5 with\n" +
                "\"FizzBuzz\".");
        replaceNumbers();
    }

    public static void replaceNumbers() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input : ");
            int inNumber = scanner.nextInt();
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= inNumber; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.append("FizzBuzz");
                } else if (i % 3 == 0) {
                    result.append("Fizz");
                }else if (i % 5 == 0) {
                    result.append("Buzz");
                }else{
                    result.append(i);
                }
                if (i<inNumber)
                    result.append(",");
            }
            System.out.print("Output : " + result);
        } catch (Exception e) {
            System.out.println("Input is not integer.");
            replaceNumbers();
        }
    }

}

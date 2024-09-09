package org.example;

import org.example.Day4Exercise.Exercise;
import org.example.Day4Exercise.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= EXERCISE DAY 4 =======");
        System.out.println("1. Word Guessing Game.");
        System.out.println("2. Currency conversion.");
        System.out.println("3. Remove odd numbers.");
        System.out.println("4. Replace multiples of 3 with \"Fizz\", multiples of 5 with \"Buzz\", multiples of 3 and 5 with\n" +
                "\"FizzBuzz\".");
        System.out.println("5. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.");
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Choose Exercise: ");
        String arg = scanIn.nextLine();
        if (Utils.isInteger(arg)) {
            Exercise.run(Integer.parseInt(arg));
        } else {
            System.out.println("Input is not integer type.");
        }
        scanIn.close();
    }
}
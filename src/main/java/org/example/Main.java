package org.example;

import org.example.Day4Exercise.Exercise;
import org.example.Day4Exercise.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= EXERCISE DAY 4 =======");
        System.out.println("1. Word Guessing Game.");
        System.out.println("2. Write a program to print the following pattern for n rows.");
        System.out.println("3. Write a code that reads n number of input from scanner.");
        System.out.println("4. Guess the number.");
        System.out.println("5. Write a code to swap the case of each character from string.");
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Choose Exercise: ");
        String arg = scanIn.nextLine();
        if (Utils.isInteger(arg)) {
            Exercise.run(Integer.parseInt(arg));
        } else {
            System.out.println("Input is not integer type.");
        }
    }
}
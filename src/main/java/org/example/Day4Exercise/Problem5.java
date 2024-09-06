package org.example.Day4Exercise;

import java.util.Scanner;

public class Problem5 {
    public static void run() {
        System.out.println("5. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.");
        int[] inArray = getArray();
        int target = getTarget();
        findPair(inArray, target);
    }

    public static int[] getArray() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Array: ");
            String inArrNumber = scanner.nextLine();
            String[] arrString = inArrNumber.split(",");
            int[] numbers = new int[arrString.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(arrString[i]);
            }
            return numbers;
        } catch (Exception e) {
            System.out.println("Input is not array of integer.");
            return getArray();
        }
    }

    public static int getTarget() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Target: ");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input is not integer.");
            return getTarget();
        }
    }

    public static void findPair(int[] inArray, int target) {
        try {
            String result= "";
            for (int i = 0; i < inArray.length; i++) {
                for (int j = i; j < inArray.length; j++) {
                    if (i != j && inArray[i] + inArray[j] == target) {
                        result+="["+inArray[i]+","+inArray[j]+"] ";
                    }
                }
            }
            if (result!=""){
                System.out.print("Output : " + result);
            }else{
                System.out.print("No pair exist.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
            findPair(inArray, target);
        }
    }

}

package org.example.Day4Exercise;

import java.util.*;

public class Problem2 {
    public static void run() {
        System.out.println("2. Write a program to handle currency conversion with predefined exchange value below.");
        Map<String, Double> currencyMap = new HashMap<String, Double>();
        currencyMap.put("USD_TO_EUR", 0.90);
        currencyMap.put("USD_TO_GBP", 0.76);
        currencyMap.put("EUR_TO_USD", 1.11);
        currencyMap.put("EUR_TO_GBP", 0.84);
        currencyMap.put("GBP_TO_EUR", 1.18);
        currencyMap.put("GBP_TO_USD", 1.32);
        double amount = getAmount();
        getConvertedAmount(currencyMap, amount);
    }

    public static double getAmount() {
        try {
            Scanner scanInput = new Scanner(System.in);
            System.out.print("Amount : ");
            return scanInput.nextDouble();
        } catch (Exception e) {
            System.out.println("Type the correct amount.");
            return getAmount();
        }
    }

    public static void getConvertedAmount(Map<String, Double> currencyMap, double amount) {
        try {
            Scanner scanInput = new Scanner(System.in);
            System.out.print("Source (USD,EUR,GBP) : ");
            String sourceCur = scanInput.nextLine();
            System.out.print("Target (USD,EUR,GBP): ");
            String targetCur = scanInput.nextLine();
            String conversion = sourceCur.toUpperCase() + "_TO_" + targetCur.toUpperCase();
            double convertedAmount = currencyMap.get(conversion) * amount;
            System.out.println(amount + " " + sourceCur.toUpperCase() + " is equal to " + convertedAmount + " " + targetCur.toUpperCase());
        } catch (Exception e) {
            System.out.println("Type the correct currency pair.");
            getConvertedAmount(currencyMap, amount);
        }

    }
}

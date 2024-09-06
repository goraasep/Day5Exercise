package org.example.Day4Exercise;

import java.util.*;

public class Problem1 {
    public static void run() {
        System.out.println("1. Word Guessing Game.");
        List<String> words = List.of("threeee", "threee", "three");
        String chosenWord = selectRandomWords(words).toUpperCase();
        String hiddenWord = hideWord(chosenWord);
        int attempts = 5;
        System.out.println("Choosen word: " + chosenWord); //for debug
        while (attempts > 0) {
            System.out.println("Word: " + hiddenWord);
            System.out.println("Remaining attempts: " + attempts);
            char charPlayerGuessed = getPlayerGuess();
            if (isGuessCorrect(chosenWord, charPlayerGuessed)) {
                hiddenWord = updateHiddenWord(chosenWord, hiddenWord, charPlayerGuessed);
                if (isAllCorrect(hiddenWord)) {
                    displayGameResult(chosenWord, hiddenWord, attempts);
                    break;
                }
            } else {
                attempts--;
            }
        }
        if (attempts == 0)
            System.out.println("You failed!");
    }

    public static String selectRandomWords(List<String> words) {
        Random rand = new Random();
        int randInt = rand.nextInt(0, words.size());
        return words.get(randInt);
    }

    public static String hideWord(String word) {
        char[] wordChars = word.toCharArray();
        Arrays.fill(wordChars, '_');
        return String.valueOf(wordChars);
    }

    public static char getPlayerGuess() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Input : ");
        return Character.toUpperCase(scanInput.nextLine().toCharArray()[0]);
    }

    public static boolean isGuessCorrect(String word, char guess) {
        return word.contains(Character.toString(guess));
    }

    public static String updateHiddenWord(String word, String hiddenWord, char guess) {
        char[] wordChars = word.toCharArray();
        char[] hiddenWordChars = hiddenWord.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
            if (wordChars[i] == guess)
                hiddenWordChars[i] = guess;
        }
        return String.valueOf(hiddenWordChars);
    }

    public static boolean isAllCorrect(String word) {
        return !word.contains("_");
    }

    public static void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft) {
        System.out.println("Congratulation! You have guessed \"" + wordToGuess + "\"");
        System.out.println("Remaining attempts: " + attemptsLeft);
    }
}

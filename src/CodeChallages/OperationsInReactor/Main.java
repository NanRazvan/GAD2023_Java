package CodeChallages.OperationsInReactor;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    static void displayingLetters() {
        int count = 0;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                count++;
                System.out.println(count + ". " + letter);
            }
        }
        System.out.println("Total count: " + count);
    }

    static void findingMissingLetter() {
        int count = 0;
        char previousLetter = 'a';
        for (String word : words) {
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                while (previousLetter < letter) {
                    count++;
                    System.out.println(count + ". " + previousLetter);
                    previousLetter++;
                }
                count++;
                System.out.println(count + ". " + letter);
                previousLetter = letter;
            }
            previousLetter++; // Increment to the next expected letter
        }
        System.out.println("Total count: " + count);
    }

    static void restoringMissingLetter() {
        int count = 0;
        char previousLetter = 'a';
        for (String word : words) {
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                while (previousLetter < letter) {
                    count++;
                    System.out.println(count + ". " + previousLetter);
                    previousLetter++;
                }
                count++;
                System.out.println(count + ". " + letter);
                previousLetter = letter;
            }
            previousLetter++; // Increment to the next expected letter
        }
        while (previousLetter <= 'z') {
            count++;
            System.out.println(count + ". " + previousLetter);
            previousLetter++;
        }
        System.out.println("Total count: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Displaying Letters:");
        displayingLetters();

        System.out.println("\nFinding Missing Letter:");
        findingMissingLetter();

        System.out.println("\nRestoring Missing Letter:");
        restoringMissingLetter();
    }
}


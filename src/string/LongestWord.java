package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR29
 * Question     : Find the longest word in a given sentence.
 * Title        : LongestWord.java
 * Author       : Sribinu P
 * Created On   : 26-02-2026
 * Topic        : String (Longest Word)
 * Difficulty   : Medium
 * Description  : Find and print the longest word in a given sentence.
 * ----------------------------------------------------------
 */

public class LongestWord {

    public static void main(String[] args) {
        // Program STR29: LongestWord
        // Split sentence → Compare word lengths → Keep maximum.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String[] words = str.split("\\s+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);

        scan.close();
    }
}

/* Output:
    Enter a string: java is extremely powerful language
    Longest word: extremely
 */
package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR30
 * Question     : Find the shortest word in a given sentence.
 * Title        : ShortestWord.java
 * Author       : Sribinu P
 * Created On   : 27-02-2026
 * Topic        : String(Shortest Word)
 * Difficulty   : Easy
 * Description  : Find and print the shortest word in a given sentence.
 * ----------------------------------------------------------
 */

public class ShortestWord {

    public static void main(String[] args) {
        // Program STR30: ShortestWord
        // Split → Assume first word is shortest → Compare and update.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String[] words = str.split("\\s+");

        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("Shortest word: " + shortestWord);

        scan.close();
    }
}

/* Output:
    Enter a string: Java is a programming language
    Shortest word: a
 */
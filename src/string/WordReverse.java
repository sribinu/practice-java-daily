package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR18
 * Question     : Reverse each word in a sentence individually.
 * Title        : WordReverse.java
 * Author       : Sribinu P
 * Created On   : 14-02-2026
 * Topic        : String (Each Word Reverse)
 * Difficulty   : Medium
 * Description  : This program reverses each word separately, but keeps the word order same.
 * ----------------------------------------------------------
 */

public class WordReverse {

    public static void main(String[] args) {
        // Program STR18: WordReverse
        // Split sentence into words, reverse each word, then join back.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String[] words = str.trim().split("\\s+");
        String result = "";

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result += word.charAt(i);
            }
            result += " ";
        }

        System.out.println("Each word reversed string: " + result);
        scan.close();
    }
}

/* Output:
    Enter a string: java is a program
    Each word reversed string: avaj si a margorp
 */

/* Another Logic:
    for (String word: words) {
        result += new StringBuilder(word).reverse().toString() + " ";
    }
 */
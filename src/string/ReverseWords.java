package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR27
 * Question     : Reverse the order of words in a sentence.
 * Title        : ReverseWords.java
 * Author       : Sribinu P
 * Created On   : 24-02-2026
 * Topic        : String (Reverse Words)
 * Difficulty   : Easy
 * Description  : Reverse the order of words, but keep each word unchanged.
 * ----------------------------------------------------------
 */

public class ReverseWords {

    public static void main(String[] args) {
        // Program STR27: ReverseWords
        // Split → Traverse from end → Rebuild sentence.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String[] words = str.split("\\s+");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println("Result: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: java is a programming language
    Result: language programming a is java
 */
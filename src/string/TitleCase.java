package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR35
 * Question     : Convert sentence to title case.
 * Title        : TitleCase.java
 * Author       : Sribinu P
 * Created On   : 04-03-2026
 * Topic        : String (Title Case)
 * Difficulty   : Easy
 * Description  : In Title Case, the first letter of every word is capitalized and the rest are lowercase.
 * ----------------------------------------------------------
 */

public class TitleCase {

    public static void main(String[] args) {
        // Program STR35: TitleCase
        // Lowercase → Split → Capitalize first letter of each word → Join back
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        String result = "";

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        System.out.println("Converted sentence: " + result);

        scan.close();
    }
}

/* Output:
    Enter a sentence: java is a famous programming language
    Converted sentence: Java Is A Famous Programming Language
 */
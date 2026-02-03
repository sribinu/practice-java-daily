package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR6
 * Question     : Count number of words in a sentence.
 * Title        : CountWords.java
 * Author       : Sribinu P
 * Created On   : 02-02-2026
 * Topic        : String (Count number)
 * Difficulty   : Easy
 * Description  : This program counts the number of words in a given sentence.
 *                Words are assumed to be separated by spaces.
 * ----------------------------------------------------------
 */

public class CountWords {

    public static void main(String[] args) {
        // Program STR6: CountWords
        // Count transitions from space to non-space characters.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = scan.nextLine().trim();

        int count = 0;

        if (str.length() > 0) {
            count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }

        System.out.println("Number of words = " + count);
        scan.close();
    }
}

/* Output:
    Enter a sentence: java is a programming language
    Number of words = 5
 */

/* Another Logic:
        String str = scan.nextLine();
        String[] words = str.split(" ");

        int noOfWords = 0;
        for (String s: words) {
            noOfWords++;
        }
        System.out.println("Number of words: " + noOfWords);
 */
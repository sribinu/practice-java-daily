package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR17
 * Question     : Split string into words and print each separately.
 * Title        : SplitWords.java
 * Author       : Sribinu P
 * Created On   : 13-02-2026
 * Topic        : String (Split Words)
 * Difficulty   : Easy
 * Description  : This program splits a sentence into individual words and prints each word on a new line.
 * ----------------------------------------------------------
 */

public class SplitWords {

    public static void main(String[] args) {
        // Program STR17: SplitWords
        // Use split("\\s+") to break a sentence into words based on spaces.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Split words:");
        for (String s : words) {
            System.out.println(s);
        }

        scan.close();
    }
}

/* Output:
    Enter a string: java is a programming language
    Split words:
    java
    is
    a
    programming
    language
 */

/* Another Logic:
    String word = "";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch != ' ') {
            word += ch;
        } else {
            if (!word.isEmpty()) {
                System.out.println(word);
                word = "";
            }
        }
    }

    if (!word.isEmpty()) {
        System.out.println(word);
    }
 */
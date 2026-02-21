package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR24
 * Question     : Remove a given word from a sentence.
 * Title        : RemoveWord.java
 * Author       : Sribinu P
 * Created On   : 20-02-2026
 * Topic        : String (Remove Word)
 * Difficulty   : Medium
 * Description  : Remove all occurrences of a specific word from a sentence.
 * ----------------------------------------------------------
 */

public class RemoveWord {

    public static void main(String[] args) {
        // Program STR24: RemoveWord
        // Split → Skip target word → Rebuild sentence.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter word to remove: ");
        String word = scan.nextLine();

        String result = "";

        for (String w : str.split(" ")) {
            if (!w.equals(word))
                result += w + " ";
        }

        System.out.println("Updated string: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: java is powerful and java is popular
    Enter word to remove: is
    Updated string: java powerful and java popular
 */
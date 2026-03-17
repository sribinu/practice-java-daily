package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR47
 * Question     : Find the longest repeating sequence in a string.
 * Title        : LongestRepeatingSubstring.java
 * Author       : Sribinu P
 * Created On   : 17-03-2026
 * Topic        : String (Longest Repeating Substring)
 * Difficulty   : Intermediate
 * Description  : Find the longest repeating substring (sequence) in a string.
 *                A repeating sequence means: It appears more than once, Characters are continuous (substring)
 * ----------------------------------------------------------
 */

public class LongestRepeatingSubstring {

    public static void main(String[] args) {
        // Program STR47: LongestRepeatingSubstring
        // Compare all suffixes and track the longest common prefix
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scan.nextLine();

        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String sub = str.substring(i, j);

                if (str.indexOf(sub, i + 1) != -1) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        System.out.println("Longest repeating substring: " + longest);

        scan.close();
    }
}

/* Output:
    Enter string: banana
    Longest repeating substring: ana
 */
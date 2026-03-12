package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ----------------------------------------------------------
 * Program No   : STR43
 * Question     : Find longest substring without repeating characters.
 * Title        : LongestSubstring.java
 * Author       : Sribinu P
 * Created On   : 12-03-2026
 * Topic        : String (Longest Substring)
 * Difficulty   : Hard
 * Description  : Find the length of the longest substring without repeating characters.
 * ----------------------------------------------------------
 */

public class LongestSubstring {

    public static void main(String[] args) {
        // Program STR43: LongestSubstring
        // Expand window until duplicate appears, then shrink window.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scan.nextLine();

        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            Set<Character> set = new HashSet<>();
            int length = 0;

            for (int j = i; j < str.length(); j++) {

                if (set.contains(str.charAt(j))) {
                    break;
                }

                set.add(str.charAt(j));
                length++;
            }

            maxLength = Math.max(maxLength, length);
        }

        System.out.println("Longest substring length: " + maxLength);

        scan.close();
    }
}

/* Output:
    Enter string: ababcabcd
    Longest substring length: 4
 */
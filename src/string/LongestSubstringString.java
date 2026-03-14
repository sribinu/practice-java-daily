package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ----------------------------------------------------------
 * Program No   : STR44
 * Question     : Find the longest substring without repeating characters and return the substring itself.
 * Title        : LongestSubstringString.java
 * Author       : Sribinu P
 * Created On   : 14-03-2026
 * Topic        : String (Longest Substring)
 * Difficulty   : Hard
 * Description  : Find the longest substring without repeating characters and return the substring itself.
 * ----------------------------------------------------------
 */

public class LongestSubstringString {

    public static void main(String[] args) {
        // Program STR43: LongestSubstringString
        // Track window start + max length → save substring when max updates
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scan.nextLine();

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        String longest = str.substring(startIndex, startIndex + maxLength);
        System.out.println("Longest substring: " + longest);

        scan.close();
    }
}

/* Output:
    Enter string: aababcabcd
    Longest substring: abcd
 */
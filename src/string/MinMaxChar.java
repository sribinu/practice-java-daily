package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR49
 * Question     : Find maximum and minimum occurring character in a string.
 * Title        : MinMaxChar.java
 * Author       : Sribinu P
 * Created On   : 19-03-2026
 * Topic        : String (Minimum & Maximum Char)
 * Difficulty   : Intermediate
 * Description  : Find the maximum and minimum occurring characters in a string.
 * ----------------------------------------------------------
 */

public class MinMaxChar {

    public static void main(String[] args) {
        // Program STR49: MinMaxChar
        // Count frequency → compare to find max & min
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a'  && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        int max = 0, min = Integer.MAX_VALUE;
        char maxChar = ' ', minChar = ' ';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                if (freq[i] > max) {
                    max = freq[i];
                    maxChar = (char) (i + 'a');
                }

                if (freq[i] < min) {
                    min = freq[i];
                    minChar = (char) (i + 'a');
                }
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (" + max + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (" + min + " times)");

        scan.close();
    }
}

/* Output:
    Enter a string: success
    Maximum occurring character: s (3 times)
    Minimum occurring character: e (1 times)
 */
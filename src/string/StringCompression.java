package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR42
 * Question     : Implement basic run-length encoding (e.g., “aaabb” → “a3b2”).
 * Title        : StringCompression.java
 * Author       : Sribinu P
 * Created On   : 11-03-2026
 * Topic        : String (Compression)
 * Difficulty   : Easy
 * Description  : Compress a string by replacing consecutive repeating characters with: character + count
 * ----------------------------------------------------------
 */

public class StringCompression {

    public static void main(String[] args) {
        // Program STR42: StringCompression
        // Count consecutive characters → print character + count when it changes
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i) + "" + count;
                count = 1;
            }
        }

        // last character group
        result += str.charAt(str.length() - 1) + "" + count;

        System.out.println("Encoded string: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: aaaabbbccd
    Encoded string: a4b3c2d1
 */
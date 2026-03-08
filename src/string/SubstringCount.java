package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR39
 * Question     : Count how many times a substring appears in string.
 * Title        : SubstringCount.java
 * Author       : Sribinu P
 * Created On   : 08-03-2026
 * Topic        : String (Substring Count)
 * Difficulty   : Easy
 * Description  : Count how many times a substring appears inside a string.
 * ----------------------------------------------------------
 */

public class SubstringCount {

    public static void main(String[] args) {
        // Program STR39: SubstringCount
        // Loop through the string → compare substring using substring()
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = scan.nextLine();

        System.out.print("Enter substring: ");
        String sub = scan.nextLine();

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Substring appears " + count + " times.");

        scan.close();
    }
}

/* Output:
    Enter main string: banana
    Enter substring: an
    Substring appears 2 times.
 */
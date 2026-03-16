package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR46
 * Question     : Find all subsets of a string.
 * Title        : StringSubsets.java
 * Author       : Sribinu P
 * Created On   : 16-03-2026
 * Topic        : String (Subsets)
 * Difficulty   : Intermediate
 * Description  : Find all subsets of a string.
 *                A subset means any combination of characters (including empty).
 * ----------------------------------------------------------
 */

public class StringSubsets {

    public static void main(String[] args) {
        // Program STR46: StringSubsets
        // For every character → either include it or exclude it.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scan.nextLine();

        subsets(str, "", 0);

        scan.close();
    }

    public static void subsets(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include character
        subsets(str, current + str.charAt(index), index + 1);

        // Exclude character
        subsets(str, current, index + 1);
    }
}

/* Output:
    Enter string: abc
    abc
    ab
    ac
    a
    bc
    b
    c

 */
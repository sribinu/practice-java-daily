package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR20
 * Question     : Compare two strings without using .equals().
 * Title        : StringComparison.java
 * Author       : Sribinu P
 * Created On   : 16-02-2026
 * Topic        : String (Compare)
 * Difficulty   : Easy
 * Description  : This program compares two strings character by character without using .equals() method.
 * ----------------------------------------------------------
 */

public class StringComparison {

    public static void main(String[] args) {
        // Program STR20: StringComparison
        // If lengths match and every character matches, strings are equal.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not equal");
            scan.close();
            return;
        }

        boolean isEqual = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        scan.close();
    }
}

/* Output:
    Enter the first string: java is a programming language
    Enter the second string: java is a programming language
    Strings are equal
 */

/* Note: // For case-insensitive comparison
    if (s1.length() == s2.length()) {
        boolean equal = true;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.toLowerCase(s1.charAt(i)) !=
                Character.toLowerCase(s2.charAt(i))) {
                equal = false;
                break;
            }
        }
    }
 */
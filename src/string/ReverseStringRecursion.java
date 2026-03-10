package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR41
 * Question     : Reverse String Using Recursion - Reverse string recursively.
 * Title        : ReverseStringRecursion.java
 * Author       : Sribinu P
 * Created On   : 10-03-2026
 * Topic        : String (Recursion)
 * Difficulty   : Hard
 * Description  : Reverse a string using recursion (no loops).
 * ----------------------------------------------------------
 */

public class ReverseStringRecursion {

    public static void main(String[] args) {
        // Program STR41: ReverseStringRecursion
        // Reverse = last character + reverse(rest of string)
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String reversed = reverse(str);

        System.out.println("Reversed string: " + reversed);

        scan.close();
    }
    public static String reverse(String str) {

        if (str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1) +
                reverse(str.substring(0, str.length() - 1));
    }
}

/* Output:
    Enter a string: programming
    Reversed string: gnimmargorp
 */
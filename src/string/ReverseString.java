package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR3
 * Question     : Reverse a string without using StringBuilder.
 * Title        : ReverseString.java
 * Author       : Sribinu P
 * Created On   : 30-01-2026
 * Topic        : String (Reverse)
 * Difficulty   : Easy
 * Description  : This program reverses a given string manually by traversing
 *                it from end to beginning, without using StringBuilder or reverse().
 * ----------------------------------------------------------
 */

public class ReverseString {

    public static void main(String[] args) {
        // Program STR3: ReverseString
        // Read characters from last index to first and build the reversed string.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reversed string: " + reverse);

        scan.close();
    }
}

/* Output:
    Enter a string: java developer
    Reversed string: repoleved avaj
 */
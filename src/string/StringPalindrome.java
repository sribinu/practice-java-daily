package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR4
 * Question     : Check if a string is palindrome.
 * Title        : StringPalindrome.java
 * Author       : Sribinu P
 * Created On   : 31-01-2026
 * Topic        : String (Palindrome)
 * Difficulty   : Easy
 * Description  : This program checks whether a given string reads the same forward and backward.
 * ----------------------------------------------------------
 */

public class StringPalindrome {

    public static void main(String[] args) {
        // Program STR4: StringPalindrome
        // Compare characters from start and end moving toward the center.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        scan.close();
    }
}

/* Output:
    Enter a string: madam
    It is a palindrome
 */
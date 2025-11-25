package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS12
 * Question     : Check whether a number is palindrome using while.
 * Title        : Palindrome.java
 * Author       : Sribinu P
 * Created On   : 25-11-2025
 * Topic        : Palindrome
 * Difficulty   : Easy
 * Description  : This program checks if a given number reads the same forward and backward.
 * ----------------------------------------------------------
 */

public class Palindrome {
    public static void main(String[] args) {
        // Program CS12: Palindrome
        // Reverse the number using a while loop and compare it with the original.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int temp = num;

        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (num == reversed) {
            System.out.println(reversed + " is a palindrome");
        } else {
            System.out.println(reversed + " is not a palindrome");
        }

        scan.close();
    }
}

/* Output:
    Enter a number : 12321
    12321 is a palindrome
 */
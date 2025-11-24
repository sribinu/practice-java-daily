package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS11
 * Question     : Reverse digits of a number using while loop.
 * Title        : ReverseNumber.java
 * Author       : Sribinu P
 * Created On   : 24-11-2025
 * Topic        : Reverse Number
 * Difficulty   : Easy
 * Description  : This program reverses the digits of a given integer number.
 * ----------------------------------------------------------
 */

public class ReverseNumber {

    public static void main(String[] args) {
        // Program CS11: ReverseNumber
        // Extracts last digit using %10 and builds reverse number using a while loop.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse number : " + reversed);
        scan.close();
    }
}

/* Output:
    Enter a number : 12345
    Reverse number : 54321
 */
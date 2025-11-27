package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS21
 * Question     : Find the sum of digits of a given number.
 * Title        : SumOfDigits.java
 * Author       : Sribinu P
 * Created On   : 27-11-2025
 * Topic        : Sum of Digits
 * Difficulty   : Easy
 * Description  : Reads a number, extracts each digit using % 10, adds them, and prints the total.
 * ----------------------------------------------------------
 */

public class SumOfDigits {

    public static void main(String[] args) {
        // Program CS21: SumOfDigits
        // Repeatedly take the last digit using % 10, add it to sum, and remove it using / 10.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits : " + sum);
        scan.close();
    }
}

/* Output:
    Enter a number: 123
    Sum of digits : 6
 */
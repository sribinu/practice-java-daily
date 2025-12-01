package loops;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : LO6
 * Question     : Calculate sum of digits of a number.
 * Title        : SumOfDigits.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Very Easy
 * Description  : This program adds each digit of the number to calculate the total sum of its digits.
 * ----------------------------------------------------------
 */

public class SumOfDigits {

    public static void main(String[] args) {
        // Program LO6: SumOfDigits
        // The program extracts each digit from the number and adds them to compute the digit sum.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}

/* Output:
    Enter a number: 1234
    Sum of digits = 10
 */
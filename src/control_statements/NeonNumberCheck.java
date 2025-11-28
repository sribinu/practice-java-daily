package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS25
 * Question     : Check if a number is neon (sum of digits of its square equals the number).
 * Title        : NeonNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 28-11-2025
 * Topic        : Number check (Neon number)
 * Difficulty   : Easy
 * Description  : This program checks whether a number is Neon by taking the
 *                square of the number, summing its digits, and comparing with the original number.
 * ----------------------------------------------------------
 */

public class NeonNumberCheck {

    public static void main(String[] args) {
        // Program CS25: NeonNumberCheck
        // Takes square of n → sum of its digits → compares with n.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is NOT a Neon number.");
        }

        scan.close();
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        return num == sum;
    }
}

/* Output:
    Enter a number: 9
    9 is a Neon number.
 */
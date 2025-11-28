package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS26
 * Question     : Check if a number is spy (sum of digits = product of digits).
 * Title        : SpyNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 28-11-2025
 * Topic        : Number check (spy number)
 * Difficulty   : Easy
 * Description  : This program checks whether a number is a Spy number by comparing
 *                the sum of its digits and the product of its digits.
 * ----------------------------------------------------------
 */

public class SpyNumberCheck {

    public static void main(String[] args) {
        // Program CS26: SpyNumberCheck
        // Calculates digit-sum and digit-product → checks if both are equal.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isSpy(num)) {
            System.out.println(num + " is a Spy number.");
        } else {
            System.out.println(num + " is NOT a Spy number.");
        }

        scan.close();
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }
}

/* Output:
    Enter a number: 1124
    1124 is a Spy number.
 */